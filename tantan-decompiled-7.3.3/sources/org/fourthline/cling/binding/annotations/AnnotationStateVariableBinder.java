package org.fourthline.cling.binding.annotations;

import java.util.Set;
import java.util.logging.Logger;
import org.fourthline.cling.binding.AllowedValueProvider;
import org.fourthline.cling.binding.AllowedValueRangeProvider;
import org.fourthline.cling.binding.LocalServiceBindingException;
import org.fourthline.cling.model.ModelUtil;
import org.fourthline.cling.model.meta.StateVariable;
import org.fourthline.cling.model.meta.StateVariableAllowedValueRange;
import org.fourthline.cling.model.meta.StateVariableEventDetails;
import org.fourthline.cling.model.meta.StateVariableTypeDetails;
import org.fourthline.cling.model.state.StateVariableAccessor;
import org.fourthline.cling.model.types.Datatype;
import p153l.qr0;
import p153l.rr0;
import p153l.sr0;

/* JADX INFO: loaded from: classes3.dex */
public class AnnotationStateVariableBinder {
    private static Logger log = Logger.getLogger(AnnotationLocalServiceBinder.class.getName());
    protected StateVariableAccessor accessor;
    protected UpnpStateVariable annotation;
    protected String name;
    protected Set<Class> stringConvertibleTypes;

    public AnnotationStateVariableBinder(UpnpStateVariable upnpStateVariable, String str, StateVariableAccessor stateVariableAccessor, Set<Class> set) {
        this.annotation = upnpStateVariable;
        this.name = str;
        this.accessor = stateVariableAccessor;
        this.stringConvertibleTypes = set;
    }

    public Datatype createDatatype() throws LocalServiceBindingException {
        String strDatatype = getAnnotation().datatype();
        if (strDatatype.length() == 0 && getAccessor() != null) {
            Class<?> returnType = getAccessor().getReturnType();
            log.finer("Using accessor return type as state variable type: " + returnType);
            if (ModelUtil.isStringConvertibleType(getStringConvertibleTypes(), returnType)) {
                log.finer("Return type is string-convertible, using string datatype");
                return Datatype.Default.STRING.getBuiltinType().getDatatype();
            }
            Datatype.Default byJavaType = Datatype.Default.getByJavaType(returnType);
            if (byJavaType != null) {
                log.finer("Return type has default UPnP datatype: " + byJavaType);
                return byJavaType.getBuiltinType().getDatatype();
            }
        }
        if (strDatatype.length() == 0 && (getAnnotation().allowedValues().length > 0 || getAnnotation().allowedValuesEnum() != Void.TYPE)) {
            log.finer("State variable has restricted allowed values, hence using 'string' datatype");
            strDatatype = "string";
        }
        if (strDatatype.length() == 0) {
            rr0.m182680a("Could not detect datatype of state variable: ", getName());
            return null;
        }
        log.finer("Trying to find built-in UPnP datatype for detected name: ".concat(strDatatype));
        Datatype.Builtin byDescriptorName = Datatype.Builtin.getByDescriptorName(strDatatype);
        if (byDescriptorName == null) {
            throw new LocalServiceBindingException("No built-in UPnP datatype found, using CustomDataType (TODO: NOT IMPLEMENTED)");
        }
        log.finer("Found built-in UPnP datatype: " + byDescriptorName);
        return byDescriptorName.getDatatype();
    }

    public String createDefaultValue(Datatype datatype) throws LocalServiceBindingException {
        if (getAnnotation().defaultValue().length() != 0) {
            try {
                datatype.valueOf(getAnnotation().defaultValue());
                log.finer("Found state variable default value: " + getAnnotation().defaultValue());
                return getAnnotation().defaultValue();
            } catch (Exception e) {
                sr0.m187581a("Default value doesn't match datatype of state variable '", getName(), "': ", e.getMessage());
            }
        }
        return null;
    }

