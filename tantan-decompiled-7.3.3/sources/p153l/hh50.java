package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.transform.C8105a;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.Notification;

/* JADX INFO: loaded from: classes11.dex */
public class hh50 extends ar2<C8105a> {

    /* JADX INFO: renamed from: a */
    public User f109481a;

    public hh50(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m135019j0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m135021m0(Bundle bundle) {
        ((C8105a) this.viewModel).m39217r();
        m135022l0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        CoreModule.m30932N().personalMediaMomentsFeedPrevious(CoreModule.m30929H().userId(), false, CoreMomentInfo.JSON_ADAPTER);
        creates(new y20() { // from class: l.ah50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71323a.m135021m0((Bundle) obj);
            }
        });
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m135022l0() {
        duringCreated(C22421c.just(uxj0.f181467a).delay(500L, TimeUnit.MILLISECONDS).materialize().observeOn(fo0.m126432a()).first().map(new qcj() { // from class: l.bh50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f76732a.m135023n0((Notification) obj);
            }
        }).switchMap(new qcj() { // from class: l.ch50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uj4.m196317b(CacheCardType.TRANS_EXPANDED_CARD).mo136051d(((Integer) obj).intValue());
            }
        }).switchMap(new qcj() { // from class: l.dh50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.m30932N().mo61530di(CoreMomentInfo.JSON_ADAPTER);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.eh50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94002a.m135024o0((List) obj);
            }
        }, new y20() { // from class: l.fh50
            @Override // p153l.y20
            public final void call(Object obj) {
                hh50.m135019j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ Integer m135023n0(Notification notification) {
        return Integer.valueOf(uj4.m196317b(CacheCardType.TRANS_EXPANDED_CARD).mo164333e(act(), this));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m135025p0(uxj0 uxj0Var) {
        User userMo225055clone = tr90.m192429q(tr90.f175815i).mo225055clone();
        this.f109481a = userMo225055clone;
        ((C8105a) this.viewModel).m39216K(userMo225055clone);
        m135026q0();
    }

    /* JADX INFO: renamed from: q0 */
    public void m135026q0() {
        if (NullChecker.m82486a(this.f109481a)) {
            User userSubtract = this.f109481a.subtract(CoreModule.f18264c.f20381e0.m116593na());
            if (NullChecker.m82486a(userSubtract)) {
                CoreModule.f18264c.f20381e0.m116620u9(userSubtract);
            }
        }
    }

    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public final void m135024o0(List<CoreMomentInfo> list) {
        ((C8105a) this.viewModel).m39215J(CoreModule.f18264c.f20381e0.m116600p9(), list);
        duringCreated(a2i0.m95674b().m95677d()).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.gh50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104070a.m135025p0((uxj0) obj);
            }
        }, new C17459a()));
    }

    /* JADX INFO: renamed from: s0 */
    public void m135028s0() {
        CoreModule.f18264c.f20422r2.m158749x3();
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.hh50$a */
    public class C17459a implements y20<Throwable> {
        public C17459a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }
}
