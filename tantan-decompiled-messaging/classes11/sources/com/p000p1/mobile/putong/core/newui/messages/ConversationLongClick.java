package com.p000p1.mobile.putong.core.newui.messages;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.messages.ConversationLongClick;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.a0;
import com.p1.mobile.putong.core.api.y;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.core.ui.report.ReportAct;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l.c40;
import l.cwf0;
import l.d30;
import l.e30;
import l.eqh0;
import l.fap;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.ml6;
import l.o6j0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.rza;
import l.upa;
import l.v9j;
import l.vwb;
import l.x9j;
import l.xh0;
import l.xp5;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import p009l.af6;
import p009l.i0e;
import p009l.p36;
import p009l.pi6;
import p009l.r6n;
import p009l.rd6;
import p009l.yij0;
import v.VListCell;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationLongClick implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public final boolean f3760a;

    /* JADX INFO: renamed from: b */
    public final p36 f3761b;

    /* JADX INFO: renamed from: c */
    public c40 f3762c;

    /* JADX INFO: renamed from: d */
    public c40 f3763d;

    /* JADX INFO: renamed from: e */
    public c40 f3764e;

    /* JADX INFO: renamed from: f */
    public xh0 f3765f;

    /* JADX INFO: renamed from: g */
    public xh0 f3766g;

    /* JADX INFO: renamed from: h */
    public xh0 f3767h;

    /* JADX INFO: renamed from: i */
    public c40 f3768i;

    /* JADX INFO: renamed from: j */
    public final pi6 f3769j;

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
    public static class C0286a {

        /* JADX INFO: renamed from: a */
        public LongActionType f3770a;

        /* JADX INFO: renamed from: b */
        public CharSequence f3771b;

        public C0286a(LongActionType longActionType, CharSequence charSequence) {
            this.f3770a = longActionType;
            this.f3771b = charSequence;
        }

        /* JADX INFO: renamed from: a */
        public static C0286a m5310a(LongActionType longActionType, CharSequence charSequence) {
            return new C0286a(longActionType, charSequence);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f3770a == ((C0286a) obj).f3770a;
        }

        public int hashCode() {
            return Objects.hash(this.f3770a, this.f3771b);
        }
    }

    public ConversationLongClick(@NonNull pi6 pi6Var) {
        this.f3769j = pi6Var;
        this.f3761b = (p36) pi6Var.f18625d;
        this.f3760a = pi6Var.f18626e;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m5224H(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m5227K(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: M0 */
    public static void m5230M0(List<C0286a> list, LongActionType longActionType) {
        if (vwb.J(list)) {
            return;
        }
        Iterator<C0286a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().f3770a == longActionType) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m5237T(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m5238U(Act act, Conversation conversation, VListCell vListCell, VListCell.a aVar, int i) {
        if (aVar.a.toString().equals(act.getString(R.string.j))) {
            fap.g(conversation);
        }
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m5240W(Throwable th) {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5241a(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m5243c(Throwable th) {
    }

    /* JADX INFO: renamed from: f0 */
    public static List<CharSequence> m5247f0(List<C0286a> list) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(list)) {
            Iterator<C0286a> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f3771b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m5250i(final String str, final Act act, String str2) {
        User userPa = CoreModule.c.e0.Pa(str);
        if (!CoreModule.N().isMatchedByRelationship(userPa) && CoreModule.N().isMatchedByFollowship(userPa)) {
            CoreModule.N().following(CoreModule.H().userId(), userPa, false, (String) null, (String) null).subscribe(mkd0.H(new e30() { // from class: l.zg6
                public final void call(Object obj) {
                    act.progressDismiss();
                }
            }, new e30() { // from class: l.ah6
                public final void call(Object obj) {
                    ConversationLongClick.m5263v(act, (Throwable) obj);
                }
            }));
            return;
        }
        new Relationship().state = RelationshipStatus.get("blocked");
        act.progress(R.string.J5, true);
        CoreModule.c.f0.qe(str, act).subscribe(mkd0.H(new e30() { // from class: l.bh6
            public final void call(Object obj) {
                ConversationLongClick.m5261t(act, str, (roj0) obj);
            }
        }, new e30() { // from class: l.ch6
            public final void call(Object obj) {
                ConversationLongClick.m5256o(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ roj0 m5252k(roj0 roj0Var, roj0 roj0Var2) {
        return roj0Var;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m5255n(Throwable th) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m5256o(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m5258q(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            if (tantanForbidden.code == 40399) {
                osi0.g(tantanForbidden.message);
                return;
            }
        }
        osi0.g("设置失败，请稍后再试");
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m5261t(Act act, String str, roj0 roj0Var) {
        act.progressDismiss();
        List listD = CoreModule.N().coreMomentMutedUsers().d();
        if (listD == null) {
            listD = new ArrayList();
        }
        CoreModule.N().coreMomentMutedUsers().e(vwb.c0(listD, str));
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m5262u(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m5263v(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m5268A0(j760 j760Var) {
        if (!m5292i0()) {
            m5278K0();
            m5277J0();
        }
        if (upa.G0()) {
            lsi0.y("已取消置顶");
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m5269B0(View view) {
        this.f3762c.b();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m5270C0(String str, Act act, Conversation conversation, String str2, String str3, String str4, String str5, VListCell vListCell, VListCell.a aVar, int i) {
        String string = aVar.a.toString();
        if (TextUtils.equals(string, str)) {
            zvf0.r("e_delete_option", "p_messages_view");
            m5284Z(act, ((DbObject) conversation).id);
        } else if (TextUtils.equals(string, str2)) {
            zvf0.r("e_top", "p_messages_view");
            m5281O0(act, conversation);
        } else if (TextUtils.equals(string, str3)) {
            m5287c0(act, conversation);
        } else if (TextUtils.equals(string, str4)) {
            zvf0.r("e_hide", "p_messages_view");
            m5283Y(act, ((DbObject) conversation).id);
        } else if (TextUtils.equals(string, str5)) {
            m5280N0();
        }
        this.f3762c.b();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m5271D0(View view) {
        this.f3762c.b();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m5272E0(User user, VListCell vListCell, VListCell.a aVar, int i) {
        m5291h0(user);
        this.f3762c.b();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m5273F0(View view) {
        this.f3762c.b();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m5274G0(View view) {
        this.f3768i.b();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m5275H0(ArrayList arrayList, final Act act, User user, Conversation conversation, boolean z, VListCell vListCell, VListCell.a aVar, int i) {
        if (i >= arrayList.size() || i < 0) {
            return;
        }
        LongActionType longActionType = ((C0286a) arrayList.get(i)).f3770a;
        if (longActionType == LongActionType.SET_NICKNAME) {
            zvf0.r("e_match_list_set_nickname", "p_messages_view");
            if (CoreModule.c.e0.p9().isVIP()) {
                act.startActivity(SetNicknameAct.m5930Y1(act, ((DbObject) user).id));
            } else {
                c.J1(act, "p_messages_view,e_match_list_set_nickname,click", Privilege.vip_membership_remark_gp);
            }
        } else if (longActionType == LongActionType.UN_MATCH || longActionType == LongActionType.SEE_UPGRADED_UN_MATCH || longActionType == LongActionType.CRUSH_HEARTBEAT) {
            m5286b0(act, conversation.otherUser, longActionType);
        } else if (longActionType == LongActionType.CLEAN_HISTORY) {
            m5282X(act, conversation.otherUser);
        } else if (longActionType == LongActionType.REMOVE) {
            if (z) {
                zvf0.r("e_platinum_receive_top_chat_delete", "p_messages_view");
            } else {
                zvf0.r("e_delete_option", "p_messages_view");
            }
            if (upa.o()) {
                m5284Z(act, conversation.otherUser);
            } else {
                m5285a0(act, ((DbObject) user).id);
            }
        } else if (longActionType == LongActionType.NORMAL_REMOVE) {
            if (z) {
                zvf0.r("e_platinum_receive_top_chat_delete", "p_messages_view");
            } else {
                zvf0.r("e_delete_option", "p_messages_view");
            }
            m5284Z(act, conversation.otherUser);
        } else if (longActionType == LongActionType.JUMP_PROFILE) {
            if (!xp5.b(act, conversation, "p_messages_view", "conversation")) {
                act.startActivity(ProfileAct.n2(act, conversation.otherUser, "conversation_view", false));
            }
        } else if (longActionType == LongActionType.HEARTBEAT_TEST) {
            af6.m11388w(conversation);
        } else if (longActionType == LongActionType.HEARTBEAT_LIMIT_TEST) {
            af6.m11389x(conversation);
        } else if (longActionType == LongActionType.REPORT) {
            act.startActivity(ReportAct.a2(act, conversation.otherUser, true, new ResultReceiver(null) { // from class: com.p1.mobile.putong.core.newui.messages.ConversationLongClick.1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i2, Bundle bundle) {
                    if (upa.t1() && i2 == -1) {
                        act.finish();
                    }
                }
            }));
        } else if (longActionType == LongActionType.DISMISS) {
            if (z) {
                zvf0.r("e_platinum_receive_top_chat_hide", "p_messages_view");
            } else {
                zvf0.r("e_hide", "p_messages_view");
            }
            m5283Y(act, conversation.otherUser);
        } else if (longActionType == LongActionType.CANCEL_TOP) {
            if (z) {
                zvf0.r("e_platinum_receive_top_chat_cancel", "p_messages_view");
            }
            m5287c0(act, conversation);
        } else if (longActionType == LongActionType.TOP) {
            zvf0.r("e_top", "p_messages_view");
            m5281O0(act, conversation);
        } else if (longActionType == LongActionType.FILTER_REMOVE) {
            m5280N0();
        }
        this.f3768i.b();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m5276I0(j760 j760Var) {
        if (!m5292i0()) {
            m5278K0();
            m5277J0();
        }
        if (upa.G0()) {
            lsi0.y("已置顶");
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m5277J0() {
        ConversationsList.f3859u1.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m5278K0() {
        ConversationsList.m5437B2(true);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m5279L0() {
        CoreModule.c.f0.Z.onNext("");
    }

    /* JADX INFO: renamed from: N0 */
    public final void m5280N0() {
        pi6 pi6Var = this.f3769j;
        Conversation conversation = pi6Var.f18622a;
        Act act = pi6Var.f18645x;
        if (act == null || conversation == null) {
            return;
        }
        act.duringCreated(CoreModule.c.f0.xo(((DbObject) conversation).id).first()).subscribe(mkd0.H(new e30() { // from class: l.gg6
            public final void call(Object obj) {
                ConversationLongClick.m5227K((roj0) obj);
            }
        }, new e30() { // from class: l.hg6
            public final void call(Object obj) {
                ConversationLongClick.m5243c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O0 */
    public final void m5281O0(Act act, Conversation conversation) {
        act.duringCreated(CoreModule.c.f0.vo(((DbObject) conversation).id, 1)).subscribe(mkd0.H(new e30() { // from class: l.sh6
            public final void call(Object obj) {
                this.f20255a.m5276I0((j760) obj);
            }
        }, new e30() { // from class: l.th6
            public final void call(Object obj) {
                ConversationLongClick.m5255n((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public final void m5282X(final Act act, final String str) {
        if (act == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(act.getString(R.string.Nj));
        c40.b bVar = new c40.b(act);
        bVar.I(act.getResources().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.jg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15109a.m5294k0(view);
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.kg6
            /* JADX INFO: renamed from: a */
            public final void m17499a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f15660a.m5296m0(act, str, vListCell, aVar, i);
            }
        });
        c40 c40VarF = bVar.F();
        this.f3764e = c40VarF;
        c40VarF.f();
    }

    /* JADX INFO: renamed from: Y */
    public final void m5283Y(final Act act, final String str) {
        if (act == null) {
            return;
        }
        zvf0.x("e_hide_alert", "p_messages_view");
        xh0 xh0VarA = new xh0.a(act).s(act.getString(R.string.H7)).g(false).j(act.getString(R.string.I7)).f(act.getResources().getString(R.string.pi)).r(act.getResources().getString(R.string.Yi)).c(new View.OnClickListener() { // from class: l.ag6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9488a.m5298o0(act, str, view);
            }
        }).o(new View.OnClickListener() { // from class: l.bg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10063a.m5299p0(view);
            }
        }).a();
        this.f3767h = xh0VarA;
        xh0VarA.g();
    }

    /* JADX INFO: renamed from: Z */
    public final void m5284Z(final Act act, final String str) {
        if (act == null) {
            return;
        }
        zvf0.x("e_delete_confirmation", "p_messages_view");
        xh0 xh0VarA = new xh0.a(act).s(act.getResources().getString(R.string.N3)).t(true).g(false).j(act.getResources().getString(R.string.Zi)).f(act.getResources().getString(R.string.pi)).r(act.getResources().getString(R.string.Yi)).c(new View.OnClickListener() { // from class: l.pg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18532a.m5301r0(act, str, view);
            }
        }).o(new View.OnClickListener() { // from class: l.qg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19229a.m5302s0(view);
            }
        }).a();
        this.f3766g = xh0VarA;
        xh0VarA.g();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m5285a0(final Act act, final String str) {
        if (act == null) {
            return;
        }
        zvf0.x("e_delete_confirmation", "p_messages_view");
        xh0 xh0VarA = new xh0.a(act).s(act.getResources().getString(R.string.N3)).t(true).g(false).j(act.getResources().getString(R.string.Zi)).f(act.getResources().getString(R.string.pi)).r(act.getResources().getString(R.string.Yi)).c(new View.OnClickListener() { // from class: l.qh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19253a.m5303t0(act, str, view);
            }
        }).o(new View.OnClickListener() { // from class: l.rh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19836a.m5304u0(view);
            }
        }).a();
        this.f3765f = xh0VarA;
        xh0VarA.g();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m5286b0(final Act act, final String str, final LongActionType longActionType) {
        if (act == null) {
            return;
        }
        final Conversation conversation = this.f3769j.f18622a;
        final e30 e30Var = new e30() { // from class: l.lg6
            public final void call(Object obj) {
                ConversationLongClick.m5250i(str, act, (String) obj);
            }
        };
        act.duringCreated(mkd0.r(CoreModule.c.f0.Mg(str), CoreModule.c.f0.Jg(str), new x9j() { // from class: l.ng6
            public final Object call(Object obj, Object obj2) {
                return vwb.Y((Boolean) obj, (Boolean) obj2);
            }
        }).first()).subscribe(new e30() { // from class: l.mg6
            public final void call(Object obj) {
                this.f16882a.m5308y0(act, longActionType, e30Var, conversation, str, (j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final void m5287c0(Act act, Conversation conversation) {
        if (CoreModule.P().g().b8() && conversation.isPlatinumTop()) {
            act.duringCreated(CoreModule.c.e2.w3(((DbObject) conversation).id, false)).subscribe(mkd0.H(new e30() { // from class: l.cg6
                public final void call(Object obj) {
                    this.f10577a.m5309z0((Boolean) obj);
                }
            }, new e30() { // from class: l.dg6
                public final void call(Object obj) {
                    ConversationLongClick.m5258q((Throwable) obj);
                }
            }));
        } else {
            act.duringCreated(CoreModule.c.f0.vo(((DbObject) conversation).id, -1)).subscribe(mkd0.H(new e30() { // from class: l.eg6
                public final void call(Object obj) {
                    this.f12555a.m5268A0((j760) obj);
                }
            }, new e30() { // from class: l.fg6
                public final void call(Object obj) {
                    ConversationLongClick.m5240W((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m5288d0() {
        if (NullChecker.a(this.f3762c) && this.f3762c.d()) {
            this.f3762c.b();
        }
        if (NullChecker.a(this.f3764e) && this.f3764e.d()) {
            this.f3764e.b();
        }
        if (NullChecker.a(this.f3763d) && this.f3763d.d()) {
            this.f3763d.b();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final String m5289e0() {
        int i = this.f3769j.f18628g;
        StringBuilder sb = new StringBuilder();
        int iMo5626h = this.f3761b.mo5626h() - this.f3761b.mo5628k().size();
        if (iMo5626h > 0) {
            sb.append((i + 1) - iMo5626h);
        } else {
            sb.append(i + 1);
        }
        sb.append("/");
        boolean zIsEmpty = this.f3761b.mo5628k().isEmpty();
        p36 p36Var = this.f3761b;
        if (zIsEmpty) {
            sb.append(p36Var.mo5626h());
        } else {
            sb.append(p36Var.mo5628k().size());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m5290g0() {
        if (!TextUtils.isEmpty(this.f3769j.f18646y)) {
            return false;
        }
        pi6 pi6Var = this.f3769j;
        final Conversation conversation = pi6Var.f18622a;
        final Act act = pi6Var.f18645x;
        ArrayList arrayList = new ArrayList();
        final String string = act.getString(R.string.gq);
        final String string2 = act.getString(R.string.hq);
        final String string3 = act.getString(R.string.G7);
        final String string4 = act.getString(R.string.x6);
        final String str = LongActionType.FILTER_REMOVE.explain;
        if (conversation.isTop()) {
            arrayList.add(string2);
        } else {
            arrayList.add(string);
            zvf0.x("e_top", "p_messages_view");
        }
        arrayList.add(string3);
        arrayList.add(string4);
        if (TEnum.equals(conversation.status, "removed") || TEnum.equals(conversation.status, "invisible")) {
            arrayList.clear();
            arrayList.add(str);
        }
        zvf0.x("e_delete_option", "p_messages_view");
        zvf0.x("e_hide", "p_messages_view");
        c40.b bVar = new c40.b(act);
        bVar.I(act.getResources().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.yf6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23032a.m5269B0(view);
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.zf6
            /* JADX INFO: renamed from: a */
            public final void m25764a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f23630a.m5270C0(string4, act, conversation, string, string2, string3, str, vListCell, aVar, i);
            }
        });
        c40 c40VarF = bVar.F();
        this.f3762c = c40VarF;
        c40VarF.f();
        return !vwb.J(arrayList);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m5291h0(final User user) {
        HashSet hashSet = (HashSet) r6n.m21419f().f19662h.get();
        hashSet.add(((DbObject) user).id);
        r6n.m21419f().f19662h.put(hashSet);
        r6n.m21419f().m21435r(((DbObject) user).id, true);
        CoreModule.c.scheduled("special_user_relationship", -1, new v9j() { // from class: l.og6
            public final Object call() {
                return y.o3(((DbObject) user).id).compose(mkd0.C());
            }
        });
        a0.j().w(((DbObject) user).id);
        this.f3769j.f18645x.duringCreated(CoreModule.c.m0.n6());
        zvf0.u("e_chat_request_operate", "p_messages_view", new j760[]{vwb.Y("show_where", this.f3760a ? "matchList" : "chatList"), vwb.Y("request_show_type", this.f3769j.f18630i), vwb.Y("show_position", m5289e0()), vwb.Y("chat_request_operate", "ignore")});
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m5292i0() {
        p36 p36Var = this.f3761b;
        return (p36Var instanceof ConversationsList.C0294e) && ((ConversationsList.C0294e) p36Var).m5613E();
    }

    /* JADX INFO: renamed from: j0 */
    public boolean m5293j0() {
        boolean zIsEmpty;
        pi6 pi6Var = this.f3769j;
        final Conversation conversation = pi6Var.f18622a;
        final Act act = pi6Var.f18645x;
        if (rd6.m21519o(conversation) || conversation.lowPayOneSideConv() || TextUtils.equals(((DbObject) conversation).id, "fake_conversation_city_centre_enter") || !(zIsEmpty = TextUtils.isEmpty(this.f3769j.f18646y)) || "lovescript".equals(conversation.convType) || TextUtils.equals(((DbObject) conversation).id, "fake_conversation_anonymous_greeting") || xp5.m(conversation)) {
            return true;
        }
        if (upa.V1() && ml6.a(conversation)) {
            return m5290g0();
        }
        if (TextUtils.equals(conversation.convType, "conversation_intl_fake")) {
            return true;
        }
        final User userPa = CoreModule.c.e0.Pa(conversation.otherUser);
        if (!NullChecker.a(userPa)) {
            return false;
        }
        if (NullChecker.a(this.f3769j.f18622a) && TextUtils.equals(this.f3769j.f18622a.convType, "intlSeeChatRequest")) {
            ArrayList arrayListF0 = vwb.f0(new CharSequence[]{act.string(R.string.J1)});
            c40.b bVar = new c40.b(act);
            bVar.I(act.getResources().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.xf6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22586a.m5271D0(view);
                }
            }).Q(arrayListF0).V(new c40.d() { // from class: l.ig6
                /* JADX INFO: renamed from: a */
                public final void m16506a(VListCell vListCell, VListCell.a aVar, int i) {
                    this.f14609a.m5272E0(userPa, vListCell, aVar, i);
                }
            });
            c40 c40VarF = bVar.F();
            this.f3762c = c40VarF;
            c40VarF.f();
            return true;
        }
        if (fap.y() && fap.p(((DbObject) conversation).id)) {
            ArrayList arrayListF1 = vwb.f0(new CharSequence[]{act.getString(R.string.j)});
            c40.b bVar2 = new c40.b(act);
            bVar2.I(act.getResources().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.tg6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20665a.m5273F0(view);
                }
            }).Q(arrayListF1).V(new c40.d() { // from class: l.eh6
                /* JADX INFO: renamed from: a */
                public final void m13944a(VListCell vListCell, VListCell.a aVar, int i) {
                    ConversationLongClick.m5238U(act, conversation, vListCell, aVar, i);
                }
            });
            c40 c40VarF2 = bVar2.F();
            this.f3762c = c40VarF2;
            c40VarF2.f();
            return true;
        }
        String string = act.getString(R.string.Qj);
        CharSequence charSequenceS0 = rza.S0(act, act.string(R.string.kq));
        act.string(R.string.j);
        String string2 = act.getString(R.string.w3);
        String strString = act.string(R.string.r1);
        String strString2 = act.string(R.string.Nj);
        act.getString(R.string.gq);
        act.getString(R.string.hq);
        act.getString(R.string.G7);
        LongActionType longActionType = LongActionType.SET_NICKNAME;
        C0286a c0286aM5310a = C0286a.m5310a(longActionType, charSequenceS0);
        LongActionType longActionType2 = LongActionType.UN_MATCH;
        C0286a c0286aM5310a2 = C0286a.m5310a(longActionType2, string);
        LongActionType longActionType3 = LongActionType.CLEAN_HISTORY;
        final ArrayList arrayListF2 = vwb.f0(new C0286a[]{c0286aM5310a, c0286aM5310a2, C0286a.m5310a(longActionType3, strString2)});
        zvf0.x("e_match_list_set_nickname", "p_messages_view");
        if (CoreModule.c.e0.Pa(conversation.otherUser).isTeamAccount()) {
            String str = ((DbObject) userPa).id;
            m5230M0(arrayListF2, longActionType2);
            m5230M0(arrayListF2, longActionType);
        } else {
            arrayListF2.add(0, C0286a.m5310a(LongActionType.JUMP_PROFILE, string2));
            if (!userPa.isBannedNew()) {
                arrayListF2.add(C0286a.m5310a(LongActionType.REPORT, strString));
            }
        }
        if (TextUtils.equals(conversation.convType, "marriage")) {
            m5230M0(arrayListF2, LongActionType.TOP);
            m5230M0(arrayListF2, LongActionType.CANCEL_TOP);
        }
        if (CoreModule.c.e0.Pa(conversation.otherUser).onlineMatchLocked()) {
            m5230M0(arrayListF2, longActionType3);
            m5230M0(arrayListF2, LongActionType.DISMISS);
            m5230M0(arrayListF2, LongActionType.NORMAL_REMOVE);
            m5230M0(arrayListF2, LongActionType.TOP);
            m5230M0(arrayListF2, LongActionType.CANCEL_TOP);
        }
        if (NullChecker.a(conversation) && conversation.isSeeUpgradedConv()) {
            m5230M0(arrayListF2, LongActionType.NORMAL_REMOVE);
            m5230M0(arrayListF2, LongActionType.TOP);
            m5230M0(arrayListF2, LongActionType.CANCEL_TOP);
        }
        if (xp5.o(conversation, userPa)) {
            m5230M0(arrayListF2, longActionType3);
        }
        if (conversation.lowPayOneSideConv()) {
            m5230M0(arrayListF2, LongActionType.JUMP_PROFILE);
        }
        final boolean z = CoreModule.P().g().b8() && conversation.isPlatinumTop();
        if (z) {
            m5230M0(arrayListF2, LongActionType.TOP);
            arrayListF2.add(0, C0286a.m5310a(LongActionType.CANCEL_TOP, "取消置顶"));
        }
        if (!zIsEmpty) {
            m5230M0(arrayListF2, LongActionType.DISMISS);
            m5230M0(arrayListF2, LongActionType.NORMAL_REMOVE);
            m5230M0(arrayListF2, LongActionType.TOP);
            m5230M0(arrayListF2, LongActionType.CANCEL_TOP);
        }
        if (TEnum.equals(conversation.status, "removed") || TEnum.equals(conversation.status, "invisible")) {
            arrayListF2.clear();
            LongActionType longActionType4 = LongActionType.FILTER_REMOVE;
            arrayListF2.add(C0286a.m5310a(longActionType4, longActionType4.explain));
        }
        if (arrayListF2.contains(C0286a.m5310a(LongActionType.REMOVE, "")) || arrayListF2.contains(C0286a.m5310a(LongActionType.NORMAL_REMOVE, ""))) {
            if (z) {
                zvf0.x("e_platinum_receive_top_chat_delete", "p_messages_view");
            } else {
                zvf0.x("e_delete_option", "p_messages_view");
            }
        }
        if (arrayListF2.contains(C0286a.m5310a(LongActionType.TOP, ""))) {
            zvf0.x("e_top", "p_messages_view");
        }
        if (arrayListF2.contains(C0286a.m5310a(LongActionType.CANCEL_TOP, "")) && z) {
            zvf0.x("e_platinum_receive_top_chat_cancel", "p_messages_view");
        }
        if (arrayListF2.contains(C0286a.m5310a(LongActionType.DISMISS, ""))) {
            if (z) {
                zvf0.x("e_platinum_receive_top_chat_hide", "p_messages_view");
            } else {
                zvf0.x("e_hide", "p_messages_view");
            }
        }
        c40 c40VarF3 = new c40.b(act).I(act.getResources().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.oh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18048a.m5274G0(view);
            }
        }).Q(m5247f0(arrayListF2)).P(eqh0.c(3)).V(new c40.d() { // from class: l.ph6
            /* JADX INFO: renamed from: a */
            public final void m20295a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f18584a.m5275H0(arrayListF2, act, userPa, conversation, z, vListCell, aVar, i);
            }
        }).F();
        this.f3768i = c40VarF3;
        c40VarF3.f();
        return true;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m5294k0(View view) {
        this.f3764e.b();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m5295l0(roj0 roj0Var) {
        m5277J0();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m5296m0(final Act act, String str, VListCell vListCell, VListCell.a aVar, int i) {
        act.progress(R.string.J5, true);
        CoreModule.c.f0.xn(str).subscribe(mkd0.I(new e30() { // from class: l.rg6
            public final void call(Object obj) {
                this.f19823a.m5295l0((roj0) obj);
            }
        }, new e30() { // from class: l.sg6
            public final void call(Object obj) {
                ConversationLongClick.m5224H(act, (Throwable) obj);
            }
        }, new d30() { // from class: l.ug6
            public final void call() {
                act.progressDismiss();
            }
        }));
        this.f3764e.b();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m5297n0(boolean z, j760 j760Var) {
        m5277J0();
        m5278K0();
        m5279L0();
        if (z) {
            CoreModule.c.f0.dq(qib0.H.guessedCurrentServerTime());
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m5298o0(final Act act, String str, View view) {
        act.progress(R.string.J5, true);
        zvf0.u("e_hide_alert", "p_messages_view", new j760[]{vwb.Y("click_area_msg", "1")});
        final boolean zO = upa.o();
        act.duringCreated(CoreModule.c.f0.uo(str, zO)).subscribe(mkd0.I(new e30() { // from class: l.lh6
            public final void call(Object obj) {
                this.f16159a.m5297n0(zO, (j760) obj);
            }
        }, new e30() { // from class: l.mh6
            public final void call(Object obj) {
                ConversationLongClick.m5262u(act, (Throwable) obj);
            }
        }, new d30() { // from class: l.nh6
            public final void call() {
                act.progressDismiss();
            }
        }));
        this.f3767h.c();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return m5293j0();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m5299p0(View view) {
        this.f3767h.c();
        zvf0.u("e_hide_alert", "p_messages_view", new j760[]{vwb.Y("click_area_msg", "0")});
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m5300q0(boolean z, roj0 roj0Var) {
        m5277J0();
        m5278K0();
        m5279L0();
        if (z) {
            CoreModule.c.f0.dq(qib0.H.guessedCurrentServerTime());
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m5301r0(final Act act, String str, View view) {
        act.progress(R.string.J5, true);
        zvf0.u("e_delete_confirmation", "p_messages_view", new j760[]{vwb.Y("click_area_msg", "1")});
        final boolean zO = upa.o();
        act.duringCreated(CoreModule.c.f0.wo(str, zO)).subscribe(mkd0.I(new e30() { // from class: l.ih6
            public final void call(Object obj) {
                this.f14631a.m5300q0(zO, (roj0) obj);
            }
        }, new e30() { // from class: l.jh6
            public final void call(Object obj) {
                ConversationLongClick.m5241a(act, (Throwable) obj);
            }
        }, new d30() { // from class: l.kh6
            public final void call() {
                act.progressDismiss();
            }
        }));
        this.f3766g.c();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m5302s0(View view) {
        this.f3766g.c();
        zvf0.u("e_delete_confirmation", "p_messages_view", new j760[]{vwb.Y("click_area_msg", "0")});
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m5303t0(final Act act, String str, View view) {
        act.progress(R.string.J5, true);
        zvf0.u("e_delete_confirmation", "p_messages_view", new j760[]{vwb.Y("click_area_msg", "1")});
        mkd0.r(CoreModule.c.f0.xn(str), CoreModule.c.f0.Tf(str), new x9j() { // from class: l.dh6
            public final Object call(Object obj, Object obj2) {
                return ConversationLongClick.m5252k((roj0) obj, (roj0) obj2);
            }
        }).subscribe(mkd0.I(new e30() { // from class: l.fh6
            public final void call(Object obj) {
                this.f12999a.m5305v0((roj0) obj);
            }
        }, new e30() { // from class: l.gh6
            public final void call(Object obj) {
                ConversationLongClick.m5237T(act, (Throwable) obj);
            }
        }, new d30() { // from class: l.hh6
            public final void call() {
                act.progressDismiss();
            }
        }));
        this.f3765f.c();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m5304u0(View view) {
        this.f3765f.c();
        zvf0.u("e_delete_confirmation", "p_messages_view", new j760[]{vwb.Y("click_area_msg", "0")});
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m5305v0(roj0 roj0Var) {
        m5277J0();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m5306w0(View view) {
        this.f3763d.b();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m5307x0(e30 e30Var, Conversation conversation, String str, Act act, VListCell vListCell, VListCell.a aVar, int i) {
        String string = aVar.a.toString();
        e30Var.call(string.toString());
        String str2 = "";
        if (NullChecker.b(conversation)) {
            o6j0.c("e_cancelmatch", "p_messages_view", new o6j0.a[]{o6j0.a.h("receiver_user_id", conversation.otherUser), o6j0.a.h("source_type", this.f3760a ? "message_allmatch" : "message_chat"), o6j0.a.h("cancel_item", string.toString()), o6j0.a.h("matchfrom", NullChecker.a(CoreModule.c.e0.Pa(str)) ? CoreModule.c.e0.Pa(str).matchFromForTrack() : "")});
        }
        String string2 = string.toString();
        if (act.string(R.string.vq).equals(string2)) {
            str2 = "dont_talk";
        } else if (act.string(R.string.zq).equals(string2)) {
            str2 = "spam";
        } else if (act.string(R.string.yq).equals(string2)) {
            str2 = "harassment";
        } else if (act.string(R.string.xq).equals(string2)) {
            str2 = "fake_profile";
        } else if (act.string(R.string.wq).equals(string2)) {
            str2 = "dont_want_to_tell_you";
        } else if (act.string(R.string.Aq).equals(string2)) {
            str2 = "swiped_wrong";
        }
        o6j0.c("e_chat_unmatch", "p_unmatch_dialog", new o6j0.a[]{o6j0.a.h("unmatch_reason", str2)});
        this.f3763d.b();
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m5308y0(final Act act, LongActionType longActionType, final e30 e30Var, final Conversation conversation, final String str, j760 j760Var) {
        ArrayList arrayList = new ArrayList();
        if (((Boolean) j760Var.a).booleanValue()) {
            arrayList.add(act.string(R.string.zq));
            arrayList.add(act.string(R.string.yq));
        } else {
            arrayList.add(act.string(R.string.vq));
        }
        if (!((Boolean) j760Var.b).booleanValue()) {
            arrayList.add(act.string(R.string.Aq));
        }
        arrayList.add(act.string(R.string.xq));
        arrayList.add(act.string(R.string.wq));
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_unmatch_dialog", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", "active");
            jSONObject.put("unmatch_dialog_show_from", this.f3760a ? "match_list" : "chat_list");
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        cwf0VarM16062c.o(jSONObject);
        c40.b bVar = new c40.b(act);
        if (longActionType == LongActionType.SEE_UPGRADED_UN_MATCH) {
            bVar.N("确定要结束即刻聊天？").L("请告诉我们结束聊天的原因，我们将为您推荐更合适的人");
        } else {
            bVar.M(R.string.Bq).K(R.string.uq);
        }
        bVar.H(R.string.c).U(new View.OnClickListener() { // from class: l.vg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21569a.m5306w0(view);
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.wg6
            /* JADX INFO: renamed from: a */
            public final void m24201a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f22097a.m5307x0(e30Var, conversation, str, act, vListCell, aVar, i);
            }
        }).T(new DialogInterface.OnDismissListener() { // from class: l.xg6
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m16064e(cwf0VarM16062c);
            }
        }).W(new DialogInterface.OnShowListener() { // from class: l.yg6
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m16065f(cwf0VarM16062c);
            }
        });
        c40 c40VarF = bVar.F();
        this.f3763d = c40VarF;
        c40VarF.f();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m5309z0(Boolean bool) {
        if (!m5292i0()) {
            m5278K0();
            m5277J0();
        }
        if (upa.G0()) {
            lsi0.y("已取消置顶");
        }
    }
}
