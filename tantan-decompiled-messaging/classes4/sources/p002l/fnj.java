package p002l;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogBottomBar;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage;
import com.p1.mobile.putong.live.base.data.BLiveCoin;
import com.p1.mobile.putong.live.base.webview.LiveWebViewAct;
import l.bwr;
import l.ddv;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.soj0;
import l.ypv;
import org.jetbrains.annotations.Nullable;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fnj<T extends ho2> extends h4t<T, GiftDialogBottomBar> {

    /* JADX INFO: renamed from: i */
    public long f10537i;

    public fnj(bsm<? extends T> bsmVar, GiftDialogBottomBar giftDialogBottomBar) {
        super(bsmVar);
        C(giftDialogBottomBar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m13379R3(soj0 soj0Var) {
        m13388Y3();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m13380P3(ip50 ip50Var) {
        m13387X3(ip50Var.m15279c(), ip50Var.m15278b(), ip50Var.m15277a());
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m13381S3(elj eljVar) {
        ((GiftDialogBottomBar) ((bwr) this).viewModel).m7959o0(eljVar);
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [l.ho2] */
    /* JADX INFO: renamed from: T */
    public void m13382T() {
        super.T();
        duringCreated((c) m25548F2().GiftDialogEventGroup.openGoWallet().g()).subscribe(ffw.h(new e30() { // from class: l.zmj
            public final void call(Object obj) {
                this.f23510a.m13380P3((ip50) obj);
            }
        }));
        duringCreated((c) m25548F2().GiftDialogEventGroup.openSendGiftRecordsPage().g()).subscribe(ffw.h(new e30() { // from class: l.anj
            public final void call(Object obj) {
                this.f7768a.m13379R3((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().GiftDialogEventGroup.refreshBottomIndicator().g()).subscribe(ffw.h(new e30() { // from class: l.bnj
            public final void call(Object obj) {
                this.f8278a.m13381S3((elj) obj);
            }
        }));
        duringCreated(((ggv) ypv.l(fld0.c)).h()).subscribe(ffw.d(new e30() { // from class: l.cnj
            public final void call(Object obj) {
                this.f8764a.m13383T3((Long) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().i2).subscribe(ffw.d(new e30() { // from class: l.dnj
            public final void call(Object obj) {
                this.f9364a.m13385V3((LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsg) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m13383T3(Long l2) {
        ((GiftDialogBottomBar) ((bwr) this).viewModel).setAvailableCoin(l2);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m13384U3(BLiveCoin bLiveCoin) {
        ((GiftDialogBottomBar) ((bwr) this).viewModel).setAvailableCoin(Long.valueOf(bLiveCoin.available));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m13385V3(LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsg refreshGiftTabBalanceMsg) {
        if (TextUtils.equals(refreshGiftTabBalanceMsg.getUserId(), ypv.a.D0())) {
            zfv.m27280k1().subscribe(ffw.d(new e30() { // from class: l.enj
                public final void call(Object obj) {
                    this.f9884a.m13384U3((BLiveCoin) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public void m13386W3(boolean z, String str) {
        m13387X3(z, str, null);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m13387X3(boolean z, String str, @Nullable pge0 pge0Var) {
        if (SystemClock.uptimeMillis() - this.f10537i > 500) {
            String str2 = pge0Var == null ? "" : pge0Var.f17261A;
            this.f10537i = SystemClock.uptimeMillis();
            m13389Z3(pge0Var);
            m25548F2().FastRechargeEventGroup.showFastRechargeDialog().j(new nig.C0701a().m18781g(z ? 2 : 1).m18782h(pge0Var).m18784j(str).m18783i(str2).m18779e());
            m25548F2().FansClubEntryEvent.openEntry().j(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m13388Y3() {
        Act act = act();
        if (act == null || act.isFinishing()) {
            return;
        }
        act.startActivity(LiveWebViewAct.c2(act, ddv.A));
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m13389Z3(@Nullable pge0 pge0Var) {
        m25548F2().GiftDialogEventGroup.dismissGiftDialog().j(7003);
    }
}
