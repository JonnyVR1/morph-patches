package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.asm.ClassWriter;
import com.alibaba.fastjson.asm.FieldWriter;
import com.alibaba.fastjson.asm.Label;
import com.alibaba.fastjson.asm.MethodVisitor;
import com.alibaba.fastjson.asm.MethodWriter;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.fastjson.asm.Type;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.ASMClassLoader;
import com.alibaba.fastjson.util.ASMUtils;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;
import com.facebook.AuthenticationTokenClaims;
import com.meituan.robust.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.spongycastle.pqc.math.linearalgebra.Matrix;
import p153l.qkq;

/* JADX INFO: loaded from: classes.dex */
public class ASMSerializerFactory implements Opcodes {
    static final String JSONSerializer = ASMUtils.type(JSONSerializer.class);
    static final String JavaBeanSerializer;
    static final String JavaBeanSerializer_desc;
    static final String ObjectSerializer;
    static final String ObjectSerializer_desc;
    static final String SerialContext_desc;
    static final String SerializeFilterable_desc;
    static final String SerializeWriter;
    static final String SerializeWriter_desc;
    protected final ASMClassLoader classLoader = new ASMClassLoader();
    private final AtomicLong seed = new AtomicLong();

    static {
        String strType = ASMUtils.type(ObjectSerializer.class);
        ObjectSerializer = strType;
        ObjectSerializer_desc = "L" + strType + Constants.PACKNAME_END;
        String strType2 = ASMUtils.type(SerializeWriter.class);
        SerializeWriter = strType2;
        SerializeWriter_desc = "L" + strType2 + Constants.PACKNAME_END;
        JavaBeanSerializer = ASMUtils.type(JavaBeanSerializer.class);
        JavaBeanSerializer_desc = "L" + ASMUtils.type(JavaBeanSerializer.class) + Constants.PACKNAME_END;
        SerialContext_desc = ASMUtils.desc((Class<?>) SerialContext.class);
        SerializeFilterable_desc = ASMUtils.desc((Class<?>) SerializeFilterable.class);
    }

    private void _after(MethodVisitor methodVisitor, Context context) {
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitMethodInsn(182, JavaBeanSerializer, "writeAfter", "(L" + JSONSerializer + ";Ljava/lang/Object;C)C");
        methodVisitor.visitVarInsn(54, context.var("seperator"));
    }

