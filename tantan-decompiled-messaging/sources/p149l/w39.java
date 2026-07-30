package p149l;

import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.data.ActivityActionApi;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class w39 {

    /* JADX INFO: renamed from: a */
    public User f184317a;

    /* JADX INFO: renamed from: b */
    public List<CoreMomentInfo> f184318b;

    /* JADX INFO: renamed from: c */
    public int f184319c;

    /* JADX INFO: renamed from: d */
    public boolean f184320d;

    /* JADX INFO: renamed from: a */
    public int m201261a() {
        return this.f184319c;
    }

    /* JADX INFO: renamed from: b */
    public List<CoreMomentInfo> m201262b() {
        return this.f184318b;
    }

    /* JADX INFO: renamed from: c */
    public User m201263c() {
        return this.f184317a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m201264d() {
        User user = this.f184317a;
        if (user == null) {
            return false;
        }
        return "like".equals(user.activityUser.action);
    }

    /* JADX INFO: renamed from: e */
    public boolean m201265e() {
        User user = this.f184317a;
        if (user == null) {
            return false;
        }
        return ActivityActionApi.moment_swipe.equals(user.activityUser.action);
    }

    /* JADX INFO: renamed from: f */
    public boolean m201266f() {
        return this.f184320d;
    }

    /* JADX INFO: renamed from: g */
    public void m201267g(int i) {
        this.f184319c = i;
    }

    /* JADX INFO: renamed from: h */
    public void m201268h(List<CoreMomentInfo> list) {
        this.f184318b = list;
    }

    /* JADX INFO: renamed from: i */
    public void m201269i(boolean z) {
        this.f184320d = z;
    }

    /* JADX INFO: renamed from: j */
    public void m201270j(User user) {
        this.f184317a = user;
    }
}
