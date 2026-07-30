package p153l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLivePkContributor;
import com.p051p1.mobile.putong.live.base.data.BLivePkOwner;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.PkAction;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.PkView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkContributor;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class s680 extends i6t<dw40, PkView> {

    /* JADX INFO: renamed from: i */
    public final ha80 f166543i;

    /* JADX INFO: renamed from: j */
    public final d880 f166544j;

    /* JADX INFO: renamed from: k */
    public final o8b0 f166545k;

    /* JADX INFO: renamed from: l */
    public final gv70 f166546l;

    /* JADX INFO: renamed from: m */
    public boolean[] f166547m;

    /* JADX INFO: renamed from: n */
    public nc80 f166548n;

    /* JADX INFO: renamed from: o */
    public it70 f166549o;

    /* JADX INFO: renamed from: l.s680$a */
    public static /* synthetic */ class C19996a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f166550a;

        static {
            int[] iArr = new int[PkAction.values().length];
            f166550a = iArr;
            try {
                iArr[PkAction.ACTION_FOLLOW_USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f166550a[PkAction.ACTION_SHOW_USER_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public s680(dum dumVar, PkView pkView) {
        super(dumVar);
        this.f166547m = new boolean[]{false, false, false, false, false, false};
        mo52715C(pkView);
        this.f166544j = (d880) m153103z2(new d880(dumVar, this, pkView));
        this.f166543i = (ha80) m153103z2(new ha80(dumVar, this));
        this.f166545k = (o8b0) m153103z2(new o8b0(dumVar, this));
        this.f166546l = (gv70) m153103z2(new gv70(dumVar, ((PkView) this.viewModel).f52410x, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    private void m184856q4(LivePkMessage livePkMessage) {
        LongLinkLiveMessage.PkEnd pkEnd = livePkMessage.pkEnd;
        if (pkEnd.getIsLeave() && !TextUtils.equals(pkEnd.getLeaveUserId(), ((dw40) m213810E2()).m168532l0().f56859id)) {
            PkData pkDataM134135N3 = this.f166543i.m134135N3();
            if (TextUtils.equals(pkDataM134135N3.f52415pk.f45269id, pkEnd.getPk().getId())) {
                n180.m161093j("show end toast when someone leave");
                if (pkDataM134135N3.isPking()) {
                    if (pkDataM134135N3.isPlaying()) {
                        o1j0.m165649w(R$string.f48455wa);
                    } else if (pkDataM134135N3.isPunishing()) {
                        o1j0.m165649w(R$string.f48525ze);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r4 */
    private void m184857r4(String str) {
        User userM168532l0 = ((dw40) m213810E2()).m168532l0();
        if (userM168532l0 == null) {
            return;
        }
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(new UserCardData.Builder(600).userId(str).setFromIdentity(csq.m112227a(this, userM168532l0.f56859id, str, 600)).setTo(csq.m112230d(this, userM168532l0.f56859id, str, 600)).setSource("live").setScene("pk").build());
    }

    /* JADX INFO: renamed from: S3 */
    public void m184858S3(PkData pkData) {
        if (!pkData.isBountyPk()) {
            if (this.f166548n == null) {
                this.f166548n = (nc80) m153103z2(new nc80(this.f196918e, this, ((PkView) this.viewModel).f52376G));
            }
            it70 it70Var = this.f166549o;
            if (it70Var != null) {
                m153097C2(it70Var);
                this.f166549o = null;
                return;
            }
            return;
        }
        if (this.f166549o == null) {
            this.f166549o = (it70) m153103z2(new it70(this.f196918e, ((PkView) this.viewModel).f52377H));
        }
        if (TEnum.equals(pkData.state, "playing")) {
            m184861X3(pkData);
        } else {
            m184868e4(pkData);
        }
        nc80 nc80Var = this.f166548n;
        if (nc80Var != null) {
            m153097C2(nc80Var);
            this.f166548n = null;
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138860d3(qc80.class, new qcj() { // from class: l.j680
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f118533a.m184872i4((qc80) obj);
            }
        });
        m138860d3(ju70.class, new qcj() { // from class: l.k680
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f124161a.m184873j4((ju70) obj);
            }
        });
        m138860d3(ru70.class, new qcj() { // from class: l.l680
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f130239a.m184874k4((ru70) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public String m184859T3() {
        PkData pkDataM134135N3 = this.f166543i.m134135N3();
        return pkDataM134135N3.isPking() ? pkDataM134135N3.f52415pk.f45269id : "";
    }

    /* JADX INFO: renamed from: U3 */
    public int mo156627U3() {
        return this.f166543i.m134136O3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public void mo156628V3(PkAction pkAction) {
        n180.m161093j("handle action = " + pkAction.toString());
        int i = C19996a.f166550a[pkAction.ordinal()];
        if (i == 1) {
            this.f166544j.m114814f4(true);
        } else {
            if (i != 2) {
                return;
            }
            this.f166544j.m114830z4();
            i4g0.m138523u("e_pk_adverseprofile_button", mo78457R2(), jyb.m147494Y("liveId", ((dw40) m213810E2()).m202191k()));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public void m184860W3() {
        it70 it70Var = this.f166549o;
        if (it70Var != null) {
            it70Var.m142017K3();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void m184861X3(PkData pkData) {
        it70 it70Var = this.f166549o;
        if (it70Var != null) {
            it70Var.m142019M3(pkData.getPkBountyData());
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m184862Y3() {
        this.f166546l.m132513W3();
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m184863Z3(boolean z) {
        V v2 = this.viewModel;
        if (z) {
            ((PkView) v2).m77212f0();
        } else {
            ((PkView) v2).m77211e0();
        }
    }

    /* JADX INFO: renamed from: b4 */
    public void m184865b4() {
        nc80 nc80Var = this.f166548n;
        if (nc80Var != null) {
            nc80Var.m162509K3();
        }
    }

    /* JADX INFO: renamed from: c4 */
    public void m184866c4() {
        nc80 nc80Var = this.f166548n;
        if (nc80Var != null) {
            nc80Var.reset();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m184867d4() {
        nc80 nc80Var = this.f166548n;
        if (nc80Var != null) {
            nc80Var.m162508J3(this.f166543i.m134135N3());
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m184868e4(PkData pkData) {
        it70 it70Var = this.f166549o;
        if (it70Var != null) {
            it70Var.m142020N3(pkData);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public boolean m184869f4() {
        return this.f166543i.m134139S3();
    }

    /* JADX INFO: renamed from: g4 */
    public boolean m184870g4() {
        return this.f166543i.m134135N3().isPlaying();
    }

    /* JADX INFO: renamed from: h4 */
    public Boolean m184871h4() {
        return Boolean.valueOf(((PkView) this.viewModel).m77190C() && zrv.m221193k().m203515S4());
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ Boolean m184872i4(qc80 qc80Var) {
        return Boolean.valueOf(m184869f4());
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ String m184873j4(ju70 ju70Var) {
        return m184859T3();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ PkData m184874k4(ru70 ru70Var) {
        return this.f166543i.m134135N3();
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m184875l4(LivePkMessage livePkMessage) {
        String str = livePkMessage.type;
        str.getClass();
        switch (str) {
            case "pk_end":
                m184856q4(livePkMessage);
                break;
            case "pk_mute":
                mo184864a4(livePkMessage);
                break;
            case "pk_point":
                this.f166544j.m114827w4(livePkMessage);
                break;
            case "pk_punish_select":
                m184878o4(livePkMessage);
                break;
        }
    }

    /* JADX INFO: renamed from: m4 */
    public boolean m184876m4() {
        return m184869f4() && this.f166544j.m114824t4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    public void m184877n4(PkContributor pkContributor) {
        if (pkContributor == null || TextUtils.isEmpty(pkContributor.getUserId())) {
            return;
        }
        m184857r4(pkContributor.getUserId());
        final PkData pkDataM134135N3 = this.f166543i.m134135N3();
        BLivePkOwner bLivePkOwner = (BLivePkOwner) jyb.m147529r(pkDataM134135N3.f52415pk.players, new qcj() { // from class: l.r680
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(a9g0.m96577l(((BLivePkOwner) obj).userId, pkDataM134135N3.otherUserId()));
            }
        });
        if (pkContributor.isHost() || bLivePkOwner != null) {
            i4g0.m138523u("e_live_pk_contributionposition", mo78457R2(), jyb.m147494Y("anchorId", pkContributor.isHost() ? ((dw40) m213810E2()).m168532l0().f56859id : bLivePkOwner.userId), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, String.valueOf(pkContributor.getRank() + 1)), jyb.m147494Y("live_id", pkContributor.isHost() ? ((dw40) m213810E2()).m202191k() : bLivePkOwner.liveId), jyb.m147494Y("pk_type_live", ""), jyb.m147494Y("roomId", pkContributor.isHost() ? ((dw40) m213810E2()).m202194o() : bLivePkOwner.roomId));
        }
    }

    /* JADX INFO: renamed from: o4 */
    public void m184878o4(LivePkMessage livePkMessage) {
        if (!eb20.m120149b() || eb20.m120148a().equals(livePkMessage.getPkMvpUid())) {
            if ((eb20.m120149b() || zrv.f205799a.m207651V().f56859id.equals(livePkMessage.getPkMvpUid())) && TextUtils.equals(livePkMessage.f48600id, this.f166543i.m134135N3().f52415pk.f45269id)) {
                this.f166545k.m166471V3(act());
            }
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final void m184879s4(PkData pkData) {
        n180.m161098o(pkData);
        String string = pkData.state.toString();
        string.getClass();
        switch (string) {
            case "punishing":
            case "playing":
                m213811F2().StickerEvent.changeVisible().mo199273j(Boolean.FALSE);
                m213811F2().LiveBgEvent.showBg().mo199273j(new vyr(1));
                break;
            case "ended":
                m213811F2().StickerEvent.changeVisible().mo199273j(Boolean.TRUE);
                ((PkView) this.viewModel).m77211e0();
                m213811F2().LiveBgEvent.showBg().mo199273j(new vyr(0));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((dw40) m213810E2()).m168545q1().m98256U()).map(new m680()).subscribe(dhw.m115825d(new y20() { // from class: l.n680
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140435a.m184875l4((LivePkMessage) obj);
            }
        }));
        duringCreated(this.f166543i.m134137P3()).subscribe(dhw.m115825d(new y20() { // from class: l.o680
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145149a.m184879s4((PkData) obj);
            }
        }));
        m138863h3(m213811F2().GiftDialogEventGroup.giftDialogStatus(), new y20() { // from class: l.p680
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150751a.m184863Z3(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public void m184880t4(List<BLivePkContributor> list, List<BLivePkContributor> list2) {
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
            if (!this.f166547m[i3]) {
                i4g0.m138492A("e_live_pk_contributionposition", mo78457R2(), jyb.m147494Y("anchorId", ((dw40) m213810E2()).m168532l0().f56859id), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, String.valueOf(i3 + 1)), jyb.m147494Y("live_id", ((dw40) m213810E2()).m202191k()), jyb.m147494Y("pk_type_live", ""), jyb.m147494Y("roomId", ((dw40) m213810E2()).m202194o()));
                this.f166547m[i3] = true;
            }
            i3++;
        }
        final PkData pkDataM134135N3 = this.f166543i.m134135N3();
        BLivePkOwner bLivePkOwner = (BLivePkOwner) jyb.m147529r(pkDataM134135N3.f52415pk.players, new qcj() { // from class: l.q680
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(a9g0.m96577l(((BLivePkOwner) obj).userId, pkDataM134135N3.otherUserId()));
            }
        });
        for (i = 3; i2 < Math.min(i, list2.size()); i = 3) {
            int i4 = i2 + 3;
            if (this.f166547m[i4]) {
                z2 = z;
            } else {
                z2 = z;
                i4g0.m138492A("e_live_pk_contributionposition", mo78457R2(), jyb.m147494Y("anchorId", bLivePkOwner.userId), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, String.valueOf(i2 + 1)), jyb.m147494Y("live_id", bLivePkOwner.liveId), jyb.m147494Y("pk_type_live", ""), jyb.m147494Y("roomId", bLivePkOwner.roomId));
                this.f166547m[i4] = z2;
            }
            i2++;
            z = z2;
        }
    }

    /* JADX INFO: renamed from: a4 */
    public void mo184864a4(LivePkMessage livePkMessage) {
    }

    /* JADX INFO: renamed from: p4 */
    public void mo156629p4(boolean z, String str, y20<Boolean> y20Var) {
    }
}
