package p149l;

import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.FastGiftView;
import com.tantanapp.foxstatistics.entity.EventNameEnum;

/* JADX INFO: loaded from: classes4.dex */
public class kq1 extends df2<FastGiftView> {

    /* JADX INFO: renamed from: q */
    public BLiveGiftItem f124216q;

    public kq1(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f168224W0, bLiveBottomButton);
    }

    /* JADX INFO: renamed from: A4 */
    private void m146899A4(final BLiveGiftItem bLiveGiftItem) {
        m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106532w(bLiveGiftItem, new e30() { // from class: l.hq1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109023a.m146910q4(bLiveGiftItem, (BLiveGivenGiftBrief) obj);
            }
        }, new e30() { // from class: l.iq1
            @Override // p149l.e30
            public final void call(Object obj) {
                kq1.m146901j4((Throwable) obj);
            }
        }, new e30() { // from class: l.jq1
            @Override // p149l.e30
            public final void call(Object obj) {
                kq1.m146904m4((Integer) obj);
            }
        }, true, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get(BLiveTraceServerLocation.quickgift), "")));
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m146901j4(Throwable th) {
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m146904m4(Integer num) {
    }

    /* JADX INFO: renamed from: n4 */
    private void m146905n4(String str) {
        m206028F2().BootBubbleEvent.dismissBubble().mo172463j(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m146906s4(soj0 soj0Var) {
        m146913u4(null);
    }

    /* JADX INFO: renamed from: x4 */
    private void m146907x4(BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem != null) {
            m146915w4(bLiveGiftItem);
        } else {
            m146914v4();
        }
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        super.mo103804V3(view);
        m146917z4();
        m146905n4("fastGiftButtonBubble");
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get("fastGiftButton");
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: a4 */
    public View mo111418a4() {
        V v2 = this.f85887k;
        if (v2 == 0) {
            return null;
        }
        return ((FastGiftView) v2).f48509g;
    }

    /* JADX INFO: renamed from: o4 */
    public final void m146908o4(BLiveGiftItem bLiveGiftItem) {
        if (act() == null) {
            return;
        }
        m146899A4(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: p4 */
    public String m146909p4(double d) {
        return String.valueOf(m129297F3(new hnj(800).m131941e(d)));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m146910q4(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        m146912t4(bLiveGivenGiftBrief.combos);
        l3f l3fVar = new l3f();
        l3fVar.f125900s = "e_quickgift";
        l3fVar.f125895n = mo77274R2();
        l3fVar.f125885d = EventNameEnum.BIZ_PAY;
        axj.m99443q(bLiveGiftItem, bLiveGivenGiftBrief, mo77274R2(), 1, m206027E2().m132146l0().f56011id);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m146911r4(hvj hvjVar) {
        BLiveGiftItem bLiveGiftItemM155433t = mmj.m155433t(hvjVar.m133171d().m143509f());
        this.f124216q = bLiveGiftItemM155433t;
        m146907x4(bLiveGiftItemM155433t);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132177z1()).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.eq1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92749a.m146913u4((BLiveData) obj);
            }
        }));
        duringCreated(m206027E2().m132158p1()).subscribe(ffw.m121193d(new e30() { // from class: l.fq1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98756a.m146911r4((hvj) obj);
            }
        }));
        duringCreated(m206028F2().BottomEvent.hideFastGiftPrice().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.gq1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103870a.m146906s4((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m146912t4(int i) {
        ((FastGiftView) this.f85887k).m72152k0(i);
    }

    /* JADX INFO: renamed from: u4 */
    public void m146913u4(BLiveData bLiveData) {
        ((FastGiftView) this.f85887k).m72153l0(bLiveData);
    }

    /* JADX INFO: renamed from: v4 */
    public void m146914v4() {
        ((FastGiftView) this.f85887k).m72154m0();
    }

    /* JADX INFO: renamed from: w4 */
    public void m146915w4(BLiveGiftItem bLiveGiftItem) {
        ((FastGiftView) this.f85887k).m72155n0(bLiveGiftItem, mo77274R2());
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: y4, reason: merged with bridge method [inline-methods] */
    public void mo108215d4(FastGiftView fastGiftView) {
        super.mo108215d4(fastGiftView);
        fastGiftView.setLayoutParams(new LinearLayout.LayoutParams(t100.m186890d(44.0f), xdl0.f192404f));
        fastGiftView.m72154m0();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX INFO: renamed from: z4 */
    public void m146917z4() {
        BLiveGiftItem bLiveGiftItem = this.f124216q;
        if (bLiveGiftItem == null) {
            return;
        }
        axj.m99435i(bLiveGiftItem, m146909p4(bLiveGiftItem.getPrice()), mo77274R2(), 1, m206027E2().m132146l0().f56011id);
        m146908o4(this.f124216q);
    }
}
