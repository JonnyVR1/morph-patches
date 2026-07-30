package p003l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupSettingManagerAct;
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupSettingMemberManagerAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.JoinCondition;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.Objects;
import l.c40;
import l.cwf0;
import l.i0e;
import l.j760;
import l.jq2;
import l.mkd0;
import l.o6j0;
import l.roj0;
import l.vwb;
import l.yfk;
import p014rx.C1099c;
import p028v.VListCell;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class tkk extends jq2<xkk> {

    /* JADX INFO: renamed from: a */
    public final Act f7552a;

    /* JADX INFO: renamed from: b */
    public String f7553b;

    /* JADX INFO: renamed from: c */
    public c40 f7554c;

    /* JADX INFO: renamed from: d */
    public c40 f7555d;

    /* JADX INFO: renamed from: e */
    public int f7556e;

    public tkk(Act act) {
        super(act);
        this.f7556e = 0;
        this.f7552a = act;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m7804f0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: Z */
    public void m7810Z() {
        super.Z();
        this.f7553b = this.f7552a.getIntent().getStringExtra(GroupSettingManagerAct.f1693f);
    }

    /* JADX INFO: renamed from: a0 */
    public void m7811a0() {
        super.a0();
        duringCreated(CoreModule.c.g0.o6(this.f7553b)).subscribe((m250) mkd0.G(new e30() { // from class: l.mkk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5681a.m7814n0((ChatGroup) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public void m7812l0() {
        c40.b bVar = new c40.b(this.f7552a);
        bVar.I(this.f7552a.getResources().getString(R.string.a));
        bVar.U(new View.OnClickListener() { // from class: l.qkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6649a.m7815o0(view);
            }
        });
        ArrayList arrayList = new ArrayList();
        String string = this.f7552a.getResources().getString(R.string.y0);
        String string2 = this.f7552a.getResources().getString(R.string.z0);
        arrayList.add(string);
        arrayList.add(string2);
        bVar.Q(arrayList);
        bVar.V(new c40.d() { // from class: l.rkk
            /* JADX INFO: renamed from: a */
            public final void m7346a(VListCell vListCell, VListCell.C1338a c1338a, int i) {
                c1338a.f12784a.toString();
            }
        });
        c40 c40VarF = bVar.F();
        this.f7554c = c40VarF;
        c40VarF.f();
    }

    /* JADX INFO: renamed from: m0 */
    public void m7813m0(final ChatGroup chatGroup) {
        final cwf0 cwf0Var = new cwf0("p_group_chat_add_method_popup", Dialog.class.getName());
        if (TextUtils.equals(chatGroup.ownerUserId, CoreModule.H().userId())) {
            this.f7556e = 1;
        } else if (!vwb.J(chatGroup.adminUserIds) && chatGroup.adminUserIds.contains(CoreModule.H().userId())) {
            this.f7556e = 2;
        }
        cwf0Var.p(new j760[]{vwb.Y("user_group_title", Integer.valueOf(this.f7556e))});
        i0e.f(cwf0Var);
        o6j0.c("e_group_chat_manage_add_method", this.f7552a.pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", this.f7553b)});
        c40.b bVar = new c40.b(this.f7552a);
        bVar.I(this.f7552a.getResources().getString(R.string.a));
        bVar.U(new View.OnClickListener() { // from class: l.nkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5919a.m7816p0(view);
            }
        });
        ArrayList arrayList = new ArrayList();
        final String strString = this.f7552a.string(R.string.y0);
        final String strString2 = this.f7552a.string(R.string.z0);
        arrayList.add(strString);
        arrayList.add(strString2);
        bVar.Q(arrayList);
        bVar.T(new DialogInterface.OnDismissListener() { // from class: l.okk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0Var);
            }
        });
        bVar.V(new c40.d() { // from class: l.pkk
            /* JADX INFO: renamed from: a */
            public final void m6889a(VListCell vListCell, VListCell.C1338a c1338a, int i) {
                this.f6450a.m7817q0(strString, strString2, chatGroup, vListCell, c1338a, i);
            }
        });
        c40 c40VarF = bVar.F();
        this.f7555d = c40VarF;
        c40VarF.f();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m7814n0(ChatGroup chatGroup) {
        ((xkk) ((jq2) this).viewModel).m8723m(chatGroup);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m7815o0(View view) {
        this.f7554c.b();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m7816p0(View view) {
        this.f7555d.b();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m7817q0(String str, String str2, ChatGroup chatGroup, VListCell vListCell, VListCell.C1338a c1338a, int i) {
        JoinCondition joinCondition;
        String string = c1338a.f12784a.toString();
        if (string.equals(str)) {
            o6j0.c("e_group_chat_add_method_popup_anyone", "p_group_chat_add_method_popup", new o6j0.a[]{o6j0.a.f("user_group_title", this.f7556e)});
            joinCondition = JoinCondition.get("noApplyRequired");
        } else if (string.equals(str2)) {
            o6j0.c("e_group_chat_add_method_popup_review", "p_group_chat_add_method_popup", new o6j0.a[]{o6j0.a.f("user_group_title", this.f7556e)});
            joinCondition = JoinCondition.get("applyRequired");
        } else {
            joinCondition = null;
        }
        if (!TEnum.equals(chatGroup.joinCondition, joinCondition)) {
            C1099c c1099cK7 = CoreModule.c.g0.k7(this.f7553b, joinCondition);
            e30 e30Var = new e30() { // from class: l.skk
                @Override // p003l.e30
                public final void call(Object obj) {
                    tkk.m7804f0((roj0) obj);
                }
            };
            CoreBusinessService coreBusinessServiceI = CoreModule.l.i();
            Objects.requireNonNull(coreBusinessServiceI);
            c1099cK7.subscribe((m250) mkd0.H(e30Var, new yfk(coreBusinessServiceI)));
        }
        this.f7555d.b();
    }

    /* JADX INFO: renamed from: r0 */
    public void m7818r0() {
        o6j0.c("e_group_chat_manage_members", this.f7552a.pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", this.f7553b)});
        Act act = this.f7552a;
        act.startActivity(GroupSettingMemberManagerAct.m2254Z1(act, this.f7553b));
    }

    public void destroy() {
    }
}
