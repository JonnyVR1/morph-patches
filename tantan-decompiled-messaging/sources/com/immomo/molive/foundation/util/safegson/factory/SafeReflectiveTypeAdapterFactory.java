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
import p149l.anc0;
import p149l.ljc0;

/* JADX INFO: loaded from: classes7.dex */
public class SafeReflectiveTypeAdapterFactory extends SafeErrorTypeAdapterFactory {

    /* JADX INFO: renamed from: b */
    private final ConstructorConstructor f13149b;

    /* JADX INFO: renamed from: c */
    private final FieldNamingStrategy f13150c;

    /* JADX INFO: renamed from: d */
    private final Excluder f13151d;

    public SafeReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder) {
        this.f13149b = constructorConstructor;
        this.f13150c = fieldNamingStrategy;
        this.f13151d = excluder;
    }

    /* JADX INFO: renamed from: d */
    private boolean m18610d(Field field, boolean z) {
        return m18611e(field, z, this.f13151d);
    }

    /* JADX INFO: renamed from: e */
    private static boolean m18611e(Field field, boolean z, Excluder excluder) {
        return (excluder.excludeClass(field.getType(), z) || excluder.excludeField(field, z)) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    private Map<String, anc0> m18612f(Gson gson, TypeToken<?> typeToken, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls.isInterface()) {
            Type type = typeToken.getType();
            TypeToken<?> typeToken2 = typeToken;
            Class<?> rawType = cls;
            while (rawType != Object.class) {
                for (Field field : rawType.getDeclaredFields()) {
                    boolean zM18610d = m18610d(field, true);
                    boolean zM18610d2 = m18610d(field, false);
                    if (zM18610d || zM18610d2) {
                        field.setAccessible(true);
                        Type typeResolve = C$Gson$Types.resolve(typeToken2.getType(), rawType, field.getGenericType());
                        List<String> listM18613g = m18613g(field);
                        int i = 0;
                        anc0 anc0Var = null;
                        while (i < listM18613g.size()) {
                            String str = listM18613g.get(i);
                            boolean z = i != 0 ? false : zM18610d;
                            int i2 = i;
                            List<String> list = listM18613g;
                            anc0 anc0Var2 = (anc0) linkedHashMap.put(str, C3821a.m18615b(gson, this.f13149b, field, str, TypeToken.get(typeResolve), z, zM18610d2));
                            if (anc0Var == null) {
                                anc0Var = anc0Var2;
                            }
                            i = i2 + 1;
                            zM18610d = z;
                            listM18613g = list;
                        }
                        if (anc0Var != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(type);
                            ljc0.m149958a(sb, " declares multiple JSON fields named ", anc0Var.m97746a());
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
    private List<String> m18613g(Field field) {
        return C3821a.m18617d(this.f13150c, field);
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (C3821a.m18614a(rawType) || (typeToken.getType() instanceof GenericArrayType) || (((typeToken.getType() instanceof Class) && ((Class) typeToken.getType()).isArray()) || !Object.class.isAssignableFrom(rawType) || Collection.class.isAssignableFrom(rawType) || Map.class.isAssignableFrom(rawType) || ((JsonAdapter) rawType.getAnnotation(JsonAdapter.class)) != null)) {
            return null;
        }
        if (Enum.class.isAssignableFrom(rawType) && rawType != Enum.class) {
            return null;
        }
        SafeReflectiveTypeAdapter safeReflectiveTypeAdapter = new SafeReflectiveTypeAdapter(this.f13149b.get(typeToken), m18612f(gson, typeToken, rawType));
        safeReflectiveTypeAdapter.mo18622a(m18624c());
        return safeReflectiveTypeAdapter;
    }
}
