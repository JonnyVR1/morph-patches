package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveRandomMatchCouponDetail;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.internal.vchat.C12668a;

/* JADX INFO: loaded from: classes9.dex */
public class ogl0 extends lbl0 {

    /* JADX INFO: renamed from: a */
    public final int f147293a;

    public ogl0(int i) {
        this.f147293a = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m167657p(Act act, Throwable th) {
        String string;
        it0.m142010D(act);
        m153581c(th);
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 41021) {
                C12668a.m70426m(act, true);
                return;
            }
            string = coreService.metaMessage;
        } else {
            string = th != null ? act.getString(R$string.f45728R) : "";
        }
        o1j0.m165636j(string);
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: a */
    public void mo96996a(Act act) {
        super.mo96996a(act);
        if (this.f147293a == 0) {
            m167655m(act);
        } else {
            m167658q(act);
        }
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: f */
    public String mo96997f() {
        return "buyRandomMatchCoupon";
    }

    /* JADX INFO: renamed from: m */
    public final void m167655m(final Act act) {
        act.duringCreated(jwu.m147226A()).subscribe(dhw.m115826e(new y20() { // from class: l.mgl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136758a.m167656o(act, (BLiveRandomMatchCouponDetail) obj);
            }
        }, new y20() { // from class: l.ngl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141837a.m167657p(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m167656o(Act act, BLiveRandomMatchCouponDetail bLiveRandomMatchCouponDetail) {
        m167658q(act);
    }

    /* JADX INFO: renamed from: q */
    public final void m167658q(Act act) {
        m153583e(act);
    }
}
