package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;
import java.util.concurrent.TimeUnit;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class ced0<T extends oo2> extends vn2<T> {

    /* JADX INFO: renamed from: x */
    public final jxd0 f81340x;

    /* JADX INFO: renamed from: y */
    public final jxd0 f81341y;

    public ced0(dum<T> dumVar, LiveBubbleView liveBubbleView) {
        super(dumVar);
        Boolean bool = Boolean.FALSE;
        this.f81340x = new jxd0("first_recharge_bubble_show", bool);
        this.f81341y = new jxd0("bottom_vip_service_bubble_show", bool);
        mo52715C(liveBubbleView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v9, types: [l.oo2] */
    /* JADX INFO: renamed from: g5 */
    public /* synthetic */ void m109356g5(Long l2) {
        User userM168532l0;
        if (((civ) zrv.m221194l(htd0.f111524f)).m109965i() || this.f81340x.get().booleanValue() || (userM168532l0 = m213810E2().m168532l0()) == null) {
            return;
        }
        BLiveBubbleConfig bLiveBubbleConfig = new BLiveBubbleConfig();
        bLiveBubbleConfig.type = "firstRechargeBubble";
        bLiveBubbleConfig.f45188id = User.ID_TEAM_ACCOUNT;
        String str = userM168532l0.name;
        if (str.length() > 6) {
            str = String.format("%s...", str.substring(0, 6));
        }
        bLiveBubbleConfig.bubbleTextList = jyb.m147482M(zrv.f205803e.getString(R$string.f47765Qd, str));
        bLiveBubbleConfig.bubbleStartColor = "FF8817";
        bLiveBubbleConfig.bubbleEndColor = "FF8817";
        bLiveBubbleConfig.bubbleDisappear = 10;
        m128809V4(bLiveBubbleConfig);
    }

    @Override // p153l.vn2, p153l.AbstractC17128g4
    /* JADX INFO: renamed from: I4 */
    public void mo95417I4(String str) {
        if (TextUtils.equals(str, "vipServiceBubble")) {
            this.f81341y.put(Boolean.TRUE);
        }
    }

    @Override // p153l.AbstractC17128g4
    /* JADX INFO: renamed from: Z4 */
    public void mo109357Z4(BLiveBubbleConfig bLiveBubbleConfig, gg3 gg3Var) {
        if (TextUtils.equals(bLiveBubbleConfig.type, "firstRechargeBubble")) {
            this.f81340x.put(Boolean.TRUE);
        } else {
            super.mo109357Z4(bLiveBubbleConfig, gg3Var);
        }
    }

    @Override // p153l.vn2
    /* JADX INFO: renamed from: a5 */
    public void mo109358a5(AbstractC17128g4.a aVar, BLiveBubbleConfig bLiveBubbleConfig) {
        if (jyb.m147479J(bLiveBubbleConfig.bubbleTextList)) {
            return;
        }
        m213811F2().FollowGuideEvent.onBubbleShow().m199277p();
        String strM127789r = fwk.m127777h().m127789r(new zvk(act()).m221776u(bLiveBubbleConfig.bubbleTextList.get(0)).m221770o(qa00.m175859d(4.0f)).m221756a(bLiveBubbleConfig.bubbleDisappear * 1000).m221760e(Color.parseColor("#f79533"), Color.parseColor("#f7c333")).m221766k(true).m221775t(12).m221777v(false).m221757b(new zvk.InterfaceC21905a() { // from class: l.zdd0
            @Override // p153l.zvk.InterfaceC21905a
            /* JADX INFO: renamed from: a */
            public final void mo102709a(String str) {
                fwk.m127777h().m127779g(str);
            }
        }).m221764i(zvk.f206224A).m221759d(new zvk.InterfaceC21906b() { // from class: l.aed0
            @Override // p153l.zvk.InterfaceC21906b
            /* JADX INFO: renamed from: a */
            public final void mo96261a(String str) {
                this.f70784a.m109359f5(strArr, str);
            }
        }), aVar.f102050a, m213819Q2());
        final String[] strArr = {strM127789r};
        this.f102049v.add(strM127789r);
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m109359f5(String[] strArr, String str) {
        this.f102049v.remove(strArr[0]);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [l.oo2] */
    @Override // p153l.AbstractC17128g4
    /* JADX INFO: renamed from: k4 */
    public boolean mo95418k4(BLiveBubbleConfig bLiveBubbleConfig, gg3 gg3Var) {
        boolean zM168474R0;
        String str = bLiveBubbleConfig.type;
        str.getClass();
        switch (str) {
            case "localFollowLiveButtonBubble":
                zM168474R0 = m213810E2().m168474R0();
                return !zM168474R0;
            case "fastGiftButtonBubble":
                if (!((civ) zrv.m221194l(htd0.f111524f)).m109966j() && super.mo95418k4(bLiveBubbleConfig, gg3Var)) {
                    return true;
                }
            case "anchorDailyTaskBubble":
            case "stickerBubble":
                return false;
            case "newUserTreasureBoxGetBubble":
                return ((Boolean) m138856F3(new gf4(1700))).booleanValue() && super.mo95418k4(bLiveBubbleConfig, gg3Var);
            case "firstRechargeBubble":
                return true;
            case "vipServiceBubble":
                zM168474R0 = this.f81341y.get().booleanValue();
                return !zM168474R0;
            case "newUserTreasureBoxTakeBubble":
                return ((Boolean) m138856F3(new hf4(1700))).booleanValue() && super.mo95418k4(bLiveBubbleConfig, gg3Var);
            default:
                return super.mo95418k4(bLiveBubbleConfig, gg3Var);
        }
    }

    @Override // p153l.AbstractC17128g4
    /* JADX INFO: renamed from: l4 */
    public boolean mo109360l4() {
        return ((Boolean) m138856F3(new xcd0(1700))).booleanValue();
    }

    @Override // p153l.AbstractC17128g4, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (((civ) zrv.m221194l(htd0.f111524f)).m109965i() || this.f81340x.get().booleanValue()) {
            return;
        }
        m138858H3(m213810E2().m168528j2(2, TimeUnit.MINUTES)).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.bed0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76369a.m109356g5((Long) obj);
            }
        }));
    }
}
