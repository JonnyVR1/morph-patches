package p149l;

import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.pipline.codec.MediaBaseCodecFilter;
import com.momo.pipline.meidautil.PipelineConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import project.android.imageprocessing.ext.C22302a;

/* JADX INFO: loaded from: classes6.dex */
public class ujy extends ydk {

    /* JADX INFO: renamed from: a */
    private C22302a f176875a;

    /* JADX INFO: renamed from: b */
    private C22302a f176876b;

    /* JADX INFO: renamed from: c */
    private C22302a f176877c;

    /* JADX INFO: renamed from: d */
    private ad2 f176878d;

    /* JADX INFO: renamed from: e */
    private ad2 f176879e;

    /* JADX INFO: renamed from: f */
    private pt10 f176880f;

    /* JADX INFO: renamed from: l */
    float f176885l;

    /* JADX INFO: renamed from: m */
    float f176886m;

    /* JADX INFO: renamed from: g */
    private String f176881g = Logger.ROOT_LOGGER_NAME;

    /* JADX INFO: renamed from: i */
    private String f176882i = Logger.ROOT_LOGGER_NAME;

    /* JADX INFO: renamed from: j */
    private PipelineConcurrentHashMap<String, m3x> f176883j = new PipelineConcurrentHashMap<>();

    /* JADX INFO: renamed from: k */
    private List<fcj> f176884k = new ArrayList();

    /* JADX INFO: renamed from: n */
    private boolean f176887n = false;

    /* JADX INFO: renamed from: o */
    private int f176888o = 0;

    /* JADX INFO: renamed from: p */
    boolean f176889p = false;

    /* JADX INFO: renamed from: q */
    private boolean f176890q = false;

