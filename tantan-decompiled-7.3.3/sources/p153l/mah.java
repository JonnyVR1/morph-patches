package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.data.ActivityActionApi;
import com.p051p1.mobile.putong.feed.data.Moment;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class mah {

    /* JADX INFO: renamed from: a */
    public User f135519a;

    /* JADX INFO: renamed from: b */
    public List<Moment> f135520b;

    /* JADX INFO: renamed from: a */
    public List<Moment> m157648a() {
        return this.f135520b;
    }

    /* JADX INFO: renamed from: b */
    public User m157649b() {
        return this.f135519a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m157650c() {
        User user = this.f135519a;
        if (user == null) {
            return false;
        }
        return "like".equals(user.activityUser.action);
    }

    /* JADX INFO: renamed from: d */
    public boolean m157651d() {
        User user = this.f135519a;
        if (user == null) {
            return false;
        }
        return ActivityActionApi.moment_swipe.equals(user.activityUser.action);
    }

    /* JADX INFO: renamed from: e */
    public void m157652e(List<Moment> list) {
        this.f135520b = list;
    }

    /* JADX INFO: renamed from: f */
    public void m157653f(User user) {
        this.f135519a = user;
    }
}
