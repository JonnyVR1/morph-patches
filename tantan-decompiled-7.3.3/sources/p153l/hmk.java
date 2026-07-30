package p153l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupDescriptionEditAct;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupMembersAct;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupNameEditAct;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupNicknameSetAct;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupProfileAct;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupSettingManagerAct;
import com.p051p1.mobile.putong.data.IdBoxed;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.LinkChannel;
import com.p051p1.mobile.putong.data.LinkIntent;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class hmk extends ar2<bnk> {

    /* JADX INFO: renamed from: a */
    public String f110628a;

    /* JADX INFO: renamed from: b */
    public String f110629b;

    /* JADX INFO: renamed from: c */
    public Conversation f110630c;

    /* JADX INFO: renamed from: d */
    public ChatGroup f110631d;

    /* JADX INFO: renamed from: e */
    public int f110632e;

    public hmk(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m135872R0(Bundle bundle) {
        ((bnk) this.viewModel).m105491r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public /* synthetic */ void m135873S0(uxj0 uxj0Var) {
        ChatGroup chatGroupM32889h7 = CoreModule.f18264c.f20387g0.m32889h7(this.f110628a);
        if (NullChecker.m82486a(chatGroupM32889h7)) {
            int i = this.f110632e;
            int i2 = chatGroupM32889h7.memberCount;
            if (i != i2) {
                this.f110632e = i2;
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m135879j0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m135883n0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m135888s0(List list, Media media) {
        if (media instanceof Picture) {
            list.add((Picture) media);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m135890u0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ List m135892y0(List list) {
        final ArrayList arrayList = new ArrayList(1);
        jyb.m147537z(list, new y20() { // from class: l.plk
            @Override // p153l.y20
            public final void call(Object obj) {
                hmk.m135888s0(arrayList, (Media) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: A0 */
    public void m135893A0(String str) {
        sfj0.m185596c("e_alter_group_state", pageId(), sfj0.C20032a.m185615h("groupchat_id", this.f110628a));
        act().startActivity(GroupDescriptionEditAct.m50278a2(act(), this.f110628a, str, jek.m144587s(this.f110631d)));
    }

    /* JADX INFO: renamed from: C0 */
    public void m135894C0(String str) {
        sfj0.m185596c("e_alter_group_name", pageId(), sfj0.C20032a.m185615h("groupchat_id", this.f110628a));
        act().startActivity(GroupNameEditAct.m50284a2(act(), this.f110628a, str, jek.m144587s(this.f110631d)));
    }

    /* JADX INFO: renamed from: D0 */
    public void m135895D0(String str) {
        sfj0.m185596c("e_my_alias_in_group", pageId(), new sfj0.C20032a[0]);
        act().startActivity(GroupNicknameSetAct.m50287a2(act(), this.f110628a, str));
    }

    /* JADX INFO: renamed from: E0 */
    public void m135896E0() {
        act().progress("");
        duringCreated(CoreModule.f18264c.f20387g0.m32935w6(this.f110628a, this.f110629b)).subscribe(psd0.m173597H(new y20() { // from class: l.vlk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184607a.m135904O0((uxj0) obj);
            }
        }, new y20() { // from class: l.wlk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189703a.m135905P0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F0 */
    public void m135897F0() {
        sfj0.m185596c("e_group_chat_information_entrance", pageId(), new sfj0.C20032a[0]);
        act().startActivity(GroupProfileAct.m50290a2(act(), this.f110628a, this.f110631d, false));
    }

    /* JADX INFO: renamed from: G0 */
    public void m135898G0() {
        sfj0.m185596c("e_group_members", pageId(), sfj0.C20032a.m185615h("groupchat_id", this.f110628a));
        act().startActivity(GroupMembersAct.m50281a2(act(), this.f110629b, this.f110628a));
    }

    /* JADX INFO: renamed from: H0 */
    public String m135899H0() {
        return this.f110628a;
    }

    /* JADX INFO: renamed from: I0 */
    public void m135900I0() {
        sfj0.m185596c("e_group_chat_settings_manage", pageId(), sfj0.C20032a.m185615h("groupchat_id", this.f110628a));
        act().startActivity(GroupSettingManagerAct.m50319a2(act(), this.f110628a));
    }

    /* JADX INFO: renamed from: J0 */
    public final void m135901J0(final ChatGroup chatGroup, List<ChatGroupMember> list) {
        jek.m144590v(chatGroup, list, new jek.InterfaceC17934b() { // from class: l.qlk
            @Override // p153l.jek.InterfaceC17934b
            /* JADX INFO: renamed from: a */
            public final void mo104349a(ChatGroupMember chatGroupMember, List list2, List list3) {
                this.f158236a.m135906Q0(chatGroup, chatGroupMember, list2, list3);
            }
        });
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m135902L0() {
        ChatGroup chatGroup = this.f110631d;
        if (chatGroup == null) {
            return false;
        }
        return TextUtils.equals(chatGroup.ownerUserId, CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m135903N0() {
        return jek.m144587s(this.f110631d);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m135904O0(uxj0 uxj0Var) {
        act().progressDismiss();
        act().m68056e2();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m135905P0(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m135906Q0(ChatGroup chatGroup, ChatGroupMember chatGroupMember, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(chatGroupMember)) {
            arrayList.add(chatGroupMember);
        }
        arrayList.addAll(list);
        arrayList.addAll(list2);
        ((bnk) this.viewModel).m105480G0(arrayList, chatGroup);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m135907U0(ChatGroupMember chatGroupMember) {
        ((bnk) this.viewModel).m105482I0(chatGroupMember.groupMemberName());
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m135908V0(Conversation conversation) {
        this.f110630c = conversation;
        ((bnk) this.viewModel).m105481H0(conversation.muted);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m135909W0(Pair pair) {
        ChatGroup chatGroup = (ChatGroup) pair.second;
        this.f110631d = chatGroup;
        ((bnk) this.viewModel).m105479E0(chatGroup);
        m135901J0(this.f110631d, (List) pair.first);
        int i = this.f110632e;
        if (i > 0 && i != this.f110631d.memberCount) {
            CoreModule.f18264c.f20387g0.m32840Q8(this.f110628a);
        }
        this.f110632e = this.f110631d.memberCount;
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m135910X0(Throwable th) {
        if (NullChecker.m82486a(this.f110630c)) {
            ((bnk) this.viewModel).m105481H0(this.f110630c.muted);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m135911Y0(String str, String str2) {
        sfj0.m185596c("e_group_chat_invite_send", "p_group_chat_invite", sfj0.C20032a.m185615h("other_user_id_list", str2));
        C22421c<T> c22421cDuringCreated = duringCreated(CoreModule.f18264c.f20387g0.m32832O6(this.f110628a, new ArrayList(Arrays.asList(str2.split(Constants.SEPARATOR_COMMA)))));
        y20 y20Var = new y20() { // from class: l.xlk
            @Override // p153l.y20
            public final void call(Object obj) {
                hmk.m135879j0((uxj0) obj);
            }
        };
        CoreBusinessService coreBusinessServiceM143412i = CoreModule.f18273l.m143412i();
        Objects.requireNonNull(coreBusinessServiceM143412i);
        c22421cDuringCreated.subscribe(psd0.m173597H(y20Var, new oik(coreBusinessServiceM143412i)));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        Intent intent = act().getIntent();
        this.f110628a = intent.getStringExtra(FirebaseAnalytics.Param.GROUP_ID);
        this.f110629b = intent.getStringExtra("conversation_id");
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.bmk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77312a.m135872R0((Bundle) obj);
            }
        });
        CoreModule.f18264c.f20387g0.m32861X8(this.f110628a);
        duringCreated(CoreModule.f18264c.f20387g0.m32853V6()).subscribe(psd0.m173596G(new y20() { // from class: l.cmk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82621a.m135873S0((uxj0) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20387g0.m32847T6(this.f110628a, CoreModule.m30929H().userId())).filter(new hh7()).subscribe(psd0.m173596G(new y20() { // from class: l.dmk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89636a.m135907U0((ChatGroupMember) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20384f0.m33740Ne(this.f110629b)).filter(new sb8()).subscribe(psd0.m173596G(new y20() { // from class: l.emk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94661a.m135908V0((Conversation) obj);
            }
        }));
        duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20387g0.m32856W6(this.f110628a), CoreModule.f18264c.f20387g0.m32911o6(this.f110628a), new rcj() { // from class: l.fmk
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new Pair((List) obj, (ChatGroup) obj2);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.gmk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104988a.m135909W0((Pair) obj);
            }
        }, new y20() { // from class: l.olk
            @Override // p153l.y20
            public final void call(Object obj) {
                hmk.m135890u0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m135912a1(uxj0 uxj0Var) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m135913b1(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ C22421c m135914c1(List list) {
        return CoreModule.f18264c.f20387g0.m32822K8(this.f110628a, list);
    }

    /* JADX INFO: renamed from: d1 */
    public void m135915d1(boolean z) {
        sfj0.m185596c("e_group_chat_mute_notification_button", pageId(), sfj0.C20032a.m185615h("groupchat_id", this.f110628a), sfj0.C20032a.m185613f("is_open", z ? 1 : 0));
        if (NullChecker.m82486a(this.f110630c) && this.f110630c.muted == z) {
            return;
        }
        duringCreated(CoreModule.f18264c.f20387g0.m32811G8(this.f110629b, z)).subscribe(psd0.m173597H(new y20() { // from class: l.rlk
            @Override // p153l.y20
            public final void call(Object obj) {
                hmk.m135883n0((uxj0) obj);
            }
        }, new y20() { // from class: l.slk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169390a.m135910X0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e1 */
    public void m135916e1() {
        CoreModule.m30933P().m143412i().mo180400T2(act());
    }

    /* JADX INFO: renamed from: f1 */
    public void m135917f1() {
        act().startActivity(WebViewAct.m81347a2(act(), "", jek.m144585q(this.f110628a)));
    }

    /* JADX INFO: renamed from: g1 */
    public void m135918g1() {
        final l4g0 l4g0Var = new l4g0("p_group_chat_invite", Dialog.class.getName());
        w1e.m204402f(l4g0Var);
        CoreModule.m30933P().m143412i().mo180506n2(act(), "selectFriends", act().string(R$string.f21850w), String.format(act().string(R$string.f21514I), com.tencent.connect.common.Constants.VIA_REPORT_TYPE_SHARE_TO_QQ), 10, act().string(R$string.f21498G), String.format(act().string(R$string.f21514I), com.tencent.connect.common.Constants.VIA_REPORT_TYPE_SHARE_TO_QQ), null, this.f110631d.memberIds, "", new z20() { // from class: l.tlk
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f174834a.m135911Y0((String) obj, (String) obj2);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ulk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0Var);
            }
        });
    }

    /* JADX INFO: renamed from: h1 */
    public void m135919h1() {
        sfj0.m185596c("e_invite_friends_to_group", pageId(), sfj0.C20032a.m185615h("groupchat_id", this.f110628a));
        if (!jvp0.m147081g(act()).isWXAppInstalled()) {
            o1j0.m165649w(R$string.f21481D6);
            return;
        }
        if (this.f110631d == null) {
            return;
        }
        Link link = new Link();
        link.intent = LinkIntent.get("invite");
        link.resources = jyb.m147507f0(new IdBoxed(CoreModule.m30929H().userId(), "user"));
        link.href = jek.m144586r(this.f110631d.shareToken);
        new ShareHelper(link).m81168A0(act(), new ShareHelper.C13298c(act().string(com.p051p1.mobile.putong.common.R$string.f18137c2), vvp0.f185950b, LinkChannel.get("wechat-session"), new String[]{"com.tencent.mm"}), link.href, act().string(R$string.f21490F), act().getString(R$string.f21531K0, ((bnk) this.viewModel).m105485j0()), (!NullChecker.m82486a(this.f110631d) || jyb.m147479J(this.f110631d.avatars)) ? ShareHelper.m81137U(ibc0.f114057k) : this.f110631d.avatars.get(0).profileSmall().formatted());
    }

    /* JADX INFO: renamed from: i1 */
    public void m135920i1(List<Media> list) {
        sfj0.m185596c("e_alter_group_photo", pageId(), sfj0.C20032a.m185615h("groupchat_id", this.f110628a));
        if (!ConnectivityReceiver.m82467g()) {
            o1j0.m165634h(R$string.f21461B2);
        } else {
            act().progress("");
            duringCreated(yb5.m214980I(list, "chat-group").map(new qcj() { // from class: l.nlk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return hmk.m135892y0((List) obj);
                }
            }).compose(psd0.m173592C()).flatMap(new qcj() { // from class: l.ylk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f200556a.m135914c1((List) obj);
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.zlk
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f204945a.m135912a1((uxj0) obj);
                }
            }, new y20() { // from class: l.amk
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f72230a.m135913b1((Throwable) obj);
                }
            }));
        }
    }

    public String pageId() {
        return "p_group_chat_settings";
    }

    /* JADX INFO: renamed from: z0 */
    public String m135921z0() {
        return this.f110629b;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
