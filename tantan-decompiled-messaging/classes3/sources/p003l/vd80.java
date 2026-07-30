package p003l;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class vd80 extends ts2 {

    /* JADX INFO: renamed from: a */
    protected final short[] f8293a;

    /* JADX INFO: renamed from: c */
    protected int f8295c;

    /* JADX INFO: renamed from: d */
    protected int f8296d;

    /* JADX INFO: renamed from: e */
    protected int f8297e;

    /* JADX INFO: renamed from: f */
    public ShortBuffer f8298f;

    /* JADX INFO: renamed from: i */
    protected FloatBuffer f8300i;

    /* JADX INFO: renamed from: j */
    protected float[] f8301j;

    /* JADX INFO: renamed from: k */
    private Bitmap f8302k;

    /* JADX INFO: renamed from: l */
    public FloatBuffer f8303l;

    /* JADX INFO: renamed from: m */
    public FloatBuffer f8304m;

    /* JADX INFO: renamed from: n */
    public float[] f8305n;

    /* JADX INFO: renamed from: p */
    public float f8307p;

    /* JADX INFO: renamed from: b */
    protected final int f8294b = 8;

    /* JADX INFO: renamed from: g */
    protected final float[] f8299g = new float[16];

    /* JADX INFO: renamed from: o */
    public final float[] f8306o = new float[16];

    /* JADX INFO: renamed from: q */
    public List<float[]> f8308q = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: r */
    public Object f8309r = new Object();

    /* JADX INFO: renamed from: s */
    public int f8310s = -1;

    /* JADX INFO: renamed from: t */
    private boolean f8311t = false;

    /* JADX INFO: renamed from: u */
    private float f8312u = 640.0f;

    /* JADX INFO: renamed from: v */
    private float f8313v = 0.5f;

    /* JADX INFO: renamed from: x */
    private float f8314x = 0.5f;

    /* JADX INFO: renamed from: y */
    private float f8315y = 1.0f;

    /* JADX INFO: renamed from: z */
    private float f8316z = 0.04f;

    /* JADX INFO: renamed from: A */
    private float f8282A = 0.0f;

    /* JADX INFO: renamed from: B */
    private float f8283B = 0.0f;

    /* JADX INFO: renamed from: C */
    private float f8284C = 0.0f;

    /* JADX INFO: renamed from: D */
    private float f8285D = 0.0f;

    /* JADX INFO: renamed from: E */
    private float f8286E = 0.0f;

    /* JADX INFO: renamed from: F */
    private float f8287F = 0.0f;

    /* JADX INFO: renamed from: G */
    private float f8288G = 0.5f;

    /* JADX INFO: renamed from: H */
    private float f8289H = 0.5f;

    /* JADX INFO: renamed from: I */
    private float f8290I = 0.0f;

    /* JADX INFO: renamed from: J */
    private final String f8291J = "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; varying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;  vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";

    /* JADX INFO: renamed from: K */
    private final String f8292K = "precision mediump float;uniform sampler2D inputImageTexture0;varying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform float alpha;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture0,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb,color1.a * alpha);\n}";

    public vd80() {
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.f8293a = sArr;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        this.f8298f = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(sArr);
        this.f8298f.position(0);
        setBackgroundColour(1.0f, 1.0f, 1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: S1 */
    private void m8361S1() {
        float width = (this.f8302k.getWidth() * ((getHeight() * 1.0f) / this.f8312u)) / (getWidth() / 2.0f);
        if (this.f8282A > this.f8287F) {
            float f = this.f8288G;
            float f2 = this.f8285D;
            float f3 = f + f2;
            this.f8288G = f3;
            float f4 = this.f8313v;
            if (f2 >= 0.0f) {
                if (f3 > f4) {
                    this.f8288G = f4;
                }
            } else if (f3 < f4) {
                this.f8288G = f4;
            }
            float f5 = this.f8289H;
            float f6 = this.f8286E;
            float f7 = f5 + f6;
            this.f8289H = f7;
            float f8 = this.f8314x;
            if (f6 >= 0.0f) {
                if (f7 > f8) {
                    this.f8289H = f8;
                }
            } else if (f7 < f8) {
                this.f8289H = f8;
            }
        }
        float width2 = this.f8288G;
        if (width2 > 0.5f) {
            width2 -= this.f8302k.getWidth() / getWidth();
        }
        float f9 = this.f8288G;
        if (f9 < 0.5f) {
            width2 = (this.f8302k.getWidth() / getWidth()) + f9;
        }
        float f10 = width * 0.8f;
        setParamForMatrix(f10, f10, new PointF(width2, this.f8289H), 0.0f);
    }

    /* JADX INFO: renamed from: Q1 */
    public float m8362Q1() {
        Bitmap bitmap = this.f8302k;
        if (bitmap != null) {
            return (bitmap.getHeight() * 1.0f) / this.f8302k.getWidth();
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m8363R1(float[] fArr) {
        if (this.f8282A >= this.f8283B) {
            float f = this.f8315y + this.f8284C;
            this.f8315y = f;
            if (f >= 1.0f) {
                this.f8315y = 1.0f;
            }
        }
        if (this.f8304m == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            this.f8304m = byteBufferAllocateDirect.asFloatBuffer();
        }
        this.f8304m.position(0);
        this.f8304m.put(fArr);
        this.f8304m.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.f8304m);
        GLES20.glVertexAttribPointer(this.f8296d, 2, 5126, false, 8, (Buffer) this.f8303l);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glEnableVertexAttribArray(this.f8296d);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f8310s);
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glUniform1f(this.f8297e, this.f8315y);
    }

    /* JADX INFO: renamed from: T1 */
    public void m8364T1() {
        this.f8311t = false;
        this.f8312u = 640.0f;
        this.f8313v = 0.5f;
        this.f8314x = 0.5f;
        this.f8315y = 1.0f;
        this.f8316z = 0.04f;
        this.f8282A = 0.0f;
        this.f8283B = 0.0f;
        this.f8284C = 0.0f;
        this.f8285D = 0.0f;
        this.f8286E = 0.0f;
        this.f8287F = 0.0f;
        this.f8290I = 0.0f;
    }

    /* JADX INFO: renamed from: U1 */
    public void m8365U1(float f) {
        this.f8284C = f;
    }

    /* JADX INFO: renamed from: V1 */
    public void m8366V1(float f, float f2) {
        this.f8313v = f;
        this.f8314x = f2;
    }

    /* JADX INFO: renamed from: W1 */
    public void m8367W1(float f) {
        this.f8285D = f;
    }

    /* JADX INFO: renamed from: X1 */
    public void m8368X1(float f, float f2) {
        this.f8288G = f;
        this.f8289H = f2;
    }

    /* JADX INFO: renamed from: Y1 */
    public void m8369Y1(Bitmap bitmap) {
        this.f8302k = bitmap;
        this.f8311t = true;
        initCoordinate();
    }

    /* JADX INFO: renamed from: Z1 */
    public void m8370Z1(float f) {
        this.f8290I = f;
    }

    @Override // p003l.ccj
    public void bindShaderAttributes() {
        super.bindShaderAttributes();
        GLES20.glBindAttribLocation(this.programHandle, 2, p050.ATTRIBUTE_MVP_MATRIX);
        GLES20.glBindAttribLocation(this.programHandle, 3, p050.ATTRIBUTE_DECORATION_SIZE);
    }

    public int bitmapToTexture(Bitmap bitmap) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        if (bitmap != null) {
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
        return iArr[0];
    }

    public void clearPoints() {
        synchronized (this.f8309r) {
            try {
                List<float[]> list = this.f8308q;
                if (list != null) {
                    list.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p003l.mcj, p003l.ccj
    public void destroy() {
        super.destroy();
        int i = this.f8310s;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f8310s = 0;
        }
        if (this.f8302k != null) {
            this.f8302k = null;
        }
    }

    public void drawBackgroundImage() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glUniform2f(this.f8295c, 1.0f, 1.0f);
        if (this.f8301j == null) {
            this.f8301j = new float[8];
        }
        this.textureVertices[this.curRotation].position(0);
        this.textureVertices[this.curRotation].get(this.f8301j);
        if (this.f8300i == null) {
            this.f8300i = ByteBuffer.allocateDirect(this.f8301j.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        for (int i = 0; i < 8; i++) {
            float[] fArr = this.f8301j;
            fArr[i] = (fArr[i] * (-1.0f)) + 0.5f;
        }
        this.f8300i.position(0);
        this.f8300i.put(this.f8301j);
        this.f8300i.position(0);
        GLES20.glVertexAttribPointer(this.f8296d, 2, 5126, false, 8, (Buffer) this.f8300i);
        GLES20.glEnableVertexAttribArray(this.f8296d);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glUniform1f(this.f8297e, 1.0f);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public void drawStick(float f) {
        GLES20.glUniform2f(this.f8295c, 1.0f, f);
        GLES20.glDrawElements(4, this.f8293a.length, 5123, this.f8298f);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
    }

    @Override // p003l.mcj
    public void drawSub() {
        this.f8282A += this.f8316z;
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        GLES20.glClear(16640);
        drawBackgroundImage();
        if (this.f8282A <= this.f8290I || this.f8302k == null) {
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        m8361S1();
        if (this.f8310s == -1 || this.f8311t) {
            this.f8310s = bitmapToTexture(this.f8302k);
            this.f8311t = false;
        }
        Iterator<float[]> it = this.f8308q.iterator();
        while (it.hasNext()) {
            m8363R1(it.next());
            drawStick(m8362Q1());
        }
        clearPoints();
        GLES20.glDisable(3042);
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision mediump float;uniform sampler2D inputImageTexture0;varying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform float alpha;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture0,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb,color1.a * alpha);\n}";
    }

    @Override // p003l.ccj
    public String getVertexShader() {
        return "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; varying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;  vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    }

    @Override // p003l.mcj, p003l.ccj
    public void handleSizeChange() {
        super.handleSizeChange();
        if (getHeight() <= 0 || getWidth() <= 0) {
            return;
        }
        float width = getWidth() / getHeight();
        Matrix.orthoM(this.f8299g, 0, -1.0f, 1.0f, (-1.0f) / width, 1.0f / width, 3.0f, 7.0f);
    }

    public void initCoordinate() {
        Bitmap bitmap = this.f8302k;
        if (bitmap == null) {
            return;
        }
        float height = bitmap.getHeight() / this.f8302k.getWidth();
        this.f8307p = height;
        float[] fArr = {-0.5f, height * 0.5f, -0.5f, (-0.5f) * height, 0.5f, (-0.5f) * height, 0.5f, height * 0.5f};
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f8303l = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.f8303l.position(0);
        float f = this.f8307p;
        this.f8305n = new float[]{-0.5f, f * 0.5f, 0.0f, 1.0f, -0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, f * 0.5f, 0.0f, 1.0f};
        Matrix.setIdentityM(this.f8306o, 0);
        this.f8306o[0] = -1.0f;
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f8296d = GLES20.glGetAttribLocation(this.programHandle, p050.ATTRIBUTE_POSITION_2);
        this.f8295c = GLES20.glGetUniformLocation(this.programHandle, p050.ATTRIBUTE_DECORATION_SIZE);
        this.f8297e = GLES20.glGetUniformLocation(this.programHandle, "alpha");
    }

    @Override // p003l.ts2, p003l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (z) {
            markAsDirty();
        }
        this.texture_in = i;
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        onDrawFrame();
        mcjVar.unlockRenderBuffer();
    }

    @Override // p003l.mcj, p003l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        int i = this.f8310s;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f8310s = 0;
        }
        if (this.f8302k != null) {
            this.f8302k = null;
        }
    }

    public void setAlpha(float f) {
        this.f8315y = f;
    }

    public void setParamForMatrix(float f, float f2, PointF pointF, float f3) {
        if (pointF == null) {
            return;
        }
        float f4 = -((pointF.x * 2.0f) - 1.0f);
        float f5 = ((-pointF.y) * 2.0f) + 1.0f;
        float[] fArr = new float[16];
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, -f4, f5, 0.0f);
        Matrix.multiplyMM(fArr, 0, this.f8306o, 0, this.f8299g, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        Matrix.rotateM(fArr, 0, f3, 0.0f, 0.0f, 1.0f);
        Matrix.scaleM(fArr, 0, f * 1.0f, f2 * 1.0f, 1.0f);
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.f8305n, 0);
        this.f8308q.add(new float[]{fArr2[0], fArr2[1], fArr2[4], fArr2[5], fArr2[8], fArr2[9], fArr2[12], fArr2[13]});
    }
}
