package com.p051p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.fo0;
import p153l.jyb;
import p153l.kcg0;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.tzi0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.c0 */
/* JADX INFO: loaded from: classes9.dex */
public class RunnableC4884c0 implements Runnable {

    /* JADX INFO: renamed from: d */
    public kcg0 f20450d;

    /* JADX INFO: renamed from: a */
    public AtomicInteger f20447a = new AtomicInteger();

    /* JADX INFO: renamed from: b */
    public AtomicBoolean f20448b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public ConcurrentHashMap<String, d> f20449c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e */
    public C22508b<b> f20451e = C22508b.m222767b();

    /* JADX INFO: renamed from: f */
    public SimpleDateFormat f20452f = new SimpleDateFormat("HH:mm");

    /* JADX INFO: renamed from: g */
    public SimpleDateFormat f20453g = new SimpleDateFormat("mm:ss");

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.c0$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f20454a;

        /* JADX INFO: renamed from: b */
        public c f20455b;

        /* JADX INFO: renamed from: c */
        public long f20456c = -1;

        /* JADX INFO: renamed from: d */
        public long f20457d = -1;

        /* JADX INFO: renamed from: e */
        public boolean f20458e = false;

        /* JADX INFO: renamed from: f */
        public boolean f20459f = false;

        /* JADX INFO: renamed from: g */
        public long f20460g = 1;

        /* JADX INFO: renamed from: h */
        public boolean f20461h = true;

        /* JADX INFO: renamed from: i */
        public long f20462i = 60;

