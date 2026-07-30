package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.close.VirtualVoiceCloseView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.close.VoiceCloseEvent$GestureIntention;

/* JADX INFO: loaded from: classes5.dex */
public class uyl0 extends h4t<nnn0, VirtualVoiceCloseView> {

    /* JADX INFO: renamed from: j */
    public static int f178873j;

    /* JADX INFO: renamed from: i */
    public long f178874i;

    /* JADX INFO: renamed from: l.uyl0$a */
    public static /* synthetic */ class C20542a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f178875a;

        static {
            int[] iArr = new int[VoiceCloseEvent$GestureIntention.values().length];
            f178875a = iArr;
            try {
                iArr[VoiceCloseEvent$GestureIntention.LEFT2RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public uyl0(bsm bsmVar, VirtualVoiceCloseView virtualVoiceCloseView) {
        super(bsmVar);
        mo51532C(virtualVoiceCloseView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final void m196301O3(String str) {
        if (x4s.m207014d(((nnn0) m206027E2()).mo149813j().liveMode) && "game".equals(((nnn0) m206027E2()).mo149813j().template)) {
            lsi0.m151595y("游戏中,禁止收起房间");
            return;
        }
        ((nnn0) m206027E2()).m160252Q3(true);
        lqi<nnn0> lqiVar = new lqi<>((nnn0) m206027E2(), m129308n3(), (String) m129297F3(new ghc0(3400)), str);
        kur.m147297b();
        boolean zM214201l = ycp0.m214190d().m214201l(lqiVar);
        ((nnn0) m206027E2()).m132119b2(zM214201l);
        if (!zM214201l) {
            kur.m147299d();
            return;
        }
        ycp0.m214190d().m214200k();
        Act act = this.f188513f;
        if (act == null || act.isDestroyed() || this.f188513f.isFinishing()) {
            return;
        }
        this.f188513f.m66873d2();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m196302P3(z0n0 z0n0Var) {
        m196309X3(z0n0Var.f201004a, z0n0Var.f201005b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ Boolean m196303R3(o6f o6fVar) {
        return Boolean.valueOf(((nnn0) m206027E2()).m132109Y0());
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m196304S3(View view) {
        m196307V3();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        kur.m147299d();
        duringCreated(m206028F2().VoiceCloseEvent.showFloatWindow().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.pyl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151862a.m196302P3((z0n0) obj);
            }
        }));
        m129301d3(o6f.class, new w9j() { // from class: l.qyl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f156937a.m196303R3((o6f) obj);
            }
        });
        duringCreated(m206028F2().VoiceCloseEvent.voiceVirtualLiveViewGestureDetect().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.ryl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161565a.m196311Z3((VoiceCloseEvent$GestureIntention) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m196305T3(BLiveExtraResponse bLiveExtraResponse) {
        ifo0 ifo0Var = new ifo0("notice", bLiveExtraResponse.data);
        if (((nnn0) m206027E2()).mo97490p() || e0o0.m114322h(this.f188512e.f77096b)) {
            m206028F2().TopNoticeEvent.openEditNoticeDialog2().mo172463j(ifo0Var);
        } else {
            m206028F2().VirtualRoomInfoEvent.showVirtualNoticePreviewDialog().mo172463j(ifo0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public final void m196306U3(String str) {
        long jM155944o = mqi0.m155944o();
        boolean z = ((nnn0) m206027E2()).m160270h3() || e0o0.m114323i(this);
        if ((jM155944o - this.f178874i) / 1000.0f <= f178873j && !z) {
            m196307V3();
            return;
        }
        if (TextUtils.isEmpty(str)) {
            fbp0.m120397m(this);
            new xh0.C21150a(act()).m208731j("确认要离开群聊吗?").m208737p(h1c0.f105394p0).m208739r("确认离开").m208736o(new View.OnClickListener() { // from class: l.tyl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f172609a.m196304S3(view);
                }
            }).m208725d(h1c0.f105343X0).m208727f("手滑了").m208722a().m208721g();
        } else if (((nnn0) m206027E2()).m149816m().m137794a() != 0) {
            if (((nnn0) m206027E2()).m132143k0() == null && vdt.m198092b(3)) {
                return;
            }
            if (ypv.f199493a.m199374u().live.voiceWindowEnable.booleanValue()) {
                m196301O3(str);
            } else {
                kur.m147297b();
                act().m66873d2();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public void m196307V3() {
        fbp0.m120398n(this);
        u4n0.m191748g(this, ((nnn0) m206027E2()).m160261Y2(), "voice-close");
        act().m66873d2();
    }

    /* JADX INFO: renamed from: W3 */
    public void m196308W3() {
        m196306U3(null);
    }

    /* JADX INFO: renamed from: X3 */
    public void m196309X3(boolean z, String str) {
        m196306U3(str);
    }

    /* JADX INFO: renamed from: Y3 */
    public void m196310Y3() {
        m206028F2().VoiceVirtualLiveEvent.openSharePanelDialog().m172467p();
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m196311Z3(VoiceCloseEvent$GestureIntention voiceCloseEvent$GestureIntention) {
        if (C20542a.f178875a[voiceCloseEvent$GestureIntention.ordinal()] != 1) {
            return;
        }
        m196306U3("slide");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public void m196312a4() {
        duringCreated(VirtualVoiceRoomApiProvider.getVirtualVoiceRoomInfo(((nnn0) m206027E2()).m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.syl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166967a.m196305T3((BLiveExtraResponse) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        if (((nnn0) m206027E2()).m160273k3()) {
            return;
        }
        kur.m147297b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((VirtualVoiceCloseView) this.viewModel).m77325o0(((nnn0) m206027E2()).mo149813j().liveMode);
        f178873j = ypv.m215672k().m195823e4();
        this.f178874i = mqi0.m155944o();
    }
}
