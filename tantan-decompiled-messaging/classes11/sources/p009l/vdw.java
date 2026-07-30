package p009l;

import android.os.Bundle;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.FateRadarSearchConditions;
import l.d30;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vdw extends jq2<wdw> {

    /* JADX INFO: renamed from: l.vdw$a */
    public class C1230a implements e30<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f21549a;

        public C1230a(d30 d30Var) {
            this.f21549a = d30Var;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            xdl0.M(((wdw) ((jq2) vdw.this).viewModel).f22038d, false);
            CoreModule.c.s2.S.onNext(Boolean.FALSE);
            d30 d30Var = this.f21549a;
            if (d30Var != null) {
                d30Var.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.vdw$b */
    public class C1231b implements e30<Throwable> {
        public C1231b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            xdl0.M(((wdw) ((jq2) vdw.this).viewModel).f22038d, false);
            osi0.g("保存失败");
        }
    }

    public vdw(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m23368h0(Bundle bundle) {
        ((wdw) ((jq2) this).viewModel).m24114f(bundle);
    }

    /* JADX INFO: renamed from: a0 */
    public void m23369a0() {
        super.a0();
        creates(new e30() { // from class: l.udw
            public final void call(Object obj) {
                this.f21092a.m23368h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m23370i0(FateRadarSearchConditions fateRadarSearchConditions, d30 d30Var) {
        xdl0.M(((wdw) ((jq2) this).viewModel).f22038d, true);
        duringCreated(CoreModule.c.s2.K3(fateRadarSearchConditions)).subscribe(mkd0.H(new C1230a(d30Var), new C1231b()));
    }

    public void destroy() {
    }
}
