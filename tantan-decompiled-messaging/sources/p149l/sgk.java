package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.ChatGroupMemberStatus;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.GroupApply;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class sgk extends jq2<chk> {

    /* JADX INFO: renamed from: a */
    public String f164445a;

    /* JADX INFO: renamed from: b */
    public ChatGroup f164446b;

    /* JADX INFO: renamed from: c */
    public ChatGroupMember f164447c;

    /* JADX INFO: renamed from: d */
    public GroupApply f164448d;

    public sgk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m184117p0(Bundle bundle) {
        ((chk) this.viewModel).m106962r();
        if (NullChecker.m81303a(this.f164446b)) {
            ((chk) this.viewModel).m106960p0(this.f164446b, this.f164447c, this.f164448d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m184118q0(xaj0 xaj0Var) {
        A a = xaj0Var.f191751a;
        this.f164446b = (ChatGroup) a;
        B b = xaj0Var.f191752b;
        this.f164447c = (ChatGroupMember) b;
        C c = xaj0Var.f191753c;
        this.f164448d = (GroupApply) c;
        ((chk) this.viewModel).m106960p0((ChatGroup) a, (ChatGroupMember) b, (GroupApply) c);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        Intent intent = act().getIntent();
        if (NullChecker.m81303a(intent)) {
            this.f164445a = intent.getStringExtra(FirebaseAnalytics.Param.GROUP_ID);
            this.f164446b = (ChatGroup) intent.getSerializableExtra("chat_group");
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.kgk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123039a.m184117p0((Bundle) obj);
            }
        });
        duringCreated(mkd0.m154985s(CoreModule.f17545c.f19645g0.m31908o6(this.f164445a).filter(new qh7()), CoreModule.f17545c.f19645g0.m31847U6(this.f164445a, CoreModule.m29931H().userId(), true), CoreModule.f17545c.f19645g0.m31823M6(this.f164445a), new y9j() { // from class: l.lgk
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return xaj0.m207578a((ChatGroup) obj, (ChatGroupMember) obj2, (GroupApply) obj3);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.mgk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133699a.m184118q0((xaj0) obj);
            }
        }));
        duringCreated((C22306c) CoreModule.f17545c.f19645g0.m31908o6(this.f164445a).filter(new qh7()).flatMap(new w9j() { // from class: l.ngk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                ChatGroup chatGroup = (ChatGroup) obj;
                return CoreModule.f17545c.f19639e0.m169418Ma(chatGroup.ownerUserId).map(new w9j() { // from class: l.pgk
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return j760.m140076a(chatGroup, (User) obj2);
                    }
                });
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.ogk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143869a.m184123r0((j760) obj);
            }
        }));
        CoreModule.f17545c.f19645g0.m31858X8(this.f164445a);
    }

    /* JADX INFO: renamed from: l0 */
    public void m184119l0(final String str) {
        ChatGroupMember chatGroupMember = this.f164447c;
        if (chatGroupMember != null && !TEnum.equals(chatGroupMember.status, ChatGroupMemberStatus.exited)) {
            o6j0.m162859c("e_enter_groupchat", pageId(), o6j0.C18854a.m162878h("groupchat_id", this.f164445a), o6j0.C18854a.m162876f("is_anonymou_group", tbk.m187872s(this.f164446b) ? 1 : 0));
            duringCreated(CoreModule.f17545c.f19642f0.m32616Dg(this.f164445a)).filter(new oa8()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.rgk
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f159264a.m184122o0((Conversation) obj);
                }
            }));
            return;
        }
        o6j0.m162859c("e_apply_add_group_button", pageId(), o6j0.C18854a.m162878h("groupchat_id", this.f164445a), o6j0.C18854a.m162876f("is_anonymou_group", tbk.m187872s(this.f164446b) ? 1 : 0));
        if (TextUtils.equals(this.f164446b.category.f20363id, Constants.VIA_REPORT_TYPE_START_GROUP)) {
            qib0.f154713b0.f139232c.mo67263ek(act(), this.f164445a);
        } else {
            AntiSpamHelper.m80268c(act(), str, DetectCategoryType.get(DetectCategoryType.group_apply), DetectCategoryType.group_apply, pageId(), new d30() { // from class: l.qgk
                @Override // p149l.d30
                public final void call() {
                    this.f154343a.m184121n0(str);
                }
            }, null);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public String m184120m0() {
        return this.f164445a;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m184121n0(String str) {
        tbk.m187873t(act(), this.f164445a, str, "profile");
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m184122o0(Conversation conversation) {
        act().startActivity(MessagesAct.m48943i2(act(), conversation.f56011id, false, false));
    }

    public String pageId() {
        return "p_group_information";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m184123r0(j760 j760Var) {
        ((chk) this.viewModel).m106959o0((ChatGroup) j760Var.f116564a, (User) j760Var.f116565b);
    }

    /* JADX INFO: renamed from: s0 */
    public void m184124s0() {
        if (this.f164446b == null) {
            return;
        }
        Act act = act();
        CoreBusinessService coreBusinessServiceM94658i = CoreModule.m29935P().m94658i();
        Act act2 = act();
        ChatGroup chatGroup = this.f164446b;
        act.startActivity(coreBusinessServiceM94658i.mo158268M1(act2, chatGroup.ownerUserId, tbk.m187872s(chatGroup) ? "chat_group_anonymity" : "chat_group", false));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
