class CampSite extends React.Component {
    constructor(props) {
        super(props);
    }
    render() {
        return (
            <div>
                <Camper />
            </div>
        );
    }
};
// change code below this line
class Camper extends React.Component{
    render(){
        return (
            <div>
                <p>{this.props.name}</p>
            </div>
        );
    }
}
Camper.propTypes = {name: PropTypes.string.isRequired};
Camper.defaultProps = {name:'CamperBot'};