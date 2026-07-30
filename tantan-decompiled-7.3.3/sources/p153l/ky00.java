package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class ky00 extends ar2<c110> {

    /* JADX INFO: renamed from: a */
    public String f129256a;

    /* JADX INFO: renamed from: b */
    public String f129257b;

    /* JADX INFO: renamed from: c */
    public boolean f129258c;

    /* JADX INFO: renamed from: d */
    public boolean f129259d;

    /* JADX INFO: renamed from: e */
    public Boolean f129260e;

    public ky00(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m151903E0(User user) {
        ((c110) this.viewModel).m107517x(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m151904O0(Bundle bundle) {
        ((c110) this.viewModel).m107512r();
        if (this.f129258c) {
            duringCreated(FeedModule.m61407M().mo68440ao(this.f129256a)).subscribe(psd0.m173597H(new y20() { // from class: l.jy00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f123106a.m151922C0((Boolean) obj);
                }
            }, new y20() { // from class: l.vx00
                @Override // p153l.y20
                public final void call(Object obj) {
                    ky00.m151920t0((Throwable) obj);
                }
            }));
        } else {
            ((c110) this.viewModel).m107515v();
            duringCreated(mrb0.m159671y(this.f129256a)).doOnError(new y20() { // from class: l.wx00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f191355a.m151927I0((Throwable) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.xx00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196575a.m151928J0((Boolean) obj);
                }
            }));
        }
        if (m151939z0()) {
            duringCreated(new pcj() { // from class: l.yx00
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f201900a.m151929L0();
                }
            }, false).subscribe(psd0.m173596G(new y20() { // from class: l.zx00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f206416a.m151930N0((uxj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m151920t0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m151921A0(Boolean bool) {
        this.f129259d = bool.booleanValue();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m151922C0(Boolean bool) {
        if (bool.booleanValue()) {
            ((c110) this.viewModel).m107507L();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ C22421c m151923D0() {
        return mrb0.m159645W(this.f129256a);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ C22421c m151924F0() {
        FeedModule.f39702c.m61921l4(this.f129256a);
        return FeedModule.f39702c.m61897Z3(this.f129256a);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m151925G0(vg60 vg60Var) {
        ((c110) this.viewModel).m107505J(vg60Var);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m151926H0(List list) {
        ((c110) this.viewModel).m107506K(list);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m151927I0(Throwable th) {
        this.f129260e = Boolean.FALSE;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m151928J0(Boolean bool) {
        this.f129260e = bool;
        boolean zBooleanValue = bool.booleanValue();
        V v2 = this.viewModel;
        if (zBooleanValue) {
            ((c110) v2).m107509N(this.f129256a);
        } else {
            ((c110) v2).m107514u();
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ C22421c m151929L0() {
        return mrb0.m159647a(this.f129256a);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m151930N0(uxj0 uxj0Var) {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ C22421c m151931P0() {
        return mrb0.m159645W(this.f129256a).map(new qcj() { // from class: l.ay00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).m61308fp().profileSmall();
            }
        }).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m151932Q0(Picture.ImageUri imageUri) {
        ((c110) this.viewModel).m107516w(imageUri);
    }

    /* JADX INFO: renamed from: R0 */
    public void m151933R0(Intent intent) {
        Moment moment = (Moment) intent.getExtras().getSerializable("moment");
        if (NullChecker.m82486a(moment)) {
            FeedModule.f39702c.m61917j4(moment);
        }
        ((c110) this.viewModel).m107504I();
    }

    /* JADX INFO: renamed from: S0 */
    public void m151934S0(String str, String str2) {
        this.f129256a = str;
        this.f129257b = str2;
        this.f129258c = str.equals(FeedModule.m61405F().userId());
    }

    /* JADX INFO: renamed from: U0 */
    public List<Object> m151935U0() {
        return jyb.m147507f0("other user id", this.f129256a, og3.f147188c);
    }

    /* JADX INFO: renamed from: u0 */
    public void m151936u0() {
        if (this.f129259d) {
            act().setResult(-1);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m151937x0(Menu menu) {
        if (m151939z0()) {
            if (!FeedModule.m61405F().userId().equals(this.f129256a) && mrb0.m159646X(this.f129256a) == null) {
                CrashHelper.m82480d(new Exception("me:" + FeedModule.m61405F().userId() + "; ab_group:" + ABManager.m30315E() + "; other:" + this.f129256a + "; from:" + this.f129257b), 50);
            }
            k3h.m148039G0(act(), menu, this.f129256a, null, null, null, new y20() { // from class: l.ux00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f181331a.m151921A0((Boolean) obj);
                }
            }, null, null, true, false, true);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m151938y0() {
        creates(new y20() { // from class: l.by00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78960a.m151904O0((Bundle) obj);
            }
        });
        duringCreated(new pcj() { // from class: l.cy00
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f84293a.m151931P0();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.dy00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91131a.m151932Q0((Picture.ImageUri) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.ey00
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f96366a.m151923D0();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.fy00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101334a.m151903E0((User) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.gy00
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f107021a.m151924F0();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.hy00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112088a.m151925G0((vg60) obj);
            }
        }));
        duringCreated(FeedModule.f39702c.f40057M.m159274k()).subscribe(psd0.m173596G(new y20() { // from class: l.iy00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117491a.m151926H0((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m151939z0() {
        if (this.f129260e == null) {
            this.f129260e = Boolean.valueOf(mrb0.m159672z(this.f129256a));
        }
        return this.f129260e.booleanValue();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
