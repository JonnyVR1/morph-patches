package p007l;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Pair;
import com.p000p1.mobile.putong.data.Counter;
import com.p000p1.mobile.putong.data.IntlOperationBanner;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.p005ui.moments.C2254b;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedAct;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.jq2;
import l.knb0;
import l.mcr;
import l.mkd0;
import l.mqi0;
import l.qqi0;
import l.roj0;
import l.w9j;
import l.x9j;
import l.xdl0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ln00 extends jq2<C2254b> {

    /* JADX INFO: renamed from: a */
    public boolean f10072a;

    /* JADX INFO: renamed from: b */
    public a<roj0> f10073b;

    public ln00(mcr mcrVar) {
        super(mcrVar);
        this.f10073b = a.c(roj0.a);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m11654f0(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m11655g0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ Integer m11659k0(knb0 knb0Var) {
        return (Integer) knb0Var.b;
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m11661m0() {
        if (!NullChecker.a(FeedModule.m1139F().userId())) {
            return true;
        }
        User userMe_ = FeedModule.m1140H().me_();
        if (NullChecker.a(userMe_)) {
            return !qqi0.h(mqi0.o(), (long) userMe_.createdTime, 1);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m11662o0(Bundle bundle) {
        ((C2254b) ((jq2) this).viewModel).m8266v(bundle);
        FeedModule.f315c.m1624S2();
        if (NullChecker.b(act()) && act().isTaskRoot() && (act() instanceof MomentsFeedAct)) {
            act().setTaskDescription(new ActivityManager.TaskDescription(act().getString(R$string.f470Y3), (Bitmap) null, act().getResources().getColor(e1c0.f7149k0)));
        }
    }

    public static String pageId() {
        return "p_moments_view";
    }

    /* JADX INFO: renamed from: a0 */
    public void m11663a0() {
        super.a0();
        creates(new e30() { // from class: l.kn00
            public final void call(Object obj) {
                this.f9746a.m11662o0((Bundle) obj);
            }
        });
    }

    public void destroy() {
        com.tantanapp.media.proxy.api.a.p().l();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m11664n0() {
        return this.f10072a;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m11665p0(Pair pair) {
        if (NullChecker.a(act())) {
            if (!m11661m0() || ((Integer) App.i.get()).intValue() > 3) {
                FeedModule.m1140H().setMomentTabNum(act(), ((Integer) pair.first).intValue() + ((Integer) pair.second).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Boolean m11666q0(roj0 roj0Var) {
        return Boolean.valueOf(((C2254b) ((jq2) this).viewModel).m8267w());
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m11667r0(Pair pair) {
        C2254b c2254b = (C2254b) ((jq2) this).viewModel;
        boolean zBooleanValue = ((Boolean) ((knb0) pair.first).a).booleanValue();
        int iIntValue = ((Integer) ((knb0) pair.first).b).intValue();
        Object obj = pair.first;
        c2254b.m8257I(zBooleanValue, iIntValue, (IntlOperationBanner) ((knb0) obj).c, ((Boolean) ((knb0) obj).d).booleanValue() && !((C2254b) ((jq2) this).viewModel).m8267w());
    }

    /* JADX INFO: renamed from: s0 */
    public void m11668s0() {
        ((C2254b) ((jq2) this).viewModel).m8265u();
        duringCreated(mkd0.r(FeedModule.m1140H().counter().map(new w9j() { // from class: l.bn00
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).activities.unread);
            }
        }).distinctUntilChanged(), FeedModule.m1140H().Js().map(new w9j() { // from class: l.cn00
            public final Object call(Object obj) {
                return ln00.m11659k0((knb0) obj);
            }
        }).distinctUntilChanged(), new x9j() { // from class: l.dn00
            public final Object call(Object obj, Object obj2) {
                return Pair.create((Integer) obj, (Integer) obj2);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.en00
            public final void call(Object obj) {
                this.f7433a.m11665p0((Pair) obj);
            }
        }, new e30() { // from class: l.fn00
            public final void call(Object obj) {
                ln00.m11654f0((Throwable) obj);
            }
        }));
        duringCreated(mkd0.r(FeedModule.m1140H().Js(), this.f10073b.map(new w9j() { // from class: l.gn00
            public final Object call(Object obj) {
                return this.f8483a.m11666q0((roj0) obj);
            }
        }).distinctUntilChanged(), new x9j() { // from class: l.hn00
            public final Object call(Object obj, Object obj2) {
                return Pair.create((knb0) obj, (Boolean) obj2);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.in00
            public final void call(Object obj) {
                this.f9101a.m11667r0((Pair) obj);
            }
        }, new e30() { // from class: l.jn00
            public final void call(Object obj) {
                ln00.m11655g0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m11669t0(boolean z) {
        this.f10072a = z;
        if (xdl0.O0(((C2254b) ((jq2) this).viewModel).f5442e) && z && NullChecker.b(act()) && !act().isFinishing()) {
            act().alwaysHideInput();
        }
    }
}
