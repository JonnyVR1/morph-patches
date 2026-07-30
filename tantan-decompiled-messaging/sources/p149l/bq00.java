package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class bq00 extends jq2<ts00> {

    /* JADX INFO: renamed from: a */
    public String f76743a;

    /* JADX INFO: renamed from: b */
    public String f76744b;

    /* JADX INFO: renamed from: c */
    public boolean f76745c;

    /* JADX INFO: renamed from: d */
    public boolean f76746d;

    /* JADX INFO: renamed from: e */
    public Boolean f76747e;

    public bq00(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m103312E0(User user) {
        ((ts00) this.viewModel).m190500x(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m103313O0(Bundle bundle) {
        ((ts00) this.viewModel).m190495r();
        if (this.f76745c) {
            duringCreated(FeedModule.m60223M().mo67257ao(this.f76743a)).subscribe(mkd0.m154956H(new e30() { // from class: l.aq00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f71117a.m103331C0((Boolean) obj);
                }
            }, new e30() { // from class: l.mp00
                @Override // p149l.e30
                public final void call(Object obj) {
                    bq00.m103329t0((Throwable) obj);
                }
            }));
        } else {
            ((ts00) this.viewModel).m190498v();
            duringCreated(ijb0.m136585y(this.f76743a)).doOnError(new e30() { // from class: l.np00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f139901a.m103336I0((Throwable) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.op00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f144937a.m103337J0((Boolean) obj);
                }
            }));
        }
        if (m103348z0()) {
            duringCreated(new v9j() { // from class: l.pp00
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f150586a.m103338L0();
                }
            }, false).subscribe(mkd0.m154955G(new e30() { // from class: l.qp00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f155657a.m103339N0((roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m103329t0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m103330A0(Boolean bool) {
        this.f76746d = bool.booleanValue();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m103331C0(Boolean bool) {
        if (bool.booleanValue()) {
            ((ts00) this.viewModel).m190490L();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ C22306c m103332D0() {
        return ijb0.m136559W(this.f76743a);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ C22306c m103333F0() {
        FeedModule.f38854c.m60737l4(this.f76743a);
        return FeedModule.f38854c.m60713Z3(this.f76743a);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m103334G0(q860 q860Var) {
        ((ts00) this.viewModel).m190488J(q860Var);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m103335H0(List list) {
        ((ts00) this.viewModel).m190489K(list);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m103336I0(Throwable th) {
        this.f76747e = Boolean.FALSE;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m103337J0(Boolean bool) {
        this.f76747e = bool;
        boolean zBooleanValue = bool.booleanValue();
        V v2 = this.viewModel;
        if (zBooleanValue) {
            ((ts00) v2).m190492N(this.f76743a);
        } else {
            ((ts00) v2).m190497u();
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ C22306c m103338L0() {
        return ijb0.m136561a(this.f76743a);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m103339N0(roj0 roj0Var) {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ C22306c m103340P0() {
        return ijb0.m136559W(this.f76743a).map(new w9j() { // from class: l.rp00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).m60124fp().profileSmall();
            }
        }).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m103341Q0(Picture.ImageUri imageUri) {
        ((ts00) this.viewModel).m190499w(imageUri);
    }

    /* JADX INFO: renamed from: R0 */
    public void m103342R0(Intent intent) {
        Moment moment = (Moment) intent.getExtras().getSerializable("moment");
        if (NullChecker.m81303a(moment)) {
            FeedModule.f38854c.m60733j4(moment);
        }
        ((ts00) this.viewModel).m190487I();
    }

    /* JADX INFO: renamed from: S0 */
    public void m103343S0(String str, String str2) {
        this.f76743a = str;
        this.f76744b = str2;
        this.f76745c = str.equals(FeedModule.m60221F().userId());
    }

    /* JADX INFO: renamed from: U0 */
    public List<Object> m103344U0() {
        return vwb.m200324f0("other user id", this.f76743a, ag3.f69254c);
    }

    /* JADX INFO: renamed from: u0 */
    public void m103345u0() {
        if (this.f76746d) {
            act().setResult(-1);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m103346x0(Menu menu) {
        if (m103348z0()) {
            if (!FeedModule.m60221F().userId().equals(this.f76743a) && ijb0.m136560X(this.f76743a) == null) {
                CrashHelper.m81297d(new Exception("me:" + FeedModule.m60221F().userId() + "; ab_group:" + ABManager.m29317E() + "; other:" + this.f76743a + "; from:" + this.f76744b), 50);
            }
            v1h.m196562G0(act(), menu, this.f76743a, null, null, null, new e30() { // from class: l.lp00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f129152a.m103330A0((Boolean) obj);
                }
            }, null, null, true, false, true);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m103347y0() {
        creates(new e30() { // from class: l.sp00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165740a.m103313O0((Bundle) obj);
            }
        });
        duringCreated(new v9j() { // from class: l.tp00
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f171426a.m103340P0();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.up00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177560a.m103341Q0((Picture.ImageUri) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.vp00
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f182440a.m103332D0();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.wp00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187482a.m103312E0((User) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.xp00
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f193893a.m103333F0();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.yp00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199378a.m103334G0((q860) obj);
            }
        }));
        duringCreated(FeedModule.f38854c.f39209M.m121230k()).subscribe(mkd0.m154955G(new e30() { // from class: l.zp00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204165a.m103335H0((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m103348z0() {
        if (this.f76747e == null) {
            this.f76747e = Boolean.valueOf(ijb0.m136586z(this.f76743a));
        }
        return this.f76747e.booleanValue();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
