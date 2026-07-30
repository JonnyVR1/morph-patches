package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class z9h extends j8h {
    public z9h(Act act) {
        super(act);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ j760 m217668u(Envelope envelope) {
        FeedModule.f38855d.m209550sd(envelope);
        ijb0.m136554R(envelope.counters);
        return new j760(envelope.pagination.links, ((FeedData) envelope.getModuleData(FeedData.class)).activities);
    }

    @Override // p149l.j8h
    /* JADX INFO: renamed from: k */
    public C22306c<j760<Links, List<MomentActivity>>> mo140215k() {
        return m217672y();
    }

    /* JADX INFO: renamed from: x */
    public C22306c<j760<Links, List<MomentActivity>>> m217671x(final String str, String str2) {
        return FeedModule.f38855d.scheduled(str2, 0, new v9j() { // from class: l.w9h
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20((v9j<stc0>) new v9j() { // from class: l.x9h
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return qib0.f154693H.auth().m185898q(str).m185887f().m185883b();
                    }
                }, xh5.MESSAGE_IN_MOMENTS).compose(xh5.m208775w()).map(new w9j() { // from class: l.y9h
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return z9h.m217668u((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public C22306c<j760<Links, List<MomentActivity>>> m217672y() {
        return m217671x(xh5.m208756d("limit=20" + m140217m()), "photo/album/likes/poll");
    }
}
