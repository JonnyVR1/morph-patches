package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.TextureView;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: renamed from: com.tencent.liteav.renderer.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14181a extends TextureViewSurfaceTextureListenerC14185e implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: A */
    private C14183c f59719A;

    /* JADX INFO: renamed from: B */
    private TXSVideoFrame f59720B;

    /* JADX INFO: renamed from: C */
    private TXCYuvTextureRender f59721C;

    /* JADX INFO: renamed from: F */
    private C14188h f59724F;

    /* JADX INFO: renamed from: G */
    private TXCYuvTextureRender f59725G;

    /* JADX INFO: renamed from: a */
    InterfaceC14187g f59727a;

    /* JADX INFO: renamed from: b */
    a f59728b;

    /* JADX INFO: renamed from: c */
    a f59729c;

    /* JADX INFO: renamed from: v */
    private C14182b f59735v;

    /* JADX INFO: renamed from: w */
    private SurfaceTexture f59736w;

    /* JADX INFO: renamed from: x */
    private C14183c f59737x;

    /* JADX INFO: renamed from: y */
    private boolean f59738y;

    /* JADX INFO: renamed from: q */
    private final int f59730q = 0;

    /* JADX INFO: renamed from: r */
    private final int f59731r = 0;

    /* JADX INFO: renamed from: s */
    private final int f59732s = 0;

    /* JADX INFO: renamed from: t */
    private final int f59733t = 0;

    /* JADX INFO: renamed from: u */
    private Object f59734u = new Object();

    /* JADX INFO: renamed from: D */
    private Object f59722D = null;

    /* JADX INFO: renamed from: E */
    private Object f59723E = new Object();

    /* JADX INFO: renamed from: H */
    private final Queue<Runnable> f59726H = new LinkedList();

    /* JADX INFO: renamed from: z */
    private float[] f59739z = new float[16];

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.a$a */
    public interface a {
        void onTextureProcess(int i, int i2, int i3, int i4);
    }

    /* JADX INFO: renamed from: p */
    private void m83848p() {
        this.f59737x = new C14183c(true);
        this.f59721C = new TXCYuvTextureRender();
        this.f59719A = new C14183c(false);
    }

    /* JADX INFO: renamed from: q */
    private boolean m83849q() {
        TXSVideoFrame tXSVideoFrame;
        TXCYuvTextureRender tXCYuvTextureRender;
        int iDrawToTexture;
        C14183c c14183c;
        synchronized (this) {
            try {
                boolean z = this.f59738y;
                if (z) {
                    this.f59738y = false;
                    tXSVideoFrame = null;
                } else {
                    TXSVideoFrame tXSVideoFrame2 = this.f59720B;
                    if (tXSVideoFrame2 == null) {
                        return false;
                    }
                    this.f59720B = null;
                    tXSVideoFrame = tXSVideoFrame2;
                    z = false;
                }
                GLES20.glViewport(0, 0, m83929g(), m83930h());
                Object objM83858b = this.f59799l == 1 ? m83858b() : null;
                a aVar = this.f59729c;
                if (z) {
                    SurfaceTexture surfaceTexture = this.f59736w;
                    if (surfaceTexture != null) {
                        surfaceTexture.updateTexImage();
                        this.f59736w.getTransformMatrix(this.f59739z);
                    }
                    InterfaceC14187g interfaceC14187g = this.f59727a;
                    C14183c c14183c2 = this.f59737x;
                    if (interfaceC14187g != null) {
                        if (c14183c2 != null) {
                            interfaceC14187g.mo83568a(c14183c2.m83883a(), this.f59739z);
                        }
                    } else if (c14183c2 != null) {
                        GLES20.glBindFramebuffer(36160, 0);
                        this.f59737x.m83886a(this.f59736w);
                    }
                    if (aVar != null) {
                        int iM83883a = this.f59737x.m83883a();
                        if (this.f59724F == null) {
                            C14188h c14188h = new C14188h(Boolean.TRUE);
                            this.f59724F = c14188h;
                            c14188h.m83949b();
                            this.f59724F.m83946a(true);
                            this.f59724F.m83950b(180);
                            this.f59724F.m83944a(C14188h.f59836a);
                        }
                        this.f59724F.m83947a(this.f59739z);
                        this.f59724F.m83951b(this.f59795h, this.f59796i);
                        this.f59724F.m83945a(this.f59795h, this.f59796i);
                        aVar.onTextureProcess(this.f59724F.m83954d(iM83883a), m83931i(), m83932j(), this.f59798k);
                    }
                    if (this.f59799l == 1 && (c14183c = this.f59737x) != null) {
                        m83920a(objM83858b, c14183c.m83883a(), this.f59739z, true);
                    }
                } else if (tXSVideoFrame != null && (tXCYuvTextureRender = this.f59721C) != null) {
                    if (this.f59728b != null) {
                        tXCYuvTextureRender.setHasFrameBuffer(this.f59795h, this.f59796i);
                        iDrawToTexture = this.f59721C.drawToTexture(tXSVideoFrame);
                        this.f59728b.onTextureProcess(iDrawToTexture, m83931i(), m83932j(), this.f59798k);
                    } else {
                        if (this.f59799l == 0) {
                            GLES20.glBindFramebuffer(36160, 0);
                            this.f59721C.drawFrame(tXSVideoFrame);
                        }
                        iDrawToTexture = -1;
                    }
                    if (this.f59799l == 1) {
                        if (iDrawToTexture == -1) {
                            this.f59721C.setHasFrameBuffer(this.f59795h, this.f59796i);
                            iDrawToTexture = this.f59721C.drawToTexture(tXSVideoFrame);
                        }
                        m83920a(objM83858b, iDrawToTexture, (float[]) null, false);
                    }
                    if (aVar != null) {
                        if (this.f59725G == null) {
                            TXCYuvTextureRender tXCYuvTextureRender2 = new TXCYuvTextureRender();
                            this.f59725G = tXCYuvTextureRender2;
                            tXCYuvTextureRender2.createTexture();
                            this.f59725G.flipVertical(false);
                        }
                        this.f59725G.setHasFrameBuffer(this.f59795h, this.f59796i);
                        aVar.onTextureProcess(this.f59725G.drawToTexture(tXSVideoFrame), m83931i(), m83932j(), this.f59798k);
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83857a(Object obj) {
        TXCYuvTextureRender tXCYuvTextureRender;
        synchronized (this.f59723E) {
            try {
                this.f59722D = obj;
                TXCLog.m82973w("TXCVideoRender", "play:vrender: TXCGLRender initTextureRender " + this);
                m83848p();
                C14184d c14184d = this.f59792e;
                if (c14184d != null) {
                    c14184d.m83899a(this.f59793f, this.f59794g);
                    this.f59792e.m83901b(this.f59795h, this.f59796i);
                }
                C14183c c14183c = this.f59737x;
                if (c14183c != null) {
                    c14183c.m83888b();
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.f59737x.m83883a());
                    this.f59736w = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(this);
                }
                TXCYuvTextureRender tXCYuvTextureRender2 = this.f59721C;
                if (tXCYuvTextureRender2 != null) {
                    tXCYuvTextureRender2.createTexture();
                }
                if (this.f59728b != null && (tXCYuvTextureRender = this.f59721C) != null) {
                    tXCYuvTextureRender.setHasFrameBuffer(this.f59795h, this.f59796i);
                }
                C14183c c14183c2 = this.f59719A;
                if (c14183c2 != null) {
                    c14183c2.m83888b();
                }
                InterfaceC14186f interfaceC14186f = this.f59802o;
                if (interfaceC14186f != null) {
                    interfaceC14186f.onSurfaceTextureAvailable(this.f59736w);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83861b(Object obj) {
        synchronized (this.f59723E) {
            try {
                if (this.f59722D != obj) {
                    TXCLog.m82973w("TXCVideoRender", "play:vrender: TXCGLRender destroyTextureRender ignore when not the same gl thread " + this);
                    return;
                }
                this.f59722D = null;
                TXCLog.m82973w("TXCVideoRender", "play:vrender: TXCGLRender destroyTextureRender " + this);
                try {
                    InterfaceC14186f interfaceC14186f = this.f59802o;
                    if (interfaceC14186f != null) {
                        interfaceC14186f.onSurfaceTextureDestroy(this.f59736w);
                    }
                } catch (Exception e) {
                    TXCLog.m82967e("TXCVideoRender", "callback failed.", e);
                }
                C14183c c14183c = this.f59737x;
                if (c14183c != null) {
                    c14183c.m83889c();
                    this.f59737x = null;
                }
                TXCYuvTextureRender tXCYuvTextureRender = this.f59721C;
                if (tXCYuvTextureRender != null) {
                    tXCYuvTextureRender.onSurfaceDestroy();
                    this.f59721C = null;
                }
                C14183c c14183c2 = this.f59719A;
                if (c14183c2 != null) {
                    c14183c2.m83889c();
                    this.f59719A = null;
                }
                this.f59736w = null;
                C14188h c14188h = this.f59724F;
                if (c14188h != null) {
                    c14188h.m83952c();
                    this.f59724F = null;
                }
                TXCYuvTextureRender tXCYuvTextureRender2 = this.f59725G;
                if (tXCYuvTextureRender2 != null) {
                    tXCYuvTextureRender2.onSurfaceDestroy();
                    this.f59725G = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14185e
    /* JADX INFO: renamed from: c */
    public void mo83862c(Object obj) {
        synchronized (this.f59734u) {
            try {
                if (this.f59735v == null) {
                    C14182b c14182b = new C14182b(new WeakReference(this));
                    this.f59735v = c14182b;
                    c14182b.m83874a(obj);
                    this.f59735v.start();
                    this.f59735v.m83876c();
                    TXCLog.m82973w("TXCVideoRender", "play:vrender: start render thread id " + getID() + ", glContext " + obj + ", " + this);
                } else {
                    TXCLog.m82973w("TXCVideoRender", "play:vrender: start render thread when running " + getID() + ", " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public SurfaceTexture m83864d() {
        TextureView textureView = this.f59791d;
        if (textureView != null) {
            return textureView.getSurfaceTexture();
        }
        return null;
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14185e
    /* JADX INFO: renamed from: e */
    public void mo83865e() {
        synchronized (this.f59734u) {
            try {
                C14182b c14182b = this.f59735v;
                if (c14182b != null) {
                    c14182b.m83875b();
                    this.f59735v.m83876c();
                    this.f59735v = null;
                    TXCLog.m82973w("TXCVideoRender", "play:vrender: quit render thread id" + getID() + ", " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.basic.module.C14040a
    public void finalize() throws Throwable {
        super.finalize();
        TXCLog.m82973w("TXCVideoRender", "play:vrender: quit render thread when finalize");
        try {
            mo83865e();
        } catch (Exception e) {
            TXCLog.m82967e("TXCVideoRender", "quit render thread failed.", e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            this.f59738y = true;
        }
        synchronized (this.f59734u) {
            try {
                C14182b c14182b = this.f59735v;
                if (c14182b != null) {
                    c14182b.m83876c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14185e, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* JADX INFO: renamed from: c */
    public boolean m83863c() {
        while (m83847a(this.f59726H)) {
        }
        return m83849q();
    }

    /* JADX INFO: renamed from: a */
    public void m83855a(a aVar) {
        TXCYuvTextureRender tXCYuvTextureRender;
        this.f59728b = aVar;
        if (aVar == null || (tXCYuvTextureRender = this.f59721C) == null) {
            return;
        }
        tXCYuvTextureRender.setHasFrameBuffer(this.f59795h, this.f59796i);
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14185e
    /* JADX INFO: renamed from: a */
    public void mo83854a(TXSVideoFrame tXSVideoFrame, int i, int i2, int i3) {
        synchronized (this) {
            try {
                TXSVideoFrame tXSVideoFrame2 = this.f59720B;
                if (tXSVideoFrame2 != null) {
                    tXSVideoFrame2.release();
                }
                this.f59720B = tXSVideoFrame;
            } catch (Throwable th) {
                throw th;
            }
        }
        super.mo83854a(tXSVideoFrame, i, i2, i3);
        synchronized (this.f59734u) {
            try {
                C14182b c14182b = this.f59735v;
                if (c14182b != null) {
                    c14182b.m83876c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Object m83858b() {
        Object objM83873a;
        synchronized (this.f59734u) {
            try {
                C14182b c14182b = this.f59735v;
                objM83873a = c14182b != null ? c14182b.m83873a() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return objM83873a;
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14185e
    /* JADX INFO: renamed from: b */
    public void mo83859b(SurfaceTexture surfaceTexture) {
        super.mo83859b(surfaceTexture);
        TXCLog.m82973w("TXCVideoRender", "play:vrender: quit render thread when onSurfaceRelease");
        mo83865e();
    }

    /* JADX INFO: renamed from: b */
    public void m83860b(a aVar) {
        TXCYuvTextureRender tXCYuvTextureRender;
        this.f59729c = aVar;
        if (aVar == null || (tXCYuvTextureRender = this.f59721C) == null) {
            return;
        }
        tXCYuvTextureRender.setHasFrameBuffer(this.f59795h, this.f59796i);
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14185e
    /* JADX INFO: renamed from: a */
    public void mo83852a(int i, int i2, int i3, boolean z, int i4) {
        GLES20.glViewport(0, 0, m83929g(), m83930h());
        C14183c c14183c = this.f59719A;
        if (c14183c != null) {
            c14183c.m83885a(i, z, i4);
        }
        super.mo83852a(i, i2, i3, z, i4);
        synchronized (this.f59734u) {
            try {
                C14182b c14182b = this.f59735v;
                if (c14182b != null) {
                    c14182b.m83876c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14185e
    /* JADX INFO: renamed from: a */
    public SurfaceTexture mo83850a() {
        return this.f59736w;
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14185e
    /* JADX INFO: renamed from: a */
    public void mo83853a(SurfaceTexture surfaceTexture) {
        super.mo83853a(surfaceTexture);
        TXCLog.m82973w("TXCVideoRender", "play:vrender: create render thread when onSurfaceCreate");
        mo83862c((Object) null);
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14185e
    /* JADX INFO: renamed from: a */
    public void mo83851a(int i, int i2) {
        super.mo83851a(i, i2);
        TXCYuvTextureRender tXCYuvTextureRender = this.f59721C;
        if (tXCYuvTextureRender != null) {
            tXCYuvTextureRender.setVideoSize(i, i2);
        }
        C14183c c14183c = this.f59737x;
        if (c14183c != null) {
            c14183c.m83884a(i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83856a(InterfaceC14187g interfaceC14187g) {
        this.f59727a = interfaceC14187g;
    }

    /* JADX INFO: renamed from: a */
    private boolean m83847a(Queue<Runnable> queue) {
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
}
