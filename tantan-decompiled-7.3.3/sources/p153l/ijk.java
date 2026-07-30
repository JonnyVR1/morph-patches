package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.ChatGroupMemberStatus;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.GroupApply;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class ijk extends ar2<sjk> {

    /* JADX INFO: renamed from: a */
    public String f115236a;

    /* JADX INFO: renamed from: b */
    public ChatGroup f115237b;

    /* JADX INFO: renamed from: c */
    public ChatGroupMember f115238c;

    /* JADX INFO: renamed from: d */
    public GroupApply f115239d;

    public ijk(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m140202p0(Bundle bundle) {
        ((sjk) this.viewModel).m186162r();
        if (NullChecker.m82486a(this.f115237b)) {
            ((sjk) this.viewModel).m186160p0(this.f115237b, this.f115238c, this.f115239d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m140203q0(bkj0 bkj0Var) {
        A a = bkj0Var.f77081a;
        this.f115237b = (ChatGroup) a;
        B b = bkj0Var.f77082b;
        this.f115238c = (ChatGroupMember) b;
        C c = bkj0Var.f77083c;
        this.f115239d = (GroupApply) c;
        ((sjk) this.viewModel).m186160p0((ChatGroup) a, (ChatGroupMember) b, (GroupApply) c);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        Intent intent = act().getIntent();
        if (NullChecker.m82486a(intent)) {
            this.f115236a = intent.getStringExtra(FirebaseAnalytics.Param.GROUP_ID);
            this.f115237b = (ChatGroup) intent.getSerializableExtra("chat_group");
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.ajk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71832a.m140202p0((Bundle) obj);
            }
        });
        duringCreated(psd0.m173626s(CoreModule.f18264c.f20387g0.m32911o6(this.f115236a).filter(new ui7()), CoreModule.f18264c.f20387g0.m32850U6(this.f115236a, CoreModule.m30929H().userId(), true), CoreModule.f18264c.f20387g0.m32826M6(this.f115236a), new scj() { // from class: l.bjk
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return bkj0.m104818a((ChatGroup) obj, (ChatGroupMember) obj2, (GroupApply) obj3);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.cjk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82173a.m140203q0((bkj0) obj);
            }
        }));
        duringCreated((C22421c) CoreModule.f18264c.f20387g0.m32911o6(this.f115236a).filter(new ui7()).flatMap(new qcj() { // from class: l.djk
            @Override // p153l.qcj
            public final Object call(Object obj) {
                ChatGroup chatGroup = (ChatGroup) obj;
                return CoreModule.f18264c.f20381e0.m116491Ma(chatGroup.ownerUserId).map(new qcj() { // from class: l.fjk
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return pf60.m172085a(chatGroup, (User) obj2);
                    }
                });
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.ejk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94308a.m140208r0((pf60) obj);
            }
        }));
        CoreModule.f18264c.f20387g0.m32861X8(this.f115236a);
    }

    /* JADX INFO: renamed from: l0 */
    public void m140204l0(final String str) {
        ChatGroupMember chatGroupMember = this.f115238c;
        if (chatGroupMember != null && !TEnum.equals(chatGroupMember.status, ChatGroupMemberStatus.exited)) {
            sfj0.m185596c("e_enter_groupchat", pageId(), sfj0.C20032a.m185615h("groupchat_id", this.f115236a), sfj0.C20032a.m185613f("is_anonymou_group", jek.m144587s(this.f115237b) ? 1 : 0));
            duringCreated(CoreModule.f18264c.f20384f0.m33619Dg(this.f115236a)).filter(new sb8()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.hjk
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f110224a.m140207o0((Conversation) obj);
                }
            }));
            return;
        }
        sfj0.m185596c("e_apply_add_group_button", pageId(), sfj0.C20032a.m185615h("groupchat_id", this.f115236a), sfj0.C20032a.m185613f("is_anonymou_group", jek.m144587s(this.f115237b) ? 1 : 0));
        if (TextUtils.equals(this.f115237b.category.f21105id, Constants.VIA_REPORT_TYPE_START_GROUP)) {
            uqb0.f180396b0.f170326c.mo68446ek(act(), this.f115236a);
        } else {
            AntiSpamHelper.m81451c(act(), str, DetectCategoryType.get(DetectCategoryType.group_apply), DetectCategoryType.group_apply, pageId(), new x20() { // from class: l.gjk
                @Override // p153l.x20
                public final void call() {
                    this.f104634a.m140206n0(str);
                }
            }, null);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public String m140205m0() {
        return this.f115236a;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m140206n0(String str) {
        jek.m144588t(act(), this.f115236a, str, "profile");
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m140207o0(Conversation conversation) {
        act().startActivity(MessagesAct.m50126k2(act(), conversation.f56859id, false, false));
    }

    public String pageId() {
        return "p_group_information";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m140208r0(pf60 pf60Var) {
        ((sjk) this.viewModel).m186159o0((ChatGroup) pf60Var.f152156a, (User) pf60Var.f152157b);
    }

    /* JADX INFO: renamed from: s0 */
    public void m140209s0() {
        if (this.f115237b == null) {
            return;
        }
        Act act = act();
        CoreBusinessService coreBusinessServiceM143412i = CoreModule.m30933P().m143412i();
        Act act2 = act();
        ChatGroup chatGroup = this.f115237b;
        act.startActivity(coreBusinessServiceM143412i.mo180360M1(act2, chatGroup.ownerUserId, jek.m144587s(chatGroup) ? "chat_group_anonymity" : "chat_group", false));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