    public ujy() {
        this.useCache = false;
        C22302a c22302a = new C22302a();
        this.f176876b = c22302a;
        c22302a.useCache = false;
        c22302a.m221288V1("mDefaultCutFilter");
        C22302a c22302a2 = new C22302a();
        this.f176875a = c22302a2;
        c22302a2.useCache = false;
        c22302a2.m221288V1("mCutFilter");
        C22302a c22302a3 = new C22302a();
        this.f176877c = c22302a3;
        c22302a3.m221288V1("mAgoraCutFilter");
        this.f176877c.useCache = false;
        ad2 ad2Var = new ad2();
        this.f176878d = ad2Var;
        ad2Var.useCache = false;
        ad2 ad2Var2 = new ad2();
        this.f176879e = ad2Var2;
        ad2Var2.useCache = false;
        registerInitialFilter(this.f176875a);
        registerFilter(this.f176876b);
        registerFilter(this.f176877c);
        registerFilter(this.f176879e);
        this.f176875a.addTarget(this.f176876b);
        pt10 pt10Var = new pt10();
        this.f176880f = pt10Var;
        pt10Var.useCache = false;
        this.f176875a.addTarget(pt10Var);
        this.f176875a.addTarget(this.f176877c);
        this.f176877c.addTarget(this.f176879e);
        registerFilter(this.f176880f);
        registerTerminalFilter(this.f176878d);
        this.f176880f.addTarget(this.f176878d);
        this.f176878d.addTarget(this);
        z7q0 z7q0Var = new z7q0();
        z7q0Var.f202052e = 0.5f;
        z7q0Var.f202053f = 0.5f;
        z7q0Var.f202050c = 0.5f;
        z7q0Var.f202051d = 0.5f;
        z7q0Var.f202054g = 0.0f;
        m3x m3xVar = new m3x(z7q0Var, this.f176875a);
        m3xVar.f131200j = this.f176875a;
        m3xVar.f131201k = this.f176876b;
        this.f176880f.m171266X1(m3xVar);
        this.f176883j.put(Logger.ROOT_LOGGER_NAME, m3xVar);
    }

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m194134Q1(jcj jcjVar) {
        try {
            if (jcjVar instanceof fcj) {
                synchronized (this.f176884k) {
                    try {
                        if (!this.f176884k.contains(jcjVar)) {
                            this.f176884k.add((fcj) jcjVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            eyx.m118802c().m118808g("addCameraTarget  target:" + jcjVar);
            if (this.f176875a != null) {
                if ((jcjVar instanceof MediaBaseCodecFilter) && (((MediaBaseCodecFilter) jcjVar).mo19659c1() == 1 || ((MediaBaseCodecFilter) jcjVar).mo19659c1() == 2 || ((MediaBaseCodecFilter) jcjVar).mo19659c1() == 3)) {
                    eyx.m118802c().m118808g("addCameraTarget  mAgoraCutFilter  width:" + ((MediaBaseCodecFilter) jcjVar).getFilter().m19729Z1().f177152m + ", height:" + ((MediaBaseCodecFilter) jcjVar).getFilter().m19729Z1().f177154n);
                    this.f176877c.setRenderSize(((MediaBaseCodecFilter) jcjVar).getFilter().m19729Z1().f177152m, ((MediaBaseCodecFilter) jcjVar).getFilter().m19729Z1().f177154n);
                    this.f176877c.reInitialize();
                    this.f176879e.removeTarget(jcjVar);
                    this.f176879e.addTarget(jcjVar);
                    xxx.m211572F().m211592U(((MediaBaseCodecFilter) jcjVar).getFilter().m19729Z1().f177152m, ((MediaBaseCodecFilter) jcjVar).getFilter().m19729Z1().f177154n);
                    this.f176875a.removeTarget(this.f176877c);
                    this.f176875a.addTarget(this.f176877c);
                } else {
                    this.f176875a.removeTarget(jcjVar);
                    this.f176875a.addTarget(jcjVar);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: R1 */
    public void m194135R1(mcj mcjVar, String str, yw00 yw00Var) {
        boolean z;
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "addInputRender:" + mcjVar.getClass().getSimpleName() + Constants.KEY_KEY + str);
        synchronized (getLockObject()) {
            try {
                mcjVar.setFilterKey(str);
                C22302a c22302a = new C22302a();
                mcjVar.addTarget(c22302a);
                z7q0 z7q0Var = new z7q0();
                Iterator<m3x> it = this.f176883j.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (it.next().f131200j == mcjVar) {
                        z = true;
                        break;
                    }
                }
                m3x m3xVar = new m3x(z7q0Var, mcjVar);
                m3xVar.f131200j = mcjVar;
                m3xVar.f131201k = c22302a;
                this.f176883j.put(str, m3xVar);
                if (!z) {
                    yw00Var.m216287u();
                    yw00Var.m216271N(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: S1 */
    public void m194136S1(MomoPipeline momoPipeline, vlw vlwVar, boolean z) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "changeRenderSize:width" + vlwVar.f177168u + "height" + vlwVar.f177166t);
        if (this.f176875a != null) {
            this.f176885l = vlwVar.f177168u;
            this.f176886m = vlwVar.f177169v;
            vlwVar.f182017F0 = this.f176890q;
            m3x m3xVarM171262T1 = this.f176880f.m171262T1();
            boolean z2 = this.f176890q;
            pt10 pt10Var = this.f176880f;
            if (z2) {
                pt10Var.m171265W1(1);
                m3xVarM171262T1.f131201k.setRenderSize(vlwVar.f177169v, vlwVar.f177168u);
                this.f176880f.setRenderSize(vlwVar.f177169v, vlwVar.f177168u);
            } else {
                pt10Var.m171265W1(0);
                m3xVarM171262T1.f131201k.setRenderSize(vlwVar.f177168u, vlwVar.f177169v);
                this.f176880f.setRenderSize(vlwVar.f177168u, vlwVar.f177169v);
            }
            this.f176880f.reInitialize();
            synchronized (this.f176884k) {
                try {
                    for (fcj fcjVar : this.f176884k) {
                        fcjVar.setRenderSize((int) this.f176885l, (int) this.f176886m);
                        fcjVar.reInitialize();
                        if (this.f176877c != null) {
                            eyx.m118802c().m118808g("changeRenderSize mAgoraCutFilter landmode" + this.f176890q + ", width:" + vlwVar.f177152m + ", height:" + vlwVar.f177154n);
                            boolean z3 = this.f176890q;
                            C22302a c22302a = this.f176877c;
                            if (z3) {
                                c22302a.setRenderSize(vlwVar.f177152m, vlwVar.f177154n);
                                this.f176877c.resetClockDegrees();
                                this.f176877c.rotateCounterClockwise90Degrees(3);
                                this.f176877c.reInitialize();
                            } else {
                                c22302a.setRenderSize(vlwVar.f177152m, vlwVar.f177154n);
                                this.f176877c.resetClockDegrees();
                                this.f176877c.reInitialize();
                            }
                            ad2 ad2Var = this.f176878d;
                            if (ad2Var != null) {
                                ad2Var.m95852S1(vlwVar.f177152m, vlwVar.f177154n);
                            }
                            ad2 ad2Var2 = this.f176879e;
                            if (ad2Var2 != null) {
                                ad2Var2.m95852S1(vlwVar.f177152m, vlwVar.f177154n);
                            }
                            xxx.m211572F().m211592U(vlwVar.f177152m, vlwVar.f177154n);
                        }
                        if (fcjVar instanceof MediaBaseCodecFilter) {
                            n8c.m158485c("zk", "resetCodecmRenderWidth" + this.f176885l + "/mRenderHeight" + this.f176886m);
                            momoPipeline.mo19693b0((MediaBaseCodecFilter) fcjVar, vlwVar);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: T1 */
    public void m194137T1(MomoPipeline momoPipeline, vlw vlwVar) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "changeRenderSize:width" + vlwVar.f177168u + "height" + vlwVar.f177166t);
        if (this.f176875a != null) {
            boolean z = this.f176890q;
            if (z) {
                this.f176885l = vlwVar.f177169v;
                this.f176886m = vlwVar.f177168u;
            } else {
                this.f176885l = vlwVar.f177168u;
                this.f176886m = vlwVar.f177169v;
            }
            vlwVar.f182017F0 = z;
            m3x m3xVarM171262T1 = this.f176880f.m171262T1();
            boolean z2 = this.f176890q;
            pt10 pt10Var = this.f176880f;
            if (z2) {
                pt10Var.m171265W1(1);
                m3xVarM171262T1.f131201k.setRenderSize(vlwVar.f177168u, vlwVar.f177169v);
                this.f176880f.setRenderSize(vlwVar.f177168u, vlwVar.f177169v);
            } else {
                pt10Var.m171265W1(0);
                m3xVarM171262T1.f131201k.setRenderSize(vlwVar.f177168u, vlwVar.f177169v);
                this.f176880f.setRenderSize(vlwVar.f177168u, vlwVar.f177169v);
            }
            this.f176880f.reInitialize();
            synchronized (this.f176884k) {
                try {
                    for (fcj fcjVar : this.f176884k) {
                        fcjVar.setRenderSize((int) this.f176885l, (int) this.f176886m);
                        fcjVar.reInitialize();
                        if (this.f176877c != null) {
                            eyx.m118802c().m118808g("changeRenderSize mAgoraCutFilter landmode" + this.f176890q + ", width:" + vlwVar.f177152m + ", height:" + vlwVar.f177154n);
                            boolean z3 = this.f176890q;
                            C22302a c22302a = this.f176877c;
                            if (z3) {
                                c22302a.setRenderSize(vlwVar.f177152m, vlwVar.f177154n);
                                this.f176877c.resetClockDegrees();
                                this.f176877c.rotateCounterClockwise90Degrees(3);
                                this.f176877c.reInitialize();
                            } else {
                                c22302a.setRenderSize(vlwVar.f177152m, vlwVar.f177154n);
                                this.f176877c.resetClockDegrees();
                                this.f176877c.reInitialize();
                            }
                            ad2 ad2Var = this.f176878d;
                            if (ad2Var != null) {
                                ad2Var.m95852S1(vlwVar.f177152m, vlwVar.f177154n);
                            }
                            ad2 ad2Var2 = this.f176879e;
                            if (ad2Var2 != null) {
                                ad2Var2.m95852S1(vlwVar.f177152m, vlwVar.f177154n);
                            }
                            xxx.m211572F().m211592U(vlwVar.f177152m, vlwVar.f177154n);
                        }
                        if (fcjVar instanceof MediaBaseCodecFilter) {
                            n8c.m158485c("zk", "resetCodecmRenderWidth" + this.f176885l + "/mRenderHeight" + this.f176886m);
                            momoPipeline.mo19693b0((MediaBaseCodecFilter) fcjVar, vlwVar);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: U1 */
    public void m194138U1(vlw vlwVar) {
        synchronized (this.f176884k) {
            try {
                for (fcj fcjVar : this.f176884k) {
                    if (!(fcjVar instanceof MediaBaseCodecFilter)) {
                        fcjVar.setRenderSize(vlwVar.f177168u, vlwVar.f177169v);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: V1 */
    public void m194139V1(MomoPipeline momoPipeline, vlw vlwVar) {
        synchronized (this.f176884k) {
            try {
                for (fcj fcjVar : this.f176884k) {
                    if (!(fcjVar instanceof MediaBaseCodecFilter)) {
                        fcjVar.setRenderSize(vlwVar.f177168u, vlwVar.f177169v);
                        xxx.m211572F().m211625n0(vlwVar.f177168u, vlwVar.f177169v);
                        fcjVar.reInitialize();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: W1 */
    public void m194140W1(MomoPipeline momoPipeline, vlw vlwVar) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "changeRenderSize:width" + vlwVar.f177168u + "height" + vlwVar.f177166t);
        if (this.width <= 0 || this.height <= 0) {
            return;
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "setMergeFilterRenderSize:width" + this.width + "height" + this.height);
        setRenderSize(vlwVar.f177168u, vlwVar.f177169v);
        synchronized (this.f176884k) {
            try {
                for (fcj fcjVar : this.f176884k) {
                    if (!(fcjVar instanceof MediaBaseCodecFilter)) {
                        fcjVar.setRenderSize(vlwVar.f177168u, vlwVar.f177169v);
                        fcjVar.reInitialize();
                    }
                    if (this.f176877c != null) {
                        eyx.m118802c().m118808g("changeRenderSizePushSize  mAgoraCutFilter  width:" + vlwVar.f177152m + ", height:" + vlwVar.f177154n);
                        this.f176877c.setRenderSize(vlwVar.f177152m, vlwVar.f177154n);
                        xxx.m211572F().m211592U(vlwVar.f177152m, vlwVar.f177154n);
                        this.f176877c.reInitialize();
                    }
                    ad2 ad2Var = this.f176878d;
                    if (ad2Var != null) {
                        ad2Var.m95852S1(vlwVar.f177152m, vlwVar.f177154n);
                    }
                    ad2 ad2Var2 = this.f176879e;
                    if (ad2Var2 != null) {
                        ad2Var2.m95852S1(vlwVar.f177152m, vlwVar.f177154n);
                    }
                    if (fcjVar instanceof MediaBaseCodecFilter) {
                        n8c.m158485c("zk", "resetCodecmRenderWidth" + this.f176885l + "/mRenderHeight" + this.f176886m);
                        fcjVar.setDisplayMode(vlwVar.f177169v, vlwVar.f177168u, 0);
                        fcjVar.setRenderSize(vlwVar.f177152m, vlwVar.f177154n);
                        fcjVar.reInitialize();
                        momoPipeline.mo19693b0((MediaBaseCodecFilter) fcjVar, vlwVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: X1 */
    public void m194141X1() {
        pt10 pt10Var = this.f176880f;
        if (pt10Var != null) {
            pt10Var.m171260R1();
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public m3x m194142Y1(mcj mcjVar) {
        m3x m3xVar = this.f176883j.get(mcjVar.getFilterKey());
        pt10 pt10Var = this.f176880f;
        if (pt10Var != null) {
            pt10Var.m171264V1(m3xVar);
        }
        this.f176883j.remove(mcjVar.getFilterKey());
        return m3xVar;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m194143Z1(int i, int i2) {
        if (this.f176875a != null) {
            this.f176887n = true;
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "setCameraCutSize:width" + i + "height" + i2);
            eyx.m118802c().m118808g("setCameraCutSize  mCutFilter width:" + i + ", height:" + i2 + "hasSetCameraSetSize:" + this.f176887n);
            this.f176875a.setRenderSize(i, i2);
        }
    }

    /* JADX INFO: renamed from: a2 */
    public void m194144a2(boolean z, MomoPipeline momoPipeline, vlw vlwVar) {
        eyx.m118802c().m118808g("setLandMode", Boolean.valueOf(z));
        this.f176890q = z;
    }

    @Override // p149l.mcj
    public synchronized void addTarget(jcj jcjVar) {
        super.removeTarget(jcjVar);
        super.addTarget(jcjVar);
        if (jcjVar instanceof fcj) {
            synchronized (this.f176884k) {
                try {
                    if (!this.f176884k.contains(jcjVar)) {
                        this.f176884k.add((fcj) jcjVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b2 */
    public void m194145b2(int i, int i2, boolean z) {
        this.f176888o = 1;
        float f = i / i2;
        this.f176889p = f > 0.9f && f <= 1.0f;
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "setMergeFilterRenderSize:width" + i + "height" + i2);
        if (z) {
            setRenderSize(i, i2);
        }
        synchronized (this.f176884k) {
            try {
                for (fcj fcjVar : this.f176884k) {
                    if (!(fcjVar instanceof MediaBaseCodecFilter)) {
                        fcjVar.setRenderSize(i, i2);
                        fcjVar.reInitialize();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c2 */
    public void m194146c2(mcj mcjVar, int i, int i2, String str, float f, float f2, float f3, float f4, float f5, int i3) {
        synchronized (getLockObject()) {
            try {
                int i4 = (int) (this.f176885l * f);
                int i5 = (int) (this.f176886m * f2);
                float f6 = i4;
                float f7 = i5;
                float f8 = f * 2.0f;
                z7q0 z7q0Var = new z7q0();
                z7q0Var.f202050c = f3 + (f / 2.0f);
                z7q0Var.f202051d = f4 + (f2 / 2.0f);
                z7q0Var.f202052e = f8;
                z7q0Var.f202053f = f8;
                z7q0Var.f202054g = f5;
                m3x m3xVar = this.f176883j.get(str);
                if (m3xVar != null) {
                    if (m3xVar.f131201k.getWidth() > 0) {
                        z7q0Var.f202048a = i;
                        z7q0Var.f202049b = i2;
                    } else {
                        z7q0Var.f202048a = i;
                        z7q0Var.f202049b = i2;
                    }
                    Log.e("Pipeline_Normal_pip->PIPLINE", "setPosition:" + i4 + ", yReal:" + i5 + ", position.inputWidth:" + z7q0Var.f202048a + ", position.inputHeight:" + z7q0Var.f202049b);
                    mcj mcjVar2 = m3xVar.f131201k;
                    if (mcjVar2 != null) {
                        mcjVar2.setRenderSize(i, i2);
                        m3xVar.f131201k.reInitialize();
                        if (i3 == 1) {
                            m3xVar.f131201k.setRenderSize(i4, i5);
                            m3xVar.f131201k.reInitialize();
                            z7q0Var.f202048a = f6;
                            z7q0Var.f202049b = f7;
                        }
                        mcj mcjVar3 = m3xVar.f131201k;
                        if (mcjVar3 instanceof C22302a) {
                            ((C22302a) mcjVar3).m221287U1(i3);
                        }
                    }
                    m3xVar.m152958d(z7q0Var);
                    this.f176880f.m171259Q1(m3xVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public synchronized void destroy() {
        try {
            super.destroy();
            pt10 pt10Var = this.f176880f;
            if (pt10Var != null) {
                pt10Var.destroy();
                this.f176880f = null;
            }
            C22302a c22302a = this.f176875a;
            if (c22302a != null) {
                c22302a.destroy();
                this.f176875a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ydk, p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        super.newTextureReady(i, mcjVar, z);
        if (mcjVar instanceof v84) {
            xxx.m211572F().m211587P();
        }
    }

    @Override // p149l.mcj
    public void removeTarget(jcj jcjVar) {
        super.removeTarget(jcjVar);
        if (jcjVar instanceof fcj) {
            synchronized (this.f176884k) {
                try {
                    if (this.f176884k.contains(jcjVar)) {
                        this.f176884k.remove(jcjVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (this.f176875a != null) {
            if (jcjVar instanceof MediaBaseCodecFilter) {
                MediaBaseCodecFilter mediaBaseCodecFilter = (MediaBaseCodecFilter) jcjVar;
                if (mediaBaseCodecFilter.mo19659c1() == 1 || mediaBaseCodecFilter.mo19659c1() == 2 || mediaBaseCodecFilter.mo19659c1() == 3) {
                    this.f176877c.removeTarget(jcjVar);
                    return;
                }
            }
            this.f176875a.removeTarget(jcjVar);
        }
    }

    @Override // p149l.ydk, p149l.ccj
    public void setRenderSize(int i, int i2) {
        if (this.f176876b != null) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "setRenderSize:width" + i + "height" + i2 + "hasSetCameraSetSize:" + this.f176887n);
            this.f176885l = i;
            this.f176886m = i2;
            this.f176876b.setRenderSize(i, i2);
            eyx.m118802c().m118808g("setRenderSize mDefaultCutFilter  width:" + i + ", height:" + i2, "threadInfo:" + kkx.m146358a() + "hasSetCameraSetSize:" + this.f176887n);
            if (!this.f176887n) {
                int i3 = this.f176888o;
                if (i3 == 1) {
                    this.f176875a.m221287U1(i3);
                }
                eyx.m118802c().m118808g("setRenderSize mCutFilter  width:" + i + ", height:" + i2 + ",threadInfo:" + kkx.m146358a());
                this.f176875a.setRenderSize(i, i2);
                xxx.m211572F().m211603c0(this.f176888o);
            }
            this.f176880f.setRenderSize(i, i2);
        }
    }
}
