package p153l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLivePk;
import com.p051p1.mobile.putong.live.base.data.BLivePkContributor;
import com.p051p1.mobile.putong.live.base.data.BLivePkOwner;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.PkAction;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkContributor;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.internal.PkViewInternal;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class sx70 extends i6t<dw40, PkViewInternal> {

    /* JADX INFO: renamed from: i */
    public final xx70 f171085i;

    /* JADX INFO: renamed from: j */
    public final k780 f171086j;

    /* JADX INFO: renamed from: k */
    public final h8b0 f171087k;

    /* JADX INFO: renamed from: l */
    public final av70 f171088l;

    /* JADX INFO: renamed from: m */
    public final jc60 f171089m;

    /* JADX INFO: renamed from: n */
    public final st70 f171090n;

    /* JADX INFO: renamed from: o */
    public boolean[] f171091o;

    /* JADX INFO: renamed from: p */
    public it70 f171092p;

    /* JADX INFO: renamed from: l.sx70$a */
    public static /* synthetic */ class C20175a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f171093a;

        static {
            int[] iArr = new int[PkAction.values().length];
            f171093a = iArr;
            try {
                iArr[PkAction.ACTION_FOLLOW_USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f171093a[PkAction.ACTION_SHOW_USER_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public sx70(dum dumVar, PkViewInternal pkViewInternal) {
        super(dumVar);
        this.f171091o = new boolean[]{false, false, false, false, false, false};
        mo52715C(pkViewInternal);
        this.f171086j = (k780) m153103z2(new k780(dumVar, this, pkViewInternal));
        this.f171089m = (jc60) m153103z2(new jc60(dumVar, pkViewInternal));
        this.f171090n = (st70) m153103z2(new st70(dumVar, pkViewInternal));
        this.f171085i = (xx70) m153103z2(new xx70(dumVar, this));
        this.f171087k = (h8b0) m153103z2(new h8b0(dumVar, this));
        this.f171088l = (av70) m153103z2(new av70(dumVar, ((PkViewInternal) this.viewModel).f52419D, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public void m188441Z3(boolean z) {
        V v2 = this.viewModel;
        if (z) {
            ((PkViewInternal) v2).m77301q0();
        } else {
            ((PkViewInternal) v2).m77300p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ Boolean m188442f4(qc80 qc80Var) {
        return Boolean.valueOf(m188455c4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public /* synthetic */ String m188443g4(ju70 ju70Var) {
        return m188450T3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ PkData m188444h4(ru70 ru70Var) {
        return this.f171085i.m213503N3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public /* synthetic */ void m188445i4(LivePkMessage livePkMessage) {
        String str = livePkMessage.type;
        str.getClass();
        switch (str) {
            case "pk_end":
                m188446n4(livePkMessage);
                break;
            case "pk_mute":
                mo153355a4(livePkMessage);
                break;
            case "pk_point":
                this.f171086j.m148630u4(livePkMessage);
                break;
            case "pk_start":
                this.f171089m.m144348K3(livePkMessage.getPlayingBuffInfo());
                break;
            case "pk_punish_select":
                m188460l4(livePkMessage);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    private void m188446n4(LivePkMessage livePkMessage) {
        LongLinkLiveMessage.PkEnd pkEnd = livePkMessage.pkEnd;
        if (pkEnd.getIsLeave() && !TextUtils.equals(pkEnd.getLeaveUserId(), ((dw40) m213810E2()).m168532l0().f56859id)) {
            PkData pkDataM213503N3 = this.f171085i.m213503N3();
            if (TextUtils.equals(pkDataM213503N3.f52415pk.f45269id, pkEnd.getPk().getId())) {
                n180.m161093j("show end toast when someone leave");
                if (pkDataM213503N3.isPking()) {
                    if (pkDataM213503N3.isPlaying()) {
                        o1j0.m165649w(R$string.f48455wa);
                    } else if (pkDataM213503N3.isPunishing()) {
                        o1j0.m165649w(R$string.f48525ze);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    private void m188447o4(String str) {
        User userM168532l0 = ((dw40) m213810E2()).m168532l0();
        if (userM168532l0 == null) {
            return;
        }
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(new UserCardData.Builder(600).userId(str).setFromIdentity(csq.m112227a(this, userM168532l0.f56859id, str, 600)).setTo(csq.m112230d(this, userM168532l0.f56859id, str, 600)).setSource("live").setScene("pk").build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public void m188448p4(PkData pkData) {
        vyr vyrVar;
        n180.m161098o(pkData);
        String string = pkData.state.toString();
        string.getClass();
        switch (string) {
            case "punishing":
            case "playing":
                m213811F2().StickerEvent.changeVisible().mo199273j(Boolean.FALSE);
                boolean zIsEmpty = TextUtils.isEmpty(pkData.f52415pk.pkBackgroundSvgaUrl);
                BLivePk bLivePk = pkData.f52415pk;
                if (zIsEmpty) {
                    vyrVar = !TextUtils.isEmpty(bLivePk.pkBackgroundUrl) ? new vyr(1, pkData.f52415pk.pkBackgroundUrl, "") : new vyr(1);
                } else {
                    vyrVar = new vyr(1, "", bLivePk.pkBackgroundSvgaUrl);
                }
                m213811F2().LiveBgEvent.showBg().mo199273j(vyrVar);
                break;
            case "ended":
                m213811F2().StickerEvent.changeVisible().mo199273j(Boolean.TRUE);
                ((PkViewInternal) this.viewModel).m77300p0();
                su70.m187993a(this, true, false);
                m213811F2().LiveBgEvent.showBg().mo199273j(new vyr(0));
                break;
        }
        if ("playing".equals(pkData.state.toString())) {
            return;
        }
        ((PkViewInternal) this.viewModel).m77288b0();
    }

    /* JADX INFO: renamed from: S3 */
    public void m188449S3(PkData pkData) {
        boolean zIsBountyPk = pkData.isBountyPk();
        it70 it70Var = this.f171092p;
        if (!zIsBountyPk) {
            if (it70Var != null) {
                m153097C2(it70Var);
                this.f171092p = null;
                return;
            }
            return;
        }
        if (it70Var == null) {
            this.f171092p = (it70) m153103z2(new it70(this.f196918e, ((PkViewInternal) this.viewModel).f52435N));
        }
        if (TEnum.equals(pkData.state, "playing")) {
            m188452X3(pkData);
        } else {
            m188454b4(pkData);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138860d3(qc80.class, new qcj() { // from class: l.nx70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f144093a.m188442f4((qc80) obj);
            }
        });
        m138860d3(ju70.class, new qcj() { // from class: l.ox70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f149627a.m188443g4((ju70) obj);
            }
        });
        m138860d3(ru70.class, new qcj() { // from class: l.px70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f154540a.m188444h4((ru70) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public String m188450T3() {
        PkData pkDataM213503N3 = this.f171085i.m213503N3();
        return pkDataM213503N3.isPking() ? pkDataM213503N3.f52415pk.f45269id : "";
    }

    /* JADX INFO: renamed from: U3 */
    public int mo183719U3() {
        return this.f171085i.m213504O3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public void mo153354V3(PkAction pkAction) {
        n180.m161093j("handle action = " + pkAction.toString());
        int i = C20175a.f171093a[pkAction.ordinal()];
        if (i == 1) {
            this.f171086j.m148615e4(true);
        } else {
            if (i != 2) {
                return;
            }
            this.f171086j.m148633x4();
            i4g0.m138523u("e_pk_adverseprofile_button", mo78457R2(), jyb.m147494Y("liveId", ((dw40) m213810E2()).m202191k()));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public void m188451W3() {
        it70 it70Var = this.f171092p;
        if (it70Var != null) {
            it70Var.m142017K3();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public void m188452X3(PkData pkData) {
        it70 it70Var = this.f171092p;
        if (it70Var != null) {
            it70Var.m142019M3(pkData.getPkBountyData());
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m188453Y3() {
        this.f171088l.m100422W3();
    }

    /* JADX INFO: renamed from: b4 */
    public void m188454b4(PkData pkData) {
        it70 it70Var = this.f171092p;
        if (it70Var != null) {
            it70Var.m142020N3(pkData);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public boolean m188455c4() {
        return this.f171085i.m213507S3();
    }

    /* JADX INFO: renamed from: d4 */
    public boolean m188456d4() {
        return this.f171085i.m213503N3().isPlaying();
    }

    /* JADX INFO: renamed from: e4 */
    public Boolean m188457e4() {
        return Boolean.valueOf(((PkViewInternal) this.viewModel).m77280K() && zrv.m221193k().m203515S4());
    }

    /* JADX INFO: renamed from: j4 */
    public boolean m188458j4() {
        return m188455c4() && this.f171086j.m148627r4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public void m188459k4(PkContributor pkContributor) {
        if (pkContributor == null || TextUtils.isEmpty(pkContributor.getUserId())) {
            return;
        }
        m188447o4(pkContributor.getUserId());
        final PkData pkDataM213503N3 = this.f171085i.m213503N3();
        BLivePkOwner bLivePkOwner = (BLivePkOwner) jyb.m147529r(pkDataM213503N3.f52415pk.players, new qcj() { // from class: l.rx70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(a9g0.m96577l(((BLivePkOwner) obj).userId, pkDataM213503N3.otherUserId()));
            }
        });
        if (pkContributor.isHost() || bLivePkOwner != null) {
            i4g0.m138523u("e_live_pk_contributionposition", mo78457R2(), jyb.m147494Y("anchorId", pkContributor.isHost() ? ((dw40) m213810E2()).m168532l0().f56859id : bLivePkOwner.userId), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, String.valueOf(pkContributor.getRank() + 1)), jyb.m147494Y("live_id", pkContributor.isHost() ? ((dw40) m213810E2()).m202191k() : bLivePkOwner.liveId), jyb.m147494Y("pk_type_live", ""), jyb.m147494Y("roomId", pkContributor.isHost() ? ((dw40) m213810E2()).m202194o() : bLivePkOwner.roomId));
        }
    }

    /* JADX INFO: renamed from: l4 */
    public void m188460l4(LivePkMessage livePkMessage) {
        if (!eb20.m120149b() || eb20.m120148a().equals(livePkMessage.getPkMvpUid())) {
            if ((eb20.m120149b() || zrv.f205799a.m207651V().f56859id.equals(livePkMessage.getPkMvpUid())) && TextUtils.equals(livePkMessage.f48600id, this.f171085i.m213503N3().f52415pk.f45269id)) {
                this.f171087k.m133928V3(act());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public void m188461q4(List<BLivePkContributor> list, List<BLivePkContributor> list2) {
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
            if (!this.f171091o[i3]) {
                i4g0.m138492A("e_live_pk_contributionposition", mo78457R2(), jyb.m147494Y("anchorId", ((dw40) m213810E2()).m168532l0().f56859id), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, String.valueOf(i3 + 1)), jyb.m147494Y("live_id", ((dw40) m213810E2()).m202191k()), jyb.m147494Y("pk_type_live", ""), jyb.m147494Y("roomId", ((dw40) m213810E2()).m202194o()));
                this.f171091o[i3] = true;
            }
            i3++;
        }
        final PkData pkDataM213503N3 = this.f171085i.m213503N3();
        BLivePkOwner bLivePkOwner = (BLivePkOwner) jyb.m147529r(pkDataM213503N3.f52415pk.players, new qcj() { // from class: l.qx70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(a9g0.m96577l(((BLivePkOwner) obj).userId, pkDataM213503N3.otherUserId()));
            }
        });
        for (i = 3; i2 < Math.min(i, list2.size()); i = 3) {
            int i4 = i2 + 3;
            if (this.f171091o[i4]) {
                z2 = z;
            } else {
                z2 = z;
                i4g0.m138492A("e_live_pk_contributionposition", mo78457R2(), jyb.m147494Y("anchorId", bLivePkOwner.userId), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, String.valueOf(i2 + 1)), jyb.m147494Y("live_id", bLivePkOwner.liveId), jyb.m147494Y("pk_type_live", ""), jyb.m147494Y("roomId", bLivePkOwner.roomId));
                this.f171091o[i4] = z2;
            }
            i2++;
            z = z2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((dw40) m213810E2()).m168545q1().m98256U()).map(new m680()).subscribe(dhw.m115825d(new y20() { // from class: l.kx70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129172a.m188445i4((LivePkMessage) obj);
            }
        }));
        duringCreated(this.f171085i.m213505P3()).subscribe(dhw.m115825d(new y20() { // from class: l.lx70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133909a.m188448p4((PkData) obj);
            }
        }));
        m138863h3(m213811F2().GiftDialogEventGroup.giftDialogStatus(), new y20() { // from class: l.mx70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139206a.m188441Z3(((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public void mo153355a4(LivePkMessage livePkMessage) {
    }

    /* JADX INFO: renamed from: m4 */
    public void mo153356m4(boolean z, String str, y20<Boolean> y20Var) {
    }
}
