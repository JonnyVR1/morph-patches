package com.immomo.molive.foundation.util.safegson.factory;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p149l.anc0;
import p149l.ig3;

/* JADX INFO: renamed from: com.immomo.molive.foundation.util.safegson.factory.a */
/* JADX INFO: loaded from: classes7.dex */
public class C3821a {

    /* JADX INFO: renamed from: a */
    private static final ArrayList<Class<?>> f13158a;

    /* JADX INFO: renamed from: com.immomo.molive.foundation.util.safegson.factory.a$a */
    public class a extends anc0 {

        /* JADX INFO: renamed from: e */
        final TypeAdapter<?> f13159e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Gson f13160f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ ConstructorConstructor f13161g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ Field f13162h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ TypeToken f13163i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ String f13164j;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f13165k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, TypeToken typeToken, boolean z, boolean z2, Gson gson, ConstructorConstructor constructorConstructor, Field field, TypeToken typeToken2, String str2, boolean z3) {
            super(str, typeToken, z, z2);
            this.f13160f = gson;
            this.f13161g = constructorConstructor;
            this.f13162h = field;
            this.f13163i = typeToken2;
            this.f13164j = str2;
            this.f13165k = z3;
            this.f13159e = C3821a.m18616c(gson, constructorConstructor, field, typeToken2, str2);
        }

        @Override // p149l.anc0
        /* JADX INFO: renamed from: e */
        public void mo18619e(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException {
            Object obj2 = this.f13159e.read2(jsonReader);
            if (obj2 == null && this.f13165k) {
                return;
            }
            this.f13162h.set(obj, obj2);
        }

        @Override // p149l.anc0
        /* JADX INFO: renamed from: f */
        public void mo18620f(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException {
            new TypeAdapterRuntimeTypeWrapper(this.f13160f, this.f13159e, this.f13163i.getType()).write(jsonWriter, this.f13162h.get(obj));
        }

        @Override // p149l.anc0
        /* JADX INFO: renamed from: g */
        public boolean mo18621g(Object obj) throws IllegalAccessException, IOException {
            return m97749d() && this.f13162h.get(obj) != obj;
        }
    }

    static {
        ArrayList<Class<?>> arrayList = new ArrayList<>();
        f13158a = arrayList;
        arrayList.add(String.class);
        arrayList.add(Integer.class);
        arrayList.add(Boolean.class);
        arrayList.add(Byte.class);
        arrayList.add(Short.class);
        arrayList.add(Long.class);
        arrayList.add(Double.class);
        arrayList.add(Float.class);
        arrayList.add(Number.class);
        arrayList.add(AtomicInteger.class);
        arrayList.add(AtomicBoolean.class);
        arrayList.add(AtomicLong.class);
        arrayList.add(AtomicLongArray.class);
        arrayList.add(AtomicIntegerArray.class);
        arrayList.add(Character.class);
        arrayList.add(StringBuilder.class);
        arrayList.add(StringBuffer.class);
        arrayList.add(BigDecimal.class);
        arrayList.add(BigInteger.class);
        arrayList.add(URL.class);
        arrayList.add(URI.class);
        arrayList.add(UUID.class);
        arrayList.add(Currency.class);
        arrayList.add(Locale.class);
        arrayList.add(InetAddress.class);
        arrayList.add(BitSet.class);
        arrayList.add(Date.class);
        arrayList.add(GregorianCalendar.class);
        arrayList.add(Calendar.class);
        arrayList.add(Time.class);
        arrayList.add(java.sql.Date.class);
        arrayList.add(Timestamp.class);
        arrayList.add(Class.class);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m18614a(Class<?> cls) {
        return f13158a.contains(cls);
    }

    /* JADX INFO: renamed from: b */
    public static anc0 m18615b(Gson gson, ConstructorConstructor constructorConstructor, Field field, String str, TypeToken<?> typeToken, boolean z, boolean z2) {
        return new a(str, typeToken, z, z2, gson, constructorConstructor, field, typeToken, str, Primitives.isPrimitive(typeToken.getRawType()));
    }

    /* JADX INFO: renamed from: c */
    public static TypeAdapter<?> m18616c(Gson gson, ConstructorConstructor constructorConstructor, Field field, TypeToken<?> typeToken, String str) {
        TypeAdapter<?> typeAdapterM18618e;
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        if (jsonAdapter != null && (typeAdapterM18618e = m18618e(constructorConstructor, gson, typeToken, jsonAdapter)) != null) {
            return typeAdapterM18618e;
        }
        TypeAdapter<?> adapter = gson.getAdapter(typeToken);
        if (adapter instanceof SafeCollectionTypeAdapter) {
            ((SafeCollectionTypeAdapter) adapter).m18606c(TypeToken.get((Class) field.getDeclaringClass()), str);
        }
        if (adapter instanceof SafeMapTypeAdapterFactory.Adapter) {
            ((SafeMapTypeAdapterFactory.Adapter) adapter).m18608c(TypeToken.get((Class) field.getDeclaringClass()), str);
        }
        if (adapter instanceof SafeReflectiveTypeAdapter) {
            ((SafeReflectiveTypeAdapter) adapter).m18609c(TypeToken.get((Class) field.getDeclaringClass()), str);
        }
        if (adapter instanceof SafeArrayTypeAdapter) {
            ((SafeArrayTypeAdapter) adapter).m18605c(TypeToken.get((Class) field.getDeclaringClass()), str);
        }
        return adapter;
    }

    /* JADX INFO: renamed from: d */
    public static List<String> m18617d(FieldNamingStrategy fieldNamingStrategy, Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        LinkedList linkedList = new LinkedList();
        if (serializedName == null) {
            linkedList.add(fieldNamingStrategy.translateName(field));
            return linkedList;
        }
        linkedList.add(serializedName.value());
        String[] strArrAlternate = serializedName.alternate();
        for (String str : strArrAlternate) {
            linkedList.add(str);
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: e */
    public static TypeAdapter<?> m18618e(ConstructorConstructor constructorConstructor, Gson gson, TypeToken<?> typeToken, JsonAdapter jsonAdapter) {
        TypeAdapter<?> typeAdapterCreate;
        Class<?> clsValue = jsonAdapter.value();
        if (TypeAdapter.class.isAssignableFrom(clsValue)) {
            typeAdapterCreate = (TypeAdapter) constructorConstructor.get(TypeToken.get((Class) clsValue)).construct();
        } else {
            if (!TypeAdapterFactory.class.isAssignableFrom(clsValue)) {
                ig3.m135964a("@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.");
                return null;
            }
            typeAdapterCreate = ((TypeAdapterFactory) constructorConstructor.get(TypeToken.get((Class) clsValue)).construct()).create(gson, typeToken);
        }
        return typeAdapterCreate != null ? typeAdapterCreate.nullSafe() : typeAdapterCreate;
    }
}
