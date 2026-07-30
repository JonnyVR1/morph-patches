package p007l;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.pipline.meidautil.PipelineConcurrentHashMap;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.momo.piplinemomoext.input.audio.InterfaceC0021a;
import com.momo.pub.MomoPipelineModuleRegister;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.bw00;
import l.ccj;
import l.dix;
import l.eix;
import l.etf;
import l.eyx;
import l.fjx;
import l.g16;
import l.gw00;
import l.hu00;
import l.ii70;
import l.m3x;
import l.pek0;
import l.slw;
import l.sml;
import l.sol;
import l.ts2;
import l.ujy;
import l.ulw;
import l.uv00;
import l.vlw;
import l.vv00;
import l.wki0;
import l.xgf0;
import l.ya1;
import l.yw00;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class zv00 implements MomoPipelineModuleRegister {

    /* JADX INFO: renamed from: a */
    private final String f5545a;

    /* JADX INFO: renamed from: b */
    private uv00 f5546b;

    /* JADX INFO: renamed from: c */
    private qmr f5547c;

    /* JADX INFO: renamed from: d */
    private etf f5548d;

    /* JADX INFO: renamed from: e */
    private ujy f5549e;

    /* JADX INFO: renamed from: f */
    private boolean f5550f;

    /* JADX INFO: renamed from: g */
    private WeakReference<Context> f5551g;

    /* JADX INFO: renamed from: h */
    private int f5552h;

    /* JADX INFO: renamed from: i */
    private List<oq2> f5553i;

    /* JADX INFO: renamed from: j */
    PipelineConcurrentHashMap<String, v2m> f5554j;

    /* JADX INFO: renamed from: k */
    PipelineConcurrentHashMap<String, rnl> f5555k;

    /* JADX INFO: renamed from: l */
    PipelineConcurrentHashMap<String, xsl> f5556l;

    /* JADX INFO: renamed from: m */
    PipelineConcurrentHashMap<String, ysl> f5557m;

    /* JADX INFO: renamed from: n */
    private iql f5558n;

    /* JADX INFO: renamed from: o */
    private btl f5559o;

    /* JADX INFO: renamed from: p */
    private tml f5560p;

    /* JADX INFO: renamed from: q */
    sml f5561q;

    /* JADX INFO: renamed from: r */
    hu00.c f5562r;

    /* JADX INFO: renamed from: s */
    hu00.b f5563s;

    /* JADX INFO: renamed from: t */
    hu00.d f5564t;

    /* JADX INFO: renamed from: u */
    InterfaceC0021a f5565u;

    /* JADX INFO: renamed from: v */
    private InterfaceC0816e f5566v;

    /* JADX INFO: renamed from: l.zv00$a */
    public class C0812a implements hu00.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MomoPipelineModuleRegister.InterfaceC0023b f5567a;

        public C0812a(MomoPipelineModuleRegister.InterfaceC0023b interfaceC0023b) {
            this.f5567a = interfaceC0023b;
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m12075a(int i, int i2, Object obj) {
            boolean z;
            if (i == 12302) {
                try {
                    if (fjx.R().f0()) {
                        Log.e("lqdebug", "MOMO_VIDEO_DYNAMIC_SCALING changeMomoPushSizeEx");
                        zv00 zv00Var = zv00.this;
                        zv00Var.m12070T(zv00Var.f5547c);
                        i = 8197;
                    } else if (zv00.this.f5566v != null) {
                        Log.e("lqdebug", "MOMO_VIDEO_DYNAMIC_SCALING onPushSizeChange");
                        zv00.this.f5566v.m12081a(zv00.this.f5547c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (zv00.this.f5553i) {
                z = true;
                for (oq2 oq2Var : zv00.this.f5553i) {
                    if (oq2Var.m10228s2() == obj) {
                        this.f5567a.m450a(i, i2, oq2Var);
                    } else {
                        MomoPipelineModuleRegister.InterfaceC0023b interfaceC0023b = this.f5567a;
                        if (i == 32770) {
                            interfaceC0023b.m450a(i, i2, oq2Var);
                        } else {
                            interfaceC0023b.m450a(i, i2, null);
                        }
                    }
                    z = false;
                }
            }
            if (z) {
                this.f5567a.m450a(i, i2, null);
            }
        }
    }

    /* JADX INFO: renamed from: l.zv00$b */
    public class C0813b implements gw00.f {
        public C0813b() {
        }

        /* JADX INFO: renamed from: P0 */
        public void m12076P0(yw00 yw00Var, int i, int i2, int i3, int i4) {
            hu00.c cVar = zv00.this.f5562r;
            if (cVar != null) {
                cVar.a(0, 0, (Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: l.zv00$c */
    public class C0814c implements hu00.b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MomoPipelineModuleRegister.InterfaceC0022a f5570a;

        public C0814c(MomoPipelineModuleRegister.InterfaceC0022a interfaceC0022a) {
            this.f5570a = interfaceC0022a;
        }

        /* JADX INFO: renamed from: q0 */
        public void m12077q0(int i, int i2, Object obj) {
            boolean z;
            synchronized (zv00.this.f5553i) {
                try {
                    z = true;
                    for (oq2 oq2Var : zv00.this.f5553i) {
                        if (oq2Var.m10228s2() == obj) {
                            this.f5570a.m449b(i, i2, oq2Var);
                            z = false;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                this.f5570a.m449b(i, i2, null);
            }
        }

        /* JADX INFO: renamed from: w0 */
        public void m12078w0(int i, int i2, Object obj) {
            boolean z;
            synchronized (zv00.this.f5553i) {
                try {
                    z = true;
                    for (oq2 oq2Var : zv00.this.f5553i) {
                        if (oq2Var.m10228s2() == obj) {
                            this.f5570a.m448a(i, i2, oq2Var);
                            z = false;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                this.f5570a.m448a(i, i2, null);
            }
        }
    }

    /* JADX INFO: renamed from: l.zv00$d */
    public class C0815d implements hu00.d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MomoPipelineModuleRegister.InterfaceC0024c f5572a;

        public C0815d(MomoPipelineModuleRegister.InterfaceC0024c interfaceC0024c) {
            this.f5572a = interfaceC0024c;
        }

        /* JADX INFO: renamed from: d0 */
        public void m12079d0(Object obj) {
            synchronized (zv00.this.f5553i) {
                try {
                    for (oq2 oq2Var : zv00.this.f5553i) {
                        if (oq2Var.m10228s2() == obj) {
                            this.f5572a.m452b(oq2Var);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: j0 */
        public void m12080j0(Object obj) {
            oq2 oq2Var;
            synchronized (zv00.this.f5553i) {
                try {
                    Iterator it = zv00.this.f5553i.iterator();
                    do {
                        if (!it.hasNext()) {
                            oq2Var = null;
                            break;
                        }
                        oq2Var = (oq2) it.next();
                    } while (oq2Var.m10228s2() != obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (oq2Var != null) {
                if (oq2Var.m10230u2()) {
                    oq2Var.m10234y2(false);
                    return;
                } else {
                    this.f5572a.m451a(oq2Var);
                    return;
                }
            }
            if (zv00.this.f5546b == null || zv00.this.f5546b.A0() == null) {
                return;
            }
            zv00.this.f5546b.A0().g(16386, 0, 0, obj);
        }
    }

    /* JADX INFO: renamed from: l.zv00$e */
    public interface InterfaceC0816e {
        /* JADX INFO: renamed from: a */
        void m12081a(qmr qmrVar);
    }

    public zv00(@NonNull Activity activity) {
        this.f5545a = "Pipeline_Normal_pip->PIPLINE";
        this.f5552h = 0;
        this.f5554j = new PipelineConcurrentHashMap<>();
        this.f5555k = new PipelineConcurrentHashMap<>();
        this.f5556l = new PipelineConcurrentHashMap<>();
        this.f5557m = new PipelineConcurrentHashMap<>();
        this.f5552h = wki0.c(activity);
        this.f5551g = new WeakReference<>(activity.getApplicationContext());
        this.f5553i = new ArrayList();
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: A */
    public void mo407A(MomoPipelineModuleRegister.InterfaceC0023b interfaceC0023b) {
        ii70.d().a("Pipeline_Normal_pip->PIPLINE", "setOnInfoListener" + interfaceC0023b);
        uv00 uv00Var = this.f5546b;
        if (uv00Var != null) {
            hu00.c cVar = this.f5562r;
            if (cVar != null) {
                uv00Var.o0(cVar);
                this.f5562r = null;
            }
            if (interfaceC0023b == null) {
                return;
            }
            ii70.d().a("Pipeline_Normal_pip->PIPLINE", "setOnInfoListener success");
            synchronized (this.f5553i) {
                try {
                    for (oq2 oq2Var : this.f5553i) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f5562r = new C0812a(interfaceC0023b);
            this.f5546b.W(new C0813b());
            this.f5546b.h0(this.f5562r);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: B */
    public void mo408B(@NonNull btl btlVar) {
        if (this.f5546b == null || btlVar == null) {
            return;
        }
        ii70.d().a("Pipeline_Normal_pip->PIPLINE", "unregisterInput Name:" + btlVar.getClass().getSimpleName() + " class:" + btlVar);
        if (btlVar instanceof rnl) {
            if (this.f5555k.containsKey(btlVar.toString())) {
                this.f5555k.remove(btlVar.toString());
            }
        } else if (btlVar instanceof ysl) {
            if (this.f5557m.containsKey(btlVar.toString())) {
                this.f5557m.remove(btlVar.toString());
            }
        } else if (btlVar instanceof xsl) {
            if (this.f5556l.containsKey(btlVar.toString())) {
                this.f5556l.remove(btlVar.toString());
            }
        } else if (btlVar instanceof v2m) {
            if (this.f5554j.containsKey(btlVar.toString())) {
                this.f5554j.remove(btlVar.toString());
            }
        } else if (btlVar == this.f5558n) {
            this.f5558n = null;
        }
        if (btlVar == this.f5559o) {
            this.f5559o = null;
            ii70.d().c("llc", this.f5555k.size() + "<>" + this.f5557m.size() + "<>" + this.f5556l.size() + "<>" + this.f5554j.size());
            if (this.f5555k.size() > 0 || this.f5557m.size() > 0 || this.f5556l.size() > 0) {
                return;
            }
            this.f5554j.size();
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: C */
    public synchronized void mo409C(j1m j1mVar) {
        if (this.f5546b != null && !this.f5553i.isEmpty()) {
            ii70.d().a("Pipeline_Normal_pip->PIPLINE", "unregisterPusher" + j1mVar);
            synchronized (this.f5553i) {
                this.f5553i.remove(j1mVar);
            }
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: D */
    public void mo410D(bw00.b bVar) {
        uv00 uv00Var = this.f5546b;
        if (uv00Var != null) {
            uv00Var.D(bVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: E */
    public rnl mo411E(@NonNull slw slwVar, @NonNull ts2 ts2Var) {
        if (this.f5546b == null) {
            return null;
        }
        ii70.d().a("Pipeline_Normal_pip->PIPLINE", "registerCameraInput Height:" + slwVar.f().a() + " Width:" + slwVar.f().b());
        x84 x84Var = new x84(this.f5547c, this.f5546b, slwVar, this.f5552h, ts2Var);
        this.f5555k.put(x84Var.toString(), x84Var);
        if (this.f5559o == null) {
            this.f5559o = x84Var;
            if (this.f5546b.r0()) {
                ujy ujyVar = this.f5549e;
                if (ujyVar != null) {
                    ujyVar.X1();
                }
                synchronized (this.f5553i) {
                    try {
                        Iterator<oq2> it = this.f5553i.iterator();
                        while (it.hasNext()) {
                            it.next().m10227r2(this.f5559o.mo8684a());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return x84Var;
            }
        }
        return x84Var;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: F */
    public MomoPipeline mo412F() {
        return this.f5546b;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: G */
    public e95 mo413G(sol solVar) {
        uv00 uv00Var = this.f5546b;
        if (uv00Var == null) {
            return null;
        }
        uv00Var.U(solVar);
        return new e95(this.f5546b);
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: H */
    public void mo414H(etf etfVar) {
        this.f5548d = etfVar;
        uv00 uv00Var = this.f5546b;
        if (uv00Var != null) {
            uv00Var.H(etfVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: I */
    public void mo415I(ccj ccjVar, String str) {
        uv00 uv00Var = this.f5546b;
        if (uv00Var != null) {
            uv00Var.I(ccjVar, str);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: J */
    public void mo416J(sml smlVar) {
        if (smlVar != null) {
            uv00 uv00Var = this.f5546b;
            if (uv00Var != null) {
                uv00Var.C0(smlVar);
            }
            smlVar.I1();
            return;
        }
        if (this.f5560p == null) {
            this.f5560p = new bb1(this.f5546b);
        }
        if (this.f5560p.mo8615b() != null) {
            this.f5560p.stopAudio();
        }
        this.f5560p.mo8616c(xv00.m11846a(this.f5547c, this.f5546b.A0()));
        uv00 uv00Var2 = this.f5546b;
        if (uv00Var2 != null) {
            uv00Var2.C0(this.f5560p.mo8615b());
        }
        this.f5560p.mo8614a();
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: K */
    public void mo417K() {
        if (this.f5547c == null) {
            eyx.c().g(new Object[]{"startConfRegister mParameters is null"});
        }
        if (this.f5546b == null) {
            this.f5546b = vv00.o(this.f5547c);
        }
        etf etfVar = this.f5548d;
        if (etfVar != null) {
            this.f5546b.H(etfVar);
        }
        ujy ujyVar = this.f5549e;
        if (ujyVar != null) {
            this.f5546b.t0(ujyVar);
        }
        mo433l();
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: L */
    public iql mo418L() {
        ii70.d().a("Pipeline_Normal_pip->PIPLINE", "registerEmptyInput ");
        sye syeVar = new sye(this.f5547c, this.f5546b);
        this.f5558n = syeVar;
        if (this.f5559o == null) {
            this.f5559o = syeVar;
        }
        return syeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, l.oq2, l.ttl] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: M */
    public synchronized ttl mo419M(MomoPipelineModuleRegister.LinkType linkType, String str, eix eixVar) {
        ?? tdj0Var;
        try {
            if (this.f5559o == null) {
                return null;
            }
            ii70.d().a("Pipeline_Normal_pip->PIPLINE", "registerLinkMicPusher");
            if (eixVar != null) {
                dix.d dVarH = dix.d().h(eixVar.b());
                if (dVarH != null && dVarH.e != null) {
                    pek0.a().e(dVarH.e);
                }
                eyx.c().g(new Object[]{"registerLinkMicPusher1 updateMediaConfigsForIJKByMediaConfig "});
            } else {
                eyx.c().g(new Object[]{"registerLinkMicPusher1 mediaCfgParams appid is null", eixVar.m()});
            }
            if (linkType == MomoPipelineModuleRegister.LinkType.AGORALINK) {
                tdj0Var = TextUtils.isEmpty(str) ? new yc0(m12071U(), this.f5546b, this.f5559o.mo8684a(), this.f5547c, this.f5565u) : new yc0(m12071U(), this.f5546b, this.f5559o.mo8684a(), this.f5547c, this.f5565u, str);
            } else if (linkType == MomoPipelineModuleRegister.LinkType.WEILALINK) {
                tdj0Var = TextUtils.isEmpty(str) ? new nnp0(m12071U(), this.f5546b, this.f5559o.mo8684a(), this.f5547c, this.f5565u) : new nnp0(m12071U(), this.f5546b, this.f5559o.mo8684a(), this.f5547c, this.f5565u, str);
            } else if (linkType == MomoPipelineModuleRegister.LinkType.MOMORTCLINK) {
                tdj0Var = TextUtils.isEmpty(str) ? new o500(m12071U(), this.f5546b, this.f5559o.mo8684a(), this.f5547c, this.f5565u) : new o500(m12071U(), this.f5546b, this.f5559o.mo8684a(), this.f5547c, this.f5565u, str);
            } else if (linkType == MomoPipelineModuleRegister.LinkType.VOLCLINK) {
                tdj0Var = TextUtils.isEmpty(str) ? new udp0(m12071U(), this.f5546b, this.f5559o.mo8684a(), this.f5547c, this.f5565u) : new udp0(m12071U(), this.f5546b, this.f5559o.mo8684a(), this.f5547c, this.f5565u, str);
            } else {
                tdj0Var = TextUtils.isEmpty(str) ? new tdj0(m12071U(), this.f5546b, this.f5559o.mo8684a(), this.f5547c, this.f5565u) : new tdj0(m12071U(), this.f5546b, this.f5559o.mo8684a(), this.f5547c, this.f5565u, str);
            }
            tdj0Var.m10233x2(eixVar);
            this.f5561q = tdj0Var.mo9487m2();
            tml tmlVar = this.f5560p;
            if (tmlVar != null) {
                tmlVar.mo8616c(tdj0Var.mo9487m2());
            }
            synchronized (this.f5553i) {
                this.f5553i.add((oq2) tdj0Var);
            }
            return tdj0Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: N */
    public void mo420N() {
        if (this.f5547c != null) {
            ii70.d().c("llc", ((ulw) this.f5547c).u + "<>" + ((ulw) this.f5547c).v);
            ujy ujyVar = this.f5549e;
            qmr qmrVar = this.f5547c;
            ujyVar.setRenderSize(((ulw) qmrVar).u, ((ulw) qmrVar).v);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: O */
    public void mo421O(boolean z) {
        this.f5550f = z;
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", "setLandMode, width:" + ((ulw) this.f5547c).u + ", height:" + ((ulw) this.f5547c).v + ", IsLandMode:" + this.f5550f);
        ujy ujyVar = this.f5549e;
        if (ujyVar != null) {
            ujyVar.a2(z, this.f5546b, this.f5547c);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: P */
    public synchronized gxl mo422P(eix eixVar) {
        try {
            if (this.f5559o == null) {
                return null;
            }
            ii70.d().a("Pipeline_Normal_pip->PIPLINE", "registerMomoPusher");
            if (eixVar != null) {
                dix.d dVarH = dix.d().h(eixVar.b());
                if (dVarH != null && dVarH.e != null) {
                    pek0.a().e(dVarH.e);
                }
                eyx.c().g(new Object[]{"registerMomoPusher updateMediaConfigsForIJKByMediaConfig "});
            } else {
                eyx.c().g(new Object[]{"registerMomoPusher mediaCfgParams appid is null", eixVar.m()});
            }
            lw00 lw00Var = new lw00(m12071U(), this.f5546b, this.f5559o.mo8684a(), this.f5547c, this.f5565u);
            lw00Var.m10233x2(eixVar);
            synchronized (this.f5553i) {
                try {
                    for (oq2 oq2Var : this.f5553i) {
                        if (oq2Var instanceof ttl) {
                            lw00Var.m9853B2(oq2Var.mo9487m2());
                        }
                    }
                    if (xv00.m11851f() != null && xv00.m11851f().F()) {
                        lw00Var.m9853B2(xv00.m11851f());
                    }
                    this.f5553i.add(lw00Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lw00Var;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: T */
    public void m12070T(vlw vlwVar) {
        uv00 uv00Var = this.f5546b;
        if (uv00Var != null) {
            uv00Var.e(((ulw) vlwVar).H);
        }
    }

    /* JADX INFO: renamed from: U */
    public Context m12071U() {
        WeakReference<Context> weakReference = this.f5551g;
        if (weakReference == null) {
            return g16.a;
        }
        return weakReference.get() == null ? g16.a : this.f5551g.get();
    }

    /* JADX INFO: renamed from: V */
    public void m12072V(btl btlVar, String str, int i, int i2, int i3, int i4) {
        if (this.f5546b == null) {
            throw new InvalidParameterException("Must startRegister first");
        }
        if (btlVar == null || btlVar.mo8684a() == null) {
            return;
        }
        ii70.d().a("Pipeline_Normal_pip->PIPLINE", "mergeInput" + btlVar.mo8684a().getClass().getSimpleName() + " class:" + btlVar + " key:" + str + "sourceWidth:" + i + " sourceHeight:" + i2 + " renderWidth:" + i3 + " renderHeight:" + i4);
        this.f5549e.R1(btlVar.mo8684a().getInput(), str, this.f5546b.Z(btlVar.mo8684a()));
    }

    /* JADX INFO: renamed from: W */
    public synchronized tml m12073W() {
        try {
            ii70.d().a("Pipeline_Normal_pip->PIPLINE", "registerAudioInput");
            if (this.f5560p == null) {
                this.f5560p = new bb1(this.f5546b);
            }
            if (this.f5560p.mo8615b() != null) {
                this.f5560p.stopAudio();
            }
            this.f5560p.mo8616c(xv00.m11846a(this.f5547c, this.f5546b.A0()));
            this.f5560p.mo8614a();
            this.f5561q = this.f5560p.mo8615b();
        } catch (Throwable th) {
            throw th;
        }
        return this.f5560p;
    }

    /* JADX INFO: renamed from: X */
    public void m12074X() {
        WeakReference<Context> weakReference = this.f5551g;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: b */
    public void mo423b(vlw vlwVar) {
        uv00 uv00Var = this.f5546b;
        if (uv00Var != null) {
            uv00Var.b(vlwVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: c */
    public void mo424c(vlw vlwVar) {
        uv00 uv00Var = this.f5546b;
        if (uv00Var != null) {
            uv00Var.c(vlwVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: d */
    public void mo425d(qmr qmrVar) {
        uv00 uv00Var = this.f5546b;
        if (uv00Var != null && uv00Var.j0() != null) {
            this.f5546b.j0().P(((ulw) qmrVar).u, ((ulw) qmrVar).v);
        }
        ujy ujyVar = this.f5549e;
        if (ujyVar != null) {
            ujyVar.U1(qmrVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: e */
    public void mo426e(MomoPipelineModuleRegister.InterfaceC0022a interfaceC0022a) {
        ii70.d().a("Pipeline_Normal_pip->PIPLINE", "setOnErrorListener" + interfaceC0022a);
        uv00 uv00Var = this.f5546b;
        if (uv00Var != null) {
            hu00.b bVar = this.f5563s;
            if (bVar != null) {
                uv00Var.y0(bVar);
                this.f5563s = null;
            }
            if (interfaceC0022a == null) {
                return;
            }
            ii70.d().a("Pipeline_Normal_pip->PIPLINE", "setOnErrorListener success" + interfaceC0022a);
            C0814c c0814c = new C0814c(interfaceC0022a);
            this.f5563s = c0814c;
            this.f5546b.g0(c0814c);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: f */
    public void mo427f(MomoPipelineModuleRegister.InterfaceC0024c interfaceC0024c) {
        ii70.d().a("Pipeline_Normal_pip->PIPLINE", "setRecordStateListener success");
        uv00 uv00Var = this.f5546b;
        if (uv00Var != null) {
            hu00.d dVar = this.f5564t;
            if (dVar != null) {
                uv00Var.k0(dVar);
            }
            C0815d c0815d = new C0815d(interfaceC0024c);
            this.f5564t = c0815d;
            this.f5546b.B0(c0815d);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: g */
    public void mo428g(InterfaceC0816e interfaceC0816e) {
        this.f5566v = interfaceC0816e;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    public qmr getParameters() {
        return this.f5547c;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: h */
    public void mo429h(qmr qmrVar, boolean z) {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", " changePushSize parameters:" + ((ulw) qmrVar).v + " " + ((ulw) qmrVar).u);
        uv00 uv00Var = this.f5546b;
        if (uv00Var != null && uv00Var.j0() != null) {
            uv00 uv00Var2 = this.f5546b;
            if (z) {
                uv00Var2.j0().P(((ulw) qmrVar).v, ((ulw) qmrVar).u);
            } else {
                uv00Var2.j0().P(((ulw) qmrVar).u, ((ulw) qmrVar).v);
            }
        }
        ujy ujyVar = this.f5549e;
        if (ujyVar != null) {
            ujyVar.S1(this.f5546b, qmrVar, z);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: i */
    public void mo430i(int i, int i2, xgf0 xgf0Var) {
        uv00 uv00Var = this.f5546b;
        if (uv00Var != null) {
            uv00Var.i(i, i2, xgf0Var);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: j */
    public void mo431j(btl btlVar) {
        if (btlVar != null) {
            if (this.f5549e != null && btlVar.mo8684a() != null && btlVar.mo8684a().getInput() != null) {
                ii70.d().a("Pipeline_Normal_pip->PIPLINE", "removeMerge 111" + btlVar.mo8684a().getClass().getSimpleName() + " class:" + btlVar);
                m3x m3xVarY1 = this.f5549e.Y1(btlVar.mo8684a().getInput());
                yw00 yw00VarZ = this.f5546b.Z(btlVar.mo8684a());
                this.f5546b.I(btlVar.mo8684a().getInput(), yw00VarZ.m());
                this.f5546b.I(m3xVarY1.k, yw00VarZ.m());
            }
            btlVar.mo8566G();
            if (btlVar.mo8684a() != null) {
                ii70.d().a("Pipeline_Normal_pip->PIPLINE", "removeMerge 222" + btlVar.mo8684a().getClass().getSimpleName() + " class:" + btlVar);
                yw00 yw00VarZ2 = this.f5546b.Z(btlVar.mo8684a());
                if (yw00VarZ2 != null) {
                    ii70.d().a("Pipeline_Normal_pip->PIPLINE", "removeMerge success");
                    yw00VarZ2.k();
                }
            }
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: k */
    public void mo432k(btl btlVar, String str, float f, float f2, float f3, float f4, float f5, int i, int i2, int i3) {
        int i4;
        int i5;
        if (this.f5549e == null || btlVar == null || btlVar.mo8684a() == null) {
            return;
        }
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", "setMergePosition, x:" + f + ", y:" + f2 + ", px:" + f3 + ", py:" + f4 + ",pipeline:" + btlVar.mo8684a());
        if (btlVar.mo8684a() == null || !(btlVar.mo8684a() instanceof ih0)) {
            i4 = i2;
            i5 = i3;
        } else {
            int iM9403a2 = ((ih0) btlVar.mo8684a()).m9403a2();
            int iM9402Z1 = ((ih0) btlVar.mo8684a()).m9402Z1();
            ii70.d().c("zk->weijiangnan", "AidInput->renderWidth:" + iM9403a2 + ", renderHeight:" + iM9402Z1);
            i4 = iM9403a2;
            i5 = iM9402Z1;
        }
        this.f5549e.c2(btlVar.mo8684a().getInput(), i4, i5, str, f, f2, f3, f4, f5, i);
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: l */
    public InterfaceC0021a mo433l() {
        ii70.d().a("Pipeline_Normal_pip->PIPLINE", "registerAudioControl");
        if (this.f5565u == null) {
            Context contextM12071U = m12071U();
            qmr qmrVar = this.f5547c;
            InterfaceC0021a interfaceC0021aM11848c = xv00.m11848c(contextM12071U, ((ulw) qmrVar).P, ((ulw) qmrVar).R, ((ulw) qmrVar).d0);
            this.f5565u = interfaceC0021aM11848c;
            qmr qmrVar2 = this.f5547c;
            ((ExtAudioWrapper) interfaceC0021aM11848c).m353I2(2048, ((ulw) qmrVar2).P, ((ulw) qmrVar2).R, "NULL");
        }
        uv00 uv00Var = this.f5546b;
        if (uv00Var != null) {
            ya1 ya1Var = this.f5565u;
            if (ya1Var instanceof ya1) {
                uv00Var.D0(ya1Var);
            }
        }
        return this.f5565u;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: m */
    public void mo434m(qmr qmrVar) {
        uv00 uv00Var = this.f5546b;
        if (uv00Var != null && uv00Var.j0() != null) {
            this.f5546b.j0().P(((ulw) qmrVar).u, ((ulw) qmrVar).v);
        }
        ujy ujyVar = this.f5549e;
        if (ujyVar != null) {
            ujyVar.V1(this.f5546b, qmrVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: n */
    public void mo435n() {
        ujy ujyVar = new ujy();
        this.f5549e = ujyVar;
        qmr qmrVar = this.f5547c;
        if (qmrVar != null) {
            ujyVar.setRenderSize(((ulw) qmrVar).u, ((ulw) qmrVar).v);
        }
        uv00 uv00Var = this.f5546b;
        if (uv00Var != null) {
            uv00Var.t0(this.f5549e);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: o */
    public v2m mo436o() {
        uv00 uv00Var = this.f5546b;
        if (uv00Var == null) {
            return null;
        }
        y4e0 y4e0Var = new y4e0(this.f5547c, uv00Var);
        this.f5554j.put(y4e0Var.toString(), y4e0Var);
        if (this.f5559o == null) {
            this.f5559o = y4e0Var;
        }
        return y4e0Var;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: p */
    public void mo437p(qmr qmrVar) {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", " changePushSize parameters:" + ((ulw) qmrVar).v + " " + ((ulw) qmrVar).u);
        uv00 uv00Var = this.f5546b;
        if (uv00Var != null && uv00Var.j0() != null) {
            this.f5546b.j0().P(((ulw) qmrVar).u, ((ulw) qmrVar).v);
        }
        ujy ujyVar = this.f5549e;
        if (ujyVar != null) {
            ujyVar.T1(this.f5546b, qmrVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: q */
    public void mo438q(btl btlVar, String str) {
        if (btlVar.mo8684a() != null) {
            ii70.d().a("Pipeline_Normal_pip->PIPLINE", "mergeInput" + btlVar.mo8684a().getClass().getSimpleName() + " class:" + btlVar + " key:" + str);
        }
        m12072V(btlVar, str, 480, 640, 480, 480);
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: r */
    public xsl mo439r(int i, boolean z, eix eixVar) {
        if (this.f5546b == null) {
            return null;
        }
        ii70.d().a("Pipeline_Normal_pip->PIPLINE", "registerIjkInput type:" + i);
        fdm fdmVar = new fdm(this.f5547c, this.f5546b, m12071U(), i, z, eixVar);
        this.f5556l.put(fdmVar.toString(), fdmVar);
        if (this.f5559o == null) {
            this.f5559o = fdmVar;
        }
        return fdmVar;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: s */
    public void mo440s(int i, int i2) {
        ujy ujyVar = this.f5549e;
        if (ujyVar != null) {
            ujyVar.Z1(i, i2);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: t */
    public synchronized void mo441t() {
        try {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE", "stopRegister");
            tml tmlVar = this.f5560p;
            if (tmlVar != null) {
                tmlVar.stopAudio();
                this.f5560p = null;
            }
            xv00.m11852g();
            Iterator it = this.f5554j.values().iterator();
            while (it.hasNext()) {
                ((v2m) it.next()).mo8566G();
            }
            Iterator it2 = this.f5555k.values().iterator();
            while (it2.hasNext()) {
                ((rnl) it2.next()).mo8566G();
            }
            Iterator it3 = this.f5557m.values().iterator();
            while (it3.hasNext()) {
                ((ysl) it3.next()).mo8566G();
            }
            Iterator it4 = this.f5556l.values().iterator();
            while (it4.hasNext()) {
                ((xsl) it4.next()).mo8566G();
            }
            this.f5554j.clear();
            this.f5555k.clear();
            this.f5557m.clear();
            this.f5556l.clear();
            iql iqlVar = this.f5558n;
            if (iqlVar != null) {
                iqlVar.mo8566G();
                this.f5558n = null;
            }
            if (!this.f5553i.isEmpty()) {
                synchronized (this.f5553i) {
                    try {
                        Iterator<oq2> it5 = this.f5553i.iterator();
                        while (it5.hasNext()) {
                            it5.next().mo9478f();
                        }
                        this.f5553i.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            InterfaceC0021a interfaceC0021a = this.f5565u;
            if (interfaceC0021a != null) {
                interfaceC0021a.stopSurroundMusic();
                this.f5565u.d1();
            }
            uv00 uv00Var = this.f5546b;
            if (uv00Var != null) {
                uv00Var.f();
                this.f5546b.G();
                this.f5546b.c0();
                this.f5546b.p0();
                this.f5546b.a0();
                this.f5546b.release();
            }
            this.f5564t = null;
            this.f5563s = null;
            this.f5562r = null;
            this.f5559o = null;
            m12074X();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: u */
    public void mo442u(int i, int i2, int i3, int i4, boolean z) {
        ujy ujyVar = this.f5549e;
        if (ujyVar != null) {
            ujyVar.b2(i, i2, z);
            this.f5549e.Z1(i3, i4);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: v */
    public void mo443v(qmr qmrVar) {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", " changePushSize parameters:" + ((ulw) qmrVar).v + " " + ((ulw) qmrVar).u);
        uv00 uv00Var = this.f5546b;
        if (uv00Var != null && uv00Var.j0() != null) {
            this.f5546b.j0().P(((ulw) qmrVar).u, ((ulw) qmrVar).v);
        }
        ujy ujyVar = this.f5549e;
        if (ujyVar != null) {
            ujyVar.W1(this.f5546b, qmrVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: w */
    public void mo444w(btl btlVar, String str, float f, float f2, float f3, float f4, float f5, int i) {
        int iM10659R1;
        int iM10658Q1;
        if (this.f5549e != null) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE", "setMergePosition, x:" + f + ", y:" + f2 + ", px:" + f3 + ", py:" + f4 + ",pipeline:" + btlVar.mo8684a());
            if (btlVar.mo8684a() == null || !(btlVar.mo8684a() instanceof ih0)) {
                iM10659R1 = 480;
                iM10658Q1 = 480;
            } else {
                iM10659R1 = ((ih0) btlVar.mo8684a()).m9403a2();
                iM10658Q1 = ((ih0) btlVar.mo8684a()).m9402Z1();
                ii70.d().c("Pipeline_Normal_pip->PIPLINE", "AidInput->renderWidth:" + iM10659R1 + ", renderHeight:" + iM10658Q1);
            }
            if (btlVar.mo8684a() != null && (btlVar.mo8684a() instanceof ski0)) {
                iM10659R1 = ((ski0) btlVar.mo8684a()).m10659R1();
                iM10658Q1 = ((ski0) btlVar.mo8684a()).m10658Q1();
                ii70.d().c("Pipeline_Normal_pip->PIPLINE", "TextureInput->renderWidth:" + iM10659R1 + ", renderHeight:" + iM10658Q1);
            }
            this.f5549e.c2(btlVar.mo8684a().getInput(), iM10659R1, iM10658Q1, str, f, f2, f3, f4, f5, i);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: x */
    public sml mo445x() {
        return this.f5561q;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: y */
    public void mo446y(@NonNull qmr qmrVar) {
        this.f5547c = qmrVar;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: z */
    public synchronized void mo447z(j1m j1mVar) {
        boolean z;
        sml smlVar;
        try {
            if (this.f5546b != null && !this.f5553i.isEmpty()) {
                ii70.d().a("Pipeline_Normal_pip->PIPLINE", "unregisterPusher" + j1mVar);
                synchronized (this.f5553i) {
                    try {
                        this.f5553i.remove(j1mVar);
                        z = false;
                        for (oq2 oq2Var : this.f5553i) {
                            if (oq2Var instanceof ttl) {
                                tml tmlVar = this.f5560p;
                                if (tmlVar != null) {
                                    tmlVar.mo8616c(oq2Var.mo9487m2());
                                }
                                z = true;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if ((j1mVar instanceof ttl) && j1mVar.mo9487m2() == this.f5561q) {
                    tml tmlVar2 = this.f5560p;
                    if (tmlVar2 != null) {
                        tmlVar2.stopAudio();
                    }
                    this.f5560p = null;
                    this.f5561q = null;
                }
                if (!z && (smlVar = this.f5560p) != null && smlVar != xv00.m11846a(this.f5547c, this.f5546b.A0())) {
                    this.f5560p.mo8616c(xv00.m11846a(this.f5547c, this.f5546b.A0()));
                    this.f5546b.C0(this.f5560p.mo8615b());
                    this.f5560p.mo8614a();
                }
                eyx.c().g(new Object[]{"unregisterPusher mPusherList=" + this.f5553i.size()});
                List<oq2> list = this.f5553i;
                if (list != null && list.size() > 0 && (this.f5560p == null || this.f5561q == null)) {
                    m12073W();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public zv00(@NonNull Context context) {
        this.f5545a = "Pipeline_Normal_pip->PIPLINE";
        this.f5552h = 0;
        this.f5554j = new PipelineConcurrentHashMap<>();
        this.f5555k = new PipelineConcurrentHashMap<>();
        this.f5556l = new PipelineConcurrentHashMap<>();
        this.f5557m = new PipelineConcurrentHashMap<>();
        this.f5551g = new WeakReference<>(context);
        this.f5553i = new ArrayList();
    }
}
