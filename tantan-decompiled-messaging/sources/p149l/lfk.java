package p149l;

import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.util.AntiSpamHelper;

/* JADX INFO: loaded from: classes3.dex */
public class lfk extends jq2<ofk> {

    /* JADX INFO: renamed from: a */
    public String f127900a;

    /* JADX INFO: renamed from: b */
    public String f127901b;

    public lfk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m149717k0(Bundle bundle) {
        ((ofk) this.viewModel).m164087A3(this.f127901b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m149718l0(j760 j760Var) {
        ((ofk) this.viewModel).m164091w((ChatGroup) j760Var.f116564a, (ChatGroupMember) j760Var.f116565b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m149719m0(roj0 roj0Var) {
        act().progressDismiss();
        act().m47815F2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m149720n0(Throwable th) {
        act().progressDismiss();
        CoreModule.m29935P().m94658i().mo158360d(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m149721o0(String str) {
        duringCreated(CoreModule.f17545c.f19645g0.m31828N8(this.f127900a, str, false)).subscribe(mkd0.m154956H(new e30() { // from class: l.jfk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117672a.m149719m0((roj0) obj);
            }
        }, new e30() { // from class: l.kfk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122943a.m149720n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m149722p0() {
        act().progressDismiss();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        Intent intent = act().getIntent();
        this.f127900a = intent.getStringExtra(FirebaseAnalytics.Param.GROUP_ID);
        this.f127901b = intent.getStringExtra("group_member_nickname");
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.efk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90848a.m149717k0((Bundle) obj);
            }
        });
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19645g0.m31908o6(this.f127900a).filter(new qh7()).take(1), CoreModule.f17545c.f19645g0.m31844T6(this.f127900a, CoreModule.m29931H().userId()).filter(new dg7()).take(1), new x9j() { // from class: l.ffk
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return j760.m140076a((ChatGroup) obj, (ChatGroupMember) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.gfk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102400a.m149718l0((j760) obj);
            }
        }));
    }

    public String pageId() {
        return "p_edit_my_alias_in_group";
    }

    /* JADX INFO: renamed from: q0 */
    public void m149723q0(final String str) {
        o6j0.m162859c("e_confirm_edit_my_alias", pageId(), new o6j0.C18854a[0]);
        if (qib0.f154711Z.m119125K(str) || qib0.f154711Z.m119130P(str)) {
            lsi0.m151593w(R$string.f20917a0);
        } else {
            act().progress("");
            AntiSpamHelper.m80268c(act(), str, DetectCategoryType.get(DetectCategoryType.group_profile), "nickName", pageId(), new d30() { // from class: l.hfk
                @Override // p149l.d30
                public final void call() {
                    this.f107491a.m149721o0(str);
                }
            }, new d30() { // from class: l.ifk
                @Override // p149l.d30
                public final void call() {
                    this.f113029a.m149722p0();
                }
            });
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
