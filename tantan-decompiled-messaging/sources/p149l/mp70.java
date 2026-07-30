package p149l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLivePk;
import com.p046p1.mobile.putong.live.base.data.BLivePkContributor;
import com.p046p1.mobile.putong.live.base.data.BLivePkOwner;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.PkAction;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkContributor;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.internal.PkViewInternal;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class mp70 extends h4t<pn40, PkViewInternal> {

    /* JADX INFO: renamed from: i */
    public final rp70 f135015i;

    /* JADX INFO: renamed from: j */
    public final ez70 f135016j;

    /* JADX INFO: renamed from: k */
    public final d0b0 f135017k;

    /* JADX INFO: renamed from: l */
    public final um70 f135018l;

    /* JADX INFO: renamed from: m */
    public final e460 f135019m;

    /* JADX INFO: renamed from: n */
    public final ml70 f135020n;

    /* JADX INFO: renamed from: o */
    public boolean[] f135021o;

    /* JADX INFO: renamed from: p */
    public cl70 f135022p;

    /* JADX INFO: renamed from: l.mp70$a */
    public static /* synthetic */ class C18526a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f135023a;

        static {
            int[] iArr = new int[PkAction.values().length];
            f135023a = iArr;
            try {
                iArr[PkAction.ACTION_FOLLOW_USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f135023a[PkAction.ACTION_SHOW_USER_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public mp70(bsm bsmVar, PkViewInternal pkViewInternal) {
        super(bsmVar);
        this.f135021o = new boolean[]{false, false, false, false, false, false};
        mo51532C(pkViewInternal);
        this.f135016j = (ez70) m144512z2(new ez70(bsmVar, this, pkViewInternal));
        this.f135019m = (e460) m144512z2(new e460(bsmVar, pkViewInternal));
        this.f135020n = (ml70) m144512z2(new ml70(bsmVar, pkViewInternal));
        this.f135015i = (rp70) m144512z2(new rp70(bsmVar, this));
        this.f135017k = (d0b0) m144512z2(new d0b0(bsmVar, this));
        this.f135018l = (um70) m144512z2(new um70(bsmVar, ((PkViewInternal) this.viewModel).f51571D, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public void m155774Z3(boolean z) {
        V v2 = this.viewModel;
        if (z) {
            ((PkViewInternal) v2).m76118q0();
        } else {
            ((PkViewInternal) v2).m76117p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ Boolean m155775f4(k480 k480Var) {
        return Boolean.valueOf(m155788c4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public /* synthetic */ String m155776g4(dm70 dm70Var) {
        return m155783T3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ PkData m155777h4(lm70 lm70Var) {
        return this.f135015i.m180303N3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public /* synthetic */ void m155778i4(LivePkMessage livePkMessage) {
        String str = livePkMessage.type;
        str.getClass();
        switch (str) {
            case "pk_end":
                m155779n4(livePkMessage);
                break;
            case "pk_mute":
                mo119103a4(livePkMessage);
                break;
            case "pk_point":
                this.f135016j.m118888u4(livePkMessage);
                break;
            case "pk_start":
                this.f135019m.m114667K3(livePkMessage.getPlayingBuffInfo());
                break;
            case "pk_punish_select":
                m155793l4(livePkMessage);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    private void m155779n4(LivePkMessage livePkMessage) {
        LongLinkLiveMessage.PkEnd pkEnd = livePkMessage.pkEnd;
        if (pkEnd.getIsLeave() && !TextUtils.equals(pkEnd.getLeaveUserId(), ((pn40) m206027E2()).m132146l0().f56011id)) {
            PkData pkDataM180303N3 = this.f135015i.m180303N3();
            if (TextUtils.equals(pkDataM180303N3.f51567pk.f44421id, pkEnd.getPk().getId())) {
                ht70.m132853j("show end toast when someone leave");
                if (pkDataM180303N3.isPking()) {
                    if (pkDataM180303N3.isPlaying()) {
                        lsi0.m151593w(R$string.f47607wa);
                    } else if (pkDataM180303N3.isPunishing()) {
                        lsi0.m151593w(R$string.f47677ze);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    private void m155780o4(String str) {
        User userM132146l0 = ((pn40) m206027E2()).m132146l0();
        if (userM132146l0 == null) {
            return;
        }
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(new UserCardData.Builder(600).userId(str).setFromIdentity(bqq.m103386a(this, userM132146l0.f56011id, str, 600)).setTo(bqq.m103389d(this, userM132146l0.f56011id, str, 600)).setSource("live").setScene("pk").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public void m155781p4(PkData pkData) {
        uwr uwrVar;
        ht70.m132858o(pkData);
        String string = pkData.state.toString();
        string.getClass();
        switch (string) {
            case "punishing":
            case "playing":
                m206028F2().StickerEvent.changeVisible().mo172463j(Boolean.FALSE);
                boolean zIsEmpty = TextUtils.isEmpty(pkData.f51567pk.pkBackgroundSvgaUrl);
                BLivePk bLivePk = pkData.f51567pk;
                if (zIsEmpty) {
                    uwrVar = !TextUtils.isEmpty(bLivePk.pkBackgroundUrl) ? new uwr(1, pkData.f51567pk.pkBackgroundUrl, "") : new uwr(1);
                } else {
                    uwrVar = new uwr(1, "", bLivePk.pkBackgroundSvgaUrl);
                }
                m206028F2().LiveBgEvent.showBg().mo172463j(uwrVar);
                break;
            case "ended":
                m206028F2().StickerEvent.changeVisible().mo172463j(Boolean.TRUE);
                ((PkViewInternal) this.viewModel).m76117p0();
                mm70.m155305a(this, true, false);
                m206028F2().LiveBgEvent.showBg().mo172463j(new uwr(0));
                break;
        }
        if ("playing".equals(pkData.state.toString())) {
            return;
        }
        ((PkViewInternal) this.viewModel).m76105b0();
    }

    /* JADX INFO: renamed from: S3 */
    public void m155782S3(PkData pkData) {
        boolean zIsBountyPk = pkData.isBountyPk();
        cl70 cl70Var = this.f135022p;
        if (!zIsBountyPk) {
            if (cl70Var != null) {
                m144506C2(cl70Var);
                this.f135022p = null;
                return;
            }
            return;
        }
        if (cl70Var == null) {
            this.f135022p = (cl70) m144512z2(new cl70(this.f188512e, ((PkViewInternal) this.viewModel).f51587N));
        }
        if (TEnum.equals(pkData.state, "playing")) {
            m155785X3(pkData);
        } else {
            m155787b4(pkData);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129301d3(k480.class, new w9j() { // from class: l.hp70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f108900a.m155775f4((k480) obj);
            }
        });
        m129301d3(dm70.class, new w9j() { // from class: l.ip70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f114273a.m155776g4((dm70) obj);
            }
        });
        m129301d3(lm70.class, new w9j() { // from class: l.jp70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f119133a.m155777h4((lm70) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public String m155783T3() {
        PkData pkDataM180303N3 = this.f135015i.m180303N3();
        return pkDataM180303N3.isPking() ? pkDataM180303N3.f51567pk.f44421id : "";
    }

    /* JADX INFO: renamed from: U3 */
    public int mo151135U3() {
        return this.f135015i.m180304O3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public void mo119102V3(PkAction pkAction) {
        ht70.m132853j("handle action = " + pkAction.toString());
        int i = C18526a.f135023a[pkAction.ordinal()];
        if (i == 1) {
            this.f135016j.m118873e4(true);
        } else {
            if (i != 2) {
                return;
            }
            this.f135016j.m118891x4();
            zvf0.m220399u("e_pk_adverseprofile_button", mo77274R2(), vwb.m200311Y("liveId", ((pn40) m206027E2()).m149814k()));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public void m155784W3() {
        cl70 cl70Var = this.f135022p;
        if (cl70Var != null) {
            cl70Var.m107447K3();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void m155785X3(PkData pkData) {
        cl70 cl70Var = this.f135022p;
        if (cl70Var != null) {
            cl70Var.m107449M3(pkData.getPkBountyData());
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m155786Y3() {
        this.f135018l.m194317W3();
    }

    /* JADX INFO: renamed from: b4 */
    public void m155787b4(PkData pkData) {
        cl70 cl70Var = this.f135022p;
        if (cl70Var != null) {
            cl70Var.m107450N3(pkData);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public boolean m155788c4() {
        return this.f135015i.m180307S3();
    }

    /* JADX INFO: renamed from: d4 */
    public boolean m155789d4() {
        return this.f135015i.m180303N3().isPlaying();
    }

    /* JADX INFO: renamed from: e4 */
    public Boolean m155790e4() {
        return Boolean.valueOf(((PkViewInternal) this.viewModel).m76097K() && ypv.m215672k().m195728S4());
    }

    /* JADX INFO: renamed from: j4 */
    public boolean m155791j4() {
        return m155788c4() && this.f135016j.m118885r4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public void m155792k4(PkContributor pkContributor) {
        if (pkContributor == null || TextUtils.isEmpty(pkContributor.getUserId())) {
            return;
        }
        m155780o4(pkContributor.getUserId());
        final PkData pkDataM180303N3 = this.f135015i.m180303N3();
        BLivePkOwner bLivePkOwner = (BLivePkOwner) vwb.m200346r(pkDataM180303N3.f51567pk.players, new w9j() { // from class: l.lp70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(t0g0.m186871l(((BLivePkOwner) obj).userId, pkDataM180303N3.otherUserId()));
            }
        });
        if (pkContributor.isHost() || bLivePkOwner != null) {
            zvf0.m220399u("e_live_pk_contributionposition", mo77274R2(), vwb.m200311Y("anchorId", pkContributor.isHost() ? ((pn40) m206027E2()).m132146l0().f56011id : bLivePkOwner.userId), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, String.valueOf(pkContributor.getRank() + 1)), vwb.m200311Y("live_id", pkContributor.isHost() ? ((pn40) m206027E2()).m149814k() : bLivePkOwner.liveId), vwb.m200311Y("pk_type_live", ""), vwb.m200311Y("roomId", pkContributor.isHost() ? ((pn40) m206027E2()).m149818o() : bLivePkOwner.roomId));
        }
    }

    /* JADX INFO: renamed from: l4 */
    public void m155793l4(LivePkMessage livePkMessage) {
        if (!w220.m201015b() || w220.m201014a().equals(livePkMessage.getPkMvpUid())) {
            if ((w220.m201015b() || ypv.f199493a.m199329V().f56011id.equals(livePkMessage.getPkMvpUid())) && TextUtils.equals(livePkMessage.f47752id, this.f135015i.m180303N3().f51567pk.f44421id)) {
                this.f135017k.m109476V3(act());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public void m155794q4(List<BLivePkContributor> list, List<BLivePkContributor> list2) {
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
            if (!this.f135021o[i3]) {
                zvf0.m220368A("e_live_pk_contributionposition", mo77274R2(), vwb.m200311Y("anchorId", ((pn40) m206027E2()).m132146l0().f56011id), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, String.valueOf(i3 + 1)), vwb.m200311Y("live_id", ((pn40) m206027E2()).m149814k()), vwb.m200311Y("pk_type_live", ""), vwb.m200311Y("roomId", ((pn40) m206027E2()).m149818o()));
                this.f135021o[i3] = true;
            }
            i3++;
        }
        final PkData pkDataM180303N3 = this.f135015i.m180303N3();
        BLivePkOwner bLivePkOwner = (BLivePkOwner) vwb.m200346r(pkDataM180303N3.f51567pk.players, new w9j() { // from class: l.kp70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(t0g0.m186871l(((BLivePkOwner) obj).userId, pkDataM180303N3.otherUserId()));
            }
        });
        for (i = 3; i2 < Math.min(i, list2.size()); i = 3) {
            int i4 = i2 + 3;
            if (this.f135021o[i4]) {
                z2 = z;
            } else {
                z2 = z;
                zvf0.m220368A("e_live_pk_contributionposition", mo77274R2(), vwb.m200311Y("anchorId", bLivePkOwner.userId), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, String.valueOf(i2 + 1)), vwb.m200311Y("live_id", bLivePkOwner.liveId), vwb.m200311Y("pk_type_live", ""), vwb.m200311Y("roomId", bLivePkOwner.roomId));
                this.f135021o[i4] = z2;
            }
            i2++;
            z = z2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((pn40) m206027E2()).m132160q1().m189074U()).map(new gy70()).subscribe(ffw.m121193d(new e30() { // from class: l.ep70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92610a.m155778i4((LivePkMessage) obj);
            }
        }));
        duringCreated(this.f135015i.m180305P3()).subscribe(ffw.m121193d(new e30() { // from class: l.fp70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98670a.m155781p4((PkData) obj);
            }
        }));
        m129304h3(m206028F2().GiftDialogEventGroup.giftDialogStatus(), new e30() { // from class: l.gp70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103766a.m155774Z3(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public void mo119103a4(LivePkMessage livePkMessage) {
    }

    /* JADX INFO: renamed from: m4 */
    public void mo119104m4(boolean z, String str, e30<Boolean> e30Var) {
    }
}
