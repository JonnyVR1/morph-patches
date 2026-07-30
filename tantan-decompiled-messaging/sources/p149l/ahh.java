package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedAct;
import com.p046p1.mobile.putong.feed.p060ui.moments.entry.FeedMomentsEntry;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class ahh extends jq2<FeedMomentsEntry> {

    /* JADX INFO: renamed from: a */
    public int f69598a;

    /* JADX INFO: renamed from: b */
    public int f69599b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ Integer m96455f0(knb0 knb0Var) {
        return (Integer) knb0Var.f123874b;
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m96467r0() {
        if (!NullChecker.m81303a(FeedModule.m60221F().userId())) {
            return true;
        }
        User userMe_ = FeedModule.m60222H().me_();
        if (NullChecker.m81303a(userMe_)) {
            return !qqi0.m175940h(mqi0.m155944o(), (long) userMe_.createdTime, 1);
        }
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    private void m96468z0() {
        duringCreated(mkd0.m154984r(FeedModule.m60222H().counter().map(new w9j() { // from class: l.lgh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).activities.unread);
            }
        }).distinctUntilChanged(), FeedModule.m60222H().mo30700Js().map(new w9j() { // from class: l.rgh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ahh.m96455f0((knb0) obj);
            }
        }).distinctUntilChanged(), new x9j() { // from class: l.sgh
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return j760.m140076a((Integer) obj, (Integer) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.tgh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170097a.m96472x0((j760) obj);
            }
        }));
        duringCreated(ijb0.m136570j()).map(new w9j() { // from class: l.ugh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).moments.unreadFeeds);
            }
        }).distinctUntilChanged().filter(new w9j() { // from class: l.vgh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f181372a.m96473y0((Integer) obj);
            }
        }).flatMap(new w9j() { // from class: l.wgh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return FeedModule.f38854c.m60739m4(true);
            }
        }).flatMap(new w9j() { // from class: l.xgh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return mkd0.m154984r(FeedModule.f38854c.m60711Y3(), Act.foreground().map(new w9j() { // from class: l.zgh
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        Act.C4299r c4299r = (Act.C4299r) obj2;
                        return Boolean.valueOf(c4299r != null && (c4299r.f15343a.get() instanceof MomentsFeedAct));
                    }
                }).distinctUntilChanged(), new x9j() { // from class: l.mgh
                    @Override // p149l.x9j
                    public final Object call(Object obj2, Object obj3) {
                        return vwb.m200311Y((q860) obj2, (Boolean) obj3);
                    }
                });
            }
        }).subscribe(new e30() { // from class: l.ygh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198164a.m96471u0((j760) obj);
            }
        });
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m96468z0();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Boolean m96469s0(List list, String str) {
        return Boolean.valueOf(this.f69598a > 0 && !list.contains(str) && list.size() < 10);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m96470t0(List list, String str) {
        list.add(str);
        ((FeedMomentsEntry) this.viewModel).m67071e(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m96471u0(j760 j760Var) {
        if (NullChecker.m81303a(j760Var.f116564a)) {
            if (NullChecker.m81303a(j760Var.f116565b) && ((Boolean) j760Var.f116565b).booleanValue()) {
                ((FeedMomentsEntry) this.viewModel).m67073j();
                return;
            }
            int[] iArr = {0};
            if (((q860) j760Var.f116564a).f153135a.size() > 0) {
                iArr[0] = ((q860) j760Var.f116564a).f153135a.size();
            }
            int i = iArr[0];
            int i2 = this.f69598a;
            if (i > i2) {
                iArr[0] = i2;
            }
            final ArrayList arrayList = new ArrayList();
            duringCreated(C22306c.from(((q860) j760Var.f116564a).f153135a)).take(iArr[0]).flatMap(new w9j() { // from class: l.ngh
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ijb0.m136559W(((Moment) obj).owner);
                }
            }).map(new w9j() { // from class: l.ogh
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((User) obj).m60124fp().profileSmall().base;
                }
            }).distinctUntilChanged().filter(new w9j() { // from class: l.pgh
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f148704a.m96469s0(arrayList, (String) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.qgh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f154334a.m96470t0(arrayList, (String) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m96472x0(j760 j760Var) {
        if (NullChecker.m81303a(act())) {
            if (!m96467r0() || App.f15373i.get().intValue() > 3) {
                if (NullChecker.m81303a(j760Var.f116564a)) {
                    ((FeedMomentsEntry) this.viewModel).setMomentMsgNum(((Integer) j760Var.f116564a).intValue());
                }
                if (NullChecker.m81303a(j760Var.f116565b)) {
                    this.f69599b = ((Integer) j760Var.f116565b).intValue();
                    ((FeedMomentsEntry) this.viewModel).setMomentDot(((Integer) j760Var.f116565b).intValue() > 0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ Boolean m96473y0(Integer num) {
        if (!NullChecker.m81303a(num)) {
            return Boolean.FALSE;
        }
        int iIntValue = num.intValue();
        this.f69598a = iIntValue;
        ((FeedMomentsEntry) this.viewModel).setMomentDot(iIntValue + this.f69599b > 0);
        ((FeedMomentsEntry) this.viewModel).setPopScale(this.f69598a > 0);
        return Boolean.valueOf(this.f69598a > 0);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
