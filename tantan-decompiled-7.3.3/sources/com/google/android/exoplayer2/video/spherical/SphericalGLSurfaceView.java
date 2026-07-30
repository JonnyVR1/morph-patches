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
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p153l.a2e0;
import p153l.bmk0;
import p153l.gb4;
import p153l.iel0;
import p153l.w11;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ int f9631m = 0;

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList<InterfaceC2085b> f9632a;

    /* JADX INFO: renamed from: b */
    public final SensorManager f9633b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final Sensor f9634c;

    /* JADX INFO: renamed from: d */
    public final C2086a f9635d;

    /* JADX INFO: renamed from: e */
    public final Handler f9636e;

    /* JADX INFO: renamed from: f */
    public final ViewOnTouchListenerC2087b f9637f;

    /* JADX INFO: renamed from: g */
    public final a2e0 f9638g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public SurfaceTexture f9639h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Surface f9640i;

    /* JADX INFO: renamed from: j */
    public boolean f9641j;

    /* JADX INFO: renamed from: k */
    public boolean f9642k;

    /* JADX INFO: renamed from: l */
    public boolean f9643l;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$a */
    @VisibleForTesting
    public final class C2084a implements GLSurfaceView.Renderer, ViewOnTouchListenerC2087b.a, C2086a.a {

        /* JADX INFO: renamed from: a */
        public final a2e0 f9644a;

        /* JADX INFO: renamed from: d */
        public final float[] f9647d;

        /* JADX INFO: renamed from: e */
        public final float[] f9648e;

        /* JADX INFO: renamed from: f */
        public final float[] f9649f;

        /* JADX INFO: renamed from: g */
        public float f9650g;

        /* JADX INFO: renamed from: h */
        public float f9651h;

        /* JADX INFO: renamed from: b */
        public final float[] f9645b = new float[16];

        /* JADX INFO: renamed from: c */
        public final float[] f9646c = new float[16];

        /* JADX INFO: renamed from: i */
        public final float[] f9652i = new float[16];

        /* JADX INFO: renamed from: j */
        public final float[] f9653j = new float[16];

        public C2084a(a2e0 a2e0Var) {
            float[] fArr = new float[16];
            this.f9647d = fArr;
            float[] fArr2 = new float[16];
            this.f9648e = fArr2;
            float[] fArr3 = new float[16];
            this.f9649f = fArr3;
            this.f9644a = a2e0Var;
            GlUtil.m12191j(fArr);
            GlUtil.m12191j(fArr2);
            GlUtil.m12191j(fArr3);
            this.f9651h = 3.1415927f;
        }

        @Override // com.google.android.exoplayer2.video.spherical.C2086a.a
        @BinderThread
        /* JADX INFO: renamed from: a */
        public synchronized void mo12248a(float[] fArr, float f) {
            float[] fArr2 = this.f9647d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f9651h = -f;
            m12251d();
        }

        @Override // com.google.android.exoplayer2.video.spherical.ViewOnTouchListenerC2087b.a
        @UiThread
        /* JADX INFO: renamed from: b */
        public synchronized void mo12249b(PointF pointF) {
            this.f9650g = pointF.y;
            m12251d();
            Matrix.setRotateM(this.f9649f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        /* JADX INFO: renamed from: c */
        public final float m12250c(float f) {
            if (f > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d);
            }
            return 90.0f;
        }

        @AnyThread
        /* JADX INFO: renamed from: d */
        public final void m12251d() {
            Matrix.setRotateM(this.f9648e, 0, -this.f9650g, (float) Math.cos(this.f9651h), (float) Math.sin(this.f9651h), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f9653j, 0, this.f9647d, 0, this.f9649f, 0);
                Matrix.multiplyMM(this.f9652i, 0, this.f9648e, 0, this.f9653j, 0);
            }
            Matrix.multiplyMM(this.f9646c, 0, this.f9645b, 0, this.f9652i, 0);
            this.f9644a.m95655c(this.f9646c, false);
        }

        @Override // com.google.android.exoplayer2.video.spherical.ViewOnTouchListenerC2087b.a
        @UiThread
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return SphericalGLSurfaceView.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.f9645b, 0, m12250c(f), f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView.this.m12245e(this.f9644a.m95656d());
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView$b */
    public interface InterfaceC2085b {
        /* JADX INFO: renamed from: A */
        void mo10169A(Surface surface);

        /* JADX INFO: renamed from: B */
        void mo10170B(Surface surface);
    }

    public SphericalGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9632a = new CopyOnWriteArrayList<>();
        this.f9636e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) w11.m204369e(context.getSystemService("sensor"));
        this.f9633b = sensorManager;
        Sensor defaultSensor = bmk0.f77313a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f9634c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        a2e0 a2e0Var = new a2e0();
        this.f9638g = a2e0Var;
        C2084a c2084a = new C2084a(a2e0Var);
        ViewOnTouchListenerC2087b viewOnTouchListenerC2087b = new ViewOnTouchListenerC2087b(context, c2084a, 25.0f);
        this.f9637f = viewOnTouchListenerC2087b;
        this.f9635d = new C2086a(((WindowManager) w11.m204369e((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window))).getDefaultDisplay(), viewOnTouchListenerC2087b, c2084a);
        this.f9641j = true;
        setEGLContextClientVersion(2);
        setRenderer(c2084a);
        setOnTouchListener(viewOnTouchListenerC2087b);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12240a(SphericalGLSurfaceView sphericalGLSurfaceView) {
        Surface surface = sphericalGLSurfaceView.f9640i;
        if (surface != null) {
            Iterator<InterfaceC2085b> it = sphericalGLSurfaceView.f9632a.iterator();
            while (it.hasNext()) {
                it.next().mo10169A(surface);
            }
        }
        m12243f(sphericalGLSurfaceView.f9639h, surface);
        sphericalGLSurfaceView.f9639h = null;
        sphericalGLSurfaceView.f9640i = null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m12241b(SphericalGLSurfaceView sphericalGLSurfaceView, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = sphericalGLSurfaceView.f9639h;
        Surface surface = sphericalGLSurfaceView.f9640i;
        Surface surface2 = new Surface(surfaceTexture);
        sphericalGLSurfaceView.f9639h = surfaceTexture;
        sphericalGLSurfaceView.f9640i = surface2;
        Iterator<InterfaceC2085b> it = sphericalGLSurfaceView.f9632a.iterator();
        while (it.hasNext()) {
            it.next().mo10170B(surface2);
        }
        m12243f(surfaceTexture2, surface);
    }

    /* JADX INFO: renamed from: f */
    public static void m12243f(@Nullable SurfaceTexture surfaceTexture, @Nullable Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m12244d(InterfaceC2085b interfaceC2085b) {
        this.f9632a.add(interfaceC2085b);
    }

    /* JADX INFO: renamed from: e */
    public final void m12245e(final SurfaceTexture surfaceTexture) {
        this.f9636e.post(new Runnable() { // from class: l.uwf0
            @Override // java.lang.Runnable
            public final void run() {
                SphericalGLSurfaceView.m12241b(this.f181260a, surfaceTexture);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m12246g(InterfaceC2085b interfaceC2085b) {
        this.f9632a.remove(interfaceC2085b);
    }

    public gb4 getCameraMotionListener() {
        return this.f9638g;
    }

    public iel0 getVideoFrameMetadataListener() {
        return this.f9638g;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.f9640i;
    }

    /* JADX INFO: renamed from: h */
    public final void m12247h() {
        boolean z = this.f9641j && this.f9642k;
        Sensor sensor = this.f9634c;
        if (sensor == null || z == this.f9643l) {
            return;
        }
        SensorManager sensorManager = this.f9633b;
        if (z) {
            sensorManager.registerListener(this.f9635d, sensor, 0);
        } else {
            sensorManager.unregisterListener(this.f9635d);
        }
        this.f9643l = z;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9636e.post(new Runnable() { // from class: l.vwf0
            @Override // java.lang.Runnable
            public final void run() {
                SphericalGLSurfaceView.m12240a(this.f186133a);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f9642k = false;
        m12247h();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f9642k = true;
        m12247h();
    }

    public void setDefaultStereoMode(int i) {
        this.f9638g.m95657f(i);
    }

    public void setUseSensorRotation(boolean z) {
        this.f9641j = z;
        m12247h();
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }
}
