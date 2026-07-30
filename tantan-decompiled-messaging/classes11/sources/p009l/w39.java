package p009l;

import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.data.User;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class w39 {

    /* JADX INFO: renamed from: a */
    public User f21867a;

    /* JADX INFO: renamed from: b */
    public List<CoreMomentInfo> f21868b;

    /* JADX INFO: renamed from: c */
    public int f21869c;

    /* JADX INFO: renamed from: d */
    public boolean f21870d;

    /* JADX INFO: renamed from: a */
    public int m23797a() {
        return this.f21869c;
    }

    /* JADX INFO: renamed from: b */
    public List<CoreMomentInfo> m23798b() {
        return this.f21868b;
    }

    /* JADX INFO: renamed from: c */
    public User m23799c() {
        return this.f21867a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m23800d() {
        User user = this.f21867a;
        if (user == null) {
            return false;
        }
        return "like".equals(user.activityUser.action);
    }

    /* JADX INFO: renamed from: e */
    public boolean m23801e() {
        User user = this.f21867a;
        if (user == null) {
            return false;
        }
        return "moment_swipe".equals(user.activityUser.action);
    }

    /* JADX INFO: renamed from: f */
    public boolean m23802f() {
        return this.f21870d;
    }

    /* JADX INFO: renamed from: g */
    public void m23803g(int i) {
        this.f21869c = i;
    }

    /* JADX INFO: renamed from: h */
    public void m23804h(List<CoreMomentInfo> list) {
        this.f21868b = list;
    }

    /* JADX INFO: renamed from: i */
    public void m23805i(boolean z) {
        this.f21870d = z;
    }

    /* JADX INFO: renamed from: j */
    public void m23806j(User user) {
        this.f21867a = user;
    }
}
