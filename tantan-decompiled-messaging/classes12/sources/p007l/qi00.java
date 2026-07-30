package p007l;

import com.p000p1.mobile.putong.data.Counter;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.UserStatus;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.jo0;
import l.mkd0;
import l.q860;
import l.roj0;
import l.w9j;
import l.zpd0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qi00 {

    /* JADX INFO: renamed from: a */
    public static int f12241a = -1024;

    /* JADX INFO: renamed from: b */
    public static a<Integer> f12242b = a.c(0);

    /* JADX INFO: renamed from: c */
    public static final zpd0 f12243c = new zpd0("feed_last_see_entry_click_time" + FeedModule.m1139F().userId(), 0L, false);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m13558a(Integer num) {
        int i = f12241a;
        if (i == -1024) {
            f12241a = num.intValue();
            return Boolean.FALSE;
        }
        if (i > 0 || num.intValue() <= 0) {
            return Boolean.valueOf(f12241a > 0 && num.intValue() <= 0);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ c m13559b(Integer num) {
        f12241a = num.intValue();
        return ijb0.m10890A(null, (num.intValue() > 0 ? Long.valueOf(ijb0.m10929p()) : 0L).longValue(), 5);
    }

    /* JADX INFO: renamed from: e */
    public static int m13562e() {
        Counter counterM10924k = ijb0.m10924k();
        if (NullChecker.a(counterM10924k) && NullChecker.b(counterM10924k.likersLimit)) {
            return counterM10924k.likersLimit.remaining;
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m13563f() {
        return m13562e() > 0;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m13564g(User user) {
        if (!NullChecker.a(user) || user.isJailed()) {
            return false;
        }
        return !user.status.contains(UserStatus.get("hidden")) || ((Integer) App.i.get()).equals(ijb0.m10930q());
    }

    /* JADX INFO: renamed from: h */
    public static c<roj0> m13565h() {
        Counter counterM10924k = ijb0.m10924k();
        if (NullChecker.a(counterM10924k) && NullChecker.b(counterM10924k.likersLimit)) {
            return ijb0.m10890A(null, (counterM10924k.likersLimit.remaining > 0 ? Long.valueOf(ijb0.m10929p()) : 0L).longValue(), 5);
        }
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: i */
    public static c<j760<User, q860<User>>> m13566i() {
        return mkd0.r(ijb0.m10891B(), ijb0.m10895F(), new li00()).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: j */
    public static c<j760<User, q860<User>>> m13567j() {
        f12241a = m13562e();
        return ijb0.m10923j().map(new w9j() { // from class: l.mi00
            public final Object call(Object obj) {
                Counter counter = (Counter) obj;
                return Integer.valueOf(counter == null ? 0 : counter.likersLimit.remaining);
            }
        }).filter(new w9j() { // from class: l.ni00
            public final Object call(Object obj) {
                return qi00.m13558a((Integer) obj);
            }
        }).flatMap(new w9j() { // from class: l.oi00
            public final Object call(Object obj) {
                return qi00.m13559b((Integer) obj);
            }
        }).flatMap(new w9j() { // from class: l.pi00
            public final Object call(Object obj) {
                return mkd0.r(ijb0.m10891B(), ijb0.m10895F(), new li00()).take(1);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: k */
    public static void m13568k() {
        m13565h();
    }
}
