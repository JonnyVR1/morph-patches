package p153l;

import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes13.dex */
public class zq00 {

    /* JADX INFO: renamed from: a */
    public static int f205556a = -1024;

    /* JADX INFO: renamed from: b */
    public static C22507a<Integer> f205557b = C22507a.m222759c(0);

    /* JADX INFO: renamed from: c */
    public static final byd0 f205558c = new byd0("feed_last_see_entry_click_time" + FeedModule.m61405F().userId(), 0L, false);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m220934a(Integer num) {
        int i = f205556a;
        if (i == -1024) {
            f205556a = num.intValue();
            return Boolean.FALSE;
        }
        if (i > 0 || num.intValue() <= 0) {
            return Boolean.valueOf(f205556a > 0 && num.intValue() <= 0);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22421c m220935b(Integer num) {
        f205556a = num.intValue();
        return mrb0.m159623A(null, (num.intValue() > 0 ? Long.valueOf(mrb0.m159662p()) : 0L).longValue(), 5);
    }

    /* JADX INFO: renamed from: e */
    public static int m220938e() {
        Counter counterM159657k = mrb0.m159657k();
        if (NullChecker.m82486a(counterM159657k) && NullChecker.m82487b(counterM159657k.likersLimit)) {
            return counterM159657k.likersLimit.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m220939f() {
        return m220938e() > 0;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m220940g(User user) {
        if (!NullChecker.m82486a(user) || user.isJailed()) {
            return false;
        }
        return !user.status.contains(UserStatus.get("hidden")) || App.f16092i.get().equals(mrb0.m159663q());
    }

    /* JADX INFO: renamed from: h */
    public static C22421c<uxj0> m220941h() {
        Counter counterM159657k = mrb0.m159657k();
        if (NullChecker.m82486a(counterM159657k) && NullChecker.m82487b(counterM159657k.likersLimit)) {
            return mrb0.m159623A(null, (counterM159657k.likersLimit.remaining > 0 ? Long.valueOf(mrb0.m159662p()) : 0L).longValue(), 5);
        }
        return C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: i */
    public static C22421c<pf60<User, vg60<User>>> m220942i() {
        return psd0.m173625r(mrb0.m159624B(), mrb0.m159628F(), new uq00()).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: j */
    public static C22421c<pf60<User, vg60<User>>> m220943j() {
        f205556a = m220938e();
        return mrb0.m159656j().map(new qcj() { // from class: l.vq00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Counter counter = (Counter) obj;
                return Integer.valueOf(counter == null ? 0 : counter.likersLimit.remaining);
            }
        }).filter(new qcj() { // from class: l.wq00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return zq00.m220934a((Integer) obj);
            }
        }).flatMap(new qcj() { // from class: l.xq00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return zq00.m220935b((Integer) obj);
            }
        }).flatMap(new qcj() { // from class: l.yq00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return psd0.m173625r(mrb0.m159624B(), mrb0.m159628F(), new uq00()).take(1);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: k */
    public static void m220944k() {
        m220941h();
    }
}
