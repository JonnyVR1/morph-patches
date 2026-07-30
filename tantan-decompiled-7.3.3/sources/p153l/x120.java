package p153l;

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

/* JADX INFO: loaded from: classes8.dex */
public class x120 extends jt2 {

    /* JADX INFO: renamed from: c */
    public l6x f191957c;

    /* JADX INFO: renamed from: d */
    private final short[] f191958d;

    /* JADX INFO: renamed from: f */
    private int f191960f;

    /* JADX INFO: renamed from: g */
    private int f191961g;

    /* JADX INFO: renamed from: i */
    protected int f191962i;

    /* JADX INFO: renamed from: j */
    protected int f191963j;

    /* JADX INFO: renamed from: k */
    public ShortBuffer f191964k;

    /* JADX INFO: renamed from: q */
    protected FloatBuffer f191970q;

    /* JADX INFO: renamed from: r */
    protected float[] f191971r;

    /* JADX INFO: renamed from: e */
    private final int f191959e = 8;

    /* JADX INFO: renamed from: l */
    private boolean f191965l = false;

    /* JADX INFO: renamed from: m */
    protected final float[] f191966m = new float[16];

    /* JADX INFO: renamed from: n */
    float f191967n = 1.0f;

    /* JADX INFO: renamed from: o */
    float f191968o = 1.0f;

    /* JADX INFO: renamed from: p */
    private boolean f191969p = false;

    /* JADX INFO: renamed from: s */
    private final String f191972s = "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; varying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nuniform float flip;\nvoid main() {  gl_Position = position;   vec2 coord = position2.xy;  coord = (coord) / decorationSize; if(flip > 1.0){  textureCoordinate = vec2(1.0 - (coord.x + 0.5),(coord.y + 0.5));\n } else{  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0 - (coord.y + 0.5));\n}\n}";

    /* JADX INFO: renamed from: t */
    private final String f191973t = "precision mediump float;uniform sampler2D inputImageTexture0;varying vec2 textureCoordinate;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture0,textureCoordinate);\n   gl_FragColor = color1; }";

    /* JADX INFO: renamed from: a */
    public List<l6x> f191955a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<l6x> f191956b = new ArrayList();

