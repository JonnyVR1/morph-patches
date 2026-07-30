package p002l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import l.b1f;
import l.c95;
import l.cwf0;
import l.d30;
import l.d3c0;
import l.e30;
import l.eqh0;
import l.i0e;
import l.i0g0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.px40;
import l.rf60;
import l.rxa0;
import l.sd60;
import l.szd;
import l.t100;
import l.vwb;
import l.w9j;
import l.we60;
import l.xdl0;
import l.y7c0;
import l.zvf0;
import rx.c;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ox40 extends szd {

    /* JADX INFO: renamed from: A */
    public VText f16821A;

    /* JADX INFO: renamed from: B */
    public VText f16822B;

    /* JADX INFO: renamed from: C */
    public RelativeLayout f16823C;

    /* JADX INFO: renamed from: D */
    public VText f16824D;

    /* JADX INFO: renamed from: E */
    public VText f16825E;

    /* JADX INFO: renamed from: F */
    public View f16826F;

    /* JADX INFO: renamed from: G */
    public Act f16827G;

    /* JADX INFO: renamed from: H */
    public PayMethod f16828H;

    /* JADX INFO: renamed from: I */
    @NonNull
    public d30 f16829I;

    /* JADX INFO: renamed from: J */
    public DecimalFormat f16830J;

    /* JADX INFO: renamed from: K */
    public Merchandise f16831K;

    /* JADX INFO: renamed from: L */
    public Coupon f16832L;

    /* JADX INFO: renamed from: M */
    public Merchandise f16833M;

    /* JADX INFO: renamed from: N */
    public Coupon f16834N;

    /* JADX INFO: renamed from: O */
    public Merchandise f16835O;

    /* JADX INFO: renamed from: P */
    public Coupon f16836P;

    /* JADX INFO: renamed from: Q */
    public Coupon f16837Q;

    /* JADX INFO: renamed from: R */
    public String f16838R;

    /* JADX INFO: renamed from: S */
    public cwf0 f16839S;

    /* JADX INFO: renamed from: T */
    public double f16840T;

    /* JADX INFO: renamed from: U */
    public rf60 f16841U;

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f16842j;

    /* JADX INFO: renamed from: k */
    public VImage f16843k;

    /* JADX INFO: renamed from: l */
    public VText f16844l;

    /* JADX INFO: renamed from: m */
    public VLinear f16845m;

    /* JADX INFO: renamed from: n */
    public VText f16846n;

    /* JADX INFO: renamed from: o */
    public VText f16847o;

    /* JADX INFO: renamed from: p */
    public VText f16848p;

    /* JADX INFO: renamed from: q */
    public VText f16849q;

    /* JADX INFO: renamed from: r */
    public VText f16850r;

    /* JADX INFO: renamed from: s */
    public VText f16851s;

    /* JADX INFO: renamed from: t */
    public VLinear f16852t;

    /* JADX INFO: renamed from: u */
    public VText f16853u;

    /* JADX INFO: renamed from: v */
    public VText f16854v;

    /* JADX INFO: renamed from: w */
    public VText f16855w;

    /* JADX INFO: renamed from: x */
    public VText f16856x;

    /* JADX INFO: renamed from: y */
    public VText f16857y;

    /* JADX INFO: renamed from: z */
    public VText f16858z;

    public ox40(Act act, Merchandise merchandise, Coupon coupon, Merchandise merchandise2, Coupon coupon2, String str) {
        super(act, false, y7c0.b);
        this.f16830J = new DecimalFormat("#.#");
        this.f16827G = act;
        this.f16829I = new d30() { // from class: l.nx40
            public final void call() {
                this.f16289a.dismiss();
            }
        };
        this.f16838R = str;
        this.f16831K = merchandise;
        this.f16837Q = coupon;
        this.f16832L = coupon;
        this.f16833M = merchandise2;
        this.f16834N = coupon2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    private void m19814S() {
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.bx40
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f8399a.m19824V(dialogInterface, i, keyEvent);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fx40
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f10676a.m19825W(dialogInterface);
            }
        });
        this.f16843k.setOnClickListener(new View.OnClickListener() { // from class: l.gx40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11670a.m19816X(view);
            }
        });
        this.f16845m.setOnClickListener(new View.OnClickListener() { // from class: l.hx40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12334a.m19817Y(view);
            }
        });
        this.f16852t.setOnClickListener(new View.OnClickListener() { // from class: l.ix40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13463a.m19826Z(view);
            }
        });
        this.f16821A.setOnClickListener(new View.OnClickListener() { // from class: l.jx40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14119a.m19827a0(view);
            }
        });
        this.f16823C.setOnClickListener(new View.OnClickListener() { // from class: l.kx40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14573a.m19828b0(view);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    private void m19815T() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f16843k.getLayoutParams();
        int iF0 = xdl0.F0();
        int i = t100.g;
        layoutParams.topMargin = iF0 + i;
        ((FrameLayout.LayoutParams) this.f16842j.getLayoutParams()).topMargin = xdl0.F0() + i;
        SVGALoader.with(this.f16827G).from("https://auto.tancdn.com/v1/raw/9a15b83d-2300-4a62-8059-bf2da05730b514.pdf").autoPlay(true).repeatCount(-1).into(this.f16842j);
        m19814S();
        SpannableString spannableString = new SpannableString("解锁后配对最高增加20倍");
        spannableString.setSpan(new StyleSpan(1), 9, 11, 33);
        this.f16844l.setText(spannableString);
        m19822R(this.f16831K, this.f16832L);
        m19835k0();
        m19834j0();
        m19833i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m19816X(View view) {
        this.f16829I.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m19817Y(View view) {
        if (m19823U(this.f16835O)) {
            return;
        }
        m19822R(this.f16831K, this.f16832L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public void m19818g0(PayMethod payMethod) {
        this.f16828H = payMethod;
        if (TEnum.equals(payMethod, "alipay")) {
            this.f16824D.setText("支付宝");
            this.f16824D.setCompoundDrawablesWithIntrinsicBounds(CoreModule.b.getResources().getDrawable(d3c0.C6), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (TEnum.equals(this.f16828H, "wechat")) {
            this.f16824D.setText("微信");
            this.f16824D.setCompoundDrawablesWithIntrinsicBounds(CoreModule.b.getResources().getDrawable(d3c0.E6), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (TEnum.equals(this.f16828H, "jingdong")) {
            this.f16824D.setText("京东支付");
            this.f16824D.setCompoundDrawablesWithIntrinsicBounds(CoreModule.b.getResources().getDrawable(d3c0.D6), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        this.f16821A.setText(String.format("¥%s立即购买", this.f16830J.format(this.f16840T)));
    }

    /* JADX INFO: renamed from: h0 */
    private void m19819h0() {
        boolean zK;
        if (TEnum.equals(this.f16828H, "wechat")) {
            zK = sd60.p();
        } else if (TEnum.equals(this.f16828H, "jingdong")) {
            zK = sd60.m();
        } else {
            zK = !CoreModule.P().a().j3() ? sd60.k() : true;
        }
        if (zK) {
            this.f16841U = new rf60(PurchaseType.TYPE_O_DIAMOND, this.f16827G, this.f16838R, "").r(this.f16836P.couponID);
            boolean zEquals = TEnum.equals(this.f16828H, "jingdong");
            rf60 rf60Var = this.f16841U;
            if (zEquals) {
                rf60Var.i(new e30() { // from class: l.dx40
                    public final void call(Object obj) {
                        this.f9470a.m19831e0((Integer) obj);
                    }
                }, this.f16835O);
            } else {
                rf60Var.o(this.f16835O.defaultStockKeepUnit.id, TEnum.equals(this.f16828H, "wechat"), new e30() { // from class: l.ex40
                    public final void call(Object obj) {
                        this.f10038a.m19832f0((Integer) obj);
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    private void m19820m0() {
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
    }

    /* JADX INFO: renamed from: Q */
    public View m19821Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return px40.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R */
    public final void m19822R(Merchandise merchandise, Coupon coupon) {
        if (NullChecker.a(this.f16835O) && this.f16835O.quantity == merchandise.quantity) {
            return;
        }
        this.f16835O = merchandise;
        this.f16836P = coupon;
        this.f16840T = ((double) coupon.benefit.localBenefit.discountBenefit.value) / 100.0d;
        boolean zM19823U = m19823U(merchandise);
        this.f16845m.setBackgroundResource(zM19823U ? d3c0.a5 : d3c0.b5);
        this.f16846n.setTextColor(Color.parseColor(zM19823U ? "#4B1A0A" : "#66FFDEA2"));
        this.f16847o.setTextColor(Color.parseColor(zM19823U ? "#4B1A0A" : "#66FFDEA2"));
        this.f16848p.setTextColor(Color.parseColor(zM19823U ? "#4B1A0A" : "#66FFDEA2"));
        this.f16849q.setTextColor(Color.parseColor(zM19823U ? "#4B1A0A" : "#66FFDEA2"));
        this.f16850r.setTextColor(Color.parseColor(zM19823U ? "#4B1A0A" : "#66FFDEA2"));
        this.f16851s.setTextColor(Color.parseColor(zM19823U ? "#334B1A0A" : "#66FFDEA2"));
        this.f16852t.setBackgroundResource(zM19823U ? d3c0.b5 : d3c0.a5);
        this.f16853u.setTextColor(Color.parseColor(zM19823U ? "#66FFDEA2" : "#4B1A0A"));
        this.f16854v.setTextColor(Color.parseColor(zM19823U ? "#66FFDEA2" : "#4B1A0A"));
        this.f16855w.setTextColor(Color.parseColor(zM19823U ? "#66FFDEA2" : "#4B1A0A"));
        this.f16856x.setTextColor(Color.parseColor(zM19823U ? "#66FFDEA2" : "#4B1A0A"));
        this.f16857y.setTextColor(Color.parseColor(zM19823U ? "#66FFDEA2" : "#4B1A0A"));
        this.f16858z.setTextColor(Color.parseColor(zM19823U ? "#66FFDEA2" : "#334B1A0A"));
        this.f16821A.setText(String.format("¥%s立即购买", this.f16830J.format(this.f16840T)));
    }

    /* JADX INFO: renamed from: U */
    public final boolean m19823U(Merchandise merchandise) {
        return merchandise.quantity == 12;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ boolean m19824V(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return true;
        }
        this.f16829I.call();
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m19825W(DialogInterface dialogInterface) {
        i0e.e(this.f16839S);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m19826Z(View view) {
        if (m19823U(this.f16835O)) {
            m19822R(this.f16833M, this.f16834N);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m19827a0(View view) {
        zvf0.u("e_purchase_button", "p_purchase_page", new j760[]{vwb.Y("purchaseShowFrom", this.f16838R), vwb.Y("productType", this.f16835O.category.toString()), vwb.Y("default_duration", this.f16835O.quantity + "m"), vwb.Y("promotion_type", b1f.d(this.f16836P)), vwb.Y("page_style", "promotion")});
        if (this.f16837Q.endTime - mqi0.o() <= 0.0d) {
            lsi0.y("优惠已失效");
        } else {
            m19819h0();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m19828b0(View view) {
        new wf60(this.f16827G, PurchaseType.TYPE_O_DIAMOND).m24556r(this.f16828H).m24550l(true).m24555q(new e30() { // from class: l.cx40
            public final void call(Object obj) {
                this.f8970a.m19818g0((PayMethod) obj);
            }
        }).m24557s();
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m19829c0(Long l2) {
        m19834j0();
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ Boolean m19830d0(Long l2) {
        return Boolean.valueOf(this.f16837Q.endTime - ((double) mqi0.o()) <= 0.0d);
    }

    public void dismiss() {
        super.dismiss();
        this.f16842j.stopAnimation(true);
        rxa0.z(false);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m19831e0(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m19832f0(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m19833i0() {
        StringBuilder sb = new StringBuilder("开通前请阅读");
        sb.append("《会员服务协议》");
        SpannableStringBuilder spannableStringBuilderB0 = i0g0.b0(sb.toString(), vwb.f0(new String[]{"会员服务协议"}), Color.parseColor("#CCFFDEA2"), eqh0.c(3));
        int iIndexOf = sb.indexOf("会员服务协议");
        spannableStringBuilderB0.setSpan(new c95(we60.c).b(Color.parseColor("#CCFFDEA2")).c(CoreModule.b.getString(R.string.D6)).d(true), iIndexOf, iIndexOf + 6, 18);
        this.f16825E.setText(spannableStringBuilderB0);
        this.f16825E.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: j0 */
    public final void m19834j0() {
        long jO = (long) (this.f16837Q.endTime - mqi0.o());
        if (jO <= 0) {
            this.f16822B.setText("优惠已结束");
            return;
        }
        VText vText = this.f16822B;
        if (jO > 86400000) {
            vText.setText(String.format("优惠倒计时： %d天后失效", Integer.valueOf((int) (jO / 86400000))));
            return;
        }
        vText.setText(String.format("优惠倒计时： %02d:%02d:%02d后失效", Integer.valueOf((int) (jO / 3600000)), Integer.valueOf((int) ((jO % 3600000) / 60000)), Integer.valueOf(((int) (jO % 60000)) / 1000)));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m19835k0() {
        this.f16847o.setTypeface(eqh0.c(3), 1);
        this.f16849q.setText("12个月");
        SpannableString spannableString = new SpannableString(String.format("¥%s", this.f16830J.format(((double) this.f16832L.benefit.localBenefit.discountBenefit.value) / 100.0d)));
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(0.5625f);
        spannableString.setSpan(relativeSizeSpan, 0, 1, 33);
        this.f16850r.setText(spannableString);
        this.f16850r.setTypeface(eqh0.c(3), 1);
        VText vText = this.f16851s;
        DecimalFormat decimalFormat = this.f16830J;
        Merchandise merchandise = this.f16831K;
        vText.setText(String.format("原价¥%s", decimalFormat.format(merchandise.defaultStockKeepUnit.prices.originalUnitPrice * ((double) merchandise.quantity))));
        this.f16851s.getPaint().setFlags(17);
        this.f16854v.setTypeface(eqh0.c(3), 1);
        this.f16856x.setText("3个月");
        this.f16857y.setTypeface(eqh0.c(3), 1);
        SpannableString spannableString2 = new SpannableString(String.format("¥%s", this.f16830J.format(((double) this.f16834N.benefit.localBenefit.discountBenefit.value) / 100.0d)));
        spannableString2.setSpan(relativeSizeSpan, 0, 1, 33);
        this.f16857y.setText(spannableString2);
        VText vText2 = this.f16858z;
        DecimalFormat decimalFormat2 = this.f16830J;
        Merchandise merchandise2 = this.f16833M;
        vText2.setText(String.format("原价¥%s", decimalFormat2.format(merchandise2.defaultStockKeepUnit.prices.originalUnitPrice * ((double) merchandise2.quantity))));
        this.f16858z.getPaint().setFlags(17);
        this.f16821A.setTypeface(eqh0.c(3), 1);
    }

    /* JADX INFO: renamed from: l0 */
    public void m19836l0(PayMethod payMethod) {
        this.f16828H = payMethod;
        if (payMethod == null) {
            this.f16828H = PayMethod.get("alipay");
        }
        m19818g0(this.f16828H);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (NullChecker.a(this.f16837Q)) {
            duringCreated(c.interval(1L, TimeUnit.SECONDS).onBackpressureDrop().compose(mkd0.y())).takeUntil(new w9j() { // from class: l.lx40
                public final Object call(Object obj) {
                    return this.f15108a.m19830d0((Long) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.mx40
                public final void call(Object obj) {
                    this.f15733a.m19829c0((Long) obj);
                }
            }));
        }
    }

    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        View viewM19821Q = m19821Q(this.f16827G.getLayoutInflater(), null);
        this.f16826F = viewM19821Q;
        setContentView(viewM19821Q);
        m19820m0();
        m19815T();
        m19836l0(PayMethod.get("alipay"));
    }

    public void show() {
        super.show();
        cwf0 cwf0VarC = i0e.c("p_purchase_page", getClass().getName());
        this.f16839S = cwf0VarC;
        cwf0VarC.p(new j760[]{vwb.Y("purchaseShowFrom", this.f16838R), vwb.Y("productType", this.f16835O.category.toString()), vwb.Y("default_duration", this.f16835O.quantity + "m"), vwb.Y("promotion_type", b1f.d(this.f16836P)), vwb.Y("page_style", "promotion")});
        i0e.f(this.f16839S);
        rxa0.z(true);
    }
}
