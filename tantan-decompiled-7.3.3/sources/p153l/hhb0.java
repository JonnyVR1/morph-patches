package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.PrivilegeDetail;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.result.CoinRecyclerView;
import com.p051p1.mobile.putong.core.p058ui.result.PurchaseReceivingAnimView;
import com.p051p1.mobile.putong.core.p058ui.result.VRectBottomArc;
import com.p051p1.mobile.putong.core.p058ui.result.VipContent;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class hhb0 implements iam<ahb0> {

    /* JADX INFO: renamed from: A */
    public PrivilegeDetail f109494A;

    /* JADX INFO: renamed from: B */
    public PrivilegeDetail f109495B;

    /* JADX INFO: renamed from: C */
    public PurchaseReceivingAnimView f109496C;

    /* JADX INFO: renamed from: D */
    public AnimatorSet f109497D;

    /* JADX INFO: renamed from: E */
    public ObjectAnimator f109498E;

    /* JADX INFO: renamed from: a */
    public Space f109500a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f109501b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f109502c;

    /* JADX INFO: renamed from: d */
    public VRectBottomArc f109503d;

    /* JADX INFO: renamed from: e */
    public ImageView f109504e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f109505f;

    /* JADX INFO: renamed from: g */
    public TextView f109506g;

    /* JADX INFO: renamed from: h */
    public TextView f109507h;

    /* JADX INFO: renamed from: i */
    public TextView f109508i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f109509j;

    /* JADX INFO: renamed from: k */
    public ImageView f109510k;

    /* JADX INFO: renamed from: l */
    public TextView f109511l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f109512m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f109513n;

    /* JADX INFO: renamed from: o */
    public VText f109514o;

    /* JADX INFO: renamed from: p */
    public VImage f109515p;

    /* JADX INFO: renamed from: q */
    public VText f109516q;

    /* JADX INFO: renamed from: r */
    public View f109517r;

    /* JADX INFO: renamed from: s */
    public final Act f109518s;

    /* JADX INFO: renamed from: t */
    public final PutongFrag f109519t;

    /* JADX INFO: renamed from: u */
    public ahb0 f109520u;

    /* JADX INFO: renamed from: v */
    public ProductCategory f109521v;

    /* JADX INFO: renamed from: z */
    public List<PrivilegeDetail> f109525z;

    /* JADX INFO: renamed from: w */
    public String f109522w = "";

    /* JADX INFO: renamed from: x */
    public String f109523x = "";

    /* JADX INFO: renamed from: y */
    public String f109524y = "";

    /* JADX INFO: renamed from: F */
    public boolean f109499F = false;

    /* JADX INFO: renamed from: l.hhb0$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC17460a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC17460a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            hhb0.this.m135030L();
            hhb0.this.f109514o.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public hhb0(Act act, PutongFrag putongFrag) {
        this.f109518s = act;
        this.f109519t = putongFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public void m135030L() {
        if (this.f109498E == null) {
            this.f109498E = ObjectAnimator.ofFloat(this.f109515p, "translationX", -qa00.m175859d(48.0f), this.f109514o.getWidth());
        }
        if (this.f109497D == null) {
            this.f109497D = new AnimatorSet();
        }
        this.f109497D.setDuration(800L);
        this.f109497D.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f109497D.addListener(new C17461b());
        this.f109497D.playTogether(this.f109498E);
        this.f109497D.start();
    }

    /* JADX INFO: renamed from: A */
    public void m135041A() {
        if (NullChecker.m82486a(this.f109497D)) {
            m135055p();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m135042B() {
        final String str;
        if (TEnum.equals(this.f109521v, ProductCategory.tttVip)) {
            this.f109514o.setText(R$string.f28261d0);
            this.f109514o.setBackgroundResource(jbc0.f119552e);
            str = "vip";
        } else if (TEnum.equals(this.f109521v, ProductCategory.tttSeeWhoLikedMe)) {
            this.f109514o.setText(R$string.f28048K);
            this.f109514o.setBackgroundResource(jbc0.f119538d);
            str = "see";
        } else if (TEnum.equals(this.f109521v, "quickchatMembership")) {
            this.f109514o.setBackgroundResource(jbc0.f119524c);
            this.f109514o.setText(R$string.f28249c0);
            str = "quickchat";
        } else if (TEnum.equals(this.f109521v, "coin") || TEnum.equals(this.f109521v, ProductCategory.noneLiveCoin) || TEnum.equals(this.f109521v, ProductCategory.tttCoin) || TEnum.equals(this.f109521v, ProductCategory.tttLiveCoin)) {
            this.f109514o.setText(R$string.f28169V);
            this.f109514o.setBackgroundResource(jbc0.f119552e);
            str = "coin";
        } else {
            str = "";
        }
        bnl0.m105509E0(this.f109514o, new View.OnClickListener() { // from class: l.dhb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88431a.m135061w(str, view);
            }
        });
        bnl0.m105509E0(this.f109504e, new View.OnClickListener() { // from class: l.ehb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94016a.m135062x(view);
            }
        });
        i4g0.m138492A("e_pay_result_button", "p_pay_result", jyb.m147494Y("pageproducttype", str));
        m135044E(str);
    }

    /* JADX INFO: renamed from: C */
    public final void m135043C() {
        if ("zh".equals(CoreModule.f18263b.getResources().getConfiguration().locale.getLanguage())) {
            String str = CoreModule.f18263b.getString(R$string.f28273e0) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f18263b.getString(R$string.f28202Y);
            String strValueOf = String.valueOf(this.f109494A.count);
            String str2 = String.format(str, strValueOf);
            int color = Color.parseColor("#fff356");
            int iIndexOf = str2.indexOf(strValueOf);
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new ForegroundColorSpan(color), iIndexOf, strValueOf.length() + iIndexOf, 33);
            this.f109506g.setText(spannableString);
        } else {
            this.f109506g.setText(CoreModule.f18263b.getString(R$string.f28273e0));
        }
        this.f109507h.setText(String.format(CoreModule.f18263b.getString(R$string.f28180W), this.f109523x, this.f109524y) + "  |  " + String.format(CoreModule.f18263b.getString(R$string.f28103P), Long.valueOf(this.f109494A.remaining)));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f109518s;
    }

    /* JADX INFO: renamed from: E */
    public final void m135044E(final String str) {
        bnl0.m105524M(this.f109508i, true);
        bnl0.m105524M(this.f109516q, false);
        this.f109508i.setText(R$string.f28213Z);
        bnl0.m105509E0(this.f109508i, new View.OnClickListener() { // from class: l.ghb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104090a.m135063y(str, view);
            }
        });
        i4g0.m138492A("e_pay_feedback", "p_pay_result", jyb.m147494Y("pageproducttype", str));
    }

    /* JADX INFO: renamed from: F */
    public final void m135045F(String str) {
        if ("zh".equals(CoreModule.f18263b.getResources().getConfiguration().locale.getLanguage())) {
            String str2 = this.f109494A.duration < 2592000 ? String.format(Locale.getDefault(), "%d天", Long.valueOf(this.f109494A.duration / 86400)) : String.format(CoreModule.f18263b.getString(R$string.f28191X), String.valueOf(this.f109494A.duration / 2592000));
            String str3 = String.format(str, str2);
            int color = Color.parseColor("#fff356");
            int iIndexOf = str3.indexOf(str2);
            SpannableString spannableString = new SpannableString(str3);
            spannableString.setSpan(new ForegroundColorSpan(color), iIndexOf, str2.length() + iIndexOf, 33);
            this.f109506g.setText(spannableString);
        } else {
            this.f109506g.setText(String.format(str, ""));
        }
        this.f109507h.setText(String.format(CoreModule.f18263b.getString(R$string.f28180W), this.f109523x, this.f109524y) + "  |  " + String.format(CoreModule.f18263b.getString(R$string.f28114Q), m135059u(this.f109494A.expireAt * 1000)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public final void m135046G() {
        View coinRecyclerView;
        String string = this.f109521v.toString();
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
                vipContent.m55979I();
                coinRecyclerView = vipContent;
                break;
            case "tttSeeWhoLikedMe":
                coinRecyclerView = p9r.m171370a(getContext()).inflate(rec0.f162520Z2, (ViewGroup) null);
                break;
            case "quickchatMembership":
                coinRecyclerView = p9r.m171370a(getContext()).inflate(rec0.f162516Y2, (ViewGroup) null);
                break;
            default:
                qg50.m176437a("Unexpected category: ", this.f109521v);
                return;
        }
        if (NullChecker.m82486a(coinRecyclerView)) {
            if (TEnum.equals(this.f109521v, "coin") || TEnum.equals(this.f109521v, ProductCategory.noneLiveCoin) || TEnum.equals(this.f109521v, ProductCategory.tttCoin) || TEnum.equals(this.f109521v, ProductCategory.tttLiveCoin)) {
                ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) this.f109501b.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) c0221a).leftMargin = qa00.m175859d(16.0f);
                ((ViewGroup.MarginLayoutParams) c0221a).rightMargin = qa00.m175859d(16.0f);
                this.f109501b.setLayoutParams(c0221a);
            }
            this.f109501b.addView(coinRecyclerView);
        }
        if (coinRecyclerView instanceof ugb0) {
            ((ugb0) coinRecyclerView).mo55896w(this.f109519t);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m135047H() {
        if (TEnum.equals(this.f109521v, ProductCategory.tttVip)) {
            this.f109509j.setBackgroundDrawable(act().drawable(jbc0.f119192D7));
            this.f109510k.setImageDrawable(act().drawable(jbc0.f119248H7));
            this.f109511l.setText(String.format("已享受以下 %s 大会员特权", "5"));
            return;
        }
        if (TEnum.equals(this.f109521v, ProductCategory.tttSeeWhoLikedMe)) {
            this.f109509j.setBackgroundDrawable(act().drawable(jbc0.f119178C7));
            this.f109510k.setImageDrawable(act().drawable(jbc0.f119234G7));
            this.f109511l.setText(R$string.f28237b0);
        } else if (TEnum.equals(this.f109521v, "quickchatMembership")) {
            this.f109509j.setBackgroundDrawable(act().drawable(jbc0.f119164B7));
            this.f109510k.setImageDrawable(act().drawable(jbc0.f119220F7));
            this.f109511l.setText(R$string.f28125R);
        } else if (TEnum.equals(this.f109521v, "coin") || TEnum.equals(this.f109521v, ProductCategory.noneLiveCoin) || TEnum.equals(this.f109521v, ProductCategory.tttCoin) || TEnum.equals(this.f109521v, ProductCategory.tttLiveCoin)) {
            this.f109509j.setBackgroundDrawable(act().drawable(jbc0.f119150A7));
            this.f109510k.setImageDrawable(act().drawable(jbc0.f119206E7));
            this.f109511l.setText(R$string.f28070M);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m135048I() {
        if (this.f109499F) {
            m135050K();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m135049J(ProductCategory productCategory, PrivilegeDetail privilegeDetail) {
        PurchaseReceivingAnimView purchaseReceivingAnimView = (PurchaseReceivingAnimView) act().inflater().inflate(rec0.f162443G1, (ViewGroup) null);
        this.f109496C = purchaseReceivingAnimView;
        purchaseReceivingAnimView.setExitAction(new x20() { // from class: l.fhb0
            @Override // p153l.x20
            public final void call() {
                this.f99026a.m135064z();
            }
        });
        this.f109496C.m55912g(productCategory, privilegeDetail);
        ((FrameLayout) act().getWindow().getDecorView()).addView(this.f109496C);
        this.f109496C.m55913h();
    }

    /* JADX INFO: renamed from: K */
    public final void m135050K() {
        bnl0.m105525M0(this.f109515p, true);
        m135055p();
        if (this.f109514o.getWidth() == 0) {
            this.f109514o.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC17460a());
        } else {
            m135030L();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m135051M() {
        this.f109499F = false;
        m135055p();
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f109518s;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m135052m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m135052m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ihb0.m139969b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ahb0 ahb0Var) {
        this.f109520u = ahb0Var;
    }

    /* JADX INFO: renamed from: o */
    public boolean m135054o() {
        if (!NullChecker.m82486a(this.f109496C) || !bnl0.m105529O0(this.f109496C)) {
            return false;
        }
        bnl0.m105524M(this.f109496C, false);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m135055p() {
        if (NullChecker.m82486a(this.f109497D)) {
            this.f109497D.cancel();
            this.f109497D = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m135056q() {
        if (jyb.m147479J(this.f109525z)) {
            return;
        }
        PrivilegeDetail privilegeDetail = (PrivilegeDetail) jyb.m147529r(this.f109525z, new qcj() { // from class: l.bhb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("give".equals(((PrivilegeDetail) obj).channel));
            }
        });
        this.f109495B = privilegeDetail;
        if (!NullChecker.m82486a(privilegeDetail)) {
            m135050K();
            return;
        }
        ProductCategory productCategory = ProductCategory.get(this.f109495B.privilegeType);
        if (this.f109522w.equals(wgb0.f188930b) || !(TEnum.equals(productCategory, "boost") || TEnum.equals(productCategory, "superLike") || TEnum.equals(productCategory, "quickchatNumber"))) {
            m135050K();
        } else {
            wgb0.f188930b = this.f109522w;
            m135049J(productCategory, this.f109495B);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m135057r() {
        if (m135058s()) {
            act().m45660g2();
            return;
        }
        if (TEnum.equals(this.f109521v, ProductCategory.tttVip)) {
            m135045F(CoreModule.f18263b.getString(R$string.f28309h0));
        } else if (TEnum.equals(this.f109521v, ProductCategory.tttSeeWhoLikedMe)) {
            m135045F(CoreModule.f18263b.getString(R$string.f28297g0));
        } else if (TEnum.equals(this.f109521v, "quickchatMembership")) {
            m135045F(CoreModule.f18263b.getString(R$string.f28285f0));
        } else if (TEnum.equals(this.f109521v, "coin") || TEnum.equals(this.f109521v, ProductCategory.noneLiveCoin) || TEnum.equals(this.f109521v, ProductCategory.tttCoin) || TEnum.equals(this.f109521v, ProductCategory.tttLiveCoin)) {
            m135043C();
        }
        m135047H();
        m135046G();
        m135042B();
        m135056q();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m135058s() {
        PrivilegeDetail privilegeDetail = (PrivilegeDetail) jyb.m147529r(this.f109525z, new qcj() { // from class: l.chb0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("buy".equals(((PrivilegeDetail) obj).channel));
            }
        });
        this.f109494A = privilegeDetail;
        return privilegeDetail == null;
    }

    /* JADX INFO: renamed from: u */
    public final String m135059u(long j) {
        return new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()).format(new Date(j));
    }

    /* JADX INFO: renamed from: v */
    public void m135060v(Bundle bundle) {
        if (NullChecker.m82486a(bundle)) {
            this.f109521v = ProductCategory.get(bundle.getString("params_category"));
            this.f109522w = bundle.getString("params_order_id", "");
            this.f109523x = bundle.getString("params_currency_symbol", "");
            this.f109524y = bundle.getString("params_price", "");
            String string = bundle.getString("params_privileges");
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.f109525z = PrivilegeDetail.JSON_ADAPTER.ARRAY_ADAPTER().parse(string);
                } catch (IOException e) {
                    CrashHelper.m82479c(e);
                }
            }
            this.f109520u.m97792k0(this.f109521v);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m135061w(String str, View view) {
        i4g0.m138523u("e_pay_result_button", "p_pay_result", jyb.m147494Y("pageproducttype", str));
        if (!TEnum.equals(this.f109521v, ProductCategory.tttSeeWhoLikedMe)) {
            act().m45660g2();
        } else {
            CoreModule.m30933P().m143408e().mo35988li(act(), "purchase_result_see", NullChecker.m82486a(this.f109495B));
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m135062x(View view) {
        act().m45660g2();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m135063y(String str, View view) {
        i4g0.m138523u("e_pay_feedback", "p_pay_result", jyb.m147494Y("pageproducttype", str));
        act().startActivity(AccessTokenWebViewAct.m81337k2(act(), act().string(R$string.f27979D7), C4879a.m32227M(act().string(R$string.f27990E7)), false, true, false));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m135064z() {
        bnl0.m105574p0(this.f109496C);
        m135050K();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.hhb0$b */
    public class C17461b implements Animator.AnimatorListener {
        public C17461b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            hhb0.this.f109497D = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            bnl0.m105525M0(hhb0.this.f109515p, false);
            if (NullChecker.m82486a(hhb0.this.f109497D)) {
                hhb0.this.f109497D.setStartDelay(1200L);
                hhb0.this.f109497D.start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            bnl0.m105525M0(hhb0.this.f109515p, true);
            hhb0.this.f109499F = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }
}
