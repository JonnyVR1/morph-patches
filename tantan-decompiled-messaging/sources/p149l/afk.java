package p149l;

import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class afk extends jq2<dfk> {

    /* JADX INFO: renamed from: a */
    public String f69178a;

    /* JADX INFO: renamed from: b */
    public String f69179b;

    /* JADX INFO: renamed from: c */
    public boolean f69180c;

    public afk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m96235k0(Bundle bundle) {
        ((dfk) this.viewModel).m111485A3(this.f69179b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m96236l0(ChatGroup chatGroup) {
        ((dfk) this.viewModel).m111490w(chatGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m96237m0(roj0 roj0Var) {
        lsi0.m151595y("已提交，待审核通过后生效。");
        act().progressDismiss();
        act().lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m96238n0(Throwable th) {
        act().progressDismiss();
        CoreModule.m29935P().m94658i().mo158360d(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m96239o0(String str) {
        duringCreated(CoreModule.f17545c.f19645g0.m31825M8(this.f69178a, str)).subscribe(mkd0.m154956H(new e30() { // from class: l.yek
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197694a.m96237m0((roj0) obj);
            }
        }, new e30() { // from class: l.zek
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202835a.m96238n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m96240p0() {
        act().progressDismiss();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        Intent intent = act().getIntent();
        if (NullChecker.m81303a(intent)) {
            this.f69178a = intent.getStringExtra("group_Id");
            this.f69179b = intent.getStringExtra("group_name");
            this.f69180c = intent.getBooleanExtra("anonymous", false);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.uek
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176045a.m96235k0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19645g0.m31908o6(this.f69178a)).filter(new qh7()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.vek
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181209a.m96236l0((ChatGroup) obj);
            }
        }));
    }

    public String pageId() {
        return "p_alter_group_name";
    }

    /* JADX INFO: renamed from: q0 */
    public void m96241q0(final String str) {
        o6j0.m162859c("e_group_name_finish_button", pageId(), o6j0.C18854a.m162878h("groupchat_id", this.f69178a), o6j0.C18854a.m162876f("is_anonymou_group", this.f69180c ? 1 : 0));
        act().progress("");
        AntiSpamHelper.m80268c(act(), str, DetectCategoryType.get(DetectCategoryType.group_profile), "group_name", pageId(), new d30() { // from class: l.wek
            @Override // p149l.d30
            public final void call() {
                this.f185945a.m96239o0(str);
            }
        }, new d30() { // from class: l.xek
            @Override // p149l.d30
            public final void call() {
                this.f192603a.m96240p0();
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
