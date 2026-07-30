package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class t4i {

    /* JADX INFO: renamed from: a */
    public Act f172075a;

    /* JADX INFO: renamed from: b */
    public List<BubbleInfo> f172076b;

    /* JADX INFO: renamed from: c */
    public int f172077c;

    /* JADX INFO: renamed from: d */
    public int f172078d;

    public t4i(Act act, List<BubbleInfo> list, int i) {
        new ArrayList();
        this.f172075a = act;
        this.f172076b = list;
        this.f172077c = i;
        this.f172078d = i;
    }

    /* JADX INFO: renamed from: a */
    public Act m189271a() {
        return this.f172075a;
    }

    /* JADX INFO: renamed from: b */
    public BubbleInfo m189272b() {
        return this.f172076b.get(this.f172078d);
    }

    /* JADX INFO: renamed from: c */
    public int m189273c() {
        return this.f172076b.size();
    }

    /* JADX INFO: renamed from: d */
    public BubbleInfo m189274d(int i) {
        return this.f172076b.get(i);
    }

    /* JADX INFO: renamed from: e */
    public List<BubbleInfo> m189275e() {
        return this.f172076b;
    }

    /* JADX INFO: renamed from: f */
    public User m189276f(int i) {
        return FeedModule.f39703d.m145688e8(this.f172076b.get(i).owner.f39651id);
    }

    /* JADX INFO: renamed from: g */
    public void m189277g(int i) {
        this.f172078d = i;
    }
}
