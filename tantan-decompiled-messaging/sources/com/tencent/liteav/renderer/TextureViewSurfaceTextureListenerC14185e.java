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
import com.p046p1.mobile.putong.api.api.TantanException;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.C14040a;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.p088c.C14012e;
import com.tencent.liteav.basic.p088c.InterfaceC14022o;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.liteav.renderer.e */
/* JADX INFO: loaded from: classes2.dex */
public class TextureViewSurfaceTextureListenerC14185e extends C14040a implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a */
    private static final float[] f59782a = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: b */
    private SurfaceTexture f59789b;

    /* JADX INFO: renamed from: d */
    protected TextureView f59791d;

    /* JADX INFO: renamed from: e */
    protected C14184d f59792e;

    /* JADX INFO: renamed from: o */
    protected InterfaceC14186f f59802o;

    /* JADX INFO: renamed from: p */
    WeakReference<InterfaceC14007b> f59803p;

    /* JADX INFO: renamed from: q */
    private C14012e f59804q;

    /* JADX INFO: renamed from: r */
    private C14188h f59805r;

    /* JADX INFO: renamed from: s */
    private Surface f59806s;

    /* JADX INFO: renamed from: u */
    private int f59808u;

    /* JADX INFO: renamed from: f */
    protected int f59793f = 0;

    /* JADX INFO: renamed from: g */
    protected int f59794g = 0;

    /* JADX INFO: renamed from: h */
    protected int f59795h = 0;

    /* JADX INFO: renamed from: i */
    protected int f59796i = 0;

    /* JADX INFO: renamed from: j */
    protected int f59797j = 0;

    /* JADX INFO: renamed from: c */
    private int f59790c = 800;

    /* JADX INFO: renamed from: t */
    private int f59807t = 0;

    /* JADX INFO: renamed from: k */
    protected int f59798k = 0;

    /* JADX INFO: renamed from: l */
    protected volatile int f59799l = -1;

    /* JADX INFO: renamed from: m */
    protected int f59800m = 0;

    /* JADX INFO: renamed from: n */
    protected int f59801n = 0;

    /* JADX INFO: renamed from: v */
    private int[] f59809v = new int[5];

    /* JADX INFO: renamed from: w */
    private int f59810w = 500;

    /* JADX INFO: renamed from: x */
    private long f59811x = 0;

    /* JADX INFO: renamed from: y */
    private long f59812y = 0;

    /* JADX INFO: renamed from: z */
    private long f59813z = 0;

    /* JADX INFO: renamed from: A */
    private long f59783A = 0;

    /* JADX INFO: renamed from: B */
    private boolean f59784B = false;

    /* JADX INFO: renamed from: C */
    private boolean f59785C = false;

    /* JADX INFO: renamed from: E */
    private boolean f59787E = false;

    /* JADX INFO: renamed from: F */
    private a f59788F = new a();

    /* JADX INFO: renamed from: D */
    private boolean f59786D = false;

    /* JADX INFO: renamed from: com.tencent.liteav.renderer.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public long f59824a;

        /* JADX INFO: renamed from: b */
        public long f59825b;

        /* JADX INFO: renamed from: c */
        public long f59826c;

        /* JADX INFO: renamed from: d */
        public long f59827d;

        /* JADX INFO: renamed from: e */
        public long f59828e;

        /* JADX INFO: renamed from: f */
        public long f59829f;

        /* JADX INFO: renamed from: g */
        public long f59830g;

        /* JADX INFO: renamed from: h */
        public long f59831h;

        /* JADX INFO: renamed from: i */
        public long f59832i;

        /* JADX INFO: renamed from: j */
        public long f59833j;

        /* JADX INFO: renamed from: k */
        public int f59834k;

        /* JADX INFO: renamed from: l */
        public int f59835l;
    }

    /* JADX INFO: renamed from: b */
    private void m83910b() {
        if (!this.f59786D) {
            Bundle bundle = new Bundle();
            bundle.putString("EVT_USERID", getID());
            bundle.putInt("EVT_ID", 2003);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Render the first video frame(IDR)");
            bundle.putInt("EVT_PARAM1", this.f59795h);
            bundle.putInt("EVT_PARAM2", this.f59796i);
            C14052f.m83035a(this.f59803p, 2003, bundle);
            setStatusValue(6001, this.f59797j, Long.valueOf(TXCTimeUtil.getTimeTick()));
            setStatusValue(FirebaseError.ERROR_USER_TOKEN_EXPIRED, this.f59797j, Integer.valueOf(this.f59795h));
            setStatusValue(17022, this.f59797j, Integer.valueOf(this.f59796i));
            TXCLog.m82969i("TXCVideoRender", "trtc_render render first frame " + getID() + ", " + this.f59797j);
            this.f59786D = true;
            Monitor.m82978a(2, String.format("Remote-VideoRender[%d]: Render first frame [tinyID:%s][streamType:%d]", Integer.valueOf(hashCode()), getID(), Integer.valueOf(this.f59797j)), "streamType: 2-big, 3-small, 7-sub", 0);
            TXCKeyPointReportProxy.m82987a(getID(), TantanException.Client.AccountService.NEW_DEVICE_SIGN_IN, 0L, this.f59797j);
        }
        this.f59788F.f59826c++;
        m83937o();
        a aVar = this.f59788F;
        long j = aVar.f59827d;
        if (j != 0) {
            aVar.f59832i = m83904a(j);
            a aVar2 = this.f59788F;
            long j2 = aVar2.f59833j;
            long j3 = aVar2.f59832i;
            aVar2.f59833j = j2 + j3;
            if (j3 > this.f59810w) {
                long j4 = aVar2.f59828e + 1;
                aVar2.f59828e = j4;
                setStatusValue(6003, this.f59797j, Long.valueOf(j4));
                a aVar3 = this.f59788F;
                long j5 = aVar3.f59832i;
                if (j5 > aVar3.f59831h) {
                    aVar3.f59831h = j5;
                    setStatusValue(PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION, this.f59797j, Long.valueOf(j5));
                }
                TXCLog.m82973w("TXCVideoRender", "render frame count:" + this.f59788F.f59826c + " block time:" + this.f59788F.f59832i + "> 500");
            }
            long j6 = this.f59788F.f59832i;
            if (j6 > this.f59790c) {
                this.f59811x++;
                this.f59813z += j6;
                TXCLog.m82973w("TXCVideoRender", "render frame count:" + this.f59788F.f59826c + " block time:" + this.f59788F.f59832i + "> " + this.f59790c);
                WeakReference<InterfaceC14007b> weakReference = this.f59803p;
                String id = getID();
                StringBuilder sb = new StringBuilder("Current video playback stuck for ");
                sb.append(this.f59788F.f59832i);
                sb.append("ms");
                C14052f.m83038a(weakReference, id, 2105, sb.toString());
                a aVar4 = this.f59788F;
                long j7 = aVar4.f59830g + aVar4.f59832i;
                aVar4.f59830g = j7;
                setStatusValue(PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR, this.f59797j, Long.valueOf(j7));
            }
            a aVar5 = this.f59788F;
            if (aVar5.f59832i > 1000) {
                long j8 = aVar5.f59829f + 1;
                aVar5.f59829f = j8;
                setStatusValue(6004, this.f59797j, Long.valueOf(j8));
                TXCLog.m82973w("TXCVideoRender", "render frame count:" + this.f59788F.f59826c + " block time:" + this.f59788F.f59832i + "> 1000");
            }
        }
        long timeTick = TXCTimeUtil.getTimeTick();
        long j9 = this.f59812y;
        if (j9 == 0) {
            this.f59812y = timeTick;
        } else if (timeTick - j9 >= 2000) {
            setStatusValue(FirebaseError.ERROR_PROVIDER_ALREADY_LINKED, this.f59797j, Long.valueOf(this.f59811x));
            setStatusValue(FirebaseError.ERROR_NO_SUCH_PROVIDER, this.f59797j, Long.valueOf(this.f59813z));
            if (this.f59783A != 0) {
                TXCKeyPointReportProxy.m82987a(getID(), 40005, (int) this.f59813z, this.f59797j);
                TXCKeyPointReportProxy.m82987a(getID(), 40006, (int) (timeTick - this.f59812y), this.f59797j);
                setStatusValue(6020, this.f59797j, Long.valueOf(this.f59788F.f59833j));
            }
            this.f59811x = 0L;
            this.f59812y = timeTick;
            this.f59813z = 0L;
        }
        this.f59788F.f59827d = TXCTimeUtil.getTimeTick();
        if (this.f59783A == 0) {
            this.f59783A = this.f59788F.f59827d;
        }
        a aVar6 = this.f59788F;
        aVar6.f59835l = this.f59796i;
        aVar6.f59834k = this.f59795h;
    }

    /* JADX INFO: renamed from: a */
    public void m83920a(Object obj, int i, float[] fArr, boolean z) {
        Surface surfaceM82749b;
        if (this.f59799l == 1) {
            int[] iArrM83909a = m83909a(i, this.f59795h, this.f59796i, fArr, z);
            int i2 = iArrM83909a[0];
            int i3 = iArrM83909a[1];
            int i4 = iArrM83909a[2];
            System.arraycopy(iArrM83909a, 0, this.f59809v, 0, 3);
            int[] iArr = this.f59809v;
            if (z) {
                iArr[3] = 1;
                iArr[4] = 180;
            } else {
                iArr[3] = 0;
                iArr[4] = 0;
            }
            synchronized (this) {
                try {
                    Surface surface = this.f59806s;
                    C14012e c14012e = this.f59804q;
                    if (surface != null) {
                        if (c14012e != null && ((surfaceM82749b = c14012e.m82749b()) != surface || (surfaceM82749b != null && !surfaceM82749b.isValid()))) {
                            TXCLog.m82969i("TXCVideoRender", "surface-render: onDrawTextureToSurface surface change stop render thread " + this.f59804q + ", " + surfaceM82749b + ", " + surface);
                            this.f59804q.m82743a();
                            this.f59804q = null;
                        }
                        if (this.f59804q == null && this.f59799l == 1 && surface.isValid()) {
                            this.f59804q = new C14012e();
                            TXCLog.m82969i("TXCVideoRender", "surface-render: onDrawTextureToSurface start render thread " + this.f59804q + Constants.SEPARATOR_COMMA + surface);
                            this.f59804q.m82747a(obj, surface);
                        }
                        if (this.f59804q != null && this.f59799l == 1) {
                            C14012e c14012e2 = this.f59804q;
                            if (z) {
                                c14012e2.m82745a(i2, true, 180, this.f59800m, this.f59801n, i3, i4, false, false);
                            } else {
                                c14012e2.m82745a(i2, false, 0, this.f59800m, this.f59801n, i3, i4, false, false);
                            }
                        }
                    } else if (c14012e != null) {
                        TXCLog.m82969i("TXCVideoRender", "surface-render: onDrawTextureToSurface stop render thread " + this.f59804q);
                        this.f59804q.m82743a();
                        this.f59804q = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m83925c(final int i, final int i2) {
        TXCLog.m82969i("TXCVideoRender", "surface-render: set setSurfaceSize " + i + "*" + i2);
        if (i == this.f59800m && i2 == this.f59801n) {
            return;
        }
        if (this.f59804q != null && this.f59799l == 1 && this.f59809v != null) {
            this.f59804q.m82748a(new Runnable() { // from class: com.tencent.liteav.renderer.e.3
                @Override // java.lang.Runnable
                public void run() {
                    TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e = TextureViewSurfaceTextureListenerC14185e.this;
                    textureViewSurfaceTextureListenerC14185e.f59800m = i;
                    textureViewSurfaceTextureListenerC14185e.f59801n = i2;
                    if (textureViewSurfaceTextureListenerC14185e.f59804q != null) {
                        C14012e c14012e = TextureViewSurfaceTextureListenerC14185e.this.f59804q;
                        int i3 = TextureViewSurfaceTextureListenerC14185e.this.f59809v[0];
                        boolean z = TextureViewSurfaceTextureListenerC14185e.this.f59809v[3] == 1;
                        int i4 = TextureViewSurfaceTextureListenerC14185e.this.f59809v[4];
                        TextureViewSurfaceTextureListenerC14185e textureViewSurfaceTextureListenerC14185e2 = TextureViewSurfaceTextureListenerC14185e.this;
                        c14012e.m82745a(i3, z, i4, textureViewSurfaceTextureListenerC14185e2.f59800m, textureViewSurfaceTextureListenerC14185e2.f59801n, textureViewSurfaceTextureListenerC14185e2.f59809v[1], TextureViewSurfaceTextureListenerC14185e.this.f59809v[2], true, false);
                    }
                }
            });
        } else {
            this.f59800m = i;
            this.f59801n = i2;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m83926d(int i) {
        this.f59807t = i;
        C14184d c14184d = this.f59792e;
        if (c14184d != null) {
            c14184d.m83902c((i + this.f59798k) % 360);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m83927e(int i) {
        this.f59810w = i;
    }

    /* JADX INFO: renamed from: f */
    public void m83928f() {
        Monitor.m82978a(2, String.format("Remote-VideoRender[%d]: Start [tinyID:%s] [streamType:%d]", Integer.valueOf(hashCode()), getID(), Integer.valueOf(this.f59797j)), "streamType: 2-big, 3-small, 7-sub", 0);
        this.f59785C = true;
        this.f59787E = true;
        this.f59786D = false;
        m83935m();
    }

    /* JADX INFO: renamed from: g */
    public int m83929g() {
        TextureView textureView = this.f59791d;
        if (textureView != null) {
            return textureView.getWidth();
        }
        if (this.f59806s != null) {
            return this.f59800m;
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public int m83930h() {
        TextureView textureView = this.f59791d;
        if (textureView != null) {
            return textureView.getHeight();
        }
        if (this.f59806s != null) {
            return this.f59801n;
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public int m83931i() {
        return this.f59795h;
    }

    /* JADX INFO: renamed from: j */
    public int m83932j() {
        return this.f59796i;
    }

    /* JADX INFO: renamed from: k */
    public void m83933k() {
    }

    /* JADX INFO: renamed from: l */
    public void m83934l() {
        synchronized (this) {
            try {
                if (this.f59804q != null) {
                    TXCLog.m82969i("TXCVideoRender", "surface-render: onRenderThreadEGLDestroy stop render thread " + this.f59804q);
                    this.f59804q.m82743a();
                    this.f59804q = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C14188h c14188h = this.f59805r;
        if (c14188h != null) {
            c14188h.m83952c();
            this.f59805r = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m83935m() {
        m83936n();
        a aVar = this.f59788F;
        aVar.f59825b = 0L;
        aVar.f59826c = 0L;
        aVar.f59828e = 0L;
        aVar.f59829f = 0L;
        aVar.f59830g = 0L;
        aVar.f59831h = 0L;
        aVar.f59833j = 0L;
        this.f59783A = 0L;
        setStatusValue(6001, this.f59797j, 0L);
        setStatusValue(6003, this.f59797j, 0L);
        setStatusValue(PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION, this.f59797j, 0L);
        setStatusValue(PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR, this.f59797j, 0L);
        setStatusValue(6004, this.f59797j, 0L);
        setStatusValue(6020, this.f59797j, 0L);
    }

    /* JADX INFO: renamed from: n */
    public void m83936n() {
        a aVar = this.f59788F;
        aVar.f59824a = 0L;
        aVar.f59827d = 0L;
        aVar.f59832i = 0L;
        aVar.f59834k = 0;
        aVar.f59835l = 0;
        setStatusValue(6002, this.f59797j, Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        setStatusValue(FirebaseError.ERROR_USER_TOKEN_EXPIRED, this.f59797j, 0);
        setStatusValue(17022, this.f59797j, 0);
    }

    /* JADX INFO: renamed from: o */
    public void m83937o() {
        a aVar = this.f59788F;
        if (aVar.f59824a == 0) {
            aVar.f59824a = TXCTimeUtil.getTimeTick();
            return;
        }
        long timeTick = TXCTimeUtil.getTimeTick();
        a aVar2 = this.f59788F;
        long j = timeTick - aVar2.f59824a;
        if (j >= 950) {
            double d = ((aVar2.f59826c - aVar2.f59825b) * 1000.0d) / j;
            setStatusValue(6002, this.f59797j, Double.valueOf(d));
            TXCKeyPointReportProxy.m82987a(getID(), 40001, (int) d, this.f59797j);
            a aVar3 = this.f59788F;
            aVar3.f59825b = aVar3.f59826c;
            aVar3.f59824a += j;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        TXCLog.m82973w("TXCVideoRender", "play:vrender: texture available @" + surfaceTexture + "id " + getID() + "_" + this.f59797j);
        this.f59793f = i;
        this.f59794g = i2;
        C14184d c14184d = this.f59792e;
        if (c14184d != null) {
            c14184d.m83899a(i, i2);
        }
        if (this.f59789b != null) {
            SurfaceTexture surfaceTexture2 = this.f59791d.getSurfaceTexture();
            SurfaceTexture surfaceTexture3 = this.f59789b;
            if (surfaceTexture2 != surfaceTexture3) {
                this.f59791d.setSurfaceTexture(surfaceTexture3);
            }
            this.f59789b = null;
        } else {
            mo83853a(surfaceTexture);
        }
        this.f59784B = true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        try {
            this.f59784B = false;
            TXCLog.m82973w("TXCVideoRender", "play:vrender:  onSurfaceTextureDestroyed when need save texture : " + this.f59787E + "id " + getID() + "_" + this.f59797j);
            if (this.f59787E) {
                this.f59789b = surfaceTexture;
            } else {
                this.f59788F.f59824a = 0L;
                mo83859b(surfaceTexture);
                if (surfaceTexture == this.f59789b) {
                    this.f59789b = null;
                }
            }
        } catch (Exception e) {
            TXCLog.m82967e("TXCVideoRender", "onSurfaceTextureDestroyed failed.", e);
        }
        return this.f59789b == null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        TXCLog.m82973w("TXCVideoRender", "play:vrender: texture size change new:" + i + Constants.SEPARATOR_COMMA + i2 + " old:" + this.f59793f + Constants.SEPARATOR_COMMA + this.f59794g);
        if (!this.f59784B) {
            TXCLog.m82973w("TXCVideoRender", "play:vrender: onSurfaceCreate on onSurfaceTextureSizeChanged when onSurfaceTextureAvailable is not trigger");
            this.f59784B = true;
            mo83853a(surfaceTexture);
        }
        this.f59793f = i;
        this.f59794g = i2;
        C14184d c14184d = this.f59792e;
        if (c14184d != null) {
            c14184d.m83899a(i, i2);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* JADX INFO: renamed from: e */
    public void mo83865e() {
    }

    /* JADX INFO: renamed from: c */
    public void m83924c(int i) {
        this.f59808u = i;
        C14184d c14184d = this.f59792e;
        if (c14184d != null) {
            c14184d.m83898a(i);
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo83862c(Object obj) {
    }

    /* JADX INFO: renamed from: a */
    public void m83914a(int i) {
        this.f59797j = i;
    }

    /* JADX INFO: renamed from: a */
    private Bitmap m83905a(Bitmap bitmap, int i, int i2) {
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
    public Bitmap m83906a(Matrix matrix, Bitmap bitmap, int i, int i2) {
        Bitmap bitmap2;
        int i3 = 360 - ((this.f59807t + this.f59798k) % 360);
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
        if (this.f59808u != 0) {
            return (i == bitmap2.getWidth() || i2 == bitmap2.getHeight()) ? bitmap2 : m83905a(bitmap2, i, i2);
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        boolean z = i < i2;
        if (z == (width < height)) {
            return (i == bitmap2.getWidth() || i2 == bitmap2.getHeight()) ? bitmap2 : m83905a(bitmap2, i, i2);
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
    public void m83918a(final InterfaceC14022o interfaceC14022o) {
        final Bitmap bitmap;
        final TextureView textureView = this.f59791d;
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
                        Bitmap bitmapM83906a = null;
                        try {
                            bitmapM83906a = TextureViewSurfaceTextureListenerC14185e.this.m83906a(transform, bitmap, textureView.getWidth(), textureView.getHeight());
                        } catch (Error e) {
                            TXCLog.m82973w("TXCVideoRender", "takePhoto error " + e);
                        } catch (Exception e2) {
                            TXCLog.m82973w("TXCVideoRender", "takePhoto error " + e2);
                        }
                        InterfaceC14022o interfaceC14022o2 = interfaceC14022o;
                        if (interfaceC14022o2 != null) {
                            interfaceC14022o2.onTakePhotoComplete(bitmapM83906a);
                        }
                    }
                });
                return;
            }
            return;
        }
        C14012e c14012e = this.f59804q;
        if (c14012e != null) {
            c14012e.m82748a(new Runnable() { // from class: com.tencent.liteav.renderer.e.2
                @Override // java.lang.Runnable
                public void run() {
                    if (TextureViewSurfaceTextureListenerC14185e.this.f59804q != null) {
                        TextureViewSurfaceTextureListenerC14185e.this.f59804q.m82746a(interfaceC14022o);
                    }
                }
            });
        } else if (interfaceC14022o != null) {
            interfaceC14022o.onTakePhotoComplete(null);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83919a(InterfaceC14186f interfaceC14186f) {
        this.f59802o = interfaceC14186f;
    }

    /* JADX INFO: renamed from: a */
    public void m83917a(InterfaceC14007b interfaceC14007b) {
        this.f59803p = new WeakReference<>(interfaceC14007b);
    }

    /* JADX INFO: renamed from: a */
    public void m83916a(TextureView textureView) {
        m83912b(textureView);
    }

    /* JADX INFO: renamed from: a */
    public void m83915a(Surface surface) {
        m83911b(surface);
    }

    /* JADX INFO: renamed from: a */
    public void mo83854a(TXSVideoFrame tXSVideoFrame, int i, int i2, int i3) {
        if (i3 != this.f59798k) {
            this.f59798k = i3;
            m83926d(this.f59807t);
        }
        mo83851a(i, i2);
        m83910b();
    }

    /* JADX INFO: renamed from: a */
    public void mo83852a(int i, int i2, int i3, boolean z, int i4) {
        mo83851a(i2, i3);
    }

    /* JADX INFO: renamed from: a */
    public void m83921a(boolean z) {
        if (this.f59785C) {
            Monitor.m82978a(2, String.format("Remote-VideoRender[%d]: Stop [tinyID:%s][streamType:%d][stopRendThread:%s]", Integer.valueOf(hashCode()), getID(), Integer.valueOf(this.f59797j), z ? "true" : "false"), "streamType: 2-big, 3-small, 7-sub", 0);
        }
        this.f59785C = false;
        this.f59786D = false;
        this.f59787E = false;
        if (z && this.f59799l == 1) {
            this.f59799l = -1;
            TXCLog.m82973w("TXCVideoRender", "play:vrender: quit render thread when stop");
            mo83865e();
            synchronized (this) {
                try {
                    if (this.f59804q != null) {
                        TXCLog.m82969i("TXCVideoRender", "surface-render:stop render thread " + this.f59804q);
                        this.f59804q.m82743a();
                        this.f59804q = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo83853a(SurfaceTexture surfaceTexture) {
        this.f59784B = true;
    }

    /* JADX INFO: renamed from: a */
    public void mo83851a(int i, int i2) {
        int i3 = this.f59795h;
        if (i3 == i && this.f59796i == i2) {
            return;
        }
        if (i3 == i && this.f59796i == i2) {
            return;
        }
        this.f59795h = i;
        this.f59796i = i2;
        C14184d c14184d = this.f59792e;
        if (c14184d != null) {
            c14184d.m83901b(i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public SurfaceTexture mo83850a() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    private int[] m83909a(int i, int i2, int i3, float[] fArr, boolean z) {
        C14188h c14188h = this.f59805r;
        if (c14188h != null && c14188h.m83948a() != z) {
            this.f59805r.m83952c();
            this.f59805r = null;
        }
        if (this.f59805r == null) {
            C14188h c14188h2 = new C14188h(Boolean.valueOf(z));
            this.f59805r = c14188h2;
            c14188h2.m83949b();
        }
        C14188h c14188h3 = this.f59805r;
        if (fArr != null) {
            c14188h3.m83947a(fArr);
        } else {
            c14188h3.m83947a(f59782a);
        }
        int i4 = this.f59800m;
        int i5 = this.f59801n;
        int i6 = this.f59808u;
        C14188h c14188h4 = this.f59805r;
        if (i6 == 0) {
            c14188h4.m83944a(C14188h.f59836a);
        } else {
            c14188h4.m83944a(C14188h.f59837b);
        }
        int i7 = this.f59807t;
        int i8 = this.f59798k;
        int i9 = (i7 + i8) % 360;
        if (z && (i7 == 90 || i7 == 270)) {
            i9 = ((i7 + i8) + 180) % 360;
        }
        this.f59805r.m83950b(i9);
        this.f59805r.m83951b(i2, i3);
        this.f59805r.m83945a(i4, i5);
        return new int[]{this.f59805r.m83954d(i), i4, i5};
    }

    /* JADX INFO: renamed from: a */
    private long m83904a(long j) {
        long timeTick = TXCTimeUtil.getTimeTick();
        if (j > timeTick) {
            return 0L;
        }
        return timeTick - j;
    }

    /* JADX INFO: renamed from: b */
    public void m83922b(int i) {
        if (i > 0) {
            this.f59790c = i;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83923b(int i, int i2) {
        mo83851a(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public void mo83859b(SurfaceTexture surfaceTexture) {
        this.f59784B = false;
    }

    /* JADX INFO: renamed from: b */
    private void m83912b(TextureView textureView) {
        boolean z = false;
        if (textureView != null) {
            this.f59799l = 0;
        }
        TextureView textureView2 = this.f59791d;
        if ((textureView2 == null && textureView != null) || (textureView2 != null && !textureView2.equals(textureView))) {
            z = true;
        }
        TXCLog.m82973w("TXCVideoRender", "play:vrender: set video view @old=" + this.f59791d + ",new=" + textureView + "id " + getID() + "_" + this.f59797j);
        if (z) {
            TextureView textureView3 = this.f59791d;
            if (textureView3 != null && this.f59789b == null) {
                mo83859b(textureView3.getSurfaceTexture());
                this.f59791d.setSurfaceTextureListener(null);
            }
            this.f59791d = textureView;
            if (textureView != null) {
                if (textureView.getWidth() != 0) {
                    this.f59793f = this.f59791d.getWidth();
                }
                if (this.f59791d.getHeight() != 0) {
                    this.f59794g = this.f59791d.getHeight();
                }
                C14184d c14184d = new C14184d(this.f59791d);
                this.f59792e = c14184d;
                c14184d.m83901b(this.f59795h, this.f59796i);
                this.f59792e.m83899a(this.f59793f, this.f59794g);
                this.f59792e.m83898a(this.f59808u);
                this.f59792e.m83902c((this.f59807t + this.f59798k) % 360);
                this.f59791d.setSurfaceTextureListener(this);
                SurfaceTexture surfaceTexture = this.f59789b;
                TextureView textureView4 = this.f59791d;
                if (surfaceTexture != null) {
                    SurfaceTexture surfaceTexture2 = textureView4.getSurfaceTexture();
                    SurfaceTexture surfaceTexture3 = this.f59789b;
                    TextureView textureView5 = this.f59791d;
                    if (surfaceTexture2 != surfaceTexture3) {
                        TXCLog.m82973w("TXCVideoRender", "play:vrender: setSurfaceTexture " + textureView5 + ", surfaceTexture " + this.f59789b);
                        try {
                            this.f59791d.setSurfaceTexture(this.f59789b);
                            return;
                        } catch (Exception e) {
                            TXCLog.m82966e("TXCVideoRender", "setSurfaceTexture error " + e);
                            return;
                        }
                    }
                    TXCLog.m82973w("TXCVideoRender", "play:vrender: not setSurfaceTexture old surfaceTexture " + textureView5.getSurfaceTexture() + ", new surfaceTexture " + this.f59789b);
                    return;
                }
                if (textureView4.isAvailable()) {
                    mo83853a(this.f59791d.getSurfaceTexture());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m83911b(Surface surface) {
        TXCLog.m82969i("TXCVideoRender", "surface-render: set surface " + surface);
        if (this.f59806s == surface) {
            TXCLog.m82969i("TXCVideoRender", "surface-render: set the same surface, ignore ");
            return;
        }
        this.f59806s = surface;
        this.f59799l = 1;
        if (surface != null) {
            TXCLog.m82969i("TXCVideoRender", "surface-render: set surface start render thread " + surface);
            mo83862c((Object) null);
            return;
        }
        synchronized (this) {
            try {
                if (this.f59804q != null) {
                    TXCLog.m82969i("TXCVideoRender", "surface-render: set surface stop render thread " + this.f59804q);
                    this.f59804q.m82743a();
                    this.f59804q = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
