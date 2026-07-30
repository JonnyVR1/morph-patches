package p007l;

import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import java.util.List;
import l.e30;
import l.j760;
import l.la20;
import l.v9j;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class cja extends omg {
    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ j760 m9187u0(Envelope envelope) {
        FeedModule.f316d.m16731sd(envelope);
        ijb0.m10908S(envelope);
        return new j760(envelope.pagination.links, ((FeedData) envelope.getModuleData(FeedData.class)).momentTopics);
    }

    /* JADX INFO: renamed from: x0 */
    public c<j760<Links, List<TopicMoment>>> m9190x0(final String str) {
        return scheduled("updateTopics", 0, new v9j() { // from class: l.yia
            public final Object call() {
                return new la20(new v9j() { // from class: l.zia
                    public final Object call() {
                        return omg.f11509G.auth().q(omg.m12703k("/topics/" + str)).f().b();
                    }
                }).compose(omg.m12710n0()).map(new w9j() { // from class: l.aja
                    public final Object call(Object obj) {
                        return cja.m9187u0((Envelope) obj);
                    }
                }).doOnError(new e30() { // from class: l.bja
                    public final void call(Object obj) {
                        t2h.m14427g((Throwable) obj);
                    }
                });
            }
        });
    }
}
