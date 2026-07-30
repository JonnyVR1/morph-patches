package com.p051p1.mobile.putong.core.newui.messages;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4880a0;
import com.p051p1.mobile.putong.core.api.C4910y;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.LocalPlaceBan;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.newui.messages.ConversationLongClick;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.report.ReportAct;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VListCell;
import p153l.br5;
import p153l.bsj0;
import p153l.dg6;
import p153l.e1b;
import p153l.fcp;
import p153l.gra;
import p153l.i4g0;
import p153l.jyb;
import p153l.l4g0;
import p153l.lyh0;
import p153l.o1j0;
import p153l.pcj;
import p153l.pf60;
import p153l.pm6;
import p153l.psd0;
import p153l.r1j0;
import p153l.r8n;
import p153l.rcj;
import p153l.sfj0;
import p153l.sj6;
import p153l.th0;
import p153l.u46;
import p153l.ue6;
import p153l.uqb0;
import p153l.uxj0;
import p153l.w1e;
import p153l.w30;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationLongClick implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public final boolean f25724a;

    /* JADX INFO: renamed from: b */
    public final u46 f25725b;

    /* JADX INFO: renamed from: c */
    public w30 f25726c;

    /* JADX INFO: renamed from: d */
    public w30 f25727d;

    /* JADX INFO: renamed from: e */
    public w30 f25728e;

    /* JADX INFO: renamed from: f */
    public th0 f25729f;

    /* JADX INFO: renamed from: g */
    public th0 f25730g;

    /* JADX INFO: renamed from: h */
    public th0 f25731h;

    /* JADX INFO: renamed from: i */
    public w30 f25732i;

    /* JADX INFO: renamed from: j */
    public final sj6 f25733j;

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
    public static class C8273a {

        /* JADX INFO: renamed from: a */
        public LongActionType f25734a;

        /* JADX INFO: renamed from: b */
        public CharSequence f25735b;

        public C8273a(LongActionType longActionType, CharSequence charSequence) {
            this.f25734a = longActionType;
            this.f25735b = charSequence;
        }

        /* JADX INFO: renamed from: a */
        public static C8273a m42215a(LongActionType longActionType, CharSequence charSequence) {
            return new C8273a(longActionType, charSequence);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f25734a == ((C8273a) obj).f25734a;
        }

        public int hashCode() {
            return Objects.hash(this.f25734a, this.f25735b);
        }
    }

    public ConversationLongClick(@NonNull sj6 sj6Var) {
        this.f25733j = sj6Var;
        this.f25725b = (u46) sj6Var.f168929d;
        this.f25724a = sj6Var.f168930e;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m42129H(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m42132K(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: M0 */
    public static void m42135M0(List<C8273a> list, LongActionType longActionType) {
        if (jyb.m147479J(list)) {
            return;
        }
        Iterator<C8273a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().f25734a == longActionType) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m42142T(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m42143U(Act act, Conversation conversation, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        if (c22660a.f210081a.toString().equals(act.getString(R$string.f19352j))) {
            fcp.m125021g(conversation);
        }
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m42145W(Throwable th) {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m42146a(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m42148c(Throwable th) {
    }

    /* JADX INFO: renamed from: f0 */
    public static List<CharSequence> m42152f0(List<C8273a> list) {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(list)) {
            Iterator<C8273a> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f25735b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m42155i(final String str, final Act act, String str2) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
        if (!CoreModule.m30932N().isMatchedByRelationship(userM116503Pa) && CoreModule.m30932N().isMatchedByFollowship(userM116503Pa)) {
            CoreModule.m30932N().following(CoreModule.m30929H().userId(), userM116503Pa, false, null, null).subscribe(psd0.m173597H(new y20() { // from class: l.ci6
                @Override // p153l.y20
                public final void call(Object obj) {
                    act.progressDismiss();
                }
            }, new y20() { // from class: l.di6
                @Override // p153l.y20
                public final void call(Object obj) {
                    ConversationLongClick.m42168v(act, (Throwable) obj);
                }
            }));
            return;
        }
        new Relationship().state = RelationshipStatus.get("blocked");
        act.progress(R$string.f18632L5, true);
        CoreModule.f18264c.f20384f0.m34093qe(str, act).subscribe(psd0.m173597H(new y20() { // from class: l.ei6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationLongClick.m42166t(act, str, (uxj0) obj);
            }
        }, new y20() { // from class: l.fi6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationLongClick.m42161o(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ uxj0 m42157k(uxj0 uxj0Var, uxj0 uxj0Var2) {
        return uxj0Var;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m42160n(Throwable th) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m42161o(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m42163q(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.code == 40399) {
                r1j0.m179420g(tantanForbidden.message);
                return;
            }
        }
        r1j0.m179420g("设置失败，请稍后再试");
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m42166t(Act act, String str, uxj0 uxj0Var) {
        act.progressDismiss();
        List<String> listMo173497d = CoreModule.m30932N().coreMomentMutedUsers().mo173497d();
        if (listMo173497d == null) {
            listMo173497d = new ArrayList<>();
        }
        CoreModule.m30932N().coreMomentMutedUsers().mo173498e(jyb.m147501c0(listMo173497d, str));
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m42167u(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m42168v(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m42173A0(pf60 pf60Var) {
        if (!m42197i0()) {
            m42183K0();
            m42182J0();
        }
        if (gra.m131568G0()) {
            o1j0.m165651y("已取消置顶");
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m42174B0(View view) {
        this.f25726c.m204614b();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m42175C0(String str, Act act, Conversation conversation, String str2, String str3, String str4, String str5, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        String string = c22660a.f210081a.toString();
        if (TextUtils.equals(string, str)) {
            i4g0.m138520r("e_delete_option", OMSDialogPositon.p_messages_view);
            m42189Z(act, conversation.f56859id);
        } else if (TextUtils.equals(string, str2)) {
            i4g0.m138520r("e_top", OMSDialogPositon.p_messages_view);
            m42186O0(act, conversation);
        } else if (TextUtils.equals(string, str3)) {
            m42192c0(act, conversation);
        } else if (TextUtils.equals(string, str4)) {
            i4g0.m138520r("e_hide", OMSDialogPositon.p_messages_view);
            m42188Y(act, conversation.f56859id);
        } else if (TextUtils.equals(string, str5)) {
            m42185N0();
        }
        this.f25726c.m204614b();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m42176D0(View view) {
        this.f25726c.m204614b();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m42177E0(User user, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        m42196h0(user);
        this.f25726c.m204614b();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m42178F0(View view) {
        this.f25726c.m204614b();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m42179G0(View view) {
        this.f25732i.m204614b();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m42180H0(ArrayList arrayList, final Act act, User user, Conversation conversation, boolean z, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        if (i >= arrayList.size() || i < 0) {
            return;
        }
        LongActionType longActionType = ((C8273a) arrayList.get(i)).f25734a;
        if (longActionType == LongActionType.SET_NICKNAME) {
            i4g0.m138520r("e_match_list_set_nickname", OMSDialogPositon.p_messages_view);
            if (CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
                act.startActivity(SetNicknameAct.m42817Z1(act, user.f56859id));
            } else {
                C8927c.m54586J1(act, "p_messages_view,e_match_list_set_nickname,click", Privilege.vip_membership_remark_gp);
            }
        } else if (longActionType == LongActionType.UN_MATCH || longActionType == LongActionType.SEE_UPGRADED_UN_MATCH || longActionType == LongActionType.CRUSH_HEARTBEAT) {
            m42191b0(act, conversation.otherUser, longActionType);
        } else if (longActionType == LongActionType.CLEAN_HISTORY) {
            m42187X(act, conversation.otherUser);
        } else if (longActionType == LongActionType.REMOVE) {
            if (z) {
                i4g0.m138520r("e_platinum_receive_top_chat_delete", OMSDialogPositon.p_messages_view);
            } else {
                i4g0.m138520r("e_delete_option", OMSDialogPositon.p_messages_view);
            }
            if (gra.m131723o()) {
                m42189Z(act, conversation.otherUser);
            } else {
                m42190a0(act, user.f56859id);
            }
        } else if (longActionType == LongActionType.NORMAL_REMOVE) {
            if (z) {
                i4g0.m138520r("e_platinum_receive_top_chat_delete", OMSDialogPositon.p_messages_view);
            } else {
                i4g0.m138520r("e_delete_option", OMSDialogPositon.p_messages_view);
            }
            m42189Z(act, conversation.otherUser);
        } else if (longActionType == LongActionType.JUMP_PROFILE) {
            if (!br5.m106031b(act, conversation, OMSDialogPositon.p_messages_view, "conversation")) {
                act.startActivity(ProfileAct.m51920o2(act, conversation.otherUser, "conversation_view", false));
            }
        } else if (longActionType == LongActionType.HEARTBEAT_TEST) {
            dg6.m115628w(conversation);
        } else if (longActionType == LongActionType.HEARTBEAT_LIMIT_TEST) {
            dg6.m115629x(conversation);
        } else if (longActionType == LongActionType.REPORT) {
            act.startActivity(ReportAct.m55811b2(act, conversation.otherUser, true, new ResultReceiver(null) { // from class: com.p1.mobile.putong.core.newui.messages.ConversationLongClick.1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i2, Bundle bundle) {
                    if (gra.m131750t1() && i2 == -1) {
                        act.m68056e2();
                    }
                }
            }));
        } else if (longActionType == LongActionType.DISMISS) {
            if (z) {
                i4g0.m138520r("e_platinum_receive_top_chat_hide", OMSDialogPositon.p_messages_view);
            } else {
                i4g0.m138520r("e_hide", OMSDialogPositon.p_messages_view);
            }
            m42188Y(act, conversation.otherUser);
        } else if (longActionType == LongActionType.CANCEL_TOP) {
            if (z) {
                i4g0.m138520r("e_platinum_receive_top_chat_cancel", OMSDialogPositon.p_messages_view);
            }
            m42192c0(act, conversation);
        } else if (longActionType == LongActionType.TOP) {
            i4g0.m138520r("e_top", OMSDialogPositon.p_messages_view);
            m42186O0(act, conversation);
        } else if (longActionType == LongActionType.FILTER_REMOVE) {
            m42185N0();
        }
        this.f25732i.m204614b();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m42181I0(pf60 pf60Var) {
        if (!m42197i0()) {
            m42183K0();
            m42182J0();
        }
        if (gra.m131568G0()) {
            o1j0.m165651y("已置顶");
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m42182J0() {
        ConversationsList.f25823u1.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m42183K0() {
        ConversationsList.m42342B2(true);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m42184L0() {
        CoreModule.f18264c.f20384f0.f20658Z.m137019l("");
    }

    /* JADX INFO: renamed from: N0 */
    public final void m42185N0() {
        sj6 sj6Var = this.f25733j;
        Conversation conversation = sj6Var.f168926a;
        Act act = sj6Var.f168949x;
        if (act == null || conversation == null) {
            return;
        }
        act.duringCreated(CoreModule.f18264c.f20384f0.m34192xo(conversation.f56859id).first()).subscribe(psd0.m173597H(new y20() { // from class: l.jh6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationLongClick.m42132K((uxj0) obj);
            }
        }, new y20() { // from class: l.kh6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationLongClick.m42148c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O0 */
    public final void m42186O0(Act act, Conversation conversation) {
        act.duringCreated(CoreModule.f18264c.f20384f0.m34168vo(conversation.f56859id, 1)).subscribe(psd0.m173597H(new y20() { // from class: l.vi6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184216a.m42181I0((pf60) obj);
            }
        }, new y20() { // from class: l.wi6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationLongClick.m42160n((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public final void m42187X(final Act act, final String str) {
        if (act == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(act.getString(R$string.f19373jk));
        w30.C21001b c21001b = new w30.C21001b(act);
        c21001b.m204657I(act.getResources().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.mh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136828a.m42199k0(view);
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.nh6
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f141929a.m42201m0(act, str, vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        this.f25728e = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: Y */
    public final void m42188Y(final Act act, final String str) {
        if (act == null) {
            return;
        }
        i4g0.m138526x("e_hide_alert", OMSDialogPositon.p_messages_view);
        th0 th0VarM191142a = new th0.C20312a(act).m191160s(act.getString(R$string.f18572J7)).m191148g(false).m191151j(act.getString(R$string.f18603K7)).m191147f(act.getResources().getString(R$string.f18614Ki)).m191159r(act.getResources().getString(R$string.f19713uj)).m191144c(new View.OnClickListener() { // from class: l.dh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88419a.m42203o0(act, str, view);
            }
        }).m191156o(new View.OnClickListener() { // from class: l.eh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94003a.m42204p0(view);
            }
        }).m191142a();
        this.f25731h = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    /* JADX INFO: renamed from: Z */
    public final void m42189Z(final Act act, final String str) {
        if (act == null) {
            return;
        }
        i4g0.m138526x("e_delete_confirmation", OMSDialogPositon.p_messages_view);
        th0 th0VarM191142a = new th0.C20312a(act).m191160s(act.getResources().getString(R$string.f18750P3)).m191161t(true).m191148g(false).m191151j(act.getResources().getString(R$string.f19744vj)).m191147f(act.getResources().getString(R$string.f18614Ki)).m191159r(act.getResources().getString(R$string.f19713uj)).m191144c(new View.OnClickListener() { // from class: l.sh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f168596a.m42206r0(act, str, view);
            }
        }).m191156o(new View.OnClickListener() { // from class: l.th6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174280a.m42207s0(view);
            }
        }).m191142a();
        this.f25730g = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m42190a0(final Act act, final String str) {
        if (act == null) {
            return;
        }
        i4g0.m138526x("e_delete_confirmation", OMSDialogPositon.p_messages_view);
        th0 th0VarM191142a = new th0.C20312a(act).m191160s(act.getResources().getString(R$string.f18750P3)).m191161t(true).m191148g(false).m191151j(act.getResources().getString(R$string.f19744vj)).m191147f(act.getResources().getString(R$string.f18614Ki)).m191159r(act.getResources().getString(R$string.f19713uj)).m191144c(new View.OnClickListener() { // from class: l.ti6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174444a.m42208t0(act, str, view);
            }
        }).m191156o(new View.OnClickListener() { // from class: l.ui6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179079a.m42209u0(view);
            }
        }).m191142a();
        this.f25729f = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m42191b0(final Act act, final String str, final LongActionType longActionType) {
        if (act == null) {
            return;
        }
        final Conversation conversation = this.f25733j.f168926a;
        final y20 y20Var = new y20() { // from class: l.oh6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationLongClick.m42155i(str, act, (String) obj);
            }
        };
        act.duringCreated(psd0.m173625r(CoreModule.f18264c.f20384f0.m33730Mg(str), CoreModule.f18264c.f20384f0.m33694Jg(str), new rcj() { // from class: l.qh6
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return jyb.m147494Y((Boolean) obj, (Boolean) obj2);
            }
        }).first()).subscribe(new y20() { // from class: l.ph6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152400a.m42213y0(act, longActionType, y20Var, conversation, str, (pf60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final void m42192c0(Act act, Conversation conversation) {
        if (CoreModule.m30933P().m143410g().mo36051b8() && conversation.isPlatinumTop()) {
            act.duringCreated(CoreModule.f18264c.f20383e2.m172823w3(conversation.f56859id, false)).subscribe(psd0.m173597H(new y20() { // from class: l.fh6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f99014a.m42214z0((Boolean) obj);
                }
            }, new y20() { // from class: l.gh6
                @Override // p153l.y20
                public final void call(Object obj) {
                    ConversationLongClick.m42163q((Throwable) obj);
                }
            }));
        } else {
            act.duringCreated(CoreModule.f18264c.f20384f0.m34168vo(conversation.f56859id, -1)).subscribe(psd0.m173597H(new y20() { // from class: l.hh6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f109483a.m42173A0((pf60) obj);
                }
            }, new y20() { // from class: l.ih6
                @Override // p153l.y20
                public final void call(Object obj) {
                    ConversationLongClick.m42145W((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m42193d0() {
        if (NullChecker.m82486a(this.f25726c) && this.f25726c.m204616d()) {
            this.f25726c.m204614b();
        }
        if (NullChecker.m82486a(this.f25728e) && this.f25728e.m204616d()) {
            this.f25728e.m204614b();
        }
        if (NullChecker.m82486a(this.f25727d) && this.f25727d.m204616d()) {
            this.f25727d.m204614b();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final String m42194e0() {
        int i = this.f25733j.f168932g;
        StringBuilder sb = new StringBuilder();
        int iMo42530h = this.f25725b.mo42530h() - this.f25725b.mo42531k().size();
        if (iMo42530h > 0) {
            sb.append((i + 1) - iMo42530h);
        } else {
            sb.append(i + 1);
        }
        sb.append("/");
        boolean zIsEmpty = this.f25725b.mo42531k().isEmpty();
        u46 u46Var = this.f25725b;
        if (zIsEmpty) {
            sb.append(u46Var.mo42530h());
        } else {
            sb.append(u46Var.mo42531k().size());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m42195g0() {
        if (!TextUtils.isEmpty(this.f25733j.f168950y)) {
            return false;
        }
        sj6 sj6Var = this.f25733j;
        final Conversation conversation = sj6Var.f168926a;
        final Act act = sj6Var.f168949x;
        ArrayList arrayList = new ArrayList();
        final String string = act.getString(R$string.f18343Bq);
        final String string2 = act.getString(R$string.f18374Cq);
        final String string3 = act.getString(R$string.f18541I7);
        final String string4 = act.getString(R$string.f19855z6);
        final String str = LongActionType.FILTER_REMOVE.explain;
        if (conversation.isTop()) {
            arrayList.add(string2);
        } else {
            arrayList.add(string);
            i4g0.m138526x("e_top", OMSDialogPositon.p_messages_view);
        }
        arrayList.add(string3);
        arrayList.add(string4);
        if (TEnum.equals(conversation.status, "removed") || TEnum.equals(conversation.status, ConversationStatus.invisible)) {
            arrayList.clear();
            arrayList.add(str);
        }
        i4g0.m138526x("e_delete_option", OMSDialogPositon.p_messages_view);
        i4g0.m138526x("e_hide", OMSDialogPositon.p_messages_view);
        w30.C21001b c21001b = new w30.C21001b(act);
        c21001b.m204657I(act.getResources().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.bh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76733a.m42174B0(view);
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.ch6
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f81759a.m42175C0(string4, act, conversation, string, string2, string3, str, vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        this.f25726c = w30VarM204654F;
        w30VarM204654F.m204618f();
        return !jyb.m147479J(arrayList);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m42196h0(final User user) {
        HashSet<String> hashSet = r8n.m180219f().f161734h.get();
        hashSet.add(user.f56859id);
        r8n.m180219f().f161734h.put(hashSet);
        r8n.m180219f().m180235r(user.f56859id, true);
        CoreModule.f18264c.scheduled("special_user_relationship", -1, new pcj() { // from class: l.rh6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4910y.m35910o3(user.f56859id).compose(psd0.m173592C());
            }
        });
        C4880a0.m32390j().m32408w(user.f56859id);
        this.f25733j.f168949x.duringCreated(CoreModule.f18264c.f20405m0.m32131n6());
        i4g0.m138523u("e_chat_request_operate", OMSDialogPositon.p_messages_view, jyb.m147494Y("show_where", this.f25724a ? LocalPlaceBan.matchList : LocalPlaceBan.chatList), jyb.m147494Y("request_show_type", this.f25733j.f168934i), jyb.m147494Y("show_position", m42194e0()), jyb.m147494Y("chat_request_operate", "ignore"));
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m42197i0() {
        u46 u46Var = this.f25725b;
        return (u46Var instanceof ConversationsList.C8281e) && ((ConversationsList.C8281e) u46Var).m42517E();
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m42198j0() {
        boolean zIsEmpty;
        sj6 sj6Var = this.f25733j;
        final Conversation conversation = sj6Var.f168926a;
        final Act act = sj6Var.f168949x;
        if (ue6.m195672o(conversation) || conversation.lowPayOneSideConv() || TextUtils.equals(conversation.f56859id, "fake_conversation_city_centre_enter") || !(zIsEmpty = TextUtils.isEmpty(this.f25733j.f168950y)) || "lovescript".equals(conversation.convType) || TextUtils.equals(conversation.f56859id, "fake_conversation_anonymous_greeting") || br5.m106042m(conversation)) {
            return true;
        }
        if (gra.m131637V1() && pm6.m172913a(conversation)) {
            return m42195g0();
        }
        if (TextUtils.equals(conversation.convType, "conversation_intl_fake")) {
            return true;
        }
        final User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(conversation.otherUser);
        if (!NullChecker.m82486a(userM116503Pa)) {
            return false;
        }
        if (NullChecker.m82486a(this.f25733j.f168926a) && TextUtils.equals(this.f25733j.f168926a.convType, ConversationType.intlSeeChatRequest)) {
            ArrayList arrayListM147507f0 = jyb.m147507f0(act.string(R$string.f18566J1));
            w30.C21001b c21001b = new w30.C21001b(act);
            c21001b.m204657I(act.getResources().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.ah6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f71324a.m42176D0(view);
                }
            }).m204665Q(arrayListM147507f0).m204670V(new w30.InterfaceC21003d() { // from class: l.lh6
                @Override // p153l.w30.InterfaceC21003d
                /* JADX INFO: renamed from: a */
                public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                    this.f132072a.m42177E0(userM116503Pa, vListCell, c22660a, i);
                }
            });
            w30 w30VarM204654F = c21001b.m204654F();
            this.f25726c = w30VarM204654F;
            w30VarM204654F.m204618f();
            return true;
        }
        if (fcp.m125033y() && fcp.m125029p(conversation.f56859id)) {
            ArrayList arrayListM147507f1 = jyb.m147507f0(act.getString(R$string.f19352j));
            w30.C21001b c21001b2 = new w30.C21001b(act);
            c21001b2.m204657I(act.getResources().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.wh6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f189086a.m42178F0(view);
                }
            }).m204665Q(arrayListM147507f1).m204670V(new w30.InterfaceC21003d() { // from class: l.hi6
                @Override // p153l.w30.InterfaceC21003d
                /* JADX INFO: renamed from: a */
                public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                    ConversationLongClick.m42143U(act, conversation, vListCell, c22660a, i);
                }
            });
            w30 w30VarM204654F2 = c21001b2.m204654F();
            this.f25726c = w30VarM204654F2;
            w30VarM204654F2.m204618f();
            return true;
        }
        String string = act.getString(R$string.f19466mk);
        CharSequence charSequenceM118961S0 = e1b.m118961S0(act, act.string(R$string.f18467Fq));
        act.string(R$string.f19352j);
        String string2 = act.getString(R$string.f19821y3);
        String strString = act.string(R$string.f19602r1);
        String strString2 = act.string(R$string.f19373jk);
        act.getString(R$string.f18343Bq);
        act.getString(R$string.f18374Cq);
        act.getString(R$string.f18541I7);
        LongActionType longActionType = LongActionType.SET_NICKNAME;
        C8273a c8273aM42215a = C8273a.m42215a(longActionType, charSequenceM118961S0);
        LongActionType longActionType2 = LongActionType.UN_MATCH;
        C8273a c8273aM42215a2 = C8273a.m42215a(longActionType2, string);
        LongActionType longActionType3 = LongActionType.CLEAN_HISTORY;
        final ArrayList arrayListM147507f2 = jyb.m147507f0(c8273aM42215a, c8273aM42215a2, C8273a.m42215a(longActionType3, strString2));
        i4g0.m138526x("e_match_list_set_nickname", OMSDialogPositon.p_messages_view);
        if (CoreModule.f18264c.f20381e0.m116503Pa(conversation.otherUser).isTeamAccount()) {
            String str = userM116503Pa.f56859id;
            m42135M0(arrayListM147507f2, longActionType2);
            m42135M0(arrayListM147507f2, longActionType);
        } else {
            arrayListM147507f2.add(0, C8273a.m42215a(LongActionType.JUMP_PROFILE, string2));
            if (!userM116503Pa.isBannedNew()) {
                arrayListM147507f2.add(C8273a.m42215a(LongActionType.REPORT, strString));
            }
        }
        if (TextUtils.equals(conversation.convType, "marriage")) {
            m42135M0(arrayListM147507f2, LongActionType.TOP);
            m42135M0(arrayListM147507f2, LongActionType.CANCEL_TOP);
        }
        if (CoreModule.f18264c.f20381e0.m116503Pa(conversation.otherUser).onlineMatchLocked()) {
            m42135M0(arrayListM147507f2, longActionType3);
            m42135M0(arrayListM147507f2, LongActionType.DISMISS);
            m42135M0(arrayListM147507f2, LongActionType.NORMAL_REMOVE);
            m42135M0(arrayListM147507f2, LongActionType.TOP);
            m42135M0(arrayListM147507f2, LongActionType.CANCEL_TOP);
        }
        if (NullChecker.m82486a(conversation) && conversation.isSeeUpgradedConv()) {
            m42135M0(arrayListM147507f2, LongActionType.NORMAL_REMOVE);
            m42135M0(arrayListM147507f2, LongActionType.TOP);
            m42135M0(arrayListM147507f2, LongActionType.CANCEL_TOP);
        }
        if (br5.m106044o(conversation, userM116503Pa)) {
            m42135M0(arrayListM147507f2, longActionType3);
        }
        if (conversation.lowPayOneSideConv()) {
            m42135M0(arrayListM147507f2, LongActionType.JUMP_PROFILE);
        }
        final boolean z = CoreModule.m30933P().m143410g().mo36051b8() && conversation.isPlatinumTop();
        if (z) {
            m42135M0(arrayListM147507f2, LongActionType.TOP);
            arrayListM147507f2.add(0, C8273a.m42215a(LongActionType.CANCEL_TOP, "取消置顶"));
        }
        if (!zIsEmpty) {
            m42135M0(arrayListM147507f2, LongActionType.DISMISS);
            m42135M0(arrayListM147507f2, LongActionType.NORMAL_REMOVE);
            m42135M0(arrayListM147507f2, LongActionType.TOP);
            m42135M0(arrayListM147507f2, LongActionType.CANCEL_TOP);
        }
        if (TEnum.equals(conversation.status, "removed") || TEnum.equals(conversation.status, ConversationStatus.invisible)) {
            arrayListM147507f2.clear();
            LongActionType longActionType4 = LongActionType.FILTER_REMOVE;
            arrayListM147507f2.add(C8273a.m42215a(longActionType4, longActionType4.explain));
        }
        if (arrayListM147507f2.contains(C8273a.m42215a(LongActionType.REMOVE, "")) || arrayListM147507f2.contains(C8273a.m42215a(LongActionType.NORMAL_REMOVE, ""))) {
            if (z) {
                i4g0.m138526x("e_platinum_receive_top_chat_delete", OMSDialogPositon.p_messages_view);
            } else {
                i4g0.m138526x("e_delete_option", OMSDialogPositon.p_messages_view);
            }
        }
        if (arrayListM147507f2.contains(C8273a.m42215a(LongActionType.TOP, ""))) {
            i4g0.m138526x("e_top", OMSDialogPositon.p_messages_view);
        }
        if (arrayListM147507f2.contains(C8273a.m42215a(LongActionType.CANCEL_TOP, "")) && z) {
            i4g0.m138526x("e_platinum_receive_top_chat_cancel", OMSDialogPositon.p_messages_view);
        }
        if (arrayListM147507f2.contains(C8273a.m42215a(LongActionType.DISMISS, ""))) {
            if (z) {
                i4g0.m138526x("e_platinum_receive_top_chat_hide", OMSDialogPositon.p_messages_view);
            } else {
                i4g0.m138526x("e_hide", OMSDialogPositon.p_messages_view);
            }
        }
        w30 w30VarM204654F3 = new w30.C21001b(act).m204657I(act.getResources().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.ri6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163339a.m42179G0(view);
            }
        }).m204665Q(m42152f0(arrayListM147507f2)).m204664P(lyh0.m156283c(3)).m204670V(new w30.InterfaceC21003d() { // from class: l.si6
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f168797a.m42180H0(arrayListM147507f2, act, userM116503Pa, conversation, z, vListCell, c22660a, i);
            }
        }).m204654F();
        this.f25732i = w30VarM204654F3;
        w30VarM204654F3.m204618f();
        return true;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m42199k0(View view) {
        this.f25728e.m204614b();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m42200l0(uxj0 uxj0Var) {
        m42182J0();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m42201m0(final Act act, String str, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        act.progress(R$string.f18632L5, true);
        CoreModule.f18264c.f20384f0.m34191xn(str).subscribe(psd0.m173598I(new y20() { // from class: l.uh6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178995a.m42200l0((uxj0) obj);
            }
        }, new y20() { // from class: l.vh6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationLongClick.m42129H(act, (Throwable) obj);
            }
        }, new x20() { // from class: l.xh6
            @Override // p153l.x20
            public final void call() {
                act.progressDismiss();
            }
        }));
        this.f25728e.m204614b();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m42202n0(boolean z, pf60 pf60Var) {
        m42182J0();
        m42183K0();
        m42184L0();
        if (z) {
            CoreModule.f18264c.f20384f0.m33941dq(uqb0.f180376H.guessedCurrentServerTime());
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m42203o0(final Act act, String str, View view) {
        act.progress(R$string.f18632L5, true);
        i4g0.m138523u("e_hide_alert", OMSDialogPositon.p_messages_view, jyb.m147494Y("click_area_msg", "1"));
        final boolean zM131723o = gra.m131723o();
        act.duringCreated(CoreModule.f18264c.f20384f0.m34155uo(str, zM131723o)).subscribe(psd0.m173598I(new y20() { // from class: l.oi6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147512a.m42202n0(zM131723o, (pf60) obj);
            }
        }, new y20() { // from class: l.pi6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationLongClick.m42167u(act, (Throwable) obj);
            }
        }, new x20() { // from class: l.qi6
            @Override // p153l.x20
            public final void call() {
                act.progressDismiss();
            }
        }));
        this.f25731h.m191137c();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return m42198j0();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m42204p0(View view) {
        this.f25731h.m191137c();
        i4g0.m138523u("e_hide_alert", OMSDialogPositon.p_messages_view, jyb.m147494Y("click_area_msg", "0"));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m42205q0(boolean z, uxj0 uxj0Var) {
        m42182J0();
        m42183K0();
        m42184L0();
        if (z) {
            CoreModule.f18264c.f20384f0.m33941dq(uqb0.f180376H.guessedCurrentServerTime());
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m42206r0(final Act act, String str, View view) {
        act.progress(R$string.f18632L5, true);
        i4g0.m138523u("e_delete_confirmation", OMSDialogPositon.p_messages_view, jyb.m147494Y("click_area_msg", "1"));
        final boolean zM131723o = gra.m131723o();
        act.duringCreated(CoreModule.f18264c.f20384f0.m34180wo(str, zM131723o)).subscribe(psd0.m173598I(new y20() { // from class: l.li6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132182a.m42205q0(zM131723o, (uxj0) obj);
            }
        }, new y20() { // from class: l.mi6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationLongClick.m42146a(act, (Throwable) obj);
            }
        }, new x20() { // from class: l.ni6
            @Override // p153l.x20
            public final void call() {
                act.progressDismiss();
            }
        }));
        this.f25730g.m191137c();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m42207s0(View view) {
        this.f25730g.m191137c();
        i4g0.m138523u("e_delete_confirmation", OMSDialogPositon.p_messages_view, jyb.m147494Y("click_area_msg", "0"));
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m42208t0(final Act act, String str, View view) {
        act.progress(R$string.f18632L5, true);
        i4g0.m138523u("e_delete_confirmation", OMSDialogPositon.p_messages_view, jyb.m147494Y("click_area_msg", "1"));
        psd0.m173625r(CoreModule.f18264c.f20384f0.m34191xn(str), CoreModule.f18264c.f20384f0.m33812Tf(str), new rcj() { // from class: l.gi6
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return ConversationLongClick.m42157k((uxj0) obj, (uxj0) obj2);
            }
        }).subscribe(psd0.m173598I(new y20() { // from class: l.ii6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115053a.m42210v0((uxj0) obj);
            }
        }, new y20() { // from class: l.ji6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationLongClick.m42142T(act, (Throwable) obj);
            }
        }, new x20() { // from class: l.ki6
            @Override // p153l.x20
            public final void call() {
                act.progressDismiss();
            }
        }));
        this.f25729f.m191137c();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m42209u0(View view) {
        this.f25729f.m191137c();
        i4g0.m138523u("e_delete_confirmation", OMSDialogPositon.p_messages_view, jyb.m147494Y("click_area_msg", "0"));
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m42210v0(uxj0 uxj0Var) {
        m42182J0();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m42211w0(View view) {
        this.f25727d.m204614b();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m42212x0(y20 y20Var, Conversation conversation, String str, Act act, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        String string = c22660a.f210081a.toString();
        y20Var.call(string.toString());
        String str2 = "";
        if (NullChecker.m82487b(conversation)) {
            sfj0.m185596c("e_cancelmatch", OMSDialogPositon.p_messages_view, sfj0.C20032a.m185615h("receiver_user_id", conversation.otherUser), sfj0.C20032a.m185615h("source_type", this.f25724a ? "message_allmatch" : "message_chat"), sfj0.C20032a.m185615h("cancel_item", string.toString()), sfj0.C20032a.m185615h("matchfrom", NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116503Pa(str)) ? CoreModule.f18264c.f20381e0.m116503Pa(str).matchFromForTrack() : ""));
        }
        String string2 = string.toString();
        if (act.string(R$string.f18803Qq).equals(string2)) {
            str2 = "dont_talk";
        } else if (act.string(R$string.f18923Uq).equals(string2)) {
            str2 = "spam";
        } else if (act.string(R$string.f18893Tq).equals(string2)) {
            str2 = "harassment";
        } else if (act.string(R$string.f18863Sq).equals(string2)) {
            str2 = "fake_profile";
        } else if (act.string(R$string.f18833Rq).equals(string2)) {
            str2 = "dont_want_to_tell_you";
        } else if (act.string(R$string.f18953Vq).equals(string2)) {
            str2 = "swiped_wrong";
        }
        sfj0.m185596c("e_chat_unmatch", "p_unmatch_dialog", sfj0.C20032a.m185615h("unmatch_reason", str2));
        this.f25727d.m204614b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m42213y0(final Act act, LongActionType longActionType, final y20 y20Var, final Conversation conversation, final String str, pf60 pf60Var) {
        ArrayList arrayList = new ArrayList();
        if (((Boolean) pf60Var.f152156a).booleanValue()) {
            arrayList.add(act.string(R$string.f18923Uq));
            arrayList.add(act.string(R$string.f18893Tq));
        } else {
            arrayList.add(act.string(R$string.f18803Qq));
        }
        if (!((Boolean) pf60Var.f152157b).booleanValue()) {
            arrayList.add(act.string(R$string.f18953Vq));
        }
        arrayList.add(act.string(R$string.f18863Sq));
        arrayList.add(act.string(R$string.f18833Rq));
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_unmatch_dialog", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("unmatch_dialog_show_from", this.f25724a ? "match_list" : "chat_list");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        l4g0VarM204399c.m152780o(jSONObject);
        w30.C21001b c21001b = new w30.C21001b(act);
        if (longActionType == LongActionType.SEE_UPGRADED_UN_MATCH) {
            c21001b.m204662N("确定要结束即刻聊天？").m204660L("请告诉我们结束聊天的原因，我们将为您推荐更合适的人");
        } else {
            c21001b.m204661M(R$string.f18983Wq).m204659K(R$string.f18773Pq);
        }
        c21001b.m204656H(R$string.f19138c).m204669U(new View.OnClickListener() { // from class: l.yh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199907a.m42211w0(view);
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.zh6
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f204380a.m42212x0(y20Var, conversation, str, act, vListCell, c22660a, i);
            }
        }).m204668T(new DialogInterface.OnDismissListener() { // from class: l.ai6
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m204671W(new DialogInterface.OnShowListener() { // from class: l.bi6
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w1e.m204402f(l4g0VarM204399c);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        this.f25727d = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m42214z0(Boolean bool) {
        if (!m42197i0()) {
            m42183K0();
            m42182J0();
        }
        if (gra.m131568G0()) {
            o1j0.m165651y("已取消置顶");
        }
    }
}
