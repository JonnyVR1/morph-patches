package com.tencent.liteav.renderer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Surface;
import android.view.TextureView;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.PlaybackException;
import com.google.firebase.FirebaseError;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.C14203a;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.p093c.C14175e;
import com.tencent.liteav.basic.p093c.InterfaceC14185o;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.liteav.renderer.e */
/* JADX INFO: loaded from: classes2.dex */
public class TextureViewSurfaceTextureListenerC14348e extends C14203a implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a */
    private static final float[] f60630a = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: b */
    private SurfaceTexture f60637b;

    /* JADX INFO: renamed from: d */
    protected TextureView f60639d;

    /* JADX INFO: renamed from: e */
    protected C14347d f60640e;

    /* JADX INFO: renamed from: o */
    protected InterfaceC14349f f60650o;

    /* JADX INFO: renamed from: p */
    WeakReference<InterfaceC14170b> f60651p;

    /* JADX INFO: renamed from: q */
    private C14175e f60652q;

    /* JADX INFO: renamed from: r */
    private C14351h f60653r;

    /* JADX INFO: renamed from: s */
    private Surface f60654s;

    /* JADX INFO: renamed from: u */
    private int f60656u;

    /* JADX INFO: renamed from: f */
    protected int f60641f = 0;

    /* JADX INFO: renamed from: g */
    protected int f60642g = 0;

    /* JADX INFO: renamed from: h */
    protected int f60643h = 0;

    /* JADX INFO: renamed from: i */
    protected int f60644i = 0;

    /* JADX INFO: renamed from: j */
    protected int f60645j = 0;

    /* JADX INFO: renamed from: c */
    private int f60638c = 800;

    /* JADX INFO: renamed from: t */
    private int f60655t = 0;

    /* JADX INFO: renamed from: k */
    protected int f60646k = 0;

    /* JADX INFO: renamed from: l */
    protected volatile int f60647l = -1;

    /* JADX INFO: renamed from: m */
    protected int f60648m = 0;

    /* JADX INFO: renamed from: n */
    protected int f60649n = 0;

    /* JADX INFO: renamed from: v */
    private int[] f60657v = new int[5];

    /* JADX INFO: renamed from: w */
    private int f60658w = 500;

    /* JADX INFO: renamed from: x */
    private long f60659x = 0;

    /* JADX INFO: renamed from: y */
    private long f60660y = 0;

    /* JADX INFO: renamed from: z */
    private long f60661z = 0;

    /* JADX INFO: renamed from: A */
    private long f60631A = 0;

    /* JADX INFO: renamed from: B */
    private boolean f60632B = false;

    /* JADX INFO: renamed from: C */
    private boolean f60633C = false;

    /* JADX INFO: renamed from: E */
    private boolean f60635E = false;

    /* JADX INFO: renamed from: F */
    private a f60636F = new a();

    /* JADX INFO: renamed from: D */
    private boolean f60634D = false;

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public long f60672a;

        /* JADX INFO: renamed from: b */
        public long f60673b;

        /* JADX INFO: renamed from: c */
        public long f60674c;

        /* JADX INFO: renamed from: d */
        public long f60675d;

        /* JADX INFO: renamed from: e */
        public long f60676e;

        /* JADX INFO: renamed from: f */
        public long f60677f;

        /* JADX INFO: renamed from: g */
        public long f60678g;

        /* JADX INFO: renamed from: h */
        public long f60679h;

        /* JADX INFO: renamed from: i */
        public long f60680i;

        /* JADX INFO: renamed from: j */
        public long f60681j;

        /* JADX INFO: renamed from: k */
        public int f60682k;

        /* JADX INFO: renamed from: l */
        public int f60683l;
    }

    /* JADX INFO: renamed from: b */
    private void m85093b() {
        if (!this.f60634D) {
            Bundle bundle = new Bundle();
            bundle.putString("EVT_USERID", getID());
            bundle.putInt("EVT_ID", 2003);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Render the first video frame(IDR)");
            bundle.putInt("EVT_PARAM1", this.f60643h);
            bundle.putInt("EVT_PARAM2", this.f60644i);
            C14215f.m84218a(this.f60651p, 2003, bundle);
            setStatusValue(6001, this.f60645j, Long.valueOf(TXCTimeUtil.getTimeTick()));
            setStatusValue(FirebaseError.ERROR_USER_TOKEN_EXPIRED, this.f60645j, Integer.valueOf(this.f60643h));
            setStatusValue(17022, this.f60645j, Integer.valueOf(this.f60644i));
            TXCLog.m84152i("TXCVideoRender", "trtc_render render first frame " + getID() + ", " + this.f60645j);
            this.f60634D = true;
            Monitor.m84161a(2, String.format("Remote-VideoRender[%d]: Render first frame [tinyID:%s][streamType:%d]", Integer.valueOf(hashCode()), getID(), Integer.valueOf(this.f60645j)), "streamType: 2-big, 3-small, 7-sub", 0);
            TXCKeyPointReportProxy.m84170a(getID(), TantanException.Client.AccountService.NEW_DEVICE_SIGN_IN, 0L, this.f60645j);
        }
        this.f60636F.f60674c++;
        m85120o();
        a aVar = this.f60636F;
        long j = aVar.f60675d;
        if (j != 0) {
            aVar.f60680i = m85087a(j);
            a aVar2 = this.f60636F;
            long j2 = aVar2.f60681j;
            long j3 = aVar2.f60680i;
            aVar2.f60681j = j2 + j3;
            if (j3 > this.f60658w) {
                long j4 = aVar2.f60676e + 1;
                aVar2.f60676e = j4;
                setStatusValue(6003, this.f60645j, Long.valueOf(j4));
                a aVar3 = this.f60636F;
                long j5 = aVar3.f60680i;
                if (j5 > aVar3.f60679h) {
                    aVar3.f60679h = j5;
                    setStatusValue(PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION, this.f60645j, Long.valueOf(j5));
                }
                TXCLog.m84156w("TXCVideoRender", "render frame count:" + this.f60636F.f60674c + " block time:" + this.f60636F.f60680i + "> 500");
            }
            long j6 = this.f60636F.f60680i;
            if (j6 > this.f60638c) {
                this.f60659x++;
                this.f60661z += j6;
                TXCLog.m84156w("TXCVideoRender", "render frame count:" + this.f60636F.f60674c + " block time:" + this.f60636F.f60680i + "> " + this.f60638c);
                WeakReference<InterfaceC14170b> weakReference = this.f60651p;
                String id = getID();
                StringBuilder sb = new StringBuilder("Current video playback stuck for ");
                sb.append(this.f60636F.f60680i);
                sb.append("ms");
                C14215f.m84221a(weakReference, id, 2105, sb.toString());
                a aVar4 = this.f60636F;
                long j7 = aVar4.f60678g + aVar4.f60680i;
                aVar4.f60678g = j7;
                setStatusValue(PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR, this.f60645j, Long.valueOf(j7));
            }
            a aVar5 = this.f60636F;
            if (aVar5.f60680i > 1000) {
                long j8 = aVar5.f60677f + 1;
                aVar5.f60677f = j8;
                setStatusValue(6004, this.f60645j, Long.valueOf(j8));
                TXCLog.m84156w("TXCVideoRender", "render frame count:" + this.f60636F.f60674c + " block time:" + this.f60636F.f60680i + "> 1000");
            }
        }
        long timeTick = TXCTimeUtil.getTimeTick();
        long j9 = this.f60660y;
        if (j9 == 0) {
            this.f60660y = timeTick;
        } else if (timeTick - j9 >= 2000) {
            setStatusValue(FirebaseError.ERROR_PROVIDER_ALREADY_LINKED, this.f60645j, Long.valueOf(this.f60659x));
            setStatusValue(FirebaseError.ERROR_NO_SUCH_PROVIDER, this.f60645j, Long.valueOf(this.f60661z));
            if (this.f60631A != 0) {
                TXCKeyPointReportProxy.m84170a(getID(), 40005, (int) this.f60661z, this.f60645j);
                TXCKeyPointReportProxy.m84170a(getID(), 40006, (int) (timeTick - this.f60660y), this.f60645j);
                setStatusValue(6020, this.f60645j, Long.valueOf(this.f60636F.f60681j));
            }
            this.f60659x = 0L;
            this.f60660y = timeTick;
            this.f60661z = 0L;
        }
        this.f60636F.f60675d = TXCTimeUtil.getTimeTick();
        if (this.f60631A == 0) {
            this.f60631A = this.f60636F.f60675d;
        }
        a aVar6 = this.f60636F;
        aVar6.f60683l = this.f60644i;
        aVar6.f60682k = this.f60643h;
    }

    /* JADX INFO: renamed from: a */
    public void m85103a(Object obj, int i, float[] fArr, boolean z) {
        Surface surfaceM83932b;
        if (this.f60647l == 1) {
            int[] iArrM85092a = m85092a(i, this.f60643h, this.f60644i, fArr, z);
            int i2 = iArrM85092a[0];
            int i3 = iArrM85092a[1];
            int i4 = iArrM85092a[2];
            System.arraycopy(iArrM85092a, 0, this.f60657v, 0, 3);
            int[] iArr = this.f60657v;
            if (z) {
                iArr[3] = 1;
                iArr[4] = 180;
            } else {
                iArr[3] = 0;
                iArr[4] = 0;
            }
            synchronized (this) {
                try {
                    Surface surface = this.f60654s;
                    C14175e c14175e = this.f60652q;
                    if (surface != null) {
                        if (c14175e != null && ((surfaceM83932b = c14175e.m83932b()) != surface || (surfaceM83932b != null && !surfaceM83932b.isValid()))) {
                            TXCLog.m84152i("TXCVideoRender", "surface-render: onDrawTextureToSurface surface change stop render thread " + this.f60652q + ", " + surfaceM83932b + ", " + surface);
                            this.f60652q.m83926a();
                            this.f60652q = null;
                        }
                        if (this.f60652q == null && this.f60647l == 1 && surface.isValid()) {
                            this.f60652q = new C14175e();
                            TXCLog.m84152i("TXCVideoRender", "surface-render: onDrawTextureToSurface start render thread " + this.f60652q + Constants.SEPARATOR_COMMA + surface);
                            this.f60652q.m83930a(obj, surface);
                        }
                        if (this.f60652q != null && this.f60647l == 1) {
                            C14175e c14175e2 = this.f60652q;
                            if (z) {
                                c14175e2.m83928a(i2, true, 180, this.f60648m, this.f60649n, i3, i4, false, false);
                            } else {
                                c14175e2.m83928a(i2, false, 0, this.f60648m, this.f60649n, i3, i4, false, false);
                            }
                        }
                    } else if (c14175e != null) {
                        TXCLog.m84152i("TXCVideoRender", "surface-render: onDrawTextureToSurface stop render thread " + this.f60652q);
                        this.f60652q.m83926a();
                        this.f60652q = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m85108c(final int i, final int i2) {
        TXCLog.m84152i("TXCVideoRender", "surface-render: set setSurfaceSize " + i + "*" + i2);
        if (i == this.f60648m && i2 == this.f60649n) {
            return;
        }
        if (this.f60652q != null && this.f60647l == 1 && this.f60657v != null) {
            this.f60652q.m83931a(new Runnable() { // from class: com.tencent.liteav.renderer.e.3
                @Override // java.lang.Runnable
                public void run() {
                    TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e = TextureViewSurfaceTextureListenerC14348e.this;
                    textureViewSurfaceTextureListenerC14348e.f60648m = i;
                    textureViewSurfaceTextureListenerC14348e.f60649n = i2;
                    if (textureViewSurfaceTextureListenerC14348e.f60652q != null) {
                        C14175e c14175e = TextureViewSurfaceTextureListenerC14348e.this.f60652q;
                        int i3 = TextureViewSurfaceTextureListenerC14348e.this.f60657v[0];
                        boolean z = TextureViewSurfaceTextureListenerC14348e.this.f60657v[3] == 1;
                        int i4 = TextureViewSurfaceTextureListenerC14348e.this.f60657v[4];
                        TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348e2 = TextureViewSurfaceTextureListenerC14348e.this;
                        c14175e.m83928a(i3, z, i4, textureViewSurfaceTextureListenerC14348e2.f60648m, textureViewSurfaceTextureListenerC14348e2.f60649n, textureViewSurfaceTextureListenerC14348e2.f60657v[1], TextureViewSurfaceTextureListenerC14348e.this.f60657v[2], true, false);
                    }
                }
            });
        } else {
            this.f60648m = i;
            this.f60649n = i2;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m85109d(int i) {
        this.f60655t = i;
        C14347d c14347d = this.f60640e;
        if (c14347d != null) {
            c14347d.m85085c((i + this.f60646k) % 360);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m85110e(int i) {
        this.f60658w = i;
    }

    /* JADX INFO: renamed from: f */
    public void m85111f() {
        Monitor.m84161a(2, String.format("Remote-VideoRender[%d]: Start [tinyID:%s] [streamType:%d]", Integer.valueOf(hashCode()), getID(), Integer.valueOf(this.f60645j)), "streamType: 2-big, 3-small, 7-sub", 0);
        this.f60633C = true;
        this.f60635E = true;
        this.f60634D = false;
        m85118m();
    }

    /* JADX INFO: renamed from: g */
    public int m85112g() {
        TextureView textureView = this.f60639d;
        if (textureView != null) {
            return textureView.getWidth();
        }
        if (this.f60654s != null) {
            return this.f60648m;
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public int m85113h() {
        TextureView textureView = this.f60639d;
        if (textureView != null) {
            return textureView.getHeight();
        }
        if (this.f60654s != null) {
            return this.f60649n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public int m85114i() {
        return this.f60643h;
    }

    /* JADX INFO: renamed from: j */
    public int m85115j() {
        return this.f60644i;
    }

    /* JADX INFO: renamed from: k */
    public void m85116k() {
    }

    /* JADX INFO: renamed from: l */
    public void m85117l() {
        synchronized (this) {
            try {
                if (this.f60652q != null) {
                    TXCLog.m84152i("TXCVideoRender", "surface-render: onRenderThreadEGLDestroy stop render thread " + this.f60652q);
                    this.f60652q.m83926a();
                    this.f60652q = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C14351h c14351h = this.f60653r;
        if (c14351h != null) {
            c14351h.m85135c();
            this.f60653r = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m85118m() {
        m85119n();
        a aVar = this.f60636F;
        aVar.f60673b = 0L;
        aVar.f60674c = 0L;
        aVar.f60676e = 0L;
        aVar.f60677f = 0L;
        aVar.f60678g = 0L;
        aVar.f60679h = 0L;
        aVar.f60681j = 0L;
        this.f60631A = 0L;
        setStatusValue(6001, this.f60645j, 0L);
        setStatusValue(6003, this.f60645j, 0L);
        setStatusValue(PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION, this.f60645j, 0L);
        setStatusValue(PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR, this.f60645j, 0L);
        setStatusValue(6004, this.f60645j, 0L);
        setStatusValue(6020, this.f60645j, 0L);
    }

    /* JADX INFO: renamed from: n */
    public void m85119n() {
        a aVar = this.f60636F;
        aVar.f60672a = 0L;
        aVar.f60675d = 0L;
        aVar.f60680i = 0L;
        aVar.f60682k = 0;
        aVar.f60683l = 0;
        setStatusValue(6002, this.f60645j, Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        setStatusValue(FirebaseError.ERROR_USER_TOKEN_EXPIRED, this.f60645j, 0);
        setStatusValue(17022, this.f60645j, 0);
    }

    /* JADX INFO: renamed from: o */
    public void m85120o() {
        a aVar = this.f60636F;
        if (aVar.f60672a == 0) {
            aVar.f60672a = TXCTimeUtil.getTimeTick();
            return;
        }
        long timeTick = TXCTimeUtil.getTimeTick();
        a aVar2 = this.f60636F;
        long j = timeTick - aVar2.f60672a;
        if (j >= 950) {
            double d = ((aVar2.f60674c - aVar2.f60673b) * 1000.0d) / j;
            setStatusValue(6002, this.f60645j, Double.valueOf(d));
            TXCKeyPointReportProxy.m84170a(getID(), 40001, (int) d, this.f60645j);
            a aVar3 = this.f60636F;
            aVar3.f60673b = aVar3.f60674c;
            aVar3.f60672a += j;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        TXCLog.m84156w("TXCVideoRender", "play:vrender: texture available @" + surfaceTexture + "id " + getID() + "_" + this.f60645j);
        this.f60641f = i;
        this.f60642g = i2;
        C14347d c14347d = this.f60640e;
        if (c14347d != null) {
            c14347d.m85082a(i, i2);
        }
        if (this.f60637b != null) {
            SurfaceTexture surfaceTexture2 = this.f60639d.getSurfaceTexture();
            SurfaceTexture surfaceTexture3 = this.f60637b;
            if (surfaceTexture2 != surfaceTexture3) {
                this.f60639d.setSurfaceTexture(surfaceTexture3);
            }
            this.f60637b = null;
        } else {
            mo85036a(surfaceTexture);
        }
        this.f60632B = true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        try {
            this.f60632B = false;
            TXCLog.m84156w("TXCVideoRender", "play:vrender:  onSurfaceTextureDestroyed when need save texture : " + this.f60635E + "id " + getID() + "_" + this.f60645j);
            if (this.f60635E) {
                this.f60637b = surfaceTexture;
            } else {
                this.f60636F.f60672a = 0L;
                mo85042b(surfaceTexture);
                if (surfaceTexture == this.f60637b) {
                    this.f60637b = null;
                }
            }
        } catch (Exception e) {
            TXCLog.m84150e("TXCVideoRender", "onSurfaceTextureDestroyed failed.", e);
        }
        return this.f60637b == null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        TXCLog.m84156w("TXCVideoRender", "play:vrender: texture size change new:" + i + Constants.SEPARATOR_COMMA + i2 + " old:" + this.f60641f + Constants.SEPARATOR_COMMA + this.f60642g);
        if (!this.f60632B) {
            TXCLog.m84156w("TXCVideoRender", "play:vrender: onSurfaceCreate on onSurfaceTextureSizeChanged when onSurfaceTextureAvailable is not trigger");
            this.f60632B = true;
            mo85036a(surfaceTexture);
        }
        this.f60641f = i;
        this.f60642g = i2;
        C14347d c14347d = this.f60640e;
        if (c14347d != null) {
            c14347d.m85082a(i, i2);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* JADX INFO: renamed from: e */
    public void mo85048e() {
    }

    /* JADX INFO: renamed from: c */
    public void m85107c(int i) {
        this.f60656u = i;
        C14347d c14347d = this.f60640e;
        if (c14347d != null) {
            c14347d.m85081a(i);
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo85045c(Object obj) {
    }

    /* JADX INFO: renamed from: a */
    public void m85097a(int i) {
        this.f60645j = i;
    }

    /* JADX INFO: renamed from: a */
    private Bitmap m85088a(Bitmap bitmap, int i, int i2) {
        float height;
        float f = i2;
        float f2 = i;
        if (f / f2 > bitmap.getHeight() / bitmap.getWidth()) {
            height = f2 / bitmap.getWidth();
        } else {
            height = f / bitmap.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.preScale(height, height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public Bitmap m85089a(Matrix matrix, Bitmap bitmap, int i, int i2) {
        Bitmap bitmap2;
        int i3 = 360 - ((this.f60655t + this.f60646k) % 360);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmap.recycle();
        if (i3 != 0) {
            Matrix matrix2 = new Matrix();
            matrix2.setRotate(i3);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, false);
            bitmapCreateBitmap.recycle();
            bitmap2 = bitmapCreateBitmap2;
        } else {
            bitmap2 = bitmapCreateBitmap;
        }
        if (this.f60656u != 0) {
            return (i == bitmap2.getWidth() || i2 == bitmap2.getHeight()) ? bitmap2 : m85088a(bitmap2, i, i2);
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        boolean z = i < i2;
        if (z == (width < height)) {
            return (i == bitmap2.getWidth() || i2 == bitmap2.getHeight()) ? bitmap2 : m85088a(bitmap2, i, i2);
        }
        if (z) {
            float f = i;
            float f2 = (height * f) / i2;
            Matrix matrix3 = new Matrix();
            float f3 = f / f2;
            matrix3.preScale(f3, f3);
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmap2, (int) ((width - f2) * 0.5f), 0, (int) f2, height, matrix3, false);
            bitmap2.recycle();
            return bitmapCreateBitmap3;
        }
        float f4 = i2;
        float f5 = (width / i) * f4;
        Matrix matrix4 = new Matrix();
        float f6 = f4 / f5;
        matrix4.preScale(f6, f6);
        Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(bitmap2, 0, (int) ((height - f5) * 0.5f), width, (int) f5, (Matrix) null, false);
        Bitmap bitmapCreateBitmap5 = Bitmap.createBitmap(bitmapCreateBitmap4, 0, 0, bitmapCreateBitmap4.getWidth(), bitmapCreateBitmap4.getHeight(), matrix4, false);
        bitmapCreateBitmap4.recycle();
        return bitmapCreateBitmap5;
    }

    /* JADX INFO: renamed from: a */
    public void m85101a(final InterfaceC14185o interfaceC14185o) {
        final Bitmap bitmap;
        final TextureView textureView = this.f60639d;
        if (textureView != null) {
            try {
                bitmap = textureView.getBitmap();
            } catch (OutOfMemoryError unused) {
                bitmap = null;
            }
            if (bitmap != null) {
                final Matrix transform = textureView.getTransform(null);
                AsyncTask.execute(new Runnable() { // from class: com.tencent.liteav.renderer.e.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Bitmap bitmapM85089a = null;
                        try {
                            bitmapM85089a = TextureViewSurfaceTextureListenerC14348e.this.m85089a(transform, bitmap, textureView.getWidth(), textureView.getHeight());
                        } catch (Error e) {
                            TXCLog.m84156w("TXCVideoRender", "takePhoto error " + e);
                        } catch (Exception e2) {
                            TXCLog.m84156w("TXCVideoRender", "takePhoto error " + e2);
                        }
                        InterfaceC14185o interfaceC14185o2 = interfaceC14185o;
                        if (interfaceC14185o2 != null) {
                            interfaceC14185o2.onTakePhotoComplete(bitmapM85089a);
                        }
                    }
                });
                return;
            }
            return;
        }
        C14175e c14175e = this.f60652q;
        if (c14175e != null) {
            c14175e.m83931a(new Runnable() { // from class: com.tencent.liteav.renderer.e.2
                @Override // java.lang.Runnable
                public void run() {
                    if (TextureViewSurfaceTextureListenerC14348e.this.f60652q != null) {
                        TextureViewSurfaceTextureListenerC14348e.this.f60652q.m83929a(interfaceC14185o);
                    }
                }
            });
        } else if (interfaceC14185o != null) {
            interfaceC14185o.onTakePhotoComplete(null);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85102a(InterfaceC14349f interfaceC14349f) {
        this.f60650o = interfaceC14349f;
    }

    /* JADX INFO: renamed from: a */
    public void m85100a(InterfaceC14170b interfaceC14170b) {
        this.f60651p = new WeakReference<>(interfaceC14170b);
    }

    /* JADX INFO: renamed from: a */
    public void m85099a(TextureView textureView) {
        m85095b(textureView);
    }

    /* JADX INFO: renamed from: a */
    public void m85098a(Surface surface) {
        m85094b(surface);
    }

    /* JADX INFO: renamed from: a */
    public void mo85037a(TXSVideoFrame tXSVideoFrame, int i, int i2, int i3) {
        if (i3 != this.f60646k) {
            this.f60646k = i3;
            m85109d(this.f60655t);
        }
        mo85034a(i, i2);
        m85093b();
    }

    /* JADX INFO: renamed from: a */
    public void mo85035a(int i, int i2, int i3, boolean z, int i4) {
        mo85034a(i2, i3);
    }

    /* JADX INFO: renamed from: a */
    public void m85104a(boolean z) {
        if (this.f60633C) {
            Monitor.m84161a(2, String.format("Remote-VideoRender[%d]: Stop [tinyID:%s][streamType:%d][stopRendThread:%s]", Integer.valueOf(hashCode()), getID(), Integer.valueOf(this.f60645j), z ? "true" : "false"), "streamType: 2-big, 3-small, 7-sub", 0);
        }
        this.f60633C = false;
        this.f60634D = false;
        this.f60635E = false;
        if (z && this.f60647l == 1) {
            this.f60647l = -1;
            TXCLog.m84156w("TXCVideoRender", "play:vrender: quit render thread when stop");
            mo85048e();
            synchronized (this) {
                try {
                    if (this.f60652q != null) {
                        TXCLog.m84152i("TXCVideoRender", "surface-render:stop render thread " + this.f60652q);
                        this.f60652q.m83926a();
                        this.f60652q = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo85036a(SurfaceTexture surfaceTexture) {
        this.f60632B = true;
    }

    /* JADX INFO: renamed from: a */
    public void mo85034a(int i, int i2) {
        int i3 = this.f60643h;
        if (i3 == i && this.f60644i == i2) {
            return;
        }
        if (i3 == i && this.f60644i == i2) {
            return;
        }
        this.f60643h = i;
        this.f60644i = i2;
        C14347d c14347d = this.f60640e;
        if (c14347d != null) {
            c14347d.m85084b(i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public SurfaceTexture mo85033a() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    private int[] m85092a(int i, int i2, int i3, float[] fArr, boolean z) {
        C14351h c14351h = this.f60653r;
        if (c14351h != null && c14351h.m85131a() != z) {
            this.f60653r.m85135c();
            this.f60653r = null;
        }
        if (this.f60653r == null) {
            C14351h c14351h2 = new C14351h(Boolean.valueOf(z));
            this.f60653r = c14351h2;
            c14351h2.m85132b();
        }
        C14351h c14351h3 = this.f60653r;
        if (fArr != null) {
            c14351h3.m85130a(fArr);
        } else {
            c14351h3.m85130a(f60630a);
        }
        int i4 = this.f60648m;
        int i5 = this.f60649n;
        int i6 = this.f60656u;
        C14351h c14351h4 = this.f60653r;
        if (i6 == 0) {
            c14351h4.m85127a(C14351h.f60684a);
        } else {
            c14351h4.m85127a(C14351h.f60685b);
        }
        int i7 = this.f60655t;
        int i8 = this.f60646k;
        int i9 = (i7 + i8) % 360;
        if (z && (i7 == 90 || i7 == 270)) {
            i9 = ((i7 + i8) + 180) % 360;
        }
        this.f60653r.m85133b(i9);
        this.f60653r.m85134b(i2, i3);
        this.f60653r.m85128a(i4, i5);
        return new int[]{this.f60653r.m85137d(i), i4, i5};
    }

    /* JADX INFO: renamed from: a */
    private long m85087a(long j) {
        long timeTick = TXCTimeUtil.getTimeTick();
        if (j > timeTick) {
            return 0L;
        }
        return timeTick - j;
    }

    /* JADX INFO: renamed from: b */
    public void m85105b(int i) {
        if (i > 0) {
            this.f60638c = i;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m85106b(int i, int i2) {
        mo85034a(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public void mo85042b(SurfaceTexture surfaceTexture) {
        this.f60632B = false;
    }

    /* JADX INFO: renamed from: b */
    private void m85095b(TextureView textureView) {
        boolean z = false;
        if (textureView != null) {
            this.f60647l = 0;
        }
        TextureView textureView2 = this.f60639d;
        if ((textureView2 == null && textureView != null) || (textureView2 != null && !textureView2.equals(textureView))) {
            z = true;
        }
        TXCLog.m84156w("TXCVideoRender", "play:vrender: set video view @old=" + this.f60639d + ",new=" + textureView + "id " + getID() + "_" + this.f60645j);
        if (z) {
            TextureView textureView3 = this.f60639d;
            if (textureView3 != null && this.f60637b == null) {
                mo85042b(textureView3.getSurfaceTexture());
                this.f60639d.setSurfaceTextureListener(null);
            }
            this.f60639d = textureView;
            if (textureView != null) {
                if (textureView.getWidth() != 0) {
                    this.f60641f = this.f60639d.getWidth();
                }
                if (this.f60639d.getHeight() != 0) {
                    this.f60642g = this.f60639d.getHeight();
                }
                C14347d c14347d = new C14347d(this.f60639d);
                this.f60640e = c14347d;
                c14347d.m85084b(this.f60643h, this.f60644i);
                this.f60640e.m85082a(this.f60641f, this.f60642g);
                this.f60640e.m85081a(this.f60656u);
                this.f60640e.m85085c((this.f60655t + this.f60646k) % 360);
                this.f60639d.setSurfaceTextureListener(this);
                SurfaceTexture surfaceTexture = this.f60637b;
                TextureView textureView4 = this.f60639d;
                if (surfaceTexture != null) {
                    SurfaceTexture surfaceTexture2 = textureView4.getSurfaceTexture();
                    SurfaceTexture surfaceTexture3 = this.f60637b;
                    TextureView textureView5 = this.f60639d;
                    if (surfaceTexture2 != surfaceTexture3) {
                        TXCLog.m84156w("TXCVideoRender", "play:vrender: setSurfaceTexture " + textureView5 + ", surfaceTexture " + this.f60637b);
                        try {
                            this.f60639d.setSurfaceTexture(this.f60637b);
                            return;
                        } catch (Exception e) {
                            TXCLog.m84149e("TXCVideoRender", "setSurfaceTexture error " + e);
                            return;
                        }
                    }
                    TXCLog.m84156w("TXCVideoRender", "play:vrender: not setSurfaceTexture old surfaceTexture " + textureView5.getSurfaceTexture() + ", new surfaceTexture " + this.f60637b);
                    return;
                }
                if (textureView4.isAvailable()) {
                    mo85036a(this.f60639d.getSurfaceTexture());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m85094b(Surface surface) {
        TXCLog.m84152i("TXCVideoRender", "surface-render: set surface " + surface);
        if (this.f60654s == surface) {
            TXCLog.m84152i("TXCVideoRender", "surface-render: set the same surface, ignore ");
            return;
        }
        this.f60654s = surface;
        this.f60647l = 1;
        if (surface != null) {
            TXCLog.m84152i("TXCVideoRender", "surface-render: set surface start render thread " + surface);
            mo85045c((Object) null);
            return;
        }
        synchronized (this) {
            try {
                if (this.f60652q != null) {
                    TXCLog.m84152i("TXCVideoRender", "surface-render: set surface stop render thread " + this.f60652q);
                    this.f60652q.m83926a();
                    this.f60652q = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
