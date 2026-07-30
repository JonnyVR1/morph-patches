package p009l;

import android.os.Bundle;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bvw extends jq2<cvw> {

    /* JADX INFO: renamed from: l.bvw$a */
    public class C0794a implements e30<q860<Conversation>> {
        public C0794a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(q860<Conversation> q860Var) {
            if (q860Var != null) {
                ((cvw) ((jq2) bvw.this).viewModel).m12860e(q860Var.f19068a);
            }
        }
    }

    public bvw(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m12303g0(Bundle bundle) {
        ((cvw) ((jq2) this).viewModel).m12859d(bundle);
    }

    /* JADX INFO: renamed from: a0 */
    public void m12304a0() {
        super.a0();
        creates(new e30() { // from class: l.avw
            public final void call(Object obj) {
                this.f9714a.m12303g0((Bundle) obj);
            }
        });
        act().duringCreated(CoreModule.c.f0.cf()).subscribe(mkd0.H(new C0794a(), new C0795b()));
    }

    /* JADX INFO: renamed from: l.bvw$b */
    public class C0795b implements e30<Throwable> {
        public C0795b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }

    public void destroy() {
    }
}
