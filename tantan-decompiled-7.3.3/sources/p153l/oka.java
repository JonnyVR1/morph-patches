package p153l;

import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class oka extends dog {
    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ pf60 m167997u0(Envelope envelope) {
        FeedModule.f39703d.m145791sd(envelope);
        mrb0.m159641S(envelope);
        return new pf60(envelope.pagination.links, ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
    }

    /* JADX INFO: renamed from: x0 */
    public C22421c<pf60<Links, List<TopicMoment>>> m168000x0(final String str) {
        return scheduled("updateTopics", 0, new pcj() { // from class: l.kka
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.lka
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dog.f89929G.auth().m209043q(dog.m117246k("/topics/" + str)).m209032f().m209028b();
                    }
                }).compose(dog.m117253n0()).map(new qcj() { // from class: l.mka
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return oka.m167997u0((Envelope) obj);
                    }
                }).doOnError(new y20() { // from class: l.nka
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        i4h.m138538g((Throwable) obj);
                    }
                });
            }
        });
    }
}
