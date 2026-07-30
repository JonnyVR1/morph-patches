package p007l;

import android.os.Bundle;
import android.view.View;
import com.p003p1.mobile.putong.core.p006ui.account.DeleteAccountInactiveAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LogoutCounterEnvelope;
import java.util.List;
import l.e30;
import l.w9j;
import l.zvf0;

/* JADX INFO: renamed from: l.qv */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0677qv extends jq2<C0758wv> {

    /* JADX INFO: renamed from: a */
    public String f3982a;

    /* JADX INFO: renamed from: b */
    public String f3983b;

    /* JADX INFO: renamed from: c */
    public String f3984c;

    public C0677qv(mcr mcrVar) {
        super(mcrVar);
        this.f3982a = "";
        this.f3983b = "";
        this.f3984c = "";
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m10469e0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m10478x0(Bundle bundle) {
        ((C0758wv) this.viewModel).m11384r();
    }

    @Override // p007l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo9553Z() {
        super.mo9553Z();
        creates(new e30() { // from class: l.iv
            public final void call(Object obj) {
                this.f2938a.m10486u0((Bundle) obj);
            }
        });
    }

    @Override // p007l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo8872a0() {
        creates(new e30() { // from class: l.hv
            public final void call(Object obj) {
                this.f2857a.m10478x0((Bundle) obj);
            }
        });
        m10480o0();
        m10481p0();
    }

    /* JADX INFO: renamed from: n0 */
    public View.OnClickListener m10479n0() {
        return new View.OnClickListener() { // from class: l.ov
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3581a.m10482q0(view);
            }
        };
    }

    /* JADX INFO: renamed from: o0 */
    public void m10480o0() {
        duringCreated(CoreModule.c.f0.kg().take(1)).subscribe(mkd0.m9875H(new e30() { // from class: l.mv
            public final void call(Object obj) {
                this.f3335a.m10483r0((LogoutCounterEnvelope) obj);
            }
        }, new e30() { // from class: l.nv
            public final void call(Object obj) {
                C0677qv.m10469e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public void m10481p0() {
        duringCreated(CoreModule.c.f0.ng().flatMap(new w9j() { // from class: l.jv
            public final Object call(Object obj) {
                return CoreModule.c.f0.lg((List) obj);
            }
        }).take(1)).subscribe(mkd0.m9875H(new e30() { // from class: l.kv
            public final void call(Object obj) {
                this.f3097a.m10484s0((List) obj);
            }
        }, new e30() { // from class: l.lv
            public final void call(Object obj) {
                this.f3261a.m10485t0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m10482q0(View view) {
        zvf0.r("e_delete_account_chat_block_continue_delete", act().pageId());
        act().startActivity(DeleteAccountInactiveAct.m8460Y1(act(), this.f3984c, this.f3982a, this.f3983b));
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m10483r0(LogoutCounterEnvelope logoutCounterEnvelope) {
        ((C0758wv) this.viewModel).m11387v(logoutCounterEnvelope.data);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m10484s0(List list) {
        ((C0758wv) this.viewModel).m11388w(list);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m10485t0(Throwable th) {
        ((C0758wv) this.viewModel).m11378j();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m10486u0(Bundle bundle) {
        this.f3982a = act().getIntent().getStringExtra("inactivateCategoryKey");
        this.f3983b = act().getIntent().getStringExtra("inactivateReasonKey");
        this.f3984c = act().getIntent().getStringExtra("deleteContent");
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m10487y0(View view) {
        zvf0.r("e_delete_account_chat_block_cancel", act().pageId());
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: z0 */
    public View.OnClickListener m10488z0() {
        return new View.OnClickListener() { // from class: l.pv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3803a.m10487y0(view);
            }
        };
    }

    @Override // p007l.q0m
    public void destroy() {
    }
}
