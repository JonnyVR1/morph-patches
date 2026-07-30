package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class e3i {

    /* JADX INFO: renamed from: a */
    public Act f89181a;

    /* JADX INFO: renamed from: b */
    public List<BubbleInfo> f89182b;

    /* JADX INFO: renamed from: c */
    public int f89183c;

    /* JADX INFO: renamed from: d */
    public int f89184d;

    public e3i(Act act, List<BubbleInfo> list, int i) {
        new ArrayList();
        this.f89181a = act;
        this.f89182b = list;
        this.f89183c = i;
        this.f89184d = i;
    }

    /* JADX INFO: renamed from: a */
    public Act m114591a() {
        return this.f89181a;
    }

    /* JADX INFO: renamed from: b */
    public BubbleInfo m114592b() {
        return this.f89182b.get(this.f89184d);
    }

    /* JADX INFO: renamed from: c */
    public int m114593c() {
        return this.f89182b.size();
    }

    /* JADX INFO: renamed from: d */
    public BubbleInfo m114594d(int i) {
        return this.f89182b.get(i);
    }

    /* JADX INFO: renamed from: e */
    public List<BubbleInfo> m114595e() {
        return this.f89182b;
    }

    /* JADX INFO: renamed from: f */
    public User m114596f(int i) {
        return FeedModule.f38855d.m209447e8(this.f89182b.get(i).owner.f38803id);
    }

    /* JADX INFO: renamed from: g */
    public void m114597g(int i) {
        this.f89184d = i;
    }
}
