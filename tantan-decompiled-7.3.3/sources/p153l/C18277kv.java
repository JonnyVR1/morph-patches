package p153l;

import android.os.Bundle;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LogoutCounterEnvelope;
import com.p051p1.mobile.putong.core.p058ui.account.DeleteAccountInactiveAct;
import java.util.List;

/* JADX INFO: renamed from: l.kv */
/* JADX INFO: loaded from: classes9.dex */
public class C18277kv extends ar2<C19679qv> {

    /* JADX INFO: renamed from: a */
    public String f128931a;

    /* JADX INFO: renamed from: b */
    public String f128932b;

    /* JADX INFO: renamed from: c */
    public String f128933c;

    public C18277kv(ner nerVar) {
        super(nerVar);
        this.f128931a = "";
        this.f128932b = "";
        this.f128933c = "";
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m151627e0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m151636x0(Bundle bundle) {
        ((C19679qv) this.viewModel).m178241r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        creates(new y20() { // from class: l.cv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83926a.m151644u0((Bundle) obj);
            }
        });
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.bv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78567a.m151636x0((Bundle) obj);
            }
        });
        m151638o0();
        m151639p0();
    }

    /* JADX INFO: renamed from: n0 */
    public View.OnClickListener m151637n0() {
        return new View.OnClickListener() { // from class: l.iv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116994a.m151640q0(view);
            }
        };
    }

    /* JADX INFO: renamed from: o0 */
    public void m151638o0() {
        duringCreated(CoreModule.f18264c.f20384f0.m34017kg().take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.gv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106594a.m151641r0((LogoutCounterEnvelope) obj);
            }
        }, new y20() { // from class: l.hv
            @Override // p153l.y20
            public final void call(Object obj) {
                C18277kv.m151627e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public void m151639p0() {
        duringCreated(CoreModule.f18264c.f20384f0.m34056ng().flatMap(new qcj() { // from class: l.dv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20384f0.m34030lg((List) obj);
            }
        }).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.ev
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95973a.m151642s0((List) obj);
            }
        }, new y20() { // from class: l.fv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100960a.m151643t0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m151640q0(View view) {
        i4g0.m138520r("e_delete_account_chat_block_continue_delete", act().pageId());
        act().startActivity(DeleteAccountInactiveAct.m45295Z1(act(), this.f128933c, this.f128931a, this.f128932b));
        act().m48999H2();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m151641r0(LogoutCounterEnvelope logoutCounterEnvelope) {
        ((C19679qv) this.viewModel).m178244v(logoutCounterEnvelope.data);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m151642s0(List list) {
        ((C19679qv) this.viewModel).m178245w(list);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m151643t0(Throwable th) {
        ((C19679qv) this.viewModel).m178235j();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m151644u0(Bundle bundle) {
        this.f128931a = act().getIntent().getStringExtra("inactivateCategoryKey");
        this.f128932b = act().getIntent().getStringExtra("inactivateReasonKey");
        this.f128933c = act().getIntent().getStringExtra("deleteContent");
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m151645y0(View view) {
        i4g0.m138520r("e_delete_account_chat_block_cancel", act().pageId());
        act().m48999H2();
    }

    /* JADX INFO: renamed from: z0 */
    public View.OnClickListener m151646z0() {
        return new View.OnClickListener() { // from class: l.jv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122754a.m151645y0(view);
            }
        };
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
