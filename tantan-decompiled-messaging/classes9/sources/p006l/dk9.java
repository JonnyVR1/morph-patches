package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.UserLiveHierarchy;
import com.p1.mobile.putong.core.data.UserLiveHierarchyEnvelope;
import l.e30;
import l.v9j;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class dk9 extends ax6 {

    /* JADX INFO: renamed from: l.dk9$a */
    public class C0646a implements w9j<UserLiveHierarchyEnvelope, UserLiveHierarchy> {
        public C0646a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserLiveHierarchy call(UserLiveHierarchyEnvelope userLiveHierarchyEnvelope) {
            return userLiveHierarchyEnvelope.data;
        }
    }

    public dk9(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: c3 */
    public c<UserLiveHierarchy> m14053c3() {
        return this.f8580Q.scheduled("fetchLiveHierarchy", 0, new v9j() { // from class: l.bk9
            public final Object call() {
                return this.f8936a.m14054d3();
            }
        });
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ c m14054d3() {
        return ia20.m16569c(new v9j() { // from class: l.ck9
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3308z2(CoreModule.m1850H().userId())).f().b();
            }
        }, UserLiveHierarchyEnvelope.JSON_ADAPTER).doOnError(new C0647b()).map(new C0646a());
    }

    /* JADX INFO: renamed from: l.dk9$b */
    public class C0647b implements e30<Throwable> {
        public C0647b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }
}
