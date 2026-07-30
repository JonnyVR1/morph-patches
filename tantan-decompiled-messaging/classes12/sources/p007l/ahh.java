package p007l;

import com.p000p1.mobile.putong.data.Counter;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedAct;
import com.p000p1.mobile.putong.feed.p005ui.moments.entry.FeedMomentsEntry;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.j760;
import l.jq2;
import l.knb0;
import l.mkd0;
import l.mqi0;
import l.q860;
import l.qqi0;
import l.vwb;
import l.w9j;
import l.x9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ahh extends jq2<FeedMomentsEntry> {

    /* JADX INFO: renamed from: a */
    public int f5747a;

    /* JADX INFO: renamed from: b */
    public int f5748b;

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ Integer m8541f0(knb0 knb0Var) {
        return (Integer) knb0Var.b;
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m8553r0() {
        if (!NullChecker.a(FeedModule.m1139F().userId())) {
            return true;
        }
        User userMe_ = FeedModule.m1140H().me_();
        if (NullChecker.a(userMe_)) {
            return !qqi0.h(mqi0.o(), (long) userMe_.createdTime, 1);
        }
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    private void m8554z0() {
        duringCreated(mkd0.r(FeedModule.m1140H().counter().map(new w9j() { // from class: l.lgh
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).activities.unread);
            }
        }).distinctUntilChanged(), FeedModule.m1140H().Js().map(new w9j() { // from class: l.rgh
            public final Object call(Object obj) {
                return ahh.m8541f0((knb0) obj);
            }
        }).distinctUntilChanged(), new x9j() { // from class: l.sgh
            public final Object call(Object obj, Object obj2) {
                return j760.a((Integer) obj, (Integer) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.tgh
            public final void call(Object obj) {
                this.f13296a.m8559x0((j760) obj);
            }
        }));
        duringCreated(ijb0.m10923j()).map(new w9j() { // from class: l.ugh
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).moments.unreadFeeds);
            }
        }).distinctUntilChanged().filter(new w9j() { // from class: l.vgh
            public final Object call(Object obj) {
                return this.f14169a.m8560y0((Integer) obj);
            }
        }).flatMap(new w9j() { // from class: l.wgh
            public final Object call(Object obj) {
                return FeedModule.f315c.m1665m4(true);
            }
        }).flatMap(new w9j() { // from class: l.xgh
            public final Object call(Object obj) {
                return mkd0.r(FeedModule.f315c.m1637Y3(), Act.foreground().map(new w9j() { // from class: l.zgh
                    public final Object call(Object obj2) {
                        Act.r rVar = (Act.r) obj2;
                        return Boolean.valueOf(rVar != null && (rVar.a.get() instanceof MomentsFeedAct));
                    }
                }).distinctUntilChanged(), new x9j() { // from class: l.mgh
                    public final Object call(Object obj2, Object obj3) {
                        return vwb.Y((q860) obj2, (Boolean) obj3);
                    }
                });
            }
        }).subscribe(new e30() { // from class: l.ygh
            public final void call(Object obj) {
                this.f15427a.m8558u0((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m8555a0() {
        super.a0();
        m8554z0();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Boolean m8556s0(List list, String str) {
        return Boolean.valueOf(this.f5747a > 0 && !list.contains(str) && list.size() < 10);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m8557t0(List list, String str) {
        list.add(str);
        ((FeedMomentsEntry) ((jq2) this).viewModel).m8277e(list);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m8558u0(j760 j760Var) {
        if (NullChecker.a(j760Var.a)) {
            if (NullChecker.a(j760Var.b) && ((Boolean) j760Var.b).booleanValue()) {
                ((FeedMomentsEntry) ((jq2) this).viewModel).m8280j();
                return;
            }
            int[] iArr = {0};
            if (((q860) j760Var.a).a.size() > 0) {
                iArr[0] = ((q860) j760Var.a).a.size();
            }
            int i = iArr[0];
            int i2 = this.f5747a;
            if (i > i2) {
                iArr[0] = i2;
            }
            final ArrayList arrayList = new ArrayList();
            duringCreated(c.from(((q860) j760Var.a).a)).take(iArr[0]).flatMap(new w9j() { // from class: l.ngh
                public final Object call(Object obj) {
                    return ijb0.m10912W(((Moment) obj).owner);
                }
            }).map(new w9j() { // from class: l.ogh
                public final Object call(Object obj) {
                    return ((User) obj).m1042fp().profileSmall().base;
                }
            }).distinctUntilChanged().filter(new w9j() { // from class: l.pgh
                public final Object call(Object obj) {
                    return this.f11837a.m8556s0(arrayList, (String) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.qgh
                public final void call(Object obj) {
                    this.f12234a.m8557t0(arrayList, (String) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m8559x0(j760 j760Var) {
        if (NullChecker.a(act())) {
            if (!m8553r0() || ((Integer) App.i.get()).intValue() > 3) {
                if (NullChecker.a(j760Var.a)) {
                    ((FeedMomentsEntry) ((jq2) this).viewModel).setMomentMsgNum(((Integer) j760Var.a).intValue());
                }
                if (NullChecker.a(j760Var.b)) {
                    this.f5748b = ((Integer) j760Var.b).intValue();
                    ((FeedMomentsEntry) ((jq2) this).viewModel).setMomentDot(((Integer) j760Var.b).intValue() > 0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ Boolean m8560y0(Integer num) {
        if (!NullChecker.a(num)) {
            return Boolean.FALSE;
        }
        int iIntValue = num.intValue();
        this.f5747a = iIntValue;
        ((FeedMomentsEntry) ((jq2) this).viewModel).setMomentDot(iIntValue + this.f5748b > 0);
        ((FeedMomentsEntry) ((jq2) this).viewModel).setPopScale(this.f5747a > 0);
        return Boolean.valueOf(this.f5747a > 0);
    }

    public void destroy() {
    }
}
