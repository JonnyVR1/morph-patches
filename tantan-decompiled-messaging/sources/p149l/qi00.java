package p149l;

import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes12.dex */
public class qi00 {

    /* JADX INFO: renamed from: a */
    public static int f154634a = -1024;

    /* JADX INFO: renamed from: b */
    public static C22392a<Integer> f154635b = C22392a.m221513c(0);

    /* JADX INFO: renamed from: c */
    public static final zpd0 f154636c = new zpd0("feed_last_see_entry_click_time" + FeedModule.m60221F().userId(), 0L, false);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m174700a(Integer num) {
        int i = f154634a;
        if (i == -1024) {
            f154634a = num.intValue();
            return Boolean.FALSE;
        }
        if (i > 0 || num.intValue() <= 0) {
            return Boolean.valueOf(f154634a > 0 && num.intValue() <= 0);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22306c m174701b(Integer num) {
        f154634a = num.intValue();
        return ijb0.m136537A(null, (num.intValue() > 0 ? Long.valueOf(ijb0.m136576p()) : 0L).longValue(), 5);
    }

    /* JADX INFO: renamed from: e */
    public static int m174704e() {
        Counter counterM136571k = ijb0.m136571k();
        if (NullChecker.m81303a(counterM136571k) && NullChecker.m81304b(counterM136571k.likersLimit)) {
            return counterM136571k.likersLimit.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m174705f() {
        return m174704e() > 0;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m174706g(User user) {
        if (!NullChecker.m81303a(user) || user.isJailed()) {
            return false;
        }
        return !user.status.contains(UserStatus.get("hidden")) || App.f15373i.get().equals(ijb0.m136577q());
    }

    /* JADX INFO: renamed from: h */
    public static C22306c<roj0> m174707h() {
        Counter counterM136571k = ijb0.m136571k();
        if (NullChecker.m81303a(counterM136571k) && NullChecker.m81304b(counterM136571k.likersLimit)) {
            return ijb0.m136537A(null, (counterM136571k.likersLimit.remaining > 0 ? Long.valueOf(ijb0.m136576p()) : 0L).longValue(), 5);
        }
        return C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: i */
    public static C22306c<j760<User, q860<User>>> m174708i() {
        return mkd0.m154984r(ijb0.m136538B(), ijb0.m136542F(), new li00()).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: j */
    public static C22306c<j760<User, q860<User>>> m174709j() {
        f154634a = m174704e();
        return ijb0.m136570j().map(new w9j() { // from class: l.mi00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Counter counter = (Counter) obj;
                return Integer.valueOf(counter == null ? 0 : counter.likersLimit.remaining);
            }
        }).filter(new w9j() { // from class: l.ni00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qi00.m174700a((Integer) obj);
            }
        }).flatMap(new w9j() { // from class: l.oi00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qi00.m174701b((Integer) obj);
            }
        }).flatMap(new w9j() { // from class: l.pi00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return mkd0.m154984r(ijb0.m136538B(), ijb0.m136542F(), new li00()).take(1);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: k */
    public static void m174710k() {
        m174707h();
    }
}
