package com.p046p1.mobile.putong.core.p053ui.result;

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
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText;
import p149l.c4g0;
import p149l.cll0;
import p149l.cwf0;
import p149l.d3c0;
import p149l.e30;
import p149l.eb2;
import p149l.fy80;
import p149l.hmb;
import p149l.i0e;
import p149l.iab0;
import p149l.igl0;
import p149l.jo0;
import p149l.l5j0;
import p149l.lsi0;
import p149l.m6c0;
import p149l.mkd0;
import p149l.n3b0;
import p149l.o7r;
import p149l.sab0;
import p149l.t100;
import p149l.vwb;
import p149l.wek0;
import p149l.xdl0;
import p149l.xma;
import p149l.y7c0;
import p149l.z4c0;
import p149l.zck0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a */
/* JADX INFO: loaded from: classes9.dex */
public class C8839a {

    /* JADX INFO: renamed from: a */
    public ImageView f35688a;

    /* JADX INFO: renamed from: b */
    public VPager f35689b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f35690c;

    /* JADX INFO: renamed from: d */
    public VText f35691d;

    /* JADX INFO: renamed from: e */
    public l5j0 f35692e;

    /* JADX INFO: renamed from: f */
    public PutongFrag f35693f;

    /* JADX INFO: renamed from: g */
    public ArrayList<Privilege> f35694g;

    /* JADX INFO: renamed from: h */
    public Privilege f35695h;

    /* JADX INFO: renamed from: i */
    public cwf0 f35696i = i0e.m133794c("p_privilege_intro", C8839a.class.getName());

    /* JADX INFO: renamed from: j */
    public PurchaseType f35697j;

    /* JADX INFO: renamed from: k */
    public c4g0 f35698k;

    /* JADX INFO: renamed from: l */
    public c4g0 f35699l;

    /* JADX INFO: renamed from: m */
    public View f35700m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a$a */
    public class a extends ViewPager.C0719m {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            if (i < C8839a.this.f35694g.size()) {
                cll0.m107560g(C8839a.this.f35697j, (Privilege) C8839a.this.f35694g.get(i));
                C8839a c8839a = C8839a.this;
                c8839a.f35695h = (Privilege) c8839a.f35694g.get(i);
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
            C8839a.this.m54916z();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a$c */
    public class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f35703a;

