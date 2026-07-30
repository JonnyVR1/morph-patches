package p149l;

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
public class god0 {

    /* JADX INFO: renamed from: a */
    private hod0 f103671a;

    /* JADX INFO: renamed from: c */
    private HashMap<String, Boolean> f103673c = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private Gson f103672b = m127236d();

    public god0(hod0 hod0Var) {
        this.f103671a = hod0Var;
    }

    /* JADX INFO: renamed from: a */
    private TypeAdapter m127233a(SafeErrorHandleTypeAdapter safeErrorHandleTypeAdapter, List<n2m> list) {
        list.add(safeErrorHandleTypeAdapter);
        return safeErrorHandleTypeAdapter;
    }

    /* JADX INFO: renamed from: b */
    private TypeAdapterFactory m127234b(SafeErrorTypeAdapterFactory safeErrorTypeAdapterFactory, List<n2m> list) {
        list.add(safeErrorTypeAdapterFactory);
        return safeErrorTypeAdapterFactory;
    }

    /* JADX INFO: renamed from: c */
    private void m127235c(List<n2m> list) {
        if (this.f103671a != null) {
            Iterator<n2m> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo18622a(this.f103671a.m132220a());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public Gson m127236d() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(new HashMap(0));
        ArrayList arrayList = new ArrayList();
        gsonBuilder.registerTypeAdapterFactory(TypeAdapters.newFactory(String.class, m127233a(new StringTypeAdapter(), arrayList))).registerTypeAdapterFactory(TypeAdapters.newFactory(Boolean.TYPE, Boolean.class, m127233a(new BooleanTypeAdapter(), arrayList))).registerTypeAdapterFactory(TypeAdapters.newFactory(Integer.TYPE, Integer.class, m127233a(new IntegerTypeAdapter(), arrayList))).registerTypeAdapterFactory(TypeAdapters.newFactory(Long.TYPE, Long.class, m127233a(new LongTypeAdapter(), arrayList))).registerTypeAdapterFactory(TypeAdapters.newFactory(Float.TYPE, Float.class, m127233a(new FloatTypeAdapter(), arrayList))).registerTypeAdapterFactory(TypeAdapters.newFactory(Double.TYPE, Double.class, m127233a(new DoubleTypeAdapter(), arrayList))).registerTypeAdapterFactory(TypeAdapters.newFactory(BigDecimal.class, m127233a(new BigDecimalTypeAdapter(), arrayList))).registerTypeAdapterFactory(m127234b(SafeArrayTypeAdapter.f13127f, arrayList)).registerTypeAdapterFactory(m127234b(new SafeCollectionTypeAdapterFactory(constructorConstructor), arrayList)).registerTypeAdapterFactory(m127234b(new SafeMapTypeAdapterFactory(constructorConstructor, false), arrayList)).registerTypeAdapterFactory(m127234b(new SafeReflectiveTypeAdapterFactory(constructorConstructor, FieldNamingPolicy.IDENTITY, Excluder.DEFAULT), arrayList));
        gsonBuilder.setDateFormat("MMM d, yyyy HH:mm:ss");
        gsonBuilder.serializeNulls();
        m127235c(arrayList);
        return gsonBuilder.create();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public <T> T m127237e(String str, Class<T> cls) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return cls.equals(String.class) ? str : (T) this.f103672b.fromJson(str, (Class) cls);
    }

    /* JADX INFO: renamed from: f */
    public String m127238f(Object obj) throws Exception {
        return this.f103672b.toJson(obj);
    }
}
