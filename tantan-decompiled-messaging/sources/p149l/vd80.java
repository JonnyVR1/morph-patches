package p149l;

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
public class vd80 extends ts2 {

    /* JADX INFO: renamed from: a */
    protected final short[] f181041a;

    /* JADX INFO: renamed from: c */
    protected int f181043c;

    /* JADX INFO: renamed from: d */
    protected int f181044d;

    /* JADX INFO: renamed from: e */
    protected int f181045e;

    /* JADX INFO: renamed from: f */
    public ShortBuffer f181046f;

    /* JADX INFO: renamed from: i */
    protected FloatBuffer f181048i;

    /* JADX INFO: renamed from: j */
    protected float[] f181049j;

    /* JADX INFO: renamed from: k */
    private Bitmap f181050k;

    /* JADX INFO: renamed from: l */
    public FloatBuffer f181051l;

    /* JADX INFO: renamed from: m */
    public FloatBuffer f181052m;

    /* JADX INFO: renamed from: n */
    public float[] f181053n;

    /* JADX INFO: renamed from: p */
    public float f181055p;

    /* JADX INFO: renamed from: b */
    protected final int f181042b = 8;

    /* JADX INFO: renamed from: g */
    protected final float[] f181047g = new float[16];

    /* JADX INFO: renamed from: o */
    public final float[] f181054o = new float[16];

    /* JADX INFO: renamed from: q */
    public List<float[]> f181056q = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: r */
    public Object f181057r = new Object();

    /* JADX INFO: renamed from: s */
    public int f181058s = -1;

    /* JADX INFO: renamed from: t */
    private boolean f181059t = false;

    /* JADX INFO: renamed from: u */
    private float f181060u = 640.0f;

    /* JADX INFO: renamed from: v */
    private float f181061v = 0.5f;

    /* JADX INFO: renamed from: x */
    private float f181062x = 0.5f;

    /* JADX INFO: renamed from: y */
    private float f181063y = 1.0f;

    /* JADX INFO: renamed from: z */
    private float f181064z = 0.04f;

    /* JADX INFO: renamed from: A */
    private float f181030A = 0.0f;

    /* JADX INFO: renamed from: B */
    private float f181031B = 0.0f;

    /* JADX INFO: renamed from: C */
    private float f181032C = 0.0f;

    /* JADX INFO: renamed from: D */
    private float f181033D = 0.0f;

    /* JADX INFO: renamed from: E */
    private float f181034E = 0.0f;

    /* JADX INFO: renamed from: F */
    private float f181035F = 0.0f;

    /* JADX INFO: renamed from: G */
    private float f181036G = 0.5f;

    /* JADX INFO: renamed from: H */
    private float f181037H = 0.5f;

    /* JADX INFO: renamed from: I */
    private float f181038I = 0.0f;

    /* JADX INFO: renamed from: J */
    private final String f181039J = "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; varying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;  vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";

    /* JADX INFO: renamed from: K */
    private final String f181040K = "precision mediump float;uniform sampler2D inputImageTexture0;varying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform float alpha;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture0,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb,color1.a * alpha);\n}";

