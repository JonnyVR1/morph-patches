package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.FateRadarSearchConditions;

/* JADX INFO: loaded from: classes11.dex */
public class vdw extends jq2<wdw> {

    /* JADX INFO: renamed from: l.vdw$a */
    public class C20619a implements e30<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f181131a;

        public C20619a(d30 d30Var) {
            this.f181131a = d30Var;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            xdl0.m208344M(((wdw) vdw.this.viewModel).f185868d, false);
            CoreModule.f17545c.f19683s2.f170716S.onNext(Boolean.FALSE);
            d30 d30Var = this.f181131a;
            if (d30Var != null) {
                d30Var.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.vdw$b */
    public class C20620b implements e30<Throwable> {
        public C20620b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            xdl0.m208344M(((wdw) vdw.this.viewModel).f185868d, false);
            osi0.m165783g("保存失败");
        }
    }

    public vdw(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m198100h0(Bundle bundle) {
        ((wdw) this.viewModel).m202800f(bundle);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.udw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175973a.m198100h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m198101i0(FateRadarSearchConditions fateRadarSearchConditions, d30 d30Var) {
        xdl0.m208344M(((wdw) this.viewModel).f185868d, true);
        duringCreated(CoreModule.f17545c.f19683s2.m189328K3(fateRadarSearchConditions)).subscribe(mkd0.m154956H(new C20619a(d30Var), new C20620b()));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
