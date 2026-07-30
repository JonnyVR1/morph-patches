package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class nog extends y9h {
    public nog(Act act) {
        super(act);
        m164133A();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ pf60 m164129w(Envelope envelope) {
        FeedModule.f39703d.m145791sd(envelope);
        mrb0.m159640R(envelope.counters);
        return new pf60(envelope.pagination.links, ((FeedData) envelope.getModuleData(FeedData.class)).activities);
    }

    /* JADX INFO: renamed from: y */
    public static String m164131y(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return xi5.m211107i("/activities?limit=20&filter=follow&with=" + xi5.WITH_MOMENTS + Constants.SEPARATOR_COMMA + xi5.WITH_USERS + Constants.SEPARATOR_COMMA + xi5.WITH_MESSAGES + str2);
    }

    /* JADX INFO: renamed from: z */
    public static String m164132z(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return xi5.m211107i("/activities?limit=20&filter=comment&with=" + xi5.WITH_MOMENTS + Constants.SEPARATOR_COMMA + xi5.WITH_USERS + Constants.SEPARATOR_COMMA + xi5.WITH_MESSAGES + str2);
    }

    /* JADX INFO: renamed from: A */
    public void m164133A() {
        this.f198095e.duringCreated(FeedModule.f39703d.f121322Q0).subscribe(psd0.m173596G(new y20() { // from class: l.jog
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121999a.m164134B((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m164134B(pf60 pf60Var) {
        m96353b().mo63169z0(this.f198092b, this.f198093c);
    }

    /* JADX INFO: renamed from: C */
    public C22421c<pf60<Links, List<MomentActivity>>> m164135C(final String str, String str2) {
        return FeedModule.f39703d.scheduled(str2, 0, new pcj() { // from class: l.kog
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20((pcj<x1d0>) new pcj() { // from class: l.log
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return uqb0.f180376H.auth().m209043q(str).m209032f().m209028b();
                    }
                }, xi5.MESSAGE_IN_MOMENTS).compose(xi5.m211121w()).map(new qcj() { // from class: l.mog
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return nog.m164129w((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public C22421c<pf60<Links, List<MomentActivity>>> m164136D() {
        return m164135C(m164131y("limit=20" + m214836m()), "photo/album/attention/poll");
    }

    @Override // p153l.y9h
    /* JADX INFO: renamed from: k */
    public C22421c<pf60<Links, List<MomentActivity>>> mo118474k() {
        return m164136D();
    }

    @Override // p153l.y9h
    /* JADX INFO: renamed from: r */
    public boolean mo164137r() {
        return false;
    }
}
