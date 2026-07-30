package com.p046p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
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
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.c4g0;
import p149l.e30;
import p149l.jo0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.qqi0;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.c0 */
/* JADX INFO: loaded from: classes9.dex */
public class RunnableC4733c0 implements Runnable {

    /* JADX INFO: renamed from: d */
    public c4g0 f19708d;

    /* JADX INFO: renamed from: a */
    public AtomicInteger f19705a = new AtomicInteger();

    /* JADX INFO: renamed from: b */
    public AtomicBoolean f19706b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public ConcurrentHashMap<String, d> f19707c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e */
    public C22393b<b> f19709e = C22393b.m221521b();

    /* JADX INFO: renamed from: f */
    public SimpleDateFormat f19710f = new SimpleDateFormat("HH:mm");

    /* JADX INFO: renamed from: g */
    public SimpleDateFormat f19711g = new SimpleDateFormat("mm:ss");

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.c0$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f19712a;

        /* JADX INFO: renamed from: b */
        public c f19713b;

        /* JADX INFO: renamed from: c */
        public long f19714c = -1;

        /* JADX INFO: renamed from: d */
        public long f19715d = -1;

        /* JADX INFO: renamed from: e */
        public boolean f19716e = false;

        /* JADX INFO: renamed from: f */
        public boolean f19717f = false;

        /* JADX INFO: renamed from: g */
        public long f19718g = 1;

        /* JADX INFO: renamed from: h */
        public boolean f19719h = true;

        /* JADX INFO: renamed from: i */
        public long f19720i = 60;

