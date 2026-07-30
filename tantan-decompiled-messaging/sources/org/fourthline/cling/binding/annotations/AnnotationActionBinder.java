package org.fourthline.cling.binding.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.fourthline.cling.binding.LocalServiceBindingException;
import org.fourthline.cling.model.Constants;
import org.fourthline.cling.model.ModelUtil;
import org.fourthline.cling.model.action.ActionExecutor;
import org.fourthline.cling.model.action.MethodActionExecutor;
import org.fourthline.cling.model.meta.Action;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.model.meta.StateVariable;
import org.fourthline.cling.model.profile.RemoteClientInfo;
import org.fourthline.cling.model.state.GetterStateVariableAccessor;
import org.fourthline.cling.model.state.StateVariableAccessor;
import org.fourthline.cling.model.types.Datatype;
import org.seamless.util.Reflections;
import p149l.lr0;
import p149l.mr0;
import p149l.nr0;

/* JADX INFO: loaded from: classes3.dex */
public class AnnotationActionBinder {
    private static Logger log = Logger.getLogger(AnnotationLocalServiceBinder.class.getName());
    protected UpnpAction annotation;
    protected Method method;
    protected Map<StateVariable, StateVariableAccessor> stateVariables;
    protected Set<Class> stringConvertibleTypes;

    public AnnotationActionBinder(Method method, Map<StateVariable, StateVariableAccessor> map, Set<Class> set) {
        this.annotation = (UpnpAction) method.getAnnotation(UpnpAction.class);
        this.stateVariables = map;
        this.method = method;
        this.stringConvertibleTypes = set;
    }

    public Action appendAction(Map<Action, ActionExecutor> map) throws LocalServiceBindingException {
        String strName = getAnnotation().name().length() != 0 ? getAnnotation().name() : AnnotationLocalServiceBinder.toUpnpActionName(getMethod().getName());
        log.fine("Creating action and executor: " + strName);
        List<ActionArgument> listCreateInputArguments = createInputArguments();
        Map<ActionArgument<LocalService>, StateVariableAccessor> mapCreateOutputArguments = createOutputArguments();
        listCreateInputArguments.addAll(mapCreateOutputArguments.keySet());
        Action action = new Action(strName, (ActionArgument[]) listCreateInputArguments.toArray(new ActionArgument[listCreateInputArguments.size()]));
        map.put(action, createExecutor(mapCreateOutputArguments));
        return action;
    }

    public ActionExecutor createExecutor(Map<ActionArgument<LocalService>, StateVariableAccessor> map) {
        return new MethodActionExecutor(map, getMethod());
    }

    public List<ActionArgument> createInputArguments() throws LocalServiceBindingException {
        ArrayList arrayList = new ArrayList();
        Annotation[][] parameterAnnotations = getMethod().getParameterAnnotations();
        int i = 0;
        for (int i2 = 0; i2 < parameterAnnotations.length; i2++) {
            for (Annotation annotation : parameterAnnotations[i2]) {
                if (annotation instanceof UpnpInputArgument) {
                    UpnpInputArgument upnpInputArgument = (UpnpInputArgument) annotation;
                    i++;
                    String strName = upnpInputArgument.name();
                    StateVariable stateVariableFindRelatedStateVariable = findRelatedStateVariable(upnpInputArgument.stateVariable(), strName, getMethod().getName());
                    if (stateVariableFindRelatedStateVariable == null) {
                        lr0.m151108a("Could not detected related state variable of argument: ", strName);
                        return null;
                    }
                    validateType(stateVariableFindRelatedStateVariable, getMethod().getParameterTypes()[i2]);
                    arrayList.add(new ActionArgument(strName, upnpInputArgument.aliases(), stateVariableFindRelatedStateVariable.getName(), ActionArgument.Direction.IN));
                }
            }
        }
        if (i >= getMethod().getParameterTypes().length || RemoteClientInfo.class.isAssignableFrom(this.method.getParameterTypes()[this.method.getParameterTypes().length - 1])) {
            return arrayList;
        }
        mr0.m156009a("Method has parameters that are not input arguments: ", getMethod().getName());
        return null;
    }

