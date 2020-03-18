import React, {Component} from 'react';
import './index.css';
import {WelcomePage} from './WelcomePage.js';
import {BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import {AlbumsContainer} from "./AlbumsContainer";
import {NavigationBar} from "./NavigationBar";
import {AlbumDetail} from "./AlbumDetail";

class App extends Component{
    constructor(props){
        super(props);

        this.state = {
            albums: []
        }
    }

    componentDidMount() {
        fetch('http://localhost:8080/api/albums')
            .then(response => response.json())
            .then(data => this.setState({albums: data}))
    }

    render() {
        return (
            <Router>
                <div>
                    <NavigationBar />
                    {/*<WelcomePage />*/}

                    <Switch>
                        <Route exact path="/" render={(props) => (
                            <WelcomePage />
                        )}/>
                        <Route exact path="/albums" component={AlbumsContainer} />
                        <Route exact path="/albums/:id" render={(props) => {
                            let albumPosition = props.location.pathname.replace('/albums/', '');
                            return(
                                <AlbumDetail
                                    id={this.state.albums[albumPosition].id}
                                />
                            )
                        }}
                        />
                    </Switch>
                </div>
            </Router>
        )

    }
}

export default App;