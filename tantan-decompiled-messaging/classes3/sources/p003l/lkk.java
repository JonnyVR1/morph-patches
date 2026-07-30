package p003l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupSetAct;
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupSetMemberItemView;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.Permissions;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.c3c0;
import l.cwf0;
import l.e51;
import l.er2;
import l.fce;
import l.i0e;
import l.j760;
import l.l5j0;
import l.l6c0;
import l.lsi0;
import l.o6j0;
import l.p4c0;
import l.qib0;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p028v.VDraweeView;
import p028v.VFrame;
import p028v.VImage;
import p028v.VLinear;
import p028v.VSwitch;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class lkk implements s7m<rjk> {

    /* JADX INFO: renamed from: A */
    public VText f5326A;

    /* JADX INFO: renamed from: B */
    public VLinear f5327B;

    /* JADX INFO: renamed from: C */
    public VText f5328C;

    /* JADX INFO: renamed from: D */
    public VFrame f5329D;

    /* JADX INFO: renamed from: E */
    public VImage f5330E;

    /* JADX INFO: renamed from: F */
    public VFrame f5331F;

    /* JADX INFO: renamed from: G */
    public VSwitch f5332G;

    /* JADX INFO: renamed from: H */
    public VText f5333H;

    /* JADX INFO: renamed from: I */
    public GroupSetAct f5334I;

    /* JADX INFO: renamed from: J */
    public rjk f5335J;

    /* JADX INFO: renamed from: K */
    public GroupSetMemberItemView[] f5336K;

    /* JADX INFO: renamed from: a */
    public VFrame f5337a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5338b;

    /* JADX INFO: renamed from: c */
    public VText f5339c;

    /* JADX INFO: renamed from: d */
    public VText f5340d;

    /* JADX INFO: renamed from: e */
    public VText f5341e;

    /* JADX INFO: renamed from: f */
    public VFrame f5342f;

    /* JADX INFO: renamed from: g */
    public VText f5343g;

    /* JADX INFO: renamed from: h */
    public VLinear f5344h;

    /* JADX INFO: renamed from: i */
    public GroupSetMemberItemView f5345i;

    /* JADX INFO: renamed from: j */
    public GroupSetMemberItemView f5346j;

    /* JADX INFO: renamed from: k */
    public GroupSetMemberItemView f5347k;

    /* JADX INFO: renamed from: l */
    public GroupSetMemberItemView f5348l;

    /* JADX INFO: renamed from: m */
    public GroupSetMemberItemView f5349m;

    /* JADX INFO: renamed from: n */
    public VLinear f5350n;

    /* JADX INFO: renamed from: o */
    public VText f5351o;

    /* JADX INFO: renamed from: p */
    public VFrame f5352p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f5353q;

    /* JADX INFO: renamed from: r */
    public VImage f5354r;

    /* JADX INFO: renamed from: s */
    public VLinear f5355s;

    /* JADX INFO: renamed from: t */
    public VText f5356t;

    /* JADX INFO: renamed from: u */
    public VLinear f5357u;

    /* JADX INFO: renamed from: v */
    public VText f5358v;

    /* JADX INFO: renamed from: w */
    public View f5359w;

    /* JADX INFO: renamed from: x */
    public VLinear f5360x;

    /* JADX INFO: renamed from: y */
    public VText f5361y;

    /* JADX INFO: renamed from: z */
    public VLinear f5362z;

    /* JADX INFO: renamed from: l.lkk$a */
    public class C0406a extends er2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f5363a;

        public C0406a(String str) {
            this.f5363a = str;
        }

        public String pageId() {
            return this.f5363a;
        }
    }

    /* JADX INFO: renamed from: l.lkk$b */
    public static class C0407b {
        /* JADX INFO: renamed from: b */
        public static void m6124b(lkk lkkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            lkkVar.f5337a = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            lkkVar.f5338b = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
            lkkVar.f5339c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
            lkkVar.f5340d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
            lkkVar.f5341e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
            lkkVar.f5342f = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            lkkVar.f5343g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
            lkkVar.f5344h = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            lkkVar.f5345i = (GroupSetMemberItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
            lkkVar.f5346j = (GroupSetMemberItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
            lkkVar.f5347k = (GroupSetMemberItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(2);
            lkkVar.f5348l = (GroupSetMemberItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(3);
            lkkVar.f5349m = (GroupSetMemberItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(4);
            lkkVar.f5350n = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
            lkkVar.f5351o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
            lkkVar.f5352p = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
            lkkVar.f5353q = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
            lkkVar.f5354r = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
            lkkVar.f5355s = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4);
            lkkVar.f5356t = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(1);
            lkkVar.f5357u = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(6);
            lkkVar.f5358v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(6)).getChildAt(1);
            lkkVar.f5359w = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(7);
            lkkVar.f5360x = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(8);
            lkkVar.f5361y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(8)).getChildAt(1);
            lkkVar.f5362z = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(10);
            lkkVar.f5326A = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(10)).getChildAt(1);
            lkkVar.f5327B = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(12);
            lkkVar.f5328C = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(12)).getChildAt(1);
            lkkVar.f5329D = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            lkkVar.f5330E = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
            lkkVar.f5331F = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
            lkkVar.f5332G = (VSwitch) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
            lkkVar.f5333H = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        }

        /* JADX INFO: renamed from: c */
        public static View m6125c(lkk lkkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.y0, viewGroup, false);
            m6124b(lkkVar, viewInflate);
            return viewInflate;
        }
    }

    public lkk(GroupSetAct groupSetAct) {
        this.f5334I = groupSetAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m6085o0(View view) {
        this.f5335J.m7316F0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m6087p0(View view) {
        this.f5335J.m7317G0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m6089r0(View view) {
        o6j0.c("e_delete_and_leave", this.f5335J.pageId(), new o6j0.a[0]);
        boolean zM7321L0 = this.f5335J.m7321L0();
        rjk rjkVar = this.f5335J;
        if (zM7321L0) {
            o6j0.c("e_dissolution_group", rjkVar.pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", this.f5335J.m7318H0())});
        } else {
            o6j0.c("e_group_chat_delete_and_leave", rjkVar.pageId(), new o6j0.a[0]);
        }
        final String str = this.f5335J.m7321L0() ? "p_dissolution_group" : "p_leave_group_popup";
        final cwf0 cwf0Var = new cwf0(new C0406a(str));
        cwf0Var.p(new j760[]{j760.a("groupchat_id", this.f5335J.m7318H0()), j760.a("is_anonymou_group", Integer.valueOf(this.f5335J.m7322N0() ? 1 : 0))});
        Dialog.e eVarDialog = this.f5334I.dialog();
        boolean zM7321L1 = this.f5335J.m7321L0();
        GroupSetAct groupSetAct = this.f5334I;
        eVarDialog.e0(vwb.f0(new String[]{zM7321L1 ? groupSetAct.string(R.string.b) : groupSetAct.string(R.string.N2), this.f5334I.string(R.string.a)})).g0(new Dialog.g() { // from class: l.xjk
            /* JADX INFO: renamed from: a */
            public final void m8708a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f8790a.m6120q0(str, dialog, view2, i, charSequence);
            }
        }).V(new DialogInterface.OnDismissListener() { // from class: l.yjk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0Var);
            }
        }).z().show();
        i0e.f(cwf0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m6091s0(View view) {
        zvf0.r("e_search_chat_history", this.f5335J.pageId());
        this.f5334I.startActivity(CoreModule.P().i().P2(this.f5334I, this.f5335J.m7342z0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m6092t0(View view) {
        this.f5335J.m7313C0(this.f5351o.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m6094u0(View view) {
        this.f5335J.m7337e1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m6096v0(View view) {
        this.f5335J.m7312A0(this.f5356t.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m6099x0(View view) {
        this.f5335J.m7338f1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m6101y0(View view) {
        this.f5335J.m7319I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m6103z0(View view) {
        this.f5335J.m7314D0(this.f5326A.getText().toString());
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m6104A0(CompoundButton compoundButton, boolean z) {
        this.f5335J.m7336d1(z);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m6105B0(View view) {
        this.f5335J.m7317G0();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6106C0() {
        return this.f5334I;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m6107D0(ChatGroup chatGroup, View view) {
        o6j0.c("e_group_chat_settings_invite", this.f5334I.pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", ((DbObject) chatGroup).id)});
        Permissions permissions = chatGroup.permissions;
        boolean z = permissions.canShareToTantan;
        if (z && permissions.canShareToWeChat) {
            m6116k0();
        } else if (permissions.canShareToWeChat) {
            this.f5335J.m7340h1();
        } else if (z) {
            this.f5335J.m7339g1();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: E0 */
    public void m6108E0(ChatGroup chatGroup) {
        if (vwb.J(chatGroup.avatars)) {
            qib0.G.Y0(this.f5338b, c3c0.I0);
        } else {
            qib0.G.Q0(this.f5338b, ((Picture) chatGroup.avatars.get(0)).profileSmall());
        }
        this.f5339c.setText(chatGroup.name);
        if (TextUtils.isEmpty(chatGroup.category.name) || chatGroup.category.hidden) {
            xdl0.M(this.f5340d, false);
        } else {
            xdl0.M(this.f5340d, true);
            this.f5340d.setText(chatGroup.category.name);
        }
        if (!TextUtils.isEmpty(chatGroup.category.backgroundColor)) {
            this.f5340d.setBackground(fce.b(Color.parseColor(chatGroup.category.backgroundColor), t100.d(4.0f)));
        }
        if (!TextUtils.isEmpty(chatGroup.category.textColor)) {
            this.f5340d.setTextColor(Color.parseColor(chatGroup.category.textColor));
        }
        this.f5341e.setText(chatGroup.description);
        this.f5351o.setText(chatGroup.name);
        this.f5343g.setText(String.format("%1$s %2$s/%3$s", this.f5334I.string(R.string.S2), Integer.valueOf(chatGroup.memberCount), Integer.valueOf(chatGroup.memberLimit)));
        if (vwb.J(chatGroup.avatars)) {
            qib0.G.Y0(this.f5353q, c3c0.I0);
        } else {
            qib0.G.Q0(this.f5353q, ((Picture) chatGroup.avatars.get(0)).profileSmall());
        }
        this.f5358v.setText(chatGroup.publicId);
        this.f5356t.setText(chatGroup.description);
        boolean zM6117l0 = m6117l0(chatGroup);
        VText vText = this.f5351o;
        if (zM6117l0) {
            vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, c3c0.x5, 0);
            this.f5356t.setCompoundDrawablesWithIntrinsicBounds(0, 0, c3c0.x5, 0);
            xdl0.M(this.f5354r, true);
            this.f5350n.setClickable(true);
            this.f5355s.setClickable(true);
            this.f5352p.setClickable(true);
            xdl0.M(this.f5329D, false);
            this.f5333H.setText(R.string.K);
        } else {
            vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f5356t.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            xdl0.M(this.f5354r, false);
            this.f5350n.setClickable(false);
            this.f5355s.setClickable(false);
            this.f5352p.setClickable(false);
            xdl0.M(this.f5329D, true);
            this.f5333H.setText(R.string.P2);
        }
        boolean zEquals = TextUtils.equals(chatGroup.ownerUserId, CoreModule.H().userId());
        xdl0.M(this.f5360x, zEquals);
        xdl0.M(this.f5359w, zEquals);
    }

    /* JADX INFO: renamed from: G0 */
    public void m6109G0(List<ChatGroupMember> list, final ChatGroup chatGroup) {
        GroupSetMemberItemView[] groupSetMemberItemViewArr;
        if (vwb.J(list) || (groupSetMemberItemViewArr = this.f5336K) == null) {
            return;
        }
        Permissions permissions = chatGroup.permissions;
        int iMin = Math.min(list.size(), groupSetMemberItemViewArr.length - (((permissions.canShareToTantan || permissions.canShareToWeChat) ? 0 : 1) ^ 1));
        boolean zM7725s = tbk.m7725s(chatGroup);
        int i = 0;
        while (true) {
            GroupSetMemberItemView[] groupSetMemberItemViewArr2 = this.f5336K;
            if (i >= groupSetMemberItemViewArr2.length) {
                return;
            }
            xdl0.M0(groupSetMemberItemViewArr2[i], iMin >= i);
            if (iMin > i) {
                this.f5336K[i].m2246f(chatGroup, list.get(i), zM7725s, false);
                this.f5336K[i].setOnClickListener(new View.OnClickListener() { // from class: l.vjk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f8341a.m6105B0(view);
                    }
                });
            } else if (iMin == i) {
                this.f5336K[i].m2246f(chatGroup, null, false, true);
                this.f5336K[i].setOnClickListener(new View.OnClickListener() { // from class: l.wjk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f8569a.m6107D0(chatGroup, view);
                    }
                });
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m6110H0(boolean z) {
        this.f5332G.setChecked(z);
    }

    /* JADX INFO: renamed from: I0 */
    public void m6111I0(String str) {
        this.f5326A.setText(str);
    }

    /* JADX INFO: renamed from: h0 */
    public View m6112h0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0407b.m6125c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void m6114i1(rjk rjkVar) {
        this.f5335J = rjkVar;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m6112h0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public String m6115j0() {
        return this.f5351o.getText().toString();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m6116k0() {
        final l5j0 l5j0Var = new l5j0(this.f5334I);
        l5j0Var.setContentView(l6c0.B0);
        l5j0Var.setCancelable(true);
        l5j0Var.setCanceledOnTouchOutside(true);
        l5j0Var.getWindow().setDimAmount(0.3f);
        View viewG = l5j0Var.getDelegate().g(p4c0.E);
        if (NullChecker.a(viewG)) {
            viewG.setBackgroundColor(this.f5334I.getResources().getColor(android.R.color.transparent));
        }
        AppCompatTextView appCompatTextView = (VText) l5j0Var.findViewById(y4c0.f4);
        if (NullChecker.a(appCompatTextView)) {
            appCompatTextView.setText(R.string.x);
        }
        View viewFindViewById = l5j0Var.findViewById(y4c0.g5);
        if (NullChecker.a(viewFindViewById)) {
            xdl0.E0(viewFindViewById, new View.OnClickListener() { // from class: l.zjk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l5j0Var.dismiss();
                }
            });
        }
        View viewFindViewById2 = l5j0Var.findViewById(y4c0.Q1);
        if (NullChecker.a(viewFindViewById2)) {
            ((VImage) viewFindViewById2.findViewById(y4c0.C5)).setImageResource(c3c0.u0);
            xdl0.E0(viewFindViewById2, new View.OnClickListener() { // from class: l.akk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2231a.m6118m0(l5j0Var, view);
                }
            });
        }
        View viewFindViewById3 = l5j0Var.findViewById(y4c0.P1);
        if (NullChecker.a(viewFindViewById3)) {
            ((VImage) viewFindViewById3.findViewById(y4c0.V3)).setImageResource(c3c0.t0);
            ((VText) viewFindViewById3.findViewById(y4c0.W3)).setText(R.string.H);
            xdl0.E0(viewFindViewById3, new View.OnClickListener() { // from class: l.bkk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2403a.m6119n0(l5j0Var, view);
                }
            });
        }
        l5j0Var.show();
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m6117l0(ChatGroup chatGroup) {
        return TextUtils.equals(chatGroup.ownerUserId, CoreModule.H().userId());
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m6118m0(l5j0 l5j0Var, View view) {
        this.f5335J.m7340h1();
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m6119n0(l5j0 l5j0Var, View view) {
        this.f5335J.m7339g1();
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m6120q0(String str, Dialog dialog, View view, int i, CharSequence charSequence) {
        rjk rjkVar = this.f5335J;
        if (i == 0) {
            if (rjkVar.m7321L0()) {
                o6j0.c("e_group_dissolution", str, new o6j0.a[]{o6j0.a.f("is_confirm", 1)});
            } else {
                o6j0.c("e_confirm_leave_group", str, new o6j0.a[]{o6j0.a.h("groupchat_id", this.f5335J.m7318H0())});
            }
            this.f5335J.m7315E0();
        } else if (rjkVar.m7321L0()) {
            o6j0.c("e_group_dissolution", str, new o6j0.a[]{o6j0.a.f("is_confirm", 2)});
        } else {
            o6j0.c("e_cancel_leave_group", str, new o6j0.a[]{o6j0.a.h("groupchat_id", this.f5335J.m7318H0())});
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: r */
    public void m6121r() {
        xdl0.E0(this.f5337a, new View.OnClickListener() { // from class: l.sjk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7264a.m6085o0(view);
            }
        });
        xdl0.E0(this.f5342f, new View.OnClickListener() { // from class: l.ekk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3325a.m6087p0(view);
            }
        });
        xdl0.E0(this.f5350n, new View.OnClickListener() { // from class: l.fkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3654a.m6092t0(view);
            }
        });
        xdl0.E0(this.f5352p, new View.OnClickListener() { // from class: l.gkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3924a.m6094u0(view);
            }
        });
        xdl0.E0(this.f5355s, new View.OnClickListener() { // from class: l.hkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4223a.m6096v0(view);
            }
        });
        this.f5357u.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ikk
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f4433a.m6122w0(view);
            }
        });
        xdl0.E0(this.f5329D, new View.OnClickListener() { // from class: l.jkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4683a.m6099x0(view);
            }
        });
        xdl0.E0(this.f5360x, new View.OnClickListener() { // from class: l.kkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4969a.m6101y0(view);
            }
        });
        xdl0.E0(this.f5362z, new View.OnClickListener() { // from class: l.tjk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7528a.m6103z0(view);
            }
        });
        this.f5332G.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ujk
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f8003a.m6104A0(compoundButton, z);
            }
        });
        xdl0.E0(this.f5333H, new View.OnClickListener() { // from class: l.ckk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2722a.m6089r0(view);
            }
        });
        this.f5336K = new GroupSetMemberItemView[]{this.f5345i, this.f5346j, this.f5347k, this.f5348l, this.f5349m};
        if (!CoreModule.P().i().cn()) {
            xdl0.M(this.f5327B, false);
            return;
        }
        zvf0.x("e_search_chat_history", this.f5335J.pageId());
        xdl0.M(this.f5327B, true);
        xdl0.E0(this.f5327B, new View.OnClickListener() { // from class: l.dkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3015a.m6091s0(view);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ boolean m6122w0(View view) {
        if (TextUtils.isEmpty(this.f5358v.getText().toString())) {
            return true;
        }
        e51.q(this.f5358v.getText().toString());
        lsi0.w(R.string.I5);
        return true;
    }

    public void destroy() {
    }
}
