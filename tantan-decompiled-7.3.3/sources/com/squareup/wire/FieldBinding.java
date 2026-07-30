package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import p153l.gig0;

/* JADX INFO: loaded from: classes11.dex */
final class FieldBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> {
    private ProtoAdapter<Object> adapter;
    private final String adapterString;
    private final Field builderField;
    private final Method builderMethod;
    private ProtoAdapter<?> keyAdapter;
    private final String keyAdapterString;
    public final WireField.Label label;
    private final Field messageField;
    public final String name;
    public final boolean redacted;
    private ProtoAdapter<?> singleAdapter;
    public final int tag;

    public FieldBinding(WireField wireField, Field field, Class<B> cls) {
        this.label = wireField.label();
        String name = field.getName();
        this.name = name;
        this.tag = wireField.tag();
        this.keyAdapterString = wireField.keyAdapter();
        this.adapterString = wireField.adapter();
        this.redacted = wireField.redacted();
        this.messageField = field;
        this.builderField = getBuilderField(cls, name);
        this.builderMethod = getBuilderMethod(cls, name, field.getType());
    }

    private static Field getBuilderField(Class<?> cls, String str) {
        try {
            return cls.getField(str);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("No builder field " + cls.getName() + "." + str);
        }
    }

    private static Method getBuilderMethod(Class<?> cls, String str, Class<?> cls2) {
        try {
            return cls.getMethod(str, cls2);
        } catch (NoSuchMethodException unused) {
            throw new AssertionError("No builder method " + cls.getName() + "." + str + "(" + cls2.getName() + ")");
        }
    }

    public ProtoAdapter<Object> adapter() {
        ProtoAdapter<Object> protoAdapter = this.adapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        if (isMap()) {
            ProtoAdapter<Object> protoAdapterNewMapAdapter = ProtoAdapter.newMapAdapter(keyAdapter(), singleAdapter());
            this.adapter = protoAdapterNewMapAdapter;
            return protoAdapterNewMapAdapter;
        }
        ProtoAdapter<?> protoAdapterWithLabel = singleAdapter().withLabel(this.label);
        this.adapter = protoAdapterWithLabel;
        return protoAdapterWithLabel;
    }

    public Object get(M m) {
        try {
            return this.messageField.get(m);
        } catch (IllegalAccessException e) {
            gig0.m130323a(e);
            return null;
        }
    }

    public Object getFromBuilder(B b) {
        try {
            return this.builderField.get(b);
        } catch (IllegalAccessException e) {
            gig0.m130323a(e);
            return null;
        }
    }

    public boolean isMap() {
        return !this.keyAdapterString.isEmpty();
    }

    public ProtoAdapter<?> keyAdapter() {
        ProtoAdapter<?> protoAdapter = this.keyAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> protoAdapter2 = ProtoAdapter.get(this.keyAdapterString);
        this.keyAdapter = protoAdapter2;
        return protoAdapter2;
    }

    public void set(B b, Object obj) {
        try {
            if (this.label.isOneOf()) {
                this.builderMethod.invoke(b, obj);
            } else {
                this.builderField.set(b, obj);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            gig0.m130323a(e);
        }
    }

    public ProtoAdapter<?> singleAdapter() {
        ProtoAdapter<?> protoAdapter = this.singleAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<?> protoAdapter2 = ProtoAdapter.get(this.adapterString);
        this.singleAdapter = protoAdapter2;
        return protoAdapter2;
    }

    public void value(B b, Object obj) {
        if (this.label.isRepeated()) {
            ((List) getFromBuilder(b)).add(obj);
        } else if (this.keyAdapterString.isEmpty()) {
            set(b, obj);
        } else {
            ((Map) getFromBuilder(b)).putAll((Map) obj);
        }
    }
}
