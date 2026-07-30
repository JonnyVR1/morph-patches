package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveDownChestRewardInfo;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class i6e<D extends ho2> extends x6s<D, c6e> {

    /* JADX INFO: renamed from: k */
    public static final String f111733k = ytr.m216073b("/tricks/chest-reward");

    /* JADX INFO: renamed from: j */
    public String f111734j;

    public i6e(bsm<D> bsmVar) {
        super(bsmVar);
        mo51532C(new c6e(act(), this));
    }

    /* JADX INFO: renamed from: b4 */
    private void m134605b4() {
        ((c6e) this.viewModel).m71834E();
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m134606W3(String str) {
        m134610a4(str, true);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m134607X3(String str, final String str2, rge0 rge0Var) {
        if (rge0Var == null || rge0Var.getSendGiftRequestInfo().f148656e == null || !String.valueOf(rge0Var.getSendGiftRequestInfo().f148656e.f44377id).equals(str)) {
            return;
        }
        m129320z3(1000L, new Runnable() { // from class: l.h6e
            @Override // java.lang.Runnable
            public final void run() {
                this.f106051a.m134606W3(str2);
            }
        });
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m134608Y3(boolean z, String str, BLiveDownChestRewardInfo bLiveDownChestRewardInfo) {
        if (bLiveDownChestRewardInfo != null) {
            if (z) {
                m206028F2().GiftDialogEventGroup.dismissGiftDialog().mo172463j(627);
            }
            m134605b4();
            ((c6e) this.viewModel).m105424R(bLiveDownChestRewardInfo, str, z);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public void m134609Z3(final String str, final String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        duringCreated((C22306c) m206028F2().SendGiftEventGroup.sendGiftSuccess().m172460g()).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.g6e
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101245a.m134607X3(str, str2, (rge0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public final void m134610a4(final String str, final boolean z) {
        duringCreated(LivingNormalApiProvider.m71238H4(str, m206027E2().m149814k(), m206027E2().m149818o(), m206027E2().m132146l0().f56011id, z, this.f111734j)).subscribe(ffw.m121194e(new e30() { // from class: l.e6e
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89569a.m134608Y3(z, str, (BLiveDownChestRewardInfo) obj);
            }
        }, new e30() { // from class: l.f6e
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151584n(R$string.f47161c3);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        String strM132060D0 = m206027E2().m132060D0();
        this.f111734j = strM132060D0;
        if ("open-screen".equals(strM132060D0) || "suggest-card".equals(this.f111734j)) {
            m134610a4(f111733k, false);
        }
    }
}
