package p007l;

import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.TopicMomentIdBox;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Group;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.android.app.Act;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rdk extends AbstractC2383f7<Group> {

    /* JADX INFO: renamed from: b */
    public String f12621b;

    /* JADX INFO: renamed from: c */
    public Act f12622c;

    public rdk(Act act, String str) {
        this.f12621b = str;
        this.f12622c = act;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m13900e(Envelope envelope) {
        if (((FeedData) envelope.data.getModuleData(FeedData.class)).groups.size() == 0) {
            m10070b().mo2959a(new Exception("empty data"));
            return;
        }
        Group group = ((FeedData) envelope.data.getModuleData(FeedData.class)).groups.get(0);
        List<TopicMoment> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).momentTopics;
        HashMap map = new HashMap();
        for (TopicMoment topicMoment : list) {
            map.put(topicMoment.f708id, topicMoment);
        }
        Iterator<TopicMomentIdBox> it = group.hotTopics.iterator();
        while (it.hasNext()) {
            TopicMoment topicMoment2 = (TopicMoment) map.get(it.next().f285id);
            if (topicMoment2 != null) {
                group.hotTopicsModels.add(topicMoment2);
            }
        }
        Iterator<TopicMomentIdBox> it2 = group.topics.iterator();
        while (it2.hasNext()) {
            TopicMoment topicMoment3 = (TopicMoment) map.get(it2.next().f285id);
            if (topicMoment3 != null) {
                group.relatedTopics.add(topicMoment3);
            }
        }
        m10070b().mo2960z0(group, envelope.pagination.links);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m13901f(Throwable th) {
        th.printStackTrace();
        m10070b().mo2959a(th);
    }

    @Override // p007l.qpl
    public void previous() {
        this.f12622c.duringCreated(FeedModule.f316d.m16423B7(this.f12621b)).subscribe(mkd0.H(new e30() { // from class: l.pdk
            public final void call(Object obj) {
                this.f11801a.m13900e((Envelope) obj);
            }
        }, new e30() { // from class: l.qdk
            public final void call(Object obj) {
                this.f12209a.m13901f((Throwable) obj);
            }
        }));
    }

    @Override // p007l.qpl
    public void next() {
    }
}
