package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p1.mobile.android.app.Act;
import java.util.List;
import l.e30;
import l.j760;
import l.la20;
import l.mkd0;
import l.qib0;
import l.v9j;
import l.w9j;
import l.xh5;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ymg extends j8h {
    public ymg(Act act) {
        super(act);
        m17186A();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ j760 m17182w(Envelope envelope) {
        FeedModule.f316d.m16731sd(envelope);
        ijb0.m10907R(envelope.counters);
        return new j760(envelope.pagination.links, ((FeedData) envelope.getModuleData(FeedData.class)).activities);
    }

    /* JADX INFO: renamed from: y */
    public static String m17184y(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return xh5.i("/activities?limit=20&filter=follow&with=" + xh5.WITH_MOMENTS + "," + xh5.WITH_USERS + "," + xh5.WITH_MESSAGES + str2);
    }

    /* JADX INFO: renamed from: z */
    public static String m17185z(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return xh5.i("/activities?limit=20&filter=comment&with=" + xh5.WITH_MOMENTS + "," + xh5.WITH_USERS + "," + xh5.WITH_MESSAGES + str2);
    }

    /* JADX INFO: renamed from: A */
    public void m17186A() {
        this.f9258e.duringCreated(FeedModule.f316d.f14947Q0).subscribe(mkd0.G(new e30() { // from class: l.umg
            public final void call(Object obj) {
                this.f13862a.m17187B((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m17187B(j760 j760Var) {
        m10070b().mo2960z0(this.f9255b, this.f9256c);
    }

    /* JADX INFO: renamed from: C */
    public c<j760<Links, List<MomentActivity>>> m17188C(final String str, String str2) {
        return FeedModule.f316d.scheduled(str2, 0, new v9j() { // from class: l.vmg
            public final Object call() {
                return new la20(new v9j() { // from class: l.wmg
                    public final Object call() {
                        return qib0.H.auth().q(str).f().b();
                    }
                }, xh5.MESSAGE_IN_MOMENTS).compose(xh5.w()).map(new w9j() { // from class: l.xmg
                    public final Object call(Object obj) {
                        return ymg.m17182w((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public c<j760<Links, List<MomentActivity>>> m17189D() {
        return m17188C(m17184y("limit=20" + m11084m()), "photo/album/attention/poll");
    }

    @Override // p007l.j8h
    /* JADX INFO: renamed from: k */
    public c<j760<Links, List<MomentActivity>>> mo11082k() {
        return m17189D();
    }

    @Override // p007l.j8h
    /* JADX INFO: renamed from: r */
    public boolean mo11089r() {
        return false;
    }
}