    public Map<ActionArgument<LocalService>, StateVariableAccessor> createOutputArguments() throws LocalServiceBindingException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UpnpAction upnpAction = (UpnpAction) getMethod().getAnnotation(UpnpAction.class);
        if (upnpAction.out().length != 0) {
            boolean z = upnpAction.out().length > 1;
            for (UpnpOutputArgument upnpOutputArgument : upnpAction.out()) {
                String strName = upnpOutputArgument.name();
                StateVariable stateVariableFindRelatedStateVariable = findRelatedStateVariable(upnpOutputArgument.stateVariable(), strName, getMethod().getName());
                if (stateVariableFindRelatedStateVariable == null && upnpOutputArgument.getterName().length() > 0) {
                    stateVariableFindRelatedStateVariable = findRelatedStateVariable(null, null, upnpOutputArgument.getterName());
                }
                if (stateVariableFindRelatedStateVariable == null) {
                    lr0.m151108a("Related state variable not found for output argument: ", strName);
                    return null;
                }
                StateVariableAccessor stateVariableAccessorFindOutputArgumentAccessor = findOutputArgumentAccessor(stateVariableFindRelatedStateVariable, upnpOutputArgument.getterName(), z);
                log.finer("Found related state variable for output argument '" + strName + "': " + stateVariableFindRelatedStateVariable);
                linkedHashMap.put(new ActionArgument(strName, stateVariableFindRelatedStateVariable.getName(), ActionArgument.Direction.OUT, z ^ true), stateVariableAccessorFindOutputArgumentAccessor);
            }
        }
        return linkedHashMap;
    }

    public StateVariableAccessor findOutputArgumentAccessor(StateVariable stateVariable, String str, boolean z) throws LocalServiceBindingException {
        if (getMethod().getReturnType().equals(Void.TYPE)) {
            if (str == null || str.length() <= 0) {
                log.finer("Action method is void, trying to find existing accessor of related: " + stateVariable);
                return getStateVariables().get(stateVariable);
            }
            log.finer("Action method is void, will use getter method named: ".concat(str));
            Method method = Reflections.getMethod(getMethod().getDeclaringClass(), str);
            if (method != null) {
                validateType(stateVariable, method.getReturnType());
                return new GetterStateVariableAccessor(method);
            }
            nr0.m160707a("Declared getter method '", str, "' not found on: ", getMethod().getDeclaringClass());
            return null;
        }
        if (str == null || str.length() <= 0) {
            if (!z) {
                log.finer("Action method is not void, will use the returned instance: " + getMethod().getReturnType());
                validateType(stateVariable, getMethod().getReturnType());
            }
            return null;
        }
        log.finer("Action method is not void, will use getter method on returned instance: ".concat(str));
        Method method2 = Reflections.getMethod(getMethod().getReturnType(), str);
        if (method2 != null) {
            validateType(stateVariable, method2.getReturnType());
            return new GetterStateVariableAccessor(method2);
        }
        nr0.m160707a("Declared getter method '", str, "' not found on return type: ", getMethod().getReturnType());
        return null;
    }

    public StateVariable findRelatedStateVariable(String str, String str2, String str3) throws LocalServiceBindingException {
        String methodPropertyName;
        StateVariable stateVariable = (str == null || str.length() <= 0) ? null : getStateVariable(str);
        if (stateVariable == null && str2 != null && str2.length() > 0) {
            String upnpStateVariableName = AnnotationLocalServiceBinder.toUpnpStateVariableName(str2);
            log.finer("Finding related state variable with argument name (converted to UPnP name): " + upnpStateVariableName);
            stateVariable = getStateVariable(str2);
        }
        if (stateVariable == null && str2 != null && str2.length() > 0) {
            String str4 = Constants.ARG_TYPE_PREFIX + AnnotationLocalServiceBinder.toUpnpStateVariableName(str2);
            log.finer("Finding related state variable with prefixed argument name (converted to UPnP name): ".concat(str4));
            stateVariable = getStateVariable(str4);
        }
        if (stateVariable != null || str3 == null || str3.length() <= 0 || (methodPropertyName = Reflections.getMethodPropertyName(str3)) == null) {
            return stateVariable;
        }
        log.finer("Finding related state variable with method property name: ".concat(methodPropertyName));
        return getStateVariable(AnnotationLocalServiceBinder.toUpnpStateVariableName(methodPropertyName));
    }

    public UpnpAction getAnnotation() {
        return this.annotation;
    }

    public Method getMethod() {
        return this.method;
    }

    public StateVariable getStateVariable(String str) {
        for (StateVariable stateVariable : getStateVariables().keySet()) {
            if (stateVariable.getName().equals(str)) {
                return stateVariable;
            }
        }
        return null;
    }

    public Map<StateVariable, StateVariableAccessor> getStateVariables() {
        return this.stateVariables;
    }

    public Set<Class> getStringConvertibleTypes() {
        return this.stringConvertibleTypes;
    }

    public void validateType(StateVariable stateVariable, Class cls) throws LocalServiceBindingException {
        Datatype.Default byJavaType = ModelUtil.isStringConvertibleType(getStringConvertibleTypes(), cls) ? Datatype.Default.STRING : Datatype.Default.getByJavaType(cls);
        log.finer("Expecting '" + stateVariable + "' to match default mapping: " + byJavaType);
        if (byJavaType != null && !stateVariable.getTypeDetails().getDatatype().isHandlingJavaType(byJavaType.getJavaType())) {
            StringBuilder sb = new StringBuilder("State variable '");
            sb.append(stateVariable);
            Class javaType = byJavaType.getJavaType();
            sb.append("' datatype can't handle action argument's Java type (change one): ");
            sb.append(javaType);
            throw new LocalServiceBindingException(sb.toString());
        }
        if (byJavaType != null || stateVariable.getTypeDetails().getDatatype().getBuiltin() == null) {
            log.finer("State variable matches required argument datatype (or can't be validated because it is custom)");
            return;
        }
        StringBuilder sb2 = new StringBuilder("State variable '");
        sb2.append(stateVariable);
        String simpleName = cls.getSimpleName();
        sb2.append("' should be custom datatype (action argument type is unknown Java type): ");
        sb2.append(simpleName);
        throw new LocalServiceBindingException(sb2.toString());
    }
}
