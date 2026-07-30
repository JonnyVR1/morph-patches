package p149l;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class l3j extends ts2 {

    /* JADX INFO: renamed from: c */
    protected float f125912c;

    /* JADX INFO: renamed from: d */
    protected float f125913d;

    /* JADX INFO: renamed from: e */
    private float f125914e;

    /* JADX INFO: renamed from: f */
    private float f125915f;

    /* JADX INFO: renamed from: g */
    protected float f125916g;

    /* JADX INFO: renamed from: i */
    protected float f125917i;

    /* JADX INFO: renamed from: a */
    private float f125910a = 1.0f;

    /* JADX INFO: renamed from: b */
    private float f125911b = 1.0f;

    /* JADX INFO: renamed from: j */
    protected FloatBuffer f125918j = null;

    /* JADX INFO: renamed from: k */
    protected Bitmap f125919k = null;

    /* JADX INFO: renamed from: l */
    protected boolean f125920l = false;

    /* JADX INFO: renamed from: Q1 */
    private void m148396Q1() {
        Bitmap bitmap = this.f125919k;
        if (bitmap != null) {
            this.f125913d = bitmap.getHeight();
            this.f125912c = this.f125919k.getWidth();
        }
        float width = (this.f125912c * 1.0f) / getWidth();
        float height = (this.f125913d * 1.0f) / getHeight();
        if (height > width && this.f125913d / this.f125912c < 1.7777778f) {
            width = height;
        }
        this.f125914e = getWidth() * width;
        this.f125915f = getHeight() * width;
    }

    /* JADX INFO: renamed from: R1 */
    public synchronized void mo148397R1(Bitmap bitmap) {
        this.f125919k = bitmap;
        this.f125920l = true;
    }

    public synchronized int bitmapToTexture(Bitmap bitmap) {
        int[] iArr;
        try {
            iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            if (bitmap != null) {
                GLUtils.texImage2D(3553, 0, bitmap, 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return iArr[0];
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvoid main(){\n    vec2 uv = textureCoordinate;\n    uv.y = 1.0 -uv.y;\n    if (uv.x > 0.0 && uv.x < 1.0        && uv.y > 0.0 && uv.y < 1.0) {    gl_FragColor = texture2D(inputImageTexture0, uv);\n    }}\n";
    }

    @Override // p149l.mcj, p149l.ccj
    public void handleSizeChange() {
        float[] fArr = new float[8];
        this.textureVertices[this.curRotation].position(0);
        this.textureVertices[this.curRotation].get(fArr);
        m148396Q1();
        float f = this.f125914e / this.f125912c;
        this.f125911b = f;
        float f2 = this.f125915f / this.f125913d;
        this.f125910a = f2;
        this.f125916g = (1.0f - f2) / 2.0f;
        this.f125917i = (1.0f - f) / 2.0f;
        this.f125918j = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        for (int i = 0; i < 4; i++) {
            int i2 = i * 2;
            float f3 = fArr[i2];
            double d = f3;
            float f4 = this.f125917i;
            fArr[i2] = d <= 0.5d ? f3 + f4 : f3 - f4;
            int i3 = i2 + 1;
            float f5 = fArr[i3];
            double d2 = f5;
            float f6 = this.f125916g;
            fArr[i3] = d2 <= 0.5d ? f5 + f6 : f5 - f6;
        }
        this.f125918j.position(0);
        this.f125918j.put(fArr);
        this.f125918j.position(0);
        super.handleSizeChange();
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (z) {
            markAsDirty();
        }
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        onDrawFrame();
        mcjVar.unlockRenderBuffer();
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        if (this.f125920l && this.f125919k != null) {
            GLES20.glFinish();
            GLES20.glFinish();
            int i = this.texture_in;
            if (i != 0) {
                GLES20.glDeleteTextures(1, new int[]{i}, 0);
            }
            this.texture_in = bitmapToTexture(this.f125919k);
            this.f125920l = false;
            handleSizeChange();
        }
        if (this.f125919k == null) {
            GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
            GLES20.glClear(16640);
        }
        if (this.f125918j == null) {
            super.passShaderValues();
            return;
        }
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.f125918j.position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.f125918j);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    @Override // p149l.mcj, p149l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
    }
}
