package p153l;

import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.FastGiftView;
import com.tantanapp.foxstatistics.entity.EventNameEnum;

/* JADX INFO: loaded from: classes4.dex */
public class rq1 extends kf2<FastGiftView> {

    /* JADX INFO: renamed from: q */
    public BLiveGiftItem f164418q;

    public rq1(dum dumVar, BLiveBottomButton bLiveBottomButton) {
        super(dumVar, yec0.f198956W0, bLiveBottomButton);
    }

    /* JADX INFO: renamed from: A4 */
    private void m182571A4(final BLiveGiftItem bLiveGiftItem) {
        m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136086w(bLiveGiftItem, new y20() { // from class: l.oq1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148532a.m182582q4(bLiveGiftItem, (BLiveGivenGiftBrief) obj);
            }
        }, new y20() { // from class: l.pq1
            @Override // p153l.y20
            public final void call(Object obj) {
                rq1.m182573j4((Throwable) obj);
            }
        }, new y20() { // from class: l.qq1
            @Override // p153l.y20
            public final void call(Object obj) {
                rq1.m182576m4((Integer) obj);
            }
        }, true, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get(BLiveTraceServerLocation.quickgift), "")));
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m182573j4(Throwable th) {
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m182576m4(Integer num) {
    }

    /* JADX INFO: renamed from: n4 */
    private void m182577n4(String str) {
        m213811F2().BootBubbleEvent.dismissBubble().mo199273j(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m182578s4(vxj0 vxj0Var) {
        m182585u4(null);
    }

    /* JADX INFO: renamed from: x4 */
    private void m182579x4(BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem != null) {
            m182587w4(bLiveGiftItem);
        } else {
            m182586v4();
        }
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        super.mo96798V3(view);
        m182589z4();
        m182577n4("fastGiftButtonBubble");
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get("fastGiftButton");
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: a4 */
    public View mo149346a4() {
        V v2 = this.f126232k;
        if (v2 == 0) {
            return null;
        }
        return ((FastGiftView) v2).f49357g;
    }

    /* JADX INFO: renamed from: o4 */
    public final void m182580o4(BLiveGiftItem bLiveGiftItem) {
        if (act() == null) {
            return;
        }
        m182571A4(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: p4 */
    public String m182581p4(double d) {
        return String.valueOf(m138856F3(new xpj(800).m212654e(d)));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m182582q4(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        m182584t4(bLiveGivenGiftBrief.combos);
        q4f q4fVar = new q4f();
        q4fVar.f155581s = "e_quickgift";
        q4fVar.f155576n = mo78457R2();
        q4fVar.f155566d = EventNameEnum.BIZ_PAY;
        qzj.m178800q(bLiveGiftItem, bLiveGivenGiftBrief, mo78457R2(), 1, m213810E2().m168532l0().f56859id);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m182583r4(xxj xxjVar) {
        BLiveGiftItem bLiveGiftItemM111800t = cpj.m111800t(xxjVar.m213530d().m221999f());
        this.f164418q = bLiveGiftItemM111800t;
        m182579x4(bLiveGiftItemM111800t);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168561z1()).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.lq1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133133a.m182585u4((BLiveData) obj);
            }
        }));
        duringCreated(m213810E2().m168543p1()).subscribe(dhw.m115825d(new y20() { // from class: l.mq1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137988a.m182583r4((xxj) obj);
            }
        }));
        duringCreated(m213811F2().BottomEvent.hideFastGiftPrice().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.nq1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143160a.m182578s4((vxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m182584t4(int i) {
        ((FastGiftView) this.f126232k).m73335k0(i);
    }

    /* JADX INFO: renamed from: u4 */
    public void m182585u4(BLiveData bLiveData) {
        ((FastGiftView) this.f126232k).m73336l0(bLiveData);
    }

    /* JADX INFO: renamed from: v4 */
    public void m182586v4() {
        ((FastGiftView) this.f126232k).m73337m0();
    }

    /* JADX INFO: renamed from: w4 */
    public void m182587w4(BLiveGiftItem bLiveGiftItem) {
        ((FastGiftView) this.f126232k).m73338n0(bLiveGiftItem, mo78457R2());
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: y4, reason: merged with bridge method [inline-methods] */
    public void mo108591d4(FastGiftView fastGiftView) {
        super.mo108591d4(fastGiftView);
        fastGiftView.setLayoutParams(new LinearLayout.LayoutParams(qa00.m175859d(44.0f), bnl0.f77545f));
        fastGiftView.m73337m0();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.oo2] */
    /* JADX INFO: renamed from: z4 */
    public void m182589z4() {
        BLiveGiftItem bLiveGiftItem = this.f164418q;
        if (bLiveGiftItem == null) {
            return;
        }
        qzj.m178792i(bLiveGiftItem, m182581p4(bLiveGiftItem.getPrice()), mo78457R2(), 1, m213810E2().m168532l0().f56859id);
        m182580o4(this.f164418q);
    }
}
