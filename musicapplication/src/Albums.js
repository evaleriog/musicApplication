import React from 'react';
import 'bootstrap/dist/css/bootstrap.css';

export class Albums extends React.Component{
    constructor(props){
        super(props);
    }

    render(){
        let albums = this.props.albums;

        return(
            albums.map((item) =>(
                <div className="card" style={{width:"18rem"}} key={item.id}>
                    <img src="https://images-na.ssl-images-amazon.com/images/I/91NQO2l3RZL._SL1500_.jpg" className="card-img-top" alt="..." style={{width:"18rem", height:"9rem"}}/>
                    <div className="card-body">
                        <h5 className="card-title">{item.name}</h5>
                        <p className="card-text">{item.year}</p>
                        <a href="#" className="btn btn-primary">{item.artist.name}</a>
                    </div>
                </div>
            ))
        );
    }
}