package p149l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLivePkContributor;
import com.p046p1.mobile.putong.live.base.data.BLivePkOwner;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.PkAction;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.PkView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkContributor;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class my70 extends h4t<pn40, PkView> {

    /* JADX INFO: renamed from: i */
    public final b280 f136259i;

    /* JADX INFO: renamed from: j */
    public final xz70 f136260j;

    /* JADX INFO: renamed from: k */
    public final k0b0 f136261k;

    /* JADX INFO: renamed from: l */
    public final an70 f136262l;

    /* JADX INFO: renamed from: m */
    public boolean[] f136263m;

    /* JADX INFO: renamed from: n */
    public h480 f136264n;

    /* JADX INFO: renamed from: o */
    public cl70 f136265o;

    /* JADX INFO: renamed from: l.my70$a */
    public static /* synthetic */ class C18591a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f136266a;

        static {
            int[] iArr = new int[PkAction.values().length];
            f136266a = iArr;
            try {
                iArr[PkAction.ACTION_FOLLOW_USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f136266a[PkAction.ACTION_SHOW_USER_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public my70(bsm bsmVar, PkView pkView) {
        super(bsmVar);
        this.f136263m = new boolean[]{false, false, false, false, false, false};
        mo51532C(pkView);
        this.f136260j = (xz70) m144512z2(new xz70(bsmVar, this, pkView));
        this.f136259i = (b280) m144512z2(new b280(bsmVar, this));
        this.f136261k = (k0b0) m144512z2(new k0b0(bsmVar, this));
        this.f136262l = (an70) m144512z2(new an70(bsmVar, ((PkView) this.viewModel).f51562x, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    private void m156972q4(LivePkMessage livePkMessage) {
        LongLinkLiveMessage.PkEnd pkEnd = livePkMessage.pkEnd;
        if (pkEnd.getIsLeave() && !TextUtils.equals(pkEnd.getLeaveUserId(), ((pn40) m206027E2()).m132146l0().f56011id)) {
            PkData pkDataM99904N3 = this.f136259i.m99904N3();
            if (TextUtils.equals(pkDataM99904N3.f51567pk.f44421id, pkEnd.getPk().getId())) {
                ht70.m132853j("show end toast when someone leave");
                if (pkDataM99904N3.isPking()) {
                    if (pkDataM99904N3.isPlaying()) {
                        lsi0.m151593w(R$string.f47607wa);
                    } else if (pkDataM99904N3.isPunishing()) {
                        lsi0.m151593w(R$string.f47677ze);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r4 */
    private void m156973r4(String str) {
        User userM132146l0 = ((pn40) m206027E2()).m132146l0();
        if (userM132146l0 == null) {
            return;
        }
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(new UserCardData.Builder(600).userId(str).setFromIdentity(bqq.m103386a(this, userM132146l0.f56011id, str, 600)).setTo(bqq.m103389d(this, userM132146l0.f56011id, str, 600)).setSource("live").setScene("pk").build());
    }

    /* JADX INFO: renamed from: S3 */
    public void m156974S3(PkData pkData) {
        if (!pkData.isBountyPk()) {
            if (this.f136264n == null) {
                this.f136264n = (h480) m144512z2(new h480(this.f188512e, this, ((PkView) this.viewModel).f51528G));
            }
            cl70 cl70Var = this.f136265o;
            if (cl70Var != null) {
                m144506C2(cl70Var);
                this.f136265o = null;
                return;
            }
            return;
        }
        if (this.f136265o == null) {
            this.f136265o = (cl70) m144512z2(new cl70(this.f188512e, ((PkView) this.viewModel).f51529H));
        }
        if (TEnum.equals(pkData.state, "playing")) {
            m156977X3(pkData);
        } else {
            m156984e4(pkData);
        }
        h480 h480Var = this.f136264n;
        if (h480Var != null) {
            m144506C2(h480Var);
            this.f136264n = null;
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129301d3(k480.class, new w9j() { // from class: l.dy70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f88353a.m156988i4((k480) obj);
            }
        });
        m129301d3(dm70.class, new w9j() { // from class: l.ey70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f93728a.m156989j4((dm70) obj);
            }
        });
        m129301d3(lm70.class, new w9j() { // from class: l.fy70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f99839a.m156990k4((lm70) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public String m156975T3() {
        PkData pkDataM99904N3 = this.f136259i.m99904N3();
        return pkDataM99904N3.isPking() ? pkDataM99904N3.f51567pk.f44421id : "";
    }

    /* JADX INFO: renamed from: U3 */
    public int mo127904U3() {
        return this.f136259i.m99905O3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public void mo127905V3(PkAction pkAction) {
        ht70.m132853j("handle action = " + pkAction.toString());
        int i = C18591a.f136266a[pkAction.ordinal()];
        if (i == 1) {
            this.f136260j.m211927f4(true);
        } else {
            if (i != 2) {
                return;
            }
            this.f136260j.m211943z4();
            zvf0.m220399u("e_pk_adverseprofile_button", mo77274R2(), vwb.m200311Y("liveId", ((pn40) m206027E2()).m149814k()));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public void m156976W3() {
        cl70 cl70Var = this.f136265o;
        if (cl70Var != null) {
            cl70Var.m107447K3();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void m156977X3(PkData pkData) {
        cl70 cl70Var = this.f136265o;
        if (cl70Var != null) {
            cl70Var.m107449M3(pkData.getPkBountyData());
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m156978Y3() {
        this.f136262l.m97736W3();
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m156979Z3(boolean z) {
        V v2 = this.viewModel;
        if (z) {
            ((PkView) v2).m76029f0();
        } else {
            ((PkView) v2).m76028e0();
        }
    }

    /* JADX INFO: renamed from: b4 */
    public void m156981b4() {
        h480 h480Var = this.f136264n;
        if (h480Var != null) {
            h480Var.m129233K3();
        }
    }

    /* JADX INFO: renamed from: c4 */
    public void m156982c4() {
        h480 h480Var = this.f136264n;
        if (h480Var != null) {
            h480Var.reset();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m156983d4() {
        h480 h480Var = this.f136264n;
        if (h480Var != null) {
            h480Var.m129232J3(this.f136259i.m99904N3());
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m156984e4(PkData pkData) {
        cl70 cl70Var = this.f136265o;
        if (cl70Var != null) {
            cl70Var.m107450N3(pkData);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public boolean m156985f4() {
        return this.f136259i.m99908S3();
    }

    /* JADX INFO: renamed from: g4 */
    public boolean m156986g4() {
        return this.f136259i.m99904N3().isPlaying();
    }

    /* JADX INFO: renamed from: h4 */
    public Boolean m156987h4() {
        return Boolean.valueOf(((PkView) this.viewModel).m76007C() && ypv.m215672k().m195728S4());
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ Boolean m156988i4(k480 k480Var) {
        return Boolean.valueOf(m156985f4());
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ String m156989j4(dm70 dm70Var) {
        return m156975T3();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ PkData m156990k4(lm70 lm70Var) {
        return this.f136259i.m99904N3();
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m156991l4(LivePkMessage livePkMessage) {
        String str = livePkMessage.type;
        str.getClass();
        switch (str) {
            case "pk_end":
                m156972q4(livePkMessage);
                break;
            case "pk_mute":
                mo156980a4(livePkMessage);
                break;
            case "pk_point":
                this.f136260j.m211940w4(livePkMessage);
                break;
            case "pk_punish_select":
                m156994o4(livePkMessage);
                break;
        }
    }

    /* JADX INFO: renamed from: m4 */
    public boolean m156992m4() {
        return m156985f4() && this.f136260j.m211937t4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    public void m156993n4(PkContributor pkContributor) {
        if (pkContributor == null || TextUtils.isEmpty(pkContributor.getUserId())) {
            return;
        }
        m156973r4(pkContributor.getUserId());
        final PkData pkDataM99904N3 = this.f136259i.m99904N3();
        BLivePkOwner bLivePkOwner = (BLivePkOwner) vwb.m200346r(pkDataM99904N3.f51567pk.players, new w9j() { // from class: l.ly70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(t0g0.m186871l(((BLivePkOwner) obj).userId, pkDataM99904N3.otherUserId()));
            }
        });
        if (pkContributor.isHost() || bLivePkOwner != null) {
            zvf0.m220399u("e_live_pk_contributionposition", mo77274R2(), vwb.m200311Y("anchorId", pkContributor.isHost() ? ((pn40) m206027E2()).m132146l0().f56011id : bLivePkOwner.userId), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, String.valueOf(pkContributor.getRank() + 1)), vwb.m200311Y("live_id", pkContributor.isHost() ? ((pn40) m206027E2()).m149814k() : bLivePkOwner.liveId), vwb.m200311Y("pk_type_live", ""), vwb.m200311Y("roomId", pkContributor.isHost() ? ((pn40) m206027E2()).m149818o() : bLivePkOwner.roomId));
        }
    }

    /* JADX INFO: renamed from: o4 */
    public void m156994o4(LivePkMessage livePkMessage) {
        if (!w220.m201015b() || w220.m201014a().equals(livePkMessage.getPkMvpUid())) {
            if ((w220.m201015b() || ypv.f199493a.m199329V().f56011id.equals(livePkMessage.getPkMvpUid())) && TextUtils.equals(livePkMessage.f47752id, this.f136259i.m99904N3().f51567pk.f44421id)) {
                this.f136261k.m144027V3(act());
            }
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final void m156995s4(PkData pkData) {
        ht70.m132858o(pkData);
        String string = pkData.state.toString();
        string.getClass();
        switch (string) {
            case "punishing":
            case "playing":
                m206028F2().StickerEvent.changeVisible().mo172463j(Boolean.FALSE);
                m206028F2().LiveBgEvent.showBg().mo172463j(new uwr(1));
                break;
            case "ended":
                m206028F2().StickerEvent.changeVisible().mo172463j(Boolean.TRUE);
                ((PkView) this.viewModel).m76028e0();
                m206028F2().LiveBgEvent.showBg().mo172463j(new uwr(0));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((pn40) m206027E2()).m132160q1().m189074U()).map(new gy70()).subscribe(ffw.m121193d(new e30() { // from class: l.hy70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110035a.m156991l4((LivePkMessage) obj);
            }
        }));
        duringCreated(this.f136259i.m99906P3()).subscribe(ffw.m121193d(new e30() { // from class: l.iy70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115433a.m156995s4((PkData) obj);
            }
        }));
        m129304h3(m206028F2().GiftDialogEventGroup.giftDialogStatus(), new e30() { // from class: l.jy70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120287a.m156979Z3(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public void m156996t4(List<BLivePkContributor> list, List<BLivePkContributor> list2) {
        int i;
        boolean z;
        boolean z2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            z = true;
            if (i3 >= Math.min(3, list.size())) {
                break;
            }
            if (!this.f136263m[i3]) {
                zvf0.m220368A("e_live_pk_contributionposition", mo77274R2(), vwb.m200311Y("anchorId", ((pn40) m206027E2()).m132146l0().f56011id), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, String.valueOf(i3 + 1)), vwb.m200311Y("live_id", ((pn40) m206027E2()).m149814k()), vwb.m200311Y("pk_type_live", ""), vwb.m200311Y("roomId", ((pn40) m206027E2()).m149818o()));
                this.f136263m[i3] = true;
            }
            i3++;
        }
        final PkData pkDataM99904N3 = this.f136259i.m99904N3();
        BLivePkOwner bLivePkOwner = (BLivePkOwner) vwb.m200346r(pkDataM99904N3.f51567pk.players, new w9j() { // from class: l.ky70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(t0g0.m186871l(((BLivePkOwner) obj).userId, pkDataM99904N3.otherUserId()));
            }
        });
        for (i = 3; i2 < Math.min(i, list2.size()); i = 3) {
            int i4 = i2 + 3;
            if (this.f136263m[i4]) {
                z2 = z;
            } else {
                z2 = z;
                zvf0.m220368A("e_live_pk_contributionposition", mo77274R2(), vwb.m200311Y("anchorId", bLivePkOwner.userId), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, String.valueOf(i2 + 1)), vwb.m200311Y("live_id", bLivePkOwner.liveId), vwb.m200311Y("pk_type_live", ""), vwb.m200311Y("roomId", bLivePkOwner.roomId));
                this.f136263m[i4] = z2;
            }
            i2++;
            z = z2;
        }
    }

    /* JADX INFO: renamed from: a4 */
    public void mo156980a4(LivePkMessage livePkMessage) {
    }

    /* JADX INFO: renamed from: p4 */
    public void mo127906p4(boolean z, String str, e30<Boolean> e30Var) {
    }
}
