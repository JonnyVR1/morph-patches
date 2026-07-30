package com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg;

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
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.member.R$string;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VButton;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p149l.b3c0;
import p149l.cwf0;
import p149l.eb2;
import p149l.eqh0;
import p149l.i0e;
import p149l.ju80;
import p149l.k6c0;
import p149l.l5j0;
import p149l.o7r;
import p149l.sab0;
import p149l.t100;
import p149l.vwb;
import p149l.w7c0;
import p149l.x4c0;
import p149l.xdl0;
import p149l.xma;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a */
/* JADX INFO: loaded from: classes9.dex */
public class C9008a {

    /* JADX INFO: renamed from: a */
    public View f37791a;

    /* JADX INFO: renamed from: b */
    public VPager f37792b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f37793c;

    /* JADX INFO: renamed from: d */
    public VButton f37794d;

    /* JADX INFO: renamed from: e */
    public l5j0 f37795e;

    /* JADX INFO: renamed from: f */
    public PutongFrag f37796f;

    /* JADX INFO: renamed from: g */
    public ArrayList<Privilege> f37797g;

    /* JADX INFO: renamed from: h */
    public Privilege f37798h;

    /* JADX INFO: renamed from: i */
    public cwf0 f37799i = i0e.m133794c("p_privilege_intro", C9008a.class.getName());

    /* JADX INFO: renamed from: j */
    public PurchaseType f37800j;

    /* JADX INFO: renamed from: k */
    public View f37801k;

    /* JADX INFO: renamed from: l */
    public f f37802l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a$a */
    public class a extends ViewPager.C0719m {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            if (i < C9008a.this.f37797g.size()) {
                CoreModule.f17554l.m94656g().mo34997Bl(C9008a.this.f37800j, (Privilege) C9008a.this.f37797g.get(i));
                C9008a c9008a = C9008a.this;
                c9008a.f37798h = (Privilege) c9008a.f37797g.get(i);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a$b */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f37804a;

