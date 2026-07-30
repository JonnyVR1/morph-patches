package p153l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class gb20 extends gfj {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f103039a = null;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f103040b = null;

    /* JADX INFO: renamed from: c */
    protected Object f103041c = new Object();

    /* JADX INFO: renamed from: d */
    protected boolean f103042d = true;

    /* JADX INFO: renamed from: e */
    protected int[] f103043e;

    public gb20() {
        this.useNewViewPort = true;
    }

    /* JADX INFO: renamed from: Q1 */
    public int m129761Q1() {
        int height = getHeight();
        if (this.curRotation % 2 == 1) {
            height = getWidth();
        }
        return height / 2;
    }

    /* JADX INFO: renamed from: R1 */
    public int m129762R1() {
        int width = getWidth();
        if (this.curRotation % 2 == 1) {
            width = getHeight();
        }
        return width / 2;
    }

    /* JADX INFO: renamed from: S1 */
    public float[] m129763S1(int i) {
        float f;
        float f2;
        float f3 = 0.0f;
        float f4 = 1.0f;
        if (i == 0) {
            f = 0.0f;
            f2 = 1.0f;
            f4 = 0.0f;
            f3 = 1.0f;
        } else if (i == 1) {
            f2 = 0.0f;
            f = 1.0f;
        } else if (i != 2) {
            f = 0.0f;
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
            f = 1.0f;
            f4 = 0.0f;
            f3 = 1.0f;
        }
        return new float[]{f3, f4, f, f2};
    }

    /* JADX INFO: renamed from: T1 */
    public int m129764T1() {
        return this.curRotation % 2 == 1 ? getWidth() : getHeight();
    }

    /* JADX INFO: renamed from: U1 */
    public int m129765U1() {
        return this.curRotation % 2 == 1 ? getHeight() : getWidth();
    }

    public void changeCurRotation(int i) {
        this.curRotation = 0;
        rotateClockwise90Degrees(i / 90);
    }

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        try {
            int i = this.texture_in;
            if (i != 0) {
                GLES20.glDeleteTextures(1, new int[]{i}, 0);
                this.texture_in = 0;
            }
        } catch (Exception unused) {
        }
        try {
            GLES20.glDeleteTextures(1, this.f103043e, 0);
        } catch (Exception unused2) {
        }
    }

    public void flipPosition(int i) {
        if (i == 3) {
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
            return;
        }
        float[] fArrM129763S1 = m129763S1(i);
        float f = fArrM129763S1[0];
        float f2 = fArrM129763S1[1];
        float f3 = fArrM129763S1[2];
        float f4 = fArrM129763S1[3];
        this.textureVertices[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[0].put(new float[]{f, f3, f2, f3, f, f4, f2, f4}).position(0);
        this.textureVertices[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[1].put(new float[]{f3, f2, f3, f, f4, f2, f4, f}).position(0);
        this.textureVertices[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[2].put(new float[]{f2, f4, f, f4, f2, f3, f, f3}).position(0);
        this.textureVertices[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[3].put(new float[]{f4, f, f4, f2, f3, f, f3, f2}).position(0);
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;uniform sampler2D SamplerY;uniform sampler2D SamplerUV;varying mediump vec2 coordinate;void main(){   float r, g, b, y, u, v;\n   y = texture2D(SamplerY, coordinate).r;\n   u = texture2D(SamplerUV, coordinate).a - 0.5;\n   v = texture2D(SamplerUV, coordinate).r - 0.5;\n   r = y + 1.13983*v;\n   g = y - 0.39465*u - 0.58060*v;\n   b = y + 2.03211*u;\n   gl_FragColor = vec4(r, g, b, 1.0);\n}";
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return "attribute vec4 position;attribute mediump vec4 inputTextureCoordinate;varying mediump vec2 coordinate;void main(){    gl_Position = position;    coordinate = inputTextureCoordinate.xy;}";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        super.initWithGLContext();
        int[] iArr = new int[2];
        this.f103043e = iArr;
        GLES20.glGenTextures(2, iArr, 0);
        for (int i = 0; i < 2; i++) {
            int i2 = this.f103043e[i];
            GLES20.glActiveTexture(33984 + i);
            GLES20.glBindTexture(3553, i2);
            GLES20.glPixelStorei(3317, 1);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
        }
        GLES20.glUseProgram(this.programHandle);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.programHandle, "SamplerY"), 0);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.programHandle, "SamplerUV"), 1);
    }

    @Override // p153l.wej
    public void onDrawFrame() {
        markAsDirty();
        super.onDrawFrame();
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        this.renderVertices.position(0);
        GLES20.glUseProgram(this.programHandle);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.programHandle, "SamplerY"), 0);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.programHandle, "SamplerUV"), 1);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 0, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.textureVertices[this.curRotation].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 0, (Buffer) this.textureVertices[this.curRotation]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        synchronized (this.f103041c) {
            ByteBuffer byteBuffer = this.f103039a;
            if (byteBuffer != null && this.f103040b != null) {
                byteBuffer.position(0);
                this.f103040b.position(0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.f103043e[0]);
                GLES20.glTexImage2D(3553, 0, 6409, m129765U1(), m129764T1(), 0, 6409, 5121, this.f103039a);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, this.f103043e[1]);
                GLES20.glTexImage2D(3553, 0, 6410, m129762R1(), m129761Q1(), 0, 6410, 5121, this.f103040b);
                this.f103042d = true;
                GLES20.glClear(16384);
                return;
            }
            this.f103042d = true;
        }
    }

    public void updateYUVBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        synchronized (this.f103041c) {
            this.f103039a = byteBuffer;
            this.f103040b = byteBuffer2;
        }
    }
}
