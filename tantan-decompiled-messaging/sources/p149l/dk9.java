package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.UserLiveHierarchy;
import com.p046p1.mobile.putong.core.data.UserLiveHierarchyEnvelope;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class dk9 extends ax6 {

    /* JADX INFO: renamed from: l.dk9$a */
    public class C16399a implements w9j<UserLiveHierarchyEnvelope, UserLiveHierarchy> {
        public C16399a() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserLiveHierarchy call(UserLiveHierarchyEnvelope userLiveHierarchyEnvelope) {
            return userLiveHierarchyEnvelope.data;
        }
    }

    public dk9(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: c3 */
    public C22306c<UserLiveHierarchy> m112188c3() {
        return this.f72126Q.scheduled("fetchLiveHierarchy", 0, new v9j() { // from class: l.bk9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f75974a.m112189d3();
            }
        });
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ C22306c m112189d3() {
        return ia20.m135119c(new v9j() { // from class: l.ck9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31378z2(CoreModule.m29931H().userId())).m185887f().m185883b();
            }
        }, UserLiveHierarchyEnvelope.JSON_ADAPTER).doOnError(new C16400b()).map(new C16399a());
    }

    /* JADX INFO: renamed from: l.dk9$b */
    public class C16400b implements e30<Throwable> {
        public C16400b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }
}
