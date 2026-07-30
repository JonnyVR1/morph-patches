package p153l;

import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.pipline.codec.MediaBaseCodecFilter;
import com.momo.pipline.meidautil.PipelineConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import project.android.imageprocessing.ext.C22417a;

/* JADX INFO: loaded from: classes8.dex */
public class rsy extends ogk {

    /* JADX INFO: renamed from: a */
    private C22417a f164743a;

    /* JADX INFO: renamed from: b */
    private C22417a f164744b;

    /* JADX INFO: renamed from: c */
    private C22417a f164745c;

    /* JADX INFO: renamed from: d */
    private hd2 f164746d;

    /* JADX INFO: renamed from: e */
    private hd2 f164747e;

    /* JADX INFO: renamed from: f */
    private x120 f164748f;

    /* JADX INFO: renamed from: l */
    float f164753l;

    /* JADX INFO: renamed from: m */
    float f164754m;

    /* JADX INFO: renamed from: g */
    private String f164749g = Logger.ROOT_LOGGER_NAME;

    /* JADX INFO: renamed from: i */
    private String f164750i = Logger.ROOT_LOGGER_NAME;

    /* JADX INFO: renamed from: j */
    private PipelineConcurrentHashMap<String, l6x> f164751j = new PipelineConcurrentHashMap<>();

    /* JADX INFO: renamed from: k */
    private List<zej> f164752k = new ArrayList();

    /* JADX INFO: renamed from: n */
    private boolean f164755n = false;

    /* JADX INFO: renamed from: o */
    private int f164756o = 0;

    /* JADX INFO: renamed from: p */
    boolean f164757p = false;

    /* JADX INFO: renamed from: q */
    private boolean f164758q = false;