    public StateVariable createStateVariable() throws LocalServiceBindingException {
        String[] allowedValues;
        AnnotationStateVariableBinder annotationStateVariableBinder;
        StateVariableAllowedValueRange allowedValueRange;
        int i;
        int iEventMaximumRateMilliseconds;
        log.fine("Creating state variable '" + getName() + "' with accessor: " + getAccessor());
        Datatype datatypeCreateDatatype = createDatatype();
        String strCreateDefaultValue = createDefaultValue(datatypeCreateDatatype);
        boolean zEquals = Datatype.Builtin.STRING.equals(datatypeCreateDatatype.getBuiltin());
        Class cls = Void.TYPE;
        int iEventMinimumDelta = 0;
        if (zEquals) {
            if (getAnnotation().allowedValueProvider() != cls) {
                allowedValues = getAllowedValuesFromProvider();
            } else if (getAnnotation().allowedValues().length > 0) {
                allowedValues = getAnnotation().allowedValues();
            } else if (getAnnotation().allowedValuesEnum() != cls) {
                allowedValues = getAllowedValues(getAnnotation().allowedValuesEnum());
            } else if (getAccessor() == null || !getAccessor().getReturnType().isEnum()) {
                log.finer("Not restricting allowed values (of string typed state var): " + getName());
                allowedValues = null;
            } else {
                allowedValues = getAllowedValues(getAccessor().getReturnType());
            }
            if (allowedValues != null && strCreateDefaultValue != null) {
                int length = allowedValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        sr0.m187581a("Default value '", strCreateDefaultValue, "' is not in allowed values of: ", getName());
                        return null;
                    }
                    if (allowedValues[i2].equals(strCreateDefaultValue)) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            allowedValues = null;
        }
        if (Datatype.Builtin.isNumeric(datatypeCreateDatatype.getBuiltin())) {
            if (getAnnotation().allowedValueRangeProvider() != cls) {
                allowedValueRange = getAllowedRangeFromProvider();
                annotationStateVariableBinder = this;
            } else if (getAnnotation().allowedValueMinimum() > 0 || getAnnotation().allowedValueMaximum() > 0) {
                annotationStateVariableBinder = this;
                allowedValueRange = annotationStateVariableBinder.getAllowedValueRange(getAnnotation().allowedValueMinimum(), getAnnotation().allowedValueMaximum(), getAnnotation().allowedValueStep());
            } else {
                log.finer("Not restricting allowed value range (of numeric typed state var): " + getName());
                annotationStateVariableBinder = this;
                allowedValueRange = null;
            }
            if (strCreateDefaultValue != null && allowedValueRange != null) {
                try {
                    if (!allowedValueRange.isInRange(Long.valueOf(strCreateDefaultValue).longValue())) {
                        sr0.m187581a("Default value '", strCreateDefaultValue, "' is not in allowed range of: ", annotationStateVariableBinder.getName());
                        return null;
                    }
                } catch (Exception unused) {
                    sr0.m187581a("Default value '", strCreateDefaultValue, "' is not numeric (for range checking) of: ", annotationStateVariableBinder.getName());
                    return null;
                }
            }
        } else {
            annotationStateVariableBinder = this;
            allowedValueRange = null;
        }
        boolean zSendEvents = annotationStateVariableBinder.getAnnotation().sendEvents();
        if (zSendEvents && annotationStateVariableBinder.getAccessor() == null) {
            rr0.m182680a("State variable sends events but has no accessor for field or getter: ", annotationStateVariableBinder.getName());
            return null;
        }
        if (zSendEvents) {
            if (annotationStateVariableBinder.getAnnotation().eventMaximumRateMilliseconds() > 0) {
                log.finer("Moderating state variable events using maximum rate (milliseconds): " + annotationStateVariableBinder.getAnnotation().eventMaximumRateMilliseconds());
                iEventMaximumRateMilliseconds = annotationStateVariableBinder.getAnnotation().eventMaximumRateMilliseconds();
            } else {
                iEventMaximumRateMilliseconds = 0;
            }
            if (annotationStateVariableBinder.getAnnotation().eventMinimumDelta() > 0 && Datatype.Builtin.isNumeric(datatypeCreateDatatype.getBuiltin())) {
                log.finer("Moderating state variable events using minimum delta: " + annotationStateVariableBinder.getAnnotation().eventMinimumDelta());
                iEventMinimumDelta = annotationStateVariableBinder.getAnnotation().eventMinimumDelta();
            }
            int i3 = iEventMinimumDelta;
            iEventMinimumDelta = iEventMaximumRateMilliseconds;
            i = i3;
        } else {
            i = 0;
        }
        return new StateVariable(annotationStateVariableBinder.getName(), new StateVariableTypeDetails(datatypeCreateDatatype, strCreateDefaultValue, allowedValues, allowedValueRange), new StateVariableEventDetails(zSendEvents, iEventMinimumDelta, i));
    }

