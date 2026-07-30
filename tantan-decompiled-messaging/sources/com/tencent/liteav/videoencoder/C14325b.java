package com.tencent.liteav.videoencoder;

import android.opengl.GLES20;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.util.ErrorCode;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.C14040a;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.p088c.C14009b;
import com.tencent.liteav.basic.p089d.C14025c;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.basic.util.C14053g;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.p093b.C14083k;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: com.tencent.liteav.videoencoder.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14325b extends C14040a {

    /* JADX INFO: renamed from: r */
    private static Integer f60042r = 1;

    /* JADX INFO: renamed from: u */
    private static final String f60043u = C14325b.class.getSimpleName();

    /* JADX INFO: renamed from: v */
    private static int f60044v = 0;

    /* JADX INFO: renamed from: e */
    private int f60049e;

    /* JADX INFO: renamed from: j */
    private TXSVideoEncoderParam f60054j;

    /* JADX INFO: renamed from: p */
    private C14009b f60060p;

    /* JADX INFO: renamed from: q */
    private C14053g f60061q;

    /* JADX INFO: renamed from: s */
    private boolean f60062s;

    /* JADX INFO: renamed from: t */
    private C14083k f60063t;

    /* JADX INFO: renamed from: a */
    private C14326c f60045a = null;

    /* JADX INFO: renamed from: b */
    private InterfaceC14327d f60046b = null;

    /* JADX INFO: renamed from: c */
    private WeakReference<InterfaceC14007b> f60047c = null;

    /* JADX INFO: renamed from: d */
    private int f60048d = 0;

    /* JADX INFO: renamed from: f */
    private int f60050f = 1;

    /* JADX INFO: renamed from: g */
    private Timer f60051g = null;

    /* JADX INFO: renamed from: h */
    private TimerTask f60052h = null;

    /* JADX INFO: renamed from: i */
    private LinkedList<Runnable> f60053i = new LinkedList<>();

    /* JADX INFO: renamed from: k */
    private float f60055k = 0.0f;

    /* JADX INFO: renamed from: l */
    private float f60056l = 0.0f;

    /* JADX INFO: renamed from: m */
    private float f60057m = 0.0f;

    /* JADX INFO: renamed from: n */
    private int f60058n = 0;

    /* JADX INFO: renamed from: o */
    private int f60059o = 0;

    /* JADX INFO: renamed from: com.tencent.liteav.videoencoder.b$a */
    public static class a extends TimerTask {

        /* JADX INFO: renamed from: a */
        private WeakReference<C14325b> f60081a;

        public a(C14325b c14325b) {
            this.f60081a = new WeakReference<>(c14325b);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C14325b c14325b;
            WeakReference<C14325b> weakReference = this.f60081a;
            if (weakReference == null || (c14325b = weakReference.get()) == null) {
                return;
            }
            if (c14325b.f60058n < c14325b.f60059o) {
                int[] iArrM83043a = C14052f.m83043a();
                C14325b.m84120k(c14325b);
                c14325b.f60055k += iArrM83043a[0] / 10;
                c14325b.f60056l += iArrM83043a[1] / 10;
                c14325b.f60057m = (float) (((double) c14325b.f60057m) + ((c14325b.m84139c() * 100.0d) / ((double) c14325b.f60054j.fps)));
                return;
            }
            if (C14025c.m82853a().m82880a(c14325b.f60055k / c14325b.f60059o, c14325b.f60056l / c14325b.f60059o, c14325b.f60057m / c14325b.f60059o) && C14025c.m82853a().m82883c() != 0) {
                Monitor.m82978a(2, "VideoEncoder: Insufficient performance, switching software encoding to hardware encoding [appCPU:" + c14325b.f60055k + "][sysCPU:" + c14325b.f60056l + "][fps:" + c14325b.f60057m + "][checkCount:" + c14325b.f60059o + Constants.AES_SUFFIX, "", 0);
                c14325b.m84117h();
            }
            c14325b.m84115g();
        }
    }

    public C14325b(int i) {
        this.f60049e = 2;
        this.f60049e = i;
    }

    /* JADX INFO: renamed from: f */
    private void m84113f() {
        if (this.f60052h == null) {
            this.f60052h = new a(this);
        }
        Timer timer = new Timer();
        this.f60051g = timer;
        timer.schedule(this.f60052h, 1000L, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m84115g() {
        Timer timer = this.f60051g;
        if (timer != null) {
            timer.cancel();
            this.f60051g = null;
        }
        if (this.f60052h != null) {
            this.f60052h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m84117h() {
        m84134a(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.7
            @Override // java.lang.Runnable
            public void run() {
                C14325b.this.m84102a(1107, "Switches from software encoding to hardware encoding");
                if (C14325b.this.f60045a != null) {
                    C14325b.this.f60045a.setListener(null);
                    C14325b.this.f60045a.stop();
                }
                C14325b.this.f60045a = new C14324a();
                C14325b.this.f60050f = 1;
                C14325b c14325b = C14325b.this;
                c14325b.setStatusValue(ErrorCode.CAMEAR_GET_STATUS_FAILED, Long.valueOf(c14325b.f60050f));
                C14325b.this.f60045a.start(C14325b.this.f60054j);
                if (C14325b.this.f60046b != null) {
                    C14325b.this.f60045a.setListener(C14325b.this.f60046b);
                }
                if (C14325b.this.f60048d != 0) {
                    C14325b.this.f60045a.setBitrate(C14325b.this.f60048d);
                }
                C14325b.this.f60045a.setID(C14325b.this.getID());
            }
        });
        TXCLog.m82973w("TXCVideoEncoder", "switchSWToHW");
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m84120k(C14325b c14325b) {
        int i = c14325b.f60058n + 1;
        c14325b.f60058n = i;
        return i;
    }

    /* JADX INFO: renamed from: a */
    public int m84126a(TXSVideoEncoderParam tXSVideoEncoderParam) {
        int iStart;
        this.f60054j = tXSVideoEncoderParam;
        int iM82883c = tXSVideoEncoderParam.enableBlackList ? C14025c.m82853a().m82883c() : 2;
        int i = this.f60049e;
        if (i == 1 && iM82883c != 0) {
            this.f60045a = new C14324a();
            this.f60050f = 1;
            m84103a(1008, "Enables hardware encoding", 1);
        } else if (i == 3 && tXSVideoEncoderParam.width == 720 && tXSVideoEncoderParam.height == 1280 && iM82883c != 0) {
            this.f60045a = new C14324a();
            this.f60050f = 1;
            m84103a(1008, "Enables hardware encoding", 1);
        } else {
            this.f60045a = new TXCSWVideoEncoder();
            this.f60050f = 2;
            m84103a(1008, "Enables software encoding", 2);
        }
        setStatusValue(ErrorCode.CAMEAR_GET_STATUS_FAILED, Long.valueOf(this.f60050f));
        C14326c c14326c = this.f60045a;
        if (c14326c != null) {
            InterfaceC14327d interfaceC14327d = this.f60046b;
            if (interfaceC14327d != null) {
                c14326c.setListener(interfaceC14327d);
            }
            int i2 = this.f60048d;
            if (i2 != 0) {
                this.f60045a.setBitrate(i2);
            }
            this.f60045a.setID(getID());
            iStart = this.f60045a.start(tXSVideoEncoderParam);
            if (iStart != 0) {
                TXCLog.m82969i(f60043u, "start video encode ".concat(this.f60050f == 1 ? "hw" : "sw"));
                return iStart;
            }
        } else {
            iStart = 10000002;
        }
        if (this.f60049e == 3) {
            this.f60055k = 0.0f;
            this.f60056l = 0.0f;
            this.f60057m = 0.0f;
            this.f60058n = 0;
            this.f60059o = C14025c.m82853a().m82885e();
            m84113f();
        }
        return iStart;
    }

    /* JADX INFO: renamed from: b */
    public boolean m84138b(int i, int i2) {
        C14326c c14326c = this.f60045a;
        if (c14326c == null) {
            return false;
        }
        this.f60048d = i;
        c14326c.setBitrateFromQos(i, i2);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public double m84139c() {
        C14326c c14326c = this.f60045a;
        return c14326c != null ? c14326c.getRealFPS() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: d */
    public long m84141d() {
        C14326c c14326c = this.f60045a;
        if (c14326c != null) {
            return c14326c.getRealBitrate();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public int m84143e() {
        C14326c c14326c = this.f60045a;
        if (c14326c != null) {
            return c14326c.getEncodeCost();
        }
        return 0;
    }

    @Override // com.tencent.liteav.basic.module.C14040a
    public void setID(String str) {
        super.setID(str);
        C14326c c14326c = this.f60045a;
        if (c14326c != null) {
            c14326c.setID(str);
        }
        setStatusValue(ErrorCode.CAMEAR_GET_STATUS_FAILED, Long.valueOf(this.f60050f));
    }

    /* JADX INFO: renamed from: e */
    public void m84144e(final int i) {
        m84134a(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.6
            @Override // java.lang.Runnable
            public void run() {
                if (C14325b.this.f60045a != null) {
                    C14325b.this.f60045a.enableNearestRPS(i);
                }
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public boolean m84142d(int i) {
        C14326c c14326c = this.f60045a;
        if (c14326c == null) {
            return false;
        }
        c14326c.setEncodeIdrFpsFromQos(i);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m84140c(int i) {
        this.f60048d = i;
        m84134a(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.5
            @Override // java.lang.Runnable
            public void run() {
                if (C14325b.this.f60045a != null) {
                    C14325b.this.f60045a.setBitrate(C14325b.this.f60048d);
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public boolean m84137b(int i) {
        C14326c c14326c = this.f60045a;
        if (c14326c == null) {
            return false;
        }
        c14326c.setFPS(i);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m84136b() {
        C14326c c14326c = this.f60045a;
        if (c14326c != null) {
            c14326c.restartIDR();
        }
    }

    /* JADX INFO: renamed from: a */
    public EGLContext m84129a(final int i, final int i2) {
        C14053g c14053g;
        if (!this.f60062s) {
            this.f60062s = true;
            synchronized (f60042r) {
                StringBuilder sb = new StringBuilder("CVGLThread");
                Integer num = f60042r;
                f60042r = Integer.valueOf(num.intValue() + 1);
                sb.append(num);
                c14053g = new C14053g(sb.toString());
                this.f60061q = c14053g;
            }
            final boolean[] zArr = new boolean[1];
            c14053g.m83061a(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.1
                @Override // java.lang.Runnable
                public void run() {
                    C14325b.this.f60060p = C14009b.m82715a(null, null, null, i, i2);
                    zArr[0] = C14325b.this.f60060p != null;
                }
            });
            if (zArr[0]) {
                return this.f60060p.m82722d();
            }
            return null;
        }
        C14009b c14009b = this.f60060p;
        if (c14009b != null) {
            return c14009b.m82722d();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m84134a(Runnable runnable) {
        synchronized (this.f60053i) {
            this.f60053i.add(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m84105a(Queue<Runnable> queue) {
        synchronized (queue) {
            try {
                if (queue.isEmpty()) {
                    return false;
                }
                Runnable runnablePoll = queue.poll();
                if (runnablePoll == null) {
                    return false;
                }
                runnablePoll.run();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public long m84128a(final byte[] bArr, final int i, final int i2, final int i3, final long j) {
        if (this.f60060p == null) {
            return -1L;
        }
        this.f60061q.m83063b(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.2
            @Override // java.lang.Runnable
            public void run() {
                if (C14325b.this.f60063t == null || C14325b.this.f60063t.m82816n() != i2 || C14325b.this.f60063t.m82817o() != i3) {
                    if (C14325b.this.f60063t != null) {
                        C14325b.this.f60063t.mo82806d();
                        C14325b.this.f60063t = null;
                    }
                    C14325b.this.f60063t = new C14083k(i);
                    boolean zMo82796a = C14325b.this.f60063t.mo82796a();
                    C14325b c14325b = C14325b.this;
                    if (!zMo82796a) {
                        if (c14325b.f60060p != null) {
                            C14325b.this.f60060p.m82721c();
                            C14325b.this.f60060p = null;
                        }
                        C14325b.this.f60063t = null;
                        return;
                    }
                    c14325b.f60063t.m82793a(true);
                    C14325b.this.f60063t.mo82786a(i2, i3);
                }
                C14325b.this.f60063t.m83137a(bArr);
                GLES20.glViewport(0, 0, i2, i3);
                int iM83138q = C14325b.this.f60063t.m83138q();
                GLES20.glFlush();
                C14325b.this.m84127a(iM83138q, i2, i3, j);
            }
        });
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public void m84130a() {
        C14053g c14053g = this.f60061q;
        if (c14053g != null) {
            final C14009b c14009b = this.f60060p;
            c14053g.m83063b(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.3
                @Override // java.lang.Runnable
                public void run() {
                    C14325b.this.f60053i.clear();
                    if (C14325b.this.f60045a != null) {
                        C14325b.this.f60045a.stop();
                    }
                    if (C14325b.this.f60063t != null) {
                        C14325b.this.f60063t.mo82806d();
                        C14325b.this.f60063t = null;
                    }
                    C14009b c14009b2 = c14009b;
                    if (c14009b2 != null) {
                        c14009b2.m82721c();
                    }
                }
            });
            this.f60061q = null;
            this.f60060p = null;
        } else {
            this.f60053i.clear();
            C14326c c14326c = this.f60045a;
            if (c14326c != null) {
                c14326c.stop();
            }
        }
        if (this.f60049e == 3) {
            this.f60055k = 0.0f;
            this.f60056l = 0.0f;
            this.f60057m = 0.0f;
            this.f60058n = 0;
            m84115g();
        }
        this.f60046b = null;
        this.f60048d = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m84131a(int i) {
        C14326c c14326c = this.f60045a;
        if (c14326c != null) {
            c14326c.setRotation(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84135a(boolean z) {
        C14326c c14326c = this.f60045a;
        if (c14326c != null) {
            c14326c.setXMirror(z);
        }
    }

    /* JADX INFO: renamed from: a */
    public long m84127a(int i, int i2, int i3, long j) {
        while (m84105a(this.f60053i)) {
        }
        if (this.f60045a == null) {
            return 10000002L;
        }
        setStatusValue(4002, Long.valueOf(m84141d()));
        setStatusValue(4001, this.f60054j.streamType, Double.valueOf(m84139c()));
        if (this.f60050f == 1) {
            setStatusValue(8002, this.f60054j.streamType, Integer.valueOf(m84143e()));
        }
        return this.f60045a.pushVideoFrame(i, i2, i3, j);
    }

    /* JADX INFO: renamed from: a */
    public void m84132a(InterfaceC14007b interfaceC14007b) {
        this.f60047c = new WeakReference<>(interfaceC14007b);
    }

    /* JADX INFO: renamed from: a */
    public void m84133a(InterfaceC14327d interfaceC14327d) {
        this.f60046b = interfaceC14327d;
        m84134a(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.4
            @Override // java.lang.Runnable
            public void run() {
                if (C14325b.this.f60045a != null) {
                    C14325b.this.f60045a.setListener(C14325b.this.f60046b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m84102a(int i, String str) {
        InterfaceC14007b interfaceC14007b;
        WeakReference<InterfaceC14007b> weakReference = this.f60047c;
        if (weakReference == null || (interfaceC14007b = weakReference.get()) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("EVT_ID", i);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str);
        interfaceC14007b.onNotifyEvent(i, bundle);
    }

    /* JADX INFO: renamed from: a */
    private void m84103a(int i, String str, int i2) {
        InterfaceC14007b interfaceC14007b;
        WeakReference<InterfaceC14007b> weakReference = this.f60047c;
        if (weakReference == null || (interfaceC14007b = weakReference.get()) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("EVT_ID", i);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str);
        bundle.putInt("EVT_PARAM1", i2);
        interfaceC14007b.onNotifyEvent(i, bundle);
    }
}
