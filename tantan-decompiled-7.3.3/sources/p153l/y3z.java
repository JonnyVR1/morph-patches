package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;

/* JADX INFO: loaded from: classes4.dex */
public class y3z extends ar2<z3z> {

    /* JADX INFO: renamed from: a */
    public String f197397a;

    /* JADX INFO: renamed from: l.y3z$a */
    public class C21508a implements y20<uxj0> {
        public C21508a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(uxj0 uxj0Var) {
            ((z3z) y3z.this.viewModel).m218523k(CoreModule.f18264c.f20384f0.m34219zp(y3z.this.f197397a));
        }
    }

    public y3z(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m214176e0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m214180j0(Throwable th) {
        ((z3z) this.viewModel).m218523k(CoreModule.f18264c.f20384f0.m34219zp(this.f197397a));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        String stringExtra = act().getIntent().getStringExtra("USER_ID");
        this.f197397a = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        duringCreated(CoreModule.f18264c.f20384f0.m33823Ue(this.f197397a).distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.v3z
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182315a.m214181i0((Conversation) obj);
            }
        }, new y20() { // from class: l.w3z
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187193a.m214180j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m214181i0(Conversation conversation) {
        ((z3z) this.viewModel).m218523k(conversation);
    }

    /* JADX INFO: renamed from: k0 */
    public void m214182k0(String str, boolean z, boolean z2) {
        act().duringCreated(CoreModule.f18264c.f20384f0.m33640Eo(str, z, z2).take(1)).subscribe(psd0.m173597H(new C21508a(), new y20() { // from class: l.x3z
            @Override // p153l.y20
            public final void call(Object obj) {
                y3z.m214176e0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
