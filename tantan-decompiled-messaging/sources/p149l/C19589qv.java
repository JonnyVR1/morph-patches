package p149l;

import android.os.Bundle;
import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LogoutCounterEnvelope;
import com.p046p1.mobile.putong.core.p053ui.account.DeleteAccountInactiveAct;
import java.util.List;

/* JADX INFO: renamed from: l.qv */
/* JADX INFO: loaded from: classes8.dex */
public class C19589qv extends jq2<C20966wv> {

    /* JADX INFO: renamed from: a */
    public String f156566a;

    /* JADX INFO: renamed from: b */
    public String f156567b;

    /* JADX INFO: renamed from: c */
    public String f156568c;

    public C19589qv(mcr mcrVar) {
        super(mcrVar);
        this.f156566a = "";
        this.f156567b = "";
        this.f156568c = "";
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m176670e0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m176679x0(Bundle bundle) {
        ((C20966wv) this.viewModel).m205700r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        creates(new e30() { // from class: l.iv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115071a.m176687u0((Bundle) obj);
            }
        });
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.hv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109606a.m176679x0((Bundle) obj);
            }
        });
        m176681o0();
        m176682p0();
    }

    /* JADX INFO: renamed from: n0 */
    public View.OnClickListener m176680n0() {
        return new View.OnClickListener() { // from class: l.ov
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145755a.m176683q0(view);
            }
        };
    }

    /* JADX INFO: renamed from: o0 */
    public void m176681o0() {
        duringCreated(CoreModule.f17545c.f19642f0.m33014kg().take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.mv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135857a.m176684r0((LogoutCounterEnvelope) obj);
            }
        }, new e30() { // from class: l.nv
            @Override // p149l.e30
            public final void call(Object obj) {
                C19589qv.m176670e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public void m176682p0() {
        duringCreated(CoreModule.f17545c.f19642f0.m33053ng().flatMap(new w9j() { // from class: l.jv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19642f0.m33027lg((List) obj);
            }
        }).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.kv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124735a.m176685s0((List) obj);
            }
        }, new e30() { // from class: l.lv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130107a.m176686t0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m176683q0(View view) {
        zvf0.m220396r("e_delete_account_chat_block_continue_delete", act().pageId());
        act().startActivity(DeleteAccountInactiveAct.m44112Y1(act(), this.f156568c, this.f156566a, this.f156567b));
        act().m47815F2();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m176684r0(LogoutCounterEnvelope logoutCounterEnvelope) {
        ((C20966wv) this.viewModel).m205703v(logoutCounterEnvelope.data);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m176685s0(List list) {
        ((C20966wv) this.viewModel).m205704w(list);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m176686t0(Throwable th) {
        ((C20966wv) this.viewModel).m205694j();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m176687u0(Bundle bundle) {
        this.f156566a = act().getIntent().getStringExtra("inactivateCategoryKey");
        this.f156567b = act().getIntent().getStringExtra("inactivateReasonKey");
        this.f156568c = act().getIntent().getStringExtra("deleteContent");
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m176688y0(View view) {
        zvf0.m220396r("e_delete_account_chat_block_cancel", act().pageId());
        act().m47815F2();
    }

    /* JADX INFO: renamed from: z0 */
    public View.OnClickListener m176689z0() {
        return new View.OnClickListener() { // from class: l.pv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151376a.m176688y0(view);
            }
        };
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
