package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class obh extends y9h {
    public obh(Act act) {
        super(act);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ pf60 m167026u(Envelope envelope) {
        FeedModule.f39703d.m145791sd(envelope);
        mrb0.m159640R(envelope.counters);
        return new pf60(envelope.pagination.links, ((FeedData) envelope.getModuleData(FeedData.class)).activities);
    }

    @Override // p153l.y9h
    /* JADX INFO: renamed from: k */
    public C22421c<pf60<Links, List<MomentActivity>>> mo118474k() {
        return m167030y();
    }

    /* JADX INFO: renamed from: x */
    public C22421c<pf60<Links, List<MomentActivity>>> m167029x(final String str, String str2) {
        return FeedModule.f39703d.scheduled(str2, 0, new pcj() { // from class: l.lbh
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20((pcj<x1d0>) new pcj() { // from class: l.mbh
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return uqb0.f180376H.auth().m209043q(str).m209032f().m209028b();
                    }
                }, xi5.MESSAGE_IN_MOMENTS).compose(xi5.m211121w()).map(new qcj() { // from class: l.nbh
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return obh.m167026u((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public C22421c<pf60<Links, List<MomentActivity>>> m167030y() {
        return m167029x(xi5.m211102d("limit=20" + m214836m()), "photo/album/likes/poll");
    }
}
