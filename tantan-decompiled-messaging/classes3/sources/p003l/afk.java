package p003l;

import android.content.Intent;
import android.os.Bundle;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.data.DetectCategoryType;
import com.p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.qh7;
import l.roj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class afk extends jq2<dfk> {

    /* JADX INFO: renamed from: a */
    public String f2177a;

    /* JADX INFO: renamed from: b */
    public String f2178b;

    /* JADX INFO: renamed from: c */
    public boolean f2179c;

    public afk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m2856k0(Bundle bundle) {
        ((dfk) ((jq2) this).viewModel).m3544A3(this.f2178b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m2857l0(ChatGroup chatGroup) {
        ((dfk) ((jq2) this).viewModel).m3551w(chatGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m2858m0(roj0 roj0Var) {
        lsi0.y("已提交，待审核通过后生效。");
        act().progressDismiss();
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m2859n0(Throwable th) {
        act().progressDismiss();
        CoreModule.P().i().d(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m2860o0(String str) {
        duringCreated(CoreModule.c.g0.M8(this.f2177a, str)).subscribe((m250) mkd0.H(new e30() { // from class: l.yek
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9063a.m2858m0((roj0) obj);
            }
        }, new e30() { // from class: l.zek
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9328a.m2859n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m2861p0() {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: Z */
    public void m2862Z() {
        super.Z();
        Intent intent = act().getIntent();
        if (NullChecker.a(intent)) {
            this.f2177a = intent.getStringExtra("group_Id");
            this.f2178b = intent.getStringExtra("group_name");
            this.f2179c = intent.getBooleanExtra("anonymous", false);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m2863a0() {
        super.a0();
        creates(new e30() { // from class: l.uek
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7970a.m2856k0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.g0.o6(this.f2177a)).filter(new qh7()).take(1).subscribe((m250) mkd0.G(new e30() { // from class: l.vek
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8323a.m2857l0((ChatGroup) obj);
            }
        }));
    }

    public String pageId() {
        return "p_alter_group_name";
    }

    /* JADX INFO: renamed from: q0 */
    public void m2864q0(final String str) {
        o6j0.c("e_group_name_finish_button", pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", this.f2177a), o6j0.a.f("is_anonymou_group", this.f2179c ? 1 : 0)});
        act().progress("");
        AntiSpamHelper.c(act(), str, DetectCategoryType.get("group_profile"), "group_name", pageId(), new d30() { // from class: l.wek
            @Override // p003l.d30
            public final void call() {
                this.f8537a.m2860o0(str);
            }
        }, new d30() { // from class: l.xek
            @Override // p003l.d30
            public final void call() {
                this.f8773a.m2861p0();
            }
        });
    }

    public void destroy() {
    }
}
