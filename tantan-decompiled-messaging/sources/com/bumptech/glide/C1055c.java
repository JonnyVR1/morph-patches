package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.C1071h;
import java.util.List;
import java.util.Map;
import p149l.h01;
import p149l.idl0;
import p149l.iuc0;
import p149l.jjj;
import p149l.muc0;
import p149l.w8j0;
import p149l.zim;

/* JADX INFO: renamed from: com.bumptech.glide.c */
/* JADX INFO: loaded from: classes.dex */
public class C1055c extends ContextWrapper {

    /* JADX INFO: renamed from: k */
    @VisibleForTesting
    static final w8j0<?, ?> f4357k = new jjj();

    /* JADX INFO: renamed from: a */
    private final h01 f4358a;

    /* JADX INFO: renamed from: b */
    private final Registry f4359b;

    /* JADX INFO: renamed from: c */
    private final zim f4360c;

    /* JADX INFO: renamed from: d */
    private final ComponentCallbacks2C1053a.a f4361d;

    /* JADX INFO: renamed from: e */
    private final List<iuc0<Object>> f4362e;

    /* JADX INFO: renamed from: f */
    private final Map<Class<?>, w8j0<?, ?>> f4363f;

    /* JADX INFO: renamed from: g */
    private final C1071h f4364g;

    /* JADX INFO: renamed from: h */
    private final boolean f4365h;

    /* JADX INFO: renamed from: i */
    private final int f4366i;

    /* JADX INFO: renamed from: j */
    @Nullable
    @GuardedBy("this")
    private muc0 f4367j;

    public C1055c(@NonNull Context context, @NonNull h01 h01Var, @NonNull Registry registry, @NonNull zim zimVar, @NonNull ComponentCallbacks2C1053a.a aVar, @NonNull Map<Class<?>, w8j0<?, ?>> map, @NonNull List<iuc0<Object>> list, @NonNull C1071h c1071h, boolean z, int i) {
        super(context.getApplicationContext());
        this.f4358a = h01Var;
        this.f4359b = registry;
        this.f4360c = zimVar;
        this.f4361d = aVar;
        this.f4362e = list;
        this.f4363f = map;
        this.f4364g = c1071h;
        this.f4365h = z;
        this.f4366i = i;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public <X> idl0<ImageView, X> m5333a(@NonNull ImageView imageView, @NonNull Class<X> cls) {
        return this.f4360c.m219049a(imageView, cls);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public h01 m5334b() {
        return this.f4358a;
    }

    /* JADX INFO: renamed from: c */
    public List<iuc0<Object>> m5335c() {
        return this.f4362e;
    }

    /* JADX INFO: renamed from: d */
    public synchronized muc0 m5336d() {
        try {
            if (this.f4367j == null) {
                this.f4367j = this.f4361d.build().m199409Q();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4367j;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public <T> w8j0<?, T> m5337e(@NonNull Class<T> cls) {
        w8j0<?, T> w8j0Var = (w8j0) this.f4363f.get(cls);
        if (w8j0Var == null) {
            for (Map.Entry<Class<?>, w8j0<?, ?>> entry : this.f4363f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    w8j0Var = (w8j0) entry.getValue();
                }
            }
        }
        return w8j0Var == null ? (w8j0<?, T>) f4357k : w8j0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public C1071h m5338f() {
        return this.f4364g;
    }

    /* JADX INFO: renamed from: g */
    public int m5339g() {
        return this.f4366i;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public Registry m5340h() {
        return this.f4359b;
    }

    /* JADX INFO: renamed from: i */
    public boolean m5341i() {
        return this.f4365h;
    }
}
