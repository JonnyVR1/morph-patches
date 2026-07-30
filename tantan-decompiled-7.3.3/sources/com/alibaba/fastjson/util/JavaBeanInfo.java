package com.alibaba.fastjson.util;

import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONPOJOBuilder;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.cosmos.photon.push.service.PushService;
import com.p051p1.mobile.putong.data.SignInGrantType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p153l.qkq;
import p153l.rkq;

/* JADX INFO: loaded from: classes.dex */
public class JavaBeanInfo {
    public final Method buildMethod;
    public final Class<?> builderClass;
    public final Class<?> clazz;
    public final Constructor<?> creatorConstructor;
    public Type[] creatorConstructorParameterTypes;
    public String[] creatorConstructorParameters;
    public final Constructor<?> defaultConstructor;
    public final int defaultConstructorParameterSize;
    public final Method factoryMethod;
    public final FieldInfo[] fields;
    public final JSONType jsonType;

    /* JADX INFO: renamed from: kotlin, reason: collision with root package name */
    public boolean f211034kotlin;
    public Constructor<?> kotlinDefaultConstructor;
    public String[] orders;
    public final int parserFeatures;
    public final FieldInfo[] sortedFields;
    public final String typeKey;
    public final String typeName;

    public JavaBeanInfo(Class<?> cls, Class<?> cls2, Constructor<?> constructor, Constructor<?> constructor2, Method method, Method method2, JSONType jSONType, List<FieldInfo> list) {
        JSONField jSONField;
        this.clazz = cls;
        this.builderClass = cls2;
        this.defaultConstructor = constructor;
        this.creatorConstructor = constructor2;
        this.factoryMethod = method;
        this.parserFeatures = TypeUtils.getParserFeatures(cls);
        this.buildMethod = method2;
        this.jsonType = jSONType;
        if (jSONType != null) {
            String strTypeName = jSONType.typeName();
            String strTypeKey = jSONType.typeKey();
            this.typeKey = strTypeKey.length() <= 0 ? null : strTypeKey;
            if (strTypeName.length() != 0) {
                this.typeName = strTypeName;
            } else {
                this.typeName = cls.getName();
            }
            String[] strArrOrders = jSONType.orders();
            this.orders = strArrOrders.length == 0 ? null : strArrOrders;
        } else {
            this.typeName = cls.getName();
            this.typeKey = null;
            this.orders = null;
        }
        FieldInfo[] fieldInfoArr = new FieldInfo[list.size()];
        this.fields = fieldInfoArr;
        list.toArray(fieldInfoArr);
        FieldInfo[] fieldInfoArr2 = new FieldInfo[fieldInfoArr.length];
        int i = 0;
        if (this.orders != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
            for (FieldInfo fieldInfo : fieldInfoArr) {
                linkedHashMap.put(fieldInfo.name, fieldInfo);
            }
            int i2 = 0;
            for (String str : this.orders) {
                FieldInfo fieldInfo2 = (FieldInfo) linkedHashMap.get(str);
                if (fieldInfo2 != null) {
                    fieldInfoArr2[i2] = fieldInfo2;
                    linkedHashMap.remove(str);
                    i2++;
                }
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                fieldInfoArr2[i2] = (FieldInfo) it.next();
                i2++;
            }
        } else {
            System.arraycopy(fieldInfoArr, 0, fieldInfoArr2, 0, fieldInfoArr.length);
            Arrays.sort(fieldInfoArr2);
        }
        this.sortedFields = Arrays.equals(this.fields, fieldInfoArr2) ? this.fields : fieldInfoArr2;
        if (constructor != null) {
            this.defaultConstructorParameterSize = constructor.getParameterTypes().length;
        } else if (method != null) {
            this.defaultConstructorParameterSize = method.getParameterTypes().length;
        } else {
            this.defaultConstructorParameterSize = 0;
        }
        if (constructor2 != null) {
            this.creatorConstructorParameterTypes = constructor2.getParameterTypes();
            boolean zIsKotlin = TypeUtils.isKotlin(cls);
            this.f211034kotlin = zIsKotlin;
            if (!zIsKotlin) {
                if (this.creatorConstructorParameterTypes.length == this.fields.length) {
                    while (true) {
                        Type[] typeArr = this.creatorConstructorParameterTypes;
                        if (i >= typeArr.length) {
                            return;
                        }
                        if (typeArr[i] == this.fields[i].fieldClass) {
                            i++;
                        }
                    }
                }
                this.creatorConstructorParameters = ASMUtils.lookupParameterNames(constructor2);
                return;
            }
            this.creatorConstructorParameters = TypeUtils.getKoltinConstructorParameters(cls);
            try {
                this.kotlinDefaultConstructor = cls.getConstructor(null);
            } catch (Throwable unused) {
            }
            Annotation[][] parameterAnnotations = TypeUtils.getParameterAnnotations(constructor2);
            for (int i3 = 0; i3 < this.creatorConstructorParameters.length && i3 < parameterAnnotations.length; i3++) {
                Annotation[] annotationArr = parameterAnnotations[i3];
                int length = annotationArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        jSONField = null;
                        break;
                    }
                    Annotation annotation = annotationArr[i4];
                    if (annotation instanceof JSONField) {
                        jSONField = (JSONField) annotation;
                        break;
                    }
                    i4++;
                }
                if (jSONField != null) {
                    String strName = jSONField.name();
                    if (strName.length() > 0) {
                        this.creatorConstructorParameters[i3] = strName;
                    }
                }
            }
        }
    }

    public static boolean add(List<FieldInfo> list, FieldInfo fieldInfo) {
        for (int size = list.size() - 1; size >= 0; size--) {
            FieldInfo fieldInfo2 = list.get(size);
            if (fieldInfo2.name.equals(fieldInfo.name) && (!fieldInfo2.getOnly || fieldInfo.getOnly)) {
                if (fieldInfo2.fieldClass.isAssignableFrom(fieldInfo.fieldClass)) {
                    list.set(size, fieldInfo);
                    return true;
                }
                if (fieldInfo2.compareTo(fieldInfo) >= 0) {
                    return false;
                }
                list.set(size, fieldInfo);
                return true;
            }
        }
        list.add(fieldInfo);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x0346  */
    /* JADX WARN: Code duplicated, block: B:172:0x034b  */
    /* JADX WARN: Code duplicated, block: B:295:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:328:0x079d  */
    /* JADX WARN: Code duplicated, block: B:329:0x07a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:330:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:335:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:336:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:339:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:341:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:342:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:343:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:345:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:347:0x07f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:351:0x0805  */
    /* JADX WARN: Code duplicated, block: B:353:0x0809  */
    /* JADX WARN: Code duplicated, block: B:378:0x086e  */
    /* JADX WARN: Code duplicated, block: B:379:0x0877  */
    /* JADX WARN: Code duplicated, block: B:381:0x0896  */
    /* JADX WARN: Code duplicated, block: B:384:0x089d  */
    /* JADX WARN: Code duplicated, block: B:388:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:390:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:392:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:393:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:395:0x0903  */
    /* JADX WARN: Code duplicated, block: B:396:0x0922  */
    /* JADX WARN: Code duplicated, block: B:397:0x092d  */
    /* JADX WARN: Code duplicated, block: B:398:0x0938  */
    /* JADX WARN: Code duplicated, block: B:400:0x0947  */
    /* JADX WARN: Code duplicated, block: B:448:0x0a73 A[PHI: r6 r8 r10
      0x0a73: PHI (r6v17 java.lang.reflect.Field[]) = (r6v16 java.lang.reflect.Field[]), (r6v18 java.lang.reflect.Field[]) binds: [B:447:0x0a71, B:452:0x0a8b] A[DONT_GENERATE, DONT_INLINE]
      0x0a73: PHI (r8v4 char) = (r8v3 char), (r8v5 char) binds: [B:447:0x0a71, B:452:0x0a8b] A[DONT_GENERATE, DONT_INLINE]
      0x0a73: PHI (r10v6 char) = (r10v5 char), (r10v7 char) binds: [B:447:0x0a71, B:452:0x0a8b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:379:0x0877, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [com.alibaba.fastjson.annotation.JSONField] */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v118 */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v120 */
    /* JADX WARN: Type inference failed for: r1v121 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v65 */
    public static JavaBeanInfo build(Class<?> cls, Type type, PropertyNamingStrategy propertyNamingStrategy, boolean z, boolean z2, boolean z3) {
        Class<?> cls2;
        Class<Collection> cls3;
        Class<JSONField> cls4;
        Map<TypeVariable, Type> map;
        Field field;
        int i;
        Class<?> cls5;
        Class<String> cls6;
        Constructor<?> creatorConstructor;
        Class<JSONField> cls7;
        Class<Collection> cls8;
        Class<String> cls9;
        Class<?> cls10;
        Field[] fieldArr;
        Method[] methodArr;
        Map<TypeVariable, Type> map2;
        String str;
        ArrayList arrayList;
        Class cls11;
        JSONField jSONField;
        char c;
        char c2;
        String string;
        Field[] fieldArr2;
        JSONField jSONField2;
        Class<Collection> cls12;
        int iM4811of;
        int i2;
        char cCharAt;
        Field[] fieldArr3;
        String strDecapitalize;
        String str2;
        Field field2;
        String strTranslate;
        Field[] fieldArr4;
        int iOrdinal;
        ?? r10;
        JSONField jSONField3;
        String strSubstring;
        int iOrdinal2;
        Object obj;
        ?? r1;
        ?? r2;
        Method method;
        String strBuildMethod;
        String str3;
        int iOrdinal3;
        int i3;
        int i4;
        Method[] methodArr2;
        ?? r3;
        StringBuilder sb;
        StringBuilder sb2;
        ?? r4;
        ?? r5;
        char cCharAt2;
        String strWithPrefix;
        Method method2;
        Method method3;
        String[] strArrLookupParameterNames;
        String[] strArr;
        int i5;
        String[] strArrLookupParameterNames2;
        Class<?>[] parameterTypes;
        Class<?>[] clsArr;
        JSONField jSONField4;
        Class<JSONField> cls13;
        int iOrdinal4;
        int iM4811of2;
        int i6;
        Class<JSONField> cls14;
        JSONField jSONField5;
        String strName;
        int i7;
        int i8;
        int iM4811of3;
        String[] strArrLookupParameterNames3;
        JSONField jSONField6;
        String strName2;
        Field field3;
        int iOrdinal5;
        int iM4812of;
        int iM4811of4;
        PropertyNamingStrategy propertyNamingStrategyNaming;
        Class<?> cls15 = cls;
        JSONType jSONType = (JSONType) TypeUtils.getAnnotation(cls15, JSONType.class);
        PropertyNamingStrategy propertyNamingStrategy2 = (jSONType == null || (propertyNamingStrategyNaming = jSONType.naming()) == null || propertyNamingStrategyNaming == PropertyNamingStrategy.CamelCase) ? propertyNamingStrategy : propertyNamingStrategyNaming;
        Class<?> builderClass = getBuilderClass(cls15, jSONType);
        Field[] declaredFields = cls15.getDeclaredFields();
        Method[] methods = cls15.getMethods();
        Map<TypeVariable, Type> mapBuildGenericInfo = buildGenericInfo(cls15);
        boolean zIsKotlin = TypeUtils.isKotlin(cls15);
        Constructor<?>[] declaredConstructors = cls15.getDeclaredConstructors();
        Constructor<?> defaultConstructor = (!zIsKotlin || declaredConstructors.length == 1) ? builderClass == null ? getDefaultConstructor(cls15, declaredConstructors) : getDefaultConstructor(builderClass, builderClass.getDeclaredConstructors()) : null;
        ArrayList arrayList2 = new ArrayList();
        boolean z4 = true;
        Constructor<?> constructor = defaultConstructor;
        if (z) {
            for (Class<?> superclass = cls15; superclass != null; superclass = superclass.getSuperclass()) {
                computeFields(cls15, type, propertyNamingStrategy2, arrayList2, superclass.getDeclaredFields());
            }
            if (constructor != null) {
                TypeUtils.setAccessible(constructor);
            }
            return new JavaBeanInfo(cls, builderClass, constructor, null, null, null, jSONType, arrayList2);
        }
        Method method4 = null;
        Method method5 = null;
        boolean z5 = cls15.isInterface() || Modifier.isAbstract(cls15.getModifiers());
        Class<Collection> cls16 = Collection.class;
        Class<?> cls17 = Object.class;
        Class<String> cls18 = String.class;
        Class<JSONField> cls19 = JSONField.class;
        PropertyNamingStrategy propertyNamingStrategy3 = propertyNamingStrategy2;
        if ((constructor == null && builderClass == null) || z5) {
            creatorConstructor = getCreatorConstructor(declaredConstructors);
            if (creatorConstructor == null || z5) {
                Class<Collection> cls20 = cls16;
                Class<JSONField> cls21 = cls19;
                map = mapBuildGenericInfo;
                boolean z6 = true;
                field = null;
                i = 0;
                cls5 = cls17;
                cls6 = cls18;
                Method factoryMethod = getFactoryMethod(cls15, methods, z3);
                if (factoryMethod != null) {
                    TypeUtils.setAccessible(factoryMethod);
                    Class<?>[] parameterTypes2 = factoryMethod.getParameterTypes();
                    if (parameterTypes2.length > 0) {
                        Annotation[][] parameterAnnotations = TypeUtils.getParameterAnnotations(factoryMethod);
                        String[] strArrLookupParameterNames4 = null;
                        int i9 = 0;
                        while (i9 < parameterTypes2.length) {
                            Annotation[] annotationArr = parameterAnnotations[i9];
                            int length = annotationArr.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= length) {
                                    jSONField5 = null;
                                    break;
                                }
                                Annotation annotation = annotationArr[i10];
                                if (annotation instanceof JSONField) {
                                    jSONField5 = (JSONField) annotation;
                                    break;
                                }
                                i10++;
                            }
                            if (jSONField5 == null && (!z3 || !TypeUtils.isJacksonCreator(factoryMethod))) {
                                qkq.m176968a("illegal json creator");
                                return null;
                            }
                            if (jSONField5 != null) {
                                strName = jSONField5.name();
                                int iOrdinal6 = jSONField5.ordinal();
                                int iM4812of2 = SerializerFeature.m4812of(jSONField5.serialzeFeatures());
                                iM4811of3 = Feature.m4811of(jSONField5.parseFeatures());
                                i8 = iM4812of2;
                                i7 = iOrdinal6;
                            } else {
                                strName = null;
                                i7 = 0;
                                i8 = 0;
                                iM4811of3 = 0;
                            }
                            if (strName == null || strName.length() == 0) {
                                if (strArrLookupParameterNames4 == null) {
                                    strArrLookupParameterNames4 = ASMUtils.lookupParameterNames(factoryMethod);
                                }
                                strName = strArrLookupParameterNames4[i9];
                            }
                            String[] strArr2 = strArrLookupParameterNames4;
                            String str4 = strName;
                            add(arrayList2, new FieldInfo(str4, cls15, parameterTypes2[i9], factoryMethod.getGenericParameterTypes()[i9], TypeUtils.getField(cls15, str4, declaredFields), i7, i8, iM4811of3));
                            i9++;
                            cls15 = cls;
                            strArrLookupParameterNames4 = strArr2;
                            parameterTypes2 = parameterTypes2;
                        }
                        return new JavaBeanInfo(cls, builderClass, null, null, factoryMethod, null, jSONType, arrayList2);
                    }
                    method2 = factoryMethod;
                } else {
                    Method method6 = factoryMethod;
                    if (!z5) {
                        String name = cls15.getName();
                        if (!zIsKotlin || declaredConstructors.length <= 0) {
                            int length2 = declaredConstructors.length;
                            String[] strArr3 = null;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= length2) {
                                    method3 = method6;
                                    cls3 = cls20;
                                    strArrLookupParameterNames = strArr3;
                                    break;
                                }
                                Constructor<?> constructor2 = declaredConstructors[i11];
                                Class<?>[] parameterTypes3 = constructor2.getParameterTypes();
                                if (name.equals("org.springframework.security.web.authentication.WebAuthenticationDetails")) {
                                    boolean z7 = z6;
                                    if (parameterTypes3.length == 2 && parameterTypes3[0] == cls6 && parameterTypes3[z7 ? 1 : 0] == cls6) {
                                        constructor2.setAccessible(z7);
                                        strArrLookupParameterNames = ASMUtils.lookupParameterNames(constructor2);
                                        creatorConstructor = constructor2;
                                    }
                                }
                                if (name.equals("org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken") && parameterTypes3.length == 3 && parameterTypes3[0] == cls5 && parameterTypes3[1] == cls5) {
                                    method3 = method6;
                                    cls3 = cls20;
                                    if (parameterTypes3[2] == cls3) {
                                        constructor2.setAccessible(true);
                                        strArr = new String[]{"principal", "credentials", "authorities"};
                                    }
                                    strArrLookupParameterNames = strArr;
                                    creatorConstructor = constructor2;
                                    break;
                                }
                                method3 = method6;
                                cls3 = cls20;
                                if (name.equals("org.springframework.security.core.authority.SimpleGrantedAuthority")) {
                                    i5 = 1;
                                    if (parameterTypes3.length == 1 && parameterTypes3[0] == cls6) {
                                        strArr = new String[]{"authority"};
                                        strArrLookupParameterNames = strArr;
                                        creatorConstructor = constructor2;
                                        break;
                                    }
                                } else {
                                    i5 = 1;
                                }
                                if ((constructor2.getModifiers() & i5) != 0 && (strArrLookupParameterNames2 = ASMUtils.lookupParameterNames(constructor2)) != null && strArrLookupParameterNames2.length != 0 && (creatorConstructor == null || strArr3 == null || strArrLookupParameterNames2.length > strArr3.length)) {
                                    creatorConstructor = constructor2;
                                    strArr3 = strArrLookupParameterNames2;
                                }
                                i11++;
                                cls20 = cls3;
                                z6 = true;
                                method6 = method3;
                            }
                            if (strArrLookupParameterNames != null) {
                                parameterTypes = creatorConstructor.getParameterTypes();
                            } else {
                                parameterTypes = null;
                            }
                            if (strArrLookupParameterNames != null || parameterTypes.length != strArrLookupParameterNames.length) {
                                rkq.m181878a("default constructor not found. ", cls15);
                                return null;
                            }
                            Annotation[][] parameterAnnotations2 = TypeUtils.getParameterAnnotations(creatorConstructor);
                            int i12 = 0;
                            while (i12 < parameterTypes.length) {
                                Annotation[] annotationArr2 = parameterAnnotations2[i12];
                                String str5 = strArrLookupParameterNames[i12];
                                int length3 = annotationArr2.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= length3) {
                                        clsArr = parameterTypes;
                                        jSONField4 = null;
                                        break;
                                    }
                                    Annotation annotation2 = annotationArr2[i13];
                                    clsArr = parameterTypes;
                                    if (annotation2 instanceof JSONField) {
                                        jSONField4 = (JSONField) annotation2;
                                        break;
                                    }
                                    i13++;
                                    parameterTypes = clsArr;
                                }
                                Class<?> cls22 = clsArr[i12];
                                Type type2 = creatorConstructor.getGenericParameterTypes()[i12];
                                Field field4 = TypeUtils.getField(cls15, str5, declaredFields);
                                if (field4 == null || jSONField4 != null) {
                                    cls13 = cls21;
                                } else {
                                    cls13 = cls21;
                                    jSONField4 = (JSONField) TypeUtils.getAnnotation(field4, cls13);
                                }
                                if (jSONField4 != null) {
                                    String strName3 = jSONField4.name();
                                    if (strName3.length() != 0) {
                                        str5 = strName3;
                                    }
                                    iOrdinal4 = jSONField4.ordinal();
                                    int iM4812of3 = SerializerFeature.m4812of(jSONField4.serialzeFeatures());
                                    Class<JSONField> cls23 = cls13;
                                    iM4811of2 = Feature.m4811of(jSONField4.parseFeatures());
                                    i6 = iM4812of3;
                                    cls14 = cls23;
                                } else if ("org.springframework.security.core.userdetails.User".equals(name) && SignInGrantType.password.equals(str5)) {
                                    cls14 = cls13;
                                    iOrdinal4 = 0;
                                    iM4811of2 = Feature.InitStringFieldAsEmpty.mask;
                                    i6 = 0;
                                } else {
                                    cls14 = cls13;
                                    i6 = 0;
                                    iM4811of2 = 0;
                                    iOrdinal4 = 0;
                                }
                                add(arrayList2, new FieldInfo(str5, cls15, cls22, type2, field4, iOrdinal4, i6, iM4811of2));
                                i12++;
                                cls15 = cls;
                                cls21 = cls14;
                                name = name;
                                parameterTypes = clsArr;
                                strArrLookupParameterNames = strArrLookupParameterNames;
                            }
                            cls4 = cls21;
                            if (!zIsKotlin && !cls.getName().equals("javax.servlet.http.Cookie")) {
                                return new JavaBeanInfo(cls, builderClass, null, creatorConstructor, null, null, jSONType, arrayList2);
                            }
                            cls2 = cls;
                            arrayList2 = arrayList2;
                            method4 = method3;
                            creatorConstructor = creatorConstructor;
                        } else {
                            String[] koltinConstructorParameters = TypeUtils.getKoltinConstructorParameters(cls15);
                            Constructor<?> koltinConstructor = TypeUtils.getKoltinConstructor(declaredConstructors, koltinConstructorParameters);
                            TypeUtils.setAccessible(koltinConstructor);
                            creatorConstructor = koltinConstructor;
                            strArrLookupParameterNames = koltinConstructorParameters;
                        }
                        method3 = method6;
                        cls3 = cls20;
                        if (strArrLookupParameterNames != null) {
                            parameterTypes = creatorConstructor.getParameterTypes();
                        } else {
                            parameterTypes = null;
                        }
                        if (strArrLookupParameterNames != null) {
                        }
                        rkq.m181878a("default constructor not found. ", cls15);
                        return null;
                    }
                    method2 = method6;
                }
                cls2 = cls15;
                arrayList2 = arrayList2;
                cls4 = cls21;
                cls3 = cls20;
                method4 = method2;
            } else {
                TypeUtils.setAccessible(creatorConstructor);
                Class<?>[] parameterTypes4 = creatorConstructor.getParameterTypes();
                if (parameterTypes4.length > 0) {
                    Annotation[][] parameterAnnotations3 = TypeUtils.getParameterAnnotations(creatorConstructor);
                    int i14 = 0;
                    String[] strArr4 = null;
                    z4 = z4;
                    while (i14 < parameterTypes4.length) {
                        Annotation[] annotationArr3 = parameterAnnotations3[i14];
                        int length4 = annotationArr3.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= length4) {
                                strArrLookupParameterNames3 = strArr4;
                                jSONField6 = null;
                                break;
                            }
                            Annotation[] annotationArr4 = annotationArr3;
                            Annotation annotation3 = annotationArr4[i15];
                            strArrLookupParameterNames3 = strArr4;
                            if (annotation3 instanceof JSONField) {
                                jSONField6 = (JSONField) annotation3;
                                break;
                            }
                            i15++;
                            annotationArr3 = annotationArr4;
                            strArr4 = strArrLookupParameterNames3;
                        }
                        Class<?> cls24 = parameterTypes4[i14];
                        Type type3 = creatorConstructor.getGenericParameterTypes()[i14];
                        if (jSONField6 != null) {
                            field3 = TypeUtils.getField(cls15, jSONField6.name(), declaredFields);
                            iOrdinal5 = jSONField6.ordinal();
                            iM4812of = SerializerFeature.m4812of(jSONField6.serialzeFeatures());
                            iM4811of4 = Feature.m4811of(jSONField6.parseFeatures());
                            strName2 = jSONField6.name();
                        } else {
                            strName2 = null;
                            field3 = null;
                            iOrdinal5 = 0;
                            iM4812of = 0;
                            iM4811of4 = 0;
                        }
                        if (strName2 == null || strName2.length() == 0) {
                            if (strArrLookupParameterNames3 == null) {
                                strArrLookupParameterNames3 = ASMUtils.lookupParameterNames(creatorConstructor);
                            }
                            strName2 = strArrLookupParameterNames3[i14];
                        }
                        if (field3 == null) {
                            if (strArrLookupParameterNames3 == null) {
                                strArrLookupParameterNames3 = zIsKotlin ? TypeUtils.getKoltinConstructorParameters(cls15) : ASMUtils.lookupParameterNames(creatorConstructor);
                            }
                            String[] strArr5 = strArrLookupParameterNames3;
                            if (strArr5.length > i14) {
                                field3 = TypeUtils.getField(cls15, strArr5[i14], declaredFields);
                            }
                            strArrLookupParameterNames3 = strArr5;
                        }
                        int i16 = i14;
                        int i17 = iM4811of4;
                        Class<Collection> cls25 = cls16;
                        Field field5 = field3;
                        ArrayList arrayList3 = arrayList2;
                        Class<?> cls26 = cls15;
                        cls15 = cls26;
                        add(arrayList3, new FieldInfo(strName2, cls26, cls24, type3, field5, iOrdinal5, iM4812of, i17));
                        i14 = i16 + 1;
                        z4 = z4;
                        cls18 = cls18;
                        cls17 = cls17;
                        arrayList2 = arrayList3;
                        strArr4 = strArrLookupParameterNames3;
                        mapBuildGenericInfo = mapBuildGenericInfo;
                        cls19 = cls19;
                        cls16 = cls25;
                    }
                }
                Class<JSONField> cls27 = cls19;
                map = mapBuildGenericInfo;
                field = null;
                i = 0;
                cls5 = cls17;
                cls6 = cls18;
                cls2 = cls15;
                arrayList2 = arrayList2;
                cls4 = cls27;
                cls3 = cls16;
            }
        } else {
            cls2 = cls15;
            cls3 = cls16;
            cls4 = cls19;
            map = mapBuildGenericInfo;
            field = null;
            i = 0;
            cls5 = cls17;
            cls6 = cls18;
            creatorConstructor = null;
        }
        if (constructor != null) {
            TypeUtils.setAccessible(constructor);
        }
        String str6 = "set";
        if (cls11 != 0) {
            Class<JSONPOJOBuilder> cls28 = JSONPOJOBuilder.class;
            JSONPOJOBuilder jSONPOJOBuilder = (JSONPOJOBuilder) TypeUtils.getAnnotation((Class<?>) cls11, cls28);
            if (jSONPOJOBuilder != null) {
                strWithPrefix = jSONPOJOBuilder.withPrefix();
            } else {
                obj = field;
            }
            if (obj == null) {
                obj = strWithPrefix;
                obj = "with";
            }
            obj = strWithPrefix;
            Method[] methods2 = cls11.getMethods();
            int length5 = methods2.length;
            int i18 = i;
            ?? r6 = obj;
            while (i18 < length5) {
                Class<JSONPOJOBuilder> cls29 = cls28;
                Method method7 = methods2[i18];
                if (Modifier.isStatic(method7.getModifiers())) {
                    methodArr2 = methods;
                    str3 = str6;
                } else {
                    str3 = str6;
                    if (method7.getReturnType().equals(builderClass)) {
                        JSONField superMethodAnnotation = (JSONField) TypeUtils.getAnnotation(method7, cls4);
                        if (superMethodAnnotation == null) {
                            superMethodAnnotation = TypeUtils.getSuperMethodAnnotation(cls2, method7);
                        }
                        if (superMethodAnnotation != null) {
                            if (superMethodAnnotation.deserialize()) {
                                int i19 = i18;
                                iOrdinal3 = superMethodAnnotation.ordinal();
                                int iM4812of4 = SerializerFeature.m4812of(superMethodAnnotation.serialzeFeatures());
                                int iM4811of5 = Feature.m4811of(superMethodAnnotation.parseFeatures());
                                if (superMethodAnnotation.name().length() != 0) {
                                    r6 = r6;
                                    Method[] methodArr3 = methods;
                                    str3 = str3;
                                    methodArr2 = methodArr3;
                                    methods2 = methods2;
                                    cls29 = cls29;
                                    cls5 = cls5;
                                    declaredFields = declaredFields;
                                    map = map;
                                    cls4 = cls4;
                                    cls3 = cls3;
                                    cls6 = cls6;
                                    arrayList2 = arrayList2;
                                    i18 = i19;
                                    length5 = length5;
                                    add(arrayList2, new FieldInfo(superMethodAnnotation.name(), method7, null, cls, type, iOrdinal3, iM4812of4, iM4811of5, superMethodAnnotation, null, null, map));
                                } else {
                                    i3 = iM4812of4;
                                    i18 = i19;
                                    i4 = iM4811of5;
                                    methodArr2 = methods;
                                }
                            }
                            i18++;
                            cls2 = cls;
                            map = map;
                            arrayList2 = arrayList2;
                            str6 = str3;
                            methods2 = methods2;
                            length5 = length5;
                            r6 = r6;
                            declaredFields = declaredFields;
                            cls28 = cls29;
                            cls3 = cls3;
                            cls5 = cls5;
                            cls6 = cls6;
                            cls4 = cls4;
                            i = 0;
                            methods = methodArr2;
                        } else {
                            i18 = i18;
                            iOrdinal3 = i;
                            i3 = iOrdinal3;
                            i4 = i3;
                            methodArr2 = methods;
                        }
                        ?? name2 = method7.getName();
                        if (!name2.startsWith(str3) || name2.length() <= 3) {
                            if (r6.length() == 0) {
                                sb2 = new StringBuilder((String) name2);
                            } else {
                                r3 = r6;
                                if (name2.startsWith(r3) && name2.length() > r3.length()) {
                                    r4 = r3;
                                    r4 = r3;
                                    sb = new StringBuilder(name2.substring(r3.length()));
                                    r5 = r3;
                                    cCharAt2 = sb.charAt(i);
                                    if (r5.length() != 0 || Character.isUpperCase(cCharAt2)) {
                                        r4 = r5;
                                        sb.setCharAt(i, Character.toLowerCase(cCharAt2));
                                        r6 = r5;
                                        add(arrayList2, new FieldInfo(sb.toString(), method7, null, cls, type, iOrdinal3, i3, i4, superMethodAnnotation, null, null, map));
                                    }
                                }
                                i18++;
                                cls2 = cls;
                                map = map;
                                arrayList2 = arrayList2;
                                str6 = str3;
                                methods2 = methods2;
                                length5 = length5;
                                r6 = r6;
                                declaredFields = declaredFields;
                                cls28 = cls29;
                                cls3 = cls3;
                                cls5 = cls5;
                                cls6 = cls6;
                                cls4 = cls4;
                                i = 0;
                                methods = methodArr2;
                            }
                            r4 = r3;
                            r4 = r3;
                            r4 = r3;
                            r4 = r5;
                            r6 = r4;
                            i18++;
                            cls2 = cls;
                            map = map;
                            arrayList2 = arrayList2;
                            str6 = str3;
                            methods2 = methods2;
                            length5 = length5;
                            r6 = r6;
                            declaredFields = declaredFields;
                            cls28 = cls29;
                            cls3 = cls3;
                            cls5 = cls5;
                            cls6 = cls6;
                            cls4 = cls4;
                            i = 0;
                            methods = methodArr2;
                        } else {
                            sb2 = new StringBuilder(name2.substring(3));
                        }
                        sb = sb2;
                        r5 = r6;
                        cCharAt2 = sb.charAt(i);
                        if (r5.length() != 0) {
                        }
                        r4 = r5;
                        sb.setCharAt(i, Character.toLowerCase(cCharAt2));
                        r6 = r5;
                        add(arrayList2, new FieldInfo(sb.toString(), method7, null, cls, type, iOrdinal3, i3, i4, superMethodAnnotation, null, null, map));
                        i18++;
                        cls2 = cls;
                        map = map;
                        arrayList2 = arrayList2;
                        str6 = str3;
                        methods2 = methods2;
                        length5 = length5;
                        r6 = r6;
                        declaredFields = declaredFields;
                        cls28 = cls29;
                        cls3 = cls3;
                        cls5 = cls5;
                        cls6 = cls6;
                        cls4 = cls4;
                        i = 0;
                        methods = methodArr2;
                    }
                    Method[] methodArr4 = methods;
                    str3 = str3;
                    methodArr2 = methodArr4;
                }
                arrayList2 = arrayList2;
                i18++;
                cls2 = cls;
                map = map;
                arrayList2 = arrayList2;
                str6 = str3;
                methods2 = methods2;
                length5 = length5;
                r6 = r6;
                declaredFields = declaredFields;
                cls28 = cls29;
                cls3 = cls3;
                cls5 = cls5;
                cls6 = cls6;
                cls4 = cls4;
                i = 0;
                methods = methodArr2;
            }
            cls7 = cls4;
            cls8 = cls3;
            cls9 = cls6;
            cls10 = cls5;
            fieldArr = declaredFields;
            methodArr = methods;
            map2 = map;
            str = str6;
            arrayList = arrayList2;
            JSONPOJOBuilder jSONPOJOBuilder2 = (JSONPOJOBuilder) TypeUtils.getAnnotation((Class<?>) cls11, cls28);
            if (jSONPOJOBuilder2 != null) {
                strBuildMethod = jSONPOJOBuilder2.buildMethod();
            } else {
                r1 = field;
            }
            if (r1 == 0 || r1.length() == 0) {
                r1 = strBuildMethod;
                r2 = r1;
                r1 = strBuildMethod;
                r2 = "build";
            }
            r1 = strBuildMethod;
            r2 = r1;
            ?? r0 = field;
            try {
                method = cls11.getMethod(r2, r0);
            } catch (NoSuchMethodException | SecurityException unused) {
                method = null;
            }
            if (method == null) {
                try {
                    method = cls11.getMethod(PushService.COMMAND_CREATE, r0);
                } catch (NoSuchMethodException | SecurityException unused2) {
                }
            }
            if (method == null) {
                qkq.m176968a("buildMethod not found.");
                return null;
            }
            TypeUtils.setAccessible(method);
            method5 = method;
            field = null;
        } else {
            cls7 = cls4;
            cls8 = cls3;
            cls9 = cls6;
            cls10 = cls5;
            fieldArr = declaredFields;
            methodArr = methods;
            map2 = map;
            str = "set";
            arrayList = arrayList2;
        }
        Method[] methodArr5 = methodArr;
        int length6 = methodArr5.length;
        int i20 = 0;
        while (i20 < length6) {
            int i21 = i20;
            Method method8 = methodArr5[i21];
            String name3 = method8.getName();
            if (!Modifier.isStatic(method8.getModifiers())) {
                Class<?> returnType = method8.getReturnType();
                if (returnType.equals(Void.TYPE) || returnType.equals(method8.getDeclaringClass())) {
                    cls10 = cls10;
                    if (method8.getDeclaringClass() != cls10) {
                        Class<?>[] parameterTypes5 = method8.getParameterTypes();
                        if (parameterTypes5.length != 0) {
                            if (parameterTypes5.length > 2) {
                                methodArr5 = methodArr5;
                                length6 = length6;
                                i21 = i21;
                                cls10 = cls10;
                            } else {
                                Class<JSONField> cls30 = cls7;
                                JSONField superMethodAnnotation2 = (JSONField) TypeUtils.getAnnotation(method8, cls30);
                                int i22 = 0;
                                int iM4812of5 = 0;
                                if (superMethodAnnotation2 == null || parameterTypes5.length != 2) {
                                    cls9 = cls9;
                                } else {
                                    Class<String> cls31 = cls9;
                                    if (parameterTypes5[0] != cls31) {
                                        cls9 = cls31;
                                    } else if (parameterTypes5[1] == cls10) {
                                        cls9 = cls31;
                                        i21 = i21;
                                        length6 = length6;
                                        cls10 = cls10;
                                        cls11 = cls11;
                                        methodArr5 = methodArr5;
                                        add(arrayList, new FieldInfo("", method8, null, cls, type, 0, 0, 0, superMethodAnnotation2, null, null, map2));
                                    } else {
                                        length6 = length6;
                                        cls9 = cls31;
                                        i21 = i21;
                                        cls10 = cls10;
                                        superMethodAnnotation2 = superMethodAnnotation2;
                                        cls11 = cls11;
                                        iM4812of5 = 0;
                                        i2 = 1;
                                        iM4811of = 0;
                                        methodArr5 = methodArr5;
                                        if (parameterTypes5.length == i2) {
                                            if (superMethodAnnotation2 == null) {
                                                superMethodAnnotation2 = TypeUtils.getSuperMethodAnnotation(cls, method8);
                                            }
                                            if (superMethodAnnotation2 == null || name3.length() >= 4) {
                                                if (superMethodAnnotation2 != null) {
                                                    if (superMethodAnnotation2.deserialize()) {
                                                        iOrdinal2 = superMethodAnnotation2.ordinal();
                                                        iM4812of5 = SerializerFeature.m4812of(superMethodAnnotation2.serialzeFeatures());
                                                        iM4811of = Feature.m4811of(superMethodAnnotation2.parseFeatures());
                                                        if (superMethodAnnotation2.name().length() != 0) {
                                                            add(arrayList, new FieldInfo(superMethodAnnotation2.name(), method8, null, cls, type, iOrdinal2, iM4812of5, iM4811of, superMethodAnnotation2, null, null, map2));
                                                        } else {
                                                            i22 = iOrdinal2;
                                                        }
                                                    }
                                                }
                                                if ((superMethodAnnotation2 == null || name3.startsWith(str)) && cls11 == null) {
                                                    cCharAt = name3.charAt(3);
                                                    if (!Character.isUpperCase(cCharAt) || cCharAt > 512) {
                                                        fieldArr3 = fieldArr;
                                                        if (TypeUtils.compatibleWithJavaBean) {
                                                            strDecapitalize = TypeUtils.decapitalize(name3.substring(3));
                                                        } else {
                                                            strDecapitalize = Character.toLowerCase(name3.charAt(3)) + name3.substring(4);
                                                        }
                                                    } else {
                                                        if (cCharAt == '_') {
                                                            String strSubstring2 = name3.substring(4);
                                                            fieldArr3 = fieldArr;
                                                            Field field6 = TypeUtils.getField(cls, strSubstring2, fieldArr3);
                                                            if (field6 == null && (field6 = TypeUtils.getField(cls, (strSubstring = name3.substring(3)), fieldArr3)) != null) {
                                                                strSubstring2 = strSubstring;
                                                            }
                                                            str2 = strSubstring2;
                                                            field2 = field6;
                                                        } else {
                                                            fieldArr3 = fieldArr;
                                                            if (cCharAt == 'f') {
                                                                strDecapitalize = name3.substring(3);
                                                            } else if (name3.length() < 5 || !Character.isUpperCase(name3.charAt(4))) {
                                                                String strSubstring3 = name3.substring(3);
                                                                Field field7 = TypeUtils.getField(cls, strSubstring3, fieldArr3);
                                                                if (field7 == null) {
                                                                    fieldArr = fieldArr3;
                                                                } else {
                                                                    str2 = strSubstring3;
                                                                    field2 = field7;
                                                                }
                                                            } else {
                                                                strDecapitalize = TypeUtils.decapitalize(name3.substring(3));
                                                            }
                                                        }
                                                        if (field2 == null) {
                                                            field2 = TypeUtils.getField(cls, str2, fieldArr3);
                                                        }
                                                        if (field2 == null && parameterTypes5[0] == Boolean.TYPE) {
                                                            field2 = TypeUtils.getField(cls, "is" + Character.toUpperCase(str2.charAt(0)) + str2.substring(i2), fieldArr3);
                                                        }
                                                        if (field2 != null) {
                                                            jSONField3 = (JSONField) TypeUtils.getAnnotation(field2, cls30);
                                                            if (jSONField3 != null) {
                                                                strTranslate = str2;
                                                                fieldArr4 = fieldArr3;
                                                                cls7 = cls30;
                                                                iOrdinal = i22;
                                                            } else if (jSONField3.deserialize()) {
                                                                fieldArr = fieldArr3;
                                                                iOrdinal = jSONField3.ordinal();
                                                                iM4812of5 = SerializerFeature.m4812of(jSONField3.serialzeFeatures());
                                                                iM4811of = Feature.m4811of(jSONField3.parseFeatures());
                                                                if (jSONField3.name().length() != 0) {
                                                                    str = str;
                                                                    cls7 = cls30;
                                                                    add(arrayList, new FieldInfo(jSONField3.name(), method8, field2, cls, type, iOrdinal, iM4812of5, iM4811of, superMethodAnnotation2, jSONField3, null, map2));
                                                                    propertyNamingStrategy3 = propertyNamingStrategy3;
                                                                } else {
                                                                    strTranslate = str2;
                                                                    fieldArr4 = fieldArr;
                                                                    cls7 = cls30;
                                                                }
                                                            } else {
                                                                fieldArr = fieldArr3;
                                                                str = str;
                                                                propertyNamingStrategy3 = propertyNamingStrategy3;
                                                                cls7 = cls30;
                                                            }
                                                        } else {
                                                            strTranslate = str2;
                                                            fieldArr4 = fieldArr3;
                                                            cls7 = cls30;
                                                            iOrdinal = i22;
                                                            r10 = field;
                                                        }
                                                        if (propertyNamingStrategy3 != null) {
                                                            r10 = jSONField3;
                                                            r10 = jSONField3;
                                                            strTranslate = propertyNamingStrategy3.translate(strTranslate);
                                                        }
                                                        r10 = jSONField3;
                                                        r10 = jSONField3;
                                                        fieldArr = fieldArr4;
                                                        propertyNamingStrategy3 = propertyNamingStrategy3;
                                                        add(arrayList, new FieldInfo(strTranslate, method8, field2, cls, type, iOrdinal, iM4812of5, iM4811of, superMethodAnnotation2, r10, null, map2));
                                                    }
                                                    str2 = strDecapitalize;
                                                    field2 = field;
                                                    if (field2 == null) {
                                                        field2 = TypeUtils.getField(cls, str2, fieldArr3);
                                                    }
                                                    if (field2 == null) {
                                                        field2 = TypeUtils.getField(cls, "is" + Character.toUpperCase(str2.charAt(0)) + str2.substring(i2), fieldArr3);
                                                    }
                                                    if (field2 != null) {
                                                        jSONField3 = (JSONField) TypeUtils.getAnnotation(field2, cls30);
                                                        if (jSONField3 != null) {
                                                            strTranslate = str2;
                                                            fieldArr4 = fieldArr3;
                                                            cls7 = cls30;
                                                            iOrdinal = i22;
                                                        } else if (jSONField3.deserialize()) {
                                                            fieldArr = fieldArr3;
                                                            str = str;
                                                            propertyNamingStrategy3 = propertyNamingStrategy3;
                                                            cls7 = cls30;
                                                        } else {
                                                            fieldArr = fieldArr3;
                                                            iOrdinal = jSONField3.ordinal();
                                                            iM4812of5 = SerializerFeature.m4812of(jSONField3.serialzeFeatures());
                                                            iM4811of = Feature.m4811of(jSONField3.parseFeatures());
                                                            if (jSONField3.name().length() != 0) {
                                                                str = str;
                                                                cls7 = cls30;
                                                                add(arrayList, new FieldInfo(jSONField3.name(), method8, field2, cls, type, iOrdinal, iM4812of5, iM4811of, superMethodAnnotation2, jSONField3, null, map2));
                                                                propertyNamingStrategy3 = propertyNamingStrategy3;
                                                            } else {
                                                                strTranslate = str2;
                                                                fieldArr4 = fieldArr;
                                                                cls7 = cls30;
                                                            }
                                                        }
                                                    } else {
                                                        strTranslate = str2;
                                                        fieldArr4 = fieldArr3;
                                                        cls7 = cls30;
                                                        iOrdinal = i22;
                                                        r10 = field;
                                                    }
                                                    if (propertyNamingStrategy3 != null) {
                                                        r10 = jSONField3;
                                                        r10 = jSONField3;
                                                        strTranslate = propertyNamingStrategy3.translate(strTranslate);
                                                    }
                                                    r10 = jSONField3;
                                                    r10 = jSONField3;
                                                    fieldArr = fieldArr4;
                                                    propertyNamingStrategy3 = propertyNamingStrategy3;
                                                    add(arrayList, new FieldInfo(strTranslate, method8, field2, cls, type, iOrdinal, iM4812of5, iM4811of, superMethodAnnotation2, r10, null, map2));
                                                }
                                            }
                                        }
                                    }
                                    str = str;
                                    propertyNamingStrategy3 = propertyNamingStrategy3;
                                    cls7 = cls30;
                                }
                                iM4811of = 0;
                                i2 = 1;
                                methodArr5 = methodArr5;
                                if (parameterTypes5.length == i2) {
                                    if (superMethodAnnotation2 == null) {
                                        superMethodAnnotation2 = TypeUtils.getSuperMethodAnnotation(cls, method8);
                                    }
                                    if (superMethodAnnotation2 == null) {
                                        if (superMethodAnnotation2 != null) {
                                            if (superMethodAnnotation2.deserialize()) {
                                                iOrdinal2 = superMethodAnnotation2.ordinal();
                                                iM4812of5 = SerializerFeature.m4812of(superMethodAnnotation2.serialzeFeatures());
                                                iM4811of = Feature.m4811of(superMethodAnnotation2.parseFeatures());
                                                if (superMethodAnnotation2.name().length() != 0) {
                                                    add(arrayList, new FieldInfo(superMethodAnnotation2.name(), method8, null, cls, type, iOrdinal2, iM4812of5, iM4811of, superMethodAnnotation2, null, null, map2));
                                                } else {
                                                    i22 = iOrdinal2;
                                                }
                                            }
                                            str = str;
                                            propertyNamingStrategy3 = propertyNamingStrategy3;
                                            cls7 = cls30;
                                        }
                                        if (superMethodAnnotation2 == null) {
                                            cCharAt = name3.charAt(3);
                                            if (Character.isUpperCase(cCharAt)) {
                                                fieldArr3 = fieldArr;
                                                if (TypeUtils.compatibleWithJavaBean) {
                                                    strDecapitalize = TypeUtils.decapitalize(name3.substring(3));
                                                } else {
                                                    strDecapitalize = Character.toLowerCase(name3.charAt(3)) + name3.substring(4);
                                                }
                                                str2 = strDecapitalize;
                                                field2 = field;
                                            } else {
                                                fieldArr3 = fieldArr;
                                                if (TypeUtils.compatibleWithJavaBean) {
                                                    strDecapitalize = TypeUtils.decapitalize(name3.substring(3));
                                                } else {
                                                    strDecapitalize = Character.toLowerCase(name3.charAt(3)) + name3.substring(4);
                                                }
                                                str2 = strDecapitalize;
                                                field2 = field;
                                            }
                                            if (field2 == null) {
                                                field2 = TypeUtils.getField(cls, str2, fieldArr3);
                                            }
                                            if (field2 == null) {
                                                field2 = TypeUtils.getField(cls, "is" + Character.toUpperCase(str2.charAt(0)) + str2.substring(i2), fieldArr3);
                                            }
                                            if (field2 != null) {
                                                jSONField3 = (JSONField) TypeUtils.getAnnotation(field2, cls30);
                                                if (jSONField3 != null) {
                                                    strTranslate = str2;
                                                    fieldArr4 = fieldArr3;
                                                    cls7 = cls30;
                                                    iOrdinal = i22;
                                                } else if (jSONField3.deserialize()) {
                                                    fieldArr = fieldArr3;
                                                    str = str;
                                                    propertyNamingStrategy3 = propertyNamingStrategy3;
                                                    cls7 = cls30;
                                                } else {
                                                    fieldArr = fieldArr3;
                                                    iOrdinal = jSONField3.ordinal();
                                                    iM4812of5 = SerializerFeature.m4812of(jSONField3.serialzeFeatures());
                                                    iM4811of = Feature.m4811of(jSONField3.parseFeatures());
                                                    if (jSONField3.name().length() != 0) {
                                                        str = str;
                                                        cls7 = cls30;
                                                        add(arrayList, new FieldInfo(jSONField3.name(), method8, field2, cls, type, iOrdinal, iM4812of5, iM4811of, superMethodAnnotation2, jSONField3, null, map2));
                                                        propertyNamingStrategy3 = propertyNamingStrategy3;
                                                    } else {
                                                        strTranslate = str2;
                                                        fieldArr4 = fieldArr;
                                                        cls7 = cls30;
                                                    }
                                                }
                                            } else {
                                                strTranslate = str2;
                                                fieldArr4 = fieldArr3;
                                                cls7 = cls30;
                                                iOrdinal = i22;
                                                r10 = field;
                                            }
                                            if (propertyNamingStrategy3 != null) {
                                                r10 = jSONField3;
                                                r10 = jSONField3;
                                                strTranslate = propertyNamingStrategy3.translate(strTranslate);
                                            }
                                            r10 = jSONField3;
                                            r10 = jSONField3;
                                            fieldArr = fieldArr4;
                                            propertyNamingStrategy3 = propertyNamingStrategy3;
                                            add(arrayList, new FieldInfo(strTranslate, method8, field2, cls, type, iOrdinal, iM4812of5, iM4811of, superMethodAnnotation2, r10, null, map2));
                                        } else {
                                            cCharAt = name3.charAt(3);
                                            if (Character.isUpperCase(cCharAt)) {
                                                fieldArr3 = fieldArr;
                                                if (TypeUtils.compatibleWithJavaBean) {
                                                    strDecapitalize = TypeUtils.decapitalize(name3.substring(3));
                                                } else {
                                                    strDecapitalize = Character.toLowerCase(name3.charAt(3)) + name3.substring(4);
                                                }
                                                str2 = strDecapitalize;
                                                field2 = field;
                                            } else {
                                                fieldArr3 = fieldArr;
                                                if (TypeUtils.compatibleWithJavaBean) {
                                                    strDecapitalize = TypeUtils.decapitalize(name3.substring(3));
                                                } else {
                                                    strDecapitalize = Character.toLowerCase(name3.charAt(3)) + name3.substring(4);
                                                }
                                                str2 = strDecapitalize;
                                                field2 = field;
                                            }
                                            if (field2 == null) {
                                                field2 = TypeUtils.getField(cls, str2, fieldArr3);
                                            }
                                            if (field2 == null) {
                                                field2 = TypeUtils.getField(cls, "is" + Character.toUpperCase(str2.charAt(0)) + str2.substring(i2), fieldArr3);
                                            }
                                            if (field2 != null) {
                                                jSONField3 = (JSONField) TypeUtils.getAnnotation(field2, cls30);
                                                if (jSONField3 != null) {
                                                    strTranslate = str2;
                                                    fieldArr4 = fieldArr3;
                                                    cls7 = cls30;
                                                    iOrdinal = i22;
                                                } else if (jSONField3.deserialize()) {
                                                    fieldArr = fieldArr3;
                                                    str = str;
                                                    propertyNamingStrategy3 = propertyNamingStrategy3;
                                                    cls7 = cls30;
                                                } else {
                                                    fieldArr = fieldArr3;
                                                    iOrdinal = jSONField3.ordinal();
                                                    iM4812of5 = SerializerFeature.m4812of(jSONField3.serialzeFeatures());
                                                    iM4811of = Feature.m4811of(jSONField3.parseFeatures());
                                                    if (jSONField3.name().length() != 0) {
                                                        str = str;
                                                        cls7 = cls30;
                                                        add(arrayList, new FieldInfo(jSONField3.name(), method8, field2, cls, type, iOrdinal, iM4812of5, iM4811of, superMethodAnnotation2, jSONField3, null, map2));
                                                        propertyNamingStrategy3 = propertyNamingStrategy3;
                                                    } else {
                                                        strTranslate = str2;
                                                        fieldArr4 = fieldArr;
                                                        cls7 = cls30;
                                                    }
                                                }
                                            } else {
                                                strTranslate = str2;
                                                fieldArr4 = fieldArr3;
                                                cls7 = cls30;
                                                iOrdinal = i22;
                                                r10 = field;
                                            }
                                            if (propertyNamingStrategy3 != null) {
                                                r10 = jSONField3;
                                                r10 = jSONField3;
                                                strTranslate = propertyNamingStrategy3.translate(strTranslate);
                                            }
                                            r10 = jSONField3;
                                            r10 = jSONField3;
                                            fieldArr = fieldArr4;
                                            propertyNamingStrategy3 = propertyNamingStrategy3;
                                            add(arrayList, new FieldInfo(strTranslate, method8, field2, cls, type, iOrdinal, iM4812of5, iM4811of, superMethodAnnotation2, r10, null, map2));
                                        }
                                    } else {
                                        if (superMethodAnnotation2 != null) {
                                            if (superMethodAnnotation2.deserialize()) {
                                                iOrdinal2 = superMethodAnnotation2.ordinal();
                                                iM4812of5 = SerializerFeature.m4812of(superMethodAnnotation2.serialzeFeatures());
                                                iM4811of = Feature.m4811of(superMethodAnnotation2.parseFeatures());
                                                if (superMethodAnnotation2.name().length() != 0) {
                                                    add(arrayList, new FieldInfo(superMethodAnnotation2.name(), method8, null, cls, type, iOrdinal2, iM4812of5, iM4811of, superMethodAnnotation2, null, null, map2));
                                                } else {
                                                    i22 = iOrdinal2;
                                                }
                                            }
                                            str = str;
                                            propertyNamingStrategy3 = propertyNamingStrategy3;
                                            cls7 = cls30;
                                        }
                                        if (superMethodAnnotation2 == null) {
                                            cCharAt = name3.charAt(3);
                                            if (Character.isUpperCase(cCharAt)) {
                                                fieldArr3 = fieldArr;
                                                if (TypeUtils.compatibleWithJavaBean) {
                                                    strDecapitalize = TypeUtils.decapitalize(name3.substring(3));
                                                } else {
                                                    strDecapitalize = Character.toLowerCase(name3.charAt(3)) + name3.substring(4);
                                                }
                                                str2 = strDecapitalize;
                                                field2 = field;
                                            } else {
                                                fieldArr3 = fieldArr;
                                                if (TypeUtils.compatibleWithJavaBean) {
                                                    strDecapitalize = TypeUtils.decapitalize(name3.substring(3));
                                                } else {
                                                    strDecapitalize = Character.toLowerCase(name3.charAt(3)) + name3.substring(4);
                                                }
                                                str2 = strDecapitalize;
                                                field2 = field;
                                            }
                                            if (field2 == null) {
                                                field2 = TypeUtils.getField(cls, str2, fieldArr3);
                                            }
                                            if (field2 == null) {
                                                field2 = TypeUtils.getField(cls, "is" + Character.toUpperCase(str2.charAt(0)) + str2.substring(i2), fieldArr3);
                                            }
                                            if (field2 != null) {
                                                jSONField3 = (JSONField) TypeUtils.getAnnotation(field2, cls30);
                                                if (jSONField3 != null) {
                                                    strTranslate = str2;
                                                    fieldArr4 = fieldArr3;
                                                    cls7 = cls30;
                                                    iOrdinal = i22;
                                                } else if (jSONField3.deserialize()) {
                                                    fieldArr = fieldArr3;
                                                    str = str;
                                                    propertyNamingStrategy3 = propertyNamingStrategy3;
                                                    cls7 = cls30;
                                                } else {
                                                    fieldArr = fieldArr3;
                                                    iOrdinal = jSONField3.ordinal();
                                                    iM4812of5 = SerializerFeature.m4812of(jSONField3.serialzeFeatures());
                                                    iM4811of = Feature.m4811of(jSONField3.parseFeatures());
                                                    if (jSONField3.name().length() != 0) {
                                                        str = str;
                                                        cls7 = cls30;
                                                        add(arrayList, new FieldInfo(jSONField3.name(), method8, field2, cls, type, iOrdinal, iM4812of5, iM4811of, superMethodAnnotation2, jSONField3, null, map2));
                                                        propertyNamingStrategy3 = propertyNamingStrategy3;
                                                    } else {
                                                        strTranslate = str2;
                                                        fieldArr4 = fieldArr;
                                                        cls7 = cls30;
                                                    }
                                                }
                                            } else {
                                                strTranslate = str2;
                                                fieldArr4 = fieldArr3;
                                                cls7 = cls30;
                                                iOrdinal = i22;
                                                r10 = field;
                                            }
                                            if (propertyNamingStrategy3 != null) {
                                                r10 = jSONField3;
                                                r10 = jSONField3;
                                                strTranslate = propertyNamingStrategy3.translate(strTranslate);
                                            }
                                            r10 = jSONField3;
                                            r10 = jSONField3;
                                            fieldArr = fieldArr4;
                                            propertyNamingStrategy3 = propertyNamingStrategy3;
                                            add(arrayList, new FieldInfo(strTranslate, method8, field2, cls, type, iOrdinal, iM4812of5, iM4811of, superMethodAnnotation2, r10, null, map2));
                                        } else {
                                            cCharAt = name3.charAt(3);
                                            if (Character.isUpperCase(cCharAt)) {
                                                fieldArr3 = fieldArr;
                                                if (TypeUtils.compatibleWithJavaBean) {
                                                    strDecapitalize = TypeUtils.decapitalize(name3.substring(3));
                                                } else {
                                                    strDecapitalize = Character.toLowerCase(name3.charAt(3)) + name3.substring(4);
                                                }
                                                str2 = strDecapitalize;
                                                field2 = field;
                                            } else {
                                                fieldArr3 = fieldArr;
                                                if (TypeUtils.compatibleWithJavaBean) {
                                                    strDecapitalize = TypeUtils.decapitalize(name3.substring(3));
                                                } else {
                                                    strDecapitalize = Character.toLowerCase(name3.charAt(3)) + name3.substring(4);
                                                }
                                                str2 = strDecapitalize;
                                                field2 = field;
                                            }
                                            if (field2 == null) {
                                                field2 = TypeUtils.getField(cls, str2, fieldArr3);
                                            }
                                            if (field2 == null) {
                                                field2 = TypeUtils.getField(cls, "is" + Character.toUpperCase(str2.charAt(0)) + str2.substring(i2), fieldArr3);
                                            }
                                            if (field2 != null) {
                                                jSONField3 = (JSONField) TypeUtils.getAnnotation(field2, cls30);
                                                if (jSONField3 != null) {
                                                    strTranslate = str2;
                                                    fieldArr4 = fieldArr3;
                                                    cls7 = cls30;
                                                    iOrdinal = i22;
                                                } else if (jSONField3.deserialize()) {
                                                    fieldArr = fieldArr3;
                                                    str = str;
                                                    propertyNamingStrategy3 = propertyNamingStrategy3;
                                                    cls7 = cls30;
                                                } else {
                                                    fieldArr = fieldArr3;
                                                    iOrdinal = jSONField3.ordinal();
                                                    iM4812of5 = SerializerFeature.m4812of(jSONField3.serialzeFeatures());
                                                    iM4811of = Feature.m4811of(jSONField3.parseFeatures());
                                                    if (jSONField3.name().length() != 0) {
                                                        str = str;
                                                        cls7 = cls30;
                                                        add(arrayList, new FieldInfo(jSONField3.name(), method8, field2, cls, type, iOrdinal, iM4812of5, iM4811of, superMethodAnnotation2, jSONField3, null, map2));
                                                        propertyNamingStrategy3 = propertyNamingStrategy3;
                                                    } else {
                                                        strTranslate = str2;
                                                        fieldArr4 = fieldArr;
                                                        cls7 = cls30;
                                                    }
                                                }
                                            } else {
                                                strTranslate = str2;
                                                fieldArr4 = fieldArr3;
                                                cls7 = cls30;
                                                iOrdinal = i22;
                                                r10 = field;
                                            }
                                            if (propertyNamingStrategy3 != null) {
                                                r10 = jSONField3;
                                                r10 = jSONField3;
                                                strTranslate = propertyNamingStrategy3.translate(strTranslate);
                                            }
                                            r10 = jSONField3;
                                            r10 = jSONField3;
                                            fieldArr = fieldArr4;
                                            propertyNamingStrategy3 = propertyNamingStrategy3;
                                            add(arrayList, new FieldInfo(strTranslate, method8, field2, cls, type, iOrdinal, iM4812of5, iM4811of, superMethodAnnotation2, r10, null, map2));
                                        }
                                    }
                                } else {
                                    str = str;
                                    propertyNamingStrategy3 = propertyNamingStrategy3;
                                    cls7 = cls30;
                                }
                            }
                        }
                    }
                    cls10 = cls10;
                }
            }
            i20 = i21 + 1;
            propertyNamingStrategy3 = propertyNamingStrategy3;
            cls7 = cls7;
            methodArr5 = methodArr5;
            length6 = length6;
            str = str;
            cls9 = cls9;
            cls11 = cls11;
        }
        Class cls32 = cls11;
        PropertyNamingStrategy propertyNamingStrategy4 = propertyNamingStrategy3;
        Class<JSONField> cls33 = cls7;
        computeFields(cls, type, propertyNamingStrategy4, arrayList, cls.getFields());
        Method[] methods3 = cls.getMethods();
        int length7 = methods3.length;
        int i23 = 0;
        while (i23 < length7) {
            int i24 = i23;
            Method method9 = methods3[i24];
            String name4 = method9.getName();
            if (name4.length() < 4) {
                methods3 = methods3;
                length7 = length7;
                cls33 = cls33;
                fieldArr = fieldArr;
                cls12 = cls8;
            } else if (!Modifier.isStatic(method9.getModifiers()) && cls32 == null && name4.startsWith("get") && Character.isUpperCase(name4.charAt(3)) && method9.getParameterTypes().length == 0) {
                Class<Collection> cls34 = cls8;
                if ((cls34.isAssignableFrom(method9.getReturnType()) || Map.class.isAssignableFrom(method9.getReturnType()) || AtomicBoolean.class == method9.getReturnType() || AtomicInteger.class == method9.getReturnType() || AtomicLong.class == method9.getReturnType()) && ((jSONField = (JSONField) TypeUtils.getAnnotation(method9, cls33)) == null || !jSONField.deserialize())) {
                    if (jSONField == null || jSONField.name().length() <= 0) {
                        StringBuilder sb3 = new StringBuilder();
                        c = 3;
                        sb3.append(Character.toLowerCase(name4.charAt(3)));
                        c2 = 4;
                        sb3.append(name4.substring(4));
                        string = sb3.toString();
                        fieldArr2 = fieldArr;
                        Field field8 = TypeUtils.getField(cls, string, fieldArr2);
                        if (field8 != null && (jSONField2 = (JSONField) TypeUtils.getAnnotation(field8, cls33)) != null && !jSONField2.deserialize()) {
                            methods3 = methods3;
                            length7 = length7;
                            cls12 = cls34;
                            cls33 = cls33;
                            fieldArr = fieldArr2;
                        }
                    } else {
                        string = jSONField.name();
                        fieldArr2 = fieldArr;
                        c = 3;
                        c2 = 4;
                    }
                    if (propertyNamingStrategy4 != null) {
                        string = propertyNamingStrategy4.translate(string);
                    }
                    if (getField(arrayList, string) != null) {
                        methods3 = methods3;
                        length7 = length7;
                        cls12 = cls34;
                        cls33 = cls33;
                        fieldArr = fieldArr2;
                    } else {
                        methods3 = methods3;
                        length7 = length7;
                        cls12 = cls34;
                        cls33 = cls33;
                        fieldArr = fieldArr2;
                        add(arrayList, new FieldInfo(string, method9, null, cls, type, 0, 0, 0, jSONField, null, null, map2));
                    }
                } else {
                    cls12 = cls34;
                }
                i23 = i24 + 1;
                fieldArr = fieldArr;
                methods3 = methods3;
                length7 = length7;
                cls33 = cls33;
                cls8 = cls12;
            } else {
                cls12 = cls8;
            }
            i23 = i24 + 1;
            fieldArr = fieldArr;
            methods3 = methods3;
            length7 = length7;
            cls33 = cls33;
            cls8 = cls12;
        }
        Field[] fieldArr5 = fieldArr;
        if (arrayList.size() == 0) {
            if (TypeUtils.isXmlField(cls) ? true : z) {
                for (Class<?> superclass2 = cls; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                    computeFields(cls, type, propertyNamingStrategy4, arrayList, fieldArr5);
                }
            }
        }
        return new JavaBeanInfo(cls, cls32, constructor, creatorConstructor, method4, method5, jSONType, arrayList);
    }

    private static Map<TypeVariable, Type> buildGenericInfo(Class<?> cls) {
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = null;
        if (superclass == null) {
            return null;
        }
        while (true) {
            Class<? super Object> cls2 = superclass;
            Class<?> cls3 = cls;
            cls = cls2;
            if (cls == null || cls == Object.class) {
                break;
            }
            if (cls3.getGenericSuperclass() instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) cls3.getGenericSuperclass()).getActualTypeArguments();
                TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    if (map.containsKey(actualTypeArguments[i])) {
                        map.put(typeParameters[i], map.get(actualTypeArguments[i]));
                    } else {
                        map.put(typeParameters[i], actualTypeArguments[i]);
                    }
                }
            }
            superclass = cls.getSuperclass();
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:1: B:20:0x0053->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    private static void computeFields(Class<?> cls, Type type, PropertyNamingStrategy propertyNamingStrategy, List<FieldInfo> list, Field[] fieldArr) {
        Iterator<FieldInfo> it;
        String name;
        JSONField jSONField;
        int i;
        int i2;
        int i3;
        int i4;
        Map<TypeVariable, Type> mapBuildGenericInfo = buildGenericInfo(cls);
        int length = fieldArr.length;
        int i5 = 0;
        while (i5 < length) {
            Field field = fieldArr[i5];
            int modifiers = field.getModifiers();
            if ((modifiers & 8) != 0) {
                i4 = i5;
                break;
                break;
            }
            if ((modifiers & 16) == 0) {
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        name = field.getName();
                        jSONField = (JSONField) TypeUtils.getAnnotation(field, JSONField.class);
                        if (jSONField != null) {
                            i = 0;
                            i2 = 0;
                            i3 = 0;
                        } else if (!jSONField.deserialize()) {
                            int iOrdinal = jSONField.ordinal();
                            int iM4812of = SerializerFeature.m4812of(jSONField.serialzeFeatures());
                            int iM4811of = Feature.m4811of(jSONField.parseFeatures());
                            if (jSONField.name().length() != 0) {
                                name = jSONField.name();
                            }
                            i = iOrdinal;
                            i2 = iM4812of;
                            i3 = iM4811of;
                        }
                        if (propertyNamingStrategy != null) {
                            name = propertyNamingStrategy.translate(name);
                        }
                        i4 = i5;
                        add(list, new FieldInfo(name, null, field, cls, type, i, i2, i3, null, jSONField, null, mapBuildGenericInfo));
                        break;
                        break;
                    }
                    if (it.next().name.equals(field.getName())) {
                    }
                    i4 = i5;
                    break;
                    break;
                }
            }
            Class<?> type2 = field.getType();
            if (!Map.class.isAssignableFrom(type2) && !Collection.class.isAssignableFrom(type2) && !AtomicLong.class.equals(type2) && !AtomicInteger.class.equals(type2) && !AtomicBoolean.class.equals(type2)) {
                i4 = i5;
                break;
                break;
            }
            it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    name = field.getName();
                    jSONField = (JSONField) TypeUtils.getAnnotation(field, JSONField.class);
                    if (jSONField != null) {
                        i = 0;
                        i2 = 0;
                        i3 = 0;
                    } else if (!jSONField.deserialize()) {
                        int iOrdinal2 = jSONField.ordinal();
                        int iM4812of2 = SerializerFeature.m4812of(jSONField.serialzeFeatures());
                        int iM4811of2 = Feature.m4811of(jSONField.parseFeatures());
                        if (jSONField.name().length() != 0) {
                            name = jSONField.name();
                        }
                        i = iOrdinal2;
                        i2 = iM4812of2;
                        i3 = iM4811of2;
                    }
                    if (propertyNamingStrategy != null) {
                        name = propertyNamingStrategy.translate(name);
                    }
                    i4 = i5;
                    add(list, new FieldInfo(name, null, field, cls, type, i, i2, i3, null, jSONField, null, mapBuildGenericInfo));
                    break;
                }
                if (it.next().name.equals(field.getName())) {
                }
                i4 = i5;
                break;
            }
            i5 = i4 + 1;
        }
    }

    public static Class<?> getBuilderClass(Class<?> cls, JSONType jSONType) {
        Class<?> clsBuilder;
        if (cls != null && cls.getName().equals("org.springframework.security.web.savedrequest.DefaultSavedRequest")) {
            return TypeUtils.loadClass("org.springframework.security.web.savedrequest.DefaultSavedRequest$Builder");
        }
        if (jSONType == null || (clsBuilder = jSONType.builder()) == Void.class) {
            return null;
        }
        return clsBuilder;
    }

    public static Constructor<?> getCreatorConstructor(Constructor[] constructorArr) {
        Constructor constructor = null;
        for (Constructor constructor2 : constructorArr) {
            if (((JSONCreator) constructor2.getAnnotation(JSONCreator.class)) != null) {
                if (constructor != null) {
                    qkq.m176968a("multi-JSONCreator");
                    return null;
                }
                constructor = constructor2;
            }
        }
        if (constructor != null) {
            return constructor;
        }
        for (Constructor constructor3 : constructorArr) {
            Annotation[][] parameterAnnotations = TypeUtils.getParameterAnnotations(constructor3);
            if (parameterAnnotations.length != 0) {
                int length = parameterAnnotations.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        if (constructor == null) {
                            constructor = constructor3;
                            break;
                        }
                        qkq.m176968a("multi-JSONCreator");
                        return null;
                    }
                    Annotation[] annotationArr = parameterAnnotations[i];
                    int length2 = annotationArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        if (annotationArr[i2] instanceof JSONField) {
                            break;
                        }
                        i2++;
                    }
                    i++;
                }
            }
        }
        return constructor;
    }

    public static Constructor<?> getDefaultConstructor(Class<?> cls, Constructor<?>[] constructorArr) {
        Constructor<?> constructor = null;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        for (Constructor<?> constructor2 : constructorArr) {
            if (constructor2.getParameterTypes().length == 0) {
                constructor = constructor2;
                break;
            }
        }
        if (constructor == null && cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
            for (Constructor<?> constructor3 : constructorArr) {
                Class<?>[] parameterTypes = constructor3.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].equals(cls.getDeclaringClass())) {
                    return constructor3;
                }
            }
        }
        return constructor;
    }

    private static Method getFactoryMethod(Class<?> cls, Method[] methodArr, boolean z) {
        Method method = null;
        for (Method method2 : methodArr) {
            if (Modifier.isStatic(method2.getModifiers()) && cls.isAssignableFrom(method2.getReturnType()) && ((JSONCreator) TypeUtils.getAnnotation(method2, JSONCreator.class)) != null) {
                if (method != null) {
                    qkq.m176968a("multi-JSONCreator");
                    return null;
                }
                method = method2;
            }
        }
        if (method == null && z) {
            for (Method method3 : methodArr) {
                if (TypeUtils.isJacksonCreator(method3)) {
                    return method3;
                }
            }
        }
        return method;
    }

    private static FieldInfo getField(List<FieldInfo> list, String str) {
        Field field;
        for (FieldInfo fieldInfo : list) {
            if (fieldInfo.name.equals(str) || ((field = fieldInfo.field) != null && fieldInfo.getAnnotation() != null && field.getName().equals(str))) {
                return fieldInfo;
            }
        }
        return null;
    }

    public static Class<?> getBuilderClass(JSONType jSONType) {
        return getBuilderClass(null, jSONType);
    }

    public static JavaBeanInfo build(Class<?> cls, Type type, PropertyNamingStrategy propertyNamingStrategy, boolean z, boolean z2) {
        return build(cls, type, propertyNamingStrategy, z, z2, false);
    }

    public static JavaBeanInfo build(Class<?> cls, Type type, PropertyNamingStrategy propertyNamingStrategy) {
        return build(cls, type, propertyNamingStrategy, false, TypeUtils.compatibleWithJavaBean, false);
    }
}