        /* JADX INFO: renamed from: a */
        public a m32520a(boolean z) {
            this.f20458e = z;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m32521b(boolean z) {
            this.f20461h = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m32522c(long j) {
            this.f20457d = j;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m32523d(c cVar) {
            this.f20455b = cVar;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m32524e(boolean z) {
            this.f20459f = z;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m32525f(long j) {
            this.f20456c = j;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m32526g(String str) {
            this.f20454a = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public a m32527h(long j) {
            this.f20460g = j;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a m32528i(long j) {
            this.f20462i = j;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.c0$b */
    public static class b {

        /* JADX INFO: renamed from: b */
        public String f20464b;

        /* JADX INFO: renamed from: c */
        public long f20465c;

        /* JADX INFO: renamed from: f */
        public long f20468f;

        /* JADX INFO: renamed from: a */
        public boolean f20463a = false;

        /* JADX INFO: renamed from: d */
        public long f20466d = -1;

        /* JADX INFO: renamed from: e */
        public long f20467e = -1;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.c0$c */
    public interface c {
        /* JADX INFO: renamed from: M0 */
        default void mo32529M0(String str) {
        }

        /* JADX INFO: renamed from: u */
        default void mo32530u(String str, long j, long j2, long j3, long j4) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.c0$d */
    public class d {

        /* JADX INFO: renamed from: a */
        public String f20469a;

        /* JADX INFO: renamed from: b */
        public boolean f20470b;

        /* JADX INFO: renamed from: c */
        public WeakReference<c> f20471c;

        /* JADX INFO: renamed from: d */
        public long f20472d;

        /* JADX INFO: renamed from: e */
        public long f20473e;

        /* JADX INFO: renamed from: f */
        public long f20474f;

        /* JADX INFO: renamed from: g */
        public boolean f20475g;

        /* JADX INFO: renamed from: h */
        public long f20476h;

        /* JADX INFO: renamed from: i */
        public long f20477i;

        /* JADX INFO: renamed from: j */
        public long f20478j;

        /* JADX INFO: renamed from: k */
        public boolean f20479k;

        public d() {
            this.f20470b = false;
            this.f20473e = -1L;
            this.f20474f = -1L;
            this.f20475g = false;
            this.f20476h = 1L;
            this.f20477i = -1L;
            this.f20478j = 60L;
            this.f20479k = true;
        }

        /* JADX INFO: renamed from: a */
        public b m32531a(boolean z, long j) {
            b bVar = new b();
            bVar.f20464b = this.f20469a;
            bVar.f20466d = this.f20473e;
            bVar.f20467e = this.f20474f;
            bVar.f20465c = this.f20472d;
            bVar.f20463a = z;
            bVar.f20468f = j;
            return bVar;
        }

        /* JADX INFO: renamed from: b */
        public void m32532b(a aVar) {
            this.f20469a = aVar.f20454a;
            this.f20471c = new WeakReference<>(aVar.f20455b);
            this.f20473e = aVar.f20456c;
            this.f20472d = pzi0.m174454o();
            this.f20474f = aVar.f20457d;
            this.f20475g = aVar.f20458e;
            this.f20470b = aVar.f20459f;
            this.f20476h = aVar.f20460g * 1000;
            this.f20478j = aVar.f20462i * 1000;
            this.f20479k = aVar.f20461h;
        }
    }

    public RunnableC4884c0() {
        this.f20452f.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.f20453g.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m32500b(Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public static String m32505l(long j) {
        List<String> listM193663a = tzi0.m193663a(j);
        return listM193663a.get(1) + ":" + listM193663a.get(2);
    }

    /* JADX INFO: renamed from: g */
    public final void m32506g() {
        if (this.f20448b.get()) {
            return;
        }
        psd0.m173633z(this.f20450d);
        this.f20450d = C22421c.interval(500L, 1000L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(new y20() { // from class: l.abb
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69219a.m32515q((Long) obj);
            }
        }, new y20() { // from class: l.bbb
            @Override // p153l.y20
            public final void call(Object obj) {
                RunnableC4884c0.m32500b((Throwable) obj);
            }
        });
        this.f20448b.set(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m32507h() {
        if (this.f20449c.isEmpty()) {
            this.f20448b.set(false);
            psd0.m173633z(this.f20450d);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m32508i() {
        Iterator<Map.Entry<String, d>> it = this.f20449c.entrySet().iterator();
        while (it.hasNext()) {
            d value = it.next().getValue();
            if (value.f20471c.get() == null && !value.f20470b) {
                it.remove();
            }
        }
        m32507h();
    }

    /* JADX INFO: renamed from: j */
    public final void m32509j() {
    }

    /* JADX INFO: renamed from: k */
    public String m32510k(long j) {
        List<String> listM193663a = tzi0.m193663a(j);
        return listM193663a.get(0) + ":" + listM193663a.get(1) + ":" + listM193663a.get(2);
    }

    /* JADX INFO: renamed from: m */
    public C22421c<b> m32511m(final String str) {
        return this.f20451e.filter(new qcj() { // from class: l.fbb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                RunnableC4884c0.b bVar = (RunnableC4884c0.b) obj;
                return Boolean.valueOf(TextUtils.equals(bVar.f20464b, str) && bVar.f20463a);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public C22421c<b> m32512n(final String str) {
        return this.f20451e.filter(new qcj() { // from class: l.cbb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((RunnableC4884c0.b) obj).f20464b, str));
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public C22421c<b> m32513o(final List<String> list) {
        return this.f20451e.filter(new qcj() { // from class: l.dbb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(jyb.m147520m(list, new qcj() { // from class: l.ebb
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals(bVar.f20464b, (String) obj2));
                    }
                }));
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public boolean m32514p(String str) {
        return this.f20449c.containsKey(str);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m32515q(Long l2) {
        run();
    }

    /* JADX INFO: renamed from: r */
    public String m32516r(a aVar) {
        m32509j();
        String str = aVar.f20454a;
        if (TextUtils.isEmpty(str)) {
            str = "TIMER_AUTO_NAME_" + this.f20447a.incrementAndGet();
        }
        if (this.f20449c.containsKey(str)) {
            this.f20449c.remove(str);
        }
        d dVar = new d();
        dVar.m32532b(aVar);
        this.f20449c.put(str, dVar);
        m32506g();
        return str;
    }

    @Override // java.lang.Runnable
    public void run() {
        m32508i();
        if (this.f20449c.isEmpty()) {
            m32507h();
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        Iterator<Map.Entry<String, d>> it = this.f20449c.entrySet().iterator();
        long jM174454o = pzi0.m174454o();
        while (it.hasNext()) {
            d value = it.next().getValue();
            boolean z = value.f20476h == 1000;
            if (NullChecker.m82486a(value.f20471c.get())) {
                long j = value.f20476h;
                if (j > 1000) {
                    long j2 = 500 + jM174454o;
                    long j3 = value.f20477i;
                    if (j2 > j3) {
                        if (j3 == -1) {
                            long j4 = value.f20473e;
                            if (j4 > jM174454o) {
                                long j5 = (j4 - jM174454o) / j;
                                if (j5 > 0) {
                                    value.f20477i = j4 - (j * j5);
                                }
                            }
                        } else {
                            value.f20477i = j + jM174454o;
                        }
                        z = true;
                    }
                }
                boolean z2 = (value.f20473e - jM174454o >= value.f20478j || !value.f20479k) ? z : true;
                if (z2) {
                    value.f20471c.get().mo32529M0(value.f20469a);
                    value.f20471c.get().mo32530u(value.f20469a, jM174454o, value.f20474f, value.f20473e, value.f20472d);
                }
                z = z2;
            }
            if (z) {
                this.f20451e.onNext(value.m32531a(false, jM174454o));
            }
            if (value.f20475g) {
                long j6 = value.f20473e;
                if (jM174454o > j6 && j6 > 0) {
                    arrayList.add(value.f20469a);
                }
            }
        }
        if (jyb.m147479J(arrayList)) {
            return;
        }
        for (String str : arrayList) {
            if (this.f20449c.containsKey(str)) {
                d dVar = this.f20449c.get(str);
                if (NullChecker.m82486a(dVar)) {
                    this.f20451e.onNext(dVar.m32531a(true, jM174454o));
                }
            }
            this.f20449c.remove(str);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m32517s() {
        this.f20449c.clear();
        psd0.m173633z(this.f20450d);
    }

    /* JADX INFO: renamed from: t */
    public void m32518t(c cVar) {
        m32509j();
        ArrayList<String> arrayList = new ArrayList();
        for (Map.Entry<String, d> entry : this.f20449c.entrySet()) {
            d value = entry.getValue();
            if (NullChecker.m82486a(value.f20471c.get()) && value.f20471c.get() == cVar) {
                arrayList.add(entry.getKey());
            }
        }
        if (jyb.m147479J(arrayList)) {
            return;
        }
        for (String str : arrayList) {
            if (!TextUtils.isEmpty(str)) {
                m32519u(str);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m32519u(String str) {
        m32509j();
        if (this.f20449c.containsKey(str)) {
            this.f20449c.remove(str);
            m32507h();
        }
    }
}
