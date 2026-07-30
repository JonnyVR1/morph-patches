package p007l;

import android.os.Looper;
import android.os.SystemClock;
import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;
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
import l.du2;
import l.exc0;
import l.gw5;
import l.gxc0;
import l.jze;
import l.k850;
import l.mb20;
import l.nq2;
import l.stc0;
import l.sx3;
import l.tsf;
import l.uc90;
import l.uz5;
import l.x74;
import l.xp2;
import l.zei;
import l.zw3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class n850 extends xp2<C0620c> {

    /* JADX INFO: renamed from: a */
    public k850 f3346a;

    /* JADX INFO: renamed from: b */
    public Executor f3347b;

    /* JADX INFO: renamed from: c */
    public rim f3348c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f3349d;

    /* JADX INFO: renamed from: l.n850$a */
    public class C0618a extends nq2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ sx3 f3350a;

        /* JADX INFO: renamed from: l.n850$a$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0618a.this.f3350a.cancel();
            }
        }

        public C0618a(sx3 sx3Var) {
            this.f3350a = sx3Var;
        }

        /* JADX INFO: renamed from: b */
        public void m9967b() {
            if (this.f3350a.isCanceled()) {
                return;
            }
            du2.a("[common][image_net]", "onCancellationRequested url = " + this.f3350a.request().k());
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f3350a.cancel();
            } else {
                n850.this.f3347b.execute(new a());
            }
        }
    }

    /* JADX INFO: renamed from: l.n850$b */
    public class C0619b implements x74 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0620c f3353a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ mb20.a f3354b;

        public C0619b(C0620c c0620c, mb20.a aVar) {
            this.f3353a = c0620c;
            this.f3354b = aVar;
        }

        public void onFailure(sx3 sx3Var, IOException iOException) {
            du2.a("[common][image_net]", "onFailure url = " + sx3Var.request().k() + ", exception = " + iOException);
            try {
                C0620c c0620c = this.f3353a;
                c0620c.f3359i++;
                n850.this.m9963m(c0620c, sx3Var, iOException, this.f3354b);
            } finally {
                if (n850.this.f3348c != null) {
                    if (sx3Var.isCanceled()) {
                        n850.this.f3348c.requestCancel(sx3Var.request());
                    }
                    n850.this.f3348c.m10558a(sx3Var.request());
                }
            }
        }

        public void onResponse(sx3 sx3Var, exc0 exc0Var) {
            du2.a("[common][image_net]", "onResponse url = " + sx3Var.request().k() + ", response = " + exc0Var);
            this.f3353a.f3357g = SystemClock.uptimeMillis();
            gxc0 gxc0VarK = exc0Var.k();
            try {
                try {
                    if (!exc0Var.I()) {
                        C0620c c0620c = this.f3353a;
                        c0620c.f3359i += 3;
                        n850.this.m9963m(c0620c, sx3Var, new IOException("Unexpected HTTP code " + exc0Var.q()), this.f3354b);
                        if (n850.this.f3348c != null) {
                            n850.this.f3348c.m10558a(sx3Var.request());
                        }
                        try {
                            gxc0VarK.close();
                            return;
                        } catch (RuntimeException e) {
                            CrashHelper.c(e);
                            tsf.y("OkHttpNetworkFetchProducer", "Exception when closing response body", e);
                            return;
                        }
                    }
                    long jContentLength = gxc0VarK.contentLength();
                    if (jContentLength < 0) {
                        jContentLength = 0;
                    }
                    try {
                        this.f3354b.b(gxc0VarK.byteStream(), (int) jContentLength);
                    } catch (Exception e2) {
                        C0620c c0620c2 = this.f3353a;
                        c0620c2.f3359i += 3;
                        n850.this.m9963m(c0620c2, sx3Var, e2, this.f3354b);
                    }
                    if (n850.this.f3348c != null) {
                        n850.this.f3348c.m10558a(sx3Var.request());
                    }
                    try {
                        gxc0VarK.close();
                    } catch (RuntimeException e3) {
                        CrashHelper.c(e3);
                        tsf.y("OkHttpNetworkFetchProducer", "Exception when closing response body", e3);
                    }
                } catch (Throwable th) {
                    if (n850.this.f3348c != null) {
                        n850.this.f3348c.m10558a(sx3Var.request());
                    }
                    try {
                        gxc0VarK.close();
                    } catch (RuntimeException e4) {
                        CrashHelper.c(e4);
                        tsf.y("OkHttpNetworkFetchProducer", "Exception when closing response body", e4);
                    }
                    throw th;
                }
            } catch (Exception e5) {
                CrashHelper.c(e5);
                C0620c c0620c3 = this.f3353a;
                c0620c3.f3359i += 3;
                n850.this.m9963m(c0620c3, sx3Var, e5, this.f3354b);
                if (n850.this.f3348c != null) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.n850$c */
    public static class C0620c extends zei {

        /* JADX INFO: renamed from: f */
        public long f3356f;

        /* JADX INFO: renamed from: g */
        public long f3357g;

        /* JADX INFO: renamed from: h */
        public long f3358h;

        /* JADX INFO: renamed from: i */
        public int f3359i;

        /* JADX INFO: renamed from: j */
        public long f3360j;

        /* JADX INFO: renamed from: k */
        public stc0 f3361k;

        public C0620c(uz5<jze> uz5Var, uc90 uc90Var) {
            super(uz5Var, uc90Var);
            this.f3359i = 0;
        }

        public String toString() {
            return "OkHttpNetworkFetchState{submitTime=" + this.f3356f + ", responseTime=" + this.f3357g + ", fetchCompleteTime=" + this.f3358h + ", retryCount=" + this.f3359i + ", startTimestamp=" + this.f3360j + ", request=" + this.f3361k + '}';
        }
    }

    public n850(k850 k850Var) {
        this.f3346a = k850Var;
        this.f3347b = k850Var.m().c();
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0620c m9956d(uz5<jze> uz5Var, uc90 uc90Var) {
        return new C0620c(uz5Var, uc90Var);
    }

    /* JADX INFO: renamed from: i */
    public void m9959i(C0620c c0620c, mb20.a aVar) {
        du2.a("[common][image_net]", "enqueue fetchState = " + c0620c);
        sx3 sx3VarA = m9962l().a(c0620c.f3361k);
        c0620c.b().q(new C0618a(sx3VarA));
        sx3VarA.h(new C0619b(c0620c, aVar));
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m9954a(C0620c c0620c, mb20.a aVar) {
        du2.a("[common][image_net]", "fetch fetchState = " + c0620c);
        c0620c.f3356f = SystemClock.uptimeMillis();
        c0620c.f3360j = System.currentTimeMillis();
        try {
            stc0 stc0VarB = new stc0.a().c(new zw3.a().d().a()).q(c0620c.g().toString()).f().b();
            rim rimVar = this.f3348c;
            if (rimVar != null) {
                stc0VarB = rimVar.m10559b(stc0VarB, NetworkTrackInfo.ReportType.MEDIA);
            }
            c0620c.f3361k = stc0VarB;
            m9959i(c0620c, aVar);
        } catch (Exception e) {
            rim rimVar2 = this.f3348c;
            if (rimVar2 != null) {
                rimVar2.m10560c(c0620c.f3361k, e);
                this.f3348c.m10558a(c0620c.f3361k);
            }
            aVar.onFailure(e);
            CrashHelper.c(new Exception("fetch exception:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map<String, String> m9955c(C0620c c0620c, int i) {
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(c0620c.f3357g - c0620c.f3356f));
        map.put("fetch_time", Long.toString(c0620c.f3358h - c0620c.f3357g));
        map.put("total_time", Long.toString(c0620c.f3358h - c0620c.f3356f));
        map.put("image_size", Integer.toString(i));
        return map;
    }

    /* JADX INFO: renamed from: l */
    public k850 m9962l() {
        k850 k850Var;
        if (!this.f3349d) {
            return this.f3346a;
        }
        synchronized (this) {
            try {
                if (this.f3349d) {
                    du2.a("[common][image_net]", "切换链接池");
                    this.f3346a = this.f3346a.v().g(new gw5()).c();
                    this.f3349d = false;
                }
                k850Var = this.f3346a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return k850Var;
    }

    /* JADX INFO: renamed from: m */
    public void m9963m(C0620c c0620c, sx3 sx3Var, Exception exc, mb20.a aVar) {
        du2.a("[common][image_net]", "handleException fetchState = " + c0620c);
        rim rimVar = this.f3348c;
        if (rimVar != null) {
            rimVar.m10560c(sx3Var.request(), exc);
        }
        if (sx3Var.isCanceled()) {
            aVar.a();
        } else if (c0620c.f3359i < 3) {
            m9959i(c0620c, aVar);
        } else {
            aVar.onFailure(exc);
            NetReporter.reportError(exc);
        }
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m9957e(C0620c c0620c, int i) {
        du2.a("[common][image_net]", "onFetchCompletion fetchState = " + c0620c + "，byteSize=" + i);
        long jUptimeMillis = SystemClock.uptimeMillis();
        c0620c.f3358h = jUptimeMillis;
        try {
            long j = jUptimeMillis - c0620c.f3356f;
            BigDecimal bigDecimal = new BigDecimal(j);
            BigDecimal bigDecimalDivide = new BigDecimal(i).divide(new BigDecimal(1024));
            BigDecimal bigDecimalDivide2 = bigDecimalDivide.divide(bigDecimal.divide(new BigDecimal(LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE)), 2, RoundingMode.HALF_UP);
            zgm.m12006a().onNext(zgm.m12007b(bigDecimalDivide2, bigDecimalDivide, j));
            Objects.toString(bigDecimalDivide2);
            bigDecimalDivide.longValue();
        } catch (Exception e) {
            CrashHelper.c(new Exception("ImageNetSpeedException:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: o */
    public void m9965o(rim rimVar) {
        this.f3348c = rimVar;
    }

    /* JADX INFO: renamed from: p */
    public void m9966p() {
        this.f3349d = true;
    }
}
