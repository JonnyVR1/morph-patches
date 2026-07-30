package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.internal.Internal;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p153l.gig0;
import p153l.wg3;

/* JADX INFO: loaded from: classes11.dex */
final class RuntimeMessageAdapter<M extends Message<M, B>, B extends Message.Builder<M, B>> extends ProtoAdapter<M> {
    private static final String REDACTED = "██";
    private final Class<B> builderType;
    private final Map<Integer, FieldBinding<M, B>> fieldBindings;
    private final Class<M> messageType;

    public RuntimeMessageAdapter(Class<M> cls, Class<B> cls2, Map<Integer, FieldBinding<M, B>> map) {
        super(FieldEncoding.LENGTH_DELIMITED, cls);
        this.messageType = cls;
        this.builderType = cls2;
        this.fieldBindings = map;
    }

    public static <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> create(Class<M> cls) {
        Class builderType = getBuilderType(cls);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Field field : cls.getDeclaredFields()) {
            WireField wireField = (WireField) field.getAnnotation(WireField.class);
            if (wireField != null) {
                linkedHashMap.put(Integer.valueOf(wireField.tag()), new FieldBinding(wireField, field, builderType));
            }
        }
        return new RuntimeMessageAdapter<>(cls, builderType, Collections.unmodifiableMap(linkedHashMap));
    }

    private static <M extends Message<M, B>, B extends Message.Builder<M, B>> Class<B> getBuilderType(Class<M> cls) {
        try {
            return (Class<B>) Class.forName(cls.getName().concat("$Builder"));
        } catch (ClassNotFoundException unused) {
            wg3.m206174a("No builder class found for message type ".concat(cls.getName()));
            return null;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M decode(ProtoReader protoReader) throws IOException {
        Message.Builder builderNewBuilder = newBuilder();
        long jBeginMessage = protoReader.beginMessage();
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                protoReader.endMessage(jBeginMessage);
                return (M) builderNewBuilder.build();
            }
            FieldBinding<M, B> fieldBinding = this.fieldBindings.get(Integer.valueOf(iNextTag));
            if (fieldBinding != null) {
                try {
                    fieldBinding.value(builderNewBuilder, (fieldBinding.isMap() ? fieldBinding.adapter() : fieldBinding.singleAdapter()).decode(protoReader));
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    builderNewBuilder.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                builderNewBuilder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter protoWriter, M m) throws IOException {
        for (FieldBinding<M, B> fieldBinding : this.fieldBindings.values()) {
            Object obj = fieldBinding.get(m);
            if (obj != null) {
                fieldBinding.adapter().encodeWithTag(protoWriter, fieldBinding.tag, obj);
            }
        }
        protoWriter.writeBytes(m.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(M m) {
        int i = m.cachedSerializedSize;
        if (i != 0) {
            return i;
        }
        int iEncodedSizeWithTag = 0;
        for (FieldBinding<M, B> fieldBinding : this.fieldBindings.values()) {
            Object obj = fieldBinding.get(m);
            if (obj != null) {
                iEncodedSizeWithTag += fieldBinding.adapter().encodedSizeWithTag(fieldBinding.tag, obj);
            }
        }
        int size = iEncodedSizeWithTag + m.unknownFields().size();
        m.cachedSerializedSize = size;
        return size;
    }

    public boolean equals(Object obj) {
        return (obj instanceof RuntimeMessageAdapter) && ((RuntimeMessageAdapter) obj).messageType == this.messageType;
    }

    public Map<Integer, FieldBinding<M, B>> fieldBindings() {
        return this.fieldBindings;
    }

    public int hashCode() {
        return this.messageType.hashCode();
    }

    public B newBuilder() {
        try {
            return this.builderType.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            gig0.m130323a(e);
            return null;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M redact(M m) throws EOFException {
        Message.Builder<M, B> builderNewBuilder = m.newBuilder();
        for (FieldBinding<M, B> fieldBinding : this.fieldBindings.values()) {
            if (fieldBinding.redacted && fieldBinding.label == WireField.Label.REQUIRED) {
                throw new UnsupportedOperationException(String.format("Field '%s' in %s is required and cannot be redacted.", fieldBinding.name, this.javaType.getName()));
            }
            boolean zIsAssignableFrom = Message.class.isAssignableFrom(fieldBinding.singleAdapter().javaType);
            if (fieldBinding.redacted || (zIsAssignableFrom && !fieldBinding.label.isRepeated())) {
                Object fromBuilder = fieldBinding.getFromBuilder(builderNewBuilder);
                if (fromBuilder != null) {
                    fieldBinding.set(builderNewBuilder, fieldBinding.adapter().redact(fromBuilder));
                }
            } else if (zIsAssignableFrom && fieldBinding.label.isRepeated()) {
                Internal.redactElements((List) fieldBinding.getFromBuilder(builderNewBuilder), fieldBinding.singleAdapter());
            }
        }
        builderNewBuilder.clearUnknownFields();
        return (M) builderNewBuilder.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public String toString(M m) {
        StringBuilder sb = new StringBuilder();
        for (FieldBinding<M, B> fieldBinding : this.fieldBindings.values()) {
            Object obj = fieldBinding.get(m);
            if (obj != null) {
                sb.append(", ");
                sb.append(fieldBinding.name);
                sb.append('=');
                if (fieldBinding.redacted) {
                    obj = REDACTED;
                }
                sb.append(obj);
            }
        }
        sb.replace(0, 2, this.messageType.getSimpleName().concat("{"));
        sb.append('}');
        return sb.toString();
    }
}
