export const simpleAction = (data) => dispatch => {
    dispatch({
        type: 'SIMPLE_ACTION',
        payload: data
    })
}