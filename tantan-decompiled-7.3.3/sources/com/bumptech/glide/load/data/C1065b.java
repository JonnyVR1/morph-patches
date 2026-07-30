package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import p153l.vn80;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.b */
/* JADX INFO: loaded from: classes.dex */
public class C1065b {

    /* JADX INFO: renamed from: b */
    private static final InterfaceC1064a.a<?> f4381b = new a();

    /* JADX INFO: renamed from: a */
    private final Map<Class<?>, InterfaceC1064a.a<?>> f4382a = new HashMap();

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.b$a */
    public class a implements InterfaceC1064a.a<Object> {
        @Override // com.bumptech.glide.load.data.InterfaceC1064a.a
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Object> mo5371a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1064a.a
        @NonNull
        /* JADX INFO: renamed from: b */
        public InterfaceC1064a<Object> mo5372b(@NonNull Object obj) {
            return new b(obj);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.b$b */
    public static final class b implements InterfaceC1064a<Object> {

        /* JADX INFO: renamed from: a */
        private final Object f4383a;

        public b(@NonNull Object obj) {
            this.f4383a = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1064a
        @NonNull
        /* JADX INFO: renamed from: a */
        public Object mo5369a() {
            return this.f4383a;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1064a
        public void cleanup() {
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public synchronized <T> InterfaceC1064a<T> m5374a(@NonNull T t) {
        InterfaceC1064a.a<?> aVar;
        try {
            vn80.m201944d(t);
            aVar = this.f4382a.get(t.getClass());
            if (aVar == null) {
                for (InterfaceC1064a.a<?> aVar2 : this.f4382a.values()) {
                    if (aVar2.mo5371a().isAssignableFrom(t.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f4381b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC1064a<T>) aVar.mo5372b(t);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m5375b(@NonNull InterfaceC1064a.a<?> aVar) {
        this.f4382a.put(aVar.mo5371a(), aVar);
    }
}
