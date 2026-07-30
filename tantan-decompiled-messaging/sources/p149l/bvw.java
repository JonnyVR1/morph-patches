package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;

/* JADX INFO: loaded from: classes11.dex */
public class bvw extends jq2<cvw> {

    /* JADX INFO: renamed from: l.bvw$a */
    public class C15988a implements e30<q860<Conversation>> {
        public C15988a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(q860<Conversation> q860Var) {
            if (q860Var != null) {
                ((cvw) bvw.this.viewModel).m108962e(q860Var.f153135a);
            }
        }
    }

    public bvw(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m104083g0(Bundle bundle) {
        ((cvw) this.viewModel).m108961d(bundle);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.avw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71981a.m104083g0((Bundle) obj);
            }
        });
        act().duringCreated(CoreModule.f17545c.f19642f0.m32916cf()).subscribe(mkd0.m154956H(new C15988a(), new C15989b()));
    }

    /* JADX INFO: renamed from: l.bvw$b */
    public class C15989b implements e30<Throwable> {
        public C15989b() {
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
