package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.transform.C7954a;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.Notification;

/* JADX INFO: loaded from: classes11.dex */
public class a950 extends jq2<C7954a> {

    /* JADX INFO: renamed from: a */
    public User f68113a;

    public a950(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m95395j0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m95397m0(Bundle bundle) {
        ((C7954a) this.viewModel).m38214r();
        m95398l0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        CoreModule.m29934N().personalMediaMomentsFeedPrevious(CoreModule.m29931H().userId(), false, CoreMomentInfo.JSON_ADAPTER);
        creates(new e30() { // from class: l.t850
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f168802a.m95397m0((Bundle) obj);
            }
        });
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m95398l0() {
        duringCreated(C22306c.just(roj0.f160388a).delay(500L, TimeUnit.MILLISECONDS).materialize().observeOn(jo0.m142408a()).first().map(new w9j() { // from class: l.u850
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f175099a.m95399n0((Notification) obj);
            }
        }).switchMap(new w9j() { // from class: l.v850
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vi4.m198496b(CacheCardType.TRANS_EXPANDED_CARD).mo102631d(((Integer) obj).intValue());
            }
        }).switchMap(new w9j() { // from class: l.w850
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.m29934N().mo60346di(CoreMomentInfo.JSON_ADAPTER);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.x850
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191440a.m95400o0((List) obj);
            }
        }, new e30() { // from class: l.y850
            @Override // p149l.e30
            public final void call(Object obj) {
                a950.m95395j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ Integer m95399n0(Notification notification) {
        return Integer.valueOf(vi4.m198496b(CacheCardType.TRANS_EXPANDED_CARD).mo108019e(act(), this));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m95401p0(roj0 roj0Var) {
        User userMo223809clone = pj90.m169804q(pj90.f149721i).mo223809clone();
        this.f68113a = userMo223809clone;
        ((C7954a) this.viewModel).m38213K(userMo223809clone);
        m95402q0();
    }

    /* JADX INFO: renamed from: q0 */
    public void m95402q0() {
        if (NullChecker.m81303a(this.f68113a)) {
            User userSubtract = this.f68113a.subtract(CoreModule.f17545c.f19639e0.m169520na());
            if (NullChecker.m81303a(userSubtract)) {
                CoreModule.f17545c.f19639e0.m169547u9(userSubtract);
            }
        }
    }

    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public final void m95400o0(List<CoreMomentInfo> list) {
        ((C7954a) this.viewModel).m38212J(CoreModule.f17545c.f19639e0.m169527p9(), list);
        duringCreated(sth0.m185950b().m185953d()).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.z850
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202104a.m95401p0((roj0) obj);
            }
        }, new C15546a()));
    }

    /* JADX INFO: renamed from: s0 */
    public void m95404s0() {
        CoreModule.f17545c.f19680r2.m136534x3();
    }

    /* JADX INFO: renamed from: l.a950$a */
    public class C15546a implements e30<Throwable> {
        public C15546a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
