package p153l;

import android.os.Looper;
import android.os.SystemClock;
import com.tantanapp.common.network.NetReporter;
import com.tantanapp.common.network.NetworkTrackInfo;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public class ug50 extends oq2<C20569c> {

    /* JADX INFO: renamed from: a */
    public rg50 f178855a;

    /* JADX INFO: renamed from: b */
    public Executor f178856b;

    /* JADX INFO: renamed from: c */
    public ukm f178857c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f178858d;

    /* JADX INFO: renamed from: l.ug50$a */
    public class C20567a extends er2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ry3 f178859a;

        /* JADX INFO: renamed from: l.ug50$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C20567a.this.f178859a.cancel();
            }
        }

        public C20567a(ry3 ry3Var) {
            this.f178859a = ry3Var;
        }

        @Override // p153l.er2, p153l.zk90
        /* JADX INFO: renamed from: b */
        public void mo8551b() {
            if (this.f178859a.isCanceled()) {
                return;
            }
            tu2.m192703a("[common][image_net]", "onCancellationRequested url = " + this.f178859a.request().m209026k());
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f178859a.cancel();
            } else {
                ug50.this.f178856b.execute(new a());
            }
        }
    }

    /* JADX INFO: renamed from: l.ug50$b */
    public class C20568b implements w84 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C20569c f178862a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ vj20.InterfaceC20847a f178863b;

        public C20568b(C20569c c20569c, vj20.InterfaceC20847a interfaceC20847a) {
            this.f178862a = c20569c;
            this.f178863b = interfaceC20847a;
        }

        @Override // p153l.w84
        public void onFailure(ry3 ry3Var, IOException iOException) {
            tu2.m192703a("[common][image_net]", "onFailure url = " + ry3Var.request().m209026k() + ", exception = " + iOException);
            try {
                C20569c c20569c = this.f178862a;
                c20569c.f178868i++;
                ug50.this.m195894m(c20569c, ry3Var, iOException, this.f178863b);
            } finally {
                if (ug50.this.f178857c != null) {
                    if (ry3Var.isCanceled()) {
                        ug50.this.f178857c.requestCancel(ry3Var.request());
                    }
                    ug50.this.f178857c.mo127164a(ry3Var.request());
                }
            }
        }

        @Override // p153l.w84
        public void onResponse(ry3 ry3Var, i5d0 i5d0Var) {
            tu2.m192703a("[common][image_net]", "onResponse url = " + ry3Var.request().m209026k() + ", response = " + i5d0Var);
            this.f178862a.f178866g = SystemClock.uptimeMillis();
            k5d0 k5d0VarM138670k = i5d0Var.m138670k();
            try {
                try {
                    if (!i5d0Var.m138661I()) {
                        C20569c c20569c = this.f178862a;
                        c20569c.f178868i += 3;
                        ug50.this.m195894m(c20569c, ry3Var, new IOException("Unexpected HTTP code " + i5d0Var.m138673q()), this.f178863b);
                        if (ug50.this.f178857c != null) {
                            ug50.this.f178857c.mo127164a(ry3Var.request());
                        }
                        try {
                            k5d0VarM138670k.close();
                            return;
                        } catch (RuntimeException e) {
                            CrashHelper.m82479c(e);
                            huf.m137197y("OkHttpNetworkFetchProducer", "Exception when closing response body", e);
                            return;
                        }
                    }
                    long jContentLength = k5d0VarM138670k.contentLength();
                    if (jContentLength < 0) {
                        jContentLength = 0;
                    }
                    try {
                        this.f178863b.mo196315b(k5d0VarM138670k.byteStream(), (int) jContentLength);
                    } catch (Exception e2) {
                        C20569c c20569c2 = this.f178862a;
                        c20569c2.f178868i += 3;
                        ug50.this.m195894m(c20569c2, ry3Var, e2, this.f178863b);
                    }
                    if (ug50.this.f178857c != null) {
                        ug50.this.f178857c.mo127164a(ry3Var.request());
                    }
                    try {
                        k5d0VarM138670k.close();
                    } catch (RuntimeException e3) {
                        CrashHelper.m82479c(e3);
                        huf.m137197y("OkHttpNetworkFetchProducer", "Exception when closing response body", e3);
                    }
                } catch (Throwable th) {
                    if (ug50.this.f178857c != null) {
                        ug50.this.f178857c.mo127164a(ry3Var.request());
                    }
                    try {
                        k5d0VarM138670k.close();
                    } catch (RuntimeException e4) {
                        CrashHelper.m82479c(e4);
                        huf.m137197y("OkHttpNetworkFetchProducer", "Exception when closing response body", e4);
                    }
                    throw th;
                }
            } catch (Exception e5) {
                CrashHelper.m82479c(e5);
                C20569c c20569c3 = this.f178862a;
                c20569c3.f178868i += 3;
                ug50.this.m195894m(c20569c3, ry3Var, e5, this.f178863b);
                if (ug50.this.f178857c != null) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.ug50$c */
    public static class C20569c extends vhi {

        /* JADX INFO: renamed from: f */
        public long f178865f;

        /* JADX INFO: renamed from: g */
        public long f178866g;

        /* JADX INFO: renamed from: h */
        public long f178867h;

        /* JADX INFO: renamed from: i */
        public int f178868i;

        /* JADX INFO: renamed from: j */
        public long f178869j;

        /* JADX INFO: renamed from: k */
        public x1d0 f178870k;

        public C20569c(z06<n0f> z06Var, yk90 yk90Var) {
            super(z06Var, yk90Var);
            this.f178868i = 0;
        }

        public String toString() {
            return "OkHttpNetworkFetchState{submitTime=" + this.f178865f + ", responseTime=" + this.f178866g + ", fetchCompleteTime=" + this.f178867h + ", retryCount=" + this.f178868i + ", startTimestamp=" + this.f178869j + ", request=" + this.f178870k + '}';
        }
    }

    public ug50(rg50 rg50Var) {
        this.f178855a = rg50Var;
        this.f178856b = rg50Var.m181350m().m166110c();
    }

    @Override // p153l.vj20
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C20569c mo186972d(z06<n0f> z06Var, yk90 yk90Var) {
        return new C20569c(z06Var, yk90Var);
    }

    /* JADX INFO: renamed from: i */
    public void m195890i(C20569c c20569c, vj20.InterfaceC20847a interfaceC20847a) {
        tu2.m192703a("[common][image_net]", "enqueue fetchState = " + c20569c);
        ry3 ry3VarMo181341a = m195893l().mo181341a(c20569c.f178870k);
        c20569c.m201290b().mo117677q(new C20567a(ry3VarMo181341a));
        ry3VarMo181341a.mo135840h(new C20568b(c20569c, interfaceC20847a));
    }

    @Override // p153l.vj20
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo186971a(C20569c c20569c, vj20.InterfaceC20847a interfaceC20847a) {
        tu2.m192703a("[common][image_net]", "fetch fetchState = " + c20569c);
        c20569c.f178865f = SystemClock.uptimeMillis();
        c20569c.f178869j = System.currentTimeMillis();
        try {
            x1d0 x1d0VarM209028b = new x1d0.C21228a().m209029c(new yx3.C21702a().m217685d().m217682a()).m209043q(c20569c.m201295g().toString()).m209032f().m209028b();
            ukm ukmVar = this.f178857c;
            if (ukmVar != null) {
                x1d0VarM209028b = ukmVar.mo127165b(x1d0VarM209028b, NetworkTrackInfo.ReportType.MEDIA);
            }
            c20569c.f178870k = x1d0VarM209028b;
            m195890i(c20569c, interfaceC20847a);
        } catch (Exception e) {
            ukm ukmVar2 = this.f178857c;
            if (ukmVar2 != null) {
                ukmVar2.mo127166c(c20569c.f178870k, e);
                this.f178857c.mo127164a(c20569c.f178870k);
            }
            interfaceC20847a.onFailure(e);
            CrashHelper.m82479c(new Exception("fetch exception:" + e.getMessage(), e));
        }
    }

    @Override // p153l.oq2, p153l.vj20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map<String, String> mo168785c(C20569c c20569c, int i) {
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(c20569c.f178866g - c20569c.f178865f));
        map.put("fetch_time", Long.toString(c20569c.f178867h - c20569c.f178866g));
        map.put("total_time", Long.toString(c20569c.f178867h - c20569c.f178865f));
        map.put("image_size", Integer.toString(i));
        return map;
    }

    /* JADX INFO: renamed from: l */
    public rg50 m195893l() {
        rg50 rg50Var;
        if (!this.f178858d) {
            return this.f178855a;
        }
        synchronized (this) {
            try {
                if (this.f178858d) {
                    tu2.m192703a("[common][image_net]", "切换链接池");
                    this.f178855a = this.f178855a.m181359v().m181369g(new lx5()).m181365c();
                    this.f178858d = false;
                }
                rg50Var = this.f178855a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rg50Var;
    }

    /* JADX INFO: renamed from: m */
    public void m195894m(C20569c c20569c, ry3 ry3Var, Exception exc, vj20.InterfaceC20847a interfaceC20847a) {
        tu2.m192703a("[common][image_net]", "handleException fetchState = " + c20569c);
        ukm ukmVar = this.f178857c;
        if (ukmVar != null) {
            ukmVar.mo127166c(ry3Var.request(), exc);
        }
        if (ry3Var.isCanceled()) {
            interfaceC20847a.mo196314a();
        } else if (c20569c.f178868i < 3) {
            m195890i(c20569c, interfaceC20847a);
        } else {
            interfaceC20847a.onFailure(exc);
            NetReporter.reportError(exc);
        }
    }

    @Override // p153l.oq2, p153l.vj20
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo168786e(C20569c c20569c, int i) {
        tu2.m192703a("[common][image_net]", "onFetchCompletion fetchState = " + c20569c + "，byteSize=" + i);
        long jUptimeMillis = SystemClock.uptimeMillis();
        c20569c.f178867h = jUptimeMillis;
        try {
            long j = jUptimeMillis - c20569c.f178865f;
            BigDecimal bigDecimal = new BigDecimal(j);
            BigDecimal bigDecimalDivide = new BigDecimal(i).divide(new BigDecimal(1024));
            BigDecimal bigDecimalDivide2 = bigDecimalDivide.divide(bigDecimal.divide(new BigDecimal(1000)), 2, RoundingMode.HALF_UP);
            cjm.m110270a().onNext(cjm.m110271b(bigDecimalDivide2, bigDecimalDivide, j));
            Objects.toString(bigDecimalDivide2);
            bigDecimalDivide.longValue();
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("ImageNetSpeedException:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: o */
    public void m195896o(ukm ukmVar) {
        this.f178857c = ukmVar;
    }

    /* JADX INFO: renamed from: p */
    public void m195897p() {
        this.f178858d = true;
    }
}
