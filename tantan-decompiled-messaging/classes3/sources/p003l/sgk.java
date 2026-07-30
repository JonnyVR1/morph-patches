package p003l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.GroupApply;
import com.p1.mobile.putong.data.DetectCategoryType;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.oa8;
import l.qh7;
import l.qib0;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class sgk extends jq2<chk> {

    /* JADX INFO: renamed from: a */
    public String f7246a;

    /* JADX INFO: renamed from: b */
    public ChatGroup f7247b;

    /* JADX INFO: renamed from: c */
    public ChatGroupMember f7248c;

    /* JADX INFO: renamed from: d */
    public GroupApply f7249d;

    public sgk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m7585p0(Bundle bundle) {
        ((chk) ((jq2) this).viewModel).m3328r();
        if (NullChecker.a(this.f7247b)) {
            ((chk) ((jq2) this).viewModel).m3326p0(this.f7247b, this.f7248c, this.f7249d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m7586q0(xaj0 xaj0Var) {
        Object obj = xaj0Var.a;
        this.f7247b = (ChatGroup) obj;
        Object obj2 = xaj0Var.b;
        this.f7248c = (ChatGroupMember) obj2;
        Object obj3 = xaj0Var.c;
        this.f7249d = (GroupApply) obj3;
        ((chk) ((jq2) this).viewModel).m3326p0((ChatGroup) obj, (ChatGroupMember) obj2, (GroupApply) obj3);
    }

    /* JADX INFO: renamed from: Z */
    public void m7587Z() {
        super.Z();
        Intent intent = act().getIntent();
        if (NullChecker.a(intent)) {
            this.f7246a = intent.getStringExtra("group_id");
            this.f7247b = intent.getSerializableExtra("chat_group");
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m7588a0() {
        super.a0();
        creates(new e30() { // from class: l.kgk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4928a.m7585p0((Bundle) obj);
            }
        });
        duringCreated(mkd0.s(CoreModule.c.g0.o6(this.f7246a).filter(new qh7()), CoreModule.c.g0.U6(this.f7246a, CoreModule.H().userId(), true), CoreModule.c.g0.M6(this.f7246a), new y9j() { // from class: l.lgk
            @Override // p003l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo2764a(Object obj, Object obj2, Object obj3) {
                return xaj0.a((ChatGroup) obj, (ChatGroupMember) obj2, (GroupApply) obj3);
            }
        })).subscribe((m250) mkd0.G(new e30() { // from class: l.mgk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5630a.m7586q0((xaj0) obj);
            }
        }));
        duringCreated(CoreModule.c.g0.o6(this.f7246a).filter(new qh7()).flatMap(new w9j() { // from class: l.ngk
            @Override // p003l.w9j
            public final Object call(Object obj) {
                ChatGroup chatGroup = (ChatGroup) obj;
                return CoreModule.c.e0.Ma(chatGroup.ownerUserId).map(new w9j() { // from class: l.pgk
                    @Override // p003l.w9j
                    public final Object call(Object obj2) {
                        return j760.a(chatGroup, (User) obj2);
                    }
                });
            }
        })).subscribe((m250) mkd0.G(new e30() { // from class: l.ogk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6154a.m7593r0((j760) obj);
            }
        }));
        CoreModule.c.g0.X8(this.f7246a);
    }

    /* JADX INFO: renamed from: l0 */
    public void m7589l0(final String str) {
        ChatGroupMember chatGroupMember = this.f7248c;
        if (chatGroupMember != null && !TEnum.equals(chatGroupMember.status, "exited")) {
            o6j0.c("e_enter_groupchat", pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", this.f7246a), o6j0.a.f("is_anonymou_group", tbk.m7725s(this.f7247b) ? 1 : 0)});
            duringCreated(CoreModule.c.f0.Dg(this.f7246a)).filter(new oa8()).take(1).subscribe((m250) mkd0.G(new e30() { // from class: l.rgk
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6906a.m7592o0((Conversation) obj);
                }
            }));
            return;
        }
        o6j0.c("e_apply_add_group_button", pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", this.f7246a), o6j0.a.f("is_anonymou_group", tbk.m7725s(this.f7247b) ? 1 : 0)});
        if (TextUtils.equals(this.f7247b.category.id, "17")) {
            qib0.b0.c.ek(act(), this.f7246a);
        } else {
            AntiSpamHelper.c(act(), str, DetectCategoryType.get("group_apply"), "group_apply", pageId(), new d30() { // from class: l.qgk
                @Override // p003l.d30
                public final void call() {
                    this.f6637a.m7591n0(str);
                }
            }, (d30) null);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public String m7590m0() {
        return this.f7246a;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m7591n0(String str) {
        tbk.m7726t(act(), this.f7246a, str, "profile");
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m7592o0(Conversation conversation) {
        act().startActivity(MessagesAct.m2035i2(act(), ((DbObject) conversation).id, false, false));
    }

    public String pageId() {
        return "p_group_information";
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m7593r0(j760 j760Var) {
        ((chk) ((jq2) this).viewModel).m3325o0((ChatGroup) j760Var.a, (User) j760Var.b);
    }

    /* JADX INFO: renamed from: s0 */
    public void m7594s0() {
        if (this.f7247b == null) {
            return;
        }
        Act act = act();
        CoreBusinessService coreBusinessServiceI = CoreModule.P().i();
        Act act2 = act();
        ChatGroup chatGroup = this.f7247b;
        act.startActivity(coreBusinessServiceI.M1(act2, chatGroup.ownerUserId, tbk.m7725s(chatGroup) ? "chat_group_anonymity" : "chat_group", false));
    }

    public void destroy() {
    }
}
