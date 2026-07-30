package p149l;

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.PrivilegeDetail;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.p053ui.result.CoinRecyclerView;
import com.p046p1.mobile.putong.core.p053ui.result.PurchaseReceivingAnimView;
import com.p046p1.mobile.putong.core.p053ui.result.VRectBottomArc;
import com.p046p1.mobile.putong.core.p053ui.result.VipContent;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class d9b0 implements s7m<w8b0> {

    /* JADX INFO: renamed from: A */
    public PrivilegeDetail f84946A;

    /* JADX INFO: renamed from: B */
    public PrivilegeDetail f84947B;

    /* JADX INFO: renamed from: C */
    public PurchaseReceivingAnimView f84948C;

    /* JADX INFO: renamed from: D */
    public AnimatorSet f84949D;

    /* JADX INFO: renamed from: E */
    public ObjectAnimator f84950E;

    /* JADX INFO: renamed from: a */
    public Space f84952a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f84953b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f84954c;

    /* JADX INFO: renamed from: d */
    public VRectBottomArc f84955d;

    /* JADX INFO: renamed from: e */
    public ImageView f84956e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f84957f;

    /* JADX INFO: renamed from: g */
    public TextView f84958g;

    /* JADX INFO: renamed from: h */
    public TextView f84959h;

    /* JADX INFO: renamed from: i */
    public TextView f84960i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f84961j;

    /* JADX INFO: renamed from: k */
    public ImageView f84962k;

    /* JADX INFO: renamed from: l */
    public TextView f84963l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f84964m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f84965n;

    /* JADX INFO: renamed from: o */
    public VText f84966o;

    /* JADX INFO: renamed from: p */
    public VImage f84967p;

    /* JADX INFO: renamed from: q */
    public VText f84968q;

    /* JADX INFO: renamed from: r */
    public View f84969r;

    /* JADX INFO: renamed from: s */
    public final Act f84970s;

    /* JADX INFO: renamed from: t */
    public final PutongFrag f84971t;

    /* JADX INFO: renamed from: u */
    public w8b0 f84972u;

    /* JADX INFO: renamed from: v */
    public ProductCategory f84973v;

    /* JADX INFO: renamed from: z */
    public List<PrivilegeDetail> f84977z;

    /* JADX INFO: renamed from: w */
    public String f84974w = "";

    /* JADX INFO: renamed from: x */
    public String f84975x = "";

    /* JADX INFO: renamed from: y */
    public String f84976y = "";

    /* JADX INFO: renamed from: F */
    public boolean f84951F = false;

    /* JADX INFO: renamed from: l.d9b0$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC16315a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC16315a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            d9b0.this.m110414L();
            d9b0.this.f84966o.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public d9b0(Act act, PutongFrag putongFrag) {
        this.f84970s = act;
        this.f84971t = putongFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public void m110414L() {
        if (this.f84950E == null) {
            this.f84950E = ObjectAnimator.ofFloat(this.f84967p, "translationX", -t100.m186890d(48.0f), this.f84966o.getWidth());
        }
        if (this.f84949D == null) {
            this.f84949D = new AnimatorSet();
        }
        this.f84949D.setDuration(800L);
        this.f84949D.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f84949D.addListener(new C16316b());
        this.f84949D.playTogether(this.f84950E);
        this.f84949D.start();
    }

    /* JADX INFO: renamed from: A */
    public void m110425A() {
        if (NullChecker.m81303a(this.f84949D)) {
            m110439p();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m110426B() {
        final String str;
        if (TEnum.equals(this.f84973v, ProductCategory.tttVip)) {
            this.f84966o.setText(R$string.f27413d0);
            this.f84966o.setBackgroundResource(d3c0.f83897e);
            str = "vip";
        } else if (TEnum.equals(this.f84973v, ProductCategory.tttSeeWhoLikedMe)) {
            this.f84966o.setText(R$string.f27200K);
            this.f84966o.setBackgroundResource(d3c0.f83883d);
            str = "see";
        } else if (TEnum.equals(this.f84973v, "quickchatMembership")) {
            this.f84966o.setBackgroundResource(d3c0.f83869c);
            this.f84966o.setText(R$string.f27401c0);
            str = "quickchat";
        } else if (TEnum.equals(this.f84973v, "coin") || TEnum.equals(this.f84973v, ProductCategory.noneLiveCoin) || TEnum.equals(this.f84973v, ProductCategory.tttCoin) || TEnum.equals(this.f84973v, ProductCategory.tttLiveCoin)) {
            this.f84966o.setText(R$string.f27321V);
            this.f84966o.setBackgroundResource(d3c0.f83897e);
            str = "coin";
        } else {
            str = "";
        }
        xdl0.m208329E0(this.f84966o, new View.OnClickListener() { // from class: l.z8b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202121a.m110445w(str, view);
            }
        });
        xdl0.m208329E0(this.f84956e, new View.OnClickListener() { // from class: l.a9b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68127a.m110446x(view);
            }
        });
        zvf0.m220368A("e_pay_result_button", "p_pay_result", vwb.m200311Y("pageproducttype", str));
        m110428E(str);
    }

    /* JADX INFO: renamed from: C */
    public final void m110427C() {
        if ("zh".equals(CoreModule.f17544b.getResources().getConfiguration().locale.getLanguage())) {
            String str = CoreModule.f17544b.getString(R$string.f27425e0) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f17544b.getString(R$string.f27354Y);
            String strValueOf = String.valueOf(this.f84946A.count);
            String str2 = String.format(str, strValueOf);
            int color = Color.parseColor("#fff356");
            int iIndexOf = str2.indexOf(strValueOf);
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new ForegroundColorSpan(color), iIndexOf, strValueOf.length() + iIndexOf, 33);
            this.f84958g.setText(spannableString);
        } else {
            this.f84958g.setText(CoreModule.f17544b.getString(R$string.f27425e0));
        }
        this.f84959h.setText(String.format(CoreModule.f17544b.getString(R$string.f27332W), this.f84975x, this.f84976y) + "  |  " + String.format(CoreModule.f17544b.getString(R$string.f27255P), Long.valueOf(this.f84946A.remaining)));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f84970s;
    }

    /* JADX INFO: renamed from: E */
    public final void m110428E(final String str) {
        xdl0.m208344M(this.f84960i, true);
        xdl0.m208344M(this.f84968q, false);
        this.f84960i.setText(R$string.f27365Z);
        xdl0.m208329E0(this.f84960i, new View.OnClickListener() { // from class: l.c9b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79878a.m110447y(str, view);
            }
        });
        zvf0.m220368A("e_pay_feedback", "p_pay_result", vwb.m200311Y("pageproducttype", str));
    }

    /* JADX INFO: renamed from: F */
    public final void m110429F(String str) {
        if ("zh".equals(CoreModule.f17544b.getResources().getConfiguration().locale.getLanguage())) {
            String str2 = this.f84946A.duration < 2592000 ? String.format(Locale.getDefault(), "%d天", Long.valueOf(this.f84946A.duration / 86400)) : String.format(CoreModule.f17544b.getString(R$string.f27343X), String.valueOf(this.f84946A.duration / 2592000));
            String str3 = String.format(str, str2);
            int color = Color.parseColor("#fff356");
            int iIndexOf = str3.indexOf(str2);
            SpannableString spannableString = new SpannableString(str3);
            spannableString.setSpan(new ForegroundColorSpan(color), iIndexOf, str2.length() + iIndexOf, 33);
            this.f84958g.setText(spannableString);
        } else {
            this.f84958g.setText(String.format(str, ""));
        }
        this.f84959h.setText(String.format(CoreModule.f17544b.getString(R$string.f27332W), this.f84975x, this.f84976y) + "  |  " + String.format(CoreModule.f17544b.getString(R$string.f27266Q), m110443u(this.f84946A.expireAt * 1000)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public final void m110430G() {
        View coinRecyclerView;
        String string = this.f84973v.toString();
        string.getClass();
        switch (string) {
            case "noneLiveCoin":
            case "tttLiveCoin":
            case "tttCoin":
            case "coin":
                coinRecyclerView = new CoinRecyclerView(getContext());
                break;
            case "tttVip":
                VipContent vipContent = new VipContent(getContext());
                vipContent.m54796I();
                coinRecyclerView = vipContent;
                break;
            case "tttSeeWhoLikedMe":
                coinRecyclerView = o7r.m163037a(getContext()).inflate(m6c0.f131560Z2, (ViewGroup) null);
                break;
            case "quickchatMembership":
                coinRecyclerView = o7r.m163037a(getContext()).inflate(m6c0.f131556Y2, (ViewGroup) null);
                break;
            default:
                j850.m140190a("Unexpected category: ", this.f84973v);
                return;
        }
        if (NullChecker.m81303a(coinRecyclerView)) {
            if (TEnum.equals(this.f84973v, "coin") || TEnum.equals(this.f84973v, ProductCategory.noneLiveCoin) || TEnum.equals(this.f84973v, ProductCategory.tttCoin) || TEnum.equals(this.f84973v, ProductCategory.tttLiveCoin)) {
                ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) this.f84953b.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) c0220a).leftMargin = t100.m186890d(16.0f);
                ((ViewGroup.MarginLayoutParams) c0220a).rightMargin = t100.m186890d(16.0f);
                this.f84953b.setLayoutParams(c0220a);
            }
            this.f84953b.addView(coinRecyclerView);
        }
        if (coinRecyclerView instanceof q8b0) {
            ((q8b0) coinRecyclerView).mo54713w(this.f84971t);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m110431H() {
        if (TEnum.equals(this.f84973v, ProductCategory.tttVip)) {
            this.f84961j.setBackgroundDrawable(act().drawable(d3c0.f83537D7));
            this.f84962k.setImageDrawable(act().drawable(d3c0.f83593H7));
            this.f84963l.setText(String.format("已享受以下 %s 大会员特权", "5"));
            return;
        }
        if (TEnum.equals(this.f84973v, ProductCategory.tttSeeWhoLikedMe)) {
            this.f84961j.setBackgroundDrawable(act().drawable(d3c0.f83523C7));
            this.f84962k.setImageDrawable(act().drawable(d3c0.f83579G7));
            this.f84963l.setText(R$string.f27389b0);
        } else if (TEnum.equals(this.f84973v, "quickchatMembership")) {
            this.f84961j.setBackgroundDrawable(act().drawable(d3c0.f83509B7));
            this.f84962k.setImageDrawable(act().drawable(d3c0.f83565F7));
            this.f84963l.setText(R$string.f27277R);
        } else if (TEnum.equals(this.f84973v, "coin") || TEnum.equals(this.f84973v, ProductCategory.noneLiveCoin) || TEnum.equals(this.f84973v, ProductCategory.tttCoin) || TEnum.equals(this.f84973v, ProductCategory.tttLiveCoin)) {
            this.f84961j.setBackgroundDrawable(act().drawable(d3c0.f83495A7));
            this.f84962k.setImageDrawable(act().drawable(d3c0.f83551E7));
            this.f84963l.setText(R$string.f27222M);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m110432I() {
        if (this.f84951F) {
            m110434K();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m110433J(ProductCategory productCategory, PrivilegeDetail privilegeDetail) {
        PurchaseReceivingAnimView purchaseReceivingAnimView = (PurchaseReceivingAnimView) act().inflater().inflate(m6c0.f131483G1, (ViewGroup) null);
        this.f84948C = purchaseReceivingAnimView;
        purchaseReceivingAnimView.setExitAction(new d30() { // from class: l.b9b0
            @Override // p149l.d30
            public final void call() {
                this.f74216a.m110448z();
            }
        });
        this.f84948C.m54729g(productCategory, privilegeDetail);
        ((FrameLayout) act().getWindow().getDecorView()).addView(this.f84948C);
        this.f84948C.m54730h();
    }

    /* JADX INFO: renamed from: K */
    public final void m110434K() {
        xdl0.m208345M0(this.f84967p, true);
        m110439p();
        if (this.f84966o.getWidth() == 0) {
            this.f84966o.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC16315a());
        } else {
            m110414L();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m110435M() {
        this.f84951F = false;
        m110439p();
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f84970s;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m110436m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m110436m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e9b0.m115346b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(w8b0 w8b0Var) {
        this.f84972u = w8b0Var;
    }

    /* JADX INFO: renamed from: o */
    public boolean m110438o() {
        if (!NullChecker.m81303a(this.f84948C) || !xdl0.m208349O0(this.f84948C)) {
            return false;
        }
        xdl0.m208344M(this.f84948C, false);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m110439p() {
        if (NullChecker.m81303a(this.f84949D)) {
            this.f84949D.cancel();
            this.f84949D = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m110440q() {
        if (vwb.m200296J(this.f84977z)) {
            return;
        }
        PrivilegeDetail privilegeDetail = (PrivilegeDetail) vwb.m200346r(this.f84977z, new w9j() { // from class: l.x8b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("give".equals(((PrivilegeDetail) obj).channel));
            }
        });
        this.f84947B = privilegeDetail;
        if (!NullChecker.m81303a(privilegeDetail)) {
            m110434K();
            return;
        }
        ProductCategory productCategory = ProductCategory.get(this.f84947B.privilegeType);
        if (this.f84974w.equals(s8b0.f163025b) || !(TEnum.equals(productCategory, "boost") || TEnum.equals(productCategory, "superLike") || TEnum.equals(productCategory, "quickchatNumber"))) {
            m110434K();
        } else {
            s8b0.f163025b = this.f84974w;
            m110433J(productCategory, this.f84947B);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m110441r() {
        if (m110442s()) {
            act().m44477e2();
            return;
        }
        if (TEnum.equals(this.f84973v, ProductCategory.tttVip)) {
            m110429F(CoreModule.f17544b.getString(R$string.f27461h0));
        } else if (TEnum.equals(this.f84973v, ProductCategory.tttSeeWhoLikedMe)) {
            m110429F(CoreModule.f17544b.getString(R$string.f27449g0));
        } else if (TEnum.equals(this.f84973v, "quickchatMembership")) {
            m110429F(CoreModule.f17544b.getString(R$string.f27437f0));
        } else if (TEnum.equals(this.f84973v, "coin") || TEnum.equals(this.f84973v, ProductCategory.noneLiveCoin) || TEnum.equals(this.f84973v, ProductCategory.tttCoin) || TEnum.equals(this.f84973v, ProductCategory.tttLiveCoin)) {
            m110427C();
        }
        m110431H();
        m110430G();
        m110426B();
        m110440q();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m110442s() {
        PrivilegeDetail privilegeDetail = (PrivilegeDetail) vwb.m200346r(this.f84977z, new w9j() { // from class: l.y8b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("buy".equals(((PrivilegeDetail) obj).channel));
            }
        });
        this.f84946A = privilegeDetail;
        return privilegeDetail == null;
    }

    /* JADX INFO: renamed from: u */
    public final String m110443u(long j) {
        return new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()).format(new Date(j));
    }

    /* JADX INFO: renamed from: v */
    public void m110444v(Bundle bundle) {
        if (NullChecker.m81303a(bundle)) {
            this.f84973v = ProductCategory.get(bundle.getString("params_category"));
            this.f84974w = bundle.getString("params_order_id", "");
            this.f84975x = bundle.getString("params_currency_symbol", "");
            this.f84976y = bundle.getString("params_price", "");
            String string = bundle.getString("params_privileges");
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.f84977z = PrivilegeDetail.JSON_ADAPTER.ARRAY_ADAPTER().parse(string);
                } catch (IOException e) {
                    CrashHelper.m81296c(e);
                }
            }
            this.f84972u.m202155k0(this.f84973v);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m110445w(String str, View view) {
        zvf0.m220399u("e_pay_result_button", "p_pay_result", vwb.m200311Y("pageproducttype", str));
        if (!TEnum.equals(this.f84973v, ProductCategory.tttSeeWhoLikedMe)) {
            act().m44477e2();
        } else {
            CoreModule.m29935P().m94654e().mo34985li(act(), "purchase_result_see", NullChecker.m81303a(this.f84947B));
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m110446x(View view) {
        act().m44477e2();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m110447y(String str, View view) {
        zvf0.m220399u("e_pay_feedback", "p_pay_result", vwb.m200311Y("pageproducttype", str));
        act().startActivity(AccessTokenWebViewAct.m80154i2(act(), act().string(R$string.f27131D7), C4728a.m31224M(act().string(R$string.f27142E7)), false, true, false));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m110448z() {
        xdl0.m208394p0(this.f84948C);
        m110434K();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.d9b0$b */
    public class C16316b implements Animator.AnimatorListener {
        public C16316b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            d9b0.this.f84949D = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.m208345M0(d9b0.this.f84967p, false);
            if (NullChecker.m81303a(d9b0.this.f84949D)) {
                d9b0.this.f84949D.setStartDelay(1200L);
                d9b0.this.f84949D.start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            xdl0.m208345M0(d9b0.this.f84967p, true);
            d9b0.this.f84951F = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }
}
