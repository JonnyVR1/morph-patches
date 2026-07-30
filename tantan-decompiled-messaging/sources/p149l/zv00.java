package p149l;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.pipline.meidautil.PipelineConcurrentHashMap;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.momo.piplinemomoext.input.audio.InterfaceC4109a;
import com.momo.pub.MomoPipelineModuleRegister;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class zv00 implements MomoPipelineModuleRegister {

    /* JADX INFO: renamed from: a */
    private final String f204927a;

    /* JADX INFO: renamed from: b */
    private uv00 f204928b;

    /* JADX INFO: renamed from: c */
    private qmr f204929c;

    /* JADX INFO: renamed from: d */
    private etf f204930d;

    /* JADX INFO: renamed from: e */
    private ujy f204931e;

    /* JADX INFO: renamed from: f */
    private boolean f204932f;

    /* JADX INFO: renamed from: g */
    private WeakReference<Context> f204933g;

    /* JADX INFO: renamed from: h */
    private int f204934h;

    /* JADX INFO: renamed from: i */
    private List<oq2> f204935i;

    /* JADX INFO: renamed from: j */
    PipelineConcurrentHashMap<String, v2m> f204936j;

    /* JADX INFO: renamed from: k */
    PipelineConcurrentHashMap<String, rnl> f204937k;

    /* JADX INFO: renamed from: l */
    PipelineConcurrentHashMap<String, xsl> f204938l;

    /* JADX INFO: renamed from: m */
    PipelineConcurrentHashMap<String, ysl> f204939m;

    /* JADX INFO: renamed from: n */
    private iql f204940n;

    /* JADX INFO: renamed from: o */
    private btl f204941o;

    /* JADX INFO: renamed from: p */
    private tml f204942p;

    /* JADX INFO: renamed from: q */
    sml f204943q;

    /* JADX INFO: renamed from: r */
    hu00.InterfaceC17394c f204944r;

    /* JADX INFO: renamed from: s */
    hu00.InterfaceC17393b f204945s;

    /* JADX INFO: renamed from: t */
    hu00.InterfaceC17395d f204946t;

    /* JADX INFO: renamed from: u */
    InterfaceC4109a f204947u;

    /* JADX INFO: renamed from: v */
    private InterfaceC21782e f204948v;

    /* JADX INFO: renamed from: l.zv00$a */
    public class C21778a implements hu00.InterfaceC17394c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MomoPipelineModuleRegister.InterfaceC4111b f204949a;

        public C21778a(MomoPipelineModuleRegister.InterfaceC4111b interfaceC4111b) {
            this.f204949a = interfaceC4111b;
        }

        @Override // p149l.hu00.InterfaceC17394c
        /* JADX INFO: renamed from: a */
        public synchronized void mo99216a(int i, int i2, Object obj) {
            boolean z;
            if (i == 12302) {
                try {
                    if (fjx.m121638R().m121737f0()) {
                        Log.e("lqdebug", "MOMO_VIDEO_DYNAMIC_SCALING changeMomoPushSizeEx");
                        zv00 zv00Var = zv00.this;
                        zv00Var.m220292T(zv00Var.f204929c);
                        i = 8197;
                    } else if (zv00.this.f204948v != null) {
                        Log.e("lqdebug", "MOMO_VIDEO_DYNAMIC_SCALING onPushSizeChange");
                        zv00.this.f204948v.mo19148a(zv00.this.f204929c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (zv00.this.f204935i) {
                z = true;
                for (oq2 oq2Var : zv00.this.f204935i) {
                    if (oq2Var.m165392s2() == obj) {
                        this.f204949a.mo18370a(i, i2, oq2Var);
                    } else {
                        MomoPipelineModuleRegister.InterfaceC4111b interfaceC4111b = this.f204949a;
                        if (i == 32770) {
                            interfaceC4111b.mo18370a(i, i2, oq2Var);
                        } else {
                            interfaceC4111b.mo18370a(i, i2, null);
                        }
                    }
                    z = false;
                }
            }
            if (z) {
                this.f204949a.mo18370a(i, i2, null);
            }
        }
    }

    /* JADX INFO: renamed from: l.zv00$b */
    public class C21779b implements gw00.InterfaceC17174f {
        public C21779b() {
        }

        @Override // p149l.gw00.InterfaceC17174f
        /* JADX INFO: renamed from: P0 */
        public void mo19959P0(yw00 yw00Var, int i, int i2, int i3, int i4) {
            hu00.InterfaceC17394c interfaceC17394c = zv00.this.f204944r;
            if (interfaceC17394c != null) {
                interfaceC17394c.mo99216a(0, 0, null);
            }
        }
    }

    /* JADX INFO: renamed from: l.zv00$c */
    public class C21780c implements hu00.InterfaceC17393b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MomoPipelineModuleRegister.InterfaceC4110a f204952a;

        public C21780c(MomoPipelineModuleRegister.InterfaceC4110a interfaceC4110a) {
            this.f204952a = interfaceC4110a;
        }

        @Override // p149l.hu00.InterfaceC17393b
        /* JADX INFO: renamed from: q0 */
        public void mo19749q0(int i, int i2, Object obj) {
            boolean z;
            synchronized (zv00.this.f204935i) {
                try {
                    z = true;
                    for (oq2 oq2Var : zv00.this.f204935i) {
                        if (oq2Var.m165392s2() == obj) {
                            this.f204952a.mo18363b(i, i2, oq2Var);
                            z = false;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                this.f204952a.mo18363b(i, i2, null);
            }
        }

        @Override // p149l.hu00.InterfaceC17393b
        /* JADX INFO: renamed from: w0 */
        public void mo19750w0(int i, int i2, Object obj) {
            boolean z;
            synchronized (zv00.this.f204935i) {
                try {
                    z = true;
                    for (oq2 oq2Var : zv00.this.f204935i) {
                        if (oq2Var.m165392s2() == obj) {
                            this.f204952a.mo18362a(i, i2, oq2Var);
                            z = false;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                this.f204952a.mo18362a(i, i2, null);
            }
        }
    }

    /* JADX INFO: renamed from: l.zv00$d */
    public class C21781d implements hu00.InterfaceC17395d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MomoPipelineModuleRegister.InterfaceC4112c f204954a;

        public C21781d(MomoPipelineModuleRegister.InterfaceC4112c interfaceC4112c) {
            this.f204954a = interfaceC4112c;
        }

        @Override // p149l.hu00.InterfaceC17395d
        /* JADX INFO: renamed from: d0 */
        public void mo19733d0(Object obj) {
            synchronized (zv00.this.f204935i) {
                try {
                    for (oq2 oq2Var : zv00.this.f204935i) {
                        if (oq2Var.m165392s2() == obj) {
                            this.f204954a.mo18372b(oq2Var);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p149l.hu00.InterfaceC17395d
        /* JADX INFO: renamed from: j0 */
        public void mo19741j0(Object obj) {
            oq2 oq2Var;
            synchronized (zv00.this.f204935i) {
                try {
                    Iterator it = zv00.this.f204935i.iterator();
                    do {
                        if (!it.hasNext()) {
                            oq2Var = null;
                            break;
                        }
                        oq2Var = (oq2) it.next();
                    } while (oq2Var.m165392s2() != obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (oq2Var != null) {
                if (oq2Var.m165394u2()) {
                    oq2Var.m165398y2(false);
                    return;
                } else {
                    this.f204954a.mo18371a(oq2Var);
                    return;
                }
            }
            if (zv00.this.f204928b == null || zv00.this.f204928b.mo19674A0() == null) {
                return;
            }
            zv00.this.f204928b.mo19674A0().mo128349g(16386, 0, 0, obj);
        }
    }

    /* JADX INFO: renamed from: l.zv00$e */
    public interface InterfaceC21782e {
        /* JADX INFO: renamed from: a */
        void mo19148a(qmr qmrVar);
    }

    public zv00(@NonNull Activity activity) {
        this.f204927a = "Pipeline_Normal_pip->PIPLINE";
        this.f204934h = 0;
        this.f204936j = new PipelineConcurrentHashMap<>();
        this.f204937k = new PipelineConcurrentHashMap<>();
        this.f204938l = new PipelineConcurrentHashMap<>();
        this.f204939m = new PipelineConcurrentHashMap<>();
        this.f204934h = wki0.m203673c(activity);
        this.f204933g = new WeakReference<>(activity.getApplicationContext());
        this.f204935i = new ArrayList();
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: A */
    public void mo20141A(MomoPipelineModuleRegister.InterfaceC4111b interfaceC4111b) {
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "setOnInfoListener" + interfaceC4111b);
        uv00 uv00Var = this.f204928b;
        if (uv00Var != null) {
            hu00.InterfaceC17394c interfaceC17394c = this.f204944r;
            if (interfaceC17394c != null) {
                uv00Var.mo19711o0(interfaceC17394c);
                this.f204944r = null;
            }
            if (interfaceC4111b == null) {
                return;
            }
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "setOnInfoListener success");
            synchronized (this.f204935i) {
                try {
                    for (oq2 oq2Var : this.f204935i) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f204944r = new C21778a(interfaceC4111b);
            this.f204928b.mo19688W(new C21779b());
            this.f204928b.mo19700h0(this.f204944r);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: B */
    public void mo20142B(@NonNull btl btlVar) {
        if (this.f204928b == null || btlVar == null) {
            return;
        }
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "unregisterInput Name:" + btlVar.getClass().getSimpleName() + " class:" + btlVar);
        if (btlVar instanceof rnl) {
            if (this.f204937k.containsKey(btlVar.toString())) {
                this.f204937k.remove(btlVar.toString());
            }
        } else if (btlVar instanceof ysl) {
            if (this.f204939m.containsKey(btlVar.toString())) {
                this.f204939m.remove(btlVar.toString());
            }
        } else if (btlVar instanceof xsl) {
            if (this.f204938l.containsKey(btlVar.toString())) {
                this.f204938l.remove(btlVar.toString());
            }
        } else if (btlVar instanceof v2m) {
            if (this.f204936j.containsKey(btlVar.toString())) {
                this.f204936j.remove(btlVar.toString());
            }
        } else if (btlVar == this.f204940n) {
            this.f204940n = null;
        }
        if (btlVar == this.f204941o) {
            this.f204941o = null;
            ii70.m136344d().m136348c("llc", this.f204937k.size() + "<>" + this.f204939m.size() + "<>" + this.f204938l.size() + "<>" + this.f204936j.size());
            if (this.f204937k.size() > 0 || this.f204939m.size() > 0 || this.f204938l.size() > 0) {
                return;
            }
            this.f204936j.size();
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: C */
    public synchronized void mo20143C(j1m j1mVar) {
        if (this.f204928b != null && !this.f204935i.isEmpty()) {
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "unregisterPusher" + j1mVar);
            synchronized (this.f204935i) {
                this.f204935i.remove(j1mVar);
            }
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: D */
    public void mo20144D(bw00.InterfaceC15993b interfaceC15993b) {
        uv00 uv00Var = this.f204928b;
        if (uv00Var != null) {
            uv00Var.mo19678D(interfaceC15993b);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: E */
    public rnl mo20145E(@NonNull slw slwVar, @NonNull ts2 ts2Var) {
        if (this.f204928b == null) {
            return null;
        }
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "registerCameraInput Height:" + slwVar.m184877f().m198561a() + " Width:" + slwVar.m184877f().m198562b());
        x84 x84Var = new x84(this.f204929c, this.f204928b, slwVar, this.f204934h, ts2Var);
        this.f204937k.put(x84Var.toString(), x84Var);
        if (this.f204941o == null) {
            this.f204941o = x84Var;
            if (this.f204928b.mo19715r0()) {
                ujy ujyVar = this.f204931e;
                if (ujyVar != null) {
                    ujyVar.m194141X1();
                }
                synchronized (this.f204935i) {
                    try {
                        Iterator<oq2> it = this.f204935i.iterator();
                        while (it.hasNext()) {
                            it.next().m165391r2(this.f204941o.mo103860a());
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
    public MomoPipeline mo20146F() {
        return this.f204928b;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: G */
    public e95 mo20147G(sol solVar) {
        uv00 uv00Var = this.f204928b;
        if (uv00Var == null) {
            return null;
        }
        uv00Var.mo19686U(solVar);
        return new e95(this.f204928b);
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: H */
    public void mo20148H(etf etfVar) {
        this.f204930d = etfVar;
        uv00 uv00Var = this.f204928b;
        if (uv00Var != null) {
            uv00Var.mo19682H(etfVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: I */
    public void mo20149I(ccj ccjVar, String str) {
        uv00 uv00Var = this.f204928b;
        if (uv00Var != null) {
            uv00Var.mo19683I(ccjVar, str);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: J */
    public void mo20150J(sml smlVar) {
        if (smlVar != null) {
            uv00 uv00Var = this.f204928b;
            if (uv00Var != null) {
                uv00Var.mo19677C0(smlVar);
            }
            smlVar.mo19935I1();
            return;
        }
        if (this.f204942p == null) {
            this.f204942p = new bb1(this.f204928b);
        }
        if (this.f204942p.mo100938b() != null) {
            this.f204942p.stopAudio();
        }
        this.f204942p.mo100939c(xv00.m211238a(this.f204929c, this.f204928b.mo19674A0()));
        uv00 uv00Var2 = this.f204928b;
        if (uv00Var2 != null) {
            uv00Var2.mo19677C0(this.f204942p.mo100938b());
        }
        this.f204942p.mo100937a();
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: K */
    public void mo20151K() {
        if (this.f204929c == null) {
            eyx.m118802c().m118808g("startConfRegister mParameters is null");
        }
        if (this.f204928b == null) {
            this.f204928b = vv00.m200151o(this.f204929c);
        }
        etf etfVar = this.f204930d;
        if (etfVar != null) {
            this.f204928b.mo19682H(etfVar);
        }
        ujy ujyVar = this.f204931e;
        if (ujyVar != null) {
            this.f204928b.mo19718t0(ujyVar);
        }
        mo20167l();
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: L */
    public iql mo20152L() {
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "registerEmptyInput ");
        sye syeVar = new sye(this.f204929c, this.f204928b);
        this.f204940n = syeVar;
        if (this.f204941o == null) {
            this.f204941o = syeVar;
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
    public synchronized ttl mo20153M(MomoPipelineModuleRegister.LinkType linkType, String str, eix eixVar) {
        ?? tdj0Var;
        try {
            if (this.f204941o == null) {
                return null;
            }
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "registerLinkMicPusher");
            if (eixVar != null) {
                dix.C16387d c16387dM111948h = dix.m111940d().m111948h(eixVar.m116726b());
                if (c16387dM111948h != null && c16387dM111948h.f86452e != null) {
                    pek0.m168517a().m168521e(c16387dM111948h.f86452e);
                }
                eyx.m118802c().m118808g("registerLinkMicPusher1 updateMediaConfigsForIJKByMediaConfig ");
            } else {
                eyx.m118802c().m118808g("registerLinkMicPusher1 mediaCfgParams appid is null", eixVar.m116737m());
            }
            if (linkType == MomoPipelineModuleRegister.LinkType.AGORALINK) {
                tdj0Var = TextUtils.isEmpty(str) ? new yc0(m220293U(), this.f204928b, this.f204941o.mo103860a(), this.f204929c, this.f204947u) : new yc0(m220293U(), this.f204928b, this.f204941o.mo103860a(), this.f204929c, this.f204947u, str);
            } else if (linkType == MomoPipelineModuleRegister.LinkType.WEILALINK) {
                tdj0Var = TextUtils.isEmpty(str) ? new nnp0(m220293U(), this.f204928b, this.f204941o.mo103860a(), this.f204929c, this.f204947u) : new nnp0(m220293U(), this.f204928b, this.f204941o.mo103860a(), this.f204929c, this.f204947u, str);
            } else if (linkType == MomoPipelineModuleRegister.LinkType.MOMORTCLINK) {
                tdj0Var = TextUtils.isEmpty(str) ? new o500(m220293U(), this.f204928b, this.f204941o.mo103860a(), this.f204929c, this.f204947u) : new o500(m220293U(), this.f204928b, this.f204941o.mo103860a(), this.f204929c, this.f204947u, str);
            } else if (linkType == MomoPipelineModuleRegister.LinkType.VOLCLINK) {
                tdj0Var = TextUtils.isEmpty(str) ? new udp0(m220293U(), this.f204928b, this.f204941o.mo103860a(), this.f204929c, this.f204947u) : new udp0(m220293U(), this.f204928b, this.f204941o.mo103860a(), this.f204929c, this.f204947u, str);
            } else {
                tdj0Var = TextUtils.isEmpty(str) ? new tdj0(m220293U(), this.f204928b, this.f204941o.mo103860a(), this.f204929c, this.f204947u) : new tdj0(m220293U(), this.f204928b, this.f204941o.mo103860a(), this.f204929c, this.f204947u, str);
            }
            tdj0Var.m165397x2(eixVar);
            this.f204943q = tdj0Var.mo139362m2();
            tml tmlVar = this.f204942p;
            if (tmlVar != null) {
                tmlVar.mo100939c(tdj0Var.mo139362m2());
            }
            synchronized (this.f204935i) {
                this.f204935i.add((oq2) tdj0Var);
            }
            return tdj0Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: N */
    public void mo20154N() {
        if (this.f204929c != null) {
            ii70.m136344d().m136348c("llc", this.f204929c.f177168u + "<>" + this.f204929c.f177169v);
            ujy ujyVar = this.f204931e;
            qmr qmrVar = this.f204929c;
            ujyVar.setRenderSize(qmrVar.f177168u, qmrVar.f177169v);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: O */
    public void mo20155O(boolean z) {
        this.f204932f = z;
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "setLandMode, width:" + this.f204929c.f177168u + ", height:" + this.f204929c.f177169v + ", IsLandMode:" + this.f204932f);
        ujy ujyVar = this.f204931e;
        if (ujyVar != null) {
            ujyVar.m194144a2(z, this.f204928b, this.f204929c);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: P */
    public synchronized gxl mo20156P(eix eixVar) {
        try {
            if (this.f204941o == null) {
                return null;
            }
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "registerMomoPusher");
            if (eixVar != null) {
                dix.C16387d c16387dM111948h = dix.m111940d().m111948h(eixVar.m116726b());
                if (c16387dM111948h != null && c16387dM111948h.f86452e != null) {
                    pek0.m168517a().m168521e(c16387dM111948h.f86452e);
                }
                eyx.m118802c().m118808g("registerMomoPusher updateMediaConfigsForIJKByMediaConfig ");
            } else {
                eyx.m118802c().m118808g("registerMomoPusher mediaCfgParams appid is null", eixVar.m116737m());
            }
            lw00 lw00Var = new lw00(m220293U(), this.f204928b, this.f204941o.mo103860a(), this.f204929c, this.f204947u);
            lw00Var.m165397x2(eixVar);
            synchronized (this.f204935i) {
                try {
                    for (oq2 oq2Var : this.f204935i) {
                        if (oq2Var instanceof ttl) {
                            lw00Var.m151930B2(oq2Var.mo139362m2());
                        }
                    }
                    if (xv00.m211243f() != null && xv00.m211243f().mo19925F()) {
                        lw00Var.m151930B2(xv00.m211243f());
                    }
                    this.f204935i.add(lw00Var);
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
    public void m220292T(vlw vlwVar) {
        uv00 uv00Var = this.f204928b;
        if (uv00Var != null) {
            uv00Var.mo196052e(vlwVar.f177109H);
        }
    }

    /* JADX INFO: renamed from: U */
    public Context m220293U() {
        WeakReference<Context> weakReference = this.f204933g;
        if (weakReference == null) {
            return g16.f100119a;
        }
        return weakReference.get() == null ? g16.f100119a : this.f204933g.get();
    }

    /* JADX INFO: renamed from: V */
    public void m220294V(btl btlVar, String str, int i, int i2, int i3, int i4) {
        if (this.f204928b == null) {
            throw new InvalidParameterException("Must startRegister first");
        }
        if (btlVar == null || btlVar.mo103860a() == null) {
            return;
        }
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "mergeInput" + btlVar.mo103860a().getClass().getSimpleName() + " class:" + btlVar + " key:" + str + "sourceWidth:" + i + " sourceHeight:" + i2 + " renderWidth:" + i3 + " renderHeight:" + i4);
        this.f204931e.m194135R1(btlVar.mo103860a().getInput(), str, this.f204928b.mo19691Z(btlVar.mo103860a()));
    }

    /* JADX INFO: renamed from: W */
    public synchronized tml m220295W() {
        try {
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "registerAudioInput");
            if (this.f204942p == null) {
                this.f204942p = new bb1(this.f204928b);
            }
            if (this.f204942p.mo100938b() != null) {
                this.f204942p.stopAudio();
            }
            this.f204942p.mo100939c(xv00.m211238a(this.f204929c, this.f204928b.mo19674A0()));
            this.f204942p.mo100937a();
            this.f204943q = this.f204942p.mo100938b();
        } catch (Throwable th) {
            throw th;
        }
        return this.f204942p;
    }

    /* JADX INFO: renamed from: X */
    public void m220296X() {
        WeakReference<Context> weakReference = this.f204933g;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: b */
    public void mo20157b(vlw vlwVar) {
        uv00 uv00Var = this.f204928b;
        if (uv00Var != null) {
            uv00Var.mo196049b(vlwVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: c */
    public void mo20158c(vlw vlwVar) {
        uv00 uv00Var = this.f204928b;
        if (uv00Var != null) {
            uv00Var.mo196050c(vlwVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: d */
    public void mo20159d(qmr qmrVar) {
        uv00 uv00Var = this.f204928b;
        if (uv00Var != null && uv00Var.mo19704j0() != null) {
            this.f204928b.mo19704j0().m216273P(qmrVar.f177168u, qmrVar.f177169v);
        }
        ujy ujyVar = this.f204931e;
        if (ujyVar != null) {
            ujyVar.m194138U1(qmrVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: e */
    public void mo20160e(MomoPipelineModuleRegister.InterfaceC4110a interfaceC4110a) {
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "setOnErrorListener" + interfaceC4110a);
        uv00 uv00Var = this.f204928b;
        if (uv00Var != null) {
            hu00.InterfaceC17393b interfaceC17393b = this.f204945s;
            if (interfaceC17393b != null) {
                uv00Var.mo19723y0(interfaceC17393b);
                this.f204945s = null;
            }
            if (interfaceC4110a == null) {
                return;
            }
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "setOnErrorListener success" + interfaceC4110a);
            C21780c c21780c = new C21780c(interfaceC4110a);
            this.f204945s = c21780c;
            this.f204928b.mo19699g0(c21780c);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: f */
    public void mo20161f(MomoPipelineModuleRegister.InterfaceC4112c interfaceC4112c) {
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "setRecordStateListener success");
        uv00 uv00Var = this.f204928b;
        if (uv00Var != null) {
            hu00.InterfaceC17395d interfaceC17395d = this.f204946t;
            if (interfaceC17395d != null) {
                uv00Var.mo19705k0(interfaceC17395d);
            }
            C21781d c21781d = new C21781d(interfaceC4112c);
            this.f204946t = c21781d;
            this.f204928b.mo19675B0(c21781d);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: g */
    public void mo20162g(InterfaceC21782e interfaceC21782e) {
        this.f204948v = interfaceC21782e;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    public qmr getParameters() {
        return this.f204929c;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: h */
    public void mo20163h(qmr qmrVar, boolean z) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", " changePushSize parameters:" + qmrVar.f177169v + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + qmrVar.f177168u);
        uv00 uv00Var = this.f204928b;
        if (uv00Var != null && uv00Var.mo19704j0() != null) {
            uv00 uv00Var2 = this.f204928b;
            if (z) {
                uv00Var2.mo19704j0().m216273P(qmrVar.f177169v, qmrVar.f177168u);
            } else {
                uv00Var2.mo19704j0().m216273P(qmrVar.f177168u, qmrVar.f177169v);
            }
        }
        ujy ujyVar = this.f204931e;
        if (ujyVar != null) {
            ujyVar.m194136S1(this.f204928b, qmrVar, z);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: i */
    public void mo20164i(int i, int i2, xgf0 xgf0Var) {
        uv00 uv00Var = this.f204928b;
        if (uv00Var != null) {
            uv00Var.mo19701i(i, i2, xgf0Var);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: j */
    public void mo20165j(btl btlVar) {
        if (btlVar != null) {
            if (this.f204931e != null && btlVar.mo103860a() != null && btlVar.mo103860a().getInput() != null) {
                ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "removeMerge 111" + btlVar.mo103860a().getClass().getSimpleName() + " class:" + btlVar);
                m3x m3xVarM194142Y1 = this.f204931e.m194142Y1(btlVar.mo103860a().getInput());
                yw00 yw00VarMo19691Z = this.f204928b.mo19691Z(btlVar.mo103860a());
                this.f204928b.mo19683I(btlVar.mo103860a().getInput(), yw00VarMo19691Z.m216279m());
                this.f204928b.mo19683I(m3xVarM194142Y1.f131201k, yw00VarMo19691Z.m216279m());
            }
            btlVar.mo97705G();
            if (btlVar.mo103860a() != null) {
                ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "removeMerge 222" + btlVar.mo103860a().getClass().getSimpleName() + " class:" + btlVar);
                yw00 yw00VarMo19691Z2 = this.f204928b.mo19691Z(btlVar.mo103860a());
                if (yw00VarMo19691Z2 != null) {
                    ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "removeMerge success");
                    yw00VarMo19691Z2.m216277k();
                }
            }
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: k */
    public void mo20166k(btl btlVar, String str, float f, float f2, float f3, float f4, float f5, int i, int i2, int i3) {
        int i4;
        int i5;
        if (this.f204931e == null || btlVar == null || btlVar.mo103860a() == null) {
            return;
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "setMergePosition, x:" + f + ", y:" + f2 + ", px:" + f3 + ", py:" + f4 + ",pipeline:" + btlVar.mo103860a());
        if (btlVar.mo103860a() == null || !(btlVar.mo103860a() instanceof ih0)) {
            i4 = i2;
            i5 = i3;
        } else {
            int iM136181a2 = ((ih0) btlVar.mo103860a()).m136181a2();
            int iM136180Z1 = ((ih0) btlVar.mo103860a()).m136180Z1();
            ii70.m136344d().m136348c("zk->weijiangnan", "AidInput->renderWidth:" + iM136181a2 + ", renderHeight:" + iM136180Z1);
            i4 = iM136181a2;
            i5 = iM136180Z1;
        }
        this.f204931e.m194146c2(btlVar.mo103860a().getInput(), i4, i5, str, f, f2, f3, f4, f5, i);
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: l */
    public InterfaceC4109a mo20167l() {
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "registerAudioControl");
        if (this.f204947u == null) {
            Context contextM220293U = m220293U();
            qmr qmrVar = this.f204929c;
            InterfaceC4109a interfaceC4109aM211240c = xv00.m211240c(contextM220293U, qmrVar.f177117P, qmrVar.f177119R, qmrVar.f177135d0);
            this.f204947u = interfaceC4109aM211240c;
            qmr qmrVar2 = this.f204929c;
            ((ExtAudioWrapper) interfaceC4109aM211240c).m20087I2(2048, qmrVar2.f177117P, qmrVar2.f177119R, "NULL");
        }
        uv00 uv00Var = this.f204928b;
        if (uv00Var != null) {
            InterfaceC4109a interfaceC4109a = this.f204947u;
            if (interfaceC4109a instanceof ya1) {
                uv00Var.mo19679D0((ya1) interfaceC4109a);
            }
        }
        return this.f204947u;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: m */
    public void mo20168m(qmr qmrVar) {
        uv00 uv00Var = this.f204928b;
        if (uv00Var != null && uv00Var.mo19704j0() != null) {
            this.f204928b.mo19704j0().m216273P(qmrVar.f177168u, qmrVar.f177169v);
        }
        ujy ujyVar = this.f204931e;
        if (ujyVar != null) {
            ujyVar.m194139V1(this.f204928b, qmrVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: n */
    public void mo20169n() {
        ujy ujyVar = new ujy();
        this.f204931e = ujyVar;
        qmr qmrVar = this.f204929c;
        if (qmrVar != null) {
            ujyVar.setRenderSize(qmrVar.f177168u, qmrVar.f177169v);
        }
        uv00 uv00Var = this.f204928b;
        if (uv00Var != null) {
            uv00Var.mo19718t0(this.f204931e);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: o */
    public v2m mo20170o() {
        uv00 uv00Var = this.f204928b;
        if (uv00Var == null) {
            return null;
        }
        y4e0 y4e0Var = new y4e0(this.f204929c, uv00Var);
        this.f204936j.put(y4e0Var.toString(), y4e0Var);
        if (this.f204941o == null) {
            this.f204941o = y4e0Var;
        }
        return y4e0Var;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: p */
    public void mo20171p(qmr qmrVar) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", " changePushSize parameters:" + qmrVar.f177169v + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + qmrVar.f177168u);
        uv00 uv00Var = this.f204928b;
        if (uv00Var != null && uv00Var.mo19704j0() != null) {
            this.f204928b.mo19704j0().m216273P(qmrVar.f177168u, qmrVar.f177169v);
        }
        ujy ujyVar = this.f204931e;
        if (ujyVar != null) {
            ujyVar.m194137T1(this.f204928b, qmrVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: q */
    public void mo20172q(btl btlVar, String str) {
        if (btlVar.mo103860a() != null) {
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "mergeInput" + btlVar.mo103860a().getClass().getSimpleName() + " class:" + btlVar + " key:" + str);
        }
        m220294V(btlVar, str, 480, 640, 480, 480);
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: r */
    public xsl mo20173r(int i, boolean z, eix eixVar) {
        if (this.f204928b == null) {
            return null;
        }
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "registerIjkInput type:" + i);
        fdm fdmVar = new fdm(this.f204929c, this.f204928b, m220293U(), i, z, eixVar);
        this.f204938l.put(fdmVar.toString(), fdmVar);
        if (this.f204941o == null) {
            this.f204941o = fdmVar;
        }
        return fdmVar;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: s */
    public void mo20174s(int i, int i2) {
        ujy ujyVar = this.f204931e;
        if (ujyVar != null) {
            ujyVar.m194143Z1(i, i2);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: t */
    public synchronized void mo20175t() {
        try {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "stopRegister");
            tml tmlVar = this.f204942p;
            if (tmlVar != null) {
                tmlVar.stopAudio();
                this.f204942p = null;
            }
            xv00.m211244g();
            Iterator<v2m> it = this.f204936j.values().iterator();
            while (it.hasNext()) {
                it.next().mo97705G();
            }
            Iterator<rnl> it2 = this.f204937k.values().iterator();
            while (it2.hasNext()) {
                it2.next().mo97705G();
            }
            Iterator<ysl> it3 = this.f204939m.values().iterator();
            while (it3.hasNext()) {
                it3.next().mo97705G();
            }
            Iterator<xsl> it4 = this.f204938l.values().iterator();
            while (it4.hasNext()) {
                it4.next().mo97705G();
            }
            this.f204936j.clear();
            this.f204937k.clear();
            this.f204939m.clear();
            this.f204938l.clear();
            iql iqlVar = this.f204940n;
            if (iqlVar != null) {
                iqlVar.mo97705G();
                this.f204940n = null;
            }
            if (!this.f204935i.isEmpty()) {
                synchronized (this.f204935i) {
                    try {
                        Iterator<oq2> it5 = this.f204935i.iterator();
                        while (it5.hasNext()) {
                            it5.next().mo139353f();
                        }
                        this.f204935i.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            InterfaceC4109a interfaceC4109a = this.f204947u;
            if (interfaceC4109a != null) {
                interfaceC4109a.stopSurroundMusic();
                this.f204947u.mo20111d1();
            }
            uv00 uv00Var = this.f204928b;
            if (uv00Var != null) {
                uv00Var.mo19697f();
                this.f204928b.mo19681G();
                this.f204928b.mo19694c0();
                this.f204928b.mo19713p0();
                this.f204928b.mo19692a0();
                this.f204928b.release();
            }
            this.f204946t = null;
            this.f204945s = null;
            this.f204944r = null;
            this.f204941o = null;
            m220296X();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: u */
    public void mo20176u(int i, int i2, int i3, int i4, boolean z) {
        ujy ujyVar = this.f204931e;
        if (ujyVar != null) {
            ujyVar.m194145b2(i, i2, z);
            this.f204931e.m194143Z1(i3, i4);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: v */
    public void mo20177v(qmr qmrVar) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", " changePushSize parameters:" + qmrVar.f177169v + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + qmrVar.f177168u);
        uv00 uv00Var = this.f204928b;
        if (uv00Var != null && uv00Var.mo19704j0() != null) {
            this.f204928b.mo19704j0().m216273P(qmrVar.f177168u, qmrVar.f177169v);
        }
        ujy ujyVar = this.f204931e;
        if (ujyVar != null) {
            ujyVar.m194140W1(this.f204928b, qmrVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: w */
    public void mo20178w(btl btlVar, String str, float f, float f2, float f3, float f4, float f5, int i) {
        int iM184598R1;
        int iM184597Q1;
        if (this.f204931e != null) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "setMergePosition, x:" + f + ", y:" + f2 + ", px:" + f3 + ", py:" + f4 + ",pipeline:" + btlVar.mo103860a());
            if (btlVar.mo103860a() == null || !(btlVar.mo103860a() instanceof ih0)) {
                iM184598R1 = 480;
                iM184597Q1 = 480;
            } else {
                iM184598R1 = ((ih0) btlVar.mo103860a()).m136181a2();
                iM184597Q1 = ((ih0) btlVar.mo103860a()).m136180Z1();
                ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "AidInput->renderWidth:" + iM184598R1 + ", renderHeight:" + iM184597Q1);
            }
            if (btlVar.mo103860a() != null && (btlVar.mo103860a() instanceof ski0)) {
                iM184598R1 = ((ski0) btlVar.mo103860a()).m184598R1();
                iM184597Q1 = ((ski0) btlVar.mo103860a()).m184597Q1();
                ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "TextureInput->renderWidth:" + iM184598R1 + ", renderHeight:" + iM184597Q1);
            }
            this.f204931e.m194146c2(btlVar.mo103860a().getInput(), iM184598R1, iM184597Q1, str, f, f2, f3, f4, f5, i);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: x */
    public sml mo20179x() {
        return this.f204943q;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: y */
    public void mo20180y(@NonNull qmr qmrVar) {
        this.f204929c = qmrVar;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: z */
    public synchronized void mo20181z(j1m j1mVar) {
        boolean z;
        tml tmlVar;
        try {
            if (this.f204928b != null && !this.f204935i.isEmpty()) {
                ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "unregisterPusher" + j1mVar);
                synchronized (this.f204935i) {
                    try {
                        this.f204935i.remove(j1mVar);
                        z = false;
                        for (oq2 oq2Var : this.f204935i) {
                            if (oq2Var instanceof ttl) {
                                tml tmlVar2 = this.f204942p;
                                if (tmlVar2 != null) {
                                    tmlVar2.mo100939c(oq2Var.mo139362m2());
                                }
                                z = true;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if ((j1mVar instanceof ttl) && j1mVar.mo139362m2() == this.f204943q) {
                    tml tmlVar3 = this.f204942p;
                    if (tmlVar3 != null) {
                        tmlVar3.stopAudio();
                    }
                    this.f204942p = null;
                    this.f204943q = null;
                }
                if (!z && (tmlVar = this.f204942p) != null && tmlVar != xv00.m211238a(this.f204929c, this.f204928b.mo19674A0())) {
                    this.f204942p.mo100939c(xv00.m211238a(this.f204929c, this.f204928b.mo19674A0()));
                    this.f204928b.mo19677C0(this.f204942p.mo100938b());
                    this.f204942p.mo100937a();
                }
                eyx.m118802c().m118808g("unregisterPusher mPusherList=" + this.f204935i.size());
                List<oq2> list = this.f204935i;
                if (list != null && list.size() > 0 && (this.f204942p == null || this.f204943q == null)) {
                    m220295W();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public zv00(@NonNull Context context) {
        this.f204927a = "Pipeline_Normal_pip->PIPLINE";
        this.f204934h = 0;
        this.f204936j = new PipelineConcurrentHashMap<>();
        this.f204937k = new PipelineConcurrentHashMap<>();
        this.f204938l = new PipelineConcurrentHashMap<>();
        this.f204939m = new PipelineConcurrentHashMap<>();
        this.f204933g = new WeakReference<>(context);
        this.f204935i = new ArrayList();
    }
}
