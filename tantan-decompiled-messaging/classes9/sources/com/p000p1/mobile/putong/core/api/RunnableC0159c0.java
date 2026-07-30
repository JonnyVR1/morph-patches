package com.p000p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.api.RunnableC0159c0;
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
import l.c4g0;
import l.e30;
import l.jo0;
import l.mkd0;
import l.mqi0;
import l.qqi0;
import l.vwb;
import l.w9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.c0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class RunnableC0159c0 implements Runnable {

    /* JADX INFO: renamed from: d */
    public c4g0 f3697d;

    /* JADX INFO: renamed from: a */
    public AtomicInteger f3694a = new AtomicInteger();

    /* JADX INFO: renamed from: b */
    public AtomicBoolean f3695b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public ConcurrentHashMap<String, d> f3696c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e */
    public rx.subjects.b<b> f3698e = rx.subjects.b.b();

    /* JADX INFO: renamed from: f */
    public SimpleDateFormat f3699f = new SimpleDateFormat("HH:mm");

    /* JADX INFO: renamed from: g */
    public SimpleDateFormat f3700g = new SimpleDateFormat("mm:ss");

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.c0$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f3701a;

        /* JADX INFO: renamed from: b */
        public c f3702b;

        /* JADX INFO: renamed from: c */
        public long f3703c = -1;

        /* JADX INFO: renamed from: d */
        public long f3704d = -1;

        /* JADX INFO: renamed from: e */
        public boolean f3705e = false;

        /* JADX INFO: renamed from: f */
        public boolean f3706f = false;

        /* JADX INFO: renamed from: g */
        public long f3707g = 1;

        /* JADX INFO: renamed from: h */
        public boolean f3708h = true;

        /* JADX INFO: renamed from: i */
        public long f3709i = 60;

        /* JADX INFO: renamed from: a */
        public a m3447a(boolean z) {
            this.f3705e = z;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m3448b(boolean z) {
            this.f3708h = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m3449c(long j) {
            this.f3704d = j;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m3450d(c cVar) {
            this.f3702b = cVar;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m3451e(boolean z) {
            this.f3706f = z;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m3452f(long j) {
            this.f3703c = j;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m3453g(String str) {
            this.f3701a = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public a m3454h(long j) {
            this.f3707g = j;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a m3455i(long j) {
            this.f3709i = j;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.c0$b */
    public static class b {

        /* JADX INFO: renamed from: b */
        public String f3711b;

        /* JADX INFO: renamed from: c */
        public long f3712c;

        /* JADX INFO: renamed from: f */
        public long f3715f;

        /* JADX INFO: renamed from: a */
        public boolean f3710a = false;

        /* JADX INFO: renamed from: d */
        public long f3713d = -1;

        /* JADX INFO: renamed from: e */
        public long f3714e = -1;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.c0$c */
    public interface c {
        /* JADX INFO: renamed from: M0 */
        default void m3456M0(String str) {
        }

        /* JADX INFO: renamed from: u */
        default void m3457u(String str, long j, long j2, long j3, long j4) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.c0$d */
    public class d {

        /* JADX INFO: renamed from: a */
        public String f3716a;

        /* JADX INFO: renamed from: b */
        public boolean f3717b;

        /* JADX INFO: renamed from: c */
        public WeakReference<c> f3718c;

        /* JADX INFO: renamed from: d */
        public long f3719d;

        /* JADX INFO: renamed from: e */
        public long f3720e;

        /* JADX INFO: renamed from: f */
        public long f3721f;

        /* JADX INFO: renamed from: g */
        public boolean f3722g;

        /* JADX INFO: renamed from: h */
        public long f3723h;

        /* JADX INFO: renamed from: i */
        public long f3724i;

        /* JADX INFO: renamed from: j */
        public long f3725j;

        /* JADX INFO: renamed from: k */
        public boolean f3726k;

        public d() {
            this.f3717b = false;
            this.f3720e = -1L;
            this.f3721f = -1L;
            this.f3722g = false;
            this.f3723h = 1L;
            this.f3724i = -1L;
            this.f3725j = 60L;
            this.f3726k = true;
        }

        /* JADX INFO: renamed from: a */
        public b m3458a(boolean z, long j) {
            b bVar = new b();
            bVar.f3711b = this.f3716a;
            bVar.f3713d = this.f3720e;
            bVar.f3714e = this.f3721f;
            bVar.f3712c = this.f3719d;
            bVar.f3710a = z;
            bVar.f3715f = j;
            return bVar;
        }

        /* JADX INFO: renamed from: b */
        public void m3459b(a aVar) {
            this.f3716a = aVar.f3701a;
            this.f3718c = new WeakReference<>(aVar.f3702b);
            this.f3720e = aVar.f3703c;
            this.f3719d = mqi0.o();
            this.f3721f = aVar.f3704d;
            this.f3722g = aVar.f3705e;
            this.f3717b = aVar.f3706f;
            this.f3723h = aVar.f3707g * 1000;
            this.f3725j = aVar.f3709i * 1000;
            this.f3726k = aVar.f3708h;
        }
    }

    public RunnableC0159c0() {
        this.f3699f.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.f3700g.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3427b(Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public static String m3432l(long j) {
        List listA = qqi0.a(j);
        return ((String) listA.get(1)) + ":" + ((String) listA.get(2));
    }

    /* JADX INFO: renamed from: g */
    public final void m3433g() {
        if (this.f3695b.get()) {
            return;
        }
        mkd0.z(this.f3697d);
        this.f3697d = rx.c.interval(500L, 1000L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(new e30() { // from class: l.n9b
            public final void call(Object obj) {
                this.f17544a.m3442q((Long) obj);
            }
        }, new e30() { // from class: l.o9b
            public final void call(Object obj) {
                RunnableC0159c0.m3427b((Throwable) obj);
            }
        });
        this.f3695b.set(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m3434h() {
        if (this.f3696c.isEmpty()) {
            this.f3695b.set(false);
            mkd0.z(this.f3697d);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3435i() {
        Iterator<Map.Entry<String, d>> it = this.f3696c.entrySet().iterator();
        while (it.hasNext()) {
            d value = it.next().getValue();
            if (value.f3718c.get() == null && !value.f3717b) {
                it.remove();
            }
        }
        m3434h();
    }

    /* JADX INFO: renamed from: j */
    public final void m3436j() {
    }

    /* JADX INFO: renamed from: k */
    public String m3437k(long j) {
        List listA = qqi0.a(j);
        return ((String) listA.get(0)) + ":" + ((String) listA.get(1)) + ":" + ((String) listA.get(2));
    }

    /* JADX INFO: renamed from: m */
    public rx.c<b> m3438m(final String str) {
        return this.f3698e.filter(new w9j() { // from class: l.s9b
            public final Object call(Object obj) {
                RunnableC0159c0.b bVar = (RunnableC0159c0.b) obj;
                return Boolean.valueOf(TextUtils.equals(bVar.f3711b, str) && bVar.f3710a);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public rx.c<b> m3439n(final String str) {
        return this.f3698e.filter(new w9j() { // from class: l.p9b
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((RunnableC0159c0.b) obj).f3711b, str));
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public rx.c<b> m3440o(final List<String> list) {
        return this.f3698e.filter(new w9j() { // from class: l.q9b
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m(list, new w9j() { // from class: l.r9b
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(TextUtils.equals(bVar.f3711b, (String) obj2));
                    }
                }));
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public boolean m3441p(String str) {
        return this.f3696c.containsKey(str);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m3442q(Long l2) {
        run();
    }

    /* JADX INFO: renamed from: r */
    public String m3443r(a aVar) {
        m3436j();
        String str = aVar.f3701a;
        if (TextUtils.isEmpty(str)) {
            str = "TIMER_AUTO_NAME_" + this.f3694a.incrementAndGet();
        }
        if (this.f3696c.containsKey(str)) {
            this.f3696c.remove(str);
        }
        d dVar = new d();
        dVar.m3459b(aVar);
        this.f3696c.put(str, dVar);
        m3433g();
        return str;
    }

    @Override // java.lang.Runnable
    public void run() {
        m3435i();
        if (this.f3696c.isEmpty()) {
            m3434h();
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        Iterator<Map.Entry<String, d>> it = this.f3696c.entrySet().iterator();
        long jO = mqi0.o();
        while (it.hasNext()) {
            d value = it.next().getValue();
            boolean z = value.f3723h == 1000;
            if (NullChecker.a(value.f3718c.get())) {
                long j = value.f3723h;
                if (j > 1000) {
                    long j2 = 500 + jO;
                    long j3 = value.f3724i;
                    if (j2 > j3) {
                        if (j3 == -1) {
                            long j4 = value.f3720e;
                            if (j4 > jO) {
                                long j5 = (j4 - jO) / j;
                                if (j5 > 0) {
                                    value.f3724i = j4 - (j * j5);
                                }
                            }
                        } else {
                            value.f3724i = j + jO;
                        }
                        z = true;
                    }
                }
                boolean z2 = (value.f3720e - jO >= value.f3725j || !value.f3726k) ? z : true;
                if (z2) {
                    value.f3718c.get().m3456M0(value.f3716a);
                    value.f3718c.get().m3457u(value.f3716a, jO, value.f3721f, value.f3720e, value.f3719d);
                }
                z = z2;
            }
            if (z) {
                this.f3698e.onNext(value.m3458a(false, jO));
            }
            if (value.f3722g) {
                long j6 = value.f3720e;
                if (jO > j6 && j6 > 0) {
                    arrayList.add(value.f3716a);
                }
            }
        }
        if (vwb.J(arrayList)) {
            return;
        }
        for (String str : arrayList) {
            if (this.f3696c.containsKey(str)) {
                d dVar = this.f3696c.get(str);
                if (NullChecker.a(dVar)) {
                    this.f3698e.onNext(dVar.m3458a(true, jO));
                }
            }
            this.f3696c.remove(str);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m3444s() {
        this.f3696c.clear();
        mkd0.z(this.f3697d);
    }

    /* JADX INFO: renamed from: t */
    public void m3445t(c cVar) {
        m3436j();
        ArrayList<String> arrayList = new ArrayList();
        for (Map.Entry<String, d> entry : this.f3696c.entrySet()) {
            d value = entry.getValue();
            if (NullChecker.a(value.f3718c.get()) && value.f3718c.get() == cVar) {
                arrayList.add(entry.getKey());
            }
        }
        if (vwb.J(arrayList)) {
            return;
        }
        for (String str : arrayList) {
            if (!TextUtils.isEmpty(str)) {
                m3446u(str);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m3446u(String str) {
        m3436j();
        if (this.f3696c.containsKey(str)) {
            this.f3696c.remove(str);
            m3434h();
        }
    }
}
