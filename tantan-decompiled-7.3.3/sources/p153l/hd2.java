package p153l;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.core.glcore.util.TextureHelper;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class hd2 extends jt2 {

    /* JADX INFO: renamed from: d */
    private FloatBuffer f108776d;

    /* JADX INFO: renamed from: a */
    private int f108773a = 0;

    /* JADX INFO: renamed from: b */
    private Bitmap f108774b = null;

    /* JADX INFO: renamed from: c */
    private Bitmap f108775c = null;

    /* JADX INFO: renamed from: e */
    private float[] f108777e = new float[8];

    /* JADX INFO: renamed from: f */
    private int f108778f = 0;

    /* JADX INFO: renamed from: g */
    private int f108779g = 0;

    /* JADX INFO: renamed from: Q1 */
    private void m134567Q1() {
        float f;
        float f2;
        int width = this.f108774b.getWidth();
        float f3 = width;
        float f4 = 1.0f;
        float f5 = f3 * 1.0f;
        float height = this.f108774b.getHeight();
        float f6 = f5 / height;
        float width2 = getWidth();
        float height2 = getHeight();
        float f7 = 0.0f;
        if (f6 > (width2 * 1.0f) / height2) {
            float f8 = ((f3 - (((height * 1.0f) / height2) * width2)) * 0.5f) / f3;
            f2 = 1.0f - f8;
            f7 = f8;
            f = 0.0f;
        } else {
            float f9 = ((height - ((f5 / width2) * height2)) * 0.5f) / height;
            float f10 = 1.0f - f9;
            f = f9;
            f2 = 1.0f;
            f4 = f10;
        }
        float[] fArr = this.f108777e;
        fArr[0] = f7;
        fArr[1] = f4;
        fArr[2] = f2;
        fArr[3] = f4;
        fArr[4] = f7;
        fArr[5] = f;
        fArr[6] = f2;
        fArr[7] = f;
    }

    /* JADX INFO: renamed from: R1 */
    private void m134568R1() {
        int width = this.f108778f;
        int height = this.f108779g;
        if (width == 0) {
            width = getWidth();
        }
        if (height == 0) {
            height = getHeight();
        }
        if (width >= this.f108775c.getWidth() || height >= this.f108775c.getHeight()) {
            this.f108774b = Bitmap.createBitmap(this.f108775c);
            return;
        }
        int width2 = this.f108775c.getWidth();
        double d = width2;
        double d2 = d * 0.4d;
        double d3 = width * 1.0f;
        double height2 = this.f108775c.getHeight();
        double d4 = 0.4d * height2;
        double d5 = height * 1.0f;
        this.f108774b = Bitmap.createBitmap(this.f108775c, (int) ((d - Math.max(d2, d3)) * 0.5d), (int) ((height2 - Math.max(d4, d5)) * 0.5d), (int) Math.max(d2, d3), (int) Math.max(d4, d5));
    }

    /* JADX INFO: renamed from: S1 */
    public void m134569S1(int i, int i2) {
        if (this.f108778f == i && this.f108779g == i2) {
            return;
        }
        this.f108778f = i;
        this.f108779g = i2;
        reInitialize();
    }

    @Override // p153l.gfj, p153l.wej
    public void handleSizeChange() {
        super.handleSizeChange();
        if (this.f108773a != 0) {
            reInitialize();
        }
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        Bitmap bitmap = this.f108775c;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        m134568R1();
        m134567Q1();
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(this.f108777e.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f108776d = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.position(0);
        this.f108776d.put(this.f108777e);
        this.f108773a = TextureHelper.bitmapToTexture(this.f108774b);
    }

    @Override // p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        if (this.f108775c != null) {
            super.newTextureReady(i, gfjVar, z);
            return;
        }
        setWidth(gfjVar.getWidth());
        setHeight(gfjVar.getHeight());
        synchronized (getLockObject()) {
            try {
                for (dfj dfjVar : getRenderTargets()) {
                    this.glFrameBuffer = gfjVar.glFrameBuffer;
                    dfjVar.newTextureReady(i, this, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.wej
    public void passShaderValues() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        if (this.f108773a == 0) {
            this.textureVertices[this.curRotation].position(0);
            GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
            GLES20.glEnableVertexAttribArray(this.texCoordHandle);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.texture_in);
            GLES20.glUniform1i(this.textureHandle, 0);
            return;
        }
        this.f108776d.position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.f108776d);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f108773a);
        GLES20.glUniform1i(this.textureHandle, 0);
    }
}
