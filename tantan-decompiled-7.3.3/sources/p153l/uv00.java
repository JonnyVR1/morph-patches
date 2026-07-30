package p153l;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Pair;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.IntlOperationBanner;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.p065ui.moments.C11573b;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedAct;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.proxy.api.C13825a;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes13.dex */
public class uv00 extends ar2<C11573b> {

    /* JADX INFO: renamed from: a */
    public boolean f181105a;

    /* JADX INFO: renamed from: b */
    public C22507a<uxj0> f181106b;

    public uv00(ner nerVar) {
        super(nerVar);
        this.f181106b = C22507a.m222759c(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m198224f0(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m198225g0(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ Integer m198229k0(ovb0 ovb0Var) {
        return (Integer) ovb0Var.f149249b;
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m198231m0() {
        if (!NullChecker.m82486a(FeedModule.m61405F().userId())) {
            return true;
        }
        User userMe_ = FeedModule.m61406H().me_();
        if (NullChecker.m82486a(userMe_)) {
            return !tzi0.m193670h(pzi0.m174454o(), (long) userMe_.createdTime, 1);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m198232o0(Bundle bundle) {
        ((C11573b) this.viewModel).m68244v(bundle);
        FeedModule.f39702c.m61882S2();
        if (NullChecker.m82487b(act()) && act().isTaskRoot() && (act() instanceof MomentsFeedAct)) {
            act().setTaskDescription(new ActivityManager.TaskDescription(act().getString(R$string.f39857Y3), (Bitmap) null, act().getResources().getColor(k9c0.f124516k0)));
        }
    }

    public static String pageId() {
        return "p_moments_view";
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.tv00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176235a.m198232o0((Bundle) obj);
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
        C13825a.m82554p().m82557l();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m198233n0() {
        return this.f181105a;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m198234p0(Pair pair) {
        if (NullChecker.m82486a(act())) {
            if (!m198231m0() || App.f16092i.get().intValue() > 3) {
                FeedModule.m61406H().setMomentTabNum(act(), ((Integer) pair.first).intValue() + ((Integer) pair.second).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Boolean m198235q0(uxj0 uxj0Var) {
        return Boolean.valueOf(((C11573b) this.viewModel).m68245w());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m198236r0(Pair pair) {
        C11573b c11573b = (C11573b) this.viewModel;
        boolean zBooleanValue = ((Boolean) ((ovb0) pair.first).f149248a).booleanValue();
        int iIntValue = ((Integer) ((ovb0) pair.first).f149249b).intValue();
        Object obj = pair.first;
        c11573b.m68236I(zBooleanValue, iIntValue, (IntlOperationBanner) ((ovb0) obj).f149250c, ((Boolean) ((ovb0) obj).f149251d).booleanValue() && !((C11573b) this.viewModel).m68245w());
    }

    /* JADX INFO: renamed from: s0 */
    public void m198237s0() {
        ((C11573b) this.viewModel).m68243u();
        duringCreated(psd0.m173625r(FeedModule.m61406H().counter().map(new qcj() { // from class: l.kv00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).activities.unread);
            }
        }).distinctUntilChanged(), FeedModule.m61406H().mo31703Js().map(new qcj() { // from class: l.lv00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uv00.m198229k0((ovb0) obj);
            }
        }).distinctUntilChanged(), new rcj() { // from class: l.mv00
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Pair.create((Integer) obj, (Integer) obj2);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.nv00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143757a.m198234p0((Pair) obj);
            }
        }, new y20() { // from class: l.ov00
            @Override // p153l.y20
            public final void call(Object obj) {
                uv00.m198224f0((Throwable) obj);
            }
        }));
        duringCreated(psd0.m173625r(FeedModule.m61406H().mo31703Js(), this.f181106b.map(new qcj() { // from class: l.pv00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f154258a.m198235q0((uxj0) obj);
            }
        }).distinctUntilChanged(), new rcj() { // from class: l.qv00
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Pair.create((ovb0) obj, (Boolean) obj2);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.rv00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164954a.m198236r0((Pair) obj);
            }
        }, new y20() { // from class: l.sv00
            @Override // p153l.y20
            public final void call(Object obj) {
                uv00.m198225g0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m198238t0(boolean z) {
        this.f181105a = z;
        if (bnl0.m105529O0(((C11573b) this.viewModel).f44829e) && z && NullChecker.m82487b(act()) && !act().isFinishing()) {
            act().alwaysHideInput();
        }
    }
}