    private void _apply(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Class<?> cls = fieldInfo.fieldClass;
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitVarInsn(25, Context.fieldName);
        if (cls == Byte.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.BYTE));
            methodVisitor.visitMethodInsn(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
        } else if (cls == Short.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.SHORT));
            methodVisitor.visitMethodInsn(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
        } else if (cls == Integer.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.INT));
            methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        } else if (cls == Character.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.CHAR));
            methodVisitor.visitMethodInsn(184, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
        } else if (cls == Long.TYPE) {
            methodVisitor.visitVarInsn(22, context.var(Constants.LONG, 2));
            methodVisitor.visitMethodInsn(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
        } else if (cls == Float.TYPE) {
            methodVisitor.visitVarInsn(23, context.var(Constants.FLOAT));
            methodVisitor.visitMethodInsn(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
        } else if (cls == Double.TYPE) {
            methodVisitor.visitVarInsn(24, context.var(Constants.DOUBLE, 2));
            methodVisitor.visitMethodInsn(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
        } else if (cls == Boolean.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.BOOLEAN));
            methodVisitor.visitMethodInsn(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
        } else if (cls == BigDecimal.class) {
            methodVisitor.visitVarInsn(25, context.var("decimal"));
        } else if (cls == String.class) {
            methodVisitor.visitVarInsn(25, context.var("string"));
        } else if (cls.isEnum()) {
            methodVisitor.visitVarInsn(25, context.var("enum"));
        } else if (List.class.isAssignableFrom(cls)) {
            methodVisitor.visitVarInsn(25, context.var("list"));
        } else {
            methodVisitor.visitVarInsn(25, context.var("object"));
        }
        methodVisitor.visitMethodInsn(182, JavaBeanSerializer, "apply", "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z");
    }

    private void _before(MethodVisitor methodVisitor, Context context) {
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitMethodInsn(182, JavaBeanSerializer, "writeBefore", "(L" + JSONSerializer + ";Ljava/lang/Object;C)C");
        methodVisitor.visitVarInsn(54, context.var("seperator"));
    }

    private void _decimal(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(58, context.var("decimal"));
        _filters(methodVisitor, fieldInfo, context, label);
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
        methodVisitor.visitLabel(label2);
        methodVisitor.visitVarInsn(25, context.var("decimal"));
        methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label3);
        _if_write_null(methodVisitor, fieldInfo, context);
        methodVisitor.visitJumpInsn(167, label4);
        methodVisitor.visitLabel(label3);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitVarInsn(25, Context.fieldName);
        methodVisitor.visitVarInsn(25, context.var("decimal"));
        methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;Ljava/math/BigDecimal;)V");
        _seperator(methodVisitor, context);
        methodVisitor.visitJumpInsn(167, label4);
        methodVisitor.visitLabel(label4);
        methodVisitor.visitLabel(label);
    }

    private void _double(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(57, context.var(Constants.DOUBLE, 2));
        _filters(methodVisitor, fieldInfo, context, label);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitVarInsn(25, Context.fieldName);
        methodVisitor.visitVarInsn(24, context.var(Constants.DOUBLE, 2));
        methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;D)V");
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label);
    }

    private void _enum(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label3);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitTypeInsn(192, "java/lang/Enum");
        methodVisitor.visitVarInsn(58, context.var("enum"));
        _filters(methodVisitor, fieldInfo, context, label3);
        methodVisitor.visitVarInsn(25, context.var("enum"));
        methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label);
        _if_write_null(methodVisitor, fieldInfo, context);
        methodVisitor.visitJumpInsn(167, label2);
        methodVisitor.visitLabel(label);
        if (context.writeDirect) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(21, context.var("seperator"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitVarInsn(25, context.var("enum"));
            methodVisitor.visitMethodInsn(182, "java/lang/Enum", AuthenticationTokenClaims.JSON_KEY_NAME, "()Ljava/lang/String;");
            methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldValueStringWithDoubleQuote", "(CLjava/lang/String;Ljava/lang/String;)V");
        } else {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(21, context.var("seperator"));
            String str = SerializeWriter;
            methodVisitor.visitMethodInsn(182, str, "write", "(I)V");
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitInsn(3);
            methodVisitor.visitMethodInsn(182, str, "writeFieldName", "(Ljava/lang/String;Z)V");
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, context.var("enum"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(fieldInfo.fieldClass)));
            methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
            methodVisitor.visitMethodInsn(182, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
        }
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label2);
        methodVisitor.visitLabel(label3);
    }

    private void _filters(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, Label label) {
        if (fieldInfo.fieldTransient) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.SkipTransientField.mask));
            methodVisitor.visitMethodInsn(182, SerializeWriter, "isEnabled", "(I)Z");
            methodVisitor.visitJumpInsn(154, label);
        }
        _notWriteDefault(methodVisitor, fieldInfo, context, label);
        if (context.writeDirect) {
            return;
        }
        _apply(methodVisitor, fieldInfo, context);
        methodVisitor.visitJumpInsn(153, label);
        _processKey(methodVisitor, fieldInfo, context);
        _processValue(methodVisitor, fieldInfo, context, label);
    }

    private void _float(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(56, context.var(Constants.FLOAT));
        _filters(methodVisitor, fieldInfo, context, label);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitVarInsn(25, Context.fieldName);
        methodVisitor.visitVarInsn(23, context.var(Constants.FLOAT));
        methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;F)V");
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label);
    }

    private void _get(MethodVisitor methodVisitor, Context context, FieldInfo fieldInfo) {
        Method method = fieldInfo.method;
        if (method != null) {
            methodVisitor.visitVarInsn(25, context.var("entity"));
            Class<?> declaringClass = method.getDeclaringClass();
            methodVisitor.visitMethodInsn(declaringClass.isInterface() ? 185 : 182, ASMUtils.type(declaringClass), method.getName(), ASMUtils.desc(method));
            if (method.getReturnType().equals(fieldInfo.fieldClass)) {
                return;
            }
            methodVisitor.visitTypeInsn(192, ASMUtils.type(fieldInfo.fieldClass));
            return;
        }
        methodVisitor.visitVarInsn(25, context.var("entity"));
        Field field = fieldInfo.field;
        methodVisitor.visitFieldInsn(180, ASMUtils.type(fieldInfo.declaringClass), field.getName(), ASMUtils.desc(field.getType()));
        if (field.getType().equals(fieldInfo.fieldClass)) {
            return;
        }
        methodVisitor.visitTypeInsn(192, ASMUtils.type(fieldInfo.fieldClass));
    }

    private void _getFieldSer(Context context, MethodVisitor methodVisitor, FieldInfo fieldInfo) {
        Label label = new Label();
        methodVisitor.visitVarInsn(25, 0);
        String str = context.className;
        String str2 = fieldInfo.name + "_asm_ser_";
        String str3 = ObjectSerializer_desc;
        methodVisitor.visitFieldInsn(180, str, str2, str3);
        methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(fieldInfo.fieldClass)));
        methodVisitor.visitMethodInsn(182, JSONSerializer, "getObjectWriter", "(Ljava/lang/Class;)" + str3);
        methodVisitor.visitFieldInsn(181, context.className, fieldInfo.name + "_asm_ser_", str3);
        methodVisitor.visitLabel(label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_ser_", str3);
    }

    private void _getListFieldItemSer(Context context, MethodVisitor methodVisitor, FieldInfo fieldInfo, Class<?> cls) {
        Label label = new Label();
        methodVisitor.visitVarInsn(25, 0);
        String str = context.className;
        String str2 = fieldInfo.name + "_asm_list_item_ser_";
        String str3 = ObjectSerializer_desc;
        methodVisitor.visitFieldInsn(180, str, str2, str3);
        methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls)));
        methodVisitor.visitMethodInsn(182, JSONSerializer, "getObjectWriter", "(Ljava/lang/Class;)" + str3);
        methodVisitor.visitFieldInsn(181, context.className, fieldInfo.name + "_asm_list_item_ser_", str3);
        methodVisitor.visitLabel(label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_list_item_ser_", str3);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:43:0x0139  */
    private void _if_write_null(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        int i;
        int mask;
        int mask2;
        Class<?> cls = fieldInfo.fieldClass;
        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
        methodVisitor.visitLabel(label);
        JSONField annotation = fieldInfo.getAnnotation();
        int iM4812of = annotation != null ? SerializerFeature.m4812of(annotation.serialzeFeatures()) : 0;
        JSONType jSONType = context.beanInfo.jsonType;
        if (jSONType != null) {
            iM4812of |= SerializerFeature.m4812of(jSONType.serialzeFeatures());
        }
        if (cls == String.class) {
            mask = SerializerFeature.WriteMapNullValue.getMask();
            mask2 = SerializerFeature.WriteNullStringAsEmpty.getMask();
        } else if (Number.class.isAssignableFrom(cls)) {
            mask = SerializerFeature.WriteMapNullValue.getMask();
            mask2 = SerializerFeature.WriteNullNumberAsZero.getMask();
        } else {
            if (!Collection.class.isAssignableFrom(cls)) {
                if (Boolean.class == cls) {
                    mask = SerializerFeature.WriteMapNullValue.getMask();
                    mask2 = SerializerFeature.WriteNullBooleanAsFalse.getMask();
                } else {
                    i = SerializerFeature.WRITE_MAP_NULL_FEATURES;
                }
                if ((iM4812of & i) == 0) {
                    methodVisitor.visitVarInsn(25, context.var("out"));
                    methodVisitor.visitLdcInsn(Integer.valueOf(i));
                    methodVisitor.visitMethodInsn(182, SerializeWriter, "isEnabled", "(I)Z");
                    methodVisitor.visitJumpInsn(153, label2);
                }
                methodVisitor.visitLabel(label3);
                methodVisitor.visitVarInsn(25, context.var("out"));
                methodVisitor.visitVarInsn(21, context.var("seperator"));
                String str = SerializeWriter;
                methodVisitor.visitMethodInsn(182, str, "write", "(I)V");
                _writeFieldName(methodVisitor, context);
                methodVisitor.visitVarInsn(25, context.var("out"));
                methodVisitor.visitLdcInsn(Integer.valueOf(iM4812of));
                if (cls != String.class || cls == Character.class) {
                    methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.WriteNullStringAsEmpty.mask));
                } else if (Number.class.isAssignableFrom(cls)) {
                    methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.WriteNullNumberAsZero.mask));
                } else if (cls == Boolean.class) {
                    methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.WriteNullBooleanAsFalse.mask));
                } else if (Collection.class.isAssignableFrom(cls) || cls.isArray()) {
                    methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.WriteNullListAsEmpty.mask));
                } else {
                    methodVisitor.visitLdcInsn(0);
                }
                methodVisitor.visitMethodInsn(182, str, "writeNull", "(II)V");
                _seperator(methodVisitor, context);
                methodVisitor.visitJumpInsn(167, label4);
                methodVisitor.visitLabel(label2);
                methodVisitor.visitLabel(label4);
            }
            mask = SerializerFeature.WriteMapNullValue.getMask();
            mask2 = SerializerFeature.WriteNullListAsEmpty.getMask();
        }
        i = mask | mask2;
        if ((iM4812of & i) == 0) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitLdcInsn(Integer.valueOf(i));
            methodVisitor.visitMethodInsn(182, SerializeWriter, "isEnabled", "(I)Z");
            methodVisitor.visitJumpInsn(153, label2);
        }
        methodVisitor.visitLabel(label3);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        String str2 = SerializeWriter;
        methodVisitor.visitMethodInsn(182, str2, "write", "(I)V");
        _writeFieldName(methodVisitor, context);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitLdcInsn(Integer.valueOf(iM4812of));
        if (cls != String.class) {
            methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.WriteNullStringAsEmpty.mask));
        } else {
            methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.WriteNullStringAsEmpty.mask));
        }
        methodVisitor.visitMethodInsn(182, str2, "writeNull", "(II)V");
        _seperator(methodVisitor, context);
        methodVisitor.visitJumpInsn(167, label4);
        methodVisitor.visitLabel(label2);
        methodVisitor.visitLabel(label4);
    }

    private void _int(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, int i, char c) {
        Label label = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(54, i);
        _filters(methodVisitor, fieldInfo, context, label);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitVarInsn(25, Context.fieldName);
        methodVisitor.visitVarInsn(21, i);
        methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;" + c + ")V");
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label);
    }

    private void _labelApply(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, Label label) {
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitLdcInsn(fieldInfo.label);
        methodVisitor.visitMethodInsn(182, JavaBeanSerializer, "applyLabel", "(L" + JSONSerializer + ";Ljava/lang/String;)Z");
        methodVisitor.visitJumpInsn(153, label);
    }

    private void _list(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label;
        String str;
        FieldInfo fieldInfo2;
        Label label2;
        int i;
        int i2;
        int i3;
        String str2;
        java.lang.reflect.Type collectionItemType = TypeUtils.getCollectionItemType(fieldInfo.fieldType);
        Class<?> cls2 = null;
        Class<?> cls3 = collectionItemType instanceof Class ? (Class) collectionItemType : null;
        if (cls3 != Object.class && cls3 != Serializable.class) {
            cls2 = cls3;
        }
        Label label3 = new Label();
        Label label4 = new Label();
        Label label5 = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label3);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitTypeInsn(192, "java/util/List");
        methodVisitor.visitVarInsn(58, context.var("list"));
        _filters(methodVisitor, fieldInfo, context, label3);
        methodVisitor.visitVarInsn(25, context.var("list"));
        methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label4);
        _if_write_null(methodVisitor, fieldInfo, context);
        methodVisitor.visitJumpInsn(167, label5);
        methodVisitor.visitLabel(label4);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        String str3 = SerializeWriter;
        methodVisitor.visitMethodInsn(182, str3, "write", "(I)V");
        _writeFieldName(methodVisitor, context);
        methodVisitor.visitVarInsn(25, context.var("list"));
        methodVisitor.visitMethodInsn(185, "java/util/List", "size", "()I");
        methodVisitor.visitVarInsn(54, context.var("size"));
        Label label6 = new Label();
        Label label7 = new Label();
        methodVisitor.visitVarInsn(21, context.var("size"));
        methodVisitor.visitInsn(3);
        methodVisitor.visitJumpInsn(160, label6);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitLdcInsn(WeJson.EMPTY_ARR);
        methodVisitor.visitMethodInsn(182, str3, "write", "(Ljava/lang/String;)V");
        methodVisitor.visitJumpInsn(167, label7);
        methodVisitor.visitLabel(label6);
        if (!context.nonContext) {
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, context.var("list"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitMethodInsn(182, JSONSerializer, "setContext", "(Ljava/lang/Object;Ljava/lang/Object;)V");
        }
        if (collectionItemType == String.class && context.writeDirect) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(25, context.var("list"));
            methodVisitor.visitMethodInsn(182, str3, "write", "(Ljava/util/List;)V");
            i2 = 25;
            i = 1;
            i3 = 182;
        } else {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(16, 91);
            methodVisitor.visitMethodInsn(182, str3, "write", "(I)V");
            Label label8 = new Label();
            Label label9 = new Label();
            Label label10 = new Label();
            methodVisitor.visitInsn(3);
            Class<?> cls4 = cls2;
            methodVisitor.visitVarInsn(54, context.var(RXScreenCaptureService.KEY_INDEX));
            methodVisitor.visitLabel(label8);
            methodVisitor.visitVarInsn(21, context.var(RXScreenCaptureService.KEY_INDEX));
            methodVisitor.visitVarInsn(21, context.var("size"));
            methodVisitor.visitJumpInsn(162, label10);
            methodVisitor.visitVarInsn(21, context.var(RXScreenCaptureService.KEY_INDEX));
            methodVisitor.visitJumpInsn(153, label9);
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(16, 44);
            methodVisitor.visitMethodInsn(182, str3, "write", "(I)V");
            methodVisitor.visitLabel(label9);
            methodVisitor.visitVarInsn(25, context.var("list"));
            methodVisitor.visitVarInsn(21, context.var(RXScreenCaptureService.KEY_INDEX));
            methodVisitor.visitMethodInsn(185, "java/util/List", "get", "(I)Ljava/lang/Object;");
            methodVisitor.visitVarInsn(58, context.var("list_item"));
            Label label11 = new Label();
            Label label12 = new Label();
            methodVisitor.visitVarInsn(25, context.var("list_item"));
            methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label12);
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitMethodInsn(182, str3, "writeNull", "()V");
            methodVisitor.visitJumpInsn(167, label11);
            methodVisitor.visitLabel(label12);
            Label label13 = new Label();
            Label label14 = new Label();
            if (cls4 == null || !Modifier.isPublic(cls4.getModifiers())) {
                label = label13;
                str = "write";
                fieldInfo2 = fieldInfo;
                label2 = label14;
            } else {
                methodVisitor.visitVarInsn(25, context.var("list_item"));
                methodVisitor.visitMethodInsn(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls4)));
                methodVisitor.visitJumpInsn(166, label14);
                fieldInfo2 = fieldInfo;
                _getListFieldItemSer(context, methodVisitor, fieldInfo2, cls4);
                methodVisitor.visitVarInsn(58, context.var("list_item_desc"));
                Label label15 = new Label();
                Label label16 = new Label();
                if (context.writeDirect) {
                    String str4 = (context.nonContext && context.writeDirect) ? "writeDirectNonContext" : "write";
                    methodVisitor.visitVarInsn(25, context.var("list_item_desc"));
                    String str5 = JavaBeanSerializer;
                    methodVisitor.visitTypeInsn(193, str5);
                    methodVisitor.visitJumpInsn(153, label15);
                    methodVisitor.visitVarInsn(25, context.var("list_item_desc"));
                    methodVisitor.visitTypeInsn(192, str5);
                    methodVisitor.visitVarInsn(25, 1);
                    methodVisitor.visitVarInsn(25, context.var("list_item"));
                    if (context.nonContext) {
                        methodVisitor.visitInsn(1);
                    } else {
                        methodVisitor.visitVarInsn(21, context.var(RXScreenCaptureService.KEY_INDEX));
                        methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                    }
                    methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls4)));
                    methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo2.serialzeFeatures));
                    methodVisitor.visitMethodInsn(182, str5, str4, "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                    methodVisitor.visitJumpInsn(167, label16);
                    methodVisitor.visitLabel(label15);
                    str2 = "list_item_desc";
                } else {
                    label14 = label14;
                    str2 = "list_item_desc";
                }
                methodVisitor.visitVarInsn(25, context.var(str2));
                methodVisitor.visitVarInsn(25, 1);
                methodVisitor.visitVarInsn(25, context.var("list_item"));
                if (context.nonContext) {
                    methodVisitor.visitInsn(1);
                } else {
                    methodVisitor.visitVarInsn(21, context.var(RXScreenCaptureService.KEY_INDEX));
                    methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                }
                methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls4)));
                methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo2.serialzeFeatures));
                str = "write";
                methodVisitor.visitMethodInsn(185, ObjectSerializer, str, "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                methodVisitor.visitLabel(label16);
                label = label13;
                methodVisitor.visitJumpInsn(167, label);
                label2 = label14;
            }
            methodVisitor.visitLabel(label2);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, context.var("list_item"));
            if (context.nonContext) {
                methodVisitor.visitInsn(1);
            } else {
                methodVisitor.visitVarInsn(21, context.var(RXScreenCaptureService.KEY_INDEX));
                methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
            }
            if (cls4 == null || !Modifier.isPublic(cls4.getModifiers())) {
                methodVisitor.visitMethodInsn(182, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;)V");
            } else {
                methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc((Class<?>) collectionItemType)));
                methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo2.serialzeFeatures));
                methodVisitor.visitMethodInsn(182, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            }
            methodVisitor.visitLabel(label);
            methodVisitor.visitLabel(label11);
            i = 1;
            methodVisitor.visitIincInsn(context.var(RXScreenCaptureService.KEY_INDEX), 1);
            methodVisitor.visitJumpInsn(167, label8);
            methodVisitor.visitLabel(label10);
            i2 = 25;
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(16, 93);
            i3 = 182;
            methodVisitor.visitMethodInsn(182, str3, str, "(I)V");
        }
        methodVisitor.visitVarInsn(i2, i);
        methodVisitor.visitMethodInsn(i3, JSONSerializer, "popContext", "()V");
        methodVisitor.visitLabel(label7);
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label5);
        methodVisitor.visitLabel(label3);
    }

    private void _long(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(55, context.var(Constants.LONG, 2));
        _filters(methodVisitor, fieldInfo, context, label);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitVarInsn(25, Context.fieldName);
        methodVisitor.visitVarInsn(22, context.var(Constants.LONG, 2));
        methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;J)V");
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label);
    }

    private void _nameApply(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, Label label) {
        if (!context.writeDirect) {
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitMethodInsn(182, JavaBeanSerializer, "applyName", "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/String;)Z");
            methodVisitor.visitJumpInsn(153, label);
            _labelApply(methodVisitor, fieldInfo, context, label);
        }
        if (fieldInfo.field == null) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.IgnoreNonFieldGetter.mask));
            methodVisitor.visitMethodInsn(182, SerializeWriter, "isEnabled", "(I)Z");
            methodVisitor.visitJumpInsn(154, label);
        }
    }

    private void _notWriteDefault(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, Label label) {
        if (context.writeDirect) {
            return;
        }
        Label label2 = new Label();
        methodVisitor.visitVarInsn(21, context.var("notWriteDefaultValue"));
        methodVisitor.visitJumpInsn(153, label2);
        Class<?> cls = fieldInfo.fieldClass;
        if (cls == Boolean.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.BOOLEAN));
            methodVisitor.visitJumpInsn(153, label);
        } else if (cls == Byte.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.BYTE));
            methodVisitor.visitJumpInsn(153, label);
        } else if (cls == Short.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.SHORT));
            methodVisitor.visitJumpInsn(153, label);
        } else if (cls == Integer.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.INT));
            methodVisitor.visitJumpInsn(153, label);
        } else if (cls == Long.TYPE) {
            methodVisitor.visitVarInsn(22, context.var(Constants.LONG));
            methodVisitor.visitInsn(9);
            methodVisitor.visitInsn(148);
            methodVisitor.visitJumpInsn(153, label);
        } else if (cls == Float.TYPE) {
            methodVisitor.visitVarInsn(23, context.var(Constants.FLOAT));
            methodVisitor.visitInsn(11);
            methodVisitor.visitInsn(149);
            methodVisitor.visitJumpInsn(153, label);
        } else if (cls == Double.TYPE) {
            methodVisitor.visitVarInsn(24, context.var(Constants.DOUBLE));
            methodVisitor.visitInsn(14);
            methodVisitor.visitInsn(151);
            methodVisitor.visitJumpInsn(153, label);
        }
        methodVisitor.visitLabel(label2);
    }

    private void _object(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(58, context.var("object"));
        _filters(methodVisitor, fieldInfo, context, label);
        _writeObject(methodVisitor, fieldInfo, context, label);
        methodVisitor.visitLabel(label);
    }

    private void _processKey(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        methodVisitor.visitVarInsn(21, context.var("hasNameFilters"));
        methodVisitor.visitJumpInsn(153, label);
        Class<?> cls = fieldInfo.fieldClass;
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitVarInsn(25, Context.fieldName);
        if (cls == Byte.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.BYTE));
            methodVisitor.visitMethodInsn(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
        } else if (cls == Short.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.SHORT));
            methodVisitor.visitMethodInsn(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
        } else if (cls == Integer.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.INT));
            methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        } else if (cls == Character.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.CHAR));
            methodVisitor.visitMethodInsn(184, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
        } else if (cls == Long.TYPE) {
            methodVisitor.visitVarInsn(22, context.var(Constants.LONG, 2));
            methodVisitor.visitMethodInsn(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
        } else if (cls == Float.TYPE) {
            methodVisitor.visitVarInsn(23, context.var(Constants.FLOAT));
            methodVisitor.visitMethodInsn(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
        } else if (cls == Double.TYPE) {
            methodVisitor.visitVarInsn(24, context.var(Constants.DOUBLE, 2));
            methodVisitor.visitMethodInsn(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
        } else if (cls == Boolean.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.BOOLEAN));
            methodVisitor.visitMethodInsn(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
        } else if (cls == BigDecimal.class) {
            methodVisitor.visitVarInsn(25, context.var("decimal"));
        } else if (cls == String.class) {
            methodVisitor.visitVarInsn(25, context.var("string"));
        } else if (cls.isEnum()) {
            methodVisitor.visitVarInsn(25, context.var("enum"));
        } else if (List.class.isAssignableFrom(cls)) {
            methodVisitor.visitVarInsn(25, context.var("list"));
        } else {
            methodVisitor.visitVarInsn(25, context.var("object"));
        }
        methodVisitor.visitMethodInsn(182, JavaBeanSerializer, "processKey", "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;");
        methodVisitor.visitVarInsn(58, Context.fieldName);
        methodVisitor.visitLabel(label);
    }

    private void _processValue(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, Label label) {
        Label label2 = new Label();
        Class<?> cls = fieldInfo.fieldClass;
        if (cls.isPrimitive()) {
            Label label3 = new Label();
            methodVisitor.visitVarInsn(21, context.var("checkValue"));
            methodVisitor.visitJumpInsn(154, label3);
            methodVisitor.visitInsn(1);
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
            methodVisitor.visitVarInsn(58, Context.processValue);
            methodVisitor.visitJumpInsn(167, label2);
            methodVisitor.visitLabel(label3);
        }
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitLdcInsn(Integer.valueOf(context.getFieldOrinal(fieldInfo.name)));
        String str = JavaBeanSerializer;
        methodVisitor.visitMethodInsn(182, str, "getBeanContext", "(I)" + ASMUtils.desc((Class<?>) BeanContext.class));
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitVarInsn(25, Context.fieldName);
        if (cls == Byte.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.BYTE));
            methodVisitor.visitMethodInsn(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Short.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.SHORT));
            methodVisitor.visitMethodInsn(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Integer.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.INT));
            methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Character.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.CHAR));
            methodVisitor.visitMethodInsn(184, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Long.TYPE) {
            methodVisitor.visitVarInsn(22, context.var(Constants.LONG, 2));
            methodVisitor.visitMethodInsn(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Float.TYPE) {
            methodVisitor.visitVarInsn(23, context.var(Constants.FLOAT));
            methodVisitor.visitMethodInsn(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Double.TYPE) {
            methodVisitor.visitVarInsn(24, context.var(Constants.DOUBLE, 2));
            methodVisitor.visitMethodInsn(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Boolean.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(Constants.BOOLEAN));
            methodVisitor.visitMethodInsn(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == BigDecimal.class) {
            methodVisitor.visitVarInsn(25, context.var("decimal"));
            methodVisitor.visitVarInsn(58, Context.original);
            methodVisitor.visitVarInsn(25, Context.original);
        } else if (cls == String.class) {
            methodVisitor.visitVarInsn(25, context.var("string"));
            methodVisitor.visitVarInsn(58, Context.original);
            methodVisitor.visitVarInsn(25, Context.original);
        } else if (cls.isEnum()) {
            methodVisitor.visitVarInsn(25, context.var("enum"));
            methodVisitor.visitVarInsn(58, Context.original);
            methodVisitor.visitVarInsn(25, Context.original);
        } else if (List.class.isAssignableFrom(cls)) {
            methodVisitor.visitVarInsn(25, context.var("list"));
            methodVisitor.visitVarInsn(58, Context.original);
            methodVisitor.visitVarInsn(25, Context.original);
        } else {
            methodVisitor.visitVarInsn(25, context.var("object"));
            methodVisitor.visitVarInsn(58, Context.original);
            methodVisitor.visitVarInsn(25, Context.original);
        }
        methodVisitor.visitMethodInsn(182, str, "processValue", "(L" + JSONSerializer + Constants.PACKNAME_END + ASMUtils.desc((Class<?>) BeanContext.class) + "Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;Ljava/lang/Integer;");
        methodVisitor.visitVarInsn(58, Context.processValue);
        methodVisitor.visitVarInsn(25, Context.original);
        methodVisitor.visitVarInsn(25, Context.processValue);
        methodVisitor.visitJumpInsn(165, label2);
        _writeObject(methodVisitor, fieldInfo, context, label);
        methodVisitor.visitJumpInsn(167, label);
        methodVisitor.visitLabel(label2);
    }

    private void _seperator(MethodVisitor methodVisitor, Context context) {
        methodVisitor.visitVarInsn(16, 44);
        methodVisitor.visitVarInsn(54, context.var("seperator"));
    }

    private void _string(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        if (fieldInfo.name.equals(context.beanInfo.typeKey)) {
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, 4);
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitMethodInsn(182, JSONSerializer, "isWriteClassName", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z");
            methodVisitor.visitJumpInsn(154, label);
        }
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(58, context.var("string"));
        _filters(methodVisitor, fieldInfo, context, label);
        Label label2 = new Label();
        Label label3 = new Label();
        methodVisitor.visitVarInsn(25, context.var("string"));
        methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label2);
        _if_write_null(methodVisitor, fieldInfo, context);
        methodVisitor.visitJumpInsn(167, label3);
        methodVisitor.visitLabel(label2);
        if ("trim".equals(fieldInfo.format)) {
            methodVisitor.visitVarInsn(25, context.var("string"));
            methodVisitor.visitMethodInsn(182, "java/lang/String", "trim", "()Ljava/lang/String;");
            methodVisitor.visitVarInsn(58, context.var("string"));
        }
        if (context.writeDirect) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(21, context.var("seperator"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitVarInsn(25, context.var("string"));
            methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldValueStringWithDoubleQuoteCheck", "(CLjava/lang/String;Ljava/lang/String;)V");
        } else {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(21, context.var("seperator"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitVarInsn(25, context.var("string"));
            methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;Ljava/lang/String;)V");
        }
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label3);
        methodVisitor.visitLabel(label);
    }

    private void _writeFieldName(MethodVisitor methodVisitor, Context context) {
        if (context.writeDirect) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldNameDirect", "(Ljava/lang/String;)V");
        } else {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitInsn(3);
            methodVisitor.visitMethodInsn(182, SerializeWriter, "writeFieldName", "(Ljava/lang/String;Z)V");
        }
    }

    private void _writeObject(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, Label label) {
        Label label2;
        Label label3;
        String str;
        String format = fieldInfo.getFormat();
        Class<?> cls = fieldInfo.fieldClass;
        Label label4 = new Label();
        if (context.writeDirect) {
            methodVisitor.visitVarInsn(25, context.var("object"));
        } else {
            methodVisitor.visitVarInsn(25, Context.processValue);
        }
        methodVisitor.visitInsn(89);
        methodVisitor.visitVarInsn(58, context.var("object"));
        methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label4);
        _if_write_null(methodVisitor, fieldInfo, context);
        methodVisitor.visitJumpInsn(167, label);
        methodVisitor.visitLabel(label4);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitMethodInsn(182, SerializeWriter, "write", "(I)V");
        _writeFieldName(methodVisitor, context);
        Label label5 = new Label();
        Label label6 = new Label();
        if (!Modifier.isPublic(cls.getModifiers()) || ParserConfig.isPrimitive2(cls)) {
            label2 = label5;
            label3 = label6;
        } else {
            methodVisitor.visitVarInsn(25, context.var("object"));
            methodVisitor.visitMethodInsn(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
            methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls)));
            methodVisitor.visitJumpInsn(166, label6);
            _getFieldSer(context, methodVisitor, fieldInfo);
            methodVisitor.visitVarInsn(58, context.var("fied_ser"));
            Label label7 = new Label();
            Label label8 = new Label();
            methodVisitor.visitVarInsn(25, context.var("fied_ser"));
            String str2 = JavaBeanSerializer;
            methodVisitor.visitTypeInsn(193, str2);
            methodVisitor.visitJumpInsn(153, label7);
            int i = fieldInfo.serialzeFeatures;
            boolean z = (i & SerializerFeature.DisableCircularReferenceDetect.mask) != 0;
            boolean z2 = (i & SerializerFeature.BeanToArray.mask) != 0;
            if (z || (context.nonContext && context.writeDirect)) {
                str = z2 ? "writeAsArrayNonContext" : "writeDirectNonContext";
            } else {
                str = z2 ? "writeAsArray" : "write";
            }
            methodVisitor.visitVarInsn(25, context.var("fied_ser"));
            methodVisitor.visitTypeInsn(192, str2);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, context.var("object"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_fieldType", "Ljava/lang/reflect/Type;");
            methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
            StringBuilder sb = new StringBuilder("(L");
            String str3 = JSONSerializer;
            sb.append(str3);
            sb.append(";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            methodVisitor.visitMethodInsn(182, str2, str, sb.toString());
            methodVisitor.visitJumpInsn(167, label8);
            methodVisitor.visitLabel(label7);
            methodVisitor.visitVarInsn(25, context.var("fied_ser"));
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, context.var("object"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_fieldType", "Ljava/lang/reflect/Type;");
            methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
            methodVisitor.visitMethodInsn(185, ObjectSerializer, "write", "(L" + str3 + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            methodVisitor.visitLabel(label8);
            label2 = label5;
            methodVisitor.visitJumpInsn(167, label2);
            label3 = label6;
        }
        methodVisitor.visitLabel(label3);
        methodVisitor.visitVarInsn(25, 1);
        if (context.writeDirect) {
            methodVisitor.visitVarInsn(25, context.var("object"));
        } else {
            methodVisitor.visitVarInsn(25, Context.processValue);
        }
        if (format != 0) {
            methodVisitor.visitLdcInsn(format);
            methodVisitor.visitMethodInsn(182, JSONSerializer, "writeWithFormat", "(Ljava/lang/Object;Ljava/lang/String;)V");
        } else {
            methodVisitor.visitVarInsn(25, Context.fieldName);
            java.lang.reflect.Type type = fieldInfo.fieldType;
            if ((type instanceof Class) && ((Class) type).isPrimitive()) {
                methodVisitor.visitMethodInsn(182, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;)V");
            } else {
                if (fieldInfo.fieldClass == String.class) {
                    methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc((Class<?>) String.class)));
                } else {
                    methodVisitor.visitVarInsn(25, 0);
                    methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_fieldType", "Ljava/lang/reflect/Type;");
                }
                methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
                methodVisitor.visitMethodInsn(182, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            }
        }
        methodVisitor.visitLabel(label2);
        _seperator(methodVisitor, context);
    }

    private void generateWriteAsArray(Class<?> cls, MethodVisitor methodVisitor, FieldInfo[] fieldInfoArr, Context context) throws Exception {
        int i;
        int i2;
        String str;
        int i3;
        char c;
        String str2;
        String str3;
        char c2;
        int i4;
        Class<?> cls2;
        Label label;
        String str4;
        FieldInfo fieldInfo;
        String str5;
        int i5;
        int i6;
        String str6;
        ASMSerializerFactory aSMSerializerFactory = this;
        FieldInfo[] fieldInfoArr2 = fieldInfoArr;
        Label label2 = new Label();
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 0);
        String str7 = JSONSerializer;
        methodVisitor.visitMethodInsn(182, str7, "hasPropertyFilters", "(" + SerializeFilterable_desc + ")Z");
        methodVisitor.visitJumpInsn(154, label2);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitVarInsn(25, 3);
        methodVisitor.visitVarInsn(25, 4);
        methodVisitor.visitVarInsn(21, 5);
        String str8 = JavaBeanSerializer;
        String str9 = "(L";
        StringBuilder sb = new StringBuilder("(L");
        sb.append(str7);
        String str10 = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
        sb.append(";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
        int i7 = 0;
        methodVisitor.visitMethodInsn(183, str8, "writeNoneASM", sb.toString());
        methodVisitor.visitInsn(177);
        methodVisitor.visitLabel(label2);
        String str11 = "out";
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(16, 91);
        String str12 = SerializeWriter;
        String str13 = "write";
        String str14 = "(I)V";
        methodVisitor.visitMethodInsn(182, str12, "write", "(I)V");
        int length = fieldInfoArr2.length;
        if (length == 0) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(16, 93);
            methodVisitor.visitMethodInsn(182, str12, "write", "(I)V");
            return;
        }
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 == length + (-1) ? 93 : 44;
            FieldInfo fieldInfo2 = fieldInfoArr2[i8];
            Class<?> cls3 = fieldInfo2.fieldClass;
            methodVisitor.visitLdcInsn(fieldInfo2.name);
            methodVisitor.visitVarInsn(58, Context.fieldName);
            if (cls3 == Byte.TYPE || cls3 == Short.TYPE || cls3 == Integer.TYPE) {
                i = i7;
                str11 = str11;
                i2 = length;
                i8 = i8;
                str = str9;
                i3 = 182;
                c = 25;
                int i10 = i9;
                str2 = str14;
                str3 = str13;
                methodVisitor.visitVarInsn(25, context.var(str11));
                methodVisitor.visitInsn(89);
                aSMSerializerFactory = this;
                aSMSerializerFactory._get(methodVisitor, context, fieldInfo2);
                String str15 = SerializeWriter;
                methodVisitor.visitMethodInsn(182, str15, "writeInt", str2);
                c2 = 16;
                methodVisitor.visitVarInsn(16, i10);
                methodVisitor.visitMethodInsn(182, str15, str3, str2);
            } else {
                if (cls3 == Long.TYPE) {
                    methodVisitor.visitVarInsn(25, context.var(str11));
                    methodVisitor.visitInsn(89);
                    aSMSerializerFactory._get(methodVisitor, context, fieldInfo2);
                    String str16 = SerializeWriter;
                    i3 = 182;
                    methodVisitor.visitMethodInsn(182, str16, "writeLong", "(J)V");
                    methodVisitor.visitVarInsn(16, i9);
                    methodVisitor.visitMethodInsn(182, str16, str13, str14);
                } else if (cls3 == Float.TYPE) {
                    methodVisitor.visitVarInsn(25, context.var(str11));
                    methodVisitor.visitInsn(89);
                    aSMSerializerFactory._get(methodVisitor, context, fieldInfo2);
                    methodVisitor.visitInsn(4);
                    String str17 = SerializeWriter;
                    i3 = 182;
                    methodVisitor.visitMethodInsn(182, str17, "writeFloat", "(FZ)V");
                    methodVisitor.visitVarInsn(16, i9);
                    methodVisitor.visitMethodInsn(182, str17, str13, str14);
                } else {
                    if (cls3 == Double.TYPE) {
                        methodVisitor.visitVarInsn(25, context.var(str11));
                        methodVisitor.visitInsn(89);
                        aSMSerializerFactory._get(methodVisitor, context, fieldInfo2);
                        methodVisitor.visitInsn(4);
                        String str18 = SerializeWriter;
                        i4 = 182;
                        methodVisitor.visitMethodInsn(182, str18, "writeDouble", "(DZ)V");
                        methodVisitor.visitVarInsn(16, i9);
                        methodVisitor.visitMethodInsn(182, str18, str13, str14);
                        i2 = length;
                    } else if (cls3 == Boolean.TYPE) {
                        methodVisitor.visitVarInsn(25, context.var(str11));
                        methodVisitor.visitInsn(89);
                        aSMSerializerFactory._get(methodVisitor, context, fieldInfo2);
                        String str19 = SerializeWriter;
                        i3 = 182;
                        methodVisitor.visitMethodInsn(182, str19, str13, "(Z)V");
                        methodVisitor.visitVarInsn(16, i9);
                        methodVisitor.visitMethodInsn(182, str19, str13, str14);
                    } else {
                        i2 = length;
                        if (cls3 == Character.TYPE) {
                            methodVisitor.visitVarInsn(25, context.var(str11));
                            aSMSerializerFactory._get(methodVisitor, context, fieldInfo2);
                            methodVisitor.visitMethodInsn(184, "java/lang/Character", "toString", "(C)Ljava/lang/String;");
                            c2 = 16;
                            methodVisitor.visitVarInsn(16, i9);
                            methodVisitor.visitMethodInsn(182, SerializeWriter, "writeString", "(Ljava/lang/String;C)V");
                            aSMSerializerFactory = aSMSerializerFactory;
                            str11 = str11;
                            i3 = 182;
                            i8 = i8;
                            str2 = str14;
                            str3 = str13;
                            str = str9;
                            c = 25;
                            i = i7;
                        } else if (cls3 == String.class) {
                            methodVisitor.visitVarInsn(25, context.var(str11));
                            aSMSerializerFactory._get(methodVisitor, context, fieldInfo2);
                            methodVisitor.visitVarInsn(16, i9);
                            methodVisitor.visitMethodInsn(182, SerializeWriter, "writeString", "(Ljava/lang/String;C)V");
                            aSMSerializerFactory = aSMSerializerFactory;
                            str11 = str11;
                            i3 = 182;
                            i8 = i8;
                            str2 = str14;
                            str3 = str13;
                            str = str9;
                            c2 = 16;
                            i = i7;
                            c = 25;
                        } else {
                            i4 = 182;
                            if (cls3.isEnum()) {
                                methodVisitor.visitVarInsn(25, context.var(str11));
                                methodVisitor.visitInsn(89);
                                aSMSerializerFactory._get(methodVisitor, context, fieldInfo2);
                                String str20 = SerializeWriter;
                                methodVisitor.visitMethodInsn(182, str20, "writeEnum", "(Ljava/lang/Enum;)V");
                                methodVisitor.visitVarInsn(16, i9);
                                methodVisitor.visitMethodInsn(182, str20, str13, str14);
                            } else if (List.class.isAssignableFrom(cls3)) {
                                java.lang.reflect.Type type = fieldInfo2.fieldType;
                                java.lang.reflect.Type type2 = type instanceof Class ? Object.class : ((ParameterizedType) type).getActualTypeArguments()[i7];
                                int i11 = i9;
                                if (!(type2 instanceof Class) || (cls2 = (Class) type2) == Object.class) {
                                    cls2 = null;
                                }
                                aSMSerializerFactory._get(methodVisitor, context, fieldInfo2);
                                java.lang.reflect.Type type3 = type2;
                                methodVisitor.visitTypeInsn(192, "java/util/List");
                                String str21 = str10;
                                methodVisitor.visitVarInsn(58, context.var("list"));
                                if (cls2 == String.class && context.writeDirect) {
                                    methodVisitor.visitVarInsn(25, context.var(str11));
                                    methodVisitor.visitVarInsn(25, context.var("list"));
                                    i3 = 182;
                                    methodVisitor.visitMethodInsn(182, SerializeWriter, str13, "(Ljava/util/List;)V");
                                    str5 = str11;
                                    str2 = str14;
                                    str3 = str13;
                                    str4 = str9;
                                    str10 = str21;
                                    i6 = 16;
                                    i5 = 25;
                                } else {
                                    Label label3 = new Label();
                                    Label label4 = new Label();
                                    String str22 = str9;
                                    methodVisitor.visitVarInsn(25, context.var("list"));
                                    methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label4);
                                    methodVisitor.visitVarInsn(25, context.var(str11));
                                    String str23 = SerializeWriter;
                                    methodVisitor.visitMethodInsn(182, str23, "writeNull", "()V");
                                    methodVisitor.visitJumpInsn(167, label3);
                                    methodVisitor.visitLabel(label4);
                                    methodVisitor.visitVarInsn(25, context.var("list"));
                                    methodVisitor.visitMethodInsn(185, "java/util/List", "size", "()I");
                                    methodVisitor.visitVarInsn(54, context.var("size"));
                                    methodVisitor.visitVarInsn(25, context.var(str11));
                                    methodVisitor.visitVarInsn(16, 91);
                                    methodVisitor.visitMethodInsn(182, str23, str13, str14);
                                    Label label5 = new Label();
                                    Label label6 = new Label();
                                    Label label7 = new Label();
                                    Class<?> cls4 = cls2;
                                    methodVisitor.visitInsn(3);
                                    methodVisitor.visitVarInsn(54, context.var(RXScreenCaptureService.KEY_INDEX));
                                    methodVisitor.visitLabel(label5);
                                    methodVisitor.visitVarInsn(21, context.var(RXScreenCaptureService.KEY_INDEX));
                                    methodVisitor.visitVarInsn(21, context.var("size"));
                                    methodVisitor.visitJumpInsn(162, label7);
                                    methodVisitor.visitVarInsn(21, context.var(RXScreenCaptureService.KEY_INDEX));
                                    methodVisitor.visitJumpInsn(153, label6);
                                    methodVisitor.visitVarInsn(25, context.var(str11));
                                    methodVisitor.visitVarInsn(16, 44);
                                    methodVisitor.visitMethodInsn(182, str23, str13, str14);
                                    methodVisitor.visitLabel(label6);
                                    methodVisitor.visitVarInsn(25, context.var("list"));
                                    methodVisitor.visitVarInsn(21, context.var(RXScreenCaptureService.KEY_INDEX));
                                    methodVisitor.visitMethodInsn(185, "java/util/List", "get", "(I)Ljava/lang/Object;");
                                    methodVisitor.visitVarInsn(58, context.var("list_item"));
                                    Label label8 = new Label();
                                    Label label9 = new Label();
                                    methodVisitor.visitVarInsn(25, context.var("list_item"));
                                    methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label9);
                                    methodVisitor.visitVarInsn(25, context.var(str11));
                                    methodVisitor.visitMethodInsn(182, str23, "writeNull", "()V");
                                    methodVisitor.visitJumpInsn(167, label8);
                                    methodVisitor.visitLabel(label9);
                                    Label label10 = new Label();
                                    Label label11 = new Label();
                                    if (cls4 == null || !Modifier.isPublic(cls4.getModifiers())) {
                                        label5 = label5;
                                        label = label10;
                                        label11 = label11;
                                        str3 = str13;
                                        str10 = str21;
                                        str4 = str22;
                                        fieldInfo = fieldInfo2;
                                        label8 = label8;
                                    } else {
                                        methodVisitor.visitVarInsn(25, context.var("list_item"));
                                        methodVisitor.visitMethodInsn(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                                        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls4)));
                                        methodVisitor.visitJumpInsn(166, label11);
                                        fieldInfo = fieldInfo2;
                                        _getListFieldItemSer(context, methodVisitor, fieldInfo, cls4);
                                        methodVisitor.visitVarInsn(58, context.var("list_item_desc"));
                                        Label label12 = new Label();
                                        Label label13 = new Label();
                                        if (context.writeDirect) {
                                            methodVisitor.visitVarInsn(25, context.var("list_item_desc"));
                                            String str24 = JavaBeanSerializer;
                                            methodVisitor.visitTypeInsn(193, str24);
                                            methodVisitor.visitJumpInsn(153, label12);
                                            methodVisitor.visitVarInsn(25, context.var("list_item_desc"));
                                            methodVisitor.visitTypeInsn(192, str24);
                                            methodVisitor.visitVarInsn(25, 1);
                                            methodVisitor.visitVarInsn(25, context.var("list_item"));
                                            if (context.nonContext) {
                                                methodVisitor.visitInsn(1);
                                            } else {
                                                methodVisitor.visitVarInsn(21, context.var(RXScreenCaptureService.KEY_INDEX));
                                                methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                            }
                                            methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls4)));
                                            methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
                                            str4 = str22;
                                            str6 = str21;
                                            methodVisitor.visitMethodInsn(182, str24, "writeAsArrayNonContext", str4 + JSONSerializer + str21);
                                            methodVisitor.visitJumpInsn(167, label13);
                                            methodVisitor.visitLabel(label12);
                                        } else {
                                            str4 = str22;
                                            str6 = str21;
                                        }
                                        methodVisitor.visitVarInsn(25, context.var("list_item_desc"));
                                        methodVisitor.visitVarInsn(25, 1);
                                        methodVisitor.visitVarInsn(25, context.var("list_item"));
                                        if (context.nonContext) {
                                            methodVisitor.visitInsn(1);
                                        } else {
                                            methodVisitor.visitVarInsn(21, context.var(RXScreenCaptureService.KEY_INDEX));
                                            methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                        }
                                        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls4)));
                                        methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
                                        String str25 = ObjectSerializer;
                                        StringBuilder sb2 = new StringBuilder(str4);
                                        sb2.append(JSONSerializer);
                                        str10 = str6;
                                        sb2.append(str10);
                                        str3 = str13;
                                        methodVisitor.visitMethodInsn(185, str25, str3, sb2.toString());
                                        methodVisitor.visitLabel(label13);
                                        label = label10;
                                        methodVisitor.visitJumpInsn(167, label);
                                    }
                                    methodVisitor.visitLabel(label11);
                                    methodVisitor.visitVarInsn(25, 1);
                                    methodVisitor.visitVarInsn(25, context.var("list_item"));
                                    if (context.nonContext) {
                                        methodVisitor.visitInsn(1);
                                    } else {
                                        methodVisitor.visitVarInsn(21, context.var(RXScreenCaptureService.KEY_INDEX));
                                        methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                    }
                                    if (cls4 == null || !Modifier.isPublic(cls4.getModifiers())) {
                                        i3 = 182;
                                        methodVisitor.visitMethodInsn(182, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;)V");
                                    } else {
                                        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc((Class<?>) type3)));
                                        methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
                                        i3 = 182;
                                        methodVisitor.visitMethodInsn(182, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                                    }
                                    methodVisitor.visitLabel(label);
                                    methodVisitor.visitLabel(label8);
                                    methodVisitor.visitIincInsn(context.var(RXScreenCaptureService.KEY_INDEX), 1);
                                    methodVisitor.visitJumpInsn(167, label5);
                                    methodVisitor.visitLabel(label7);
                                    str5 = str11;
                                    i5 = 25;
                                    methodVisitor.visitVarInsn(25, context.var(str5));
                                    i6 = 16;
                                    methodVisitor.visitVarInsn(16, 93);
                                    str2 = str14;
                                    methodVisitor.visitMethodInsn(i3, str23, str3, str2);
                                    methodVisitor.visitLabel(label3);
                                }
                                methodVisitor.visitVarInsn(i5, context.var(str5));
                                methodVisitor.visitVarInsn(i6, i11);
                                methodVisitor.visitMethodInsn(i3, SerializeWriter, str3, str2);
                                aSMSerializerFactory = this;
                                str11 = str5;
                                str = str4;
                                c2 = 16;
                                c = 25;
                                i = i7;
                            } else {
                                String str26 = str11;
                                int i12 = i9;
                                i8 = i8;
                                String str27 = str14;
                                str3 = str13;
                                str = str9;
                                Label label14 = new Label();
                                Label label15 = new Label();
                                _get(methodVisitor, context, fieldInfo2);
                                methodVisitor.visitInsn(89);
                                methodVisitor.visitVarInsn(58, context.var("field_".concat(fieldInfo2.fieldClass.getName())));
                                methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label15);
                                methodVisitor.visitVarInsn(25, context.var(str26));
                                String str28 = SerializeWriter;
                                methodVisitor.visitMethodInsn(182, str28, "writeNull", "()V");
                                methodVisitor.visitJumpInsn(167, label14);
                                methodVisitor.visitLabel(label15);
                                Label label16 = new Label();
                                Label label17 = new Label();
                                methodVisitor.visitVarInsn(25, context.var("field_".concat(fieldInfo2.fieldClass.getName())));
                                methodVisitor.visitMethodInsn(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                                methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls3)));
                                methodVisitor.visitJumpInsn(166, label17);
                                _getFieldSer(context, methodVisitor, fieldInfo2);
                                methodVisitor.visitVarInsn(58, context.var("fied_ser"));
                                Label label18 = new Label();
                                Label label19 = new Label();
                                if (context.writeDirect && Modifier.isPublic(cls3.getModifiers())) {
                                    methodVisitor.visitVarInsn(25, context.var("fied_ser"));
                                    String str29 = JavaBeanSerializer;
                                    methodVisitor.visitTypeInsn(193, str29);
                                    methodVisitor.visitJumpInsn(153, label18);
                                    methodVisitor.visitVarInsn(25, context.var("fied_ser"));
                                    methodVisitor.visitTypeInsn(192, str29);
                                    methodVisitor.visitVarInsn(25, 1);
                                    methodVisitor.visitVarInsn(25, context.var("field_".concat(fieldInfo2.fieldClass.getName())));
                                    methodVisitor.visitVarInsn(25, Context.fieldName);
                                    methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls3)));
                                    methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo2.serialzeFeatures));
                                    methodVisitor.visitMethodInsn(182, str29, "writeAsArrayNonContext", str + JSONSerializer + str10);
                                    methodVisitor.visitJumpInsn(167, label19);
                                    methodVisitor.visitLabel(label18);
                                }
                                methodVisitor.visitVarInsn(25, context.var("fied_ser"));
                                methodVisitor.visitVarInsn(25, 1);
                                methodVisitor.visitVarInsn(25, context.var("field_".concat(fieldInfo2.fieldClass.getName())));
                                methodVisitor.visitVarInsn(25, Context.fieldName);
                                methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls3)));
                                methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo2.serialzeFeatures));
                                String str30 = ObjectSerializer;
                                StringBuilder sb3 = new StringBuilder(str);
                                String str31 = JSONSerializer;
                                sb3.append(str31);
                                sb3.append(str10);
                                methodVisitor.visitMethodInsn(185, str30, str3, sb3.toString());
                                methodVisitor.visitLabel(label19);
                                methodVisitor.visitJumpInsn(167, label16);
                                methodVisitor.visitLabel(label17);
                                String format = fieldInfo2.getFormat();
                                methodVisitor.visitVarInsn(25, 1);
                                methodVisitor.visitVarInsn(25, context.var("field_".concat(fieldInfo2.fieldClass.getName())));
                                if (format != null) {
                                    methodVisitor.visitLdcInsn(format);
                                    i3 = 182;
                                    methodVisitor.visitMethodInsn(182, str31, "writeWithFormat", "(Ljava/lang/Object;Ljava/lang/String;)V");
                                } else {
                                    i3 = 182;
                                    methodVisitor.visitVarInsn(25, Context.fieldName);
                                    java.lang.reflect.Type type4 = fieldInfo2.fieldType;
                                    if ((type4 instanceof Class) && ((Class) type4).isPrimitive()) {
                                        methodVisitor.visitMethodInsn(182, str31, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;)V");
                                    } else {
                                        i = i7;
                                        methodVisitor.visitVarInsn(25, i);
                                        methodVisitor.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_fieldType", "Ljava/lang/reflect/Type;");
                                        methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo2.serialzeFeatures));
                                        i3 = 182;
                                        methodVisitor.visitMethodInsn(182, str31, r6, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                                    }
                                    methodVisitor.visitLabel(label16);
                                    methodVisitor.visitLabel(label14);
                                    str11 = str26;
                                    c = 25;
                                    methodVisitor.visitVarInsn(25, context.var(str11));
                                    methodVisitor.visitVarInsn(16, i12);
                                    str2 = str27;
                                    methodVisitor.visitMethodInsn(i3, str28, str3, str2);
                                    aSMSerializerFactory = this;
                                    c2 = 16;
                                }
                                i = i7;
                                methodVisitor.visitLabel(label16);
                                methodVisitor.visitLabel(label14);
                                str11 = str26;
                                c = 25;
                                methodVisitor.visitVarInsn(25, context.var(str11));
                                methodVisitor.visitVarInsn(16, i12);
                                str2 = str27;
                                methodVisitor.visitMethodInsn(i3, str28, str3, str2);
                                aSMSerializerFactory = this;
                                c2 = 16;
                            }
                        }
                    }
                    i3 = i4;
                    str2 = str14;
                    str3 = str13;
                    str = str9;
                    c2 = 16;
                    c = 25;
                    i = i7;
                }
                aSMSerializerFactory = aSMSerializerFactory;
                str11 = str11;
                i2 = length;
                str2 = str14;
                str3 = str13;
                str = str9;
                c2 = 16;
                c = 25;
                i = i7;
            }
            i7 = i;
            aSMSerializerFactory = aSMSerializerFactory;
            str13 = str3;
            length = i2;
            str14 = str2;
            str9 = str;
            i8++;
            str11 = str11;
            fieldInfoArr2 = fieldInfoArr;
        }
    }

    private void generateWriteMethod(Class<?> cls, MethodVisitor methodVisitor, FieldInfo[] fieldInfoArr, Context context) throws Exception {
        int i;
        int i2;
        int i3;
        int i4;
        ASMSerializerFactory aSMSerializerFactory = this;
        MethodVisitor methodVisitor2 = methodVisitor;
        Label label = new Label();
        int length = fieldInfoArr.length;
        if (!context.writeDirect) {
            Label label2 = new Label();
            Label label3 = new Label();
            methodVisitor2.visitVarInsn(25, context.var("out"));
            methodVisitor2.visitLdcInsn(Integer.valueOf(SerializerFeature.PrettyFormat.mask));
            methodVisitor2.visitMethodInsn(182, SerializeWriter, "isEnabled", "(I)Z");
            methodVisitor2.visitJumpInsn(154, label3);
            boolean z = false;
            for (FieldInfo fieldInfo : fieldInfoArr) {
                if (fieldInfo.method != null) {
                    z = true;
                }
            }
            if (z) {
                methodVisitor2.visitVarInsn(25, context.var("out"));
                methodVisitor2.visitLdcInsn(Integer.valueOf(SerializerFeature.IgnoreErrorGetter.mask));
                methodVisitor2.visitMethodInsn(182, SerializeWriter, "isEnabled", "(I)Z");
                methodVisitor2.visitJumpInsn(153, label2);
            } else {
                methodVisitor2.visitJumpInsn(167, label2);
            }
            methodVisitor2.visitLabel(label3);
            methodVisitor2.visitVarInsn(25, 0);
            methodVisitor2.visitVarInsn(25, 1);
            methodVisitor2.visitVarInsn(25, 2);
            methodVisitor2.visitVarInsn(25, 3);
            methodVisitor2.visitVarInsn(25, 4);
            methodVisitor2.visitVarInsn(21, 5);
            methodVisitor2.visitMethodInsn(183, JavaBeanSerializer, "write", "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            methodVisitor2.visitInsn(177);
            methodVisitor2.visitLabel(label2);
        }
        if (!context.nonContext) {
            Label label4 = new Label();
            methodVisitor2.visitVarInsn(25, 0);
            methodVisitor2.visitVarInsn(25, 1);
            methodVisitor2.visitVarInsn(25, 2);
            methodVisitor2.visitVarInsn(21, 5);
            methodVisitor2.visitMethodInsn(182, JavaBeanSerializer, "writeReference", "(L" + JSONSerializer + ";Ljava/lang/Object;I)Z");
            methodVisitor2.visitJumpInsn(153, label4);
            methodVisitor2.visitInsn(177);
            methodVisitor2.visitLabel(label4);
        }
        String str = context.writeDirect ? context.nonContext ? "writeAsArrayNonContext" : "writeAsArray" : "writeAsArrayNormal";
        int i5 = context.beanInfo.features;
        SerializerFeature serializerFeature = SerializerFeature.BeanToArray;
        if ((i5 & serializerFeature.mask) == 0) {
            Label label5 = new Label();
            methodVisitor2.visitVarInsn(25, context.var("out"));
            methodVisitor2.visitLdcInsn(Integer.valueOf(serializerFeature.mask));
            methodVisitor2.visitMethodInsn(182, SerializeWriter, "isEnabled", "(I)Z");
            methodVisitor2.visitJumpInsn(153, label5);
            methodVisitor2.visitVarInsn(25, 0);
            methodVisitor2.visitVarInsn(25, 1);
            methodVisitor2.visitVarInsn(25, 2);
            methodVisitor2.visitVarInsn(25, 3);
            methodVisitor2.visitVarInsn(25, 4);
            methodVisitor2.visitVarInsn(21, 5);
            methodVisitor2.visitMethodInsn(182, context.className, str, "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            methodVisitor2.visitInsn(177);
            methodVisitor2.visitLabel(label5);
        } else {
            methodVisitor2.visitVarInsn(25, 0);
            methodVisitor2.visitVarInsn(25, 1);
            methodVisitor2.visitVarInsn(25, 2);
            methodVisitor2.visitVarInsn(25, 3);
            methodVisitor2.visitVarInsn(25, 4);
            methodVisitor2.visitVarInsn(21, 5);
            methodVisitor2.visitMethodInsn(182, context.className, str, "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            methodVisitor2.visitInsn(177);
        }
        String str2 = "parent";
        if (!context.nonContext) {
            methodVisitor2.visitVarInsn(25, 1);
            String str3 = JSONSerializer;
            StringBuilder sb = new StringBuilder("()");
            String str4 = SerialContext_desc;
            sb.append(str4);
            methodVisitor2.visitMethodInsn(182, str3, "getContext", sb.toString());
            methodVisitor2.visitVarInsn(58, context.var("parent"));
            methodVisitor2.visitVarInsn(25, 1);
            methodVisitor2.visitVarInsn(25, context.var("parent"));
            methodVisitor2.visitVarInsn(25, 2);
            methodVisitor2.visitVarInsn(25, 3);
            methodVisitor2.visitLdcInsn(Integer.valueOf(context.beanInfo.features));
            methodVisitor2.visitMethodInsn(182, str3, "setContext", "(" + str4 + "Ljava/lang/Object;Ljava/lang/Object;I)V");
        }
        boolean z2 = (context.beanInfo.features & SerializerFeature.WriteClassName.mask) != 0;
        if (z2 || !context.writeDirect) {
            Label label6 = new Label();
            Label label7 = new Label();
            Label label8 = new Label();
            if (z2) {
                i = 182;
            } else {
                methodVisitor2.visitVarInsn(25, 1);
                methodVisitor2.visitVarInsn(25, 4);
                methodVisitor2.visitVarInsn(25, 2);
                i = 182;
                methodVisitor2.visitMethodInsn(182, JSONSerializer, "isWriteClassName", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z");
                methodVisitor2.visitJumpInsn(153, label7);
            }
            methodVisitor2.visitVarInsn(25, 4);
            methodVisitor2.visitVarInsn(25, 2);
            methodVisitor2.visitMethodInsn(i, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
            methodVisitor2.visitJumpInsn(165, label7);
            methodVisitor2.visitLabel(label8);
            methodVisitor2.visitVarInsn(25, context.var("out"));
            methodVisitor2.visitVarInsn(16, 123);
            methodVisitor2.visitMethodInsn(i, SerializeWriter, "write", "(I)V");
            methodVisitor2.visitVarInsn(25, 0);
            methodVisitor2.visitVarInsn(25, 1);
            if (context.beanInfo.typeKey != null) {
                methodVisitor2.visitLdcInsn(context.beanInfo.typeKey);
            } else {
                methodVisitor2.visitInsn(1);
            }
            methodVisitor2.visitVarInsn(25, 2);
            methodVisitor2.visitMethodInsn(182, JavaBeanSerializer, "writeClassName", "(L" + JSONSerializer + ";Ljava/lang/String;Ljava/lang/Object;)V");
            methodVisitor2.visitVarInsn(16, 44);
            methodVisitor2.visitJumpInsn(167, label6);
            methodVisitor2.visitLabel(label7);
            methodVisitor2.visitVarInsn(16, 123);
            methodVisitor2.visitLabel(label6);
        } else {
            methodVisitor2.visitVarInsn(16, 123);
            str2 = "parent";
        }
        methodVisitor2.visitVarInsn(54, context.var("seperator"));
        if (!context.writeDirect) {
            aSMSerializerFactory._before(methodVisitor2, context);
        }
        if (context.writeDirect) {
            i2 = 0;
            i3 = 182;
        } else {
            methodVisitor2.visitVarInsn(25, context.var("out"));
            methodVisitor2.visitMethodInsn(182, SerializeWriter, "isNotWriteDefaultValue", "()Z");
            methodVisitor2.visitVarInsn(54, context.var("notWriteDefaultValue"));
            methodVisitor2.visitVarInsn(25, 1);
            methodVisitor2.visitVarInsn(25, 0);
            String str5 = JSONSerializer;
            StringBuilder sb2 = new StringBuilder("(");
            String str6 = SerializeFilterable_desc;
            sb2.append(str6);
            sb2.append(")Z");
            i3 = 182;
            methodVisitor2.visitMethodInsn(182, str5, "checkValue", sb2.toString());
            methodVisitor2.visitVarInsn(54, context.var("checkValue"));
            methodVisitor2.visitVarInsn(25, 1);
            i2 = 0;
            methodVisitor2.visitVarInsn(25, 0);
            methodVisitor2.visitMethodInsn(182, str5, "hasNameFilters", "(" + str6 + ")Z");
            methodVisitor2.visitVarInsn(54, context.var("hasNameFilters"));
        }
        int i6 = i2;
        while (i6 < length) {
            FieldInfo fieldInfo2 = fieldInfoArr[i6];
            Class<?> cls2 = fieldInfo2.fieldClass;
            methodVisitor2.visitLdcInsn(fieldInfo2.name);
            methodVisitor2.visitVarInsn(58, Context.fieldName);
            if (cls2 == Byte.TYPE || cls2 == Short.TYPE || cls2 == Integer.TYPE) {
                i4 = i3;
                aSMSerializerFactory._int(cls, methodVisitor2, fieldInfo2, context, context.var(cls2.getName()), 'I');
            } else {
                if (cls2 == Long.TYPE) {
                    aSMSerializerFactory._long(cls, methodVisitor2, fieldInfo2, context);
                } else if (cls2 == Float.TYPE) {
                    aSMSerializerFactory._float(cls, methodVisitor2, fieldInfo2, context);
                } else if (cls2 == Double.TYPE) {
                    aSMSerializerFactory._double(cls, methodVisitor2, fieldInfo2, context);
                } else if (cls2 == Boolean.TYPE) {
                    i4 = i3;
                    aSMSerializerFactory._int(cls, methodVisitor2, fieldInfo2, context, context.var(Constants.BOOLEAN), Matrix.MATRIX_TYPE_ZERO);
                    aSMSerializerFactory = this;
                    methodVisitor2 = methodVisitor;
                } else {
                    i4 = i3;
                    if (cls2 == Character.TYPE) {
                        aSMSerializerFactory = this;
                        methodVisitor2 = methodVisitor;
                        aSMSerializerFactory._int(cls, methodVisitor2, fieldInfo2, context, context.var(Constants.CHAR), 'C');
                    } else {
                        aSMSerializerFactory = this;
                        methodVisitor2 = methodVisitor;
                        if (cls2 == String.class) {
                            aSMSerializerFactory._string(cls, methodVisitor2, fieldInfo2, context);
                        } else if (cls2 == BigDecimal.class) {
                            aSMSerializerFactory._decimal(cls, methodVisitor2, fieldInfo2, context);
                        } else if (List.class.isAssignableFrom(cls2)) {
                            aSMSerializerFactory._list(cls, methodVisitor2, fieldInfo2, context);
                        } else if (cls2.isEnum()) {
                            aSMSerializerFactory._enum(cls, methodVisitor2, fieldInfo2, context);
                        } else {
                            aSMSerializerFactory._object(cls, methodVisitor2, fieldInfo2, context);
                        }
                    }
                }
                i4 = i3;
            }
            i6++;
            i3 = i4;
        }
        int i7 = i3;
        if (!context.writeDirect) {
            aSMSerializerFactory._after(methodVisitor2, context);
        }
        Label label9 = new Label();
        Label label10 = new Label();
        methodVisitor2.visitVarInsn(21, context.var("seperator"));
        methodVisitor2.visitIntInsn(16, 123);
        methodVisitor2.visitJumpInsn(160, label9);
        methodVisitor2.visitVarInsn(25, context.var("out"));
        methodVisitor2.visitVarInsn(16, 123);
        String str7 = SerializeWriter;
        methodVisitor2.visitMethodInsn(i7, str7, "write", "(I)V");
        methodVisitor2.visitLabel(label9);
        methodVisitor2.visitVarInsn(25, context.var("out"));
        methodVisitor2.visitVarInsn(16, 125);
        methodVisitor2.visitMethodInsn(i7, str7, "write", "(I)V");
        methodVisitor2.visitLabel(label10);
        methodVisitor2.visitLabel(label);
        if (context.nonContext) {
            return;
        }
        methodVisitor2.visitVarInsn(25, 1);
        methodVisitor2.visitVarInsn(25, context.var(str2));
        methodVisitor2.visitMethodInsn(i7, JSONSerializer, "setContext", "(" + SerialContext_desc + ")V");
    }

    public JavaBeanSerializer createJavaBeanSerializer(SerializeBeanInfo serializeBeanInfo) throws Exception {
        String str;
        boolean z;
        Class<SerializeBeanInfo> cls;
        String str2;
        boolean z2;
        boolean z3;
        String str3;
        boolean z4;
        boolean z5;
        char c;
        int i;
        int i2;
        char c2;
        Method method;
        ASMSerializerFactory aSMSerializerFactory = this;
        Class<?> cls2 = serializeBeanInfo.beanType;
        if (cls2.isPrimitive()) {
            qkq.m176968a("unsupportd class ".concat(cls2.getName()));
            return null;
        }
        JSONType jSONType = (JSONType) TypeUtils.getAnnotation(cls2, JSONType.class);
        FieldInfo[] fieldInfoArr = serializeBeanInfo.fields;
        for (FieldInfo fieldInfo : fieldInfoArr) {
            if (fieldInfo.field == null && (method = fieldInfo.method) != null && method.getDeclaringClass().isInterface()) {
                return new JavaBeanSerializer(serializeBeanInfo);
            }
        }
        FieldInfo[] fieldInfoArr2 = serializeBeanInfo.sortedFields;
        boolean z6 = fieldInfoArr2 == serializeBeanInfo.fields;
        if (fieldInfoArr2.length > 256) {
            return new JavaBeanSerializer(serializeBeanInfo);
        }
        for (FieldInfo fieldInfo2 : fieldInfoArr2) {
            if (!ASMUtils.checkName(fieldInfo2.getMember().getName())) {
                return new JavaBeanSerializer(serializeBeanInfo);
            }
        }
        String str4 = "ASMSerializer_" + aSMSerializerFactory.seed.incrementAndGet() + "_" + cls2.getSimpleName();
        Package r5 = ASMSerializerFactory.class.getPackage();
        if (r5 != null) {
            String name = r5.getName();
            String str5 = name.replace('.', '/') + "/" + str4;
            str4 = name + "." + str4;
            str = str5;
        } else {
            str = str4;
        }
        ASMSerializerFactory.class.getPackage().getName();
        ClassWriter classWriter = new ClassWriter();
        classWriter.visit(49, 33, str, JavaBeanSerializer, new String[]{ObjectSerializer});
        String str6 = str;
        int length = fieldInfoArr2.length;
        int i3 = 0;
        while (i3 < length) {
            FieldInfo fieldInfo3 = fieldInfoArr2[i3];
            String str7 = str4;
            if (!fieldInfo3.fieldClass.isPrimitive() && fieldInfo3.fieldClass != String.class) {
                new FieldWriter(classWriter, 1, fieldInfo3.name + "_asm_fieldType", "Ljava/lang/reflect/Type;").visitEnd();
                if (List.class.isAssignableFrom(fieldInfo3.fieldClass)) {
                    new FieldWriter(classWriter, 1, fieldInfo3.name + "_asm_list_item_ser_", ObjectSerializer_desc).visitEnd();
                }
                new FieldWriter(classWriter, 1, fieldInfo3.name + "_asm_ser_", ObjectSerializer_desc).visitEnd();
            }
            i3++;
            str4 = str7;
        }
        String str8 = str4;
        StringBuilder sb = new StringBuilder("(");
        Class<SerializeBeanInfo> cls3 = SerializeBeanInfo.class;
        sb.append(ASMUtils.desc(cls3));
        sb.append(")V");
        MethodWriter methodWriter = new MethodWriter(classWriter, 1, "<init>", sb.toString(), null, null);
        methodWriter.visitVarInsn(25, 0);
        methodWriter.visitVarInsn(25, 1);
        char c3 = 183;
        methodWriter.visitMethodInsn(183, JavaBeanSerializer, "<init>", "(" + ASMUtils.desc(cls3) + ")V");
        int i4 = 0;
        while (i4 < fieldInfoArr2.length) {
            FieldInfo fieldInfo4 = fieldInfoArr2[i4];
            if (fieldInfo4.fieldClass.isPrimitive() || fieldInfo4.fieldClass == String.class) {
                fieldInfoArr2 = fieldInfoArr2;
                i2 = i4;
                c2 = c3;
            } else {
                methodWriter.visitVarInsn(25, 0);
                if (fieldInfo4.method != null) {
                    methodWriter.visitLdcInsn(Type.getType(ASMUtils.desc(fieldInfo4.declaringClass)));
                    methodWriter.visitLdcInsn(fieldInfo4.method.getName());
                    i2 = i4;
                    methodWriter.visitMethodInsn(184, ASMUtils.type(ASMUtils.class), "getMethodType", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Type;");
                    c2 = 183;
                } else {
                    i2 = i4;
                    methodWriter.visitVarInsn(25, 0);
                    methodWriter.visitLdcInsn(Integer.valueOf(i2));
                    c2 = 183;
                    methodWriter.visitMethodInsn(183, JavaBeanSerializer, "getFieldType", "(I)Ljava/lang/reflect/Type;");
                }
                methodWriter.visitFieldInsn(181, str6, fieldInfo4.name + "_asm_fieldType", "Ljava/lang/reflect/Type;");
            }
            i4 = i2 + 1;
            c3 = c2;
            fieldInfoArr2 = fieldInfoArr2;
        }
        FieldInfo[] fieldInfoArr3 = fieldInfoArr2;
        methodWriter.visitInsn(177);
        methodWriter.visitMaxs(4, 4);
        methodWriter.visitEnd();
        if (jSONType == null) {
            z = false;
            break;
        }
        SerializerFeature[] serializerFeatureArrSerialzeFeatures = jSONType.serialzeFeatures();
        int length2 = serializerFeatureArrSerialzeFeatures.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length2) {
                z = false;
                break;
            }
            if (serializerFeatureArrSerialzeFeatures[i5] == SerializerFeature.DisableCircularReferenceDetect) {
                z = true;
                break;
            }
            i5++;
        }
        int i6 = 0;
        while (true) {
            JSONType jSONType2 = jSONType;
            cls = cls3;
            if (i6 >= 3) {
                break;
            }
            boolean z7 = z6;
            if (i6 == 0) {
                str3 = "write";
                z5 = z;
                z4 = true;
            } else if (i6 == 1) {
                str3 = "writeNormal";
                z5 = z;
                z4 = false;
            } else {
                str3 = "writeDirectNonContext";
                z4 = true;
                z5 = true;
            }
            boolean z8 = z;
            String str9 = str8;
            int i7 = i6;
            FieldInfo[] fieldInfoArr4 = fieldInfoArr3;
            Context context = new Context(fieldInfoArr4, serializeBeanInfo, str6, z4, z5);
            StringBuilder sb2 = new StringBuilder("(L");
            String str10 = JSONSerializer;
            sb2.append(str10);
            sb2.append(";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            MethodWriter methodWriter2 = new MethodWriter(classWriter, 1, str3, sb2.toString(), null, new String[]{"java/io/IOException"});
            Label label = new Label();
            boolean z9 = z5;
            FieldInfo[] fieldInfoArr5 = fieldInfoArr;
            methodWriter2.visitVarInsn(25, 2);
            methodWriter2.visitJumpInsn(Opcodes.IFNONNULL, label);
            methodWriter2.visitVarInsn(25, 1);
            methodWriter2.visitMethodInsn(182, str10, "writeNull", "()V");
            methodWriter2.visitInsn(177);
            methodWriter2.visitLabel(label);
            methodWriter2.visitVarInsn(25, 1);
            methodWriter2.visitFieldInsn(180, str10, "out", SerializeWriter_desc);
            methodWriter2.visitVarInsn(58, context.var("out"));
            if (!z7 && !context.writeDirect && (jSONType2 == null || jSONType2.alphabetic())) {
                Label label2 = new Label();
                methodWriter2.visitVarInsn(25, context.var("out"));
                methodWriter2.visitMethodInsn(182, SerializeWriter, "isSortField", "()Z");
                methodWriter2.visitJumpInsn(154, label2);
                methodWriter2.visitVarInsn(25, 0);
                methodWriter2.visitVarInsn(25, 1);
                methodWriter2.visitVarInsn(25, 2);
                methodWriter2.visitVarInsn(25, 3);
                methodWriter2.visitVarInsn(25, 4);
                methodWriter2.visitVarInsn(21, 5);
                methodWriter2.visitMethodInsn(182, str6, "writeUnsorted", "(L" + str10 + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                methodWriter2.visitInsn(177);
                methodWriter2.visitLabel(label2);
            }
            if (!context.writeDirect || z9) {
                c = 4;
                i = 177;
            } else {
                Label label3 = new Label();
                Label label4 = new Label();
                methodWriter2.visitVarInsn(25, 0);
                methodWriter2.visitVarInsn(25, 1);
                methodWriter2.visitMethodInsn(182, JavaBeanSerializer, "writeDirect", "(L" + str10 + ";)Z");
                methodWriter2.visitJumpInsn(154, label4);
                methodWriter2.visitVarInsn(25, 0);
                methodWriter2.visitVarInsn(25, 1);
                methodWriter2.visitVarInsn(25, 2);
                methodWriter2.visitVarInsn(25, 3);
                methodWriter2.visitVarInsn(25, 4);
                methodWriter2.visitVarInsn(21, 5);
                methodWriter2.visitMethodInsn(182, str6, "writeNormal", "(L" + str10 + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                methodWriter2.visitInsn(177);
                methodWriter2.visitLabel(label4);
                methodWriter2.visitVarInsn(25, context.var("out"));
                methodWriter2.visitLdcInsn(Integer.valueOf(SerializerFeature.DisableCircularReferenceDetect.mask));
                methodWriter2.visitMethodInsn(182, SerializeWriter, "isEnabled", "(I)Z");
                methodWriter2.visitJumpInsn(153, label3);
                methodWriter2.visitVarInsn(25, 0);
                methodWriter2.visitVarInsn(25, 1);
                methodWriter2.visitVarInsn(25, 2);
                methodWriter2.visitVarInsn(25, 3);
                c = 4;
                methodWriter2.visitVarInsn(25, 4);
                methodWriter2.visitVarInsn(21, 5);
                methodWriter2.visitMethodInsn(182, str6, "writeDirectNonContext", "(L" + str10 + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                i = 177;
                methodWriter2.visitInsn(177);
                methodWriter2.visitLabel(label3);
            }
            methodWriter2.visitVarInsn(25, 2);
            methodWriter2.visitTypeInsn(192, ASMUtils.type(cls2));
            methodWriter2.visitVarInsn(58, context.var("entity"));
            Class<?> cls4 = cls2;
            generateWriteMethod(cls4, methodWriter2, fieldInfoArr4, context);
            methodWriter2.visitInsn(i);
            methodWriter2.visitMaxs(7, context.variantIndex + 2);
            methodWriter2.visitEnd();
            i6 = i7 + 1;
            fieldInfoArr3 = fieldInfoArr4;
            aSMSerializerFactory = this;
            cls2 = cls4;
            jSONType = jSONType2;
            cls3 = cls;
            z6 = z7;
            z = z8;
            str8 = str9;
            fieldInfoArr = fieldInfoArr5;
        }
        FieldInfo[] fieldInfoArr6 = fieldInfoArr;
        boolean z10 = z;
        FieldInfo[] fieldInfoArr7 = fieldInfoArr3;
        String str11 = str8;
        Class<?> cls5 = cls2;
        ASMSerializerFactory aSMSerializerFactory2 = aSMSerializerFactory;
        if (!z6) {
            Context context2 = new Context(fieldInfoArr7, serializeBeanInfo, str6, false, z10);
            StringBuilder sb3 = new StringBuilder("(L");
            String str12 = JSONSerializer;
            sb3.append(str12);
            sb3.append(";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            MethodWriter methodWriter3 = new MethodWriter(classWriter, 1, "writeUnsorted", sb3.toString(), null, new String[]{"java/io/IOException"});
            methodWriter3.visitVarInsn(25, 1);
            methodWriter3.visitFieldInsn(180, str12, "out", SerializeWriter_desc);
            methodWriter3.visitVarInsn(58, context2.var("out"));
            methodWriter3.visitVarInsn(25, 2);
            methodWriter3.visitTypeInsn(192, ASMUtils.type(cls5));
            methodWriter3.visitVarInsn(58, context2.var("entity"));
            aSMSerializerFactory2.generateWriteMethod(cls5, methodWriter3, fieldInfoArr6, context2);
            methodWriter3.visitInsn(177);
            methodWriter3.visitMaxs(7, context2.variantIndex + 2);
            methodWriter3.visitEnd();
        }
        for (int i8 = 0; i8 < 3; i8++) {
            if (i8 == 0) {
                str2 = "writeAsArray";
                z3 = z10;
                z2 = true;
            } else if (i8 == 1) {
                str2 = "writeAsArrayNormal";
                z3 = z10;
                z2 = false;
            } else {
                str2 = "writeAsArrayNonContext";
                z2 = true;
                z3 = true;
            }
            Context context3 = new Context(fieldInfoArr7, serializeBeanInfo, str6, z2, z3);
            StringBuilder sb4 = new StringBuilder("(L");
            String str13 = JSONSerializer;
            sb4.append(str13);
            sb4.append(";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            MethodWriter methodWriter4 = new MethodWriter(classWriter, 1, str2, sb4.toString(), null, new String[]{"java/io/IOException"});
            methodWriter4.visitVarInsn(25, 1);
            methodWriter4.visitFieldInsn(180, str13, "out", SerializeWriter_desc);
            methodWriter4.visitVarInsn(58, context3.var("out"));
            methodWriter4.visitVarInsn(25, 2);
            methodWriter4.visitTypeInsn(192, ASMUtils.type(cls5));
            methodWriter4.visitVarInsn(58, context3.var("entity"));
            aSMSerializerFactory2.generateWriteAsArray(cls5, methodWriter4, fieldInfoArr7, context3);
            methodWriter4.visitInsn(177);
            methodWriter4.visitMaxs(7, context3.variantIndex + 2);
            methodWriter4.visitEnd();
        }
        byte[] byteArray = classWriter.toByteArray();
        return (JavaBeanSerializer) aSMSerializerFactory2.classLoader.defineClassPublic(str11, byteArray, 0, byteArray.length).getConstructor(cls).newInstance(serializeBeanInfo);
    }

    public static class Context {
        static final int features = 5;
        static int fieldName = 6;
        static final int obj = 2;
        static int original = 7;
        static final int paramFieldName = 3;
        static final int paramFieldType = 4;
        static int processValue = 8;
        static final int serializer = 1;
        private final SerializeBeanInfo beanInfo;
        private final String className;
        private final FieldInfo[] getters;
        private final boolean nonContext;
        private final boolean writeDirect;
        private Map<String, Integer> variants = new HashMap();
        private int variantIndex = 9;

        public Context(FieldInfo[] fieldInfoArr, SerializeBeanInfo serializeBeanInfo, String str, boolean z, boolean z2) {
            this.getters = fieldInfoArr;
            this.className = str;
            this.beanInfo = serializeBeanInfo;
            this.writeDirect = z;
            this.nonContext = z2 || serializeBeanInfo.beanType.isEnum();
        }

        public int getFieldOrinal(String str) {
            int length = this.getters.length;
            for (int i = 0; i < length; i++) {
                if (this.getters[i].name.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        public int var(String str, int i) {
            if (this.variants.get(str) == null) {
                this.variants.put(str, Integer.valueOf(this.variantIndex));
                this.variantIndex += i;
            }
            return this.variants.get(str).intValue();
        }

        public int var(String str) {
            if (this.variants.get(str) == null) {
                Map<String, Integer> map = this.variants;
                int i = this.variantIndex;
                this.variantIndex = i + 1;
                map.put(str, Integer.valueOf(i));
            }
            return this.variants.get(str).intValue();
        }
    }
}
