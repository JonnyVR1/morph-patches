package p153l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.base.data.BLivePkStage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.PkAction;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkLaunchData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.internal.PkViewInternal;

/* JADX INFO: loaded from: classes5.dex */
public class l980 extends sx70 {

    /* JADX INFO: renamed from: q */
    public final t980 f130565q;

    /* JADX INFO: renamed from: r */
    public final PkLaunchData f130566r;

    /* JADX INFO: renamed from: s */
    public String f130567s;

    /* JADX INFO: renamed from: l.l980$a */
    public static /* synthetic */ class C18370a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f130568a;

        static {
            int[] iArr = new int[PkAction.values().length];
            f130568a = iArr;
            try {
                iArr[PkAction.ACTION_CTYP_TO_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f130568a[PkAction.ACTION_TIME_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public l980(dum dumVar, PkLaunchData pkLaunchData) {
        super(dumVar, pkLaunchData.pkViewInternal);
        t980 t980Var = (t980) m153103z2(new t980(dumVar));
        this.f130565q = t980Var;
        this.f171085i.m213506R3(t980Var);
        this.f130566r = pkLaunchData;
    }

    private void reset() {
        this.f171087k.m133924R3();
        this.f130565q.reset();
        this.f171086j.m148614d4();
        n180.m161091h();
        m188451W3();
    }

    /* JADX INFO: renamed from: u4 */
    private void m153348u4(int i) {
        if (i == 0) {
            mo153354V3(PkAction.ACTION_CTYP_TO_NORMAL);
        }
    }

    /* JADX INFO: renamed from: v4 */
    private void m153349v4() {
        PkLaunchData pkLaunchData = this.f130566r;
        if (pkLaunchData == null) {
            return;
        }
        this.f171085i.m213509X3(pkLaunchData.pkId);
        this.f130567s = this.f130566r.pkId;
        n180.m161093j("enter room pk id= " + this.f130567s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m153350w4(fyb fybVar) {
        m153348u4(fybVar.f101357a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public void m153351x4(PkData pkData) {
        String string = pkData.state.toString();
        int iHashCode = string.hashCode();
        if (iHashCode == -864432403) {
            if (string.equals(BLivePkStage.punishing)) {
                this.f171086j.m148631v4(true, pkData, pkData.lastStateIsPlaying());
                m188449S3(pkData);
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
            m188449S3(pkData);
            if (pkData.isOnceMore()) {
                m153352y4();
            } else {
                m213811F2().LivePkEvent.updateCurrentPk().mo199273j(pkData.f52415pk.f45269id);
            }
            m153353z4(this.f171085i.m213503N3());
        }
    }

    /* JADX INFO: renamed from: y4 */
    private void m153352y4() {
        this.f171086j.m148629t4();
        this.f171087k.m133924R3();
    }

    /* JADX INFO: renamed from: z4 */
    private void m153353z4(PkData pkData) {
        n180.m161093j("showPkView pkdata state " + pkData.state.toString());
        if (pkData.isPking()) {
            n180.m161093j("showPkView " + pkData.f52415pk.f45269id);
            this.f171086j.m148631v4(true, pkData, true);
        }
    }

    @Override // p153l.sx70
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: V3 */
    public void mo153354V3(PkAction pkAction) {
        super.mo153354V3(pkAction);
        int i = C18370a.f130568a[pkAction.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.f130565q.m189742O3(BLivePkStage.get(pkAction.getExtra()));
        } else {
            this.f171086j.m148614d4();
            this.f130565q.reset();
            n180.m161091h();
            this.f171087k.m133924R3();
            m188451W3();
            m213811F2().LivePkEvent.pkEndEvent().m199277p();
        }
    }

    @Override // p153l.sx70
    /* JADX INFO: renamed from: a4 */
    public void mo153355a4(LivePkMessage livePkMessage) {
        LongLinkLiveMessage.PkMute pkMute = livePkMessage.pkMuteInfo;
        if (pkMute != null && TextUtils.equals(m188450T3(), pkMute.getPkId())) {
            o1j0.m165651y(c680.m108112k(pkMute.getMuted(), m153357t4()));
            ((PkViewInternal) this.viewModel).m77310y0(pkMute.getMuted());
        }
    }

    @Override // p153l.sx70
    /* JADX INFO: renamed from: m4 */
    public void mo153356m4(boolean z, String str, y20<Boolean> y20Var) {
        o1j0.m165651y(c680.m108112k(true, str));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        reset();
    }

    @Override // p153l.sx70, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m153349v4();
        duringCreated(this.f171085i.m213505P3()).subscribe(dhw.m115825d(new y20() { // from class: l.j980
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118858a.m153351x4((PkData) obj);
            }
        }));
        duringCreated(m213811F2().PlayerEvent.ctypChanged().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.k980
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124460a.m153350w4((fyb) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public String m153357t4() {
        PkData pkDataM213503N3 = this.f171085i.m213503N3();
        return pkDataM213503N3.isPking() ? pkDataM213503N3.otherUser().name : "";
    }
}
