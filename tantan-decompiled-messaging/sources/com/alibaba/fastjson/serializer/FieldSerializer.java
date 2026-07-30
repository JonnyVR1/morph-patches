package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class FieldSerializer implements Comparable<FieldSerializer> {
    protected boolean browserCompatible;
    protected boolean disableCircularReferenceDetect;
    private final String double_quoted_fieldPrefix;
    protected int features;
    protected BeanContext fieldContext;
    public final FieldInfo fieldInfo;
    private String format;
    protected boolean persistenceXToMany;
    private RuntimeSerializerInfo runtimeInfo;
    protected boolean serializeUsing = false;
    private String single_quoted_fieldPrefix;
    private String un_quoted_fieldPrefix;
    protected boolean writeEnumUsingName;
    protected boolean writeEnumUsingToString;
    protected final boolean writeNull;

    public static class RuntimeSerializerInfo {
        final ObjectSerializer fieldSerializer;
        final Class<?> runtimeFieldClass;

        public RuntimeSerializerInfo(ObjectSerializer objectSerializer, Class<?> cls) {
            this.fieldSerializer = objectSerializer;
            this.runtimeFieldClass = cls;
        }
    }

    public FieldSerializer(Class<?> cls, FieldInfo fieldInfo) {
        boolean z;
        JSONType jSONType;
        Class<?> cls2;
        this.writeEnumUsingToString = false;
        this.writeEnumUsingName = false;
        this.disableCircularReferenceDetect = false;
        this.persistenceXToMany = false;
        this.fieldInfo = fieldInfo;
        this.fieldContext = new BeanContext(cls, fieldInfo);
        if (cls != null && ((fieldInfo.isEnum || (cls2 = fieldInfo.fieldClass) == Long.TYPE || cls2 == Long.class || cls2 == BigInteger.class || cls2 == BigDecimal.class) && (jSONType = (JSONType) TypeUtils.getAnnotation(cls, JSONType.class)) != null)) {
            for (SerializerFeature serializerFeature : jSONType.serialzeFeatures()) {
                if (serializerFeature == SerializerFeature.WriteEnumUsingToString) {
                    this.writeEnumUsingToString = true;
                } else if (serializerFeature == SerializerFeature.WriteEnumUsingName) {
                    this.writeEnumUsingName = true;
                } else if (serializerFeature == SerializerFeature.DisableCircularReferenceDetect) {
                    this.disableCircularReferenceDetect = true;
                } else {
                    SerializerFeature serializerFeature2 = SerializerFeature.BrowserCompatible;
                    if (serializerFeature == serializerFeature2) {
                        this.features |= serializerFeature2.mask;
                        this.browserCompatible = true;
                    }
                }
            }
        }
        fieldInfo.setAccessible();
        this.double_quoted_fieldPrefix = "\"" + fieldInfo.name + "\":";
        JSONField annotation = fieldInfo.getAnnotation();
        if (annotation != null) {
            SerializerFeature[] serializerFeatureArrSerialzeFeatures = annotation.serialzeFeatures();
            int length = serializerFeatureArrSerialzeFeatures.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else {
                    if ((serializerFeatureArrSerialzeFeatures[i].getMask() & SerializerFeature.WRITE_MAP_NULL_FEATURES) != 0) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            String str = annotation.format();
            this.format = str;
            if (str.trim().length() == 0) {
                this.format = null;
            }
            for (SerializerFeature serializerFeature3 : annotation.serialzeFeatures()) {
                if (serializerFeature3 == SerializerFeature.WriteEnumUsingToString) {
                    this.writeEnumUsingToString = true;
                } else if (serializerFeature3 == SerializerFeature.WriteEnumUsingName) {
                    this.writeEnumUsingName = true;
                } else if (serializerFeature3 == SerializerFeature.DisableCircularReferenceDetect) {
                    this.disableCircularReferenceDetect = true;
                } else if (serializerFeature3 == SerializerFeature.BrowserCompatible) {
                    this.browserCompatible = true;
                }
            }
            this.features = SerializerFeature.m4802of(annotation.serialzeFeatures());
        } else {
            z = false;
        }
        this.writeNull = z;
        this.persistenceXToMany = TypeUtils.isAnnotationPresentOneToMany(fieldInfo.method) || TypeUtils.isAnnotationPresentManyToMany(fieldInfo.method);
    }

    @Override // java.lang.Comparable
    public int compareTo(FieldSerializer fieldSerializer) {
        return this.fieldInfo.compareTo(fieldSerializer.fieldInfo);
    }

    public Object getPropertyValue(Object obj) throws IllegalAccessException, InvocationTargetException {
        Class<?> cls;
        Object obj2 = this.fieldInfo.get(obj);
        if (this.format == null || obj2 == null || !((cls = this.fieldInfo.fieldClass) == Date.class || cls == java.sql.Date.class)) {
            return obj2;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.format, JSON.defaultLocale);
        simpleDateFormat.setTimeZone(JSON.defaultTimeZone);
        return simpleDateFormat.format(obj2);
    }

    public Object getPropertyValueDirect(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object obj2 = this.fieldInfo.get(obj);
        if (!this.persistenceXToMany || TypeUtils.isHibernateInitialized(obj2)) {
            return obj2;
        }
        return null;
    }

    public void writePrefix(JSONSerializer jSONSerializer) throws IOException {
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (!serializeWriter.quoteFieldNames) {
            if (this.un_quoted_fieldPrefix == null) {
                this.un_quoted_fieldPrefix = this.fieldInfo.name + ":";
            }
            serializeWriter.write(this.un_quoted_fieldPrefix);
            return;
        }
        if (!SerializerFeature.isEnabled(serializeWriter.features, this.fieldInfo.serialzeFeatures, SerializerFeature.UseSingleQuotes)) {
            serializeWriter.write(this.double_quoted_fieldPrefix);
            return;
        }
        if (this.single_quoted_fieldPrefix == null) {
            this.single_quoted_fieldPrefix = "'" + this.fieldInfo.name + "':";
        }
        serializeWriter.write(this.single_quoted_fieldPrefix);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    public void writeValue(JSONSerializer jSONSerializer, Object obj) throws Exception {
        Object obj2;
        Class<?> cls;
        Class<?> cls2;
        ObjectSerializer objectWriter;
        RuntimeSerializerInfo runtimeSerializerInfo = this.runtimeInfo;
        Class<?> cls3 = Long.TYPE;
        if (runtimeSerializerInfo == null) {
            Class<?> cls4 = Double.TYPE;
            Class<?> cls5 = Float.TYPE;
            if (obj == null) {
                cls2 = this.fieldInfo.fieldClass;
                if (cls2 == Byte.TYPE) {
                    cls2 = Byte.class;
                } else if (cls2 == Short.TYPE) {
                    cls2 = Short.class;
                } else if (cls2 == Integer.TYPE) {
                    cls2 = Integer.class;
                } else if (cls2 == cls3) {
                    cls2 = Long.class;
                } else if (cls2 == cls5) {
                    cls2 = Float.class;
                } else if (cls2 == cls4) {
                    cls2 = Double.class;
                } else if (cls2 == Boolean.TYPE) {
                    cls2 = Boolean.class;
                }
            } else {
                cls2 = obj.getClass();
            }
            JSONField annotation = this.fieldInfo.getAnnotation();
            if (annotation == null || annotation.serializeUsing() == Void.class) {
                if (this.format == null) {
                    objectWriter = null;
                } else if (cls2 == cls4 || cls2 == Double.class) {
                    objectWriter = new DoubleSerializer(this.format);
                } else if (cls2 == cls5 || cls2 == Float.class) {
                    objectWriter = new FloatCodec(this.format);
                } else {
                    objectWriter = null;
                }
                if (objectWriter == null) {
                    objectWriter = jSONSerializer.getObjectWriter(cls2);
                }
            } else {
                objectWriter = (ObjectSerializer) annotation.serializeUsing().newInstance();
                this.serializeUsing = true;
            }
            this.runtimeInfo = new RuntimeSerializerInfo(objectWriter, cls2);
        }
        RuntimeSerializerInfo runtimeSerializerInfo2 = this.runtimeInfo;
        boolean z = this.disableCircularReferenceDetect;
        FieldInfo fieldInfo = this.fieldInfo;
        int i = (z ? fieldInfo.serialzeFeatures | SerializerFeature.DisableCircularReferenceDetect.mask : fieldInfo.serialzeFeatures) | this.features;
        if (obj == null) {
            SerializeWriter serializeWriter = jSONSerializer.out;
            if (this.fieldInfo.fieldClass == Object.class && serializeWriter.isEnabled(SerializerFeature.WRITE_MAP_NULL_FEATURES)) {
                serializeWriter.writeNull();
                return;
            }
            Class<?> cls6 = runtimeSerializerInfo2.runtimeFieldClass;
            if (Number.class.isAssignableFrom(cls6)) {
                serializeWriter.writeNull(this.features, SerializerFeature.WriteNullNumberAsZero.mask);
                return;
            }
            if (String.class == cls6) {
                serializeWriter.writeNull(this.features, SerializerFeature.WriteNullStringAsEmpty.mask);
                return;
            }
            if (Boolean.class == cls6) {
                serializeWriter.writeNull(this.features, SerializerFeature.WriteNullBooleanAsFalse.mask);
                return;
            }
            if (Collection.class.isAssignableFrom(cls6)) {
                serializeWriter.writeNull(this.features, SerializerFeature.WriteNullListAsEmpty.mask);
                return;
            }
            ObjectSerializer objectSerializer = runtimeSerializerInfo2.fieldSerializer;
            if (serializeWriter.isEnabled(SerializerFeature.WRITE_MAP_NULL_FEATURES) && (objectSerializer instanceof JavaBeanSerializer)) {
                serializeWriter.writeNull();
                return;
            } else {
                FieldInfo fieldInfo2 = this.fieldInfo;
                objectSerializer.write(jSONSerializer, null, fieldInfo2.name, fieldInfo2.fieldType, i);
                return;
            }
        }
        if (this.fieldInfo.isEnum) {
            if (this.writeEnumUsingName) {
                jSONSerializer.out.writeString(((Enum) obj).name());
                return;
            } else if (this.writeEnumUsingToString) {
                jSONSerializer.out.writeString(((Enum) obj).toString());
                return;
            }
        }
        Class<?> cls7 = obj.getClass();
        ObjectSerializer objectWriter2 = (cls7 == runtimeSerializerInfo2.runtimeFieldClass || this.serializeUsing) ? runtimeSerializerInfo2.fieldSerializer : jSONSerializer.getObjectWriter(cls7);
        String str = this.format;
        if (str != null && !(objectWriter2 instanceof DoubleSerializer) && !(objectWriter2 instanceof FloatCodec)) {
            if (objectWriter2 instanceof ContextObjectSerializer) {
                ((ContextObjectSerializer) objectWriter2).write(jSONSerializer, obj, this.fieldContext);
                return;
            } else {
                jSONSerializer.writeWithFormat(obj, str);
                return;
            }
        }
        FieldInfo fieldInfo3 = this.fieldInfo;
        if (!fieldInfo3.unwrapped) {
            obj2 = obj;
        } else {
            if (objectWriter2 instanceof JavaBeanSerializer) {
                ((JavaBeanSerializer) objectWriter2).write(jSONSerializer, obj, fieldInfo3.name, fieldInfo3.fieldType, i, true);
                return;
            }
            obj2 = obj;
            if (objectWriter2 instanceof MapSerializer) {
                ((MapSerializer) objectWriter2).write(jSONSerializer, obj2, fieldInfo3.name, fieldInfo3.fieldType, i, true);
                return;
            }
        }
        if ((this.features & SerializerFeature.WriteClassName.mask) != 0 && cls7 != fieldInfo3.fieldClass && JavaBeanSerializer.class.isInstance(objectWriter2)) {
            FieldInfo fieldInfo4 = this.fieldInfo;
            ((JavaBeanSerializer) objectWriter2).write(jSONSerializer, obj2, fieldInfo4.name, fieldInfo4.fieldType, i, false);
            return;
        }
        if (this.browserCompatible && ((cls = this.fieldInfo.fieldClass) == cls3 || cls == Long.class)) {
            long jLongValue = ((Long) obj2).longValue();
            if (jLongValue > 9007199254740991L || jLongValue < -9007199254740991L) {
                jSONSerializer.getWriter().writeString(Long.toString(jLongValue));
                return;
            }
        }
        FieldInfo fieldInfo5 = this.fieldInfo;
        objectWriter2.write(jSONSerializer, obj2, fieldInfo5.name, fieldInfo5.fieldType, i);
    }
}