    public rsy() {
        this.useCache = false;
        C22417a c22417a = new C22417a();
        this.f164744b = c22417a;
        c22417a.useCache = false;
        c22417a.m222534V1("mDefaultCutFilter");
        C22417a c22417a2 = new C22417a();
        this.f164743a = c22417a2;
        c22417a2.useCache = false;
        c22417a2.m222534V1("mCutFilter");
        C22417a c22417a3 = new C22417a();
        this.f164745c = c22417a3;
        c22417a3.m222534V1("mAgoraCutFilter");
        this.f164745c.useCache = false;
        hd2 hd2Var = new hd2();
        this.f164746d = hd2Var;
        hd2Var.useCache = false;
        hd2 hd2Var2 = new hd2();
        this.f164747e = hd2Var2;
        hd2Var2.useCache = false;
        registerInitialFilter(this.f164743a);
        registerFilter(this.f164744b);
        registerFilter(this.f164745c);
        registerFilter(this.f164747e);
        this.f164743a.addTarget(this.f164744b);
        x120 x120Var = new x120();
        this.f164748f = x120Var;
        x120Var.useCache = false;
        this.f164743a.addTarget(x120Var);
        this.f164743a.addTarget(this.f164745c);
        this.f164745c.addTarget(this.f164747e);
        registerFilter(this.f164748f);
        registerTerminalFilter(this.f164746d);
        this.f164748f.addTarget(this.f164746d);
        this.f164746d.addTarget(this);
        ehq0 ehq0Var = new ehq0();
        ehq0Var.f94062e = 0.5f;
        ehq0Var.f94063f = 0.5f;
        ehq0Var.f94060c = 0.5f;
        ehq0Var.f94061d = 0.5f;
        ehq0Var.f94064g = 0.0f;
        l6x l6xVar = new l6x(ehq0Var, this.f164743a);
        l6xVar.f130304j = this.f164743a;
        l6xVar.f130305k = this.f164744b;
        this.f164748f.m208902X1(l6xVar);
        this.f164751j.put(Logger.ROOT_LOGGER_NAME, l6xVar);
    }

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m183039Q1(dfj dfjVar) {
        try {
            if (dfjVar instanceof zej) {
                synchronized (this.f164752k) {
                    try {
                        if (!this.f164752k.contains(dfjVar)) {
                            this.f164752k.add((zej) dfjVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            b7y.m102882c().m102888g("addCameraTarget  target:" + dfjVar);
            if (this.f164743a != null) {
                if ((dfjVar instanceof MediaBaseCodecFilter) && (((MediaBaseCodecFilter) dfjVar).mo20658c1() == 1 || ((MediaBaseCodecFilter) dfjVar).mo20658c1() == 2 || ((MediaBaseCodecFilter) dfjVar).mo20658c1() == 3)) {
                    b7y.m102882c().m102888g("addCameraTarget  mAgoraCutFilter  width:" + ((MediaBaseCodecFilter) dfjVar).getFilter().m20728Z1().f175494m + ", height:" + ((MediaBaseCodecFilter) dfjVar).getFilter().m20728Z1().f175496n);
                    this.f164745c.setRenderSize(((MediaBaseCodecFilter) dfjVar).getFilter().m20728Z1().f175494m, ((MediaBaseCodecFilter) dfjVar).getFilter().m20728Z1().f175496n);
                    this.f164745c.reInitialize();
                    this.f164747e.removeTarget(dfjVar);
                    this.f164747e.addTarget(dfjVar);
                    u6y.m194722F().m194742U(((MediaBaseCodecFilter) dfjVar).getFilter().m20728Z1().f175494m, ((MediaBaseCodecFilter) dfjVar).getFilter().m20728Z1().f175496n);
                    this.f164743a.removeTarget(this.f164745c);
                    this.f164743a.addTarget(this.f164745c);
                } else {
                    this.f164743a.removeTarget(dfjVar);
                    this.f164743a.addTarget(dfjVar);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: R1 */
    public void m183040R1(gfj gfjVar, String str, g510 g510Var) {
        boolean z;
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "addInputRender:" + gfjVar.getClass().getSimpleName() + Constants.KEY_KEY + str);
        synchronized (getLockObject()) {
            try {
                gfjVar.setFilterKey(str);
                C22417a c22417a = new C22417a();
                gfjVar.addTarget(c22417a);
                ehq0 ehq0Var = new ehq0();
                Iterator<l6x> it = this.f164751j.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (it.next().f130304j == gfjVar) {
                        z = true;
                        break;
                    }
                }
                l6x l6xVar = new l6x(ehq0Var, gfjVar);
                l6xVar.f130304j = gfjVar;
                l6xVar.f130305k = c22417a;
                this.f164751j.put(str, l6xVar);
                if (!z) {
                    g510Var.m129002u();
                    g510Var.m128986N(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: S1 */
    public void m183041S1(MomoPipeline momoPipeline, uow uowVar, boolean z) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "changeRenderSize:width" + uowVar.f175510u + "height" + uowVar.f175508t);
        if (this.f164743a != null) {
            this.f164753l = uowVar.f175510u;
            this.f164754m = uowVar.f175511v;
            uowVar.f180161F0 = this.f164758q;
            l6x l6xVarM208898T1 = this.f164748f.m208898T1();
            boolean z2 = this.f164758q;
            x120 x120Var = this.f164748f;
            if (z2) {
                x120Var.m208901W1(1);
                l6xVarM208898T1.f130305k.setRenderSize(uowVar.f175511v, uowVar.f175510u);
                this.f164748f.setRenderSize(uowVar.f175511v, uowVar.f175510u);
            } else {
                x120Var.m208901W1(0);
                l6xVarM208898T1.f130305k.setRenderSize(uowVar.f175510u, uowVar.f175511v);
                this.f164748f.setRenderSize(uowVar.f175510u, uowVar.f175511v);
            }
            this.f164748f.reInitialize();
            synchronized (this.f164752k) {
                try {
                    for (zej zejVar : this.f164752k) {
                        zejVar.setRenderSize((int) this.f164753l, (int) this.f164754m);
                        zejVar.reInitialize();
                        if (this.f164745c != null) {
                            b7y.m102882c().m102888g("changeRenderSize mAgoraCutFilter landmode" + this.f164758q + ", width:" + uowVar.f175494m + ", height:" + uowVar.f175496n);
                            boolean z3 = this.f164758q;
                            C22417a c22417a = this.f164745c;
                            if (z3) {
                                c22417a.setRenderSize(uowVar.f175494m, uowVar.f175496n);
                                this.f164745c.resetClockDegrees();
                                this.f164745c.rotateCounterClockwise90Degrees(3);
                                this.f164745c.reInitialize();
                            } else {
                                c22417a.setRenderSize(uowVar.f175494m, uowVar.f175496n);
                                this.f164745c.resetClockDegrees();
                                this.f164745c.reInitialize();
                            }
                            hd2 hd2Var = this.f164746d;
                            if (hd2Var != null) {
                                hd2Var.m134569S1(uowVar.f175494m, uowVar.f175496n);
                            }
                            hd2 hd2Var2 = this.f164747e;
                            if (hd2Var2 != null) {
                                hd2Var2.m134569S1(uowVar.f175494m, uowVar.f175496n);
                            }
                            u6y.m194722F().m194742U(uowVar.f175494m, uowVar.f175496n);
                        }
                        if (zejVar instanceof MediaBaseCodecFilter) {
                            t9c.m189745c("zk", "resetCodecmRenderWidth" + this.f164753l + "/mRenderHeight" + this.f164754m);
                            momoPipeline.mo20692b0((MediaBaseCodecFilter) zejVar, uowVar);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: T1 */
    public void m183042T1(MomoPipeline momoPipeline, uow uowVar) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "changeRenderSize:width" + uowVar.f175510u + "height" + uowVar.f175508t);
        if (this.f164743a != null) {
            boolean z = this.f164758q;
            if (z) {
                this.f164753l = uowVar.f175511v;
                this.f164754m = uowVar.f175510u;
            } else {
                this.f164753l = uowVar.f175510u;
                this.f164754m = uowVar.f175511v;
            }
            uowVar.f180161F0 = z;
            l6x l6xVarM208898T1 = this.f164748f.m208898T1();
            boolean z2 = this.f164758q;
            x120 x120Var = this.f164748f;
            if (z2) {
                x120Var.m208901W1(1);
                l6xVarM208898T1.f130305k.setRenderSize(uowVar.f175510u, uowVar.f175511v);
                this.f164748f.setRenderSize(uowVar.f175510u, uowVar.f175511v);
            } else {
                x120Var.m208901W1(0);
                l6xVarM208898T1.f130305k.setRenderSize(uowVar.f175510u, uowVar.f175511v);
                this.f164748f.setRenderSize(uowVar.f175510u, uowVar.f175511v);
            }
            this.f164748f.reInitialize();
            synchronized (this.f164752k) {
                try {
                    for (zej zejVar : this.f164752k) {
                        zejVar.setRenderSize((int) this.f164753l, (int) this.f164754m);
                        zejVar.reInitialize();
                        if (this.f164745c != null) {
                            b7y.m102882c().m102888g("changeRenderSize mAgoraCutFilter landmode" + this.f164758q + ", width:" + uowVar.f175494m + ", height:" + uowVar.f175496n);
                            boolean z3 = this.f164758q;
                            C22417a c22417a = this.f164745c;
                            if (z3) {
                                c22417a.setRenderSize(uowVar.f175494m, uowVar.f175496n);
                                this.f164745c.resetClockDegrees();
                                this.f164745c.rotateCounterClockwise90Degrees(3);
                                this.f164745c.reInitialize();
                            } else {
                                c22417a.setRenderSize(uowVar.f175494m, uowVar.f175496n);
                                this.f164745c.resetClockDegrees();
                                this.f164745c.reInitialize();
                            }
                            hd2 hd2Var = this.f164746d;
                            if (hd2Var != null) {
                                hd2Var.m134569S1(uowVar.f175494m, uowVar.f175496n);
                            }
                            hd2 hd2Var2 = this.f164747e;
                            if (hd2Var2 != null) {
                                hd2Var2.m134569S1(uowVar.f175494m, uowVar.f175496n);
                            }
                            u6y.m194722F().m194742U(uowVar.f175494m, uowVar.f175496n);
                        }
                        if (zejVar instanceof MediaBaseCodecFilter) {
                            t9c.m189745c("zk", "resetCodecmRenderWidth" + this.f164753l + "/mRenderHeight" + this.f164754m);
                            momoPipeline.mo20692b0((MediaBaseCodecFilter) zejVar, uowVar);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: U1 */
    public void m183043U1(uow uowVar) {
        synchronized (this.f164752k) {
            try {
                for (zej zejVar : this.f164752k) {
                    if (!(zejVar instanceof MediaBaseCodecFilter)) {
                        zejVar.setRenderSize(uowVar.f175510u, uowVar.f175511v);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: V1 */
    public void m183044V1(MomoPipeline momoPipeline, uow uowVar) {
        synchronized (this.f164752k) {
            try {
                for (zej zejVar : this.f164752k) {
                    if (!(zejVar instanceof MediaBaseCodecFilter)) {
                        zejVar.setRenderSize(uowVar.f175510u, uowVar.f175511v);
                        u6y.m194722F().m194775n0(uowVar.f175510u, uowVar.f175511v);
                        zejVar.reInitialize();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: W1 */
    public void m183045W1(MomoPipeline momoPipeline, uow uowVar) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "changeRenderSize:width" + uowVar.f175510u + "height" + uowVar.f175508t);
        if (this.width <= 0 || this.height <= 0) {
            return;
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "setMergeFilterRenderSize:width" + this.width + "height" + this.height);
        setRenderSize(uowVar.f175510u, uowVar.f175511v);
        synchronized (this.f164752k) {
            try {
                for (zej zejVar : this.f164752k) {
                    if (!(zejVar instanceof MediaBaseCodecFilter)) {
                        zejVar.setRenderSize(uowVar.f175510u, uowVar.f175511v);
                        zejVar.reInitialize();
                    }
                    if (this.f164745c != null) {
                        b7y.m102882c().m102888g("changeRenderSizePushSize  mAgoraCutFilter  width:" + uowVar.f175494m + ", height:" + uowVar.f175496n);
                        this.f164745c.setRenderSize(uowVar.f175494m, uowVar.f175496n);
                        u6y.m194722F().m194742U(uowVar.f175494m, uowVar.f175496n);
                        this.f164745c.reInitialize();
                    }
                    hd2 hd2Var = this.f164746d;
                    if (hd2Var != null) {
                        hd2Var.m134569S1(uowVar.f175494m, uowVar.f175496n);
                    }
                    hd2 hd2Var2 = this.f164747e;
                    if (hd2Var2 != null) {
                        hd2Var2.m134569S1(uowVar.f175494m, uowVar.f175496n);
                    }
                    if (zejVar instanceof MediaBaseCodecFilter) {
                        t9c.m189745c("zk", "resetCodecmRenderWidth" + this.f164753l + "/mRenderHeight" + this.f164754m);
                        zejVar.setDisplayMode(uowVar.f175511v, uowVar.f175510u, 0);
                        zejVar.setRenderSize(uowVar.f175494m, uowVar.f175496n);
                        zejVar.reInitialize();
                        momoPipeline.mo20692b0((MediaBaseCodecFilter) zejVar, uowVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: X1 */
    public void m183046X1() {
        x120 x120Var = this.f164748f;
        if (x120Var != null) {
            x120Var.m208896R1();
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public l6x m183047Y1(gfj gfjVar) {
        l6x l6xVar = this.f164751j.get(gfjVar.getFilterKey());
        x120 x120Var = this.f164748f;
        if (x120Var != null) {
            x120Var.m208900V1(l6xVar);
        }
        this.f164751j.remove(gfjVar.getFilterKey());
        return l6xVar;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m183048Z1(int i, int i2) {
        if (this.f164743a != null) {
            this.f164755n = true;
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "setCameraCutSize:width" + i + "height" + i2);
            b7y.m102882c().m102888g("setCameraCutSize  mCutFilter width:" + i + ", height:" + i2 + "hasSetCameraSetSize:" + this.f164755n);
            this.f164743a.setRenderSize(i, i2);
        }
    }

    /* JADX INFO: renamed from: a2 */
    public void m183049a2(boolean z, MomoPipeline momoPipeline, uow uowVar) {
        b7y.m102882c().m102888g("setLandMode", Boolean.valueOf(z));
        this.f164758q = z;
    }

    @Override // p153l.gfj
    public synchronized void addTarget(dfj dfjVar) {
        super.removeTarget(dfjVar);
        super.addTarget(dfjVar);
        if (dfjVar instanceof zej) {
            synchronized (this.f164752k) {
                try {
                    if (!this.f164752k.contains(dfjVar)) {
                        this.f164752k.add((zej) dfjVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b2 */
    public void m183050b2(int i, int i2, boolean z) {
        this.f164756o = 1;
        float f = i / i2;
        this.f164757p = f > 0.9f && f <= 1.0f;
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "setMergeFilterRenderSize:width" + i + "height" + i2);
        if (z) {
            setRenderSize(i, i2);
        }
        synchronized (this.f164752k) {
            try {
                for (zej zejVar : this.f164752k) {
                    if (!(zejVar instanceof MediaBaseCodecFilter)) {
                        zejVar.setRenderSize(i, i2);
                        zejVar.reInitialize();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c2 */
    public void m183051c2(gfj gfjVar, int i, int i2, String str, float f, float f2, float f3, float f4, float f5, int i3) {
        synchronized (getLockObject()) {
            try {
                int i4 = (int) (this.f164753l * f);
                int i5 = (int) (this.f164754m * f2);
                float f6 = i4;
                float f7 = i5;
                float f8 = f * 2.0f;
                ehq0 ehq0Var = new ehq0();
                ehq0Var.f94060c = f3 + (f / 2.0f);
                ehq0Var.f94061d = f4 + (f2 / 2.0f);
                ehq0Var.f94062e = f8;
                ehq0Var.f94063f = f8;
                ehq0Var.f94064g = f5;
                l6x l6xVar = this.f164751j.get(str);
                if (l6xVar != null) {
                    if (l6xVar.f130305k.getWidth() > 0) {
                        ehq0Var.f94058a = i;
                        ehq0Var.f94059b = i2;
                    } else {
                        ehq0Var.f94058a = i;
                        ehq0Var.f94059b = i2;
                    }
                    Log.e("Pipeline_Normal_pip->PIPLINE", "setPosition:" + i4 + ", yReal:" + i5 + ", position.inputWidth:" + ehq0Var.f94058a + ", position.inputHeight:" + ehq0Var.f94059b);
                    gfj gfjVar2 = l6xVar.f130305k;
                    if (gfjVar2 != null) {
                        gfjVar2.setRenderSize(i, i2);
                        l6xVar.f130305k.reInitialize();
                        if (i3 == 1) {
                            l6xVar.f130305k.setRenderSize(i4, i5);
                            l6xVar.f130305k.reInitialize();
                            ehq0Var.f94058a = f6;
                            ehq0Var.f94059b = f7;
                        }
                        gfj gfjVar3 = l6xVar.f130305k;
                        if (gfjVar3 instanceof C22417a) {
                            ((C22417a) gfjVar3).m222533U1(i3);
                        }
                    }
                    l6xVar.m153109d(ehq0Var);
                    this.f164748f.m208895Q1(l6xVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.ogk, p153l.gfj, p153l.wej
    public synchronized void destroy() {
        try {
            super.destroy();
            x120 x120Var = this.f164748f;
            if (x120Var != null) {
                x120Var.destroy();
                this.f164748f = null;
            }
            C22417a c22417a = this.f164743a;
            if (c22417a != null) {
                c22417a.destroy();
                this.f164743a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.ogk, p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        super.newTextureReady(i, gfjVar, z);
        if (gfjVar instanceof u94) {
            u6y.m194722F().m194737P();
        }
    }

    @Override // p153l.gfj
    public void removeTarget(dfj dfjVar) {
        super.removeTarget(dfjVar);
        if (dfjVar instanceof zej) {
            synchronized (this.f164752k) {
                try {
                    if (this.f164752k.contains(dfjVar)) {
                        this.f164752k.remove(dfjVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (this.f164743a != null) {
            if (dfjVar instanceof MediaBaseCodecFilter) {
                MediaBaseCodecFilter mediaBaseCodecFilter = (MediaBaseCodecFilter) dfjVar;
                if (mediaBaseCodecFilter.mo20658c1() == 1 || mediaBaseCodecFilter.mo20658c1() == 2 || mediaBaseCodecFilter.mo20658c1() == 3) {
                    this.f164745c.removeTarget(dfjVar);
                    return;
                }
            }
            this.f164743a.removeTarget(dfjVar);
        }
    }

    @Override // p153l.ogk, p153l.wej
    public void setRenderSize(int i, int i2) {
        if (this.f164744b != null) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "setRenderSize:width" + i + "height" + i2 + "hasSetCameraSetSize:" + this.f164755n);
            this.f164753l = i;
            this.f164754m = i2;
            this.f164744b.setRenderSize(i, i2);
            b7y.m102882c().m102888g("setRenderSize mDefaultCutFilter  width:" + i + ", height:" + i2, "threadInfo:" + htx.m137101a() + "hasSetCameraSetSize:" + this.f164755n);
            if (!this.f164755n) {
                int i3 = this.f164756o;
                if (i3 == 1) {
                    this.f164743a.m222533U1(i3);
                }
                b7y.m102882c().m102888g("setRenderSize mCutFilter  width:" + i + ", height:" + i2 + ",threadInfo:" + htx.m137101a());
                this.f164743a.setRenderSize(i, i2);
                u6y.m194722F().m194753c0(this.f164756o);
            }
            this.f164748f.setRenderSize(i, i2);
        }
    }
}
