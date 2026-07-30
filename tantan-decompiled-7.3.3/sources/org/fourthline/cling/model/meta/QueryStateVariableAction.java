package org.fourthline.cling.model.meta;

import java.util.Collections;
import java.util.List;
import org.fourthline.cling.model.ValidationError;
import org.fourthline.cling.model.meta.Service;

/* JADX INFO: loaded from: classes3.dex */
public class QueryStateVariableAction<S extends Service> extends Action<S> {
    public static final String ACTION_NAME = "QueryStateVariable";
    public static final String INPUT_ARG_VAR_NAME = "varName";
    public static final String OUTPUT_ARG_RETURN = "return";
    public static final String VIRTUAL_STATEVARIABLE_INPUT = "VirtualQueryActionInput";
    public static final String VIRTUAL_STATEVARIABLE_OUTPUT = "VirtualQueryActionOutput";

    public QueryStateVariableAction(S s) {
        super(ACTION_NAME, new ActionArgument[]{new ActionArgument(INPUT_ARG_VAR_NAME, VIRTUAL_STATEVARIABLE_INPUT, ActionArgument.Direction.IN), new ActionArgument(OUTPUT_ARG_RETURN, VIRTUAL_STATEVARIABLE_OUTPUT, ActionArgument.Direction.OUT)});
        setService(s);
    }

    @Override // org.fourthline.cling.model.meta.Action
    public String getName() {
        return ACTION_NAME;
    }

    @Override // org.fourthline.cling.model.meta.Action, org.fourthline.cling.model.Validatable
    public List<ValidationError> validate() {
        return Collections.EMPTY_LIST;
    }

    public QueryStateVariableAction() {
        this(null);
    }
}
