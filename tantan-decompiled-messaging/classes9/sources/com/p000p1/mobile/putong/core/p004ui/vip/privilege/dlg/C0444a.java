package com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg;

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
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.Gender;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.b3c0;
import l.cwf0;
import l.eb2;
import l.eqh0;
import l.i0e;
import l.ju80;
import l.k6c0;
import l.l5j0;
import l.o7r;
import l.sab0;
import l.t100;
import l.vwb;
import l.w7c0;
import l.x4c0;
import l.xdl0;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.xma;
import v.VButton;
import v.VPager;
import v.VPagerCircleIndicator;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0444a {

    /* JADX INFO: renamed from: a */
    public View f7572a;

    /* JADX INFO: renamed from: b */
    public VPager f7573b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f7574c;

    /* JADX INFO: renamed from: d */
    public VButton f7575d;

    /* JADX INFO: renamed from: e */
    public l5j0 f7576e;

    /* JADX INFO: renamed from: f */
    public PutongFrag f7577f;

    /* JADX INFO: renamed from: g */
    public ArrayList<Privilege> f7578g;

    /* JADX INFO: renamed from: h */
    public Privilege f7579h;

    /* JADX INFO: renamed from: i */
    public cwf0 f7580i = i0e.c("p_privilege_intro", C0444a.class.getName());

    /* JADX INFO: renamed from: j */
    public PurchaseType f7581j;

    /* JADX INFO: renamed from: k */
    public View f7582k;

    /* JADX INFO: renamed from: l */
    public f f7583l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a$a */
    public class a extends ViewPager.m {
        public a() {
        }

        public void onPageSelected(int i) {
            super.onPageSelected(i);
            if (i < C0444a.this.f7578g.size()) {
                CoreModule.f1543l.m11711g().m6934Bl(C0444a.this.f7581j, (Privilege) C0444a.this.f7578g.get(i));
                C0444a c0444a = C0444a.this;
                c0444a.f7579h = (Privilege) c0444a.f7578g.get(i);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a$b */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f7585a;

        public b(BottomSheetBehavior bottomSheetBehavior) {
            this.f7585a = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f7585a.setPeekHeight(C0444a.this.f7582k.getHeight());
            C0444a.this.f7582k.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a$c */
    public class c extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f7587a;

        public c(BottomSheetBehavior bottomSheetBehavior) {
            this.f7587a = bottomSheetBehavior;
        }

        public void onSlide(@NonNull View view, float f) {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 4) {
                this.f7587a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                C0444a.this.f7576e.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a$d */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7589a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f7589a = iArr;
            try {
                iArr[PurchaseType.TYPE_O_PLATINUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7589a[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7589a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7589a[PurchaseType.TYPE_SUPREME_PARTNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7589a[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7589a[PurchaseType.TYPE_YOUTH_VIP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7589a[PurchaseType.TYPE_GET_VIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a$e */
    public static class e extends eb2 {

        /* JADX INFO: renamed from: e */
        public final PurchaseType f7590e;

        /* JADX INFO: renamed from: f */
        public ArrayList<Privilege> f7591f;

        /* JADX INFO: renamed from: g */
        public PutongFrag f7592g;

        public e(PutongFrag putongFrag, ArrayList<Privilege> arrayList, PurchaseType purchaseType) {
            this.f7592g = putongFrag;
            this.f7591f = arrayList;
            this.f7590e = purchaseType;
        }

        public int getCount() {
            return this.f7591f.size();
        }

        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: m */
        public void m10905m(Object obj) {
            super.m(obj);
            if (obj instanceof PrivilegeContentDlgItemView) {
                ((PrivilegeContentDlgItemView) obj).m10848R0();
            }
        }

        /* JADX INFO: renamed from: o */
        public void m10906o(ViewGroup viewGroup, int i, Object obj) {
            View view = (View) obj;
            SVGAnimationView childAt = ((FrameLayout) view.findViewById(x4c0.f)).getChildAt(0);
            if (childAt instanceof SVGAnimationView) {
                childAt.stopAnimation(true);
            }
            viewGroup.removeView(view);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, com.p1.mobile.putong.core.ui.vip.privilege.dlg.PrivilegeContentDlgItemView, java.lang.Object] */
        /* JADX INFO: renamed from: p */
        public Object m10907p(ViewGroup viewGroup, int i) {
            ?? r1 = (PrivilegeContentDlgItemView) o7r.a(viewGroup.getContext()).inflate(k6c0.l1, viewGroup, false);
            r1.m10855W(this.f7592g, this, this.f7591f.get(i), this.f7592g.act(), this.f7590e);
            viewGroup.addView(r1);
            return r1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.a$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo10908a(PurchaseType purchaseType, Privilege privilege);
    }

    public C0444a(PutongFrag putongFrag) {
        this.f7577f = putongFrag;
    }

    /* JADX INFO: renamed from: h */
    public final void m10896h(View view) {
        ju80.a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final void m10897i() {
        Window window = this.f7576e.getWindow();
        if (NullChecker.b(window)) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(x4c0.h));
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setPeekHeight(0);
            this.f7582k.getViewTreeObserver().addOnGlobalLayoutListener(new b(bottomSheetBehaviorFrom));
            bottomSheetBehaviorFrom.setBottomSheetCallback(new c(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m10898j() {
        switch (d.f7589a[this.f7581j.ordinal()]) {
            case 1:
                boolean zM27353H3 = xma.m27353H3();
                VButton vButton = this.f7575d;
                if (zM27353H3) {
                    vButton.setText("续费白金会员");
                } else {
                    vButton.setText("成为白金会员");
                }
                this.f7575d.setTextColor(Color.parseColor("#ffffff"));
                this.f7575d.setBackgroundResource(b3c0.g);
                break;
            case 2:
                boolean zM27351F3 = xma.m27351F3();
                VButton vButton2 = this.f7575d;
                if (zM27351F3) {
                    vButton2.setText("续费黑金会员");
                } else {
                    vButton2.setText("成为黑金会员");
                }
                this.f7575d.setTextColor(Color.parseColor("#ffdea2"));
                this.f7575d.setBackgroundResource(b3c0.z5);
                break;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                boolean zIsSVIP = CoreModule.f1534c.f3628e0.m21490p9().isSVIP();
                VButton vButton3 = this.f7575d;
                if (zIsSVIP) {
                    vButton3.setText(this.f7577f.getText(com.p1.mobile.putong.core.member.R.string.D));
                } else {
                    vButton3.setText(this.f7577f.getText(com.p1.mobile.putong.core.member.R.string.B));
                }
                this.f7575d.setBackgroundResource(b3c0.A5);
                break;
            case CameraSticker.STATE_ERROR /* 4 */:
                this.f7575d.setText("至尊合伙人申请");
                this.f7575d.setTextColor(Color.parseColor("#011703"));
                this.f7575d.setBackgroundResource(b3c0.h);
                break;
            case 5:
                boolean zM27347B3 = xma.m27347B3();
                VButton vButton4 = this.f7575d;
                if (zM27347B3) {
                    vButton4.setText("续费她专享会员");
                } else {
                    vButton4.setText("成为她专享会员");
                }
                this.f7575d.setTextColor(Color.parseColor("#ffffff"));
                this.f7575d.setBackgroundResource(b3c0.l);
                break;
            case 6:
                boolean zM27358O3 = xma.m27358O3();
                VButton vButton5 = this.f7575d;
                if (zM27358O3) {
                    vButton5.setText("续费青春专享会员");
                } else {
                    vButton5.setText("成为青春专享会员");
                }
                this.f7575d.setTextColor(Color.parseColor("#ffffff"));
                this.f7575d.setBackgroundResource(b3c0.S5);
                break;
            default:
                boolean zIsVIP = CoreModule.f1534c.f3628e0.m21490p9().isVIP();
                VButton vButton6 = this.f7575d;
                if (!zIsVIP) {
                    vButton6.setText(com.p1.mobile.putong.core.member.R.string.I1);
                } else {
                    vButton6.setText(this.f7577f.getText(com.p1.mobile.putong.core.member.R.string.J1));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m10899k() {
        if (xdl0.w0() <= 1280) {
            this.f7575d.setTextSize(2, xdl0.w0() < 960 ? 15.0f : 18.0f);
        }
        this.f7573b.setAdapter(new e(this.f7577f, this.f7578g, this.f7581j));
        this.f7573b.d(new a());
        this.f7574c.setViewPager(this.f7573b);
        if (sab0.x(this.f7581j)) {
            this.f7574c.setFillColor(Color.parseColor("#BCE46A"));
            this.f7574c.setPageColor(Color.parseColor("#0A000000"));
        } else if (sab0.g(this.f7581j)) {
            this.f7574c.setFillColor(Color.parseColor("#F482CE"));
            this.f7574c.setPageColor(Color.parseColor("#0A000000"));
        } else if (sab0.o(this.f7581j)) {
            this.f7574c.setFillColor(Color.parseColor("#656f78"));
        } else if (sab0.i(this.f7581j)) {
            this.f7574c.setFillColor(Color.parseColor("#a76f11"));
        } else if (sab0.q(this.f7581j)) {
            this.f7574c.setFillColor(Color.parseColor("#FFB775"));
            this.f7574c.setPageColor(Color.parseColor("#0A000000"));
        } else if (sab0.w(this.f7581j)) {
            this.f7574c.setFillColor(Color.parseColor("#E9B48E"));
            this.f7574c.setPageColor(Color.parseColor("#0A000000"));
        } else if (sab0.u(this.f7581j)) {
            this.f7574c.setFillColor(Color.parseColor("#FFD589"));
            this.f7574c.setPageColor(Color.parseColor("#33FFD589"));
            this.f7572a.setBackgroundResource(b3c0.a2);
            if (xma.m27357N3()) {
                xdl0.M(this.f7575d, false);
                xdl0.U(this.f7574c, t100.y);
            }
        }
        this.f7575d.setTypeface(eqh0.c(3));
        this.f7575d.setOnClickListener(new View.OnClickListener() { // from class: l.ut80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23738a.m10901m(view);
            }
        });
        m10898j();
        this.f7576e.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.vt80
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f24455a.m10902n(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m10900l() {
        switch (d.f7589a[this.f7581j.ordinal()]) {
            case 1:
                this.f7578g = PurchaseType.TYPE_O_PLATINUM.getPrivilegeData((Gender) null);
                break;
            case 2:
                this.f7578g = PurchaseType.TYPE_O_DIAMOND.getPrivilegeData((Gender) null);
                break;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                this.f7578g = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData((Gender) null);
                break;
            case CameraSticker.STATE_ERROR /* 4 */:
                this.f7578g = PurchaseType.TYPE_SUPREME_PARTNER.getPrivilegeData((Gender) null);
                break;
            case 5:
                this.f7578g = PurchaseType.TYPE_FEMALE_VIP.getPrivilegeData((Gender) null);
                break;
            case 6:
                this.f7578g = PurchaseType.TYPE_YOUTH_VIP.getPrivilegeData((Gender) null);
                break;
            default:
                this.f7578g = CoreModule.m1854P().m11711g().m6942Dq();
                break;
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m10901m(View view) {
        CoreModule.f1543l.m11711g().m7019wn(this.f7581j);
        f fVar = this.f7583l;
        if (fVar != null) {
            fVar.mo10908a(this.f7581j, this.f7579h);
        }
        this.f7576e.cancel();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m10902n(DialogInterface dialogInterface) {
        i0e.e(this.f7580i);
    }

    /* JADX INFO: renamed from: o */
    public void m10903o(Privilege privilege) {
        if (this.f7578g.indexOf(privilege) == 0 && this.f7578g.indexOf(privilege) == this.f7573b.getCurrentItem()) {
            CoreModule.f1543l.m11711g().m6934Bl(this.f7581j, privilege);
        }
        if (vwb.J(this.f7578g) || this.f7578g.indexOf(privilege) < 0) {
            return;
        }
        this.f7573b.setCurrentItem(this.f7578g.indexOf(privilege));
    }

    /* JADX INFO: renamed from: p */
    public void m10904p(@NonNull PurchaseType purchaseType, f fVar) {
        if (purchaseType == null) {
            return;
        }
        this.f7581j = purchaseType;
        this.f7583l = fVar;
        this.f7576e = new l5j0(this.f7577f.act(), sab0.u(purchaseType) ? w7c0.b : w7c0.a);
        View viewInflate = o7r.a(this.f7577f.act()).inflate(k6c0.k1, (ViewGroup) null);
        this.f7582k = viewInflate;
        this.f7576e.setContentView(viewInflate);
        m10896h(this.f7582k);
        m10900l();
        m10899k();
        this.f7576e.show();
        m10897i();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", CoreModule.m1854P().m11711g().m6990d6(purchaseType));
            jSONObject.put("tooltips_trigger_mode", "active");
        } catch (JSONException e2) {
            CrashHelper.c(e2);
        }
        this.f7580i.o(jSONObject);
        i0e.f(this.f7580i);
        CoreModule.f1543l.m11711g().m6962Pr(purchaseType);
    }
}
