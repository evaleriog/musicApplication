import React from 'react';
import {Albums} from './Albums';

export class AlbumsContainer extends React.Component{
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
        return <Albums albums={this.state.albums} />;
    }

}