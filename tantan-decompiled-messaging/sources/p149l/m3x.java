package p149l;

import android.graphics.PointF;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class m3x {

    /* JADX INFO: renamed from: a */
    public float f131191a;

    /* JADX INFO: renamed from: b */
    public FloatBuffer f131192b;

    /* JADX INFO: renamed from: c */
    public float[] f131193c;

    /* JADX INFO: renamed from: d */
    public final float[] f131194d;

    /* JADX INFO: renamed from: e */
    protected float[] f131195e;

    /* JADX INFO: renamed from: f */
    public float f131196f;

    /* JADX INFO: renamed from: g */
    public float f131197g;

    /* JADX INFO: renamed from: i */
    public FloatBuffer f131199i;

    /* JADX INFO: renamed from: j */
    public mcj f131200j;

    /* JADX INFO: renamed from: k */
    public mcj f131201k;

    /* JADX INFO: renamed from: l */
    public z7q0 f131202l;

    /* JADX INFO: renamed from: h */
    public Object f131198h = new Object();

    /* JADX INFO: renamed from: m */
    List<float[]> f131203m = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: n */
    private boolean f131204n = false;

    public m3x(z7q0 z7q0Var, mcj mcjVar) {
        float[] fArr = new float[16];
        this.f131194d = fArr;
        this.f131196f = 0.0f;
        this.f131197g = 0.0f;
        this.f131200j = mcjVar;
        this.f131202l = z7q0Var;
        float f = z7q0Var.f202049b / z7q0Var.f202048a;
        this.f131191a = f;
        float[] fArr2 = {-0.5f, f * 0.5f, -0.5f, (-0.5f) * f, 0.5f, (-0.5f) * f, 0.5f, f * 0.5f};
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f131192b = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr2);
        this.f131192b.position(0);
        float f2 = this.f131191a;
        this.f131193c = new float[]{-0.5f, f2 * 0.5f, 0.0f, 1.0f, -0.5f, (-0.5f) * f2, 0.0f, 1.0f, 0.5f, (-0.5f) * f2, 0.0f, 1.0f, 0.5f, f2 * 0.5f, 0.0f, 1.0f};
        Matrix.setIdentityM(fArr, 0);
        fArr[0] = -1.0f;
        this.f131196f = z7q0Var.f202048a;
        this.f131197g = z7q0Var.f202049b;
    }

    /* JADX INFO: renamed from: a */
    public void m152955a() {
        mcj mcjVar = this.f131200j;
        if (mcjVar != null) {
            mcjVar.destroy();
        }
        mcj mcjVar2 = this.f131201k;
        if (mcjVar2 != null) {
            mcjVar2.destroy();
        }
    }

    /* JADX INFO: renamed from: b */
    public Object m152956b() {
        return this.f131198h;
    }

    /* JADX INFO: renamed from: c */
    public int m152957c() {
        mcj mcjVar = this.f131201k;
        if (mcjVar != null) {
            return mcjVar.getTextOutID();
        }
        mcj mcjVar2 = this.f131200j;
        if (mcjVar2 != null) {
            return mcjVar2.getTextOutID();
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public void m152958d(z7q0 z7q0Var) {
        this.f131202l = z7q0Var;
        this.f131204n = false;
        float f = z7q0Var.f202049b / z7q0Var.f202048a;
        this.f131191a = f;
        float[] fArr = {-0.5f, f * 0.5f, -0.5f, (-0.5f) * f, 0.5f, (-0.5f) * f, 0.5f, f * 0.5f};
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f131192b = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.f131192b.position(0);
        float f2 = this.f131191a;
        this.f131193c = new float[]{-0.5f, f2 * 0.5f, 0.0f, 1.0f, -0.5f, (-0.5f) * f2, 0.0f, 1.0f, 0.5f, (-0.5f) * f2, 0.0f, 1.0f, 0.5f, f2 * 0.5f, 0.0f, 1.0f};
        Matrix.setIdentityM(this.f131194d, 0);
        this.f131194d[0] = -1.0f;
        z7q0 z7q0Var2 = this.f131202l;
        this.f131196f = z7q0Var2.f202048a;
        this.f131197g = z7q0Var2.f202049b;
    }

    /* JADX INFO: renamed from: e */
    public void m152959e(float f, float f2, PointF pointF, float f3) {
        if (pointF == null) {
            return;
        }
        float f4 = -((pointF.x * 2.0f) - 1.0f);
        float f5 = ((-pointF.y) * 2.0f) + 1.0f;
        float[] fArr = new float[16];
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, -f4, f5, 0.0f);
        Matrix.multiplyMM(fArr, 0, this.f131194d, 0, this.f131195e, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        Matrix.rotateM(fArr, 0, f3, 0.0f, 0.0f, 1.0f);
        Matrix.scaleM(fArr, 0, f * 1.0f, f2 * 1.0f, 1.0f);
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.f131193c, 0);
        float[] fArr3 = {fArr2[0], fArr2[1], fArr2[4], fArr2[5], fArr2[8], fArr2[9], fArr2[12], fArr2[13]};
        this.f131203m.clear();
        this.f131203m.add(fArr3);
    }

    /* JADX INFO: renamed from: f */
    public void m152960f(float[] fArr) {
        this.f131195e = fArr;
    }

    /* JADX INFO: renamed from: g */
    public void m152961g() {
        z7q0 z7q0Var = this.f131202l;
        float f = z7q0Var.f202052e;
        float f2 = z7q0Var.f202053f;
        z7q0 z7q0Var2 = this.f131202l;
        m152959e(f, f2, new PointF(z7q0Var2.f202050c, z7q0Var2.f202051d), this.f131202l.f202054g);
    }
}
