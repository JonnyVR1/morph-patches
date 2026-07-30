package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.util.TypeUtils;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ListSerializer implements ObjectSerializer {
    public static final ListSerializer instance = new ListSerializer();

    /* JADX WARN: Code duplicated, block: B:106:0x0196 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #8 {all -> 0x018f, blocks: (B:101:0x0189, B:106:0x0196), top: B:133:0x0189 }] */
    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public final void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws Throwable {
        SerialContext serialContext;
        Type type2;
        JSONSerializer jSONSerializer2;
        Type type3;
        SerialContext serialContext2;
        JSONSerializer jSONSerializer3 = jSONSerializer;
        int i2 = i;
        SerializeWriter serializeWriter = jSONSerializer3.out;
        SerializerFeature serializerFeature = SerializerFeature.WriteClassName;
        boolean z = serializeWriter.isEnabled(serializerFeature) || SerializerFeature.isEnabled(i2, serializerFeature);
        SerializeWriter serializeWriter2 = jSONSerializer3.out;
        Type collectionItemType = z ? TypeUtils.getCollectionItemType(type) : null;
        if (obj == null) {
            serializeWriter2.writeNull(SerializerFeature.WriteNullListAsEmpty);
            return;
        }
        List list = (List) obj;
        if (list.size() == 0) {
            serializeWriter2.append((CharSequence) WeJson.EMPTY_ARR);
            return;
        }
        SerialContext serialContext3 = jSONSerializer3.context;
        Object obj3 = obj2;
        jSONSerializer3.setContext(serialContext3, obj, obj3, 0);
        try {
            if (serializeWriter2.isEnabled(SerializerFeature.PrettyFormat)) {
                try {
                    serializeWriter2.append('[');
                    jSONSerializer3.incrementIndent();
                    int i3 = 0;
                    for (Object obj4 : list) {
                        if (i3 != 0) {
                            serializeWriter2.append(',');
                        }
                        jSONSerializer3.println();
                        if (obj4 == null) {
                            type2 = collectionItemType;
                            jSONSerializer3.out.writeNull();
                        } else if (jSONSerializer3.containsReference(obj4)) {
                            jSONSerializer3.writeReference(obj4);
                            type2 = collectionItemType;
                        } else {
                            ObjectSerializer objectWriter = jSONSerializer3.getObjectWriter(obj4.getClass());
                            jSONSerializer3.context = new SerialContext(serialContext3, obj, obj3, 0, 0);
                            type2 = collectionItemType;
                            objectWriter.write(jSONSerializer3, obj4, Integer.valueOf(i3), type2, i2);
                        }
                        try {
                            i3++;
                            i2 = i;
                            collectionItemType = type2;
                            serialContext3 = serialContext3;
                            obj3 = obj2;
                        } catch (Throwable th) {
                            th = th;
                            serialContext = serialContext3;
                            jSONSerializer3.context = serialContext;
                            throw th;
                        }
                    }
                    serialContext3 = serialContext3;
                    jSONSerializer3.decrementIdent();
                    jSONSerializer3.println();
                    serializeWriter2.append(']');
                    jSONSerializer3.context = serialContext3;
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    serialContext3 = serialContext3;
                }
            } else {
                Type type4 = collectionItemType;
                serialContext = serialContext3;
                try {
                    serializeWriter2.append('[');
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        Object obj5 = list.get(i4);
                        if (i4 != 0) {
                            serializeWriter2.append(',');
                        }
                        if (obj5 == null) {
                            serializeWriter2.append((CharSequence) "null");
                        } else {
                            Class<?> cls = obj5.getClass();
                            if (cls == Integer.class) {
                                serializeWriter2.writeInt(((Integer) obj5).intValue());
                            } else if (cls == Long.class) {
                                long jLongValue = ((Long) obj5).longValue();
                                if (z) {
                                    serializeWriter2.writeLong(jLongValue);
                                    serializeWriter2.write(76);
                                } else {
                                    serializeWriter2.writeLong(jLongValue);
                                }
                            } else if ((SerializerFeature.DisableCircularReferenceDetect.mask & i) != 0) {
                                try {
                                    jSONSerializer3.getObjectWriter(obj5.getClass()).write(jSONSerializer3, obj5, Integer.valueOf(i4), type4, i);
                                    jSONSerializer2 = jSONSerializer3;
                                    type3 = type4;
                                    jSONSerializer3 = jSONSerializer2;
                                    type4 = type3;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } else {
                                jSONSerializer2 = jSONSerializer3;
                                type3 = type4;
                                try {
                                    if (serializeWriter2.disableCircularReferenceDetect) {
                                        serialContext2 = serialContext;
                                    } else {
                                        try {
                                            serialContext2 = serialContext;
                                            try {
                                                jSONSerializer2.context = new SerialContext(serialContext2, obj, obj2, 0, 0);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                serialContext = serialContext2;
                                                jSONSerializer3 = jSONSerializer2;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    }
                                    if (jSONSerializer2.containsReference(obj5)) {
                                        jSONSerializer2.writeReference(obj5);
                                        serialContext = serialContext2;
                                        jSONSerializer3 = jSONSerializer2;
                                        type4 = type3;
                                    } else {
                                        ObjectSerializer objectWriter2 = jSONSerializer2.getObjectWriter(obj5.getClass());
                                        if ((SerializerFeature.WriteClassName.mask & i) != 0) {
                                            try {
                                                if (objectWriter2 instanceof JavaBeanSerializer) {
                                                    type4 = type3;
                                                    serialContext = serialContext2;
                                                    try {
                                                        ((JavaBeanSerializer) objectWriter2).writeNoneASM(jSONSerializer2, obj5, Integer.valueOf(i4), type4, i);
                                                        jSONSerializer3 = jSONSerializer;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        jSONSerializer3 = jSONSerializer;
                                                        jSONSerializer3.context = serialContext;
                                                        throw th;
                                                    }
                                                } else {
                                                    type4 = type3;
                                                    serialContext = serialContext2;
                                                    jSONSerializer3 = jSONSerializer;
                                                    objectWriter2.write(jSONSerializer3, obj5, Integer.valueOf(i4), type4, i);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                serialContext = serialContext2;
                                            }
                                        } else {
                                            type4 = type3;
                                            serialContext = serialContext2;
                                            jSONSerializer3 = jSONSerializer;
                                            objectWriter2.write(jSONSerializer3, obj5, Integer.valueOf(i4), type4, i);
                                        }
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            }
                        }
                    }
                    serializeWriter2.append(']');
                    jSONSerializer3.context = serialContext;
                    return;
                } catch (Throwable th9) {
                    th = th9;
                }
            }
        } catch (Throwable th10) {
            th = th10;
            serialContext = serialContext3;
        }
        jSONSerializer3.context = serialContext;
        throw th;
    }
}
