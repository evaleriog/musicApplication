const React = require('react'); (1)
const ReactDOM = require('react-dom'); (2)
const client = require('./client'); (3)

class ListAllAlbums extends React.Component{
   constructor(props){
       super(props);
       this.state = {albums:[]};
   }

   componentDidMount() {(2)
       client({method: 'GET',
       path: '/albums.json'}).done(response => {
           this.setState({albums:
           response.entity._embedded.albums});
       });
   }

   render() {(3)
       return(
           <AlbumList albums={this.state.albums} />
       )
   }
}