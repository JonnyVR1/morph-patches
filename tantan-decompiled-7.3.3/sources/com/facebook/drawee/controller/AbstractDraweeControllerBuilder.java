package com.facebook.drawee.controller;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p153l.AbstractC16203c7;
import p153l.a7h0;
import p153l.i6c;
import p153l.i950;
import p153l.i9j;
import p153l.jmj;
import p153l.lde;
import p153l.li2;
import p153l.n6c;
import p153l.rqi;
import p153l.rtm;
import p153l.u36;
import p153l.v36;
import p153l.wn80;
import p153l.x36;
import p153l.xof0;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDraweeControllerBuilder<BUILDER extends AbstractDraweeControllerBuilder<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements xof0 {

    /* JADX INFO: renamed from: q */
    public static final v36<Object> f6331q = new C1618a();

    /* JADX INFO: renamed from: r */
    public static final NullPointerException f6332r = new NullPointerException("No image request was specified!");

    /* JADX INFO: renamed from: s */
    public static final AtomicLong f6333s = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public final Context f6334a;

    /* JADX INFO: renamed from: b */
    public final Set<v36> f6335b;

    /* JADX INFO: renamed from: c */
    public final Set<u36> f6336c;

    /* JADX INFO: renamed from: d */
    public Object f6337d;

    /* JADX INFO: renamed from: e */
    public REQUEST f6338e;

    /* JADX INFO: renamed from: f */
    public REQUEST f6339f;

    /* JADX INFO: renamed from: g */
    public REQUEST[] f6340g;

    /* JADX INFO: renamed from: h */
    public boolean f6341h;

    /* JADX INFO: renamed from: i */
    public a7h0<i6c<IMAGE>> f6342i;

    /* JADX INFO: renamed from: j */
    public v36<? super INFO> f6343j;

    /* JADX INFO: renamed from: k */
    public boolean f6344k;

    /* JADX INFO: renamed from: l */
    public boolean f6345l;

    /* JADX INFO: renamed from: m */
    public boolean f6346m;

    /* JADX INFO: renamed from: n */
    public boolean f6347n = false;

    /* JADX INFO: renamed from: o */
    public String f6348o;

    /* JADX INFO: renamed from: p */
    public lde f6349p;

    public enum CacheLevel {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    /* JADX INFO: renamed from: com.facebook.drawee.controller.AbstractDraweeControllerBuilder$a */
    public class C1618a extends li2<Object> {
        @Override // p153l.li2, p153l.v36
        /* JADX INFO: renamed from: e */
        public void mo8288e(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.drawee.controller.AbstractDraweeControllerBuilder$b */
    public class C1619b implements a7h0<i6c<IMAGE>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ lde f6350a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f6351b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f6352c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Object f6353d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ CacheLevel f6354e;

        public C1619b(lde ldeVar, String str, Object obj, Object obj2, CacheLevel cacheLevel) {
            this.f6350a = ldeVar;
            this.f6351b = str;
            this.f6352c = obj;
            this.f6353d = obj2;
            this.f6354e = cacheLevel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.a7h0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i6c<IMAGE> get() {
            return AbstractDraweeControllerBuilder.this.mo8270i(this.f6350a, this.f6351b, this.f6352c, this.f6353d, this.f6354e);
        }

        public String toString() {
            return i950.m139075b(this).m139077b(SocialConstants.TYPE_REQUEST, this.f6352c.toString()).toString();
        }
    }

    public AbstractDraweeControllerBuilder(Context context, Set<v36> set, Set<u36> set2) {
        this.f6334a = context;
        this.f6335b = set;
        this.f6336c = set2;
        m8280s();
    }

    /* JADX INFO: renamed from: e */
    public static String m8256e() {
        return String.valueOf(f6333s.getAndIncrement());
    }

    /* JADX INFO: renamed from: A */
    public BUILDER m8257A(Object obj) {
        this.f6337d = obj;
        return (BUILDER) m8279r();
    }

    /* JADX INFO: renamed from: B */
    public BUILDER m8258B(v36<? super INFO> v36Var) {
        this.f6343j = v36Var;
        return (BUILDER) m8279r();
    }

    /* JADX INFO: renamed from: C */
    public BUILDER m8259C(REQUEST request) {
        this.f6338e = request;
        return (BUILDER) m8279r();
    }

    /* JADX INFO: renamed from: D */
    public BUILDER m8260D(REQUEST request) {
        this.f6339f = request;
        return (BUILDER) m8279r();
    }

    @Override // p153l.xof0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public BUILDER mo8264b(lde ldeVar) {
        this.f6349p = ldeVar;
        return (BUILDER) m8279r();
    }

    /* JADX INFO: renamed from: F */
    public BUILDER m8262F(boolean z) {
        this.f6346m = z;
        return (BUILDER) m8279r();
    }

    /* JADX INFO: renamed from: G */
    public void m8263G() {
        boolean z = true;
        wn80.m207185j(this.f6340g == null || this.f6338e == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f6342i != null && (this.f6340g != null || this.f6338e != null || this.f6339f != null)) {
            z = false;
        }
        wn80.m207185j(z, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    @Override // p153l.xof0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC16203c7 build() {
        REQUEST request;
        m8263G();
        if (this.f6338e == null && this.f6340g == null && (request = this.f6339f) != null) {
            this.f6338e = request;
            this.f6339f = null;
        }
        return m8266d();
    }

    /* JADX INFO: renamed from: d */
    public AbstractC16203c7 m8266d() {
        if (i9j.m139099d()) {
            i9j.m139097a("AbstractDraweeControllerBuilder#buildController");
        }
        AbstractC16203c7 abstractC16203c7Mo8285x = mo8285x();
        abstractC16203c7Mo8285x.m108235c0(m8281t());
        abstractC16203c7Mo8285x.m108237d0(m8278q());
        abstractC16203c7Mo8285x.m108228Y(m8268g());
        m8269h();
        abstractC16203c7Mo8285x.m108231a0(null);
        m8284w(abstractC16203c7Mo8285x);
        m8282u(abstractC16203c7Mo8285x);
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
        return abstractC16203c7Mo8285x;
    }

    /* JADX INFO: renamed from: f */
    public Object m8267f() {
        return this.f6337d;
    }

    /* JADX INFO: renamed from: g */
    public String m8268g() {
        return this.f6348o;
    }

    /* JADX INFO: renamed from: h */
    public x36 m8269h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public abstract i6c<IMAGE> mo8270i(lde ldeVar, String str, REQUEST request, Object obj, CacheLevel cacheLevel);

    /* JADX INFO: renamed from: j */
    public a7h0<i6c<IMAGE>> m8271j(lde ldeVar, String str, REQUEST request) {
        return m8272k(ldeVar, str, request, CacheLevel.FULL_FETCH);
    }

    /* JADX INFO: renamed from: k */
    public a7h0<i6c<IMAGE>> m8272k(lde ldeVar, String str, REQUEST request, CacheLevel cacheLevel) {
        return new C1619b(ldeVar, str, request, m8267f(), cacheLevel);
    }

    /* JADX INFO: renamed from: l */
    public a7h0<i6c<IMAGE>> m8273l(lde ldeVar, String str, REQUEST[] requestArr, boolean z) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z) {
            for (REQUEST request : requestArr) {
                arrayList.add(m8272k(ldeVar, str, request, CacheLevel.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST request2 : requestArr) {
            arrayList.add(m8271j(ldeVar, str, request2));
        }
        return rqi.m182625b(arrayList);
    }

    /* JADX INFO: renamed from: m */
    public REQUEST[] m8274m() {
        return this.f6340g;
    }

    /* JADX INFO: renamed from: n */
    public REQUEST m8275n() {
        return this.f6338e;
    }

    /* JADX INFO: renamed from: o */
    public REQUEST m8276o() {
        return this.f6339f;
    }

    /* JADX INFO: renamed from: p */
    public lde m8277p() {
        return this.f6349p;
    }

    /* JADX INFO: renamed from: q */
    public boolean m8278q() {
        return this.f6346m;
    }

    /* JADX INFO: renamed from: r */
    public final BUILDER m8279r() {
        return this;
    }

    /* JADX INFO: renamed from: s */
    public final void m8280s() {
        this.f6337d = null;
        this.f6338e = null;
        this.f6339f = null;
        this.f6340g = null;
        this.f6341h = true;
        this.f6343j = null;
        this.f6344k = false;
        this.f6345l = false;
        this.f6347n = false;
        this.f6349p = null;
        this.f6348o = null;
    }

    /* JADX INFO: renamed from: t */
    public boolean m8281t() {
        return this.f6347n;
    }

    /* JADX INFO: renamed from: u */
    public void m8282u(AbstractC16203c7 abstractC16203c7) {
        Set<v36> set = this.f6335b;
        if (set != null) {
            Iterator<v36> it = set.iterator();
            while (it.hasNext()) {
                abstractC16203c7.m108243j(it.next());
            }
        }
        Set<u36> set2 = this.f6336c;
        if (set2 != null) {
            Iterator<u36> it2 = set2.iterator();
            while (it2.hasNext()) {
                abstractC16203c7.m108244k(it2.next());
            }
        }
        v36<? super INFO> v36Var = this.f6343j;
        if (v36Var != null) {
            abstractC16203c7.m108243j(v36Var);
        }
        if (this.f6345l) {
            abstractC16203c7.m108243j(f6331q);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m8283v(AbstractC16203c7 abstractC16203c7) {
        if (abstractC16203c7.m108253t() == null) {
            abstractC16203c7.m108233b0(jmj.m146159c(this.f6334a));
        }
    }

    /* JADX INFO: renamed from: w */
    public void m8284w(AbstractC16203c7 abstractC16203c7) {
        if (this.f6344k) {
            abstractC16203c7.m108259z().m138807d(this.f6344k);
            m8283v(abstractC16203c7);
        }
    }

    /* JADX INFO: renamed from: x */
    public abstract AbstractC16203c7 mo8285x();

    /* JADX INFO: renamed from: y */
    public a7h0<i6c<IMAGE>> m8286y(lde ldeVar, String str) {
        a7h0<i6c<IMAGE>> a7h0VarM8273l;
        a7h0<i6c<IMAGE>> a7h0Var = this.f6342i;
        if (a7h0Var != null) {
            return a7h0Var;
        }
        REQUEST request = this.f6338e;
        if (request != null) {
            a7h0VarM8273l = m8271j(ldeVar, str, request);
        } else {
            REQUEST[] requestArr = this.f6340g;
            a7h0VarM8273l = requestArr != null ? m8273l(ldeVar, str, requestArr, this.f6341h) : null;
        }
        if (a7h0VarM8273l != null && this.f6339f != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(a7h0VarM8273l);
            arrayList.add(m8271j(ldeVar, str, this.f6339f));
            a7h0VarM8273l = rtm.m183126c(arrayList, false);
        }
        return a7h0VarM8273l == null ? n6c.m161758a(f6332r) : a7h0VarM8273l;
    }

    /* JADX INFO: renamed from: z */
    public BUILDER m8287z(boolean z) {
        this.f6345l = z;
        return (BUILDER) m8279r();
    }
}
