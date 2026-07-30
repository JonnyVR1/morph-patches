package p002l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import l.b1f;
import l.c95;
import l.cwf0;
import l.d30;
import l.dsa;
import l.e30;
import l.hab0;
import l.i0e;
import l.i0g0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.pxa0;
import l.rf60;
import l.rxa0;
import l.sd60;
import l.szd;
import l.t100;
import l.vwb;
import l.w2b0;
import l.w9j;
import l.we60;
import l.x5b0;
import l.xdl0;
import l.y7c0;
import rx.c;
import v.VImage;
import v.VText;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class oxa0 extends szd {

    /* JADX INFO: renamed from: A */
    public LinearLayout f16859A;

    /* JADX INFO: renamed from: B */
    public VText f16860B;

    /* JADX INFO: renamed from: C */
    public VText f16861C;

    /* JADX INFO: renamed from: D */
    public Act f16862D;

    /* JADX INFO: renamed from: E */
    @NonNull
    public d30 f16863E;

    /* JADX INFO: renamed from: F */
    public String f16864F;

    /* JADX INFO: renamed from: G */
    public cwf0 f16865G;

    /* JADX INFO: renamed from: H */
    public Merchandise f16866H;

    /* JADX INFO: renamed from: I */
    public Coupon f16867I;

    /* JADX INFO: renamed from: J */
    public PayMethod f16868J;

    /* JADX INFO: renamed from: K */
    public DecimalFormat f16869K;

    /* JADX INFO: renamed from: L */
    public double f16870L;

    /* JADX INFO: renamed from: M */
    public double f16871M;

    /* JADX INFO: renamed from: N */
    public hab0 f16872N;

    /* JADX INFO: renamed from: j */
    public VImage f16873j;

    /* JADX INFO: renamed from: k */
    public Guideline f16874k;

    /* JADX INFO: renamed from: l */
    public VImage f16875l;

    /* JADX INFO: renamed from: m */
    public Guideline f16876m;

    /* JADX INFO: renamed from: n */
    public VImage f16877n;

    /* JADX INFO: renamed from: o */
    public VImage f16878o;

    /* JADX INFO: renamed from: p */
    public VText f16879p;

    /* JADX INFO: renamed from: q */
    public VText f16880q;

    /* JADX INFO: renamed from: r */
    public VText f16881r;

    /* JADX INFO: renamed from: s */
    public VText f16882s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f16883t;

    /* JADX INFO: renamed from: u */
    public VImage f16884u;

    /* JADX INFO: renamed from: v */
    public VText f16885v;

    /* JADX INFO: renamed from: w */
    public RelativeLayout f16886w;

    /* JADX INFO: renamed from: x */
    public TextView f16887x;

    /* JADX INFO: renamed from: y */
    public VText f16888y;

    /* JADX INFO: renamed from: z */
    public View f16889z;

    public oxa0(Act act, final e30<Boolean> e30Var, Merchandise merchandise, Coupon coupon, String str) {
        super(act, false, y7c0.b);
        this.f16869K = new DecimalFormat("#.#");
        this.f16862D = act;
        this.f16863E = new d30() { // from class: l.gxa0
            public final void call() {
                this.f11674a.m19852Z(e30Var);
            }
        };
        this.f16866H = merchandise;
        this.f16867I = coupon;
        this.f16871M = merchandise.defaultStockKeepUnit.prices.price;
        this.f16870L = ((double) coupon.benefit.localBenefit.giftBenefit.discount.value) / 100.0d;
        this.f16864F = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    private void m19847T() {
        this.f16884u.setSelected(false);
        xdl0.X(this.f16878o, xdl0.F0() + t100.g);
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.hxa0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f12336a.m19863U(dialogInterface, i, keyEvent);
            }
        });
        x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ixa0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f13465a.m19848V(dialogInterface);
            }
        });
        xdl0.E0(this.f16878o, new View.OnClickListener() { // from class: l.jxa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14123a.m19849W(view);
            }
        });
        xdl0.E0(this.f16859A, new View.OnClickListener() { // from class: l.kxa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14577a.m19850X(view);
            }
        });
        xdl0.E0(this.f16884u, new View.OnClickListener() { // from class: l.lxa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15112a.m19851Y(view);
            }
        });
        m19855f0();
        m19861R();
        m19862S();
        m19860Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m19848V(DialogInterface dialogInterface) {
        i0e.e(this.f16865G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m19849W(View view) {
        this.f16863E.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m19850X(View view) {
        this.f16872N.w(this.f16866H, this.f16868J, true, CoreModule.P().a().U() && CoreModule.c.O0.n3() && TEnum.equals(this.f16868J, "alipay"));
        if (this.f16867I.endTime - mqi0.o() > 0.0d) {
            m19854e0();
        } else {
            lsi0.y("优惠券已失效");
            hab0.Companion.a(this.f16872N.n(), this.f16866H.defaultStockKeepUnit.id, "coupon expired");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m19851Y(View view) {
        VImage vImage = this.f16884u;
        vImage.setSelected(!vImage.isSelected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m19852Z(e30 e30Var) {
        dismiss();
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m19853d0(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: e0 */
    private void m19854e0() {
        if (!CoreModule.P().a().j3() && !sd60.k()) {
            hab0.Companion.a(this.f16872N.n(), this.f16866H.defaultStockKeepUnit.id, "alipay not install");
            return;
        }
        if (!this.f16884u.isSelected()) {
            dsa.B(this.f16862D, this.f16872N.e(), new d30() { // from class: l.mxa0
                public final void call() {
                    this.f15734a.m19866c0();
                }
            });
            return;
        }
        rf60 rf60Var = new rf60(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, this.f16862D, "", "");
        if (NullChecker.a(this.f16872N)) {
            rf60Var.C(this.f16872N.n());
        }
        rf60Var.r(this.f16867I.couponID);
        if (this.f16866H.autoRenewable()) {
            rf60Var.I(false, this.f16866H.defaultStockKeepUnit.id, new e30() { // from class: l.nxa0
                public final void call(Object obj) {
                    this.f16293a.m19853d0((Integer) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f0 */
    private void m19855f0() {
        long jO = (long) (this.f16867I.endTime - mqi0.o());
        if (jO <= 0) {
            this.f16861C.setText(m19859P("优惠 %s 后到期", "00:00:00"));
        } else if (jO > 86400000) {
            this.f16861C.setText(m19859P("优惠 %s 后到期", String.format(Locale.ENGLISH, "%d天", Integer.valueOf((int) (jO / 86400000)))));
        } else {
            this.f16861C.setText(m19859P("优惠 %s 后到期", String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf((int) (jO / 3600000)), Integer.valueOf((int) ((jO % 3600000) / 60000)), Integer.valueOf(((int) (jO % 60000)) / 1000))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    private void m19856h0() {
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m19857i0(Act act, e30<Boolean> e30Var, Merchandise merchandise, String str) {
        if (NullChecker.a(merchandise)) {
            new oxa0(act, e30Var, merchandise, merchandise.getCouponForPromotion("giftDurationSVIP"), str).show();
        } else {
            lsi0.C(R.string.P1);
        }
    }

    /* JADX INFO: renamed from: O */
    public View m19858O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pxa0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: P */
    public final CharSequence m19859P(String str, String str2) {
        String str3 = String.format(str, str2);
        int iIndexOf = str3.indexOf(str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD, Color.parseColor("#FFFAE9"), t100.f(18)), iIndexOf, str2.length() + iIndexOf, 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: Q */
    public final void m19860Q() {
        this.f16868J = PayMethod.get("alipay");
        if (CoreModule.P().a().U() && CoreModule.c.O0.n3()) {
            this.f16860B.setText(String.format("确认协议免密付¥%s", this.f16869K.format(this.f16870L)));
        } else {
            this.f16860B.setText(String.format("确认协议并支付¥%s", this.f16869K.format(this.f16870L)));
        }
        m19867g0();
    }

    /* JADX INFO: renamed from: R */
    public final void m19861R() {
        String strConcat = String.format(CoreModule.b.getString(R.string.G0), "会员及自动续费协议", "", new DecimalFormat("#.##").format(this.f16871M), "半年").concat("；赠送的3个月会员立刻发放，当自动续费合约取消时，赠送的3个月将失效");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strConcat);
        int iIndexOf = strConcat.indexOf("会员及自动续费协议");
        int iIndexOf2 = strConcat.indexOf("赠送的3个月将失效");
        int i = iIndexOf + 9;
        spannableStringBuilder.setSpan(new c95(we60.b).b(Color.parseColor("#99FFECAF")).c(CoreModule.b.getString(R.string.D6)).d(true), iIndexOf, i, 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, i, 18);
        int i2 = iIndexOf2 + 9;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#99FFECAF")), iIndexOf2, i2, 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf2, i2, 18);
        this.f16885v.setOnTouchListener(new sd0(spannableStringBuilder));
        this.f16885v.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: S */
    public final void m19862S() {
        this.f16880q.setText("查看谁喜欢了我");
        this.f16881r.setText("每天3次闪聊机会");
        int size = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData((Gender) null).size();
        this.f16882s.setText(i0g0.f0(String.format("每月3次优先推荐等总计%s项特权", Integer.valueOf(size)), vwb.f0(new String[]{String.valueOf(size)}), Color.parseColor("#FFE350"), Typeface.DEFAULT));
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ boolean m19863U(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return true;
        }
        this.f16863E.call();
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ Boolean m19864a0(Long l2) {
        return Boolean.valueOf(this.f16867I.endTime - ((double) mqi0.o()) <= 0.0d);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m19865b0(Long l2) {
        m19855f0();
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m19866c0() {
        this.f16884u.setSelected(true);
        this.f16859A.callOnClick();
    }

    public void dismiss() {
        super.dismiss();
        rxa0.z(false);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m19867g0() {
        if (CoreModule.P().a().jh()) {
            if (!TEnum.equals(this.f16868J, "alipay")) {
                xdl0.M(this.f16888y, false);
                return;
            }
            this.f16888y.setText(CoreModule.P().a().D6());
            xdl0.M(this.f16888y, true);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        duringCreated(c.interval(1L, TimeUnit.SECONDS).onBackpressureDrop().compose(mkd0.y())).takeUntil(new w9j() { // from class: l.exa0
            public final Object call(Object obj) {
                return this.f10042a.m19864a0((Long) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.fxa0
            public final void call(Object obj) {
                this.f10680a.m19865b0((Long) obj);
            }
        }));
    }

    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        setContentView(m19858O(this.f16862D.getLayoutInflater(), null));
        m19856h0();
        x5b0 x5b0Var = new x5b0(this.f16866H.category, PurchaseTrackPageType.page_discount_6m, this.f16864F);
        this.f16872N = x5b0Var;
        x5b0Var.v(this.f16866H.category);
        m19847T();
        CoreModule.c.O0.C3();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    public void show() {
        super.show();
        cwf0 cwf0VarC = i0e.c("p_purchase_page", getClass().getName());
        this.f16865G = cwf0VarC;
        cwf0VarC.p(new j760[]{vwb.Y("purchaseShowFrom", w2b0.b(this.f16864F)), vwb.Y("productType", this.f16866H.category.toString()), vwb.Y("default_duration", this.f16866H.quantity + "m"), vwb.Y("promotion_type", b1f.d(this.f16867I)), vwb.Y("page_style", "promotion")});
        i0e.f(this.f16865G);
        rxa0.z(true);
    }
}
