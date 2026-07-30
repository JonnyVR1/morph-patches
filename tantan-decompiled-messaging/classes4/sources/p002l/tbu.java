package p002l;

import com.tantanapp.common.utils.CrashHelper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.e30;
import l.ffw;
import l.hbu;
import l.mkd0;
import l.w9j;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tbu {

    /* JADX INFO: renamed from: a */
    public a<Long> f20172a = a.b();

    /* JADX INFO: renamed from: b */
    public c4g0 f20173b;

    /* JADX INFO: renamed from: c */
    public long f20174c;

    /* JADX INFO: renamed from: d */
    public ho2 f20175d;

    /* JADX INFO: renamed from: e */
    public ExecutorService f20176e;

    public tbu(ho2 ho2Var) {
        this.f20175d = ho2Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Boolean m22836b(boolean z, Long l2) {
        return l2.longValue() != 0 ? Boolean.TRUE : Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: j */
    public void m22844j() {
        mkd0.z(this.f20173b);
        this.f20174c = 0L;
        ExecutorService executorService = this.f20176e;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        this.f20176e.shutdown();
    }

    /* JADX INFO: renamed from: k */
    public c<Long> m22845k(c<Long> cVar, TimeUnit timeUnit, final int i, final boolean z) {
        final int i2;
        if (timeUnit == TimeUnit.HOURS) {
            i2 = 3600;
        } else {
            i2 = timeUnit == TimeUnit.MINUTES ? 60 : 0;
        }
        w9j w9jVar = new w9j() { // from class: l.mbu
            public final Object call(Object obj) {
                return tbu.m22836b(z, (Long) obj);
            }
        };
        c<Long> cVarFilter = i2 == 0 ? cVar.filter(w9jVar) : cVar.filter(w9jVar).filter(new w9j() { // from class: l.nbu
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() % ((long) i2) == 0);
            }
        }).map(new w9j() { // from class: l.obu
            public final Object call(Object obj) {
                return Long.valueOf(((Long) obj).longValue() / ((long) i2));
            }
        });
        return (i == 1 || i == 0) ? cVarFilter : cVarFilter.filter(new w9j() { // from class: l.pbu
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() % ((long) i) == 0);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public int m22846l() {
        try {
            return (int) ((System.currentTimeMillis() - this.f20174c) / 1000);
        } catch (Exception e) {
            CrashHelper.c(e);
            return -1;
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m22847m(Long l2) {
        this.f20172a.onNext(l2);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ c m22848n(iqv iqvVar) {
        Long l2 = (Long) this.f20172a.e();
        if (l2 == null) {
            l2 = 0L;
        }
        final long jLongValue = l2.longValue();
        return this.f20172a.asObservable().onBackpressureLatest().observeOn(Schedulers.from(this.f20176e)).map(new w9j() { // from class: l.sbu
            public final Object call(Object obj) {
                return Long.valueOf(((Long) obj).longValue() - jLongValue);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public Long m22849o() {
        Long l2 = (Long) this.f20172a.e();
        if (l2 == null) {
            return 0L;
        }
        return l2;
    }

    /* JADX INFO: renamed from: p */
    public void m22850p() {
        if (this.f20174c == 0) {
            this.f20176e = hbu.b("live-timer");
            this.f20174c = System.currentTimeMillis();
            this.f20173b = c.interval(0L, 1L, TimeUnit.SECONDS).subscribe(ffw.e(new e30() { // from class: l.qbu
                public final void call(Object obj) {
                    this.f17895a.m22847m((Long) obj);
                }
            }, new e30() { // from class: l.rbu
                public final void call(Object obj) {
                    CrashHelper.c(new Throwable("live timer error", (Throwable) obj));
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q */
    public c<Long> m22851q(int i, TimeUnit timeUnit) {
        final long jLongValue = m22849o().longValue();
        return m22845k(this.f20172a.asObservable().map(new w9j() { // from class: l.lbu
            public final Object call(Object obj) {
                return Long.valueOf(((Long) obj).longValue() - jLongValue);
            }
        }), timeUnit, i, false);
    }

    /* JADX INFO: renamed from: r */
    public c<Long> m22852r(int i, TimeUnit timeUnit) {
        return m22845k(this.f20175d.m17248y().flatMap(new w9j() { // from class: l.kbu
            public final Object call(Object obj) {
                return this.f14276a.m22848n((iqv) obj);
            }
        }), timeUnit, i, false);
    }

    public tbu() {
    }
}
