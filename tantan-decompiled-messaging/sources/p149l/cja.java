package p149l;

import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class cja extends omg {
    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ j760 m107132u0(Envelope envelope) {
        FeedModule.f38855d.m209550sd(envelope);
        ijb0.m136555S(envelope);
        return new j760(envelope.pagination.links, ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
    }

    /* JADX INFO: renamed from: x0 */
    public C22306c<j760<Links, List<TopicMoment>>> m107135x0(final String str) {
        return scheduled("updateTopics", 0, new v9j() { // from class: l.yia
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.zia
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return omg.f144622G.auth().m185898q(omg.m165085k("/topics/" + str)).m185887f().m185883b();
                    }
                }).compose(omg.m165092n0()).map(new w9j() { // from class: l.aja
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return cja.m107132u0((Envelope) obj);
                    }
                }).doOnError(new e30() { // from class: l.bja
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        t2h.m186976g((Throwable) obj);
                    }
                });
            }
        });
    }
}
