package p153l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.Permissions;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupSetAct;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupSetMemberItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VSwitch;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class bnk implements iam<hmk> {

    /* JADX INFO: renamed from: A */
    public VText f77496A;

    /* JADX INFO: renamed from: B */
    public VLinear f77497B;

    /* JADX INFO: renamed from: C */
    public VText f77498C;

    /* JADX INFO: renamed from: D */
    public VFrame f77499D;

    /* JADX INFO: renamed from: E */
    public VImage f77500E;

    /* JADX INFO: renamed from: F */
    public VFrame f77501F;

    /* JADX INFO: renamed from: G */
    public VSwitch f77502G;

    /* JADX INFO: renamed from: H */
    public VText f77503H;

    /* JADX INFO: renamed from: I */
    public GroupSetAct f77504I;

    /* JADX INFO: renamed from: J */
    public hmk f77505J;

    /* JADX INFO: renamed from: K */
    public GroupSetMemberItemView[] f77506K;

    /* JADX INFO: renamed from: a */
    public VFrame f77507a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f77508b;

    /* JADX INFO: renamed from: c */
    public VText f77509c;

    /* JADX INFO: renamed from: d */
    public VText f77510d;

    /* JADX INFO: renamed from: e */
    public VText f77511e;

    /* JADX INFO: renamed from: f */
    public VFrame f77512f;

    /* JADX INFO: renamed from: g */
    public VText f77513g;

    /* JADX INFO: renamed from: h */
    public VLinear f77514h;

    /* JADX INFO: renamed from: i */
    public GroupSetMemberItemView f77515i;

    /* JADX INFO: renamed from: j */
    public GroupSetMemberItemView f77516j;

    /* JADX INFO: renamed from: k */
    public GroupSetMemberItemView f77517k;

    /* JADX INFO: renamed from: l */
    public GroupSetMemberItemView f77518l;

    /* JADX INFO: renamed from: m */
    public GroupSetMemberItemView f77519m;

    /* JADX INFO: renamed from: n */
    public VLinear f77520n;

    /* JADX INFO: renamed from: o */
    public VText f77521o;

    /* JADX INFO: renamed from: p */
    public VFrame f77522p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f77523q;

    /* JADX INFO: renamed from: r */
    public VImage f77524r;

    /* JADX INFO: renamed from: s */
    public VLinear f77525s;

    /* JADX INFO: renamed from: t */
    public VText f77526t;

    /* JADX INFO: renamed from: u */
    public VLinear f77527u;

    /* JADX INFO: renamed from: v */
    public VText f77528v;

    /* JADX INFO: renamed from: w */
    public View f77529w;

    /* JADX INFO: renamed from: x */
    public VLinear f77530x;

    /* JADX INFO: renamed from: y */
    public VText f77531y;

    /* JADX INFO: renamed from: z */
    public VLinear f77532z;

    /* JADX INFO: renamed from: l.bnk$a */
    public class C16059a extends ur2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f77533a;

        public C16059a(String str) {
            this.f77533a = str;
        }

        @Override // p153l.e6m
        public String pageId() {
            return this.f77533a;
        }
    }

    /* JADX INFO: renamed from: l.bnk$b */
    public static class C16060b {
        /* JADX INFO: renamed from: b */
        public static void m105494b(bnk bnkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            bnkVar.f77507a = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            bnkVar.f77508b = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
            bnkVar.f77509c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
            bnkVar.f77510d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
            bnkVar.f77511e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
            bnkVar.f77512f = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            bnkVar.f77513g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
            bnkVar.f77514h = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            bnkVar.f77515i = (GroupSetMemberItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
            bnkVar.f77516j = (GroupSetMemberItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
            bnkVar.f77517k = (GroupSetMemberItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(2);
            bnkVar.f77518l = (GroupSetMemberItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(3);
            bnkVar.f77519m = (GroupSetMemberItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(4);
            bnkVar.f77520n = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
            bnkVar.f77521o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
            bnkVar.f77522p = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
            bnkVar.f77523q = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
            bnkVar.f77524r = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
            bnkVar.f77525s = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4);
            bnkVar.f77526t = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(1);
            bnkVar.f77527u = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(6);
            bnkVar.f77528v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(6)).getChildAt(1);
            bnkVar.f77529w = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(7);
            bnkVar.f77530x = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(8);
            bnkVar.f77531y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(8)).getChildAt(1);
            bnkVar.f77532z = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(10);
            bnkVar.f77496A = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(10)).getChildAt(1);
            bnkVar.f77497B = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(12);
            bnkVar.f77498C = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(12)).getChildAt(1);
            bnkVar.f77499D = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            bnkVar.f77500E = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
            bnkVar.f77501F = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
            bnkVar.f77502G = (VSwitch) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
            bnkVar.f77503H = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        }

        /* JADX INFO: renamed from: c */
        public static View m105495c(bnk bnkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(qec0.f157156y0, viewGroup, false);
            m105494b(bnkVar, viewInflate);
            return viewInflate;
        }
    }

    public bnk(GroupSetAct groupSetAct) {
        this.f77504I = groupSetAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m105457o0(View view) {
        this.f77505J.m135897F0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m105459p0(View view) {
        this.f77505J.m135898G0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m105461r0(View view) {
        sfj0.m185596c("e_delete_and_leave", this.f77505J.pageId(), new sfj0.C20032a[0]);
        boolean zM135902L0 = this.f77505J.m135902L0();
        hmk hmkVar = this.f77505J;
        if (zM135902L0) {
            sfj0.m185596c("e_dissolution_group", hmkVar.pageId(), sfj0.C20032a.m185615h("groupchat_id", this.f77505J.m135899H0()));
        } else {
            sfj0.m185596c("e_group_chat_delete_and_leave", hmkVar.pageId(), new sfj0.C20032a[0]);
        }
        final String str = this.f77505J.m135902L0() ? "p_dissolution_group" : "p_leave_group_popup";
        final l4g0 l4g0Var = new l4g0(new C16059a(str));
        l4g0Var.m152781p(pf60.m172085a("groupchat_id", this.f77505J.m135899H0()), pf60.m172085a("is_anonymou_group", Integer.valueOf(this.f77505J.m135903N0() ? 1 : 0)));
        Dialog.C4460e c4460eDialog = this.f77504I.dialog();
        boolean zM135902L1 = this.f77505J.m135902L0();
        GroupSetAct groupSetAct = this.f77504I;
        c4460eDialog.m21534e0(jyb.m147507f0(zM135902L1 ? groupSetAct.string(R$string.f21667b) : groupSetAct.string(R$string.f21557N2), this.f77504I.string(R$string.f21658a))).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.nmk
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f142723a.m105490q0(str, dialog, view2, i, charSequence);
            }
        }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.omk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0Var);
            }
        }).m21566z().show();
        w1e.m204402f(l4g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m105463s0(View view) {
        i4g0.m138520r("e_search_chat_history", this.f77505J.pageId());
        this.f77504I.startActivity(CoreModule.m30933P().m143412i().mo180377P2(this.f77504I, this.f77505J.m135921z0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m105464t0(View view) {
        this.f77505J.m135894C0(this.f77521o.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m105466u0(View view) {
        this.f77505J.m135916e1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m105468v0(View view) {
        this.f77505J.m135893A0(this.f77526t.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m105471x0(View view) {
        this.f77505J.m135917f1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m105473y0(View view) {
        this.f77505J.m135900I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m105475z0(View view) {
        this.f77505J.m135895D0(this.f77496A.getText().toString());
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m105476A0(CompoundButton compoundButton, boolean z) {
        this.f77505J.m135915d1(z);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m105477B0(View view) {
        this.f77505J.m135898G0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f77504I;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m105478D0(ChatGroup chatGroup, View view) {
        sfj0.m185596c("e_group_chat_settings_invite", this.f77504I.pageId(), sfj0.C20032a.m185615h("groupchat_id", chatGroup.f56859id));
        Permissions permissions = chatGroup.permissions;
        boolean z = permissions.canShareToTantan;
        if (z && permissions.canShareToWeChat) {
            m105486k0();
        } else if (permissions.canShareToWeChat) {
            this.f77505J.m135919h1();
        } else if (z) {
            this.f77505J.m135918g1();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m105479E0(ChatGroup chatGroup) {
        if (jyb.m147479J(chatGroup.avatars)) {
            uqb0.f180374G.m127138Y0(this.f77508b, ibc0.f113815I0);
        } else {
            uqb0.f180374G.m127125Q0(this.f77508b, chatGroup.avatars.get(0).profileSmall());
        }
        this.f77509c.setText(chatGroup.name);
        if (TextUtils.isEmpty(chatGroup.category.name) || chatGroup.category.hidden) {
            bnl0.m105524M(this.f77510d, false);
        } else {
            bnl0.m105524M(this.f77510d, true);
            this.f77510d.setText(chatGroup.category.name);
        }
        if (!TextUtils.isEmpty(chatGroup.category.backgroundColor)) {
            this.f77510d.setBackground(jde.m144406b(Color.parseColor(chatGroup.category.backgroundColor), qa00.m175859d(4.0f)));
        }
        if (!TextUtils.isEmpty(chatGroup.category.textColor)) {
            this.f77510d.setTextColor(Color.parseColor(chatGroup.category.textColor));
        }
        this.f77511e.setText(chatGroup.description);
        this.f77521o.setText(chatGroup.name);
        this.f77513g.setText(String.format("%1$s %2$s/%3$s", this.f77504I.string(R$string.f21597S2), Integer.valueOf(chatGroup.memberCount), Integer.valueOf(chatGroup.memberLimit)));
        if (jyb.m147479J(chatGroup.avatars)) {
            uqb0.f180374G.m127138Y0(this.f77523q, ibc0.f113815I0);
        } else {
            uqb0.f180374G.m127125Q0(this.f77523q, chatGroup.avatars.get(0).profileSmall());
        }
        this.f77528v.setText(chatGroup.publicId);
        this.f77526t.setText(chatGroup.description);
        boolean zM105487l0 = m105487l0(chatGroup);
        VText vText = this.f77521o;
        if (zM105487l0) {
            vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, ibc0.f114180x5, 0);
            this.f77526t.setCompoundDrawablesWithIntrinsicBounds(0, 0, ibc0.f114180x5, 0);
            bnl0.m105524M(this.f77524r, true);
            this.f77520n.setClickable(true);
            this.f77525s.setClickable(true);
            this.f77522p.setClickable(true);
            bnl0.m105524M(this.f77499D, false);
            this.f77503H.setText(R$string.f21530K);
        } else {
            vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f77526t.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            bnl0.m105524M(this.f77524r, false);
            this.f77520n.setClickable(false);
            this.f77525s.setClickable(false);
            this.f77522p.setClickable(false);
            bnl0.m105524M(this.f77499D, true);
            this.f77503H.setText(R$string.f21573P2);
        }
        boolean zEquals = TextUtils.equals(chatGroup.ownerUserId, CoreModule.m30929H().userId());
        bnl0.m105524M(this.f77530x, zEquals);
        bnl0.m105524M(this.f77529w, zEquals);
    }

    /* JADX INFO: renamed from: G0 */
    public void m105480G0(List<ChatGroupMember> list, final ChatGroup chatGroup) {
        GroupSetMemberItemView[] groupSetMemberItemViewArr;
        if (jyb.m147479J(list) || (groupSetMemberItemViewArr = this.f77506K) == null) {
            return;
        }
        Permissions permissions = chatGroup.permissions;
        int iMin = Math.min(list.size(), groupSetMemberItemViewArr.length - (((permissions.canShareToTantan || permissions.canShareToWeChat) ? 0 : 1) ^ 1));
        boolean zM144587s = jek.m144587s(chatGroup);
        int i = 0;
        while (true) {
            GroupSetMemberItemView[] groupSetMemberItemViewArr2 = this.f77506K;
            if (i >= groupSetMemberItemViewArr2.length) {
                return;
            }
            bnl0.m105525M0(groupSetMemberItemViewArr2[i], iMin >= i);
            if (iMin > i) {
                this.f77506K[i].m50316f(chatGroup, list.get(i), zM144587s, false);
                this.f77506K[i].setOnClickListener(new View.OnClickListener() { // from class: l.lmk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f132699a.m105477B0(view);
                    }
                });
            } else if (iMin == i) {
                this.f77506K[i].m50316f(chatGroup, null, false, true);
                this.f77506K[i].setOnClickListener(new View.OnClickListener() { // from class: l.mmk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f137603a.m105478D0(chatGroup, view);
                    }
                });
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m105481H0(boolean z) {
        this.f77502G.setChecked(z);
    }

    /* JADX INFO: renamed from: I0 */
    public void m105482I0(String str) {
        this.f77496A.setText(str);
    }

    /* JADX INFO: renamed from: h0 */
    public View m105483h0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16060b.m105495c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(hmk hmkVar) {
        this.f77505J = hmkVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m105483h0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public String m105485j0() {
        return this.f77521o.getText().toString();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m105486k0() {
        final pej0 pej0Var = new pej0(this.f77504I);
        pej0Var.setContentView(qec0.f156819B0);
        pej0Var.setCancelable(true);
        pej0Var.setCanceledOnTouchOutside(true);
        pej0Var.getWindow().setDimAmount(0.3f);
        View viewMo303g = pej0Var.getDelegate().mo303g(vcc0.f183363E);
        if (NullChecker.m82486a(viewMo303g)) {
            viewMo303g.setBackgroundColor(this.f77504I.getResources().getColor(R.color.transparent));
        }
        VText vText = (VText) pej0Var.findViewById(edc0.f93362f4);
        if (NullChecker.m82486a(vText)) {
            vText.setText(R$string.f21858x);
        }
        View viewFindViewById = pej0Var.findViewById(edc0.f93370g5);
        if (NullChecker.m82486a(viewFindViewById)) {
            bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.pmk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    pej0Var.m176562T();
                }
            });
        }
        View viewFindViewById2 = pej0Var.findViewById(edc0.f93264Q1);
        if (NullChecker.m82486a(viewFindViewById2)) {
            ((VImage) viewFindViewById2.findViewById(edc0.f93183C5)).setImageResource(ibc0.f114148u0);
            bnl0.m105509E0(viewFindViewById2, new View.OnClickListener() { // from class: l.qmk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f158378a.m105488m0(pej0Var, view);
                }
            });
        }
        View viewFindViewById3 = pej0Var.findViewById(edc0.f93258P1);
        if (NullChecker.m82486a(viewFindViewById3)) {
            ((VImage) viewFindViewById3.findViewById(edc0.f93296V3)).setImageResource(ibc0.f114139t0);
            ((VText) viewFindViewById3.findViewById(edc0.f93302W3)).setText(R$string.f21506H);
            bnl0.m105509E0(viewFindViewById3, new View.OnClickListener() { // from class: l.rmk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f163887a.m105489n0(pej0Var, view);
                }
            });
        }
        pej0Var.show();
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m105487l0(ChatGroup chatGroup) {
        return TextUtils.equals(chatGroup.ownerUserId, CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m105488m0(pej0 pej0Var, View view) {
        this.f77505J.m135919h1();
        pej0Var.m176562T();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m105489n0(pej0 pej0Var, View view) {
        this.f77505J.m135918g1();
        pej0Var.m176562T();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m105490q0(String str, Dialog dialog, View view, int i, CharSequence charSequence) {
        hmk hmkVar = this.f77505J;
        if (i == 0) {
            if (hmkVar.m135902L0()) {
                sfj0.m185596c("e_group_dissolution", str, sfj0.C20032a.m185613f("is_confirm", 1));
            } else {
                sfj0.m185596c("e_confirm_leave_group", str, sfj0.C20032a.m185615h("groupchat_id", this.f77505J.m135899H0()));
            }
            this.f77505J.m135896E0();
        } else if (hmkVar.m135902L0()) {
            sfj0.m185596c("e_group_dissolution", str, sfj0.C20032a.m185613f("is_confirm", 2));
        } else {
            sfj0.m185596c("e_cancel_leave_group", str, sfj0.C20032a.m185615h("groupchat_id", this.f77505J.m135899H0()));
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: r */
    public void m105491r() {
        bnl0.m105509E0(this.f77507a, new View.OnClickListener() { // from class: l.imk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115783a.m105457o0(view);
            }
        });
        bnl0.m105509E0(this.f77512f, new View.OnClickListener() { // from class: l.umk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179655a.m105459p0(view);
            }
        });
        bnl0.m105509E0(this.f77520n, new View.OnClickListener() { // from class: l.vmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184726a.m105464t0(view);
            }
        });
        bnl0.m105509E0(this.f77522p, new View.OnClickListener() { // from class: l.wmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189804a.m105466u0(view);
            }
        });
        bnl0.m105509E0(this.f77525s, new View.OnClickListener() { // from class: l.xmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195101a.m105468v0(view);
            }
        });
        this.f77527u.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ymk
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f200672a.m105492w0(view);
            }
        });
        bnl0.m105509E0(this.f77499D, new View.OnClickListener() { // from class: l.zmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205084a.m105471x0(view);
            }
        });
        bnl0.m105509E0(this.f77530x, new View.OnClickListener() { // from class: l.ank
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72360a.m105473y0(view);
            }
        });
        bnl0.m105509E0(this.f77532z, new View.OnClickListener() { // from class: l.jmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121682a.m105475z0(view);
            }
        });
        this.f77502G.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.kmk
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f127507a.m105476A0(compoundButton, z);
            }
        });
        bnl0.m105509E0(this.f77503H, new View.OnClickListener() { // from class: l.smk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169587a.m105461r0(view);
            }
        });
        this.f77506K = new GroupSetMemberItemView[]{this.f77515i, this.f77516j, this.f77517k, this.f77518l, this.f77519m};
        if (!CoreModule.m30933P().m143412i().mo34482cn()) {
            bnl0.m105524M(this.f77497B, false);
            return;
        }
        i4g0.m138526x("e_search_chat_history", this.f77505J.pageId());
        bnl0.m105524M(this.f77497B, true);
        bnl0.m105509E0(this.f77497B, new View.OnClickListener() { // from class: l.tmk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174946a.m105463s0(view);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ boolean m105492w0(View view) {
        if (TextUtils.isEmpty(this.f77528v.getText().toString())) {
            return true;
        }
        l51.m152911q(this.f77528v.getText().toString());
        o1j0.m165649w(R$string.f21520I5);
        return true;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
