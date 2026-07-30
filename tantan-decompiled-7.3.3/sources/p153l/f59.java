package p153l;

import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.data.ActivityActionApi;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class f59 {

    /* JADX INFO: renamed from: a */
    public User f97205a;

    /* JADX INFO: renamed from: b */
    public List<CoreMomentInfo> f97206b;

    /* JADX INFO: renamed from: c */
    public int f97207c;

    /* JADX INFO: renamed from: d */
    public boolean f97208d;

    /* JADX INFO: renamed from: a */
    public int m124107a() {
        return this.f97207c;
    }

    /* JADX INFO: renamed from: b */
    public List<CoreMomentInfo> m124108b() {
        return this.f97206b;
    }

    /* JADX INFO: renamed from: c */
    public User m124109c() {
        return this.f97205a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m124110d() {
        User user = this.f97205a;
        if (user == null) {
            return false;
        }
        return "like".equals(user.activityUser.action);
    }

    /* JADX INFO: renamed from: e */
    public boolean m124111e() {
        User user = this.f97205a;
        if (user == null) {
            return false;
        }
        return ActivityActionApi.moment_swipe.equals(user.activityUser.action);
    }

    /* JADX INFO: renamed from: f */
    public boolean m124112f() {
        return this.f97208d;
    }

    /* JADX INFO: renamed from: g */
    public void m124113g(int i) {
        this.f97207c = i;
    }

    /* JADX INFO: renamed from: h */
    public void m124114h(List<CoreMomentInfo> list) {
        this.f97206b = list;
    }

    /* JADX INFO: renamed from: i */
    public void m124115i(boolean z) {
        this.f97208d = z;
    }

    /* JADX INFO: renamed from: j */
    public void m124116j(User user) {
        this.f97205a = user;
    }
}
