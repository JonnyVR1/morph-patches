package org.fourthline.cling.model.action;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;
import org.fourthline.cling.model.VariableValue;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.model.profile.RemoteClientInfo;
import org.fourthline.cling.model.state.StateVariableAccessor;
import org.fourthline.cling.model.types.ErrorCode;
import org.seamless.util.Reflections;

/* JADX INFO: loaded from: classes3.dex */
public class MethodActionExecutor extends AbstractActionExecutor {
    private static Logger log = Logger.getLogger(MethodActionExecutor.class.getName());
    protected Method method;

    public MethodActionExecutor(Method method) {
        this.method = method;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x014c  */
    public Object[] createInputArgumentValues(ActionInvocation<LocalService> actionInvocation, Method method) throws ActionException {
        LocalService localService = (LocalService) actionInvocation.getAction().getService();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (ActionArgument actionArgument : actionInvocation.getAction().getInputArguments()) {
            Class<?> cls = method.getParameterTypes()[i];
            VariableValue input = actionInvocation.getInput(actionArgument);
            if (cls.isPrimitive() && (input == null || input.toString().length() == 0)) {
                throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Primitive action method argument '" + actionArgument.getName() + "' requires input value, can't be null or empty string");
            }
            if (input == null) {
                arrayList.add(i, null);
                i++;
            } else {
                String string = input.toString();
                if (string.length() <= 0 || !localService.isStringConvertibleType((Class) cls) || cls.isEnum()) {
                    arrayList.add(i, input.getValue());
                    i++;
                } else {
                    try {
                        Constructor<?> constructor = cls.getConstructor(String.class);
                        log.finer("Creating new input argument value instance with String.class constructor of type: " + cls);
                        int i2 = i + 1;
                        arrayList.add(i, constructor.newInstance(string));
                        i = i2;
                    } catch (Exception e) {
                        log.warning("Error preparing action method call: " + method);
                        log.warning("Can't convert input argument string to desired type of '" + actionArgument.getName() + "': " + e);
                        throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Can't convert input argument string to desired type of '" + actionArgument.getName() + "': " + e);
                    }
                }
            }
        }
        if (method.getParameterTypes().length > 0 && RemoteClientInfo.class.isAssignableFrom(method.getParameterTypes()[method.getParameterTypes().length - 1])) {
            if (actionInvocation instanceof RemoteActionInvocation) {
                RemoteActionInvocation remoteActionInvocation = (RemoteActionInvocation) actionInvocation;
                if (remoteActionInvocation.getRemoteClientInfo() != null) {
                    log.finer("Providing remote client info as last action method input argument: " + method);
                    arrayList.add(i, remoteActionInvocation.getRemoteClientInfo());
                } else {
                    arrayList.add(i, null);
                }
            } else {
                arrayList.add(i, null);
            }
        }
        return arrayList.toArray(new Object[arrayList.size()]);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c9  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x00c9, please report this as an issue */
    @Override // org.fourthline.cling.model.action.AbstractActionExecutor
    public void execute(ActionInvocation<LocalService> actionInvocation, Object obj) throws Exception {
        Object objInvoke;
        boolean z;
        ActionArgument<LocalService>[] outputArguments;
        Object[] objArrCreateInputArgumentValues = createInputArgumentValues(actionInvocation, this.method);
        boolean zHasOutputArguments = actionInvocation.getAction().hasOutputArguments();
        Method method = this.method;
        if (!zHasOutputArguments) {
            log.fine("Calling local service method with no output arguments: " + method);
            Reflections.invoke(this.method, obj, objArrCreateInputArgumentValues);
            return;
        }
        boolean zEquals = method.getReturnType().equals(Void.TYPE);
        log.fine("Calling local service method with output arguments: " + this.method);
        if (!zEquals) {
            if (isUseOutputArgumentAccessors(actionInvocation)) {
                log.fine("Action method is not void, calling declared accessor(s) on returned instance to retrieve ouput argument(s)");
                objInvoke = readOutputArgumentValues(actionInvocation.getAction(), Reflections.invoke(this.method, obj, objArrCreateInputArgumentValues));
            } else {
                log.fine("Action method is not void, using returned value as (single) output argument");
                objInvoke = Reflections.invoke(this.method, obj, objArrCreateInputArgumentValues);
                z = false;
            }
            outputArguments = actionInvocation.getAction().getOutputArguments();
            if (z || !(objInvoke instanceof Object[])) {
                if (outputArguments.length == 1) {
                    setOutputArgumentValue(actionInvocation, outputArguments[0], objInvoke);
                    return;
                }
                throw new ActionException(ErrorCode.ACTION_FAILED, "Method return does not match required number of output arguments: " + outputArguments.length);
            }
            Object[] objArr = (Object[]) objInvoke;
            log.fine("Accessors returned Object[], setting output argument values: " + objArr.length);
            for (int i = 0; i < outputArguments.length; i++) {
                setOutputArgumentValue(actionInvocation, outputArguments[i], objArr[i]);
            }
            return;
        }
        log.fine("Action method is void, calling declared accessors(s) on service instance to retrieve ouput argument(s)");
        Reflections.invoke(this.method, obj, objArrCreateInputArgumentValues);
        objInvoke = readOutputArgumentValues(actionInvocation.getAction(), obj);
        z = true;
        outputArguments = actionInvocation.getAction().getOutputArguments();
        if (z) {
        }
        if (outputArguments.length == 1) {
            setOutputArgumentValue(actionInvocation, outputArguments[0], objInvoke);
            return;
        }
        throw new ActionException(ErrorCode.ACTION_FAILED, "Method return does not match required number of output arguments: " + outputArguments.length);
    }

    public Method getMethod() {
        return this.method;
    }

    public boolean isUseOutputArgumentAccessors(ActionInvocation<LocalService> actionInvocation) {
        for (ActionArgument actionArgument : actionInvocation.getAction().getOutputArguments()) {
            if (getOutputArgumentAccessors().get(actionArgument) != null) {
                return true;
            }
        }
        return false;
    }

    public MethodActionExecutor(Map<ActionArgument<LocalService>, StateVariableAccessor> map, Method method) {
        super(map);
        this.method = method;
    }
}
