package p149l;

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
public class n850 extends xp2<C18634c> {

    /* JADX INFO: renamed from: a */
    public k850 f137583a;

    /* JADX INFO: renamed from: b */
    public Executor f137584b;

    /* JADX INFO: renamed from: c */
    public rim f137585c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f137586d;

    /* JADX INFO: renamed from: l.n850$a */
    public class C18632a extends nq2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ sx3 f137587a;

        /* JADX INFO: renamed from: l.n850$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C18632a.this.f137587a.cancel();
            }
        }

        public C18632a(sx3 sx3Var) {
            this.f137587a = sx3Var;
        }

        @Override // p149l.nq2, p149l.vc90
        /* JADX INFO: renamed from: b */
        public void mo8497b() {
            if (this.f137587a.isCanceled()) {
                return;
            }
            du2.m113670a("[common][image_net]", "onCancellationRequested url = " + this.f137587a.request().m185881k());
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f137587a.cancel();
            } else {
                n850.this.f137584b.execute(new a());
            }
        }
    }

    /* JADX INFO: renamed from: l.n850$b */
    public class C18633b implements x74 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18634c f137590a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ mb20.InterfaceC18431a f137591b;

        public C18633b(C18634c c18634c, mb20.InterfaceC18431a interfaceC18431a) {
            this.f137590a = c18634c;
            this.f137591b = interfaceC18431a;
        }

        @Override // p149l.x74
        public void onFailure(sx3 sx3Var, IOException iOException) {
            du2.m113670a("[common][image_net]", "onFailure url = " + sx3Var.request().m185881k() + ", exception = " + iOException);
            try {
                C18634c c18634c = this.f137590a;
                c18634c.f137596i++;
                n850.this.m158195m(c18634c, sx3Var, iOException, this.f137591b);
            } finally {
                if (n850.this.f137585c != null) {
                    if (sx3Var.isCanceled()) {
                        n850.this.f137585c.requestCancel(sx3Var.request());
                    }
                    n850.this.f137585c.mo102381a(sx3Var.request());
                }
            }
        }

        @Override // p149l.x74
        public void onResponse(sx3 sx3Var, exc0 exc0Var) {
            du2.m113670a("[common][image_net]", "onResponse url = " + sx3Var.request().m185881k() + ", response = " + exc0Var);
            this.f137590a.f137594g = SystemClock.uptimeMillis();
            gxc0 gxc0VarM118606k = exc0Var.m118606k();
            try {
                try {
                    if (!exc0Var.m118597I()) {
                        C18634c c18634c = this.f137590a;
                        c18634c.f137596i += 3;
                        n850.this.m158195m(c18634c, sx3Var, new IOException("Unexpected HTTP code " + exc0Var.m118609q()), this.f137591b);
                        if (n850.this.f137585c != null) {
                            n850.this.f137585c.mo102381a(sx3Var.request());
                        }
                        try {
                            gxc0VarM118606k.close();
                            return;
                        } catch (RuntimeException e) {
                            CrashHelper.m81296c(e);
                            tsf.m190559y("OkHttpNetworkFetchProducer", "Exception when closing response body", e);
                            return;
                        }
                    }
                    long jContentLength = gxc0VarM118606k.contentLength();
                    if (jContentLength < 0) {
                        jContentLength = 0;
                    }
                    try {
                        this.f137591b.mo149198b(gxc0VarM118606k.byteStream(), (int) jContentLength);
                    } catch (Exception e2) {
                        C18634c c18634c2 = this.f137590a;
                        c18634c2.f137596i += 3;
                        n850.this.m158195m(c18634c2, sx3Var, e2, this.f137591b);
                    }
                    if (n850.this.f137585c != null) {
                        n850.this.f137585c.mo102381a(sx3Var.request());
                    }
                    try {
                        gxc0VarM118606k.close();
                    } catch (RuntimeException e3) {
                        CrashHelper.m81296c(e3);
                        tsf.m190559y("OkHttpNetworkFetchProducer", "Exception when closing response body", e3);
                    }
                } catch (Throwable th) {
                    if (n850.this.f137585c != null) {
                        n850.this.f137585c.mo102381a(sx3Var.request());
                    }
                    try {
                        gxc0VarM118606k.close();
                    } catch (RuntimeException e4) {
                        CrashHelper.m81296c(e4);
                        tsf.m190559y("OkHttpNetworkFetchProducer", "Exception when closing response body", e4);
                    }
                    throw th;
                }
            } catch (Exception e5) {
                CrashHelper.m81296c(e5);
                C18634c c18634c3 = this.f137590a;
                c18634c3.f137596i += 3;
                n850.this.m158195m(c18634c3, sx3Var, e5, this.f137591b);
                if (n850.this.f137585c != null) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.n850$c */
    public static class C18634c extends zei {

        /* JADX INFO: renamed from: f */
        public long f137593f;

        /* JADX INFO: renamed from: g */
        public long f137594g;

        /* JADX INFO: renamed from: h */
        public long f137595h;

        /* JADX INFO: renamed from: i */
        public int f137596i;

        /* JADX INFO: renamed from: j */
        public long f137597j;

        /* JADX INFO: renamed from: k */
        public stc0 f137598k;

        public C18634c(uz5<jze> uz5Var, uc90 uc90Var) {
            super(uz5Var, uc90Var);
            this.f137596i = 0;
        }

        public String toString() {
            return "OkHttpNetworkFetchState{submitTime=" + this.f137593f + ", responseTime=" + this.f137594g + ", fetchCompleteTime=" + this.f137595h + ", retryCount=" + this.f137596i + ", startTimestamp=" + this.f137597j + ", request=" + this.f137598k + '}';
        }
    }

    public n850(k850 k850Var) {
        this.f137583a = k850Var;
        this.f137584b = k850Var.m144858m().m94834c();
    }

    @Override // p149l.mb20
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C18634c mo112392d(uz5<jze> uz5Var, uc90 uc90Var) {
        return new C18634c(uz5Var, uc90Var);
    }

    /* JADX INFO: renamed from: i */
    public void m158191i(C18634c c18634c, mb20.InterfaceC18431a interfaceC18431a) {
        du2.m113670a("[common][image_net]", "enqueue fetchState = " + c18634c);
        sx3 sx3VarMo144849a = m158194l().mo144849a(c18634c.f137598k);
        c18634c.m218335b().mo155872q(new C18632a(sx3VarMo144849a));
        sx3VarMo144849a.mo96077h(new C18633b(c18634c, interfaceC18431a));
    }

    @Override // p149l.mb20
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo112390a(C18634c c18634c, mb20.InterfaceC18431a interfaceC18431a) {
        du2.m113670a("[common][image_net]", "fetch fetchState = " + c18634c);
        c18634c.f137593f = SystemClock.uptimeMillis();
        c18634c.f137597j = System.currentTimeMillis();
        try {
            stc0 stc0VarM185883b = new stc0.C20027a().m185884c(new zw3.C21791a().m220574d().m220571a()).m185898q(c18634c.m218340g().toString()).m185887f().m185883b();
            rim rimVar = this.f137585c;
            if (rimVar != null) {
                stc0VarM185883b = rimVar.mo102382b(stc0VarM185883b, NetworkTrackInfo.ReportType.MEDIA);
            }
            c18634c.f137598k = stc0VarM185883b;
            m158191i(c18634c, interfaceC18431a);
        } catch (Exception e) {
            rim rimVar2 = this.f137585c;
            if (rimVar2 != null) {
                rimVar2.mo102383c(c18634c.f137598k, e);
                this.f137585c.mo102381a(c18634c.f137598k);
            }
            interfaceC18431a.onFailure(e);
            CrashHelper.m81296c(new Exception("fetch exception:" + e.getMessage(), e));
        }
    }

    @Override // p149l.xp2, p149l.mb20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map<String, String> mo112391c(C18634c c18634c, int i) {
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(c18634c.f137594g - c18634c.f137593f));
        map.put("fetch_time", Long.toString(c18634c.f137595h - c18634c.f137594g));
        map.put("total_time", Long.toString(c18634c.f137595h - c18634c.f137593f));
        map.put("image_size", Integer.toString(i));
        return map;
    }

    /* JADX INFO: renamed from: l */
    public k850 m158194l() {
        k850 k850Var;
        if (!this.f137586d) {
            return this.f137583a;
        }
        synchronized (this) {
            try {
                if (this.f137586d) {
                    du2.m113670a("[common][image_net]", "切换链接池");
                    this.f137583a = this.f137583a.m144867v().m144886g(new gw5()).m144882c();
                    this.f137586d = false;
                }
                k850Var = this.f137583a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return k850Var;
    }

    /* JADX INFO: renamed from: m */
    public void m158195m(C18634c c18634c, sx3 sx3Var, Exception exc, mb20.InterfaceC18431a interfaceC18431a) {
        du2.m113670a("[common][image_net]", "handleException fetchState = " + c18634c);
        rim rimVar = this.f137585c;
        if (rimVar != null) {
            rimVar.mo102383c(sx3Var.request(), exc);
        }
        if (sx3Var.isCanceled()) {
            interfaceC18431a.mo149197a();
        } else if (c18634c.f137596i < 3) {
            m158191i(c18634c, interfaceC18431a);
        } else {
            interfaceC18431a.onFailure(exc);
            NetReporter.reportError(exc);
        }
    }

    @Override // p149l.xp2, p149l.mb20
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo112393e(C18634c c18634c, int i) {
        du2.m113670a("[common][image_net]", "onFetchCompletion fetchState = " + c18634c + "，byteSize=" + i);
        long jUptimeMillis = SystemClock.uptimeMillis();
        c18634c.f137595h = jUptimeMillis;
        try {
            long j = jUptimeMillis - c18634c.f137593f;
            BigDecimal bigDecimal = new BigDecimal(j);
            BigDecimal bigDecimalDivide = new BigDecimal(i).divide(new BigDecimal(1024));
            BigDecimal bigDecimalDivide2 = bigDecimalDivide.divide(bigDecimal.divide(new BigDecimal(1000)), 2, RoundingMode.HALF_UP);
            zgm.m218658a().onNext(zgm.m218659b(bigDecimalDivide2, bigDecimalDivide, j));
            Objects.toString(bigDecimalDivide2);
            bigDecimalDivide.longValue();
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("ImageNetSpeedException:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: o */
    public void m158197o(rim rimVar) {
        this.f137585c = rimVar;
    }

    /* JADX INFO: renamed from: p */
    public void m158198p() {
        this.f137586d = true;
    }
}
