package com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg;

import android.R;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.member.R$string;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VButton;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p153l.bgc0;
import p153l.bnl0;
import p153l.ddc0;
import p153l.gbc0;
import p153l.joa;
import p153l.jyb;
import p153l.l4g0;
import p153l.lb2;
import p153l.lyh0;
import p153l.n290;
import p153l.p9r;
import p153l.pec0;
import p153l.pej0;
import p153l.qa00;
import p153l.w1e;
import p153l.wib0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a */
/* JADX INFO: loaded from: classes12.dex */
public class C9171a {

    /* JADX INFO: renamed from: a */
    public View f38639a;

    /* JADX INFO: renamed from: b */
    public VPager f38640b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f38641c;

    /* JADX INFO: renamed from: d */
    public VButton f38642d;

    /* JADX INFO: renamed from: e */
    public pej0 f38643e;

    /* JADX INFO: renamed from: f */
    public PutongFrag f38644f;

    /* JADX INFO: renamed from: g */
    public ArrayList<Privilege> f38645g;

    /* JADX INFO: renamed from: h */
    public Privilege f38646h;

    /* JADX INFO: renamed from: i */
    public l4g0 f38647i = w1e.m204399c("p_privilege_intro", C9171a.class.getName());

    /* JADX INFO: renamed from: j */
    public PurchaseType f38648j;

    /* JADX INFO: renamed from: k */
    public View f38649k;

    /* JADX INFO: renamed from: l */
    public f f38650l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a$a */
    public class a extends ViewPager.C0721m {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            if (i < C9171a.this.f38645g.size()) {
                CoreModule.f18273l.m143410g().mo36000Bl(C9171a.this.f38648j, (Privilege) C9171a.this.f38645g.get(i));
                C9171a c9171a = C9171a.this;
                c9171a.f38646h = (Privilege) c9171a.f38645g.get(i);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a$b */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f38652a;

