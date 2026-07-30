package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveDownChestRewardInfo;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class x7e<D extends oo2> extends y8s<D, r7e> {

    /* JADX INFO: renamed from: k */
    public static final String f192712k = zvr.m221802b("/tricks/chest-reward");

    /* JADX INFO: renamed from: j */
    public String f192713j;

    public x7e(dum<D> dumVar) {
        super(dumVar);
        mo52715C(new r7e(act(), this));
    }

    /* JADX INFO: renamed from: b4 */
    private void m209576b4() {
        ((r7e) this.viewModel).m73017E();
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m209577W3(String str) {
        m209581a4(str, true);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m209578X3(String str, final String str2, woe0 woe0Var) {
        if (woe0Var == null || woe0Var.getSendGiftRequestInfo().f180057e == null || !String.valueOf(woe0Var.getSendGiftRequestInfo().f180057e.f45225id).equals(str)) {
            return;
        }
        m138879z3(1000L, new Runnable() { // from class: l.w7e
            @Override // java.lang.Runnable
            public final void run() {
                this.f187745a.m209577W3(str2);
            }
        });
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m209579Y3(boolean z, String str, BLiveDownChestRewardInfo bLiveDownChestRewardInfo) {
        if (bLiveDownChestRewardInfo != null) {
            if (z) {
                m213811F2().GiftDialogEventGroup.dismissGiftDialog().mo199273j(627);
            }
            m209576b4();
            ((r7e) this.viewModel).m180125R(bLiveDownChestRewardInfo, str, z);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public void m209580Z3(final String str, final String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        duringCreated((C22421c) m213811F2().SendGiftEventGroup.sendGiftSuccess().m199270g()).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.v7e
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182754a.m209578X3(str, str2, (woe0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public final void m209581a4(final String str, final boolean z) {
        duringCreated(LivingNormalApiProvider.m72421H4(str, m213810E2().m202191k(), m213810E2().m202194o(), m213810E2().m168532l0().f56859id, z, this.f192713j)).subscribe(dhw.m115826e(new y20() { // from class: l.t7e
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172422a.m209579Y3(z, str, (BLiveDownChestRewardInfo) obj);
            }
        }, new y20() { // from class: l.u7e
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165640n(R$string.f48009c3);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        String strM168449D0 = m213810E2().m168449D0();
        this.f192713j = strM168449D0;
        if ("open-screen".equals(strM168449D0) || "suggest-card".equals(this.f192713j)) {
            m209581a4(f192712k, false);
        }
    }
}
