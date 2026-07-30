package org.fourthline.cling.model.action;

import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.model.meta.QueryStateVariableAction;
import org.fourthline.cling.model.meta.StateVariable;
import org.fourthline.cling.model.state.StateVariableAccessor;
import org.fourthline.cling.model.types.ErrorCode;
import p149l.j850;

/* JADX INFO: loaded from: classes3.dex */
public class QueryStateVariableExecutor extends AbstractActionExecutor {
    @Override // org.fourthline.cling.model.action.AbstractActionExecutor
    public void execute(ActionInvocation<LocalService> actionInvocation, Object obj) throws Exception {
        if (!(actionInvocation.getAction() instanceof QueryStateVariableAction)) {
            j850.m140190a("This class can only execute QueryStateVariableAction's, not: ", actionInvocation.getAction());
        } else if (((LocalService) actionInvocation.getAction().getService()).isSupportsQueryStateVariables()) {
            executeQueryStateVariable(actionInvocation, obj);
        } else {
            actionInvocation.setFailure(new ActionException(ErrorCode.INVALID_ACTION, "This service does not support querying state variables"));
        }
    }

    public void executeQueryStateVariable(ActionInvocation<LocalService> actionInvocation, Object obj) throws Exception {
        LocalService localService = (LocalService) actionInvocation.getAction().getService();
        String string = actionInvocation.getInput(QueryStateVariableAction.INPUT_ARG_VAR_NAME).toString();
        StateVariable<LocalService> stateVariable = localService.getStateVariable(string);
        if (stateVariable == null) {
            throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "No state variable found: " + string);
        }
        StateVariableAccessor accessor = localService.getAccessor(stateVariable.getName());
        if (accessor != null) {
            try {
                setOutputArgumentValue(actionInvocation, actionInvocation.getAction().getOutputArgument(QueryStateVariableAction.OUTPUT_ARG_RETURN), accessor.read(stateVariable, obj).toString());
            } catch (Exception e) {
                throw new ActionException(ErrorCode.ACTION_FAILED, e.getMessage());
            }
        } else {
            throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "No accessor for state variable, can't read state: " + string);
        }
    }
}
