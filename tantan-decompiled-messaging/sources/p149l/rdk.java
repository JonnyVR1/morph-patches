package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.TopicMomentIdBox;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Group;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class rdk extends AbstractC16769f7<Group> {

    /* JADX INFO: renamed from: b */
    public String f158948b;

    /* JADX INFO: renamed from: c */
    public Act f158949c;

    public rdk(Act act, String str) {
        this.f158948b = str;
        this.f158949c = act;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m178974e(Envelope envelope) {
        if (((FeedData) envelope.data.getModuleData(FeedData.class)).groups.size() == 0) {
            m119702b().mo61985a(new Exception("empty data"));
            return;
        }
        Group group = ((FeedData) envelope.data.getModuleData(FeedData.class)).groups.get(0);
        List<TopicMoment> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).momentTopics;
        HashMap map = new HashMap();
        for (TopicMoment topicMoment : list) {
            map.put(topicMoment.f39247id, topicMoment);
        }
        Iterator<TopicMomentIdBox> it = group.hotTopics.iterator();
        while (it.hasNext()) {
            TopicMoment topicMoment2 = (TopicMoment) map.get(it.next().f38824id);
            if (topicMoment2 != null) {
                group.hotTopicsModels.add(topicMoment2);
            }
        }
        Iterator<TopicMomentIdBox> it2 = group.topics.iterator();
        while (it2.hasNext()) {
            TopicMoment topicMoment3 = (TopicMoment) map.get(it2.next().f38824id);
            if (topicMoment3 != null) {
                group.relatedTopics.add(topicMoment3);
            }
        }
        m119702b().mo61986z0(group, envelope.pagination.links);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m178975f(Throwable th) {
        th.printStackTrace();
        m119702b().mo61985a(th);
    }

    @Override // p149l.qpl
    public void previous() {
        this.f158949c.duringCreated(FeedModule.f38855d.m209242B7(this.f158948b)).subscribe(mkd0.m154956H(new e30() { // from class: l.pdk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148309a.m178974e((Envelope) obj);
            }
        }, new e30() { // from class: l.qdk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153940a.m178975f((Throwable) obj);
            }
        }));
    }

    @Override // p149l.qpl
    public void next() {
    }
}
