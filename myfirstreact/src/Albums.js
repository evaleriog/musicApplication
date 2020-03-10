import React, {Component} from 'react';
import ReactDOM from 'react-dom';

class Albums extends React.Component{
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
        return(
            <div>
                {
                    this.state.albums.map((item) =>(
                        <div key={item.id}>
                            <h1>{item.name}</h1>
                            <p>{item.year}</p>
                        </div>
                    ))
                }
            </div>
        );
    }
}

ReactDOM.render(<Albums />, document.getElementById('albums'));