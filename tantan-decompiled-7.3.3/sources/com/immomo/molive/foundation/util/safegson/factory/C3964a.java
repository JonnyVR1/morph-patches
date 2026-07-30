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
import p153l.fvc0;
import p153l.wg3;

/* JADX INFO: renamed from: com.immomo.molive.foundation.util.safegson.factory.a */
/* JADX INFO: loaded from: classes7.dex */
public class C3964a {

    /* JADX INFO: renamed from: a */
    private static final ArrayList<Class<?>> f13852a;

    /* JADX INFO: renamed from: com.immomo.molive.foundation.util.safegson.factory.a$a */
    public class a extends fvc0 {

        /* JADX INFO: renamed from: e */
        final TypeAdapter<?> f13853e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Gson f13854f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ ConstructorConstructor f13855g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ Field f13856h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ TypeToken f13857i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ String f13858j;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f13859k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, TypeToken typeToken, boolean z, boolean z2, Gson gson, ConstructorConstructor constructorConstructor, Field field, TypeToken typeToken2, String str2, boolean z3) {
            super(str, typeToken, z, z2);
            this.f13854f = gson;
            this.f13855g = constructorConstructor;
            this.f13856h = field;
            this.f13857i = typeToken2;
            this.f13858j = str2;
            this.f13859k = z3;
            this.f13853e = C3964a.m19596c(gson, constructorConstructor, field, typeToken2, str2);
        }

        @Override // p153l.fvc0
        /* JADX INFO: renamed from: e */
        public void mo19599e(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException {
            Object obj2 = this.f13853e.read2(jsonReader);
            if (obj2 == null && this.f13859k) {
                return;
            }
            this.f13856h.set(obj, obj2);
        }

        @Override // p153l.fvc0
        /* JADX INFO: renamed from: f */
        public void mo19600f(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException {
            new TypeAdapterRuntimeTypeWrapper(this.f13854f, this.f13853e, this.f13857i.getType()).write(jsonWriter, this.f13856h.get(obj));
        }

        @Override // p153l.fvc0
        /* JADX INFO: renamed from: g */
        public boolean mo19601g(Object obj) throws IllegalAccessException, IOException {
            return m127607d() && this.f13856h.get(obj) != obj;
        }
    }

    static {
        ArrayList<Class<?>> arrayList = new ArrayList<>();
        f13852a = arrayList;
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
    public static boolean m19594a(Class<?> cls) {
        return f13852a.contains(cls);
    }

    /* JADX INFO: renamed from: b */
    public static fvc0 m19595b(Gson gson, ConstructorConstructor constructorConstructor, Field field, String str, TypeToken<?> typeToken, boolean z, boolean z2) {
        return new a(str, typeToken, z, z2, gson, constructorConstructor, field, typeToken, str, Primitives.isPrimitive(typeToken.getRawType()));
    }

    /* JADX INFO: renamed from: c */
    public static TypeAdapter<?> m19596c(Gson gson, ConstructorConstructor constructorConstructor, Field field, TypeToken<?> typeToken, String str) {
        TypeAdapter<?> typeAdapterM19598e;
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        if (jsonAdapter != null && (typeAdapterM19598e = m19598e(constructorConstructor, gson, typeToken, jsonAdapter)) != null) {
            return typeAdapterM19598e;
        }
        TypeAdapter<?> adapter = gson.getAdapter(typeToken);
        if (adapter instanceof SafeCollectionTypeAdapter) {
            ((SafeCollectionTypeAdapter) adapter).m19586c(TypeToken.get((Class) field.getDeclaringClass()), str);
        }
        if (adapter instanceof SafeMapTypeAdapterFactory.Adapter) {
            ((SafeMapTypeAdapterFactory.Adapter) adapter).m19588c(TypeToken.get((Class) field.getDeclaringClass()), str);
        }
        if (adapter instanceof SafeReflectiveTypeAdapter) {
            ((SafeReflectiveTypeAdapter) adapter).m19589c(TypeToken.get((Class) field.getDeclaringClass()), str);
        }
        if (adapter instanceof SafeArrayTypeAdapter) {
            ((SafeArrayTypeAdapter) adapter).m19585c(TypeToken.get((Class) field.getDeclaringClass()), str);
        }
        return adapter;
    }

    /* JADX INFO: renamed from: d */
    public static List<String> m19597d(FieldNamingStrategy fieldNamingStrategy, Field field) {
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
    public static TypeAdapter<?> m19598e(ConstructorConstructor constructorConstructor, Gson gson, TypeToken<?> typeToken, JsonAdapter jsonAdapter) {
        TypeAdapter<?> typeAdapterCreate;
        Class<?> clsValue = jsonAdapter.value();
        if (TypeAdapter.class.isAssignableFrom(clsValue)) {
            typeAdapterCreate = (TypeAdapter) constructorConstructor.get(TypeToken.get((Class) clsValue)).construct();
        } else {
            if (!TypeAdapterFactory.class.isAssignableFrom(clsValue)) {
                wg3.m206174a("@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.");
                return null;
            }
            typeAdapterCreate = ((TypeAdapterFactory) constructorConstructor.get(TypeToken.get((Class) clsValue)).construct()).create(gson, typeToken);
        }
        return typeAdapterCreate != null ? typeAdapterCreate.nullSafe() : typeAdapterCreate;
    }
}
