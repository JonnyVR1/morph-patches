package p007l;

import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p1.mobile.android.app.Act;
import java.util.List;
import l.j760;
import l.la20;
import l.qib0;
import l.v9j;
import l.w9j;
import l.xh5;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class z9h extends j8h {
    public z9h(Act act) {
        super(act);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ j760 m17276u(Envelope envelope) {
        FeedModule.f316d.m16731sd(envelope);
        ijb0.m10907R(envelope.counters);
        return new j760(envelope.pagination.links, ((FeedData) envelope.getModuleData(FeedData.class)).activities);
    }

    @Override // p007l.j8h
    /* JADX INFO: renamed from: k */
    public c<j760<Links, List<MomentActivity>>> mo11082k() {
        return m17280y();
    }

    /* JADX INFO: renamed from: x */
    public c<j760<Links, List<MomentActivity>>> m17279x(final String str, String str2) {
        return FeedModule.f316d.scheduled(str2, 0, new v9j() { // from class: l.w9h
            public final Object call() {
                return new la20(new v9j() { // from class: l.x9h
                    public final Object call() {
                        return qib0.H.auth().q(str).f().b();
                    }
                }, xh5.MESSAGE_IN_MOMENTS).compose(xh5.w()).map(new w9j() { // from class: l.y9h
                    public final Object call(Object obj) {
                        return z9h.m17276u((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public c<j760<Links, List<MomentActivity>>> m17280y() {
        return m17279x(xh5.d("limit=20" + m11084m()), "photo/album/likes/poll");
    }
}
