package com.android.volley;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.android.volley.d */
/* JADX INFO: loaded from: classes.dex */
public class C0922d<T> {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final T f4166a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final InterfaceC0919a.a f4167b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final VolleyError f4168c;

    /* JADX INFO: renamed from: d */
    public boolean f4169d;

    /* JADX INFO: renamed from: com.android.volley.d$a */
    public interface a {
        void onErrorResponse(VolleyError volleyError);
    }

    /* JADX INFO: renamed from: com.android.volley.d$b */
    public interface b<T> {
        void onResponse(T t);
    }

    private C0922d(@Nullable T t, @Nullable InterfaceC0919a.a aVar) {
        this.f4169d = false;
        this.f4166a = t;
        this.f4167b = aVar;
        this.f4168c = null;
    }

    /* JADX INFO: renamed from: a */
    public static <T> C0922d<T> m5105a(VolleyError volleyError) {
        return new C0922d<>(volleyError);
    }

    /* JADX INFO: renamed from: c */
    public static <T> C0922d<T> m5106c(@Nullable T t, @Nullable InterfaceC0919a.a aVar) {
        return new C0922d<>(t, aVar);
    }

    /* JADX INFO: renamed from: b */
    public boolean m5107b() {
        return this.f4168c == null;
    }

    private C0922d(VolleyError volleyError) {
        this.f4169d = false;
        this.f4166a = null;
        this.f4167b = null;
        this.f4168c = volleyError;
    }
}
