package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.C1081h;
import java.util.List;
import java.util.Map;
import p153l.aij0;
import p153l.clm;
import p153l.cmj;
import p153l.l2d0;
import p153l.mml0;
import p153l.o01;
import p153l.p2d0;

/* JADX INFO: renamed from: com.bumptech.glide.c */
/* JADX INFO: loaded from: classes.dex */
public class C1059c extends ContextWrapper {

    /* JADX INFO: renamed from: k */
    @VisibleForTesting
    static final aij0<?, ?> f4355k = new cmj();

    /* JADX INFO: renamed from: a */
    private final o01 f4356a;

    /* JADX INFO: renamed from: b */
    private final Registry f4357b;

    /* JADX INFO: renamed from: c */
    private final clm f4358c;

    /* JADX INFO: renamed from: d */
    private final ComponentCallbacks2C1057a.a f4359d;

    /* JADX INFO: renamed from: e */
    private final List<l2d0<Object>> f4360e;

    /* JADX INFO: renamed from: f */
    private final Map<Class<?>, aij0<?, ?>> f4361f;

    /* JADX INFO: renamed from: g */
    private final C1081h f4362g;

    /* JADX INFO: renamed from: h */
    private final C1060d f4363h;

    /* JADX INFO: renamed from: i */
    private final int f4364i;

    /* JADX INFO: renamed from: j */
    @Nullable
    @GuardedBy("this")
    private p2d0 f4365j;

    public C1059c(@NonNull Context context, @NonNull o01 o01Var, @NonNull Registry registry, @NonNull clm clmVar, @NonNull ComponentCallbacks2C1057a.a aVar, @NonNull Map<Class<?>, aij0<?, ?>> map, @NonNull List<l2d0<Object>> list, @NonNull C1081h c1081h, @NonNull C1060d c1060d, int i) {
        super(context.getApplicationContext());
        this.f4356a = o01Var;
        this.f4357b = registry;
        this.f4358c = clmVar;
        this.f4359d = aVar;
        this.f4360e = list;
        this.f4361f = map;
        this.f4362g = c1081h;
        this.f4363h = c1060d;
        this.f4364i = i;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public <X> mml0<ImageView, X> m5342a(@NonNull ImageView imageView, @NonNull Class<X> cls) {
        return this.f4358c.m110669a(imageView, cls);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public o01 m5343b() {
        return this.f4356a;
    }

    /* JADX INFO: renamed from: c */
    public List<l2d0<Object>> m5344c() {
        return this.f4360e;
    }

    /* JADX INFO: renamed from: d */
    public synchronized p2d0 m5345d() {
        try {
            if (this.f4365j == null) {
                this.f4365j = this.f4359d.build().m155538R();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4365j;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public <T> aij0<?, T> m5346e(@NonNull Class<T> cls) {
        aij0<?, T> aij0Var = (aij0) this.f4361f.get(cls);
        if (aij0Var == null) {
            for (Map.Entry<Class<?>, aij0<?, ?>> entry : this.f4361f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    aij0Var = (aij0) entry.getValue();
                }
            }
        }
        return aij0Var == null ? (aij0<?, T>) f4355k : aij0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public C1081h m5347f() {
        return this.f4362g;
    }

    /* JADX INFO: renamed from: g */
    public C1060d m5348g() {
        return this.f4363h;
    }

    /* JADX INFO: renamed from: h */
    public int m5349h() {
        return this.f4364i;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public Registry m5350i() {
        return this.f4357b;
    }
}
