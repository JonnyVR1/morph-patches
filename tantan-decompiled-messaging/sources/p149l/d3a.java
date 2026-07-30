package p149l;

import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.GreetingBatchPostBody;
import com.p046p1.mobile.putong.core.data.GreetingNewPeopleMessage;
import com.p046p1.mobile.putong.core.data.UserIdType;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class d3a extends ax6 {

    /* JADX INFO: renamed from: R */
    public List<UserIdType> f83479R;

    /* JADX INFO: renamed from: S */
    public List<User> f83480S;

    /* JADX INFO: renamed from: T */
    public String f83481T;

    /* JADX INFO: renamed from: U */
    public hpd0 f83482U;

    /* JADX INFO: renamed from: V */
    public hpd0 f83483V;

    /* JADX INFO: renamed from: W */
    public zpd0 f83484W;

    public d3a(C4732c c4732c) {
        super(c4732c);
        Boolean bool = Boolean.FALSE;
        this.f83482U = new hpd0("welcome_1_open_debug", bool);
        this.f83483V = new hpd0("welcome_2_open_debug", bool);
        this.f83484W = new zpd0("welcome_show_time_" + CoreModule.m29931H().userId(), 0L);
    }

    /* JADX INFO: renamed from: g3 */
    public C22306c<roj0> m109897g3(final GreetingBatchPostBody greetingBatchPostBody) {
        final String strM31254U0 = C4728a.m31254U0("/greetings/batch/messages");
        return this.f72126Q.scheduled(strM31254U0, -1, new v9j() { // from class: l.y2a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.b3a
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185893l(utc0.create(Network.JSON, greetingBatchPostBody.toJson())).m185883b();
                    }
                }).map(new w9j() { // from class: l.c3a
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return roj0.f160388a;
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public List<User> m109898h3() {
        if (vwb.m200296J(this.f83480S)) {
            return new ArrayList();
        }
        int size = this.f83480S.size();
        if (size < 3) {
            return new ArrayList();
        }
        if (size >= 9) {
            return this.f83480S.subList(0, 9);
        }
        List<User> list = this.f83480S;
        return size >= 6 ? list.subList(0, 6) : list.subList(0, 3);
    }

    /* JADX INFO: renamed from: i3 */
    public C22306c<List<User>> m109899i3(int i) {
        if (i <= 0) {
            return C22306c.just(null);
        }
        final String strM31366w2 = C4728a.m31366w2(String.format("?search=greeting&limit=%d", Integer.valueOf(i)));
        return this.f72126Q.scheduled(strM31366w2, 0, new v9j() { // from class: l.x2a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f189140a.m109901k3(strM31366w2);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ List m109900j3(Envelope envelope) {
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        this.f83480S = list;
        List<GreetingNewPeopleMessage> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).greetingNewPeopleMessage;
        if (!vwb.m200296J(list2)) {
            this.f83481T = list2.get(0).message;
        }
        return list;
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ C22306c m109901k3(final String str) {
        return ia20.m135121e(new v9j() { // from class: l.z2a
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(str).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.a3a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f67338a.m109900j3((Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }
}