    public StateVariableAccessor getAccessor() {
        return this.accessor;
    }

    public StateVariableAllowedValueRange getAllowedRangeFromProvider() throws LocalServiceBindingException {
        Class clsAllowedValueRangeProvider = getAnnotation().allowedValueRangeProvider();
        if (!AllowedValueRangeProvider.class.isAssignableFrom(clsAllowedValueRangeProvider)) {
            StringBuilder sb = new StringBuilder("Allowed value range provider is not of type ");
            sb.append(AllowedValueRangeProvider.class);
            String name = getName();
            sb.append(": ");
            sb.append(name);
            throw new LocalServiceBindingException(sb.toString());
        }
        try {
            AllowedValueRangeProvider allowedValueRangeProvider = (AllowedValueRangeProvider) clsAllowedValueRangeProvider.newInstance();
            try {
                return getAllowedValueRange(allowedValueRangeProvider.getMinimum(), allowedValueRangeProvider.getMaximum(), allowedValueRangeProvider.getStep());
            } catch (Exception e) {
                e = e;
                this = this;
                throw new LocalServiceBindingException("Allowed value range provider can't be instantiated: " + this.getName(), e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public StateVariableAllowedValueRange getAllowedValueRange(long j, long j2, long j3) throws LocalServiceBindingException {
        if (j2 >= j) {
            return new StateVariableAllowedValueRange(j, j2, j3);
        }
        rr0.m182680a("Allowed value range maximum is smaller than minimum: ", getName());
        return null;
    }

    public String[] getAllowedValues(Class cls) throws LocalServiceBindingException {
        if (!cls.isEnum()) {
            qr0.m177529a("Allowed values type is not an Enum: ", cls);
            return null;
        }
        log.finer("Restricting allowed values of state variable to Enum: " + getName());
        String[] strArr = new String[cls.getEnumConstants().length];
        for (int i = 0; i < cls.getEnumConstants().length; i++) {
            Object obj = cls.getEnumConstants()[i];
            if (obj.toString().length() > 32) {
                throw new LocalServiceBindingException("Allowed value string (that is, Enum constant name) is longer than 32 characters: " + obj.toString());
            }
            log.finer("Adding allowed value (converted to string): " + obj.toString());
            strArr[i] = obj.toString();
        }
        return strArr;
    }

    public String[] getAllowedValuesFromProvider() throws LocalServiceBindingException {
        Class clsAllowedValueProvider = getAnnotation().allowedValueProvider();
        if (AllowedValueProvider.class.isAssignableFrom(clsAllowedValueProvider)) {
            try {
                return ((AllowedValueProvider) clsAllowedValueProvider.newInstance()).getValues();
            } catch (Exception e) {
                throw new LocalServiceBindingException("Allowed value provider can't be instantiated: " + getName(), e);
            }
        }
        StringBuilder sb = new StringBuilder("Allowed value provider is not of type ");
        sb.append(AllowedValueProvider.class);
        String name = getName();
        sb.append(": ");
        sb.append(name);
        throw new LocalServiceBindingException(sb.toString());
    }

    public UpnpStateVariable getAnnotation() {
        return this.annotation;
    }

    public String getName() {
        return this.name;
    }

    public Set<Class> getStringConvertibleTypes() {
        return this.stringConvertibleTypes;
    }
}
