package p153l;

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
public class ekl0 extends it2 {

    /* JADX INFO: renamed from: G */
    protected final short[] f94385G;

    /* JADX INFO: renamed from: I */
    private int f94387I;

    /* JADX INFO: renamed from: J */
    protected int f94388J;

    /* JADX INFO: renamed from: K */
    private int f94389K;

    /* JADX INFO: renamed from: L */
    protected int f94390L;

    /* JADX INFO: renamed from: M */
    public ShortBuffer f94391M;

    /* JADX INFO: renamed from: O */
    protected FloatBuffer f94393O;

    /* JADX INFO: renamed from: P */
    protected float[] f94394P;

    /* JADX INFO: renamed from: Q */
    protected Context f94395Q;

    /* JADX INFO: renamed from: S */
    private int f94397S;

    /* JADX INFO: renamed from: T */
    protected int f94398T;

    /* JADX INFO: renamed from: U */
    protected int f94399U;

    /* JADX INFO: renamed from: V */
    private int f94400V;

    /* JADX INFO: renamed from: W */
    private int f94401W;

    /* JADX INFO: renamed from: X */
    private int f94402X;

    /* JADX INFO: renamed from: Y */
    protected int f94403Y;

    /* JADX INFO: renamed from: Z */
    protected int f94404Z;

    /* JADX INFO: renamed from: H */
    protected final int f94386H = 8;

    /* JADX INFO: renamed from: N */
    protected final float[] f94392N = new float[16];

    /* JADX INFO: renamed from: R */
    private long f94396R = 6000;

    /* JADX INFO: renamed from: k0 */
    public String f94405k0 = "mediump";

    /* JADX INFO: renamed from: p0 */
    private long f94406p0 = -1;

    /* JADX INFO: renamed from: E */
    protected List<k5g0> f94383E = new ArrayList();

    /* JADX INFO: renamed from: F */
    protected List<k5g0> f94384F = new ArrayList();

    /* JADX INFO: renamed from: l.ekl0$a */
    public class C16789a implements k5g0.InterfaceC18102b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ k5g0 f94407a;

        public C16789a(k5g0 k5g0Var) {
            this.f94407a = k5g0Var;
        }

