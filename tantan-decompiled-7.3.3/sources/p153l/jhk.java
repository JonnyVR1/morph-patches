package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Group;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class jhk {

    /* JADX INFO: renamed from: a */
    public Group f120979a;

    /* JADX INFO: renamed from: b */
    public List<User> f120980b = new ArrayList();

    public jhk(Group group) {
        this.f120979a = group;
    }

    /* JADX INFO: renamed from: a */
    public String m144903a() {
        return this.f120979a.description;
    }

    /* JADX INFO: renamed from: b */
    public Group m144904b() {
        return this.f120979a;
    }

    /* JADX INFO: renamed from: c */
    public List<String> m144905c() {
        return this.f120979a.backgroundColors;
    }

    /* JADX INFO: renamed from: d */
    public String m144906d() {
        return this.f120979a.icon;
    }

    /* JADX INFO: renamed from: e */
    public String m144907e() {
        return this.f120979a.f56859id;
    }

    /* JADX INFO: renamed from: f */
    public String m144908f() {
        return this.f120979a.owner;
    }

    /* JADX INFO: renamed from: g */
    public List<TopicMoment> m144909g() {
        return this.f120979a.hotTopicsModels;
    }

    /* JADX INFO: renamed from: h */
    public List<TopicMoment> m144910h() {
        return this.f120979a.relatedTopics;
    }

    /* JADX INFO: renamed from: i */
    public String m144911i() {
        return this.f120979a.name;
    }

    /* JADX INFO: renamed from: j */
    public String m144912j() {
        if (m144913k() == 0) {
            return "";
        }
        return ksg.m151226r(m144913k()) + this.f120979a.state;
    }

    /* JADX INFO: renamed from: k */
    public int m144913k() {
        return this.f120979a.userCounter;
    }

    /* JADX INFO: renamed from: l */
    public List<User> m144914l() {
        if (!jyb.m147479J(this.f120980b)) {
            return this.f120980b;
        }
        Iterator<String> it = this.f120979a.userIds.iterator();
        while (it.hasNext()) {
            this.f120980b.add(FeedModule.f39703d.m145688e8(it.next()));
        }
        return this.f120980b;
    }

    /* JADX INFO: renamed from: m */
    public boolean m144915m() {
        return this.f120979a.joined;
    }
}
