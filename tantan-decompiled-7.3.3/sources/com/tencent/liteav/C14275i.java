package com.tencent.liteav;

import android.content.Context;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.p091a.EnumC14168c;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.structs.C14205b;
import com.tencent.liteav.basic.util.C14213d;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.screencapture.C14352a;
import com.tencent.liteav.screencapture.InterfaceC14353b;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: com.tencent.liteav.i */
/* JADX INFO: loaded from: classes2.dex */
public class C14275i implements InterfaceC14277k, InterfaceC14353b {

    /* JADX INFO: renamed from: a */
    private final C14352a f60200a;

    /* JADX INFO: renamed from: b */
    private InterfaceC14278l f60201b;

    /* JADX INFO: renamed from: e */
    private int f60204e;

    /* JADX INFO: renamed from: f */
    private C14213d f60205f;

    /* JADX INFO: renamed from: g */
    private int f60206g;

    /* JADX INFO: renamed from: h */
    private int f60207h;

    /* JADX INFO: renamed from: k */
    private long f60210k;

    /* JADX INFO: renamed from: l */
    private long f60211l;

    /* JADX INFO: renamed from: m */
    private long f60212m;

    /* JADX INFO: renamed from: n */
    private boolean f60213n;

    /* JADX INFO: renamed from: c */
    private EGLContext f60202c = null;

    /* JADX INFO: renamed from: d */
    private WeakReference<InterfaceC14170b> f60203d = null;

    /* JADX INFO: renamed from: i */
    private String f60208i = "";

    /* JADX INFO: renamed from: j */
    private int f60209j = 0;

    /* JADX INFO: renamed from: o */
    private final Queue<Runnable> f60214o = new LinkedList();

    public C14275i(Context context, C14273g c14273g, C14352a.a aVar) {
        C14352a c14352a = new C14352a(context, c14273g.f60149V, aVar);
        this.f60200a = c14352a;
        c14352a.m85157a((InterfaceC14353b) this);
        c14273g.m84780a();
        C14213d c14213dM84782c = m84782c(c14273g.f60153a, c14273g.f60154b);
        this.f60205f = c14213dM84782c;
        this.f60204e = c14273g.f60160h;
        int i = c14273g.f60153a;
        this.f60206g = i;
        this.f60207h = c14273g.f60154b;
        TXCLog.m84153i("TXCScreenCaptureSource", "capture size: %s, encode size: %dx%d", c14213dM84782c, Integer.valueOf(i), Integer.valueOf(this.f60207h));
    }

    /* JADX INFO: renamed from: c */
    private C14213d m84782c(int i, int i2) {
        boolean z = i > i2;
        C14213d c14213d = new C14213d();
        int i3 = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
        if (i > 1280 || i2 > 1280) {
            c14213d.f59350a = z ? Math.max(i, i2) : Math.min(i, i2);
            c14213d.f59351b = z ? Math.min(i, i2) : Math.max(i, i2);
            return c14213d;
        }
        c14213d.f59350a = z ? 1280 : 720;
        if (z) {
            i3 = 720;
        }
        c14213d.f59351b = i3;
        return c14213d;
    }

    /* JADX INFO: renamed from: f */
    private void m84783f(boolean z) {
        int i = this.f60206g;
        if (z) {
            int i2 = this.f60207h;
            if (i > i2) {
                mo84531b(i2, i);
                return;
            }
            return;
        }
        int i3 = this.f60207h;
        if (i < i3) {
            mo84531b(i3, i);
        }
    }