    public x120() {
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.f191958d = sArr;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        this.f191964k = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(sArr);
        this.f191964k.position(0);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m208895Q1(l6x l6xVar) {
        for (l6x l6xVar2 : this.f191955a) {
            if (l6xVar2.f130305k == l6xVar.f130305k) {
                this.f191955a.remove(l6xVar2);
                break;
            }
        }
        if (l6xVar != null) {
            l6xVar.m153111f(this.f191966m);
            this.f191955a.add(l6xVar);
        }
    }

    /* JADX INFO: renamed from: R1 */
    public void m208896R1() {
        synchronized (getLockObject()) {
            try {
                Iterator<l6x> it = this.f191955a.iterator();
                while (it.hasNext()) {
                    this.f191956b.add(it.next());
                }
                this.f191955a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: S1 */
    public void m208897S1(float f, int i) {
        GLES20.glUniform2f(this.f191960f, 1.0f, f);
        GLES20.glUniform1f(this.f191963j, 2.0f);
        GLES20.glDrawElements(4, this.f191958d.length, 5123, this.f191964k);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
    }

    /* JADX INFO: renamed from: T1 */
    public l6x m208898T1() {
        return this.f191957c;
    }

    /* JADX INFO: renamed from: U1 */
    public void m208899U1(l6x l6xVar, float[] fArr, int i) {
        if (l6xVar.f130303i == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            l6xVar.f130303i = byteBufferAllocateDirect.asFloatBuffer();
        }
        l6xVar.f130303i.position(0);
        l6xVar.f130303i.put(fArr);
        l6xVar.f130303i.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) l6xVar.f130303i);
        GLES20.glVertexAttribPointer(this.f191962i, 2, 5126, false, 8, (Buffer) l6xVar.f130296b);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glEnableVertexAttribArray(this.f191962i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    /* JADX INFO: renamed from: V1 */
    public void m208900V1(l6x l6xVar) {
        this.f191956b.add(l6xVar);
    }

    /* JADX INFO: renamed from: W1 */
    public void m208901W1(int i) {
        this.curRotation = i;
    }

    /* JADX INFO: renamed from: X1 */
    public void m208902X1(l6x l6xVar) {
        this.f191957c = l6xVar;
    }

    @Override // p153l.wej
    public void bindShaderAttributes() {
        super.bindShaderAttributes();
        GLES20.glBindAttribLocation(this.programHandle, 2, "uMVPMatrix");
        GLES20.glBindAttribLocation(this.programHandle, 3, "decorationSize");
        GLES20.glBindAttribLocation(this.programHandle, 4, "flip");
    }

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        Iterator<l6x> it = this.f191955a.iterator();
        while (it.hasNext()) {
            it.next().m153106a();
        }
    }

    public void drawBackgroundImage() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glUniform2f(this.f191960f, 1.0f, 1.0f);
        GLES20.glUniform1f(this.f191963j, 0.0f);
        if (this.f191971r == null) {
            this.f191971r = new float[8];
        }
        this.textureVertices[this.curRotation].position(0);
        this.textureVertices[this.curRotation].get(this.f191971r);
        if (this.f191970q == null) {
            this.f191970q = ByteBuffer.allocateDirect(this.f191971r.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        for (int i = 0; i < 8; i++) {
            float[] fArr = this.f191971r;
            fArr[i] = (fArr[i] * (-1.0f)) + 0.5f;
        }
        this.f191970q.position(0);
        this.f191970q.put(this.f191971r);
        this.f191970q.position(0);
        GLES20.glVertexAttribPointer(this.f191962i, 2, 5126, false, 8, (Buffer) this.f191970q);
        GLES20.glEnableVertexAttribArray(this.f191962i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f191957c.m153108c());
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    @Override // p153l.gfj
    public void drawSub() {
        int i = 0;
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        GLES20.glClear(16640);
        drawBackgroundImage();
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        for (l6x l6xVar : this.f191956b) {
            this.f191956b.remove(l6xVar);
            this.f191955a.remove(l6xVar);
        }
        for (l6x l6xVar2 : this.f191955a) {
            synchronized (l6xVar2.m153107b()) {
                try {
                    if (l6xVar2.m153108c() >= 0) {
                        l6xVar2.m153112g();
                        Iterator<float[]> it = l6xVar2.f130307m.iterator();
                        while (it.hasNext()) {
                            m208899U1(l6xVar2, it.next(), l6xVar2.m153108c());
                            m208897S1(l6xVar2.f130301g / l6xVar2.f130300f, i);
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

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;uniform sampler2D inputImageTexture0;varying vec2 textureCoordinate;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture0,textureCoordinate);\n   gl_FragColor = color1; }";
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; varying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nuniform float flip;\nvoid main() {  gl_Position = position;   vec2 coord = position2.xy;  coord = (coord) / decorationSize; if(flip > 1.0){  textureCoordinate = vec2(1.0 - (coord.x + 0.5),(coord.y + 0.5));\n } else{  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0 - (coord.y + 0.5));\n}\n}";
    }

    @Override // p153l.gfj, p153l.wej
    public void handleSizeChange() {
        super.handleSizeChange();
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f191962i = GLES20.glGetAttribLocation(this.programHandle, "position2");
        this.f191961g = GLES20.glGetUniformLocation(this.programHandle, "uMVPMatrix");
        this.f191960f = GLES20.glGetUniformLocation(this.programHandle, "decorationSize");
        this.f191963j = GLES20.glGetUniformLocation(this.programHandle, "flip");
    }

    @Override // p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        if (z) {
            markAsDirty();
        }
        this.texture_in = i;
        this.inputFrameBuffer = gfjVar.glFrameBuffer;
        setWidth(gfjVar.getWidth());
        setHeight(gfjVar.getHeight());
        float width = getWidth() / getHeight();
        Matrix.orthoM(this.f191966m, 0, -1.0f, 1.0f, (-1.0f) / width, 1.0f / width, 3.0f, 7.0f);
        onDrawFrame();
    }

    @Override // p153l.gfj, p153l.wej
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        Iterator<l6x> it = this.f191955a.iterator();
        while (it.hasNext()) {
            it.next().m153106a();
        }
    }

    @Override // p153l.wej
    public void setRenderSize(int i, int i2) {
        super.setRenderSize(i, i2);
    }
}
