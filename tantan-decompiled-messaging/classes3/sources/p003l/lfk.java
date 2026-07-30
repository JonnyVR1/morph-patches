package p003l;

import android.content.Intent;
import android.os.Bundle;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.DetectCategoryType;
import com.p1.mobile.putong.util.AntiSpamHelper;
import l.dg7;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.qh7;
import l.qib0;
import l.roj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class lfk extends jq2<ofk> {

    /* JADX INFO: renamed from: a */
    public String f5293a;

    /* JADX INFO: renamed from: b */
    public String f5294b;

    public lfk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m6010k0(Bundle bundle) {
        ((ofk) ((jq2) this).viewModel).m6635A3(this.f5294b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m6011l0(j760 j760Var) {
        ((ofk) ((jq2) this).viewModel).m6641w((ChatGroup) j760Var.a, (ChatGroupMember) j760Var.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m6012m0(roj0 roj0Var) {
        act().progressDismiss();
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m6013n0(Throwable th) {
        act().progressDismiss();
        CoreModule.P().i().d(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m6014o0(String str) {
        duringCreated(CoreModule.c.g0.N8(this.f5293a, str, false)).subscribe((m250) mkd0.H(new e30() { // from class: l.jfk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4636a.m6012m0((roj0) obj);
            }
        }, new e30() { // from class: l.kfk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4916a.m6013n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m6015p0() {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: Z */
    public void m6016Z() {
        super.Z();
        Intent intent = act().getIntent();
        this.f5293a = intent.getStringExtra("group_id");
        this.f5294b = intent.getStringExtra("group_member_nickname");
    }

    /* JADX INFO: renamed from: a0 */
    public void m6017a0() {
        super.a0();
        creates(new e30() { // from class: l.efk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3262a.m6010k0((Bundle) obj);
            }
        });
        duringCreated(mkd0.r(CoreModule.c.g0.o6(this.f5293a).filter(new qh7()).take(1), CoreModule.c.g0.T6(this.f5293a, CoreModule.H().userId()).filter(new dg7()).take(1), new x9j() { // from class: l.ffk
            @Override // p003l.x9j
            public final Object call(Object obj, Object obj2) {
                return j760.a((ChatGroup) obj, (ChatGroupMember) obj2);
            }
        })).subscribe((m250) mkd0.G(new e30() { // from class: l.gfk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3862a.m6011l0((j760) obj);
            }
        }));
    }

    public String pageId() {
        return "p_edit_my_alias_in_group";
    }

    /* JADX INFO: renamed from: q0 */
    public void m6018q0(final String str) {
        o6j0.c("e_confirm_edit_my_alias", pageId(), new o6j0.a[0]);
        if (qib0.Z.K(str) || qib0.Z.P(str)) {
            lsi0.w(R.string.a0);
        } else {
            act().progress("");
            AntiSpamHelper.c(act(), str, DetectCategoryType.get("group_profile"), "nickName", pageId(), new d30() { // from class: l.hfk
                @Override // p003l.d30
                public final void call() {
                    this.f4180a.m6014o0(str);
                }
            }, new d30() { // from class: l.ifk
                @Override // p003l.d30
                public final void call() {
                    this.f4399a.m6015p0();
                }
            });
        }
    }

    public void destroy() {
    }
}
