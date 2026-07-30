package p153l;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.pipline.meidautil.PipelineConcurrentHashMap;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.momo.piplinemomoext.input.audio.InterfaceC4260a;
import com.momo.pub.MomoPipelineModuleRegister;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class h410 implements MomoPipelineModuleRegister {

    /* JADX INFO: renamed from: a */
    private final String f107721a;

    /* JADX INFO: renamed from: b */
    private c410 f107722b;

    /* JADX INFO: renamed from: c */
    private ror f107723c;

    /* JADX INFO: renamed from: d */
    private suf f107724d;

    /* JADX INFO: renamed from: e */
    private rsy f107725e;

    /* JADX INFO: renamed from: f */
    private boolean f107726f;

    /* JADX INFO: renamed from: g */
    private WeakReference<Context> f107727g;

    /* JADX INFO: renamed from: h */
    private int f107728h;

    /* JADX INFO: renamed from: i */
    private List<fr2> f107729i;

    /* JADX INFO: renamed from: j */
    PipelineConcurrentHashMap<String, n5m> f107730j;

    /* JADX INFO: renamed from: k */
    PipelineConcurrentHashMap<String, cql> f107731k;

    /* JADX INFO: renamed from: l */
    PipelineConcurrentHashMap<String, lvl> f107732l;

    /* JADX INFO: renamed from: m */
    PipelineConcurrentHashMap<String, mvl> f107733m;

    /* JADX INFO: renamed from: n */
    private usl f107734n;

    /* JADX INFO: renamed from: o */
    private pvl f107735o;

    /* JADX INFO: renamed from: p */
    private epl f107736p;

    /* JADX INFO: renamed from: q */
    dpl f107737q;

    /* JADX INFO: renamed from: r */
    q210.InterfaceC19502c f107738r;

    /* JADX INFO: renamed from: s */
    q210.InterfaceC19501b f107739s;

    /* JADX INFO: renamed from: t */
    q210.InterfaceC19503d f107740t;

    /* JADX INFO: renamed from: u */
    InterfaceC4260a f107741u;

    /* JADX INFO: renamed from: v */
    private InterfaceC17387e f107742v;

    /* JADX INFO: renamed from: l.h410$a */
    public class C17383a implements q210.InterfaceC19502c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MomoPipelineModuleRegister.InterfaceC4262b f107743a;

        public C17383a(MomoPipelineModuleRegister.InterfaceC4262b interfaceC4262b) {
            this.f107743a = interfaceC4262b;
        }

        @Override // p153l.q210.InterfaceC19502c
        /* JADX INFO: renamed from: a */
        public synchronized void mo133538a(int i, int i2, Object obj) {
            boolean z;
            if (i == 12302) {
                try {
                    if (csx.m112235R().m112334f0()) {
                        Log.e("lqdebug", "MOMO_VIDEO_DYNAMIC_SCALING changeMomoPushSizeEx");
                        h410 h410Var = h410.this;
                        h410Var.m133533T(h410Var.f107723c);
                        i = 8197;
                    } else if (h410.this.f107742v != null) {
                        Log.e("lqdebug", "MOMO_VIDEO_DYNAMIC_SCALING onPushSizeChange");
                        h410.this.f107742v.mo20128a(h410.this.f107723c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (h410.this.f107729i) {
                z = true;
                for (fr2 fr2Var : h410.this.f107729i) {
                    if (fr2Var.m126852s2() == obj) {
                        this.f107743a.mo19379a(i, i2, fr2Var);
                    } else {
                        MomoPipelineModuleRegister.InterfaceC4262b interfaceC4262b = this.f107743a;
                        if (i == 32770) {
                            interfaceC4262b.mo19379a(i, i2, fr2Var);
                        } else {
                            interfaceC4262b.mo19379a(i, i2, null);
                        }
                    }
                    z = false;
                }
            }
            if (z) {
                this.f107743a.mo19379a(i, i2, null);
            }
        }
    }

    /* JADX INFO: renamed from: l.h410$b */
    public class C17384b implements o410.InterfaceC19026f {
        public C17384b() {
        }

        @Override // p153l.o410.InterfaceC19026f
        /* JADX INFO: renamed from: P0 */
        public void mo20958P0(g510 g510Var, int i, int i2, int i3, int i4) {
            q210.InterfaceC19502c interfaceC19502c = h410.this.f107738r;
            if (interfaceC19502c != null) {
                interfaceC19502c.mo133538a(0, 0, null);
            }
        }
    }

    /* JADX INFO: renamed from: l.h410$c */
    public class C17385c implements q210.InterfaceC19501b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MomoPipelineModuleRegister.InterfaceC4261a f107746a;

        public C17385c(MomoPipelineModuleRegister.InterfaceC4261a interfaceC4261a) {
            this.f107746a = interfaceC4261a;
        }

        @Override // p153l.q210.InterfaceC19501b
        /* JADX INFO: renamed from: q0 */
        public void mo20748q0(int i, int i2, Object obj) {
            boolean z;
            synchronized (h410.this.f107729i) {
                try {
                    z = true;
                    for (fr2 fr2Var : h410.this.f107729i) {
                        if (fr2Var.m126852s2() == obj) {
                            this.f107746a.mo19372b(i, i2, fr2Var);
                            z = false;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                this.f107746a.mo19372b(i, i2, null);
            }
        }

        @Override // p153l.q210.InterfaceC19501b
        /* JADX INFO: renamed from: w0 */
        public void mo20749w0(int i, int i2, Object obj) {
            boolean z;
            synchronized (h410.this.f107729i) {
                try {
                    z = true;
                    for (fr2 fr2Var : h410.this.f107729i) {
                        if (fr2Var.m126852s2() == obj) {
                            this.f107746a.mo19371a(i, i2, fr2Var);
                            z = false;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                this.f107746a.mo19371a(i, i2, null);
            }
        }
    }

    /* JADX INFO: renamed from: l.h410$d */
    public class C17386d implements q210.InterfaceC19503d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MomoPipelineModuleRegister.InterfaceC4263c f107748a;

        public C17386d(MomoPipelineModuleRegister.InterfaceC4263c interfaceC4263c) {
            this.f107748a = interfaceC4263c;
        }

        @Override // p153l.q210.InterfaceC19503d
        /* JADX INFO: renamed from: d0 */
        public void mo20732d0(Object obj) {
            synchronized (h410.this.f107729i) {
                try {
                    for (fr2 fr2Var : h410.this.f107729i) {
                        if (fr2Var.m126852s2() == obj) {
                            this.f107748a.mo19381b(fr2Var);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p153l.q210.InterfaceC19503d
        /* JADX INFO: renamed from: j0 */
        public void mo20740j0(Object obj) {
            fr2 fr2Var;
            synchronized (h410.this.f107729i) {
                try {
                    Iterator it = h410.this.f107729i.iterator();
                    do {
                        if (!it.hasNext()) {
                            fr2Var = null;
                            break;
                        }
                        fr2Var = (fr2) it.next();
                    } while (fr2Var.m126852s2() != obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (fr2Var != null) {
                if (fr2Var.m126854u2()) {
                    fr2Var.m126858y2(false);
                    return;
                } else {
                    this.f107748a.mo19380a(fr2Var);
                    return;
                }
            }
            if (h410.this.f107722b == null || h410.this.f107722b.mo20673A0() == null) {
                return;
            }
            h410.this.f107722b.mo20673A0().mo165950g(16386, 0, 0, obj);
        }
    }

    /* JADX INFO: renamed from: l.h410$e */
    public interface InterfaceC17387e {
        /* JADX INFO: renamed from: a */
        void mo20128a(ror rorVar);
    }

    public h410(@NonNull Activity activity) {
        this.f107721a = "Pipeline_Normal_pip->PIPLINE";
        this.f107728h = 0;
        this.f107730j = new PipelineConcurrentHashMap<>();
        this.f107731k = new PipelineConcurrentHashMap<>();
        this.f107732l = new PipelineConcurrentHashMap<>();
        this.f107733m = new PipelineConcurrentHashMap<>();
        this.f107728h = wti0.m207892c(activity);
        this.f107727g = new WeakReference<>(activity.getApplicationContext());
        this.f107729i = new ArrayList();
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: A */
    public void mo21140A(MomoPipelineModuleRegister.InterfaceC4262b interfaceC4262b) {
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "setOnInfoListener" + interfaceC4262b);
        c410 c410Var = this.f107722b;
        if (c410Var != null) {
            q210.InterfaceC19502c interfaceC19502c = this.f107738r;
            if (interfaceC19502c != null) {
                c410Var.mo20710o0(interfaceC19502c);
                this.f107738r = null;
            }
            if (interfaceC4262b == null) {
                return;
            }
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "setOnInfoListener success");
            synchronized (this.f107729i) {
                try {
                    for (fr2 fr2Var : this.f107729i) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f107738r = new C17383a(interfaceC4262b);
            this.f107722b.mo20687W(new C17384b());
            this.f107722b.mo20699h0(this.f107738r);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: B */
    public void mo21141B(@NonNull pvl pvlVar) {
        if (this.f107722b == null || pvlVar == null) {
            return;
        }
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "unregisterInput Name:" + pvlVar.getClass().getSimpleName() + " class:" + pvlVar);
        if (pvlVar instanceof cql) {
            if (this.f107731k.containsKey(pvlVar.toString())) {
                this.f107731k.remove(pvlVar.toString());
            }
        } else if (pvlVar instanceof mvl) {
            if (this.f107733m.containsKey(pvlVar.toString())) {
                this.f107733m.remove(pvlVar.toString());
            }
        } else if (pvlVar instanceof lvl) {
            if (this.f107732l.containsKey(pvlVar.toString())) {
                this.f107732l.remove(pvlVar.toString());
            }
        } else if (pvlVar instanceof n5m) {
            if (this.f107730j.containsKey(pvlVar.toString())) {
                this.f107730j.remove(pvlVar.toString());
            }
        } else if (pvlVar == this.f107734n) {
            this.f107734n = null;
        }
        if (pvlVar == this.f107735o) {
            this.f107735o = null;
            oq70.m168791d().m168795c("llc", this.f107731k.size() + "<>" + this.f107733m.size() + "<>" + this.f107732l.size() + "<>" + this.f107730j.size());
            if (this.f107731k.size() > 0 || this.f107733m.size() > 0 || this.f107732l.size() > 0) {
                return;
            }
            this.f107730j.size();
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: C */
    public synchronized void mo21142C(c4m c4mVar) {
        if (this.f107722b != null && !this.f107729i.isEmpty()) {
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "unregisterPusher" + c4mVar);
            synchronized (this.f107729i) {
                this.f107729i.remove(c4mVar);
            }
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: D */
    public void mo21143D(j410.InterfaceC17870b interfaceC17870b) {
        c410 c410Var = this.f107722b;
        if (c410Var != null) {
            c410Var.mo20677D(interfaceC17870b);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: E */
    public cql mo21144E(@NonNull row rowVar, @NonNull jt2 jt2Var) {
        if (this.f107722b == null) {
            return null;
        }
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "registerCameraInput Height:" + rowVar.m182468f().m122179a() + " Width:" + rowVar.m182468f().m122180b());
        w94 w94Var = new w94(this.f107723c, this.f107722b, rowVar, this.f107728h, jt2Var);
        this.f107731k.put(w94Var.toString(), w94Var);
        if (this.f107735o == null) {
            this.f107735o = w94Var;
            if (this.f107722b.mo20714r0()) {
                rsy rsyVar = this.f107725e;
                if (rsyVar != null) {
                    rsyVar.m183046X1();
                }
                synchronized (this.f107729i) {
                    try {
                        Iterator<fr2> it = this.f107729i.iterator();
                        while (it.hasNext()) {
                            it.next().m126851r2(this.f107735o.mo109167a());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return w94Var;
            }
        }
        return w94Var;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: F */
    public MomoPipeline mo21145F() {
        return this.f107722b;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: G */
    public fa5 mo21146G(drl drlVar) {
        c410 c410Var = this.f107722b;
        if (c410Var == null) {
            return null;
        }
        c410Var.mo20685U(drlVar);
        return new fa5(this.f107722b);
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: H */
    public void mo21147H(suf sufVar) {
        this.f107724d = sufVar;
        c410 c410Var = this.f107722b;
        if (c410Var != null) {
            c410Var.mo20681H(sufVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: I */
    public void mo21148I(wej wejVar, String str) {
        c410 c410Var = this.f107722b;
        if (c410Var != null) {
            c410Var.mo20682I(wejVar, str);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: J */
    public void mo21149J(dpl dplVar) {
        if (dplVar != null) {
            c410 c410Var = this.f107722b;
            if (c410Var != null) {
                c410Var.mo20676C0(dplVar);
            }
            dplVar.mo20934I1();
            return;
        }
        if (this.f107736p == null) {
            this.f107736p = new ib1(this.f107722b);
        }
        if (this.f107736p.mo121863b() != null) {
            this.f107736p.stopAudio();
        }
        this.f107736p.mo121864c(f410.m123866a(this.f107723c, this.f107722b.mo20673A0()));
        c410 c410Var2 = this.f107722b;
        if (c410Var2 != null) {
            c410Var2.mo20676C0(this.f107736p.mo121863b());
        }
        this.f107736p.mo121862a();
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: K */
    public void mo21150K() {
        if (this.f107723c == null) {
            b7y.m102882c().m102888g("startConfRegister mParameters is null");
        }
        if (this.f107722b == null) {
            this.f107722b = d410.m114078o(this.f107723c);
        }
        suf sufVar = this.f107724d;
        if (sufVar != null) {
            this.f107722b.mo20681H(sufVar);
        }
        rsy rsyVar = this.f107725e;
        if (rsyVar != null) {
            this.f107722b.mo20717t0(rsyVar);
        }
        mo21166l();
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: L */
    public usl mo21151L() {
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "registerEmptyInput ");
        wze wzeVar = new wze(this.f107723c, this.f107722b);
        this.f107734n = wzeVar;
        if (this.f107735o == null) {
            this.f107735o = wzeVar;
        }
        return wzeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, l.fr2, l.hwl] */
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
    public synchronized hwl mo21152M(MomoPipelineModuleRegister.LinkType linkType, String str, brx brxVar) {
        ?? xmj0Var;
        try {
            if (this.f107735o == null) {
                return null;
            }
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "registerLinkMicPusher");
            if (brxVar != null) {
                arx.C15814d c15814dM99797h = arx.m99789d().m99797h(brxVar.m106170b());
                if (c15814dM99797h != null && c15814dM99797h.f73012e != null) {
                    vnk0.m201997a().m202001e(c15814dM99797h.f73012e);
                }
                b7y.m102882c().m102888g("registerLinkMicPusher1 updateMediaConfigsForIJKByMediaConfig ");
            } else {
                b7y.m102882c().m102888g("registerLinkMicPusher1 mediaCfgParams appid is null", brxVar.m106181m());
            }
            if (linkType == MomoPipelineModuleRegister.LinkType.AGORALINK) {
                xmj0Var = TextUtils.isEmpty(str) ? new uc0(m133534U(), this.f107722b, this.f107735o.mo109167a(), this.f107723c, this.f107741u) : new uc0(m133534U(), this.f107722b, this.f107735o.mo109167a(), this.f107723c, this.f107741u, str);
            } else if (linkType == MomoPipelineModuleRegister.LinkType.WEILALINK) {
                xmj0Var = TextUtils.isEmpty(str) ? new rwp0(m133534U(), this.f107722b, this.f107735o.mo109167a(), this.f107723c, this.f107741u) : new rwp0(m133534U(), this.f107722b, this.f107735o.mo109167a(), this.f107723c, this.f107741u, str);
            } else if (linkType == MomoPipelineModuleRegister.LinkType.MOMORTCLINK) {
                xmj0Var = TextUtils.isEmpty(str) ? new ce00(m133534U(), this.f107722b, this.f107735o.mo109167a(), this.f107723c, this.f107741u) : new ce00(m133534U(), this.f107722b, this.f107735o.mo109167a(), this.f107723c, this.f107741u, str);
            } else if (linkType == MomoPipelineModuleRegister.LinkType.VOLCLINK) {
                xmj0Var = TextUtils.isEmpty(str) ? new ymp0(m133534U(), this.f107722b, this.f107735o.mo109167a(), this.f107723c, this.f107741u) : new ymp0(m133534U(), this.f107722b, this.f107735o.mo109167a(), this.f107723c, this.f107741u, str);
            } else {
                xmj0Var = TextUtils.isEmpty(str) ? new xmj0(m133534U(), this.f107722b, this.f107735o.mo109167a(), this.f107723c, this.f107741u) : new xmj0(m133534U(), this.f107722b, this.f107735o.mo109167a(), this.f107723c, this.f107741u, str);
            }
            xmj0Var.m126857x2(brxVar);
            this.f107737q = xmj0Var.mo107920m2();
            epl eplVar = this.f107736p;
            if (eplVar != null) {
                eplVar.mo121864c(xmj0Var.mo107920m2());
            }
            synchronized (this.f107729i) {
                this.f107729i.add((fr2) xmj0Var);
            }
            return xmj0Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: N */
    public void mo21153N() {
        if (this.f107723c != null) {
            oq70.m168791d().m168795c("llc", this.f107723c.f175510u + "<>" + this.f107723c.f175511v);
            rsy rsyVar = this.f107725e;
            ror rorVar = this.f107723c;
            rsyVar.setRenderSize(rorVar.f175510u, rorVar.f175511v);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: O */
    public void mo21154O(boolean z) {
        this.f107726f = z;
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "setLandMode, width:" + this.f107723c.f175510u + ", height:" + this.f107723c.f175511v + ", IsLandMode:" + this.f107726f);
        rsy rsyVar = this.f107725e;
        if (rsyVar != null) {
            rsyVar.m183049a2(z, this.f107722b, this.f107723c);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: P */
    public synchronized zzl mo21155P(brx brxVar) {
        try {
            if (this.f107735o == null) {
                return null;
            }
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "registerMomoPusher");
            if (brxVar != null) {
                arx.C15814d c15814dM99797h = arx.m99789d().m99797h(brxVar.m106170b());
                if (c15814dM99797h != null && c15814dM99797h.f73012e != null) {
                    vnk0.m201997a().m202001e(c15814dM99797h.f73012e);
                }
                b7y.m102882c().m102888g("registerMomoPusher updateMediaConfigsForIJKByMediaConfig ");
            } else {
                b7y.m102882c().m102888g("registerMomoPusher mediaCfgParams appid is null", brxVar.m106181m());
            }
            t410 t410Var = new t410(m133534U(), this.f107722b, this.f107735o.mo109167a(), this.f107723c, this.f107741u);
            t410Var.m126857x2(brxVar);
            synchronized (this.f107729i) {
                try {
                    for (fr2 fr2Var : this.f107729i) {
                        if (fr2Var instanceof hwl) {
                            t410Var.m189139B2(fr2Var.mo107920m2());
                        }
                    }
                    if (f410.m123871f() != null && f410.m123871f().mo20924F()) {
                        t410Var.m189139B2(f410.m123871f());
                    }
                    this.f107729i.add(t410Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return t410Var;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: T */
    public void m133533T(uow uowVar) {
        c410 c410Var = this.f107722b;
        if (c410Var != null) {
            c410Var.mo107822e(uowVar.f175451H);
        }
    }

    /* JADX INFO: renamed from: U */
    public Context m133534U() {
        WeakReference<Context> weakReference = this.f107727g;
        if (weakReference == null) {
            return l26.f129743a;
        }
        return weakReference.get() == null ? l26.f129743a : this.f107727g.get();
    }

    /* JADX INFO: renamed from: V */
    public void m133535V(pvl pvlVar, String str, int i, int i2, int i3, int i4) {
        if (this.f107722b == null) {
            throw new InvalidParameterException("Must startRegister first");
        }
        if (pvlVar == null || pvlVar.mo109167a() == null) {
            return;
        }
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "mergeInput" + pvlVar.mo109167a().getClass().getSimpleName() + " class:" + pvlVar + " key:" + str + "sourceWidth:" + i + " sourceHeight:" + i2 + " renderWidth:" + i3 + " renderHeight:" + i4);
        this.f107725e.m183040R1(pvlVar.mo109167a().getInput(), str, this.f107722b.mo20690Z(pvlVar.mo109167a()));
    }

    /* JADX INFO: renamed from: W */
    public synchronized epl m133536W() {
        try {
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "registerAudioInput");
            if (this.f107736p == null) {
                this.f107736p = new ib1(this.f107722b);
            }
            if (this.f107736p.mo121863b() != null) {
                this.f107736p.stopAudio();
            }
            this.f107736p.mo121864c(f410.m123866a(this.f107723c, this.f107722b.mo20673A0()));
            this.f107736p.mo121862a();
            this.f107737q = this.f107736p.mo121863b();
        } catch (Throwable th) {
            throw th;
        }
        return this.f107736p;
    }

    /* JADX INFO: renamed from: X */
    public void m133537X() {
        WeakReference<Context> weakReference = this.f107727g;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: b */
    public void mo21156b(uow uowVar) {
        c410 c410Var = this.f107722b;
        if (c410Var != null) {
            c410Var.mo107819b(uowVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: c */
    public void mo21157c(uow uowVar) {
        c410 c410Var = this.f107722b;
        if (c410Var != null) {
            c410Var.mo107820c(uowVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: d */
    public void mo21158d(ror rorVar) {
        c410 c410Var = this.f107722b;
        if (c410Var != null && c410Var.mo20703j0() != null) {
            this.f107722b.mo20703j0().m128988P(rorVar.f175510u, rorVar.f175511v);
        }
        rsy rsyVar = this.f107725e;
        if (rsyVar != null) {
            rsyVar.m183043U1(rorVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: e */
    public void mo21159e(MomoPipelineModuleRegister.InterfaceC4261a interfaceC4261a) {
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "setOnErrorListener" + interfaceC4261a);
        c410 c410Var = this.f107722b;
        if (c410Var != null) {
            q210.InterfaceC19501b interfaceC19501b = this.f107739s;
            if (interfaceC19501b != null) {
                c410Var.mo20722y0(interfaceC19501b);
                this.f107739s = null;
            }
            if (interfaceC4261a == null) {
                return;
            }
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "setOnErrorListener success" + interfaceC4261a);
            C17385c c17385c = new C17385c(interfaceC4261a);
            this.f107739s = c17385c;
            this.f107722b.mo20698g0(c17385c);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: f */
    public void mo21160f(MomoPipelineModuleRegister.InterfaceC4263c interfaceC4263c) {
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "setRecordStateListener success");
        c410 c410Var = this.f107722b;
        if (c410Var != null) {
            q210.InterfaceC19503d interfaceC19503d = this.f107740t;
            if (interfaceC19503d != null) {
                c410Var.mo20704k0(interfaceC19503d);
            }
            C17386d c17386d = new C17386d(interfaceC4263c);
            this.f107740t = c17386d;
            this.f107722b.mo20674B0(c17386d);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: g */
    public void mo21161g(InterfaceC17387e interfaceC17387e) {
        this.f107742v = interfaceC17387e;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    public ror getParameters() {
        return this.f107723c;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: h */
    public void mo21162h(ror rorVar, boolean z) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", " changePushSize parameters:" + rorVar.f175511v + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + rorVar.f175510u);
        c410 c410Var = this.f107722b;
        if (c410Var != null && c410Var.mo20703j0() != null) {
            c410 c410Var2 = this.f107722b;
            if (z) {
                c410Var2.mo20703j0().m128988P(rorVar.f175511v, rorVar.f175510u);
            } else {
                c410Var2.mo20703j0().m128988P(rorVar.f175510u, rorVar.f175511v);
            }
        }
        rsy rsyVar = this.f107725e;
        if (rsyVar != null) {
            rsyVar.m183041S1(this.f107722b, rorVar, z);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: i */
    public void mo21163i(int i, int i2, fpf0 fpf0Var) {
        c410 c410Var = this.f107722b;
        if (c410Var != null) {
            c410Var.mo20700i(i, i2, fpf0Var);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: j */
    public void mo21164j(pvl pvlVar) {
        if (pvlVar != null) {
            if (this.f107725e != null && pvlVar.mo109167a() != null && pvlVar.mo109167a().getInput() != null) {
                oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "removeMerge 111" + pvlVar.mo109167a().getClass().getSimpleName() + " class:" + pvlVar);
                l6x l6xVarM183047Y1 = this.f107725e.m183047Y1(pvlVar.mo109167a().getInput());
                g510 g510VarMo20690Z = this.f107722b.mo20690Z(pvlVar.mo109167a());
                this.f107722b.mo20682I(pvlVar.mo109167a().getInput(), g510VarMo20690Z.m128994m());
                this.f107722b.mo20682I(l6xVarM183047Y1.f130305k, g510VarMo20690Z.m128994m());
            }
            pvlVar.mo109166G();
            if (pvlVar.mo109167a() != null) {
                oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "removeMerge 222" + pvlVar.mo109167a().getClass().getSimpleName() + " class:" + pvlVar);
                g510 g510VarMo20690Z2 = this.f107722b.mo20690Z(pvlVar.mo109167a());
                if (g510VarMo20690Z2 != null) {
                    oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "removeMerge success");
                    g510VarMo20690Z2.m128992k();
                }
            }
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: k */
    public void mo21165k(pvl pvlVar, String str, float f, float f2, float f3, float f4, float f5, int i, int i2, int i3) {
        int i4;
        int i5;
        if (this.f107725e == null || pvlVar == null || pvlVar.mo109167a() == null) {
            return;
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "setMergePosition, x:" + f + ", y:" + f2 + ", px:" + f3 + ", py:" + f4 + ",pipeline:" + pvlVar.mo109167a());
        if (pvlVar.mo109167a() == null || !(pvlVar.mo109167a() instanceof eh0)) {
            i4 = i2;
            i5 = i3;
        } else {
            int iM120835a2 = ((eh0) pvlVar.mo109167a()).m120835a2();
            int iM120834Z1 = ((eh0) pvlVar.mo109167a()).m120834Z1();
            oq70.m168791d().m168795c("zk->weijiangnan", "AidInput->renderWidth:" + iM120835a2 + ", renderHeight:" + iM120834Z1);
            i4 = iM120835a2;
            i5 = iM120834Z1;
        }
        this.f107725e.m183051c2(pvlVar.mo109167a().getInput(), i4, i5, str, f, f2, f3, f4, f5, i);
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: l */
    public InterfaceC4260a mo21166l() {
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "registerAudioControl");
        if (this.f107741u == null) {
            Context contextM133534U = m133534U();
            ror rorVar = this.f107723c;
            InterfaceC4260a interfaceC4260aM123868c = f410.m123868c(contextM133534U, rorVar.f175459P, rorVar.f175461R, rorVar.f175477d0);
            this.f107741u = interfaceC4260aM123868c;
            ror rorVar2 = this.f107723c;
            ((ExtAudioWrapper) interfaceC4260aM123868c).m21086I2(2048, rorVar2.f175459P, rorVar2.f175461R, "NULL");
        }
        c410 c410Var = this.f107722b;
        if (c410Var != null) {
            InterfaceC4260a interfaceC4260a = this.f107741u;
            if (interfaceC4260a instanceof fb1) {
                c410Var.mo20678D0((fb1) interfaceC4260a);
            }
        }
        return this.f107741u;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: m */
    public void mo21167m(ror rorVar) {
        c410 c410Var = this.f107722b;
        if (c410Var != null && c410Var.mo20703j0() != null) {
            this.f107722b.mo20703j0().m128988P(rorVar.f175510u, rorVar.f175511v);
        }
        rsy rsyVar = this.f107725e;
        if (rsyVar != null) {
            rsyVar.m183044V1(this.f107722b, rorVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: n */
    public void mo21168n() {
        rsy rsyVar = new rsy();
        this.f107725e = rsyVar;
        ror rorVar = this.f107723c;
        if (rorVar != null) {
            rsyVar.setRenderSize(rorVar.f175510u, rorVar.f175511v);
        }
        c410 c410Var = this.f107722b;
        if (c410Var != null) {
            c410Var.mo20717t0(this.f107725e);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: o */
    public n5m mo21169o() {
        c410 c410Var = this.f107722b;
        if (c410Var == null) {
            return null;
        }
        cde0 cde0Var = new cde0(this.f107723c, c410Var);
        this.f107730j.put(cde0Var.toString(), cde0Var);
        if (this.f107735o == null) {
            this.f107735o = cde0Var;
        }
        return cde0Var;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: p */
    public void mo21170p(ror rorVar) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", " changePushSize parameters:" + rorVar.f175511v + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + rorVar.f175510u);
        c410 c410Var = this.f107722b;
        if (c410Var != null && c410Var.mo20703j0() != null) {
            this.f107722b.mo20703j0().m128988P(rorVar.f175510u, rorVar.f175511v);
        }
        rsy rsyVar = this.f107725e;
        if (rsyVar != null) {
            rsyVar.m183042T1(this.f107722b, rorVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: q */
    public void mo21171q(pvl pvlVar, String str) {
        if (pvlVar.mo109167a() != null) {
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "mergeInput" + pvlVar.mo109167a().getClass().getSimpleName() + " class:" + pvlVar + " key:" + str);
        }
        m133535V(pvlVar, str, 480, 640, 480, 480);
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: r */
    public lvl mo21172r(int i, boolean z, brx brxVar) {
        if (this.f107722b == null) {
            return null;
        }
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "registerIjkInput type:" + i);
        vfm vfmVar = new vfm(this.f107723c, this.f107722b, m133534U(), i, z, brxVar);
        this.f107732l.put(vfmVar.toString(), vfmVar);
        if (this.f107735o == null) {
            this.f107735o = vfmVar;
        }
        return vfmVar;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: s */
    public void mo21173s(int i, int i2) {
        rsy rsyVar = this.f107725e;
        if (rsyVar != null) {
            rsyVar.m183048Z1(i, i2);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: t */
    public synchronized void mo21174t() {
        try {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "stopRegister");
            epl eplVar = this.f107736p;
            if (eplVar != null) {
                eplVar.stopAudio();
                this.f107736p = null;
            }
            f410.m123872g();
            Iterator<n5m> it = this.f107730j.values().iterator();
            while (it.hasNext()) {
                it.next().mo109166G();
            }
            Iterator<cql> it2 = this.f107731k.values().iterator();
            while (it2.hasNext()) {
                it2.next().mo109166G();
            }
            Iterator<mvl> it3 = this.f107733m.values().iterator();
            while (it3.hasNext()) {
                it3.next().mo109166G();
            }
            Iterator<lvl> it4 = this.f107732l.values().iterator();
            while (it4.hasNext()) {
                it4.next().mo109166G();
            }
            this.f107730j.clear();
            this.f107731k.clear();
            this.f107733m.clear();
            this.f107732l.clear();
            usl uslVar = this.f107734n;
            if (uslVar != null) {
                uslVar.mo109166G();
                this.f107734n = null;
            }
            if (!this.f107729i.isEmpty()) {
                synchronized (this.f107729i) {
                    try {
                        Iterator<fr2> it5 = this.f107729i.iterator();
                        while (it5.hasNext()) {
                            it5.next().mo107911f();
                        }
                        this.f107729i.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            InterfaceC4260a interfaceC4260a = this.f107741u;
            if (interfaceC4260a != null) {
                interfaceC4260a.stopSurroundMusic();
                this.f107741u.mo21110d1();
            }
            c410 c410Var = this.f107722b;
            if (c410Var != null) {
                c410Var.mo20696f();
                this.f107722b.mo20680G();
                this.f107722b.mo20693c0();
                this.f107722b.mo20712p0();
                this.f107722b.mo20691a0();
                this.f107722b.release();
            }
            this.f107740t = null;
            this.f107739s = null;
            this.f107738r = null;
            this.f107735o = null;
            m133537X();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: u */
    public void mo21175u(int i, int i2, int i3, int i4, boolean z) {
        rsy rsyVar = this.f107725e;
        if (rsyVar != null) {
            rsyVar.m183050b2(i, i2, z);
            this.f107725e.m183048Z1(i3, i4);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: v */
    public void mo21176v(ror rorVar) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", " changePushSize parameters:" + rorVar.f175511v + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + rorVar.f175510u);
        c410 c410Var = this.f107722b;
        if (c410Var != null && c410Var.mo20703j0() != null) {
            this.f107722b.mo20703j0().m128988P(rorVar.f175510u, rorVar.f175511v);
        }
        rsy rsyVar = this.f107725e;
        if (rsyVar != null) {
            rsyVar.m183045W1(this.f107722b, rorVar);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: w */
    public void mo21177w(pvl pvlVar, String str, float f, float f2, float f3, float f4, float f5, int i) {
        int iM187868R1;
        int iM187867Q1;
        if (this.f107725e != null) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "setMergePosition, x:" + f + ", y:" + f2 + ", px:" + f3 + ", py:" + f4 + ",pipeline:" + pvlVar.mo109167a());
            if (pvlVar.mo109167a() == null || !(pvlVar.mo109167a() instanceof eh0)) {
                iM187868R1 = 480;
                iM187867Q1 = 480;
            } else {
                iM187868R1 = ((eh0) pvlVar.mo109167a()).m120835a2();
                iM187867Q1 = ((eh0) pvlVar.mo109167a()).m120834Z1();
                oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "AidInput->renderWidth:" + iM187868R1 + ", renderHeight:" + iM187867Q1);
            }
            if (pvlVar.mo109167a() != null && (pvlVar.mo109167a() instanceof sti0)) {
                iM187868R1 = ((sti0) pvlVar.mo109167a()).m187868R1();
                iM187867Q1 = ((sti0) pvlVar.mo109167a()).m187867Q1();
                oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "TextureInput->renderWidth:" + iM187868R1 + ", renderHeight:" + iM187867Q1);
            }
            this.f107725e.m183051c2(pvlVar.mo109167a().getInput(), iM187868R1, iM187867Q1, str, f, f2, f3, f4, f5, i);
        }
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: x */
    public dpl mo21178x() {
        return this.f107737q;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: y */
    public void mo21179y(@NonNull ror rorVar) {
        this.f107723c = rorVar;
    }

    @Override // com.momo.pub.MomoPipelineModuleRegister
    /* JADX INFO: renamed from: z */
    public synchronized void mo21180z(c4m c4mVar) {
        boolean z;
        epl eplVar;
        try {
            if (this.f107722b != null && !this.f107729i.isEmpty()) {
                oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "unregisterPusher" + c4mVar);
                synchronized (this.f107729i) {
                    try {
                        this.f107729i.remove(c4mVar);
                        z = false;
                        for (fr2 fr2Var : this.f107729i) {
                            if (fr2Var instanceof hwl) {
                                epl eplVar2 = this.f107736p;
                                if (eplVar2 != null) {
                                    eplVar2.mo121864c(fr2Var.mo107920m2());
                                }
                                z = true;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if ((c4mVar instanceof hwl) && c4mVar.mo107920m2() == this.f107737q) {
                    epl eplVar3 = this.f107736p;
                    if (eplVar3 != null) {
                        eplVar3.stopAudio();
                    }
                    this.f107736p = null;
                    this.f107737q = null;
                }
                if (!z && (eplVar = this.f107736p) != null && eplVar != f410.m123866a(this.f107723c, this.f107722b.mo20673A0())) {
                    this.f107736p.mo121864c(f410.m123866a(this.f107723c, this.f107722b.mo20673A0()));
                    this.f107722b.mo20676C0(this.f107736p.mo121863b());
                    this.f107736p.mo121862a();
                }
                b7y.m102882c().m102888g("unregisterPusher mPusherList=" + this.f107729i.size());
                List<fr2> list = this.f107729i;
                if (list != null && list.size() > 0 && (this.f107736p == null || this.f107737q == null)) {
                    m133536W();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public h410(@NonNull Context context) {
        this.f107721a = "Pipeline_Normal_pip->PIPLINE";
        this.f107728h = 0;
        this.f107730j = new PipelineConcurrentHashMap<>();
        this.f107731k = new PipelineConcurrentHashMap<>();
        this.f107732l = new PipelineConcurrentHashMap<>();
        this.f107733m = new PipelineConcurrentHashMap<>();
        this.f107727g = new WeakReference<>(context);
        this.f107729i = new ArrayList();
    }
}
