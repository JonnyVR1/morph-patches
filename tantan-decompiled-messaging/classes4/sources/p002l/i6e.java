package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.live.base.data.BLiveDownChestRewardInfo;
import com.tantanapp.common.data.DbObject;
import l.bwr;
import l.e30;
import l.ffw;
import l.lsi0;
import l.ytr;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class i6e<D extends ho2> extends x6s<D, c6e> {

    /* JADX INFO: renamed from: k */
    public static final String f13079k = ytr.b("/tricks/chest-reward");

    /* JADX INFO: renamed from: j */
    public String f13080j;

    public i6e(bsm<D> bsmVar) {
        super(bsmVar);
        C(new c6e(act(), this));
    }

    /* JADX INFO: renamed from: b4 */
    private void m15026b4() {
        ((c6e) ((bwr) this).viewModel).m5211E();
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m15027W3(String str) {
        m15031a4(str, true);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m15028X3(String str, final String str2, rge0 rge0Var) {
        if (rge0Var == null || rge0Var.getSendGiftRequestInfo().f17280e == null || !String.valueOf(rge0Var.getSendGiftRequestInfo().f17280e.id).equals(str)) {
            return;
        }
        m14207z3(1000L, new Runnable() { // from class: l.h6e
            @Override // java.lang.Runnable
            public final void run() {
                this.f11897a.m15027W3(str2);
            }
        });
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m15029Y3(boolean z, String str, BLiveDownChestRewardInfo bLiveDownChestRewardInfo) {
        if (bLiveDownChestRewardInfo != null) {
            if (z) {
                m25548F2().GiftDialogEventGroup.dismissGiftDialog().j(627);
            }
            m15026b4();
            ((c6e) ((bwr) this).viewModel).m10762R(bLiveDownChestRewardInfo, str, z);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public void m15030Z3(final String str, final String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        duringCreated((c) m25548F2().SendGiftEventGroup.sendGiftSuccess().g()).take(1).subscribe(ffw.d(new e30() { // from class: l.g6e
            public final void call(Object obj) {
                this.f11282a.m15028X3(str, str2, (rge0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public final void m15031a4(final String str, final boolean z) {
        duringCreated(LivingNormalApiProvider.m4604H4(str, m25547E2().m17235k(), m25547E2().m17239o(), ((DbObject) m25547E2().m14582l0()).id, z, this.f13080j)).subscribe(ffw.e(new e30() { // from class: l.e6e
            public final void call(Object obj) {
                this.f9592a.m15029Y3(z, str, (BLiveDownChestRewardInfo) obj);
            }
        }, new e30() { // from class: l.f6e
            public final void call(Object obj) {
                lsi0.n(R$string.f3203c3);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m15032t() {
        super.t();
        String strM14495D0 = m25547E2().m14495D0();
        this.f13080j = strM14495D0;
        if ("open-screen".equals(strM14495D0) || "suggest-card".equals(this.f13080j)) {
            m15031a4(f13079k, false);
        }
    }
}
