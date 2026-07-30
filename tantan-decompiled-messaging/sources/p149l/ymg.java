package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class ymg extends j8h {
    public ymg(Act act) {
        super(act);
        m215358A();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ j760 m215354w(Envelope envelope) {
        FeedModule.f38855d.m209550sd(envelope);
        ijb0.m136554R(envelope.counters);
        return new j760(envelope.pagination.links, ((FeedData) envelope.getModuleData(FeedData.class)).activities);
    }

    /* JADX INFO: renamed from: y */
    public static String m215356y(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return xh5.m208761i("/activities?limit=20&filter=follow&with=" + xh5.WITH_MOMENTS + Constants.SEPARATOR_COMMA + xh5.WITH_USERS + Constants.SEPARATOR_COMMA + xh5.WITH_MESSAGES + str2);
    }

    /* JADX INFO: renamed from: z */
    public static String m215357z(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = "&" + str;
        }
        return xh5.m208761i("/activities?limit=20&filter=comment&with=" + xh5.WITH_MOMENTS + Constants.SEPARATOR_COMMA + xh5.WITH_USERS + Constants.SEPARATOR_COMMA + xh5.WITH_MESSAGES + str2);
    }

    /* JADX INFO: renamed from: A */
    public void m215358A() {
        this.f116719e.duringCreated(FeedModule.f38855d.f193012Q0).subscribe(mkd0.m154955G(new e30() { // from class: l.umg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177225a.m215359B((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m215359B(j760 j760Var) {
        m119702b().mo61986z0(this.f116716b, this.f116717c);
    }

    /* JADX INFO: renamed from: C */
    public C22306c<j760<Links, List<MomentActivity>>> m215360C(final String str, String str2) {
        return FeedModule.f38855d.scheduled(str2, 0, new v9j() { // from class: l.vmg
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20((v9j<stc0>) new v9j() { // from class: l.wmg
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return qib0.f154693H.auth().m185898q(str).m185887f().m185883b();
                    }
                }, xh5.MESSAGE_IN_MOMENTS).compose(xh5.m208775w()).map(new w9j() { // from class: l.xmg
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ymg.m215354w((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public C22306c<j760<Links, List<MomentActivity>>> m215361D() {
        return m215360C(m215356y("limit=20" + m140217m()), "photo/album/attention/poll");
    }

    @Override // p149l.j8h
    /* JADX INFO: renamed from: k */
    public C22306c<j760<Links, List<MomentActivity>>> mo140215k() {
        return m215361D();
    }

    @Override // p149l.j8h
    /* JADX INFO: renamed from: r */
    public boolean mo140222r() {
        return false;
    }
}
