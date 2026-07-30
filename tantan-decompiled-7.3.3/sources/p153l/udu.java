package p153l;

import com.tantanapp.common.utils.CrashHelper;
import com.tencent.mmkv.MMKV;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public class udu {

    /* JADX INFO: renamed from: a */
    public C22507a<Long> f178594a = C22507a.m222758b();

    /* JADX INFO: renamed from: b */
    public kcg0 f178595b;

    /* JADX INFO: renamed from: c */
    public long f178596c;

    /* JADX INFO: renamed from: d */
    public oo2 f178597d;

    /* JADX INFO: renamed from: e */
    public ExecutorService f178598e;

    public udu(oo2 oo2Var) {
        this.f178597d = oo2Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Boolean m195562b(boolean z, Long l2) {
        return l2.longValue() != 0 ? Boolean.TRUE : Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: j */
    public void m195570j() {
        psd0.m173633z(this.f178595b);
        this.f178596c = 0L;
        ExecutorService executorService = this.f178598e;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        this.f178598e.shutdown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public C22421c<Long> m195571k(C22421c<Long> c22421c, TimeUnit timeUnit, final int i, final boolean z) {
        final int i2;
        if (timeUnit == TimeUnit.HOURS) {
            i2 = MMKV.ExpireInHour;
        } else {
            i2 = timeUnit == TimeUnit.MINUTES ? 60 : 0;
        }
        qcj<? super Long, Boolean> qcjVar = new qcj() { // from class: l.ndu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return udu.m195562b(z, (Long) obj);
            }
        };
        C22421c c22421cFilter = i2 == 0 ? c22421c.filter(qcjVar) : c22421c.filter(qcjVar).filter(new qcj() { // from class: l.odu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() % ((long) i2) == 0);
            }
        }).map(new qcj() { // from class: l.pdu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Long.valueOf(((Long) obj).longValue() / ((long) i2));
            }
        });
        return (i == 1 || i == 0) ? c22421cFilter : c22421cFilter.filter(new qcj() { // from class: l.qdu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() % ((long) i) == 0);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public int m195572l() {
        try {
            return (int) ((System.currentTimeMillis() - this.f178596c) / 1000);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return -1;
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m195573m(Long l2) {
        this.f178594a.m137019l(l2);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C22421c m195574n(jsv jsvVar) {
        Long lM222761e = this.f178594a.m222761e();
        if (lM222761e == null) {
            lM222761e = 0L;
        }
        final long jLongValue = lM222761e.longValue();
        return this.f178594a.asObservable().onBackpressureLatest().observeOn(Schedulers.from(this.f178598e)).map(new qcj() { // from class: l.tdu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Long.valueOf(((Long) obj).longValue() - jLongValue);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public Long m195575o() {
        Long lM222761e = this.f178594a.m222761e();
        if (lM222761e == null) {
            return 0L;
        }
        return lM222761e;
    }

    /* JADX INFO: renamed from: p */
    public void m195576p() {
        if (this.f178596c == 0) {
            this.f178598e = idu.m139545b("live-timer");
            this.f178596c = System.currentTimeMillis();
            this.f178595b = C22421c.interval(0L, 1L, TimeUnit.SECONDS).subscribe(dhw.m115826e(new y20() { // from class: l.rdu
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f162360a.m195573m((Long) obj);
                }
            }, new y20() { // from class: l.sdu
                @Override // p153l.y20
                public final void call(Object obj) {
                    CrashHelper.m82479c(new Throwable("live timer error", (Throwable) obj));
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q */
    public C22421c<Long> m195577q(int i, TimeUnit timeUnit) {
        final long jLongValue = m195575o().longValue();
        return m195571k(this.f178594a.asObservable().map(new qcj() { // from class: l.mdu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Long.valueOf(((Long) obj).longValue() - jLongValue);
            }
        }), timeUnit, i, false);
    }

    /* JADX INFO: renamed from: r */
    public C22421c<Long> m195578r(int i, TimeUnit timeUnit) {
        return m195571k(this.f178597d.mo183454y().flatMap(new qcj() { // from class: l.ldu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f131666a.m195574n((jsv) obj);
            }
        }), timeUnit, i, false);
    }

    public udu() {
    }
}