        public b(BottomSheetBehavior bottomSheetBehavior) {
            this.f37804a = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f37804a.setPeekHeight(C9008a.this.f37801k.getHeight());
            C9008a.this.f37801k.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a$c */
    public class c extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f37806a;

        public c(BottomSheetBehavior bottomSheetBehavior) {
            this.f37806a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 4) {
                this.f37806a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                C9008a.this.f37795e.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a$d */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37808a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f37808a = iArr;
            try {
                iArr[PurchaseType.TYPE_O_PLATINUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37808a[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37808a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37808a[PurchaseType.TYPE_SUPREME_PARTNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37808a[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37808a[PurchaseType.TYPE_YOUTH_VIP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37808a[PurchaseType.TYPE_GET_VIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a$e */
    public static class e extends eb2 {

        /* JADX INFO: renamed from: e */
        public final PurchaseType f37809e;

        /* JADX INFO: renamed from: f */
        public ArrayList<Privilege> f37810f;

        /* JADX INFO: renamed from: g */
        public PutongFrag f37811g;

        public e(PutongFrag putongFrag, ArrayList<Privilege> arrayList, PurchaseType purchaseType) {
            this.f37811g = putongFrag;
            this.f37810f = arrayList;
            this.f37809e = purchaseType;
        }

        @Override // p149l.w660
        public int getCount() {
            return this.f37810f.size();
        }

        @Override // p149l.w660
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: m */
        public void mo43284m(Object obj) {
            super.mo43284m(obj);
            if (obj instanceof PrivilegeContentDlgItemView) {
                ((PrivilegeContentDlgItemView) obj).m57365R0();
            }
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            View view = (View) obj;
            View childAt = ((FrameLayout) view.findViewById(x4c0.f190995f)).getChildAt(0);
            if (childAt instanceof SVGAnimationView) {
                ((SVGAnimationView) childAt).stopAnimation(true);
            }
            viewGroup.removeView(view);
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            PrivilegeContentDlgItemView privilegeContentDlgItemView = (PrivilegeContentDlgItemView) o7r.m163037a(viewGroup.getContext()).inflate(k6c0.f121403l1, viewGroup, false);
            privilegeContentDlgItemView.m57372W(this.f37811g, this, this.f37810f.get(i), this.f37811g.act(), this.f37809e);
            viewGroup.addView(privilegeContentDlgItemView);
            return privilegeContentDlgItemView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo57422a(PurchaseType purchaseType, Privilege privilege);
    }

    public C9008a(PutongFrag putongFrag) {
        this.f37796f = putongFrag;
    }

    /* JADX INFO: renamed from: h */
    public final void m57413h(View view) {
        ju80.m143261a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final void m57414i() {
        Window window = this.f37795e.getWindow();
        if (NullChecker.m81304b(window)) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(x4c0.f190997h));
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setPeekHeight(0);
            this.f37801k.getViewTreeObserver().addOnGlobalLayoutListener(new b(bottomSheetBehaviorFrom));
            bottomSheetBehaviorFrom.setBottomSheetCallback(new c(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m57415j() {
        switch (d.f37808a[this.f37800j.ordinal()]) {
            case 1:
                boolean zM210045H3 = xma.m210045H3();
                VButton vButton = this.f37794d;
                if (zM210045H3) {
                    vButton.setText("续费白金会员");
                } else {
                    vButton.setText("成为白金会员");
                }
                this.f37794d.setTextColor(Color.parseColor("#ffffff"));
                this.f37794d.setBackgroundResource(b3c0.f73050g);
                break;
            case 2:
                boolean zM210043F3 = xma.m210043F3();
                VButton vButton2 = this.f37794d;
                if (zM210043F3) {
                    vButton2.setText("续费黑金会员");
                } else {
                    vButton2.setText("成为黑金会员");
                }
                this.f37794d.setTextColor(Color.parseColor("#ffdea2"));
                this.f37794d.setBackgroundResource(b3c0.f73202z5);
                break;
            case 3:
                boolean zIsSVIP = CoreModule.f17545c.f19639e0.m169527p9().isSVIP();
                VButton vButton3 = this.f37794d;
                if (zIsSVIP) {
                    vButton3.setText(this.f37796f.getText(R$string.f20572D));
                } else {
                    vButton3.setText(this.f37796f.getText(R$string.f20566B));
                }
                this.f37794d.setBackgroundResource(b3c0.f72826A5);
                break;
            case 4:
                this.f37794d.setText("至尊合伙人申请");
                this.f37794d.setTextColor(Color.parseColor("#011703"));
                this.f37794d.setBackgroundResource(b3c0.f73058h);
                break;
            case 5:
                boolean zM210039B3 = xma.m210039B3();
                VButton vButton4 = this.f37794d;
                if (zM210039B3) {
                    vButton4.setText("续费她专享会员");
                } else {
                    vButton4.setText("成为她专享会员");
                }
                this.f37794d.setTextColor(Color.parseColor("#ffffff"));
                this.f37794d.setBackgroundResource(b3c0.f73090l);
                break;
            case 6:
                boolean zM210050O3 = xma.m210050O3();
                VButton vButton5 = this.f37794d;
                if (zM210050O3) {
                    vButton5.setText("续费青春专享会员");
                } else {
                    vButton5.setText("成为青春专享会员");
                }
                this.f37794d.setTextColor(Color.parseColor("#ffffff"));
                this.f37794d.setBackgroundResource(b3c0.f72952S5);
                break;
            default:
                boolean zIsVIP = CoreModule.f17545c.f19639e0.m169527p9().isVIP();
                VButton vButton6 = this.f37794d;
                if (!zIsVIP) {
                    vButton6.setText(R$string.f20589I1);
                } else {
                    vButton6.setText(this.f37796f.getText(R$string.f20592J1));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m57416k() {
        if (xdl0.m208408w0() <= 1280) {
            this.f37794d.setTextSize(2, xdl0.m208408w0() < 960 ? 15.0f : 18.0f);
        }
        this.f37792b.setAdapter(new e(this.f37796f, this.f37797g, this.f37800j));
        this.f37792b.m4185d(new a());
        this.f37793c.setViewPager(this.f37792b);
        if (sab0.m182906x(this.f37800j)) {
            this.f37793c.setFillColor(Color.parseColor("#BCE46A"));
            this.f37793c.setPageColor(Color.parseColor("#0A000000"));
        } else if (sab0.m182889g(this.f37800j)) {
            this.f37793c.setFillColor(Color.parseColor("#F482CE"));
            this.f37793c.setPageColor(Color.parseColor("#0A000000"));
        } else if (sab0.m182897o(this.f37800j)) {
            this.f37793c.setFillColor(Color.parseColor("#656f78"));
        } else if (sab0.m182891i(this.f37800j)) {
            this.f37793c.setFillColor(Color.parseColor("#a76f11"));
        } else if (sab0.m182899q(this.f37800j)) {
            this.f37793c.setFillColor(Color.parseColor("#FFB775"));
            this.f37793c.setPageColor(Color.parseColor("#0A000000"));
        } else if (sab0.m182905w(this.f37800j)) {
            this.f37793c.setFillColor(Color.parseColor("#E9B48E"));
            this.f37793c.setPageColor(Color.parseColor("#0A000000"));
        } else if (sab0.m182903u(this.f37800j)) {
            this.f37793c.setFillColor(Color.parseColor("#FFD589"));
            this.f37793c.setPageColor(Color.parseColor("#33FFD589"));
            this.f37791a.setBackgroundResource(b3c0.f73005a2);
            if (xma.m210049N3()) {
                xdl0.m208344M(this.f37794d, false);
                xdl0.m208357U(this.f37793c, t100.f167276y);
            }
        }
        this.f37794d.setTypeface(eqh0.m117752c(3));
        this.f37794d.setOnClickListener(new View.OnClickListener() { // from class: l.ut80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178241a.m57418m(view);
            }
        });
        m57415j();
        this.f37795e.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.vt80
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f182912a.m57419n(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m57417l() {
        switch (d.f37808a[this.f37800j.ordinal()]) {
            case 1:
                this.f37797g = PurchaseType.TYPE_O_PLATINUM.getPrivilegeData(null);
                break;
            case 2:
                this.f37797g = PurchaseType.TYPE_O_DIAMOND.getPrivilegeData(null);
                break;
            case 3:
                this.f37797g = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData(null);
                break;
            case 4:
                this.f37797g = PurchaseType.TYPE_SUPREME_PARTNER.getPrivilegeData(null);
                break;
            case 5:
                this.f37797g = PurchaseType.TYPE_FEMALE_VIP.getPrivilegeData(null);
                break;
            case 6:
                this.f37797g = PurchaseType.TYPE_YOUTH_VIP.getPrivilegeData(null);
                break;
            default:
                this.f37797g = CoreModule.m29935P().m94656g().mo35005Dq();
                break;
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m57418m(View view) {
        CoreModule.f17554l.m94656g().mo35082wn(this.f37800j);
        f fVar = this.f37802l;
        if (fVar != null) {
            fVar.mo57422a(this.f37800j, this.f37798h);
        }
        this.f37795e.cancel();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m57419n(DialogInterface dialogInterface) {
        i0e.m133796e(this.f37799i);
    }

    /* JADX INFO: renamed from: o */
    public void m57420o(Privilege privilege) {
        if (this.f37797g.indexOf(privilege) == 0 && this.f37797g.indexOf(privilege) == this.f37792b.getCurrentItem()) {
            CoreModule.f17554l.m94656g().mo34997Bl(this.f37800j, privilege);
        }
        if (vwb.m200296J(this.f37797g) || this.f37797g.indexOf(privilege) < 0) {
            return;
        }
        this.f37792b.setCurrentItem(this.f37797g.indexOf(privilege));
    }

    /* JADX INFO: renamed from: p */
    public void m57421p(@NonNull PurchaseType purchaseType, f fVar) {
        if (purchaseType == null) {
            return;
        }
        this.f37800j = purchaseType;
        this.f37802l = fVar;
        this.f37795e = new l5j0(this.f37796f.act(), sab0.m182903u(purchaseType) ? w7c0.f185039b : w7c0.f185038a);
        View viewInflate = o7r.m163037a(this.f37796f.act()).inflate(k6c0.f121399k1, (ViewGroup) null);
        this.f37801k = viewInflate;
        this.f37795e.setContentView(viewInflate);
        m57413h(this.f37801k);
        m57417l();
        m57416k();
        this.f37795e.show();
        m57414i();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", CoreModule.m29935P().m94656g().mo35053d6(purchaseType));
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
        } catch (JSONException e2) {
            CrashHelper.m81296c(e2);
        }
        this.f37799i.m109039o(jSONObject);
        i0e.m133797f(this.f37799i);
        CoreModule.f17554l.m94656g().mo35025Pr(purchaseType);
    }
}
