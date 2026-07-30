package p003l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupDescriptionEditAct;
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupMembersAct;
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupNameEditAct;
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupNicknameSetAct;
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupProfileAct;
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupSettingManagerAct;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.IdBoxed;
import com.p1.mobile.putong.data.Link;
import com.p1.mobile.putong.data.LinkChannel;
import com.p1.mobile.putong.data.LinkIntent;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.ui.share.ShareHelper;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import l.c3c0;
import l.cwf0;
import l.dg7;
import l.fmp0;
import l.i0e;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.oa8;
import l.rmp0;
import l.roj0;
import l.vwb;
import l.ya5;
import l.yfk;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class rjk extends jq2<lkk> {

    /* JADX INFO: renamed from: a */
    public String f6969a;

    /* JADX INFO: renamed from: b */
    public String f6970b;

    /* JADX INFO: renamed from: c */
    public Conversation f6971c;

    /* JADX INFO: renamed from: d */
    public ChatGroup f6972d;

    /* JADX INFO: renamed from: e */
    public int f6973e;

    public rjk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m7291R0(Bundle bundle) {
        ((lkk) ((jq2) this).viewModel).m6121r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public /* synthetic */ void m7292S0(roj0 roj0Var) {
        ChatGroup chatGroupH7 = CoreModule.c.g0.h7(this.f6969a);
        if (NullChecker.a(chatGroupH7)) {
            int i = this.f6973e;
            int i2 = chatGroupH7.memberCount;
            if (i != i2) {
                this.f6973e = i2;
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m7298j0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m7302n0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m7307s0(List list, Media media) {
        if (media instanceof Picture) {
            list.add((Picture) media);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m7309u0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ List m7311y0(List list) {
        final ArrayList arrayList = new ArrayList(1);
        vwb.z(list, new e30() { // from class: l.zik
            @Override // p003l.e30
            public final void call(Object obj) {
                rjk.m7307s0(arrayList, (Media) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: A0 */
    public void m7312A0(String str) {
        o6j0.c("e_alter_group_state", pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", this.f6969a)});
        act().startActivity(GroupDescriptionEditAct.m2194Z1(act(), this.f6969a, str, tbk.m7725s(this.f6972d)));
    }

    /* JADX INFO: renamed from: C0 */
    public void m7313C0(String str) {
        o6j0.c("e_alter_group_name", pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", this.f6969a)});
        act().startActivity(GroupNameEditAct.m2204Z1(act(), this.f6969a, str, tbk.m7725s(this.f6972d)));
    }

    /* JADX INFO: renamed from: D0 */
    public void m7314D0(String str) {
        o6j0.c("e_my_alias_in_group", pageId(), new o6j0.a[0]);
        act().startActivity(GroupNicknameSetAct.m2209Z1(act(), this.f6969a, str));
    }

    /* JADX INFO: renamed from: E0 */
    public void m7315E0() {
        act().progress("");
        duringCreated(CoreModule.c.g0.w6(this.f6969a, this.f6970b)).subscribe((m250) mkd0.H(new e30() { // from class: l.fjk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3652a.m7323O0((roj0) obj);
            }
        }, new e30() { // from class: l.gjk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3921a.m7324P0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F0 */
    public void m7316F0() {
        o6j0.c("e_group_chat_information_entrance", pageId(), new o6j0.a[0]);
        act().startActivity(GroupProfileAct.m2214Z1(act(), this.f6969a, this.f6972d, false));
    }

    /* JADX INFO: renamed from: G0 */
    public void m7317G0() {
        o6j0.c("e_group_members", pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", this.f6969a)});
        act().startActivity(GroupMembersAct.m2199Z1(act(), this.f6970b, this.f6969a));
    }

    /* JADX INFO: renamed from: H0 */
    public String m7318H0() {
        return this.f6969a;
    }

    /* JADX INFO: renamed from: I0 */
    public void m7319I0() {
        o6j0.c("e_group_chat_settings_manage", pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", this.f6969a)});
        act().startActivity(GroupSettingManagerAct.m2249Z1(act(), this.f6969a));
    }

    /* JADX INFO: renamed from: J0 */
    public final void m7320J0(final ChatGroup chatGroup, List<ChatGroupMember> list) {
        tbk.m7728v(chatGroup, list, new tbk.InterfaceC0547b() { // from class: l.ajk
            @Override // p003l.tbk.InterfaceC0547b
            /* JADX INFO: renamed from: a */
            public final void mo2885a(ChatGroupMember chatGroupMember, List list2, List list3) {
                this.f2228a.m7325Q0(chatGroup, chatGroupMember, list2, list3);
            }
        });
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m7321L0() {
        ChatGroup chatGroup = this.f6972d;
        if (chatGroup == null) {
            return false;
        }
        return TextUtils.equals(chatGroup.ownerUserId, CoreModule.H().userId());
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m7322N0() {
        return tbk.m7725s(this.f6972d);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m7323O0(roj0 roj0Var) {
        act().progressDismiss();
        act().finish();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m7324P0(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m7325Q0(ChatGroup chatGroup, ChatGroupMember chatGroupMember, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(chatGroupMember)) {
            arrayList.add(chatGroupMember);
        }
        arrayList.addAll(list);
        arrayList.addAll(list2);
        ((lkk) ((jq2) this).viewModel).m6109G0(arrayList, chatGroup);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m7326U0(ChatGroupMember chatGroupMember) {
        ((lkk) ((jq2) this).viewModel).m6111I0(chatGroupMember.groupMemberName());
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m7327V0(Conversation conversation) {
        this.f6971c = conversation;
        ((lkk) ((jq2) this).viewModel).m6110H0(conversation.muted);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m7328W0(Pair pair) {
        ChatGroup chatGroup = (ChatGroup) pair.second;
        this.f6972d = chatGroup;
        ((lkk) ((jq2) this).viewModel).m6108E0(chatGroup);
        m7320J0(this.f6972d, (List) pair.first);
        int i = this.f6973e;
        if (i > 0 && i != this.f6972d.memberCount) {
            CoreModule.c.g0.Q8(this.f6969a);
        }
        this.f6973e = this.f6972d.memberCount;
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m7329X0(Throwable th) {
        if (NullChecker.a(this.f6971c)) {
            ((lkk) ((jq2) this).viewModel).m6110H0(this.f6971c.muted);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m7330Y0(String str, String str2) {
        o6j0.c("e_group_chat_invite_send", "p_group_chat_invite", new o6j0.a[]{o6j0.a.h("other_user_id_list", str2)});
        C1099c c1099cDuringCreated = duringCreated(CoreModule.c.g0.O6(this.f6969a, new ArrayList(Arrays.asList(str2.split(",")))));
        e30 e30Var = new e30() { // from class: l.hjk
            @Override // p003l.e30
            public final void call(Object obj) {
                rjk.m7298j0((roj0) obj);
            }
        };
        CoreBusinessService coreBusinessServiceI = CoreModule.l.i();
        Objects.requireNonNull(coreBusinessServiceI);
        c1099cDuringCreated.subscribe((m250) mkd0.H(e30Var, new yfk(coreBusinessServiceI)));
    }

    /* JADX INFO: renamed from: Z */
    public void m7331Z() {
        super.Z();
        Intent intent = act().getIntent();
        this.f6969a = intent.getStringExtra("group_id");
        this.f6970b = intent.getStringExtra("conversation_id");
    }

    /* JADX INFO: renamed from: a0 */
    public void m7332a0() {
        super.a0();
        creates(new e30() { // from class: l.ljk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5320a.m7291R0((Bundle) obj);
            }
        });
        CoreModule.c.g0.X8(this.f6969a);
        duringCreated(CoreModule.c.g0.V6()).subscribe((m250) mkd0.G(new e30() { // from class: l.mjk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5675a.m7292S0((roj0) obj);
            }
        }));
        duringCreated(CoreModule.c.g0.T6(this.f6969a, CoreModule.H().userId())).filter(new dg7()).subscribe((m250) mkd0.G(new e30() { // from class: l.njk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5917a.m7326U0((ChatGroupMember) obj);
            }
        }));
        duringCreated(CoreModule.c.f0.Ne(this.f6970b)).filter(new oa8()).subscribe((m250) mkd0.G(new e30() { // from class: l.ojk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6168a.m7327V0((Conversation) obj);
            }
        }));
        duringCreated(C1099c.combineLatest(CoreModule.c.g0.W6(this.f6969a), CoreModule.c.g0.o6(this.f6969a), new x9j() { // from class: l.pjk
            @Override // p003l.x9j
            public final Object call(Object obj, Object obj2) {
                return new Pair((List) obj, (ChatGroup) obj2);
            }
        })).subscribe((m250) mkd0.H(new e30() { // from class: l.qjk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6647a.m7328W0((Pair) obj);
            }
        }, new e30() { // from class: l.yik
            @Override // p003l.e30
            public final void call(Object obj) {
                rjk.m7309u0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m7333a1(roj0 roj0Var) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m7334b1(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ C1099c m7335c1(List list) {
        return CoreModule.c.g0.K8(this.f6969a, list);
    }

    /* JADX INFO: renamed from: d1 */
    public void m7336d1(boolean z) {
        o6j0.c("e_group_chat_mute_notification_button", pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", this.f6969a), o6j0.a.f("is_open", z ? 1 : 0)});
        if (NullChecker.a(this.f6971c) && this.f6971c.muted == z) {
            return;
        }
        duringCreated(CoreModule.c.g0.G8(this.f6970b, z)).subscribe((m250) mkd0.H(new e30() { // from class: l.bjk
            @Override // p003l.e30
            public final void call(Object obj) {
                rjk.m7302n0((roj0) obj);
            }
        }, new e30() { // from class: l.cjk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2699a.m7329X0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e1 */
    public void m7337e1() {
        CoreModule.P().i().T2(act());
    }

    /* JADX INFO: renamed from: f1 */
    public void m7338f1() {
        act().startActivity(WebViewAct.Z1(act(), "", tbk.m7723q(this.f6969a)));
    }

    /* JADX INFO: renamed from: g1 */
    public void m7339g1() {
        final cwf0 cwf0Var = new cwf0("p_group_chat_invite", Dialog.class.getName());
        i0e.f(cwf0Var);
        CoreModule.P().i().n2(act(), "selectFriends", act().string(R.string.w), String.format(act().string(R.string.I), "10"), 10, act().string(R.string.G), String.format(act().string(R.string.I), "10"), (String) null, this.f6972d.memberIds, "", new f30() { // from class: l.djk
            @Override // p003l.f30
            public final void call(Object obj, Object obj2) {
                this.f3013a.m7330Y0((String) obj, (String) obj2);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ejk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0Var);
            }
        });
    }

    /* JADX INFO: renamed from: h1 */
    public void m7340h1() {
        o6j0.c("e_invite_friends_to_group", pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", this.f6969a)});
        if (!fmp0.g(act()).isWXAppInstalled()) {
            lsi0.w(R.string.D6);
            return;
        }
        if (this.f6972d == null) {
            return;
        }
        Link link = new Link();
        link.intent = LinkIntent.get("invite");
        link.resources = vwb.f0(new IdBoxed[]{new IdBoxed(CoreModule.H().userId(), "user")});
        link.href = tbk.m7724r(this.f6972d.shareToken);
        new ShareHelper(link).A0(act(), new ShareHelper.c(act().string(com.p1.mobile.putong.common.R.string.c2), rmp0.b, LinkChannel.get("wechat-session"), new String[]{"com.tencent.mm"}), link.href, act().string(R.string.F), act().getString(R.string.K0, ((lkk) ((jq2) this).viewModel).m6115j0()), (!NullChecker.a(this.f6972d) || vwb.J(this.f6972d.avatars)) ? ShareHelper.U(c3c0.k) : ((Picture) this.f6972d.avatars.get(0)).profileSmall().formatted());
    }

    /* JADX INFO: renamed from: i1 */
    public void m7341i1(List<Media> list) {
        o6j0.c("e_alter_group_photo", pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", this.f6969a)});
        if (!ConnectivityReceiver.g()) {
            lsi0.h(R.string.B2);
        } else {
            act().progress("");
            duringCreated(ya5.I(list, "chat-group").map(new w9j() { // from class: l.xik
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return rjk.m7311y0((List) obj);
                }
            }).compose(mkd0.C()).flatMap(new w9j() { // from class: l.ijk
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return this.f4416a.m7335c1((List) obj);
                }
            })).subscribe((m250) mkd0.H(new e30() { // from class: l.jjk
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f4680a.m7333a1((roj0) obj);
                }
            }, new e30() { // from class: l.kjk
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f4966a.m7334b1((Throwable) obj);
                }
            }));
        }
    }

    public String pageId() {
        return "p_group_chat_settings";
    }

    /* JADX INFO: renamed from: z0 */
    public String m7342z0() {
        return this.f6970b;
    }

    public void destroy() {
    }
}
