package com.p046p1.mobile.putong.core.newui.messages;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4729a0;
import com.p046p1.mobile.putong.core.api.C4759y;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.LocalPlaceBan;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.newui.messages.ConversationLongClick;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.report.ReportAct;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VListCell;
import p149l.af6;
import p149l.c40;
import p149l.cwf0;
import p149l.d30;
import p149l.e30;
import p149l.eqh0;
import p149l.fap;
import p149l.i0e;
import p149l.j760;
import p149l.lsi0;
import p149l.mkd0;
import p149l.ml6;
import p149l.o6j0;
import p149l.osi0;
import p149l.p36;
import p149l.pi6;
import p149l.qib0;
import p149l.r6n;
import p149l.rd6;
import p149l.roj0;
import p149l.rza;
import p149l.upa;
import p149l.v9j;
import p149l.vwb;
import p149l.x9j;
import p149l.xh0;
import p149l.xp5;
import p149l.yij0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationLongClick implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public final boolean f24982a;

    /* JADX INFO: renamed from: b */
    public final p36 f24983b;

    /* JADX INFO: renamed from: c */
    public c40 f24984c;

    /* JADX INFO: renamed from: d */
    public c40 f24985d;

    /* JADX INFO: renamed from: e */
    public c40 f24986e;

    /* JADX INFO: renamed from: f */
    public xh0 f24987f;

    /* JADX INFO: renamed from: g */
    public xh0 f24988g;

    /* JADX INFO: renamed from: h */
    public xh0 f24989h;

    /* JADX INFO: renamed from: i */
    public c40 f24990i;

    /* JADX INFO: renamed from: j */
    public final pi6 f24991j;

    public enum LongActionType {
        JUMP_PROFILE("跳转个人资料"),
        REPORT("举报"),
        UN_MATCH("解除配对"),
        SEE_UPGRADED_UN_MATCH("See插入配对解除配对"),
        CRUSH_HEARTBEAT("熄灭信号，同解除配对，不同的命名"),
        CLEAN_HISTORY("清空聊天记录"),
        SET_NICKNAME("设置昵称"),
        HEARTBEAT_TEST("心动信号测试"),
        HEARTBEAT_LIMIT_TEST("心动信号之限时配对测试"),
        REMOVE("删除"),
        NORMAL_REMOVE("删除"),
        TOP("置顶"),
        CANCEL_TOP("取消置顶"),
        DISMISS("不显示"),
        FILTER_REMOVE("移除");

        public String explain;

        LongActionType(String str) {
            this.explain = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationLongClick$a */
    public static class C8122a {

        /* JADX INFO: renamed from: a */
        public LongActionType f24992a;

        /* JADX INFO: renamed from: b */
        public CharSequence f24993b;

        public C8122a(LongActionType longActionType, CharSequence charSequence) {
            this.f24992a = longActionType;
            this.f24993b = charSequence;
        }

        /* JADX INFO: renamed from: a */
        public static C8122a m41204a(LongActionType longActionType, CharSequence charSequence) {
            return new C8122a(longActionType, charSequence);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f24992a == ((C8122a) obj).f24992a;
        }

        public int hashCode() {
            return Objects.hash(this.f24992a, this.f24993b);
        }
    }

    public ConversationLongClick(@NonNull pi6 pi6Var) {
        this.f24991j = pi6Var;
        this.f24983b = (p36) pi6Var.f149104d;
        this.f24982a = pi6Var.f149105e;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m41118H(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m41121K(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: M0 */
    public static void m41124M0(List<C8122a> list, LongActionType longActionType) {
        if (vwb.m200296J(list)) {
            return;
        }
        Iterator<C8122a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().f24992a == longActionType) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m41131T(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m41132U(Act act, Conversation conversation, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        if (c22545a.f209159a.toString().equals(act.getString(R$string.f18622j))) {
            fap.m120254g(conversation);
        }
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m41134W(Throwable th) {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m41135a(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m41137c(Throwable th) {
    }

    /* JADX INFO: renamed from: f0 */
    public static List<CharSequence> m41141f0(List<C8122a> list) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(list)) {
            Iterator<C8122a> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f24993b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m41144i(final String str, final Act act, String str2) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        if (!CoreModule.m29934N().isMatchedByRelationship(userM169430Pa) && CoreModule.m29934N().isMatchedByFollowship(userM169430Pa)) {
            CoreModule.m29934N().following(CoreModule.m29931H().userId(), userM169430Pa, false, null, null).subscribe(mkd0.m154956H(new e30() { // from class: l.zg6
                @Override // p149l.e30
                public final void call(Object obj) {
                    act.progressDismiss();
                }
            }, new e30() { // from class: l.ah6
                @Override // p149l.e30
                public final void call(Object obj) {
                    ConversationLongClick.m41157v(act, (Throwable) obj);
                }
            }));
            return;
        }
        new Relationship().state = RelationshipStatus.get("blocked");
        act.progress(R$string.f17842J5, true);
        CoreModule.f17545c.f19642f0.m33090qe(str, act).subscribe(mkd0.m154956H(new e30() { // from class: l.bh6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationLongClick.m41155t(act, str, (roj0) obj);
            }
        }, new e30() { // from class: l.ch6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationLongClick.m41150o(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ roj0 m41146k(roj0 roj0Var, roj0 roj0Var2) {
        return roj0Var;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m41149n(Throwable th) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m41150o(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m41152q(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.code == 40399) {
                osi0.m165783g(tantanForbidden.message);
                return;
            }
        }
        osi0.m165783g("设置失败，请稍后再试");
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m41155t(Act act, String str, roj0 roj0Var) {
        act.progressDismiss();
        List<String> listMo106876d = CoreModule.m29934N().coreMomentMutedUsers().mo106876d();
        if (listMo106876d == null) {
            listMo106876d = new ArrayList<>();
        }
        CoreModule.m29934N().coreMomentMutedUsers().mo106877e(vwb.m200318c0(listMo106876d, str));
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m41156u(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m41157v(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m41162A0(j760 j760Var) {
        if (!m41186i0()) {
            m41172K0();
            m41171J0();
        }
        if (upa.m194637G0()) {
            lsi0.m151595y("已取消置顶");
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m41163B0(View view) {
        this.f24984c.m105113b();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m41164C0(String str, Act act, Conversation conversation, String str2, String str3, String str4, String str5, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        String string = c22545a.f209159a.toString();
        if (TextUtils.equals(string, str)) {
            zvf0.m220396r("e_delete_option", OMSDialogPositon.p_messages_view);
            m41178Z(act, conversation.f56011id);
        } else if (TextUtils.equals(string, str2)) {
            zvf0.m220396r("e_top", OMSDialogPositon.p_messages_view);
            m41175O0(act, conversation);
        } else if (TextUtils.equals(string, str3)) {
            m41181c0(act, conversation);
        } else if (TextUtils.equals(string, str4)) {
            zvf0.m220396r("e_hide", OMSDialogPositon.p_messages_view);
            m41177Y(act, conversation.f56011id);
        } else if (TextUtils.equals(string, str5)) {
            m41174N0();
        }
        this.f24984c.m105113b();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m41165D0(View view) {
        this.f24984c.m105113b();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m41166E0(User user, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        m41185h0(user);
        this.f24984c.m105113b();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m41167F0(View view) {
        this.f24984c.m105113b();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m41168G0(View view) {
        this.f24990i.m105113b();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m41169H0(ArrayList arrayList, final Act act, User user, Conversation conversation, boolean z, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        if (i >= arrayList.size() || i < 0) {
            return;
        }
        LongActionType longActionType = ((C8122a) arrayList.get(i)).f24992a;
        if (longActionType == LongActionType.SET_NICKNAME) {
            zvf0.m220396r("e_match_list_set_nickname", OMSDialogPositon.p_messages_view);
            if (CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
                act.startActivity(SetNicknameAct.m41806Y1(act, user.f56011id));
            } else {
                C8764c.m53403J1(act, "p_messages_view,e_match_list_set_nickname,click", Privilege.vip_membership_remark_gp);
            }
        } else if (longActionType == LongActionType.UN_MATCH || longActionType == LongActionType.SEE_UPGRADED_UN_MATCH || longActionType == LongActionType.CRUSH_HEARTBEAT) {
            m41180b0(act, conversation.otherUser, longActionType);
        } else if (longActionType == LongActionType.CLEAN_HISTORY) {
            m41176X(act, conversation.otherUser);
        } else if (longActionType == LongActionType.REMOVE) {
            if (z) {
                zvf0.m220396r("e_platinum_receive_top_chat_delete", OMSDialogPositon.p_messages_view);
            } else {
                zvf0.m220396r("e_delete_option", OMSDialogPositon.p_messages_view);
            }
            if (upa.m194792o()) {
                m41178Z(act, conversation.otherUser);
            } else {
                m41179a0(act, user.f56011id);
            }
        } else if (longActionType == LongActionType.NORMAL_REMOVE) {
            if (z) {
                zvf0.m220396r("e_platinum_receive_top_chat_delete", OMSDialogPositon.p_messages_view);
            } else {
                zvf0.m220396r("e_delete_option", OMSDialogPositon.p_messages_view);
            }
            m41178Z(act, conversation.otherUser);
        } else if (longActionType == LongActionType.JUMP_PROFILE) {
            if (!xp5.m210462b(act, conversation, OMSDialogPositon.p_messages_view, "conversation")) {
                act.startActivity(ProfileAct.m50736n2(act, conversation.otherUser, "conversation_view", false));
            }
        } else if (longActionType == LongActionType.HEARTBEAT_TEST) {
            af6.m96210w(conversation);
        } else if (longActionType == LongActionType.HEARTBEAT_LIMIT_TEST) {
            af6.m96211x(conversation);
        } else if (longActionType == LongActionType.REPORT) {
            act.startActivity(ReportAct.m54628a2(act, conversation.otherUser, true, new ResultReceiver(null) { // from class: com.p1.mobile.putong.core.newui.messages.ConversationLongClick.1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i2, Bundle bundle) {
                    if (upa.m194819t1() && i2 == -1) {
                        act.m66873d2();
                    }
                }
            }));
        } else if (longActionType == LongActionType.DISMISS) {
            if (z) {
                zvf0.m220396r("e_platinum_receive_top_chat_hide", OMSDialogPositon.p_messages_view);
            } else {
                zvf0.m220396r("e_hide", OMSDialogPositon.p_messages_view);
            }
            m41177Y(act, conversation.otherUser);
        } else if (longActionType == LongActionType.CANCEL_TOP) {
            if (z) {
                zvf0.m220396r("e_platinum_receive_top_chat_cancel", OMSDialogPositon.p_messages_view);
            }
            m41181c0(act, conversation);
        } else if (longActionType == LongActionType.TOP) {
            zvf0.m220396r("e_top", OMSDialogPositon.p_messages_view);
            m41175O0(act, conversation);
        } else if (longActionType == LongActionType.FILTER_REMOVE) {
            m41174N0();
        }
        this.f24990i.m105113b();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m41170I0(j760 j760Var) {
        if (!m41186i0()) {
            m41172K0();
            m41171J0();
        }
        if (upa.m194637G0()) {
            lsi0.m151595y("已置顶");
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m41171J0() {
        ConversationsList.f25081u1.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m41172K0() {
        ConversationsList.m41331B2(true);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m41173L0() {
        CoreModule.f17545c.f19642f0.f19916Z.m132487l("");
    }

    /* JADX INFO: renamed from: N0 */
    public final void m41174N0() {
        pi6 pi6Var = this.f24991j;
        Conversation conversation = pi6Var.f149101a;
        Act act = pi6Var.f149124x;
        if (act == null || conversation == null) {
            return;
        }
        act.duringCreated(CoreModule.f17545c.f19642f0.m33189xo(conversation.f56011id).first()).subscribe(mkd0.m154956H(new e30() { // from class: l.gg6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationLongClick.m41121K((roj0) obj);
            }
        }, new e30() { // from class: l.hg6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationLongClick.m41137c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O0 */
    public final void m41175O0(Act act, Conversation conversation) {
        act.duringCreated(CoreModule.f17545c.f19642f0.m33165vo(conversation.f56011id, 1)).subscribe(mkd0.m154956H(new e30() { // from class: l.sh6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164516a.m41170I0((j760) obj);
            }
        }, new e30() { // from class: l.th6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationLongClick.m41149n((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public final void m41176X(final Act act, final String str) {
        if (act == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(act.getString(R$string.f17976Nj));
        c40.C16057b c16057b = new c40.C16057b(act);
        c16057b.m105156I(act.getResources().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.jg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117726a.m41188k0(view);
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.kg6
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f123007a.m41190m0(act, str, vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        this.f24986e = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: Y */
    public final void m41177Y(final Act act, final String str) {
        if (act == null) {
            return;
        }
        zvf0.m220402x("e_hide_alert", OMSDialogPositon.p_messages_view);
        xh0 xh0VarM208722a = new xh0.C21150a(act).m208740s(act.getString(R$string.f17784H7)).m208728g(false).m208731j(act.getString(R$string.f17814I7)).m208727f(act.getResources().getString(R$string.f18827pi)).m208739r(act.getResources().getString(R$string.f18305Yi)).m208724c(new View.OnClickListener() { // from class: l.ag6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69290a.m41192o0(act, str, view);
            }
        }).m208736o(new View.OnClickListener() { // from class: l.bg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75408a.m41193p0(view);
            }
        }).m208722a();
        this.f24989h = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    /* JADX INFO: renamed from: Z */
    public final void m41178Z(final Act act, final String str) {
        if (act == null) {
            return;
        }
        zvf0.m220402x("e_delete_confirmation", OMSDialogPositon.p_messages_view);
        xh0 xh0VarM208722a = new xh0.C21150a(act).m208740s(act.getResources().getString(R$string.f17960N3)).m208741t(true).m208728g(false).m208731j(act.getResources().getString(R$string.f18335Zi)).m208727f(act.getResources().getString(R$string.f18827pi)).m208739r(act.getResources().getString(R$string.f18305Yi)).m208724c(new View.OnClickListener() { // from class: l.pg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148620a.m41195r0(act, str, view);
            }
        }).m208736o(new View.OnClickListener() { // from class: l.qg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154310a.m41196s0(view);
            }
        }).m208722a();
        this.f24988g = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m41179a0(final Act act, final String str) {
        if (act == null) {
            return;
        }
        zvf0.m220402x("e_delete_confirmation", OMSDialogPositon.p_messages_view);
        xh0 xh0VarM208722a = new xh0.C21150a(act).m208740s(act.getResources().getString(R$string.f17960N3)).m208741t(true).m208728g(false).m208731j(act.getResources().getString(R$string.f18335Zi)).m208727f(act.getResources().getString(R$string.f18827pi)).m208739r(act.getResources().getString(R$string.f18305Yi)).m208724c(new View.OnClickListener() { // from class: l.qh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154428a.m41197t0(act, str, view);
            }
        }).m208736o(new View.OnClickListener() { // from class: l.rh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159343a.m41198u0(view);
            }
        }).m208722a();
        this.f24987f = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m41180b0(final Act act, final String str, final LongActionType longActionType) {
        if (act == null) {
            return;
        }
        final Conversation conversation = this.f24991j.f149101a;
        final e30 e30Var = new e30() { // from class: l.lg6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationLongClick.m41144i(str, act, (String) obj);
            }
        };
        act.duringCreated(mkd0.m154984r(CoreModule.f17545c.f19642f0.m32727Mg(str), CoreModule.f17545c.f19642f0.m32691Jg(str), new x9j() { // from class: l.ng6
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return vwb.m200311Y((Boolean) obj, (Boolean) obj2);
            }
        }).first()).subscribe(new e30() { // from class: l.mg6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133647a.m41202y0(act, longActionType, e30Var, conversation, str, (j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final void m41181c0(Act act, Conversation conversation) {
        if (CoreModule.m29935P().m94656g().mo35048b8() && conversation.isPlatinumTop()) {
            act.duringCreated(CoreModule.f17545c.f19641e2.m112214w3(conversation.f56011id, false)).subscribe(mkd0.m154956H(new e30() { // from class: l.cg6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f80723a.m41203z0((Boolean) obj);
                }
            }, new e30() { // from class: l.dg6
                @Override // p149l.e30
                public final void call(Object obj) {
                    ConversationLongClick.m41152q((Throwable) obj);
                }
            }));
        } else {
            act.duringCreated(CoreModule.f17545c.f19642f0.m33165vo(conversation.f56011id, -1)).subscribe(mkd0.m154956H(new e30() { // from class: l.eg6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f90901a.m41162A0((j760) obj);
                }
            }, new e30() { // from class: l.fg6
                @Override // p149l.e30
                public final void call(Object obj) {
                    ConversationLongClick.m41134W((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m41182d0() {
        if (NullChecker.m81303a(this.f24984c) && this.f24984c.m105115d()) {
            this.f24984c.m105113b();
        }
        if (NullChecker.m81303a(this.f24986e) && this.f24986e.m105115d()) {
            this.f24986e.m105113b();
        }
        if (NullChecker.m81303a(this.f24985d) && this.f24985d.m105115d()) {
            this.f24985d.m105113b();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final String m41183e0() {
        int i = this.f24991j.f149107g;
        StringBuilder sb = new StringBuilder();
        int iMo41519h = this.f24983b.mo41519h() - this.f24983b.mo41520k().size();
        if (iMo41519h > 0) {
            sb.append((i + 1) - iMo41519h);
        } else {
            sb.append(i + 1);
        }
        sb.append("/");
        boolean zIsEmpty = this.f24983b.mo41520k().isEmpty();
        p36 p36Var = this.f24983b;
        if (zIsEmpty) {
            sb.append(p36Var.mo41519h());
        } else {
            sb.append(p36Var.mo41520k().size());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m41184g0() {
        if (!TextUtils.isEmpty(this.f24991j.f149125y)) {
            return false;
        }
        pi6 pi6Var = this.f24991j;
        final Conversation conversation = pi6Var.f149101a;
        final Act act = pi6Var.f149124x;
        ArrayList arrayList = new ArrayList();
        final String string = act.getString(R$string.f18558gq);
        final String string2 = act.getString(R$string.f18589hq);
        final String string3 = act.getString(R$string.f17754G7);
        final String string4 = act.getString(R$string.f19055x6);
        final String str = LongActionType.FILTER_REMOVE.explain;
        if (conversation.isTop()) {
            arrayList.add(string2);
        } else {
            arrayList.add(string);
            zvf0.m220402x("e_top", OMSDialogPositon.p_messages_view);
        }
        arrayList.add(string3);
        arrayList.add(string4);
        if (TEnum.equals(conversation.status, "removed") || TEnum.equals(conversation.status, ConversationStatus.invisible)) {
            arrayList.clear();
            arrayList.add(str);
        }
        zvf0.m220402x("e_delete_option", OMSDialogPositon.p_messages_view);
        zvf0.m220402x("e_hide", OMSDialogPositon.p_messages_view);
        c40.C16057b c16057b = new c40.C16057b(act);
        c16057b.m105156I(act.getResources().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.yf6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197987a.m41163B0(view);
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.zf6
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f202912a.m41164C0(string4, act, conversation, string, string2, string3, str, vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        this.f24984c = c40VarM105153F;
        c40VarM105153F.m105117f();
        return !vwb.m200296J(arrayList);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m41185h0(final User user) {
        HashSet<String> hashSet = r6n.m178067f().f157960h.get();
        hashSet.add(user.f56011id);
        r6n.m178067f().f157960h.put(hashSet);
        r6n.m178067f().m178083r(user.f56011id, true);
        CoreModule.f17545c.scheduled("special_user_relationship", -1, new v9j() { // from class: l.og6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4759y.m34907o3(user.f56011id).compose(mkd0.m154951C());
            }
        });
        C4729a0.m31387j().m31405w(user.f56011id);
        this.f24991j.f149124x.duringCreated(CoreModule.f17545c.f19663m0.m31128n6());
        zvf0.m220399u("e_chat_request_operate", OMSDialogPositon.p_messages_view, vwb.m200311Y("show_where", this.f24982a ? LocalPlaceBan.matchList : LocalPlaceBan.chatList), vwb.m200311Y("request_show_type", this.f24991j.f149109i), vwb.m200311Y("show_position", m41183e0()), vwb.m200311Y("chat_request_operate", "ignore"));
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m41186i0() {
        p36 p36Var = this.f24983b;
        return (p36Var instanceof ConversationsList.C8130e) && ((ConversationsList.C8130e) p36Var).m41506E();
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m41187j0() {
        boolean zIsEmpty;
        pi6 pi6Var = this.f24991j;
        final Conversation conversation = pi6Var.f149101a;
        final Act act = pi6Var.f149124x;
        if (rd6.m178878o(conversation) || conversation.lowPayOneSideConv() || TextUtils.equals(conversation.f56011id, "fake_conversation_city_centre_enter") || !(zIsEmpty = TextUtils.isEmpty(this.f24991j.f149125y)) || "lovescript".equals(conversation.convType) || TextUtils.equals(conversation.f56011id, "fake_conversation_anonymous_greeting") || xp5.m210473m(conversation)) {
            return true;
        }
        if (upa.m194706V1() && ml6.m155116a(conversation)) {
            return m41184g0();
        }
        if (TextUtils.equals(conversation.convType, "conversation_intl_fake")) {
            return true;
        }
        final User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(conversation.otherUser);
        if (!NullChecker.m81303a(userM169430Pa)) {
            return false;
        }
        if (NullChecker.m81303a(this.f24991j.f149101a) && TextUtils.equals(this.f24991j.f149101a.convType, ConversationType.intlSeeChatRequest)) {
            ArrayList arrayListM200324f0 = vwb.m200324f0(act.string(R$string.f17838J1));
            c40.C16057b c16057b = new c40.C16057b(act);
            c16057b.m105156I(act.getResources().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.xf6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f192662a.m41165D0(view);
                }
            }).m105164Q(arrayListM200324f0).m105169V(new c40.InterfaceC16059d() { // from class: l.ig6
                @Override // p149l.c40.InterfaceC16059d
                /* JADX INFO: renamed from: a */
                public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                    this.f113071a.m41166E0(userM169430Pa, vListCell, c22545a, i);
                }
            });
            c40 c40VarM105153F = c16057b.m105153F();
            this.f24984c = c40VarM105153F;
            c40VarM105153F.m105117f();
            return true;
        }
        if (fap.m120266y() && fap.m120262p(conversation.f56011id)) {
            ArrayList arrayListM200324f1 = vwb.m200324f0(act.getString(R$string.f18622j));
            c40.C16057b c16057b2 = new c40.C16057b(act);
            c16057b2.m105156I(act.getResources().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.tg6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f170058a.m41167F0(view);
                }
            }).m105164Q(arrayListM200324f1).m105169V(new c40.InterfaceC16059d() { // from class: l.eh6
                @Override // p149l.c40.InterfaceC16059d
                /* JADX INFO: renamed from: a */
                public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                    ConversationLongClick.m41132U(act, conversation, vListCell, c22545a, i);
                }
            });
            c40 c40VarM105153F2 = c16057b2.m105153F();
            this.f24984c = c40VarM105153F2;
            c40VarM105153F2.m105117f();
            return true;
        }
        String string = act.getString(R$string.f18066Qj);
        CharSequence charSequenceM181739S0 = rza.m181739S0(act, act.string(R$string.f18680kq));
        act.string(R$string.f18622j);
        String string2 = act.getString(R$string.f19022w3);
        String strString = act.string(R$string.f18870r1);
        String strString2 = act.string(R$string.f17976Nj);
        act.getString(R$string.f18558gq);
        act.getString(R$string.f18589hq);
        act.getString(R$string.f17754G7);
        LongActionType longActionType = LongActionType.SET_NICKNAME;
        C8122a c8122aM41204a = C8122a.m41204a(longActionType, charSequenceM181739S0);
        LongActionType longActionType2 = LongActionType.UN_MATCH;
        C8122a c8122aM41204a2 = C8122a.m41204a(longActionType2, string);
        LongActionType longActionType3 = LongActionType.CLEAN_HISTORY;
        final ArrayList arrayListM200324f2 = vwb.m200324f0(c8122aM41204a, c8122aM41204a2, C8122a.m41204a(longActionType3, strString2));
        zvf0.m220402x("e_match_list_set_nickname", OMSDialogPositon.p_messages_view);
        if (CoreModule.f17545c.f19639e0.m169430Pa(conversation.otherUser).isTeamAccount()) {
            String str = userM169430Pa.f56011id;
            m41124M0(arrayListM200324f2, longActionType2);
            m41124M0(arrayListM200324f2, longActionType);
        } else {
            arrayListM200324f2.add(0, C8122a.m41204a(LongActionType.JUMP_PROFILE, string2));
            if (!userM169430Pa.isBannedNew()) {
                arrayListM200324f2.add(C8122a.m41204a(LongActionType.REPORT, strString));
            }
        }
        if (TextUtils.equals(conversation.convType, "marriage")) {
            m41124M0(arrayListM200324f2, LongActionType.TOP);
            m41124M0(arrayListM200324f2, LongActionType.CANCEL_TOP);
        }
        if (CoreModule.f17545c.f19639e0.m169430Pa(conversation.otherUser).onlineMatchLocked()) {
            m41124M0(arrayListM200324f2, longActionType3);
            m41124M0(arrayListM200324f2, LongActionType.DISMISS);
            m41124M0(arrayListM200324f2, LongActionType.NORMAL_REMOVE);
            m41124M0(arrayListM200324f2, LongActionType.TOP);
            m41124M0(arrayListM200324f2, LongActionType.CANCEL_TOP);
        }
        if (NullChecker.m81303a(conversation) && conversation.isSeeUpgradedConv()) {
            m41124M0(arrayListM200324f2, LongActionType.NORMAL_REMOVE);
            m41124M0(arrayListM200324f2, LongActionType.TOP);
            m41124M0(arrayListM200324f2, LongActionType.CANCEL_TOP);
        }
        if (xp5.m210475o(conversation, userM169430Pa)) {
            m41124M0(arrayListM200324f2, longActionType3);
        }
        if (conversation.lowPayOneSideConv()) {
            m41124M0(arrayListM200324f2, LongActionType.JUMP_PROFILE);
        }
        final boolean z = CoreModule.m29935P().m94656g().mo35048b8() && conversation.isPlatinumTop();
        if (z) {
            m41124M0(arrayListM200324f2, LongActionType.TOP);
            arrayListM200324f2.add(0, C8122a.m41204a(LongActionType.CANCEL_TOP, "取消置顶"));
        }
        if (!zIsEmpty) {
            m41124M0(arrayListM200324f2, LongActionType.DISMISS);
            m41124M0(arrayListM200324f2, LongActionType.NORMAL_REMOVE);
            m41124M0(arrayListM200324f2, LongActionType.TOP);
            m41124M0(arrayListM200324f2, LongActionType.CANCEL_TOP);
        }
        if (TEnum.equals(conversation.status, "removed") || TEnum.equals(conversation.status, ConversationStatus.invisible)) {
            arrayListM200324f2.clear();
            LongActionType longActionType4 = LongActionType.FILTER_REMOVE;
            arrayListM200324f2.add(C8122a.m41204a(longActionType4, longActionType4.explain));
        }
        if (arrayListM200324f2.contains(C8122a.m41204a(LongActionType.REMOVE, "")) || arrayListM200324f2.contains(C8122a.m41204a(LongActionType.NORMAL_REMOVE, ""))) {
            if (z) {
                zvf0.m220402x("e_platinum_receive_top_chat_delete", OMSDialogPositon.p_messages_view);
            } else {
                zvf0.m220402x("e_delete_option", OMSDialogPositon.p_messages_view);
            }
        }
        if (arrayListM200324f2.contains(C8122a.m41204a(LongActionType.TOP, ""))) {
            zvf0.m220402x("e_top", OMSDialogPositon.p_messages_view);
        }
        if (arrayListM200324f2.contains(C8122a.m41204a(LongActionType.CANCEL_TOP, "")) && z) {
            zvf0.m220402x("e_platinum_receive_top_chat_cancel", OMSDialogPositon.p_messages_view);
        }
        if (arrayListM200324f2.contains(C8122a.m41204a(LongActionType.DISMISS, ""))) {
            if (z) {
                zvf0.m220402x("e_platinum_receive_top_chat_hide", OMSDialogPositon.p_messages_view);
            } else {
                zvf0.m220402x("e_hide", OMSDialogPositon.p_messages_view);
            }
        }
        c40 c40VarM105153F3 = new c40.C16057b(act).m105156I(act.getResources().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.oh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143953a.m41168G0(view);
            }
        }).m105164Q(m41141f0(arrayListM200324f2)).m105163P(eqh0.m117752c(3)).m105169V(new c40.InterfaceC16059d() { // from class: l.ph6
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f148870a.m41169H0(arrayListM200324f2, act, userM169430Pa, conversation, z, vListCell, c22545a, i);
            }
        }).m105153F();
        this.f24990i = c40VarM105153F3;
        c40VarM105153F3.m105117f();
        return true;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m41188k0(View view) {
        this.f24986e.m105113b();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m41189l0(roj0 roj0Var) {
        m41171J0();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m41190m0(final Act act, String str, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        act.progress(R$string.f17842J5, true);
        CoreModule.f17545c.f19642f0.m33188xn(str).subscribe(mkd0.m154957I(new e30() { // from class: l.rg6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159226a.m41189l0((roj0) obj);
            }
        }, new e30() { // from class: l.sg6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationLongClick.m41118H(act, (Throwable) obj);
            }
        }, new d30() { // from class: l.ug6
            @Override // p149l.d30
            public final void call() {
                act.progressDismiss();
            }
        }));
        this.f24986e.m105113b();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m41191n0(boolean z, j760 j760Var) {
        m41171J0();
        m41172K0();
        m41173L0();
        if (z) {
            CoreModule.f17545c.f19642f0.m32938dq(qib0.f154693H.guessedCurrentServerTime());
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m41192o0(final Act act, String str, View view) {
        act.progress(R$string.f17842J5, true);
        zvf0.m220399u("e_hide_alert", OMSDialogPositon.p_messages_view, vwb.m200311Y("click_area_msg", "1"));
        final boolean zM194792o = upa.m194792o();
        act.duringCreated(CoreModule.f17545c.f19642f0.m33152uo(str, zM194792o)).subscribe(mkd0.m154957I(new e30() { // from class: l.lh6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128041a.m41191n0(zM194792o, (j760) obj);
            }
        }, new e30() { // from class: l.mh6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationLongClick.m41156u(act, (Throwable) obj);
            }
        }, new d30() { // from class: l.nh6
            @Override // p149l.d30
            public final void call() {
                act.progressDismiss();
            }
        }));
        this.f24989h.m208717c();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return m41187j0();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m41193p0(View view) {
        this.f24989h.m208717c();
        zvf0.m220399u("e_hide_alert", OMSDialogPositon.p_messages_view, vwb.m200311Y("click_area_msg", "0"));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m41194q0(boolean z, roj0 roj0Var) {
        m41171J0();
        m41172K0();
        m41173L0();
        if (z) {
            CoreModule.f17545c.f19642f0.m32938dq(qib0.f154693H.guessedCurrentServerTime());
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m41195r0(final Act act, String str, View view) {
        act.progress(R$string.f17842J5, true);
        zvf0.m220399u("e_delete_confirmation", OMSDialogPositon.p_messages_view, vwb.m200311Y("click_area_msg", "1"));
        final boolean zM194792o = upa.m194792o();
        act.duringCreated(CoreModule.f17545c.f19642f0.m33177wo(str, zM194792o)).subscribe(mkd0.m154957I(new e30() { // from class: l.ih6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113209a.m41194q0(zM194792o, (roj0) obj);
            }
        }, new e30() { // from class: l.jh6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationLongClick.m41135a(act, (Throwable) obj);
            }
        }, new d30() { // from class: l.kh6
            @Override // p149l.d30
            public final void call() {
                act.progressDismiss();
            }
        }));
        this.f24988g.m208717c();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m41196s0(View view) {
        this.f24988g.m208717c();
        zvf0.m220399u("e_delete_confirmation", OMSDialogPositon.p_messages_view, vwb.m200311Y("click_area_msg", "0"));
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m41197t0(final Act act, String str, View view) {
        act.progress(R$string.f17842J5, true);
        zvf0.m220399u("e_delete_confirmation", OMSDialogPositon.p_messages_view, vwb.m200311Y("click_area_msg", "1"));
        mkd0.m154984r(CoreModule.f17545c.f19642f0.m33188xn(str), CoreModule.f17545c.f19642f0.m32809Tf(str), new x9j() { // from class: l.dh6
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return ConversationLongClick.m41146k((roj0) obj, (roj0) obj2);
            }
        }).subscribe(mkd0.m154957I(new e30() { // from class: l.fh6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97485a.m41199v0((roj0) obj);
            }
        }, new e30() { // from class: l.gh6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationLongClick.m41131T(act, (Throwable) obj);
            }
        }, new d30() { // from class: l.hh6
            @Override // p149l.d30
            public final void call() {
                act.progressDismiss();
            }
        }));
        this.f24987f.m208717c();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m41198u0(View view) {
        this.f24987f.m208717c();
        zvf0.m220399u("e_delete_confirmation", OMSDialogPositon.p_messages_view, vwb.m200311Y("click_area_msg", "0"));
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m41199v0(roj0 roj0Var) {
        m41171J0();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m41200w0(View view) {
        this.f24985d.m105113b();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m41201x0(e30 e30Var, Conversation conversation, String str, Act act, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        String string = c22545a.f209159a.toString();
        e30Var.call(string.toString());
        String str2 = "";
        if (NullChecker.m81304b(conversation)) {
            o6j0.m162859c("e_cancelmatch", OMSDialogPositon.p_messages_view, o6j0.C18854a.m162878h("receiver_user_id", conversation.otherUser), o6j0.C18854a.m162878h("source_type", this.f24982a ? "message_allmatch" : "message_chat"), o6j0.C18854a.m162878h("cancel_item", string.toString()), o6j0.C18854a.m162878h("matchfrom", NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169430Pa(str)) ? CoreModule.f17545c.f19639e0.m169430Pa(str).matchFromForTrack() : ""));
        }
        String string2 = string.toString();
        if (act.string(R$string.f19015vq).equals(string2)) {
            str2 = "dont_talk";
        } else if (act.string(R$string.f19135zq).equals(string2)) {
            str2 = "spam";
        } else if (act.string(R$string.f19105yq).equals(string2)) {
            str2 = "harassment";
        } else if (act.string(R$string.f19075xq).equals(string2)) {
            str2 = "fake_profile";
        } else if (act.string(R$string.f19045wq).equals(string2)) {
            str2 = "dont_want_to_tell_you";
        } else if (act.string(R$string.f17593Aq).equals(string2)) {
            str2 = "swiped_wrong";
        }
        o6j0.m162859c("e_chat_unmatch", "p_unmatch_dialog", o6j0.C18854a.m162878h("unmatch_reason", str2));
        this.f24985d.m105113b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m41202y0(final Act act, LongActionType longActionType, final e30 e30Var, final Conversation conversation, final String str, j760 j760Var) {
        ArrayList arrayList = new ArrayList();
        if (((Boolean) j760Var.f116564a).booleanValue()) {
            arrayList.add(act.string(R$string.f19135zq));
            arrayList.add(act.string(R$string.f19105yq));
        } else {
            arrayList.add(act.string(R$string.f19015vq));
        }
        if (!((Boolean) j760Var.f116565b).booleanValue()) {
            arrayList.add(act.string(R$string.f17593Aq));
        }
        arrayList.add(act.string(R$string.f19075xq));
        arrayList.add(act.string(R$string.f19045wq));
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_unmatch_dialog", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("unmatch_dialog_show_from", this.f24982a ? "match_list" : "chat_list");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        cwf0VarM133794c.m109039o(jSONObject);
        c40.C16057b c16057b = new c40.C16057b(act);
        if (longActionType == LongActionType.SEE_UPGRADED_UN_MATCH) {
            c16057b.m105161N("确定要结束即刻聊天？").m105159L("请告诉我们结束聊天的原因，我们将为您推荐更合适的人");
        } else {
            c16057b.m105160M(R$string.f17623Bq).m105158K(R$string.f18985uq);
        }
        c16057b.m105155H(R$string.f18408c).m105168U(new View.OnClickListener() { // from class: l.vg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181348a.m41200w0(view);
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.wg6
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f186143a.m41201x0(e30Var, conversation, str, act, vListCell, c22545a, i);
            }
        }).m105167T(new DialogInterface.OnDismissListener() { // from class: l.xg6
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m105170W(new DialogInterface.OnShowListener() { // from class: l.yg6
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m133797f(cwf0VarM133794c);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        this.f24985d = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m41203z0(Boolean bool) {
        if (!m41186i0()) {
            m41172K0();
            m41171J0();
        }
        if (upa.m194637G0()) {
            lsi0.m151595y("已取消置顶");
        }
    }
}
