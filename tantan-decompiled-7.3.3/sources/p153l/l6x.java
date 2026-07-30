package p153l;

import android.graphics.PointF;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class l6x {

    /* JADX INFO: renamed from: a */
    public float f130295a;

    /* JADX INFO: renamed from: b */
    public FloatBuffer f130296b;

    /* JADX INFO: renamed from: c */
    public float[] f130297c;

    /* JADX INFO: renamed from: d */
    public final float[] f130298d;

    /* JADX INFO: renamed from: e */
    protected float[] f130299e;

    /* JADX INFO: renamed from: f */
    public float f130300f;

    /* JADX INFO: renamed from: g */
    public float f130301g;

    /* JADX INFO: renamed from: i */
    public FloatBuffer f130303i;

    /* JADX INFO: renamed from: j */
    public gfj f130304j;

    /* JADX INFO: renamed from: k */
    public gfj f130305k;

    /* JADX INFO: renamed from: l */
    public ehq0 f130306l;

    /* JADX INFO: renamed from: h */
    public Object f130302h = new Object();

    /* JADX INFO: renamed from: m */
    List<float[]> f130307m = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: n */
    private boolean f130308n = false;

    public l6x(ehq0 ehq0Var, gfj gfjVar) {
        float[] fArr = new float[16];
        this.f130298d = fArr;
        this.f130300f = 0.0f;
        this.f130301g = 0.0f;
        this.f130304j = gfjVar;
        this.f130306l = ehq0Var;
        float f = ehq0Var.f94059b / ehq0Var.f94058a;
        this.f130295a = f;
        float[] fArr2 = {-0.5f, f * 0.5f, -0.5f, (-0.5f) * f, 0.5f, (-0.5f) * f, 0.5f, f * 0.5f};
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f130296b = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr2);
        this.f130296b.position(0);
        float f2 = this.f130295a;
        this.f130297c = new float[]{-0.5f, f2 * 0.5f, 0.0f, 1.0f, -0.5f, (-0.5f) * f2, 0.0f, 1.0f, 0.5f, (-0.5f) * f2, 0.0f, 1.0f, 0.5f, f2 * 0.5f, 0.0f, 1.0f};
        Matrix.setIdentityM(fArr, 0);
        fArr[0] = -1.0f;
        this.f130300f = ehq0Var.f94058a;
        this.f130301g = ehq0Var.f94059b;
    }

    /* JADX INFO: renamed from: a */
    public void m153106a() {
        gfj gfjVar = this.f130304j;
        if (gfjVar != null) {
            gfjVar.destroy();
        }
        gfj gfjVar2 = this.f130305k;
        if (gfjVar2 != null) {
            gfjVar2.destroy();
        }
    }

    /* JADX INFO: renamed from: b */
    public Object m153107b() {
        return this.f130302h;
    }

    /* JADX INFO: renamed from: c */
    public int m153108c() {
        gfj gfjVar = this.f130305k;
        if (gfjVar != null) {
            return gfjVar.getTextOutID();
        }
        gfj gfjVar2 = this.f130304j;
        if (gfjVar2 != null) {
            return gfjVar2.getTextOutID();
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public void m153109d(ehq0 ehq0Var) {
        this.f130306l = ehq0Var;
        this.f130308n = false;
        float f = ehq0Var.f94059b / ehq0Var.f94058a;
        this.f130295a = f;
        float[] fArr = {-0.5f, f * 0.5f, -0.5f, (-0.5f) * f, 0.5f, (-0.5f) * f, 0.5f, f * 0.5f};
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f130296b = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.f130296b.position(0);
        float f2 = this.f130295a;
        this.f130297c = new float[]{-0.5f, f2 * 0.5f, 0.0f, 1.0f, -0.5f, (-0.5f) * f2, 0.0f, 1.0f, 0.5f, (-0.5f) * f2, 0.0f, 1.0f, 0.5f, f2 * 0.5f, 0.0f, 1.0f};
        Matrix.setIdentityM(this.f130298d, 0);
        this.f130298d[0] = -1.0f;
        ehq0 ehq0Var2 = this.f130306l;
        this.f130300f = ehq0Var2.f94058a;
        this.f130301g = ehq0Var2.f94059b;
    }

    /* JADX INFO: renamed from: e */
    public void m153110e(float f, float f2, PointF pointF, float f3) {
        if (pointF == null) {
            return;
        }
        float f4 = -((pointF.x * 2.0f) - 1.0f);
        float f5 = ((-pointF.y) * 2.0f) + 1.0f;
        float[] fArr = new float[16];
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, -f4, f5, 0.0f);
        Matrix.multiplyMM(fArr, 0, this.f130298d, 0, this.f130299e, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        Matrix.rotateM(fArr, 0, f3, 0.0f, 0.0f, 1.0f);
        Matrix.scaleM(fArr, 0, f * 1.0f, f2 * 1.0f, 1.0f);
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.f130297c, 0);
        float[] fArr3 = {fArr2[0], fArr2[1], fArr2[4], fArr2[5], fArr2[8], fArr2[9], fArr2[12], fArr2[13]};
        this.f130307m.clear();
        this.f130307m.add(fArr3);
    }

    /* JADX INFO: renamed from: f */
    public void m153111f(float[] fArr) {
        this.f130299e = fArr;
    }

    /* JADX INFO: renamed from: g */
    public void m153112g() {
        ehq0 ehq0Var = this.f130306l;
        float f = ehq0Var.f94062e;
        float f2 = ehq0Var.f94063f;
        ehq0 ehq0Var2 = this.f130306l;
        m153110e(f, f2, new PointF(ehq0Var2.f94060c, ehq0Var2.f94061d), this.f130306l.f94064g);
    }
}
