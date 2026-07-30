package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.JoinCondition;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupSettingManagerAct;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupSettingMemberManagerAct;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.Objects;
import p133rx.C22306c;
import p147v.VListCell;

/* JADX INFO: loaded from: classes3.dex */
public class tkk extends jq2<xkk> {

    /* JADX INFO: renamed from: a */
    public final Act f170887a;

    /* JADX INFO: renamed from: b */
    public String f170888b;

    /* JADX INFO: renamed from: c */
    public c40 f170889c;

    /* JADX INFO: renamed from: d */
    public c40 f170890d;

    /* JADX INFO: renamed from: e */
    public int f170891e;

    public tkk(Act act) {
        super(act);
        this.f170891e = 0;
        this.f170887a = act;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m189487f0(roj0 roj0Var) {
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f170888b = this.f170887a.getIntent().getStringExtra(GroupSettingManagerAct.f31802f);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated(CoreModule.f17545c.f19645g0.m31908o6(this.f170888b)).subscribe(mkd0.m154955G(new e30() { // from class: l.mkk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134332a.m189495n0((ChatGroup) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public void m189493l0() {
        c40.C16057b c16057b = new c40.C16057b(this.f170887a);
        c16057b.m105156I(this.f170887a.getResources().getString(R$string.f20916a));
        c16057b.m105168U(new View.OnClickListener() { // from class: l.qkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155144a.m189496o0(view);
            }
        });
        ArrayList arrayList = new ArrayList();
        String string = this.f170887a.getResources().getString(R$string.f21125y0);
        String string2 = this.f170887a.getResources().getString(R$string.f21133z0);
        arrayList.add(string);
        arrayList.add(string2);
        c16057b.m105164Q(arrayList);
        c16057b.m105169V(new c40.InterfaceC16059d() { // from class: l.rkk
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                c22545a.f209159a.toString();
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        this.f170889c = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: m0 */
    public void m189494m0(final ChatGroup chatGroup) {
        final cwf0 cwf0Var = new cwf0("p_group_chat_add_method_popup", Dialog.class.getName());
        if (TextUtils.equals(chatGroup.ownerUserId, CoreModule.m29931H().userId())) {
            this.f170891e = 1;
        } else if (!vwb.m200296J(chatGroup.adminUserIds) && chatGroup.adminUserIds.contains(CoreModule.m29931H().userId())) {
            this.f170891e = 2;
        }
        cwf0Var.m109040p(vwb.m200311Y("user_group_title", Integer.valueOf(this.f170891e)));
        i0e.m133797f(cwf0Var);
        o6j0.m162859c("e_group_chat_manage_add_method", this.f170887a.pageId(), o6j0.C18854a.m162878h("groupchat_id", this.f170888b));
        c40.C16057b c16057b = new c40.C16057b(this.f170887a);
        c16057b.m105156I(this.f170887a.getResources().getString(R$string.f20916a));
        c16057b.m105168U(new View.OnClickListener() { // from class: l.nkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139440a.m189497p0(view);
            }
        });
        ArrayList arrayList = new ArrayList();
        final String strString = this.f170887a.string(R$string.f21125y0);
        final String strString2 = this.f170887a.string(R$string.f21133z0);
        arrayList.add(strString);
        arrayList.add(strString2);
        c16057b.m105164Q(arrayList);
        c16057b.m105167T(new DialogInterface.OnDismissListener() { // from class: l.okk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0Var);
            }
        });
        c16057b.m105169V(new c40.InterfaceC16059d() { // from class: l.pkk
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f150004a.m189498q0(strString, strString2, chatGroup, vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        this.f170890d = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m189495n0(ChatGroup chatGroup) {
        ((xkk) this.viewModel).m209806m(chatGroup);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m189496o0(View view) {
        this.f170889c.m105113b();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m189497p0(View view) {
        this.f170890d.m105113b();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m189498q0(String str, String str2, ChatGroup chatGroup, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        JoinCondition joinCondition;
        String string = c22545a.f209159a.toString();
        if (string.equals(str)) {
            o6j0.m162859c("e_group_chat_add_method_popup_anyone", "p_group_chat_add_method_popup", o6j0.C18854a.m162876f("user_group_title", this.f170891e));
            joinCondition = JoinCondition.get(JoinCondition.noApplyRequired);
        } else if (string.equals(str2)) {
            o6j0.m162859c("e_group_chat_add_method_popup_review", "p_group_chat_add_method_popup", o6j0.C18854a.m162876f("user_group_title", this.f170891e));
            joinCondition = JoinCondition.get(JoinCondition.applyRequired);
        } else {
            joinCondition = null;
        }
        if (!TEnum.equals(chatGroup.joinCondition, joinCondition)) {
            C22306c<roj0> c22306cM31897k7 = CoreModule.f17545c.f19645g0.m31897k7(this.f170888b, joinCondition);
            e30 e30Var = new e30() { // from class: l.skk
                @Override // p149l.e30
                public final void call(Object obj) {
                    tkk.m189487f0((roj0) obj);
                }
            };
            CoreBusinessService coreBusinessServiceM94658i = CoreModule.f17554l.m94658i();
            Objects.requireNonNull(coreBusinessServiceM94658i);
            c22306cM31897k7.subscribe(mkd0.m154956H(e30Var, new yfk(coreBusinessServiceM94658i)));
        }
        this.f170890d.m105113b();
    }

    /* JADX INFO: renamed from: r0 */
    public void m189499r0() {
        o6j0.m162859c("e_group_chat_manage_members", this.f170887a.pageId(), o6j0.C18854a.m162878h("groupchat_id", this.f170888b));
        Act act = this.f170887a;
        act.startActivity(GroupSettingMemberManagerAct.m49139Z1(act, this.f170888b));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
