package org.fourthline.cling.model.meta;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import l.qkq0;
import org.fourthline.cling.model.ModelUtil;
import org.fourthline.cling.model.Validatable;
import org.fourthline.cling.model.ValidationError;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.types.Datatype;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class StateVariable<S extends Service> implements Validatable {
    private static final Logger log = Logger.getLogger(StateVariable.class.getName());
    private final StateVariableEventDetails eventDetails;
    private final String name;
    private S service;
    private final StateVariableTypeDetails type;

    public StateVariable(String str, StateVariableTypeDetails stateVariableTypeDetails, StateVariableEventDetails stateVariableEventDetails) {
        this.name = str;
        this.type = stateVariableTypeDetails;
        this.eventDetails = stateVariableEventDetails;
    }

    public StateVariable<S> deepCopy() {
        return new StateVariable<>(getName(), getTypeDetails(), getEventDetails());
    }

    public StateVariableEventDetails getEventDetails() {
        return this.eventDetails;
    }

    public String getName() {
        return this.name;
    }

    public S getService() {
        return this.service;
    }

    public StateVariableTypeDetails getTypeDetails() {
        return this.type;
    }

    public boolean isModeratedNumericType() {
        return Datatype.Builtin.isNumeric(getTypeDetails().getDatatype().getBuiltin()) && getEventDetails().getEventMinimumDelta() > 0;
    }

    public void setService(S s) {
        if (this.service == null) {
            this.service = s;
        } else {
            qkq0.a("Final value has been set already, model is immutable");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(getClass().getSimpleName());
        sb.append(", Name: ");
        sb.append(getName());
        sb.append(", Type: ");
        sb.append(getTypeDetails().getDatatype().getDisplayString());
        sb.append(")");
        if (!getEventDetails().isSendEvents()) {
            sb.append(" (No Events)");
        }
        if (getTypeDetails().getDefaultValue() != null) {
            sb.append(" Default Value: '");
            sb.append(getTypeDetails().getDefaultValue());
            sb.append("'");
        }
        if (getTypeDetails().getAllowedValues() != null) {
            sb.append(" Allowed Values: ");
            for (String str : getTypeDetails().getAllowedValues()) {
                sb.append(str);
                sb.append("|");
            }
        }
        return sb.toString();
    }

    @Override // org.fourthline.cling.model.Validatable
    public List<ValidationError> validate() {
        ArrayList arrayList = new ArrayList();
        if (getName() == null || getName().length() == 0) {
            arrayList.add(new ValidationError(getClass(), "name", "StateVariable without name of: " + getService()));
        } else if (!ModelUtil.isValidUDAName(getName())) {
            Logger logger = log;
            logger.warning("UPnP specification violation of: " + getService().getDevice());
            logger.warning("Invalid state variable name: " + this);
        }
        arrayList.addAll(getTypeDetails().validate());
        return arrayList;
    }

    public StateVariable(String str, StateVariableTypeDetails stateVariableTypeDetails) {
        this(str, stateVariableTypeDetails, new StateVariableEventDetails());
    }
}
