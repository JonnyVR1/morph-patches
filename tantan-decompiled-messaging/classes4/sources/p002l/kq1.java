package p002l;

import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.FastGiftView;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import l.e30;
import l.ffw;
import l.l3f;
import l.soj0;
import l.t100;
import l.xdl0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kq1 extends df2<FastGiftView> {

    /* JADX INFO: renamed from: q */
    public BLiveGiftItem f14454q;

    public kq1(bsm bsmVar, BLiveBottomButton bLiveBottomButton) {
        super(bsmVar, t6c0.f19720W0, bLiveBottomButton);
    }

    /* JADX INFO: renamed from: A4 */
    private void m16735A4(final BLiveGiftItem bLiveGiftItem) {
        m25548F2().SendGiftEventGroup.sendGift().j(new cfe0.C0512a().m10985w(bLiveGiftItem, new e30() { // from class: l.hq1
            public final void call(Object obj) {
                this.f12214a.m16746q4(bLiveGiftItem, (BLiveGivenGiftBrief) obj);
            }
        }, new e30() { // from class: l.iq1
            public final void call(Object obj) {
                kq1.m16737j4((Throwable) obj);
            }
        }, new e30() { // from class: l.jq1
            public final void call(Object obj) {
                kq1.m16740m4((Integer) obj);
            }
        }, true, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerLocation.get("quickgift"), "")));
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m16737j4(Throwable th) {
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m16740m4(Integer num) {
    }

    /* JADX INFO: renamed from: n4 */
    private void m16741n4(String str) {
        m25548F2().BootBubbleEvent.dismissBubble().j(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m16742s4(soj0 soj0Var) {
        m16750u4(null);
    }

    /* JADX INFO: renamed from: x4 */
    private void m16743x4(BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem != null) {
            m16752w4(bLiveGiftItem);
        } else {
            m16751v4();
        }
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        super.mo10610V3(view);
        m16754z4();
        m16741n4("fastGiftButtonBubble");
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("fastGiftButton");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.df2
    /* JADX INFO: renamed from: a4 */
    public View mo11810a4() {
        V v = this.f9196k;
        if (v == 0) {
            return null;
        }
        return ((FastGiftView) v).f4551g;
    }

    /* JADX INFO: renamed from: o4 */
    public final void m16744o4(BLiveGiftItem bLiveGiftItem) {
        if (act() == null) {
            return;
        }
        m16735A4(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: p4 */
    public String m16745p4(double d) {
        return String.valueOf(m14184F3(new hnj(800).m14469e(d)));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m16746q4(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        m16749t4(bLiveGivenGiftBrief.combos);
        l3f l3fVar = new l3f();
        l3fVar.s = "e_quickgift";
        l3fVar.n = mo21430R2();
        l3fVar.d = EventNameEnum.BIZ_PAY;
        axj.m10103q(bLiveGiftItem, bLiveGivenGiftBrief, mo21430R2(), 1, ((DbObject) m25547E2().m14582l0()).id);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m16747r4(hvj hvjVar) {
        BLiveGiftItem bLiveGiftItemM18075t = mmj.m18075t(hvjVar.m14839d().m16344f());
        this.f14454q = bLiveGiftItemM18075t;
        m16743x4(bLiveGiftItemM18075t);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m16748t() {
        super.t();
        duringCreated(m25547E2().m14613z1()).take(1).subscribe(ffw.d(new e30() { // from class: l.eq1
            public final void call(Object obj) {
                this.f9928a.m16750u4((BLiveData) obj);
            }
        }));
        duringCreated(m25547E2().m14594p1()).subscribe(ffw.d(new e30() { // from class: l.fq1
            public final void call(Object obj) {
                this.f10595a.m16747r4((hvj) obj);
            }
        }));
        duringCreated((c) m25548F2().BottomEvent.hideFastGiftPrice().g()).subscribe(ffw.d(new e30() { // from class: l.gq1
            public final void call(Object obj) {
                this.f11576a.m16742s4((soj0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public void m16749t4(int i) {
        ((FastGiftView) this.f9196k).m5625k0(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public void m16750u4(BLiveData bLiveData) {
        ((FastGiftView) this.f9196k).m5626l0(bLiveData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public void m16751v4() {
        ((FastGiftView) this.f9196k).m5627m0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public void m16752w4(BLiveGiftItem bLiveGiftItem) {
        ((FastGiftView) this.f9196k).m5628n0(bLiveGiftItem, mo21430R2());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.df2
    /* JADX INFO: renamed from: y4, reason: merged with bridge method [inline-methods] */
    public void mo11312d4(FastGiftView fastGiftView) {
        super.mo11312d4(fastGiftView);
        fastGiftView.setLayoutParams(new LinearLayout.LayoutParams(t100.d(44.0f), xdl0.f));
        fastGiftView.m5627m0();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX INFO: renamed from: z4 */
    public void m16754z4() {
        BLiveGiftItem bLiveGiftItem = this.f14454q;
        if (bLiveGiftItem == null) {
            return;
        }
        axj.m10095i(bLiveGiftItem, m16745p4(bLiveGiftItem.getPrice()), mo21430R2(), 1, ((DbObject) m25547E2().m14582l0()).id);
        m16744o4(this.f14454q);
    }
}
