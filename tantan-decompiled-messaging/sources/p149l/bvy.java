package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;

/* JADX INFO: loaded from: classes3.dex */
public class bvy extends jq2<cvy> {

    /* JADX INFO: renamed from: a */
    public String f77503a;

    /* JADX INFO: renamed from: l.bvy$a */
    public class C15990a implements e30<roj0> {
        public C15990a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(roj0 roj0Var) {
            ((cvy) bvy.this.viewModel).m108977k(CoreModule.f17545c.f19642f0.m33216zp(bvy.this.f77503a));
        }
    }

    public bvy(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m104087e0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m104091j0(Throwable th) {
        ((cvy) this.viewModel).m108977k(CoreModule.f17545c.f19642f0.m33216zp(this.f77503a));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        String stringExtra = act().getIntent().getStringExtra("USER_ID");
        this.f77503a = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        duringCreated(CoreModule.f17545c.f19642f0.m32820Ue(this.f77503a).distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.yuy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200140a.m104092i0((Conversation) obj);
            }
        }, new e30() { // from class: l.zuy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204915a.m104091j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m104092i0(Conversation conversation) {
        ((cvy) this.viewModel).m108977k(conversation);
    }

    /* JADX INFO: renamed from: k0 */
    public void m104093k0(String str, boolean z, boolean z2) {
        act().duringCreated(CoreModule.f17545c.f19642f0.m32637Eo(str, z, z2).take(1)).subscribe(mkd0.m154956H(new C15990a(), new e30() { // from class: l.avy
            @Override // p149l.e30
            public final void call(Object obj) {
                bvy.m104087e0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
