package p002l;

import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import l.e30;
import l.ffw;
import l.uvr;
import org.jetbrains.annotations.Nullable;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tjn<D extends ho2> extends pat<D> {

    /* JADX INFO: renamed from: i */
    public ahs f20278i;

    public tjn(bsm bsmVar, ahs ahsVar) {
        super(bsmVar);
        this.f20278i = ahsVar;
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m22988M3(Integer num) {
    }

    /* JADX INFO: renamed from: N3, reason: merged with bridge method [inline-methods] */
    public final void m22992R3(Throwable th, LiveGiftItemView liveGiftItemView, BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.isPacketGift()) {
            boolean z = th instanceof TantanException.Client.CoreService;
            if (z && ((TantanException.Client.CoreService) th).code == 41201) {
                liveGiftItemView.m7029p1(0);
            } else if (z && ((TantanException.Client.CoreService) th).code == 41202) {
                liveGiftItemView.m7029p1(0);
            }
        }
    }

    /* JADX INFO: renamed from: O3, reason: merged with bridge method [inline-methods] */
    public final void m22991P3(BLiveGiftItem bLiveGiftItem, ihs ihsVar, LiveGiftItemView liveGiftItemView, BLiveGivenGiftBrief bLiveGivenGiftBrief, @Nullable e30<BLiveGivenGiftBrief> e30Var, int i, boolean z) {
        ihsVar.m15175w(bLiveGivenGiftBrief);
        if (liveGiftItemView != null) {
            liveGiftItemView.m7026l1(ihsVar, bLiveGivenGiftBrief);
            if (e30Var != null) {
                e30Var.call(bLiveGivenGiftBrief);
            }
            mb0 mb0Var = new mb0(liveGiftItemView, ihsVar, i, z, this.f20278i.m9722L4());
            if (!uvr.d().I0() || ihsVar.m15171s()) {
                return;
            }
            m25548F2().IntlGiftComboEvent.comboEvent().j(mb0Var);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m22993S3(mb0 mb0Var) {
        m22994T3(mb0Var.m17795c(), mb0Var.m17796d(), null, 1, mb0Var.m17794b(), false);
    }

    /* JADX INFO: renamed from: T3 */
    public void m22994T3(final ihs ihsVar, final LiveGiftItemView liveGiftItemView, @Nullable final e30<BLiveGivenGiftBrief> e30Var, int i, final int i2, final boolean z) {
        final BLiveGiftItem bLiveGiftItemM15160h = ihsVar.m15160h();
        sge0.m22452a(this.f20278i, pge0.m20240d(String.valueOf(bLiveGiftItemM15160h.id), bLiveGiftItemM15160h, new e30() { // from class: l.pjn
            public final void call(Object obj) {
                this.f17436a.m22991P3(bLiveGiftItemM15160h, ihsVar, liveGiftItemView, e30Var, i2, z, (BLiveGivenGiftBrief) obj);
            }
        }, new e30() { // from class: l.qjn
            public final void call(Object obj) {
                this.f18012a.m22992R3(liveGiftItemView, bLiveGiftItemM15160h, (Throwable) obj);
            }
        }, new e30() { // from class: l.rjn
            public final void call(Object obj) {
                tjn.m22988M3((Integer) obj);
            }
        }, false, i, this.f20278i.m9715H4(), this.f20278i.m9724M4(), mmj.m18047H(bLiveGiftItemM15160h, ihsVar, i2)), new e30() { // from class: l.sjn
            public final void call(Object obj) {
                this.f19057a.m22995U3((pge0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public void m22995U3(pge0 pge0Var) {
        m25548F2().SendGiftEventGroup.sendGift().j(new cfe0.C0512a().m10987y(pge0Var));
    }

    /* JADX INFO: renamed from: t */
    public void m22996t() {
        super.t();
        duringCreated((c) m25548F2().GiftDialogEventGroup.intlNewComboClick().g()).subscribe(ffw.d(new e30() { // from class: l.ojn
            public final void call(Object obj) {
                this.f16648a.m22993S3((mb0) obj);
            }
        }));
    }
}
