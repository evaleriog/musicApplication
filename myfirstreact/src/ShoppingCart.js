const Items = (props) => {
    return <h1>Current Quantity of Items in Cart: {props.quantity}</h1>
};

//sets for prop quantity to be required and a number
Items.propTypes = {quantity: PropTypes.number.isRequired};

Items.defaultProps = {
    quantity: 0
};

class ShoppingCart extends React.Component {
    constructor(props) {
        super(props);
    }
    render() {
        return <Items />
    }
};
