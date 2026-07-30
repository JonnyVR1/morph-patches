package p153l;

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

/* JADX INFO: loaded from: classes3.dex */
public class cm80 extends jt2 {

    /* JADX INFO: renamed from: a */
    protected final short[] f82539a;

    /* JADX INFO: renamed from: c */
    protected int f82541c;

    /* JADX INFO: renamed from: d */
    protected int f82542d;

    /* JADX INFO: renamed from: e */
    protected int f82543e;

    /* JADX INFO: renamed from: f */
    public ShortBuffer f82544f;

    /* JADX INFO: renamed from: i */
    protected FloatBuffer f82546i;

    /* JADX INFO: renamed from: j */
    protected float[] f82547j;

    /* JADX INFO: renamed from: k */
    private Bitmap f82548k;

    /* JADX INFO: renamed from: l */
    public FloatBuffer f82549l;

    /* JADX INFO: renamed from: m */
    public FloatBuffer f82550m;

    /* JADX INFO: renamed from: n */
    public float[] f82551n;

    /* JADX INFO: renamed from: p */
    public float f82553p;

    /* JADX INFO: renamed from: b */
    protected final int f82540b = 8;

    /* JADX INFO: renamed from: g */
    protected final float[] f82545g = new float[16];

    /* JADX INFO: renamed from: o */
    public final float[] f82552o = new float[16];

    /* JADX INFO: renamed from: q */
    public List<float[]> f82554q = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: r */
    public Object f82555r = new Object();

    /* JADX INFO: renamed from: s */
    public int f82556s = -1;

    /* JADX INFO: renamed from: t */
    private boolean f82557t = false;

    /* JADX INFO: renamed from: u */
    private float f82558u = 640.0f;

    /* JADX INFO: renamed from: v */
    private float f82559v = 0.5f;

    /* JADX INFO: renamed from: x */
    private float f82560x = 0.5f;

    /* JADX INFO: renamed from: y */
    private float f82561y = 1.0f;

    /* JADX INFO: renamed from: z */
    private float f82562z = 0.04f;

    /* JADX INFO: renamed from: A */
    private float f82528A = 0.0f;

    /* JADX INFO: renamed from: B */
    private float f82529B = 0.0f;

    /* JADX INFO: renamed from: C */
    private float f82530C = 0.0f;

    /* JADX INFO: renamed from: D */
    private float f82531D = 0.0f;

    /* JADX INFO: renamed from: E */
    private float f82532E = 0.0f;

    /* JADX INFO: renamed from: F */
    private float f82533F = 0.0f;

    /* JADX INFO: renamed from: G */
    private float f82534G = 0.5f;

    /* JADX INFO: renamed from: H */
    private float f82535H = 0.5f;

    /* JADX INFO: renamed from: I */
    private float f82536I = 0.0f;

    /* JADX INFO: renamed from: J */
    private final String f82537J = "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; varying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;  vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";

    /* JADX INFO: renamed from: K */
    private final String f82538K = "precision mediump float;uniform sampler2D inputImageTexture0;varying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform float alpha;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture0,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb,color1.a * alpha);\n}";

