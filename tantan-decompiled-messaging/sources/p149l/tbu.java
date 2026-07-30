package p149l;

import com.tantanapp.common.utils.CrashHelper;
import com.tencent.mmkv.MMKV;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public class tbu {

    /* JADX INFO: renamed from: a */
    public C22392a<Long> f169356a = C22392a.m221512b();

    /* JADX INFO: renamed from: b */
    public c4g0 f169357b;

    /* JADX INFO: renamed from: c */
    public long f169358c;

    /* JADX INFO: renamed from: d */
    public ho2 f169359d;

    /* JADX INFO: renamed from: e */
    public ExecutorService f169360e;

    public tbu(ho2 ho2Var) {
        this.f169359d = ho2Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Boolean m187905b(boolean z, Long l2) {
        return l2.longValue() != 0 ? Boolean.TRUE : Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: j */
    public void m187913j() {
        mkd0.m154992z(this.f169357b);
        this.f169358c = 0L;
        ExecutorService executorService = this.f169360e;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        this.f169360e.shutdown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public C22306c<Long> m187914k(C22306c<Long> c22306c, TimeUnit timeUnit, final int i, final boolean z) {
        final int i2;
        if (timeUnit == TimeUnit.HOURS) {
            i2 = MMKV.ExpireInHour;
        } else {
            i2 = timeUnit == TimeUnit.MINUTES ? 60 : 0;
        }
        w9j<? super Long, Boolean> w9jVar = new w9j() { // from class: l.mbu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return tbu.m187905b(z, (Long) obj);
            }
        };
        C22306c c22306cFilter = i2 == 0 ? c22306c.filter(w9jVar) : c22306c.filter(w9jVar).filter(new w9j() { // from class: l.nbu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() % ((long) i2) == 0);
            }
        }).map(new w9j() { // from class: l.obu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Long.valueOf(((Long) obj).longValue() / ((long) i2));
            }
        });
        return (i == 1 || i == 0) ? c22306cFilter : c22306cFilter.filter(new w9j() { // from class: l.pbu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() % ((long) i) == 0);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public int m187915l() {
        try {
            return (int) ((System.currentTimeMillis() - this.f169358c) / 1000);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return -1;
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m187916m(Long l2) {
        this.f169356a.m132487l(l2);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C22306c m187917n(iqv iqvVar) {
        Long lM221515e = this.f169356a.m221515e();
        if (lM221515e == null) {
            lM221515e = 0L;
        }
        final long jLongValue = lM221515e.longValue();
        return this.f169356a.asObservable().onBackpressureLatest().observeOn(Schedulers.from(this.f169360e)).map(new w9j() { // from class: l.sbu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Long.valueOf(((Long) obj).longValue() - jLongValue);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public Long m187918o() {
        Long lM221515e = this.f169356a.m221515e();
        if (lM221515e == null) {
            return 0L;
        }
        return lM221515e;
    }

    /* JADX INFO: renamed from: p */
    public void m187919p() {
        if (this.f169358c == 0) {
            this.f169360e = hbu.m130336b("live-timer");
            this.f169358c = System.currentTimeMillis();
            this.f169357b = C22306c.interval(0L, 1L, TimeUnit.SECONDS).subscribe(ffw.m121194e(new e30() { // from class: l.qbu
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f153697a.m187916m((Long) obj);
                }
            }, new e30() { // from class: l.rbu
                @Override // p149l.e30
                public final void call(Object obj) {
                    CrashHelper.m81296c(new Throwable("live timer error", (Throwable) obj));
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q */
    public C22306c<Long> m187920q(int i, TimeUnit timeUnit) {
        final long jLongValue = m187918o().longValue();
        return m187914k(this.f169356a.asObservable().map(new w9j() { // from class: l.lbu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Long.valueOf(((Long) obj).longValue() - jLongValue);
            }
        }), timeUnit, i, false);
    }

    /* JADX INFO: renamed from: r */
    public C22306c<Long> m187921r(int i, TimeUnit timeUnit) {
        return m187914k(this.f169359d.mo149827y().flatMap(new w9j() { // from class: l.kbu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f122262a.m187917n((iqv) obj);
            }
        }), timeUnit, i, false);
    }

    public tbu() {
    }
}
