package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedAct;
import com.p051p1.mobile.putong.feed.p065ui.moments.entry.FeedMomentsEntry;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class pih extends ar2<FeedMomentsEntry> {

    /* JADX INFO: renamed from: a */
    public int f152537a;

    /* JADX INFO: renamed from: b */
    public int f152538b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ Integer m172364f0(ovb0 ovb0Var) {
        return (Integer) ovb0Var.f149249b;
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m172376r0() {
        if (!NullChecker.m82486a(FeedModule.m61405F().userId())) {
            return true;
        }
        User userMe_ = FeedModule.m61406H().me_();
        if (NullChecker.m82486a(userMe_)) {
            return !tzi0.m193670h(pzi0.m174454o(), (long) userMe_.createdTime, 1);
        }
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    private void m172377z0() {
        duringCreated(psd0.m173625r(FeedModule.m61406H().counter().map(new qcj() { // from class: l.aih
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).activities.unread);
            }
        }).distinctUntilChanged(), FeedModule.m61406H().mo31703Js().map(new qcj() { // from class: l.gih
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return pih.m172364f0((ovb0) obj);
            }
        }).distinctUntilChanged(), new rcj() { // from class: l.hih
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return pf60.m172085a((Integer) obj, (Integer) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.iih
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115101a.m172381x0((pf60) obj);
            }
        }));
        duringCreated(mrb0.m159656j()).map(new qcj() { // from class: l.jih
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).moments.unreadFeeds);
            }
        }).distinctUntilChanged().filter(new qcj() { // from class: l.kih
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f126986a.m172382y0((Integer) obj);
            }
        }).flatMap(new qcj() { // from class: l.lih
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return FeedModule.f39702c.m61923m4(true);
            }
        }).flatMap(new qcj() { // from class: l.mih
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return psd0.m173625r(FeedModule.f39702c.m61895Y3(), Act.foreground().map(new qcj() { // from class: l.oih
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        Act.C4450r c4450r = (Act.C4450r) obj2;
                        return Boolean.valueOf(c4450r != null && (c4450r.f16062a.get() instanceof MomentsFeedAct));
                    }
                }).distinctUntilChanged(), new rcj() { // from class: l.bih
                    @Override // p153l.rcj
                    public final Object call(Object obj2, Object obj3) {
                        return jyb.m147494Y((vg60) obj2, (Boolean) obj3);
                    }
                });
            }
        }).subscribe(new y20() { // from class: l.nih
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142125a.m172380u0((pf60) obj);
            }
        });
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m172377z0();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Boolean m172378s0(List list, String str) {
        return Boolean.valueOf(this.f152537a > 0 && !list.contains(str) && list.size() < 10);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m172379t0(List list, String str) {
        list.add(str);
        ((FeedMomentsEntry) this.viewModel).m68254e(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m172380u0(pf60 pf60Var) {
        if (NullChecker.m82486a(pf60Var.f152156a)) {
            if (NullChecker.m82486a(pf60Var.f152157b) && ((Boolean) pf60Var.f152157b).booleanValue()) {
                ((FeedMomentsEntry) this.viewModel).m68256j();
                return;
            }
            int[] iArr = {0};
            if (((vg60) pf60Var.f152156a).f184001a.size() > 0) {
                iArr[0] = ((vg60) pf60Var.f152156a).f184001a.size();
            }
            int i = iArr[0];
            int i2 = this.f152537a;
            if (i > i2) {
                iArr[0] = i2;
            }
            final ArrayList arrayList = new ArrayList();
            duringCreated(C22421c.from(((vg60) pf60Var.f152156a).f184001a)).take(iArr[0]).flatMap(new qcj() { // from class: l.cih
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return mrb0.m159645W(((Moment) obj).owner);
                }
            }).map(new qcj() { // from class: l.dih
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((User) obj).m61308fp().profileSmall().base;
                }
            }).distinctUntilChanged().filter(new qcj() { // from class: l.eih
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f94147a.m172378s0(arrayList, (String) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.fih
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f99188a.m172379t0(arrayList, (String) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m172381x0(pf60 pf60Var) {
        if (NullChecker.m82486a(act())) {
            if (!m172376r0() || App.f16092i.get().intValue() > 3) {
                if (NullChecker.m82486a(pf60Var.f152156a)) {
                    ((FeedMomentsEntry) this.viewModel).setMomentMsgNum(((Integer) pf60Var.f152156a).intValue());
                }
                if (NullChecker.m82486a(pf60Var.f152157b)) {
                    this.f152538b = ((Integer) pf60Var.f152157b).intValue();
                    ((FeedMomentsEntry) this.viewModel).setMomentDot(((Integer) pf60Var.f152157b).intValue() > 0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ Boolean m172382y0(Integer num) {
        if (!NullChecker.m82486a(num)) {
            return Boolean.FALSE;
        }
        int iIntValue = num.intValue();
        this.f152537a = iIntValue;
        ((FeedMomentsEntry) this.viewModel).setMomentDot(iIntValue + this.f152538b > 0);
        ((FeedMomentsEntry) this.viewModel).setPopScale(this.f152537a > 0);
        return Boolean.valueOf(this.f152537a > 0);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
