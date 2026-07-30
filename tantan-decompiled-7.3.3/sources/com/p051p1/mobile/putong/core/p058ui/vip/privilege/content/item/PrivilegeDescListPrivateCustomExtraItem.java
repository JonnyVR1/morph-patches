package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item;

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
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IdealTypes;
import com.p051p1.mobile.putong.core.data.PrivateCustomSetting;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeDescListCustomModelItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.VipFrag;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.List;
import p151v.VRecyclerView;
import p153l.adc0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.h390;
import p153l.j26;
import p153l.jic0;
import p153l.joa;
import p153l.jyb;
import p153l.kec0;
import p153l.lyh0;
import p153l.m490;
import p153l.me90;
import p153l.ndb0;
import p153l.p9r;
import p153l.pbb0;
import p153l.psd0;
import p153l.qa00;
import p153l.s7a;
import p153l.y20;
import p153l.zvk;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeDescListPrivateCustomExtraItem extends ConstraintLayout {

    /* JADX INFO: renamed from: x */
    public static String f38496x = "PrivilegeDescListCustomBubbleKey";

    /* JADX INFO: renamed from: d */
    public PrivilegeDescListPrivateCustomExtraItem f38497d;

    /* JADX INFO: renamed from: e */
    public TextView f38498e;

    /* JADX INFO: renamed from: f */
    public ImageView f38499f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f38500g;

    /* JADX INFO: renamed from: h */
    public ImageView f38501h;

    /* JADX INFO: renamed from: i */
    public TextView f38502i;

    /* JADX INFO: renamed from: j */
    public TextView f38503j;

    /* JADX INFO: renamed from: k */
    public TextView f38504k;

    /* JADX INFO: renamed from: l */
    public TextView f38505l;

    /* JADX INFO: renamed from: m */
    public VRecyclerView f38506m;

    /* JADX INFO: renamed from: n */
    public View f38507n;

    /* JADX INFO: renamed from: o */
    public ImageView f38508o;

    /* JADX INFO: renamed from: p */
    public NumberFormat f38509p;

    /* JADX INFO: renamed from: q */
    public C9156a f38510q;

    /* JADX INFO: renamed from: r */
    public C9157b f38511r;

    /* JADX INFO: renamed from: s */
    public boolean f38512s;

    /* JADX INFO: renamed from: t */
    public pbb0 f38513t;

    /* JADX INFO: renamed from: u */
    public boolean f38514u;

    /* JADX INFO: renamed from: v */
    public C8928d f38515v;

    /* JADX INFO: renamed from: w */
    public C8928d f38516w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem$a */
    public class C9156a extends jic0<IdealTypes> {

        /* JADX INFO: renamed from: c */
        public List<IdealTypes> f38517c;

        /* JADX INFO: renamed from: d */
        public Context f38518d;

        public C9156a(Context context) {
            this.f38518d = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m58403I(View view) throws Exception {
            PrivilegeDescListPrivateCustomExtraItem.this.m58400z0();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int mo29823C() {
            List<IdealTypes> list = this.f38517c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return p9r.m171370a(this.f38518d).inflate(kec0.f125746a9, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, IdealTypes idealTypes, int i, int i2) {
            ((PrivilegeDescListCustomModelItem) view).m55417i0(idealTypes);
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.l490
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) throws Exception {
                    this.f129950a.m58403I(view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public IdealTypes getItem(int i) {
            return this.f38517c.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final void m58406J(List<IdealTypes> list) {
            this.f38517c = list;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem$b */
    public static class C9157b implements h390 {

        /* JADX INFO: renamed from: a */
        public final PurchaseType f38520a;

        /* JADX INFO: renamed from: b */
        public final ndb0 f38521b;

        public C9157b(PurchaseType purchaseType, ndb0 ndb0Var) {
            this.f38520a = purchaseType;
            this.f38521b = ndb0Var;
        }

        @Override // p153l.h390
        public int getItemType() {
            return 13;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem$c */
    public class C9158c extends RecyclerView.AbstractC0578n {
        public C9158c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = qa00.f156326m;
            }
            if (recyclerView.getChildAdapterPosition(view) == PrivilegeDescListPrivateCustomExtraItem.this.f38510q.mo29823C() - 1) {
                rect.right = qa00.f156326m;
            } else {
                rect.right = qa00.f156321h;
            }
        }
    }

    public PrivilegeDescListPrivateCustomExtraItem(Context context) {
        super(context);
        this.f38509p = NumberFormat.getNumberInstance();
        this.f38512s = false;
        this.f38514u = false;
        this.f38515v = null;
        this.f38516w = null;
    }

    /* JADX INFO: renamed from: E0 */
    private void m58377E0(List<IdealTypes> list) {
        boolean zM147479J = jyb.m147479J(list);
        VRecyclerView vRecyclerView = this.f38506m;
        if (zM147479J) {
            bnl0.m105524M(vRecyclerView, false);
        } else {
            bnl0.m105524M(vRecyclerView, true);
            this.f38510q.m58406J(list);
        }
    }

    /* JADX INFO: renamed from: I0 */
    private void m58378I0() {
        C4499d.m21895l().m21908u(new C4496a(getContext()).m21848D(joa.m146357G3() ? "购买解锁私人定制特权" : "权益包仅限黑金会员购买").m21869k(j26.m143190c(getContext(), c9c0.f80342I)).m21851G(c9c0.f80357N).m21877t(true).m21854J(13.0f).m21882y(true).m21863e(false).m21868j(new C4496a.c() { // from class: l.k490
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.c
            /* JADX INFO: renamed from: a */
            public final void mo21885a(String str) {
                PrivilegeDescListPrivateCustomExtraItem.m58379h0(str);
            }
        }).m21849E(false).m21860b(3000L).m21881x(qa00.m175859d(7.0f)).m21879v(joa.m146357G3() ? qa00.f156326m : 0).m21874q(zvk.f206224A | zvk.f206228E), this.f38499f, f38496x);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m58379h0(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m58388u0(View view) {
        m58378I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m58389v0(View view) throws Exception {
        m58400z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m58390y0(Throwable th) {
        m58377E0(null);
    }

    /* JADX INFO: renamed from: B0 */
    public void m58391B0(jic0<h390> jic0Var, final PutongFrag putongFrag, C9157b c9157b, PurchaseType purchaseType) {
        this.f38511r = c9157b;
        m58392D0();
        bnl0.m105509E0(this.f38499f, new View.OnClickListener() { // from class: l.f490
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97084a.m58388u0(view);
            }
        });
        bnl0.m105509E0(this.f38503j, new View.OnClickListener() { // from class: l.g490
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8927c.m54670r0(putongFrag.act(), "p_privilege,default");
            }
        });
        bnl0.m105509E0(this.f38500g, new View.OnClickListener() { // from class: l.h490
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                this.f107770a.m58389v0(view);
            }
        });
        if (this.f38510q == null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            C9156a c9156a = new C9156a(getContext());
            this.f38510q = c9156a;
            this.f38506m.setAdapter(c9156a);
            this.f38506m.setLayoutManager(linearLayoutManager);
            this.f38506m.addItemDecoration(new C9158c());
        }
        if (!this.f38512s) {
            CoreModule.f18264c.f20443y2.m216810P3();
        }
        jic0Var.mo68557c(putongFrag, CoreModule.f18264c.f20443y2.m216830x3()).subscribe(psd0.m173597H(new y20() { // from class: l.i490
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112853a.m58399w0((PrivateCustomSetting) obj);
            }
        }, new y20() { // from class: l.j490
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118277a.m58390y0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D0 */
    public final void m58392D0() {
        if (s7a.m184986o()) {
            this.f38498e.setTextColor(getResources().getColor(c9c0.f80406c1));
            this.f38499f.setImageResource(dbc0.f86443Oi);
            this.f38501h.setImageResource(dbc0.f86411Ni);
            this.f38504k.setTextColor(getResources().getColor(c9c0.f80410d1));
            this.f38505l.setTextColor(getResources().getColor(c9c0.f80406c1));
            this.f38503j.setTextColor(Color.parseColor("#150702"));
            this.f38503j.setTypeface(lyh0.m156283c(3));
            this.f38503j.setBackgroundResource(dbc0.f86347Li);
            this.f38502i.setTextColor(getResources().getColor(c9c0.f80410d1));
        }
        boolean zM146357G3 = joa.m146357G3();
        TextView textView = this.f38498e;
        if (zM146357G3) {
            textView.setText("权益包");
            bnl0.m105524M(this.f38502i, false);
            bnl0.m105524M(this.f38503j, true);
            ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) this.f38504k.getLayoutParams();
            int i = c0221a.f1247f;
            int i2 = adc0.f70060P0;
            if (i != i2) {
                c0221a.f1247f = i2;
                this.f38504k.setLayoutParams(c0221a);
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
            bnl0.m105524M(this.f38502i, true);
            bnl0.m105524M(this.f38503j, false);
            ConstraintLayout.C0221a c0221a2 = (ConstraintLayout.C0221a) this.f38504k.getLayoutParams();
            int i3 = c0221a2.f1247f;
            int i4 = adc0.f69985Ka;
            if (i3 != i4) {
                c0221a2.f1247f = i4;
                this.f38504k.setLayoutParams(c0221a2);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i5 = marginLayoutParams2.topMargin;
            int i6 = qa00.f156321h;
            if (i5 != i6) {
                marginLayoutParams2.topMargin = i6;
                setLayoutParams(marginLayoutParams2);
            }
        }
        bnl0.m105524M(this.f38508o, !joa.m146357G3());
        if (!joa.m146357G3()) {
            m58394H0(this.f38513t.getIsExtraSelected());
            return;
        }
        boolean zM184986o = s7a.m184986o();
        View view = this.f38507n;
        if (zM184986o) {
            view.setBackground(new me90(me90.INSTANCE.m158022b()));
        } else {
            view.setBackgroundResource(dbc0.f86093Dk);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m58393G0(C8928d c8928d, C8928d c8928d2) {
        if (NullChecker.m82486a(c8928d) && NullChecker.m82486a(c8928d2)) {
            boolean zM54714m = c8928d2.m54714m();
            C8928d.a aVarM54703b = zM54714m ? c8928d2.m54703b() : c8928d2.m54705d();
            C8928d.a aVarM54703b2 = zM54714m ? c8928d.m54703b() : c8928d.m54705d();
            if (NullChecker.m82486a(aVarM54703b) && NullChecker.m82486a(aVarM54703b2)) {
                StringBuilder sb = new StringBuilder();
                sb.append(aVarM54703b.m54766h());
                sb.append(this.f38509p.format((aVarM54703b2.m54736I() ? aVarM54703b2.m54787v() : aVarM54703b2.m54785t()) - (aVarM54703b.m54736I() ? aVarM54703b.m54787v() : aVarM54703b.m54785t())));
                sb.append("/");
                sb.append(aVarM54703b.m54788w());
                sb.append("个月");
                this.f38502i.setText(sb.toString());
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m58394H0(boolean z) {
        if (z) {
            boolean zM184986o = s7a.m184986o();
            ImageView imageView = this.f38508o;
            if (zM184986o) {
                imageView.setImageResource(dbc0.f86795Zi);
                this.f38507n.setBackground(new me90(me90.INSTANCE.m158022b()));
                return;
            } else {
                imageView.setImageResource(dbc0.f87486uk);
                this.f38507n.setBackgroundResource(dbc0.f86093Dk);
                return;
            }
        }
        boolean zM184986o2 = s7a.m184986o();
        ImageView imageView2 = this.f38508o;
        if (zM184986o2) {
            imageView2.setImageResource(dbc0.f86763Yi);
            this.f38507n.setBackground(new me90(me90.INSTANCE.m158021a()));
        } else {
            imageView2.setImageResource(dbc0.f87518vk);
            this.f38507n.setBackgroundResource(dbc0.f86125Ek);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58395q0(this);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m58395q0(View view) {
        m490.m156994a(this, view);
    }

    /* JADX INFO: renamed from: r0 */
    public void m58396r0(VipFrag vipFrag, PurchaseType purchaseType, String str, final ndb0 ndb0Var) {
        pbb0 pbb0Var = new pbb0(vipFrag.act(), PurchaseType.TYPE_O_DIAMOND_PRIVATE_CUSTOM, str);
        this.f38513t = pbb0Var;
        ndb0Var.m55199N(pbb0Var);
        this.f38513t.m171505m(new pbb0.InterfaceC19335a() { // from class: l.d490
            @Override // p153l.pbb0.InterfaceC19335a
            /* JADX INFO: renamed from: a */
            public final void mo114112a(List list) {
                this.f85014a.m58397s0(ndb0Var, list);
            }
        });
        this.f38513t.m171503k();
        ndb0Var.m55194I(new AbstractC8939a.d() { // from class: l.e490
            @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.d
            /* JADX INFO: renamed from: a */
            public final void mo55180a(C8928d c8928d, boolean z, boolean z2, C8928d c8928d2) {
                this.f92077a.m58398t0(c8928d, z, z2, c8928d2);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m58397s0(ndb0 ndb0Var, List list) {
        this.f38514u = true;
        if (this.f38515v == null) {
            this.f38515v = ndb0Var.getCurrentPurchaseSection();
        }
        if (NullChecker.m82486a(this.f38515v)) {
            C8928d c8928dM171501i = this.f38513t.m171501i(this.f38515v);
            this.f38516w = c8928dM171501i;
            m58393G0(c8928dM171501i, this.f38515v);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m58398t0(C8928d c8928d, boolean z, boolean z2, C8928d c8928d2) {
        if (NullChecker.m82486a(c8928d2)) {
            this.f38515v = c8928d2;
            this.f38516w = c8928d;
            m58393G0(c8928d, c8928d2);
            return;
        }
        this.f38515v = c8928d;
        if (this.f38514u && NullChecker.m82486a(c8928d)) {
            C8928d c8928dM171501i = this.f38513t.m171501i(this.f38515v);
            this.f38516w = c8928dM171501i;
            m58393G0(c8928dM171501i, this.f38515v);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m58399w0(PrivateCustomSetting privateCustomSetting) {
        if (!NullChecker.m82486a(privateCustomSetting) || jyb.m147479J(privateCustomSetting.idealTypes)) {
            m58377E0(null);
        } else {
            this.f38512s = true;
            m58377E0(privateCustomSetting.idealTypes);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m58400z0() throws Exception {
        if (joa.m146357G3()) {
            return;
        }
        pbb0 pbb0Var = this.f38513t;
        pbb0Var.m171507o(!pbb0Var.getIsExtraSelected());
        m58394H0(this.f38513t.getIsExtraSelected());
        if (NullChecker.m82486a(this.f38516w) && NullChecker.m82486a(this.f38511r)) {
            ndb0 ndb0Var = this.f38511r.f38521b;
            ndb0Var.m162680f0(ndb0Var.getCurrentPurchaseSection(), false, false);
        }
    }

    public PrivilegeDescListPrivateCustomExtraItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38509p = NumberFormat.getNumberInstance();
        this.f38512s = false;
        this.f38514u = false;
        this.f38515v = null;
        this.f38516w = null;
    }

    public PrivilegeDescListPrivateCustomExtraItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38509p = NumberFormat.getNumberInstance();
        this.f38512s = false;
        this.f38514u = false;
        this.f38515v = null;
        this.f38516w = null;
    }
}