    @Override // com.tencent.liteav.screencapture.InterfaceC14353b
    /* JADX INFO: renamed from: a */
    public void mo84784a(int i, EGLContext eGLContext, int i2, int i3, int i4, long j) {
        this.f60202c = eGLContext;
        while (m84781a(this.f60214o)) {
        }
        if (i != 0) {
            TXCLog.m84149e("TXCScreenCaptureSource", "onScreenCaptureFrame failed");
            return;
        }
        if (this.f60213n) {
            this.f60213n = false;
            Monitor.m84161a(2, String.format("VideoCapture[%d]: capture first frame", Integer.valueOf(hashCode())), "", 0);
            C14215f.m84219a(this.f60203d, 1007, "First frame capture completed");
            TXCLog.m84152i("TXCScreenCaptureSource", "on Got first frame");
        }
        this.f60210k++;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f60211l;
        if (jCurrentTimeMillis >= 1000) {
            long j2 = this.f60210k;
            double d = ((j2 - this.f60212m) * 1000.0d) / jCurrentTimeMillis;
            this.f60212m = j2;
            this.f60211l = System.currentTimeMillis();
            TXCStatus.m84177a(this.f60208i, 1001, this.f60209j, Double.valueOf(d));
        }
        if (this.f60201b != null) {
            m84783f(i3 < i4);
            C14205b c14205b = new C14205b();
            c14205b.f59314e = i3;
            c14205b.f59315f = i4;
            int i5 = this.f60206g;
            c14205b.f59316g = i5;
            int i6 = this.f60207h;
            c14205b.f59317h = i6;
            c14205b.f59310a = i2;
            c14205b.f59311b = 0;
            c14205b.f59319j = 0;
            c14205b.f59321l = C14215f.m84217a(i3, i4, i5, i6);
            this.f60201b.mo84669b(c14205b);
        }
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: b */
    public void mo84532b(boolean z) {
        C14213d c14213dM84782c = m84782c(this.f60206g, this.f60207h);
        if (c14213dM84782c.equals(this.f60205f)) {
            return;
        }
        this.f60205f = c14213dM84782c;
        this.f60200a.m85152a(c14213dM84782c.f59350a, c14213dM84782c.f59351b);
        TXCLog.m84153i("TXCScreenCaptureSource", "capture size: %s, encode size: %dx%d", this.f60205f, Integer.valueOf(this.f60206g), Integer.valueOf(this.f60207h));
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: d */
    public boolean mo84537d() {
        return true;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: e */
    public int mo84539e() {
        return 0;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: g */
    public int mo84544g() {
        return this.f60204e;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: h */
    public boolean mo84546h() {
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: i */
    public boolean mo84547i() {
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: j */
    public boolean mo84548j() {
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: k */
    public boolean mo84549k() {
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: l */
    public boolean mo84550l() {
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: d */
    public void mo84536d(int i) {
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: e */
    public void mo84540e(int i) {
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: d */
    public boolean mo84538d(boolean z) {
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: e */
    public void mo84541e(boolean z) {
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: g */
    public void mo84545g(int i) {
        this.f60209j = i;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: f */
    public void mo84543f(int i) {
        this.f60204e = i;
        this.f60200a.m85151a(i);
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: f */
    public EGLContext mo84542f() {
        return this.f60202c;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: b */
    public void mo84529b() {
        this.f60200a.m85160a(true);
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: b */
    public void mo84530b(int i) {
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: b */
    public void mo84531b(int i, int i2) {
        this.f60206g = i;
        this.f60207h = i2;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: c */
    public void mo84535c(boolean z) {
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: c */
    public void mo84534c(int i) {
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: c */
    public void mo84533c() {
        this.f60200a.m85160a(false);
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84519a(int i, int i2) {
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84520a(EnumC14168c enumC14168c) {
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84522a(C14205b c14205b) {
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public boolean mo84528a(int i) {
        return false;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84517a() {
        Monitor.m84161a(2, String.format("VideoCapture[%d]: start screen", Integer.valueOf(hashCode())), "", 0);
        this.f60210k = 0L;
        this.f60211l = 0L;
        this.f60212m = 0L;
        this.f60213n = true;
        C14352a c14352a = this.f60200a;
        C14213d c14213d = this.f60205f;
        c14352a.m85149a(c14213d.f59350a, c14213d.f59351b, this.f60204e);
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84526a(boolean z) {
        Monitor.m84161a(2, String.format("VideoCapture[%d]: stop screen", Integer.valueOf(hashCode())), "", 0);
        this.f60200a.m85158a((Object) null);
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84525a(String str) {
        this.f60208i = str;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84523a(InterfaceC14278l interfaceC14278l) {
        this.f60201b = interfaceC14278l;
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84524a(Runnable runnable) {
        C14352a c14352a = this.f60200a;
        if (c14352a != null) {
            c14352a.m85159a(runnable);
        }
    }

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84521a(InterfaceC14170b interfaceC14170b) {
        this.f60203d = new WeakReference<>(interfaceC14170b);
        C14352a c14352a = this.f60200a;
        if (c14352a != null) {
            c14352a.m85156a(interfaceC14170b);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m84781a(Queue<Runnable> queue) {
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

    @Override // com.tencent.liteav.InterfaceC14277k
    /* JADX INFO: renamed from: a */
    public void mo84518a(float f, float f2) {
    }

    @Override // com.tencent.liteav.screencapture.InterfaceC14353b
    /* JADX INFO: renamed from: a */
    public void mo84785a(Object obj) {
        while (m84781a(this.f60214o)) {
        }
        InterfaceC14278l interfaceC14278l = this.f60201b;
        if (interfaceC14278l != null) {
            interfaceC14278l.mo84700q();
        }
    }
}
