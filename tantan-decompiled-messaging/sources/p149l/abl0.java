package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import com.immomo.velib.anim.model.Element;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class abl0 extends ss2 {

    /* JADX INFO: renamed from: G */
    protected final short[] f68706G;

    /* JADX INFO: renamed from: I */
    private int f68708I;

    /* JADX INFO: renamed from: J */
    protected int f68709J;

    /* JADX INFO: renamed from: K */
    private int f68710K;

    /* JADX INFO: renamed from: L */
    protected int f68711L;

    /* JADX INFO: renamed from: M */
    public ShortBuffer f68712M;

    /* JADX INFO: renamed from: O */
    protected FloatBuffer f68714O;

    /* JADX INFO: renamed from: P */
    protected float[] f68715P;

    /* JADX INFO: renamed from: Q */
    protected Context f68716Q;

    /* JADX INFO: renamed from: S */
    private int f68718S;

    /* JADX INFO: renamed from: T */
    protected int f68719T;

    /* JADX INFO: renamed from: U */
    protected int f68720U;

    /* JADX INFO: renamed from: V */
    private int f68721V;

    /* JADX INFO: renamed from: W */
    private int f68722W;

    /* JADX INFO: renamed from: X */
    private int f68723X;

    /* JADX INFO: renamed from: Y */
    protected int f68724Y;

    /* JADX INFO: renamed from: Z */
    protected int f68725Z;

    /* JADX INFO: renamed from: H */
    protected final int f68707H = 8;

    /* JADX INFO: renamed from: N */
    protected final float[] f68713N = new float[16];

    /* JADX INFO: renamed from: R */
    private long f68717R = 6000;

    /* JADX INFO: renamed from: k0 */
    public String f68726k0 = "mediump";

    /* JADX INFO: renamed from: p0 */
    private long f68727p0 = -1;

    /* JADX INFO: renamed from: E */
    protected List<axf0> f68704E = new ArrayList();

    /* JADX INFO: renamed from: F */
    protected List<axf0> f68705F = new ArrayList();

    /* JADX INFO: renamed from: l.abl0$a */
    public class C15579a implements axf0.InterfaceC15752b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ axf0 f68728a;

        public C15579a(axf0 axf0Var) {
            this.f68728a = axf0Var;
        }

        @Override // p149l.axf0.InterfaceC15752b
        public void stickerRenderFinished() {
            abl0.this.m95675a0(this.f68728a);
        }
    }

    public abl0(Context context) {
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.f68706G = sArr;
        this.f68716Q = context;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        this.f68712M = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(sArr);
        this.f68712M.position(0);
    }

    /* JADX INFO: renamed from: S */
    private int m95669S(Bitmap bitmap) {
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

    /* JADX INFO: renamed from: T */
    private void m95670T() {
        this.f74922b.position(0);
        GLES20.glVertexAttribPointer(this.f74926f, 2, 5126, false, 8, (Buffer) this.f74922b);
        GLES20.glEnableVertexAttribArray(this.f74926f);
        GLES20.glUniform2f(this.f68709J, 1.0f, 1.0f);
        if (this.f68715P == null) {
            this.f68715P = new float[8];
        }
        this.f74923c[this.f74921a].position(0);
        this.f74923c[this.f74921a].get(this.f68715P);
        if (this.f68714O == null) {
            this.f68714O = ByteBuffer.allocateDirect(this.f68715P.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        for (int i = 0; i < 8; i++) {
            float[] fArr = this.f68715P;
            fArr[i] = (fArr[i] * (-1.0f)) + 0.5f;
        }
        this.f68714O.position(0);
        this.f68714O.put(this.f68715P);
        this.f68714O.position(0);
        GLES20.glVertexAttribPointer(this.f68711L, 2, 5126, false, 8, (Buffer) this.f68714O);
        GLES20.glEnableVertexAttribArray(this.f68711L);
        GLES20.glUniform1f(this.f68708I, 1.0f);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f74928h);
        GLES20.glUniform1i(this.f74925e, 0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* JADX INFO: renamed from: U */
    private void m95671U(float f) {
        GLES20.glUseProgram(this.f68718S);
        GLES20.glUniform2f(this.f68722W, 1.0f, f);
        GLES20.glDrawElements(4, this.f68706G.length, 5123, this.f68712M);
        GLES20.glDisableVertexAttribArray(this.f68724Y);
    }

    /* JADX INFO: renamed from: V */
    private void m95672V(float f) {
        GLES20.glUniform2f(this.f68709J, 1.0f, f);
        GLES20.glDrawElements(4, this.f68706G.length, 5123, this.f68712M);
        GLES20.glDisableVertexAttribArray(this.f74926f);
    }

    /* JADX INFO: renamed from: W */
    private String m95673W() {
        return "precision " + this.f68726k0 + " float;uniform sampler2D inputImageTexture0;varying vec2 textureCoordinate;\nuniform float alpha;\nfloat Circle(vec2 uv,vec2 p, float r,float blur){\n    float d = length(uv - p);\n    float c = smoothstep(r,r-blur,d);\n    return c;\n}void main() {   vec2 uv = textureCoordinate.xy;\n   vec4 color = texture2D(inputImageTexture0, uv).rgba;\n   uv -= 0.5;\n   float mask = Circle(uv, vec2(0.0,0.0), 0.5, 0.01);\n   vec4 colorMask = vec4(1.0,1.0,1.0,1.0);\n   vec4 ret = mix(colorMask*mask, color, 1.0 - smoothstep(0.46, 0.48, length(uv-vec2(0.0,0.0))));\n   float dis = distance(textureCoordinate,vec2(0.5,0.5));   if (dis > 0.49) {       ret.r = 1.0;       ret.b = 1.0;       ret.g = 1.0;       ret.a = 1.0 * (1.0 - smoothstep(0.49, 0.5, dis));   }\n   gl_FragColor = ret * alpha; }";
    }

    /* JADX INFO: renamed from: X */
    private String m95674X() {
        return "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; varying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;   vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m95675a0(axf0 axf0Var) {
        synchronized (m149301K()) {
            this.f68705F.remove(axf0Var);
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m95676d0(Bitmap bitmap, int i) {
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        if (bitmap != null) {
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
        }
    }

    @Override // p149l.lcj
    /* JADX INFO: renamed from: J */
    public void mo95677J() {
        Bitmap bitmapM99413i;
        GLES20.glViewport(0, 0, m101085s(), m101084q());
        GLES20.glUseProgram(this.f74924d);
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        GLES20.glClear(16640);
        m95670T();
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        if (this.f68705F.size() > 0) {
            ArrayList<axf0> arrayList = new ArrayList(this.f68705F);
            for (axf0 axf0Var : arrayList) {
                axf0Var.m99412h();
                this.f68705F.remove(axf0Var);
                this.f68704E.remove(axf0Var);
            }
            arrayList.clear();
        }
        for (axf0 axf0Var2 : this.f68704E) {
            synchronized (axf0Var2.m99414j()) {
                try {
                    axf0Var2.f72157g = m101085s();
                    axf0Var2.f72158h = m101084q();
                    List<float[]> list = axf0Var2.f72165o;
                    if (list != null && list.size() > 0 && (bitmapM99413i = axf0Var2.m99413i()) != null && !bitmapM99413i.isRecycled()) {
                        int i = axf0Var2.f72167q;
                        if (i > 0) {
                            m95676d0(bitmapM99413i, i);
                        } else {
                            axf0Var2.f72167q = m95669S(bitmapM99413i);
                        }
                    }
                    if (axf0Var2.f72167q != 0) {
                        if (axf0Var2.f72170t) {
                            GLES20.glUseProgram(this.f68718S);
                            Iterator<float[]> it = axf0Var2.f72165o.iterator();
                            while (it.hasNext()) {
                                m95679Y(axf0Var2, it.next());
                                m95671U(axf0Var2.m99415k());
                            }
                        } else {
                            GLES20.glUseProgram(this.f74924d);
                            Iterator<float[]> it2 = axf0Var2.f72165o.iterator();
                            while (it2.hasNext()) {
                                m95680Z(axf0Var2, it2.next());
                                m95672V(axf0Var2.m99415k());
                            }
                        }
                        axf0Var2.m99411g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        GLES20.glDisable(3042);
    }

    /* JADX INFO: renamed from: R */
    public void m95678R(zal0 zal0Var) {
        Element element = zal0Var.f202371a;
        axf0 axf0Var = new axf0(zal0Var, this.f68716Q, element);
        axf0Var.f72166p = true;
        axf0Var.f72170t = element.useCircle;
        axf0Var.m99424t(this.f68713N);
        axf0Var.m99421q(new C15579a(axf0Var));
        this.f68704E.add(axf0Var);
    }

    /* JADX INFO: renamed from: Y */
    public void m95679Y(axf0 axf0Var, float[] fArr) {
        if (axf0Var.f72163m == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            axf0Var.f72163m = byteBufferAllocateDirect.asFloatBuffer();
        }
        axf0Var.f72163m.position(0);
        axf0Var.f72163m.put(fArr);
        axf0Var.f72163m.position(0);
        GLES20.glVertexAttribPointer(this.f68724Y, 2, 5126, false, 8, (Buffer) axf0Var.f72163m);
        GLES20.glVertexAttribPointer(this.f68725Z, 2, 5126, false, 8, (Buffer) axf0Var.f72153c);
        GLES20.glEnableVertexAttribArray(this.f68724Y);
        GLES20.glEnableVertexAttribArray(this.f68725Z);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, axf0Var.f72167q);
        GLES20.glUniform1i(this.f68719T, 0);
        GLES20.glUniform1f(this.f68721V, axf0Var.f72173w.f72177a);
    }

    /* JADX INFO: renamed from: Z */
    public void m95680Z(axf0 axf0Var, float[] fArr) {
        if (axf0Var.f72163m == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            axf0Var.f72163m = byteBufferAllocateDirect.asFloatBuffer();
        }
        axf0Var.f72163m.position(0);
        axf0Var.f72163m.put(fArr);
        axf0Var.f72163m.position(0);
        GLES20.glVertexAttribPointer(this.f74926f, 2, 5126, false, 8, (Buffer) axf0Var.f72163m);
        GLES20.glVertexAttribPointer(this.f68711L, 2, 5126, false, 8, (Buffer) axf0Var.f72153c);
        GLES20.glEnableVertexAttribArray(this.f74926f);
        GLES20.glEnableVertexAttribArray(this.f68711L);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, axf0Var.f72167q);
        GLES20.glUniform1i(this.f74925e, 0);
        GLES20.glUniform1f(this.f68708I, axf0Var.f72173w.f72177a);
    }

    @Override // p149l.ss2, p149l.icj
    /* JADX INFO: renamed from: b */
    public void mo95681b(int i, lcj lcjVar, boolean z) {
        if (z) {
            m149304N();
        }
        this.f74928h = i;
        m101077G(lcjVar.m101085s());
        m101074D(lcjVar.m101084q());
        float fM101085s = m101085s() / m101084q();
        Matrix.orthoM(this.f68713N, 0, -1.0f, 1.0f, (-1.0f) / fM101085s, 1.0f / fM101085s, 3.0f, 7.0f);
        mo101088w();
        lcjVar.m149306P();
    }

    /* JADX INFO: renamed from: b0 */
    public void m95682b0(long j) {
        if (j < this.f68727p0) {
            return;
        }
        List<axf0> list = this.f68704E;
        if (list != null) {
            float f = j / this.f68717R;
            for (axf0 axf0Var : list) {
                axf0Var.m99425u(j);
                axf0Var.m99423s(f);
            }
        }
        this.f68727p0 = j;
    }

    /* JADX INFO: renamed from: c0 */
    public void m95683c0(long j) {
        if (j > 0) {
            this.f68717R = j;
        }
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: h */
    public void mo95684h() {
        super.mo95684h();
        GLES20.glBindAttribLocation(this.f74924d, 2, "uMVPMatrix");
        GLES20.glBindAttribLocation(this.f74924d, 3, "decorationSize");
        GLES20.glBindAttribLocation(this.f68718S, 2, "uMVPMatrix");
        GLES20.glBindAttribLocation(this.f68718S, 3, "decorationSize");
    }

    @Override // p149l.lcj, p149l.bcj
    /* JADX INFO: renamed from: i */
    public void mo95685i() {
        super.mo95685i();
        List<axf0> list = this.f68704E;
        if (list != null && list.size() > 0) {
            for (axf0 axf0Var : this.f68704E) {
                if (axf0Var != null) {
                    axf0Var.m99412h();
                }
            }
        }
        List<axf0> list2 = this.f68705F;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        Iterator<axf0> it = this.f68705F.iterator();
        while (it.hasNext()) {
            it.next().m99412h();
        }
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: p */
    public String mo95686p() {
        return "precision " + this.f68726k0 + " float;uniform sampler2D inputImageTexture0;varying vec2 textureCoordinate;\nuniform bool isAlpha;\nuniform float alpha;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture0,textureCoordinate);\n   color1 = color1 * alpha; \n   gl_FragColor = color1; \n}";
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: r */
    public String mo95687r() {
        return "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; varying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;  vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: u */
    public void mo95688u() {
        super.mo95688u();
        this.f68711L = GLES20.glGetAttribLocation(this.f74924d, "position2");
        this.f68710K = GLES20.glGetUniformLocation(this.f74924d, "uMVPMatrix");
        this.f68709J = GLES20.glGetUniformLocation(this.f74924d, "decorationSize");
        this.f68708I = GLES20.glGetUniformLocation(this.f74924d, "alpha");
        if (this.f68718S == 0) {
            this.f68718S = wre0.m205175a(m95674X(), m95673W());
        }
        this.f68719T = GLES20.glGetUniformLocation(this.f68718S, "inputImageTexture0");
        this.f68720U = GLES20.glGetAttribLocation(this.f68718S, "inputTextureCoordinate");
        this.f68724Y = GLES20.glGetAttribLocation(this.f68718S, "position");
        this.f68725Z = GLES20.glGetAttribLocation(this.f68718S, "position2");
        this.f68723X = GLES20.glGetUniformLocation(this.f68718S, "uMVPMatrix");
        this.f68722W = GLES20.glGetUniformLocation(this.f68718S, "decorationSize");
        this.f68721V = GLES20.glGetUniformLocation(this.f68718S, "alpha");
    }
}
