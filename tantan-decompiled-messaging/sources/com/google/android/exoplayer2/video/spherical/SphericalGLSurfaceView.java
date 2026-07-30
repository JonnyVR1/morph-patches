package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.AnyThread;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p149l.e5l0;
import p149l.ha4;
import p149l.p11;
import p149l.vck0;
import p149l.ytd0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ int f9594m = 0;

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList<InterfaceC2062b> f9595a;

    /* JADX INFO: renamed from: b */
    public final SensorManager f9596b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final Sensor f9597c;

    /* JADX INFO: renamed from: d */
    public final C2063a f9598d;

    /* JADX INFO: renamed from: e */
    public final Handler f9599e;

    /* JADX INFO: renamed from: f */
    public final ViewOnTouchListenerC2064b f9600f;

    /* JADX INFO: renamed from: g */
    public final ytd0 f9601g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public SurfaceTexture f9602h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Surface f9603i;

    /* JADX INFO: renamed from: j */
    public boolean f9604j;

    /* JADX INFO: renamed from: k */
    public boolean f9605k;

    /* JADX INFO: renamed from: l */
    public boolean f9606l;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$a */
    @VisibleForTesting
    public final class C2061a implements GLSurfaceView.Renderer, ViewOnTouchListenerC2064b.a, C2063a.a {

        /* JADX INFO: renamed from: a */
        public final ytd0 f9607a;

        /* JADX INFO: renamed from: d */
        public final float[] f9610d;

        /* JADX INFO: renamed from: e */
        public final float[] f9611e;

        /* JADX INFO: renamed from: f */
        public final float[] f9612f;

        /* JADX INFO: renamed from: g */
        public float f9613g;

        /* JADX INFO: renamed from: h */
        public float f9614h;

        /* JADX INFO: renamed from: b */
        public final float[] f9608b = new float[16];

        /* JADX INFO: renamed from: c */
        public final float[] f9609c = new float[16];

        /* JADX INFO: renamed from: i */
        public final float[] f9615i = new float[16];

        /* JADX INFO: renamed from: j */
        public final float[] f9616j = new float[16];

        public C2061a(ytd0 ytd0Var) {
            float[] fArr = new float[16];
            this.f9610d = fArr;
            float[] fArr2 = new float[16];
            this.f9611e = fArr2;
            float[] fArr3 = new float[16];
            this.f9612f = fArr3;
            this.f9607a = ytd0Var;
            GlUtil.m12137j(fArr);
            GlUtil.m12137j(fArr2);
            GlUtil.m12137j(fArr3);
            this.f9614h = 3.1415927f;
        }

        @Override // com.google.android.exoplayer2.video.spherical.C2063a.a
        @BinderThread
        /* JADX INFO: renamed from: a */
        public synchronized void mo12194a(float[] fArr, float f) {
            float[] fArr2 = this.f9610d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f9614h = -f;
            m12197d();
        }

        @Override // com.google.android.exoplayer2.video.spherical.ViewOnTouchListenerC2064b.a
        @UiThread
        /* JADX INFO: renamed from: b */
        public synchronized void mo12195b(PointF pointF) {
            this.f9613g = pointF.y;
            m12197d();
            Matrix.setRotateM(this.f9612f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        /* JADX INFO: renamed from: c */
        public final float m12196c(float f) {
            if (f > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d);
            }
            return 90.0f;
        }

        @AnyThread
        /* JADX INFO: renamed from: d */
        public final void m12197d() {
            Matrix.setRotateM(this.f9611e, 0, -this.f9613g, (float) Math.cos(this.f9614h), (float) Math.sin(this.f9614h), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f9616j, 0, this.f9610d, 0, this.f9612f, 0);
                Matrix.multiplyMM(this.f9615i, 0, this.f9611e, 0, this.f9616j, 0);
            }
            Matrix.multiplyMM(this.f9609c, 0, this.f9608b, 0, this.f9615i, 0);
            this.f9607a.m216006c(this.f9609c, false);
        }

        @Override // com.google.android.exoplayer2.video.spherical.ViewOnTouchListenerC2064b.a
        @UiThread
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return SphericalGLSurfaceView.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.f9608b, 0, m12196c(f), f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView.this.m12191e(this.f9607a.m216007d());
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$b */
    public interface InterfaceC2062b {
        /* JADX INFO: renamed from: A */
        void mo10115A(Surface surface);

        /* JADX INFO: renamed from: B */
        void mo10116B(Surface surface);
    }

    public SphericalGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9595a = new CopyOnWriteArrayList<>();
        this.f9599e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) p11.m167011e(context.getSystemService("sensor"));
        this.f9596b = sensorManager;
        Sensor defaultSensor = vck0.f180948a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f9597c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        ytd0 ytd0Var = new ytd0();
        this.f9601g = ytd0Var;
        C2061a c2061a = new C2061a(ytd0Var);
        ViewOnTouchListenerC2064b viewOnTouchListenerC2064b = new ViewOnTouchListenerC2064b(context, c2061a, 25.0f);
        this.f9600f = viewOnTouchListenerC2064b;
        this.f9598d = new C2063a(((WindowManager) p11.m167011e((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window))).getDefaultDisplay(), viewOnTouchListenerC2064b, c2061a);
        this.f9604j = true;
        setEGLContextClientVersion(2);
        setRenderer(c2061a);
        setOnTouchListener(viewOnTouchListenerC2064b);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12186a(SphericalGLSurfaceView sphericalGLSurfaceView) {
        Surface surface = sphericalGLSurfaceView.f9603i;
        if (surface != null) {
            Iterator<InterfaceC2062b> it = sphericalGLSurfaceView.f9595a.iterator();
            while (it.hasNext()) {
                it.next().mo10115A(surface);
            }
        }
        m12189f(sphericalGLSurfaceView.f9602h, surface);
        sphericalGLSurfaceView.f9602h = null;
        sphericalGLSurfaceView.f9603i = null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m12187b(SphericalGLSurfaceView sphericalGLSurfaceView, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = sphericalGLSurfaceView.f9602h;
        Surface surface = sphericalGLSurfaceView.f9603i;
        Surface surface2 = new Surface(surfaceTexture);
        sphericalGLSurfaceView.f9602h = surfaceTexture;
        sphericalGLSurfaceView.f9603i = surface2;
        Iterator<InterfaceC2062b> it = sphericalGLSurfaceView.f9595a.iterator();
        while (it.hasNext()) {
            it.next().mo10116B(surface2);
        }
        m12189f(surfaceTexture2, surface);
    }

    /* JADX INFO: renamed from: f */
    public static void m12189f(@Nullable SurfaceTexture surfaceTexture, @Nullable Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m12190d(InterfaceC2062b interfaceC2062b) {
        this.f9595a.add(interfaceC2062b);
    }

    /* JADX INFO: renamed from: e */
    public final void m12191e(final SurfaceTexture surfaceTexture) {
        this.f9599e.post(new Runnable() { // from class: l.lof0
            @Override // java.lang.Runnable
            public final void run() {
                SphericalGLSurfaceView.m12187b(this.f129102a, surfaceTexture);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m12192g(InterfaceC2062b interfaceC2062b) {
        this.f9595a.remove(interfaceC2062b);
    }

    public ha4 getCameraMotionListener() {
        return this.f9601g;
    }

    public e5l0 getVideoFrameMetadataListener() {
        return this.f9601g;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.f9603i;
    }

    /* JADX INFO: renamed from: h */
    public final void m12193h() {
        boolean z = this.f9604j && this.f9605k;
        Sensor sensor = this.f9597c;
        if (sensor == null || z == this.f9606l) {
            return;
        }
        SensorManager sensorManager = this.f9596b;
        if (z) {
            sensorManager.registerListener(this.f9598d, sensor, 0);
        } else {
            sensorManager.unregisterListener(this.f9598d);
        }
        this.f9606l = z;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9599e.post(new Runnable() { // from class: l.mof0
            @Override // java.lang.Runnable
            public final void run() {
                SphericalGLSurfaceView.m12186a(this.f134890a);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f9605k = false;
        m12193h();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f9605k = true;
        m12193h();
    }

    public void setDefaultStereoMode(int i) {
        this.f9601g.m216008f(i);
    }

    public void setUseSensorRotation(boolean z) {
        this.f9604j = z;
        m12193h();
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }
}
