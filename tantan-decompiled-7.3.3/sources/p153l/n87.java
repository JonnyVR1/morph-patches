package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes9.dex */
public class n87 extends dy6 {

    /* JADX INFO: renamed from: R */
    public final jxd0 f140654R;

    /* JADX INFO: renamed from: S */
    public final jxd0 f140655S;

    public n87(C4883c c4883c) {
        super(c4883c);
        String str = "need_refresh_ai_1v1_conversation_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.TRUE;
        this.f140654R = new jxd0(str, bool);
        this.f140655S = new jxd0("need_del_local_ai_1v1_conversation_" + CoreModule.m30929H().userId(), bool);
    }

    /* JADX INFO: renamed from: c3 */
    public C22421c<Boolean> m161901c3() {
        return C22421c.just(uxj0.f181467a).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.l87
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f130417a.m161902d3((uxj0) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ Boolean m161902d3(uxj0 uxj0Var) {
        if (!NullChecker.m82486a(CoreModule.f18264c.f20384f0.m33738Mo(User.ID_AI_1V1))) {
            return Boolean.FALSE;
        }
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.m87
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33731Mh(User.ID_AI_1V1);
            }
        });
        return Boolean.TRUE;
    }
}
