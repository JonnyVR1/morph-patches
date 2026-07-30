package com.bumptech.glide;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.C1081h;
import com.bumptech.glide.manager.C1121f;
import com.bumptech.glide.manager.C1128m;
import com.bumptech.glide.manager.InterfaceC1119d;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p153l.a4k;
import p153l.aij0;
import p153l.bhw;
import p153l.cqy;
import p153l.l01;
import p153l.l2d0;
import p153l.lpy;
import p153l.mzm;
import p153l.o01;
import p153l.p2d0;
import p153l.rgw;
import p153l.tgw;
import p153l.w23;
import p153l.x23;
import p153l.z3e;

/* JADX INFO: renamed from: com.bumptech.glide.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1058b {

    /* JADX INFO: renamed from: c */
    private C1081h f4339c;

    /* JADX INFO: renamed from: d */
    private w23 f4340d;

    /* JADX INFO: renamed from: e */
    private o01 f4341e;

    /* JADX INFO: renamed from: f */
    private lpy f4342f;

    /* JADX INFO: renamed from: g */
    private a4k f4343g;

    /* JADX INFO: renamed from: h */
    private a4k f4344h;

    /* JADX INFO: renamed from: i */
    private z3e.InterfaceC21755a f4345i;

    /* JADX INFO: renamed from: j */
    private cqy f4346j;

    /* JADX INFO: renamed from: k */
    private InterfaceC1119d f4347k;

    /* JADX INFO: renamed from: n */
    @Nullable
    private C1128m.b f4350n;

    /* JADX INFO: renamed from: o */
    private a4k f4351o;

    /* JADX INFO: renamed from: p */
    private boolean f4352p;

    /* JADX INFO: renamed from: q */
    @Nullable
    private List<l2d0<Object>> f4353q;

    /* JADX INFO: renamed from: a */
    private final Map<Class<?>, aij0<?, ?>> f4337a = new l01();

    /* JADX INFO: renamed from: b */
    private final C1060d.a f4338b = new C1060d.a();

    /* JADX INFO: renamed from: l */
    private int f4348l = 4;

    /* JADX INFO: renamed from: m */
    private ComponentCallbacks2C1057a.a f4349m = new a();

    /* JADX INFO: renamed from: com.bumptech.glide.b$a */
    public class a implements ComponentCallbacks2C1057a.a {
        public a() {
        }

        @Override // com.bumptech.glide.ComponentCallbacks2C1057a.a
        @NonNull
        public p2d0 build() {
            return new p2d0();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.b$b */
    public static final class b {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.b$c */
    public static final class c {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.b$d */
    public static final class d {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.b$e */
    public static final class e {
        private e() {
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public ComponentCallbacks2C1057a m5340a(@NonNull Context context) {
        if (this.f4343g == null) {
            this.f4343g = a4k.m95978v();
        }
        if (this.f4344h == null) {
            this.f4344h = a4k.m95976t();
        }
        if (this.f4351o == null) {
            this.f4351o = a4k.m95974n();
        }
        if (this.f4346j == null) {
            this.f4346j = new cqy.C16338a(context).m112007a();
        }
        if (this.f4347k == null) {
            this.f4347k = new C1121f();
        }
        if (this.f4340d == null) {
            int iM112005b = this.f4346j.m112005b();
            if (iM112005b > 0) {
                this.f4340d = new tgw(iM112005b);
            } else {
                this.f4340d = new x23();
            }
        }
        if (this.f4341e == null) {
            this.f4341e = new rgw(this.f4346j.m112004a());
        }
        if (this.f4342f == null) {
            this.f4342f = new bhw(this.f4346j.m112006d());
        }
        if (this.f4345i == null) {
            this.f4345i = new mzm(context);
        }
        if (this.f4339c == null) {
            this.f4339c = new C1081h(this.f4342f, this.f4345i, this.f4344h, this.f4343g, a4k.m95971F(), this.f4351o, this.f4352p);
        }
        List<l2d0<Object>> list = this.f4353q;
        if (list == null) {
            this.f4353q = Collections.EMPTY_LIST;
        } else {
            this.f4353q = Collections.unmodifiableList(list);
        }
        C1060d c1060dM5353b = this.f4338b.m5353b();
        return new ComponentCallbacks2C1057a(context, this.f4339c, this.f4342f, this.f4340d, this.f4341e, new C1128m(this.f4350n, c1060dM5353b), this.f4347k, this.f4348l, this.f4349m, this.f4337a, this.f4353q, c1060dM5353b);
    }

    /* JADX INFO: renamed from: b */
    public void m5341b(@Nullable C1128m.b bVar) {
        this.f4350n = bVar;
    }
}
