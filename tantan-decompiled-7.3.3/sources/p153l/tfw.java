package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.FateRadarSearchConditions;

/* JADX INFO: loaded from: classes11.dex */
public class tfw extends ar2<ufw> {

    /* JADX INFO: renamed from: l.tfw$a */
    public class C20304a implements y20<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f174011a;

        public C20304a(x20 x20Var) {
            this.f174011a = x20Var;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            bnl0.m105524M(((ufw) tfw.this.viewModel).f178818d, false);
            CoreModule.f18264c.f20425s2.f110502S.onNext(Boolean.FALSE);
            x20 x20Var = this.f174011a;
            if (x20Var != null) {
                x20Var.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.tfw$b */
    public class C20305b implements y20<Throwable> {
        public C20305b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            bnl0.m105524M(((ufw) tfw.this.viewModel).f178818d, false);
            r1j0.m179420g("保存失败");
        }
    }

    public tfw(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m190991h0(Bundle bundle) {
        ((ufw) this.viewModel).m195868f(bundle);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.sfw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167775a.m190991h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m190992i0(FateRadarSearchConditions fateRadarSearchConditions, x20 x20Var) {
        bnl0.m105524M(((ufw) this.viewModel).f178818d, true);
        duringCreated(CoreModule.f18264c.f20425s2.m135735K3(fateRadarSearchConditions)).subscribe(psd0.m173597H(new C20304a(x20Var), new C20305b()));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
