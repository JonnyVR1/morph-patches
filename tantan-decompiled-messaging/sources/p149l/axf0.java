package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.text.TextUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.clevertap.android.sdk.Constants;
import com.immomo.velib.anim.model.Element;
import com.immomo.velib.anim.model.ElementAnimation;
import com.immomo.velib.anim.model.ElementNewAnimation;
import com.immomo.velib.anim.model.PointSet;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class axf0 implements wdl, iml, s4m, s2m, l2m, lzl {

    /* JADX INFO: renamed from: a */
    public zal0 f72151a;

    /* JADX INFO: renamed from: b */
    public float f72152b;

    /* JADX INFO: renamed from: c */
    public FloatBuffer f72153c;

    /* JADX INFO: renamed from: d */
    public float[] f72154d;

    /* JADX INFO: renamed from: f */
    protected float[] f72156f;

    /* JADX INFO: renamed from: k */
    protected Context f72161k;

    /* JADX INFO: renamed from: m */
    public FloatBuffer f72163m;

    /* JADX INFO: renamed from: n */
    public FloatBuffer f72164n;

    /* JADX INFO: renamed from: s */
    private Bitmap f72169s;

    /* JADX INFO: renamed from: t */
    public boolean f72170t;

    /* JADX INFO: renamed from: u */
    private vdl f72171u;

    /* JADX INFO: renamed from: v */
    private bpf f72172v;

    /* JADX INFO: renamed from: x */
    private float f72174x;

    /* JADX INFO: renamed from: y */
    private float f72175y;

    /* JADX INFO: renamed from: z */
    private InterfaceC15752b f72176z;

    /* JADX INFO: renamed from: e */
    public final float[] f72155e = new float[16];

    /* JADX INFO: renamed from: g */
    public float f72157g = 0.0f;

    /* JADX INFO: renamed from: h */
    public float f72158h = 0.0f;

    /* JADX INFO: renamed from: i */
    public long f72159i = -1;

    /* JADX INFO: renamed from: j */
    public Object f72160j = new Object();

    /* JADX INFO: renamed from: l */
    long f72162l = -1;

    /* JADX INFO: renamed from: o */
    public List<float[]> f72165o = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: p */
    public boolean f72166p = false;

    /* JADX INFO: renamed from: q */
    public int f72167q = 0;

    /* JADX INFO: renamed from: r */
    private long f72168r = -1;

    /* JADX INFO: renamed from: w */
    public C15751a f72173w = new C15751a();

    /* JADX INFO: renamed from: l.axf0$a */
    public class C15751a {

        /* JADX INFO: renamed from: a */
        float f72177a = 1.0f;

        /* JADX INFO: renamed from: b */
        float f72178b = 1.0f;

        /* JADX INFO: renamed from: c */
        float f72179c = -0.5f;

        /* JADX INFO: renamed from: d */
        float f72180d = -0.5f;

        /* JADX INFO: renamed from: e */
        float f72181e = 0.0f;

        public C15751a() {
        }

        public String toString() {
            return "Params{alpha=" + this.f72177a + ", scale=" + this.f72178b + ", x=" + this.f72179c + ", y=" + this.f72180d + ", degress=" + this.f72181e + '}';
        }
    }

    /* JADX INFO: renamed from: l.axf0$b */
    public interface InterfaceC15752b {
        void stickerRenderFinished();
    }

    public axf0(zal0 zal0Var, Context context, Element element) {
        this.f72151a = zal0Var;
        this.f72161k = context;
        this.f72174x = element.getWidth();
        this.f72175y = element.getHeight();
        m99417m();
        if (element.getNew_anim() != null) {
            m99418n(element);
        } else {
            m99416l(element);
        }
    }

    @Override // p149l.wdl, p149l.s2m
    /* JADX INFO: renamed from: a */
    public void mo99405a(float f) {
        this.f72173w.f72178b = f;
    }

    @Override // p149l.wdl, p149l.s4m
    /* JADX INFO: renamed from: b */
    public void mo99406b(float f) {
        this.f72173w.f72180d = f;
    }

    @Override // p149l.wdl, p149l.s4m
    /* JADX INFO: renamed from: c */
    public void mo99407c(float f) {
        this.f72173w.f72179c = f;
    }

    @Override // p149l.wdl, p149l.iml
    /* JADX INFO: renamed from: d */
    public void mo99408d(float f) {
        this.f72173w.f72177a = f;
    }

    @Override // p149l.l2m
    /* JADX INFO: renamed from: e */
    public void mo99409e(float f) {
        this.f72173w.f72181e = f;
    }

    @Override // p149l.lzl
    /* JADX INFO: renamed from: f */
    public void mo99410f(ya60 ya60Var) {
        C15751a c15751a = this.f72173w;
        c15751a.f72179c = ya60Var.f197142a;
        c15751a.f72180d = ya60Var.f197143b;
    }

    /* JADX INFO: renamed from: g */
    public void m99411g() {
        synchronized (this.f72160j) {
            try {
                List<float[]> list = this.f72165o;
                if (list != null) {
                    list.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m99412h() {
        int i = this.f72167q;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f72167q = 0;
        }
        Bitmap bitmap = this.f72169s;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f72169s.recycle();
    }

    /* JADX INFO: renamed from: i */
    public Bitmap m99413i() {
        Bitmap bitmap = this.f72169s;
        if ((bitmap == null || bitmap.isRecycled()) && this.f72151a.m217735b() != null) {
            this.f72169s = this.f72151a.m217735b().mo19562a();
        }
        return this.f72169s;
    }

    /* JADX INFO: renamed from: j */
    public Object m99414j() {
        return this.f72160j;
    }

    /* JADX INFO: renamed from: k */
    public float m99415k() {
        zal0 zal0Var = this.f72151a;
        if (zal0Var != null) {
            return (zal0Var.m217734a() * 1.0f) / this.f72151a.m217736c();
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: l */
    public void m99416l(Element element) {
        float width = element.getWidth() / 0.5f;
        List<ElementAnimation> anim = element.getAnim();
        if (anim == null || anim.size() <= 0) {
            return;
        }
        this.f72171u = new vdl();
        ydl ydlVar = new ydl(this, new LinearInterpolator());
        ydlVar.m188138c(element.getDuration());
        zdl zdlVar = new zdl(this, new LinearInterpolator());
        zdlVar.m188138c(element.getDuration());
        xdl xdlVar = new xdl(this, new LinearInterpolator());
        xdlVar.m188138c(element.getDuration());
        sdl sdlVar = new sdl(this, new LinearInterpolator());
        sdlVar.m188138c(element.getDuration());
        int size = anim.size();
        int i = 0;
        while (true) {
            Interpolator interpolatorM99420p = null;
            if (i >= size) {
                int i2 = size - 1;
                ydlVar.m193144f(element.getDuration(), anim.get(i2).getX(), null);
                zdlVar.m193144f(element.getDuration(), anim.get(i2).getY(), null);
                xdlVar.m193144f(element.getDuration(), anim.get(i2).getScale() * width, null);
                sdlVar.m193144f(element.getDuration(), anim.get(i2).getAlpha(), null);
                this.f72171u.m198004a(ydlVar);
                this.f72171u.m198004a(zdlVar);
                this.f72171u.m198004a(xdlVar);
                this.f72171u.m198004a(sdlVar);
                return;
            }
            if (!TextUtils.isEmpty(anim.get(i).getInterpolator())) {
                interpolatorM99420p = m99420p(anim.get(i).getInterpolator());
            }
            ydlVar.m193144f(anim.get(i).getTime(), anim.get(i).getX(), interpolatorM99420p);
            zdlVar.m193144f(anim.get(i).getTime(), anim.get(i).getY(), interpolatorM99420p);
            xdlVar.m193144f(anim.get(i).getTime(), anim.get(i).getScale() * width, interpolatorM99420p);
            sdlVar.m193144f(anim.get(i).getTime(), anim.get(i).getAlpha(), interpolatorM99420p);
            i++;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m99417m() {
        float fM217734a = this.f72151a.m217734a() / this.f72151a.m217736c();
        this.f72152b = fM217734a;
        float[] fArr = {-0.5f, fM217734a * 0.5f, -0.5f, (-0.5f) * fM217734a, 0.5f, (-0.5f) * fM217734a, 0.5f, fM217734a * 0.5f};
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f72153c = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.f72153c.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        this.f72164n = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr);
        this.f72164n.position(0);
        float f = this.f72152b;
        this.f72154d = new float[]{-0.5f, f * 0.5f, 0.0f, 1.0f, -0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, f * 0.5f, 0.0f, 1.0f};
        Matrix.setIdentityM(this.f72155e, 0);
        this.f72155e[0] = -1.0f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:61:0x020a  */
    /* JADX INFO: renamed from: n */
    public void m99418n(Element element) {
        apf dpfVar;
        List<ElementNewAnimation> new_anim = element.getNew_anim();
        if (new_anim == null) {
            return;
        }
        float width = element.getWidth() / 0.5f;
        float f = element.vWidth;
        float f2 = element.vHeight;
        this.f72172v = new bpf();
        this.f72173w.f72178b *= width;
        for (ElementNewAnimation elementNewAnimation : new_anim) {
            if (!TextUtils.isEmpty(elementNewAnimation.getType())) {
                Interpolator interpolatorM99420p = m99420p(elementNewAnimation.getInterpolator());
                String type = elementNewAnimation.getType();
                type.getClass();
                int i = 3;
                switch (type) {
                    case "rotate":
                        dpfVar = new dpf(this, elementNewAnimation.getDegress(), elementNewAnimation.getToDegress(), interpolatorM99420p);
                        break;
                    case "path":
                        ib60 ib60Var = new ib60();
                        if (elementNewAnimation.getPoints() != null && elementNewAnimation.getPoints().size() > 0) {
                            List<PointSet> points = elementNewAnimation.getPoints();
                            if (points == null || points.size() == 0) {
                                dpfVar = null;
                            } else {
                                PointSet pointSet = points.get(0);
                                ib60Var.m135250d(pointSet.getPoint().get(0).floatValue() / f, 1.0f - (pointSet.getPoint().get(1).floatValue() / f2), m99420p(pointSet.getInterpolator()));
                                int i2 = 1;
                                while (i2 < elementNewAnimation.getPoints().size()) {
                                    PointSet pointSet2 = elementNewAnimation.getPoints().get(i2);
                                    List<Float> point = pointSet2.getPoint();
                                    Interpolator interpolatorM99420p2 = m99420p(pointSet2.getInterpolator());
                                    if (point.size() == 2) {
                                        ib60Var.m135249c(point.get(0).floatValue() / f, 1.0f - (point.get(1).floatValue() / f2), interpolatorM99420p2);
                                    } else if (point.size() == 4) {
                                        ib60Var.m135251e(point.get(0).floatValue() / f, 1.0f - (point.get(1).floatValue() / f2), point.get(2).floatValue() / f, 1.0f - (point.get(i).floatValue() / f2), interpolatorM99420p2);
                                    } else if (point.size() == 6) {
                                        ib60Var.m135247a(point.get(0).floatValue() / f, 1.0f - (point.get(1).floatValue() / f2), point.get(2).floatValue() / f, 1.0f - (point.get(i).floatValue() / f2), point.get(4).floatValue() / f, 1.0f - (point.get(5).floatValue() / f2), interpolatorM99420p2);
                                    }
                                    i2++;
                                    i = 3;
                                }
                            }
                            break;
                        }
                        dpfVar = cpf.m108127n(this, new ta60(), ib60Var.m135248b().toArray());
                        break;
                    case "alpha":
                        dpfVar = new zof(this, elementNewAnimation.getAlpha(), elementNewAnimation.getToAlpha(), interpolatorM99420p);
                        break;
                    case "scale":
                        dpfVar = new epf(this, elementNewAnimation.getScale() * width, elementNewAnimation.getToScale() * width, interpolatorM99420p);
                        break;
                    case "translate":
                        dpfVar = new fpf(this, elementNewAnimation.getX(), elementNewAnimation.getY(), elementNewAnimation.getToX(), elementNewAnimation.getToY(), interpolatorM99420p);
                        break;
                    default:
                        dpfVar = null;
                        break;
                }
                if (dpfVar != null) {
                    dpfVar.m98113e(elementNewAnimation.getDuration());
                    dpfVar.m98114f(elementNewAnimation.getStartDelay());
                    this.f72172v.m103054a(dpfVar);
                }
            }
        }
        this.f72172v.m103056c();
    }

    /* JADX INFO: renamed from: o */
    public void m99419o() {
        float f = this.f72173w.f72178b;
        C15751a c15751a = this.f72173w;
        m99422r(f, f, new PointF(c15751a.f72179c, c15751a.f72180d), this.f72173w.f72181e);
    }

    /* JADX INFO: renamed from: p */
    public Interpolator m99420p(String str) {
        String[] strArrSplit;
        if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(Constants.SEPARATOR_COMMA)) != null && strArrSplit.length >= 4) {
            try {
                return new fje(Float.valueOf(strArrSplit[0]).floatValue(), Float.valueOf(strArrSplit[1]).floatValue(), Float.valueOf(strArrSplit[2]).floatValue(), Float.valueOf(strArrSplit[3]).floatValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public void m99421q(InterfaceC15752b interfaceC15752b) {
        this.f72176z = interfaceC15752b;
    }

    /* JADX INFO: renamed from: r */
    public void m99422r(float f, float f2, PointF pointF, float f3) {
        if (pointF == null) {
            return;
        }
        float f4 = -((pointF.x * 2.0f) - 1.0f);
        float f5 = ((-pointF.y) * 2.0f) + 1.0f;
        float[] fArr = new float[16];
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, -f4, f5, 0.0f);
        Matrix.multiplyMM(fArr, 0, this.f72155e, 0, this.f72156f, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        Matrix.rotateM(fArr, 0, f3, 0.0f, 0.0f, 1.0f);
        Matrix.scaleM(fArr, 0, f * 1.0f, f2 * 1.0f, 1.0f);
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.f72154d, 0);
        this.f72165o.add(new float[]{fArr2[0], fArr2[1], fArr2[4], fArr2[5], fArr2[8], fArr2[9], fArr2[12], fArr2[13]});
    }

    /* JADX INFO: renamed from: s */
    public void m99423s(float f) {
        if (this.f72168r == -1) {
            this.f72168r = System.currentTimeMillis();
        }
        if (this.f72159i <= -1 || this.f72168r == -1 || System.currentTimeMillis() - this.f72168r <= this.f72159i) {
            vdl vdlVar = this.f72171u;
            if (vdlVar != null) {
                vdlVar.m198005b(f);
                return;
            }
            return;
        }
        m99411g();
        InterfaceC15752b interfaceC15752b = this.f72176z;
        if (interfaceC15752b != null) {
            interfaceC15752b.stickerRenderFinished();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m99424t(float[] fArr) {
        this.f72156f = fArr;
    }

    /* JADX INFO: renamed from: u */
    public void m99425u(long j) {
        this.f72162l = j;
        bpf bpfVar = this.f72172v;
        if (bpfVar != null) {
            bpfVar.m103055b(j);
        }
        m99419o();
    }
}
