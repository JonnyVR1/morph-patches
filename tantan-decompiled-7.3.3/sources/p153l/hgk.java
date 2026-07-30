package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.TopicMomentIdBox;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Group;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class hgk extends AbstractC15662a7<Group> {

    /* JADX INFO: renamed from: b */
    public String f109415b;

    /* JADX INFO: renamed from: c */
    public Act f109416c;

    public hgk(Act act, String str) {
        this.f109415b = str;
        this.f109416c = act;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m134948e(Envelope envelope) {
        if (((FeedData) envelope.data.getModuleData(FeedData.class)).groups.size() == 0) {
            m96353b().mo63168a(new Exception("empty data"));
            return;
        }
        Group group = ((FeedData) envelope.data.getModuleData(FeedData.class)).groups.get(0);
        List<TopicMoment> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).momentTopics;
        HashMap map = new HashMap();
        for (TopicMoment topicMoment : list) {
            map.put(topicMoment.f40095id, topicMoment);
        }
        Iterator<TopicMomentIdBox> it = group.hotTopics.iterator();
        while (it.hasNext()) {
            TopicMoment topicMoment2 = (TopicMoment) map.get(it.next().f39672id);
            if (topicMoment2 != null) {
                group.hotTopicsModels.add(topicMoment2);
            }
        }
        Iterator<TopicMomentIdBox> it2 = group.topics.iterator();
        while (it2.hasNext()) {
            TopicMoment topicMoment3 = (TopicMoment) map.get(it2.next().f39672id);
            if (topicMoment3 != null) {
                group.relatedTopics.add(topicMoment3);
            }
        }
        m96353b().mo63169z0(group, envelope.pagination.links);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m134949f(Throwable th) {
        th.printStackTrace();
        m96353b().mo63168a(th);
    }

    @Override // p153l.dsl
    public void previous() {
        this.f109416c.duringCreated(FeedModule.f39703d.m145483B7(this.f109415b)).subscribe(psd0.m173597H(new y20() { // from class: l.fgk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98950a.m134948e((Envelope) obj);
            }
        }, new y20() { // from class: l.ggk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104024a.m134949f((Throwable) obj);
            }
        }));
    }

    @Override // p153l.dsl
    public void next() {
    }
}
