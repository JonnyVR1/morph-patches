package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.UserLiveHierarchy;
import com.p051p1.mobile.putong.core.data.UserLiveHierarchyEnvelope;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class ml9 extends dy6 {

    /* JADX INFO: renamed from: l.ml9$a */
    public class C18648a implements qcj<UserLiveHierarchyEnvelope, UserLiveHierarchy> {
        public C18648a() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserLiveHierarchy call(UserLiveHierarchyEnvelope userLiveHierarchyEnvelope) {
            return userLiveHierarchyEnvelope.data;
        }
    }

    public ml9(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: c3 */
    public C22421c<UserLiveHierarchy> m158863c3() {
        return this.f91137Q.scheduled("fetchLiveHierarchy", 0, new pcj() { // from class: l.kl9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f127355a.m158864d3();
            }
        });
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ C22421c m158864d3() {
        return qi20.m176656c(new pcj() { // from class: l.ll9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32381z2(CoreModule.m30929H().userId())).m209032f().m209028b();
            }
        }, UserLiveHierarchyEnvelope.JSON_ADAPTER).doOnError(new C18649b()).map(new C18648a());
    }

    /* JADX INFO: renamed from: l.ml9$b */
    public class C18649b implements y20<Throwable> {
        public C18649b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }
}
