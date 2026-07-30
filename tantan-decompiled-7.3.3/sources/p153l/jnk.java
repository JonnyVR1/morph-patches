package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.JoinCondition;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupSettingManagerAct;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupSettingMemberManagerAct;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.Objects;
import p137rx.C22421c;
import p151v.VListCell;

/* JADX INFO: loaded from: classes3.dex */
public class jnk extends ar2<nnk> {

    /* JADX INFO: renamed from: a */
    public final Act f121871a;

    /* JADX INFO: renamed from: b */
    public String f121872b;

    /* JADX INFO: renamed from: c */
    public w30 f121873c;

    /* JADX INFO: renamed from: d */
    public w30 f121874d;

    /* JADX INFO: renamed from: e */
    public int f121875e;

    public jnk(Act act) {
        super(act);
        this.f121875e = 0;
        this.f121871a = act;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m146248f0(uxj0 uxj0Var) {
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f121872b = this.f121871a.getIntent().getStringExtra(GroupSettingManagerAct.f32650f);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated(CoreModule.f18264c.f20387g0.m32911o6(this.f121872b)).subscribe(psd0.m173596G(new y20() { // from class: l.cnk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82727a.m146256n0((ChatGroup) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public void m146254l0() {
        w30.C21001b c21001b = new w30.C21001b(this.f121871a);
        c21001b.m204657I(this.f121871a.getResources().getString(R$string.f21658a));
        c21001b.m204669U(new View.OnClickListener() { // from class: l.gnk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105101a.m146257o0(view);
            }
        });
        ArrayList arrayList = new ArrayList();
        String string = this.f121871a.getResources().getString(R$string.f21867y0);
        String string2 = this.f121871a.getResources().getString(R$string.f21875z0);
        arrayList.add(string);
        arrayList.add(string2);
        c21001b.m204665Q(arrayList);
        c21001b.m204670V(new w30.InterfaceC21003d() { // from class: l.hnk
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                c22660a.f210081a.toString();
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        this.f121873c = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: m0 */
    public void m146255m0(final ChatGroup chatGroup) {
        final l4g0 l4g0Var = new l4g0("p_group_chat_add_method_popup", Dialog.class.getName());
        if (TextUtils.equals(chatGroup.ownerUserId, CoreModule.m30929H().userId())) {
            this.f121875e = 1;
        } else if (!jyb.m147479J(chatGroup.adminUserIds) && chatGroup.adminUserIds.contains(CoreModule.m30929H().userId())) {
            this.f121875e = 2;
        }
        l4g0Var.m152781p(jyb.m147494Y("user_group_title", Integer.valueOf(this.f121875e)));
        w1e.m204402f(l4g0Var);
        sfj0.m185596c("e_group_chat_manage_add_method", this.f121871a.pageId(), sfj0.C20032a.m185615h("groupchat_id", this.f121872b));
        w30.C21001b c21001b = new w30.C21001b(this.f121871a);
        c21001b.m204657I(this.f121871a.getResources().getString(R$string.f21658a));
        c21001b.m204669U(new View.OnClickListener() { // from class: l.dnk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89812a.m146258p0(view);
            }
        });
        ArrayList arrayList = new ArrayList();
        final String strString = this.f121871a.string(R$string.f21867y0);
        final String strString2 = this.f121871a.string(R$string.f21875z0);
        arrayList.add(strString);
        arrayList.add(strString2);
        c21001b.m204665Q(arrayList);
        c21001b.m204668T(new DialogInterface.OnDismissListener() { // from class: l.enk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0Var);
            }
        });
        c21001b.m204670V(new w30.InterfaceC21003d() { // from class: l.fnk
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f99928a.m146259q0(strString, strString2, chatGroup, vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        this.f121874d = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m146256n0(ChatGroup chatGroup) {
        ((nnk) this.viewModel).m163886m(chatGroup);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m146257o0(View view) {
        this.f121873c.m204614b();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m146258p0(View view) {
        this.f121874d.m204614b();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m146259q0(String str, String str2, ChatGroup chatGroup, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        JoinCondition joinCondition;
        String string = c22660a.f210081a.toString();
        if (string.equals(str)) {
            sfj0.m185596c("e_group_chat_add_method_popup_anyone", "p_group_chat_add_method_popup", sfj0.C20032a.m185613f("user_group_title", this.f121875e));
            joinCondition = JoinCondition.get(JoinCondition.noApplyRequired);
        } else if (string.equals(str2)) {
            sfj0.m185596c("e_group_chat_add_method_popup_review", "p_group_chat_add_method_popup", sfj0.C20032a.m185613f("user_group_title", this.f121875e));
            joinCondition = JoinCondition.get(JoinCondition.applyRequired);
        } else {
            joinCondition = null;
        }
        if (!TEnum.equals(chatGroup.joinCondition, joinCondition)) {
            C22421c<uxj0> c22421cM32900k7 = CoreModule.f18264c.f20387g0.m32900k7(this.f121872b, joinCondition);
            y20 y20Var = new y20() { // from class: l.ink
                @Override // p153l.y20
                public final void call(Object obj) {
                    jnk.m146248f0((uxj0) obj);
                }
            };
            CoreBusinessService coreBusinessServiceM143412i = CoreModule.f18273l.m143412i();
            Objects.requireNonNull(coreBusinessServiceM143412i);
            c22421cM32900k7.subscribe(psd0.m173597H(y20Var, new oik(coreBusinessServiceM143412i)));
        }
        this.f121874d.m204614b();
    }

    /* JADX INFO: renamed from: r0 */
    public void m146260r0() {
        sfj0.m185596c("e_group_chat_manage_members", this.f121871a.pageId(), sfj0.C20032a.m185615h("groupchat_id", this.f121872b));
        Act act = this.f121871a;
        act.startActivity(GroupSettingMemberManagerAct.m50322a2(act, this.f121872b));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
