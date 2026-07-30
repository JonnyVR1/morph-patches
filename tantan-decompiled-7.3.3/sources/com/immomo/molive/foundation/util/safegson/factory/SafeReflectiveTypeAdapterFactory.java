package com.immomo.molive.foundation.util.safegson.factory;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import com.immomo.molive.foundation.util.safegson.handler.SafeErrorTypeAdapterFactory;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p153l.fvc0;
import p153l.src0;

/* JADX INFO: loaded from: classes7.dex */
public class SafeReflectiveTypeAdapterFactory extends SafeErrorTypeAdapterFactory {

    /* JADX INFO: renamed from: b */
    private final ConstructorConstructor f13843b;

    /* JADX INFO: renamed from: c */
    private final FieldNamingStrategy f13844c;

    /* JADX INFO: renamed from: d */
    private final Excluder f13845d;

    public SafeReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder) {
        this.f13843b = constructorConstructor;
        this.f13844c = fieldNamingStrategy;
        this.f13845d = excluder;
    }

    /* JADX INFO: renamed from: d */
    private boolean m19590d(Field field, boolean z) {
        return m19591e(field, z, this.f13845d);
    }

    /* JADX INFO: renamed from: e */
    private static boolean m19591e(Field field, boolean z, Excluder excluder) {
        return (excluder.excludeClass(field.getType(), z) || excluder.excludeField(field, z)) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    private Map<String, fvc0> m19592f(Gson gson, TypeToken<?> typeToken, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls.isInterface()) {
            Type type = typeToken.getType();
            TypeToken<?> typeToken2 = typeToken;
            Class<?> rawType = cls;
            while (rawType != Object.class) {
                for (Field field : rawType.getDeclaredFields()) {
                    boolean zM19590d = m19590d(field, true);
                    boolean zM19590d2 = m19590d(field, false);
                    if (zM19590d || zM19590d2) {
                        field.setAccessible(true);
                        Type typeResolve = C$Gson$Types.resolve(typeToken2.getType(), rawType, field.getGenericType());
                        List<String> listM19593g = m19593g(field);
                        int i = 0;
                        fvc0 fvc0Var = null;
                        while (i < listM19593g.size()) {
                            String str = listM19593g.get(i);
                            boolean z = i != 0 ? false : zM19590d;
                            int i2 = i;
                            List<String> list = listM19593g;
                            fvc0 fvc0Var2 = (fvc0) linkedHashMap.put(str, C3964a.m19595b(gson, this.f13843b, field, str, TypeToken.get(typeResolve), z, zM19590d2));
                            if (fvc0Var == null) {
                                fvc0Var = fvc0Var2;
                            }
                            i = i2 + 1;
                            zM19590d = z;
                            listM19593g = list;
                        }
                        if (fvc0Var != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(type);
                            src0.m187593a(sb, " declares multiple JSON fields named ", fvc0Var.m127604a());
                            return null;
                        }
                    }
                }
                typeToken2 = TypeToken.get(C$Gson$Types.resolve(typeToken2.getType(), rawType, rawType.getGenericSuperclass()));
                rawType = typeToken2.getRawType();
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: g */
    private List<String> m19593g(Field field) {
        return C3964a.m19597d(this.f13844c, field);
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (C3964a.m19594a(rawType) || (typeToken.getType() instanceof GenericArrayType) || (((typeToken.getType() instanceof Class) && ((Class) typeToken.getType()).isArray()) || !Object.class.isAssignableFrom(rawType) || Collection.class.isAssignableFrom(rawType) || Map.class.isAssignableFrom(rawType) || ((JsonAdapter) rawType.getAnnotation(JsonAdapter.class)) != null)) {
            return null;
        }
        if (Enum.class.isAssignableFrom(rawType) && rawType != Enum.class) {
            return null;
        }
        SafeReflectiveTypeAdapter safeReflectiveTypeAdapter = new SafeReflectiveTypeAdapter(this.f13843b.get(typeToken), m19592f(gson, typeToken, rawType));
        safeReflectiveTypeAdapter.mo19602a(m19604c());
        return safeReflectiveTypeAdapter;
    }
}
