package com.p000p1.mobile.putong.core.p004ui.result;

import android.R;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.cwf0;
import l.d3c0;
import l.e30;
import l.eb2;
import l.fy80;
import l.hmb;
import l.i0e;
import l.igl0;
import l.jo0;
import l.l5j0;
import l.lsi0;
import l.m6c0;
import l.mkd0;
import l.n3b0;
import l.o7r;
import l.sab0;
import l.t100;
import l.vwb;
import l.wek0;
import l.xdl0;
import l.y7c0;
import l.z4c0;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.cll0;
import p006l.iab0;
import p006l.xma;
import p006l.zck0;
import v.VPager;
import v.VPagerCircleIndicator;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0275a {

    /* JADX INFO: renamed from: a */
    public ImageView f5469a;

    /* JADX INFO: renamed from: b */
    public VPager f5470b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f5471c;

    /* JADX INFO: renamed from: d */
    public VText f5472d;

    /* JADX INFO: renamed from: e */
    public l5j0 f5473e;

    /* JADX INFO: renamed from: f */
    public PutongFrag f5474f;

    /* JADX INFO: renamed from: g */
    public ArrayList<Privilege> f5475g;

    /* JADX INFO: renamed from: h */
    public Privilege f5476h;

    /* JADX INFO: renamed from: i */
    public cwf0 f5477i = i0e.c("p_privilege_intro", C0275a.class.getName());

    /* JADX INFO: renamed from: j */
    public PurchaseType f5478j;

    /* JADX INFO: renamed from: k */
    public c4g0 f5479k;

    /* JADX INFO: renamed from: l */
    public c4g0 f5480l;

    /* JADX INFO: renamed from: m */
    public View f5481m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a$a */
    public class a extends ViewPager.m {
        public a() {
        }

        public void onPageSelected(int i) {
            super.onPageSelected(i);
            if (i < C0275a.this.f5475g.size()) {
                cll0.m13525g(C0275a.this.f5478j, (Privilege) C0275a.this.f5475g.get(i));
                C0275a c0275a = C0275a.this;
                c0275a.f5476h = (Privilege) c0275a.f5475g.get(i);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C0275a.this.m8277z();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a$c */
    public class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f5484a;

        public c(BottomSheetBehavior bottomSheetBehavior) {
            this.f5484a = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f5484a.setPeekHeight(C0275a.this.f5481m.getHeight());
            C0275a.this.f5481m.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a$d */
    public class d extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f5486a;

        public d(BottomSheetBehavior bottomSheetBehavior) {
            this.f5486a = bottomSheetBehavior;
        }

        public void onSlide(@NonNull View view, float f) {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 4) {
                this.f5486a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                C0275a.this.f5473e.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a$e */
    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5488a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f5488a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5488a[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5488a[PurchaseType.TYPE_GET_VIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5488a[PurchaseType.TYPE_GET_BOOST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5488a[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a$f */
    public static class f extends eb2 {

        /* JADX INFO: renamed from: e */
        public final PurchaseType f5489e;

        /* JADX INFO: renamed from: f */
        public ArrayList<Privilege> f5490f;

        /* JADX INFO: renamed from: g */
        public PutongFrag f5491g;

        public f(PutongFrag putongFrag, ArrayList<Privilege> arrayList, PurchaseType purchaseType) {
            this.f5491g = putongFrag;
            this.f5490f = arrayList;
            this.f5489e = purchaseType;
        }

        public int getCount() {
            return this.f5490f.size();
        }

        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: m */
        public void m8278m(Object obj) {
            super.m(obj);
            if (obj instanceof VipContentDlgItemView) {
                ((VipContentDlgItemView) obj).m8227p1();
            }
        }

        /* JADX INFO: renamed from: o */
        public void m8279o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, com.p1.mobile.putong.core.ui.result.VipContentDlgItemView, java.lang.Object] */
        /* JADX INFO: renamed from: p */
        public Object m8280p(ViewGroup viewGroup, int i) {
            ?? r1 = (VipContentDlgItemView) o7r.a(viewGroup.getContext()).inflate(m6c0.c3, viewGroup, false);
            r1.m8231t0(this.f5491g, this, this.f5490f.get(i), this.f5491g.act(), this.f5489e);
            viewGroup.addView(r1);
            return r1;
        }
    }

    public C0275a(PutongFrag putongFrag) {
        this.f5474f = putongFrag;
    }

    /* JADX INFO: renamed from: l */
    public final void m8263l(View view) {
        igl0.a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public final void m8264m() {
        Window window = this.f5473e.getWindow();
        if (NullChecker.b(window)) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(z4c0.y));
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setPeekHeight(0);
            this.f5481m.getViewTreeObserver().addOnGlobalLayoutListener(new c(bottomSheetBehaviorFrom));
            bottomSheetBehaviorFrom.setBottomSheetCallback(new d(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8265n(String str) {
        int i = e.f5488a[this.f5478j.ordinal()];
        if (i == 1) {
            boolean zM27381f4 = xma.m27381f4();
            VText vText = this.f5472d;
            if (zM27381f4) {
                vText.setText(this.f5474f.getText(com.p1.mobile.putong.core.pay.R.string.k1));
            } else {
                vText.setText(this.f5474f.getText(com.p1.mobile.putong.core.pay.R.string.h1));
            }
            this.f5472d.setBackgroundResource(d3c0.d);
            return;
        }
        if (i == 2) {
            long jG = n3b0.g();
            int i2 = com.p1.mobile.putong.core.pay.R.string.Z9;
            int i3 = com.p1.mobile.putong.core.pay.R.string.C9;
            if (CoreModule.m1854P().m11706a().m19710B()) {
                i2 = com.p1.mobile.putong.core.pay.R.string.w3;
                i3 = com.p1.mobile.putong.core.pay.R.string.v3;
            }
            VText vText2 = this.f5472d;
            if (jG == 0) {
                vText2.setText(str + this.f5474f.getString(i3));
            } else {
                vText2.setText(str + this.f5474f.getString(i2));
            }
            this.f5472d.setBackgroundResource(d3c0.d);
            return;
        }
        if (NullChecker.a((Object) null)) {
            this.f5472d.setText(com.p1.mobile.putong.core.pay.R.string.B);
            return;
        }
        if (CoreModule.f1534c.f3628e0.m21490p9().isVIP() || CoreModule.f1534c.f3628e0.m21490p9().isVIPExpired()) {
            this.f5472d.setText(str + ((Object) this.f5474f.getText(com.p1.mobile.putong.core.pay.R.string.ca)));
            return;
        }
        boolean zM5444h5 = CoreModule.m1854P().m11706a().m5444h5();
        VText vText3 = this.f5472d;
        if (zM5444h5) {
            vText3.setText(com.p1.mobile.putong.core.pay.R.string.ba);
            return;
        }
        vText3.setText(str + ((Object) this.f5474f.getText(com.p1.mobile.putong.core.pay.R.string.ba)));
    }

    /* JADX INFO: renamed from: o */
    public final void m8266o() {
        if (xdl0.w0() <= 1280) {
            this.f5472d.setTextSize(2, xdl0.w0() < 960 ? 15.0f : 18.0f);
        }
        this.f5469a.setOnClickListener(new View.OnClickListener() { // from class: l.gfl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13306a.m8269r(view);
            }
        });
        this.f5470b.setAdapter(new f(this.f5474f, this.f5475g, this.f5478j));
        this.f5470b.d(new a());
        this.f5471c.setViewPager(this.f5470b);
        this.f5472d.setOnClickListener(new View.OnClickListener() { // from class: l.hfl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13866a.m8270s(view);
            }
        });
        m8265n("");
        this.f5473e.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ifl0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f14431a.m8271t(dialogInterface);
            }
        });
        this.f5481m.addOnAttachStateChangeListener(new b());
        if (xdl0.w0() <= 1280) {
            this.f5470b.getLayoutParams().height = t100.d(hmb.m1() * 412.0f);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5471c.getLayoutParams();
            layoutParams.setMargins(0, t100.d(5.0f), 0, 0);
            this.f5471c.setLayoutParams(layoutParams);
        }
        m8268q();
    }

    /* JADX INFO: renamed from: p */
    public final void m8267p() {
        int i = e.f5488a[this.f5478j.ordinal()];
        if (i == 1) {
            this.f5475g = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP((Gender) null);
        } else if (i != 2) {
            this.f5475g = fy80.z();
        } else {
            this.f5475g = PurchaseType.TYPE_GET_LIKERS.getPrivilegeData((Gender) null);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m8268q() {
        if (CoreModule.m1854P().m11706a().m5444h5()) {
            m8265n("");
        } else {
            this.f5479k = com.p1.mobile.putong.core.ui.purchase.e.v(this.f5474f.act(), this.f5478j).subscribe(mkd0.G(new e30() { // from class: l.jfl0
                public final void call(Object obj) {
                    this.f15141a.m8272u((d) obj);
                }
            }));
        }
        if (CoreModule.f1534c.f3643j0.m2502B4()) {
            final long j = CoreModule.f1534c.f3643j0.m2504C4().endTime * 1000;
            this.f5480l = this.f5474f.duringCreated(rx.c.interval(0L, 1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.kfl0
                public final void call(Object obj) {
                    this.f15804a.m8273v(j, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m8269r(View view) {
        this.f5473e.cancel();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m8270s(View view) {
        this.f5473e.cancel();
        cll0.m13520b(this.f5478j);
        String str = wek0.a;
        int i = e.f5488a[this.f5478j.ordinal()];
        if (i == 1) {
            CoreModule.m1854P().m11706a().m5338Rm(this.f5474f.act(), str);
            return;
        }
        if (i == 2) {
            if (CoreModule.m1854P().m11706a().m5379Xi() && CoreModule.m1851K().me_().isSVIP()) {
                lsi0.j(this.f5474f.act().getString(com.p1.mobile.putong.core.pay.R.string.S3));
                return;
            } else {
                CoreModule.m1854P().m11706a().m5471l1(this.f5474f.act(), str);
                return;
            }
        }
        if (i != 3) {
            if (i == 4) {
                com.p1.mobile.putong.core.ui.purchase.c.c1(this.f5474f.act(), str);
                return;
            } else {
                if (i == 5 && CoreModule.m1854P().m11706a().m19853a2()) {
                    com.p1.mobile.putong.core.ui.purchase.c.Z(this.f5474f.act(), str);
                    return;
                }
                return;
            }
        }
        if (CoreModule.m1854P().m11706a().m5379Xi() && CoreModule.m1851K().me_().isSVIP()) {
            lsi0.j(this.f5474f.act().getString(com.p1.mobile.putong.core.pay.R.string.S3));
            return;
        }
        if (CoreModule.m1854P().m11706a().m5444h5() && CoreModule.f1534c.f3628e0.m21490p9().isVIP() && !xma.m27379e4()) {
            lsi0.w(com.p1.mobile.putong.core.pay.R.string.O0);
            return;
        }
        boolean zM2502B4 = CoreModule.f1534c.f3643j0.m2502B4();
        PutongFrag putongFrag = this.f5474f;
        if (!zM2502B4) {
            com.p1.mobile.putong.core.ui.purchase.c.I1(putongFrag.act(), str);
        } else {
            this.f5474f.act().startActivity(WebViewAct.a2(putongFrag.act(), CoreModule.f1534c.f3643j0.m2504C4().titleText, CoreModule.f1534c.f3643j0.m2504C4().promotionUrl, true));
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m8271t(DialogInterface dialogInterface) {
        m8277z();
        i0e.e(this.f5477i);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m8272u(com.p1.mobile.putong.core.ui.purchase.d dVar) {
        String str;
        com.p1.mobile.putong.core.ui.purchase.d.a aVarB = dVar.b();
        if (aVarB == null) {
            aVarB = dVar.d();
        }
        String strQ = com.p1.mobile.putong.core.ui.purchase.e.q(aVarB);
        if (vwb.L(strQ)) {
            str = "";
        } else {
            str = strQ + " ";
        }
        m8265n(str);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m8273v(long j, Long l2) {
        m8274w(zck0.m28688a(j, true, true, true, true));
    }

    /* JADX INFO: renamed from: w */
    public void m8274w(String str) {
        if (sab0.w(this.f5478j)) {
            this.f5472d.setText(CoreModule.f1533b.getString(com.p1.mobile.putong.core.pay.R.string.S1) + "\n" + str);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m8275x(Privilege privilege) {
        if (this.f5475g.indexOf(privilege) == 0 && this.f5475g.indexOf(privilege) == this.f5470b.getCurrentItem()) {
            cll0.m13525g(this.f5478j, privilege);
        }
        if (vwb.J(this.f5475g) || this.f5475g.indexOf(privilege) < 0) {
            return;
        }
        this.f5470b.setCurrentItem(this.f5475g.indexOf(privilege));
    }

    /* JADX INFO: renamed from: y */
    public void m8276y(@NonNull PurchaseType purchaseType) {
        if (purchaseType == null) {
            return;
        }
        this.f5478j = purchaseType;
        this.f5473e = new l5j0(this.f5474f.act(), y7c0.c);
        View viewInflate = o7r.a(this.f5474f.act()).inflate(m6c0.b3, (ViewGroup) null);
        this.f5481m = viewInflate;
        this.f5473e.setContentView(viewInflate);
        m8263l(this.f5481m);
        m8267p();
        m8266o();
        this.f5473e.show();
        m8264m();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", iab0.m16584k(purchaseType));
            jSONObject.put("tooltips_trigger_mode", "active");
        } catch (JSONException e2) {
            CrashHelper.c(e2);
        }
        this.f5477i.o(jSONObject);
        i0e.f(this.f5477i);
        cll0.m13526h(purchaseType);
    }

    /* JADX INFO: renamed from: z */
    public final void m8277z() {
        if (NullChecker.a(this.f5479k)) {
            this.f5479k.unsubscribe();
            this.f5479k = null;
        }
        if (NullChecker.a(this.f5480l)) {
            mkd0.z(this.f5480l);
            this.f5480l = null;
        }
    }
}
