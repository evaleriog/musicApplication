import React, {Component} from 'react';
import './index.css';
import {WelcomePage} from './WelcomePage.js';
import {BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import {Albums} from "./Albums";
import {NavigationBar} from "./NavigationBar";

class App extends Component{
    // constructor(props){
    //     super(props);
    // }

    render() {
        return (
            <Router>
                <div>
                    <NavigationBar />
                    <WelcomePage />

                    <Switch>
                        <Route exact path="/" render={(props) => (
                            <WelcomePage />
                        )}/>
                        <Route exact path="/albums" component={Albums} />

                    </Switch>
                </div>
            </Router>
        )

    }
}

export default App;