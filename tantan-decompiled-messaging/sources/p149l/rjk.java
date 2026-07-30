package p149l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupDescriptionEditAct;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupMembersAct;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupNameEditAct;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupNicknameSetAct;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupProfileAct;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupSettingManagerAct;
import com.p046p1.mobile.putong.data.IdBoxed;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.LinkChannel;
import com.p046p1.mobile.putong.data.LinkIntent;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class rjk extends jq2<lkk> {

    /* JADX INFO: renamed from: a */
    public String f159721a;

    /* JADX INFO: renamed from: b */
    public String f159722b;

    /* JADX INFO: renamed from: c */
    public Conversation f159723c;

    /* JADX INFO: renamed from: d */
    public ChatGroup f159724d;

    /* JADX INFO: renamed from: e */
    public int f159725e;

    public rjk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m179607R0(Bundle bundle) {
        ((lkk) this.viewModel).m150364r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public /* synthetic */ void m179608S0(roj0 roj0Var) {
        ChatGroup chatGroupM31886h7 = CoreModule.f17545c.f19645g0.m31886h7(this.f159721a);
        if (NullChecker.m81303a(chatGroupM31886h7)) {
            int i = this.f159725e;
            int i2 = chatGroupM31886h7.memberCount;
            if (i != i2) {
                this.f159725e = i2;
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m179614j0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m179618n0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m179623s0(List list, Media media) {
        if (media instanceof Picture) {
            list.add((Picture) media);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m179625u0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ List m179627y0(List list) {
        final ArrayList arrayList = new ArrayList(1);
        vwb.m200354z(list, new e30() { // from class: l.zik
            @Override // p149l.e30
            public final void call(Object obj) {
                rjk.m179623s0(arrayList, (Media) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: A0 */
    public void m179628A0(String str) {
        o6j0.m162859c("e_alter_group_state", pageId(), o6j0.C18854a.m162878h("groupchat_id", this.f159721a));
        act().startActivity(GroupDescriptionEditAct.m49095Z1(act(), this.f159721a, str, tbk.m187872s(this.f159724d)));
    }

    /* JADX INFO: renamed from: C0 */
    public void m179629C0(String str) {
        o6j0.m162859c("e_alter_group_name", pageId(), o6j0.C18854a.m162878h("groupchat_id", this.f159721a));
        act().startActivity(GroupNameEditAct.m49101Z1(act(), this.f159721a, str, tbk.m187872s(this.f159724d)));
    }

    /* JADX INFO: renamed from: D0 */
    public void m179630D0(String str) {
        o6j0.m162859c("e_my_alias_in_group", pageId(), new o6j0.C18854a[0]);
        act().startActivity(GroupNicknameSetAct.m49104Z1(act(), this.f159721a, str));
    }

    /* JADX INFO: renamed from: E0 */
    public void m179631E0() {
        act().progress("");
        duringCreated(CoreModule.f17545c.f19645g0.m31932w6(this.f159721a, this.f159722b)).subscribe(mkd0.m154956H(new e30() { // from class: l.fjk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97794a.m179639O0((roj0) obj);
            }
        }, new e30() { // from class: l.gjk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103086a.m179640P0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F0 */
    public void m179632F0() {
        o6j0.m162859c("e_group_chat_information_entrance", pageId(), new o6j0.C18854a[0]);
        act().startActivity(GroupProfileAct.m49107Z1(act(), this.f159721a, this.f159724d, false));
    }

    /* JADX INFO: renamed from: G0 */
    public void m179633G0() {
        o6j0.m162859c("e_group_members", pageId(), o6j0.C18854a.m162878h("groupchat_id", this.f159721a));
        act().startActivity(GroupMembersAct.m49098Z1(act(), this.f159722b, this.f159721a));
    }

    /* JADX INFO: renamed from: H0 */
    public String m179634H0() {
        return this.f159721a;
    }

    /* JADX INFO: renamed from: I0 */
    public void m179635I0() {
        o6j0.m162859c("e_group_chat_settings_manage", pageId(), o6j0.C18854a.m162878h("groupchat_id", this.f159721a));
        act().startActivity(GroupSettingManagerAct.m49136Z1(act(), this.f159721a));
    }

    /* JADX INFO: renamed from: J0 */
    public final void m179636J0(final ChatGroup chatGroup, List<ChatGroupMember> list) {
        tbk.m187875v(chatGroup, list, new tbk.InterfaceC20141b() { // from class: l.ajk
            @Override // p149l.tbk.InterfaceC20141b
            /* JADX INFO: renamed from: a */
            public final void mo96977a(ChatGroupMember chatGroupMember, List list2, List list3) {
                this.f70119a.m179641Q0(chatGroup, chatGroupMember, list2, list3);
            }
        });
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m179637L0() {
        ChatGroup chatGroup = this.f159724d;
        if (chatGroup == null) {
            return false;
        }
        return TextUtils.equals(chatGroup.ownerUserId, CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m179638N0() {
        return tbk.m187872s(this.f159724d);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m179639O0(roj0 roj0Var) {
        act().progressDismiss();
        act().m66873d2();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m179640P0(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m179641Q0(ChatGroup chatGroup, ChatGroupMember chatGroupMember, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(chatGroupMember)) {
            arrayList.add(chatGroupMember);
        }
        arrayList.addAll(list);
        arrayList.addAll(list2);
        ((lkk) this.viewModel).m150353G0(arrayList, chatGroup);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m179642U0(ChatGroupMember chatGroupMember) {
        ((lkk) this.viewModel).m150355I0(chatGroupMember.groupMemberName());
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m179643V0(Conversation conversation) {
        this.f159723c = conversation;
        ((lkk) this.viewModel).m150354H0(conversation.muted);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m179644W0(Pair pair) {
        ChatGroup chatGroup = (ChatGroup) pair.second;
        this.f159724d = chatGroup;
        ((lkk) this.viewModel).m150352E0(chatGroup);
        m179636J0(this.f159724d, (List) pair.first);
        int i = this.f159725e;
        if (i > 0 && i != this.f159724d.memberCount) {
            CoreModule.f17545c.f19645g0.m31837Q8(this.f159721a);
        }
        this.f159725e = this.f159724d.memberCount;
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m179645X0(Throwable th) {
        if (NullChecker.m81303a(this.f159723c)) {
            ((lkk) this.viewModel).m150354H0(this.f159723c.muted);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m179646Y0(String str, String str2) {
        o6j0.m162859c("e_group_chat_invite_send", "p_group_chat_invite", o6j0.C18854a.m162878h("other_user_id_list", str2));
        C22306c<T> c22306cDuringCreated = duringCreated(CoreModule.f17545c.f19645g0.m31829O6(this.f159721a, new ArrayList(Arrays.asList(str2.split(Constants.SEPARATOR_COMMA)))));
        e30 e30Var = new e30() { // from class: l.hjk
            @Override // p149l.e30
            public final void call(Object obj) {
                rjk.m179614j0((roj0) obj);
            }
        };
        CoreBusinessService coreBusinessServiceM94658i = CoreModule.f17554l.m94658i();
        Objects.requireNonNull(coreBusinessServiceM94658i);
        c22306cDuringCreated.subscribe(mkd0.m154956H(e30Var, new yfk(coreBusinessServiceM94658i)));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        Intent intent = act().getIntent();
        this.f159721a = intent.getStringExtra(FirebaseAnalytics.Param.GROUP_ID);
        this.f159722b = intent.getStringExtra("conversation_id");
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.ljk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128335a.m179607R0((Bundle) obj);
            }
        });
        CoreModule.f17545c.f19645g0.m31858X8(this.f159721a);
        duringCreated(CoreModule.f17545c.f19645g0.m31850V6()).subscribe(mkd0.m154955G(new e30() { // from class: l.mjk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134143a.m179608S0((roj0) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19645g0.m31844T6(this.f159721a, CoreModule.m29931H().userId())).filter(new dg7()).subscribe(mkd0.m154955G(new e30() { // from class: l.njk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139283a.m179642U0((ChatGroupMember) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19642f0.m32737Ne(this.f159722b)).filter(new oa8()).subscribe(mkd0.m154955G(new e30() { // from class: l.ojk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144300a.m179643V0((Conversation) obj);
            }
        }));
        duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19645g0.m31853W6(this.f159721a), CoreModule.f17545c.f19645g0.m31908o6(this.f159721a), new x9j() { // from class: l.pjk
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new Pair((List) obj, (ChatGroup) obj2);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.qjk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154944a.m179644W0((Pair) obj);
            }
        }, new e30() { // from class: l.yik
            @Override // p149l.e30
            public final void call(Object obj) {
                rjk.m179625u0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m179647a1(roj0 roj0Var) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m179648b1(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ C22306c m179649c1(List list) {
        return CoreModule.f17545c.f19645g0.m31819K8(this.f159721a, list);
    }

    /* JADX INFO: renamed from: d1 */
    public void m179650d1(boolean z) {
        o6j0.m162859c("e_group_chat_mute_notification_button", pageId(), o6j0.C18854a.m162878h("groupchat_id", this.f159721a), o6j0.C18854a.m162876f("is_open", z ? 1 : 0));
        if (NullChecker.m81303a(this.f159723c) && this.f159723c.muted == z) {
            return;
        }
        duringCreated(CoreModule.f17545c.f19645g0.m31808G8(this.f159722b, z)).subscribe(mkd0.m154956H(new e30() { // from class: l.bjk
            @Override // p149l.e30
            public final void call(Object obj) {
                rjk.m179618n0((roj0) obj);
            }
        }, new e30() { // from class: l.cjk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81195a.m179645X0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e1 */
    public void m179651e1() {
        CoreModule.m29935P().m94658i().mo158308T2(act());
    }

    /* JADX INFO: renamed from: f1 */
    public void m179652f1() {
        act().startActivity(WebViewAct.m80164Z1(act(), "", tbk.m187870q(this.f159721a)));
    }

    /* JADX INFO: renamed from: g1 */
    public void m179653g1() {
        final cwf0 cwf0Var = new cwf0("p_group_chat_invite", Dialog.class.getName());
        i0e.m133797f(cwf0Var);
        CoreModule.m29935P().m94658i().mo158414n2(act(), "selectFriends", act().string(R$string.f21108w), String.format(act().string(R$string.f20772I), com.tencent.connect.common.Constants.VIA_REPORT_TYPE_SHARE_TO_QQ), 10, act().string(R$string.f20756G), String.format(act().string(R$string.f20772I), com.tencent.connect.common.Constants.VIA_REPORT_TYPE_SHARE_TO_QQ), null, this.f159724d.memberIds, "", new f30() { // from class: l.djk
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f86556a.m179646Y0((String) obj, (String) obj2);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ejk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0Var);
            }
        });
    }

    /* JADX INFO: renamed from: h1 */
    public void m179654h1() {
        o6j0.m162859c("e_invite_friends_to_group", pageId(), o6j0.C18854a.m162878h("groupchat_id", this.f159721a));
        if (!fmp0.m122175g(act()).isWXAppInstalled()) {
            lsi0.m151593w(R$string.f20739D6);
            return;
        }
        if (this.f159724d == null) {
            return;
        }
        Link link = new Link();
        link.intent = LinkIntent.get("invite");
        link.resources = vwb.m200324f0(new IdBoxed(CoreModule.m29931H().userId(), "user"));
        link.href = tbk.m187871r(this.f159724d.shareToken);
        new ShareHelper(link).m79985A0(act(), new ShareHelper.C13135c(act().string(com.p046p1.mobile.putong.common.R$string.f17418c2), rmp0.f160111b, LinkChannel.get("wechat-session"), new String[]{"com.tencent.mm"}), link.href, act().string(R$string.f20748F), act().getString(R$string.f20789K0, ((lkk) this.viewModel).m150358j0()), (!NullChecker.m81303a(this.f159724d) || vwb.m200296J(this.f159724d.avatars)) ? ShareHelper.m79954U(c3c0.f78782k) : this.f159724d.avatars.get(0).profileSmall().formatted());
    }

    /* JADX INFO: renamed from: i1 */
    public void m179655i1(List<Media> list) {
        o6j0.m162859c("e_alter_group_photo", pageId(), o6j0.C18854a.m162878h("groupchat_id", this.f159721a));
        if (!ConnectivityReceiver.m81284g()) {
            lsi0.m151578h(R$string.f20719B2);
        } else {
            act().progress("");
            duringCreated(ya5.m213793I(list, "chat-group").map(new w9j() { // from class: l.xik
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return rjk.m179627y0((List) obj);
                }
            }).compose(mkd0.m154951C()).flatMap(new w9j() { // from class: l.ijk
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f113554a.m179649c1((List) obj);
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.jjk
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f118299a.m179647a1((roj0) obj);
                }
            }, new e30() { // from class: l.kjk
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f123457a.m179648b1((Throwable) obj);
                }
            }));
        }
    }

    public String pageId() {
        return "p_group_chat_settings";
    }

    /* JADX INFO: renamed from: z0 */
    public String m179656z0() {
        return this.f159722b;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
