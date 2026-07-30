package p003l;

import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class p050 extends ts2 {
    public static final String ATTRIBUTE_DECORATION_SIZE = "decorationSize";
    public static final String ATTRIBUTE_MVP_MATRIX = "uMVPMatrix";
    public static final String ATTRIBUTE_POSITION_2 = "position2";
    static final int COORDS_PER_VERTEX = 2;
    private PointF centerPoint;
    private int decorateHandler;
    protected ShortBuffer drawListBuffer;
    protected final short[] drawOrder;
    protected FloatBuffer fvertexBuffer;
    private float mAngle;

    /* JADX INFO: renamed from: mH */
    private float f6294mH;
    private int mVPMatrixHandler;
    protected final float[] mViewMatrix;

    /* JADX INFO: renamed from: mW */
    private float f6295mW;
    private boolean needUpdate;
    protected int positionHandle2;
    protected float stickerScale;
    protected float[] texData0;
    protected FloatBuffer vertexBuffer;
    protected final float[] mProjectionMatrix = new float[16];
    protected final int vertexStride = 8;
    protected Object maskListLock = new Object();
    protected List<float[]> mvpLists = Collections.synchronizedList(new ArrayList());
    private final String vertexShaderCode = "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; attribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;   vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),(coord.y + 0.5));\n}";
    private final String fragmentShaderCode = "precision mediump float;uniform sampler2D inputImageTexture;varying vec2 textureCoordinate;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture,textureCoordinate);\n   vec4 color2 = vec4(0.0);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = color1;\n}";

    public p050(float f) {
        float[] fArr = new float[16];
        this.mViewMatrix = fArr;
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.drawOrder = sArr;
        this.stickerScale = f;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.vertexBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(new float[]{-0.5f, f * 0.5f, -0.5f, (-0.5f) * f, 0.5f, (-0.5f) * f, 0.5f, f * 0.5f});
        this.vertexBuffer.position(0);
        float f2 = this.stickerScale;
        this.texData0 = new float[]{-0.5f, f2 * 0.5f, 0.0f, 1.0f, -0.5f, (-0.5f) * f2, 0.0f, 1.0f, 0.5f, (-0.5f) * f2, 0.0f, 1.0f, 0.5f, f2 * 0.5f, 0.0f, 1.0f};
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(sArr.length * 2);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect2.asShortBuffer();
        this.drawListBuffer = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(sArr);
        this.drawListBuffer.position(0);
        Matrix.setIdentityM(fArr, 0);
        fArr[0] = -1.0f;
    }

    private void caculateTransform() {
        if (this.needUpdate) {
            float f = this.f6295mW;
            float f2 = this.f6294mH;
            PointF pointF = this.centerPoint;
            float f3 = -((pointF.x * 2.0f) - 1.0f);
            float f4 = ((-pointF.y) * 2.0f) + 1.0f;
            float f5 = this.mAngle;
            pointF.x = f3;
            pointF.y = f4;
            float[] fArr = new float[16];
            float[] fArr2 = new float[16];
            Matrix.setIdentityM(fArr2, 0);
            Matrix.translateM(fArr2, 0, -f3, f4, 0.0f);
            Matrix.multiplyMM(fArr, 0, this.mViewMatrix, 0, this.mProjectionMatrix, 0);
            Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
            Matrix.rotateM(fArr, 0, f5, 0.0f, 0.0f, 1.0f);
            Matrix.scaleM(fArr, 0, f * 1.0f, f2 * 1.0f, 1.0f);
            Matrix.multiplyMM(fArr2, 0, fArr, 0, this.texData0, 0);
            float[] fArr3 = {fArr2[0], fArr2[1], fArr2[4], fArr2[5], fArr2[8], fArr2[9], fArr2[12], fArr2[13]};
            List<float[]> list = this.mvpLists;
            if (list != null) {
                list.clear();
            }
            Log.e("zk setOverlayPosition out", Arrays.toString(fArr3));
            this.mvpLists.add(fArr3);
            this.needUpdate = false;
        }
    }

    @Override // p003l.ccj
    public void bindShaderAttributes() {
        super.bindShaderAttributes();
        GLES20.glBindAttribLocation(this.programHandle, 2, ATTRIBUTE_MVP_MATRIX);
        GLES20.glBindAttribLocation(this.programHandle, 3, ATTRIBUTE_DECORATION_SIZE);
    }

    public void draw() {
        GLES20.glUniform2f(this.decorateHandler, 1.0f, this.stickerScale);
        GLES20.glDrawElements(4, this.drawOrder.length, 5123, this.drawListBuffer);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
    }

    @Override // p003l.mcj
    public void drawSub() {
        caculateTransform();
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClear(16640);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        synchronized (this.maskListLock) {
            try {
                Iterator<float[]> it = this.mvpLists.iterator();
                while (it.hasNext()) {
                    passShaderValues(it.next());
                    draw();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision mediump float;uniform sampler2D inputImageTexture;varying vec2 textureCoordinate;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture,textureCoordinate);\n   vec4 color2 = vec4(0.0);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = 1.0;\n   gl_FragColor = color1;\n}";
    }

    @Override // p003l.ccj
    public String getVertexShader() {
        return "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; attribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;   vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),(coord.y + 0.5));\n}";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.positionHandle2 = GLES20.glGetAttribLocation(this.programHandle, ATTRIBUTE_POSITION_2);
        this.mVPMatrixHandler = GLES20.glGetUniformLocation(this.programHandle, ATTRIBUTE_MVP_MATRIX);
        this.decorateHandler = GLES20.glGetUniformLocation(this.programHandle, ATTRIBUTE_DECORATION_SIZE);
    }

    public void passShaderValues(float[] fArr) {
        this.renderVertices.position(0);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.fvertexBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.fvertexBuffer.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.fvertexBuffer);
        GLES20.glVertexAttribPointer(this.positionHandle2, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glEnableVertexAttribArray(this.positionHandle2);
        this.textureVertices[this.curRotation].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    public void setOverlayPosition(float f, float f2, PointF pointF, float f3) {
        synchronized (this.maskListLock) {
            try {
                if (pointF == null) {
                    return;
                }
                this.f6295mW = f;
                this.f6294mH = f2;
                this.centerPoint = pointF;
                this.mAngle = f3;
                this.needUpdate = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
