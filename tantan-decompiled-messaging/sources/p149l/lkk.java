package p149l;

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
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.Permissions;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupSetAct;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupSetMemberItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VSwitch;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class lkk implements s7m<rjk> {

    /* JADX INFO: renamed from: A */
    public VText f128552A;

    /* JADX INFO: renamed from: B */
    public VLinear f128553B;

    /* JADX INFO: renamed from: C */
    public VText f128554C;

    /* JADX INFO: renamed from: D */
    public VFrame f128555D;

    /* JADX INFO: renamed from: E */
    public VImage f128556E;

    /* JADX INFO: renamed from: F */
    public VFrame f128557F;

    /* JADX INFO: renamed from: G */
    public VSwitch f128558G;

    /* JADX INFO: renamed from: H */
    public VText f128559H;

    /* JADX INFO: renamed from: I */
    public GroupSetAct f128560I;

    /* JADX INFO: renamed from: J */
    public rjk f128561J;

    /* JADX INFO: renamed from: K */
    public GroupSetMemberItemView[] f128562K;

    /* JADX INFO: renamed from: a */
    public VFrame f128563a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f128564b;

    /* JADX INFO: renamed from: c */
    public VText f128565c;

    /* JADX INFO: renamed from: d */
    public VText f128566d;

    /* JADX INFO: renamed from: e */
    public VText f128567e;

    /* JADX INFO: renamed from: f */
    public VFrame f128568f;

    /* JADX INFO: renamed from: g */
    public VText f128569g;

    /* JADX INFO: renamed from: h */
    public VLinear f128570h;

    /* JADX INFO: renamed from: i */
    public GroupSetMemberItemView f128571i;

    /* JADX INFO: renamed from: j */
    public GroupSetMemberItemView f128572j;

    /* JADX INFO: renamed from: k */
    public GroupSetMemberItemView f128573k;

    /* JADX INFO: renamed from: l */
    public GroupSetMemberItemView f128574l;

    /* JADX INFO: renamed from: m */
    public GroupSetMemberItemView f128575m;

    /* JADX INFO: renamed from: n */
    public VLinear f128576n;

    /* JADX INFO: renamed from: o */
    public VText f128577o;

    /* JADX INFO: renamed from: p */
    public VFrame f128578p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f128579q;

    /* JADX INFO: renamed from: r */
    public VImage f128580r;

    /* JADX INFO: renamed from: s */
    public VLinear f128581s;

    /* JADX INFO: renamed from: t */
    public VText f128582t;

    /* JADX INFO: renamed from: u */
    public VLinear f128583u;

    /* JADX INFO: renamed from: v */
    public VText f128584v;

    /* JADX INFO: renamed from: w */
    public View f128585w;

    /* JADX INFO: renamed from: x */
    public VLinear f128586x;

    /* JADX INFO: renamed from: y */
    public VText f128587y;

    /* JADX INFO: renamed from: z */
    public VLinear f128588z;

    /* JADX INFO: renamed from: l.lkk$a */
    public class C18248a extends er2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f128589a;

        public C18248a(String str) {
            this.f128589a = str;
        }

        @Override // p149l.n3m
        public String pageId() {
            return this.f128589a;
        }
    }

    /* JADX INFO: renamed from: l.lkk$b */
    public static class C18249b {
        /* JADX INFO: renamed from: b */
        public static void m150367b(lkk lkkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            lkkVar.f128563a = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            lkkVar.f128564b = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
            lkkVar.f128565c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
            lkkVar.f128566d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
            lkkVar.f128567e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
            lkkVar.f128568f = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            lkkVar.f128569g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
            lkkVar.f128570h = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            lkkVar.f128571i = (GroupSetMemberItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
            lkkVar.f128572j = (GroupSetMemberItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
            lkkVar.f128573k = (GroupSetMemberItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(2);
            lkkVar.f128574l = (GroupSetMemberItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(3);
            lkkVar.f128575m = (GroupSetMemberItemView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(4);
            lkkVar.f128576n = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
            lkkVar.f128577o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
            lkkVar.f128578p = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
            lkkVar.f128579q = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
            lkkVar.f128580r = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
            lkkVar.f128581s = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4);
            lkkVar.f128582t = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(1);
            lkkVar.f128583u = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(6);
            lkkVar.f128584v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(6)).getChildAt(1);
            lkkVar.f128585w = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(7);
            lkkVar.f128586x = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(8);
            lkkVar.f128587y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(8)).getChildAt(1);
            lkkVar.f128588z = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(10);
            lkkVar.f128552A = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(10)).getChildAt(1);
            lkkVar.f128553B = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(12);
            lkkVar.f128554C = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(12)).getChildAt(1);
            lkkVar.f128555D = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            lkkVar.f128556E = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
            lkkVar.f128557F = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
            lkkVar.f128558G = (VSwitch) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(1);
            lkkVar.f128559H = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        }

        /* JADX INFO: renamed from: c */
        public static View m150368c(lkk lkkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.f126600y0, viewGroup, false);
            m150367b(lkkVar, viewInflate);
            return viewInflate;
        }
    }

    public lkk(GroupSetAct groupSetAct) {
        this.f128560I = groupSetAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m150330o0(View view) {
        this.f128561J.m179632F0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m150332p0(View view) {
        this.f128561J.m179633G0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m150334r0(View view) {
        o6j0.m162859c("e_delete_and_leave", this.f128561J.pageId(), new o6j0.C18854a[0]);
        boolean zM179637L0 = this.f128561J.m179637L0();
        rjk rjkVar = this.f128561J;
        if (zM179637L0) {
            o6j0.m162859c("e_dissolution_group", rjkVar.pageId(), o6j0.C18854a.m162878h("groupchat_id", this.f128561J.m179634H0()));
        } else {
            o6j0.m162859c("e_group_chat_delete_and_leave", rjkVar.pageId(), new o6j0.C18854a[0]);
        }
        final String str = this.f128561J.m179637L0() ? "p_dissolution_group" : "p_leave_group_popup";
        final cwf0 cwf0Var = new cwf0(new C18248a(str));
        cwf0Var.m109040p(j760.m140076a("groupchat_id", this.f128561J.m179634H0()), j760.m140076a("is_anonymou_group", Integer.valueOf(this.f128561J.m179638N0() ? 1 : 0)));
        Dialog.C4309e c4309eDialog = this.f128560I.dialog();
        boolean zM179637L1 = this.f128561J.m179637L0();
        GroupSetAct groupSetAct = this.f128560I;
        c4309eDialog.m20535e0(vwb.m200324f0(zM179637L1 ? groupSetAct.string(R$string.f20925b) : groupSetAct.string(R$string.f20815N2), this.f128560I.string(R$string.f20916a))).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.xjk
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f193227a.m150363q0(str, dialog, view2, i, charSequence);
            }
        }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.yjk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0Var);
            }
        }).m20567z().show();
        i0e.m133797f(cwf0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m150336s0(View view) {
        zvf0.m220396r("e_search_chat_history", this.f128561J.pageId());
        this.f128560I.startActivity(CoreModule.m29935P().m94658i().mo158285P2(this.f128560I, this.f128561J.m179656z0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m150337t0(View view) {
        this.f128561J.m179629C0(this.f128577o.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m150339u0(View view) {
        this.f128561J.m179651e1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m150341v0(View view) {
        this.f128561J.m179628A0(this.f128582t.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m150344x0(View view) {
        this.f128561J.m179652f1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m150346y0(View view) {
        this.f128561J.m179635I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m150348z0(View view) {
        this.f128561J.m179630D0(this.f128552A.getText().toString());
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m150349A0(CompoundButton compoundButton, boolean z) {
        this.f128561J.m179650d1(z);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m150350B0(View view) {
        this.f128561J.m179633G0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f128560I;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m150351D0(ChatGroup chatGroup, View view) {
        o6j0.m162859c("e_group_chat_settings_invite", this.f128560I.pageId(), o6j0.C18854a.m162878h("groupchat_id", chatGroup.f56011id));
        Permissions permissions = chatGroup.permissions;
        boolean z = permissions.canShareToTantan;
        if (z && permissions.canShareToWeChat) {
            m150359k0();
        } else if (permissions.canShareToWeChat) {
            this.f128561J.m179654h1();
        } else if (z) {
            this.f128561J.m179653g1();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m150352E0(ChatGroup chatGroup) {
        if (vwb.m200296J(chatGroup.avatars)) {
            qib0.f154691G.m102354Y0(this.f128564b, c3c0.f78540I0);
        } else {
            qib0.f154691G.m102341Q0(this.f128564b, chatGroup.avatars.get(0).profileSmall());
        }
        this.f128565c.setText(chatGroup.name);
        if (TextUtils.isEmpty(chatGroup.category.name) || chatGroup.category.hidden) {
            xdl0.m208344M(this.f128566d, false);
        } else {
            xdl0.m208344M(this.f128566d, true);
            this.f128566d.setText(chatGroup.category.name);
        }
        if (!TextUtils.isEmpty(chatGroup.category.backgroundColor)) {
            this.f128566d.setBackground(fce.m120425b(Color.parseColor(chatGroup.category.backgroundColor), t100.m186890d(4.0f)));
        }
        if (!TextUtils.isEmpty(chatGroup.category.textColor)) {
            this.f128566d.setTextColor(Color.parseColor(chatGroup.category.textColor));
        }
        this.f128567e.setText(chatGroup.description);
        this.f128577o.setText(chatGroup.name);
        this.f128569g.setText(String.format("%1$s %2$s/%3$s", this.f128560I.string(R$string.f20855S2), Integer.valueOf(chatGroup.memberCount), Integer.valueOf(chatGroup.memberLimit)));
        if (vwb.m200296J(chatGroup.avatars)) {
            qib0.f154691G.m102354Y0(this.f128579q, c3c0.f78540I0);
        } else {
            qib0.f154691G.m102341Q0(this.f128579q, chatGroup.avatars.get(0).profileSmall());
        }
        this.f128584v.setText(chatGroup.publicId);
        this.f128582t.setText(chatGroup.description);
        boolean zM150360l0 = m150360l0(chatGroup);
        VText vText = this.f128577o;
        if (zM150360l0) {
            vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, c3c0.f78905x5, 0);
            this.f128582t.setCompoundDrawablesWithIntrinsicBounds(0, 0, c3c0.f78905x5, 0);
            xdl0.m208344M(this.f128580r, true);
            this.f128576n.setClickable(true);
            this.f128581s.setClickable(true);
            this.f128578p.setClickable(true);
            xdl0.m208344M(this.f128555D, false);
            this.f128559H.setText(R$string.f20788K);
        } else {
            vText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f128582t.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            xdl0.m208344M(this.f128580r, false);
            this.f128576n.setClickable(false);
            this.f128581s.setClickable(false);
            this.f128578p.setClickable(false);
            xdl0.m208344M(this.f128555D, true);
            this.f128559H.setText(R$string.f20831P2);
        }
        boolean zEquals = TextUtils.equals(chatGroup.ownerUserId, CoreModule.m29931H().userId());
        xdl0.m208344M(this.f128586x, zEquals);
        xdl0.m208344M(this.f128585w, zEquals);
    }

    /* JADX INFO: renamed from: G0 */
    public void m150353G0(List<ChatGroupMember> list, final ChatGroup chatGroup) {
        GroupSetMemberItemView[] groupSetMemberItemViewArr;
        if (vwb.m200296J(list) || (groupSetMemberItemViewArr = this.f128562K) == null) {
            return;
        }
        Permissions permissions = chatGroup.permissions;
        int iMin = Math.min(list.size(), groupSetMemberItemViewArr.length - (((permissions.canShareToTantan || permissions.canShareToWeChat) ? 0 : 1) ^ 1));
        boolean zM187872s = tbk.m187872s(chatGroup);
        int i = 0;
        while (true) {
            GroupSetMemberItemView[] groupSetMemberItemViewArr2 = this.f128562K;
            if (i >= groupSetMemberItemViewArr2.length) {
                return;
            }
            xdl0.m208345M0(groupSetMemberItemViewArr2[i], iMin >= i);
            if (iMin > i) {
                this.f128562K[i].m49133f(chatGroup, list.get(i), zM187872s, false);
                this.f128562K[i].setOnClickListener(new View.OnClickListener() { // from class: l.vjk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f181737a.m150350B0(view);
                    }
                });
            } else if (iMin == i) {
                this.f128562K[i].m49133f(chatGroup, null, false, true);
                this.f128562K[i].setOnClickListener(new View.OnClickListener() { // from class: l.wjk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f186658a.m150351D0(chatGroup, view);
                    }
                });
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m150354H0(boolean z) {
        this.f128558G.setChecked(z);
    }

    /* JADX INFO: renamed from: I0 */
    public void m150355I0(String str) {
        this.f128552A.setText(str);
    }

    /* JADX INFO: renamed from: h0 */
    public View m150356h0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C18249b.m150368c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rjk rjkVar) {
        this.f128561J = rjkVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m150356h0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public String m150358j0() {
        return this.f128577o.getText().toString();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m150359k0() {
        final l5j0 l5j0Var = new l5j0(this.f128560I);
        l5j0Var.setContentView(l6c0.f126263B0);
        l5j0Var.setCancelable(true);
        l5j0Var.setCanceledOnTouchOutside(true);
        l5j0Var.getWindow().setDimAmount(0.3f);
        View viewMo302g = l5j0Var.getDelegate().mo302g(p4c0.f147063E);
        if (NullChecker.m81303a(viewMo302g)) {
            viewMo302g.setBackgroundColor(this.f128560I.getResources().getColor(R.color.transparent));
        }
        VText vText = (VText) l5j0Var.findViewById(y4c0.f196127f4);
        if (NullChecker.m81303a(vText)) {
            vText.setText(R$string.f21116x);
        }
        View viewFindViewById = l5j0Var.findViewById(y4c0.f196135g5);
        if (NullChecker.m81303a(viewFindViewById)) {
            xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.zjk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l5j0Var.m101651T();
                }
            });
        }
        View viewFindViewById2 = l5j0Var.findViewById(y4c0.f196029Q1);
        if (NullChecker.m81303a(viewFindViewById2)) {
            ((VImage) viewFindViewById2.findViewById(y4c0.f195948C5)).setImageResource(c3c0.f78873u0);
            xdl0.m208329E0(viewFindViewById2, new View.OnClickListener() { // from class: l.akk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f70281a.m150361m0(l5j0Var, view);
                }
            });
        }
        View viewFindViewById3 = l5j0Var.findViewById(y4c0.f196023P1);
        if (NullChecker.m81303a(viewFindViewById3)) {
            ((VImage) viewFindViewById3.findViewById(y4c0.f196061V3)).setImageResource(c3c0.f78864t0);
            ((VText) viewFindViewById3.findViewById(y4c0.f196067W3)).setText(R$string.f20764H);
            xdl0.m208329E0(viewFindViewById3, new View.OnClickListener() { // from class: l.bkk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f76048a.m150362n0(l5j0Var, view);
                }
            });
        }
        l5j0Var.show();
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m150360l0(ChatGroup chatGroup) {
        return TextUtils.equals(chatGroup.ownerUserId, CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m150361m0(l5j0 l5j0Var, View view) {
        this.f128561J.m179654h1();
        l5j0Var.m101651T();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m150362n0(l5j0 l5j0Var, View view) {
        this.f128561J.m179653g1();
        l5j0Var.m101651T();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m150363q0(String str, Dialog dialog, View view, int i, CharSequence charSequence) {
        rjk rjkVar = this.f128561J;
        if (i == 0) {
            if (rjkVar.m179637L0()) {
                o6j0.m162859c("e_group_dissolution", str, o6j0.C18854a.m162876f("is_confirm", 1));
            } else {
                o6j0.m162859c("e_confirm_leave_group", str, o6j0.C18854a.m162878h("groupchat_id", this.f128561J.m179634H0()));
            }
            this.f128561J.m179631E0();
        } else if (rjkVar.m179637L0()) {
            o6j0.m162859c("e_group_dissolution", str, o6j0.C18854a.m162876f("is_confirm", 2));
        } else {
            o6j0.m162859c("e_cancel_leave_group", str, o6j0.C18854a.m162878h("groupchat_id", this.f128561J.m179634H0()));
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: r */
    public void m150364r() {
        xdl0.m208329E0(this.f128563a, new View.OnClickListener() { // from class: l.sjk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164845a.m150330o0(view);
            }
        });
        xdl0.m208329E0(this.f128568f, new View.OnClickListener() { // from class: l.ekk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91991a.m150332p0(view);
            }
        });
        xdl0.m208329E0(this.f128576n, new View.OnClickListener() { // from class: l.fkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98079a.m150337t0(view);
            }
        });
        xdl0.m208329E0(this.f128578p, new View.OnClickListener() { // from class: l.gkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103203a.m150339u0(view);
            }
        });
        xdl0.m208329E0(this.f128581s, new View.OnClickListener() { // from class: l.hkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108241a.m150341v0(view);
            }
        });
        this.f128583u.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ikk
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f113681a.m150365w0(view);
            }
        });
        xdl0.m208329E0(this.f128555D, new View.OnClickListener() { // from class: l.jkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118390a.m150344x0(view);
            }
        });
        xdl0.m208329E0(this.f128586x, new View.OnClickListener() { // from class: l.kkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123567a.m150346y0(view);
            }
        });
        xdl0.m208329E0(this.f128588z, new View.OnClickListener() { // from class: l.tjk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170758a.m150348z0(view);
            }
        });
        this.f128558G.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ujk
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f176769a.m150349A0(compoundButton, z);
            }
        });
        xdl0.m208329E0(this.f128559H, new View.OnClickListener() { // from class: l.ckk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81340a.m150334r0(view);
            }
        });
        this.f128562K = new GroupSetMemberItemView[]{this.f128571i, this.f128572j, this.f128573k, this.f128574l, this.f128575m};
        if (!CoreModule.m29935P().m94658i().mo33479cn()) {
            xdl0.m208344M(this.f128553B, false);
            return;
        }
        zvf0.m220402x("e_search_chat_history", this.f128561J.pageId());
        xdl0.m208344M(this.f128553B, true);
        xdl0.m208329E0(this.f128553B, new View.OnClickListener() { // from class: l.dkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86664a.m150336s0(view);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ boolean m150365w0(View view) {
        if (TextUtils.isEmpty(this.f128584v.getText().toString())) {
            return true;
        }
        e51.m114766q(this.f128584v.getText().toString());
        lsi0.m151593w(R$string.f20778I5);
        return true;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
