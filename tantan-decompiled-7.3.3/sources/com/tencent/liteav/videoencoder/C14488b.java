package com.tencent.liteav.videoencoder;

import android.opengl.GLES20;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.util.ErrorCode;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.C14203a;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.p093c.C14172b;
import com.tencent.liteav.basic.p094d.C14188c;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.basic.util.C14216g;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.p098b.C14246k;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: com.tencent.liteav.videoencoder.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14488b extends C14203a {

    /* JADX INFO: renamed from: r */
    private static Integer f60890r = 1;

    /* JADX INFO: renamed from: u */
    private static final String f60891u = C14488b.class.getSimpleName();

    /* JADX INFO: renamed from: v */
    private static int f60892v = 0;

    /* JADX INFO: renamed from: e */
    private int f60897e;

    /* JADX INFO: renamed from: j */
    private TXSVideoEncoderParam f60902j;

    /* JADX INFO: renamed from: p */
    private C14172b f60908p;

    /* JADX INFO: renamed from: q */
    private C14216g f60909q;

    /* JADX INFO: renamed from: s */
    private boolean f60910s;

    /* JADX INFO: renamed from: t */
    private C14246k f60911t;

    /* JADX INFO: renamed from: a */
    private C14489c f60893a = null;

    /* JADX INFO: renamed from: b */
    private InterfaceC14490d f60894b = null;

    /* JADX INFO: renamed from: c */
    private WeakReference<InterfaceC14170b> f60895c = null;

    /* JADX INFO: renamed from: d */
    private int f60896d = 0;

    /* JADX INFO: renamed from: f */
    private int f60898f = 1;

    /* JADX INFO: renamed from: g */
    private Timer f60899g = null;

    /* JADX INFO: renamed from: h */
    private TimerTask f60900h = null;

    /* JADX INFO: renamed from: i */
    private LinkedList<Runnable> f60901i = new LinkedList<>();

    /* JADX INFO: renamed from: k */
    private float f60903k = 0.0f;

    /* JADX INFO: renamed from: l */
    private float f60904l = 0.0f;

    /* JADX INFO: renamed from: m */
    private float f60905m = 0.0f;

    /* JADX INFO: renamed from: n */
    private int f60906n = 0;

    /* JADX INFO: renamed from: o */
    private int f60907o = 0;

    /* JADX INFO: renamed from: com.tencent.liteav.videoencoder.b$a */
    public static class a extends TimerTask {

        /* JADX INFO: renamed from: a */
        private WeakReference<C14488b> f60929a;

        public a(C14488b c14488b) {
            this.f60929a = new WeakReference<>(c14488b);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C14488b c14488b;
            WeakReference<C14488b> weakReference = this.f60929a;
            if (weakReference == null || (c14488b = weakReference.get()) == null) {
                return;
            }
            if (c14488b.f60906n < c14488b.f60907o) {
                int[] iArrM84226a = C14215f.m84226a();
                C14488b.m85303k(c14488b);
                c14488b.f60903k += iArrM84226a[0] / 10;
                c14488b.f60904l += iArrM84226a[1] / 10;
                c14488b.f60905m = (float) (((double) c14488b.f60905m) + ((c14488b.m85322c() * 100.0d) / ((double) c14488b.f60902j.fps)));
                return;
            }
            if (C14188c.m84036a().m84063a(c14488b.f60903k / c14488b.f60907o, c14488b.f60904l / c14488b.f60907o, c14488b.f60905m / c14488b.f60907o) && C14188c.m84036a().m84066c() != 0) {
                Monitor.m84161a(2, "VideoEncoder: Insufficient performance, switching software encoding to hardware encoding [appCPU:" + c14488b.f60903k + "][sysCPU:" + c14488b.f60904l + "][fps:" + c14488b.f60905m + "][checkCount:" + c14488b.f60907o + Constants.AES_SUFFIX, "", 0);
                c14488b.m85300h();
            }
            c14488b.m85298g();
        }
    }

    public C14488b(int i) {
        this.f60897e = 2;
        this.f60897e = i;
    }

    /* JADX INFO: renamed from: f */
    private void m85296f() {
        if (this.f60900h == null) {
            this.f60900h = new a(this);
        }
        Timer timer = new Timer();
        this.f60899g = timer;
        timer.schedule(this.f60900h, 1000L, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m85298g() {
        Timer timer = this.f60899g;
        if (timer != null) {
            timer.cancel();
            this.f60899g = null;
        }
        if (this.f60900h != null) {
            this.f60900h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m85300h() {
        m85317a(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.7
            @Override // java.lang.Runnable
            public void run() {
                C14488b.this.m85285a(1107, "Switches from software encoding to hardware encoding");
                if (C14488b.this.f60893a != null) {
                    C14488b.this.f60893a.setListener(null);
                    C14488b.this.f60893a.stop();
                }
                C14488b.this.f60893a = new C14487a();
                C14488b.this.f60898f = 1;
                C14488b c14488b = C14488b.this;
                c14488b.setStatusValue(ErrorCode.CAMEAR_GET_STATUS_FAILED, Long.valueOf(c14488b.f60898f));
                C14488b.this.f60893a.start(C14488b.this.f60902j);
                if (C14488b.this.f60894b != null) {
                    C14488b.this.f60893a.setListener(C14488b.this.f60894b);
                }
                if (C14488b.this.f60896d != 0) {
                    C14488b.this.f60893a.setBitrate(C14488b.this.f60896d);
                }
                C14488b.this.f60893a.setID(C14488b.this.getID());
            }
        });
        TXCLog.m84156w("TXCVideoEncoder", "switchSWToHW");
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m85303k(C14488b c14488b) {
        int i = c14488b.f60906n + 1;
        c14488b.f60906n = i;
        return i;
    }

    /* JADX INFO: renamed from: a */
    public int m85309a(TXSVideoEncoderParam tXSVideoEncoderParam) {
        int iStart;
        this.f60902j = tXSVideoEncoderParam;
        int iM84066c = tXSVideoEncoderParam.enableBlackList ? C14188c.m84036a().m84066c() : 2;
        int i = this.f60897e;
        if (i == 1 && iM84066c != 0) {
            this.f60893a = new C14487a();
            this.f60898f = 1;
            m85286a(1008, "Enables hardware encoding", 1);
        } else if (i == 3 && tXSVideoEncoderParam.width == 720 && tXSVideoEncoderParam.height == 1280 && iM84066c != 0) {
            this.f60893a = new C14487a();
            this.f60898f = 1;
            m85286a(1008, "Enables hardware encoding", 1);
        } else {
            this.f60893a = new TXCSWVideoEncoder();
            this.f60898f = 2;
            m85286a(1008, "Enables software encoding", 2);
        }
        setStatusValue(ErrorCode.CAMEAR_GET_STATUS_FAILED, Long.valueOf(this.f60898f));
        C14489c c14489c = this.f60893a;
        if (c14489c != null) {
            InterfaceC14490d interfaceC14490d = this.f60894b;
            if (interfaceC14490d != null) {
                c14489c.setListener(interfaceC14490d);
            }
            int i2 = this.f60896d;
            if (i2 != 0) {
                this.f60893a.setBitrate(i2);
            }
            this.f60893a.setID(getID());
            iStart = this.f60893a.start(tXSVideoEncoderParam);
            if (iStart != 0) {
                TXCLog.m84152i(f60891u, "start video encode ".concat(this.f60898f == 1 ? "hw" : "sw"));
                return iStart;
            }
        } else {
            iStart = 10000002;
        }
        if (this.f60897e == 3) {
            this.f60903k = 0.0f;
            this.f60904l = 0.0f;
            this.f60905m = 0.0f;
            this.f60906n = 0;
            this.f60907o = C14188c.m84036a().m84068e();
            m85296f();
        }
        return iStart;
    }

    /* JADX INFO: renamed from: b */
    public boolean m85321b(int i, int i2) {
        C14489c c14489c = this.f60893a;
        if (c14489c == null) {
            return false;
        }
        this.f60896d = i;
        c14489c.setBitrateFromQos(i, i2);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public double m85322c() {
        C14489c c14489c = this.f60893a;
        return c14489c != null ? c14489c.getRealFPS() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: d */
    public long m85324d() {
        C14489c c14489c = this.f60893a;
        if (c14489c != null) {
            return c14489c.getRealBitrate();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public int m85326e() {
        C14489c c14489c = this.f60893a;
        if (c14489c != null) {
            return c14489c.getEncodeCost();
        }
        return 0;
    }

    @Override // com.tencent.liteav.basic.module.C14203a
    public void setID(String str) {
        super.setID(str);
        C14489c c14489c = this.f60893a;
        if (c14489c != null) {
            c14489c.setID(str);
        }
        setStatusValue(ErrorCode.CAMEAR_GET_STATUS_FAILED, Long.valueOf(this.f60898f));
    }

    /* JADX INFO: renamed from: e */
    public void m85327e(final int i) {
        m85317a(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.6
            @Override // java.lang.Runnable
            public void run() {
                if (C14488b.this.f60893a != null) {
                    C14488b.this.f60893a.enableNearestRPS(i);
                }
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public boolean m85325d(int i) {
        C14489c c14489c = this.f60893a;
        if (c14489c == null) {
            return false;
        }
        c14489c.setEncodeIdrFpsFromQos(i);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m85323c(int i) {
        this.f60896d = i;
        m85317a(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.5
            @Override // java.lang.Runnable
            public void run() {
                if (C14488b.this.f60893a != null) {
                    C14488b.this.f60893a.setBitrate(C14488b.this.f60896d);
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public boolean m85320b(int i) {
        C14489c c14489c = this.f60893a;
        if (c14489c == null) {
            return false;
        }
        c14489c.setFPS(i);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m85319b() {
        C14489c c14489c = this.f60893a;
        if (c14489c != null) {
            c14489c.restartIDR();
        }
    }

    /* JADX INFO: renamed from: a */
    public EGLContext m85312a(final int i, final int i2) {
        C14216g c14216g;
        if (!this.f60910s) {
            this.f60910s = true;
            synchronized (f60890r) {
                StringBuilder sb = new StringBuilder("CVGLThread");
                Integer num = f60890r;
                f60890r = Integer.valueOf(num.intValue() + 1);
                sb.append(num);
                c14216g = new C14216g(sb.toString());
                this.f60909q = c14216g;
            }
            final boolean[] zArr = new boolean[1];
            c14216g.m84244a(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.1
                @Override // java.lang.Runnable
                public void run() {
                    C14488b.this.f60908p = C14172b.m83898a(null, null, null, i, i2);
                    zArr[0] = C14488b.this.f60908p != null;
                }
            });
            if (zArr[0]) {
                return this.f60908p.m83905d();
            }
            return null;
        }
        C14172b c14172b = this.f60908p;
        if (c14172b != null) {
            return c14172b.m83905d();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m85317a(Runnable runnable) {
        synchronized (this.f60901i) {
            this.f60901i.add(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m85288a(Queue<Runnable> queue) {
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
    public long m85311a(final byte[] bArr, final int i, final int i2, final int i3, final long j) {
        if (this.f60908p == null) {
            return -1L;
        }
        this.f60909q.m84246b(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.2
            @Override // java.lang.Runnable
            public void run() {
                if (C14488b.this.f60911t == null || C14488b.this.f60911t.m83999n() != i2 || C14488b.this.f60911t.m84000o() != i3) {
                    if (C14488b.this.f60911t != null) {
                        C14488b.this.f60911t.mo83989d();
                        C14488b.this.f60911t = null;
                    }
                    C14488b.this.f60911t = new C14246k(i);
                    boolean zMo83979a = C14488b.this.f60911t.mo83979a();
                    C14488b c14488b = C14488b.this;
                    if (!zMo83979a) {
                        if (c14488b.f60908p != null) {
                            C14488b.this.f60908p.m83904c();
                            C14488b.this.f60908p = null;
                        }
                        C14488b.this.f60911t = null;
                        return;
                    }
                    c14488b.f60911t.m83976a(true);
                    C14488b.this.f60911t.mo83969a(i2, i3);
                }
                C14488b.this.f60911t.m84320a(bArr);
                GLES20.glViewport(0, 0, i2, i3);
                int iM84321q = C14488b.this.f60911t.m84321q();
                GLES20.glFlush();
                C14488b.this.m85310a(iM84321q, i2, i3, j);
            }
        });
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public void m85313a() {
        C14216g c14216g = this.f60909q;
        if (c14216g != null) {
            final C14172b c14172b = this.f60908p;
            c14216g.m84246b(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.3
                @Override // java.lang.Runnable
                public void run() {
                    C14488b.this.f60901i.clear();
                    if (C14488b.this.f60893a != null) {
                        C14488b.this.f60893a.stop();
                    }
                    if (C14488b.this.f60911t != null) {
                        C14488b.this.f60911t.mo83989d();
                        C14488b.this.f60911t = null;
                    }
                    C14172b c14172b2 = c14172b;
                    if (c14172b2 != null) {
                        c14172b2.m83904c();
                    }
                }
            });
            this.f60909q = null;
            this.f60908p = null;
        } else {
            this.f60901i.clear();
            C14489c c14489c = this.f60893a;
            if (c14489c != null) {
                c14489c.stop();
            }
        }
        if (this.f60897e == 3) {
            this.f60903k = 0.0f;
            this.f60904l = 0.0f;
            this.f60905m = 0.0f;
            this.f60906n = 0;
            m85298g();
        }
        this.f60894b = null;
        this.f60896d = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m85314a(int i) {
        C14489c c14489c = this.f60893a;
        if (c14489c != null) {
            c14489c.setRotation(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85318a(boolean z) {
        C14489c c14489c = this.f60893a;
        if (c14489c != null) {
            c14489c.setXMirror(z);
        }
    }

    /* JADX INFO: renamed from: a */
    public long m85310a(int i, int i2, int i3, long j) {
        while (m85288a(this.f60901i)) {
        }
        if (this.f60893a == null) {
            return 10000002L;
        }
        setStatusValue(4002, Long.valueOf(m85324d()));
        setStatusValue(4001, this.f60902j.streamType, Double.valueOf(m85322c()));
        if (this.f60898f == 1) {
            setStatusValue(8002, this.f60902j.streamType, Integer.valueOf(m85326e()));
        }
        return this.f60893a.pushVideoFrame(i, i2, i3, j);
    }

    /* JADX INFO: renamed from: a */
    public void m85315a(InterfaceC14170b interfaceC14170b) {
        this.f60895c = new WeakReference<>(interfaceC14170b);
    }

    /* JADX INFO: renamed from: a */
    public void m85316a(InterfaceC14490d interfaceC14490d) {
        this.f60894b = interfaceC14490d;
        m85317a(new Runnable() { // from class: com.tencent.liteav.videoencoder.b.4
            @Override // java.lang.Runnable
            public void run() {
                if (C14488b.this.f60893a != null) {
                    C14488b.this.f60893a.setListener(C14488b.this.f60894b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m85285a(int i, String str) {
        InterfaceC14170b interfaceC14170b;
        WeakReference<InterfaceC14170b> weakReference = this.f60895c;
        if (weakReference == null || (interfaceC14170b = weakReference.get()) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("EVT_ID", i);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str);
        interfaceC14170b.onNotifyEvent(i, bundle);
    }

    /* JADX INFO: renamed from: a */
    private void m85286a(int i, String str, int i2) {
        InterfaceC14170b interfaceC14170b;
        WeakReference<InterfaceC14170b> weakReference = this.f60895c;
        if (weakReference == null || (interfaceC14170b = weakReference.get()) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("EVT_ID", i);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str);
        bundle.putInt("EVT_PARAM1", i2);
        interfaceC14170b.onNotifyEvent(i, bundle);
    }
}
