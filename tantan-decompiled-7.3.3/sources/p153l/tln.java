package p153l;

import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
public class tln<D extends oo2> extends qct<D> {

    /* JADX INFO: renamed from: i */
    public bjs f174839i;

    public tln(dum dumVar, bjs bjsVar) {
        super(dumVar);
        this.f174839i = bjsVar;
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ void m191648M3(Integer num) {
    }

    /* JADX INFO: renamed from: N3, reason: merged with bridge method [inline-methods] */
    public final void m191652R3(Throwable th, LiveGiftItemView liveGiftItemView, BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.isPacketGift()) {
            boolean z = th instanceof TantanException.Client.CoreService;
            if (z && ((TantanException.Client.CoreService) th).code == 41201) {
                liveGiftItemView.m74670p1(0);
            } else if (z && ((TantanException.Client.CoreService) th).code == 41202) {
                liveGiftItemView.m74670p1(0);
            }
        }
    }

    /* JADX INFO: renamed from: O3, reason: merged with bridge method [inline-methods] */
    public final void m191651P3(BLiveGiftItem bLiveGiftItem, jjs jjsVar, LiveGiftItemView liveGiftItemView, BLiveGivenGiftBrief bLiveGivenGiftBrief, @Nullable y20<BLiveGivenGiftBrief> y20Var, int i, boolean z) {
        jjsVar.m145137w(bLiveGivenGiftBrief);
        if (liveGiftItemView != null) {
            liveGiftItemView.m74667l1(jjsVar, bLiveGivenGiftBrief);
            if (y20Var != null) {
                y20Var.call(bLiveGivenGiftBrief);
            }
            ib0 ib0Var = new ib0(liveGiftItemView, jjsVar, i, z, this.f174839i.m104713L4());
            if (!vxr.m203876d().m170980I0() || jjsVar.m145133s()) {
                return;
            }
            m213811F2().IntlGiftComboEvent.comboEvent().mo199273j(ib0Var);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m191653S3(ib0 ib0Var) {
        m191654T3(ib0Var.m139230c(), ib0Var.m139231d(), null, 1, ib0Var.m139229b(), false);
    }

    /* JADX INFO: renamed from: T3 */
    public void m191654T3(final jjs jjsVar, final LiveGiftItemView liveGiftItemView, @Nullable final y20<BLiveGivenGiftBrief> y20Var, int i, final int i2, final boolean z) {
        final BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        xoe0.m212465a(this.f174839i, uoe0.m196974d(String.valueOf(bLiveGiftItemM145122h.f45225id), bLiveGiftItemM145122h, new y20() { // from class: l.pln
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153045a.m191651P3(bLiveGiftItemM145122h, jjsVar, liveGiftItemView, y20Var, i2, z, (BLiveGivenGiftBrief) obj);
            }
        }, new y20() { // from class: l.qln
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158241a.m191652R3(liveGiftItemView, bLiveGiftItemM145122h, (Throwable) obj);
            }
        }, new y20() { // from class: l.rln
            @Override // p153l.y20
            public final void call(Object obj) {
                tln.m191648M3((Integer) obj);
            }
        }, false, i, this.f174839i.m104706H4(), this.f174839i.m104715M4(), cpj.m111772H(bLiveGiftItemM145122h, jjsVar, i2)), new y20() { // from class: l.sln
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169395a.m191655U3((uoe0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public void m191655U3(uoe0 uoe0Var) {
        m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136088y(uoe0Var));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c) m213811F2().GiftDialogEventGroup.intlNewComboClick().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.oln
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147854a.m191653S3((ib0) obj);
            }
        }));
    }
}