    public vd80() {
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.f181041a = sArr;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        this.f181046f = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(sArr);
        this.f181046f.position(0);
        setBackgroundColour(1.0f, 1.0f, 1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: S1 */
    private void m197975S1() {
        float width = (this.f181050k.getWidth() * ((getHeight() * 1.0f) / this.f181060u)) / (getWidth() / 2.0f);
        if (this.f181030A > this.f181035F) {
            float f = this.f181036G;
            float f2 = this.f181033D;
            float f3 = f + f2;
            this.f181036G = f3;
            float f4 = this.f181061v;
            if (f2 >= 0.0f) {
                if (f3 > f4) {
                    this.f181036G = f4;
                }
            } else if (f3 < f4) {
                this.f181036G = f4;
            }
            float f5 = this.f181037H;
            float f6 = this.f181034E;
            float f7 = f5 + f6;
            this.f181037H = f7;
            float f8 = this.f181062x;
            if (f6 >= 0.0f) {
                if (f7 > f8) {
                    this.f181037H = f8;
                }
            } else if (f7 < f8) {
                this.f181037H = f8;
            }
        }
        float width2 = this.f181036G;
        if (width2 > 0.5f) {
            width2 -= this.f181050k.getWidth() / getWidth();
        }
        float f9 = this.f181036G;
        if (f9 < 0.5f) {
            width2 = (this.f181050k.getWidth() / getWidth()) + f9;
        }
        float f10 = width * 0.8f;
        setParamForMatrix(f10, f10, new PointF(width2, this.f181037H), 0.0f);
    }

    /* JADX INFO: renamed from: Q1 */
    public float m197976Q1() {
        Bitmap bitmap = this.f181050k;
        if (bitmap != null) {
            return (bitmap.getHeight() * 1.0f) / this.f181050k.getWidth();
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: R1 */
    public void m197977R1(float[] fArr) {
        if (this.f181030A >= this.f181031B) {
            float f = this.f181063y + this.f181032C;
            this.f181063y = f;
            if (f >= 1.0f) {
                this.f181063y = 1.0f;
            }
        }
        if (this.f181052m == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            this.f181052m = byteBufferAllocateDirect.asFloatBuffer();
        }
        this.f181052m.position(0);
        this.f181052m.put(fArr);
        this.f181052m.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.f181052m);
        GLES20.glVertexAttribPointer(this.f181044d, 2, 5126, false, 8, (Buffer) this.f181051l);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glEnableVertexAttribArray(this.f181044d);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f181058s);
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glUniform1f(this.f181045e, this.f181063y);
    }

    /* JADX INFO: renamed from: T1 */
    public void m197978T1() {
        this.f181059t = false;
        this.f181060u = 640.0f;
        this.f181061v = 0.5f;
        this.f181062x = 0.5f;
        this.f181063y = 1.0f;
        this.f181064z = 0.04f;
        this.f181030A = 0.0f;
        this.f181031B = 0.0f;
        this.f181032C = 0.0f;
        this.f181033D = 0.0f;
        this.f181034E = 0.0f;
        this.f181035F = 0.0f;
        this.f181038I = 0.0f;
    }

    /* JADX INFO: renamed from: U1 */
    public void m197979U1(float f) {
        this.f181032C = f;
    }

    /* JADX INFO: renamed from: V1 */
    public void m197980V1(float f, float f2) {
        this.f181061v = f;
        this.f181062x = f2;
    }

    /* JADX INFO: renamed from: W1 */
    public void m197981W1(float f) {
        this.f181033D = f;
    }

    /* JADX INFO: renamed from: X1 */
    public void m197982X1(float f, float f2) {
        this.f181036G = f;
        this.f181037H = f2;
    }

    /* JADX INFO: renamed from: Y1 */
    public void m197983Y1(Bitmap bitmap) {
        this.f181050k = bitmap;
        this.f181059t = true;
        initCoordinate();
    }

    /* JADX INFO: renamed from: Z1 */
    public void m197984Z1(float f) {
        this.f181038I = f;
    }

    @Override // p149l.ccj
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
        synchronized (this.f181057r) {
            try {
                List<float[]> list = this.f181056q;
                if (list != null) {
                    list.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        int i = this.f181058s;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f181058s = 0;
        }
        if (this.f181050k != null) {
            this.f181050k = null;
        }
    }

    public void drawBackgroundImage() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glUniform2f(this.f181043c, 1.0f, 1.0f);
        if (this.f181049j == null) {
            this.f181049j = new float[8];
        }
        this.textureVertices[this.curRotation].position(0);
        this.textureVertices[this.curRotation].get(this.f181049j);
        if (this.f181048i == null) {
            this.f181048i = ByteBuffer.allocateDirect(this.f181049j.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        for (int i = 0; i < 8; i++) {
            float[] fArr = this.f181049j;
            fArr[i] = (fArr[i] * (-1.0f)) + 0.5f;
        }
        this.f181048i.position(0);
        this.f181048i.put(this.f181049j);
        this.f181048i.position(0);
        GLES20.glVertexAttribPointer(this.f181044d, 2, 5126, false, 8, (Buffer) this.f181048i);
        GLES20.glEnableVertexAttribArray(this.f181044d);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glUniform1f(this.f181045e, 1.0f);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public void drawStick(float f) {
        GLES20.glUniform2f(this.f181043c, 1.0f, f);
        GLES20.glDrawElements(4, this.f181041a.length, 5123, this.f181046f);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
    }

    @Override // p149l.mcj
    public void drawSub() {
        this.f181030A += this.f181064z;
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        GLES20.glClear(16640);
        drawBackgroundImage();
        if (this.f181030A <= this.f181038I || this.f181050k == null) {
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        m197975S1();
        if (this.f181058s == -1 || this.f181059t) {
            this.f181058s = bitmapToTexture(this.f181050k);
            this.f181059t = false;
        }
        Iterator<float[]> it = this.f181056q.iterator();
        while (it.hasNext()) {
            m197977R1(it.next());
            drawStick(m197976Q1());
        }
        clearPoints();
        GLES20.glDisable(3042);
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;uniform sampler2D inputImageTexture0;varying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform float alpha;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture0,textureCoordinate);\n   gl_FragColor = vec4(color1.rgb,color1.a * alpha);\n}";
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; varying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;  vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    }

    @Override // p149l.mcj, p149l.ccj
    public void handleSizeChange() {
        super.handleSizeChange();
        if (getHeight() <= 0 || getWidth() <= 0) {
            return;
        }
        float width = getWidth() / getHeight();
        Matrix.orthoM(this.f181047g, 0, -1.0f, 1.0f, (-1.0f) / width, 1.0f / width, 3.0f, 7.0f);
    }

    public void initCoordinate() {
        Bitmap bitmap = this.f181050k;
        if (bitmap == null) {
            return;
        }
        float height = bitmap.getHeight() / this.f181050k.getWidth();
        this.f181055p = height;
        float[] fArr = {-0.5f, height * 0.5f, -0.5f, (-0.5f) * height, 0.5f, (-0.5f) * height, 0.5f, height * 0.5f};
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f181051l = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.f181051l.position(0);
        float f = this.f181055p;
        this.f181053n = new float[]{-0.5f, f * 0.5f, 0.0f, 1.0f, -0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, f * 0.5f, 0.0f, 1.0f};
        Matrix.setIdentityM(this.f181054o, 0);
        this.f181054o[0] = -1.0f;
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f181044d = GLES20.glGetAttribLocation(this.programHandle, "position2");
        this.f181043c = GLES20.glGetUniformLocation(this.programHandle, "decorationSize");
        this.f181045e = GLES20.glGetUniformLocation(this.programHandle, "alpha");
    }

    @Override // p149l.ts2, p149l.jcj
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

    @Override // p149l.mcj, p149l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        int i = this.f181058s;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f181058s = 0;
        }
        if (this.f181050k != null) {
            this.f181050k = null;
        }
    }

    public void setAlpha(float f) {
        this.f181063y = f;
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
        Matrix.multiplyMM(fArr, 0, this.f181054o, 0, this.f181047g, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        Matrix.rotateM(fArr, 0, f3, 0.0f, 0.0f, 1.0f);
        Matrix.scaleM(fArr, 0, f * 1.0f, f2 * 1.0f, 1.0f);
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.f181053n, 0);
        this.f181056q.add(new float[]{fArr2[0], fArr2[1], fArr2[4], fArr2[5], fArr2[8], fArr2[9], fArr2[12], fArr2[13]});
    }
}
