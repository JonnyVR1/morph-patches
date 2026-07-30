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
public class mdk extends jq2<odk> {

    /* JADX INFO: renamed from: a */
    public String f5588a;

    /* JADX INFO: renamed from: b */
    public String f5589b;

    public mdk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m6338k0(Bundle bundle) {
        ((odk) ((jq2) this).viewModel).m6609A3(this.f5589b);
    }

    /* JADX INFO: renamed from: Z */
    public void m6339Z() {
        super.Z();
        Intent intent = act().getIntent();
        if (NullChecker.a(intent)) {
            this.f5588a = intent.getStringExtra("group_id");
            this.f5589b = intent.getStringExtra("group_description");
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m6340a0() {
        super.a0();
        creates(new e30() { // from class: l.gdk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3848a.m6338k0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.g0.o6(this.f5588a)).filter(new qh7()).take(1).subscribe((m250) mkd0.G(new e30() { // from class: l.hdk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4173a.m6341l0((ChatGroup) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m6341l0(ChatGroup chatGroup) {
        ((odk) ((jq2) this).viewModel).m6617q(chatGroup);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m6342m0(roj0 roj0Var) {
        lsi0.y("已提交，待审核通过后生效。");
        act().progressDismiss();
        act().finish();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m6343n0(Throwable th) {
        act().progressDismiss();
        CoreModule.P().i().d(th);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m6344o0(String str) {
        CoreModule.c.g0.L8(this.f5588a, str).subscribe((m250) mkd0.H(new e30() { // from class: l.kdk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4900a.m6342m0((roj0) obj);
            }
        }, new e30() { // from class: l.ldk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5262a.m6343n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m6345p0() {
        act().progressDismiss();
    }

    public String pageId() {
        return "p_alter_group_state";
    }

    /* JADX INFO: renamed from: q0 */
    public void m6346q0(final String str) {
        o6j0.c("e_group_state_finish_button", pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", this.f5588a)});
        act().progress("");
        AntiSpamHelper.c(act(), str, DetectCategoryType.get("group_profile"), "group_description", pageId(), new d30() { // from class: l.idk
            @Override // p003l.d30
            public final void call() {
                this.f4392a.m6344o0(str);
            }
        }, new d30() { // from class: l.jdk
            @Override // p003l.d30
            public final void call() {
                this.f4620a.m6345p0();
            }
        });
    }

    public void destroy() {
    }
}
