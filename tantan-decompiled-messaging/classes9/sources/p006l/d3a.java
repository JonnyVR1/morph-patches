package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.GreetingBatchPostBody;
import com.p1.mobile.putong.core.data.GreetingNewPeopleMessage;
import com.p1.mobile.putong.core.data.UserIdType;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import l.hpd0;
import l.roj0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class d3a extends ax6 {

    /* JADX INFO: renamed from: R */
    public List<UserIdType> f9995R;

    /* JADX INFO: renamed from: S */
    public List<User> f9996S;

    /* JADX INFO: renamed from: T */
    public String f9997T;

    /* JADX INFO: renamed from: U */
    public hpd0 f9998U;

    /* JADX INFO: renamed from: V */
    public hpd0 f9999V;

    /* JADX INFO: renamed from: W */
    public zpd0 f10000W;

    public d3a(C0158c c0158c) {
        super(c0158c);
        Boolean bool = Boolean.FALSE;
        this.f9998U = new hpd0("welcome_1_open_debug", bool);
        this.f9999V = new hpd0("welcome_2_open_debug", bool);
        this.f10000W = new zpd0("welcome_show_time_" + CoreModule.m1850H().userId(), 0L);
    }

    /* JADX INFO: renamed from: g3 */
    public c<roj0> m13766g3(final GreetingBatchPostBody greetingBatchPostBody) {
        final String strM3184U0 = C0154a.m3184U0("/greetings/batch/messages");
        return this.f8580Q.scheduled(strM3184U0, -1, new v9j() { // from class: l.y2a
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.b3a
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).l(utc0.create(Network.JSON, greetingBatchPostBody.toJson())).b();
                    }
                }).map(new w9j() { // from class: l.c3a
                    public final Object call(Object obj) {
                        return roj0.a;
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public List<User> m13767h3() {
        if (vwb.J(this.f9996S)) {
            return new ArrayList();
        }
        int size = this.f9996S.size();
        if (size < 3) {
            return new ArrayList();
        }
        if (size >= 9) {
            return this.f9996S.subList(0, 9);
        }
        List<User> list = this.f9996S;
        return size >= 6 ? list.subList(0, 6) : list.subList(0, 3);
    }

    /* JADX INFO: renamed from: i3 */
    public c<List<User>> m13768i3(int i) {
        if (i <= 0) {
            return c.just((Object) null);
        }
        final String strM3296w2 = C0154a.m3296w2(String.format("?search=greeting&limit=%d", Integer.valueOf(i)));
        return this.f8580Q.scheduled(strM3296w2, 0, new v9j() { // from class: l.x2a
            public final Object call() {
                return this.f25677a.m13770k3(strM3296w2);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ List m13769j3(Envelope envelope) {
        List<User> list = envelope.getModuleData(CommonData.class).users;
        this.f9996S = list;
        List list2 = envelope.getModuleData(CoreData.class).greetingNewPeopleMessage;
        if (!vwb.J(list2)) {
            this.f9997T = ((GreetingNewPeopleMessage) list2.get(0)).message;
        }
        return list;
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ c m13770k3(final String str) {
        return ia20.m16571e(new v9j() { // from class: l.z2a
            public final Object call() {
                return C0154a.f3483P.auth().q(str).f().b();
            }
        }).map(new w9j() { // from class: l.a3a
            public final Object call(Object obj) {
                return this.f8082a.m13769j3((Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }
}
