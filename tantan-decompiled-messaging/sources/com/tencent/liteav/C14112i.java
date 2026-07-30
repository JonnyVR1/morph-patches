package com.tencent.liteav;

import android.content.Context;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.p086a.EnumC14005c;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.structs.C14042b;
import com.tencent.liteav.basic.util.C14050d;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.screencapture.C14189a;
import com.tencent.liteav.screencapture.InterfaceC14190b;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: com.tencent.liteav.i */
/* JADX INFO: loaded from: classes2.dex */
public class C14112i implements InterfaceC14114k, InterfaceC14190b {

    /* JADX INFO: renamed from: a */
    private final C14189a f59352a;

    /* JADX INFO: renamed from: b */
    private InterfaceC14115l f59353b;

    /* JADX INFO: renamed from: e */
    private int f59356e;

    /* JADX INFO: renamed from: f */
    private C14050d f59357f;

    /* JADX INFO: renamed from: g */
    private int f59358g;

    /* JADX INFO: renamed from: h */
    private int f59359h;

    /* JADX INFO: renamed from: k */
    private long f59362k;

    /* JADX INFO: renamed from: l */
    private long f59363l;

    /* JADX INFO: renamed from: m */
    private long f59364m;

    /* JADX INFO: renamed from: n */
    private boolean f59365n;

    /* JADX INFO: renamed from: c */
    private EGLContext f59354c = null;

    /* JADX INFO: renamed from: d */
    private WeakReference<InterfaceC14007b> f59355d = null;

    /* JADX INFO: renamed from: i */
    private String f59360i = "";

    /* JADX INFO: renamed from: j */
    private int f59361j = 0;

    /* JADX INFO: renamed from: o */
    private final Queue<Runnable> f59366o = new LinkedList();

    public C14112i(Context context, C14110g c14110g, C14189a.a aVar) {
        C14189a c14189a = new C14189a(context, c14110g.f59301V, aVar);
        this.f59352a = c14189a;
        c14189a.m83974a((InterfaceC14190b) this);
        c14110g.m83597a();
        C14050d c14050dM83599c = m83599c(c14110g.f59305a, c14110g.f59306b);
        this.f59357f = c14050dM83599c;
        this.f59356e = c14110g.f59312h;
        int i = c14110g.f59305a;
        this.f59358g = i;
        this.f59359h = c14110g.f59306b;
        TXCLog.m82970i("TXCScreenCaptureSource", "capture size: %s, encode size: %dx%d", c14050dM83599c, Integer.valueOf(i), Integer.valueOf(this.f59359h));
    }

    /* JADX INFO: renamed from: c */
    private C14050d m83599c(int i, int i2) {
        boolean z = i > i2;
        C14050d c14050d = new C14050d();
        int i3 = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
        if (i > 1280 || i2 > 1280) {
            c14050d.f58502a = z ? Math.max(i, i2) : Math.min(i, i2);
            c14050d.f58503b = z ? Math.min(i, i2) : Math.max(i, i2);
            return c14050d;
        }
        c14050d.f58502a = z ? 1280 : 720;
        if (z) {
            i3 = 720;
        }
        c14050d.f58503b = i3;
        return c14050d;
    }

    /* JADX INFO: renamed from: f */
    private void m83600f(boolean z) {
        int i = this.f59358g;
        if (z) {
            int i2 = this.f59359h;
            if (i > i2) {
                mo83348b(i2, i);
                return;
            }
            return;
        }
        int i3 = this.f59359h;
        if (i < i3) {
            mo83348b(i3, i);
        }
    }

