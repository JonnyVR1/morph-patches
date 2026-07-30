package p002l;

import android.graphics.Color;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import java.util.concurrent.TimeUnit;
import l.bgv;
import l.e30;
import l.ffw;
import l.fld0;
import l.hpd0;
import l.jtk;
import l.ptk;
import l.t100;
import l.vwb;
import l.ypv;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z5d0<T extends ho2> extends on2<T> {

    /* JADX INFO: renamed from: x */
    public final hpd0 f23257x;

    /* JADX INFO: renamed from: y */
    public final hpd0 f23258y;

    public z5d0(bsm<T> bsmVar, LiveBubbleView liveBubbleView) {
        super(bsmVar);
        Boolean bool = Boolean.FALSE;
        this.f23257x = new hpd0("first_recharge_bubble_show", bool);
        this.f23258y = new hpd0("bottom_vip_service_bubble_show", bool);
        C(liveBubbleView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v9, types: [l.ho2] */
    /* JADX INFO: renamed from: g5 */
    public /* synthetic */ void m27096g5(Long l2) {
        User userM14582l0;
        if (((bgv) ypv.l(fld0.f)).i() || ((Boolean) this.f23257x.get()).booleanValue() || (userM14582l0 = m25547E2().m14582l0()) == null) {
            return;
        }
        BLiveBubbleConfig bLiveBubbleConfig = new BLiveBubbleConfig();
        bLiveBubbleConfig.type = "firstRechargeBubble";
        bLiveBubbleConfig.id = "-1";
        String str = userM14582l0.name;
        if (str.length() > 6) {
            str = String.format("%s...", str.substring(0, 6));
        }
        bLiveBubbleConfig.bubbleTextList = vwb.M(ypv.e.getString(R$string.f2959Qd, str));
        bLiveBubbleConfig.bubbleStartColor = "FF8817";
        bLiveBubbleConfig.bubbleEndColor = "FF8817";
        bLiveBubbleConfig.bubbleDisappear = 10;
        m13598V4(bLiveBubbleConfig);
    }

    @Override // p002l.on2, p002l.AbstractC0583g4
    /* JADX INFO: renamed from: I4 */
    public void mo13585I4(String str) {
        if (TextUtils.equals(str, "vipServiceBubble")) {
            this.f23258y.put(Boolean.TRUE);
        }
    }

    @Override // p002l.AbstractC0583g4
    /* JADX INFO: renamed from: Z4 */
    public void mo13601Z4(BLiveBubbleConfig bLiveBubbleConfig, sf3 sf3Var) {
        if (TextUtils.equals(bLiveBubbleConfig.type, "firstRechargeBubble")) {
            this.f23257x.put(Boolean.TRUE);
        } else {
            super.mo13601Z4(bLiveBubbleConfig, sf3Var);
        }
    }

    @Override // p002l.on2
    /* JADX INFO: renamed from: a5 */
    public void mo19639a5(AbstractC0583g4.a aVar, BLiveBubbleConfig bLiveBubbleConfig) {
        if (vwb.J(bLiveBubbleConfig.bubbleTextList)) {
            return;
        }
        m25548F2().FollowGuideEvent.onBubbleShow().p();
        String strR = ptk.h().r(new jtk(act()).u((String) bLiveBubbleConfig.bubbleTextList.get(0)).o(t100.d(4.0f)).a(bLiveBubbleConfig.bubbleDisappear * 1000).e(new int[]{Color.parseColor("#f79533"), Color.parseColor("#f7c333")}).k(true).t(12).v(false).b(new jtk.a() { // from class: l.w5d0
            /* JADX INFO: renamed from: a */
            public final void m24326a(String str) {
                ptk.h().g(str);
            }
        }).i(jtk.A).d(new jtk.b() { // from class: l.x5d0
            /* JADX INFO: renamed from: a */
            public final void m25683a(String str) {
                this.f22124a.m27097f5(strArr, str);
            }
        }), aVar.f10764a, m25556Q2());
        final String[] strArr = {strR};
        this.f10763v.add(strR);
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m27097f5(String[] strArr, String str) {
        this.f10763v.remove(strArr[0]);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [l.ho2] */
    @Override // p002l.AbstractC0583g4
    /* JADX INFO: renamed from: k4 */
    public boolean mo13603k4(BLiveBubbleConfig bLiveBubbleConfig, sf3 sf3Var) {
        boolean zM14524R0;
        String str = bLiveBubbleConfig.type;
        str.getClass();
        switch (str) {
            case "localFollowLiveButtonBubble":
                zM14524R0 = m25547E2().m14524R0();
                return !zM14524R0;
            case "fastGiftButtonBubble":
                if (!((bgv) ypv.l(fld0.f)).j() && super.mo13603k4(bLiveBubbleConfig, sf3Var)) {
                    return true;
                }
            case "anchorDailyTaskBubble":
            case "stickerBubble":
                return false;
            case "newUserTreasureBoxGetBubble":
                return ((Boolean) m14184F3(new he4(1700))).booleanValue() && super.mo13603k4(bLiveBubbleConfig, sf3Var);
            case "firstRechargeBubble":
                return true;
            case "vipServiceBubble":
                zM14524R0 = ((Boolean) this.f23258y.get()).booleanValue();
                return !zM14524R0;
            case "newUserTreasureBoxTakeBubble":
                return ((Boolean) m14184F3(new ie4(1700))).booleanValue() && super.mo13603k4(bLiveBubbleConfig, sf3Var);
            default:
                return super.mo13603k4(bLiveBubbleConfig, sf3Var);
        }
    }

    @Override // p002l.AbstractC0583g4
    /* JADX INFO: renamed from: l4 */
    public boolean mo13604l4() {
        return ((Boolean) m14184F3(new u4d0(1700))).booleanValue();
    }

    @Override // p002l.AbstractC0583g4
    /* JADX INFO: renamed from: t */
    public void mo13612t() {
        super.mo13612t();
        if (((bgv) ypv.l(fld0.f)).i() || ((Boolean) this.f23257x.get()).booleanValue()) {
            return;
        }
        m14186H3(m25547E2().m14578j2(2, TimeUnit.MINUTES)).take(1).subscribe(ffw.d(new e30() { // from class: l.y5d0
            public final void call(Object obj) {
                this.f22665a.m27096g5((Long) obj);
            }
        }));
    }
}
