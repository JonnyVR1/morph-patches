package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.asm.ClassWriter;
import com.alibaba.fastjson.asm.FieldWriter;
import com.alibaba.fastjson.asm.Label;
import com.alibaba.fastjson.asm.MethodVisitor;
import com.alibaba.fastjson.asm.MethodWriter;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.fastjson.asm.Type;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.SymbolTable;
import com.alibaba.fastjson.util.ASMClassLoader;
import com.alibaba.fastjson.util.ASMUtils;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.TypeUtils;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import p149l.ig3;
import p149l.ohg0;

/* JADX INFO: loaded from: classes.dex */
public class ASMDeserializerFactory implements Opcodes {
    static final String DefaultJSONParser = ASMUtils.type(DefaultJSONParser.class);
    static final String JSONLexerBase = ASMUtils.type(JSONLexerBase.class);
    public final ASMClassLoader classLoader;
    protected final AtomicLong seed = new AtomicLong();

    public ASMDeserializerFactory(ClassLoader classLoader) {
        this.classLoader = classLoader instanceof ASMClassLoader ? (ASMClassLoader) classLoader : new ASMClassLoader(classLoader);
    }

    private void _batchSet(Context context, MethodVisitor methodVisitor, boolean z) {
        int length = context.fieldInfoList.length;
        for (int i = 0; i < length; i++) {
            Label label = new Label();
            if (z) {
                _isFlag(methodVisitor, context, i, label);
            }
            _loadAndSet(context, methodVisitor, context.fieldInfoList[i]);
            if (z) {
                methodVisitor.visitLabel(label);
            }
        }
    }

