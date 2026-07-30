package org.fourthline.cling.model.action;

import org.fourthline.cling.model.VariableValue;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: loaded from: classes3.dex */
public class ActionArgumentValue<S extends Service> extends VariableValue {
    private final ActionArgument<S> argument;

    /* JADX WARN: Illegal instructions before constructor call */
    public ActionArgumentValue(ActionArgument<S> actionArgument, Object obj) throws InvalidValueException {
        Datatype datatype = actionArgument.getDatatype();
        if (obj != null && obj.getClass().isEnum()) {
            obj = obj.toString();
        }
        super(datatype, obj);
        this.argument = actionArgument;
    }

    public ActionArgument<S> getArgument() {
        return this.argument;
    }
}