        @Override // p153l.k5g0.InterfaceC18102b
        public void stickerRenderFinished() {
            ekl0.this.m121058a0(this.f94407a);
        }
    }

    public ekl0(Context context) {
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.f94385G = sArr;
        this.f94395Q = context;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        this.f94391M = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(sArr);
        this.f94391M.position(0);
    }

    /* JADX INFO: renamed from: S */
    private int m121052S(Bitmap bitmap) {
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
    private void m121053T() {
        this.f183780b.position(0);
        GLES20.glVertexAttribPointer(this.f183784f, 2, 5126, false, 8, (Buffer) this.f183780b);
        GLES20.glEnableVertexAttribArray(this.f183784f);
        GLES20.glUniform2f(this.f94388J, 1.0f, 1.0f);
        if (this.f94394P == null) {
            this.f94394P = new float[8];
        }
        this.f183781c[this.f183779a].position(0);
        this.f183781c[this.f183779a].get(this.f94394P);
        if (this.f94393O == null) {
            this.f94393O = ByteBuffer.allocateDirect(this.f94394P.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        for (int i = 0; i < 8; i++) {
            float[] fArr = this.f94394P;
            fArr[i] = (fArr[i] * (-1.0f)) + 0.5f;
        }
        this.f94393O.position(0);
        this.f94393O.put(this.f94394P);
        this.f94393O.position(0);
        GLES20.glVertexAttribPointer(this.f94390L, 2, 5126, false, 8, (Buffer) this.f94393O);
        GLES20.glEnableVertexAttribArray(this.f94390L);
        GLES20.glUniform1f(this.f94387I, 1.0f);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f183786h);
        GLES20.glUniform1i(this.f183783e, 0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* JADX INFO: renamed from: U */
    private void m121054U(float f) {
        GLES20.glUseProgram(this.f94397S);
        GLES20.glUniform2f(this.f94401W, 1.0f, f);
        GLES20.glDrawElements(4, this.f94385G.length, 5123, this.f94391M);
        GLES20.glDisableVertexAttribArray(this.f94403Y);
    }

    /* JADX INFO: renamed from: V */
    private void m121055V(float f) {
        GLES20.glUniform2f(this.f94388J, 1.0f, f);
        GLES20.glDrawElements(4, this.f94385G.length, 5123, this.f94391M);
        GLES20.glDisableVertexAttribArray(this.f183784f);
    }

    /* JADX INFO: renamed from: W */
    private String m121056W() {
        return "precision " + this.f94405k0 + " float;uniform sampler2D inputImageTexture0;varying vec2 textureCoordinate;\nuniform float alpha;\nfloat Circle(vec2 uv,vec2 p, float r,float blur){\n    float d = length(uv - p);\n    float c = smoothstep(r,r-blur,d);\n    return c;\n}void main() {   vec2 uv = textureCoordinate.xy;\n   vec4 color = texture2D(inputImageTexture0, uv).rgba;\n   uv -= 0.5;\n   float mask = Circle(uv, vec2(0.0,0.0), 0.5, 0.01);\n   vec4 colorMask = vec4(1.0,1.0,1.0,1.0);\n   vec4 ret = mix(colorMask*mask, color, 1.0 - smoothstep(0.46, 0.48, length(uv-vec2(0.0,0.0))));\n   float dis = distance(textureCoordinate,vec2(0.5,0.5));   if (dis > 0.49) {       ret.r = 1.0;       ret.b = 1.0;       ret.g = 1.0;       ret.a = 1.0 * (1.0 - smoothstep(0.49, 0.5, dis));   }\n   gl_FragColor = ret * alpha; }";
    }

    /* JADX INFO: renamed from: X */
    private String m121057X() {
        return "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; varying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;   vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m121058a0(k5g0 k5g0Var) {
        synchronized (m125377K()) {
            this.f94384F.remove(k5g0Var);
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m121059d0(Bitmap bitmap, int i) {
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        if (bitmap != null) {
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
        }
    }

    @Override // p153l.ffj
    /* JADX INFO: renamed from: J */
    public void mo121060J() {
        Bitmap bitmapM148367i;
        GLES20.glViewport(0, 0, m201064s(), m201063q());
        GLES20.glUseProgram(this.f183782d);
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        GLES20.glClear(16640);
        m121053T();
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        if (this.f94384F.size() > 0) {
            ArrayList<k5g0> arrayList = new ArrayList(this.f94384F);
            for (k5g0 k5g0Var : arrayList) {
                k5g0Var.m148366h();
                this.f94384F.remove(k5g0Var);
                this.f94383E.remove(k5g0Var);
            }
            arrayList.clear();
        }
        for (k5g0 k5g0Var2 : this.f94383E) {
            synchronized (k5g0Var2.m148368j()) {
                try {
                    k5g0Var2.f124030g = m201064s();
                    k5g0Var2.f124031h = m201063q();
                    List<float[]> list = k5g0Var2.f124038o;
                    if (list != null && list.size() > 0 && (bitmapM148367i = k5g0Var2.m148367i()) != null && !bitmapM148367i.isRecycled()) {
                        int i = k5g0Var2.f124040q;
                        if (i > 0) {
                            m121059d0(bitmapM148367i, i);
                        } else {
                            k5g0Var2.f124040q = m121052S(bitmapM148367i);
                        }
                    }
                    if (k5g0Var2.f124040q != 0) {
                        if (k5g0Var2.f124043t) {
                            GLES20.glUseProgram(this.f94397S);
                            Iterator<float[]> it = k5g0Var2.f124038o.iterator();
                            while (it.hasNext()) {
                                m121062Y(k5g0Var2, it.next());
                                m121054U(k5g0Var2.m148369k());
                            }
                        } else {
                            GLES20.glUseProgram(this.f183782d);
                            Iterator<float[]> it2 = k5g0Var2.f124038o.iterator();
                            while (it2.hasNext()) {
                                m121063Z(k5g0Var2, it2.next());
                                m121055V(k5g0Var2.m148369k());
                            }
                        }
                        k5g0Var2.m148365g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        GLES20.glDisable(3042);
    }

    /* JADX INFO: renamed from: R */
    public void m121061R(dkl0 dkl0Var) {
        Element element = dkl0Var.f89411a;
        k5g0 k5g0Var = new k5g0(dkl0Var, this.f94395Q, element);
        k5g0Var.f124039p = true;
        k5g0Var.f124043t = element.useCircle;
        k5g0Var.m148378t(this.f94392N);
        k5g0Var.m148375q(new C16789a(k5g0Var));
        this.f94383E.add(k5g0Var);
    }

    /* JADX INFO: renamed from: Y */
    public void m121062Y(k5g0 k5g0Var, float[] fArr) {
        if (k5g0Var.f124036m == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            k5g0Var.f124036m = byteBufferAllocateDirect.asFloatBuffer();
        }
        k5g0Var.f124036m.position(0);
        k5g0Var.f124036m.put(fArr);
        k5g0Var.f124036m.position(0);
        GLES20.glVertexAttribPointer(this.f94403Y, 2, 5126, false, 8, (Buffer) k5g0Var.f124036m);
        GLES20.glVertexAttribPointer(this.f94404Z, 2, 5126, false, 8, (Buffer) k5g0Var.f124026c);
        GLES20.glEnableVertexAttribArray(this.f94403Y);
        GLES20.glEnableVertexAttribArray(this.f94404Z);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, k5g0Var.f124040q);
        GLES20.glUniform1i(this.f94398T, 0);
        GLES20.glUniform1f(this.f94400V, k5g0Var.f124046w.f124050a);
    }

    /* JADX INFO: renamed from: Z */
    public void m121063Z(k5g0 k5g0Var, float[] fArr) {
        if (k5g0Var.f124036m == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            k5g0Var.f124036m = byteBufferAllocateDirect.asFloatBuffer();
        }
        k5g0Var.f124036m.position(0);
        k5g0Var.f124036m.put(fArr);
        k5g0Var.f124036m.position(0);
        GLES20.glVertexAttribPointer(this.f183784f, 2, 5126, false, 8, (Buffer) k5g0Var.f124036m);
        GLES20.glVertexAttribPointer(this.f94390L, 2, 5126, false, 8, (Buffer) k5g0Var.f124026c);
        GLES20.glEnableVertexAttribArray(this.f183784f);
        GLES20.glEnableVertexAttribArray(this.f94390L);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, k5g0Var.f124040q);
        GLES20.glUniform1i(this.f183783e, 0);
        GLES20.glUniform1f(this.f94387I, k5g0Var.f124046w.f124050a);
    }

    @Override // p153l.it2, p153l.cfj
    /* JADX INFO: renamed from: b */
    public void mo109544b(int i, ffj ffjVar, boolean z) {
        if (z) {
            m125380N();
        }
        this.f183786h = i;
        m201057G(ffjVar.m201064s());
        m201055D(ffjVar.m201063q());
        float fM201064s = m201064s() / m201063q();
        Matrix.orthoM(this.f94392N, 0, -1.0f, 1.0f, (-1.0f) / fM201064s, 1.0f / fM201064s, 3.0f, 7.0f);
        mo141810w();
        ffjVar.m125382P();
    }

    /* JADX INFO: renamed from: b0 */
    public void m121064b0(long j) {
        if (j < this.f94406p0) {
            return;
        }
        List<k5g0> list = this.f94383E;
        if (list != null) {
            float f = j / this.f94396R;
            for (k5g0 k5g0Var : list) {
                k5g0Var.m148379u(j);
                k5g0Var.m148377s(f);
            }
        }
        this.f94406p0 = j;
    }

    /* JADX INFO: renamed from: c0 */
    public void m121065c0(long j) {
        if (j > 0) {
            this.f94396R = j;
        }
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: h */
    public void mo121066h() {
        super.mo121066h();
        GLES20.glBindAttribLocation(this.f183782d, 2, "uMVPMatrix");
        GLES20.glBindAttribLocation(this.f183782d, 3, "decorationSize");
        GLES20.glBindAttribLocation(this.f94397S, 2, "uMVPMatrix");
        GLES20.glBindAttribLocation(this.f94397S, 3, "decorationSize");
    }

    @Override // p153l.ffj, p153l.vej
    /* JADX INFO: renamed from: i */
    public void mo97355i() {
        super.mo97355i();
        List<k5g0> list = this.f94383E;
        if (list != null && list.size() > 0) {
            for (k5g0 k5g0Var : this.f94383E) {
                if (k5g0Var != null) {
                    k5g0Var.m148366h();
                }
            }
        }
        List<k5g0> list2 = this.f94384F;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        Iterator<k5g0> it = this.f94384F.iterator();
        while (it.hasNext()) {
            it.next().m148366h();
        }
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: p */
    public String mo97356p() {
        return "precision " + this.f94405k0 + " float;uniform sampler2D inputImageTexture0;varying vec2 textureCoordinate;\nuniform bool isAlpha;\nuniform float alpha;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture0,textureCoordinate);\n   color1 = color1 * alpha; \n   gl_FragColor = color1; \n}";
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: r */
    public String mo97357r() {
        return "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; varying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;  vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: u */
    public void mo97358u() {
        super.mo97358u();
        this.f94390L = GLES20.glGetAttribLocation(this.f183782d, "position2");
        this.f94389K = GLES20.glGetUniformLocation(this.f183782d, "uMVPMatrix");
        this.f94388J = GLES20.glGetUniformLocation(this.f183782d, "decorationSize");
        this.f94387I = GLES20.glGetUniformLocation(this.f183782d, "alpha");
        if (this.f94397S == 0) {
            this.f94397S = d0f0.m113393a(m121057X(), m121056W());
        }
        this.f94398T = GLES20.glGetUniformLocation(this.f94397S, "inputImageTexture0");
        this.f94399U = GLES20.glGetAttribLocation(this.f94397S, "inputTextureCoordinate");
        this.f94403Y = GLES20.glGetAttribLocation(this.f94397S, "position");
        this.f94404Z = GLES20.glGetAttribLocation(this.f94397S, "position2");
        this.f94402X = GLES20.glGetUniformLocation(this.f94397S, "uMVPMatrix");
        this.f94401W = GLES20.glGetUniformLocation(this.f94397S, "decorationSize");
        this.f94400V = GLES20.glGetUniformLocation(this.f94397S, "alpha");
    }
}
