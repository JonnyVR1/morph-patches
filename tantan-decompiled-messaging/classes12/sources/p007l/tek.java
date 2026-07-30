package p007l;

import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Group;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tek {

    /* JADX INFO: renamed from: a */
    public Group f13272a;

    /* JADX INFO: renamed from: b */
    public List<User> f13273b = new ArrayList();

    public tek(Group group) {
        this.f13272a = group;
    }

    /* JADX INFO: renamed from: a */
    public String m14496a() {
        return this.f13272a.description;
    }

    /* JADX INFO: renamed from: b */
    public Group m14497b() {
        return this.f13272a;
    }

    /* JADX INFO: renamed from: c */
    public List<String> m14498c() {
        return this.f13272a.backgroundColors;
    }

    /* JADX INFO: renamed from: d */
    public String m14499d() {
        return this.f13272a.icon;
    }

    /* JADX INFO: renamed from: e */
    public String m14500e() {
        return ((DbObject) this.f13272a).id;
    }

    /* JADX INFO: renamed from: f */
    public String m14501f() {
        return this.f13272a.owner;
    }

    /* JADX INFO: renamed from: g */
    public List<TopicMoment> m14502g() {
        return this.f13272a.hotTopicsModels;
    }

    /* JADX INFO: renamed from: h */
    public List<TopicMoment> m14503h() {
        return this.f13272a.relatedTopics;
    }

    /* JADX INFO: renamed from: i */
    public String m14504i() {
        return this.f13272a.name;
    }

    /* JADX INFO: renamed from: j */
    public String m14505j() {
        if (m14506k() == 0) {
            return "";
        }
        return vqg.m15537r(m14506k()) + this.f13272a.state;
    }

    /* JADX INFO: renamed from: k */
    public int m14506k() {
        return this.f13272a.userCounter;
    }

    /* JADX INFO: renamed from: l */
    public List<User> m14507l() {
        if (!vwb.J(this.f13273b)) {
            return this.f13273b;
        }
        Iterator<String> it = this.f13272a.userIds.iterator();
        while (it.hasNext()) {
            this.f13273b.add(FeedModule.f316d.m16628e8(it.next()));
        }
        return this.f13273b;
    }

    /* JADX INFO: renamed from: m */
    public boolean m14508m() {
        return this.f13272a.joined;
    }
}
