package p002l;

import android.app.Application;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import com.p000p1.mobile.putong.core.p001ui.pricerecall.PriceRecall2Dialog;
import com.p000p1.mobile.putong.core.p001ui.pricerecall.PriceRecallTellPriceSelectItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import l.cwf0;
import l.d30;
import l.d3c0;
import l.dsa;
import l.e30;
import l.eqh0;
import l.g6a;
import l.hab0;
import l.i0e;
import l.i0g0;
import l.ic50;
import l.j760;
import l.lm80;
import l.lsi0;
import l.m6c0;
import l.n6a;
import l.qib0;
import l.rf60;
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
import l.zvf0;
import v.VImage;
import v.VText;
import v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class km80 extends szd {

    /* JADX INFO: renamed from: A */
    public ConstraintLayout f14381A;

    /* JADX INFO: renamed from: B */
    public View f14382B;

    /* JADX INFO: renamed from: C */
    public VText f14383C;

    /* JADX INFO: renamed from: D */
    public VText f14384D;

    /* JADX INFO: renamed from: E */
    public VText f14385E;

    /* JADX INFO: renamed from: F */
    public VText f14386F;

    /* JADX INFO: renamed from: G */
    public RelativeLayout f14387G;

    /* JADX INFO: renamed from: H */
    public TextView f14388H;

    /* JADX INFO: renamed from: I */
    public VText f14389I;

    /* JADX INFO: renamed from: J */
    public VText f14390J;

    /* JADX INFO: renamed from: K */
    public VText f14391K;

    /* JADX INFO: renamed from: L */
    public final Act f14392L;

    /* JADX INFO: renamed from: M */
    @NonNull
    public final d30 f14393M;

    /* JADX INFO: renamed from: N */
    public final String f14394N;

    /* JADX INFO: renamed from: O */
    public final Object f14395O;

    /* JADX INFO: renamed from: P */
    public List<Merchandise> f14396P;

    /* JADX INFO: renamed from: Q */
    public cwf0 f14397Q;

    /* JADX INFO: renamed from: R */
    public Merchandise f14398R;

    /* JADX INFO: renamed from: S */
    public DecimalFormat f14399S;

    /* JADX INFO: renamed from: T */
    public String f14400T;

    /* JADX INFO: renamed from: U */
    public String f14401U;

    /* JADX INFO: renamed from: V */
    public hab0 f14402V;

    /* JADX INFO: renamed from: W */
    public final List<PriceRecallTellPriceSelectItem> f14403W;

    /* JADX INFO: renamed from: j */
    public VImage f14404j;

    /* JADX INFO: renamed from: k */
    public VImage f14405k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f14406l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f14407m;

    /* JADX INFO: renamed from: n */
    public VText_AutoFit f14408n;

    /* JADX INFO: renamed from: o */
    public VText f14409o;

    /* JADX INFO: renamed from: p */
    public VText_AutoFit f14410p;

    /* JADX INFO: renamed from: q */
    public View f14411q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f14412r;

    /* JADX INFO: renamed from: s */
    public VText f14413s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f14414t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f14415u;

    /* JADX INFO: renamed from: v */
    public VText f14416v;

    /* JADX INFO: renamed from: w */
    public VText f14417w;

    /* JADX INFO: renamed from: x */
    public VText f14418x;

    /* JADX INFO: renamed from: y */
    public VText f14419y;

    /* JADX INFO: renamed from: z */
    public VText f14420z;

    public km80(final Act act, final e30<Boolean> e30Var, List<Merchandise> list, String str, Object obj) {
        super(act, false, y7c0.b);
        this.f14403W = new ArrayList();
        this.f14392L = act;
        this.f14395O = obj;
        this.f14393M = new d30() { // from class: l.bm80
            public final void call() {
                this.f8261a.m16690c0(act, e30Var);
            }
        };
        this.f14396P = list;
        this.f14394N = str;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ int m16664F(Merchandise merchandise, Merchandise merchandise2) {
        return merchandise2.quantity - merchandise.quantity;
    }

    /* JADX INFO: renamed from: Q */
    public static PurchaseType m16673Q(ProductCategory productCategory) {
        String string = productCategory.toString();
        string.getClass();
        if (string.equals("tttVip")) {
            return PurchaseType.TYPE_GET_VIP;
        }
        if (string.equals("svip")) {
            return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        }
        return null;
    }

    /* JADX INFO: renamed from: S */
    private void m16674S() {
        if (this.f14398R == null) {
            int size = this.f14396P.size();
            List<Merchandise> list = this.f14396P;
            if (size > 1) {
                this.f14398R = zl80.m27413h(list);
            } else {
                this.f14398R = list.get(0);
            }
        }
        this.f14400T = this.f14399S.format(this.f14398R.getFirstCouponPrice());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    private void m16675U() {
        m16684R();
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.cm80
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f8743a.m16686V(dialogInterface, i, keyEvent);
            }
        });
        x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.dm80
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f9332a.m16676W(dialogInterface);
            }
        });
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        this.f14399S = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        this.f14418x.getPaint().setFlags(17);
        this.f14419y.getPaint().setFlags(17);
        this.f14384D.getPaint().setFlags(17);
        m16674S();
        if (CoreModule.P().a().U() && CoreModule.c.O0.n3()) {
            this.f14388H.setText(R.string.h);
        } else {
            this.f14388H.setText(R.string.C);
        }
        if (CoreModule.P().a().jh()) {
            this.f14389I.setText(CoreModule.P().a().D6());
            xdl0.M(this.f14389I, true);
        }
        this.f14405k.setOnClickListener(new View.OnClickListener() { // from class: l.em80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9869a.m16677X(view);
            }
        });
        this.f14382B.setOnClickListener(new View.OnClickListener() { // from class: l.fm80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10484a.m16678Y(view);
            }
        });
        m16685T();
        m16694j0();
        this.f14414t.removeAllViews();
        for (int i = 0; i < this.f14396P.size(); i++) {
            final PriceRecallTellPriceSelectItem priceRecallTellPriceSelectItem = (PriceRecallTellPriceSelectItem) LayoutInflater.from(getContext()).inflate(m6c0.f, (ViewGroup) null, false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.d(298.0f), t100.d(160.0f));
            layoutParams.weight = 1.0f;
            this.f14414t.addView(priceRecallTellPriceSelectItem, layoutParams);
            priceRecallTellPriceSelectItem.m932b(this.f14396P.get(i));
            if (i == 0) {
                priceRecallTellPriceSelectItem.setSelectState(true);
            } else {
                priceRecallTellPriceSelectItem.setSelectState(false);
            }
            this.f14403W.add(priceRecallTellPriceSelectItem);
            xdl0.E0(priceRecallTellPriceSelectItem, new View.OnClickListener() { // from class: l.gm80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11511a.m16687Z(priceRecallTellPriceSelectItem, view);
                }
            });
        }
        qib0.G.D(this.f14404j, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkdHRExES0hVWUFDMkIzNDVRRUZYTk1UMzVGQlAyWjE0IiwidyI6MTA4MCwiaCI6OTYzLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjE2MjgzM30.webp");
        x5b0 x5b0Var = new x5b0(this.f14398R.category, PurchaseTrackPageType.page_discount_callback, this.f14394N);
        this.f14402V = x5b0Var;
        x5b0Var.p("p_purchase_page");
        this.f14402V.v(this.f14398R.category);
        hab0 hab0Var = this.f14402V;
        List<Merchandise> list = this.f14396P;
        hab0Var.D(list, vwb.G(list, new w9j() { // from class: l.hm80
            public final Object call(Object obj) {
                return this.f12109a.m16688a0((Merchandise) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m16676W(DialogInterface dialogInterface) {
        i0e.e(this.f14397Q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m16677X(View view) {
        this.f14393M.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m16678Y(View view) {
        this.f14402V.w(this.f14398R, PayMethod.get("alipay"), false, CoreModule.P().a().U() && CoreModule.c.O0.n3());
        zvf0.u("e_purchase_discount", "p_purchase_discount_page", new j760[]{vwb.Y("discountproduct", zl80.m27410c(this.f14398R.category)), vwb.Y("discountduration", zl80.m27414i(this.f14396P)), vwb.Y("discountshowfrom", w2b0.b(this.f14394N))});
        m16679e0();
    }

    /* JADX INFO: renamed from: e0 */
    private void m16679e0() {
        String strN = NullChecker.a(this.f14402V) ? this.f14402V.n() : null;
        if (!CoreModule.P().a().j3() && !sd60.k()) {
            hab0.Companion.a(strN, this.f14398R.defaultStockKeepUnit.id, "alipay not install");
            return;
        }
        rf60 rf60Var = new rf60(m16673Q(this.f14398R.category), this.f14392L, "", "");
        rf60Var.C(strN);
        if (CoreModule.P().a().F4() && !vwb.J(this.f14398R.localCoupons) && !vwb.L(((Coupon) this.f14398R.localCoupons.get(0)).couponID)) {
            rf60Var.r(((Coupon) this.f14398R.localCoupons.get(0)).couponID);
        }
        rf60Var.I(false, this.f14398R.defaultStockKeepUnit.id, new e30() { // from class: l.jm80
            public final void call(Object obj) {
                this.f13869a.m16691d0((Integer) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    private void m16680g0() {
        this.f14406l.setPadding(0, xdl0.F0(), 0, 0);
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m16681h0(Act act, e30<Boolean> e30Var, List<Merchandise> list, String str, Object obj) {
        if (act == null) {
            return;
        }
        if (vwb.J(list)) {
            lsi0.D("优惠券已到期");
            return;
        }
        if (g6a.x()) {
            if (list.size() == 1 && list.get(0).semiAnnual()) {
                lya0.m17573S0(act, "lowPriceCallback3SVIP", list.get(0), e30Var, str);
                return;
            } else if (list.size() == 1 && list.get(0).quarterly()) {
                lya0.m17573S0(act, "lowPriceCallback3VIP", list.get(0), e30Var, str);
                return;
            }
        }
        Collections.sort(list, new Comparator() { // from class: l.am80
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return km80.m16664F((Merchandise) obj2, (Merchandise) obj3);
            }
        });
        km80 km80Var = new km80(act, e30Var, list, str, obj);
        km80Var.show();
        km80Var.m16692f0();
    }

    /* JADX INFO: renamed from: O */
    public final void m16682O(View view) {
        lm80.a(this, view);
    }

    /* JADX INFO: renamed from: P */
    public View m16683P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lm80.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R */
    public final void m16684R() {
        boolean zS = dsa.s("FROM_SVIP_LOW_PRICE");
        xdl0.M(this.f14390J, zS);
        if (zS) {
            Spannable spannableD = we60.D();
            this.f14390J.setOnTouchListener(new sd0(spannableD));
            this.f14390J.setText(spannableD);
        }
        xdl0.C0(this.f14387G, t100.d(zS ? 60.0f : 48.0f));
        xdl0.U(this.f14387G, t100.d(zS ? -2.0f : -18.0f));
    }

    /* JADX INFO: renamed from: T */
    public final void m16685T() {
        String string;
        String strM27411f = zl80.m27411f(this.f14398R);
        this.f14391K.setText(i0g0.g0(CoreModule.b.getString(R.string.z0, CoreModule.b.getString(R.string.y0, strM27411f) + " "), vwb.f0(new String[]{CoreModule.b.getString(R.string.y0, strM27411f)}), Color.parseColor("#ff5435"), vwb.f0(new Typeface[]{Typeface.create("sans-serif", 3), Typeface.create("sans-serif", 3)})));
        String strM27409b = zl80.m27409b(this.f14398R.category);
        this.f14408n.setTypeface(eqh0.c(3), 3);
        this.f14410p.setTypeface(eqh0.c(3), 3);
        this.f14409o.setTypeface(eqh0.c(3), 3);
        this.f14416v.setTypeface(eqh0.c(3), 1);
        this.f14417w.setTypeface(eqh0.c(3), 1);
        this.f14418x.setTypeface(eqh0.c(3), 1);
        this.f14419y.setTypeface(eqh0.c(3), 1);
        boolean zM27415k = zl80.m27415k(this.f14398R);
        VText_AutoFit vText_AutoFit = this.f14408n;
        if (zM27415k) {
            vText_AutoFit.setText(String.format("续费「%s」", strM27409b));
            xdl0.M(this.f14409o, false);
            xdl0.M(this.f14411q, true);
            xdl0.M(this.f14412r, false);
        } else {
            vText_AutoFit.setText(String.format("「%s」", strM27409b));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f14407m.getLayoutParams();
            if (TEnum.equals(this.f14398R.category, "tttSeeWhoLikedMe")) {
                layoutParams.leftMargin = t100.k;
                xdl0.M(this.f14409o, true);
            } else {
                layoutParams.leftMargin = t100.n;
                xdl0.M(this.f14409o, false);
            }
            this.f14407m.setLayoutParams(layoutParams);
            xdl0.M(this.f14411q, false);
            xdl0.M(this.f14412r, true);
            String string2 = this.f14398R.category.toString();
            string2.getClass();
            if (string2.equals("tttVip")) {
                this.f14413s.setText(R.string.C0);
            } else if (string2.equals("svip")) {
                this.f14413s.setText("尊享查看谁喜欢我、闪聊、优先推荐等全部16项特权");
            }
        }
        boolean zEquals = TEnum.equals(this.f14398R.category, "tttSeeWhoLikedMe");
        VText_AutoFit vText_AutoFit2 = this.f14408n;
        if (zEquals) {
            vText_AutoFit2.setTextSize(32.0f);
        } else {
            vText_AutoFit2.setTextSize(36.0f);
        }
        VText_AutoFit vText_AutoFit3 = this.f14410p;
        StringBuilder sb = new StringBuilder();
        Application application = CoreModule.b;
        int i = R.string.A0;
        DecimalFormat decimalFormat = this.f14399S;
        Merchandise merchandise = this.f14398R;
        sb.append(application.getString(i, decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price - merchandise.getFirstCouponPrice())));
        sb.append(" ");
        vText_AutoFit3.setText(sb.toString());
        int size = this.f14396P.size();
        LinearLayout linearLayout = this.f14414t;
        if (size > 1) {
            xdl0.M(linearLayout, true);
            xdl0.M(this.f14415u, false);
            return;
        }
        xdl0.M(linearLayout, false);
        xdl0.M(this.f14415u, true);
        if (this.f14398R.monthly()) {
            string = CoreModule.b.getString(R.string.D);
        } else if (this.f14398R.quarterly()) {
            string = CoreModule.b.getString(R.string.E);
        } else if (this.f14398R.semiAnnual()) {
            string = "半年";
        } else {
            string = this.f14398R.yearly() ? CoreModule.b.getString(R.string.F) : "";
        }
        this.f14416v.setText(CoreModule.b.getString(R.string.o0, "¥" + this.f14400T));
        this.f14417w.setText("/" + string);
        this.f14418x.setText(CoreModule.b.getString(R.string.m0, "¥" + this.f14401U));
        this.f14419y.setText("/" + string);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ boolean m16686V(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return true;
        }
        this.f14393M.call();
        return true;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m16687Z(PriceRecallTellPriceSelectItem priceRecallTellPriceSelectItem, View view) {
        for (PriceRecallTellPriceSelectItem priceRecallTellPriceSelectItem2 : this.f14403W) {
            if (priceRecallTellPriceSelectItem2 == view) {
                priceRecallTellPriceSelectItem.setSelectState(true);
                Merchandise currentMerchandise = priceRecallTellPriceSelectItem.getCurrentMerchandise();
                this.f14398R = currentMerchandise;
                this.f14402V.A(currentMerchandise);
                m16674S();
                m16694j0();
            } else {
                priceRecallTellPriceSelectItem2.setSelectState(false);
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ Boolean m16688a0(Merchandise merchandise) {
        return Boolean.valueOf(merchandise == this.f14398R);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m16689b0(e30 e30Var) {
        dismiss();
        if (e30Var != null) {
            e30Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m16690c0(Act act, final e30 e30Var) {
        if (zl80.m27412g().m27421m()) {
            PriceRecall2Dialog.m912j(act, this.f14396P, new d30() { // from class: l.im80
                public final void call() {
                    this.f13303a.m16689b0(e30Var);
                }
            });
            return;
        }
        dismiss();
        if (e30Var != null) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m16691d0(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m16692f0() {
        if (CoreModule.P().a().U()) {
            boolean zN3 = CoreModule.c.O0.n3();
            TextView textView = this.f14388H;
            if (zN3) {
                textView.setText(R.string.h);
            } else {
                textView.setText(R.string.R9);
            }
            m16693i0();
        } else {
            this.f14388H.setText(R.string.C);
        }
        this.f14388H.setCompoundDrawablesWithIntrinsicBounds(CoreModule.b.getResources().getDrawable(d3c0.f3), (Drawable) null, (Drawable) null, (Drawable) null);
        if (CoreModule.P().a().jh()) {
            this.f14389I.setText(CoreModule.P().a().D6());
            xdl0.M(this.f14389I, true);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m16693i0() {
        if (!CoreModule.c.O0.n3()) {
            this.f14385E.setText(R.string.G);
            return;
        }
        this.f14385E.setText(String.format(this.f14392L.getString(R.string.f), Integer.valueOf((int) this.f14398R.getFirstCouponPrice())));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m16694j0() {
        String string;
        if (this.f14398R.monthly()) {
            string = CoreModule.b.getString(R.string.D);
        } else if (this.f14398R.quarterly()) {
            string = CoreModule.b.getString(R.string.E);
        } else if (this.f14398R.semiAnnual()) {
            string = "半年";
        } else {
            string = this.f14398R.yearly() ? CoreModule.b.getString(R.string.F) : "";
        }
        boolean zSemiAnnual = this.f14398R.semiAnnual();
        VText vText = this.f14420z;
        if (zSemiAnnual) {
            vText.setText(String.format(Locale.getDefault(), "* %1$s后续费为原价¥%2$s/%3$s", string, this.f14401U, string));
        } else {
            vText.setText(String.format(Locale.getDefault(), "* %s", CoreModule.b.getString(R.string.B0, string, this.f14401U, string)));
        }
        if (CoreModule.P().a().U()) {
            xdl0.M(this.f14383C, false);
            xdl0.M(this.f14384D, false);
            a aVar = new a();
            aVar.c(this.f14381A);
            aVar.e(this.f14386F.getId(), 4, this.f14385E.getId(), 3);
            aVar.e(this.f14386F.getId(), 1, this.f14385E.getId(), 1);
            aVar.e(this.f14386F.getId(), 2, this.f14385E.getId(), 2);
            aVar.a(this.f14381A);
            m16693i0();
        } else {
            xdl0.M(this.f14384D, false);
            xdl0.M(this.f14383C, false);
            this.f14385E.setText(R.string.q0);
            a aVar2 = new a();
            aVar2.c(this.f14381A);
            aVar2.e(this.f14386F.getId(), 4, this.f14385E.getId(), 3);
            aVar2.e(this.f14386F.getId(), 1, this.f14385E.getId(), 1);
            aVar2.e(this.f14386F.getId(), 2, this.f14385E.getId(), 2);
            aVar2.a(this.f14381A);
        }
        this.f14386F.setText(CoreModule.b.getString(R.string.w0, new DecimalFormat("0.0").format(new BigDecimal(this.f14398R.getFirstCouponPrice() / ((double) n6a.t0(this.f14398R))).setScale(1, 0).doubleValue())));
        this.f14410p.p();
        VText_AutoFit vText_AutoFit = this.f14410p;
        StringBuilder sb = new StringBuilder();
        Application application = CoreModule.b;
        int i = R.string.A0;
        DecimalFormat decimalFormat = this.f14399S;
        Merchandise merchandise = this.f14398R;
        sb.append(application.getString(i, decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price - merchandise.getFirstCouponPrice())));
        sb.append(" ");
        vText_AutoFit.setText(sb.toString());
        if (this.f14398R.yearly() || this.f14398R.semiAnnual()) {
            m16692f0();
        }
    }

    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        View viewM16683P = m16683P(this.f14392L.getLayoutInflater(), null);
        setContentView(viewM16683P);
        m16682O(viewM16683P);
        m16680g0();
        m16675U();
        CoreModule.c.O0.C3();
    }

    public void show() {
        super.show();
        this.f14397Q = i0e.c("p_purchase_page", getClass().getName());
        ArrayList arrayList = new ArrayList();
        arrayList.add(vwb.Y("discountproduct", zl80.m27410c(this.f14398R.category)));
        arrayList.add(vwb.Y("discountduration", zl80.m27414i(this.f14396P)));
        arrayList.add(vwb.Y("discountshowfrom", w2b0.b(this.f14394N)));
        arrayList.add(vwb.Y("purchaseShowFrom", w2b0.b(this.f14394N)));
        arrayList.add(vwb.Y("productType", this.f14398R.category.toString()));
        if (this.f14395O instanceof String) {
            List listT = ic50.j().f().T((String) this.f14395O);
            if (!listT.isEmpty()) {
                arrayList.addAll(listT);
            }
        }
        j760[] j760VarArr = new j760[arrayList.size()];
        arrayList.toArray(j760VarArr);
        this.f14397Q.p(j760VarArr);
        i0e.f(this.f14397Q);
    }
}
