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
public class dxg extends y9h {
    public dxg(Act act) {
        super(act);
        m118473B(act);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ pf60 m118469v(Envelope envelope) {
        FeedModule.f39703d.m145791sd(envelope);
        mrb0.m159640R(envelope.counters);
        return new pf60(envelope.pagination.links, ((FeedData) envelope.getModuleData(FeedData.class)).activities);
    }

    /* JADX INFO: renamed from: A */
    public C22421c<pf60<Links, List<MomentActivity>>> m118472A() {
        return m118476z(nog.m164132z("limit=20" + m214836m()), "photo/album/comments/poll");
    }

    /* JADX INFO: renamed from: B */
    public void m118473B(Act act) {
        act.duringCreated(FeedModule.f39703d.f121324R0).subscribe(psd0.m173596G(new y20() { // from class: l.zwg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206346a.m118475y((String) obj);
            }
        }));
    }

    @Override // p153l.y9h
    /* JADX INFO: renamed from: k */
    public C22421c<pf60<Links, List<MomentActivity>>> mo118474k() {
        return m118472A();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m118475y(String str) {
        m96353b().mo63169z0(this.f198092b, this.f198093c);
    }

    /* JADX INFO: renamed from: z */
    public C22421c<pf60<Links, List<MomentActivity>>> m118476z(final String str, String str2) {
        return FeedModule.f39703d.scheduled(str2, 0, new pcj() { // from class: l.axg
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20((pcj<x1d0>) new pcj() { // from class: l.bxg
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return uqb0.f180376H.auth().m209043q(str).m209032f().m209028b();
                    }
                }, xi5.MESSAGE_IN_MOMENTS).compose(xi5.m211121w()).map(new qcj() { // from class: l.cxg
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return dxg.m118469v((Envelope) obj);
                    }
                });
            }
        });
    }
}
