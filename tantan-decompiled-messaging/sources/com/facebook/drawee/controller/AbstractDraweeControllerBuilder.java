package com.facebook.drawee.controller;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p149l.AbstractC17238h7;
import p149l.c5c;
import p149l.ei2;
import p149l.h5c;
import p149l.hce;
import p149l.o6j;
import p149l.p26;
import p149l.prm;
import p149l.q26;
import p149l.qgf0;
import p149l.qjj;
import p149l.rf80;
import p149l.s26;
import p149l.syg0;
import p149l.t050;
import p149l.vni;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDraweeControllerBuilder<BUILDER extends AbstractDraweeControllerBuilder<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements qgf0 {

    /* JADX INFO: renamed from: q */
    public static final q26<Object> f6294q = new C1595a();

    /* JADX INFO: renamed from: r */
    public static final NullPointerException f6295r = new NullPointerException("No image request was specified!");

    /* JADX INFO: renamed from: s */
    public static final AtomicLong f6296s = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public final Context f6297a;

    /* JADX INFO: renamed from: b */
    public final Set<q26> f6298b;

    /* JADX INFO: renamed from: c */
    public final Set<p26> f6299c;

    /* JADX INFO: renamed from: d */
    public Object f6300d;

    /* JADX INFO: renamed from: e */
    public REQUEST f6301e;

    /* JADX INFO: renamed from: f */
    public REQUEST f6302f;

    /* JADX INFO: renamed from: g */
    public REQUEST[] f6303g;

    /* JADX INFO: renamed from: h */
    public boolean f6304h;

    /* JADX INFO: renamed from: i */
    public syg0<c5c<IMAGE>> f6305i;

    /* JADX INFO: renamed from: j */
    public q26<? super INFO> f6306j;

    /* JADX INFO: renamed from: k */
    public boolean f6307k;

    /* JADX INFO: renamed from: l */
    public boolean f6308l;

    /* JADX INFO: renamed from: m */
    public boolean f6309m;

    /* JADX INFO: renamed from: n */
    public boolean f6310n = false;

    /* JADX INFO: renamed from: o */
    public String f6311o;

    /* JADX INFO: renamed from: p */
    public hce f6312p;

    public enum CacheLevel {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    /* JADX INFO: renamed from: com.facebook.drawee.controller.AbstractDraweeControllerBuilder$a */
    public class C1595a extends ei2<Object> {
        @Override // p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: e */
        public void mo8234e(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.drawee.controller.AbstractDraweeControllerBuilder$b */
    public class C1596b implements syg0<c5c<IMAGE>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ hce f6313a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f6314b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f6315c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Object f6316d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ CacheLevel f6317e;

        public C1596b(hce hceVar, String str, Object obj, Object obj2, CacheLevel cacheLevel) {
            this.f6313a = hceVar;
            this.f6314b = str;
            this.f6315c = obj;
            this.f6316d = obj2;
            this.f6317e = cacheLevel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.syg0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c5c<IMAGE> get() {
            return AbstractDraweeControllerBuilder.this.mo8216i(this.f6313a, this.f6314b, this.f6315c, this.f6316d, this.f6317e);
        }

        public String toString() {
            return t050.m186815b(this).m186817b(SocialConstants.TYPE_REQUEST, this.f6315c.toString()).toString();
        }
    }

    public AbstractDraweeControllerBuilder(Context context, Set<q26> set, Set<p26> set2) {
        this.f6297a = context;
        this.f6298b = set;
        this.f6299c = set2;
        m8226s();
    }

    /* JADX INFO: renamed from: e */
    public static String m8202e() {
        return String.valueOf(f6296s.getAndIncrement());
    }

    /* JADX INFO: renamed from: A */
    public BUILDER m8203A(Object obj) {
        this.f6300d = obj;
        return (BUILDER) m8225r();
    }

    /* JADX INFO: renamed from: B */
    public BUILDER m8204B(q26<? super INFO> q26Var) {
        this.f6306j = q26Var;
        return (BUILDER) m8225r();
    }

    /* JADX INFO: renamed from: C */
    public BUILDER m8205C(REQUEST request) {
        this.f6301e = request;
        return (BUILDER) m8225r();
    }

    /* JADX INFO: renamed from: D */
    public BUILDER m8206D(REQUEST request) {
        this.f6302f = request;
        return (BUILDER) m8225r();
    }

    @Override // p149l.qgf0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public BUILDER mo8210b(hce hceVar) {
        this.f6312p = hceVar;
        return (BUILDER) m8225r();
    }

    /* JADX INFO: renamed from: F */
    public BUILDER m8208F(boolean z) {
        this.f6309m = z;
        return (BUILDER) m8225r();
    }

    /* JADX INFO: renamed from: G */
    public void m8209G() {
        boolean z = true;
        rf80.m179119j(this.f6303g == null || this.f6301e == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f6305i != null && (this.f6303g != null || this.f6301e != null || this.f6302f != null)) {
            z = false;
        }
        rf80.m179119j(z, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    @Override // p149l.qgf0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC17238h7 build() {
        REQUEST request;
        m8209G();
        if (this.f6301e == null && this.f6303g == null && (request = this.f6302f) != null) {
            this.f6301e = request;
            this.f6302f = null;
        }
        return m8212d();
    }

    /* JADX INFO: renamed from: d */
    public AbstractC17238h7 m8212d() {
        if (o6j.m162852d()) {
            o6j.m162850a("AbstractDraweeControllerBuilder#buildController");
        }
        AbstractC17238h7 abstractC17238h7Mo8231x = mo8231x();
        abstractC17238h7Mo8231x.m129598c0(m8227t());
        abstractC17238h7Mo8231x.m129600d0(m8224q());
        abstractC17238h7Mo8231x.m129592Y(m8214g());
        m8215h();
        abstractC17238h7Mo8231x.m129595a0(null);
        m8230w(abstractC17238h7Mo8231x);
        m8228u(abstractC17238h7Mo8231x);
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
        return abstractC17238h7Mo8231x;
    }

    /* JADX INFO: renamed from: f */
    public Object m8213f() {
        return this.f6300d;
    }

    /* JADX INFO: renamed from: g */
    public String m8214g() {
        return this.f6311o;
    }

    /* JADX INFO: renamed from: h */
    public s26 m8215h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public abstract c5c<IMAGE> mo8216i(hce hceVar, String str, REQUEST request, Object obj, CacheLevel cacheLevel);

    /* JADX INFO: renamed from: j */
    public syg0<c5c<IMAGE>> m8217j(hce hceVar, String str, REQUEST request) {
        return m8218k(hceVar, str, request, CacheLevel.FULL_FETCH);
    }

    /* JADX INFO: renamed from: k */
    public syg0<c5c<IMAGE>> m8218k(hce hceVar, String str, REQUEST request, CacheLevel cacheLevel) {
        return new C1596b(hceVar, str, request, m8213f(), cacheLevel);
    }

    /* JADX INFO: renamed from: l */
    public syg0<c5c<IMAGE>> m8219l(hce hceVar, String str, REQUEST[] requestArr, boolean z) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z) {
            for (REQUEST request : requestArr) {
                arrayList.add(m8218k(hceVar, str, request, CacheLevel.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST request2 : requestArr) {
            arrayList.add(m8217j(hceVar, str, request2));
        }
        return vni.m199017b(arrayList);
    }

    /* JADX INFO: renamed from: m */
    public REQUEST[] m8220m() {
        return this.f6303g;
    }

    /* JADX INFO: renamed from: n */
    public REQUEST m8221n() {
        return this.f6301e;
    }

    /* JADX INFO: renamed from: o */
    public REQUEST m8222o() {
        return this.f6302f;
    }

    /* JADX INFO: renamed from: p */
    public hce m8223p() {
        return this.f6312p;
    }

    /* JADX INFO: renamed from: q */
    public boolean m8224q() {
        return this.f6309m;
    }

    /* JADX INFO: renamed from: r */
    public final BUILDER m8225r() {
        return this;
    }

    /* JADX INFO: renamed from: s */
    public final void m8226s() {
        this.f6300d = null;
        this.f6301e = null;
        this.f6302f = null;
        this.f6303g = null;
        this.f6304h = true;
        this.f6306j = null;
        this.f6307k = false;
        this.f6308l = false;
        this.f6310n = false;
        this.f6312p = null;
        this.f6311o = null;
    }

    /* JADX INFO: renamed from: t */
    public boolean m8227t() {
        return this.f6310n;
    }

    /* JADX INFO: renamed from: u */
    public void m8228u(AbstractC17238h7 abstractC17238h7) {
        Set<q26> set = this.f6298b;
        if (set != null) {
            Iterator<q26> it = set.iterator();
            while (it.hasNext()) {
                abstractC17238h7.m129606j(it.next());
            }
        }
        Set<p26> set2 = this.f6299c;
        if (set2 != null) {
            Iterator<p26> it2 = set2.iterator();
            while (it2.hasNext()) {
                abstractC17238h7.m129607k(it2.next());
            }
        }
        q26<? super INFO> q26Var = this.f6306j;
        if (q26Var != null) {
            abstractC17238h7.m129606j(q26Var);
        }
        if (this.f6308l) {
            abstractC17238h7.m129606j(f6294q);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m8229v(AbstractC17238h7 abstractC17238h7) {
        if (abstractC17238h7.m129613t() == null) {
            abstractC17238h7.m129597b0(qjj.m174995c(this.f6297a));
        }
    }

    /* JADX INFO: renamed from: w */
    public void m8230w(AbstractC17238h7 abstractC17238h7) {
        if (this.f6307k) {
            abstractC17238h7.m129616z().m123759d(this.f6307k);
            m8229v(abstractC17238h7);
        }
    }

    /* JADX INFO: renamed from: x */
    public abstract AbstractC17238h7 mo8231x();

    /* JADX INFO: renamed from: y */
    public syg0<c5c<IMAGE>> m8232y(hce hceVar, String str) {
        syg0<c5c<IMAGE>> syg0VarM8219l;
        syg0<c5c<IMAGE>> syg0Var = this.f6305i;
        if (syg0Var != null) {
            return syg0Var;
        }
        REQUEST request = this.f6301e;
        if (request != null) {
            syg0VarM8219l = m8217j(hceVar, str, request);
        } else {
            REQUEST[] requestArr = this.f6303g;
            syg0VarM8219l = requestArr != null ? m8219l(hceVar, str, requestArr, this.f6304h) : null;
        }
        if (syg0VarM8219l != null && this.f6302f != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(syg0VarM8219l);
            arrayList.add(m8217j(hceVar, str, this.f6302f));
            syg0VarM8219l = prm.m171025c(arrayList, false);
        }
        return syg0VarM8219l == null ? h5c.m129391a(f6295r) : syg0VarM8219l;
    }

    /* JADX INFO: renamed from: z */
    public BUILDER m8233z(boolean z) {
        this.f6308l = z;
        return (BUILDER) m8225r();
    }
}
