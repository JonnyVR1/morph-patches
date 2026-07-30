package com.p051p1.mobile.putong.core.p058ui.result;

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
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.VText;
import p153l.bnl0;
import p153l.cok0;
import p153l.dgc0;
import p153l.fdc0;
import p153l.fmk0;
import p153l.fo0;
import p153l.gul0;
import p153l.j690;
import p153l.jbc0;
import p153l.joa;
import p153l.jyb;
import p153l.kcg0;
import p153l.l4g0;
import p153l.lb2;
import p153l.mib0;
import p153l.mpl0;
import p153l.o1j0;
import p153l.p9r;
import p153l.pej0;
import p153l.psd0;
import p153l.qa00;
import p153l.rbb0;
import p153l.rec0;
import p153l.vnb;
import p153l.w1e;
import p153l.wib0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a */
/* JADX INFO: loaded from: classes12.dex */
public class C9002a {

    /* JADX INFO: renamed from: a */
    public ImageView f36536a;

    /* JADX INFO: renamed from: b */
    public VPager f36537b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f36538c;

    /* JADX INFO: renamed from: d */
    public VText f36539d;

    /* JADX INFO: renamed from: e */
    public pej0 f36540e;

    /* JADX INFO: renamed from: f */
    public PutongFrag f36541f;

    /* JADX INFO: renamed from: g */
    public ArrayList<Privilege> f36542g;

    /* JADX INFO: renamed from: h */
    public Privilege f36543h;

    /* JADX INFO: renamed from: i */
    public l4g0 f36544i = w1e.m204399c("p_privilege_intro", C9002a.class.getName());

    /* JADX INFO: renamed from: j */
    public PurchaseType f36545j;

    /* JADX INFO: renamed from: k */
    public kcg0 f36546k;

    /* JADX INFO: renamed from: l */
    public kcg0 f36547l;

    /* JADX INFO: renamed from: m */
    public View f36548m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a$a */
    public class a extends ViewPager.C0721m {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            if (i < C9002a.this.f36542g.size()) {
                gul0.m132342g(C9002a.this.f36545j, (Privilege) C9002a.this.f36542g.get(i));
                C9002a c9002a = C9002a.this;
                c9002a.f36543h = (Privilege) c9002a.f36542g.get(i);
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
            C9002a.this.m56099z();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a$c */
    public class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f36551a;

