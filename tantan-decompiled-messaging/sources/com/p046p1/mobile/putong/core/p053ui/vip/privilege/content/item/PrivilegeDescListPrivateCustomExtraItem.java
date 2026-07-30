package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item;

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
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IdealTypes;
import com.p046p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeDescListCustomModelItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.VipFrag;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.List;
import p147v.VRecyclerView;
import p149l.dac0;
import p149l.dv80;
import p149l.e16;
import p149l.e30;
import p149l.eqh0;
import p149l.f6c0;
import p149l.g6a;
import p149l.i690;
import p149l.iw80;
import p149l.j5b0;
import p149l.jtk;
import p149l.l3b0;
import p149l.mkd0;
import p149l.o7r;
import p149l.t100;
import p149l.u4c0;
import p149l.vwb;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xma;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeDescListPrivateCustomExtraItem extends ConstraintLayout {

    /* JADX INFO: renamed from: x */
    public static String f37648x = "PrivilegeDescListCustomBubbleKey";

    /* JADX INFO: renamed from: d */
    public PrivilegeDescListPrivateCustomExtraItem f37649d;

    /* JADX INFO: renamed from: e */
    public TextView f37650e;

    /* JADX INFO: renamed from: f */
    public ImageView f37651f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f37652g;

    /* JADX INFO: renamed from: h */
    public ImageView f37653h;

    /* JADX INFO: renamed from: i */
    public TextView f37654i;

    /* JADX INFO: renamed from: j */
    public TextView f37655j;

    /* JADX INFO: renamed from: k */
    public TextView f37656k;

    /* JADX INFO: renamed from: l */
    public TextView f37657l;

    /* JADX INFO: renamed from: m */
    public VRecyclerView f37658m;

    /* JADX INFO: renamed from: n */
    public View f37659n;

    /* JADX INFO: renamed from: o */
    public ImageView f37660o;

    /* JADX INFO: renamed from: p */
    public NumberFormat f37661p;

    /* JADX INFO: renamed from: q */
    public C8993a f37662q;

    /* JADX INFO: renamed from: r */
    public C8994b f37663r;

    /* JADX INFO: renamed from: s */
    public boolean f37664s;

    /* JADX INFO: renamed from: t */
    public l3b0 f37665t;

    /* JADX INFO: renamed from: u */
    public boolean f37666u;

    /* JADX INFO: renamed from: v */
    public C8765d f37667v;

    /* JADX INFO: renamed from: w */
    public C8765d f37668w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem$a */
    public class C8993a extends dac0<IdealTypes> {

        /* JADX INFO: renamed from: c */
        public List<IdealTypes> f37669c;

        /* JADX INFO: renamed from: d */
        public Context f37670d;

        public C8993a(Context context) {
            this.f37670d = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m57220I(View view) throws Exception {
            PrivilegeDescListPrivateCustomExtraItem.this.m57217z0();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int mo28824C() {
            List<IdealTypes> list = this.f37669c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return o7r.m163037a(this.f37670d).inflate(f6c0.f95579T8, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, IdealTypes idealTypes, int i, int i2) {
            ((PrivilegeDescListCustomModelItem) view).m54234i0(idealTypes);
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.hw80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) throws Exception {
                    this.f109738a.m57220I(view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public IdealTypes getItem(int i) {
            return this.f37669c.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final void m57223J(List<IdealTypes> list) {
            this.f37669c = list;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem$b */
    public static class C8994b implements dv80 {

        /* JADX INFO: renamed from: a */
        public final PurchaseType f37672a;

        /* JADX INFO: renamed from: b */
        public final j5b0 f37673b;

        public C8994b(PurchaseType purchaseType, j5b0 j5b0Var) {
            this.f37672a = purchaseType;
            this.f37673b = j5b0Var;
        }

        @Override // p149l.dv80
        public int getItemType() {
            return 13;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem$c */
    public class C8995c extends RecyclerView.AbstractC0576n {
        public C8995c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = t100.f167264m;
            }
            if (recyclerView.getChildAdapterPosition(view) == PrivilegeDescListPrivateCustomExtraItem.this.f37662q.mo28824C() - 1) {
                rect.right = t100.f167264m;
            } else {
                rect.right = t100.f167259h;
            }
        }
    }

    public PrivilegeDescListPrivateCustomExtraItem(Context context) {
        super(context);
        this.f37661p = NumberFormat.getNumberInstance();
        this.f37664s = false;
        this.f37666u = false;
        this.f37667v = null;
        this.f37668w = null;
    }

    /* JADX INFO: renamed from: E0 */
    private void m57194E0(List<IdealTypes> list) {
        boolean zM200296J = vwb.m200296J(list);
        VRecyclerView vRecyclerView = this.f37658m;
        if (zM200296J) {
            xdl0.m208344M(vRecyclerView, false);
        } else {
            xdl0.m208344M(vRecyclerView, true);
            this.f37662q.m57223J(list);
        }
    }

    /* JADX INFO: renamed from: I0 */
    private void m57195I0() {
        C4348d.m20896l().m20909u(new C4345a(getContext()).m20849D(xma.m210043F3() ? "购买解锁私人定制特权" : "权益包仅限黑金会员购买").m20870k(e16.m114375c(getContext(), w0c0.f183773I)).m20852G(w0c0.f183788N).m20878t(true).m20855J(13.0f).m20883y(true).m20864e(false).m20869j(new C4345a.c() { // from class: l.gw80
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.c
            /* JADX INFO: renamed from: a */
            public final void mo20886a(String str) {
                PrivilegeDescListPrivateCustomExtraItem.m57196h0(str);
            }
        }).m20850E(false).m20861b(3000L).m20882x(t100.m186890d(7.0f)).m20880v(xma.m210043F3() ? t100.f167264m : 0).m20875q(jtk.f119614A | jtk.f119618E), this.f37651f, f37648x);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m57196h0(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m57205u0(View view) {
        m57195I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m57206v0(View view) throws Exception {
        m57217z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m57207y0(Throwable th) {
        m57194E0(null);
    }

    /* JADX INFO: renamed from: B0 */
    public void m57208B0(dac0<dv80> dac0Var, final PutongFrag putongFrag, C8994b c8994b, PurchaseType purchaseType) {
        this.f37663r = c8994b;
        m57209D0();
        xdl0.m208329E0(this.f37651f, new View.OnClickListener() { // from class: l.bw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77595a.m57205u0(view);
            }
        });
        xdl0.m208329E0(this.f37655j, new View.OnClickListener() { // from class: l.cw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8764c.m53487r0(putongFrag.act(), "p_privilege,default");
            }
        });
        xdl0.m208329E0(this.f37652g, new View.OnClickListener() { // from class: l.dw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                this.f88156a.m57206v0(view);
            }
        });
        if (this.f37662q == null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            C8993a c8993a = new C8993a(getContext());
            this.f37662q = c8993a;
            this.f37658m.setAdapter(c8993a);
            this.f37658m.setLayoutManager(linearLayoutManager);
            this.f37658m.addItemDecoration(new C8995c());
        }
        if (!this.f37664s) {
            CoreModule.f17545c.f19701y2.m155341P3();
        }
        dac0Var.mo67374c(putongFrag, CoreModule.f17545c.f19701y2.m155361x3()).subscribe(mkd0.m154956H(new e30() { // from class: l.ew80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93472a.m57216w0((PrivateCustomSetting) obj);
            }
        }, new e30() { // from class: l.fw80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99628a.m57207y0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D0 */
    public final void m57209D0() {
        if (g6a.m124566o()) {
            this.f37650e.setTextColor(getResources().getColor(w0c0.f183833b1));
            this.f37651f.setImageResource(x2c0.f189984ai);
            this.f37653h.setImageResource(x2c0.f189952Zh);
            this.f37656k.setTextColor(getResources().getColor(w0c0.f183837c1));
            this.f37657l.setTextColor(getResources().getColor(w0c0.f183833b1));
            this.f37655j.setTextColor(Color.parseColor("#150702"));
            this.f37655j.setTypeface(eqh0.m117752c(3));
            this.f37655j.setBackgroundResource(x2c0.f189890Xh);
            this.f37654i.setTextColor(getResources().getColor(w0c0.f183837c1));
        }
        boolean zM210043F3 = xma.m210043F3();
        TextView textView = this.f37650e;
        if (zM210043F3) {
            textView.setText("权益包");
            xdl0.m208344M(this.f37654i, false);
            xdl0.m208344M(this.f37655j, true);
            ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) this.f37656k.getLayoutParams();
            int i = c0220a.f1247f;
            int i2 = u4c0.f173972P0;
            if (i != i2) {
                c0220a.f1247f = i2;
                this.f37656k.setLayoutParams(c0220a);
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
            xdl0.m208344M(this.f37654i, true);
            xdl0.m208344M(this.f37655j, false);
            ConstraintLayout.C0220a c0220a2 = (ConstraintLayout.C0220a) this.f37656k.getLayoutParams();
            int i3 = c0220a2.f1247f;
            int i4 = u4c0.f173863Ia;
            if (i3 != i4) {
                c0220a2.f1247f = i4;
                this.f37656k.setLayoutParams(c0220a2);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i5 = marginLayoutParams2.topMargin;
            int i6 = t100.f167259h;
            if (i5 != i6) {
                marginLayoutParams2.topMargin = i6;
                setLayoutParams(marginLayoutParams2);
            }
        }
        xdl0.m208344M(this.f37660o, !xma.m210043F3());
        if (!xma.m210043F3()) {
            m57211H0(this.f37665t.getIsExtraSelected());
            return;
        }
        boolean zM124566o = g6a.m124566o();
        View view = this.f37659n;
        if (zM124566o) {
            view.setBackground(new i690(i690.INSTANCE.m134599b()));
        } else {
            view.setBackgroundResource(x2c0.f189644Pj);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m57210G0(C8765d c8765d, C8765d c8765d2) {
        if (NullChecker.m81303a(c8765d) && NullChecker.m81303a(c8765d2)) {
            boolean zM53531m = c8765d2.m53531m();
            C8765d.a aVarM53520b = zM53531m ? c8765d2.m53520b() : c8765d2.m53522d();
            C8765d.a aVarM53520b2 = zM53531m ? c8765d.m53520b() : c8765d.m53522d();
            if (NullChecker.m81303a(aVarM53520b) && NullChecker.m81303a(aVarM53520b2)) {
                StringBuilder sb = new StringBuilder();
                sb.append(aVarM53520b.m53583h());
                sb.append(this.f37661p.format((aVarM53520b2.m53553I() ? aVarM53520b2.m53604v() : aVarM53520b2.m53602t()) - (aVarM53520b.m53553I() ? aVarM53520b.m53604v() : aVarM53520b.m53602t())));
                sb.append("/");
                sb.append(aVarM53520b.m53605w());
                sb.append("个月");
                this.f37654i.setText(sb.toString());
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m57211H0(boolean z) {
        if (z) {
            boolean zM124566o = g6a.m124566o();
            ImageView imageView = this.f37660o;
            if (zM124566o) {
                imageView.setImageResource(x2c0.f190333li);
                this.f37659n.setBackground(new i690(i690.INSTANCE.m134599b()));
                return;
            } else {
                imageView.setImageResource(x2c0.f189365Gj);
                this.f37659n.setBackgroundResource(x2c0.f189644Pj);
                return;
            }
        }
        boolean zM124566o2 = g6a.m124566o();
        ImageView imageView2 = this.f37660o;
        if (zM124566o2) {
            imageView2.setImageResource(x2c0.f190301ki);
            this.f37659n.setBackground(new i690(i690.INSTANCE.m134598a()));
        } else {
            imageView2.setImageResource(x2c0.f189396Hj);
            this.f37659n.setBackgroundResource(x2c0.f189675Qj);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57212q0(this);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m57212q0(View view) {
        iw80.m138719a(this, view);
    }

    /* JADX INFO: renamed from: r0 */
    public void m57213r0(VipFrag vipFrag, PurchaseType purchaseType, String str, final j5b0 j5b0Var) {
        l3b0 l3b0Var = new l3b0(vipFrag.act(), PurchaseType.TYPE_O_DIAMOND_PRIVATE_CUSTOM, str);
        this.f37665t = l3b0Var;
        j5b0Var.m54016N(l3b0Var);
        this.f37665t.m148384m(new l3b0.InterfaceC18144a() { // from class: l.zv80
            @Override // p149l.l3b0.InterfaceC18144a
            /* JADX INFO: renamed from: a */
            public final void mo148388a(List list) {
                this.f204977a.m57214s0(j5b0Var, list);
            }
        });
        this.f37665t.m148382k();
        j5b0Var.m54011I(new AbstractC8776a.d() { // from class: l.aw80
            @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.d
            /* JADX INFO: renamed from: a */
            public final void mo53997a(C8765d c8765d, boolean z, boolean z2, C8765d c8765d2) {
                this.f72024a.m57215t0(c8765d, z, z2, c8765d2);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m57214s0(j5b0 j5b0Var, List list) {
        this.f37666u = true;
        if (this.f37667v == null) {
            this.f37667v = j5b0Var.getCurrentPurchaseSection();
        }
        if (NullChecker.m81303a(this.f37667v)) {
            C8765d c8765dM148380i = this.f37665t.m148380i(this.f37667v);
            this.f37668w = c8765dM148380i;
            m57210G0(c8765dM148380i, this.f37667v);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m57215t0(C8765d c8765d, boolean z, boolean z2, C8765d c8765d2) {
        if (NullChecker.m81303a(c8765d2)) {
            this.f37667v = c8765d2;
            this.f37668w = c8765d;
            m57210G0(c8765d, c8765d2);
            return;
        }
        this.f37667v = c8765d;
        if (this.f37666u && NullChecker.m81303a(c8765d)) {
            C8765d c8765dM148380i = this.f37665t.m148380i(this.f37667v);
            this.f37668w = c8765dM148380i;
            m57210G0(c8765dM148380i, this.f37667v);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m57216w0(PrivateCustomSetting privateCustomSetting) {
        if (!NullChecker.m81303a(privateCustomSetting) || vwb.m200296J(privateCustomSetting.idealTypes)) {
            m57194E0(null);
        } else {
            this.f37664s = true;
            m57194E0(privateCustomSetting.idealTypes);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m57217z0() throws Exception {
        if (xma.m210043F3()) {
            return;
        }
        l3b0 l3b0Var = this.f37665t;
        l3b0Var.m148386o(!l3b0Var.getIsExtraSelected());
        m57211H0(this.f37665t.getIsExtraSelected());
        if (NullChecker.m81303a(this.f37668w) && NullChecker.m81303a(this.f37663r)) {
            j5b0 j5b0Var = this.f37663r.f37673b;
            j5b0Var.m139836f0(j5b0Var.getCurrentPurchaseSection(), false, false);
        }
    }

    public PrivilegeDescListPrivateCustomExtraItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37661p = NumberFormat.getNumberInstance();
        this.f37664s = false;
        this.f37666u = false;
        this.f37667v = null;
        this.f37668w = null;
    }

    public PrivilegeDescListPrivateCustomExtraItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37661p = NumberFormat.getNumberInstance();
        this.f37664s = false;
        this.f37666u = false;
        this.f37667v = null;
        this.f37668w = null;
    }
}
