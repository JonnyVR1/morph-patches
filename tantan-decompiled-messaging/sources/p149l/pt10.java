package p149l;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class pt10 extends ts2 {

    /* JADX INFO: renamed from: c */
    public m3x f151088c;

    /* JADX INFO: renamed from: d */
    private final short[] f151089d;

    /* JADX INFO: renamed from: f */
    private int f151091f;

    /* JADX INFO: renamed from: g */
    private int f151092g;

    /* JADX INFO: renamed from: i */
    protected int f151093i;

    /* JADX INFO: renamed from: j */
    protected int f151094j;

    /* JADX INFO: renamed from: k */
    public ShortBuffer f151095k;

    /* JADX INFO: renamed from: q */
    protected FloatBuffer f151101q;

    /* JADX INFO: renamed from: r */
    protected float[] f151102r;

    /* JADX INFO: renamed from: e */
    private final int f151090e = 8;

    /* JADX INFO: renamed from: l */
    private boolean f151096l = false;

    /* JADX INFO: renamed from: m */
    protected final float[] f151097m = new float[16];

    /* JADX INFO: renamed from: n */
    float f151098n = 1.0f;

    /* JADX INFO: renamed from: o */
    float f151099o = 1.0f;

    /* JADX INFO: renamed from: p */
    private boolean f151100p = false;

    /* JADX INFO: renamed from: s */
    private final String f151103s = "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; varying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nuniform float flip;\nvoid main() {  gl_Position = position;   vec2 coord = position2.xy;  coord = (coord) / decorationSize; if(flip > 1.0){  textureCoordinate = vec2(1.0 - (coord.x + 0.5),(coord.y + 0.5));\n } else{  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0 - (coord.y + 0.5));\n}\n}";

    /* JADX INFO: renamed from: t */
    private final String f151104t = "precision mediump float;uniform sampler2D inputImageTexture0;varying vec2 textureCoordinate;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture0,textureCoordinate);\n   gl_FragColor = color1; }";

    /* JADX INFO: renamed from: a */
    public List<m3x> f151086a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<m3x> f151087b = new ArrayList();

    public pt10() {
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.f151089d = sArr;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        this.f151095k = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(sArr);
        this.f151095k.position(0);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m171259Q1(m3x m3xVar) {
        for (m3x m3xVar2 : this.f151086a) {
            if (m3xVar2.f131201k == m3xVar.f131201k) {
                this.f151086a.remove(m3xVar2);
                break;
            }
        }
        if (m3xVar != null) {
            m3xVar.m152960f(this.f151097m);
            this.f151086a.add(m3xVar);
        }
    }

    /* JADX INFO: renamed from: R1 */
    public void m171260R1() {
        synchronized (getLockObject()) {
            try {
                Iterator<m3x> it = this.f151086a.iterator();
                while (it.hasNext()) {
                    this.f151087b.add(it.next());
                }
                this.f151086a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: S1 */
    public void m171261S1(float f, int i) {
        GLES20.glUniform2f(this.f151091f, 1.0f, f);
        GLES20.glUniform1f(this.f151094j, 2.0f);
        GLES20.glDrawElements(4, this.f151089d.length, 5123, this.f151095k);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
    }

    /* JADX INFO: renamed from: T1 */
    public m3x m171262T1() {
        return this.f151088c;
    }

    /* JADX INFO: renamed from: U1 */
    public void m171263U1(m3x m3xVar, float[] fArr, int i) {
        if (m3xVar.f131199i == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            m3xVar.f131199i = byteBufferAllocateDirect.asFloatBuffer();
        }
        m3xVar.f131199i.position(0);
        m3xVar.f131199i.put(fArr);
        m3xVar.f131199i.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) m3xVar.f131199i);
        GLES20.glVertexAttribPointer(this.f151093i, 2, 5126, false, 8, (Buffer) m3xVar.f131192b);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glEnableVertexAttribArray(this.f151093i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    /* JADX INFO: renamed from: V1 */
    public void m171264V1(m3x m3xVar) {
        this.f151087b.add(m3xVar);
    }

    /* JADX INFO: renamed from: W1 */
    public void m171265W1(int i) {
        this.curRotation = i;
    }

    /* JADX INFO: renamed from: X1 */
    public void m171266X1(m3x m3xVar) {
        this.f151088c = m3xVar;
    }

    @Override // p149l.ccj
    public void bindShaderAttributes() {
        super.bindShaderAttributes();
        GLES20.glBindAttribLocation(this.programHandle, 2, "uMVPMatrix");
        GLES20.glBindAttribLocation(this.programHandle, 3, "decorationSize");
        GLES20.glBindAttribLocation(this.programHandle, 4, "flip");
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        Iterator<m3x> it = this.f151086a.iterator();
        while (it.hasNext()) {
            it.next().m152955a();
        }
    }

    public void drawBackgroundImage() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glUniform2f(this.f151091f, 1.0f, 1.0f);
        GLES20.glUniform1f(this.f151094j, 0.0f);
        if (this.f151102r == null) {
            this.f151102r = new float[8];
        }
        this.textureVertices[this.curRotation].position(0);
        this.textureVertices[this.curRotation].get(this.f151102r);
        if (this.f151101q == null) {
            this.f151101q = ByteBuffer.allocateDirect(this.f151102r.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        for (int i = 0; i < 8; i++) {
            float[] fArr = this.f151102r;
            fArr[i] = (fArr[i] * (-1.0f)) + 0.5f;
        }
        this.f151101q.position(0);
        this.f151101q.put(this.f151102r);
        this.f151101q.position(0);
        GLES20.glVertexAttribPointer(this.f151093i, 2, 5126, false, 8, (Buffer) this.f151101q);
        GLES20.glEnableVertexAttribArray(this.f151093i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f151088c.m152957c());
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    @Override // p149l.mcj
    public void drawSub() {
        int i = 0;
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        GLES20.glClear(16640);
        drawBackgroundImage();
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        for (m3x m3xVar : this.f151087b) {
            this.f151087b.remove(m3xVar);
            this.f151086a.remove(m3xVar);
        }
        for (m3x m3xVar2 : this.f151086a) {
            synchronized (m3xVar2.m152956b()) {
                try {
                    if (m3xVar2.m152957c() >= 0) {
                        m3xVar2.m152961g();
                        Iterator<float[]> it = m3xVar2.f131203m.iterator();
                        while (it.hasNext()) {
                            m171263U1(m3xVar2, it.next(), m3xVar2.m152957c());
                            m171261S1(m3xVar2.f131197g / m3xVar2.f131196f, i);
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        GLES20.glDisable(3042);
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;uniform sampler2D inputImageTexture0;varying vec2 textureCoordinate;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture0,textureCoordinate);\n   gl_FragColor = color1; }";
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; varying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nuniform float flip;\nvoid main() {  gl_Position = position;   vec2 coord = position2.xy;  coord = (coord) / decorationSize; if(flip > 1.0){  textureCoordinate = vec2(1.0 - (coord.x + 0.5),(coord.y + 0.5));\n } else{  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0 - (coord.y + 0.5));\n}\n}";
    }

    @Override // p149l.mcj, p149l.ccj
    public void handleSizeChange() {
        super.handleSizeChange();
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f151093i = GLES20.glGetAttribLocation(this.programHandle, "position2");
        this.f151092g = GLES20.glGetUniformLocation(this.programHandle, "uMVPMatrix");
        this.f151091f = GLES20.glGetUniformLocation(this.programHandle, "decorationSize");
        this.f151094j = GLES20.glGetUniformLocation(this.programHandle, "flip");
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (z) {
            markAsDirty();
        }
        this.texture_in = i;
        this.inputFrameBuffer = mcjVar.glFrameBuffer;
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        float width = getWidth() / getHeight();
        Matrix.orthoM(this.f151097m, 0, -1.0f, 1.0f, (-1.0f) / width, 1.0f / width, 3.0f, 7.0f);
        onDrawFrame();
    }

    @Override // p149l.mcj, p149l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        Iterator<m3x> it = this.f151086a.iterator();
        while (it.hasNext()) {
            it.next().m152955a();
        }
    }

    @Override // p149l.ccj
    public void setRenderSize(int i, int i2) {
        super.setRenderSize(i, i2);
    }
}
