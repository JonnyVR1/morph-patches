package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;

/* JADX INFO: loaded from: classes11.dex */
public class ayw extends ar2<byw> {

    /* JADX INFO: renamed from: l.ayw$a */
    public class C15860a implements y20<vg60<Conversation>> {
        public C15860a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(vg60<Conversation> vg60Var) {
            if (vg60Var != null) {
                ((byw) ayw.this.viewModel).m107095e(vg60Var.f184001a);
            }
        }
    }

    public ayw(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m100930g0(Bundle bundle) {
        ((byw) this.viewModel).m107094d(bundle);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.zxw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206523a.m100930g0((Bundle) obj);
            }
        });
        act().duringCreated(CoreModule.f18264c.f20384f0.m33919cf()).subscribe(psd0.m173597H(new C15860a(), new C15861b()));
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ayw$b */
    public class C15861b implements y20<Throwable> {
        public C15861b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }
}
