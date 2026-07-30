package p007l;

import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.data.ActivityActionApi;
import com.p000p1.mobile.putong.feed.data.Moment;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class x8h {

    /* JADX INFO: renamed from: a */
    public User f14799a;

    /* JADX INFO: renamed from: b */
    public List<Moment> f14800b;

    /* JADX INFO: renamed from: a */
    public List<Moment> m16036a() {
        return this.f14800b;
    }

    /* JADX INFO: renamed from: b */
    public User m16037b() {
        return this.f14799a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m16038c() {
        User user = this.f14799a;
        if (user == null) {
            return false;
        }
        return "like".equals(user.activityUser.action);
    }

    /* JADX INFO: renamed from: d */
    public boolean m16039d() {
        User user = this.f14799a;
        if (user == null) {
            return false;
        }
        return ActivityActionApi.moment_swipe.equals(user.activityUser.action);
    }

    /* JADX INFO: renamed from: e */
    public void m16040e(List<Moment> list) {
        this.f14800b = list;
    }

    /* JADX INFO: renamed from: f */
    public void m16041f(User user) {
        this.f14799a = user;
    }
}
