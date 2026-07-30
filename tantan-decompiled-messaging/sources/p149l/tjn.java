package p149l;

import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class tjn<D extends ho2> extends pat<D> {

    /* JADX INFO: renamed from: i */
    public ahs f170766i;

    public tjn(bsm bsmVar, ahs ahsVar) {
        super(bsmVar);
        this.f170766i = ahsVar;
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m189350M3(Integer num) {
    }

    /* JADX INFO: renamed from: N3, reason: merged with bridge method [inline-methods] */
    public final void m189354R3(Throwable th, LiveGiftItemView liveGiftItemView, BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.isPacketGift()) {
            boolean z = th instanceof TantanException.Client.CoreService;
            if (z && ((TantanException.Client.CoreService) th).code == 41201) {
                liveGiftItemView.m73487p1(0);
            } else if (z && ((TantanException.Client.CoreService) th).code == 41202) {
                liveGiftItemView.m73487p1(0);
            }
        }
    }

    /* JADX INFO: renamed from: O3, reason: merged with bridge method [inline-methods] */
    public final void m189353P3(BLiveGiftItem bLiveGiftItem, ihs ihsVar, LiveGiftItemView liveGiftItemView, BLiveGivenGiftBrief bLiveGivenGiftBrief, @Nullable e30<BLiveGivenGiftBrief> e30Var, int i, boolean z) {
        ihsVar.m136298w(bLiveGivenGiftBrief);
        if (liveGiftItemView != null) {
            liveGiftItemView.m73484l1(ihsVar, bLiveGivenGiftBrief);
            if (e30Var != null) {
                e30Var.call(bLiveGivenGiftBrief);
            }
            mb0 mb0Var = new mb0(liveGiftItemView, ihsVar, i, z, this.f170766i.m96626L4());
            if (!uvr.m196087d().m162673I0() || ihsVar.m136294s()) {
                return;
            }
            m206028F2().IntlGiftComboEvent.comboEvent().mo172463j(mb0Var);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m189355S3(mb0 mb0Var) {
        m189356T3(mb0Var.m153857c(), mb0Var.m153858d(), null, 1, mb0Var.m153856b(), false);
    }

    /* JADX INFO: renamed from: T3 */
    public void m189356T3(final ihs ihsVar, final LiveGiftItemView liveGiftItemView, @Nullable final e30<BLiveGivenGiftBrief> e30Var, int i, final int i2, final boolean z) {
        final BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        sge0.m184069a(this.f170766i, pge0.m168675d(String.valueOf(bLiveGiftItemM136283h.f44377id), bLiveGiftItemM136283h, new e30() { // from class: l.pjn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f149845a.m189353P3(bLiveGiftItemM136283h, ihsVar, liveGiftItemView, e30Var, i2, z, (BLiveGivenGiftBrief) obj);
            }
        }, new e30() { // from class: l.qjn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154953a.m189354R3(liveGiftItemView, bLiveGiftItemM136283h, (Throwable) obj);
            }
        }, new e30() { // from class: l.rjn
            @Override // p149l.e30
            public final void call(Object obj) {
                tjn.m189350M3((Integer) obj);
            }
        }, false, i, this.f170766i.m96619H4(), this.f170766i.m96628M4(), mmj.m155405H(bLiveGiftItemM136283h, ihsVar, i2)), new e30() { // from class: l.sjn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164864a.m189357U3((pge0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public void m189357U3(pge0 pge0Var) {
        m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106534y(pge0Var));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c) m206028F2().GiftDialogEventGroup.intlNewComboClick().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ojn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144321a.m189355S3((mb0) obj);
            }
        }));
    }
}
