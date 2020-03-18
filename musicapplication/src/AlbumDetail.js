import React, {Component} from 'react';

export class AlbumDetail extends Component{
    constructor(props){
        super(props);

        this.state = {
            songs: []
        }

        this.componentDidMount = this.componentDidMount.bind(this);
    }

    componentDidMount() {
        let id = this.props.id;
        console.log(id);
        fetch('http://localhost:8080/api/albums/' + id + '/songs')
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