        /* JADX INFO: renamed from: a */
        public a m31517a(boolean z) {
            this.f19716e = z;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m31518b(boolean z) {
            this.f19719h = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m31519c(long j) {
            this.f19715d = j;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m31520d(c cVar) {
            this.f19713b = cVar;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m31521e(boolean z) {
            this.f19717f = z;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m31522f(long j) {
            this.f19714c = j;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m31523g(String str) {
            this.f19712a = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public a m31524h(long j) {
            this.f19718g = j;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a m31525i(long j) {
            this.f19720i = j;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.c0$b */
    public static class b {

        /* JADX INFO: renamed from: b */
        public String f19722b;

        /* JADX INFO: renamed from: c */
        public long f19723c;

        /* JADX INFO: renamed from: f */
        public long f19726f;

        /* JADX INFO: renamed from: a */
        public boolean f19721a = false;

        /* JADX INFO: renamed from: d */
        public long f19724d = -1;

        /* JADX INFO: renamed from: e */
        public long f19725e = -1;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.c0$c */
    public interface c {
        /* JADX INFO: renamed from: M0 */
        default void mo31526M0(String str) {
        }

        /* JADX INFO: renamed from: u */
        default void mo31527u(String str, long j, long j2, long j3, long j4) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.c0$d */
    public class d {

        /* JADX INFO: renamed from: a */
        public String f19727a;

        /* JADX INFO: renamed from: b */
        public boolean f19728b;

        /* JADX INFO: renamed from: c */
        public WeakReference<c> f19729c;

        /* JADX INFO: renamed from: d */
        public long f19730d;

        /* JADX INFO: renamed from: e */
        public long f19731e;

        /* JADX INFO: renamed from: f */
        public long f19732f;

        /* JADX INFO: renamed from: g */
        public boolean f19733g;

        /* JADX INFO: renamed from: h */
        public long f19734h;

        /* JADX INFO: renamed from: i */
        public long f19735i;

        /* JADX INFO: renamed from: j */
        public long f19736j;

        /* JADX INFO: renamed from: k */
        public boolean f19737k;

        public d() {
            this.f19728b = false;
            this.f19731e = -1L;
            this.f19732f = -1L;
            this.f19733g = false;
            this.f19734h = 1L;
            this.f19735i = -1L;
            this.f19736j = 60L;
            this.f19737k = true;
        }

        /* JADX INFO: renamed from: a */
        public b m31528a(boolean z, long j) {
            b bVar = new b();
            bVar.f19722b = this.f19727a;
            bVar.f19724d = this.f19731e;
            bVar.f19725e = this.f19732f;
            bVar.f19723c = this.f19730d;
            bVar.f19721a = z;
            bVar.f19726f = j;
            return bVar;
        }

        /* JADX INFO: renamed from: b */
        public void m31529b(a aVar) {
            this.f19727a = aVar.f19712a;
            this.f19729c = new WeakReference<>(aVar.f19713b);
            this.f19731e = aVar.f19714c;
            this.f19730d = mqi0.m155944o();
            this.f19732f = aVar.f19715d;
            this.f19733g = aVar.f19716e;
            this.f19728b = aVar.f19717f;
            this.f19734h = aVar.f19718g * 1000;
            this.f19736j = aVar.f19720i * 1000;
            this.f19737k = aVar.f19719h;
        }
    }

    public RunnableC4733c0() {
        this.f19710f.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.f19711g.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m31497b(Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public static String m31502l(long j) {
        List<String> listM175933a = qqi0.m175933a(j);
        return listM175933a.get(1) + ":" + listM175933a.get(2);
    }

    /* JADX INFO: renamed from: g */
    public final void m31503g() {
        if (this.f19706b.get()) {
            return;
        }
        mkd0.m154992z(this.f19708d);
        this.f19708d = C22306c.interval(500L, 1000L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(new e30() { // from class: l.n9b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137731a.m31512q((Long) obj);
            }
        }, new e30() { // from class: l.o9b
            @Override // p149l.e30
            public final void call(Object obj) {
                RunnableC4733c0.m31497b((Throwable) obj);
            }
        });
        this.f19706b.set(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m31504h() {
        if (this.f19707c.isEmpty()) {
            this.f19706b.set(false);
            mkd0.m154992z(this.f19708d);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m31505i() {
        Iterator<Map.Entry<String, d>> it = this.f19707c.entrySet().iterator();
        while (it.hasNext()) {
            d value = it.next().getValue();
            if (value.f19729c.get() == null && !value.f19728b) {
                it.remove();
            }
        }
        m31504h();
    }

    /* JADX INFO: renamed from: j */
    public final void m31506j() {
    }

    /* JADX INFO: renamed from: k */
    public String m31507k(long j) {
        List<String> listM175933a = qqi0.m175933a(j);
        return listM175933a.get(0) + ":" + listM175933a.get(1) + ":" + listM175933a.get(2);
    }

    /* JADX INFO: renamed from: m */
    public C22306c<b> m31508m(final String str) {
        return this.f19709e.filter(new w9j() { // from class: l.s9b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                RunnableC4733c0.b bVar = (RunnableC4733c0.b) obj;
                return Boolean.valueOf(TextUtils.equals(bVar.f19722b, str) && bVar.f19721a);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public C22306c<b> m31509n(final String str) {
        return this.f19709e.filter(new w9j() { // from class: l.p9b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((RunnableC4733c0.b) obj).f19722b, str));
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public C22306c<b> m31510o(final List<String> list) {
        return this.f19709e.filter(new w9j() { // from class: l.q9b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m200337m(list, new w9j() { // from class: l.r9b
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals(bVar.f19722b, (String) obj2));
                    }
                }));
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public boolean m31511p(String str) {
        return this.f19707c.containsKey(str);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m31512q(Long l2) {
        run();
    }

    /* JADX INFO: renamed from: r */
    public String m31513r(a aVar) {
        m31506j();
        String str = aVar.f19712a;
        if (TextUtils.isEmpty(str)) {
            str = "TIMER_AUTO_NAME_" + this.f19705a.incrementAndGet();
        }
        if (this.f19707c.containsKey(str)) {
            this.f19707c.remove(str);
        }
        d dVar = new d();
        dVar.m31529b(aVar);
        this.f19707c.put(str, dVar);
        m31503g();
        return str;
    }

    @Override // java.lang.Runnable
    public void run() {
        m31505i();
        if (this.f19707c.isEmpty()) {
            m31504h();
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        Iterator<Map.Entry<String, d>> it = this.f19707c.entrySet().iterator();
        long jM155944o = mqi0.m155944o();
        while (it.hasNext()) {
            d value = it.next().getValue();
            boolean z = value.f19734h == 1000;
            if (NullChecker.m81303a(value.f19729c.get())) {
                long j = value.f19734h;
                if (j > 1000) {
                    long j2 = 500 + jM155944o;
                    long j3 = value.f19735i;
                    if (j2 > j3) {
                        if (j3 == -1) {
                            long j4 = value.f19731e;
                            if (j4 > jM155944o) {
                                long j5 = (j4 - jM155944o) / j;
                                if (j5 > 0) {
                                    value.f19735i = j4 - (j * j5);
                                }
                            }
                        } else {
                            value.f19735i = j + jM155944o;
                        }
                        z = true;
                    }
                }
                boolean z2 = (value.f19731e - jM155944o >= value.f19736j || !value.f19737k) ? z : true;
                if (z2) {
                    value.f19729c.get().mo31526M0(value.f19727a);
                    value.f19729c.get().mo31527u(value.f19727a, jM155944o, value.f19732f, value.f19731e, value.f19730d);
                }
                z = z2;
            }
            if (z) {
                this.f19709e.onNext(value.m31528a(false, jM155944o));
            }
            if (value.f19733g) {
                long j6 = value.f19731e;
                if (jM155944o > j6 && j6 > 0) {
                    arrayList.add(value.f19727a);
                }
            }
        }
        if (vwb.m200296J(arrayList)) {
            return;
        }
        for (String str : arrayList) {
            if (this.f19707c.containsKey(str)) {
                d dVar = this.f19707c.get(str);
                if (NullChecker.m81303a(dVar)) {
                    this.f19709e.onNext(dVar.m31528a(true, jM155944o));
                }
            }
            this.f19707c.remove(str);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m31514s() {
        this.f19707c.clear();
        mkd0.m154992z(this.f19708d);
    }

    /* JADX INFO: renamed from: t */
    public void m31515t(c cVar) {
        m31506j();
        ArrayList<String> arrayList = new ArrayList();
        for (Map.Entry<String, d> entry : this.f19707c.entrySet()) {
            d value = entry.getValue();
            if (NullChecker.m81303a(value.f19729c.get()) && value.f19729c.get() == cVar) {
                arrayList.add(entry.getKey());
            }
        }
        if (vwb.m200296J(arrayList)) {
            return;
        }
        for (String str : arrayList) {
            if (!TextUtils.isEmpty(str)) {
                m31516u(str);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m31516u(String str) {
        m31506j();
        if (this.f19707c.containsKey(str)) {
            this.f19707c.remove(str);
            m31504h();
        }
    }
}
