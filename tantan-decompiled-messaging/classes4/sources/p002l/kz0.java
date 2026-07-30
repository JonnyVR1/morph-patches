package p002l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import java.util.List;
import java.util.Map;
import l.bwr;
import l.e30;
import l.ffw;
import l.mqi0;
import l.s7m;
import l.vwb;
import l.w9j;
import l.xdl0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kz0 extends ul2<lz0> {
    public kz0(bsm<ho2> bsmVar, BottomView bottomView) {
        super(bsmVar);
        C(new lz0(bottomView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m16874l4(LiveControlMessage liveControlMessage) {
        m16879n4();
    }

    /* JADX INFO: renamed from: m4 */
    private void m16875m4(BLiveBottomButton bLiveBottomButton) {
        String string = bLiveBottomButton.localType.toString();
        string.getClass();
        switch (string) {
            case "lotteryGiftRedpacket":
                z2(new sa2(this.f22036e, bLiveBottomButton));
                break;
            case "settingButton":
                z2(new gb2(this.f22036e, bLiveBottomButton));
                break;
            case "multiCallPkButton":
                z2(new va2(this.f22036e, bLiveBottomButton));
                break;
            case "fastGiftButton":
                z2(new kq1(this.f22036e, bLiveBottomButton));
                break;
            case "firstRechargeStimulus":
                z2(new lq1(this.f22036e, bLiveBottomButton));
                break;
            case "newUserTreasureBoxButton":
                z2(new wa2(this.f22036e, bLiveBottomButton));
                break;
            case "giftButton":
                z2(new oq1(this.f22036e, bLiveBottomButton));
                break;
            case "unknown_":
                z2(new tb2(this.f22036e, bLiveBottomButton));
                break;
            case "pkButton":
                z2(new za2(this.f22036e, bLiveBottomButton));
                break;
            case "firstRechargeButton":
                z2(new mq1(this.f22036e, bLiveBottomButton));
                break;
            case "callButton":
                z2(new cq1(this.f22036e, bLiveBottomButton));
                break;
            case "intlGamePanel":
                z2(new wun(this.f22036e, 0, bLiveBottomButton));
                break;
            case "diamond":
                z2(new xp1(this.f22036e, bLiveBottomButton));
                break;
            case "multiCallButton":
                z2(new y310(this.f22036e, bLiveBottomButton));
                break;
        }
    }

    @Override // p002l.qj2
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo10687T3() {
        return ((lz0) ((bwr) this).viewModel).f15180b;
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m16876i4(BLiveBottomButton bLiveBottomButton) {
        m16875m4(bLiveBottomButton);
        s7m s7mVar = ((bwr) this).viewModel;
        View childAt = ((lz0) s7mVar).f15180b.getChildAt(((lz0) s7mVar).f15180b.getChildCount() - 1);
        if (childAt != null) {
            ((lz0) ((bwr) this).viewModel).m17624a(childAt, bLiveBottomButton.localType);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ View m16877j4(ujj ujjVar) {
        return m23515X3(ujjVar.f20676c);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m16878k4(tzd tzdVar) {
        xdl0.M(((lz0) ((bwr) this).viewModel).f15180b, !tzdVar.f20438c);
    }

    /* JADX INFO: renamed from: n4 */
    public final void m16879n4() {
        df2 df2VarM23514W3 = m23514W3(BLiveButtonType.get("firstRechargeStimulus"));
        if (df2VarM23514W3 != null) {
            C2(df2VarM23514W3);
        }
    }

    /* JADX INFO: renamed from: o4 */
    public void m16880o4(List<BLiveBottomButton> list) {
        ((lz0) ((bwr) this).viewModel).f15180b.removeAllViews();
        xdl0.M(((lz0) ((bwr) this).viewModel).f15180b, true);
        m16881p4(list);
        final long jO = mqi0.o() - r9d0.f18419l;
        eet.m12449c(this, "audience_bottom_menu_loaded", new e30() { // from class: l.iz0
            public final void call(Object obj) {
                ((Map) obj).put("watch_duration", Long.valueOf(jO));
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public final void m16881p4(List<BLiveBottomButton> list) {
        vwb.z(list, new e30() { // from class: l.jz0
            public final void call(Object obj) {
                this.f14143a.m16876i4((BLiveBottomButton) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m16882t() {
        super.t();
        m14188d3(ujj.class, new w9j() { // from class: l.dz0
            public final Object call(Object obj) {
                return this.f9490a.m16877j4((ujj) obj);
            }
        });
        duringCreated((c) m25548F2().DialogCenterEvent.changeVisibility().g()).filter(new w9j() { // from class: l.ez0
            public final Object call(Object obj) {
                return Boolean.valueOf(((tzd) obj).f20437b == 80);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.fz0
            public final void call(Object obj) {
                this.f10690a.m16878k4((tzd) obj);
            }
        }));
        duringCreated(m25547E2().m14589n1()).filter(new w9j() { // from class: l.gz0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveControlMessage) obj).type, "complete_first_recharge_stimulus"));
            }
        }).subscribe(ffw.d(new e30() { // from class: l.hz0
            public final void call(Object obj) {
                this.f12367a.m16874l4((LiveControlMessage) obj);
            }
        }));
    }
}
