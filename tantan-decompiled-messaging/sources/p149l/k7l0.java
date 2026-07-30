package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveRandomMatchCouponDetail;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.internal.vchat.C12505a;

/* JADX INFO: loaded from: classes13.dex */
public class k7l0 extends g2l0 {

    /* JADX INFO: renamed from: a */
    public final int f121609a;

    public k7l0(int i) {
        this.f121609a = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m144684p(Act act, Throwable th) {
        String string;
        dt0.m113504D(act);
        m124167c(th);
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 41021) {
                C12505a.m69243m(act, true);
                return;
            }
            string = coreService.metaMessage;
        } else {
            string = th != null ? act.getString(R$string.f44880R) : "";
        }
        lsi0.m151580j(string);
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: a */
    public void mo94566a(Act act) {
        super.mo94566a(act);
        if (this.f121609a == 0) {
            m144682m(act);
        } else {
            m144685q(act);
        }
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: f */
    public String mo94567f() {
        return "buyRandomMatchCoupon";
    }

    /* JADX INFO: renamed from: m */
    public final void m144682m(final Act act) {
        act.duringCreated(iuu.m138440A()).subscribe(ffw.m121194e(new e30() { // from class: l.i7l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111927a.m144683o(act, (BLiveRandomMatchCouponDetail) obj);
            }
        }, new e30() { // from class: l.j7l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116615a.m144684p(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m144683o(Act act, BLiveRandomMatchCouponDetail bLiveRandomMatchCouponDetail) {
        m144685q(act);
    }

    /* JADX INFO: renamed from: q */
    public final void m144685q(Act act) {
        m124169e(act);
    }
}
