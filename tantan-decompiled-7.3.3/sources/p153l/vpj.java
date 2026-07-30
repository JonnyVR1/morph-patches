package p153l;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveCoin;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogBottomBar;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class vpj<T extends oo2> extends i6t<T, GiftDialogBottomBar> {

    /* JADX INFO: renamed from: i */
    public long f185258i;

    public vpj(dum<? extends T> dumVar, GiftDialogBottomBar giftDialogBottomBar) {
        super(dumVar);
        mo52715C(giftDialogBottomBar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m202245R3(vxj0 vxj0Var) {
        m202253Y3();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m202246P3(ox50 ox50Var) {
        m202252X3(ox50Var.m169678c(), ox50Var.m169677b(), ox50Var.m169676a());
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m202247S3(unj unjVar) {
        ((GiftDialogBottomBar) this.viewModel).m75559o0(unjVar);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated((C22421c<T>) m213811F2().GiftDialogEventGroup.openGoWallet().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.ppj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153547a.m202246P3((ox50) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().GiftDialogEventGroup.openSendGiftRecordsPage().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.qpj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158875a.m202245R3((vxj0) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().GiftDialogEventGroup.refreshBottomIndicator().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.rpj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164373a.m202247S3((unj) obj);
            }
        }));
        duringCreated((C22421c<T>) ((hiv) zrv.m221194l(htd0.f111521c)).m135156h()).subscribe(dhw.m115825d(new y20() { // from class: l.spj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170054a.m202248T3((Long) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().f71727i2).subscribe(dhw.m115825d(new y20() { // from class: l.tpj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175606a.m202250V3((LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsg) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m202248T3(Long l2) {
        ((GiftDialogBottomBar) this.viewModel).setAvailableCoin(l2);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m202249U3(BLiveCoin bLiveCoin) {
        ((GiftDialogBottomBar) this.viewModel).setAvailableCoin(Long.valueOf(bLiveCoin.available));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m202250V3(LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsg refreshGiftTabBalanceMsg) {
        if (TextUtils.equals(refreshGiftTabBalanceMsg.getUserId(), zrv.f205799a.m207631D0())) {
            aiv.m98111k1().subscribe(dhw.m115825d(new y20() { // from class: l.upj
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f180274a.m202249U3((BLiveCoin) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public void m202251W3(boolean z, String str) {
        m202252X3(z, str, null);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m202252X3(boolean z, String str, @Nullable uoe0 uoe0Var) {
        if (SystemClock.uptimeMillis() - this.f185258i > 500) {
            String str2 = uoe0Var == null ? "" : uoe0Var.f180038A;
            this.f185258i = SystemClock.uptimeMillis();
            m202254Z3(uoe0Var);
            m213811F2().FastRechargeEventGroup.showFastRechargeDialog().mo199273j(new bkg.C16028a().m104805g(z ? 2 : 1).m104806h(uoe0Var).m104808j(str).m104807i(str2).m104803e());
            m213811F2().FansClubEntryEvent.openEntry().mo199273j(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m202253Y3() {
        Act act = act();
        if (act == null || act.isFinishing()) {
            return;
        }
        act.startActivity(LiveWebViewAct.m70066d2(act, efv.f93822A));
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m202254Z3(@Nullable uoe0 uoe0Var) {
        m213811F2().GiftDialogEventGroup.dismissGiftDialog().mo199273j(7003);
    }
}
