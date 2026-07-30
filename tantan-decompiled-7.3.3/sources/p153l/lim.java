package p153l;

import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class lim {
    protected FloatBuffer renderVertices;
    public FloatBuffer[] textureVertices;
    protected int baseRenderWidth = 0;
    protected int baseRenderHeight = 0;
    protected int bitmapWidth = 0;
    protected int bitmapHeight = 0;
    private float aspectRatio = 0.0f;
    private float[] projectionMatrix = new float[16];
    private float[] viewMatrix = new float[16];
    float[] mvpMatrix = new float[16];
    private float centerX = 0.0f;
    private float centerY = 0.0f;
    private float xRotate = 0.0f;
    private float yRotate = 0.0f;
    private float zRotate = 0.0f;
    private float xScale = 1.0f;
    private float yScale = 1.0f;
    protected float alphaValue = 1.0f;

    public lim() {
        setRenderVertices(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.textureVertices = floatBufferArr;
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[0].put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
        this.textureVertices[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[1].put(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f}).position(0);
        this.textureVertices[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[2].put(new float[]{1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f}).position(0);
        this.textureVertices[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[3].put(new float[]{1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}).position(0);
    }

    private float[] updateGeometryMatrix() {
        float f = (this.baseRenderHeight * 1.0f) / this.baseRenderWidth;
        Arrays.fill(this.mvpMatrix, 0.0f);
        Matrix.orthoM(this.projectionMatrix, 0, -1.0f, 1.0f, -f, f, 3.0f, 7.0f);
        Matrix.setLookAtM(this.viewMatrix, 0, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        Matrix.multiplyMM(this.mvpMatrix, 0, this.projectionMatrix, 0, this.viewMatrix, 0);
        float f2 = this.zRotate;
        if (f2 > 0.0f) {
            Matrix.rotateM(this.mvpMatrix, 0, f2, 0.0f, 0.0f, 1.0f);
        }
        float f3 = this.xRotate;
        if (f3 > 0.0f) {
            Matrix.rotateM(this.mvpMatrix, 0, f3, 1.0f, 0.0f, 0.0f);
        }
        float f4 = this.yRotate;
        if (f4 > 0.0f) {
            Matrix.rotateM(this.mvpMatrix, 0, f4, 0.0f, 1.0f, 0.0f);
        }
        Matrix.scaleM(this.mvpMatrix, 0, this.xScale * 1.0f, this.yScale * 1.0f, 1.0f);
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, this.centerX, this.centerY, 0.0f);
        float[] fArr2 = this.mvpMatrix;
        Matrix.multiplyMM(fArr2, 0, fArr, 0, fArr2, 0);
        return this.mvpMatrix;
    }

    private void updateVertexInfo() {
        int i;
        int i2;
        int i3 = this.bitmapWidth;
        if (i3 <= 0 || (i = this.bitmapHeight) <= 0 || (i2 = this.baseRenderWidth) <= 0 || this.baseRenderHeight <= 0) {
            return;
        }
        float f = (i3 * 1.0f) / i2;
        float f2 = ((i * 1.0f) / i3) * f;
        float f3 = (-1.0f) * f;
        float f4 = -f2;
        float f5 = f * 1.0f;
        setRenderVertices(new float[]{f3, f4, f5, f4, f3, f2, f5, f2});
    }

    public void cropWidthAndHeightInNormalTextureCoord(float f, float f2) {
        float f3 = 1.0f - f;
        float f4 = 1.0f - f2;
        this.textureVertices[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[0].put(new float[]{f, f2, f3, f2, f, f4, f3, f4}).position(0);
    }

    public float getAlphaValue() {
        return this.alphaValue;
    }

    public float[] getMvpMatrix() {
        updateGeometryMatrix();
        return this.mvpMatrix;
    }

    public FloatBuffer getRenderVertices() {
        return this.renderVertices;
    }

    public FloatBuffer getTextureVertices(int i) {
        if (i >= 0) {
            FloatBuffer[] floatBufferArr = this.textureVertices;
            if (i < floatBufferArr.length) {
                return floatBufferArr[i];
            }
        }
        return this.textureVertices[0];
    }

    public void resetMatrix() {
        this.centerX = 0.0f;
        this.centerY = 0.0f;
        this.xRotate = 0.0f;
        this.yRotate = 0.0f;
        this.zRotate = 0.0f;
        this.xScale = 1.0f;
        this.yScale = 1.0f;
        updateGeometryMatrix();
    }

    public void setAlphaValue(float f) {
        this.alphaValue = f;
    }

    public void setBaseRenderSize(int i, int i2) {
        this.baseRenderWidth = i;
        this.baseRenderHeight = i2;
        updateVertexInfo();
    }

    public void setRenderVertices(float[] fArr) {
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.renderVertices = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
    }

    public synchronized void setRotate(float f, float f2, float f3) {
        this.xRotate = f;
        this.yRotate = f2;
        this.zRotate = f3;
        updateGeometryMatrix();
    }

    public synchronized void setScale(float f, float f2) {
        this.xScale = f;
        this.yScale = f2;
        updateGeometryMatrix();
    }

    public synchronized void setTraslate(float f, float f2) {
        this.centerX = f;
        this.centerY = f2;
        updateGeometryMatrix();
    }

    public void updateBitmapAspectRatio(float f) {
        this.aspectRatio = f;
        updateVertexInfo();
    }

    public void updateBitmapInfo(int i, int i2) {
        this.bitmapWidth = i;
        this.bitmapHeight = i2;
        updateVertexInfo();
    }

    public void recycleResourceInGlThread() {
    }
}