        public b(BottomSheetBehavior bottomSheetBehavior) {
            this.f38652a = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f38652a.setPeekHeight(C9171a.this.f38649k.getHeight());
            C9171a.this.f38649k.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a$c */
    public class c extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f38654a;

        public c(BottomSheetBehavior bottomSheetBehavior) {
            this.f38654a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 4) {
                this.f38654a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                C9171a.this.f38643e.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a$d */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38656a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f38656a = iArr;
            try {
                iArr[PurchaseType.TYPE_O_PLATINUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38656a[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38656a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38656a[PurchaseType.TYPE_SUPREME_PARTNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38656a[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38656a[PurchaseType.TYPE_YOUTH_VIP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38656a[PurchaseType.TYPE_GET_VIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a$e */
    public static class e extends lb2 {

        /* JADX INFO: renamed from: e */
        public final PurchaseType f38657e;

        /* JADX INFO: renamed from: f */
        public ArrayList<Privilege> f38658f;

        /* JADX INFO: renamed from: g */
        public PutongFrag f38659g;

        public e(PutongFrag putongFrag, ArrayList<Privilege> arrayList, PurchaseType purchaseType) {
            this.f38659g = putongFrag;
            this.f38658f = arrayList;
            this.f38657e = purchaseType;
        }

        @Override // p153l.cf60
        public int getCount() {
            return this.f38658f.size();
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: m */
        public void mo44299m(Object obj) {
            super.mo44299m(obj);
            if (obj instanceof PrivilegeContentDlgItemView) {
                ((PrivilegeContentDlgItemView) obj).m58548R0();
            }
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            View view = (View) obj;
            View childAt = ((FrameLayout) view.findViewById(ddc0.f87900f)).getChildAt(0);
            if (childAt instanceof SVGAnimationView) {
                ((SVGAnimationView) childAt).stopAnimation(true);
            }
            viewGroup.removeView(view);
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            PrivilegeContentDlgItemView privilegeContentDlgItemView = (PrivilegeContentDlgItemView) p9r.m171370a(viewGroup.getContext()).inflate(pec0.f152011l1, viewGroup, false);
            privilegeContentDlgItemView.m58555W(this.f38659g, this, this.f38658f.get(i), this.f38659g.act(), this.f38657e);
            viewGroup.addView(privilegeContentDlgItemView);
            return privilegeContentDlgItemView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo58605a(PurchaseType purchaseType, Privilege privilege);
    }

    public C9171a(PutongFrag putongFrag) {
        this.f38644f = putongFrag;
    }

    /* JADX INFO: renamed from: h */
    public final void m58596h(View view) {
        n290.m161219a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final void m58597i() {
        Window window = this.f38643e.getWindow();
        if (NullChecker.m82487b(window)) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(ddc0.f87902h));
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setPeekHeight(0);
            this.f38649k.getViewTreeObserver().addOnGlobalLayoutListener(new b(bottomSheetBehaviorFrom));
            bottomSheetBehaviorFrom.setBottomSheetCallback(new c(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m58598j() {
        switch (d.f38656a[this.f38648j.ordinal()]) {
            case 1:
                boolean zM146359I3 = joa.m146359I3();
                VButton vButton = this.f38642d;
                if (zM146359I3) {
                    vButton.setText("续费白金会员");
                } else {
                    vButton.setText("成为白金会员");
                }
                this.f38642d.setTextColor(Color.parseColor("#ffffff"));
                this.f38642d.setBackgroundResource(gbc0.f103301g);
                break;
            case 2:
                boolean zM146357G3 = joa.m146357G3();
                VButton vButton2 = this.f38642d;
                if (zM146357G3) {
                    vButton2.setText("续费黑金会员");
                } else {
                    vButton2.setText("成为黑金会员");
                }
                this.f38642d.setTextColor(Color.parseColor("#ffdea2"));
                this.f38642d.setBackgroundResource(gbc0.f103453z5);
                break;
            case 3:
                boolean zIsSVIP = CoreModule.f18264c.f20381e0.m116600p9().isSVIP();
                VButton vButton3 = this.f38642d;
                if (zIsSVIP) {
                    vButton3.setText(this.f38644f.getText(R$string.f21314D));
                } else {
                    vButton3.setText(this.f38644f.getText(R$string.f21308B));
                }
                this.f38642d.setBackgroundResource(gbc0.f103077A5);
                break;
            case 4:
                this.f38642d.setText("至尊合伙人申请");
                this.f38642d.setTextColor(Color.parseColor("#011703"));
                this.f38642d.setBackgroundResource(gbc0.f103309h);
                break;
            case 5:
                boolean zM146353C3 = joa.m146353C3();
                VButton vButton4 = this.f38642d;
                if (zM146353C3) {
                    vButton4.setText("续费她专享会员");
                } else {
                    vButton4.setText("成为她专享会员");
                }
                this.f38642d.setTextColor(Color.parseColor("#ffffff"));
                this.f38642d.setBackgroundResource(gbc0.f103341l);
                break;
            case 6:
                boolean zM146364P3 = joa.m146364P3();
                VButton vButton5 = this.f38642d;
                if (zM146364P3) {
                    vButton5.setText("续费青春专享会员");
                } else {
                    vButton5.setText("成为青春专享会员");
                }
                this.f38642d.setTextColor(Color.parseColor("#ffffff"));
                this.f38642d.setBackgroundResource(gbc0.f103203S5);
                break;
            default:
                boolean zIsVIP = CoreModule.f18264c.f20381e0.m116600p9().isVIP();
                VButton vButton6 = this.f38642d;
                if (!zIsVIP) {
                    vButton6.setText(R$string.f21331I1);
                } else {
                    vButton6.setText(this.f38644f.getText(R$string.f21334J1));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m58599k() {
        if (bnl0.m105588w0() <= 1280) {
            this.f38642d.setTextSize(2, bnl0.m105588w0() < 960 ? 15.0f : 18.0f);
        }
        this.f38640b.setAdapter(new e(this.f38644f, this.f38645g, this.f38648j));
        this.f38640b.m4187d(new a());
        this.f38641c.setViewPager(this.f38640b);
        if (wib0.m206580x(this.f38648j)) {
            this.f38641c.setFillColor(Color.parseColor("#BCE46A"));
            this.f38641c.setPageColor(Color.parseColor("#0A000000"));
        } else if (wib0.m206563g(this.f38648j)) {
            this.f38641c.setFillColor(Color.parseColor("#F482CE"));
            this.f38641c.setPageColor(Color.parseColor("#0A000000"));
        } else if (wib0.m206571o(this.f38648j)) {
            this.f38641c.setFillColor(Color.parseColor("#656f78"));
        } else if (wib0.m206565i(this.f38648j)) {
            this.f38641c.setFillColor(Color.parseColor("#a76f11"));
        } else if (wib0.m206573q(this.f38648j)) {
            this.f38641c.setFillColor(Color.parseColor("#FFB775"));
            this.f38641c.setPageColor(Color.parseColor("#0A000000"));
        } else if (wib0.m206579w(this.f38648j)) {
            this.f38641c.setFillColor(Color.parseColor("#E9B48E"));
            this.f38641c.setPageColor(Color.parseColor("#0A000000"));
        } else if (wib0.m206577u(this.f38648j)) {
            this.f38641c.setFillColor(Color.parseColor("#FFD589"));
            this.f38641c.setPageColor(Color.parseColor("#33FFD589"));
            this.f38639a.setBackgroundResource(gbc0.f103256a2);
            if (joa.m146363O3()) {
                bnl0.m105524M(this.f38642d, false);
                bnl0.m105537U(this.f38641c, qa00.f156338y);
            }
        }
        this.f38642d.setTypeface(lyh0.m156283c(3));
        this.f38642d.setOnClickListener(new View.OnClickListener() { // from class: l.y190
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197084a.m58601m(view);
            }
        });
        m58598j();
        this.f38643e.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.z190
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f202492a.m58602n(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m58600l() {
        switch (d.f38656a[this.f38648j.ordinal()]) {
            case 1:
                this.f38645g = PurchaseType.TYPE_O_PLATINUM.getPrivilegeData(null);
                break;
            case 2:
                this.f38645g = PurchaseType.TYPE_O_DIAMOND.getPrivilegeData(null);
                break;
            case 3:
                this.f38645g = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData(null);
                break;
            case 4:
                this.f38645g = PurchaseType.TYPE_SUPREME_PARTNER.getPrivilegeData(null);
                break;
            case 5:
                this.f38645g = PurchaseType.TYPE_FEMALE_VIP.getPrivilegeData(null);
                break;
            case 6:
                this.f38645g = PurchaseType.TYPE_YOUTH_VIP.getPrivilegeData(null);
                break;
            default:
                this.f38645g = CoreModule.m30933P().m143410g().mo36008Dq();
                break;
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m58601m(View view) {
        CoreModule.f18273l.m143410g().mo36085wn(this.f38648j);
        f fVar = this.f38650l;
        if (fVar != null) {
            fVar.mo58605a(this.f38648j, this.f38646h);
        }
        this.f38643e.cancel();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m58602n(DialogInterface dialogInterface) {
        w1e.m204401e(this.f38647i);
    }

    /* JADX INFO: renamed from: o */
    public void m58603o(Privilege privilege) {
        if (this.f38645g.indexOf(privilege) == 0 && this.f38645g.indexOf(privilege) == this.f38640b.getCurrentItem()) {
            CoreModule.f18273l.m143410g().mo36000Bl(this.f38648j, privilege);
        }
        if (jyb.m147479J(this.f38645g) || this.f38645g.indexOf(privilege) < 0) {
            return;
        }
        this.f38640b.setCurrentItem(this.f38645g.indexOf(privilege));
    }

    /* JADX INFO: renamed from: p */
    public void m58604p(@NonNull PurchaseType purchaseType, f fVar) {
        if (purchaseType == null) {
            return;
        }
        this.f38648j = purchaseType;
        this.f38650l = fVar;
        this.f38643e = new pej0(this.f38644f.act(), wib0.m206577u(purchaseType) ? bgc0.f76581b : bgc0.f76580a);
        View viewInflate = p9r.m171370a(this.f38644f.act()).inflate(pec0.f152007k1, (ViewGroup) null);
        this.f38649k = viewInflate;
        this.f38643e.setContentView(viewInflate);
        m58596h(this.f38649k);
        m58600l();
        m58599k();
        this.f38643e.show();
        m58597i();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", CoreModule.m30933P().m143410g().mo36056d6(purchaseType));
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
        } catch (JSONException e2) {
            CrashHelper.m82479c(e2);
        }
        this.f38647i.m152780o(jSONObject);
        w1e.m204402f(this.f38647i);
        CoreModule.f18273l.m143410g().mo36028Pr(purchaseType);
    }
}
