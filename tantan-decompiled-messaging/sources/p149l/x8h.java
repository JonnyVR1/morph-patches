package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.data.ActivityActionApi;
import com.p046p1.mobile.putong.feed.data.Moment;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class x8h {

    /* JADX INFO: renamed from: a */
    public User f191512a;

    /* JADX INFO: renamed from: b */
    public List<Moment> f191513b;

    /* JADX INFO: renamed from: a */
    public List<Moment> m207395a() {
        return this.f191513b;
    }

    /* JADX INFO: renamed from: b */
    public User m207396b() {
        return this.f191512a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m207397c() {
        User user = this.f191512a;
        if (user == null) {
            return false;
        }
        return "like".equals(user.activityUser.action);
    }

    /* JADX INFO: renamed from: d */
    public boolean m207398d() {
        User user = this.f191512a;
        if (user == null) {
            return false;
        }
        return ActivityActionApi.moment_swipe.equals(user.activityUser.action);
    }

    /* JADX INFO: renamed from: e */
    public void m207399e(List<Moment> list) {
        this.f191513b = list;
    }

    /* JADX INFO: renamed from: f */
    public void m207400f(User user) {
        this.f191512a = user;
    }
}
