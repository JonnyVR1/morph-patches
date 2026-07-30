package p153l;

import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class cgk extends ar2<egk> {

    /* JADX INFO: renamed from: a */
    public String f81683a;

    /* JADX INFO: renamed from: b */
    public String f81684b;

    public cgk(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m109703k0(Bundle bundle) {
        ((egk) this.viewModel).m120780A3(this.f81684b);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        Intent intent = act().getIntent();
        if (NullChecker.m82486a(intent)) {
            this.f81683a = intent.getStringExtra(FirebaseAnalytics.Param.GROUP_ID);
            this.f81684b = intent.getStringExtra("group_description");
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.wfk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188859a.m109703k0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20387g0.m32911o6(this.f81683a)).filter(new ui7()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.xfk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194044a.m109704l0((ChatGroup) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m109704l0(ChatGroup chatGroup) {
        ((egk) this.viewModel).m120786q(chatGroup);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m109705m0(uxj0 uxj0Var) {
        o1j0.m165651y("已提交，待审核通过后生效。");
        act().progressDismiss();
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m109706n0(Throwable th) {
        act().progressDismiss();
        CoreModule.m30933P().m143412i().mo180452d(th);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m109707o0(String str) {
        CoreModule.f18264c.f20387g0.m32825L8(this.f81683a, str).subscribe(psd0.m173597H(new y20() { // from class: l.agk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71246a.m109705m0((uxj0) obj);
            }
        }, new y20() { // from class: l.bgk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76662a.m109706n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m109708p0() {
        act().progressDismiss();
    }

    public String pageId() {
        return "p_alter_group_state";
    }

    /* JADX INFO: renamed from: q0 */
    public void m109709q0(final String str) {
        sfj0.m185596c("e_group_state_finish_button", pageId(), sfj0.C20032a.m185615h("groupchat_id", this.f81683a));
        act().progress("");
        AntiSpamHelper.m81451c(act(), str, DetectCategoryType.get(DetectCategoryType.group_profile), "group_description", pageId(), new x20() { // from class: l.yfk
            @Override // p153l.x20
            public final void call() {
                this.f199535a.m109707o0(str);
            }
        }, new x20() { // from class: l.zfk
            @Override // p153l.x20
            public final void call() {
                this.f204149a.m109708p0();
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
