import React, {Component} from 'react';

export class AlbumDetail extends Component{
    constructor(props){
        super(props);

        this.state = {
            songs: []
        };

        this.componentDidMount = this.componentDidMount.bind(this);
    }

    componentDidMount() {
        let id = this.props.id;
        let url = 'http://localhost:8080/api/albums/' + id + '/songs';
        const options = {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
                'mode': 'no-cors',
            },
        };

        fetch(url, options)
            .then(response => response.json())
            .then(data => this.setState({songs: data}))
    }

    render() {
        return(
            this.state.songs.map((item) => (
                <div>
                    <p><span>{item.name}</span><span>{item.length}</span></p>
                </div>
            ))

        )
    }
}