    @Override // com.tencent.liteav.screencapture.InterfaceC14190b
    /* JADX INFO: renamed from: a */
    public void mo83601a(int i, EGLContext eGLContext, int i2, int i3, int i4, long j) {
        this.f59354c = eGLContext;
        while (m83598a(this.f59366o)) {
        }
        if (i != 0) {
            TXCLog.m82966e("TXCScreenCaptureSource", "onScreenCaptureFrame failed");
            return;
        }
        if (this.f59365n) {
            this.f59365n = false;
            Monitor.m82978a(2, String.format("VideoCapture[%d]: capture first frame", Integer.valueOf(hashCode())), "", 0);
            C14052f.m83036a(this.f59355d, 1007, "First frame capture completed");
            TXCLog.m82969i("TXCScreenCaptureSource", "on Got first frame");
        }
        this.f59362k++;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f59363l;
        if (jCurrentTimeMillis >= 1000) {
            long j2 = this.f59362k;
            double d = ((j2 - this.f59364m) * 1000.0d) / jCurrentTimeMillis;
            this.f59364m = j2;
            this.f59363l = System.currentTimeMillis();
            TXCStatus.m82994a(this.f59360i, 1001, this.f59361j, Double.valueOf(d));
        }
        if (this.f59353b != null) {
            m83600f(i3 < i4);
            C14042b c14042b = new C14042b();
            c14042b.f58466e = i3;
            c14042b.f58467f = i4;
            int i5 = this.f59358g;
            c14042b.f58468g = i5;
            int i6 = this.f59359h;
            c14042b.f58469h = i6;
            c14042b.f58462a = i2;
            c14042b.f58463b = 0;
            c14042b.f58471j = 0;
            c14042b.f58473l = C14052f.m83034a(i3, i4, i5, i6);
            this.f59353b.mo83486b(c14042b);
        }
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: b */
    public void mo83349b(boolean z) {
        C14050d c14050dM83599c = m83599c(this.f59358g, this.f59359h);
        if (c14050dM83599c.equals(this.f59357f)) {
            return;
        }
        this.f59357f = c14050dM83599c;
        this.f59352a.m83969a(c14050dM83599c.f58502a, c14050dM83599c.f58503b);
        TXCLog.m82970i("TXCScreenCaptureSource", "capture size: %s, encode size: %dx%d", this.f59357f, Integer.valueOf(this.f59358g), Integer.valueOf(this.f59359h));
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: d */
    public boolean mo83354d() {
        return true;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: e */
    public int mo83356e() {
        return 0;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: g */
    public int mo83361g() {
        return this.f59356e;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: h */
    public boolean mo83363h() {
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: i */
    public boolean mo83364i() {
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: j */
    public boolean mo83365j() {
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: k */
    public boolean mo83366k() {
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: l */
    public boolean mo83367l() {
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: d */
    public void mo83353d(int i) {
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: e */
    public void mo83357e(int i) {
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: d */
    public boolean mo83355d(boolean z) {
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: e */
    public void mo83358e(boolean z) {
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: g */
    public void mo83362g(int i) {
        this.f59361j = i;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: f */
    public void mo83360f(int i) {
        this.f59356e = i;
        this.f59352a.m83968a(i);
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: f */
    public EGLContext mo83359f() {
        return this.f59354c;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: b */
    public void mo83346b() {
        this.f59352a.m83977a(true);
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: b */
    public void mo83347b(int i) {
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: b */
    public void mo83348b(int i, int i2) {
        this.f59358g = i;
        this.f59359h = i2;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: c */
    public void mo83352c(boolean z) {
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: c */
    public void mo83351c(int i) {
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: c */
    public void mo83350c() {
        this.f59352a.m83977a(false);
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83336a(int i, int i2) {
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83337a(EnumC14005c enumC14005c) {
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83339a(C14042b c14042b) {
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public boolean mo83345a(int i) {
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83334a() {
        Monitor.m82978a(2, String.format("VideoCapture[%d]: start screen", Integer.valueOf(hashCode())), "", 0);
        this.f59362k = 0L;
        this.f59363l = 0L;
        this.f59364m = 0L;
        this.f59365n = true;
        C14189a c14189a = this.f59352a;
        C14050d c14050d = this.f59357f;
        c14189a.m83966a(c14050d.f58502a, c14050d.f58503b, this.f59356e);
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83343a(boolean z) {
        Monitor.m82978a(2, String.format("VideoCapture[%d]: stop screen", Integer.valueOf(hashCode())), "", 0);
        this.f59352a.m83975a((Object) null);
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83342a(String str) {
        this.f59360i = str;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83340a(InterfaceC14115l interfaceC14115l) {
        this.f59353b = interfaceC14115l;
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83341a(Runnable runnable) {
        C14189a c14189a = this.f59352a;
        if (c14189a != null) {
            c14189a.m83976a(runnable);
        }
    }

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83338a(InterfaceC14007b interfaceC14007b) {
        this.f59355d = new WeakReference<>(interfaceC14007b);
        C14189a c14189a = this.f59352a;
        if (c14189a != null) {
            c14189a.m83973a(interfaceC14007b);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m83598a(Queue<Runnable> queue) {
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

    @Override // com.tencent.liteav.InterfaceC14114k
    /* JADX INFO: renamed from: a */
    public void mo83335a(float f, float f2) {
    }

    @Override // com.tencent.liteav.screencapture.InterfaceC14190b
    /* JADX INFO: renamed from: a */
    public void mo83602a(Object obj) {
        while (m83598a(this.f59366o)) {
        }
        InterfaceC14115l interfaceC14115l = this.f59353b;
        if (interfaceC14115l != null) {
            interfaceC14115l.mo83517q();
        }
    }
}
