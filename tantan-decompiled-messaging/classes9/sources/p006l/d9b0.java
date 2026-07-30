package p006l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.p004ui.result.CoinRecyclerView;
import com.p000p1.mobile.putong.core.p004ui.result.PurchaseReceivingAnimView;
import com.p000p1.mobile.putong.core.p004ui.result.VRectBottomArc;
import com.p000p1.mobile.putong.core.p004ui.result.VipContent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PrivilegeDetail;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import l.d30;
import l.d3c0;
import l.e9b0;
import l.j760;
import l.j850;
import l.m6c0;
import l.o7r;
import l.s7m;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class d9b0 implements s7m<w8b0> {

    /* JADX INFO: renamed from: A */
    public PrivilegeDetail f10073A;

    /* JADX INFO: renamed from: B */
    public PrivilegeDetail f10074B;

    /* JADX INFO: renamed from: C */
    public PurchaseReceivingAnimView f10075C;

    /* JADX INFO: renamed from: D */
    public AnimatorSet f10076D;

    /* JADX INFO: renamed from: E */
    public ObjectAnimator f10077E;

    /* JADX INFO: renamed from: a */
    public Space f10079a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f10080b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f10081c;

    /* JADX INFO: renamed from: d */
    public VRectBottomArc f10082d;

    /* JADX INFO: renamed from: e */
    public ImageView f10083e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f10084f;

    /* JADX INFO: renamed from: g */
    public TextView f10085g;

    /* JADX INFO: renamed from: h */
    public TextView f10086h;

    /* JADX INFO: renamed from: i */
    public TextView f10087i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f10088j;

    /* JADX INFO: renamed from: k */
    public ImageView f10089k;

    /* JADX INFO: renamed from: l */
    public TextView f10090l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f10091m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f10092n;

    /* JADX INFO: renamed from: o */
    public VText f10093o;

    /* JADX INFO: renamed from: p */
    public VImage f10094p;

    /* JADX INFO: renamed from: q */
    public VText f10095q;

    /* JADX INFO: renamed from: r */
    public View f10096r;

    /* JADX INFO: renamed from: s */
    public final Act f10097s;

    /* JADX INFO: renamed from: t */
    public final PutongFrag f10098t;

    /* JADX INFO: renamed from: u */
    public w8b0 f10099u;

    /* JADX INFO: renamed from: v */
    public ProductCategory f10100v;

    /* JADX INFO: renamed from: z */
    public List<PrivilegeDetail> f10104z;

    /* JADX INFO: renamed from: w */
    public String f10101w = "";

    /* JADX INFO: renamed from: x */
    public String f10102x = "";

    /* JADX INFO: renamed from: y */
    public String f10103y = "";

    /* JADX INFO: renamed from: F */
    public boolean f10078F = false;

    /* JADX INFO: renamed from: l.d9b0$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC0630a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0630a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            d9b0.this.m13825L();
            d9b0.this.f10093o.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public d9b0(Act act, PutongFrag putongFrag) {
        this.f10097s = act;
        this.f10098t = putongFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public void m13825L() {
        if (this.f10077E == null) {
            this.f10077E = ObjectAnimator.ofFloat(this.f10094p, "translationX", -t100.d(48.0f), this.f10093o.getWidth());
        }
        if (this.f10076D == null) {
            this.f10076D = new AnimatorSet();
        }
        this.f10076D.setDuration(800L);
        this.f10076D.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f10076D.addListener(new C0631b());
        this.f10076D.playTogether(this.f10077E);
        this.f10076D.start();
    }

    /* JADX INFO: renamed from: A */
    public void m13836A() {
        if (NullChecker.a(this.f10076D)) {
            m13852p();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m13837B() {
        final String str;
        if (TEnum.equals(this.f10100v, "tttVip")) {
            this.f10093o.setText(R.string.d0);
            this.f10093o.setBackgroundResource(d3c0.e);
            str = "vip";
        } else if (TEnum.equals(this.f10100v, "tttSeeWhoLikedMe")) {
            this.f10093o.setText(R.string.K);
            this.f10093o.setBackgroundResource(d3c0.d);
            str = "see";
        } else if (TEnum.equals(this.f10100v, "quickchatMembership")) {
            this.f10093o.setBackgroundResource(d3c0.c);
            this.f10093o.setText(R.string.c0);
            str = "quickchat";
        } else if (TEnum.equals(this.f10100v, "coin") || TEnum.equals(this.f10100v, "noneLiveCoin") || TEnum.equals(this.f10100v, "tttCoin") || TEnum.equals(this.f10100v, "tttLiveCoin")) {
            this.f10093o.setText(R.string.V);
            this.f10093o.setBackgroundResource(d3c0.e);
            str = "coin";
        } else {
            str = "";
        }
        xdl0.E0(this.f10093o, new View.OnClickListener() { // from class: l.z8b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28673a.m13858w(str, view);
            }
        });
        xdl0.E0(this.f10083e, new View.OnClickListener() { // from class: l.a9b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8166a.m13859x(view);
            }
        });
        zvf0.A("e_pay_result_button", "p_pay_result", new j760[]{vwb.Y("pageproducttype", str)});
        m13840E(str);
    }

    /* JADX INFO: renamed from: C */
    public final void m13838C() {
        if ("zh".equals(CoreModule.f1533b.getResources().getConfiguration().locale.getLanguage())) {
            String str = CoreModule.f1533b.getString(R.string.e0) + " " + CoreModule.f1533b.getString(R.string.Y);
            String strValueOf = String.valueOf(this.f10073A.count);
            String str2 = String.format(str, strValueOf);
            int color = Color.parseColor("#fff356");
            int iIndexOf = str2.indexOf(strValueOf);
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new ForegroundColorSpan(color), iIndexOf, strValueOf.length() + iIndexOf, 33);
            this.f10085g.setText(spannableString);
        } else {
            this.f10085g.setText(CoreModule.f1533b.getString(R.string.e0));
        }
        this.f10086h.setText(String.format(CoreModule.f1533b.getString(R.string.W), this.f10102x, this.f10103y) + "  |  " + String.format(CoreModule.f1533b.getString(R.string.P), Long.valueOf(this.f10073A.remaining)));
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m13839C0() {
        return this.f10097s;
    }

    /* JADX INFO: renamed from: E */
    public final void m13840E(final String str) {
        xdl0.M(this.f10087i, true);
        xdl0.M(this.f10095q, false);
        this.f10087i.setText(R.string.Z);
        xdl0.E0(this.f10087i, new View.OnClickListener() { // from class: l.c9b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9502a.m13860y(str, view);
            }
        });
        zvf0.A("e_pay_feedback", "p_pay_result", new j760[]{vwb.Y("pageproducttype", str)});
    }

    /* JADX INFO: renamed from: F */
    public final void m13841F(String str) {
        if ("zh".equals(CoreModule.f1533b.getResources().getConfiguration().locale.getLanguage())) {
            String str2 = this.f10073A.duration < 2592000 ? String.format(Locale.getDefault(), "%d天", Long.valueOf(this.f10073A.duration / 86400)) : String.format(CoreModule.f1533b.getString(R.string.X), String.valueOf(this.f10073A.duration / 2592000));
            String str3 = String.format(str, str2);
            int color = Color.parseColor("#fff356");
            int iIndexOf = str3.indexOf(str2);
            SpannableString spannableString = new SpannableString(str3);
            spannableString.setSpan(new ForegroundColorSpan(color), iIndexOf, str2.length() + iIndexOf, 33);
            this.f10085g.setText(spannableString);
        } else {
            this.f10085g.setText(String.format(str, ""));
        }
        this.f10086h.setText(String.format(CoreModule.f1533b.getString(R.string.W), this.f10102x, this.f10103y) + "  |  " + String.format(CoreModule.f1533b.getString(R.string.Q), m13856u(this.f10073A.expireAt * 1000)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX INFO: renamed from: G */
    public final void m13842G() {
        ?? coinRecyclerView;
        String string = this.f10100v.toString();
        string.getClass();
        switch (string) {
            case "noneLiveCoin":
            case "tttLiveCoin":
            case "tttCoin":
            case "coin":
                coinRecyclerView = new CoinRecyclerView(m13839C0());
                break;
            case "tttVip":
                VipContent vipContent = new VipContent(m13839C0());
                vipContent.m8154I();
                coinRecyclerView = vipContent;
                break;
            case "tttSeeWhoLikedMe":
                coinRecyclerView = o7r.a(m13839C0()).inflate(m6c0.Z2, (ViewGroup) null);
                break;
            case "quickchatMembership":
                coinRecyclerView = o7r.a(m13839C0()).inflate(m6c0.Y2, (ViewGroup) null);
                break;
            default:
                j850.a("Unexpected category: ", this.f10100v);
                return;
        }
        if (NullChecker.a((Object) coinRecyclerView)) {
            if (TEnum.equals(this.f10100v, "coin") || TEnum.equals(this.f10100v, "noneLiveCoin") || TEnum.equals(this.f10100v, "tttCoin") || TEnum.equals(this.f10100v, "tttLiveCoin")) {
                ConstraintLayout.a layoutParams = this.f10080b.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = t100.d(16.0f);
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = t100.d(16.0f);
                this.f10080b.setLayoutParams(layoutParams);
            }
            this.f10080b.addView(coinRecyclerView);
        }
        if (coinRecyclerView instanceof q8b0) {
            ((q8b0) coinRecyclerView).mo8070w(this.f10098t);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m13843H() {
        if (TEnum.equals(this.f10100v, "tttVip")) {
            this.f10088j.setBackgroundDrawable(act().drawable(d3c0.D7));
            this.f10089k.setImageDrawable(act().drawable(d3c0.H7));
            this.f10090l.setText(String.format("已享受以下 %s 大会员特权", "5"));
            return;
        }
        if (TEnum.equals(this.f10100v, "tttSeeWhoLikedMe")) {
            this.f10088j.setBackgroundDrawable(act().drawable(d3c0.C7));
            this.f10089k.setImageDrawable(act().drawable(d3c0.G7));
            this.f10090l.setText(R.string.b0);
        } else if (TEnum.equals(this.f10100v, "quickchatMembership")) {
            this.f10088j.setBackgroundDrawable(act().drawable(d3c0.B7));
            this.f10089k.setImageDrawable(act().drawable(d3c0.F7));
            this.f10090l.setText(R.string.R);
        } else if (TEnum.equals(this.f10100v, "coin") || TEnum.equals(this.f10100v, "noneLiveCoin") || TEnum.equals(this.f10100v, "tttCoin") || TEnum.equals(this.f10100v, "tttLiveCoin")) {
            this.f10088j.setBackgroundDrawable(act().drawable(d3c0.A7));
            this.f10089k.setImageDrawable(act().drawable(d3c0.E7));
            this.f10090l.setText(R.string.M);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m13844I() {
        if (this.f10078F) {
            m13846K();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m13845J(ProductCategory productCategory, PrivilegeDetail privilegeDetail) {
        PurchaseReceivingAnimView purchaseReceivingAnimView = (PurchaseReceivingAnimView) act().inflater().inflate(m6c0.G1, (ViewGroup) null);
        this.f10075C = purchaseReceivingAnimView;
        purchaseReceivingAnimView.setExitAction(new d30() { // from class: l.b9b0
            public final void call() {
                this.f8783a.m13861z();
            }
        });
        this.f10075C.m8086g(productCategory, privilegeDetail);
        ((FrameLayout) act().getWindow().getDecorView()).addView(this.f10075C);
        this.f10075C.m8087h();
    }

    /* JADX INFO: renamed from: K */
    public final void m13846K() {
        xdl0.M0(this.f10094p, true);
        m13852p();
        if (this.f10093o.getWidth() == 0) {
            this.f10093o.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0630a());
        } else {
            m13825L();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m13847M() {
        this.f10078F = false;
        m13852p();
    }

    @Nullable
    public Act act() {
        return this.f10097s;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m13849m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m13849m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e9b0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m13848i1(w8b0 w8b0Var) {
        this.f10099u = w8b0Var;
    }

    /* JADX INFO: renamed from: o */
    public boolean m13851o() {
        if (!NullChecker.a(this.f10075C) || !xdl0.O0(this.f10075C)) {
            return false;
        }
        xdl0.M(this.f10075C, false);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m13852p() {
        if (NullChecker.a(this.f10076D)) {
            this.f10076D.cancel();
            this.f10076D = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m13853q() {
        if (vwb.J(this.f10104z)) {
            return;
        }
        PrivilegeDetail privilegeDetail = (PrivilegeDetail) vwb.r(this.f10104z, new w9j() { // from class: l.x8b0
            public final Object call(Object obj) {
                return Boolean.valueOf("give".equals(((PrivilegeDetail) obj).channel));
            }
        });
        this.f10074B = privilegeDetail;
        if (!NullChecker.a(privilegeDetail)) {
            m13846K();
            return;
        }
        ProductCategory productCategory = ProductCategory.get(this.f10074B.privilegeType);
        if (this.f10101w.equals(s8b0.f21141b) || !(TEnum.equals(productCategory, "boost") || TEnum.equals(productCategory, "superLike") || TEnum.equals(productCategory, "quickchatNumber"))) {
            m13846K();
        } else {
            s8b0.f21141b = this.f10101w;
            m13845J(productCategory, this.f10074B);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m13854r() {
        if (m13855s()) {
            act().finish();
            return;
        }
        if (TEnum.equals(this.f10100v, "tttVip")) {
            m13841F(CoreModule.f1533b.getString(R.string.h0));
        } else if (TEnum.equals(this.f10100v, "tttSeeWhoLikedMe")) {
            m13841F(CoreModule.f1533b.getString(R.string.g0));
        } else if (TEnum.equals(this.f10100v, "quickchatMembership")) {
            m13841F(CoreModule.f1533b.getString(R.string.f0));
        } else if (TEnum.equals(this.f10100v, "coin") || TEnum.equals(this.f10100v, "noneLiveCoin") || TEnum.equals(this.f10100v, "tttCoin") || TEnum.equals(this.f10100v, "tttLiveCoin")) {
            m13838C();
        }
        m13843H();
        m13842G();
        m13837B();
        m13853q();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m13855s() {
        PrivilegeDetail privilegeDetail = (PrivilegeDetail) vwb.r(this.f10104z, new w9j() { // from class: l.y8b0
            public final Object call(Object obj) {
                return Boolean.valueOf("buy".equals(((PrivilegeDetail) obj).channel));
            }
        });
        this.f10073A = privilegeDetail;
        return privilegeDetail == null;
    }

    /* JADX INFO: renamed from: u */
    public final String m13856u(long j) {
        return new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()).format(new Date(j));
    }

    /* JADX INFO: renamed from: v */
    public void m13857v(Bundle bundle) {
        if (NullChecker.a(bundle)) {
            this.f10100v = ProductCategory.get(bundle.getString("params_category"));
            this.f10101w = bundle.getString("params_order_id", "");
            this.f10102x = bundle.getString("params_currency_symbol", "");
            this.f10103y = bundle.getString("params_price", "");
            String string = bundle.getString("params_privileges");
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.f10104z = (List) PrivilegeDetail.JSON_ADAPTER.ARRAY_ADAPTER().parse(string);
                } catch (IOException e) {
                    CrashHelper.c(e);
                }
            }
            this.f10099u.m26246k0(this.f10100v);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m13858w(String str, View view) {
        zvf0.u("e_pay_result_button", "p_pay_result", new j760[]{vwb.Y("pageproducttype", str)});
        if (!TEnum.equals(this.f10100v, "tttSeeWhoLikedMe")) {
            act().finish();
        } else {
            CoreModule.m1854P().m11709e().m6922li(act(), "purchase_result_see", NullChecker.a(this.f10074B));
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m13859x(View view) {
        act().finish();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m13860y(String str, View view) {
        zvf0.u("e_pay_feedback", "p_pay_result", new j760[]{vwb.Y("pageproducttype", str)});
        act().startActivity(AccessTokenWebViewAct.i2(act(), act().string(R.string.D7), C0154a.m3154M(act().string(R.string.E7)), false, true, false));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m13861z() {
        xdl0.p0(this.f10075C);
        m13846K();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.d9b0$b */
    public class C0631b implements Animator.AnimatorListener {
        public C0631b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            d9b0.this.f10076D = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.M0(d9b0.this.f10094p, false);
            if (NullChecker.a(d9b0.this.f10076D)) {
                d9b0.this.f10076D.setStartDelay(1200L);
                d9b0.this.f10076D.start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            xdl0.M0(d9b0.this.f10094p, true);
            d9b0.this.f10078F = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }
}
