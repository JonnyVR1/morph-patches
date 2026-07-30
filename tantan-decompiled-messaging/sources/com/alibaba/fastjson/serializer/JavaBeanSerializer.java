package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p149l.kzv;
import p149l.siq;

/* JADX INFO: loaded from: classes.dex */
public class JavaBeanSerializer extends SerializeFilterable implements ObjectSerializer {
    protected SerializeBeanInfo beanInfo;
    protected final FieldSerializer[] getters;
    private volatile transient long[] hashArray;
    private volatile transient short[] hashArrayMapping;
    protected final FieldSerializer[] sortedGetters;

    public JavaBeanSerializer(SerializeBeanInfo serializeBeanInfo) {
        FieldSerializer[] fieldSerializerArr;
        this.beanInfo = serializeBeanInfo;
        this.sortedGetters = new FieldSerializer[serializeBeanInfo.sortedFields.length];
        int i = 0;
        while (true) {
            fieldSerializerArr = this.sortedGetters;
            if (i >= fieldSerializerArr.length) {
                break;
            }
            fieldSerializerArr[i] = new FieldSerializer(serializeBeanInfo.beanType, serializeBeanInfo.sortedFields[i]);
            i++;
        }
        FieldInfo[] fieldInfoArr = serializeBeanInfo.fields;
        if (fieldInfoArr == serializeBeanInfo.sortedFields) {
            this.getters = fieldSerializerArr;
        } else {
            this.getters = new FieldSerializer[fieldInfoArr.length];
            for (int i2 = 0; i2 < this.getters.length; i2++) {
                FieldSerializer fieldSerializer = getFieldSerializer(serializeBeanInfo.fields[i2].name);
                if (fieldSerializer == null) {
                    FieldSerializer[] fieldSerializerArr2 = this.sortedGetters;
                    System.arraycopy(fieldSerializerArr2, 0, this.getters, 0, fieldSerializerArr2.length);
                    break;
                }
                this.getters[i2] = fieldSerializer;
            }
        }
        JSONType jSONType = serializeBeanInfo.jsonType;
        if (jSONType != null) {
            for (Class<? extends SerializeFilter> cls : jSONType.serialzeFilters()) {
                try {
                    addFilter(cls.getConstructor(null).newInstance(null));
                } catch (Exception unused) {
                }
            }
        }
        JSONType jSONType2 = serializeBeanInfo.jsonType;
        if (jSONType2 != null) {
            for (Class<? extends SerializeFilter> cls2 : jSONType2.serialzeFilters()) {
                try {
                    addFilter(cls2.getConstructor(null).newInstance(null));
                } catch (Exception unused2) {
                }
            }
        }
    }

    public static Map<String, String> createAliasMap(String... strArr) {
        HashMap map = new HashMap();
        for (String str : strArr) {
            map.put(str, str);
        }
        return map;
    }

    public boolean applyLabel(JSONSerializer jSONSerializer, String str) {
        List<LabelFilter> list = jSONSerializer.labelFilters;
        if (list != null) {
            Iterator<LabelFilter> it = list.iterator();
            while (it.hasNext()) {
                if (!it.next().apply(str)) {
                    return false;
                }
            }
        }
        List<LabelFilter> list2 = this.labelFilters;
        if (list2 == null) {
            return true;
        }
        Iterator<LabelFilter> it2 = list2.iterator();
        while (it2.hasNext()) {
            if (!it2.next().apply(str)) {
                return false;
            }
        }
        return true;
    }

    public BeanContext getBeanContext(int i) {
        return this.sortedGetters[i].fieldContext;
    }

    public Set<String> getFieldNames(Object obj) throws Exception {
        HashSet hashSet = new HashSet();
        for (FieldSerializer fieldSerializer : this.sortedGetters) {
            if (fieldSerializer.getPropertyValueDirect(obj) != null) {
                hashSet.add(fieldSerializer.fieldInfo.name);
            }
        }
        return hashSet;
    }

    public FieldSerializer getFieldSerializer(long j) {
        PropertyNamingStrategy[] propertyNamingStrategyArrValues;
        int iBinarySearch;
        if (this.hashArray == null) {
            propertyNamingStrategyArrValues = PropertyNamingStrategy.values();
            long[] jArr = new long[this.sortedGetters.length * propertyNamingStrategyArrValues.length];
            int i = 0;
            int i2 = 0;
            while (true) {
                FieldSerializer[] fieldSerializerArr = this.sortedGetters;
                if (i >= fieldSerializerArr.length) {
                    break;
                }
                String str = fieldSerializerArr[i].fieldInfo.name;
                jArr[i2] = TypeUtils.fnv1a_64(str);
                i2++;
                for (PropertyNamingStrategy propertyNamingStrategy : propertyNamingStrategyArrValues) {
                    String strTranslate = propertyNamingStrategy.translate(str);
                    if (!str.equals(strTranslate)) {
                        jArr[i2] = TypeUtils.fnv1a_64(strTranslate);
                        i2++;
                    }
                }
                i++;
            }
            Arrays.sort(jArr, 0, i2);
            this.hashArray = new long[i2];
            System.arraycopy(jArr, 0, this.hashArray, 0, i2);
        } else {
            propertyNamingStrategyArrValues = null;
        }
        int iBinarySearch2 = Arrays.binarySearch(this.hashArray, j);
        if (iBinarySearch2 < 0) {
            return null;
        }
        if (this.hashArrayMapping == null) {
            if (propertyNamingStrategyArrValues == null) {
                propertyNamingStrategyArrValues = PropertyNamingStrategy.values();
            }
            short[] sArr = new short[this.hashArray.length];
            Arrays.fill(sArr, (short) -1);
            int i3 = 0;
            while (true) {
                FieldSerializer[] fieldSerializerArr2 = this.sortedGetters;
                if (i3 >= fieldSerializerArr2.length) {
                    break;
                }
                String str2 = fieldSerializerArr2[i3].fieldInfo.name;
                int iBinarySearch3 = Arrays.binarySearch(this.hashArray, TypeUtils.fnv1a_64(str2));
                if (iBinarySearch3 >= 0) {
                    sArr[iBinarySearch3] = (short) i3;
                }
                for (PropertyNamingStrategy propertyNamingStrategy2 : propertyNamingStrategyArrValues) {
                    String strTranslate2 = propertyNamingStrategy2.translate(str2);
                    if (!str2.equals(strTranslate2) && (iBinarySearch = Arrays.binarySearch(this.hashArray, TypeUtils.fnv1a_64(strTranslate2))) >= 0) {
                        sArr[iBinarySearch] = (short) i3;
                    }
                }
                i3++;
            }
            this.hashArrayMapping = sArr;
        }
        short s = this.hashArrayMapping[iBinarySearch2];
        if (s != -1) {
            return this.sortedGetters[s];
        }
        return null;
    }

    public Type getFieldType(int i) {
        return this.sortedGetters[i].fieldInfo.fieldType;
    }

    public Object getFieldValue(Object obj, String str, long j, boolean z) {
        FieldSerializer fieldSerializer = getFieldSerializer(j);
        if (fieldSerializer == null) {
            if (!z) {
                return null;
            }
            siq.m184351a("field not found. ", str);
            return null;
        }
        try {
            return fieldSerializer.getPropertyValue(obj);
        } catch (IllegalAccessException e) {
            kzv.m147955a("getFieldValue error.", str, e);
            return null;
        } catch (InvocationTargetException e2) {
            kzv.m147955a("getFieldValue error.", str, e2);
            return null;
        }
    }

    public List<Object> getFieldValues(Object obj) throws Exception {
        ArrayList arrayList = new ArrayList(this.sortedGetters.length);
        for (FieldSerializer fieldSerializer : this.sortedGetters) {
            arrayList.add(fieldSerializer.getPropertyValue(obj));
        }
        return arrayList;
    }

