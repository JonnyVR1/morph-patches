package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Group;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class tek {

    /* JADX INFO: renamed from: a */
    public Group f169844a;

    /* JADX INFO: renamed from: b */
    public List<User> f169845b = new ArrayList();

    public tek(Group group) {
        this.f169844a = group;
    }

    /* JADX INFO: renamed from: a */
    public String m188509a() {
        return this.f169844a.description;
    }

    /* JADX INFO: renamed from: b */
    public Group m188510b() {
        return this.f169844a;
    }

    /* JADX INFO: renamed from: c */
    public List<String> m188511c() {
        return this.f169844a.backgroundColors;
    }

    /* JADX INFO: renamed from: d */
    public String m188512d() {
        return this.f169844a.icon;
    }

    /* JADX INFO: renamed from: e */
    public String m188513e() {
        return this.f169844a.f56011id;
    }

    /* JADX INFO: renamed from: f */
    public String m188514f() {
        return this.f169844a.owner;
    }

    /* JADX INFO: renamed from: g */
    public List<TopicMoment> m188515g() {
        return this.f169844a.hotTopicsModels;
    }

    /* JADX INFO: renamed from: h */
    public List<TopicMoment> m188516h() {
        return this.f169844a.relatedTopics;
    }

    /* JADX INFO: renamed from: i */
    public String m188517i() {
        return this.f169844a.name;
    }

    /* JADX INFO: renamed from: j */
    public String m188518j() {
        if (m188519k() == 0) {
            return "";
        }
        return vqg.m199567r(m188519k()) + this.f169844a.state;
    }

    /* JADX INFO: renamed from: k */
    public int m188519k() {
        return this.f169844a.userCounter;
    }

    /* JADX INFO: renamed from: l */
    public List<User> m188520l() {
        if (!vwb.m200296J(this.f169845b)) {
            return this.f169845b;
        }
        Iterator<String> it = this.f169844a.userIds.iterator();
        while (it.hasNext()) {
            this.f169845b.add(FeedModule.f38855d.m209447e8(it.next()));
        }
        return this.f169845b;
    }

    /* JADX INFO: renamed from: m */
    public boolean m188521m() {
        return this.f169844a.joined;
    }
}
