package org.fourthline.cling.model.meta;

import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.ModelUtil;
import org.fourthline.cling.model.Validatable;
import org.fourthline.cling.model.ValidationError;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.types.Datatype;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class ActionArgument<S extends Service> implements Validatable {
    private static final Logger log = Logger.getLogger(ActionArgument.class.getName());
    private Action<S> action;
    private final String[] aliases;
    private final Direction direction;
    private final String name;
    private final String relatedStateVariableName;
    private final boolean returnValue;

    public enum Direction {
        IN,
        OUT
    }

    public ActionArgument(String str, String[] strArr, String str2, Direction direction, boolean z) {
        this.name = str;
        this.aliases = strArr;
        this.relatedStateVariableName = str2;
        this.direction = direction;
        this.returnValue = z;
    }

    public ActionArgument<S> deepCopy() {
        return new ActionArgument<>(getName(), getAliases(), getRelatedStateVariableName(), getDirection(), isReturnValue());
    }

    public Action<S> getAction() {
        return this.action;
    }

    public String[] getAliases() {
        return this.aliases;
    }

    public Datatype getDatatype() {
        return getAction().getService().getDatatype(this);
    }

    public Direction getDirection() {
        return this.direction;
    }

    public String getName() {
        return this.name;
    }

    public String getRelatedStateVariableName() {
        return this.relatedStateVariableName;
    }

    public boolean isNameOrAlias(String str) {
        if (getName().equalsIgnoreCase(str)) {
            return true;
        }
        for (String str2 : this.aliases) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean isReturnValue() {
        return this.returnValue;
    }

    public void setAction(Action<S> action) {
        if (this.action == null) {
            this.action = action;
        } else {
            wtq0.m207906a("Final value has been set already, model is immutable");
        }
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ", " + getDirection() + ") " + getName();
    }

    @Override // org.fourthline.cling.model.Validatable
    public List<ValidationError> validate() {
        ArrayList arrayList = new ArrayList();
        if (getName() == null || getName().length() == 0) {
            arrayList.add(new ValidationError(getClass(), AuthenticationTokenClaims.JSON_KEY_NAME, "Argument without name of: " + getAction()));
        } else if (!ModelUtil.isValidUDAName(getName())) {
            Logger logger = log;
            logger.warning("UPnP specification violation of: " + getAction().getService().getDevice());
            logger.warning("Invalid argument name: " + this);
        } else if (getName().length() > 32) {
            Logger logger2 = log;
            logger2.warning("UPnP specification violation of: " + getAction().getService().getDevice());
            logger2.warning("Argument name should be less than 32 characters: " + this);
        }
        if (getDirection() == null) {
            arrayList.add(new ValidationError(getClass(), "direction", "Argument '" + getName() + "' requires a direction, either IN or OUT"));
        }
        if (isReturnValue() && getDirection() != Direction.OUT) {
            arrayList.add(new ValidationError(getClass(), "direction", "Return value argument '" + getName() + "' must be direction OUT"));
        }
        return arrayList;
    }

    public ActionArgument(String str, String[] strArr, String str2, Direction direction) {
        this(str, strArr, str2, direction, false);
    }

    public ActionArgument(String str, String str2, Direction direction, boolean z) {
        this(str, new String[0], str2, direction, z);
    }

    public ActionArgument(String str, String str2, Direction direction) {
        this(str, new String[0], str2, direction, false);
    }
}