    private void _createInstance(Context context, MethodVisitor methodVisitor) {
        Constructor<?> constructor = context.beanInfo.defaultConstructor;
        if (Modifier.isPublic(constructor.getModifiers())) {
            methodVisitor.visitTypeInsn(187, ASMUtils.type(context.getInstClass()));
            methodVisitor.visitInsn(89);
            methodVisitor.visitMethodInsn(183, ASMUtils.type(constructor.getDeclaringClass()), "<init>", "()V");
            methodVisitor.visitVarInsn(58, context.var("instance"));
            return;
        }
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, ASMUtils.type(JavaBeanDeserializer.class), "clazz", "Ljava/lang/Class;");
        methodVisitor.visitMethodInsn(183, ASMUtils.type(JavaBeanDeserializer.class), "createInstance", "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;)Ljava/lang/Object;");
        methodVisitor.visitTypeInsn(192, ASMUtils.type(context.getInstClass()));
        methodVisitor.visitVarInsn(58, context.var("instance"));
    }

    private void _deserObject(Context context, MethodVisitor methodVisitor, FieldInfo fieldInfo, Class<?> cls, int i) {
        _getFieldDeser(context, methodVisitor, fieldInfo);
        Label label = new Label();
        Label label2 = new Label();
        if ((fieldInfo.parserFeatures & Feature.SupportArrayToBean.mask) != 0) {
            methodVisitor.visitInsn(89);
            methodVisitor.visitTypeInsn(193, ASMUtils.type(JavaBeanDeserializer.class));
            methodVisitor.visitJumpInsn(153, label);
            methodVisitor.visitTypeInsn(192, ASMUtils.type(JavaBeanDeserializer.class));
            methodVisitor.visitVarInsn(25, 1);
            if (fieldInfo.fieldType instanceof Class) {
                methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(fieldInfo.fieldClass)));
            } else {
                methodVisitor.visitVarInsn(25, 0);
                methodVisitor.visitLdcInsn(Integer.valueOf(i));
                methodVisitor.visitMethodInsn(182, ASMUtils.type(JavaBeanDeserializer.class), "getFieldType", "(I)Ljava/lang/reflect/Type;");
            }
            methodVisitor.visitLdcInsn(fieldInfo.name);
            methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.parserFeatures));
            methodVisitor.visitMethodInsn(182, ASMUtils.type(JavaBeanDeserializer.class), "deserialze", "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;");
            methodVisitor.visitTypeInsn(192, ASMUtils.type(cls));
            methodVisitor.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
            methodVisitor.visitJumpInsn(167, label2);
            methodVisitor.visitLabel(label);
        }
        methodVisitor.visitVarInsn(25, 1);
        if (fieldInfo.fieldType instanceof Class) {
            methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(fieldInfo.fieldClass)));
        } else {
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitLdcInsn(Integer.valueOf(i));
            methodVisitor.visitMethodInsn(182, ASMUtils.type(JavaBeanDeserializer.class), "getFieldType", "(I)Ljava/lang/reflect/Type;");
        }
        methodVisitor.visitLdcInsn(fieldInfo.name);
        methodVisitor.visitMethodInsn(185, ASMUtils.type(ObjectDeserializer.class), "deserialze", "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;");
        methodVisitor.visitTypeInsn(192, ASMUtils.type(cls));
        methodVisitor.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
        methodVisitor.visitLabel(label2);
    }

    private void _deserialize_endCheck(Context context, MethodVisitor methodVisitor, Label label) {
        methodVisitor.visitIntInsn(21, context.var("matchedCount"));
        methodVisitor.visitJumpInsn(158, label);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, JSONLexerBase, "token", "()I");
        methodVisitor.visitLdcInsn(13);
        methodVisitor.visitJumpInsn(160, label);
        _quickNextTokenComma(context, methodVisitor);
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0e16  */
    /* JADX WARN: Code duplicated, block: B:139:0x0e44  */
    private void _deserialze(ClassWriter classWriter, Context context) {
        int i;
        Class<String> cls;
        String str;
        Label label;
        int i2;
        String str2;
        String str3;
        Class<String> cls2;
        String str4;
        MethodWriter methodWriter;
        String str5;
        Label label2;
        Integer num;
        int i3;
        String str6;
        Label label3;
        String str7;
        char c;
        String str8;
        int i4;
        String str9;
        ASMDeserializerFactory aSMDeserializerFactory = this;
        Integer num2 = 4;
        if (context.fieldInfoList.length == 0) {
            return;
        }
        FieldInfo[] fieldInfoArr = context.fieldInfoList;
        int length = fieldInfoArr.length;
        int i5 = 0;
        while (true) {
            Class<Collection> cls3 = Collection.class;
            if (i5 >= length) {
                JavaBeanInfo javaBeanInfo = context.beanInfo;
                context.fieldInfoList = javaBeanInfo.sortedFields;
                String str10 = "(L";
                StringBuilder sb = new StringBuilder("(L");
                String str11 = DefaultJSONParser;
                sb.append(str11);
                sb.append(";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;");
                MethodWriter methodWriter2 = new MethodWriter(classWriter, 1, "deserialze", sb.toString(), null, null);
                Label label4 = new Label();
                Label label5 = new Label();
                Label label6 = new Label();
                Label label7 = new Label();
                aSMDeserializerFactory.defineVarLexer(context, methodWriter2);
                Label label8 = new Label();
                String str12 = ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;";
                methodWriter2.visitVarInsn(25, context.var("lexer"));
                String str13 = JSONLexerBase;
                Label label9 = label7;
                Label label10 = label4;
                methodWriter2.visitMethodInsn(182, str13, "token", "()I");
                methodWriter2.visitLdcInsn(14);
                methodWriter2.visitJumpInsn(160, label8);
                int i6 = javaBeanInfo.parserFeatures;
                Feature feature = Feature.SupportArrayToBean;
                if ((i6 & feature.mask) == 0) {
                    i = 25;
                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                    methodWriter2.visitVarInsn(21, 4);
                    methodWriter2.visitLdcInsn(Integer.valueOf(feature.mask));
                    methodWriter2.visitMethodInsn(182, str13, "isEnabled", "(II)Z");
                    methodWriter2.visitJumpInsn(153, label8);
                } else {
                    i = 25;
                }
                methodWriter2.visitVarInsn(i, 0);
                methodWriter2.visitVarInsn(i, 1);
                methodWriter2.visitVarInsn(i, 2);
                methodWriter2.visitVarInsn(i, 3);
                methodWriter2.visitInsn(1);
                methodWriter2.visitMethodInsn(183, context.className, "deserialzeArrayMapping", "(L" + str11 + ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;");
                methodWriter2.visitInsn(176);
                methodWriter2.visitLabel(label8);
                methodWriter2.visitVarInsn(25, context.var("lexer"));
                methodWriter2.visitLdcInsn(Integer.valueOf(Feature.SortFeidFastMatch.mask));
                methodWriter2.visitMethodInsn(182, str13, "isEnabled", "(I)Z");
                methodWriter2.visitJumpInsn(153, label5);
                methodWriter2.visitVarInsn(25, context.var("lexer"));
                methodWriter2.visitLdcInsn(context.clazz.getName());
                methodWriter2.visitMethodInsn(182, str13, "scanType", "(Ljava/lang/String;)I");
                methodWriter2.visitLdcInsn(-1);
                methodWriter2.visitJumpInsn(159, label5);
                methodWriter2.visitVarInsn(25, 1);
                methodWriter2.visitMethodInsn(182, str11, "getContext", "()" + ASMUtils.desc((Class<?>) ParseContext.class));
                methodWriter2.visitVarInsn(58, context.var("mark_context"));
                methodWriter2.visitInsn(3);
                String str14 = "matchedCount";
                methodWriter2.visitVarInsn(54, context.var("matchedCount"));
                aSMDeserializerFactory._createInstance(context, methodWriter2);
                methodWriter2.visitVarInsn(25, 1);
                methodWriter2.visitMethodInsn(182, str11, "getContext", "()" + ASMUtils.desc((Class<?>) ParseContext.class));
                methodWriter2.visitVarInsn(58, context.var("context"));
                methodWriter2.visitVarInsn(25, 1);
                methodWriter2.visitVarInsn(25, context.var("context"));
                String str15 = "instance";
                methodWriter2.visitVarInsn(25, context.var("instance"));
                methodWriter2.visitVarInsn(25, 3);
                methodWriter2.visitMethodInsn(182, str11, "setContext", "(" + ASMUtils.desc((Class<?>) ParseContext.class) + "Ljava/lang/Object;Ljava/lang/Object;)" + ASMUtils.desc((Class<?>) ParseContext.class));
                methodWriter2.visitVarInsn(58, context.var("childContext"));
                methodWriter2.visitVarInsn(25, context.var("lexer"));
                String str16 = "I";
                methodWriter2.visitFieldInsn(180, str13, "matchStat", "I");
                methodWriter2.visitLdcInsn(num2);
                methodWriter2.visitJumpInsn(159, label6);
                int i7 = 3;
                methodWriter2.visitInsn(3);
                methodWriter2.visitIntInsn(54, context.var("matchStat"));
                int length2 = context.fieldInfoList.length;
                int i8 = 0;
                while (i8 < length2) {
                    methodWriter2.visitInsn(i7);
                    int i9 = i8;
                    methodWriter2.visitVarInsn(54, context.var("_asm_flag_" + (i9 / 32)));
                    i8 = i9 + 32;
                    i7 = 3;
                }
                methodWriter2.visitVarInsn(25, context.var("lexer"));
                methodWriter2.visitLdcInsn(Integer.valueOf(Feature.InitStringFieldAsEmpty.mask));
                methodWriter2.visitMethodInsn(182, JSONLexerBase, "isEnabled", "(I)Z");
                methodWriter2.visitIntInsn(54, context.var("initStringFieldAsEmpty"));
                int i10 = 0;
                while (true) {
                    cls = String.class;
                    str = "_asm";
                    if (i10 >= length2) {
                        break;
                    }
                    FieldInfo fieldInfo = context.fieldInfoList[i10];
                    String str17 = str15;
                    Class<?> cls4 = fieldInfo.fieldClass;
                    Label label11 = label6;
                    if (cls4 == Boolean.TYPE || cls4 == Byte.TYPE || cls4 == Short.TYPE || cls4 == Integer.TYPE) {
                        i10 = i10;
                        str14 = str14;
                        num2 = num2;
                        methodWriter2.visitInsn(3);
                        methodWriter2.visitVarInsn(54, context.var(fieldInfo.name + "_asm"));
                    } else {
                        if (cls4 == Long.TYPE) {
                            methodWriter2.visitInsn(9);
                            methodWriter2.visitVarInsn(55, context.var(fieldInfo.name + "_asm", 2));
                        } else if (cls4 == Float.TYPE) {
                            methodWriter2.visitInsn(11);
                            methodWriter2.visitVarInsn(56, context.var(fieldInfo.name + "_asm"));
                        } else if (cls4 == Double.TYPE) {
                            methodWriter2.visitInsn(14);
                            methodWriter2.visitVarInsn(57, context.var(fieldInfo.name + "_asm", 2));
                        } else {
                            if (cls4 == cls) {
                                Label label12 = new Label();
                                Label label13 = new Label();
                                methodWriter2.visitVarInsn(21, context.var("initStringFieldAsEmpty"));
                                methodWriter2.visitJumpInsn(153, label13);
                                aSMDeserializerFactory._setFlag(methodWriter2, context, i10);
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitMethodInsn(182, JSONLexerBase, "stringDefaultValue", "()Ljava/lang/String;");
                                methodWriter2.visitJumpInsn(167, label12);
                                methodWriter2.visitLabel(label13);
                                methodWriter2.visitInsn(1);
                                methodWriter2.visitLabel(label12);
                            } else {
                                methodWriter2.visitInsn(1);
                            }
                            methodWriter2.visitTypeInsn(192, ASMUtils.type(cls4));
                            methodWriter2.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                        }
                        i10 = i10;
                        str14 = str14;
                        num2 = num2;
                    }
                    i10++;
                    str15 = str17;
                    label6 = label11;
                    num2 = num2;
                    str14 = str14;
                }
                String str18 = str14;
                Integer num3 = num2;
                String str19 = str15;
                Label label14 = label6;
                int i11 = 0;
                while (i11 < length2) {
                    FieldInfo fieldInfo2 = context.fieldInfoList[i11];
                    Class<?> cls5 = fieldInfo2.fieldClass;
                    java.lang.reflect.Type type = fieldInfo2.fieldType;
                    Label label15 = new Label();
                    int i12 = length2;
                    if (cls5 == Boolean.TYPE) {
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitVarInsn(25, 0);
                        String str20 = context.className;
                        StringBuilder sb2 = new StringBuilder();
                        label = label15;
                        sb2.append(fieldInfo2.name);
                        sb2.append("_asm_prefix__");
                        methodWriter2.visitFieldInsn(180, str20, sb2.toString(), "[C");
                        methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldBoolean", "([C)Z");
                        methodWriter2.visitVarInsn(54, context.var(fieldInfo2.name + str));
                        i2 = i11;
                        str3 = str10;
                    } else {
                        label = label15;
                        i2 = i11;
                        if (cls5 == Byte.TYPE) {
                            methodWriter2.visitVarInsn(25, context.var("lexer"));
                            methodWriter2.visitVarInsn(25, 0);
                            String str21 = context.className;
                            StringBuilder sb3 = new StringBuilder();
                            str2 = str10;
                            sb3.append(fieldInfo2.name);
                            sb3.append("_asm_prefix__");
                            methodWriter2.visitFieldInsn(180, str21, sb3.toString(), "[C");
                            methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldInt", "([C)I");
                            methodWriter2.visitVarInsn(54, context.var(fieldInfo2.name + str));
                        } else {
                            str2 = str10;
                            if (cls5 == Byte.class) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                String str22 = JSONLexerBase;
                                methodWriter2.visitMethodInsn(182, str22, "scanFieldInt", "([C)I");
                                methodWriter2.visitMethodInsn(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
                                methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                Label label16 = new Label();
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitFieldInsn(180, str22, "matchStat", str16);
                                methodWriter2.visitLdcInsn(5);
                                methodWriter2.visitJumpInsn(160, label16);
                                methodWriter2.visitInsn(1);
                                methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                methodWriter2.visitLabel(label16);
                            } else if (cls5 == Short.TYPE) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldInt", "([C)I");
                                methodWriter2.visitVarInsn(54, context.var(fieldInfo2.name + str));
                            } else if (cls5 == Short.class) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                String str23 = JSONLexerBase;
                                methodWriter2.visitMethodInsn(182, str23, "scanFieldInt", "([C)I");
                                methodWriter2.visitMethodInsn(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
                                methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                Label label17 = new Label();
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitFieldInsn(180, str23, "matchStat", str16);
                                methodWriter2.visitLdcInsn(5);
                                methodWriter2.visitJumpInsn(160, label17);
                                methodWriter2.visitInsn(1);
                                methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                methodWriter2.visitLabel(label17);
                            } else if (cls5 == Integer.TYPE) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldInt", "([C)I");
                                methodWriter2.visitVarInsn(54, context.var(fieldInfo2.name + str));
                            } else if (cls5 == Integer.class) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                String str24 = JSONLexerBase;
                                methodWriter2.visitMethodInsn(182, str24, "scanFieldInt", "([C)I");
                                methodWriter2.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                Label label18 = new Label();
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitFieldInsn(180, str24, "matchStat", str16);
                                methodWriter2.visitLdcInsn(5);
                                methodWriter2.visitJumpInsn(160, label18);
                                methodWriter2.visitInsn(1);
                                methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                methodWriter2.visitLabel(label18);
                            } else if (cls5 == Long.TYPE) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldLong", "([C)J");
                                methodWriter2.visitVarInsn(55, context.var(fieldInfo2.name + str, 2));
                            } else if (cls5 == Long.class) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                String str25 = JSONLexerBase;
                                methodWriter2.visitMethodInsn(182, str25, "scanFieldLong", "([C)J");
                                methodWriter2.visitMethodInsn(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
                                methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                Label label19 = new Label();
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitFieldInsn(180, str25, "matchStat", str16);
                                methodWriter2.visitLdcInsn(5);
                                methodWriter2.visitJumpInsn(160, label19);
                                methodWriter2.visitInsn(1);
                                methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                methodWriter2.visitLabel(label19);
                            } else if (cls5 == Float.TYPE) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldFloat", "([C)F");
                                methodWriter2.visitVarInsn(56, context.var(fieldInfo2.name + str));
                            } else if (cls5 == Float.class) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                String str26 = JSONLexerBase;
                                methodWriter2.visitMethodInsn(182, str26, "scanFieldFloat", "([C)F");
                                methodWriter2.visitMethodInsn(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
                                methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                Label label20 = new Label();
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitFieldInsn(180, str26, "matchStat", str16);
                                methodWriter2.visitLdcInsn(5);
                                methodWriter2.visitJumpInsn(160, label20);
                                methodWriter2.visitInsn(1);
                                methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                methodWriter2.visitLabel(label20);
                            } else if (cls5 == Double.TYPE) {
                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                methodWriter2.visitVarInsn(25, 0);
                                methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldDouble", "([C)D");
                                methodWriter2.visitVarInsn(57, context.var(fieldInfo2.name + str, 2));
                            } else {
                                if (cls5 == Double.class) {
                                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                                    methodWriter2.visitVarInsn(25, 0);
                                    methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                    String str27 = JSONLexerBase;
                                    methodWriter2.visitMethodInsn(182, str27, "scanFieldDouble", "([C)D");
                                    methodWriter2.visitMethodInsn(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
                                    methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                    Label label21 = new Label();
                                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                                    methodWriter2.visitFieldInsn(180, str27, "matchStat", str16);
                                    methodWriter2.visitLdcInsn(5);
                                    methodWriter2.visitJumpInsn(160, label21);
                                    methodWriter2.visitInsn(1);
                                    methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                    methodWriter2.visitLabel(label21);
                                } else {
                                    if (cls5 == cls) {
                                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                                        methodWriter2.visitVarInsn(25, 0);
                                        methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                        methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldString", "([C)Ljava/lang/String;");
                                        c = ':';
                                        methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                    } else if (cls5 == Date.class) {
                                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                                        methodWriter2.visitVarInsn(25, 0);
                                        methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                        methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldDate", "([C)Ljava/util/Date;");
                                        c = ':';
                                        methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                    } else if (cls5 == UUID.class) {
                                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                                        methodWriter2.visitVarInsn(25, 0);
                                        methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                        methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldUUID", "([C)Ljava/util/UUID;");
                                        c = ':';
                                        methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                    } else if (cls5 == BigDecimal.class) {
                                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                                        methodWriter2.visitVarInsn(25, 0);
                                        methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                        methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldDecimal", "([C)Ljava/math/BigDecimal;");
                                        c = ':';
                                        methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                    } else if (cls5 == BigInteger.class) {
                                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                                        methodWriter2.visitVarInsn(25, 0);
                                        methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                        methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldBigInteger", "([C)Ljava/math/BigInteger;");
                                        c = ':';
                                        methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                    } else if (cls5 == int[].class) {
                                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                                        methodWriter2.visitVarInsn(25, 0);
                                        methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                        methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldIntArray", "([C)[I");
                                        c = ':';
                                        methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                    } else if (cls5 == float[].class) {
                                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                                        methodWriter2.visitVarInsn(25, 0);
                                        methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                        methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldFloatArray", "([C)[F");
                                        c = ':';
                                        methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                    } else if (cls5 == float[][].class) {
                                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                                        methodWriter2.visitVarInsn(25, 0);
                                        methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                        methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldFloatArray2", "([C)[[F");
                                        c = ':';
                                        methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                    } else if (cls5.isEnum()) {
                                        methodWriter2.visitVarInsn(25, 0);
                                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                                        methodWriter2.visitVarInsn(25, 0);
                                        methodWriter2.visitFieldInsn(180, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
                                        aSMDeserializerFactory = this;
                                        aSMDeserializerFactory._getFieldDeser(context, methodWriter2, fieldInfo2);
                                        str3 = str2;
                                        methodWriter2.visitMethodInsn(182, ASMUtils.type(JavaBeanDeserializer.class), "scanEnum", str3 + JSONLexerBase + ";[C" + ASMUtils.desc((Class<?>) ObjectDeserializer.class) + ")Ljava/lang/Enum;");
                                        methodWriter2.visitTypeInsn(192, ASMUtils.type(cls5));
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append(fieldInfo2.name);
                                        sb4.append(str);
                                        methodWriter2.visitVarInsn(58, context.var(sb4.toString()));
                                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                                        str8 = JSONLexerBase;
                                        methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                                        Label label22 = new Label();
                                        methodWriter2.visitJumpInsn(158, label22);
                                        i4 = i2;
                                        aSMDeserializerFactory._setFlag(methodWriter2, context, i4);
                                        methodWriter2.visitLabel(label22);
                                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                                        methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                                        methodWriter2.visitInsn(89);
                                        methodWriter2.visitVarInsn(54, context.var("matchStat"));
                                        methodWriter2.visitLdcInsn(-1);
                                        label2 = label10;
                                        methodWriter2.visitJumpInsn(159, label2);
                                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                                        methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                                        Label label23 = label;
                                        methodWriter2.visitJumpInsn(158, label23);
                                        str9 = str18;
                                        methodWriter2.visitVarInsn(21, context.var(str9));
                                        methodWriter2.visitInsn(4);
                                        methodWriter2.visitInsn(96);
                                        methodWriter2.visitVarInsn(54, context.var(str9));
                                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                                        methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                                        num = num3;
                                        methodWriter2.visitLdcInsn(num);
                                        label3 = label9;
                                        methodWriter2.visitJumpInsn(159, label3);
                                        methodWriter2.visitLabel(label23);
                                        if (i4 == i12 - 1) {
                                            methodWriter2.visitVarInsn(25, context.var("lexer"));
                                            methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                                            methodWriter2.visitLdcInsn(num);
                                            methodWriter2.visitJumpInsn(160, label2);
                                            cls2 = cls;
                                            i3 = i4;
                                            str18 = str9;
                                            str7 = str;
                                            str4 = str3;
                                            methodWriter = methodWriter2;
                                            str5 = str12;
                                            str6 = str16;
                                            aSMDeserializerFactory = this;
                                        } else {
                                            cls2 = cls;
                                            i3 = i4;
                                            str18 = str9;
                                            str7 = str;
                                            str4 = str3;
                                            methodWriter = methodWriter2;
                                            str5 = str12;
                                            aSMDeserializerFactory = this;
                                            str6 = str16;
                                        }
                                    } else {
                                        aSMDeserializerFactory = this;
                                        Class<Collection> cls6 = cls3;
                                        str3 = str2;
                                        if (cls6.isAssignableFrom(cls5)) {
                                            methodWriter2.visitVarInsn(25, context.var("lexer"));
                                            methodWriter2.visitVarInsn(25, 0);
                                            String str28 = context.className;
                                            StringBuilder sb5 = new StringBuilder();
                                            cls3 = cls6;
                                            sb5.append(fieldInfo2.name);
                                            sb5.append("_asm_prefix__");
                                            methodWriter2.visitFieldInsn(180, str28, sb5.toString(), "[C");
                                            Class<?> collectionItemClass = TypeUtils.getCollectionItemClass(type);
                                            if (collectionItemClass == cls) {
                                                methodWriter2.visitLdcInsn(Type.getType(ASMUtils.desc(cls5)));
                                                methodWriter2.visitMethodInsn(182, JSONLexerBase, "scanFieldStringArray", "([CLjava/lang/Class;)" + ASMUtils.desc(cls3));
                                                methodWriter2.visitVarInsn(58, context.var(fieldInfo2.name + str));
                                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                                str8 = JSONLexerBase;
                                                methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                                                Label label24 = new Label();
                                                methodWriter2.visitJumpInsn(158, label24);
                                                i4 = i2;
                                                aSMDeserializerFactory._setFlag(methodWriter2, context, i4);
                                                methodWriter2.visitLabel(label24);
                                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                                methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                                                methodWriter2.visitInsn(89);
                                                methodWriter2.visitVarInsn(54, context.var("matchStat"));
                                                methodWriter2.visitLdcInsn(-1);
                                                label2 = label10;
                                                methodWriter2.visitJumpInsn(159, label2);
                                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                                methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                                                Label label25 = label;
                                                methodWriter2.visitJumpInsn(158, label25);
                                                str9 = str18;
                                                methodWriter2.visitVarInsn(21, context.var(str9));
                                                methodWriter2.visitInsn(4);
                                                methodWriter2.visitInsn(96);
                                                methodWriter2.visitVarInsn(54, context.var(str9));
                                                methodWriter2.visitVarInsn(25, context.var("lexer"));
                                                methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                                                num = num3;
                                                methodWriter2.visitLdcInsn(num);
                                                label3 = label9;
                                                methodWriter2.visitJumpInsn(159, label3);
                                                methodWriter2.visitLabel(label25);
                                                if (i4 == i12 - 1) {
                                                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                                                    methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                                                    methodWriter2.visitLdcInsn(num);
                                                    methodWriter2.visitJumpInsn(160, label2);
                                                    cls2 = cls;
                                                    i3 = i4;
                                                    str18 = str9;
                                                    str7 = str;
                                                    str4 = str3;
                                                    methodWriter = methodWriter2;
                                                    str5 = str12;
                                                    str6 = str16;
                                                    aSMDeserializerFactory = this;
                                                } else {
                                                    cls2 = cls;
                                                    i3 = i4;
                                                    str18 = str9;
                                                    str7 = str;
                                                    str4 = str3;
                                                    methodWriter = methodWriter2;
                                                    str5 = str12;
                                                    aSMDeserializerFactory = this;
                                                    str6 = str16;
                                                }
                                            } else {
                                                cls2 = cls;
                                                str4 = str3;
                                                label2 = label10;
                                                num = num3;
                                                methodWriter = methodWriter2;
                                                str5 = str12;
                                                str6 = str16;
                                                label3 = label9;
                                                str7 = str;
                                                aSMDeserializerFactory._deserialze_list_obj(context, methodWriter, label2, fieldInfo2, cls5, collectionItemClass, i2);
                                                i3 = i2;
                                                if (i3 == i12 - 1) {
                                                    aSMDeserializerFactory._deserialize_endCheck(context, methodWriter, label2);
                                                }
                                            }
                                        } else {
                                            cls3 = cls6;
                                            cls2 = cls;
                                            str4 = str3;
                                            methodWriter = methodWriter2;
                                            str5 = str12;
                                            label2 = label10;
                                            num = num3;
                                            i3 = i2;
                                            str6 = str16;
                                            label3 = label9;
                                            str7 = str;
                                            aSMDeserializerFactory._deserialze_obj(context, methodWriter, label2, fieldInfo2, cls5, i3);
                                            if (i3 == i12 - 1) {
                                                aSMDeserializerFactory._deserialize_endCheck(context, methodWriter, label2);
                                            }
                                        }
                                    }
                                    aSMDeserializerFactory = this;
                                    str3 = str2;
                                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                                    str8 = JSONLexerBase;
                                    methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                                    Label label26 = new Label();
                                    methodWriter2.visitJumpInsn(158, label26);
                                    i4 = i2;
                                    aSMDeserializerFactory._setFlag(methodWriter2, context, i4);
                                    methodWriter2.visitLabel(label26);
                                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                                    methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                                    methodWriter2.visitInsn(89);
                                    methodWriter2.visitVarInsn(54, context.var("matchStat"));
                                    methodWriter2.visitLdcInsn(-1);
                                    label2 = label10;
                                    methodWriter2.visitJumpInsn(159, label2);
                                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                                    methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                                    Label label27 = label;
                                    methodWriter2.visitJumpInsn(158, label27);
                                    str9 = str18;
                                    methodWriter2.visitVarInsn(21, context.var(str9));
                                    methodWriter2.visitInsn(4);
                                    methodWriter2.visitInsn(96);
                                    methodWriter2.visitVarInsn(54, context.var(str9));
                                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                                    methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                                    num = num3;
                                    methodWriter2.visitLdcInsn(num);
                                    label3 = label9;
                                    methodWriter2.visitJumpInsn(159, label3);
                                    methodWriter2.visitLabel(label27);
                                    if (i4 == i12 - 1) {
                                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                                        methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                                        methodWriter2.visitLdcInsn(num);
                                        methodWriter2.visitJumpInsn(160, label2);
                                        cls2 = cls;
                                        i3 = i4;
                                        str18 = str9;
                                        str7 = str;
                                        str4 = str3;
                                        methodWriter = methodWriter2;
                                        str5 = str12;
                                        str6 = str16;
                                        aSMDeserializerFactory = this;
                                    } else {
                                        cls2 = cls;
                                        i3 = i4;
                                        str18 = str9;
                                        str7 = str;
                                        str4 = str3;
                                        methodWriter = methodWriter2;
                                        str5 = str12;
                                        aSMDeserializerFactory = this;
                                        str6 = str16;
                                    }
                                }
                                int i13 = i3 + 1;
                                label10 = label2;
                                num3 = num;
                                cls = cls2;
                                str16 = str6;
                                str = str7;
                                length2 = i12;
                                str12 = str5;
                                label9 = label3;
                                methodWriter2 = methodWriter;
                                i11 = i13;
                                str10 = str4;
                            }
                            aSMDeserializerFactory = this;
                        }
                        str3 = str2;
                    }
                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                    str8 = JSONLexerBase;
                    methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                    Label label28 = new Label();
                    methodWriter2.visitJumpInsn(158, label28);
                    i4 = i2;
                    aSMDeserializerFactory._setFlag(methodWriter2, context, i4);
                    methodWriter2.visitLabel(label28);
                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                    methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                    methodWriter2.visitInsn(89);
                    methodWriter2.visitVarInsn(54, context.var("matchStat"));
                    methodWriter2.visitLdcInsn(-1);
                    label2 = label10;
                    methodWriter2.visitJumpInsn(159, label2);
                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                    methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                    Label label29 = label;
                    methodWriter2.visitJumpInsn(158, label29);
                    str9 = str18;
                    methodWriter2.visitVarInsn(21, context.var(str9));
                    methodWriter2.visitInsn(4);
                    methodWriter2.visitInsn(96);
                    methodWriter2.visitVarInsn(54, context.var(str9));
                    methodWriter2.visitVarInsn(25, context.var("lexer"));
                    methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                    num = num3;
                    methodWriter2.visitLdcInsn(num);
                    label3 = label9;
                    methodWriter2.visitJumpInsn(159, label3);
                    methodWriter2.visitLabel(label29);
                    if (i4 == i12 - 1) {
                        methodWriter2.visitVarInsn(25, context.var("lexer"));
                        methodWriter2.visitFieldInsn(180, str8, "matchStat", str16);
                        methodWriter2.visitLdcInsn(num);
                        methodWriter2.visitJumpInsn(160, label2);
                        cls2 = cls;
                        i3 = i4;
                        str18 = str9;
                        str7 = str;
                        str4 = str3;
                        methodWriter = methodWriter2;
                        str5 = str12;
                        str6 = str16;
                        aSMDeserializerFactory = this;
                    } else {
                        cls2 = cls;
                        i3 = i4;
                        str18 = str9;
                        str7 = str;
                        str4 = str3;
                        methodWriter = methodWriter2;
                        str5 = str12;
                        aSMDeserializerFactory = this;
                        str6 = str16;
                    }
                    int i14 = i3 + 1;
                    label10 = label2;
                    num3 = num;
                    cls = cls2;
                    str16 = str6;
                    str = str7;
                    length2 = i12;
                    str12 = str5;
                    label9 = label3;
                    methodWriter2 = methodWriter;
                    i11 = i14;
                    str10 = str4;
                }
                int i15 = length2;
                MethodWriter methodWriter3 = methodWriter2;
                String str29 = str12;
                Label label30 = label10;
                String str30 = str10;
                methodWriter3.visitLabel(label9);
                if (!context.clazz.isInterface() && !Modifier.isAbstract(context.clazz.getModifiers())) {
                    aSMDeserializerFactory._batchSet(context, methodWriter3);
                }
                methodWriter3.visitLabel(label14);
                aSMDeserializerFactory._setContext(context, methodWriter3);
                methodWriter3.visitVarInsn(25, context.var(str19));
                Method method = context.beanInfo.buildMethod;
                if (method != null) {
                    methodWriter3.visitMethodInsn(182, ASMUtils.type(context.getInstClass()), method.getName(), "()" + ASMUtils.desc(method.getReturnType()));
                }
                methodWriter3.visitInsn(176);
                methodWriter3.visitLabel(label30);
                aSMDeserializerFactory._batchSet(context, methodWriter3);
                methodWriter3.visitVarInsn(25, 0);
                methodWriter3.visitVarInsn(25, 1);
                methodWriter3.visitVarInsn(25, 2);
                methodWriter3.visitVarInsn(25, 3);
                methodWriter3.visitVarInsn(25, context.var(str19));
                methodWriter3.visitVarInsn(21, 4);
                int i16 = i15 / 32;
                if (i15 != 0 && i15 % 32 != 0) {
                    i16++;
                }
                if (i16 == 1) {
                    methodWriter3.visitInsn(4);
                } else {
                    methodWriter3.visitIntInsn(16, i16);
                }
                methodWriter3.visitIntInsn(188, 10);
                for (int i17 = 0; i17 < i16; i17++) {
                    methodWriter3.visitInsn(89);
                    if (i17 == 0) {
                        methodWriter3.visitInsn(3);
                    } else if (i17 == 1) {
                        methodWriter3.visitInsn(4);
                    } else {
                        methodWriter3.visitIntInsn(16, i17);
                    }
                    methodWriter3.visitVarInsn(21, context.var("_asm_flag_" + i17));
                    methodWriter3.visitInsn(79);
                }
                String strType = ASMUtils.type(JavaBeanDeserializer.class);
                StringBuilder sb6 = new StringBuilder(str30);
                String str31 = DefaultJSONParser;
                sb6.append(str31);
                sb6.append(";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;I[I)Ljava/lang/Object;");
                methodWriter3.visitMethodInsn(182, strType, "parseRest", sb6.toString());
                methodWriter3.visitTypeInsn(192, ASMUtils.type(context.clazz));
                methodWriter3.visitInsn(176);
                methodWriter3.visitLabel(label5);
                methodWriter3.visitVarInsn(25, 0);
                methodWriter3.visitVarInsn(25, 1);
                methodWriter3.visitVarInsn(25, 2);
                methodWriter3.visitVarInsn(25, 3);
                methodWriter3.visitVarInsn(21, 4);
                methodWriter3.visitMethodInsn(183, ASMUtils.type(JavaBeanDeserializer.class), "deserialze", str30 + str31 + str29);
                methodWriter3.visitInsn(176);
                methodWriter3.visitMaxs(10, context.variantIndex);
                methodWriter3.visitEnd();
                return;
            }
            FieldInfo fieldInfo3 = fieldInfoArr[i5];
            Class<?> cls7 = fieldInfo3.fieldClass;
            java.lang.reflect.Type type2 = fieldInfo3.fieldType;
            if (cls7 == Character.TYPE) {
                return;
            }
            if (cls3.isAssignableFrom(cls7) && !((type2 instanceof ParameterizedType) && (((ParameterizedType) type2).getActualTypeArguments()[0] instanceof Class))) {
                return;
            } else {
                i5++;
            }
        }
    }

    private void _deserialzeArrayMapping(ClassWriter classWriter, Context context) {
        ASMDeserializerFactory aSMDeserializerFactory;
        String str;
        String str2;
        char c;
        char c2;
        int i;
        char c3;
        ASMDeserializerFactory aSMDeserializerFactory2 = this;
        Integer num = 5;
        Integer num2 = 16;
        String str3 = "(L";
        StringBuilder sb = new StringBuilder("(L");
        String str4 = DefaultJSONParser;
        sb.append(str4);
        sb.append(";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;");
        MethodWriter methodWriter = new MethodWriter(classWriter, 1, "deserialzeArrayMapping", sb.toString(), null, null);
        aSMDeserializerFactory2.defineVarLexer(context, methodWriter);
        methodWriter.visitVarInsn(25, context.var("lexer"));
        methodWriter.visitVarInsn(25, 1);
        String str5 = "()";
        methodWriter.visitMethodInsn(182, str4, "getSymbolTable", "()" + ASMUtils.desc((Class<?>) SymbolTable.class));
        String str6 = "(";
        methodWriter.visitMethodInsn(182, JSONLexerBase, "scanTypeName", "(" + ASMUtils.desc((Class<?>) SymbolTable.class) + ")Ljava/lang/String;");
        methodWriter.visitVarInsn(58, context.var("typeName"));
        Label label = new Label();
        methodWriter.visitVarInsn(25, context.var("typeName"));
        methodWriter.visitJumpInsn(Opcodes.IFNULL, label);
        methodWriter.visitVarInsn(25, 1);
        methodWriter.visitMethodInsn(182, str4, "getConfig", "()" + ASMUtils.desc((Class<?>) ParserConfig.class));
        methodWriter.visitVarInsn(25, 0);
        methodWriter.visitFieldInsn(180, ASMUtils.type(JavaBeanDeserializer.class), "beanInfo", ASMUtils.desc((Class<?>) JavaBeanInfo.class));
        methodWriter.visitVarInsn(25, context.var("typeName"));
        methodWriter.visitMethodInsn(184, ASMUtils.type(JavaBeanDeserializer.class), "getSeeAlso", "(" + ASMUtils.desc((Class<?>) ParserConfig.class) + ASMUtils.desc((Class<?>) JavaBeanInfo.class) + "Ljava/lang/String;)" + ASMUtils.desc((Class<?>) JavaBeanDeserializer.class));
        methodWriter.visitVarInsn(58, context.var("userTypeDeser"));
        methodWriter.visitVarInsn(25, context.var("userTypeDeser"));
        methodWriter.visitTypeInsn(193, ASMUtils.type(JavaBeanDeserializer.class));
        methodWriter.visitJumpInsn(153, label);
        methodWriter.visitVarInsn(25, context.var("userTypeDeser"));
        methodWriter.visitVarInsn(25, 1);
        methodWriter.visitVarInsn(25, 2);
        methodWriter.visitVarInsn(25, 3);
        methodWriter.visitVarInsn(25, 4);
        methodWriter.visitMethodInsn(182, ASMUtils.type(JavaBeanDeserializer.class), "deserialzeArrayMapping", "(L" + str4 + ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;");
        methodWriter.visitInsn(176);
        methodWriter.visitLabel(label);
        aSMDeserializerFactory2._createInstance(context, methodWriter);
        FieldInfo[] fieldInfoArr = context.beanInfo.sortedFields;
        int length = fieldInfoArr.length;
        int i2 = 0;
        while (true) {
            FieldInfo[] fieldInfoArr2 = fieldInfoArr;
            String str7 = str6;
            Integer num3 = num2;
            if (i2 >= length) {
                aSMDeserializerFactory2._batchSet(context, methodWriter, false);
                Label label2 = new Label();
                Label label3 = new Label();
                Label label4 = new Label();
                Label label5 = new Label();
                methodWriter.visitVarInsn(25, context.var("lexer"));
                String str8 = JSONLexerBase;
                methodWriter.visitMethodInsn(182, str8, "getCurrent", "()C");
                methodWriter.visitInsn(89);
                methodWriter.visitVarInsn(54, context.var("ch"));
                methodWriter.visitVarInsn(16, 44);
                methodWriter.visitJumpInsn(160, label3);
                methodWriter.visitVarInsn(25, context.var("lexer"));
                methodWriter.visitMethodInsn(182, str8, "next", "()C");
                methodWriter.visitInsn(87);
                methodWriter.visitVarInsn(25, context.var("lexer"));
                methodWriter.visitLdcInsn(num3);
                methodWriter.visitMethodInsn(182, str8, "setToken", "(I)V");
                methodWriter.visitJumpInsn(167, label5);
                methodWriter.visitLabel(label3);
                methodWriter.visitVarInsn(21, context.var("ch"));
                methodWriter.visitVarInsn(16, 93);
                methodWriter.visitJumpInsn(160, label4);
                methodWriter.visitVarInsn(25, context.var("lexer"));
                methodWriter.visitMethodInsn(182, str8, "next", "()C");
                methodWriter.visitInsn(87);
                methodWriter.visitVarInsn(25, context.var("lexer"));
                methodWriter.visitLdcInsn(15);
                methodWriter.visitMethodInsn(182, str8, "setToken", "(I)V");
                methodWriter.visitJumpInsn(167, label5);
                methodWriter.visitLabel(label4);
                methodWriter.visitVarInsn(21, context.var("ch"));
                methodWriter.visitVarInsn(16, 26);
                methodWriter.visitJumpInsn(160, label2);
                methodWriter.visitVarInsn(25, context.var("lexer"));
                methodWriter.visitMethodInsn(182, str8, "next", "()C");
                methodWriter.visitInsn(87);
                methodWriter.visitVarInsn(25, context.var("lexer"));
                methodWriter.visitLdcInsn(20);
                methodWriter.visitMethodInsn(182, str8, "setToken", "(I)V");
                methodWriter.visitJumpInsn(167, label5);
                methodWriter.visitLabel(label2);
                methodWriter.visitVarInsn(25, context.var("lexer"));
                methodWriter.visitLdcInsn(num3);
                methodWriter.visitMethodInsn(182, str8, "nextToken", "(I)V");
                methodWriter.visitLabel(label5);
                methodWriter.visitVarInsn(25, context.var("instance"));
                methodWriter.visitInsn(176);
                methodWriter.visitMaxs(5, context.variantIndex);
                methodWriter.visitEnd();
                return;
            }
            boolean z = i2 == length + (-1);
            boolean z2 = z;
            int i3 = z ? 93 : 44;
            int i4 = length;
            FieldInfo fieldInfo = fieldInfoArr2[i2];
            int i5 = i2;
            Class<?> cls = fieldInfo.fieldClass;
            java.lang.reflect.Type type = fieldInfo.fieldType;
            String str9 = str3;
            if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE) {
                aSMDeserializerFactory = aSMDeserializerFactory2;
                num = num;
                str = str5;
                num3 = num3;
                str2 = str9;
                c = 2;
                c2 = 184;
                str7 = str7;
                methodWriter.visitVarInsn(25, context.var("lexer"));
                methodWriter.visitVarInsn(16, i3);
                methodWriter.visitMethodInsn(182, JSONLexerBase, "scanInt", "(C)I");
                methodWriter.visitVarInsn(54, context.var(fieldInfo.name + "_asm"));
            } else {
                str = str5;
                if (cls == Byte.class) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i3);
                    String str10 = JSONLexerBase;
                    methodWriter.visitMethodInsn(182, str10, "scanInt", "(C)I");
                    methodWriter.visitMethodInsn(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    Label label6 = new Label();
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitFieldInsn(180, str10, "matchStat", "I");
                    methodWriter.visitLdcInsn(num);
                    methodWriter.visitJumpInsn(160, label6);
                    methodWriter.visitInsn(1);
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    methodWriter.visitLabel(label6);
                } else if (cls == Short.class) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i3);
                    String str11 = JSONLexerBase;
                    methodWriter.visitMethodInsn(182, str11, "scanInt", "(C)I");
                    methodWriter.visitMethodInsn(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    Label label7 = new Label();
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitFieldInsn(180, str11, "matchStat", "I");
                    methodWriter.visitLdcInsn(num);
                    methodWriter.visitJumpInsn(160, label7);
                    methodWriter.visitInsn(1);
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    methodWriter.visitLabel(label7);
                } else if (cls == Integer.class) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i3);
                    String str12 = JSONLexerBase;
                    methodWriter.visitMethodInsn(182, str12, "scanInt", "(C)I");
                    methodWriter.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    Label label8 = new Label();
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitFieldInsn(180, str12, "matchStat", "I");
                    methodWriter.visitLdcInsn(num);
                    methodWriter.visitJumpInsn(160, label8);
                    methodWriter.visitInsn(1);
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    methodWriter.visitLabel(label8);
                } else if (cls == Long.TYPE) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i3);
                    methodWriter.visitMethodInsn(182, JSONLexerBase, "scanLong", "(C)J");
                    methodWriter.visitVarInsn(55, context.var(fieldInfo.name + "_asm", 2));
                } else if (cls == Long.class) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i3);
                    String str13 = JSONLexerBase;
                    methodWriter.visitMethodInsn(182, str13, "scanLong", "(C)J");
                    methodWriter.visitMethodInsn(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    Label label9 = new Label();
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitFieldInsn(180, str13, "matchStat", "I");
                    methodWriter.visitLdcInsn(num);
                    methodWriter.visitJumpInsn(160, label9);
                    methodWriter.visitInsn(1);
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    methodWriter.visitLabel(label9);
                } else if (cls == Boolean.TYPE) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i3);
                    methodWriter.visitMethodInsn(182, JSONLexerBase, "scanBoolean", "(C)Z");
                    methodWriter.visitVarInsn(54, context.var(fieldInfo.name + "_asm"));
                } else if (cls == Float.TYPE) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i3);
                    methodWriter.visitMethodInsn(182, JSONLexerBase, "scanFloat", "(C)F");
                    methodWriter.visitVarInsn(56, context.var(fieldInfo.name + "_asm"));
                } else if (cls == Float.class) {
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitVarInsn(16, i3);
                    String str14 = JSONLexerBase;
                    methodWriter.visitMethodInsn(182, str14, "scanFloat", "(C)F");
                    methodWriter.visitMethodInsn(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    Label label10 = new Label();
                    methodWriter.visitVarInsn(25, context.var("lexer"));
                    methodWriter.visitFieldInsn(180, str14, "matchStat", "I");
                    methodWriter.visitLdcInsn(num);
                    methodWriter.visitJumpInsn(160, label10);
                    methodWriter.visitInsn(1);
                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                    methodWriter.visitLabel(label10);
                } else {
                    if (cls == Double.TYPE) {
                        methodWriter.visitVarInsn(25, context.var("lexer"));
                        methodWriter.visitVarInsn(16, i3);
                        methodWriter.visitMethodInsn(182, JSONLexerBase, "scanDouble", "(C)D");
                        methodWriter.visitVarInsn(57, context.var(fieldInfo.name + "_asm", 2));
                        aSMDeserializerFactory = this;
                        c = (char) 2;
                        num = num;
                        str7 = str7;
                        num3 = num3;
                        str2 = str9;
                    } else if (cls == Double.class) {
                        methodWriter.visitVarInsn(25, context.var("lexer"));
                        methodWriter.visitVarInsn(16, i3);
                        String str15 = JSONLexerBase;
                        methodWriter.visitMethodInsn(182, str15, "scanDouble", "(C)D");
                        methodWriter.visitMethodInsn(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
                        methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                        Label label11 = new Label();
                        methodWriter.visitVarInsn(25, context.var("lexer"));
                        methodWriter.visitFieldInsn(180, str15, "matchStat", "I");
                        methodWriter.visitLdcInsn(num);
                        methodWriter.visitJumpInsn(160, label11);
                        methodWriter.visitInsn(1);
                        methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                        methodWriter.visitLabel(label11);
                    } else if (cls == Character.TYPE) {
                        methodWriter.visitVarInsn(25, context.var("lexer"));
                        methodWriter.visitVarInsn(16, i3);
                        methodWriter.visitMethodInsn(182, JSONLexerBase, "scanString", "(C)Ljava/lang/String;");
                        methodWriter.visitInsn(3);
                        methodWriter.visitMethodInsn(182, "java/lang/String", "charAt", "(I)C");
                        methodWriter.visitVarInsn(54, context.var(fieldInfo.name + "_asm"));
                    } else {
                        if (cls == String.class) {
                            methodWriter.visitVarInsn(25, context.var("lexer"));
                            methodWriter.visitVarInsn(16, i3);
                            methodWriter.visitMethodInsn(182, JSONLexerBase, "scanString", "(C)Ljava/lang/String;");
                            methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                        } else if (cls == BigDecimal.class) {
                            methodWriter.visitVarInsn(25, context.var("lexer"));
                            methodWriter.visitVarInsn(16, i3);
                            methodWriter.visitMethodInsn(182, JSONLexerBase, "scanDecimal", "(C)Ljava/math/BigDecimal;");
                            methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                        } else if (cls == Date.class) {
                            methodWriter.visitVarInsn(25, context.var("lexer"));
                            methodWriter.visitVarInsn(16, i3);
                            methodWriter.visitMethodInsn(182, JSONLexerBase, "scanDate", "(C)Ljava/util/Date;");
                            methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                        } else if (cls == UUID.class) {
                            methodWriter.visitVarInsn(25, context.var("lexer"));
                            methodWriter.visitVarInsn(16, i3);
                            methodWriter.visitMethodInsn(182, JSONLexerBase, "scanUUID", "(C)Ljava/util/UUID;");
                            methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                        } else if (cls.isEnum()) {
                            Label label12 = new Label();
                            Label label13 = new Label();
                            Label label14 = new Label();
                            Label label15 = new Label();
                            methodWriter.visitVarInsn(25, context.var("lexer"));
                            String str16 = JSONLexerBase;
                            methodWriter.visitMethodInsn(182, str16, "getCurrent", "()C");
                            methodWriter.visitInsn(89);
                            methodWriter.visitVarInsn(54, context.var("ch"));
                            methodWriter.visitLdcInsn(110);
                            methodWriter.visitJumpInsn(159, label15);
                            methodWriter.visitVarInsn(21, context.var("ch"));
                            methodWriter.visitLdcInsn(34);
                            methodWriter.visitJumpInsn(160, label12);
                            methodWriter.visitLabel(label15);
                            methodWriter.visitVarInsn(25, context.var("lexer"));
                            methodWriter.visitLdcInsn(Type.getType(ASMUtils.desc(cls)));
                            methodWriter.visitVarInsn(25, 1);
                            methodWriter.visitMethodInsn(182, DefaultJSONParser, "getSymbolTable", str + ASMUtils.desc((Class<?>) SymbolTable.class));
                            methodWriter.visitVarInsn(16, i3);
                            methodWriter.visitMethodInsn(182, str16, "scanEnum", "(Ljava/lang/Class;" + ASMUtils.desc((Class<?>) SymbolTable.class) + "C)Ljava/lang/Enum;");
                            methodWriter.visitJumpInsn(167, label14);
                            methodWriter.visitLabel(label12);
                            methodWriter.visitVarInsn(21, context.var("ch"));
                            methodWriter.visitLdcInsn(48);
                            methodWriter.visitJumpInsn(161, label13);
                            methodWriter.visitVarInsn(21, context.var("ch"));
                            methodWriter.visitLdcInsn(57);
                            methodWriter.visitJumpInsn(163, label13);
                            aSMDeserializerFactory = this;
                            aSMDeserializerFactory._getFieldDeser(context, methodWriter, fieldInfo);
                            methodWriter.visitTypeInsn(192, ASMUtils.type(EnumDeserializer.class));
                            methodWriter.visitVarInsn(25, context.var("lexer"));
                            methodWriter.visitVarInsn(16, i3);
                            methodWriter.visitMethodInsn(182, str16, "scanInt", "(C)I");
                            methodWriter.visitMethodInsn(182, ASMUtils.type(EnumDeserializer.class), "valueOf", "(I)Ljava/lang/Enum;");
                            methodWriter.visitJumpInsn(167, label14);
                            methodWriter.visitLabel(label13);
                            methodWriter.visitVarInsn(25, 0);
                            methodWriter.visitVarInsn(25, context.var("lexer"));
                            methodWriter.visitVarInsn(16, i3);
                            methodWriter.visitMethodInsn(182, ASMUtils.type(JavaBeanDeserializer.class), "scanEnum", str9 + str16 + ";C)Ljava/lang/Enum;");
                            methodWriter.visitLabel(label14);
                            methodWriter.visitTypeInsn(192, ASMUtils.type(cls));
                            methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                            str2 = str9;
                            c = 2;
                        } else {
                            num = num;
                            aSMDeserializerFactory = this;
                            str2 = str9;
                            if (Collection.class.isAssignableFrom(cls)) {
                                Class<?> collectionItemClass = TypeUtils.getCollectionItemClass(type);
                                if (collectionItemClass == String.class) {
                                    if (cls == List.class || cls == Collections.class || cls == ArrayList.class) {
                                        methodWriter.visitTypeInsn(187, ASMUtils.type(ArrayList.class));
                                        methodWriter.visitInsn(89);
                                        methodWriter.visitMethodInsn(183, ASMUtils.type(ArrayList.class), "<init>", "()V");
                                    } else {
                                        methodWriter.visitLdcInsn(Type.getType(ASMUtils.desc(cls)));
                                        methodWriter.visitMethodInsn(184, ASMUtils.type(TypeUtils.class), "createCollection", "(Ljava/lang/Class;)Ljava/util/Collection;");
                                    }
                                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                                    methodWriter.visitVarInsn(25, context.var("lexer"));
                                    methodWriter.visitVarInsn(25, context.var(fieldInfo.name + "_asm"));
                                    methodWriter.visitVarInsn(16, i3);
                                    String str17 = JSONLexerBase;
                                    methodWriter.visitMethodInsn(182, str17, "scanStringArray", "(Ljava/util/Collection;C)V");
                                    Label label16 = new Label();
                                    methodWriter.visitVarInsn(25, context.var("lexer"));
                                    methodWriter.visitFieldInsn(180, str17, "matchStat", "I");
                                    methodWriter.visitLdcInsn(num);
                                    methodWriter.visitJumpInsn(160, label16);
                                    methodWriter.visitInsn(1);
                                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                                    methodWriter.visitLabel(label16);
                                    i = i5;
                                    c3 = 184;
                                } else {
                                    Label label17 = new Label();
                                    methodWriter.visitVarInsn(25, context.var("lexer"));
                                    String str18 = JSONLexerBase;
                                    methodWriter.visitMethodInsn(182, str18, "token", "()I");
                                    methodWriter.visitVarInsn(54, context.var("token"));
                                    methodWriter.visitVarInsn(21, context.var("token"));
                                    int i6 = i5 == 0 ? 14 : 16;
                                    methodWriter.visitLdcInsn(Integer.valueOf(i6));
                                    methodWriter.visitJumpInsn(159, label17);
                                    methodWriter.visitVarInsn(25, 1);
                                    methodWriter.visitLdcInsn(Integer.valueOf(i6));
                                    String str19 = DefaultJSONParser;
                                    num = num;
                                    methodWriter.visitMethodInsn(182, str19, "throwException", "(I)V");
                                    methodWriter.visitLabel(label17);
                                    Label label18 = new Label();
                                    Label label19 = new Label();
                                    methodWriter.visitVarInsn(25, context.var("lexer"));
                                    methodWriter.visitMethodInsn(182, str18, "getCurrent", "()C");
                                    methodWriter.visitVarInsn(16, 91);
                                    methodWriter.visitJumpInsn(160, label18);
                                    methodWriter.visitVarInsn(25, context.var("lexer"));
                                    methodWriter.visitMethodInsn(182, str18, "next", "()C");
                                    methodWriter.visitInsn(87);
                                    methodWriter.visitVarInsn(25, context.var("lexer"));
                                    methodWriter.visitLdcInsn(14);
                                    methodWriter.visitMethodInsn(182, str18, "setToken", "(I)V");
                                    methodWriter.visitJumpInsn(167, label19);
                                    methodWriter.visitLabel(label18);
                                    methodWriter.visitVarInsn(25, context.var("lexer"));
                                    methodWriter.visitLdcInsn(14);
                                    methodWriter.visitMethodInsn(182, str18, "nextToken", "(I)V");
                                    methodWriter.visitLabel(label19);
                                    i = i5;
                                    aSMDeserializerFactory._newCollection(methodWriter, cls, i, false);
                                    methodWriter.visitInsn(89);
                                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                                    aSMDeserializerFactory._getCollectionFieldItemDeser(context, methodWriter, fieldInfo, collectionItemClass);
                                    methodWriter.visitVarInsn(25, 1);
                                    methodWriter.visitLdcInsn(Type.getType(ASMUtils.desc(collectionItemClass)));
                                    methodWriter.visitVarInsn(25, 3);
                                    c3 = 184;
                                    methodWriter.visitMethodInsn(184, ASMUtils.type(JavaBeanDeserializer.class), "parseArray", "(Ljava/util/Collection;" + ASMUtils.desc((Class<?>) ObjectDeserializer.class) + "L" + str19 + ";Ljava/lang/reflect/Type;Ljava/lang/Object;)V");
                                }
                                i5 = i;
                                c2 = c3;
                            } else if (cls.isArray()) {
                                methodWriter.visitVarInsn(25, context.var("lexer"));
                                methodWriter.visitLdcInsn(14);
                                methodWriter.visitMethodInsn(182, JSONLexerBase, "nextToken", "(I)V");
                                methodWriter.visitVarInsn(25, 1);
                                methodWriter.visitVarInsn(25, 0);
                                methodWriter.visitLdcInsn(Integer.valueOf(i5));
                                methodWriter.visitMethodInsn(182, ASMUtils.type(JavaBeanDeserializer.class), "getFieldType", "(I)Ljava/lang/reflect/Type;");
                                methodWriter.visitMethodInsn(182, DefaultJSONParser, "parseObject", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;");
                                methodWriter.visitTypeInsn(192, ASMUtils.type(cls));
                                methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                                i5 = i5;
                                c2 = (char) 184;
                            } else {
                                Label label20 = new Label();
                                Label label21 = new Label();
                                if (cls == Date.class) {
                                    i5 = i5;
                                    methodWriter.visitVarInsn(25, context.var("lexer"));
                                    String str20 = JSONLexerBase;
                                    methodWriter.visitMethodInsn(182, str20, "getCurrent", "()C");
                                    methodWriter.visitLdcInsn(49);
                                    methodWriter.visitJumpInsn(160, label20);
                                    methodWriter.visitTypeInsn(187, ASMUtils.type(Date.class));
                                    methodWriter.visitInsn(89);
                                    methodWriter.visitVarInsn(25, context.var("lexer"));
                                    methodWriter.visitVarInsn(16, i3);
                                    methodWriter.visitMethodInsn(182, str20, "scanLong", "(C)J");
                                    methodWriter.visitMethodInsn(183, ASMUtils.type(Date.class), "<init>", "(J)V");
                                    methodWriter.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
                                    methodWriter.visitJumpInsn(167, label21);
                                } else {
                                    i5 = i5;
                                }
                                methodWriter.visitLabel(label20);
                                aSMDeserializerFactory._quickNextToken(context, methodWriter, 14);
                                c = 2;
                                aSMDeserializerFactory._deserObject(context, methodWriter, fieldInfo, cls, i5);
                                aSMDeserializerFactory = aSMDeserializerFactory;
                                methodWriter.visitVarInsn(25, context.var("lexer"));
                                methodWriter.visitMethodInsn(182, JSONLexerBase, "token", "()I");
                                methodWriter.visitLdcInsn(15);
                                methodWriter.visitJumpInsn(159, label21);
                                methodWriter.visitVarInsn(25, 0);
                                methodWriter.visitVarInsn(25, context.var("lexer"));
                                if (z2) {
                                    num3 = num3;
                                    methodWriter.visitLdcInsn(15);
                                } else {
                                    num3 = num3;
                                    methodWriter.visitLdcInsn(num3);
                                }
                                str7 = str7;
                                methodWriter.visitMethodInsn(183, ASMUtils.type(JavaBeanDeserializer.class), "check", str7 + ASMUtils.desc((Class<?>) JSONLexer.class) + "I)V");
                                methodWriter.visitLabel(label21);
                            }
                            c = 2;
                        }
                        aSMDeserializerFactory = this;
                        str2 = str9;
                        c = 2;
                    }
                    c2 = 184;
                }
                aSMDeserializerFactory = this;
                str2 = str9;
                c = 2;
                c2 = 184;
            }
            ASMDeserializerFactory aSMDeserializerFactory3 = aSMDeserializerFactory;
            i2 = i5 + 1;
            aSMDeserializerFactory2 = aSMDeserializerFactory3;
            num2 = num3;
            str6 = str7;
            fieldInfoArr = fieldInfoArr2;
            length = i4;
            str5 = str;
            str3 = str2;
            num = num;
        }
    }

    private void _deserialze_list_obj(Context context, MethodVisitor methodVisitor, Label label, FieldInfo fieldInfo, Class<?> cls, Class<?> cls2, int i) {
        String str;
        String str2;
        String str3;
        Label label2 = new Label();
        String str4 = JSONLexerBase;
        methodVisitor.visitMethodInsn(182, str4, "matchField", "([C)Z");
        methodVisitor.visitJumpInsn(153, label2);
        _setFlag(methodVisitor, context, i);
        Label label3 = new Label();
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str4, "token", "()I");
        methodVisitor.visitLdcInsn(8);
        methodVisitor.visitJumpInsn(160, label3);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitLdcInsn(16);
        methodVisitor.visitMethodInsn(182, str4, "nextToken", "(I)V");
        methodVisitor.visitJumpInsn(167, label2);
        methodVisitor.visitLabel(label3);
        Label label4 = new Label();
        Label label5 = new Label();
        Label label6 = new Label();
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str4, "token", "()I");
        methodVisitor.visitLdcInsn(21);
        methodVisitor.visitJumpInsn(160, label5);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitLdcInsn(14);
        methodVisitor.visitMethodInsn(182, str4, "nextToken", "(I)V");
        _newCollection(methodVisitor, cls, i, true);
        methodVisitor.visitJumpInsn(167, label4);
        methodVisitor.visitLabel(label5);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str4, "token", "()I");
        methodVisitor.visitLdcInsn(14);
        methodVisitor.visitJumpInsn(159, label6);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str4, "token", "()I");
        methodVisitor.visitLdcInsn(12);
        methodVisitor.visitJumpInsn(160, label);
        _newCollection(methodVisitor, cls, i, false);
        methodVisitor.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
        _getCollectionFieldItemDeser(context, methodVisitor, fieldInfo, cls2);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls2)));
        methodVisitor.visitInsn(3);
        methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        String strType = ASMUtils.type(ObjectDeserializer.class);
        StringBuilder sb = new StringBuilder("(L");
        String str5 = DefaultJSONParser;
        sb.append(str5);
        sb.append(";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;");
        methodVisitor.visitMethodInsn(185, strType, "deserialze", sb.toString());
        methodVisitor.visitVarInsn(58, context.var("list_item_value"));
        methodVisitor.visitVarInsn(25, context.var(fieldInfo.name + "_asm"));
        methodVisitor.visitVarInsn(25, context.var("list_item_value"));
        if (cls.isInterface()) {
            methodVisitor.visitMethodInsn(185, ASMUtils.type(cls), "add", "(Ljava/lang/Object;)Z");
        } else {
            methodVisitor.visitMethodInsn(182, ASMUtils.type(cls), "add", "(Ljava/lang/Object;)Z");
        }
        methodVisitor.visitInsn(87);
        methodVisitor.visitJumpInsn(167, label2);
        methodVisitor.visitLabel(label6);
        _newCollection(methodVisitor, cls, i, false);
        methodVisitor.visitLabel(label4);
        methodVisitor.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
        boolean zIsPrimitive2 = ParserConfig.isPrimitive2(fieldInfo.fieldClass);
        _getCollectionFieldItemDeser(context, methodVisitor, fieldInfo, cls2);
        if (zIsPrimitive2) {
            methodVisitor.visitMethodInsn(185, ASMUtils.type(ObjectDeserializer.class), "getFastMatchToken", "()I");
            methodVisitor.visitVarInsn(54, context.var("fastMatchToken"));
            methodVisitor.visitVarInsn(25, context.var("lexer"));
            methodVisitor.visitVarInsn(21, context.var("fastMatchToken"));
            str = str4;
            str2 = "nextToken";
            str3 = "(I)V";
            methodVisitor.visitMethodInsn(182, str, str2, str3);
        } else {
            str = str4;
            str2 = "nextToken";
            str3 = "(I)V";
            methodVisitor.visitInsn(87);
            methodVisitor.visitLdcInsn(12);
            methodVisitor.visitVarInsn(54, context.var("fastMatchToken"));
            _quickNextToken(context, methodVisitor, 12);
        }
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitMethodInsn(182, str5, "getContext", "()" + ASMUtils.desc((Class<?>) ParseContext.class));
        methodVisitor.visitVarInsn(58, context.var("listContext"));
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, context.var(fieldInfo.name + "_asm"));
        methodVisitor.visitLdcInsn(fieldInfo.name);
        methodVisitor.visitMethodInsn(182, str5, "setContext", "(Ljava/lang/Object;Ljava/lang/Object;)" + ASMUtils.desc((Class<?>) ParseContext.class));
        methodVisitor.visitInsn(87);
        Label label7 = new Label();
        Label label8 = new Label();
        methodVisitor.visitInsn(3);
        String str6 = str3;
        String str7 = str2;
        methodVisitor.visitVarInsn(54, context.var(RXScreenCaptureService.KEY_INDEX));
        methodVisitor.visitLabel(label7);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str, "token", "()I");
        methodVisitor.visitLdcInsn(15);
        methodVisitor.visitJumpInsn(159, label8);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_list_item_deser__", ASMUtils.desc((Class<?>) ObjectDeserializer.class));
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls2)));
        methodVisitor.visitVarInsn(21, context.var(RXScreenCaptureService.KEY_INDEX));
        methodVisitor.visitMethodInsn(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        methodVisitor.visitMethodInsn(185, ASMUtils.type(ObjectDeserializer.class), "deserialze", "(L" + str5 + ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;");
        methodVisitor.visitVarInsn(58, context.var("list_item_value"));
        methodVisitor.visitIincInsn(context.var(RXScreenCaptureService.KEY_INDEX), 1);
        methodVisitor.visitVarInsn(25, context.var(fieldInfo.name + "_asm"));
        methodVisitor.visitVarInsn(25, context.var("list_item_value"));
        if (cls.isInterface()) {
            methodVisitor.visitMethodInsn(185, ASMUtils.type(cls), "add", "(Ljava/lang/Object;)Z");
        } else {
            methodVisitor.visitMethodInsn(182, ASMUtils.type(cls), "add", "(Ljava/lang/Object;)Z");
        }
        methodVisitor.visitInsn(87);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, context.var(fieldInfo.name + "_asm"));
        methodVisitor.visitMethodInsn(182, str5, "checkListResolve", "(Ljava/util/Collection;)V");
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str, "token", "()I");
        methodVisitor.visitLdcInsn(16);
        methodVisitor.visitJumpInsn(160, label7);
        if (zIsPrimitive2) {
            methodVisitor.visitVarInsn(25, context.var("lexer"));
            methodVisitor.visitVarInsn(21, context.var("fastMatchToken"));
            methodVisitor.visitMethodInsn(182, str, str7, str6);
        } else {
            _quickNextToken(context, methodVisitor, 12);
        }
        methodVisitor.visitJumpInsn(167, label7);
        methodVisitor.visitLabel(label8);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, context.var("listContext"));
        methodVisitor.visitMethodInsn(182, str5, "setContext", "(" + ASMUtils.desc((Class<?>) ParseContext.class) + ")V");
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str, "token", "()I");
        methodVisitor.visitLdcInsn(15);
        methodVisitor.visitJumpInsn(160, label);
        _quickNextTokenComma(context, methodVisitor);
        methodVisitor.visitLabel(label2);
    }

    private void _deserialze_obj(Context context, MethodVisitor methodVisitor, Label label, FieldInfo fieldInfo, Class<?> cls, int i) {
        Label label2 = new Label();
        Label label3 = new Label();
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_prefix__", "[C");
        methodVisitor.visitMethodInsn(182, JSONLexerBase, "matchField", "([C)Z");
        methodVisitor.visitJumpInsn(154, label2);
        methodVisitor.visitInsn(1);
        methodVisitor.visitVarInsn(58, context.var(fieldInfo.name + "_asm"));
        methodVisitor.visitJumpInsn(167, label3);
        methodVisitor.visitLabel(label2);
        _setFlag(methodVisitor, context, i);
        methodVisitor.visitVarInsn(21, context.var("matchedCount"));
        methodVisitor.visitInsn(4);
        methodVisitor.visitInsn(96);
        methodVisitor.visitVarInsn(54, context.var("matchedCount"));
        _deserObject(context, methodVisitor, fieldInfo, cls, i);
        methodVisitor.visitVarInsn(25, 1);
        String str = DefaultJSONParser;
        methodVisitor.visitMethodInsn(182, str, "getResolveStatus", "()I");
        methodVisitor.visitLdcInsn(1);
        methodVisitor.visitJumpInsn(160, label3);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitMethodInsn(182, str, "getLastResolveTask", "()" + ASMUtils.desc((Class<?>) DefaultJSONParser.ResolveTask.class));
        methodVisitor.visitVarInsn(58, context.var("resolveTask"));
        methodVisitor.visitVarInsn(25, context.var("resolveTask"));
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitMethodInsn(182, str, "getContext", "()" + ASMUtils.desc((Class<?>) ParseContext.class));
        methodVisitor.visitFieldInsn(181, ASMUtils.type(DefaultJSONParser.ResolveTask.class), "ownerContext", ASMUtils.desc((Class<?>) ParseContext.class));
        methodVisitor.visitVarInsn(25, context.var("resolveTask"));
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitLdcInsn(fieldInfo.name);
        methodVisitor.visitMethodInsn(182, ASMUtils.type(JavaBeanDeserializer.class), "getFieldDeserializer", "(Ljava/lang/String;)" + ASMUtils.desc((Class<?>) FieldDeserializer.class));
        methodVisitor.visitFieldInsn(181, ASMUtils.type(DefaultJSONParser.ResolveTask.class), "fieldDeserializer", ASMUtils.desc((Class<?>) FieldDeserializer.class));
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitLdcInsn(0);
        methodVisitor.visitMethodInsn(182, str, "setResolveStatus", "(I)V");
        methodVisitor.visitLabel(label3);
    }

    private void _getCollectionFieldItemDeser(Context context, MethodVisitor methodVisitor, FieldInfo fieldInfo, Class<?> cls) {
        Label label = new Label();
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_list_item_deser__", ASMUtils.desc((Class<?>) ObjectDeserializer.class));
        methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitMethodInsn(182, DefaultJSONParser, "getConfig", "()" + ASMUtils.desc((Class<?>) ParserConfig.class));
        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls)));
        methodVisitor.visitMethodInsn(182, ASMUtils.type(ParserConfig.class), "getDeserializer", "(Ljava/lang/reflect/Type;)" + ASMUtils.desc((Class<?>) ObjectDeserializer.class));
        methodVisitor.visitFieldInsn(181, context.className, fieldInfo.name + "_asm_list_item_deser__", ASMUtils.desc((Class<?>) ObjectDeserializer.class));
        methodVisitor.visitLabel(label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_list_item_deser__", ASMUtils.desc((Class<?>) ObjectDeserializer.class));
    }

    private void _getFieldDeser(Context context, MethodVisitor methodVisitor, FieldInfo fieldInfo) {
        Label label = new Label();
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_deser__", ASMUtils.desc((Class<?>) ObjectDeserializer.class));
        methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitMethodInsn(182, DefaultJSONParser, "getConfig", "()" + ASMUtils.desc((Class<?>) ParserConfig.class));
        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(fieldInfo.fieldClass)));
        methodVisitor.visitMethodInsn(182, ASMUtils.type(ParserConfig.class), "getDeserializer", "(Ljava/lang/reflect/Type;)" + ASMUtils.desc((Class<?>) ObjectDeserializer.class));
        methodVisitor.visitFieldInsn(181, context.className, fieldInfo.name + "_asm_deser__", ASMUtils.desc((Class<?>) ObjectDeserializer.class));
        methodVisitor.visitLabel(label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, context.className, fieldInfo.name + "_asm_deser__", ASMUtils.desc((Class<?>) ObjectDeserializer.class));
    }

    private void _init(ClassWriter classWriter, Context context) {
        int length = context.fieldInfoList.length;
        for (int i = 0; i < length; i++) {
            new FieldWriter(classWriter, 1, context.fieldInfoList[i].name + "_asm_prefix__", "[C").visitEnd();
        }
        int length2 = context.fieldInfoList.length;
        for (int i2 = 0; i2 < length2; i2++) {
            FieldInfo fieldInfo = context.fieldInfoList[i2];
            Class<?> cls = fieldInfo.fieldClass;
            if (!cls.isPrimitive()) {
                boolean zIsAssignableFrom = Collection.class.isAssignableFrom(cls);
                String str = fieldInfo.name;
                if (zIsAssignableFrom) {
                    new FieldWriter(classWriter, 1, str + "_asm_list_item_deser__", ASMUtils.desc((Class<?>) ObjectDeserializer.class)).visitEnd();
                } else {
                    new FieldWriter(classWriter, 1, str + "_asm_deser__", ASMUtils.desc((Class<?>) ObjectDeserializer.class)).visitEnd();
                }
            }
        }
        MethodWriter methodWriter = new MethodWriter(classWriter, 1, "<init>", "(" + ASMUtils.desc((Class<?>) ParserConfig.class) + ASMUtils.desc((Class<?>) JavaBeanInfo.class) + ")V", null, null);
        methodWriter.visitVarInsn(25, 0);
        methodWriter.visitVarInsn(25, 1);
        methodWriter.visitVarInsn(25, 2);
        methodWriter.visitMethodInsn(183, ASMUtils.type(JavaBeanDeserializer.class), "<init>", "(" + ASMUtils.desc((Class<?>) ParserConfig.class) + ASMUtils.desc((Class<?>) JavaBeanInfo.class) + ")V");
        int length3 = context.fieldInfoList.length;
        for (int i3 = 0; i3 < length3; i3++) {
            FieldInfo fieldInfo2 = context.fieldInfoList[i3];
            methodWriter.visitVarInsn(25, 0);
            methodWriter.visitLdcInsn("\"" + fieldInfo2.name + "\":");
            methodWriter.visitMethodInsn(182, "java/lang/String", "toCharArray", "()[C");
            methodWriter.visitFieldInsn(181, context.className, fieldInfo2.name + "_asm_prefix__", "[C");
        }
        methodWriter.visitInsn(177);
        methodWriter.visitMaxs(4, 4);
        methodWriter.visitEnd();
    }

    private void _isFlag(MethodVisitor methodVisitor, Context context, int i, Label label) {
        methodVisitor.visitVarInsn(21, context.var("_asm_flag_" + (i / 32)));
        methodVisitor.visitLdcInsn(Integer.valueOf(1 << i));
        methodVisitor.visitInsn(126);
        methodVisitor.visitJumpInsn(153, label);
    }

    private void _loadAndSet(Context context, MethodVisitor methodVisitor, FieldInfo fieldInfo) {
        Class<?> cls = fieldInfo.fieldClass;
        java.lang.reflect.Type type = fieldInfo.fieldType;
        if (cls == Boolean.TYPE) {
            methodVisitor.visitVarInsn(25, context.var("instance"));
            methodVisitor.visitVarInsn(21, context.var(fieldInfo.name + "_asm"));
            _set(context, methodVisitor, fieldInfo);
            return;
        }
        if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Character.TYPE) {
            methodVisitor.visitVarInsn(25, context.var("instance"));
            methodVisitor.visitVarInsn(21, context.var(fieldInfo.name + "_asm"));
            _set(context, methodVisitor, fieldInfo);
            return;
        }
        if (cls == Long.TYPE) {
            methodVisitor.visitVarInsn(25, context.var("instance"));
            methodVisitor.visitVarInsn(22, context.var(fieldInfo.name + "_asm", 2));
            if (fieldInfo.method == null) {
                methodVisitor.visitFieldInsn(181, ASMUtils.type(fieldInfo.declaringClass), fieldInfo.field.getName(), ASMUtils.desc(fieldInfo.fieldClass));
                return;
            }
            methodVisitor.visitMethodInsn(182, ASMUtils.type(context.getInstClass()), fieldInfo.method.getName(), ASMUtils.desc(fieldInfo.method));
            if (fieldInfo.method.getReturnType().equals(Void.TYPE)) {
                return;
            }
            methodVisitor.visitInsn(87);
            return;
        }
        if (cls == Float.TYPE) {
            methodVisitor.visitVarInsn(25, context.var("instance"));
            methodVisitor.visitVarInsn(23, context.var(fieldInfo.name + "_asm"));
            _set(context, methodVisitor, fieldInfo);
            return;
        }
        if (cls == Double.TYPE) {
            methodVisitor.visitVarInsn(25, context.var("instance"));
            methodVisitor.visitVarInsn(24, context.var(fieldInfo.name + "_asm", 2));
            _set(context, methodVisitor, fieldInfo);
            return;
        }
        if (cls == String.class) {
            methodVisitor.visitVarInsn(25, context.var("instance"));
            methodVisitor.visitVarInsn(25, context.var(fieldInfo.name + "_asm"));
            _set(context, methodVisitor, fieldInfo);
            return;
        }
        if (cls.isEnum()) {
            methodVisitor.visitVarInsn(25, context.var("instance"));
            methodVisitor.visitVarInsn(25, context.var(fieldInfo.name + "_asm"));
            _set(context, methodVisitor, fieldInfo);
            return;
        }
        if (!Collection.class.isAssignableFrom(cls)) {
            methodVisitor.visitVarInsn(25, context.var("instance"));
            methodVisitor.visitVarInsn(25, context.var(fieldInfo.name + "_asm"));
            _set(context, methodVisitor, fieldInfo);
            return;
        }
        methodVisitor.visitVarInsn(25, context.var("instance"));
        Class<?> collectionItemClass = TypeUtils.getCollectionItemClass(type);
        String str = fieldInfo.name;
        if (collectionItemClass == String.class) {
            methodVisitor.visitVarInsn(25, context.var(str + "_asm"));
            methodVisitor.visitTypeInsn(192, ASMUtils.type(cls));
        } else {
            methodVisitor.visitVarInsn(25, context.var(str + "_asm"));
        }
        _set(context, methodVisitor, fieldInfo);
    }

    private void _newCollection(MethodVisitor methodVisitor, Class<?> cls, int i, boolean z) {
        if (cls.isAssignableFrom(ArrayList.class) && !z) {
            methodVisitor.visitTypeInsn(187, "java/util/ArrayList");
            methodVisitor.visitInsn(89);
            methodVisitor.visitMethodInsn(183, "java/util/ArrayList", "<init>", "()V");
        } else if (cls.isAssignableFrom(LinkedList.class) && !z) {
            methodVisitor.visitTypeInsn(187, ASMUtils.type(LinkedList.class));
            methodVisitor.visitInsn(89);
            methodVisitor.visitMethodInsn(183, ASMUtils.type(LinkedList.class), "<init>", "()V");
        } else if (cls.isAssignableFrom(HashSet.class)) {
            methodVisitor.visitTypeInsn(187, ASMUtils.type(HashSet.class));
            methodVisitor.visitInsn(89);
            methodVisitor.visitMethodInsn(183, ASMUtils.type(HashSet.class), "<init>", "()V");
        } else if (cls.isAssignableFrom(TreeSet.class)) {
            methodVisitor.visitTypeInsn(187, ASMUtils.type(TreeSet.class));
            methodVisitor.visitInsn(89);
            methodVisitor.visitMethodInsn(183, ASMUtils.type(TreeSet.class), "<init>", "()V");
        } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
            methodVisitor.visitTypeInsn(187, ASMUtils.type(LinkedHashSet.class));
            methodVisitor.visitInsn(89);
            methodVisitor.visitMethodInsn(183, ASMUtils.type(LinkedHashSet.class), "<init>", "()V");
        } else if (z) {
            methodVisitor.visitTypeInsn(187, ASMUtils.type(HashSet.class));
            methodVisitor.visitInsn(89);
            methodVisitor.visitMethodInsn(183, ASMUtils.type(HashSet.class), "<init>", "()V");
        } else {
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitLdcInsn(Integer.valueOf(i));
            methodVisitor.visitMethodInsn(182, ASMUtils.type(JavaBeanDeserializer.class), "getFieldType", "(I)Ljava/lang/reflect/Type;");
            methodVisitor.visitMethodInsn(184, ASMUtils.type(TypeUtils.class), "createCollection", "(Ljava/lang/reflect/Type;)Ljava/util/Collection;");
        }
        methodVisitor.visitTypeInsn(192, ASMUtils.type(cls));
    }

    private void _quickNextToken(Context context, MethodVisitor methodVisitor, int i) {
        Label label = new Label();
        Label label2 = new Label();
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        String str = JSONLexerBase;
        methodVisitor.visitMethodInsn(182, str, "getCurrent", "()C");
        if (i == 12) {
            methodVisitor.visitVarInsn(16, 123);
        } else {
            if (i != 14) {
                ohg0.m164364a();
                return;
            }
            methodVisitor.visitVarInsn(16, 91);
        }
        methodVisitor.visitJumpInsn(160, label);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str, "next", "()C");
        methodVisitor.visitInsn(87);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitLdcInsn(Integer.valueOf(i));
        methodVisitor.visitMethodInsn(182, str, "setToken", "(I)V");
        methodVisitor.visitJumpInsn(167, label2);
        methodVisitor.visitLabel(label);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitLdcInsn(Integer.valueOf(i));
        methodVisitor.visitMethodInsn(182, str, "nextToken", "(I)V");
        methodVisitor.visitLabel(label2);
    }

    private void _quickNextTokenComma(Context context, MethodVisitor methodVisitor) {
        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
        Label label5 = new Label();
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        String str = JSONLexerBase;
        methodVisitor.visitMethodInsn(182, str, "getCurrent", "()C");
        methodVisitor.visitInsn(89);
        methodVisitor.visitVarInsn(54, context.var("ch"));
        methodVisitor.visitVarInsn(16, 44);
        methodVisitor.visitJumpInsn(160, label2);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str, "next", "()C");
        methodVisitor.visitInsn(87);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitLdcInsn(16);
        methodVisitor.visitMethodInsn(182, str, "setToken", "(I)V");
        methodVisitor.visitJumpInsn(167, label5);
        methodVisitor.visitLabel(label2);
        methodVisitor.visitVarInsn(21, context.var("ch"));
        methodVisitor.visitVarInsn(16, 125);
        methodVisitor.visitJumpInsn(160, label3);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str, "next", "()C");
        methodVisitor.visitInsn(87);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitLdcInsn(13);
        methodVisitor.visitMethodInsn(182, str, "setToken", "(I)V");
        methodVisitor.visitJumpInsn(167, label5);
        methodVisitor.visitLabel(label3);
        methodVisitor.visitVarInsn(21, context.var("ch"));
        methodVisitor.visitVarInsn(16, 93);
        methodVisitor.visitJumpInsn(160, label4);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str, "next", "()C");
        methodVisitor.visitInsn(87);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitLdcInsn(15);
        methodVisitor.visitMethodInsn(182, str, "setToken", "(I)V");
        methodVisitor.visitJumpInsn(167, label5);
        methodVisitor.visitLabel(label4);
        methodVisitor.visitVarInsn(21, context.var("ch"));
        methodVisitor.visitVarInsn(16, 26);
        methodVisitor.visitJumpInsn(160, label);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitLdcInsn(20);
        methodVisitor.visitMethodInsn(182, str, "setToken", "(I)V");
        methodVisitor.visitJumpInsn(167, label5);
        methodVisitor.visitLabel(label);
        methodVisitor.visitVarInsn(25, context.var("lexer"));
        methodVisitor.visitMethodInsn(182, str, "nextToken", "()V");
        methodVisitor.visitLabel(label5);
    }

    private void _set(Context context, MethodVisitor methodVisitor, FieldInfo fieldInfo) {
        Method method = fieldInfo.method;
        if (method == null) {
            methodVisitor.visitFieldInsn(181, ASMUtils.type(fieldInfo.declaringClass), fieldInfo.field.getName(), ASMUtils.desc(fieldInfo.fieldClass));
            return;
        }
        methodVisitor.visitMethodInsn(method.getDeclaringClass().isInterface() ? 185 : 182, ASMUtils.type(fieldInfo.declaringClass), method.getName(), ASMUtils.desc(method));
        if (fieldInfo.method.getReturnType().equals(Void.TYPE)) {
            return;
        }
        methodVisitor.visitInsn(87);
    }

    private void _setContext(Context context, MethodVisitor methodVisitor) {
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, context.var("context"));
        methodVisitor.visitMethodInsn(182, DefaultJSONParser, "setContext", "(" + ASMUtils.desc((Class<?>) ParseContext.class) + ")V");
        Label label = new Label();
        methodVisitor.visitVarInsn(25, context.var("childContext"));
        methodVisitor.visitJumpInsn(Opcodes.IFNULL, label);
        methodVisitor.visitVarInsn(25, context.var("childContext"));
        methodVisitor.visitVarInsn(25, context.var("instance"));
        methodVisitor.visitFieldInsn(181, ASMUtils.type(ParseContext.class), "object", "Ljava/lang/Object;");
        methodVisitor.visitLabel(label);
    }

    private void _setFlag(MethodVisitor methodVisitor, Context context, int i) {
        String str = "_asm_flag_" + (i / 32);
        methodVisitor.visitVarInsn(21, context.var(str));
        methodVisitor.visitLdcInsn(Integer.valueOf(1 << i));
        methodVisitor.visitInsn(128);
        methodVisitor.visitVarInsn(54, context.var(str));
    }

    private void defineVarLexer(Context context, MethodVisitor methodVisitor) {
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitFieldInsn(180, DefaultJSONParser, "lexer", ASMUtils.desc((Class<?>) JSONLexer.class));
        methodVisitor.visitTypeInsn(192, JSONLexerBase);
        methodVisitor.visitVarInsn(58, context.var("lexer"));
    }

    public ObjectDeserializer createJavaBeanDeserializer(ParserConfig parserConfig, JavaBeanInfo javaBeanInfo) throws Exception {
        String str;
        Class<?> cls = javaBeanInfo.clazz;
        if (cls.isPrimitive()) {
            ig3.m135964a("not support type :".concat(cls.getName()));
            return null;
        }
        String str2 = "FastjsonASMDeserializer_" + this.seed.incrementAndGet() + "_" + cls.getSimpleName();
        Package r1 = ASMDeserializerFactory.class.getPackage();
        if (r1 != null) {
            String name = r1.getName();
            String str3 = name.replace('.', '/') + "/" + str2;
            str2 = name + "." + str2;
            str = str3;
        } else {
            str = str2;
        }
        ClassWriter classWriter = new ClassWriter();
        classWriter.visit(49, 33, str, ASMUtils.type(JavaBeanDeserializer.class), null);
        _init(classWriter, new Context(str, parserConfig, javaBeanInfo, 3));
        _createInstance(classWriter, new Context(str, parserConfig, javaBeanInfo, 3));
        _deserialze(classWriter, new Context(str, parserConfig, javaBeanInfo, 5));
        _deserialzeArrayMapping(classWriter, new Context(str, parserConfig, javaBeanInfo, 4));
        byte[] byteArray = classWriter.toByteArray();
        return (ObjectDeserializer) this.classLoader.defineClassPublic(str2, byteArray, 0, byteArray.length).getConstructor(ParserConfig.class, JavaBeanInfo.class).newInstance(parserConfig, javaBeanInfo);
    }

    private void _batchSet(Context context, MethodVisitor methodVisitor) {
        _batchSet(context, methodVisitor, true);
    }

    public static class Context {
        static final int fieldName = 3;
        static final int parser = 1;
        static final int type = 2;
        private final JavaBeanInfo beanInfo;
        private final String className;
        private final Class<?> clazz;
        private FieldInfo[] fieldInfoList;
        private int variantIndex;
        private final Map<String, Integer> variants = new HashMap();

        public Context(String str, ParserConfig parserConfig, JavaBeanInfo javaBeanInfo, int i) {
            this.variantIndex = -1;
            this.className = str;
            this.clazz = javaBeanInfo.clazz;
            this.variantIndex = i;
            this.beanInfo = javaBeanInfo;
            this.fieldInfoList = javaBeanInfo.fields;
        }

        public Class<?> getInstClass() {
            Class<?> cls = this.beanInfo.builderClass;
            return cls == null ? this.clazz : cls;
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

    private void _createInstance(ClassWriter classWriter, Context context) {
        if (Modifier.isPublic(context.beanInfo.defaultConstructor.getModifiers())) {
            MethodWriter methodWriter = new MethodWriter(classWriter, 1, "createInstance", "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;)Ljava/lang/Object;", null, null);
            methodWriter.visitTypeInsn(187, ASMUtils.type(context.getInstClass()));
            methodWriter.visitInsn(89);
            methodWriter.visitMethodInsn(183, ASMUtils.type(context.getInstClass()), "<init>", "()V");
            methodWriter.visitInsn(176);
            methodWriter.visitMaxs(3, 3);
            methodWriter.visitEnd();
        }
    }
}
