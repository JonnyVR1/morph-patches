package p153l;

import android.text.TextUtils;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TypeAdapters;
import com.immomo.molive.foundation.util.safegson.adapter.BigDecimalTypeAdapter;
import com.immomo.molive.foundation.util.safegson.adapter.BooleanTypeAdapter;
import com.immomo.molive.foundation.util.safegson.adapter.DoubleTypeAdapter;
import com.immomo.molive.foundation.util.safegson.adapter.FloatTypeAdapter;
import com.immomo.molive.foundation.util.safegson.adapter.IntegerTypeAdapter;
import com.immomo.molive.foundation.util.safegson.adapter.LongTypeAdapter;
import com.immomo.molive.foundation.util.safegson.adapter.StringTypeAdapter;
import com.immomo.molive.foundation.util.safegson.factory.SafeArrayTypeAdapter;
import com.immomo.molive.foundation.util.safegson.factory.SafeCollectionTypeAdapterFactory;
import com.immomo.molive.foundation.util.safegson.factory.SafeMapTypeAdapterFactory;
import com.immomo.molive.foundation.util.safegson.factory.SafeReflectiveTypeAdapterFactory;
import com.immomo.molive.foundation.util.safegson.handler.SafeErrorHandleTypeAdapter;
import com.immomo.molive.foundation.util.safegson.handler.SafeErrorTypeAdapterFactory;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class iwd0 {

    /* JADX INFO: renamed from: a */
    private jwd0 f117263a;

    /* JADX INFO: renamed from: c */
    private HashMap<String, Boolean> f117265c = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private Gson f117264b = m142374d();

    public iwd0(jwd0 jwd0Var) {
        this.f117263a = jwd0Var;
    }

    /* JADX INFO: renamed from: a */
    private TypeAdapter m142371a(SafeErrorHandleTypeAdapter safeErrorHandleTypeAdapter, List<g5m> list) {
        list.add(safeErrorHandleTypeAdapter);
        return safeErrorHandleTypeAdapter;
    }

    /* JADX INFO: renamed from: b */
    private TypeAdapterFactory m142372b(SafeErrorTypeAdapterFactory safeErrorTypeAdapterFactory, List<g5m> list) {
        list.add(safeErrorTypeAdapterFactory);
        return safeErrorTypeAdapterFactory;
    }

    /* JADX INFO: renamed from: c */
    private void m142373c(List<g5m> list) {
        if (this.f117263a != null) {
            Iterator<g5m> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo19602a(this.f117263a.m147161a());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public Gson m142374d() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(new HashMap(0));
        ArrayList arrayList = new ArrayList();
        gsonBuilder.registerTypeAdapterFactory(TypeAdapters.newFactory(String.class, m142371a(new StringTypeAdapter(), arrayList))).registerTypeAdapterFactory(TypeAdapters.newFactory(Boolean.TYPE, Boolean.class, m142371a(new BooleanTypeAdapter(), arrayList))).registerTypeAdapterFactory(TypeAdapters.newFactory(Integer.TYPE, Integer.class, m142371a(new IntegerTypeAdapter(), arrayList))).registerTypeAdapterFactory(TypeAdapters.newFactory(Long.TYPE, Long.class, m142371a(new LongTypeAdapter(), arrayList))).registerTypeAdapterFactory(TypeAdapters.newFactory(Float.TYPE, Float.class, m142371a(new FloatTypeAdapter(), arrayList))).registerTypeAdapterFactory(TypeAdapters.newFactory(Double.TYPE, Double.class, m142371a(new DoubleTypeAdapter(), arrayList))).registerTypeAdapterFactory(TypeAdapters.newFactory(BigDecimal.class, m142371a(new BigDecimalTypeAdapter(), arrayList))).registerTypeAdapterFactory(m142372b(SafeArrayTypeAdapter.f13821f, arrayList)).registerTypeAdapterFactory(m142372b(new SafeCollectionTypeAdapterFactory(constructorConstructor), arrayList)).registerTypeAdapterFactory(m142372b(new SafeMapTypeAdapterFactory(constructorConstructor, false), arrayList)).registerTypeAdapterFactory(m142372b(new SafeReflectiveTypeAdapterFactory(constructorConstructor, FieldNamingPolicy.IDENTITY, Excluder.DEFAULT), arrayList));
        gsonBuilder.setDateFormat("MMM d, yyyy HH:mm:ss");
        gsonBuilder.serializeNulls();
        m142373c(arrayList);
        return gsonBuilder.create();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public <T> T m142375e(String str, Class<T> cls) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return cls.equals(String.class) ? str : (T) this.f117264b.fromJson(str, (Class) cls);
    }

    /* JADX INFO: renamed from: f */
    public String m142376f(Object obj) throws Exception {
        return this.f117264b.toJson(obj);
    }
}
