package p153l;

import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.GreetingBatchPostBody;
import com.p051p1.mobile.putong.core.data.GreetingNewPeopleMessage;
import com.p051p1.mobile.putong.core.data.UserIdType;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class p4a extends dy6 {

    /* JADX INFO: renamed from: R */
    public List<UserIdType> f150515R;

    /* JADX INFO: renamed from: S */
    public List<User> f150516S;

    /* JADX INFO: renamed from: T */
    public String f150517T;

    /* JADX INFO: renamed from: U */
    public jxd0 f150518U;

    /* JADX INFO: renamed from: V */
    public jxd0 f150519V;

    /* JADX INFO: renamed from: W */
    public byd0 f150520W;

    public p4a(C4883c c4883c) {
        super(c4883c);
        Boolean bool = Boolean.FALSE;
        this.f150518U = new jxd0("welcome_1_open_debug", bool);
        this.f150519V = new jxd0("welcome_2_open_debug", bool);
        this.f150520W = new byd0("welcome_show_time_" + CoreModule.m30929H().userId(), 0L);
    }

    /* JADX INFO: renamed from: g3 */
    public C22421c<uxj0> m170551g3(final GreetingBatchPostBody greetingBatchPostBody) {
        final String strM32257U0 = C4879a.m32257U0("/greetings/batch/messages");
        return this.f91137Q.scheduled(strM32257U0, -1, new pcj() { // from class: l.k4a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.n4a
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209038l(z1d0.create(Network.JSON, greetingBatchPostBody.toJson())).m209028b();
                    }
                }).map(new qcj() { // from class: l.o4a
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uxj0.f181467a;
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: h3 */
    public List<User> m170552h3() {
        if (jyb.m147479J(this.f150516S)) {
            return new ArrayList();
        }
        int size = this.f150516S.size();
        if (size < 3) {
            return new ArrayList();
        }
        if (size >= 9) {
            return this.f150516S.subList(0, 9);
        }
        List<User> list = this.f150516S;
        return size >= 6 ? list.subList(0, 6) : list.subList(0, 3);
    }

    /* JADX INFO: renamed from: i3 */
    public C22421c<List<User>> m170553i3(int i) {
        if (i <= 0) {
            return C22421c.just(null);
        }
        final String strM32369w2 = C4879a.m32369w2(String.format("?search=greeting&limit=%d", Integer.valueOf(i)));
        return this.f91137Q.scheduled(strM32369w2, 0, new pcj() { // from class: l.j4a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f118278a.m170555k3(strM32369w2);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ List m170554j3(Envelope envelope) {
        List<User> list = ((CommonData) envelope.getModuleData(CommonData.class)).users;
        this.f150516S = list;
        List<GreetingNewPeopleMessage> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).greetingNewPeopleMessage;
        if (!jyb.m147479J(list2)) {
            this.f150517T = list2.get(0).message;
        }
        return list;
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ C22421c m170555k3(final String str) {
        return qi20.m176658e(new pcj() { // from class: l.l4a
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(str).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.m4a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f134775a.m170554j3((Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }
}
