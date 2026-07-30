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
public class C14344a extends TextureViewSurfaceTextureListenerC14348e implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: A */
    private C14346c f60567A;

    /* JADX INFO: renamed from: B */
    private TXSVideoFrame f60568B;

    /* JADX INFO: renamed from: C */
    private TXCYuvTextureRender f60569C;

    /* JADX INFO: renamed from: F */
    private C14351h f60572F;

    /* JADX INFO: renamed from: G */
    private TXCYuvTextureRender f60573G;

    /* JADX INFO: renamed from: a */
    InterfaceC14350g f60575a;

    /* JADX INFO: renamed from: b */
    a f60576b;

    /* JADX INFO: renamed from: c */
    a f60577c;

    /* JADX INFO: renamed from: v */
    private C14345b f60583v;

    /* JADX INFO: renamed from: w */
    private SurfaceTexture f60584w;

    /* JADX INFO: renamed from: x */
    private C14346c f60585x;

    /* JADX INFO: renamed from: y */
    private boolean f60586y;

    /* JADX INFO: renamed from: q */
    private final int f60578q = 0;

    /* JADX INFO: renamed from: r */
    private final int f60579r = 0;

    /* JADX INFO: renamed from: s */
    private final int f60580s = 0;

    /* JADX INFO: renamed from: t */
    private final int f60581t = 0;

    /* JADX INFO: renamed from: u */
    private Object f60582u = new Object();

    /* JADX INFO: renamed from: D */
    private Object f60570D = null;

    /* JADX INFO: renamed from: E */
    private Object f60571E = new Object();

    /* JADX INFO: renamed from: H */
    private final Queue<Runnable> f60574H = new LinkedList();

    /* JADX INFO: renamed from: z */
    private float[] f60587z = new float[16];

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.a$a */
    public interface a {
        void onTextureProcess(int i, int i2, int i3, int i4);
    }

    /* JADX INFO: renamed from: p */
    private void m85031p() {
        this.f60585x = new C14346c(true);
        this.f60569C = new TXCYuvTextureRender();
        this.f60567A = new C14346c(false);
    }

    /* JADX INFO: renamed from: q */
    private boolean m85032q() {
        TXSVideoFrame tXSVideoFrame;
        TXCYuvTextureRender tXCYuvTextureRender;
        int iDrawToTexture;
        C14346c c14346c;
        synchronized (this) {
            try {
                boolean z = this.f60586y;
                if (z) {
                    this.f60586y = false;
                    tXSVideoFrame = null;
                } else {
                    TXSVideoFrame tXSVideoFrame2 = this.f60568B;
                    if (tXSVideoFrame2 == null) {
                        return false;
                    }
                    this.f60568B = null;
                    tXSVideoFrame = tXSVideoFrame2;
                    z = false;
                }
                GLES20.glViewport(0, 0, m85112g(), m85113h());
                Object objM85041b = this.f60647l == 1 ? m85041b() : null;
                a aVar = this.f60577c;
                if (z) {
                    SurfaceTexture surfaceTexture = this.f60584w;
                    if (surfaceTexture != null) {
                        surfaceTexture.updateTexImage();
                        this.f60584w.getTransformMatrix(this.f60587z);
                    }
                    InterfaceC14350g interfaceC14350g = this.f60575a;
                    C14346c c14346c2 = this.f60585x;
                    if (interfaceC14350g != null) {
                        if (c14346c2 != null) {
                            interfaceC14350g.mo84751a(c14346c2.m85066a(), this.f60587z);
                        }
                    } else if (c14346c2 != null) {
                        GLES20.glBindFramebuffer(36160, 0);
                        this.f60585x.m85069a(this.f60584w);
                    }
                    if (aVar != null) {
                        int iM85066a = this.f60585x.m85066a();
                        if (this.f60572F == null) {
                            C14351h c14351h = new C14351h(Boolean.TRUE);
                            this.f60572F = c14351h;
                            c14351h.m85132b();
                            this.f60572F.m85129a(true);
                            this.f60572F.m85133b(180);
                            this.f60572F.m85127a(C14351h.f60684a);
                        }
                        this.f60572F.m85130a(this.f60587z);
                        this.f60572F.m85134b(this.f60643h, this.f60644i);
                        this.f60572F.m85128a(this.f60643h, this.f60644i);
                        aVar.onTextureProcess(this.f60572F.m85137d(iM85066a), m85114i(), m85115j(), this.f60646k);
                    }
                    if (this.f60647l == 1 && (c14346c = this.f60585x) != null) {
                        m85103a(objM85041b, c14346c.m85066a(), this.f60587z, true);
                    }
                } else if (tXSVideoFrame != null && (tXCYuvTextureRender = this.f60569C) != null) {
                    if (this.f60576b != null) {
                        tXCYuvTextureRender.setHasFrameBuffer(this.f60643h, this.f60644i);
                        iDrawToTexture = this.f60569C.drawToTexture(tXSVideoFrame);
                        this.f60576b.onTextureProcess(iDrawToTexture, m85114i(), m85115j(), this.f60646k);
                    } else {
                        if (this.f60647l == 0) {
                            GLES20.glBindFramebuffer(36160, 0);
                            this.f60569C.drawFrame(tXSVideoFrame);
                        }
                        iDrawToTexture = -1;
                    }
                    if (this.f60647l == 1) {
                        if (iDrawToTexture == -1) {
                            this.f60569C.setHasFrameBuffer(this.f60643h, this.f60644i);
                            iDrawToTexture = this.f60569C.drawToTexture(tXSVideoFrame);
                        }
                        m85103a(objM85041b, iDrawToTexture, (float[]) null, false);
                    }
                    if (aVar != null) {
                        if (this.f60573G == null) {
                            TXCYuvTextureRender tXCYuvTextureRender2 = new TXCYuvTextureRender();
                            this.f60573G = tXCYuvTextureRender2;
                            tXCYuvTextureRender2.createTexture();
                            this.f60573G.flipVertical(false);
                        }
                        this.f60573G.setHasFrameBuffer(this.f60643h, this.f60644i);
                        aVar.onTextureProcess(this.f60573G.drawToTexture(tXSVideoFrame), m85114i(), m85115j(), this.f60646k);
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85040a(Object obj) {
        TXCYuvTextureRender tXCYuvTextureRender;
        synchronized (this.f60571E) {
            try {
                this.f60570D = obj;
                TXCLog.m84156w("TXCVideoRender", "play:vrender: TXCGLRender initTextureRender " + this);
                m85031p();
                C14347d c14347d = this.f60640e;
                if (c14347d != null) {
                    c14347d.m85082a(this.f60641f, this.f60642g);
                    this.f60640e.m85084b(this.f60643h, this.f60644i);
                }
                C14346c c14346c = this.f60585x;
                if (c14346c != null) {
                    c14346c.m85071b();
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.f60585x.m85066a());
                    this.f60584w = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(this);
                }
                TXCYuvTextureRender tXCYuvTextureRender2 = this.f60569C;
                if (tXCYuvTextureRender2 != null) {
                    tXCYuvTextureRender2.createTexture();
                }
                if (this.f60576b != null && (tXCYuvTextureRender = this.f60569C) != null) {
                    tXCYuvTextureRender.setHasFrameBuffer(this.f60643h, this.f60644i);
                }
                C14346c c14346c2 = this.f60567A;
                if (c14346c2 != null) {
                    c14346c2.m85071b();
                }
                InterfaceC14349f interfaceC14349f = this.f60650o;
                if (interfaceC14349f != null) {
                    interfaceC14349f.onSurfaceTextureAvailable(this.f60584w);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m85044b(Object obj) {
        synchronized (this.f60571E) {
            try {
                if (this.f60570D != obj) {
                    TXCLog.m84156w("TXCVideoRender", "play:vrender: TXCGLRender destroyTextureRender ignore when not the same gl thread " + this);
                    return;
                }
                this.f60570D = null;
                TXCLog.m84156w("TXCVideoRender", "play:vrender: TXCGLRender destroyTextureRender " + this);
                try {
                    InterfaceC14349f interfaceC14349f = this.f60650o;
                    if (interfaceC14349f != null) {
                        interfaceC14349f.onSurfaceTextureDestroy(this.f60584w);
                    }
                } catch (Exception e) {
                    TXCLog.m84150e("TXCVideoRender", "callback failed.", e);
                }
                C14346c c14346c = this.f60585x;
                if (c14346c != null) {
                    c14346c.m85072c();
                    this.f60585x = null;
                }
                TXCYuvTextureRender tXCYuvTextureRender = this.f60569C;
                if (tXCYuvTextureRender != null) {
                    tXCYuvTextureRender.onSurfaceDestroy();
                    this.f60569C = null;
                }
                C14346c c14346c2 = this.f60567A;
                if (c14346c2 != null) {
                    c14346c2.m85072c();
                    this.f60567A = null;
                }
                this.f60584w = null;
                C14351h c14351h = this.f60572F;
                if (c14351h != null) {
                    c14351h.m85135c();
                    this.f60572F = null;
                }
                TXCYuvTextureRender tXCYuvTextureRender2 = this.f60573G;
                if (tXCYuvTextureRender2 != null) {
                    tXCYuvTextureRender2.onSurfaceDestroy();
                    this.f60573G = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14348e
    /* JADX INFO: renamed from: c */
    public void mo85045c(Object obj) {
        synchronized (this.f60582u) {
            try {
                if (this.f60583v == null) {
                    C14345b c14345b = new C14345b(new WeakReference(this));
                    this.f60583v = c14345b;
                    c14345b.m85057a(obj);
                    this.f60583v.start();
                    this.f60583v.m85059c();
                    TXCLog.m84156w("TXCVideoRender", "play:vrender: start render thread id " + getID() + ", glContext " + obj + ", " + this);
                } else {
                    TXCLog.m84156w("TXCVideoRender", "play:vrender: start render thread when running " + getID() + ", " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public SurfaceTexture m85047d() {
        TextureView textureView = this.f60639d;
        if (textureView != null) {
            return textureView.getSurfaceTexture();
        }
        return null;
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14348e
    /* JADX INFO: renamed from: e */
    public void mo85048e() {
        synchronized (this.f60582u) {
            try {
                C14345b c14345b = this.f60583v;
                if (c14345b != null) {
                    c14345b.m85058b();
                    this.f60583v.m85059c();
                    this.f60583v = null;
                    TXCLog.m84156w("TXCVideoRender", "play:vrender: quit render thread id" + getID() + ", " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.basic.module.C14203a
    public void finalize() throws Throwable {
        super.finalize();
        TXCLog.m84156w("TXCVideoRender", "play:vrender: quit render thread when finalize");
        try {
            mo85048e();
        } catch (Exception e) {
            TXCLog.m84150e("TXCVideoRender", "quit render thread failed.", e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            this.f60586y = true;
        }
        synchronized (this.f60582u) {
            try {
                C14345b c14345b = this.f60583v;
                if (c14345b != null) {
                    c14345b.m85059c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14348e, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* JADX INFO: renamed from: c */
    public boolean m85046c() {
        while (m85030a(this.f60574H)) {
        }
        return m85032q();
    }

    /* JADX INFO: renamed from: a */
    public void m85038a(a aVar) {
        TXCYuvTextureRender tXCYuvTextureRender;
        this.f60576b = aVar;
        if (aVar == null || (tXCYuvTextureRender = this.f60569C) == null) {
            return;
        }
        tXCYuvTextureRender.setHasFrameBuffer(this.f60643h, this.f60644i);
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14348e
    /* JADX INFO: renamed from: a */
    public void mo85037a(TXSVideoFrame tXSVideoFrame, int i, int i2, int i3) {
        synchronized (this) {
            try {
                TXSVideoFrame tXSVideoFrame2 = this.f60568B;
                if (tXSVideoFrame2 != null) {
                    tXSVideoFrame2.release();
                }
                this.f60568B = tXSVideoFrame;
            } catch (Throwable th) {
                throw th;
            }
        }
        super.mo85037a(tXSVideoFrame, i, i2, i3);
        synchronized (this.f60582u) {
            try {
                C14345b c14345b = this.f60583v;
                if (c14345b != null) {
                    c14345b.m85059c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Object m85041b() {
        Object objM85056a;
        synchronized (this.f60582u) {
            try {
                C14345b c14345b = this.f60583v;
                objM85056a = c14345b != null ? c14345b.m85056a() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return objM85056a;
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14348e
    /* JADX INFO: renamed from: b */
    public void mo85042b(SurfaceTexture surfaceTexture) {
        super.mo85042b(surfaceTexture);
        TXCLog.m84156w("TXCVideoRender", "play:vrender: quit render thread when onSurfaceRelease");
        mo85048e();
    }

    /* JADX INFO: renamed from: b */
    public void m85043b(a aVar) {
        TXCYuvTextureRender tXCYuvTextureRender;
        this.f60577c = aVar;
        if (aVar == null || (tXCYuvTextureRender = this.f60569C) == null) {
            return;
        }
        tXCYuvTextureRender.setHasFrameBuffer(this.f60643h, this.f60644i);
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14348e
    /* JADX INFO: renamed from: a */
    public void mo85035a(int i, int i2, int i3, boolean z, int i4) {
        GLES20.glViewport(0, 0, m85112g(), m85113h());
        C14346c c14346c = this.f60567A;
        if (c14346c != null) {
            c14346c.m85068a(i, z, i4);
        }
        super.mo85035a(i, i2, i3, z, i4);
        synchronized (this.f60582u) {
            try {
                C14345b c14345b = this.f60583v;
                if (c14345b != null) {
                    c14345b.m85059c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14348e
    /* JADX INFO: renamed from: a */
    public SurfaceTexture mo85033a() {
        return this.f60584w;
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14348e
    /* JADX INFO: renamed from: a */
    public void mo85036a(SurfaceTexture surfaceTexture) {
        super.mo85036a(surfaceTexture);
        TXCLog.m84156w("TXCVideoRender", "play:vrender: create render thread when onSurfaceCreate");
        mo85045c((Object) null);
    }

    @Override // com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14348e
    /* JADX INFO: renamed from: a */
    public void mo85034a(int i, int i2) {
        super.mo85034a(i, i2);
        TXCYuvTextureRender tXCYuvTextureRender = this.f60569C;
        if (tXCYuvTextureRender != null) {
            tXCYuvTextureRender.setVideoSize(i, i2);
        }
        C14346c c14346c = this.f60585x;
        if (c14346c != null) {
            c14346c.m85067a(i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85039a(InterfaceC14350g interfaceC14350g) {
        this.f60575a = interfaceC14350g;
    }

    /* JADX INFO: renamed from: a */
    private boolean m85030a(Queue<Runnable> queue) {
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
