package p153l;

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
public class k5g0 implements mgl, uol, i7m, l5m, e5m, f2m {

    /* JADX INFO: renamed from: a */
    public dkl0 f124024a;

    /* JADX INFO: renamed from: b */
    public float f124025b;

    /* JADX INFO: renamed from: c */
    public FloatBuffer f124026c;

    /* JADX INFO: renamed from: d */
    public float[] f124027d;

    /* JADX INFO: renamed from: f */
    protected float[] f124029f;

    /* JADX INFO: renamed from: k */
    protected Context f124034k;

    /* JADX INFO: renamed from: m */
    public FloatBuffer f124036m;

    /* JADX INFO: renamed from: n */
    public FloatBuffer f124037n;

    /* JADX INFO: renamed from: s */
    private Bitmap f124042s;

    /* JADX INFO: renamed from: t */
    public boolean f124043t;

    /* JADX INFO: renamed from: u */
    private lgl f124044u;

    /* JADX INFO: renamed from: v */
    private iqf f124045v;

    /* JADX INFO: renamed from: x */
    private float f124047x;

    /* JADX INFO: renamed from: y */
    private float f124048y;

    /* JADX INFO: renamed from: z */
    private InterfaceC18102b f124049z;

    /* JADX INFO: renamed from: e */
    public final float[] f124028e = new float[16];

    /* JADX INFO: renamed from: g */
    public float f124030g = 0.0f;

    /* JADX INFO: renamed from: h */
    public float f124031h = 0.0f;

    /* JADX INFO: renamed from: i */
    public long f124032i = -1;

    /* JADX INFO: renamed from: j */
    public Object f124033j = new Object();

    /* JADX INFO: renamed from: l */
    long f124035l = -1;

    /* JADX INFO: renamed from: o */
    public List<float[]> f124038o = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: p */
    public boolean f124039p = false;

    /* JADX INFO: renamed from: q */
    public int f124040q = 0;

    /* JADX INFO: renamed from: r */
    private long f124041r = -1;

    /* JADX INFO: renamed from: w */
    public C18101a f124046w = new C18101a();

    /* JADX INFO: renamed from: l.k5g0$a */
    public class C18101a {

        /* JADX INFO: renamed from: a */
        float f124050a = 1.0f;

        /* JADX INFO: renamed from: b */
        float f124051b = 1.0f;

        /* JADX INFO: renamed from: c */
        float f124052c = -0.5f;

        /* JADX INFO: renamed from: d */
        float f124053d = -0.5f;

        /* JADX INFO: renamed from: e */
        float f124054e = 0.0f;

        public C18101a() {
        }

        public String toString() {
            return "Params{alpha=" + this.f124050a + ", scale=" + this.f124051b + ", x=" + this.f124052c + ", y=" + this.f124053d + ", degress=" + this.f124054e + '}';
        }
    }

    /* JADX INFO: renamed from: l.k5g0$b */
    public interface InterfaceC18102b {
        void stickerRenderFinished();
    }

    public k5g0(dkl0 dkl0Var, Context context, Element element) {
        this.f124024a = dkl0Var;
        this.f124034k = context;
        this.f124047x = element.getWidth();
        this.f124048y = element.getHeight();
        m148371m();
        if (element.getNew_anim() != null) {
            m148372n(element);
        } else {
            m148370l(element);
        }
    }

    @Override // p153l.mgl, p153l.l5m
    /* JADX INFO: renamed from: a */
    public void mo148363a(float f) {
        this.f124046w.f124051b = f;
    }

    @Override // p153l.mgl, p153l.i7m
    /* JADX INFO: renamed from: b */
    public void mo138964b(float f) {
        this.f124046w.f124053d = f;
    }

    @Override // p153l.mgl, p153l.i7m
    /* JADX INFO: renamed from: c */
    public void mo138965c(float f) {
        this.f124046w.f124052c = f;
    }

    @Override // p153l.mgl, p153l.uol
    /* JADX INFO: renamed from: d */
    public void mo148364d(float f) {
        this.f124046w.f124050a = f;
    }

    @Override // p153l.e5m
    /* JADX INFO: renamed from: e */
    public void mo119547e(float f) {
        this.f124046w.f124054e = f;
    }

    @Override // p153l.f2m
    /* JADX INFO: renamed from: f */
    public void mo123630f(dj60 dj60Var) {
        C18101a c18101a = this.f124046w;
        c18101a.f124052c = dj60Var.f88782a;
        c18101a.f124053d = dj60Var.f88783b;
    }

