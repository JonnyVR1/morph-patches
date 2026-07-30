package p149l;

import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class mdk extends jq2<odk> {

    /* JADX INFO: renamed from: a */
    public String f133274a;

    /* JADX INFO: renamed from: b */
    public String f133275b;

    public mdk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m154095k0(Bundle bundle) {
        ((odk) this.viewModel).m163677A3(this.f133275b);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        Intent intent = act().getIntent();
        if (NullChecker.m81303a(intent)) {
            this.f133274a = intent.getStringExtra(FirebaseAnalytics.Param.GROUP_ID);
            this.f133275b = intent.getStringExtra("group_description");
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.gdk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102121a.m154095k0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19645g0.m31908o6(this.f133274a)).filter(new qh7()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.hdk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107251a.m154096l0((ChatGroup) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m154096l0(ChatGroup chatGroup) {
        ((odk) this.viewModel).m163683q(chatGroup);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m154097m0(roj0 roj0Var) {
        lsi0.m151595y("已提交，待审核通过后生效。");
        act().progressDismiss();
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m154098n0(Throwable th) {
        act().progressDismiss();
        CoreModule.m29935P().m94658i().mo158360d(th);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m154099o0(String str) {
        CoreModule.f17545c.f19645g0.m31822L8(this.f133274a, str).subscribe(mkd0.m154956H(new e30() { // from class: l.kdk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122568a.m154097m0((roj0) obj);
            }
        }, new e30() { // from class: l.ldk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127567a.m154098n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m154100p0() {
        act().progressDismiss();
    }

    public String pageId() {
        return "p_alter_group_state";
    }

    /* JADX INFO: renamed from: q0 */
    public void m154101q0(final String str) {
        o6j0.m162859c("e_group_state_finish_button", pageId(), o6j0.C18854a.m162878h("groupchat_id", this.f133274a));
        act().progress("");
        AntiSpamHelper.m80268c(act(), str, DetectCategoryType.get(DetectCategoryType.group_profile), "group_description", pageId(), new d30() { // from class: l.idk
            @Override // p149l.d30
            public final void call() {
                this.f112567a.m154099o0(str);
            }
        }, new d30() { // from class: l.jdk
            @Override // p149l.d30
            public final void call() {
                this.f117400a.m154100p0();
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
