package p153l;

import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.util.AntiSpamHelper;

/* JADX INFO: loaded from: classes3.dex */
public class bik extends ar2<eik> {

    /* JADX INFO: renamed from: a */
    public String f76886a;

    /* JADX INFO: renamed from: b */
    public String f76887b;

    public bik(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m104473k0(Bundle bundle) {
        ((eik) this.viewModel).m120928A3(this.f76887b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m104474l0(pf60 pf60Var) {
        ((eik) this.viewModel).m120932w((ChatGroup) pf60Var.f152156a, (ChatGroupMember) pf60Var.f152157b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m104475m0(uxj0 uxj0Var) {
        act().progressDismiss();
        act().m48999H2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m104476n0(Throwable th) {
        act().progressDismiss();
        CoreModule.m30933P().m143412i().mo180452d(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m104477o0(String str) {
        duringCreated(CoreModule.f18264c.f20387g0.m32831N8(this.f76886a, str, false)).subscribe(psd0.m173597H(new y20() { // from class: l.zhk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204430a.m104475m0((uxj0) obj);
            }
        }, new y20() { // from class: l.aik
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71542a.m104476n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m104478p0() {
        act().progressDismiss();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        Intent intent = act().getIntent();
        this.f76886a = intent.getStringExtra(FirebaseAnalytics.Param.GROUP_ID);
        this.f76887b = intent.getStringExtra("group_member_nickname");
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.uhk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179031a.m104473k0((Bundle) obj);
            }
        });
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20387g0.m32911o6(this.f76886a).filter(new ui7()).take(1), CoreModule.f18264c.f20387g0.m32847T6(this.f76886a, CoreModule.m30929H().userId()).filter(new hh7()).take(1), new rcj() { // from class: l.vhk
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return pf60.m172085a((ChatGroup) obj, (ChatGroupMember) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.whk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189169a.m104474l0((pf60) obj);
            }
        }));
    }

    public String pageId() {
        return "p_edit_my_alias_in_group";
    }

    /* JADX INFO: renamed from: q0 */
    public void m104479q0(final String str) {
        sfj0.m185596c("e_confirm_edit_my_alias", pageId(), new sfj0.C20032a[0]);
        if (uqb0.f180394Z.m95954K(str) || uqb0.f180394Z.m95959P(str)) {
            o1j0.m165649w(R$string.f21659a0);
        } else {
            act().progress("");
            AntiSpamHelper.m81451c(act(), str, DetectCategoryType.get(DetectCategoryType.group_profile), "nickName", pageId(), new x20() { // from class: l.xhk
                @Override // p153l.x20
                public final void call() {
                    this.f194370a.m104477o0(str);
                }
            }, new x20() { // from class: l.yhk
                @Override // p153l.x20
                public final void call() {
                    this.f199970a.m104478p0();
                }
            });
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
