package p007l;

import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class e3i {

    /* JADX INFO: renamed from: a */
    public Act f7190a;

    /* JADX INFO: renamed from: b */
    public List<BubbleInfo> f7191b;

    /* JADX INFO: renamed from: c */
    public int f7192c;

    /* JADX INFO: renamed from: d */
    public int f7193d;

    public e3i(Act act, List<BubbleInfo> list, int i) {
        new ArrayList();
        this.f7190a = act;
        this.f7191b = list;
        this.f7192c = i;
        this.f7193d = i;
    }

    /* JADX INFO: renamed from: a */
    public Act m9603a() {
        return this.f7190a;
    }

    /* JADX INFO: renamed from: b */
    public BubbleInfo m9604b() {
        return this.f7191b.get(this.f7193d);
    }

    /* JADX INFO: renamed from: c */
    public int m9605c() {
        return this.f7191b.size();
    }

    /* JADX INFO: renamed from: d */
    public BubbleInfo m9606d(int i) {
        return this.f7191b.get(i);
    }

    /* JADX INFO: renamed from: e */
    public List<BubbleInfo> m9607e() {
        return this.f7191b;
    }

    /* JADX INFO: renamed from: f */
    public User m9608f(int i) {
        return FeedModule.f316d.m16628e8(this.f7191b.get(i).owner.f264id);
    }

    /* JADX INFO: renamed from: g */
    public void m9609g(int i) {
        this.f7193d = i;
    }
}
