package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.PrivilegeDescListCustomModelItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.vipfrag.VipFrag;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.putong.core.data.IdealTypes;
import com.p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.List;
import l.dac0;
import l.e16;
import l.e30;
import l.eqh0;
import l.i690;
import l.iw80;
import l.jtk;
import l.mkd0;
import l.o7r;
import l.t100;
import l.vwb;
import l.xdl0;
import p006l.dv80;
import p006l.f6c0;
import p006l.g6a;
import p006l.j5b0;
import p006l.l3b0;
import p006l.u4c0;
import p006l.w0c0;
import p006l.x2c0;
import p006l.xma;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeDescListPrivateCustomExtraItem extends ConstraintLayout {

    /* JADX INFO: renamed from: x */
    public static String f7429x = "PrivilegeDescListCustomBubbleKey";

    /* JADX INFO: renamed from: d */
    public PrivilegeDescListPrivateCustomExtraItem f7430d;

    /* JADX INFO: renamed from: e */
    public TextView f7431e;

    /* JADX INFO: renamed from: f */
    public ImageView f7432f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f7433g;

    /* JADX INFO: renamed from: h */
    public ImageView f7434h;

    /* JADX INFO: renamed from: i */
    public TextView f7435i;

    /* JADX INFO: renamed from: j */
    public TextView f7436j;

    /* JADX INFO: renamed from: k */
    public TextView f7437k;

    /* JADX INFO: renamed from: l */
    public TextView f7438l;

    /* JADX INFO: renamed from: m */
    public VRecyclerView f7439m;

    /* JADX INFO: renamed from: n */
    public View f7440n;

    /* JADX INFO: renamed from: o */
    public ImageView f7441o;

    /* JADX INFO: renamed from: p */
    public NumberFormat f7442p;

    /* JADX INFO: renamed from: q */
    public C0429a f7443q;

    /* JADX INFO: renamed from: r */
    public C0430b f7444r;

    /* JADX INFO: renamed from: s */
    public boolean f7445s;

    /* JADX INFO: renamed from: t */
    public l3b0 f7446t;

    /* JADX INFO: renamed from: u */
    public boolean f7447u;

    /* JADX INFO: renamed from: v */
    public d f7448v;

    /* JADX INFO: renamed from: w */
    public d f7449w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem$a */
    public class C0429a extends dac0<IdealTypes> {

        /* JADX INFO: renamed from: c */
        public List<IdealTypes> f7450c;

        /* JADX INFO: renamed from: d */
        public Context f7451d;

        public C0429a(Context context) {
            this.f7451d = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m10694I(View view) {
            PrivilegeDescListPrivateCustomExtraItem.this.m10691z0();
        }

        /* JADX INFO: renamed from: C */
        public int m10696C() {
            List<IdealTypes> list = this.f7450c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        /* JADX INFO: renamed from: D */
        public View m10697D(ViewGroup viewGroup, int i) {
            return o7r.a(this.f7451d).inflate(f6c0.f11993T8, viewGroup, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void m10695A(View view, IdealTypes idealTypes, int i, int i2) {
            ((PrivilegeDescListCustomModelItem) view).m7569i0(idealTypes);
            xdl0.E0(view, new View.OnClickListener() { // from class: l.hw80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f14107a.m10694I(view2);
                }
            });
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public IdealTypes getItem(int i) {
            return this.f7450c.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final void m10700J(List<IdealTypes> list) {
            this.f7450c = list;
            notifyDataSetChanged();
        }

        public long getItemId(int i) {
            return i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem$b */
    public static class C0430b implements dv80 {

        /* JADX INFO: renamed from: a */
        public final PurchaseType f7453a;

        /* JADX INFO: renamed from: b */
        public final j5b0 f7454b;

        public C0430b(PurchaseType purchaseType, j5b0 j5b0Var) {
            this.f7453a = purchaseType;
            this.f7454b = j5b0Var;
        }

        @Override // p006l.dv80
        public int getItemType() {
            return 13;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem$c */
    public class C0431c extends RecyclerView.n {
        public C0431c() {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = t100.m;
            }
            if (recyclerView.getChildAdapterPosition(view) == PrivilegeDescListPrivateCustomExtraItem.this.f7443q.m10696C() - 1) {
                rect.right = t100.m;
            } else {
                rect.right = t100.h;
            }
        }
    }

    public PrivilegeDescListPrivateCustomExtraItem(Context context) {
        super(context);
        this.f7442p = NumberFormat.getNumberInstance();
        this.f7445s = false;
        this.f7447u = false;
        this.f7448v = null;
        this.f7449w = null;
    }

    /* JADX INFO: renamed from: E0 */
    private void m10668E0(List<IdealTypes> list) {
        boolean zJ = vwb.J(list);
        VRecyclerView vRecyclerView = this.f7439m;
        if (zJ) {
            xdl0.M(vRecyclerView, false);
        } else {
            xdl0.M(vRecyclerView, true);
            this.f7443q.m10700J(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I0 */
    private void m10669I0() {
        com.p1.mobile.android.ui.bubble.d.l().u(new a(getContext()).D(xma.m27351F3() ? "购买解锁私人定制特权" : "权益包仅限黑金会员购买").k(new int[]{e16.c(getContext(), w0c0.f24613I)}).G(w0c0.f24628N).t(true).J(13.0f).y(true).e(false).j(new a.c() { // from class: l.gw80
            /* JADX INFO: renamed from: a */
            public final void m16003a(String str) {
                PrivilegeDescListPrivateCustomExtraItem.m10670h0(str);
            }
        }).E(false).b(3000L).x(t100.d(7.0f)).v(xma.m27351F3() ? t100.m : 0).q(jtk.A | jtk.E), this.f7432f, f7429x);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m10670h0(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m10679u0(View view) {
        m10669I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m10680v0(View view) {
        m10691z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m10681y0(Throwable th) {
        m10668E0(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B0 */
    public void m10682B0(dac0<dv80> dac0Var, final PutongFrag putongFrag, C0430b c0430b, PurchaseType purchaseType) {
        this.f7444r = c0430b;
        m10683D0();
        xdl0.E0(this.f7432f, new View.OnClickListener() { // from class: l.bw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9125a.m10679u0(view);
            }
        });
        xdl0.E0(this.f7436j, new View.OnClickListener() { // from class: l.cw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.r0(putongFrag.act(), "p_privilege,default");
            }
        });
        xdl0.E0(this.f7433g, new View.OnClickListener() { // from class: l.dw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10620a.m10680v0(view);
            }
        });
        if (this.f7443q == null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            C0429a c0429a = new C0429a(getContext());
            this.f7443q = c0429a;
            this.f7439m.setAdapter(c0429a);
            this.f7439m.setLayoutManager(linearLayoutManager);
            this.f7439m.addItemDecoration(new C0431c());
        }
        if (!this.f7445s) {
            CoreModule.f1534c.f3690y2.m19358P3();
        }
        dac0Var.c(putongFrag, CoreModule.f1534c.f3690y2.m19378x3()).subscribe(mkd0.H(new e30() { // from class: l.ew80
            public final void call(Object obj) {
                this.f11481a.m10690w0((PrivateCustomSetting) obj);
            }
        }, new e30() { // from class: l.fw80
            public final void call(Object obj) {
                this.f12942a.m10681y0((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D0 */
    public final void m10683D0() {
        if (g6a.m15592o()) {
            this.f7431e.setTextColor(getResources().getColor(w0c0.f24673b1));
            this.f7432f.setImageResource(x2c0.f26520ai);
            this.f7434h.setImageResource(x2c0.f26488Zh);
            this.f7437k.setTextColor(getResources().getColor(w0c0.f24677c1));
            this.f7438l.setTextColor(getResources().getColor(w0c0.f24673b1));
            this.f7436j.setTextColor(Color.parseColor("#150702"));
            this.f7436j.setTypeface(eqh0.c(3));
            this.f7436j.setBackgroundResource(x2c0.f26426Xh);
            this.f7435i.setTextColor(getResources().getColor(w0c0.f24677c1));
        }
        boolean zM27351F3 = xma.m27351F3();
        TextView textView = this.f7431e;
        if (zM27351F3) {
            textView.setText("权益包");
            xdl0.M(this.f7435i, false);
            xdl0.M(this.f7436j, true);
            ViewGroup.LayoutParams layoutParams = (ConstraintLayout.a) this.f7437k.getLayoutParams();
            int i = ((ConstraintLayout.a) layoutParams).f;
            int i2 = u4c0.f22720P0;
            if (i != i2) {
                ((ConstraintLayout.a) layoutParams).f = i2;
                this.f7437k.setLayoutParams(layoutParams);
            }
            if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    setLayoutParams(marginLayoutParams);
                }
            }
        } else {
            textView.setText("黑金会员+权益包");
            xdl0.M(this.f7435i, true);
            xdl0.M(this.f7436j, false);
            ViewGroup.LayoutParams layoutParams2 = (ConstraintLayout.a) this.f7437k.getLayoutParams();
            int i3 = ((ConstraintLayout.a) layoutParams2).f;
            int i4 = u4c0.f22611Ia;
            if (i3 != i4) {
                ((ConstraintLayout.a) layoutParams2).f = i4;
                this.f7437k.setLayoutParams(layoutParams2);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i5 = marginLayoutParams2.topMargin;
            int i6 = t100.h;
            if (i5 != i6) {
                marginLayoutParams2.topMargin = i6;
                setLayoutParams(marginLayoutParams2);
            }
        }
        xdl0.M(this.f7441o, !xma.m27351F3());
        if (!xma.m27351F3()) {
            m10685H0(this.f7446t.getIsExtraSelected());
            return;
        }
        boolean zM15592o = g6a.m15592o();
        View view = this.f7440n;
        if (zM15592o) {
            view.setBackground(new i690(i690.Companion.b()));
        } else {
            view.setBackgroundResource(x2c0.f26180Pj);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m10684G0(d dVar, d dVar2) {
        if (NullChecker.a(dVar) && NullChecker.a(dVar2)) {
            boolean zM = dVar2.m();
            d.a aVarB = zM ? dVar2.b() : dVar2.d();
            d.a aVarB2 = zM ? dVar.b() : dVar.d();
            if (NullChecker.a(aVarB) && NullChecker.a(aVarB2)) {
                StringBuilder sb = new StringBuilder();
                sb.append(aVarB.h());
                sb.append(this.f7442p.format((aVarB2.I() ? aVarB2.v() : aVarB2.t()) - (aVarB.I() ? aVarB.v() : aVarB.t())));
                sb.append("/");
                sb.append(aVarB.w());
                sb.append("个月");
                this.f7435i.setText(sb.toString());
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m10685H0(boolean z) {
        if (z) {
            boolean zM15592o = g6a.m15592o();
            ImageView imageView = this.f7441o;
            if (zM15592o) {
                imageView.setImageResource(x2c0.f26869li);
                this.f7440n.setBackground(new i690(i690.Companion.b()));
                return;
            } else {
                imageView.setImageResource(x2c0.f25901Gj);
                this.f7440n.setBackgroundResource(x2c0.f26180Pj);
                return;
            }
        }
        boolean zM15592o2 = g6a.m15592o();
        ImageView imageView2 = this.f7441o;
        if (zM15592o2) {
            imageView2.setImageResource(x2c0.f26837ki);
            this.f7440n.setBackground(new i690(i690.Companion.a()));
        } else {
            imageView2.setImageResource(x2c0.f25932Hj);
            this.f7440n.setBackgroundResource(x2c0.f26211Qj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m10686q0(this);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m10686q0(View view) {
        iw80.a(this, view);
    }

    /* JADX INFO: renamed from: r0 */
    public void m10687r0(VipFrag vipFrag, PurchaseType purchaseType, String str, final j5b0 j5b0Var) {
        l3b0 l3b0Var = new l3b0(vipFrag.act(), PurchaseType.TYPE_O_DIAMOND_PRIVATE_CUSTOM, str);
        this.f7446t = l3b0Var;
        j5b0Var.m7351N(l3b0Var);
        this.f7446t.m18558m(new l3b0.InterfaceC0962a() { // from class: l.zv80
            @Override // p006l.l3b0.InterfaceC0962a
            /* JADX INFO: renamed from: a */
            public final void mo18562a(List list) {
                this.f28995a.m10688s0(j5b0Var, list);
            }
        });
        this.f7446t.m18556k();
        j5b0Var.m7346I(new AbstractC0212a.d() { // from class: l.aw80
            @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.d
            /* JADX INFO: renamed from: a */
            public final void mo7332a(d dVar, boolean z, boolean z2, d dVar2) {
                this.f8567a.m10689t0(dVar, z, z2, dVar2);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m10688s0(j5b0 j5b0Var, List list) {
        this.f7447u = true;
        if (this.f7448v == null) {
            this.f7448v = j5b0Var.getCurrentPurchaseSection();
        }
        if (NullChecker.a(this.f7448v)) {
            d dVarM18554i = this.f7446t.m18554i(this.f7448v);
            this.f7449w = dVarM18554i;
            m10684G0(dVarM18554i, this.f7448v);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m10689t0(d dVar, boolean z, boolean z2, d dVar2) {
        if (NullChecker.a(dVar2)) {
            this.f7448v = dVar2;
            this.f7449w = dVar;
            m10684G0(dVar, dVar2);
            return;
        }
        this.f7448v = dVar;
        if (this.f7447u && NullChecker.a(dVar)) {
            d dVarM18554i = this.f7446t.m18554i(this.f7448v);
            this.f7449w = dVarM18554i;
            m10684G0(dVarM18554i, this.f7448v);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m10690w0(PrivateCustomSetting privateCustomSetting) {
        if (!NullChecker.a(privateCustomSetting) || vwb.J(privateCustomSetting.idealTypes)) {
            m10668E0(null);
        } else {
            this.f7445s = true;
            m10668E0(privateCustomSetting.idealTypes);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m10691z0() {
        if (xma.m27351F3()) {
            return;
        }
        l3b0 l3b0Var = this.f7446t;
        l3b0Var.m18560o(!l3b0Var.getIsExtraSelected());
        m10685H0(this.f7446t.getIsExtraSelected());
        if (NullChecker.a(this.f7449w) && NullChecker.a(this.f7444r)) {
            j5b0 j5b0Var = this.f7444r.f7454b;
            j5b0Var.m17282f0(j5b0Var.getCurrentPurchaseSection(), false, false);
        }
    }

    public PrivilegeDescListPrivateCustomExtraItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7442p = NumberFormat.getNumberInstance();
        this.f7445s = false;
        this.f7447u = false;
        this.f7448v = null;
        this.f7449w = null;
    }

    public PrivilegeDescListPrivateCustomExtraItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7442p = NumberFormat.getNumberInstance();
        this.f7445s = false;
        this.f7447u = false;
        this.f7448v = null;
        this.f7449w = null;
    }
}
