package p153l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.base.data.BLivePkStage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.PkAction;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.PkView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkLaunchData;

/* JADX INFO: loaded from: classes5.dex */
public class w980 extends s680 {

    /* JADX INFO: renamed from: p */
    public final p980 f187984p;

    /* JADX INFO: renamed from: q */
    public final PkLaunchData f187985q;

    /* JADX INFO: renamed from: r */
    public String f187986r;

    /* JADX INFO: renamed from: l.w980$a */
    public static /* synthetic */ class C21051a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f187987a;

        static {
            int[] iArr = new int[PkAction.values().length];
            f187987a = iArr;
            try {
                iArr[PkAction.ACTION_CTYP_TO_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f187987a[PkAction.ACTION_TIME_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public w980(dum dumVar, PkLaunchData pkLaunchData) {
        super(dumVar, pkLaunchData.pkView);
        p980 p980Var = (p980) m153103z2(new p980(dumVar));
        this.f187984p = p980Var;
        this.f166543i.m134138R3(p980Var);
        this.f187985q = pkLaunchData;
    }

    /* JADX INFO: renamed from: B4 */
    private void m205559B4() {
        this.f166544j.m114826v4();
        this.f166545k.m166470R3();
    }

    private void reset() {
        this.f166545k.m166470R3();
        this.f187984p.reset();
        this.f166544j.m114813e4();
        n180.m161091h();
        m184860W3();
    }

    /* JADX INFO: renamed from: A4 */
    public final void m205562A4(PkData pkData) {
        String string = pkData.state.toString();
        int iHashCode = string.hashCode();
        if (iHashCode == -864432403) {
            if (string.equals(BLivePkStage.punishing)) {
                this.f166544j.m114828x4(true, pkData, pkData.lastStateIsPlaying());
                m184858S3(pkData);
                return;
            }
            return;
        }
        if (iHashCode != -493563858) {
            if (iHashCode != 96651962) {
                return;
            }
            string.equals("ended");
        } else if (string.equals("playing")) {
            m184858S3(pkData);
            if (pkData.isOnceMore()) {
                m205559B4();
            } else {
                m213811F2().LivePkEvent.updateCurrentPk().mo199273j(pkData.f52415pk.f45269id);
            }
            m205563C4(this.f166543i.m134135N3());
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final void m205563C4(PkData pkData) {
        n180.m161093j("showPkView pkdata state " + pkData.state.toString());
        if (pkData.isPking()) {
            n180.m161093j("showPkView " + pkData.f52415pk.f45269id);
            this.f166544j.m114828x4(true, pkData, true);
        }
    }

    @Override // p153l.s680
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: V3 */
    public void mo156628V3(PkAction pkAction) {
        super.mo156628V3(pkAction);
        int i = C21051a.f187987a[pkAction.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.f187984p.m171347O3(BLivePkStage.get(pkAction.getExtra()));
        } else {
            this.f166544j.m114813e4();
            this.f187984p.reset();
            n180.m161091h();
            this.f166545k.m166470R3();
            m184860W3();
            m213811F2().LivePkEvent.pkEndEvent().m199277p();
        }
    }

    @Override // p153l.s680
    /* JADX INFO: renamed from: a4 */
    public void mo184864a4(LivePkMessage livePkMessage) {
        LongLinkLiveMessage.PkMute pkMute = livePkMessage.pkMuteInfo;
        if (pkMute != null && TextUtils.equals(m184859T3(), pkMute.getPkId())) {
            o1j0.m165651y(c680.m108112k(pkMute.getMuted(), m205564w4()));
            ((PkView) this.viewModel).m77218m0(pkMute.getMuted());
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        reset();
    }

    @Override // p153l.s680
    /* JADX INFO: renamed from: p4 */
    public void mo156629p4(boolean z, String str, y20<Boolean> y20Var) {
        o1j0.m165651y(c680.m108112k(true, str));
    }

    @Override // p153l.s680, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m205566y4();
        duringCreated(this.f166543i.m134137P3()).subscribe(dhw.m115825d(new y20() { // from class: l.u980
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178104a.m205562A4((PkData) obj);
            }
        }));
        duringCreated(m213811F2().PlayerEvent.ctypChanged().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.v980
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182967a.m205567z4((fyb) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w4 */
    public String m205564w4() {
        PkData pkDataM134135N3 = this.f166543i.m134135N3();
        return pkDataM134135N3.isPking() ? pkDataM134135N3.otherUser().name : "";
    }

    /* JADX INFO: renamed from: x4 */
    public final void m205565x4(int i) {
        if (i == 0) {
            mo156628V3(PkAction.ACTION_CTYP_TO_NORMAL);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final void m205566y4() {
        PkLaunchData pkLaunchData = this.f187985q;
        if (pkLaunchData == null) {
            return;
        }
        this.f166543i.m134144X3(pkLaunchData.pkId);
        this.f187986r = this.f187985q.pkId;
        n180.m161093j("enter room pk id= " + this.f187986r);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m205567z4(fyb fybVar) {
        m205565x4(fybVar.f101357a);
    }
}
