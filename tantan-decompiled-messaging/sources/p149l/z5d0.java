package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;
import java.util.concurrent.TimeUnit;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class z5d0<T extends ho2> extends on2<T> {

    /* JADX INFO: renamed from: x */
    public final hpd0 f201794x;

    /* JADX INFO: renamed from: y */
    public final hpd0 f201795y;

    public z5d0(bsm<T> bsmVar, LiveBubbleView liveBubbleView) {
        super(bsmVar);
        Boolean bool = Boolean.FALSE;
        this.f201794x = new hpd0("first_recharge_bubble_show", bool);
        this.f201795y = new hpd0("bottom_vip_service_bubble_show", bool);
        mo51532C(liveBubbleView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v9, types: [l.ho2] */
    /* JADX INFO: renamed from: g5 */
    public /* synthetic */ void m217294g5(Long l2) {
        User userM132146l0;
        if (((bgv) ypv.m215673l(fld0.f98151f)).m101729i() || this.f201794x.get().booleanValue() || (userM132146l0 = m206027E2().m132146l0()) == null) {
            return;
        }
        BLiveBubbleConfig bLiveBubbleConfig = new BLiveBubbleConfig();
        bLiveBubbleConfig.type = "firstRechargeBubble";
        bLiveBubbleConfig.f44340id = User.ID_TEAM_ACCOUNT;
        String str = userM132146l0.name;
        if (str.length() > 6) {
            str = String.format("%s...", str.substring(0, 6));
        }
        bLiveBubbleConfig.bubbleTextList = vwb.m200299M(ypv.f199497e.getString(R$string.f46917Qd, str));
        bLiveBubbleConfig.bubbleStartColor = "FF8817";
        bLiveBubbleConfig.bubbleEndColor = "FF8817";
        bLiveBubbleConfig.bubbleDisappear = 10;
        m124335V4(bLiveBubbleConfig);
    }

    @Override // p149l.on2, p149l.AbstractC16991g4
    /* JADX INFO: renamed from: I4 */
    public void mo124323I4(String str) {
        if (TextUtils.equals(str, "vipServiceBubble")) {
            this.f201795y.put(Boolean.TRUE);
        }
    }

    @Override // p149l.AbstractC16991g4
    /* JADX INFO: renamed from: Z4 */
    public void mo124338Z4(BLiveBubbleConfig bLiveBubbleConfig, sf3 sf3Var) {
        if (TextUtils.equals(bLiveBubbleConfig.type, "firstRechargeBubble")) {
            this.f201794x.put(Boolean.TRUE);
        } else {
            super.mo124338Z4(bLiveBubbleConfig, sf3Var);
        }
    }

    @Override // p149l.on2
    /* JADX INFO: renamed from: a5 */
    public void mo165154a5(AbstractC16991g4.a aVar, BLiveBubbleConfig bLiveBubbleConfig) {
        if (vwb.m200296J(bLiveBubbleConfig.bubbleTextList)) {
            return;
        }
        m206028F2().FollowGuideEvent.onBubbleShow().m172467p();
        String strM171344r = ptk.m171332h().m171344r(new jtk(act()).m143129u(bLiveBubbleConfig.bubbleTextList.get(0)).m143123o(t100.m186890d(4.0f)).m143109a(bLiveBubbleConfig.bubbleDisappear * 1000).m143113e(Color.parseColor("#f79533"), Color.parseColor("#f7c333")).m143119k(true).m143128t(12).m143130v(false).m143110b(new jtk.InterfaceC17856a() { // from class: l.w5d0
            @Override // p149l.jtk.InterfaceC17856a
            /* JADX INFO: renamed from: a */
            public final void mo125326a(String str) {
                ptk.m171332h().m171334g(str);
            }
        }).m143117i(jtk.f119614A).m143112d(new jtk.InterfaceC17857b() { // from class: l.x5d0
            @Override // p149l.jtk.InterfaceC17857b
            /* JADX INFO: renamed from: a */
            public final void mo135260a(String str) {
                this.f191127a.m217295f5(strArr, str);
            }
        }), aVar.f100534a, m206036Q2());
        final String[] strArr = {strM171344r};
        this.f100533v.add(strM171344r);
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m217295f5(String[] strArr, String str) {
        this.f100533v.remove(strArr[0]);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [l.ho2] */
    @Override // p149l.AbstractC16991g4
    /* JADX INFO: renamed from: k4 */
    public boolean mo124340k4(BLiveBubbleConfig bLiveBubbleConfig, sf3 sf3Var) {
        boolean zM132088R0;
        String str = bLiveBubbleConfig.type;
        str.getClass();
        switch (str) {
            case "localFollowLiveButtonBubble":
                zM132088R0 = m206027E2().m132088R0();
                return !zM132088R0;
            case "fastGiftButtonBubble":
                if (!((bgv) ypv.m215673l(fld0.f98151f)).m101730j() && super.mo124340k4(bLiveBubbleConfig, sf3Var)) {
                    return true;
                }
            case "anchorDailyTaskBubble":
            case "stickerBubble":
                return false;
            case "newUserTreasureBoxGetBubble":
                return ((Boolean) m129297F3(new he4(1700))).booleanValue() && super.mo124340k4(bLiveBubbleConfig, sf3Var);
            case "firstRechargeBubble":
                return true;
            case "vipServiceBubble":
                zM132088R0 = this.f201795y.get().booleanValue();
                return !zM132088R0;
            case "newUserTreasureBoxTakeBubble":
                return ((Boolean) m129297F3(new ie4(1700))).booleanValue() && super.mo124340k4(bLiveBubbleConfig, sf3Var);
            default:
                return super.mo124340k4(bLiveBubbleConfig, sf3Var);
        }
    }

    @Override // p149l.AbstractC16991g4
    /* JADX INFO: renamed from: l4 */
    public boolean mo124341l4() {
        return ((Boolean) m129297F3(new u4d0(1700))).booleanValue();
    }

    @Override // p149l.AbstractC16991g4, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (((bgv) ypv.m215673l(fld0.f98151f)).m101729i() || this.f201794x.get().booleanValue()) {
            return;
        }
        m129299H3(m206027E2().m132142j2(2, TimeUnit.MINUTES)).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.y5d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196416a.m217294g5((Long) obj);
            }
        }));
    }
}
