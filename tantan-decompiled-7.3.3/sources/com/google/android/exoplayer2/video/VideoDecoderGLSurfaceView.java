package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C2079b;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p153l.adl0;
import p153l.w11;
import p153l.zcl0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements adl0 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f9614b = 0;

    /* JADX INFO: renamed from: a */
    public final C2083a f9615a;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView$a */
    public static final class C2083a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: k */
        public static final float[] f9616k = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* JADX INFO: renamed from: l */
        public static final float[] f9617l = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: m */
        public static final float[] f9618m = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* JADX INFO: renamed from: n */
        public static final String[] f9619n = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: o */
        public static final FloatBuffer f9620o = GlUtil.m12186e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: a */
        public final GLSurfaceView f9621a;

        /* JADX INFO: renamed from: b */
        public final int[] f9622b = new int[3];

        /* JADX INFO: renamed from: c */
        public final int[] f9623c = new int[3];

        /* JADX INFO: renamed from: d */
        public final int[] f9624d = new int[3];

        /* JADX INFO: renamed from: e */
        public final int[] f9625e = new int[3];

        /* JADX INFO: renamed from: f */
        public final AtomicReference<zcl0> f9626f = new AtomicReference<>();

        /* JADX INFO: renamed from: g */
        public final FloatBuffer[] f9627g = new FloatBuffer[3];

        /* JADX INFO: renamed from: h */
        public C2079b f9628h;

        /* JADX INFO: renamed from: i */
        public int f9629i;

        /* JADX INFO: renamed from: j */
        public zcl0 f9630j;

        public C2083a(GLSurfaceView gLSurfaceView) {
            this.f9621a = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.f9624d;
                this.f9625e[i] = -1;
                iArr[i] = -1;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m12238a(zcl0 zcl0Var) {
            zcl0 andSet = this.f9626f.getAndSet(zcl0Var);
            if (andSet != null) {
                andSet.mo150584u();
            }
            this.f9621a.requestRender();
        }

        @RequiresNonNull({"program"})
        /* JADX INFO: renamed from: b */
        public final void m12239b() {
            try {
                GLES20.glGenTextures(3, this.f9622b, 0);
                for (int i = 0; i < 3; i++) {
                    GLES20.glUniform1i(this.f9628h.m12224j(f9619n[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    GlUtil.m12182a(3553, this.f9622b[i]);
                }
                GlUtil.m12183b();
            } catch (GlUtil.GlException e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            zcl0 andSet = this.f9626f.getAndSet(null);
            if (andSet == null && this.f9630j == null) {
                return;
            }
            if (andSet != null) {
                zcl0 zcl0Var = this.f9630j;
                if (zcl0Var != null) {
                    zcl0Var.mo150584u();
                }
                this.f9630j = andSet;
            }
            zcl0 zcl0Var2 = (zcl0) w11.m204369e(this.f9630j);
            float[] fArr = f9617l;
            int i = zcl0Var2.f203807h;
            if (i == 1) {
                fArr = f9616k;
            } else if (i == 3) {
                fArr = f9618m;
            }
            GLES20.glUniformMatrix3fv(this.f9629i, 1, false, fArr, 0);
            int[] iArr = (int[]) w11.m204369e(zcl0Var2.f203806g);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) w11.m204369e(zcl0Var2.f203805f);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = zcl0Var2.f203804e;
                if (i2 != 0) {
                    i3 = (i3 + 1) / 2;
                }
                int i4 = i3;
                GLES20.glActiveTexture(33984 + i2);
                GLES20.glBindTexture(3553, this.f9622b[i2]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i2], i4, 0, 6409, 5121, byteBufferArr[i2]);
            }
            int i5 = zcl0Var2.f203803d;
            int i6 = (i5 + 1) / 2;
            int[] iArr2 = {i5, i6, i6};
            for (int i7 = 0; i7 < 3; i7++) {
                if (this.f9624d[i7] != iArr2[i7] || this.f9625e[i7] != iArr[i7]) {
                    w11.m204371g(iArr[i7] != 0);
                    float f = iArr2[i7] / iArr[i7];
                    this.f9627g[i7] = GlUtil.m12186e(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f, 0.0f, f, 1.0f});
                    GLES20.glVertexAttribPointer(this.f9623c[i7], 2, 5126, false, 0, (Buffer) this.f9627g[i7]);
                    this.f9624d[i7] = iArr2[i7];
                    this.f9625e[i7] = iArr[i7];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                GlUtil.m12183b();
            } catch (GlUtil.GlException e) {
                Log.e("VideoDecoderGLSV", "Failed to draw a frame", e);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                C2079b c2079b = new C2079b("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f9628h = c2079b;
                GLES20.glVertexAttribPointer(c2079b.m12222e("in_pos"), 2, 5126, false, 0, (Buffer) f9620o);
                this.f9623c[0] = this.f9628h.m12222e("in_tc_y");
                this.f9623c[1] = this.f9628h.m12222e("in_tc_u");
                this.f9623c[2] = this.f9628h.m12222e("in_tc_v");
                this.f9629i = this.f9628h.m12224j("mColorConversion");
                GlUtil.m12183b();
                m12239b();
                GlUtil.m12183b();
            } catch (GlUtil.GlException e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e);
            }
        }
    }

    public VideoDecoderGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        C2083a c2083a = new C2083a(this);
        this.f9615a = c2083a;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(c2083a);
        setRenderMode(0);
    }

    public void setOutputBuffer(zcl0 zcl0Var) {
        this.f9615a.m12238a(zcl0Var);
    }

    @Deprecated
    public adl0 getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }
}
