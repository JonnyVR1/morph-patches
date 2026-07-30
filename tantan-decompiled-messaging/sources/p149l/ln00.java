package p149l;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Pair;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.IntlOperationBanner;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.p060ui.moments.C11410b;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedAct;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.proxy.api.C13662a;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes12.dex */
public class ln00 extends jq2<C11410b> {

    /* JADX INFO: renamed from: a */
    public boolean f128953a;

    /* JADX INFO: renamed from: b */
    public C22392a<roj0> f128954b;

    public ln00(mcr mcrVar) {
        super(mcrVar);
        this.f128954b = C22392a.m221513c(roj0.f160388a);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m150632f0(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m150633g0(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ Integer m150637k0(knb0 knb0Var) {
        return (Integer) knb0Var.f123874b;
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m150639m0() {
        if (!NullChecker.m81303a(FeedModule.m60221F().userId())) {
            return true;
        }
        User userMe_ = FeedModule.m60222H().me_();
        if (NullChecker.m81303a(userMe_)) {
            return !qqi0.m175940h(mqi0.m155944o(), (long) userMe_.createdTime, 1);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m150640o0(Bundle bundle) {
        ((C11410b) this.viewModel).m67061v(bundle);
        FeedModule.f38854c.m60698S2();
        if (NullChecker.m81304b(act()) && act().isTaskRoot() && (act() instanceof MomentsFeedAct)) {
            act().setTaskDescription(new ActivityManager.TaskDescription(act().getString(R$string.f39009Y3), (Bitmap) null, act().getResources().getColor(e1c0.f88793k0)));
        }
    }

    public static String pageId() {
        return "p_moments_view";
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.kn00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123855a.m150640o0((Bundle) obj);
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
        C13662a.m81371p().m81374l();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m150641n0() {
        return this.f128953a;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m150642p0(Pair pair) {
        if (NullChecker.m81303a(act())) {
            if (!m150639m0() || App.f15373i.get().intValue() > 3) {
                FeedModule.m60222H().setMomentTabNum(act(), ((Integer) pair.first).intValue() + ((Integer) pair.second).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Boolean m150643q0(roj0 roj0Var) {
        return Boolean.valueOf(((C11410b) this.viewModel).m67062w());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m150644r0(Pair pair) {
        C11410b c11410b = (C11410b) this.viewModel;
        boolean zBooleanValue = ((Boolean) ((knb0) pair.first).f123873a).booleanValue();
        int iIntValue = ((Integer) ((knb0) pair.first).f123874b).intValue();
        Object obj = pair.first;
        c11410b.m67053I(zBooleanValue, iIntValue, (IntlOperationBanner) ((knb0) obj).f123875c, ((Boolean) ((knb0) obj).f123876d).booleanValue() && !((C11410b) this.viewModel).m67062w());
    }

    /* JADX INFO: renamed from: s0 */
    public void m150645s0() {
        ((C11410b) this.viewModel).m67060u();
        duringCreated(mkd0.m154984r(FeedModule.m60222H().counter().map(new w9j() { // from class: l.bn00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).activities.unread);
            }
        }).distinctUntilChanged(), FeedModule.m60222H().mo30700Js().map(new w9j() { // from class: l.cn00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ln00.m150637k0((knb0) obj);
            }
        }).distinctUntilChanged(), new x9j() { // from class: l.dn00
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Pair.create((Integer) obj, (Integer) obj2);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.en00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92273a.m150642p0((Pair) obj);
            }
        }, new e30() { // from class: l.fn00
            @Override // p149l.e30
            public final void call(Object obj) {
                ln00.m150632f0((Throwable) obj);
            }
        }));
        duringCreated(mkd0.m154984r(FeedModule.m60222H().mo30700Js(), this.f128954b.map(new w9j() { // from class: l.gn00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f103568a.m150643q0((roj0) obj);
            }
        }).distinctUntilChanged(), new x9j() { // from class: l.hn00
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Pair.create((knb0) obj, (Boolean) obj2);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.in00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113985a.m150644r0((Pair) obj);
            }
        }, new e30() { // from class: l.jn00
            @Override // p149l.e30
            public final void call(Object obj) {
                ln00.m150633g0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m150646t0(boolean z) {
        this.f128953a = z;
        if (xdl0.m208349O0(((C11410b) this.viewModel).f43981e) && z && NullChecker.m81304b(act()) && !act().isFinishing()) {
            act().alwaysHideInput();
        }
    }
}
