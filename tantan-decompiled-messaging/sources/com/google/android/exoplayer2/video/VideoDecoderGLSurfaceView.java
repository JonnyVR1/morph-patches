package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C2056b;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p149l.p11;
import p149l.v3l0;
import p149l.w3l0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements w3l0 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f9577b = 0;

    /* JADX INFO: renamed from: a */
    public final C2060a f9578a;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView$a */
    public static final class C2060a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: k */
        public static final float[] f9579k = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* JADX INFO: renamed from: l */
        public static final float[] f9580l = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: m */
        public static final float[] f9581m = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* JADX INFO: renamed from: n */
        public static final String[] f9582n = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: o */
        public static final FloatBuffer f9583o = GlUtil.m12132e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: a */
        public final GLSurfaceView f9584a;

        /* JADX INFO: renamed from: b */
        public final int[] f9585b = new int[3];

        /* JADX INFO: renamed from: c */
        public final int[] f9586c = new int[3];

        /* JADX INFO: renamed from: d */
        public final int[] f9587d = new int[3];

        /* JADX INFO: renamed from: e */
        public final int[] f9588e = new int[3];

        /* JADX INFO: renamed from: f */
        public final AtomicReference<v3l0> f9589f = new AtomicReference<>();

        /* JADX INFO: renamed from: g */
        public final FloatBuffer[] f9590g = new FloatBuffer[3];

        /* JADX INFO: renamed from: h */
        public C2056b f9591h;

        /* JADX INFO: renamed from: i */
        public int f9592i;

        /* JADX INFO: renamed from: j */
        public v3l0 f9593j;

        public C2060a(GLSurfaceView gLSurfaceView) {
            this.f9584a = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.f9587d;
                this.f9588e[i] = -1;
                iArr[i] = -1;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m12184a(v3l0 v3l0Var) {
            v3l0 andSet = this.f9589f.getAndSet(v3l0Var);
            if (andSet != null) {
                andSet.mo121353u();
            }
            this.f9584a.requestRender();
        }

        @RequiresNonNull({"program"})
        /* JADX INFO: renamed from: b */
        public final void m12185b() {
            try {
                GLES20.glGenTextures(3, this.f9585b, 0);
                for (int i = 0; i < 3; i++) {
                    GLES20.glUniform1i(this.f9591h.m12170j(f9582n[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    GlUtil.m12128a(3553, this.f9585b[i]);
                }
                GlUtil.m12129b();
            } catch (GlUtil.GlException e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            v3l0 andSet = this.f9589f.getAndSet(null);
            if (andSet == null && this.f9593j == null) {
                return;
            }
            if (andSet != null) {
                v3l0 v3l0Var = this.f9593j;
                if (v3l0Var != null) {
                    v3l0Var.mo121353u();
                }
                this.f9593j = andSet;
            }
            v3l0 v3l0Var2 = (v3l0) p11.m167011e(this.f9593j);
            float[] fArr = f9580l;
            int i = v3l0Var2.f179827h;
            if (i == 1) {
                fArr = f9579k;
            } else if (i == 3) {
                fArr = f9581m;
            }
            GLES20.glUniformMatrix3fv(this.f9592i, 1, false, fArr, 0);
            int[] iArr = (int[]) p11.m167011e(v3l0Var2.f179826g);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) p11.m167011e(v3l0Var2.f179825f);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = v3l0Var2.f179824e;
                if (i2 != 0) {
                    i3 = (i3 + 1) / 2;
                }
                int i4 = i3;
                GLES20.glActiveTexture(33984 + i2);
                GLES20.glBindTexture(3553, this.f9585b[i2]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i2], i4, 0, 6409, 5121, byteBufferArr[i2]);
            }
            int i5 = v3l0Var2.f179823d;
            int i6 = (i5 + 1) / 2;
            int[] iArr2 = {i5, i6, i6};
            for (int i7 = 0; i7 < 3; i7++) {
                if (this.f9587d[i7] != iArr2[i7] || this.f9588e[i7] != iArr[i7]) {
                    p11.m167013g(iArr[i7] != 0);
                    float f = iArr2[i7] / iArr[i7];
                    this.f9590g[i7] = GlUtil.m12132e(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f, 0.0f, f, 1.0f});
                    GLES20.glVertexAttribPointer(this.f9586c[i7], 2, 5126, false, 0, (Buffer) this.f9590g[i7]);
                    this.f9587d[i7] = iArr2[i7];
                    this.f9588e[i7] = iArr[i7];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                GlUtil.m12129b();
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
                C2056b c2056b = new C2056b("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f9591h = c2056b;
                GLES20.glVertexAttribPointer(c2056b.m12168e("in_pos"), 2, 5126, false, 0, (Buffer) f9583o);
                this.f9586c[0] = this.f9591h.m12168e("in_tc_y");
                this.f9586c[1] = this.f9591h.m12168e("in_tc_u");
                this.f9586c[2] = this.f9591h.m12168e("in_tc_v");
                this.f9592i = this.f9591h.m12170j("mColorConversion");
                GlUtil.m12129b();
                m12185b();
                GlUtil.m12129b();
            } catch (GlUtil.GlException e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e);
            }
        }
    }

    public VideoDecoderGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        C2060a c2060a = new C2060a(this);
        this.f9578a = c2060a;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(c2060a);
        setRenderMode(0);
    }

    public void setOutputBuffer(v3l0 v3l0Var) {
        this.f9578a.m12184a(v3l0Var);
    }

    @Deprecated
    public w3l0 getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }
}