    /* JADX INFO: renamed from: g */
    public void m148365g() {
        synchronized (this.f124033j) {
            try {
                List<float[]> list = this.f124038o;
                if (list != null) {
                    list.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m148366h() {
        int i = this.f124040q;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f124040q = 0;
        }
        Bitmap bitmap = this.f124042s;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f124042s.recycle();
    }

    /* JADX INFO: renamed from: i */
    public Bitmap m148367i() {
        Bitmap bitmap = this.f124042s;
        if ((bitmap == null || bitmap.isRecycled()) && this.f124024a.m116665b() != null) {
            this.f124042s = this.f124024a.m116665b().mo20561a();
        }
        return this.f124042s;
    }

    /* JADX INFO: renamed from: j */
    public Object m148368j() {
        return this.f124033j;
    }

    /* JADX INFO: renamed from: k */
    public float m148369k() {
        dkl0 dkl0Var = this.f124024a;
        if (dkl0Var != null) {
            return (dkl0Var.m116664a() * 1.0f) / this.f124024a.m116666c();
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: l */
    public void m148370l(Element element) {
        float width = element.getWidth() / 0.5f;
        List<ElementAnimation> anim = element.getAnim();
        if (anim == null || anim.size() <= 0) {
            return;
        }
        this.f124044u = new lgl();
        ogl oglVar = new ogl(this, new LinearInterpolator());
        oglVar.m144789c(element.getDuration());
        pgl pglVar = new pgl(this, new LinearInterpolator());
        pglVar.m144789c(element.getDuration());
        ngl nglVar = new ngl(this, new LinearInterpolator());
        nglVar.m144789c(element.getDuration());
        igl iglVar = new igl(this, new LinearInterpolator());
        iglVar.m144789c(element.getDuration());
        int size = anim.size();
        int i = 0;
        while (true) {
            Interpolator interpolatorM148374p = null;
            if (i >= size) {
                int i2 = size - 1;
                oglVar.m149755f(element.getDuration(), anim.get(i2).getX(), null);
                pglVar.m149755f(element.getDuration(), anim.get(i2).getY(), null);
                nglVar.m149755f(element.getDuration(), anim.get(i2).getScale() * width, null);
                iglVar.m149755f(element.getDuration(), anim.get(i2).getAlpha(), null);
                this.f124044u.m154074a(oglVar);
                this.f124044u.m154074a(pglVar);
                this.f124044u.m154074a(nglVar);
                this.f124044u.m154074a(iglVar);
                return;
            }
            if (!TextUtils.isEmpty(anim.get(i).getInterpolator())) {
                interpolatorM148374p = m148374p(anim.get(i).getInterpolator());
            }
            oglVar.m149755f(anim.get(i).getTime(), anim.get(i).getX(), interpolatorM148374p);
            pglVar.m149755f(anim.get(i).getTime(), anim.get(i).getY(), interpolatorM148374p);
            nglVar.m149755f(anim.get(i).getTime(), anim.get(i).getScale() * width, interpolatorM148374p);
            iglVar.m149755f(anim.get(i).getTime(), anim.get(i).getAlpha(), interpolatorM148374p);
            i++;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m148371m() {
        float fM116664a = this.f124024a.m116664a() / this.f124024a.m116666c();
        this.f124025b = fM116664a;
        float[] fArr = {-0.5f, fM116664a * 0.5f, -0.5f, (-0.5f) * fM116664a, 0.5f, (-0.5f) * fM116664a, 0.5f, fM116664a * 0.5f};
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f124026c = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.f124026c.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        this.f124037n = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr);
        this.f124037n.position(0);
        float f = this.f124025b;
        this.f124027d = new float[]{-0.5f, f * 0.5f, 0.0f, 1.0f, -0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, f * 0.5f, 0.0f, 1.0f};
        Matrix.setIdentityM(this.f124028e, 0);
        this.f124028e[0] = -1.0f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:61:0x020a  */
    /* JADX INFO: renamed from: n */
    public void m148372n(Element element) {
        hqf kqfVar;
        List<ElementNewAnimation> new_anim = element.getNew_anim();
        if (new_anim == null) {
            return;
        }
        float width = element.getWidth() / 0.5f;
        float f = element.vWidth;
        float f2 = element.vHeight;
        this.f124045v = new iqf();
        this.f124046w.f124051b *= width;
        for (ElementNewAnimation elementNewAnimation : new_anim) {
            if (!TextUtils.isEmpty(elementNewAnimation.getType())) {
                Interpolator interpolatorM148374p = m148374p(elementNewAnimation.getInterpolator());
                String type = elementNewAnimation.getType();
                type.getClass();
                int i = 3;
                switch (type) {
                    case "rotate":
                        kqfVar = new kqf(this, elementNewAnimation.getDegress(), elementNewAnimation.getToDegress(), interpolatorM148374p);
                        break;
                    case "path":
                        nj60 nj60Var = new nj60();
                        if (elementNewAnimation.getPoints() != null && elementNewAnimation.getPoints().size() > 0) {
                            List<PointSet> points = elementNewAnimation.getPoints();
                            if (points == null || points.size() == 0) {
                                kqfVar = null;
                            } else {
                                PointSet pointSet = points.get(0);
                                nj60Var.m163407d(pointSet.getPoint().get(0).floatValue() / f, 1.0f - (pointSet.getPoint().get(1).floatValue() / f2), m148374p(pointSet.getInterpolator()));
                                int i2 = 1;
                                while (i2 < elementNewAnimation.getPoints().size()) {
                                    PointSet pointSet2 = elementNewAnimation.getPoints().get(i2);
                                    List<Float> point = pointSet2.getPoint();
                                    Interpolator interpolatorM148374p2 = m148374p(pointSet2.getInterpolator());
                                    if (point.size() == 2) {
                                        nj60Var.m163406c(point.get(0).floatValue() / f, 1.0f - (point.get(1).floatValue() / f2), interpolatorM148374p2);
                                    } else if (point.size() == 4) {
                                        nj60Var.m163408e(point.get(0).floatValue() / f, 1.0f - (point.get(1).floatValue() / f2), point.get(2).floatValue() / f, 1.0f - (point.get(i).floatValue() / f2), interpolatorM148374p2);
                                    } else if (point.size() == 6) {
                                        nj60Var.m163404a(point.get(0).floatValue() / f, 1.0f - (point.get(1).floatValue() / f2), point.get(2).floatValue() / f, 1.0f - (point.get(i).floatValue() / f2), point.get(4).floatValue() / f, 1.0f - (point.get(5).floatValue() / f2), interpolatorM148374p2);
                                    }
                                    i2++;
                                    i = 3;
                                }
                            }
                            break;
                        }
                        kqfVar = jqf.m146571n(this, new yi60(), nj60Var.m163405b().toArray());
                        break;
                    case "alpha":
                        kqfVar = new gqf(this, elementNewAnimation.getAlpha(), elementNewAnimation.getToAlpha(), interpolatorM148374p);
                        break;
                    case "scale":
                        kqfVar = new lqf(this, elementNewAnimation.getScale() * width, elementNewAnimation.getToScale() * width, interpolatorM148374p);
                        break;
                    case "translate":
                        kqfVar = new mqf(this, elementNewAnimation.getX(), elementNewAnimation.getY(), elementNewAnimation.getToX(), elementNewAnimation.getToY(), interpolatorM148374p);
                        break;
                    default:
                        kqfVar = null;
                        break;
                }
                if (kqfVar != null) {
                    kqfVar.m136622e(elementNewAnimation.getDuration());
                    kqfVar.m136623f(elementNewAnimation.getStartDelay());
                    this.f124045v.m141669a(kqfVar);
                }
            }
        }
        this.f124045v.m141671c();
    }

    /* JADX INFO: renamed from: o */
    public void m148373o() {
        float f = this.f124046w.f124051b;
        C18101a c18101a = this.f124046w;
        m148376r(f, f, new PointF(c18101a.f124052c, c18101a.f124053d), this.f124046w.f124054e);
    }

    /* JADX INFO: renamed from: p */
    public Interpolator m148374p(String str) {
        String[] strArrSplit;
        if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(Constants.SEPARATOR_COMMA)) != null && strArrSplit.length >= 4) {
            try {
                return new jke(Float.valueOf(strArrSplit[0]).floatValue(), Float.valueOf(strArrSplit[1]).floatValue(), Float.valueOf(strArrSplit[2]).floatValue(), Float.valueOf(strArrSplit[3]).floatValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public void m148375q(InterfaceC18102b interfaceC18102b) {
        this.f124049z = interfaceC18102b;
    }

    /* JADX INFO: renamed from: r */
    public void m148376r(float f, float f2, PointF pointF, float f3) {
        if (pointF == null) {
            return;
        }
        float f4 = -((pointF.x * 2.0f) - 1.0f);
        float f5 = ((-pointF.y) * 2.0f) + 1.0f;
        float[] fArr = new float[16];
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, -f4, f5, 0.0f);
        Matrix.multiplyMM(fArr, 0, this.f124028e, 0, this.f124029f, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        Matrix.rotateM(fArr, 0, f3, 0.0f, 0.0f, 1.0f);
        Matrix.scaleM(fArr, 0, f * 1.0f, f2 * 1.0f, 1.0f);
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.f124027d, 0);
        this.f124038o.add(new float[]{fArr2[0], fArr2[1], fArr2[4], fArr2[5], fArr2[8], fArr2[9], fArr2[12], fArr2[13]});
    }

    /* JADX INFO: renamed from: s */
    public void m148377s(float f) {
        if (this.f124041r == -1) {
            this.f124041r = System.currentTimeMillis();
        }
        if (this.f124032i <= -1 || this.f124041r == -1 || System.currentTimeMillis() - this.f124041r <= this.f124032i) {
            lgl lglVar = this.f124044u;
            if (lglVar != null) {
                lglVar.m154075b(f);
                return;
            }
            return;
        }
        m148365g();
        InterfaceC18102b interfaceC18102b = this.f124049z;
        if (interfaceC18102b != null) {
            interfaceC18102b.stickerRenderFinished();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m148378t(float[] fArr) {
        this.f124029f = fArr;
    }

    /* JADX INFO: renamed from: u */
    public void m148379u(long j) {
        this.f124035l = j;
        iqf iqfVar = this.f124045v;
        if (iqfVar != null) {
            iqfVar.m141670b(j);
        }
        m148373o();
    }
}