        public c(BottomSheetBehavior bottomSheetBehavior) {
            this.f35703a = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f35703a.setPeekHeight(C8839a.this.f35700m.getHeight());
            C8839a.this.f35700m.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a$d */
    public class d extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f35705a;

        public d(BottomSheetBehavior bottomSheetBehavior) {
            this.f35705a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 4) {
                this.f35705a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                C8839a.this.f35692e.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a$e */
    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35707a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f35707a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35707a[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35707a[PurchaseType.TYPE_GET_VIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35707a[PurchaseType.TYPE_GET_BOOST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35707a[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a$f */
    public static class f extends eb2 {

        /* JADX INFO: renamed from: e */
        public final PurchaseType f35708e;

        /* JADX INFO: renamed from: f */
        public ArrayList<Privilege> f35709f;

        /* JADX INFO: renamed from: g */
        public PutongFrag f35710g;

        public f(PutongFrag putongFrag, ArrayList<Privilege> arrayList, PurchaseType purchaseType) {
            this.f35710g = putongFrag;
            this.f35709f = arrayList;
            this.f35708e = purchaseType;
        }

        @Override // p149l.w660
        public int getCount() {
            return this.f35709f.size();
        }

        @Override // p149l.w660
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: m */
        public void mo43284m(Object obj) {
            super.mo43284m(obj);
            if (obj instanceof VipContentDlgItemView) {
                ((VipContentDlgItemView) obj).m54866p1();
            }
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            VipContentDlgItemView vipContentDlgItemView = (VipContentDlgItemView) o7r.m163037a(viewGroup.getContext()).inflate(m6c0.f131575c3, viewGroup, false);
            vipContentDlgItemView.m54870t0(this.f35710g, this, this.f35709f.get(i), this.f35710g.act(), this.f35708e);
            viewGroup.addView(vipContentDlgItemView);
            return vipContentDlgItemView;
        }
    }

    public C8839a(PutongFrag putongFrag) {
        this.f35693f = putongFrag;
    }

    /* JADX INFO: renamed from: l */
    public final void m54902l(View view) {
        igl0.m136074a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public final void m54903m() {
        Window window = this.f35692e.getWindow();
        if (NullChecker.m81304b(window)) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(z4c0.f201574y));
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setPeekHeight(0);
            this.f35700m.getViewTreeObserver().addOnGlobalLayoutListener(new c(bottomSheetBehaviorFrom));
            bottomSheetBehaviorFrom.setBottomSheetCallback(new d(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m54904n(String str) {
        int i = e.f35707a[this.f35697j.ordinal()];
        if (i == 1) {
            boolean zM210073f4 = xma.m210073f4();
            VText vText = this.f35691d;
            if (zM210073f4) {
                vText.setText(this.f35693f.getText(R$string.f27498k1));
            } else {
                vText.setText(this.f35693f.getText(R$string.f27462h1));
            }
            this.f35691d.setBackgroundResource(d3c0.f83883d);
            return;
        }
        if (i == 2) {
            long jM157733g = n3b0.m157733g();
            int i2 = R$string.f27375Z9;
            int i3 = R$string.f27122C9;
            if (CoreModule.m29935P().m94651a().mo158204B()) {
                i2 = R$string.f27638w3;
                i3 = R$string.f27627v3;
            }
            VText vText2 = this.f35691d;
            if (jM157733g == 0) {
                vText2.setText(str + this.f35693f.getString(i3));
            } else {
                vText2.setText(str + this.f35693f.getString(i2));
            }
            this.f35691d.setBackgroundResource(d3c0.f83883d);
            return;
        }
        if (NullChecker.m81303a(null)) {
            this.f35691d.setText(R$string.f27101B);
            return;
        }
        if (CoreModule.f17545c.f19639e0.m169527p9().isVIP() || CoreModule.f17545c.f19639e0.m169527p9().isVIPExpired()) {
            this.f35691d.setText(str + ((Object) this.f35693f.getText(R$string.f27411ca)));
            return;
        }
        boolean zMo33507h5 = CoreModule.m29935P().m94651a().mo33507h5();
        VText vText3 = this.f35691d;
        if (zMo33507h5) {
            vText3.setText(R$string.f27399ba);
            return;
        }
        vText3.setText(str + ((Object) this.f35693f.getText(R$string.f27399ba)));
    }

    /* JADX INFO: renamed from: o */
    public final void m54905o() {
        if (xdl0.m208408w0() <= 1280) {
            this.f35691d.setTextSize(2, xdl0.m208408w0() < 960 ? 15.0f : 18.0f);
        }
        this.f35688a.setOnClickListener(new View.OnClickListener() { // from class: l.gfl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102403a.m54908r(view);
            }
        });
        this.f35689b.setAdapter(new f(this.f35693f, this.f35694g, this.f35697j));
        this.f35689b.m4185d(new a());
        this.f35690c.setViewPager(this.f35689b);
        this.f35691d.setOnClickListener(new View.OnClickListener() { // from class: l.hfl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107494a.m54909s(view);
            }
        });
        m54904n("");
        this.f35692e.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ifl0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f113036a.m54910t(dialogInterface);
            }
        });
        this.f35700m.addOnAttachStateChangeListener(new b());
        if (xdl0.m208408w0() <= 1280) {
            this.f35689b.getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 412.0f);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f35690c.getLayoutParams();
            layoutParams.setMargins(0, t100.m186890d(5.0f), 0, 0);
            this.f35690c.setLayoutParams(layoutParams);
        }
        m54907q();
    }

    /* JADX INFO: renamed from: p */
    public final void m54906p() {
        int i = e.f35707a[this.f35697j.ordinal()];
        if (i == 1) {
            this.f35694g = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(null);
        } else if (i != 2) {
            this.f35694g = fy80.m123730z();
        } else {
            this.f35694g = PurchaseType.TYPE_GET_LIKERS.getPrivilegeData(null);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m54907q() {
        if (CoreModule.m29935P().m94651a().mo33507h5()) {
            m54904n("");
        } else {
            this.f35698k = C8766e.m53648v(this.f35693f.act(), this.f35697j).subscribe(mkd0.m154955G(new e30() { // from class: l.jfl0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f117675a.m54911u((C8765d) obj);
                }
            }));
        }
        if (CoreModule.f17545c.f19654j0.m30574B4()) {
            final long j = CoreModule.f17545c.f19654j0.m30576C4().endTime * 1000;
            this.f35699l = this.f35693f.duringCreated(C22306c.interval(0L, 1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.kfl0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f122946a.m54912v(j, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m54908r(View view) {
        this.f35692e.cancel();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m54909s(View view) {
        this.f35692e.cancel();
        cll0.m107555b(this.f35697j);
        String str = wek0.f185947a;
        int i = e.f35707a[this.f35697j.ordinal()];
        if (i == 1) {
            CoreModule.m29935P().m94651a().mo33401Rm(this.f35693f.act(), str);
            return;
        }
        if (i == 2) {
            if (CoreModule.m29935P().m94651a().mo33442Xi() && CoreModule.m29932K().me_().isSVIP()) {
                lsi0.m151580j(this.f35693f.act().getString(R$string.f27292S3));
                return;
            } else {
                CoreModule.m29935P().m94651a().mo33534l1(this.f35693f.act(), str);
                return;
            }
        }
        if (i != 3) {
            if (i == 4) {
                C8764c.m53445c1(this.f35693f.act(), str);
                return;
            } else {
                if (i == 5 && CoreModule.m29935P().m94651a().mo158345a2()) {
                    C8764c.m53437Z(this.f35693f.act(), str);
                    return;
                }
                return;
            }
        }
        if (CoreModule.m29935P().m94651a().mo33442Xi() && CoreModule.m29932K().me_().isSVIP()) {
            lsi0.m151580j(this.f35693f.act().getString(R$string.f27292S3));
            return;
        }
        if (CoreModule.m29935P().m94651a().mo33507h5() && CoreModule.f17545c.f19639e0.m169527p9().isVIP() && !xma.m210071e4()) {
            lsi0.m151593w(R$string.f27245O0);
            return;
        }
        boolean zM30574B4 = CoreModule.f17545c.f19654j0.m30574B4();
        PutongFrag putongFrag = this.f35693f;
        if (!zM30574B4) {
            C8764c.m53400I1(putongFrag.act(), str);
        } else {
            this.f35693f.act().startActivity(WebViewAct.m80165a2(putongFrag.act(), CoreModule.f17545c.f19654j0.m30576C4().titleText, CoreModule.f17545c.f19654j0.m30576C4().promotionUrl, true));
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m54910t(DialogInterface dialogInterface) {
        m54916z();
        i0e.m133796e(this.f35696i);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m54911u(C8765d c8765d) {
        String str;
        C8765d.a aVarM53520b = c8765d.m53520b();
        if (aVarM53520b == null) {
            aVarM53520b = c8765d.m53522d();
        }
        String strM53643q = C8766e.m53643q(aVarM53520b);
        if (vwb.m200298L(strM53643q)) {
            str = "";
        } else {
            str = strM53643q + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        m54904n(str);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m54912v(long j, Long l2) {
        m54913w(zck0.m218065a(j, true, true, true, true));
    }

    /* JADX INFO: renamed from: w */
    public void m54913w(String str) {
        if (sab0.m182905w(this.f35697j)) {
            this.f35691d.setText(CoreModule.f17544b.getString(R$string.f27290S1) + SignParameters.NEW_LINE + str);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m54914x(Privilege privilege) {
        if (this.f35694g.indexOf(privilege) == 0 && this.f35694g.indexOf(privilege) == this.f35689b.getCurrentItem()) {
            cll0.m107560g(this.f35697j, privilege);
        }
        if (vwb.m200296J(this.f35694g) || this.f35694g.indexOf(privilege) < 0) {
            return;
        }
        this.f35689b.setCurrentItem(this.f35694g.indexOf(privilege));
    }

    /* JADX INFO: renamed from: y */
    public void m54915y(@NonNull PurchaseType purchaseType) {
        if (purchaseType == null) {
            return;
        }
        this.f35697j = purchaseType;
        this.f35692e = new l5j0(this.f35693f.act(), y7c0.f196693c);
        View viewInflate = o7r.m163037a(this.f35693f.act()).inflate(m6c0.f131570b3, (ViewGroup) null);
        this.f35700m = viewInflate;
        this.f35692e.setContentView(viewInflate);
        m54902l(this.f35700m);
        m54906p();
        m54905o();
        this.f35692e.show();
        m54903m();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", iab0.m135150k(purchaseType));
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
        } catch (JSONException e2) {
            CrashHelper.m81296c(e2);
        }
        this.f35696i.m109039o(jSONObject);
        i0e.m133797f(this.f35696i);
        cll0.m107561h(purchaseType);
    }

    /* JADX INFO: renamed from: z */
    public final void m54916z() {
        if (NullChecker.m81303a(this.f35698k)) {
            this.f35698k.unsubscribe();
            this.f35698k = null;
        }
        if (NullChecker.m81303a(this.f35699l)) {
            mkd0.m154992z(this.f35699l);
            this.f35699l = null;
        }
    }
}
