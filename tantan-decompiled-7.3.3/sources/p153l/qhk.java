package p153l;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class qhk extends ar2<thk> {

    /* JADX INFO: renamed from: a */
    public String f157719a;

    /* JADX INFO: renamed from: b */
    public String f157720b;

    /* JADX INFO: renamed from: c */
    public boolean f157721c;

    public qhk(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m176586k0(Bundle bundle) {
        ((thk) this.viewModel).m191253A3(this.f157720b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m176587l0(ChatGroup chatGroup) {
        ((thk) this.viewModel).m191258w(chatGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m176588m0(uxj0 uxj0Var) {
        o1j0.m165651y("已提交，待审核通过后生效。");
        act().progressDismiss();
        act().lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m176589n0(Throwable th) {
        act().progressDismiss();
        CoreModule.m30933P().m143412i().mo180452d(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m176590o0(String str) {
        duringCreated(CoreModule.f18264c.f20387g0.m32828M8(this.f157719a, str)).subscribe(psd0.m173597H(new y20() { // from class: l.ohk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147456a.m176588m0((uxj0) obj);
            }
        }, new y20() { // from class: l.phk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152444a.m176589n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m176591p0() {
        act().progressDismiss();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        Intent intent = act().getIntent();
        if (NullChecker.m82486a(intent)) {
            this.f157719a = intent.getStringExtra("group_Id");
            this.f157720b = intent.getStringExtra("group_name");
            this.f157721c = intent.getBooleanExtra("anonymous", false);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.khk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126880a.m176586k0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20387g0.m32911o6(this.f157719a)).filter(new ui7()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.lhk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132108a.m176587l0((ChatGroup) obj);
            }
        }));
    }

    public String pageId() {
        return "p_alter_group_name";
    }

    /* JADX INFO: renamed from: q0 */
    public void m176592q0(final String str) {
        sfj0.m185596c("e_group_name_finish_button", pageId(), sfj0.C20032a.m185615h("groupchat_id", this.f157719a), sfj0.C20032a.m185613f("is_anonymou_group", this.f157721c ? 1 : 0));
        act().progress("");
        AntiSpamHelper.m81451c(act(), str, DetectCategoryType.get(DetectCategoryType.group_profile), "group_name", pageId(), new x20() { // from class: l.mhk
            @Override // p153l.x20
            public final void call() {
                this.f136856a.m176590o0(str);
            }
        }, new x20() { // from class: l.nhk
            @Override // p153l.x20
            public final void call() {
                this.f141997a.m176591p0();
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
