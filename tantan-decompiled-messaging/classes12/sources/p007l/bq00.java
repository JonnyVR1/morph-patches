package p007l;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.putong.api.ABManager;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.ag3;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.q860;
import l.roj0;
import l.s7m;
import l.v9j;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class bq00 extends jq2<ts00> {

    /* JADX INFO: renamed from: a */
    public String f6402a;

    /* JADX INFO: renamed from: b */
    public String f6403b;

    /* JADX INFO: renamed from: c */
    public boolean f6404c;

    /* JADX INFO: renamed from: d */
    public boolean f6405d;

    /* JADX INFO: renamed from: e */
    public Boolean f6406e;

    public bq00(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m8972E0(User user) {
        ((ts00) ((jq2) this).viewModel).m14656x(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m8973O0(Bundle bundle) {
        ((ts00) ((jq2) this).viewModel).m14651r();
        if (this.f6404c) {
            duringCreated(FeedModule.m1141M().ao(this.f6402a)).subscribe(mkd0.H(new e30() { // from class: l.aq00
                public final void call(Object obj) {
                    this.f5803a.m8991C0((Boolean) obj);
                }
            }, new e30() { // from class: l.mp00
                public final void call(Object obj) {
                    bq00.m8989t0((Throwable) obj);
                }
            }));
        } else {
            ((ts00) ((jq2) this).viewModel).m14654v();
            duringCreated(ijb0.m10938y(this.f6402a)).doOnError(new e30() { // from class: l.np00
                public final void call(Object obj) {
                    this.f10848a.m8996I0((Throwable) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.op00
                public final void call(Object obj) {
                    this.f11550a.m8997J0((Boolean) obj);
                }
            }));
        }
        if (m9008z0()) {
            duringCreated(new v9j() { // from class: l.pp00
                public final Object call() {
                    return this.f11940a.m8998L0();
                }
            }, false).subscribe(mkd0.G(new e30() { // from class: l.qp00
                public final void call(Object obj) {
                    this.f12345a.m8999N0((roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m8989t0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m8990A0(Boolean bool) {
        this.f6405d = bool.booleanValue();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m8991C0(Boolean bool) {
        if (bool.booleanValue()) {
            ((ts00) ((jq2) this).viewModel).m14645L();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ c m8992D0() {
        return ijb0.m10912W(this.f6402a);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ c m8993F0() {
        FeedModule.f315c.m1663l4(this.f6402a);
        return FeedModule.f315c.m1639Z3(this.f6402a);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m8994G0(q860 q860Var) {
        ((ts00) ((jq2) this).viewModel).m14643J(q860Var);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m8995H0(List list) {
        ((ts00) ((jq2) this).viewModel).m14644K(list);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m8996I0(Throwable th) {
        this.f6406e = Boolean.FALSE;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m8997J0(Boolean bool) {
        this.f6406e = bool;
        boolean zBooleanValue = bool.booleanValue();
        s7m s7mVar = ((jq2) this).viewModel;
        if (zBooleanValue) {
            ((ts00) s7mVar).m14647N(this.f6402a);
        } else {
            ((ts00) s7mVar).m14653u();
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ c m8998L0() {
        return ijb0.m10914a(this.f6402a);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m8999N0(roj0 roj0Var) {
        act().finish();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ c m9000P0() {
        return ijb0.m10912W(this.f6402a).map(new w9j() { // from class: l.rp00
            public final Object call(Object obj) {
                return ((User) obj).m1042fp().profileSmall();
            }
        }).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m9001Q0(Picture.ImageUri imageUri) {
        ((ts00) ((jq2) this).viewModel).m14655w(imageUri);
    }

    /* JADX INFO: renamed from: R0 */
    public void m9002R0(Intent intent) {
        Moment moment = (Moment) intent.getExtras().getSerializable("moment");
        if (NullChecker.a(moment)) {
            FeedModule.f315c.m1659j4(moment);
        }
        ((ts00) ((jq2) this).viewModel).m14642I();
    }

    /* JADX INFO: renamed from: S0 */
    public void m9003S0(String str, String str2) {
        this.f6402a = str;
        this.f6403b = str2;
        this.f6404c = str.equals(FeedModule.m1139F().userId());
    }

    /* JADX INFO: renamed from: U0 */
    public List<Object> m9004U0() {
        return vwb.f0(new Object[]{"other user id", this.f6402a, ag3.c});
    }

    /* JADX INFO: renamed from: u0 */
    public void m9005u0() {
        if (this.f6405d) {
            act().setResult(-1);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m9006x0(Menu menu) {
        if (m9008z0()) {
            if (!FeedModule.m1139F().userId().equals(this.f6402a) && ijb0.m10913X(this.f6402a) == null) {
                CrashHelper.d(new Exception("me:" + FeedModule.m1139F().userId() + "; ab_group:" + ABManager.E() + "; other:" + this.f6402a + "; from:" + this.f6403b), 50);
            }
            v1h.m15201G0(act(), menu, this.f6402a, null, null, null, new e30() { // from class: l.lp00
                public final void call(Object obj) {
                    this.f10088a.m8990A0((Boolean) obj);
                }
            }, null, null, true, false, true);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m9007y0() {
        creates(new e30() { // from class: l.sp00
            public final void call(Object obj) {
                this.f13026a.m8973O0((Bundle) obj);
            }
        });
        duringCreated(new v9j() { // from class: l.tp00
            public final Object call() {
                return this.f13372a.m9000P0();
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.up00
            public final void call(Object obj) {
                this.f13905a.m9001Q0((Picture.ImageUri) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.vp00
            public final Object call() {
                return this.f14259a.m8992D0();
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.wp00
            public final void call(Object obj) {
                this.f14657a.m8972E0((User) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.xp00
            public final Object call() {
                return this.f15062a.m8993F0();
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.yp00
            public final void call(Object obj) {
                this.f15484a.m8994G0((q860) obj);
            }
        }));
        duringCreated(FeedModule.f315c.f670M.k()).subscribe(mkd0.G(new e30() { // from class: l.zp00
            public final void call(Object obj) {
                this.f15821a.m8995H0((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m9008z0() {
        if (this.f6406e == null) {
            this.f6406e = Boolean.valueOf(ijb0.m10939z(this.f6402a));
        }
        return this.f6406e.booleanValue();
    }

    public void destroy() {
    }
}