    public Map<String, Object> getFieldValuesMap(Object obj) throws Exception {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.sortedGetters.length);
        for (FieldSerializer fieldSerializer : this.sortedGetters) {
            boolean zIsEnabled = SerializerFeature.isEnabled(fieldSerializer.features, SerializerFeature.SkipTransientField);
            FieldInfo fieldInfo = fieldSerializer.fieldInfo;
            if (!zIsEnabled || fieldInfo == null || !fieldInfo.fieldTransient) {
                if (fieldInfo.unwrapped) {
                    Object json = JSON.toJSON(fieldSerializer.getPropertyValue(obj));
                    if (json instanceof Map) {
                        linkedHashMap.putAll((Map) json);
                    } else {
                        linkedHashMap.put(fieldSerializer.fieldInfo.name, fieldSerializer.getPropertyValue(obj));
                    }
                } else {
                    linkedHashMap.put(fieldInfo.name, fieldSerializer.getPropertyValue(obj));
                }
            }
        }
        return linkedHashMap;
    }

    public List<Object> getObjectFieldValues(Object obj) throws Exception {
        ArrayList arrayList = new ArrayList(this.sortedGetters.length);
        for (FieldSerializer fieldSerializer : this.sortedGetters) {
            Class<?> cls = fieldSerializer.fieldInfo.fieldClass;
            if (!cls.isPrimitive() && !cls.getName().startsWith("java.lang.")) {
                arrayList.add(fieldSerializer.getPropertyValue(obj));
            }
        }
        return arrayList;
    }

    public int getSize(Object obj) throws Exception {
        int i = 0;
        for (FieldSerializer fieldSerializer : this.sortedGetters) {
            if (fieldSerializer.getPropertyValueDirect(obj) != null) {
                i++;
            }
        }
        return i;
    }

    public Class<?> getType() {
        return this.beanInfo.beanType;
    }

    public boolean isWriteAsArray(JSONSerializer jSONSerializer, int i) {
        int i2 = SerializerFeature.BeanToArray.mask;
        return ((this.beanInfo.features & i2) == 0 && !jSONSerializer.out.beanToArray && (i & i2) == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0178  */
    /* JADX WARN: Code duplicated, block: B:116:0x0188 A[Catch: all -> 0x0054, Exception -> 0x00ee, TryCatch #1 {Exception -> 0x00ee, blocks: (B:57:0x00bd, B:66:0x00e9, B:76:0x00fe, B:84:0x0113, B:86:0x0119, B:103:0x014a, B:106:0x0158, B:114:0x017a, B:116:0x0188, B:119:0x0197, B:121:0x01a3, B:125:0x01af, B:127:0x01bd, B:129:0x01c1, B:132:0x01cb, B:134:0x01cf, B:136:0x01d5, B:138:0x01db, B:140:0x01e9, B:142:0x01ed, B:145:0x01f7, B:147:0x01fb, B:150:0x0204, B:152:0x020c, B:154:0x021a, B:156:0x021e, B:159:0x0228, B:161:0x022c, B:163:0x0232, B:164:0x0237, B:166:0x023f, B:168:0x024d, B:170:0x0251, B:173:0x025b, B:175:0x025f, B:177:0x0265, B:179:0x026a, B:181:0x026e, B:91:0x0124), top: B:388:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0193  */
    /* JADX WARN: Code duplicated, block: B:119:0x0197 A[Catch: all -> 0x0054, Exception -> 0x00ee, TryCatch #1 {Exception -> 0x00ee, blocks: (B:57:0x00bd, B:66:0x00e9, B:76:0x00fe, B:84:0x0113, B:86:0x0119, B:103:0x014a, B:106:0x0158, B:114:0x017a, B:116:0x0188, B:119:0x0197, B:121:0x01a3, B:125:0x01af, B:127:0x01bd, B:129:0x01c1, B:132:0x01cb, B:134:0x01cf, B:136:0x01d5, B:138:0x01db, B:140:0x01e9, B:142:0x01ed, B:145:0x01f7, B:147:0x01fb, B:150:0x0204, B:152:0x020c, B:154:0x021a, B:156:0x021e, B:159:0x0228, B:161:0x022c, B:163:0x0232, B:164:0x0237, B:166:0x023f, B:168:0x024d, B:170:0x0251, B:173:0x025b, B:175:0x025f, B:177:0x0265, B:179:0x026a, B:181:0x026e, B:91:0x0124), top: B:388:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:121:0x01a3 A[Catch: all -> 0x0054, Exception -> 0x00ee, TryCatch #1 {Exception -> 0x00ee, blocks: (B:57:0x00bd, B:66:0x00e9, B:76:0x00fe, B:84:0x0113, B:86:0x0119, B:103:0x014a, B:106:0x0158, B:114:0x017a, B:116:0x0188, B:119:0x0197, B:121:0x01a3, B:125:0x01af, B:127:0x01bd, B:129:0x01c1, B:132:0x01cb, B:134:0x01cf, B:136:0x01d5, B:138:0x01db, B:140:0x01e9, B:142:0x01ed, B:145:0x01f7, B:147:0x01fb, B:150:0x0204, B:152:0x020c, B:154:0x021a, B:156:0x021e, B:159:0x0228, B:161:0x022c, B:163:0x0232, B:164:0x0237, B:166:0x023f, B:168:0x024d, B:170:0x0251, B:173:0x025b, B:175:0x025f, B:177:0x0265, B:179:0x026a, B:181:0x026e, B:91:0x0124), top: B:388:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:125:0x01af A[Catch: all -> 0x0054, Exception -> 0x00ee, TryCatch #1 {Exception -> 0x00ee, blocks: (B:57:0x00bd, B:66:0x00e9, B:76:0x00fe, B:84:0x0113, B:86:0x0119, B:103:0x014a, B:106:0x0158, B:114:0x017a, B:116:0x0188, B:119:0x0197, B:121:0x01a3, B:125:0x01af, B:127:0x01bd, B:129:0x01c1, B:132:0x01cb, B:134:0x01cf, B:136:0x01d5, B:138:0x01db, B:140:0x01e9, B:142:0x01ed, B:145:0x01f7, B:147:0x01fb, B:150:0x0204, B:152:0x020c, B:154:0x021a, B:156:0x021e, B:159:0x0228, B:161:0x022c, B:163:0x0232, B:164:0x0237, B:166:0x023f, B:168:0x024d, B:170:0x0251, B:173:0x025b, B:175:0x025f, B:177:0x0265, B:179:0x026a, B:181:0x026e, B:91:0x0124), top: B:388:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:137:0x01d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01db A[Catch: all -> 0x0054, Exception -> 0x00ee, TryCatch #1 {Exception -> 0x00ee, blocks: (B:57:0x00bd, B:66:0x00e9, B:76:0x00fe, B:84:0x0113, B:86:0x0119, B:103:0x014a, B:106:0x0158, B:114:0x017a, B:116:0x0188, B:119:0x0197, B:121:0x01a3, B:125:0x01af, B:127:0x01bd, B:129:0x01c1, B:132:0x01cb, B:134:0x01cf, B:136:0x01d5, B:138:0x01db, B:140:0x01e9, B:142:0x01ed, B:145:0x01f7, B:147:0x01fb, B:150:0x0204, B:152:0x020c, B:154:0x021a, B:156:0x021e, B:159:0x0228, B:161:0x022c, B:163:0x0232, B:164:0x0237, B:166:0x023f, B:168:0x024d, B:170:0x0251, B:173:0x025b, B:175:0x025f, B:177:0x0265, B:179:0x026a, B:181:0x026e, B:91:0x0124), top: B:388:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0204 A[Catch: all -> 0x0054, Exception -> 0x00ee, TryCatch #1 {Exception -> 0x00ee, blocks: (B:57:0x00bd, B:66:0x00e9, B:76:0x00fe, B:84:0x0113, B:86:0x0119, B:103:0x014a, B:106:0x0158, B:114:0x017a, B:116:0x0188, B:119:0x0197, B:121:0x01a3, B:125:0x01af, B:127:0x01bd, B:129:0x01c1, B:132:0x01cb, B:134:0x01cf, B:136:0x01d5, B:138:0x01db, B:140:0x01e9, B:142:0x01ed, B:145:0x01f7, B:147:0x01fb, B:150:0x0204, B:152:0x020c, B:154:0x021a, B:156:0x021e, B:159:0x0228, B:161:0x022c, B:163:0x0232, B:164:0x0237, B:166:0x023f, B:168:0x024d, B:170:0x0251, B:173:0x025b, B:175:0x025f, B:177:0x0265, B:179:0x026a, B:181:0x026e, B:91:0x0124), top: B:388:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:152:0x020c A[Catch: all -> 0x0054, Exception -> 0x00ee, TryCatch #1 {Exception -> 0x00ee, blocks: (B:57:0x00bd, B:66:0x00e9, B:76:0x00fe, B:84:0x0113, B:86:0x0119, B:103:0x014a, B:106:0x0158, B:114:0x017a, B:116:0x0188, B:119:0x0197, B:121:0x01a3, B:125:0x01af, B:127:0x01bd, B:129:0x01c1, B:132:0x01cb, B:134:0x01cf, B:136:0x01d5, B:138:0x01db, B:140:0x01e9, B:142:0x01ed, B:145:0x01f7, B:147:0x01fb, B:150:0x0204, B:152:0x020c, B:154:0x021a, B:156:0x021e, B:159:0x0228, B:161:0x022c, B:163:0x0232, B:164:0x0237, B:166:0x023f, B:168:0x024d, B:170:0x0251, B:173:0x025b, B:175:0x025f, B:177:0x0265, B:179:0x026a, B:181:0x026e, B:91:0x0124), top: B:388:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0237 A[Catch: all -> 0x0054, Exception -> 0x00ee, TryCatch #1 {Exception -> 0x00ee, blocks: (B:57:0x00bd, B:66:0x00e9, B:76:0x00fe, B:84:0x0113, B:86:0x0119, B:103:0x014a, B:106:0x0158, B:114:0x017a, B:116:0x0188, B:119:0x0197, B:121:0x01a3, B:125:0x01af, B:127:0x01bd, B:129:0x01c1, B:132:0x01cb, B:134:0x01cf, B:136:0x01d5, B:138:0x01db, B:140:0x01e9, B:142:0x01ed, B:145:0x01f7, B:147:0x01fb, B:150:0x0204, B:152:0x020c, B:154:0x021a, B:156:0x021e, B:159:0x0228, B:161:0x022c, B:163:0x0232, B:164:0x0237, B:166:0x023f, B:168:0x024d, B:170:0x0251, B:173:0x025b, B:175:0x025f, B:177:0x0265, B:179:0x026a, B:181:0x026e, B:91:0x0124), top: B:388:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:166:0x023f A[Catch: all -> 0x0054, Exception -> 0x00ee, TryCatch #1 {Exception -> 0x00ee, blocks: (B:57:0x00bd, B:66:0x00e9, B:76:0x00fe, B:84:0x0113, B:86:0x0119, B:103:0x014a, B:106:0x0158, B:114:0x017a, B:116:0x0188, B:119:0x0197, B:121:0x01a3, B:125:0x01af, B:127:0x01bd, B:129:0x01c1, B:132:0x01cb, B:134:0x01cf, B:136:0x01d5, B:138:0x01db, B:140:0x01e9, B:142:0x01ed, B:145:0x01f7, B:147:0x01fb, B:150:0x0204, B:152:0x020c, B:154:0x021a, B:156:0x021e, B:159:0x0228, B:161:0x022c, B:163:0x0232, B:164:0x0237, B:166:0x023f, B:168:0x024d, B:170:0x0251, B:173:0x025b, B:175:0x025f, B:177:0x0265, B:179:0x026a, B:181:0x026e, B:91:0x0124), top: B:388:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:178:0x0268  */
    /* JADX WARN: Code duplicated, block: B:184:0x027a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0280  */
    /* JADX WARN: Code duplicated, block: B:190:0x0286 A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0292 A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x02b5 A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x02c4 A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x02c8 A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:215:0x02d6 A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:231:0x0302 A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x0314 A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x0318 A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x032e A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x033c  */
    /* JADX WARN: Code duplicated, block: B:252:0x0342 A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:254:0x0346 A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:261:0x0361 A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:262:0x0365  */
    /* JADX WARN: Code duplicated, block: B:264:0x0369 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:265:0x036b A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:266:0x0370  */
    /* JADX WARN: Code duplicated, block: B:269:0x0378  */
    /* JADX WARN: Code duplicated, block: B:271:0x037b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:272:0x037d A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:274:0x0384 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:275:0x0386 A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:277:0x0392 A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:279:0x039e  */
    /* JADX WARN: Code duplicated, block: B:284:0x03a8 A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:288:0x03b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:289:0x03b2 A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:290:0x03bb A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:292:0x03c0 A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:294:0x03c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:298:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:314:0x03ff A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:320:0x0413 A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:323:0x041b A[Catch: all -> 0x02a1, Exception -> 0x02a6, TryCatch #0 {all -> 0x02a1, blocks: (B:188:0x0282, B:190:0x0286, B:192:0x0292, B:252:0x0342, B:254:0x0346, B:256:0x034a, B:259:0x0354, B:261:0x0361, B:265:0x036b, B:267:0x0371, B:321:0x0417, B:323:0x041b, B:325:0x041f, B:328:0x0428, B:330:0x0430, B:331:0x0438, B:333:0x043e, B:272:0x037d, B:273:0x0380, B:275:0x0386, B:277:0x0392, B:284:0x03a8, B:289:0x03b2, B:290:0x03bb, B:292:0x03c0, B:295:0x03c8, B:300:0x03d5, B:302:0x03de, B:305:0x03e4, B:306:0x03e8, B:307:0x03ec, B:309:0x03f1, B:311:0x03f6, B:312:0x03fb, B:314:0x03ff, B:316:0x0403, B:319:0x040f, B:320:0x0413, B:201:0x02ad, B:203:0x02b5, B:205:0x02b9, B:208:0x02c4, B:210:0x02c8, B:212:0x02cc, B:215:0x02d6, B:217:0x02da, B:219:0x02de, B:222:0x02e8, B:224:0x02ec, B:226:0x02f0, B:229:0x02fe, B:231:0x0302, B:233:0x0306, B:236:0x0314, B:238:0x0318, B:240:0x031c, B:243:0x032a, B:245:0x032e, B:247:0x0332, B:341:0x0453, B:351:0x0476, B:353:0x047c, B:355:0x0484, B:357:0x048c), top: B:387:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:335:0x0444  */
    /* JADX WARN: Code duplicated, block: B:365:0x04bd A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #3 {all -> 0x0054, blocks: (B:26:0x0050, B:31:0x005b, B:33:0x005e, B:35:0x0066, B:36:0x006c, B:38:0x0079, B:40:0x007d, B:51:0x009f, B:55:0x00ac, B:57:0x00bd, B:66:0x00e9, B:76:0x00fe, B:84:0x0113, B:86:0x0119, B:103:0x014a, B:106:0x0158, B:114:0x017a, B:116:0x0188, B:119:0x0197, B:121:0x01a3, B:362:0x049b, B:365:0x04bd, B:373:0x050d, B:375:0x0513, B:376:0x052b, B:378:0x052f, B:383:0x0539, B:384:0x053e, B:367:0x04d4, B:369:0x04d8, B:371:0x04dc, B:372:0x04f7, B:125:0x01af, B:127:0x01bd, B:129:0x01c1, B:132:0x01cb, B:134:0x01cf, B:136:0x01d5, B:138:0x01db, B:140:0x01e9, B:142:0x01ed, B:145:0x01f7, B:147:0x01fb, B:150:0x0204, B:152:0x020c, B:154:0x021a, B:156:0x021e, B:159:0x0228, B:161:0x022c, B:163:0x0232, B:164:0x0237, B:166:0x023f, B:168:0x024d, B:170:0x0251, B:173:0x025b, B:175:0x025f, B:177:0x0265, B:179:0x026a, B:181:0x026e, B:91:0x0124, B:42:0x0083, B:44:0x0089, B:46:0x008d, B:49:0x0095), top: B:392:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:366:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:367:0x04d4 A[Catch: all -> 0x0054, TryCatch #3 {all -> 0x0054, blocks: (B:26:0x0050, B:31:0x005b, B:33:0x005e, B:35:0x0066, B:36:0x006c, B:38:0x0079, B:40:0x007d, B:51:0x009f, B:55:0x00ac, B:57:0x00bd, B:66:0x00e9, B:76:0x00fe, B:84:0x0113, B:86:0x0119, B:103:0x014a, B:106:0x0158, B:114:0x017a, B:116:0x0188, B:119:0x0197, B:121:0x01a3, B:362:0x049b, B:365:0x04bd, B:373:0x050d, B:375:0x0513, B:376:0x052b, B:378:0x052f, B:383:0x0539, B:384:0x053e, B:367:0x04d4, B:369:0x04d8, B:371:0x04dc, B:372:0x04f7, B:125:0x01af, B:127:0x01bd, B:129:0x01c1, B:132:0x01cb, B:134:0x01cf, B:136:0x01d5, B:138:0x01db, B:140:0x01e9, B:142:0x01ed, B:145:0x01f7, B:147:0x01fb, B:150:0x0204, B:152:0x020c, B:154:0x021a, B:156:0x021e, B:159:0x0228, B:161:0x022c, B:163:0x0232, B:164:0x0237, B:166:0x023f, B:168:0x024d, B:170:0x0251, B:173:0x025b, B:175:0x025f, B:177:0x0265, B:179:0x026a, B:181:0x026e, B:91:0x0124, B:42:0x0083, B:44:0x0089, B:46:0x008d, B:49:0x0095), top: B:392:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:371:0x04dc A[Catch: all -> 0x0054, TryCatch #3 {all -> 0x0054, blocks: (B:26:0x0050, B:31:0x005b, B:33:0x005e, B:35:0x0066, B:36:0x006c, B:38:0x0079, B:40:0x007d, B:51:0x009f, B:55:0x00ac, B:57:0x00bd, B:66:0x00e9, B:76:0x00fe, B:84:0x0113, B:86:0x0119, B:103:0x014a, B:106:0x0158, B:114:0x017a, B:116:0x0188, B:119:0x0197, B:121:0x01a3, B:362:0x049b, B:365:0x04bd, B:373:0x050d, B:375:0x0513, B:376:0x052b, B:378:0x052f, B:383:0x0539, B:384:0x053e, B:367:0x04d4, B:369:0x04d8, B:371:0x04dc, B:372:0x04f7, B:125:0x01af, B:127:0x01bd, B:129:0x01c1, B:132:0x01cb, B:134:0x01cf, B:136:0x01d5, B:138:0x01db, B:140:0x01e9, B:142:0x01ed, B:145:0x01f7, B:147:0x01fb, B:150:0x0204, B:152:0x020c, B:154:0x021a, B:156:0x021e, B:159:0x0228, B:161:0x022c, B:163:0x0232, B:164:0x0237, B:166:0x023f, B:168:0x024d, B:170:0x0251, B:173:0x025b, B:175:0x025f, B:177:0x0265, B:179:0x026a, B:181:0x026e, B:91:0x0124, B:42:0x0083, B:44:0x0089, B:46:0x008d, B:49:0x0095), top: B:392:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:372:0x04f7 A[Catch: all -> 0x0054, TryCatch #3 {all -> 0x0054, blocks: (B:26:0x0050, B:31:0x005b, B:33:0x005e, B:35:0x0066, B:36:0x006c, B:38:0x0079, B:40:0x007d, B:51:0x009f, B:55:0x00ac, B:57:0x00bd, B:66:0x00e9, B:76:0x00fe, B:84:0x0113, B:86:0x0119, B:103:0x014a, B:106:0x0158, B:114:0x017a, B:116:0x0188, B:119:0x0197, B:121:0x01a3, B:362:0x049b, B:365:0x04bd, B:373:0x050d, B:375:0x0513, B:376:0x052b, B:378:0x052f, B:383:0x0539, B:384:0x053e, B:367:0x04d4, B:369:0x04d8, B:371:0x04dc, B:372:0x04f7, B:125:0x01af, B:127:0x01bd, B:129:0x01c1, B:132:0x01cb, B:134:0x01cf, B:136:0x01d5, B:138:0x01db, B:140:0x01e9, B:142:0x01ed, B:145:0x01f7, B:147:0x01fb, B:150:0x0204, B:152:0x020c, B:154:0x021a, B:156:0x021e, B:159:0x0228, B:161:0x022c, B:163:0x0232, B:164:0x0237, B:166:0x023f, B:168:0x024d, B:170:0x0251, B:173:0x025b, B:175:0x025f, B:177:0x0265, B:179:0x026a, B:181:0x026e, B:91:0x0124, B:42:0x0083, B:44:0x0089, B:46:0x008d, B:49:0x0095), top: B:392:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:375:0x0513 A[Catch: all -> 0x0054, TryCatch #3 {all -> 0x0054, blocks: (B:26:0x0050, B:31:0x005b, B:33:0x005e, B:35:0x0066, B:36:0x006c, B:38:0x0079, B:40:0x007d, B:51:0x009f, B:55:0x00ac, B:57:0x00bd, B:66:0x00e9, B:76:0x00fe, B:84:0x0113, B:86:0x0119, B:103:0x014a, B:106:0x0158, B:114:0x017a, B:116:0x0188, B:119:0x0197, B:121:0x01a3, B:362:0x049b, B:365:0x04bd, B:373:0x050d, B:375:0x0513, B:376:0x052b, B:378:0x052f, B:383:0x0539, B:384:0x053e, B:367:0x04d4, B:369:0x04d8, B:371:0x04dc, B:372:0x04f7, B:125:0x01af, B:127:0x01bd, B:129:0x01c1, B:132:0x01cb, B:134:0x01cf, B:136:0x01d5, B:138:0x01db, B:140:0x01e9, B:142:0x01ed, B:145:0x01f7, B:147:0x01fb, B:150:0x0204, B:152:0x020c, B:154:0x021a, B:156:0x021e, B:159:0x0228, B:161:0x022c, B:163:0x0232, B:164:0x0237, B:166:0x023f, B:168:0x024d, B:170:0x0251, B:173:0x025b, B:175:0x025f, B:177:0x0265, B:179:0x026a, B:181:0x026e, B:91:0x0124, B:42:0x0083, B:44:0x0089, B:46:0x008d, B:49:0x0095), top: B:392:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:378:0x052f A[Catch: all -> 0x0054, TryCatch #3 {all -> 0x0054, blocks: (B:26:0x0050, B:31:0x005b, B:33:0x005e, B:35:0x0066, B:36:0x006c, B:38:0x0079, B:40:0x007d, B:51:0x009f, B:55:0x00ac, B:57:0x00bd, B:66:0x00e9, B:76:0x00fe, B:84:0x0113, B:86:0x0119, B:103:0x014a, B:106:0x0158, B:114:0x017a, B:116:0x0188, B:119:0x0197, B:121:0x01a3, B:362:0x049b, B:365:0x04bd, B:373:0x050d, B:375:0x0513, B:376:0x052b, B:378:0x052f, B:383:0x0539, B:384:0x053e, B:367:0x04d4, B:369:0x04d8, B:371:0x04dc, B:372:0x04f7, B:125:0x01af, B:127:0x01bd, B:129:0x01c1, B:132:0x01cb, B:134:0x01cf, B:136:0x01d5, B:138:0x01db, B:140:0x01e9, B:142:0x01ed, B:145:0x01f7, B:147:0x01fb, B:150:0x0204, B:152:0x020c, B:154:0x021a, B:156:0x021e, B:159:0x0228, B:161:0x022c, B:163:0x0232, B:164:0x0237, B:166:0x023f, B:168:0x024d, B:170:0x0251, B:173:0x025b, B:175:0x025f, B:177:0x0265, B:179:0x026a, B:181:0x026e, B:91:0x0124, B:42:0x0083, B:44:0x0089, B:46:0x008d, B:49:0x0095), top: B:392:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:379:0x0534  */
    /* JADX WARN: Code duplicated, block: B:381:0x0537  */
    /* JADX WARN: Code duplicated, block: B:382:0x0538  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e  */
    /* JADX WARN: Code duplicated, block: B:99:0x013b A[PHI: r20
      0x013b: PHI (r20v10 com.alibaba.fastjson.serializer.FieldSerializer) = 
      (r20v1 com.alibaba.fastjson.serializer.FieldSerializer)
      (r20v6 com.alibaba.fastjson.serializer.FieldSerializer)
      (r20v6 com.alibaba.fastjson.serializer.FieldSerializer)
      (r20v6 com.alibaba.fastjson.serializer.FieldSerializer)
      (r20v6 com.alibaba.fastjson.serializer.FieldSerializer)
      (r20v6 com.alibaba.fastjson.serializer.FieldSerializer)
      (r20v6 com.alibaba.fastjson.serializer.FieldSerializer)
      (r20v1 com.alibaba.fastjson.serializer.FieldSerializer)
      (r20v1 com.alibaba.fastjson.serializer.FieldSerializer)
      (r20v1 com.alibaba.fastjson.serializer.FieldSerializer)
     binds: [B:80:0x010a, B:98:0x0139, B:182:0x0276, B:172:0x0259, B:158:0x0226, B:144:0x01f5, B:131:0x01c9, B:87:0x011d, B:72:0x00f5, B:67:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:365:0x04bd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:371:0x04dc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:372:0x04f7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:375:0x0513, please report this as an issue */
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i, boolean z) throws Throwable {
        FieldSerializer fieldSerializer;
        String str;
        FieldInfo fieldInfo;
        Throwable cause;
        char c;
        SerialContext serialContext;
        boolean z2;
        Object propertyValueDirect;
        Object obj3;
        Object objTrim;
        String strProcessKey;
        Object objProcessValue;
        Object obj4;
        Object objDefaultValue;
        char c2;
        char c3;
        boolean z3;
        Class<?> cls;
        int i2;
        int i3;
        int i4;
        JSONField annotation;
        JSONType jSONType;
        int iM4802of;
        int i5;
        int i6;
        int i7;
        int i8;
        Type type2 = type;
        int i9 = i;
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            serializeWriter.writeNull();
            return;
        }
        if (writeReference(jSONSerializer, obj, i9)) {
            return;
        }
        FieldSerializer[] fieldSerializerArr = serializeWriter.sortField ? this.sortedGetters : this.getters;
        SerialContext serialContext2 = jSONSerializer.context;
        if (!this.beanInfo.beanType.isEnum()) {
            jSONSerializer.setContext(serialContext2, obj, obj2, this.beanInfo.features, i9);
        }
        SerialContext serialContext3 = serialContext2;
        boolean zIsWriteAsArray = isWriteAsArray(jSONSerializer, i9);
        char c4 = zIsWriteAsArray ? '[' : '{';
        char c5 = zIsWriteAsArray ? ']' : '}';
        if (!z) {
            try {
                try {
                    serializeWriter.append(c4);
                } catch (Throwable th) {
                    th = th;
                    jSONSerializer.context = serialContext3;
                    throw th;
                }
            } catch (Exception e) {
                e = e;
                fieldSerializer = null;
                str = "write javaBean error, fastjson version 1.2.62, class " + obj.getClass().getName();
                if (obj2 != null) {
                    str = str + ", fieldName : " + obj2;
                } else if (fieldSerializer != null) {
                    if (fieldInfo.method != null) {
                        str = str + ", method : " + fieldInfo.method.getName();
                    } else {
                        str = str + ", fieldName : " + fieldSerializer.fieldInfo.name;
                    }
                }
                if (e.getMessage() != null) {
                    str = str + ", " + e.getMessage();
                }
                if (e instanceof InvocationTargetException) {
                    cause = e.getCause();
                } else {
                    cause = null;
                }
                if (cause == null) {
                    e = cause;
                }
                throw new JSONException(str, e);
            }
        }
        if (fieldSerializerArr.length > 0 && serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
            jSONSerializer.incrementIndent();
            jSONSerializer.println();
        }
        int i10 = this.beanInfo.features;
        SerializerFeature serializerFeature = SerializerFeature.WriteClassName;
        int i11 = serializerFeature.mask;
        char c6 = ',';
        if ((i10 & i11) == 0 && (i9 & i11) == 0 && !jSONSerializer.isWriteClassName(type2, obj)) {
            c = 0;
        } else {
            Class<?> cls2 = obj.getClass();
            if (cls2 != ((cls2 == type2 || !(type2 instanceof WildcardType)) ? type2 : TypeUtils.getClass(type2))) {
                writeClassName(jSONSerializer, this.beanInfo.typeKey, obj);
                c = ',';
            } else {
                c = 0;
            }
        }
        boolean zIsEnabled = serializeWriter.isEnabled(serializerFeature);
        boolean z4 = writeBefore(jSONSerializer, obj, c) == ',';
        boolean zIsEnabled2 = serializeWriter.isEnabled(SerializerFeature.SkipTransientField);
        boolean zIsEnabled3 = serializeWriter.isEnabled(SerializerFeature.IgnoreNonFieldGetter);
        boolean z5 = z4;
        int i12 = 0;
        FieldSerializer fieldSerializer2 = null;
        while (i12 < fieldSerializerArr.length) {
            try {
                try {
                    try {
                        fieldSerializer = fieldSerializerArr[i12];
                        boolean z6 = zIsWriteAsArray;
                        FieldInfo fieldInfo2 = fieldSerializer.fieldInfo;
                        Field field = fieldInfo2.field;
                        int i13 = i12;
                        String str2 = fieldInfo2.name;
                        Class<?> cls3 = fieldInfo2.fieldClass;
                        boolean zIsEnabled4 = SerializerFeature.isEnabled(serializeWriter.features, fieldInfo2.serialzeFeatures, SerializerFeature.UseSingleQuotes);
                        boolean z7 = serializeWriter.quoteFieldNames && !zIsEnabled4;
                        if ((zIsEnabled2 && fieldInfo2.fieldTransient) || (zIsEnabled3 && field == null)) {
                            serialContext = serialContext3;
                            c2 = c5;
                            c3 = ',';
                        } else {
                            if (applyName(jSONSerializer, obj, str2) && applyLabel(jSONSerializer, fieldInfo2.label)) {
                                z2 = false;
                            } else {
                                if (z6) {
                                    z2 = true;
                                } else {
                                    serialContext = serialContext3;
                                    c2 = c5;
                                }
                                c3 = ',';
                            }
                            String str3 = this.beanInfo.typeKey;
                            if (str3 != null && str2.equals(str3) && jSONSerializer.isWriteClassName(type2, obj)) {
                                serialContext = serialContext3;
                                c2 = c5;
                                c3 = ',';
                            } else {
                                if (z2) {
                                    propertyValueDirect = null;
                                } else {
                                    try {
                                        propertyValueDirect = fieldSerializer.getPropertyValueDirect(obj);
                                    } catch (InvocationTargetException e2) {
                                        try {
                                            if (!serializeWriter.isEnabled(SerializerFeature.IgnoreErrorGetter)) {
                                                serialContext = serialContext3;
                                                try {
                                                    throw e2;
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    serialContext3 = serialContext;
                                                    str = "write javaBean error, fastjson version 1.2.62, class " + obj.getClass().getName();
                                                    if (obj2 != null) {
                                                        str = str + ", fieldName : " + obj2;
                                                    } else if (fieldSerializer != null) {
                                                        if (fieldInfo.method != null) {
                                                            str = str + ", method : " + fieldInfo.method.getName();
                                                        } else {
                                                            str = str + ", fieldName : " + fieldSerializer.fieldInfo.name;
                                                        }
                                                    }
                                                    if (e.getMessage() != null) {
                                                        str = str + ", " + e.getMessage();
                                                    }
                                                    if (e instanceof InvocationTargetException) {
                                                        cause = e.getCause();
                                                    } else {
                                                        cause = null;
                                                    }
                                                    if (cause == null) {
                                                        e = cause;
                                                    }
                                                    throw new JSONException(str, e);
                                                }
                                            }
                                            fieldSerializer2 = fieldSerializer;
                                            propertyValueDirect = null;
                                        } catch (Exception e4) {
                                            e = e4;
                                            str = "write javaBean error, fastjson version 1.2.62, class " + obj.getClass().getName();
                                            if (obj2 != null) {
                                                str = str + ", fieldName : " + obj2;
                                            } else if (fieldSerializer != null) {
                                                if (fieldInfo.method != null) {
                                                    str = str + ", method : " + fieldInfo.method.getName();
                                                } else {
                                                    str = str + ", fieldName : " + fieldSerializer.fieldInfo.name;
                                                }
                                            }
                                            if (e.getMessage() != null) {
                                                str = str + ", " + e.getMessage();
                                            }
                                            if (e instanceof InvocationTargetException) {
                                                cause = e.getCause();
                                            } else {
                                                cause = null;
                                            }
                                            if (cause == null) {
                                                e = cause;
                                            }
                                            throw new JSONException(str, e);
                                        }
                                    }
                                }
                                if (apply(jSONSerializer, obj, str2, propertyValueDirect)) {
                                    if (cls3 == String.class) {
                                        obj3 = propertyValueDirect;
                                        if ("trim".equals(fieldInfo2.format) && obj3 != null) {
                                            objTrim = ((String) obj3).trim();
                                        }
                                        strProcessKey = processKey(jSONSerializer, obj, str2, objTrim);
                                        objProcessValue = processValue(jSONSerializer, fieldSerializer.fieldContext, obj, str2, objTrim, i9);
                                        if (objProcessValue == null) {
                                            obj4 = objProcessValue;
                                            i4 = fieldInfo2.serialzeFeatures;
                                            annotation = fieldInfo2.getAnnotation();
                                            jSONType = this.beanInfo.jsonType;
                                            if (jSONType != null) {
                                                iM4802of = i4 | SerializerFeature.m4802of(jSONType.serialzeFeatures());
                                            }
                                            if (annotation != null) {
                                                iM4802of = i4;
                                                if (!"".equals(annotation.defaultValue())) {
                                                    objDefaultValue = annotation.defaultValue();
                                                }
                                                if (objDefaultValue != null) {
                                                    serialContext = serialContext3;
                                                    try {
                                                        try {
                                                            if (!serializeWriter.notWriteDefaultValue) {
                                                                i2 = fieldInfo2.serialzeFeatures;
                                                                i3 = SerializerFeature.NotWriteDefaultValue.mask;
                                                                if ((i2 & i3) == 0 || (this.beanInfo.features & i3) != 0) {
                                                                }
                                                                if (!z5) {
                                                                    c3 = ',';
                                                                } else if (!fieldInfo2.unwrapped && (objDefaultValue instanceof Map) && ((Map) objDefaultValue).size() == 0) {
                                                                    c3 = ',';
                                                                } else {
                                                                    c3 = ',';
                                                                    serializeWriter.write(44);
                                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                        jSONSerializer.println();
                                                                    }
                                                                }
                                                                if (strProcessKey == str2) {
                                                                    if (z6) {
                                                                        z3 = true;
                                                                    } else {
                                                                        z3 = true;
                                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                } else {
                                                                    z3 = true;
                                                                    if (objTrim == objDefaultValue) {
                                                                        if (!z6) {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                        jSONSerializer.write(objDefaultValue);
                                                                    } else {
                                                                        if (!z6) {
                                                                            boolean zIsAssignableFrom = Map.class.isAssignableFrom(cls3);
                                                                            boolean z8 = (cls3.isPrimitive() && !cls3.getName().startsWith("java.")) || cls3 == Object.class;
                                                                            if (zIsEnabled || !fieldInfo2.unwrapped || (!zIsAssignableFrom && !z8)) {
                                                                                if (z7) {
                                                                                    char[] cArr = fieldInfo2.name_chars;
                                                                                    serializeWriter.write(cArr, 0, cArr.length);
                                                                                } else {
                                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (z6) {
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        } else {
                                                                            JSONField annotation2 = fieldInfo2.getAnnotation();
                                                                            if (cls3 == String.class || !(annotation2 == null || annotation2.serializeUsing() == Void.class)) {
                                                                                if (!fieldInfo2.unwrapped && (objDefaultValue instanceof Map) && ((Map) objDefaultValue).size() == 0) {
                                                                                    z5 = false;
                                                                                } else {
                                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                                }
                                                                            } else if (objDefaultValue == null) {
                                                                                int i14 = serializeWriter.features;
                                                                                int i15 = SerializerFeature.WriteNullStringAsEmpty.mask;
                                                                                if ((i14 & i15) == 0 && (fieldSerializer.features & i15) == 0) {
                                                                                    serializeWriter.writeNull();
                                                                                } else {
                                                                                    serializeWriter.writeString("");
                                                                                }
                                                                            } else {
                                                                                String str4 = (String) objDefaultValue;
                                                                                if (zIsEnabled4) {
                                                                                    serializeWriter.writeStringWithSingleQuote(str4);
                                                                                } else {
                                                                                    serializeWriter.writeStringWithDoubleQuote(str4, (char) 0);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (!fieldInfo2.unwrapped || !(objDefaultValue instanceof Map)) {
                                                                            z5 = z3;
                                                                            break;
                                                                        }
                                                                        Map map = (Map) objDefaultValue;
                                                                        if (map.size() != 0) {
                                                                            if (jSONSerializer.isEnabled(SerializerFeature.WriteMapNullValue)) {
                                                                                z5 = z3;
                                                                                break;
                                                                                break;
                                                                            }
                                                                            Iterator it = map.values().iterator();
                                                                            while (it.hasNext()) {
                                                                                if (it.next() != null) {
                                                                                    z5 = z3;
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            cls = fieldInfo2.fieldClass;
                                                            c2 = c5;
                                                            if (cls != Byte.TYPE || !(objDefaultValue instanceof Byte) || ((Byte) objDefaultValue).byteValue() != 0) {
                                                                if ((cls == Short.TYPE || !(objDefaultValue instanceof Short) || ((Short) objDefaultValue).shortValue() != 0) && (cls != Integer.TYPE || !(objDefaultValue instanceof Integer) || ((Integer) objDefaultValue).intValue() != 0) && (cls != Long.TYPE || !(objDefaultValue instanceof Long) || ((Long) objDefaultValue).longValue() != 0)) {
                                                                    if (cls == Float.TYPE || !(objDefaultValue instanceof Float) || ((Float) objDefaultValue).floatValue() != 0.0f) {
                                                                        if (cls == Double.TYPE || !(objDefaultValue instanceof Double) || ((Double) objDefaultValue).doubleValue() != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                                                                            if (cls == Boolean.TYPE || !(objDefaultValue instanceof Boolean) || ((Boolean) objDefaultValue).booleanValue()) {
                                                                                if (!z5) {
                                                                                    if (!fieldInfo2.unwrapped) {
                                                                                    }
                                                                                    c3 = ',';
                                                                                    serializeWriter.write(44);
                                                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                                        jSONSerializer.println();
                                                                                    }
                                                                                } else {
                                                                                    c3 = ',';
                                                                                }
                                                                                if (strProcessKey == str2) {
                                                                                    z3 = true;
                                                                                    if (objTrim == objDefaultValue) {
                                                                                        if (!z6) {
                                                                                            boolean zIsAssignableFrom2 = Map.class.isAssignableFrom(cls3);
                                                                                            if (cls3.isPrimitive()) {
                                                                                            }
                                                                                            if (zIsEnabled) {
                                                                                                if (z7) {
                                                                                                    char[] cArr2 = fieldInfo2.name_chars;
                                                                                                    serializeWriter.write(cArr2, 0, cArr2.length);
                                                                                                } else {
                                                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                                                }
                                                                                            } else if (z7) {
                                                                                                char[] cArr3 = fieldInfo2.name_chars;
                                                                                                serializeWriter.write(cArr3, 0, cArr3.length);
                                                                                            } else {
                                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                                            }
                                                                                        }
                                                                                        if (z6) {
                                                                                            JSONField annotation3 = fieldInfo2.getAnnotation();
                                                                                            if (cls3 == String.class) {
                                                                                                if (!fieldInfo2.unwrapped) {
                                                                                                }
                                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                                            } else {
                                                                                                if (!fieldInfo2.unwrapped) {
                                                                                                }
                                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                                            }
                                                                                        } else {
                                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                                        }
                                                                                        if (!fieldInfo2.unwrapped) {
                                                                                            z5 = z3;
                                                                                            break;
                                                                                            break;
                                                                                        } else {
                                                                                            z5 = z3;
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (!z6) {
                                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                                    }
                                                                                    jSONSerializer.write(objDefaultValue);
                                                                                } else {
                                                                                    if (z6) {
                                                                                        z3 = true;
                                                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                                                    } else {
                                                                                        z3 = true;
                                                                                    }
                                                                                    jSONSerializer.write(objDefaultValue);
                                                                                }
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                    z5 = z3;
                                                                                    break;
                                                                                    break;
                                                                                } else {
                                                                                    z5 = z3;
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            c3 = ',';
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            serialContext3 = serialContext;
                                                            jSONSerializer.context = serialContext3;
                                                            throw th;
                                                        }
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        fieldSerializer = fieldSerializer2;
                                                        serialContext3 = serialContext;
                                                        str = "write javaBean error, fastjson version 1.2.62, class " + obj.getClass().getName();
                                                        if (obj2 != null) {
                                                            str = str + ", fieldName : " + obj2;
                                                        } else if (fieldSerializer != null) {
                                                            if (fieldInfo.method != null) {
                                                                str = str + ", method : " + fieldInfo.method.getName();
                                                            } else {
                                                                str = str + ", fieldName : " + fieldSerializer.fieldInfo.name;
                                                            }
                                                        }
                                                        if (e.getMessage() != null) {
                                                            str = str + ", " + e.getMessage();
                                                        }
                                                        if (e instanceof InvocationTargetException) {
                                                            cause = e.getCause();
                                                        } else {
                                                            cause = null;
                                                        }
                                                        if (cause == null) {
                                                            e = cause;
                                                        }
                                                        throw new JSONException(str, e);
                                                    }
                                                } else {
                                                    serialContext = serialContext3;
                                                }
                                                c2 = c5;
                                                if (!z5) {
                                                    if (!fieldInfo2.unwrapped) {
                                                    }
                                                    c3 = ',';
                                                    serializeWriter.write(44);
                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                        jSONSerializer.println();
                                                    }
                                                } else {
                                                    c3 = ',';
                                                }
                                                if (strProcessKey == str2) {
                                                    z3 = true;
                                                    if (objTrim == objDefaultValue) {
                                                        if (!z6) {
                                                            boolean zIsAssignableFrom3 = Map.class.isAssignableFrom(cls3);
                                                            if (cls3.isPrimitive()) {
                                                            }
                                                            if (zIsEnabled) {
                                                                if (z7) {
                                                                    char[] cArr4 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr4, 0, cArr4.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            } else if (z7) {
                                                                char[] cArr5 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr5, 0, cArr5.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        }
                                                        if (z6) {
                                                            JSONField annotation4 = fieldInfo2.getAnnotation();
                                                            if (cls3 == String.class) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            } else {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                        } else {
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (!z6) {
                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                } else {
                                                    if (z6) {
                                                        z3 = true;
                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                }
                                                if (!fieldInfo2.unwrapped) {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                } else {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                }
                                            }
                                            iM4802of = i4;
                                            if (cls3 == Boolean.class) {
                                                i8 = SerializerFeature.WriteNullBooleanAsFalse.mask;
                                                int i16 = i8 | SerializerFeature.WriteMapNullValue.mask;
                                                if (!z6 || (iM4802of & i16) != 0 || (serializeWriter.features & i16) != 0) {
                                                    if ((iM4802of & i8) == 0 || (serializeWriter.features & i8) != 0) {
                                                        objDefaultValue = Boolean.FALSE;
                                                    }
                                                    if (objDefaultValue != null) {
                                                        serialContext = serialContext3;
                                                        if (!serializeWriter.notWriteDefaultValue) {
                                                            i2 = fieldInfo2.serialzeFeatures;
                                                            i3 = SerializerFeature.NotWriteDefaultValue.mask;
                                                            if ((i2 & i3) == 0) {
                                                            }
                                                        }
                                                        cls = fieldInfo2.fieldClass;
                                                        c2 = c5;
                                                        if (cls != Byte.TYPE) {
                                                            if (cls == Short.TYPE) {
                                                                if (cls == Float.TYPE) {
                                                                    if (cls == Double.TYPE) {
                                                                    }
                                                                    if (cls == Boolean.TYPE) {
                                                                    }
                                                                    if (!z5) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        c3 = ',';
                                                                        serializeWriter.write(44);
                                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                            jSONSerializer.println();
                                                                        }
                                                                    } else {
                                                                        c3 = ',';
                                                                    }
                                                                    if (strProcessKey == str2) {
                                                                        z3 = true;
                                                                        if (objTrim == objDefaultValue) {
                                                                            if (!z6) {
                                                                                boolean zIsAssignableFrom4 = Map.class.isAssignableFrom(cls3);
                                                                                if (cls3.isPrimitive()) {
                                                                                }
                                                                                if (zIsEnabled) {
                                                                                    if (z7) {
                                                                                        char[] cArr6 = fieldInfo2.name_chars;
                                                                                        serializeWriter.write(cArr6, 0, cArr6.length);
                                                                                    } else {
                                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                                    }
                                                                                } else if (z7) {
                                                                                    char[] cArr7 = fieldInfo2.name_chars;
                                                                                    serializeWriter.write(cArr7, 0, cArr7.length);
                                                                                } else {
                                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                                }
                                                                            }
                                                                            if (z6) {
                                                                                JSONField annotation5 = fieldInfo2.getAnnotation();
                                                                                if (cls3 == String.class) {
                                                                                    if (!fieldInfo2.unwrapped) {
                                                                                    }
                                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                                } else {
                                                                                    if (!fieldInfo2.unwrapped) {
                                                                                    }
                                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                                }
                                                                            } else {
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            }
                                                                            if (!fieldInfo2.unwrapped) {
                                                                                z5 = z3;
                                                                                break;
                                                                                break;
                                                                            } else {
                                                                                z5 = z3;
                                                                                break;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (!z6) {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                        jSONSerializer.write(objDefaultValue);
                                                                    } else {
                                                                        if (z6) {
                                                                            z3 = true;
                                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                                        } else {
                                                                            z3 = true;
                                                                        }
                                                                        jSONSerializer.write(objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (cls == Double.TYPE) {
                                                                }
                                                                if (cls == Boolean.TYPE) {
                                                                }
                                                                if (!z5) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    c3 = ',';
                                                                    serializeWriter.write(44);
                                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                        jSONSerializer.println();
                                                                    }
                                                                } else {
                                                                    c3 = ',';
                                                                }
                                                                if (strProcessKey == str2) {
                                                                    z3 = true;
                                                                    if (objTrim == objDefaultValue) {
                                                                        if (!z6) {
                                                                            boolean zIsAssignableFrom5 = Map.class.isAssignableFrom(cls3);
                                                                            if (cls3.isPrimitive()) {
                                                                            }
                                                                            if (zIsEnabled) {
                                                                                if (z7) {
                                                                                    char[] cArr8 = fieldInfo2.name_chars;
                                                                                    serializeWriter.write(cArr8, 0, cArr8.length);
                                                                                } else {
                                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                                }
                                                                            } else if (z7) {
                                                                                char[] cArr9 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr9, 0, cArr9.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        }
                                                                        if (z6) {
                                                                            JSONField annotation6 = fieldInfo2.getAnnotation();
                                                                            if (cls3 == String.class) {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            } else {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            }
                                                                        } else {
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                        if (!fieldInfo2.unwrapped) {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        } else {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!z6) {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                } else {
                                                                    if (z6) {
                                                                        z3 = true;
                                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                                    } else {
                                                                        z3 = true;
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (cls == Float.TYPE) {
                                                                if (cls == Double.TYPE) {
                                                                }
                                                                if (cls == Boolean.TYPE) {
                                                                }
                                                                if (!z5) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    c3 = ',';
                                                                    serializeWriter.write(44);
                                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                        jSONSerializer.println();
                                                                    }
                                                                } else {
                                                                    c3 = ',';
                                                                }
                                                                if (strProcessKey == str2) {
                                                                    z3 = true;
                                                                    if (objTrim == objDefaultValue) {
                                                                        if (!z6) {
                                                                            boolean zIsAssignableFrom6 = Map.class.isAssignableFrom(cls3);
                                                                            if (cls3.isPrimitive()) {
                                                                            }
                                                                            if (zIsEnabled) {
                                                                                if (z7) {
                                                                                    char[] cArr10 = fieldInfo2.name_chars;
                                                                                    serializeWriter.write(cArr10, 0, cArr10.length);
                                                                                } else {
                                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                                }
                                                                            } else if (z7) {
                                                                                char[] cArr11 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr11, 0, cArr11.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        }
                                                                        if (z6) {
                                                                            JSONField annotation7 = fieldInfo2.getAnnotation();
                                                                            if (cls3 == String.class) {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            } else {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            }
                                                                        } else {
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                        if (!fieldInfo2.unwrapped) {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        } else {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!z6) {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                } else {
                                                                    if (z6) {
                                                                        z3 = true;
                                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                                    } else {
                                                                        z3 = true;
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (cls == Double.TYPE) {
                                                            }
                                                            if (cls == Boolean.TYPE) {
                                                            }
                                                            if (!z5) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                c3 = ',';
                                                                serializeWriter.write(44);
                                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                    jSONSerializer.println();
                                                                }
                                                            } else {
                                                                c3 = ',';
                                                            }
                                                            if (strProcessKey == str2) {
                                                                z3 = true;
                                                                if (objTrim == objDefaultValue) {
                                                                    if (!z6) {
                                                                        boolean zIsAssignableFrom7 = Map.class.isAssignableFrom(cls3);
                                                                        if (cls3.isPrimitive()) {
                                                                        }
                                                                        if (zIsEnabled) {
                                                                            if (z7) {
                                                                                char[] cArr12 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr12, 0, cArr12.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        } else if (z7) {
                                                                            char[] cArr13 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr13, 0, cArr13.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    }
                                                                    if (z6) {
                                                                        JSONField annotation8 = fieldInfo2.getAnnotation();
                                                                        if (cls3 == String.class) {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        } else {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                    } else {
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!z6) {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            } else {
                                                                if (z6) {
                                                                    z3 = true;
                                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (cls == Short.TYPE) {
                                                            if (cls == Float.TYPE) {
                                                                if (cls == Double.TYPE) {
                                                                }
                                                                if (cls == Boolean.TYPE) {
                                                                }
                                                                if (!z5) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    c3 = ',';
                                                                    serializeWriter.write(44);
                                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                        jSONSerializer.println();
                                                                    }
                                                                } else {
                                                                    c3 = ',';
                                                                }
                                                                if (strProcessKey == str2) {
                                                                    z3 = true;
                                                                    if (objTrim == objDefaultValue) {
                                                                        if (!z6) {
                                                                            boolean zIsAssignableFrom8 = Map.class.isAssignableFrom(cls3);
                                                                            if (cls3.isPrimitive()) {
                                                                            }
                                                                            if (zIsEnabled) {
                                                                                if (z7) {
                                                                                    char[] cArr14 = fieldInfo2.name_chars;
                                                                                    serializeWriter.write(cArr14, 0, cArr14.length);
                                                                                } else {
                                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                                }
                                                                            } else if (z7) {
                                                                                char[] cArr15 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr15, 0, cArr15.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        }
                                                                        if (z6) {
                                                                            JSONField annotation9 = fieldInfo2.getAnnotation();
                                                                            if (cls3 == String.class) {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            } else {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            }
                                                                        } else {
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                        if (!fieldInfo2.unwrapped) {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        } else {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!z6) {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                } else {
                                                                    if (z6) {
                                                                        z3 = true;
                                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                                    } else {
                                                                        z3 = true;
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (cls == Double.TYPE) {
                                                            }
                                                            if (cls == Boolean.TYPE) {
                                                            }
                                                            if (!z5) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                c3 = ',';
                                                                serializeWriter.write(44);
                                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                    jSONSerializer.println();
                                                                }
                                                            } else {
                                                                c3 = ',';
                                                            }
                                                            if (strProcessKey == str2) {
                                                                z3 = true;
                                                                if (objTrim == objDefaultValue) {
                                                                    if (!z6) {
                                                                        boolean zIsAssignableFrom9 = Map.class.isAssignableFrom(cls3);
                                                                        if (cls3.isPrimitive()) {
                                                                        }
                                                                        if (zIsEnabled) {
                                                                            if (z7) {
                                                                                char[] cArr16 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr16, 0, cArr16.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        } else if (z7) {
                                                                            char[] cArr17 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr17, 0, cArr17.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    }
                                                                    if (z6) {
                                                                        JSONField annotation10 = fieldInfo2.getAnnotation();
                                                                        if (cls3 == String.class) {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        } else {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                    } else {
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!z6) {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            } else {
                                                                if (z6) {
                                                                    z3 = true;
                                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (cls == Float.TYPE) {
                                                            if (cls == Double.TYPE) {
                                                            }
                                                            if (cls == Boolean.TYPE) {
                                                            }
                                                            if (!z5) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                c3 = ',';
                                                                serializeWriter.write(44);
                                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                    jSONSerializer.println();
                                                                }
                                                            } else {
                                                                c3 = ',';
                                                            }
                                                            if (strProcessKey == str2) {
                                                                z3 = true;
                                                                if (objTrim == objDefaultValue) {
                                                                    if (!z6) {
                                                                        boolean zIsAssignableFrom10 = Map.class.isAssignableFrom(cls3);
                                                                        if (cls3.isPrimitive()) {
                                                                        }
                                                                        if (zIsEnabled) {
                                                                            if (z7) {
                                                                                char[] cArr18 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr18, 0, cArr18.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        } else if (z7) {
                                                                            char[] cArr19 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr19, 0, cArr19.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    }
                                                                    if (z6) {
                                                                        JSONField annotation11 = fieldInfo2.getAnnotation();
                                                                        if (cls3 == String.class) {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        } else {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                    } else {
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!z6) {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            } else {
                                                                if (z6) {
                                                                    z3 = true;
                                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom11 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr110 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr110, 0, cArr110.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr111 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr111, 0, cArr111.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation12 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                        c3 = ',';
                                                    } else {
                                                        serialContext = serialContext3;
                                                    }
                                                    c2 = c5;
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom12 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr112 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr112, 0, cArr112.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr113 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr113, 0, cArr113.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation13 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                serialContext = serialContext3;
                                                c2 = c5;
                                                c3 = ',';
                                            } else if (cls3 == String.class) {
                                                i7 = SerializerFeature.WriteNullStringAsEmpty.mask;
                                                int i17 = i7 | SerializerFeature.WriteMapNullValue.mask;
                                                if (!z6 || (iM4802of & i17) != 0 || (serializeWriter.features & i17) != 0) {
                                                    if ((iM4802of & i7) == 0 || (serializeWriter.features & i7) != 0) {
                                                        objDefaultValue = "";
                                                    }
                                                    if (objDefaultValue != null) {
                                                        serialContext = serialContext3;
                                                        if (!serializeWriter.notWriteDefaultValue) {
                                                            i2 = fieldInfo2.serialzeFeatures;
                                                            i3 = SerializerFeature.NotWriteDefaultValue.mask;
                                                            if ((i2 & i3) == 0) {
                                                            }
                                                        }
                                                        cls = fieldInfo2.fieldClass;
                                                        c2 = c5;
                                                        if (cls != Byte.TYPE) {
                                                            if (cls == Short.TYPE) {
                                                                if (cls == Float.TYPE) {
                                                                    if (cls == Double.TYPE) {
                                                                    }
                                                                    if (cls == Boolean.TYPE) {
                                                                    }
                                                                    if (!z5) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        c3 = ',';
                                                                        serializeWriter.write(44);
                                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                            jSONSerializer.println();
                                                                        }
                                                                    } else {
                                                                        c3 = ',';
                                                                    }
                                                                    if (strProcessKey == str2) {
                                                                        z3 = true;
                                                                        if (objTrim == objDefaultValue) {
                                                                            if (!z6) {
                                                                                boolean zIsAssignableFrom13 = Map.class.isAssignableFrom(cls3);
                                                                                if (cls3.isPrimitive()) {
                                                                                }
                                                                                if (zIsEnabled) {
                                                                                    if (z7) {
                                                                                        char[] cArr114 = fieldInfo2.name_chars;
                                                                                        serializeWriter.write(cArr114, 0, cArr114.length);
                                                                                    } else {
                                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                                    }
                                                                                } else if (z7) {
                                                                                    char[] cArr115 = fieldInfo2.name_chars;
                                                                                    serializeWriter.write(cArr115, 0, cArr115.length);
                                                                                } else {
                                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                                }
                                                                            }
                                                                            if (z6) {
                                                                                JSONField annotation14 = fieldInfo2.getAnnotation();
                                                                                if (cls3 == String.class) {
                                                                                    if (!fieldInfo2.unwrapped) {
                                                                                    }
                                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                                } else {
                                                                                    if (!fieldInfo2.unwrapped) {
                                                                                    }
                                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                                }
                                                                            } else {
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            }
                                                                            if (!fieldInfo2.unwrapped) {
                                                                                z5 = z3;
                                                                                break;
                                                                                break;
                                                                            } else {
                                                                                z5 = z3;
                                                                                break;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (!z6) {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                        jSONSerializer.write(objDefaultValue);
                                                                    } else {
                                                                        if (z6) {
                                                                            z3 = true;
                                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                                        } else {
                                                                            z3 = true;
                                                                        }
                                                                        jSONSerializer.write(objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (cls == Double.TYPE) {
                                                                }
                                                                if (cls == Boolean.TYPE) {
                                                                }
                                                                if (!z5) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    c3 = ',';
                                                                    serializeWriter.write(44);
                                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                        jSONSerializer.println();
                                                                    }
                                                                } else {
                                                                    c3 = ',';
                                                                }
                                                                if (strProcessKey == str2) {
                                                                    z3 = true;
                                                                    if (objTrim == objDefaultValue) {
                                                                        if (!z6) {
                                                                            boolean zIsAssignableFrom14 = Map.class.isAssignableFrom(cls3);
                                                                            if (cls3.isPrimitive()) {
                                                                            }
                                                                            if (zIsEnabled) {
                                                                                if (z7) {
                                                                                    char[] cArr116 = fieldInfo2.name_chars;
                                                                                    serializeWriter.write(cArr116, 0, cArr116.length);
                                                                                } else {
                                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                                }
                                                                            } else if (z7) {
                                                                                char[] cArr117 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr117, 0, cArr117.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        }
                                                                        if (z6) {
                                                                            JSONField annotation15 = fieldInfo2.getAnnotation();
                                                                            if (cls3 == String.class) {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            } else {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            }
                                                                        } else {
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                        if (!fieldInfo2.unwrapped) {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        } else {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!z6) {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                } else {
                                                                    if (z6) {
                                                                        z3 = true;
                                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                                    } else {
                                                                        z3 = true;
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (cls == Float.TYPE) {
                                                                if (cls == Double.TYPE) {
                                                                }
                                                                if (cls == Boolean.TYPE) {
                                                                }
                                                                if (!z5) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    c3 = ',';
                                                                    serializeWriter.write(44);
                                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                        jSONSerializer.println();
                                                                    }
                                                                } else {
                                                                    c3 = ',';
                                                                }
                                                                if (strProcessKey == str2) {
                                                                    z3 = true;
                                                                    if (objTrim == objDefaultValue) {
                                                                        if (!z6) {
                                                                            boolean zIsAssignableFrom15 = Map.class.isAssignableFrom(cls3);
                                                                            if (cls3.isPrimitive()) {
                                                                            }
                                                                            if (zIsEnabled) {
                                                                                if (z7) {
                                                                                    char[] cArr118 = fieldInfo2.name_chars;
                                                                                    serializeWriter.write(cArr118, 0, cArr118.length);
                                                                                } else {
                                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                                }
                                                                            } else if (z7) {
                                                                                char[] cArr119 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr119, 0, cArr119.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        }
                                                                        if (z6) {
                                                                            JSONField annotation16 = fieldInfo2.getAnnotation();
                                                                            if (cls3 == String.class) {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            } else {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            }
                                                                        } else {
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                        if (!fieldInfo2.unwrapped) {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        } else {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!z6) {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                } else {
                                                                    if (z6) {
                                                                        z3 = true;
                                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                                    } else {
                                                                        z3 = true;
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (cls == Double.TYPE) {
                                                            }
                                                            if (cls == Boolean.TYPE) {
                                                            }
                                                            if (!z5) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                c3 = ',';
                                                                serializeWriter.write(44);
                                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                    jSONSerializer.println();
                                                                }
                                                            } else {
                                                                c3 = ',';
                                                            }
                                                            if (strProcessKey == str2) {
                                                                z3 = true;
                                                                if (objTrim == objDefaultValue) {
                                                                    if (!z6) {
                                                                        boolean zIsAssignableFrom16 = Map.class.isAssignableFrom(cls3);
                                                                        if (cls3.isPrimitive()) {
                                                                        }
                                                                        if (zIsEnabled) {
                                                                            if (z7) {
                                                                                char[] cArr1110 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr1110, 0, cArr1110.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        } else if (z7) {
                                                                            char[] cArr1111 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr1111, 0, cArr1111.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    }
                                                                    if (z6) {
                                                                        JSONField annotation17 = fieldInfo2.getAnnotation();
                                                                        if (cls3 == String.class) {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        } else {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                    } else {
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!z6) {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            } else {
                                                                if (z6) {
                                                                    z3 = true;
                                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (cls == Short.TYPE) {
                                                            if (cls == Float.TYPE) {
                                                                if (cls == Double.TYPE) {
                                                                }
                                                                if (cls == Boolean.TYPE) {
                                                                }
                                                                if (!z5) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    c3 = ',';
                                                                    serializeWriter.write(44);
                                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                        jSONSerializer.println();
                                                                    }
                                                                } else {
                                                                    c3 = ',';
                                                                }
                                                                if (strProcessKey == str2) {
                                                                    z3 = true;
                                                                    if (objTrim == objDefaultValue) {
                                                                        if (!z6) {
                                                                            boolean zIsAssignableFrom17 = Map.class.isAssignableFrom(cls3);
                                                                            if (cls3.isPrimitive()) {
                                                                            }
                                                                            if (zIsEnabled) {
                                                                                if (z7) {
                                                                                    char[] cArr1112 = fieldInfo2.name_chars;
                                                                                    serializeWriter.write(cArr1112, 0, cArr1112.length);
                                                                                } else {
                                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                                }
                                                                            } else if (z7) {
                                                                                char[] cArr1113 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr1113, 0, cArr1113.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        }
                                                                        if (z6) {
                                                                            JSONField annotation18 = fieldInfo2.getAnnotation();
                                                                            if (cls3 == String.class) {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            } else {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            }
                                                                        } else {
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                        if (!fieldInfo2.unwrapped) {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        } else {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!z6) {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                } else {
                                                                    if (z6) {
                                                                        z3 = true;
                                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                                    } else {
                                                                        z3 = true;
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (cls == Double.TYPE) {
                                                            }
                                                            if (cls == Boolean.TYPE) {
                                                            }
                                                            if (!z5) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                c3 = ',';
                                                                serializeWriter.write(44);
                                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                    jSONSerializer.println();
                                                                }
                                                            } else {
                                                                c3 = ',';
                                                            }
                                                            if (strProcessKey == str2) {
                                                                z3 = true;
                                                                if (objTrim == objDefaultValue) {
                                                                    if (!z6) {
                                                                        boolean zIsAssignableFrom18 = Map.class.isAssignableFrom(cls3);
                                                                        if (cls3.isPrimitive()) {
                                                                        }
                                                                        if (zIsEnabled) {
                                                                            if (z7) {
                                                                                char[] cArr1114 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr1114, 0, cArr1114.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        } else if (z7) {
                                                                            char[] cArr1115 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr1115, 0, cArr1115.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    }
                                                                    if (z6) {
                                                                        JSONField annotation19 = fieldInfo2.getAnnotation();
                                                                        if (cls3 == String.class) {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        } else {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                    } else {
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!z6) {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            } else {
                                                                if (z6) {
                                                                    z3 = true;
                                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (cls == Float.TYPE) {
                                                            if (cls == Double.TYPE) {
                                                            }
                                                            if (cls == Boolean.TYPE) {
                                                            }
                                                            if (!z5) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                c3 = ',';
                                                                serializeWriter.write(44);
                                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                    jSONSerializer.println();
                                                                }
                                                            } else {
                                                                c3 = ',';
                                                            }
                                                            if (strProcessKey == str2) {
                                                                z3 = true;
                                                                if (objTrim == objDefaultValue) {
                                                                    if (!z6) {
                                                                        boolean zIsAssignableFrom19 = Map.class.isAssignableFrom(cls3);
                                                                        if (cls3.isPrimitive()) {
                                                                        }
                                                                        if (zIsEnabled) {
                                                                            if (z7) {
                                                                                char[] cArr1116 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr1116, 0, cArr1116.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        } else if (z7) {
                                                                            char[] cArr1117 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr1117, 0, cArr1117.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    }
                                                                    if (z6) {
                                                                        JSONField annotation110 = fieldInfo2.getAnnotation();
                                                                        if (cls3 == String.class) {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        } else {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                    } else {
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!z6) {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            } else {
                                                                if (z6) {
                                                                    z3 = true;
                                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom110 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr1118 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr1118, 0, cArr1118.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr1119 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr1119, 0, cArr1119.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation111 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                        c3 = ',';
                                                    } else {
                                                        serialContext = serialContext3;
                                                    }
                                                    c2 = c5;
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom111 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr11110 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr11110, 0, cArr11110.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr11111 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr11111, 0, cArr11111.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation112 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                serialContext = serialContext3;
                                                c2 = c5;
                                                c3 = ',';
                                            } else if (Number.class.isAssignableFrom(cls3)) {
                                                i6 = SerializerFeature.WriteNullNumberAsZero.mask;
                                                int i18 = i6 | SerializerFeature.WriteMapNullValue.mask;
                                                if (!z6 || (iM4802of & i18) != 0 || (serializeWriter.features & i18) != 0) {
                                                    if ((iM4802of & i6) == 0 || (serializeWriter.features & i6) != 0) {
                                                        objDefaultValue = 0;
                                                    }
                                                    if (objDefaultValue != null) {
                                                        serialContext = serialContext3;
                                                        if (!serializeWriter.notWriteDefaultValue) {
                                                            i2 = fieldInfo2.serialzeFeatures;
                                                            i3 = SerializerFeature.NotWriteDefaultValue.mask;
                                                            if ((i2 & i3) == 0) {
                                                            }
                                                        }
                                                        cls = fieldInfo2.fieldClass;
                                                        c2 = c5;
                                                        if (cls != Byte.TYPE) {
                                                            if (cls == Short.TYPE) {
                                                                if (cls == Float.TYPE) {
                                                                    if (cls == Double.TYPE) {
                                                                    }
                                                                    if (cls == Boolean.TYPE) {
                                                                    }
                                                                    if (!z5) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        c3 = ',';
                                                                        serializeWriter.write(44);
                                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                            jSONSerializer.println();
                                                                        }
                                                                    } else {
                                                                        c3 = ',';
                                                                    }
                                                                    if (strProcessKey == str2) {
                                                                        z3 = true;
                                                                        if (objTrim == objDefaultValue) {
                                                                            if (!z6) {
                                                                                boolean zIsAssignableFrom112 = Map.class.isAssignableFrom(cls3);
                                                                                if (cls3.isPrimitive()) {
                                                                                }
                                                                                if (zIsEnabled) {
                                                                                    if (z7) {
                                                                                        char[] cArr11112 = fieldInfo2.name_chars;
                                                                                        serializeWriter.write(cArr11112, 0, cArr11112.length);
                                                                                    } else {
                                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                                    }
                                                                                } else if (z7) {
                                                                                    char[] cArr11113 = fieldInfo2.name_chars;
                                                                                    serializeWriter.write(cArr11113, 0, cArr11113.length);
                                                                                } else {
                                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                                }
                                                                            }
                                                                            if (z6) {
                                                                                JSONField annotation113 = fieldInfo2.getAnnotation();
                                                                                if (cls3 == String.class) {
                                                                                    if (!fieldInfo2.unwrapped) {
                                                                                    }
                                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                                } else {
                                                                                    if (!fieldInfo2.unwrapped) {
                                                                                    }
                                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                                }
                                                                            } else {
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            }
                                                                            if (!fieldInfo2.unwrapped) {
                                                                                z5 = z3;
                                                                                break;
                                                                                break;
                                                                            } else {
                                                                                z5 = z3;
                                                                                break;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (!z6) {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                        jSONSerializer.write(objDefaultValue);
                                                                    } else {
                                                                        if (z6) {
                                                                            z3 = true;
                                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                                        } else {
                                                                            z3 = true;
                                                                        }
                                                                        jSONSerializer.write(objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (cls == Double.TYPE) {
                                                                }
                                                                if (cls == Boolean.TYPE) {
                                                                }
                                                                if (!z5) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    c3 = ',';
                                                                    serializeWriter.write(44);
                                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                        jSONSerializer.println();
                                                                    }
                                                                } else {
                                                                    c3 = ',';
                                                                }
                                                                if (strProcessKey == str2) {
                                                                    z3 = true;
                                                                    if (objTrim == objDefaultValue) {
                                                                        if (!z6) {
                                                                            boolean zIsAssignableFrom113 = Map.class.isAssignableFrom(cls3);
                                                                            if (cls3.isPrimitive()) {
                                                                            }
                                                                            if (zIsEnabled) {
                                                                                if (z7) {
                                                                                    char[] cArr11114 = fieldInfo2.name_chars;
                                                                                    serializeWriter.write(cArr11114, 0, cArr11114.length);
                                                                                } else {
                                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                                }
                                                                            } else if (z7) {
                                                                                char[] cArr11115 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr11115, 0, cArr11115.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        }
                                                                        if (z6) {
                                                                            JSONField annotation114 = fieldInfo2.getAnnotation();
                                                                            if (cls3 == String.class) {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            } else {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            }
                                                                        } else {
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                        if (!fieldInfo2.unwrapped) {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        } else {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!z6) {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                } else {
                                                                    if (z6) {
                                                                        z3 = true;
                                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                                    } else {
                                                                        z3 = true;
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (cls == Float.TYPE) {
                                                                if (cls == Double.TYPE) {
                                                                }
                                                                if (cls == Boolean.TYPE) {
                                                                }
                                                                if (!z5) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    c3 = ',';
                                                                    serializeWriter.write(44);
                                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                        jSONSerializer.println();
                                                                    }
                                                                } else {
                                                                    c3 = ',';
                                                                }
                                                                if (strProcessKey == str2) {
                                                                    z3 = true;
                                                                    if (objTrim == objDefaultValue) {
                                                                        if (!z6) {
                                                                            boolean zIsAssignableFrom114 = Map.class.isAssignableFrom(cls3);
                                                                            if (cls3.isPrimitive()) {
                                                                            }
                                                                            if (zIsEnabled) {
                                                                                if (z7) {
                                                                                    char[] cArr11116 = fieldInfo2.name_chars;
                                                                                    serializeWriter.write(cArr11116, 0, cArr11116.length);
                                                                                } else {
                                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                                }
                                                                            } else if (z7) {
                                                                                char[] cArr11117 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr11117, 0, cArr11117.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        }
                                                                        if (z6) {
                                                                            JSONField annotation115 = fieldInfo2.getAnnotation();
                                                                            if (cls3 == String.class) {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            } else {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            }
                                                                        } else {
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                        if (!fieldInfo2.unwrapped) {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        } else {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!z6) {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                } else {
                                                                    if (z6) {
                                                                        z3 = true;
                                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                                    } else {
                                                                        z3 = true;
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (cls == Double.TYPE) {
                                                            }
                                                            if (cls == Boolean.TYPE) {
                                                            }
                                                            if (!z5) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                c3 = ',';
                                                                serializeWriter.write(44);
                                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                    jSONSerializer.println();
                                                                }
                                                            } else {
                                                                c3 = ',';
                                                            }
                                                            if (strProcessKey == str2) {
                                                                z3 = true;
                                                                if (objTrim == objDefaultValue) {
                                                                    if (!z6) {
                                                                        boolean zIsAssignableFrom115 = Map.class.isAssignableFrom(cls3);
                                                                        if (cls3.isPrimitive()) {
                                                                        }
                                                                        if (zIsEnabled) {
                                                                            if (z7) {
                                                                                char[] cArr11118 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr11118, 0, cArr11118.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        } else if (z7) {
                                                                            char[] cArr11119 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr11119, 0, cArr11119.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    }
                                                                    if (z6) {
                                                                        JSONField annotation116 = fieldInfo2.getAnnotation();
                                                                        if (cls3 == String.class) {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        } else {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                    } else {
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!z6) {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            } else {
                                                                if (z6) {
                                                                    z3 = true;
                                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (cls == Short.TYPE) {
                                                            if (cls == Float.TYPE) {
                                                                if (cls == Double.TYPE) {
                                                                }
                                                                if (cls == Boolean.TYPE) {
                                                                }
                                                                if (!z5) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    c3 = ',';
                                                                    serializeWriter.write(44);
                                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                        jSONSerializer.println();
                                                                    }
                                                                } else {
                                                                    c3 = ',';
                                                                }
                                                                if (strProcessKey == str2) {
                                                                    z3 = true;
                                                                    if (objTrim == objDefaultValue) {
                                                                        if (!z6) {
                                                                            boolean zIsAssignableFrom116 = Map.class.isAssignableFrom(cls3);
                                                                            if (cls3.isPrimitive()) {
                                                                            }
                                                                            if (zIsEnabled) {
                                                                                if (z7) {
                                                                                    char[] cArr111110 = fieldInfo2.name_chars;
                                                                                    serializeWriter.write(cArr111110, 0, cArr111110.length);
                                                                                } else {
                                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                                }
                                                                            } else if (z7) {
                                                                                char[] cArr111111 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr111111, 0, cArr111111.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        }
                                                                        if (z6) {
                                                                            JSONField annotation117 = fieldInfo2.getAnnotation();
                                                                            if (cls3 == String.class) {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            } else {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            }
                                                                        } else {
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                        if (!fieldInfo2.unwrapped) {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        } else {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!z6) {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                } else {
                                                                    if (z6) {
                                                                        z3 = true;
                                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                                    } else {
                                                                        z3 = true;
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (cls == Double.TYPE) {
                                                            }
                                                            if (cls == Boolean.TYPE) {
                                                            }
                                                            if (!z5) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                c3 = ',';
                                                                serializeWriter.write(44);
                                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                    jSONSerializer.println();
                                                                }
                                                            } else {
                                                                c3 = ',';
                                                            }
                                                            if (strProcessKey == str2) {
                                                                z3 = true;
                                                                if (objTrim == objDefaultValue) {
                                                                    if (!z6) {
                                                                        boolean zIsAssignableFrom117 = Map.class.isAssignableFrom(cls3);
                                                                        if (cls3.isPrimitive()) {
                                                                        }
                                                                        if (zIsEnabled) {
                                                                            if (z7) {
                                                                                char[] cArr111112 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr111112, 0, cArr111112.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        } else if (z7) {
                                                                            char[] cArr111113 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr111113, 0, cArr111113.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    }
                                                                    if (z6) {
                                                                        JSONField annotation118 = fieldInfo2.getAnnotation();
                                                                        if (cls3 == String.class) {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        } else {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                    } else {
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!z6) {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            } else {
                                                                if (z6) {
                                                                    z3 = true;
                                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (cls == Float.TYPE) {
                                                            if (cls == Double.TYPE) {
                                                            }
                                                            if (cls == Boolean.TYPE) {
                                                            }
                                                            if (!z5) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                c3 = ',';
                                                                serializeWriter.write(44);
                                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                    jSONSerializer.println();
                                                                }
                                                            } else {
                                                                c3 = ',';
                                                            }
                                                            if (strProcessKey == str2) {
                                                                z3 = true;
                                                                if (objTrim == objDefaultValue) {
                                                                    if (!z6) {
                                                                        boolean zIsAssignableFrom118 = Map.class.isAssignableFrom(cls3);
                                                                        if (cls3.isPrimitive()) {
                                                                        }
                                                                        if (zIsEnabled) {
                                                                            if (z7) {
                                                                                char[] cArr111114 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr111114, 0, cArr111114.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        } else if (z7) {
                                                                            char[] cArr111115 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr111115, 0, cArr111115.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    }
                                                                    if (z6) {
                                                                        JSONField annotation119 = fieldInfo2.getAnnotation();
                                                                        if (cls3 == String.class) {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        } else {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                    } else {
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!z6) {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            } else {
                                                                if (z6) {
                                                                    z3 = true;
                                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom119 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr111116 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr111116, 0, cArr111116.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr111117 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr111117, 0, cArr111117.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation1110 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                        c3 = ',';
                                                    } else {
                                                        serialContext = serialContext3;
                                                    }
                                                    c2 = c5;
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom1110 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr111118 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr111118, 0, cArr111118.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr111119 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr111119, 0, cArr111119.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation1111 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                serialContext = serialContext3;
                                                c2 = c5;
                                                c3 = ',';
                                            } else if (Collection.class.isAssignableFrom(cls3)) {
                                                i5 = SerializerFeature.WriteNullListAsEmpty.mask;
                                                int i19 = i5 | SerializerFeature.WriteMapNullValue.mask;
                                                if (!z6 || (iM4802of & i19) != 0 || (serializeWriter.features & i19) != 0) {
                                                    if ((iM4802of & i5) == 0 || (serializeWriter.features & i5) != 0) {
                                                        objDefaultValue = Collections.EMPTY_LIST;
                                                    }
                                                    if (objDefaultValue != null) {
                                                        serialContext = serialContext3;
                                                        if (!serializeWriter.notWriteDefaultValue) {
                                                            i2 = fieldInfo2.serialzeFeatures;
                                                            i3 = SerializerFeature.NotWriteDefaultValue.mask;
                                                            if ((i2 & i3) == 0) {
                                                            }
                                                        }
                                                        cls = fieldInfo2.fieldClass;
                                                        c2 = c5;
                                                        if (cls != Byte.TYPE) {
                                                            if (cls == Short.TYPE) {
                                                                if (cls == Float.TYPE) {
                                                                    if (cls == Double.TYPE) {
                                                                    }
                                                                    if (cls == Boolean.TYPE) {
                                                                    }
                                                                    if (!z5) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        c3 = ',';
                                                                        serializeWriter.write(44);
                                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                            jSONSerializer.println();
                                                                        }
                                                                    } else {
                                                                        c3 = ',';
                                                                    }
                                                                    if (strProcessKey == str2) {
                                                                        z3 = true;
                                                                        if (objTrim == objDefaultValue) {
                                                                            if (!z6) {
                                                                                boolean zIsAssignableFrom1111 = Map.class.isAssignableFrom(cls3);
                                                                                if (cls3.isPrimitive()) {
                                                                                }
                                                                                if (zIsEnabled) {
                                                                                    if (z7) {
                                                                                        char[] cArr1111110 = fieldInfo2.name_chars;
                                                                                        serializeWriter.write(cArr1111110, 0, cArr1111110.length);
                                                                                    } else {
                                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                                    }
                                                                                } else if (z7) {
                                                                                    char[] cArr1111111 = fieldInfo2.name_chars;
                                                                                    serializeWriter.write(cArr1111111, 0, cArr1111111.length);
                                                                                } else {
                                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                                }
                                                                            }
                                                                            if (z6) {
                                                                                JSONField annotation1112 = fieldInfo2.getAnnotation();
                                                                                if (cls3 == String.class) {
                                                                                    if (!fieldInfo2.unwrapped) {
                                                                                    }
                                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                                } else {
                                                                                    if (!fieldInfo2.unwrapped) {
                                                                                    }
                                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                                }
                                                                            } else {
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            }
                                                                            if (!fieldInfo2.unwrapped) {
                                                                                z5 = z3;
                                                                                break;
                                                                                break;
                                                                            } else {
                                                                                z5 = z3;
                                                                                break;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (!z6) {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                        jSONSerializer.write(objDefaultValue);
                                                                    } else {
                                                                        if (z6) {
                                                                            z3 = true;
                                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                                        } else {
                                                                            z3 = true;
                                                                        }
                                                                        jSONSerializer.write(objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (cls == Double.TYPE) {
                                                                }
                                                                if (cls == Boolean.TYPE) {
                                                                }
                                                                if (!z5) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    c3 = ',';
                                                                    serializeWriter.write(44);
                                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                        jSONSerializer.println();
                                                                    }
                                                                } else {
                                                                    c3 = ',';
                                                                }
                                                                if (strProcessKey == str2) {
                                                                    z3 = true;
                                                                    if (objTrim == objDefaultValue) {
                                                                        if (!z6) {
                                                                            boolean zIsAssignableFrom1112 = Map.class.isAssignableFrom(cls3);
                                                                            if (cls3.isPrimitive()) {
                                                                            }
                                                                            if (zIsEnabled) {
                                                                                if (z7) {
                                                                                    char[] cArr1111112 = fieldInfo2.name_chars;
                                                                                    serializeWriter.write(cArr1111112, 0, cArr1111112.length);
                                                                                } else {
                                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                                }
                                                                            } else if (z7) {
                                                                                char[] cArr1111113 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr1111113, 0, cArr1111113.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        }
                                                                        if (z6) {
                                                                            JSONField annotation1113 = fieldInfo2.getAnnotation();
                                                                            if (cls3 == String.class) {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            } else {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            }
                                                                        } else {
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                        if (!fieldInfo2.unwrapped) {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        } else {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!z6) {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                } else {
                                                                    if (z6) {
                                                                        z3 = true;
                                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                                    } else {
                                                                        z3 = true;
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (cls == Float.TYPE) {
                                                                if (cls == Double.TYPE) {
                                                                }
                                                                if (cls == Boolean.TYPE) {
                                                                }
                                                                if (!z5) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    c3 = ',';
                                                                    serializeWriter.write(44);
                                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                        jSONSerializer.println();
                                                                    }
                                                                } else {
                                                                    c3 = ',';
                                                                }
                                                                if (strProcessKey == str2) {
                                                                    z3 = true;
                                                                    if (objTrim == objDefaultValue) {
                                                                        if (!z6) {
                                                                            boolean zIsAssignableFrom1113 = Map.class.isAssignableFrom(cls3);
                                                                            if (cls3.isPrimitive()) {
                                                                            }
                                                                            if (zIsEnabled) {
                                                                                if (z7) {
                                                                                    char[] cArr1111114 = fieldInfo2.name_chars;
                                                                                    serializeWriter.write(cArr1111114, 0, cArr1111114.length);
                                                                                } else {
                                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                                }
                                                                            } else if (z7) {
                                                                                char[] cArr1111115 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr1111115, 0, cArr1111115.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        }
                                                                        if (z6) {
                                                                            JSONField annotation1114 = fieldInfo2.getAnnotation();
                                                                            if (cls3 == String.class) {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            } else {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            }
                                                                        } else {
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                        if (!fieldInfo2.unwrapped) {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        } else {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!z6) {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                } else {
                                                                    if (z6) {
                                                                        z3 = true;
                                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                                    } else {
                                                                        z3 = true;
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (cls == Double.TYPE) {
                                                            }
                                                            if (cls == Boolean.TYPE) {
                                                            }
                                                            if (!z5) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                c3 = ',';
                                                                serializeWriter.write(44);
                                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                    jSONSerializer.println();
                                                                }
                                                            } else {
                                                                c3 = ',';
                                                            }
                                                            if (strProcessKey == str2) {
                                                                z3 = true;
                                                                if (objTrim == objDefaultValue) {
                                                                    if (!z6) {
                                                                        boolean zIsAssignableFrom1114 = Map.class.isAssignableFrom(cls3);
                                                                        if (cls3.isPrimitive()) {
                                                                        }
                                                                        if (zIsEnabled) {
                                                                            if (z7) {
                                                                                char[] cArr1111116 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr1111116, 0, cArr1111116.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        } else if (z7) {
                                                                            char[] cArr1111117 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr1111117, 0, cArr1111117.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    }
                                                                    if (z6) {
                                                                        JSONField annotation1115 = fieldInfo2.getAnnotation();
                                                                        if (cls3 == String.class) {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        } else {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                    } else {
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!z6) {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            } else {
                                                                if (z6) {
                                                                    z3 = true;
                                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (cls == Short.TYPE) {
                                                            if (cls == Float.TYPE) {
                                                                if (cls == Double.TYPE) {
                                                                }
                                                                if (cls == Boolean.TYPE) {
                                                                }
                                                                if (!z5) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    c3 = ',';
                                                                    serializeWriter.write(44);
                                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                        jSONSerializer.println();
                                                                    }
                                                                } else {
                                                                    c3 = ',';
                                                                }
                                                                if (strProcessKey == str2) {
                                                                    z3 = true;
                                                                    if (objTrim == objDefaultValue) {
                                                                        if (!z6) {
                                                                            boolean zIsAssignableFrom1115 = Map.class.isAssignableFrom(cls3);
                                                                            if (cls3.isPrimitive()) {
                                                                            }
                                                                            if (zIsEnabled) {
                                                                                if (z7) {
                                                                                    char[] cArr1111118 = fieldInfo2.name_chars;
                                                                                    serializeWriter.write(cArr1111118, 0, cArr1111118.length);
                                                                                } else {
                                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                                }
                                                                            } else if (z7) {
                                                                                char[] cArr1111119 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr1111119, 0, cArr1111119.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        }
                                                                        if (z6) {
                                                                            JSONField annotation1116 = fieldInfo2.getAnnotation();
                                                                            if (cls3 == String.class) {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            } else {
                                                                                if (!fieldInfo2.unwrapped) {
                                                                                }
                                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                            }
                                                                        } else {
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                        if (!fieldInfo2.unwrapped) {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        } else {
                                                                            z5 = z3;
                                                                            break;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!z6) {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                } else {
                                                                    if (z6) {
                                                                        z3 = true;
                                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                                    } else {
                                                                        z3 = true;
                                                                    }
                                                                    jSONSerializer.write(objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (cls == Double.TYPE) {
                                                            }
                                                            if (cls == Boolean.TYPE) {
                                                            }
                                                            if (!z5) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                c3 = ',';
                                                                serializeWriter.write(44);
                                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                    jSONSerializer.println();
                                                                }
                                                            } else {
                                                                c3 = ',';
                                                            }
                                                            if (strProcessKey == str2) {
                                                                z3 = true;
                                                                if (objTrim == objDefaultValue) {
                                                                    if (!z6) {
                                                                        boolean zIsAssignableFrom1116 = Map.class.isAssignableFrom(cls3);
                                                                        if (cls3.isPrimitive()) {
                                                                        }
                                                                        if (zIsEnabled) {
                                                                            if (z7) {
                                                                                char[] cArr11111110 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr11111110, 0, cArr11111110.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        } else if (z7) {
                                                                            char[] cArr11111111 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr11111111, 0, cArr11111111.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    }
                                                                    if (z6) {
                                                                        JSONField annotation1117 = fieldInfo2.getAnnotation();
                                                                        if (cls3 == String.class) {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        } else {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                    } else {
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!z6) {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            } else {
                                                                if (z6) {
                                                                    z3 = true;
                                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (cls == Float.TYPE) {
                                                            if (cls == Double.TYPE) {
                                                            }
                                                            if (cls == Boolean.TYPE) {
                                                            }
                                                            if (!z5) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                c3 = ',';
                                                                serializeWriter.write(44);
                                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                    jSONSerializer.println();
                                                                }
                                                            } else {
                                                                c3 = ',';
                                                            }
                                                            if (strProcessKey == str2) {
                                                                z3 = true;
                                                                if (objTrim == objDefaultValue) {
                                                                    if (!z6) {
                                                                        boolean zIsAssignableFrom1117 = Map.class.isAssignableFrom(cls3);
                                                                        if (cls3.isPrimitive()) {
                                                                        }
                                                                        if (zIsEnabled) {
                                                                            if (z7) {
                                                                                char[] cArr11111112 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr11111112, 0, cArr11111112.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        } else if (z7) {
                                                                            char[] cArr11111113 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr11111113, 0, cArr11111113.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    }
                                                                    if (z6) {
                                                                        JSONField annotation1118 = fieldInfo2.getAnnotation();
                                                                        if (cls3 == String.class) {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        } else {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                    } else {
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!z6) {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            } else {
                                                                if (z6) {
                                                                    z3 = true;
                                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom1118 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr11111114 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr11111114, 0, cArr11111114.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr11111115 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr11111115, 0, cArr11111115.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation1119 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                        c3 = ',';
                                                    } else {
                                                        serialContext = serialContext3;
                                                    }
                                                    c2 = c5;
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom1119 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr11111116 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr11111116, 0, cArr11111116.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr11111117 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr11111117, 0, cArr11111117.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation11110 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                serialContext = serialContext3;
                                                c2 = c5;
                                                c3 = ',';
                                            } else {
                                                if (z6 && !fieldSerializer.writeNull && !serializeWriter.isEnabled(SerializerFeature.WriteMapNullValue.mask)) {
                                                    serialContext = serialContext3;
                                                    c2 = c5;
                                                }
                                                c3 = ',';
                                            }
                                        } else {
                                            obj4 = objProcessValue;
                                        }
                                        objDefaultValue = obj4;
                                        if (objDefaultValue != null) {
                                            serialContext = serialContext3;
                                            if (!serializeWriter.notWriteDefaultValue) {
                                                i2 = fieldInfo2.serialzeFeatures;
                                                i3 = SerializerFeature.NotWriteDefaultValue.mask;
                                                if ((i2 & i3) == 0) {
                                                }
                                            }
                                            cls = fieldInfo2.fieldClass;
                                            c2 = c5;
                                            if (cls != Byte.TYPE) {
                                                if (cls == Short.TYPE) {
                                                    if (cls == Float.TYPE) {
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom11110 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr11111118 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr11111118, 0, cArr11111118.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr11111119 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr11111119, 0, cArr11111119.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation11111 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom11111 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr111111110 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr111111110, 0, cArr111111110.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr111111111 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr111111111, 0, cArr111111111.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation11112 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Float.TYPE) {
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom11112 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr111111112 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr111111112, 0, cArr111111112.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr111111113 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr111111113, 0, cArr111111113.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation11113 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Double.TYPE) {
                                                }
                                                if (cls == Boolean.TYPE) {
                                                }
                                                if (!z5) {
                                                    if (!fieldInfo2.unwrapped) {
                                                    }
                                                    c3 = ',';
                                                    serializeWriter.write(44);
                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                        jSONSerializer.println();
                                                    }
                                                } else {
                                                    c3 = ',';
                                                }
                                                if (strProcessKey == str2) {
                                                    z3 = true;
                                                    if (objTrim == objDefaultValue) {
                                                        if (!z6) {
                                                            boolean zIsAssignableFrom11113 = Map.class.isAssignableFrom(cls3);
                                                            if (cls3.isPrimitive()) {
                                                            }
                                                            if (zIsEnabled) {
                                                                if (z7) {
                                                                    char[] cArr111111114 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr111111114, 0, cArr111111114.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            } else if (z7) {
                                                                char[] cArr111111115 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr111111115, 0, cArr111111115.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        }
                                                        if (z6) {
                                                            JSONField annotation11114 = fieldInfo2.getAnnotation();
                                                            if (cls3 == String.class) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            } else {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                        } else {
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (!z6) {
                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                } else {
                                                    if (z6) {
                                                        z3 = true;
                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                }
                                                if (!fieldInfo2.unwrapped) {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                } else {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                }
                                            }
                                            if (cls == Short.TYPE) {
                                                if (cls == Float.TYPE) {
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom11114 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr111111116 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr111111116, 0, cArr111111116.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr111111117 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr111111117, 0, cArr111111117.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation11115 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Double.TYPE) {
                                                }
                                                if (cls == Boolean.TYPE) {
                                                }
                                                if (!z5) {
                                                    if (!fieldInfo2.unwrapped) {
                                                    }
                                                    c3 = ',';
                                                    serializeWriter.write(44);
                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                        jSONSerializer.println();
                                                    }
                                                } else {
                                                    c3 = ',';
                                                }
                                                if (strProcessKey == str2) {
                                                    z3 = true;
                                                    if (objTrim == objDefaultValue) {
                                                        if (!z6) {
                                                            boolean zIsAssignableFrom11115 = Map.class.isAssignableFrom(cls3);
                                                            if (cls3.isPrimitive()) {
                                                            }
                                                            if (zIsEnabled) {
                                                                if (z7) {
                                                                    char[] cArr111111118 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr111111118, 0, cArr111111118.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            } else if (z7) {
                                                                char[] cArr111111119 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr111111119, 0, cArr111111119.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        }
                                                        if (z6) {
                                                            JSONField annotation11116 = fieldInfo2.getAnnotation();
                                                            if (cls3 == String.class) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            } else {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                        } else {
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (!z6) {
                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                } else {
                                                    if (z6) {
                                                        z3 = true;
                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                }
                                                if (!fieldInfo2.unwrapped) {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                } else {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                }
                                            }
                                            if (cls == Float.TYPE) {
                                                if (cls == Double.TYPE) {
                                                }
                                                if (cls == Boolean.TYPE) {
                                                }
                                                if (!z5) {
                                                    if (!fieldInfo2.unwrapped) {
                                                    }
                                                    c3 = ',';
                                                    serializeWriter.write(44);
                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                        jSONSerializer.println();
                                                    }
                                                } else {
                                                    c3 = ',';
                                                }
                                                if (strProcessKey == str2) {
                                                    z3 = true;
                                                    if (objTrim == objDefaultValue) {
                                                        if (!z6) {
                                                            boolean zIsAssignableFrom11116 = Map.class.isAssignableFrom(cls3);
                                                            if (cls3.isPrimitive()) {
                                                            }
                                                            if (zIsEnabled) {
                                                                if (z7) {
                                                                    char[] cArr1111111110 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr1111111110, 0, cArr1111111110.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            } else if (z7) {
                                                                char[] cArr1111111111 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr1111111111, 0, cArr1111111111.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        }
                                                        if (z6) {
                                                            JSONField annotation11117 = fieldInfo2.getAnnotation();
                                                            if (cls3 == String.class) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            } else {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                        } else {
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (!z6) {
                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                } else {
                                                    if (z6) {
                                                        z3 = true;
                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                }
                                                if (!fieldInfo2.unwrapped) {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                } else {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                }
                                            }
                                            if (cls == Double.TYPE) {
                                            }
                                            if (cls == Boolean.TYPE) {
                                            }
                                            if (!z5) {
                                                if (!fieldInfo2.unwrapped) {
                                                }
                                                c3 = ',';
                                                serializeWriter.write(44);
                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                    jSONSerializer.println();
                                                }
                                            } else {
                                                c3 = ',';
                                            }
                                            if (strProcessKey == str2) {
                                                z3 = true;
                                                if (objTrim == objDefaultValue) {
                                                    if (!z6) {
                                                        boolean zIsAssignableFrom11117 = Map.class.isAssignableFrom(cls3);
                                                        if (cls3.isPrimitive()) {
                                                        }
                                                        if (zIsEnabled) {
                                                            if (z7) {
                                                                char[] cArr1111111112 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr1111111112, 0, cArr1111111112.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        } else if (z7) {
                                                            char[] cArr1111111113 = fieldInfo2.name_chars;
                                                            serializeWriter.write(cArr1111111113, 0, cArr1111111113.length);
                                                        } else {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                    }
                                                    if (z6) {
                                                        JSONField annotation11118 = fieldInfo2.getAnnotation();
                                                        if (cls3 == String.class) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        } else {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                    } else {
                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (!z6) {
                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                }
                                                jSONSerializer.write(objDefaultValue);
                                            } else {
                                                if (z6) {
                                                    z3 = true;
                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                } else {
                                                    z3 = true;
                                                }
                                                jSONSerializer.write(objDefaultValue);
                                            }
                                            if (!fieldInfo2.unwrapped) {
                                                z5 = z3;
                                                break;
                                                break;
                                            } else {
                                                z5 = z3;
                                                break;
                                                break;
                                            }
                                            c3 = ',';
                                        } else {
                                            serialContext = serialContext3;
                                        }
                                        c2 = c5;
                                        if (!z5) {
                                            if (!fieldInfo2.unwrapped) {
                                            }
                                            c3 = ',';
                                            serializeWriter.write(44);
                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                jSONSerializer.println();
                                            }
                                        } else {
                                            c3 = ',';
                                        }
                                        if (strProcessKey == str2) {
                                            z3 = true;
                                            if (objTrim == objDefaultValue) {
                                                if (!z6) {
                                                    boolean zIsAssignableFrom11118 = Map.class.isAssignableFrom(cls3);
                                                    if (cls3.isPrimitive()) {
                                                    }
                                                    if (zIsEnabled) {
                                                        if (z7) {
                                                            char[] cArr1111111114 = fieldInfo2.name_chars;
                                                            serializeWriter.write(cArr1111111114, 0, cArr1111111114.length);
                                                        } else {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                    } else if (z7) {
                                                        char[] cArr1111111115 = fieldInfo2.name_chars;
                                                        serializeWriter.write(cArr1111111115, 0, cArr1111111115.length);
                                                    } else {
                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                    }
                                                }
                                                if (z6) {
                                                    JSONField annotation11119 = fieldInfo2.getAnnotation();
                                                    if (cls3 == String.class) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                    } else {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                    }
                                                } else {
                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                }
                                                if (!fieldInfo2.unwrapped) {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                } else {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                }
                                            }
                                            if (!z6) {
                                                fieldSerializer.writePrefix(jSONSerializer);
                                            }
                                            jSONSerializer.write(objDefaultValue);
                                        } else {
                                            if (z6) {
                                                z3 = true;
                                                serializeWriter.writeFieldName(strProcessKey, true);
                                            } else {
                                                z3 = true;
                                            }
                                            jSONSerializer.write(objDefaultValue);
                                        }
                                        if (!fieldInfo2.unwrapped) {
                                            z5 = z3;
                                            break;
                                            break;
                                        } else {
                                            z5 = z3;
                                            break;
                                            break;
                                        }
                                    }
                                    obj3 = propertyValueDirect;
                                    objTrim = obj3;
                                    strProcessKey = processKey(jSONSerializer, obj, str2, objTrim);
                                    objProcessValue = processValue(jSONSerializer, fieldSerializer.fieldContext, obj, str2, objTrim, i9);
                                    if (objProcessValue == null) {
                                        obj4 = objProcessValue;
                                        i4 = fieldInfo2.serialzeFeatures;
                                        annotation = fieldInfo2.getAnnotation();
                                        jSONType = this.beanInfo.jsonType;
                                        if (jSONType != null) {
                                            iM4802of = i4 | SerializerFeature.m4802of(jSONType.serialzeFeatures());
                                        }
                                        if (annotation != null) {
                                            iM4802of = i4;
                                            if (!"".equals(annotation.defaultValue())) {
                                                objDefaultValue = annotation.defaultValue();
                                            }
                                            if (objDefaultValue != null) {
                                                serialContext = serialContext3;
                                                if (!serializeWriter.notWriteDefaultValue) {
                                                    i2 = fieldInfo2.serialzeFeatures;
                                                    i3 = SerializerFeature.NotWriteDefaultValue.mask;
                                                    if ((i2 & i3) == 0) {
                                                    }
                                                }
                                                cls = fieldInfo2.fieldClass;
                                                c2 = c5;
                                                if (cls != Byte.TYPE) {
                                                    if (cls == Short.TYPE) {
                                                        if (cls == Float.TYPE) {
                                                            if (cls == Double.TYPE) {
                                                            }
                                                            if (cls == Boolean.TYPE) {
                                                            }
                                                            if (!z5) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                c3 = ',';
                                                                serializeWriter.write(44);
                                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                    jSONSerializer.println();
                                                                }
                                                            } else {
                                                                c3 = ',';
                                                            }
                                                            if (strProcessKey == str2) {
                                                                z3 = true;
                                                                if (objTrim == objDefaultValue) {
                                                                    if (!z6) {
                                                                        boolean zIsAssignableFrom11119 = Map.class.isAssignableFrom(cls3);
                                                                        if (cls3.isPrimitive()) {
                                                                        }
                                                                        if (zIsEnabled) {
                                                                            if (z7) {
                                                                                char[] cArr1111111116 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr1111111116, 0, cArr1111111116.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        } else if (z7) {
                                                                            char[] cArr1111111117 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr1111111117, 0, cArr1111111117.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    }
                                                                    if (z6) {
                                                                        JSONField annotation111110 = fieldInfo2.getAnnotation();
                                                                        if (cls3 == String.class) {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        } else {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                    } else {
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!z6) {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            } else {
                                                                if (z6) {
                                                                    z3 = true;
                                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom111110 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr1111111118 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr1111111118, 0, cArr1111111118.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr1111111119 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr1111111119, 0, cArr1111111119.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation111111 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (cls == Float.TYPE) {
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom111111 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr11111111110 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr11111111110, 0, cArr11111111110.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr11111111111 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr11111111111, 0, cArr11111111111.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation111112 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom111112 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr11111111112 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr11111111112, 0, cArr11111111112.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr11111111113 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr11111111113, 0, cArr11111111113.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation111113 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Short.TYPE) {
                                                    if (cls == Float.TYPE) {
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom111113 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr11111111114 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr11111111114, 0, cArr11111111114.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr11111111115 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr11111111115, 0, cArr11111111115.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation111114 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom111114 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr11111111116 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr11111111116, 0, cArr11111111116.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr11111111117 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr11111111117, 0, cArr11111111117.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation111115 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Float.TYPE) {
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom111115 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr11111111118 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr11111111118, 0, cArr11111111118.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr11111111119 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr11111111119, 0, cArr11111111119.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation111116 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Double.TYPE) {
                                                }
                                                if (cls == Boolean.TYPE) {
                                                }
                                                if (!z5) {
                                                    if (!fieldInfo2.unwrapped) {
                                                    }
                                                    c3 = ',';
                                                    serializeWriter.write(44);
                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                        jSONSerializer.println();
                                                    }
                                                } else {
                                                    c3 = ',';
                                                }
                                                if (strProcessKey == str2) {
                                                    z3 = true;
                                                    if (objTrim == objDefaultValue) {
                                                        if (!z6) {
                                                            boolean zIsAssignableFrom111116 = Map.class.isAssignableFrom(cls3);
                                                            if (cls3.isPrimitive()) {
                                                            }
                                                            if (zIsEnabled) {
                                                                if (z7) {
                                                                    char[] cArr111111111110 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr111111111110, 0, cArr111111111110.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            } else if (z7) {
                                                                char[] cArr111111111111 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr111111111111, 0, cArr111111111111.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        }
                                                        if (z6) {
                                                            JSONField annotation111117 = fieldInfo2.getAnnotation();
                                                            if (cls3 == String.class) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            } else {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                        } else {
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (!z6) {
                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                } else {
                                                    if (z6) {
                                                        z3 = true;
                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                }
                                                if (!fieldInfo2.unwrapped) {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                } else {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                }
                                                c3 = ',';
                                            } else {
                                                serialContext = serialContext3;
                                            }
                                            c2 = c5;
                                            if (!z5) {
                                                if (!fieldInfo2.unwrapped) {
                                                }
                                                c3 = ',';
                                                serializeWriter.write(44);
                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                    jSONSerializer.println();
                                                }
                                            } else {
                                                c3 = ',';
                                            }
                                            if (strProcessKey == str2) {
                                                z3 = true;
                                                if (objTrim == objDefaultValue) {
                                                    if (!z6) {
                                                        boolean zIsAssignableFrom111117 = Map.class.isAssignableFrom(cls3);
                                                        if (cls3.isPrimitive()) {
                                                        }
                                                        if (zIsEnabled) {
                                                            if (z7) {
                                                                char[] cArr111111111112 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr111111111112, 0, cArr111111111112.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        } else if (z7) {
                                                            char[] cArr111111111113 = fieldInfo2.name_chars;
                                                            serializeWriter.write(cArr111111111113, 0, cArr111111111113.length);
                                                        } else {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                    }
                                                    if (z6) {
                                                        JSONField annotation111118 = fieldInfo2.getAnnotation();
                                                        if (cls3 == String.class) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        } else {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                    } else {
                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (!z6) {
                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                }
                                                jSONSerializer.write(objDefaultValue);
                                            } else {
                                                if (z6) {
                                                    z3 = true;
                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                } else {
                                                    z3 = true;
                                                }
                                                jSONSerializer.write(objDefaultValue);
                                            }
                                            if (!fieldInfo2.unwrapped) {
                                                z5 = z3;
                                                break;
                                                break;
                                            } else {
                                                z5 = z3;
                                                break;
                                                break;
                                            }
                                        }
                                        iM4802of = i4;
                                        if (cls3 == Boolean.class) {
                                            i8 = SerializerFeature.WriteNullBooleanAsFalse.mask;
                                            int i110 = i8 | SerializerFeature.WriteMapNullValue.mask;
                                            if (!z6) {
                                            }
                                            if ((iM4802of & i8) == 0) {
                                            }
                                            objDefaultValue = Boolean.FALSE;
                                            if (objDefaultValue != null) {
                                                serialContext = serialContext3;
                                                if (!serializeWriter.notWriteDefaultValue) {
                                                    i2 = fieldInfo2.serialzeFeatures;
                                                    i3 = SerializerFeature.NotWriteDefaultValue.mask;
                                                    if ((i2 & i3) == 0) {
                                                    }
                                                }
                                                cls = fieldInfo2.fieldClass;
                                                c2 = c5;
                                                if (cls != Byte.TYPE) {
                                                    if (cls == Short.TYPE) {
                                                        if (cls == Float.TYPE) {
                                                            if (cls == Double.TYPE) {
                                                            }
                                                            if (cls == Boolean.TYPE) {
                                                            }
                                                            if (!z5) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                c3 = ',';
                                                                serializeWriter.write(44);
                                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                    jSONSerializer.println();
                                                                }
                                                            } else {
                                                                c3 = ',';
                                                            }
                                                            if (strProcessKey == str2) {
                                                                z3 = true;
                                                                if (objTrim == objDefaultValue) {
                                                                    if (!z6) {
                                                                        boolean zIsAssignableFrom111118 = Map.class.isAssignableFrom(cls3);
                                                                        if (cls3.isPrimitive()) {
                                                                        }
                                                                        if (zIsEnabled) {
                                                                            if (z7) {
                                                                                char[] cArr111111111114 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr111111111114, 0, cArr111111111114.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        } else if (z7) {
                                                                            char[] cArr111111111115 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr111111111115, 0, cArr111111111115.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    }
                                                                    if (z6) {
                                                                        JSONField annotation111119 = fieldInfo2.getAnnotation();
                                                                        if (cls3 == String.class) {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        } else {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                    } else {
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!z6) {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            } else {
                                                                if (z6) {
                                                                    z3 = true;
                                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom111119 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr111111111116 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr111111111116, 0, cArr111111111116.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr111111111117 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr111111111117, 0, cArr111111111117.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation1111110 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (cls == Float.TYPE) {
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom1111110 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr111111111118 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr111111111118, 0, cArr111111111118.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr111111111119 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr111111111119, 0, cArr111111111119.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation1111111 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom1111111 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr1111111111110 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr1111111111110, 0, cArr1111111111110.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr1111111111111 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr1111111111111, 0, cArr1111111111111.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation1111112 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Short.TYPE) {
                                                    if (cls == Float.TYPE) {
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom1111112 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr1111111111112 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr1111111111112, 0, cArr1111111111112.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr1111111111113 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr1111111111113, 0, cArr1111111111113.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation1111113 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom1111113 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr1111111111114 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr1111111111114, 0, cArr1111111111114.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr1111111111115 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr1111111111115, 0, cArr1111111111115.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation1111114 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Float.TYPE) {
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom1111114 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr1111111111116 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr1111111111116, 0, cArr1111111111116.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr1111111111117 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr1111111111117, 0, cArr1111111111117.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation1111115 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Double.TYPE) {
                                                }
                                                if (cls == Boolean.TYPE) {
                                                }
                                                if (!z5) {
                                                    if (!fieldInfo2.unwrapped) {
                                                    }
                                                    c3 = ',';
                                                    serializeWriter.write(44);
                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                        jSONSerializer.println();
                                                    }
                                                } else {
                                                    c3 = ',';
                                                }
                                                if (strProcessKey == str2) {
                                                    z3 = true;
                                                    if (objTrim == objDefaultValue) {
                                                        if (!z6) {
                                                            boolean zIsAssignableFrom1111115 = Map.class.isAssignableFrom(cls3);
                                                            if (cls3.isPrimitive()) {
                                                            }
                                                            if (zIsEnabled) {
                                                                if (z7) {
                                                                    char[] cArr1111111111118 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr1111111111118, 0, cArr1111111111118.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            } else if (z7) {
                                                                char[] cArr1111111111119 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr1111111111119, 0, cArr1111111111119.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        }
                                                        if (z6) {
                                                            JSONField annotation1111116 = fieldInfo2.getAnnotation();
                                                            if (cls3 == String.class) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            } else {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                        } else {
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (!z6) {
                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                } else {
                                                    if (z6) {
                                                        z3 = true;
                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                }
                                                if (!fieldInfo2.unwrapped) {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                } else {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                }
                                                c3 = ',';
                                            } else {
                                                serialContext = serialContext3;
                                            }
                                            c2 = c5;
                                            if (!z5) {
                                                if (!fieldInfo2.unwrapped) {
                                                }
                                                c3 = ',';
                                                serializeWriter.write(44);
                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                    jSONSerializer.println();
                                                }
                                            } else {
                                                c3 = ',';
                                            }
                                            if (strProcessKey == str2) {
                                                z3 = true;
                                                if (objTrim == objDefaultValue) {
                                                    if (!z6) {
                                                        boolean zIsAssignableFrom1111116 = Map.class.isAssignableFrom(cls3);
                                                        if (cls3.isPrimitive()) {
                                                        }
                                                        if (zIsEnabled) {
                                                            if (z7) {
                                                                char[] cArr11111111111110 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr11111111111110, 0, cArr11111111111110.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        } else if (z7) {
                                                            char[] cArr11111111111111 = fieldInfo2.name_chars;
                                                            serializeWriter.write(cArr11111111111111, 0, cArr11111111111111.length);
                                                        } else {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                    }
                                                    if (z6) {
                                                        JSONField annotation1111117 = fieldInfo2.getAnnotation();
                                                        if (cls3 == String.class) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        } else {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                    } else {
                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (!z6) {
                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                }
                                                jSONSerializer.write(objDefaultValue);
                                            } else {
                                                if (z6) {
                                                    z3 = true;
                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                } else {
                                                    z3 = true;
                                                }
                                                jSONSerializer.write(objDefaultValue);
                                            }
                                            if (!fieldInfo2.unwrapped) {
                                                z5 = z3;
                                                break;
                                                break;
                                            } else {
                                                z5 = z3;
                                                break;
                                                break;
                                            }
                                        }
                                        if (cls3 == String.class) {
                                            i7 = SerializerFeature.WriteNullStringAsEmpty.mask;
                                            int i111 = i7 | SerializerFeature.WriteMapNullValue.mask;
                                            if (!z6) {
                                            }
                                            if ((iM4802of & i7) == 0) {
                                            }
                                            objDefaultValue = "";
                                            if (objDefaultValue != null) {
                                                serialContext = serialContext3;
                                                if (!serializeWriter.notWriteDefaultValue) {
                                                    i2 = fieldInfo2.serialzeFeatures;
                                                    i3 = SerializerFeature.NotWriteDefaultValue.mask;
                                                    if ((i2 & i3) == 0) {
                                                    }
                                                }
                                                cls = fieldInfo2.fieldClass;
                                                c2 = c5;
                                                if (cls != Byte.TYPE) {
                                                    if (cls == Short.TYPE) {
                                                        if (cls == Float.TYPE) {
                                                            if (cls == Double.TYPE) {
                                                            }
                                                            if (cls == Boolean.TYPE) {
                                                            }
                                                            if (!z5) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                c3 = ',';
                                                                serializeWriter.write(44);
                                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                    jSONSerializer.println();
                                                                }
                                                            } else {
                                                                c3 = ',';
                                                            }
                                                            if (strProcessKey == str2) {
                                                                z3 = true;
                                                                if (objTrim == objDefaultValue) {
                                                                    if (!z6) {
                                                                        boolean zIsAssignableFrom1111117 = Map.class.isAssignableFrom(cls3);
                                                                        if (cls3.isPrimitive()) {
                                                                        }
                                                                        if (zIsEnabled) {
                                                                            if (z7) {
                                                                                char[] cArr11111111111112 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr11111111111112, 0, cArr11111111111112.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        } else if (z7) {
                                                                            char[] cArr11111111111113 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr11111111111113, 0, cArr11111111111113.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    }
                                                                    if (z6) {
                                                                        JSONField annotation1111118 = fieldInfo2.getAnnotation();
                                                                        if (cls3 == String.class) {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        } else {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                    } else {
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!z6) {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            } else {
                                                                if (z6) {
                                                                    z3 = true;
                                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom1111118 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr11111111111114 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr11111111111114, 0, cArr11111111111114.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr11111111111115 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr11111111111115, 0, cArr11111111111115.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation1111119 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (cls == Float.TYPE) {
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom1111119 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr11111111111116 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr11111111111116, 0, cArr11111111111116.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr11111111111117 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr11111111111117, 0, cArr11111111111117.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation11111110 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom11111110 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr11111111111118 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr11111111111118, 0, cArr11111111111118.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr11111111111119 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr11111111111119, 0, cArr11111111111119.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation11111111 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Short.TYPE) {
                                                    if (cls == Float.TYPE) {
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom11111111 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr111111111111110 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr111111111111110, 0, cArr111111111111110.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr111111111111111 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr111111111111111, 0, cArr111111111111111.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation11111112 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom11111112 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr111111111111112 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr111111111111112, 0, cArr111111111111112.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr111111111111113 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr111111111111113, 0, cArr111111111111113.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation11111113 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Float.TYPE) {
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom11111113 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr111111111111114 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr111111111111114, 0, cArr111111111111114.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr111111111111115 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr111111111111115, 0, cArr111111111111115.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation11111114 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Double.TYPE) {
                                                }
                                                if (cls == Boolean.TYPE) {
                                                }
                                                if (!z5) {
                                                    if (!fieldInfo2.unwrapped) {
                                                    }
                                                    c3 = ',';
                                                    serializeWriter.write(44);
                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                        jSONSerializer.println();
                                                    }
                                                } else {
                                                    c3 = ',';
                                                }
                                                if (strProcessKey == str2) {
                                                    z3 = true;
                                                    if (objTrim == objDefaultValue) {
                                                        if (!z6) {
                                                            boolean zIsAssignableFrom11111114 = Map.class.isAssignableFrom(cls3);
                                                            if (cls3.isPrimitive()) {
                                                            }
                                                            if (zIsEnabled) {
                                                                if (z7) {
                                                                    char[] cArr111111111111116 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr111111111111116, 0, cArr111111111111116.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            } else if (z7) {
                                                                char[] cArr111111111111117 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr111111111111117, 0, cArr111111111111117.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        }
                                                        if (z6) {
                                                            JSONField annotation11111115 = fieldInfo2.getAnnotation();
                                                            if (cls3 == String.class) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            } else {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                        } else {
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (!z6) {
                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                } else {
                                                    if (z6) {
                                                        z3 = true;
                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                }
                                                if (!fieldInfo2.unwrapped) {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                } else {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                }
                                                c3 = ',';
                                            } else {
                                                serialContext = serialContext3;
                                            }
                                            c2 = c5;
                                            if (!z5) {
                                                if (!fieldInfo2.unwrapped) {
                                                }
                                                c3 = ',';
                                                serializeWriter.write(44);
                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                    jSONSerializer.println();
                                                }
                                            } else {
                                                c3 = ',';
                                            }
                                            if (strProcessKey == str2) {
                                                z3 = true;
                                                if (objTrim == objDefaultValue) {
                                                    if (!z6) {
                                                        boolean zIsAssignableFrom11111115 = Map.class.isAssignableFrom(cls3);
                                                        if (cls3.isPrimitive()) {
                                                        }
                                                        if (zIsEnabled) {
                                                            if (z7) {
                                                                char[] cArr111111111111118 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr111111111111118, 0, cArr111111111111118.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        } else if (z7) {
                                                            char[] cArr111111111111119 = fieldInfo2.name_chars;
                                                            serializeWriter.write(cArr111111111111119, 0, cArr111111111111119.length);
                                                        } else {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                    }
                                                    if (z6) {
                                                        JSONField annotation11111116 = fieldInfo2.getAnnotation();
                                                        if (cls3 == String.class) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        } else {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                    } else {
                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (!z6) {
                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                }
                                                jSONSerializer.write(objDefaultValue);
                                            } else {
                                                if (z6) {
                                                    z3 = true;
                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                } else {
                                                    z3 = true;
                                                }
                                                jSONSerializer.write(objDefaultValue);
                                            }
                                            if (!fieldInfo2.unwrapped) {
                                                z5 = z3;
                                                break;
                                                break;
                                            } else {
                                                z5 = z3;
                                                break;
                                                break;
                                            }
                                        }
                                        if (Number.class.isAssignableFrom(cls3)) {
                                            i6 = SerializerFeature.WriteNullNumberAsZero.mask;
                                            int i112 = i6 | SerializerFeature.WriteMapNullValue.mask;
                                            if (!z6) {
                                            }
                                            if ((iM4802of & i6) == 0) {
                                            }
                                            objDefaultValue = 0;
                                            if (objDefaultValue != null) {
                                                serialContext = serialContext3;
                                                if (!serializeWriter.notWriteDefaultValue) {
                                                    i2 = fieldInfo2.serialzeFeatures;
                                                    i3 = SerializerFeature.NotWriteDefaultValue.mask;
                                                    if ((i2 & i3) == 0) {
                                                    }
                                                }
                                                cls = fieldInfo2.fieldClass;
                                                c2 = c5;
                                                if (cls != Byte.TYPE) {
                                                    if (cls == Short.TYPE) {
                                                        if (cls == Float.TYPE) {
                                                            if (cls == Double.TYPE) {
                                                            }
                                                            if (cls == Boolean.TYPE) {
                                                            }
                                                            if (!z5) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                c3 = ',';
                                                                serializeWriter.write(44);
                                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                    jSONSerializer.println();
                                                                }
                                                            } else {
                                                                c3 = ',';
                                                            }
                                                            if (strProcessKey == str2) {
                                                                z3 = true;
                                                                if (objTrim == objDefaultValue) {
                                                                    if (!z6) {
                                                                        boolean zIsAssignableFrom11111116 = Map.class.isAssignableFrom(cls3);
                                                                        if (cls3.isPrimitive()) {
                                                                        }
                                                                        if (zIsEnabled) {
                                                                            if (z7) {
                                                                                char[] cArr1111111111111110 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr1111111111111110, 0, cArr1111111111111110.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        } else if (z7) {
                                                                            char[] cArr1111111111111111 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr1111111111111111, 0, cArr1111111111111111.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    }
                                                                    if (z6) {
                                                                        JSONField annotation11111117 = fieldInfo2.getAnnotation();
                                                                        if (cls3 == String.class) {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        } else {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                    } else {
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!z6) {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            } else {
                                                                if (z6) {
                                                                    z3 = true;
                                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom11111117 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr1111111111111112 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr1111111111111112, 0, cArr1111111111111112.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr1111111111111113 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr1111111111111113, 0, cArr1111111111111113.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation11111118 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (cls == Float.TYPE) {
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom11111118 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr1111111111111114 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr1111111111111114, 0, cArr1111111111111114.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr1111111111111115 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr1111111111111115, 0, cArr1111111111111115.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation11111119 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom11111119 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr1111111111111116 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr1111111111111116, 0, cArr1111111111111116.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr1111111111111117 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr1111111111111117, 0, cArr1111111111111117.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation111111110 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Short.TYPE) {
                                                    if (cls == Float.TYPE) {
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom111111110 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr1111111111111118 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr1111111111111118, 0, cArr1111111111111118.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr1111111111111119 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr1111111111111119, 0, cArr1111111111111119.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation111111111 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom111111111 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr11111111111111110 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr11111111111111110, 0, cArr11111111111111110.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr11111111111111111 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr11111111111111111, 0, cArr11111111111111111.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation111111112 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Float.TYPE) {
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom111111112 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr11111111111111112 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr11111111111111112, 0, cArr11111111111111112.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr11111111111111113 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr11111111111111113, 0, cArr11111111111111113.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation111111113 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Double.TYPE) {
                                                }
                                                if (cls == Boolean.TYPE) {
                                                }
                                                if (!z5) {
                                                    if (!fieldInfo2.unwrapped) {
                                                    }
                                                    c3 = ',';
                                                    serializeWriter.write(44);
                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                        jSONSerializer.println();
                                                    }
                                                } else {
                                                    c3 = ',';
                                                }
                                                if (strProcessKey == str2) {
                                                    z3 = true;
                                                    if (objTrim == objDefaultValue) {
                                                        if (!z6) {
                                                            boolean zIsAssignableFrom111111113 = Map.class.isAssignableFrom(cls3);
                                                            if (cls3.isPrimitive()) {
                                                            }
                                                            if (zIsEnabled) {
                                                                if (z7) {
                                                                    char[] cArr11111111111111114 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr11111111111111114, 0, cArr11111111111111114.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            } else if (z7) {
                                                                char[] cArr11111111111111115 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr11111111111111115, 0, cArr11111111111111115.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        }
                                                        if (z6) {
                                                            JSONField annotation111111114 = fieldInfo2.getAnnotation();
                                                            if (cls3 == String.class) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            } else {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                        } else {
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (!z6) {
                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                } else {
                                                    if (z6) {
                                                        z3 = true;
                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                }
                                                if (!fieldInfo2.unwrapped) {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                } else {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                }
                                                c3 = ',';
                                            } else {
                                                serialContext = serialContext3;
                                            }
                                            c2 = c5;
                                            if (!z5) {
                                                if (!fieldInfo2.unwrapped) {
                                                }
                                                c3 = ',';
                                                serializeWriter.write(44);
                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                    jSONSerializer.println();
                                                }
                                            } else {
                                                c3 = ',';
                                            }
                                            if (strProcessKey == str2) {
                                                z3 = true;
                                                if (objTrim == objDefaultValue) {
                                                    if (!z6) {
                                                        boolean zIsAssignableFrom111111114 = Map.class.isAssignableFrom(cls3);
                                                        if (cls3.isPrimitive()) {
                                                        }
                                                        if (zIsEnabled) {
                                                            if (z7) {
                                                                char[] cArr11111111111111116 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr11111111111111116, 0, cArr11111111111111116.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        } else if (z7) {
                                                            char[] cArr11111111111111117 = fieldInfo2.name_chars;
                                                            serializeWriter.write(cArr11111111111111117, 0, cArr11111111111111117.length);
                                                        } else {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                    }
                                                    if (z6) {
                                                        JSONField annotation111111115 = fieldInfo2.getAnnotation();
                                                        if (cls3 == String.class) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        } else {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                    } else {
                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (!z6) {
                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                }
                                                jSONSerializer.write(objDefaultValue);
                                            } else {
                                                if (z6) {
                                                    z3 = true;
                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                } else {
                                                    z3 = true;
                                                }
                                                jSONSerializer.write(objDefaultValue);
                                            }
                                            if (!fieldInfo2.unwrapped) {
                                                z5 = z3;
                                                break;
                                                break;
                                            } else {
                                                z5 = z3;
                                                break;
                                                break;
                                            }
                                        }
                                        if (Collection.class.isAssignableFrom(cls3)) {
                                            i5 = SerializerFeature.WriteNullListAsEmpty.mask;
                                            int i113 = i5 | SerializerFeature.WriteMapNullValue.mask;
                                            if (!z6) {
                                            }
                                            if ((iM4802of & i5) == 0) {
                                            }
                                            objDefaultValue = Collections.EMPTY_LIST;
                                            if (objDefaultValue != null) {
                                                serialContext = serialContext3;
                                                if (!serializeWriter.notWriteDefaultValue) {
                                                    i2 = fieldInfo2.serialzeFeatures;
                                                    i3 = SerializerFeature.NotWriteDefaultValue.mask;
                                                    if ((i2 & i3) == 0) {
                                                    }
                                                }
                                                cls = fieldInfo2.fieldClass;
                                                c2 = c5;
                                                if (cls != Byte.TYPE) {
                                                    if (cls == Short.TYPE) {
                                                        if (cls == Float.TYPE) {
                                                            if (cls == Double.TYPE) {
                                                            }
                                                            if (cls == Boolean.TYPE) {
                                                            }
                                                            if (!z5) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                c3 = ',';
                                                                serializeWriter.write(44);
                                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                    jSONSerializer.println();
                                                                }
                                                            } else {
                                                                c3 = ',';
                                                            }
                                                            if (strProcessKey == str2) {
                                                                z3 = true;
                                                                if (objTrim == objDefaultValue) {
                                                                    if (!z6) {
                                                                        boolean zIsAssignableFrom111111115 = Map.class.isAssignableFrom(cls3);
                                                                        if (cls3.isPrimitive()) {
                                                                        }
                                                                        if (zIsEnabled) {
                                                                            if (z7) {
                                                                                char[] cArr11111111111111118 = fieldInfo2.name_chars;
                                                                                serializeWriter.write(cArr11111111111111118, 0, cArr11111111111111118.length);
                                                                            } else {
                                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                                            }
                                                                        } else if (z7) {
                                                                            char[] cArr11111111111111119 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr11111111111111119, 0, cArr11111111111111119.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    }
                                                                    if (z6) {
                                                                        JSONField annotation111111116 = fieldInfo2.getAnnotation();
                                                                        if (cls3 == String.class) {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        } else {
                                                                            if (!fieldInfo2.unwrapped) {
                                                                            }
                                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                        }
                                                                    } else {
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                    if (!fieldInfo2.unwrapped) {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        z5 = z3;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!z6) {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            } else {
                                                                if (z6) {
                                                                    z3 = true;
                                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                                jSONSerializer.write(objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom111111116 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr111111111111111110 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr111111111111111110, 0, cArr111111111111111110.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr111111111111111111 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr111111111111111111, 0, cArr111111111111111111.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation111111117 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (cls == Float.TYPE) {
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom111111117 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr111111111111111112 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr111111111111111112, 0, cArr111111111111111112.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr111111111111111113 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr111111111111111113, 0, cArr111111111111111113.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation111111118 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom111111118 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr111111111111111114 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr111111111111111114, 0, cArr111111111111111114.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr111111111111111115 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr111111111111111115, 0, cArr111111111111111115.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation111111119 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Short.TYPE) {
                                                    if (cls == Float.TYPE) {
                                                        if (cls == Double.TYPE) {
                                                        }
                                                        if (cls == Boolean.TYPE) {
                                                        }
                                                        if (!z5) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            c3 = ',';
                                                            serializeWriter.write(44);
                                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                                jSONSerializer.println();
                                                            }
                                                        } else {
                                                            c3 = ',';
                                                        }
                                                        if (strProcessKey == str2) {
                                                            z3 = true;
                                                            if (objTrim == objDefaultValue) {
                                                                if (!z6) {
                                                                    boolean zIsAssignableFrom111111119 = Map.class.isAssignableFrom(cls3);
                                                                    if (cls3.isPrimitive()) {
                                                                    }
                                                                    if (zIsEnabled) {
                                                                        if (z7) {
                                                                            char[] cArr111111111111111116 = fieldInfo2.name_chars;
                                                                            serializeWriter.write(cArr111111111111111116, 0, cArr111111111111111116.length);
                                                                        } else {
                                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                                        }
                                                                    } else if (z7) {
                                                                        char[] cArr111111111111111117 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr111111111111111117, 0, cArr111111111111111117.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                }
                                                                if (z6) {
                                                                    JSONField annotation1111111110 = fieldInfo2.getAnnotation();
                                                                    if (cls3 == String.class) {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    } else {
                                                                        if (!fieldInfo2.unwrapped) {
                                                                        }
                                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                    }
                                                                } else {
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                                if (!fieldInfo2.unwrapped) {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    z5 = z3;
                                                                    break;
                                                                    break;
                                                                }
                                                            }
                                                            if (!z6) {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        } else {
                                                            if (z6) {
                                                                z3 = true;
                                                                serializeWriter.writeFieldName(strProcessKey, true);
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            jSONSerializer.write(objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom1111111110 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr111111111111111118 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr111111111111111118, 0, cArr111111111111111118.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr111111111111111119 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr111111111111111119, 0, cArr111111111111111119.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation1111111111 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Float.TYPE) {
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom1111111111 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr1111111111111111110 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr1111111111111111110, 0, cArr1111111111111111110.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr1111111111111111111 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr1111111111111111111, 0, cArr1111111111111111111.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation1111111112 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Double.TYPE) {
                                                }
                                                if (cls == Boolean.TYPE) {
                                                }
                                                if (!z5) {
                                                    if (!fieldInfo2.unwrapped) {
                                                    }
                                                    c3 = ',';
                                                    serializeWriter.write(44);
                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                        jSONSerializer.println();
                                                    }
                                                } else {
                                                    c3 = ',';
                                                }
                                                if (strProcessKey == str2) {
                                                    z3 = true;
                                                    if (objTrim == objDefaultValue) {
                                                        if (!z6) {
                                                            boolean zIsAssignableFrom1111111112 = Map.class.isAssignableFrom(cls3);
                                                            if (cls3.isPrimitive()) {
                                                            }
                                                            if (zIsEnabled) {
                                                                if (z7) {
                                                                    char[] cArr1111111111111111112 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr1111111111111111112, 0, cArr1111111111111111112.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            } else if (z7) {
                                                                char[] cArr1111111111111111113 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr1111111111111111113, 0, cArr1111111111111111113.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        }
                                                        if (z6) {
                                                            JSONField annotation1111111113 = fieldInfo2.getAnnotation();
                                                            if (cls3 == String.class) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            } else {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                        } else {
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (!z6) {
                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                } else {
                                                    if (z6) {
                                                        z3 = true;
                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                }
                                                if (!fieldInfo2.unwrapped) {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                } else {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                }
                                                c3 = ',';
                                            } else {
                                                serialContext = serialContext3;
                                            }
                                            c2 = c5;
                                            if (!z5) {
                                                if (!fieldInfo2.unwrapped) {
                                                }
                                                c3 = ',';
                                                serializeWriter.write(44);
                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                    jSONSerializer.println();
                                                }
                                            } else {
                                                c3 = ',';
                                            }
                                            if (strProcessKey == str2) {
                                                z3 = true;
                                                if (objTrim == objDefaultValue) {
                                                    if (!z6) {
                                                        boolean zIsAssignableFrom1111111113 = Map.class.isAssignableFrom(cls3);
                                                        if (cls3.isPrimitive()) {
                                                        }
                                                        if (zIsEnabled) {
                                                            if (z7) {
                                                                char[] cArr1111111111111111114 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr1111111111111111114, 0, cArr1111111111111111114.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        } else if (z7) {
                                                            char[] cArr1111111111111111115 = fieldInfo2.name_chars;
                                                            serializeWriter.write(cArr1111111111111111115, 0, cArr1111111111111111115.length);
                                                        } else {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                    }
                                                    if (z6) {
                                                        JSONField annotation1111111114 = fieldInfo2.getAnnotation();
                                                        if (cls3 == String.class) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        } else {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                    } else {
                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (!z6) {
                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                }
                                                jSONSerializer.write(objDefaultValue);
                                            } else {
                                                if (z6) {
                                                    z3 = true;
                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                } else {
                                                    z3 = true;
                                                }
                                                jSONSerializer.write(objDefaultValue);
                                            }
                                            if (!fieldInfo2.unwrapped) {
                                                z5 = z3;
                                                break;
                                                break;
                                            } else {
                                                z5 = z3;
                                                break;
                                                break;
                                            }
                                        }
                                        if (z6) {
                                        }
                                    } else {
                                        obj4 = objProcessValue;
                                    }
                                    objDefaultValue = obj4;
                                    if (objDefaultValue != null) {
                                        serialContext = serialContext3;
                                        if (!serializeWriter.notWriteDefaultValue) {
                                            i2 = fieldInfo2.serialzeFeatures;
                                            i3 = SerializerFeature.NotWriteDefaultValue.mask;
                                            if ((i2 & i3) == 0) {
                                            }
                                        }
                                        cls = fieldInfo2.fieldClass;
                                        c2 = c5;
                                        if (cls != Byte.TYPE) {
                                            if (cls == Short.TYPE) {
                                                if (cls == Float.TYPE) {
                                                    if (cls == Double.TYPE) {
                                                    }
                                                    if (cls == Boolean.TYPE) {
                                                    }
                                                    if (!z5) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        c3 = ',';
                                                        serializeWriter.write(44);
                                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                            jSONSerializer.println();
                                                        }
                                                    } else {
                                                        c3 = ',';
                                                    }
                                                    if (strProcessKey == str2) {
                                                        z3 = true;
                                                        if (objTrim == objDefaultValue) {
                                                            if (!z6) {
                                                                boolean zIsAssignableFrom1111111114 = Map.class.isAssignableFrom(cls3);
                                                                if (cls3.isPrimitive()) {
                                                                }
                                                                if (zIsEnabled) {
                                                                    if (z7) {
                                                                        char[] cArr1111111111111111116 = fieldInfo2.name_chars;
                                                                        serializeWriter.write(cArr1111111111111111116, 0, cArr1111111111111111116.length);
                                                                    } else {
                                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                                    }
                                                                } else if (z7) {
                                                                    char[] cArr1111111111111111117 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr1111111111111111117, 0, cArr1111111111111111117.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            }
                                                            if (z6) {
                                                                JSONField annotation1111111115 = fieldInfo2.getAnnotation();
                                                                if (cls3 == String.class) {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                } else {
                                                                    if (!fieldInfo2.unwrapped) {
                                                                    }
                                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                                }
                                                            } else {
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                            if (!fieldInfo2.unwrapped) {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            } else {
                                                                z5 = z3;
                                                                break;
                                                                break;
                                                            }
                                                        }
                                                        if (!z6) {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    } else {
                                                        if (z6) {
                                                            z3 = true;
                                                            serializeWriter.writeFieldName(strProcessKey, true);
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        jSONSerializer.write(objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (cls == Double.TYPE) {
                                                }
                                                if (cls == Boolean.TYPE) {
                                                }
                                                if (!z5) {
                                                    if (!fieldInfo2.unwrapped) {
                                                    }
                                                    c3 = ',';
                                                    serializeWriter.write(44);
                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                        jSONSerializer.println();
                                                    }
                                                } else {
                                                    c3 = ',';
                                                }
                                                if (strProcessKey == str2) {
                                                    z3 = true;
                                                    if (objTrim == objDefaultValue) {
                                                        if (!z6) {
                                                            boolean zIsAssignableFrom1111111115 = Map.class.isAssignableFrom(cls3);
                                                            if (cls3.isPrimitive()) {
                                                            }
                                                            if (zIsEnabled) {
                                                                if (z7) {
                                                                    char[] cArr1111111111111111118 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr1111111111111111118, 0, cArr1111111111111111118.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            } else if (z7) {
                                                                char[] cArr1111111111111111119 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr1111111111111111119, 0, cArr1111111111111111119.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        }
                                                        if (z6) {
                                                            JSONField annotation1111111116 = fieldInfo2.getAnnotation();
                                                            if (cls3 == String.class) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            } else {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                        } else {
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (!z6) {
                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                } else {
                                                    if (z6) {
                                                        z3 = true;
                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                }
                                                if (!fieldInfo2.unwrapped) {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                } else {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                }
                                            }
                                            if (cls == Float.TYPE) {
                                                if (cls == Double.TYPE) {
                                                }
                                                if (cls == Boolean.TYPE) {
                                                }
                                                if (!z5) {
                                                    if (!fieldInfo2.unwrapped) {
                                                    }
                                                    c3 = ',';
                                                    serializeWriter.write(44);
                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                        jSONSerializer.println();
                                                    }
                                                } else {
                                                    c3 = ',';
                                                }
                                                if (strProcessKey == str2) {
                                                    z3 = true;
                                                    if (objTrim == objDefaultValue) {
                                                        if (!z6) {
                                                            boolean zIsAssignableFrom1111111116 = Map.class.isAssignableFrom(cls3);
                                                            if (cls3.isPrimitive()) {
                                                            }
                                                            if (zIsEnabled) {
                                                                if (z7) {
                                                                    char[] cArr11111111111111111110 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr11111111111111111110, 0, cArr11111111111111111110.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            } else if (z7) {
                                                                char[] cArr11111111111111111111 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr11111111111111111111, 0, cArr11111111111111111111.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        }
                                                        if (z6) {
                                                            JSONField annotation1111111117 = fieldInfo2.getAnnotation();
                                                            if (cls3 == String.class) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            } else {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                        } else {
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (!z6) {
                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                } else {
                                                    if (z6) {
                                                        z3 = true;
                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                }
                                                if (!fieldInfo2.unwrapped) {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                } else {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                }
                                            }
                                            if (cls == Double.TYPE) {
                                            }
                                            if (cls == Boolean.TYPE) {
                                            }
                                            if (!z5) {
                                                if (!fieldInfo2.unwrapped) {
                                                }
                                                c3 = ',';
                                                serializeWriter.write(44);
                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                    jSONSerializer.println();
                                                }
                                            } else {
                                                c3 = ',';
                                            }
                                            if (strProcessKey == str2) {
                                                z3 = true;
                                                if (objTrim == objDefaultValue) {
                                                    if (!z6) {
                                                        boolean zIsAssignableFrom1111111117 = Map.class.isAssignableFrom(cls3);
                                                        if (cls3.isPrimitive()) {
                                                        }
                                                        if (zIsEnabled) {
                                                            if (z7) {
                                                                char[] cArr11111111111111111112 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr11111111111111111112, 0, cArr11111111111111111112.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        } else if (z7) {
                                                            char[] cArr11111111111111111113 = fieldInfo2.name_chars;
                                                            serializeWriter.write(cArr11111111111111111113, 0, cArr11111111111111111113.length);
                                                        } else {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                    }
                                                    if (z6) {
                                                        JSONField annotation1111111118 = fieldInfo2.getAnnotation();
                                                        if (cls3 == String.class) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        } else {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                    } else {
                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (!z6) {
                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                }
                                                jSONSerializer.write(objDefaultValue);
                                            } else {
                                                if (z6) {
                                                    z3 = true;
                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                } else {
                                                    z3 = true;
                                                }
                                                jSONSerializer.write(objDefaultValue);
                                            }
                                            if (!fieldInfo2.unwrapped) {
                                                z5 = z3;
                                                break;
                                                break;
                                            } else {
                                                z5 = z3;
                                                break;
                                                break;
                                            }
                                        }
                                        if (cls == Short.TYPE) {
                                            if (cls == Float.TYPE) {
                                                if (cls == Double.TYPE) {
                                                }
                                                if (cls == Boolean.TYPE) {
                                                }
                                                if (!z5) {
                                                    if (!fieldInfo2.unwrapped) {
                                                    }
                                                    c3 = ',';
                                                    serializeWriter.write(44);
                                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                        jSONSerializer.println();
                                                    }
                                                } else {
                                                    c3 = ',';
                                                }
                                                if (strProcessKey == str2) {
                                                    z3 = true;
                                                    if (objTrim == objDefaultValue) {
                                                        if (!z6) {
                                                            boolean zIsAssignableFrom1111111118 = Map.class.isAssignableFrom(cls3);
                                                            if (cls3.isPrimitive()) {
                                                            }
                                                            if (zIsEnabled) {
                                                                if (z7) {
                                                                    char[] cArr11111111111111111114 = fieldInfo2.name_chars;
                                                                    serializeWriter.write(cArr11111111111111111114, 0, cArr11111111111111111114.length);
                                                                } else {
                                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                                }
                                                            } else if (z7) {
                                                                char[] cArr11111111111111111115 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr11111111111111111115, 0, cArr11111111111111111115.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        }
                                                        if (z6) {
                                                            JSONField annotation1111111119 = fieldInfo2.getAnnotation();
                                                            if (cls3 == String.class) {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            } else {
                                                                if (!fieldInfo2.unwrapped) {
                                                                }
                                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                            }
                                                        } else {
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                        if (!fieldInfo2.unwrapped) {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        } else {
                                                            z5 = z3;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (!z6) {
                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                } else {
                                                    if (z6) {
                                                        z3 = true;
                                                        serializeWriter.writeFieldName(strProcessKey, true);
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    jSONSerializer.write(objDefaultValue);
                                                }
                                                if (!fieldInfo2.unwrapped) {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                } else {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                }
                                            }
                                            if (cls == Double.TYPE) {
                                            }
                                            if (cls == Boolean.TYPE) {
                                            }
                                            if (!z5) {
                                                if (!fieldInfo2.unwrapped) {
                                                }
                                                c3 = ',';
                                                serializeWriter.write(44);
                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                    jSONSerializer.println();
                                                }
                                            } else {
                                                c3 = ',';
                                            }
                                            if (strProcessKey == str2) {
                                                z3 = true;
                                                if (objTrim == objDefaultValue) {
                                                    if (!z6) {
                                                        boolean zIsAssignableFrom1111111119 = Map.class.isAssignableFrom(cls3);
                                                        if (cls3.isPrimitive()) {
                                                        }
                                                        if (zIsEnabled) {
                                                            if (z7) {
                                                                char[] cArr11111111111111111116 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr11111111111111111116, 0, cArr11111111111111111116.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        } else if (z7) {
                                                            char[] cArr11111111111111111117 = fieldInfo2.name_chars;
                                                            serializeWriter.write(cArr11111111111111111117, 0, cArr11111111111111111117.length);
                                                        } else {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                    }
                                                    if (z6) {
                                                        JSONField annotation11111111110 = fieldInfo2.getAnnotation();
                                                        if (cls3 == String.class) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        } else {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                    } else {
                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (!z6) {
                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                }
                                                jSONSerializer.write(objDefaultValue);
                                            } else {
                                                if (z6) {
                                                    z3 = true;
                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                } else {
                                                    z3 = true;
                                                }
                                                jSONSerializer.write(objDefaultValue);
                                            }
                                            if (!fieldInfo2.unwrapped) {
                                                z5 = z3;
                                                break;
                                                break;
                                            } else {
                                                z5 = z3;
                                                break;
                                                break;
                                            }
                                        }
                                        if (cls == Float.TYPE) {
                                            if (cls == Double.TYPE) {
                                            }
                                            if (cls == Boolean.TYPE) {
                                            }
                                            if (!z5) {
                                                if (!fieldInfo2.unwrapped) {
                                                }
                                                c3 = ',';
                                                serializeWriter.write(44);
                                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                    jSONSerializer.println();
                                                }
                                            } else {
                                                c3 = ',';
                                            }
                                            if (strProcessKey == str2) {
                                                z3 = true;
                                                if (objTrim == objDefaultValue) {
                                                    if (!z6) {
                                                        boolean zIsAssignableFrom11111111110 = Map.class.isAssignableFrom(cls3);
                                                        if (cls3.isPrimitive()) {
                                                        }
                                                        if (zIsEnabled) {
                                                            if (z7) {
                                                                char[] cArr11111111111111111118 = fieldInfo2.name_chars;
                                                                serializeWriter.write(cArr11111111111111111118, 0, cArr11111111111111111118.length);
                                                            } else {
                                                                fieldSerializer.writePrefix(jSONSerializer);
                                                            }
                                                        } else if (z7) {
                                                            char[] cArr11111111111111111119 = fieldInfo2.name_chars;
                                                            serializeWriter.write(cArr11111111111111111119, 0, cArr11111111111111111119.length);
                                                        } else {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                    }
                                                    if (z6) {
                                                        JSONField annotation11111111111 = fieldInfo2.getAnnotation();
                                                        if (cls3 == String.class) {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        } else {
                                                            if (!fieldInfo2.unwrapped) {
                                                            }
                                                            fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                        }
                                                    } else {
                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                    }
                                                    if (!fieldInfo2.unwrapped) {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    } else {
                                                        z5 = z3;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (!z6) {
                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                }
                                                jSONSerializer.write(objDefaultValue);
                                            } else {
                                                if (z6) {
                                                    z3 = true;
                                                    serializeWriter.writeFieldName(strProcessKey, true);
                                                } else {
                                                    z3 = true;
                                                }
                                                jSONSerializer.write(objDefaultValue);
                                            }
                                            if (!fieldInfo2.unwrapped) {
                                                z5 = z3;
                                                break;
                                                break;
                                            } else {
                                                z5 = z3;
                                                break;
                                                break;
                                            }
                                        }
                                        if (cls == Double.TYPE) {
                                        }
                                        if (cls == Boolean.TYPE) {
                                        }
                                        if (!z5) {
                                            if (!fieldInfo2.unwrapped) {
                                            }
                                            c3 = ',';
                                            serializeWriter.write(44);
                                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                                jSONSerializer.println();
                                            }
                                        } else {
                                            c3 = ',';
                                        }
                                        if (strProcessKey == str2) {
                                            z3 = true;
                                            if (objTrim == objDefaultValue) {
                                                if (!z6) {
                                                    boolean zIsAssignableFrom11111111111 = Map.class.isAssignableFrom(cls3);
                                                    if (cls3.isPrimitive()) {
                                                    }
                                                    if (zIsEnabled) {
                                                        if (z7) {
                                                            char[] cArr111111111111111111110 = fieldInfo2.name_chars;
                                                            serializeWriter.write(cArr111111111111111111110, 0, cArr111111111111111111110.length);
                                                        } else {
                                                            fieldSerializer.writePrefix(jSONSerializer);
                                                        }
                                                    } else if (z7) {
                                                        char[] cArr111111111111111111111 = fieldInfo2.name_chars;
                                                        serializeWriter.write(cArr111111111111111111111, 0, cArr111111111111111111111.length);
                                                    } else {
                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                    }
                                                }
                                                if (z6) {
                                                    JSONField annotation11111111112 = fieldInfo2.getAnnotation();
                                                    if (cls3 == String.class) {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                    } else {
                                                        if (!fieldInfo2.unwrapped) {
                                                        }
                                                        fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                    }
                                                } else {
                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                }
                                                if (!fieldInfo2.unwrapped) {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                } else {
                                                    z5 = z3;
                                                    break;
                                                    break;
                                                }
                                            }
                                            if (!z6) {
                                                fieldSerializer.writePrefix(jSONSerializer);
                                            }
                                            jSONSerializer.write(objDefaultValue);
                                        } else {
                                            if (z6) {
                                                z3 = true;
                                                serializeWriter.writeFieldName(strProcessKey, true);
                                            } else {
                                                z3 = true;
                                            }
                                            jSONSerializer.write(objDefaultValue);
                                        }
                                        if (!fieldInfo2.unwrapped) {
                                            z5 = z3;
                                            break;
                                            break;
                                        } else {
                                            z5 = z3;
                                            break;
                                            break;
                                        }
                                        c3 = ',';
                                    } else {
                                        serialContext = serialContext3;
                                    }
                                    c2 = c5;
                                    if (!z5) {
                                        if (!fieldInfo2.unwrapped) {
                                        }
                                        c3 = ',';
                                        serializeWriter.write(44);
                                        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                            jSONSerializer.println();
                                        }
                                    } else {
                                        c3 = ',';
                                    }
                                    if (strProcessKey == str2) {
                                        z3 = true;
                                        if (objTrim == objDefaultValue) {
                                            if (!z6) {
                                                boolean zIsAssignableFrom11111111112 = Map.class.isAssignableFrom(cls3);
                                                if (cls3.isPrimitive()) {
                                                }
                                                if (zIsEnabled) {
                                                    if (z7) {
                                                        char[] cArr111111111111111111112 = fieldInfo2.name_chars;
                                                        serializeWriter.write(cArr111111111111111111112, 0, cArr111111111111111111112.length);
                                                    } else {
                                                        fieldSerializer.writePrefix(jSONSerializer);
                                                    }
                                                } else if (z7) {
                                                    char[] cArr111111111111111111113 = fieldInfo2.name_chars;
                                                    serializeWriter.write(cArr111111111111111111113, 0, cArr111111111111111111113.length);
                                                } else {
                                                    fieldSerializer.writePrefix(jSONSerializer);
                                                }
                                            }
                                            if (z6) {
                                                JSONField annotation11111111113 = fieldInfo2.getAnnotation();
                                                if (cls3 == String.class) {
                                                    if (!fieldInfo2.unwrapped) {
                                                    }
                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                } else {
                                                    if (!fieldInfo2.unwrapped) {
                                                    }
                                                    fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                                }
                                            } else {
                                                fieldSerializer.writeValue(jSONSerializer, objDefaultValue);
                                            }
                                            if (!fieldInfo2.unwrapped) {
                                                z5 = z3;
                                                break;
                                                break;
                                            } else {
                                                z5 = z3;
                                                break;
                                                break;
                                            }
                                        }
                                        if (!z6) {
                                            fieldSerializer.writePrefix(jSONSerializer);
                                        }
                                        jSONSerializer.write(objDefaultValue);
                                    } else {
                                        if (z6) {
                                            z3 = true;
                                            serializeWriter.writeFieldName(strProcessKey, true);
                                        } else {
                                            z3 = true;
                                        }
                                        jSONSerializer.write(objDefaultValue);
                                    }
                                    if (!fieldInfo2.unwrapped) {
                                        z5 = z3;
                                        break;
                                        break;
                                    } else {
                                        z5 = z3;
                                        break;
                                        break;
                                    }
                                }
                                serialContext = serialContext3;
                                c2 = c5;
                                c3 = ',';
                            }
                        }
                        type2 = type;
                        i9 = i;
                        i12 = i13 + 1;
                        c6 = c3;
                        zIsWriteAsArray = z6;
                        serialContext3 = serialContext;
                        c5 = c2;
                    } catch (Exception e6) {
                        e = e6;
                        fieldSerializer = fieldSerializer2;
                        str = "write javaBean error, fastjson version 1.2.62, class " + obj.getClass().getName();
                        if (obj2 != null) {
                            str = str + ", fieldName : " + obj2;
                        } else if (fieldSerializer != null && (fieldInfo = fieldSerializer.fieldInfo) != null) {
                            if (fieldInfo.method != null) {
                                str = str + ", method : " + fieldInfo.method.getName();
                            } else {
                                str = str + ", fieldName : " + fieldSerializer.fieldInfo.name;
                            }
                        }
                        if (e.getMessage() != null) {
                            str = str + ", " + e.getMessage();
                        }
                        if (e instanceof InvocationTargetException) {
                            cause = e.getCause();
                        } else {
                            cause = null;
                        }
                        if (cause == null) {
                            e = cause;
                        }
                        throw new JSONException(str, e);
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e7) {
                e = e7;
            }
        }
        serialContext = serialContext3;
        char c7 = c5;
        try {
            writeAfter(jSONSerializer, obj, z5 ? c6 : (char) 0);
            if (fieldSerializerArr.length > 0 && serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                jSONSerializer.decrementIdent();
                jSONSerializer.println();
            }
            if (!z) {
                serializeWriter.append(c7);
            }
            jSONSerializer.context = serialContext;
        } catch (Exception e8) {
            e = e8;
            serialContext3 = serialContext;
            fieldSerializer = fieldSerializer2;
            str = "write javaBean error, fastjson version 1.2.62, class " + obj.getClass().getName();
            if (obj2 != null) {
                str = str + ", fieldName : " + obj2;
            } else if (fieldSerializer != null) {
                if (fieldInfo.method != null) {
                    str = str + ", method : " + fieldInfo.method.getName();
                } else {
                    str = str + ", fieldName : " + fieldSerializer.fieldInfo.name;
                }
            }
            if (e.getMessage() != null) {
                str = str + ", " + e.getMessage();
            }
            if (e instanceof InvocationTargetException) {
                cause = e.getCause();
            } else {
                cause = null;
            }
            if (cause == null) {
                e = cause;
            }
            throw new JSONException(str, e);
        }
    }

    public char writeAfter(JSONSerializer jSONSerializer, Object obj, char c) {
        List<AfterFilter> list = jSONSerializer.afterFilters;
        if (list != null) {
            Iterator<AfterFilter> it = list.iterator();
            while (it.hasNext()) {
                c = it.next().writeAfter(jSONSerializer, obj, c);
            }
        }
        List<AfterFilter> list2 = this.afterFilters;
        if (list2 != null) {
            Iterator<AfterFilter> it2 = list2.iterator();
            while (it2.hasNext()) {
                c = it2.next().writeAfter(jSONSerializer, obj, c);
            }
        }
        return c;
    }

    public void writeAsArray(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws Throwable {
        write(jSONSerializer, obj, obj2, type, i);
    }

    public void writeAsArrayNonContext(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws Throwable {
        write(jSONSerializer, obj, obj2, type, i);
    }

    public char writeBefore(JSONSerializer jSONSerializer, Object obj, char c) {
        List<BeforeFilter> list = jSONSerializer.beforeFilters;
        if (list != null) {
            Iterator<BeforeFilter> it = list.iterator();
            while (it.hasNext()) {
                c = it.next().writeBefore(jSONSerializer, obj, c);
            }
        }
        List<BeforeFilter> list2 = this.beforeFilters;
        if (list2 != null) {
            Iterator<BeforeFilter> it2 = list2.iterator();
            while (it2.hasNext()) {
                c = it2.next().writeBefore(jSONSerializer, obj, c);
            }
        }
        return c;
    }

    public void writeClassName(JSONSerializer jSONSerializer, String str, Object obj) {
        if (str == null) {
            str = jSONSerializer.config.typeKey;
        }
        jSONSerializer.out.writeFieldName(str, false);
        String name = this.beanInfo.typeName;
        if (name == null) {
            Class<?> superclass = obj.getClass();
            if (TypeUtils.isProxy(superclass)) {
                superclass = superclass.getSuperclass();
            }
            name = superclass.getName();
        }
        jSONSerializer.write(name);
    }

    public void writeDirectNonContext(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws Throwable {
        write(jSONSerializer, obj, obj2, type, i);
    }

    public void writeNoneASM(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws Throwable {
        write(jSONSerializer, obj, obj2, type, i, false);
    }

    public boolean writeReference(JSONSerializer jSONSerializer, Object obj, int i) {
        IdentityHashMap<Object, SerialContext> identityHashMap;
        SerialContext serialContext = jSONSerializer.context;
        int i2 = SerializerFeature.DisableCircularReferenceDetect.mask;
        if (serialContext == null || (serialContext.features & i2) != 0 || (i & i2) != 0 || (identityHashMap = jSONSerializer.references) == null || !identityHashMap.containsKey(obj)) {
            return false;
        }
        jSONSerializer.writeReference(obj);
        return true;
    }

    public boolean isWriteAsArray(JSONSerializer jSONSerializer) {
        return isWriteAsArray(jSONSerializer, 0);
    }

    public Object getFieldValue(Object obj, String str) {
        FieldSerializer fieldSerializer = getFieldSerializer(str);
        if (fieldSerializer != null) {
            try {
                return fieldSerializer.getPropertyValue(obj);
            } catch (IllegalAccessException e) {
                kzv.m147955a("getFieldValue error.", str, e);
                return null;
            } catch (InvocationTargetException e2) {
                kzv.m147955a("getFieldValue error.", str, e2);
                return null;
            }
        }
        siq.m184351a("field not found. ", str);
        return null;
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i) throws Throwable {
        write(jSONSerializer, obj, obj2, type, i, false);
    }

    public JavaBeanSerializer(Class<?> cls, String... strArr) {
        this(cls, createAliasMap(strArr));
    }

    public JavaBeanSerializer(Class<?> cls, Map<String, String> map) {
        this(TypeUtils.buildBeanInfo(cls, map, null));
    }

    public JavaBeanSerializer(Class<?> cls) {
        this(cls, (Map<String, String>) null);
    }

    public FieldSerializer getFieldSerializer(String str) {
        if (str == null) {
            return null;
        }
        int length = this.sortedGetters.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            int iCompareTo = this.sortedGetters[i2].fieldInfo.name.compareTo(str);
            if (iCompareTo < 0) {
                i = i2 + 1;
            } else {
                if (iCompareTo <= 0) {
                    return this.sortedGetters[i2];
                }
                length = i2 - 1;
            }
        }
        return null;
    }
}
