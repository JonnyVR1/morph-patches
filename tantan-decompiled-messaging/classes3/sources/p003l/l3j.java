package p003l;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class l3j extends ts2 {

    /* JADX INFO: renamed from: c */
    protected float f5202c;

    /* JADX INFO: renamed from: d */
    protected float f5203d;

    /* JADX INFO: renamed from: e */
    private float f5204e;

    /* JADX INFO: renamed from: f */
    private float f5205f;

    /* JADX INFO: renamed from: g */
    protected float f5206g;

    /* JADX INFO: renamed from: i */
    protected float f5207i;

    /* JADX INFO: renamed from: a */
    private float f5200a = 1.0f;

    /* JADX INFO: renamed from: b */
    private float f5201b = 1.0f;

    /* JADX INFO: renamed from: j */
    protected FloatBuffer f5208j = null;

    /* JADX INFO: renamed from: k */
    protected Bitmap f5209k = null;

    /* JADX INFO: renamed from: l */
    protected boolean f5210l = false;

    /* JADX INFO: renamed from: Q1 */
    private void m5970Q1() {
        Bitmap bitmap = this.f5209k;
        if (bitmap != null) {
            this.f5203d = bitmap.getHeight();
            this.f5202c = this.f5209k.getWidth();
        }
        float width = (this.f5202c * 1.0f) / getWidth();
        float height = (this.f5203d * 1.0f) / getHeight();
        if (height > width && this.f5203d / this.f5202c < 1.7777778f) {
            width = height;
        }
        this.f5204e = getWidth() * width;
        this.f5205f = getHeight() * width;
    }

    /* JADX INFO: renamed from: R1 */
    public synchronized void mo5971R1(Bitmap bitmap) {
        this.f5209k = bitmap;
        this.f5210l = true;
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

    @Override // p003l.mcj, p003l.ccj
    public void destroy() {
        super.destroy();
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvoid main(){\n    vec2 uv = textureCoordinate;\n    uv.y = 1.0 -uv.y;\n    if (uv.x > 0.0 && uv.x < 1.0        && uv.y > 0.0 && uv.y < 1.0) {    gl_FragColor = texture2D(inputImageTexture0, uv);\n    }}\n";
    }

    @Override // p003l.mcj, p003l.ccj
    public void handleSizeChange() {
        float[] fArr = new float[8];
        this.textureVertices[this.curRotation].position(0);
        this.textureVertices[this.curRotation].get(fArr);
        m5970Q1();
        float f = this.f5204e / this.f5202c;
        this.f5201b = f;
        float f2 = this.f5205f / this.f5203d;
        this.f5200a = f2;
        this.f5206g = (1.0f - f2) / 2.0f;
        this.f5207i = (1.0f - f) / 2.0f;
        this.f5208j = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        for (int i = 0; i < 4; i++) {
            int i2 = i * 2;
            float f3 = fArr[i2];
            double d = f3;
            float f4 = this.f5207i;
            fArr[i2] = d <= 0.5d ? f3 + f4 : f3 - f4;
            int i3 = i2 + 1;
            float f5 = fArr[i3];
            double d2 = f5;
            float f6 = this.f5206g;
            fArr[i3] = d2 <= 0.5d ? f5 + f6 : f5 - f6;
        }
        this.f5208j.position(0);
        this.f5208j.put(fArr);
        this.f5208j.position(0);
        super.handleSizeChange();
    }

    @Override // p003l.ts2, p003l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (z) {
            markAsDirty();
        }
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        onDrawFrame();
        mcjVar.unlockRenderBuffer();
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        if (this.f5210l && this.f5209k != null) {
            GLES20.glFinish();
            GLES20.glFinish();
            int i = this.texture_in;
            if (i != 0) {
                GLES20.glDeleteTextures(1, new int[]{i}, 0);
            }
            this.texture_in = bitmapToTexture(this.f5209k);
            this.f5210l = false;
            handleSizeChange();
        }
        if (this.f5209k == null) {
            GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
            GLES20.glClear(16640);
        }
        if (this.f5208j == null) {
            super.passShaderValues();
            return;
        }
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.f5208j.position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.f5208j);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    @Override // p003l.mcj, p003l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
    }
}