    public cm80() {
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.f82539a = sArr;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        this.f82544f = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(sArr);
        this.f82544f.position(0);
        setBackgroundColour(1.0f, 1.0f, 1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: S1 */
    private void m111084S1() {
        float width = (this.f82548k.getWidth() * ((getHeight() * 1.0f) / this.f82558u)) / (getWidth() / 2.0f);
        if (this.f82528A > this.f82533F) {
            float f = this.f82534G;
            float f2 = this.f82531D;
            float f3 = f + f2;
            this.f82534G = f3;
            float f4 = this.f82559v;
            if (f2 >= 0.0f) {
                if (f3 > f4) {
                    this.f82534G = f4;
                }
            } else if (f3 < f4) {
                this.f82534G = f4;
            }
            float f5 = this.f82535H;
            float f6 = this.f82532E;
            float f7 = f5 + f6;
            this.f82535H = f7;
            float f8 = this.f82560x;
            if (f6 >= 0.0f) {
                if (f7 > f8) {
                    this.f82535H = f8;
                }
            } else if (f7 < f8) {
                this.f82535H = f8;
            }
        }
        float width2 = this.f82534G;
        if (width2 > 0.5f) {
            width2 -= this.f82548k.getWidth() / getWidth();
        }
        float f9 = this.f82534G;
        if (f9 < 0.5f) {
            width2 = (this.f82548k.getWidth() / getWidth()) + f9;
        }
        float f10 = width * 0.8f;
        setParamForMatrix(f10, f10, new PointF(width2, this.f82535H), 0.0f);
    }

    /* JADX INFO: renamed from: Q1 */
    public float m111085Q1() {
        Bitmap bitmap = this.f82548k;
        if (bitmap != null) {
            return (bitmap.getHeight() * 1.0f) / this.f82548k.getWidth();
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m111086R1(float[] fArr) {
        if (this.f82528A >= this.f82529B) {
            float f = this.f82561y + this.f82530C;
            this.f82561y = f;
            if (f >= 1.0f) {
                this.f82561y = 1.0f;
            }
        }
        if (this.f82550m == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            this.f82550m = byteBufferAllocateDirect.asFloatBuffer();
        }
        this.f82550m.position(0);
        this.f82550m.put(fArr);
        this.f82550m.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.f82550m);
        GLES20.glVertexAttribPointer(this.f82542d, 2, 5126, false, 8, (Buffer) this.f82549l);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glEnableVertexAttribArray(this.f82542d);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f82556s);
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glUniform1f(this.f82543e, this.f82561y);
    }

    /* JADX INFO: renamed from: T1 */
    public void m111087T1() {
        this.f82557t = false;
        this.f82558u = 640.0f;
        this.f82559v = 0.5f;
        this.f82560x = 0.5f;
        this.f82561y = 1.0f;
        this.f82562z = 0.04f;
        this.f82528A = 0.0f;
        this.f82529B = 0.0f;
        this.f82530C = 0.0f;
        this.f82531D = 0.0f;
        this.f82532E = 0.0f;
        this.f82533F = 0.0f;
        this.f82536I = 0.0f;
    }

    /* JADX INFO: renamed from: U1 */
    public void m111088U1(float f) {
        this.f82530C = f;
    }

    /* JADX INFO: renamed from: V1 */
    public void m111089V1(float f, float f2) {
        this.f82559v = f;
        this.f82560x = f2;
    }

    /* JADX INFO: renamed from: W1 */
    public void m111090W1(float f) {
        this.f82531D = f;
    }

    /* JADX INFO: renamed from: X1 */
    public void m111091X1(float f, float f2) {
        this.f82534G = f;
        this.f82535H = f2;
    }

    /* JADX INFO: renamed from: Y1 */
    public void m111092Y1(Bitmap bitmap) {
        this.f82548k = bitmap;
        this.f82557t = true;
        initCoordinate();
    }

    /* JADX INFO: renamed from: Z1 */
    public void m111093Z1(float f) {
        this.f82536I = f;
    }

    @Override // p153l.wej
    public void bindShaderAttributes() {
        super.bindShaderAttributes();
        GLES20.glBindAttribLocation(this.programHandle, 2, "uMVPMatrix");
        GLES20.glBindAttribLocation(this.programHandle, 3, "decorationSize");
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
        synchronized (this.f82555r) {
            try {
                List<float[]> list = this.f82554q;
                if (list != null) {
                    list.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        int i = this.f82556s;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f82556s = 0;
        }
        if (this.f82548k != null) {
            this.f82548k = null;
        }
    }

    public void drawBackgroundImage() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glUniform2f(this.f82541c, 1.0f, 1.0f);
        if (this.f82547j == null) {
            this.f82547j = new float[8];
        }
        this.textureVertices[this.curRotation].position(0);
        this.textureVertices[this.curRotation].get(this.f82547j);
        if (this.f82546i == null) {
            this.f82546i = ByteBuffer.allocateDirect(this.f82547j.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        for (int i = 0; i < 8; i++) {
            float[] fArr = this.f82547j;
            fArr[i] = (fArr[i] * (-1.0f)) + 0.5f;
        }
        this.f82546i.position(0);
        this.f82546i.put(this.f82547j);
        this.f82546i.position(0);
        GLES20.glVertexAttribPointer(this.f82542d, 2, 5126, false, 8, (Buffer) this.f82546i);
        GLES20.glEnableVertexAttribArray(this.f82542d);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glUniform1f(this.f82543e, 1.0f);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public void drawStick(float f) {
        GLES20.glUniform2f(this.f82541c, 1.0f, f);
        GLES20.glDrawElements(4, this.f82539a.length, 5123, this.f82544f);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
    }

    @Override // p153l.gfj
    public void drawSub() {
        this.f82528A += this.f82562z;
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        GLES20.glClear(16640);
        drawBackgroundImage();
        if (this.f82528A <= this.f82536I || this.f82548k == null) {
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        m111084S1();
        if (this.f82556s == -1 || this.f82557t) {
            this.f82556s = bitmapToTexture(this.f82548k);
            this.f82557t = false;
        }
        Iterator<float[]> it = this.f82554q.iterator();
        while (it.hasNext()) {
            m111086R1(it.next());
            drawStick(m111085Q1());
        }
        clearPoints();
        GLES20.glDisable(3042);
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;uniform sampler2D inputImageTexture0;varying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform float alpha;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture0,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb,color1.a * alpha);\n}";
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; varying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;  vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    }

    @Override // p153l.gfj, p153l.wej
    public void handleSizeChange() {
        super.handleSizeChange();
        if (getHeight() <= 0 || getWidth() <= 0) {
            return;
        }
        float width = getWidth() / getHeight();
        Matrix.orthoM(this.f82545g, 0, -1.0f, 1.0f, (-1.0f) / width, 1.0f / width, 3.0f, 7.0f);
    }

    public void initCoordinate() {
        Bitmap bitmap = this.f82548k;
        if (bitmap == null) {
            return;
        }
        float height = bitmap.getHeight() / this.f82548k.getWidth();
        this.f82553p = height;
        float[] fArr = {-0.5f, height * 0.5f, -0.5f, (-0.5f) * height, 0.5f, (-0.5f) * height, 0.5f, height * 0.5f};
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f82549l = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.f82549l.position(0);
        float f = this.f82553p;
        this.f82551n = new float[]{-0.5f, f * 0.5f, 0.0f, 1.0f, -0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, f * 0.5f, 0.0f, 1.0f};
        Matrix.setIdentityM(this.f82552o, 0);
        this.f82552o[0] = -1.0f;
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f82542d = GLES20.glGetAttribLocation(this.programHandle, "position2");
        this.f82541c = GLES20.glGetUniformLocation(this.programHandle, "decorationSize");
        this.f82543e = GLES20.glGetUniformLocation(this.programHandle, "alpha");
    }

    @Override // p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        if (z) {
            markAsDirty();
        }
        this.texture_in = i;
        setWidth(gfjVar.getWidth());
        setHeight(gfjVar.getHeight());
        onDrawFrame();
        gfjVar.unlockRenderBuffer();
    }

    @Override // p153l.gfj, p153l.wej
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        int i = this.f82556s;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f82556s = 0;
        }
        if (this.f82548k != null) {
            this.f82548k = null;
        }
    }

    public void setAlpha(float f) {
        this.f82561y = f;
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
        Matrix.multiplyMM(fArr, 0, this.f82552o, 0, this.f82545g, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        Matrix.rotateM(fArr, 0, f3, 0.0f, 0.0f, 1.0f);
        Matrix.scaleM(fArr, 0, f * 1.0f, f2 * 1.0f, 1.0f);
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.f82551n, 0);
        this.f82554q.add(new float[]{fArr2[0], fArr2[1], fArr2[4], fArr2[5], fArr2[8], fArr2[9], fArr2[12], fArr2[13]});
    }
}
