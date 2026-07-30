package org.fourthline.cling.model.types;

import java.lang.reflect.ParameterizedType;
import p003l.f0c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractDatatype<V> implements Datatype<V> {
    private Datatype.Builtin builtin;

    @Override // org.fourthline.cling.model.types.Datatype
    public Datatype.Builtin getBuiltin() {
        return this.builtin;
    }

    @Override // org.fourthline.cling.model.types.Datatype
    public String getDisplayString() {
        if (this instanceof CustomDatatype) {
            return ((CustomDatatype) this).getName();
        }
        return getBuiltin() != null ? getBuiltin().getDescriptorName() : getValueType().getSimpleName();
    }

    @Override // org.fourthline.cling.model.types.Datatype
    public String getString(V v2) throws InvalidValueException {
        if (v2 == null) {
            return "";
        }
        if (isValid(v2)) {
            return v2.toString();
        }
        f0c.m3956a("Value is not valid: ", v2);
        return null;
    }

    public Class<V> getValueType() {
        return (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override // org.fourthline.cling.model.types.Datatype
    public boolean isHandlingJavaType(Class cls) {
        return getValueType().isAssignableFrom(cls);
    }

    @Override // org.fourthline.cling.model.types.Datatype
    public boolean isValid(V v2) {
        return v2 == null || getValueType().isAssignableFrom(v2.getClass());
    }

    public void setBuiltin(Datatype.Builtin builtin) {
        this.builtin = builtin;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }

    @Override // org.fourthline.cling.model.types.Datatype
    public V valueOf(String str) throws InvalidValueException {
        return null;
    }
}
