package p003l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class bvy extends jq2<cvy> {

    /* JADX INFO: renamed from: a */
    public String f2517a;

    /* JADX INFO: renamed from: l.bvy$a */
    public class C0187a implements e30<roj0> {
        public C0187a() {
        }

        @Override // p003l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(roj0 roj0Var) {
            ((cvy) ((jq2) bvy.this).viewModel).m3480k(CoreModule.c.f0.zp(bvy.this.f2517a));
        }
    }

    public bvy(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m3182e0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m3186j0(Throwable th) {
        ((cvy) ((jq2) this).viewModel).m3480k(CoreModule.c.f0.zp(this.f2517a));
    }

    /* JADX INFO: renamed from: a0 */
    public void m3187a0() {
        String stringExtra = act().getIntent().getStringExtra("USER_ID");
        this.f2517a = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        duringCreated(CoreModule.c.f0.Ue(this.f2517a).distinctUntilChanged()).subscribe((m250) mkd0.H(new e30() { // from class: l.yuy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9153a.m3188i0((Conversation) obj);
            }
        }, new e30() { // from class: l.zuy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9448a.m3186j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m3188i0(Conversation conversation) {
        ((cvy) ((jq2) this).viewModel).m3480k(conversation);
    }

    /* JADX INFO: renamed from: k0 */
    public void m3189k0(String str, boolean z, boolean z2) {
        act().duringCreated(CoreModule.c.f0.Eo(str, z, z2).take(1)).subscribe((m250) mkd0.H(new C0187a(), new e30() { // from class: l.avy
            @Override // p003l.e30
            public final void call(Object obj) {
                bvy.m3182e0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