        public c(BottomSheetBehavior bottomSheetBehavior) {
            this.f36551a = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f36551a.setPeekHeight(C9002a.this.f36548m.getHeight());
            C9002a.this.f36548m.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a$d */
    public class d extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f36553a;

        public d(BottomSheetBehavior bottomSheetBehavior) {
            this.f36553a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 4) {
                this.f36553a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                C9002a.this.f36540e.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a$e */
    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36555a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f36555a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36555a[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36555a[PurchaseType.TYPE_GET_VIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36555a[PurchaseType.TYPE_GET_BOOST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36555a[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.a$f */
    public static class f extends lb2 {

        /* JADX INFO: renamed from: e */
        public final PurchaseType f36556e;

        /* JADX INFO: renamed from: f */
        public ArrayList<Privilege> f36557f;

        /* JADX INFO: renamed from: g */
        public PutongFrag f36558g;

        public f(PutongFrag putongFrag, ArrayList<Privilege> arrayList, PurchaseType purchaseType) {
            this.f36558g = putongFrag;
            this.f36557f = arrayList;
            this.f36556e = purchaseType;
        }

        @Override // p153l.cf60
        public int getCount() {
            return this.f36557f.size();
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: m */
        public void mo44299m(Object obj) {
            super.mo44299m(obj);
            if (obj instanceof VipContentDlgItemView) {
                ((VipContentDlgItemView) obj).m56049p1();
            }
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            VipContentDlgItemView vipContentDlgItemView = (VipContentDlgItemView) p9r.m171370a(viewGroup.getContext()).inflate(rec0.f162535c3, viewGroup, false);
            vipContentDlgItemView.m56053t0(this.f36558g, this, this.f36557f.get(i), this.f36558g.act(), this.f36556e);
            viewGroup.addView(vipContentDlgItemView);
            return vipContentDlgItemView;
        }
    }

    public C9002a(PutongFrag putongFrag) {
        this.f36541f = putongFrag;
    }

    /* JADX INFO: renamed from: l */
    public final void m56085l(View view) {
        mpl0.m159373a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public final void m56086m() {
        Window window = this.f36540e.getWindow();
        if (NullChecker.m82487b(window)) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(fdc0.f98450y));
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setPeekHeight(0);
            this.f36548m.getViewTreeObserver().addOnGlobalLayoutListener(new c(bottomSheetBehaviorFrom));
            bottomSheetBehaviorFrom.setBottomSheetCallback(new d(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m56087n(String str) {
        int i = e.f36555a[this.f36545j.ordinal()];
        if (i == 1) {
            boolean zM146388g4 = joa.m146388g4();
            VText vText = this.f36539d;
            if (zM146388g4) {
                vText.setText(this.f36541f.getText(R$string.f28346k1));
            } else {
                vText.setText(this.f36541f.getText(R$string.f28310h1));
            }
            this.f36539d.setBackgroundResource(jbc0.f119538d);
            return;
        }
        if (i == 2) {
            long jM180735g = rbb0.m180735g();
            int i2 = R$string.f28223Z9;
            int i3 = R$string.f27970C9;
            if (CoreModule.m30933P().m143405a().mo180296B()) {
                i2 = R$string.f28486w3;
                i3 = R$string.f28475v3;
            }
            VText vText2 = this.f36539d;
            if (jM180735g == 0) {
                vText2.setText(str + this.f36541f.getString(i3));
            } else {
                vText2.setText(str + this.f36541f.getString(i2));
            }
            this.f36539d.setBackgroundResource(jbc0.f119538d);
            return;
        }
        if (NullChecker.m82486a(null)) {
            this.f36539d.setText(R$string.f27949B);
            return;
        }
        if (CoreModule.f18264c.f20381e0.m116600p9().isVIP() || CoreModule.f18264c.f20381e0.m116600p9().isVIPExpired()) {
            this.f36539d.setText(str + ((Object) this.f36541f.getText(R$string.f28259ca)));
            return;
        }
        boolean zMo34510h5 = CoreModule.m30933P().m143405a().mo34510h5();
        VText vText3 = this.f36539d;
        if (zMo34510h5) {
            vText3.setText(R$string.f28247ba);
            return;
        }
        vText3.setText(str + ((Object) this.f36541f.getText(R$string.f28247ba)));
    }

    /* JADX INFO: renamed from: o */
    public final void m56088o() {
        if (bnl0.m105588w0() <= 1280) {
            this.f36539d.setTextSize(2, bnl0.m105588w0() < 960 ? 15.0f : 18.0f);
        }
        this.f36536a.setOnClickListener(new View.OnClickListener() { // from class: l.kol0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127764a.m56091r(view);
            }
        });
        this.f36537b.setAdapter(new f(this.f36541f, this.f36542g, this.f36545j));
        this.f36537b.m4187d(new a());
        this.f36538c.setViewPager(this.f36537b);
        this.f36539d.setOnClickListener(new View.OnClickListener() { // from class: l.lol0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132919a.m56092s(view);
            }
        });
        m56087n("");
        this.f36540e.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.mol0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f137838a.m56093t(dialogInterface);
            }
        });
        this.f36548m.addOnAttachStateChangeListener(new b());
        if (bnl0.m105588w0() <= 1280) {
            this.f36537b.getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 412.0f);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f36538c.getLayoutParams();
            layoutParams.setMargins(0, qa00.m175859d(5.0f), 0, 0);
            this.f36538c.setLayoutParams(layoutParams);
        }
        m56090q();
    }

    /* JADX INFO: renamed from: p */
    public final void m56089p() {
        int i = e.f36555a[this.f36545j.ordinal()];
        if (i == 1) {
            this.f36542g = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(null);
        } else if (i != 2) {
            this.f36542g = j690.m143634z();
        } else {
            this.f36542g = PurchaseType.TYPE_GET_LIKERS.getPrivilegeData(null);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m56090q() {
        if (CoreModule.m30933P().m143405a().mo34510h5()) {
            m56087n("");
        } else {
            this.f36546k = C8929e.m54831v(this.f36541f.act(), this.f36545j).subscribe(psd0.m173596G(new y20() { // from class: l.nol0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f142994a.m56094u((C8928d) obj);
                }
            }));
        }
        if (CoreModule.f18264c.f20396j0.m31577B4()) {
            final long j = CoreModule.f18264c.f20396j0.m31579C4().endTime * 1000;
            this.f36547l = this.f36541f.duringCreated(C22421c.interval(0L, 1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.ool0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f148378a.m56095v(j, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m56091r(View view) {
        this.f36540e.cancel();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m56092s(View view) {
        this.f36540e.cancel();
        gul0.m132337b(this.f36545j);
        String str = cok0.f82895a;
        int i = e.f36555a[this.f36545j.ordinal()];
        if (i == 1) {
            CoreModule.m30933P().m143405a().mo34404Rm(this.f36541f.act(), str);
            return;
        }
        if (i == 2) {
            if (CoreModule.m30933P().m143405a().mo34445Xi() && CoreModule.m30930K().me_().isSVIP()) {
                o1j0.m165636j(this.f36541f.act().getString(R$string.f28140S3));
                return;
            } else {
                CoreModule.m30933P().m143405a().mo34537l1(this.f36541f.act(), str);
                return;
            }
        }
        if (i != 3) {
            if (i == 4) {
                C8927c.m54628c1(this.f36541f.act(), str);
                return;
            } else {
                if (i == 5 && CoreModule.m30933P().m143405a().mo180437a2()) {
                    C8927c.m54620Z(this.f36541f.act(), str);
                    return;
                }
                return;
            }
        }
        if (CoreModule.m30933P().m143405a().mo34445Xi() && CoreModule.m30930K().me_().isSVIP()) {
            o1j0.m165636j(this.f36541f.act().getString(R$string.f28140S3));
            return;
        }
        if (CoreModule.m30933P().m143405a().mo34510h5() && CoreModule.f18264c.f20381e0.m116600p9().isVIP() && !joa.m146386f4()) {
            o1j0.m165649w(R$string.f28093O0);
            return;
        }
        boolean zM31577B4 = CoreModule.f18264c.f20396j0.m31577B4();
        PutongFrag putongFrag = this.f36541f;
        if (!zM31577B4) {
            C8927c.m54583I1(putongFrag.act(), str);
        } else {
            this.f36541f.act().startActivity(WebViewAct.m81348b2(putongFrag.act(), CoreModule.f18264c.f20396j0.m31579C4().titleText, CoreModule.f18264c.f20396j0.m31579C4().promotionUrl, true));
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m56093t(DialogInterface dialogInterface) {
        m56099z();
        w1e.m204401e(this.f36544i);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m56094u(C8928d c8928d) {
        String str;
        C8928d.a aVarM54703b = c8928d.m54703b();
        if (aVarM54703b == null) {
            aVarM54703b = c8928d.m54705d();
        }
        String strM54826q = C8929e.m54826q(aVarM54703b);
        if (jyb.m147481L(strM54826q)) {
            str = "";
        } else {
            str = strM54826q + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        }
        m56087n(str);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m56095v(long j, Long l2) {
        m56096w(fmk0.m126240a(j, true, true, true, true));
    }

    /* JADX INFO: renamed from: w */
    public void m56096w(String str) {
        if (wib0.m206579w(this.f36545j)) {
            this.f36539d.setText(CoreModule.f18263b.getString(R$string.f28138S1) + SignParameters.NEW_LINE + str);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m56097x(Privilege privilege) {
        if (this.f36542g.indexOf(privilege) == 0 && this.f36542g.indexOf(privilege) == this.f36537b.getCurrentItem()) {
            gul0.m132342g(this.f36545j, privilege);
        }
        if (jyb.m147479J(this.f36542g) || this.f36542g.indexOf(privilege) < 0) {
            return;
        }
        this.f36537b.setCurrentItem(this.f36542g.indexOf(privilege));
    }

    /* JADX INFO: renamed from: y */
    public void m56098y(@NonNull PurchaseType purchaseType) {
        if (purchaseType == null) {
            return;
        }
        this.f36545j = purchaseType;
        this.f36540e = new pej0(this.f36541f.act(), dgc0.f88278c);
        View viewInflate = p9r.m171370a(this.f36541f.act()).inflate(rec0.f162530b3, (ViewGroup) null);
        this.f36548m = viewInflate;
        this.f36540e.setContentView(viewInflate);
        m56085l(this.f36548m);
        m56089p();
        m56088o();
        this.f36540e.show();
        m56086m();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productType", mib0.m158482k(purchaseType));
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
        } catch (JSONException e2) {
            CrashHelper.m82479c(e2);
        }
        this.f36544i.m152780o(jSONObject);
        w1e.m204402f(this.f36544i);
        gul0.m132343h(purchaseType);
    }

    /* JADX INFO: renamed from: z */
    public final void m56099z() {
        if (NullChecker.m82486a(this.f36546k)) {
            this.f36546k.unsubscribe();
            this.f36546k = null;
        }
        if (NullChecker.m82486a(this.f36547l)) {
            psd0.m173633z(this.f36547l);
            this.f36547l = null;
        }
    }
}
