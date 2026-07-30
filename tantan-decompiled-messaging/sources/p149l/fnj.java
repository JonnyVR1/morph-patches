package p149l;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.intl_light_push.LongLinkIntlLightPushMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveCoin;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogBottomBar;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class fnj<T extends ho2> extends h4t<T, GiftDialogBottomBar> {

    /* JADX INFO: renamed from: i */
    public long f98422i;

    public fnj(bsm<? extends T> bsmVar, GiftDialogBottomBar giftDialogBottomBar) {
        super(bsmVar);
        mo51532C(giftDialogBottomBar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m122303R3(soj0 soj0Var) {
        m122311Y3();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m122304P3(ip50 ip50Var) {
        m122310X3(ip50Var.m137453c(), ip50Var.m137452b(), ip50Var.m137451a());
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m122305S3(elj eljVar) {
        ((GiftDialogBottomBar) this.viewModel).m74376o0(eljVar);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated((C22306c<T>) m206028F2().GiftDialogEventGroup.openGoWallet().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.zmj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203730a.m122304P3((ip50) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().GiftDialogEventGroup.openSendGiftRecordsPage().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.anj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70742a.m122303R3((soj0) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().GiftDialogEventGroup.refreshBottomIndicator().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.bnj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76406a.m122305S3((elj) obj);
            }
        }));
        duringCreated((C22306c<T>) ((ggv) ypv.m215673l(fld0.f98148c)).m126022h()).subscribe(ffw.m121193d(new e30() { // from class: l.cnj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81665a.m122306T3((Long) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().f170460i2).subscribe(ffw.m121193d(new e30() { // from class: l.dnj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87067a.m122308V3((LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsg) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m122306T3(Long l2) {
        ((GiftDialogBottomBar) this.viewModel).setAvailableCoin(l2);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m122307U3(BLiveCoin bLiveCoin) {
        ((GiftDialogBottomBar) this.viewModel).setAvailableCoin(Long.valueOf(bLiveCoin.available));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m122308V3(LongLinkIntlLightPushMessage.RefreshGiftTabBalanceMsg refreshGiftTabBalanceMsg) {
        if (TextUtils.equals(refreshGiftTabBalanceMsg.getUserId(), ypv.f199493a.m199309D0())) {
            zfv.m218577k1().subscribe(ffw.m121193d(new e30() { // from class: l.enj
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f92319a.m122307U3((BLiveCoin) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: W3 */
    public void m122309W3(boolean z, String str) {
        m122310X3(z, str, null);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m122310X3(boolean z, String str, @Nullable pge0 pge0Var) {
        if (SystemClock.uptimeMillis() - this.f98422i > 500) {
            String str2 = pge0Var == null ? "" : pge0Var.f148637A;
            this.f98422i = SystemClock.uptimeMillis();
            m122312Z3(pge0Var);
            m206028F2().FastRechargeEventGroup.showFastRechargeDialog().mo172463j(new nig.C18699a().m159507g(z ? 2 : 1).m159508h(pge0Var).m159510j(str).m159509i(str2).m159505e());
            m206028F2().FansClubEntryEvent.openEntry().mo172463j(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public void m122311Y3() {
        Act act = act();
        if (act == null || act.isFinishing()) {
            return;
        }
        act.startActivity(LiveWebViewAct.m68883c2(act, ddv.f85629A));
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m122312Z3(@Nullable pge0 pge0Var) {
        m206028F2().GiftDialogEventGroup.dismissGiftDialog().mo172463j(7003);
    }
}
