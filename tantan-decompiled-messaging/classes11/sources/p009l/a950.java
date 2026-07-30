package p009l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.transform.C0118a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.jo0;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.sth0;
import l.w9j;
import rx.Notification;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class a950 extends jq2<C0118a> {

    /* JADX INFO: renamed from: a */
    public User f9336a;

    public a950(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m11278j0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m11280m0(Bundle bundle) {
        ((C0118a) ((jq2) this).viewModel).m2192r();
        m11283l0();
    }

    /* JADX INFO: renamed from: Z */
    public void m11281Z() {
        super.Z();
        CoreModule.N().personalMediaMomentsFeedPrevious(CoreModule.H().userId(), false, CoreMomentInfo.JSON_ADAPTER);
        creates(new e30() { // from class: l.t850
            public final void call(Object obj) {
                this.f20579a.m11280m0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m11282a0() {
        super.a0();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m11283l0() {
        duringCreated(c.just(roj0.a).delay(500L, TimeUnit.MILLISECONDS).materialize().observeOn(jo0.a()).first().map(new w9j() { // from class: l.u850
            public final Object call(Object obj) {
                return this.f21017a.m11284n0((Notification) obj);
            }
        }).switchMap(new w9j() { // from class: l.v850
            public final Object call(Object obj) {
                return vi4.m23379b(CacheCardType.TRANS_EXPANDED_CARD).mo12117d(((Integer) obj).intValue());
            }
        }).switchMap(new w9j() { // from class: l.w850
            public final Object call(Object obj) {
                return CoreModule.N().di(CoreMomentInfo.JSON_ADAPTER);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.x850
            public final void call(Object obj) {
                this.f22471a.m11285o0((List) obj);
            }
        }, new e30() { // from class: l.y850
            public final void call(Object obj) {
                a950.m11278j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ Integer m11284n0(Notification notification) {
        return Integer.valueOf(vi4.m23379b(CacheCardType.TRANS_EXPANDED_CARD).mo12745e(act(), this));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m11286p0(roj0 roj0Var) {
        User userClone = pj90.m20476q(pj90.f18737i).clone();
        this.f9336a = userClone;
        ((C0118a) ((jq2) this).viewModel).m2190K(userClone);
        m11287q0();
    }

    /* JADX INFO: renamed from: q0 */
    public void m11287q0() {
        if (NullChecker.a(this.f9336a)) {
            User userSubtract = this.f9336a.subtract(CoreModule.c.e0.na());
            if (NullChecker.a(userSubtract)) {
                CoreModule.c.e0.u9(userSubtract);
            }
        }
    }

    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public final void m11285o0(List<CoreMomentInfo> list) {
        ((C0118a) ((jq2) this).viewModel).m2189J(CoreModule.c.e0.p9(), list);
        duringCreated(sth0.b().d()).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.z850
            public final void call(Object obj) {
                this.f23515a.m11286p0((roj0) obj);
            }
        }, new C0748a()));
    }

    /* JADX INFO: renamed from: s0 */
    public void m11289s0() {
        CoreModule.c.r2.x3();
    }

    /* JADX INFO: renamed from: l.a950$a */
    public class C0748a implements e30<Throwable> {
        public C0748a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    public void destroy() {
    }
}
