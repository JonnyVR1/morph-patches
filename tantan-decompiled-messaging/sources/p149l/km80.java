package p149l;

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
import androidx.constraintlayout.widget.C0222a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.pricerecall.PriceRecall2Dialog;
import com.p046p1.mobile.putong.core.p053ui.pricerecall.PriceRecallTellPriceSelectItem;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import p147v.VImage;
import p147v.VText;
import p147v.VText_AutoFit;

/* JADX INFO: loaded from: classes4.dex */
public class km80 extends szd {

    /* JADX INFO: renamed from: A */
    public ConstraintLayout f123741A;

    /* JADX INFO: renamed from: B */
    public View f123742B;

    /* JADX INFO: renamed from: C */
    public VText f123743C;

    /* JADX INFO: renamed from: D */
    public VText f123744D;

    /* JADX INFO: renamed from: E */
    public VText f123745E;

    /* JADX INFO: renamed from: F */
    public VText f123746F;

    /* JADX INFO: renamed from: G */
    public RelativeLayout f123747G;

    /* JADX INFO: renamed from: H */
    public TextView f123748H;

    /* JADX INFO: renamed from: I */
    public VText f123749I;

    /* JADX INFO: renamed from: J */
    public VText f123750J;

    /* JADX INFO: renamed from: K */
    public VText f123751K;

    /* JADX INFO: renamed from: L */
    public final Act f123752L;

    /* JADX INFO: renamed from: M */
    @NonNull
    public final d30 f123753M;

    /* JADX INFO: renamed from: N */
    public final String f123754N;

    /* JADX INFO: renamed from: O */
    public final Object f123755O;

    /* JADX INFO: renamed from: P */
    public List<Merchandise> f123756P;

    /* JADX INFO: renamed from: Q */
    public cwf0 f123757Q;

    /* JADX INFO: renamed from: R */
    public Merchandise f123758R;

    /* JADX INFO: renamed from: S */
    public DecimalFormat f123759S;

    /* JADX INFO: renamed from: T */
    public String f123760T;

    /* JADX INFO: renamed from: U */
    public String f123761U;

    /* JADX INFO: renamed from: V */
    public hab0 f123762V;

    /* JADX INFO: renamed from: W */
    public final List<PriceRecallTellPriceSelectItem> f123763W;

    /* JADX INFO: renamed from: j */
    public VImage f123764j;

    /* JADX INFO: renamed from: k */
    public VImage f123765k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f123766l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f123767m;

    /* JADX INFO: renamed from: n */
    public VText_AutoFit f123768n;

    /* JADX INFO: renamed from: o */
    public VText f123769o;

    /* JADX INFO: renamed from: p */
    public VText_AutoFit f123770p;

    /* JADX INFO: renamed from: q */
    public View f123771q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f123772r;

    /* JADX INFO: renamed from: s */
    public VText f123773s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f123774t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f123775u;

    /* JADX INFO: renamed from: v */
    public VText f123776v;

    /* JADX INFO: renamed from: w */
    public VText f123777w;

    /* JADX INFO: renamed from: x */
    public VText f123778x;

    /* JADX INFO: renamed from: y */
    public VText f123779y;

    /* JADX INFO: renamed from: z */
    public VText f123780z;

    public km80(final Act act, final e30<Boolean> e30Var, List<Merchandise> list, String str, Object obj) {
        super(act, false, y7c0.f196692b);
        this.f123763W = new ArrayList();
        this.f123752L = act;
        this.f123755O = obj;
        this.f123753M = new d30() { // from class: l.bm80
            @Override // p149l.d30
            public final void call() {
                this.f76248a.m146468c0(act, e30Var);
            }
        };
        this.f123756P = list;
        this.f123754N = str;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ int m146442F(Merchandise merchandise, Merchandise merchandise2) {
        return merchandise2.quantity - merchandise.quantity;
    }

    /* JADX INFO: renamed from: Q */
    public static PurchaseType m146451Q(ProductCategory productCategory) {
        String string = productCategory.toString();
        string.getClass();
        if (string.equals(ProductCategory.tttVip)) {
            return PurchaseType.TYPE_GET_VIP;
        }
        if (string.equals("svip")) {
            return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        }
        return null;
    }

    /* JADX INFO: renamed from: S */
    private void m146452S() {
        if (this.f123758R == null) {
            int size = this.f123756P.size();
            List<Merchandise> list = this.f123756P;
            if (size > 1) {
                this.f123758R = zl80.m219253h(list);
            } else {
                this.f123758R = list.get(0);
            }
        }
        this.f123760T = this.f123759S.format(this.f123758R.getFirstCouponPrice());
    }

    /* JADX INFO: renamed from: U */
    private void m146453U() {
        m146462R();
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.cm80
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f81518a.m146464V(dialogInterface, i, keyEvent);
            }
        });
        m186758x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.dm80
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f86906a.m146454W(dialogInterface);
            }
        });
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        this.f123759S = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        this.f123778x.getPaint().setFlags(17);
        this.f123779y.getPaint().setFlags(17);
        this.f123744D.getPaint().setFlags(17);
        m146452S();
        if (CoreModule.m29935P().m94651a().mo33425U() && CoreModule.f17545c.f19591O0.m30079n3()) {
            this.f123748H.setText(R$string.f27460h);
        } else {
            this.f123748H.setText(R$string.f27112C);
        }
        if (CoreModule.m29935P().m94651a().mo33525jh()) {
            this.f123749I.setText(CoreModule.m29935P().m94651a().mo33302D6());
            xdl0.m208344M(this.f123749I, true);
        }
        this.f123765k.setOnClickListener(new View.OnClickListener() { // from class: l.em80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92189a.m146455X(view);
            }
        });
        this.f123742B.setOnClickListener(new View.OnClickListener() { // from class: l.fm80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98277a.m146456Y(view);
            }
        });
        m146463T();
        m146472j0();
        this.f123774t.removeAllViews();
        for (int i = 0; i < this.f123756P.size(); i++) {
            final PriceRecallTellPriceSelectItem priceRecallTellPriceSelectItem = (PriceRecallTellPriceSelectItem) LayoutInflater.from(getContext()).inflate(m6c0.f131586f, (ViewGroup) null, false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.m186890d(298.0f), t100.m186890d(160.0f));
            layoutParams.weight = 1.0f;
            this.f123774t.addView(priceRecallTellPriceSelectItem, layoutParams);
            priceRecallTellPriceSelectItem.m50497b(this.f123756P.get(i));
            if (i == 0) {
                priceRecallTellPriceSelectItem.setSelectState(true);
            } else {
                priceRecallTellPriceSelectItem.setSelectState(false);
            }
            this.f123763W.add(priceRecallTellPriceSelectItem);
            xdl0.m208329E0(priceRecallTellPriceSelectItem, new View.OnClickListener() { // from class: l.gm80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f103429a.m146465Z(priceRecallTellPriceSelectItem, view);
                }
            });
        }
        qib0.f154691G.m102314D(this.f123764j, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkdHRExES0hVWUFDMkIzNDVRRUZYTk1UMzVGQlAyWjE0IiwidyI6MTA4MCwiaCI6OTYzLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjE2MjgzM30.webp");
        x5b0 x5b0Var = new x5b0(this.f123758R.category, PurchaseTrackPageType.page_discount_callback, this.f123754N);
        this.f123762V = x5b0Var;
        x5b0Var.m130117p("p_purchase_page");
        this.f123762V.m130122v(this.f123758R.category);
        hab0 hab0Var = this.f123762V;
        List<Merchandise> list = this.f123756P;
        hab0Var.m130101D(list, vwb.m200293G(list, new w9j() { // from class: l.hm80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f108403a.m146466a0((Merchandise) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m146454W(DialogInterface dialogInterface) {
        i0e.m133796e(this.f123757Q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m146455X(View view) {
        this.f123753M.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m146456Y(View view) {
        this.f123762V.m130123w(this.f123758R, PayMethod.get("alipay"), false, CoreModule.m29935P().m94651a().mo33425U() && CoreModule.f17545c.f19591O0.m30079n3());
        zvf0.m220399u("e_purchase_discount", "p_purchase_discount_page", vwb.m200311Y("discountproduct", zl80.m219250c(this.f123758R.category)), vwb.m200311Y("discountduration", zl80.m219254i(this.f123756P)), vwb.m200311Y("discountshowfrom", w2b0.m201088b(this.f123754N)));
        m146457e0();
    }

    /* JADX INFO: renamed from: e0 */
    private void m146457e0() {
        String purchaseTrackId = NullChecker.m81303a(this.f123762V) ? this.f123762V.getPurchaseTrackId() : null;
        if (!CoreModule.m29935P().m94651a().mo33524j3() && !sd60.m183460k()) {
            hab0.INSTANCE.m130127a(purchaseTrackId, this.f123758R.defaultStockKeepUnit.f20507id, "alipay not install");
            return;
        }
        rf60 rf60Var = new rf60(m146451Q(this.f123758R.category), this.f123752L, "", "");
        rf60Var.m179078C(purchaseTrackId);
        if (CoreModule.m29935P().m94651a().mo33317F4() && !vwb.m200296J(this.f123758R.localCoupons) && !vwb.m200298L(this.f123758R.localCoupons.get(0).couponID)) {
            rf60Var.m179101r(this.f123758R.localCoupons.get(0).couponID);
        }
        rf60Var.m179084I(false, this.f123758R.defaultStockKeepUnit.f20507id, new e30() { // from class: l.jm80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118620a.m146469d0((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    private void m146458g0() {
        this.f123766l.setPadding(0, xdl0.m208331F0(), 0, 0);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m146459h0(Act act, e30<Boolean> e30Var, List<Merchandise> list, String str, Object obj) {
        if (act == null) {
            return;
        }
        if (vwb.m200296J(list)) {
            lsi0.m151566D("优惠券已到期");
            return;
        }
        if (g6a.m124575x()) {
            if (list.size() == 1 && list.get(0).semiAnnual()) {
                lya0.m152181S0(act, MonetizationPromotionsId.lowPriceCallback3SVIP, list.get(0), e30Var, str);
                return;
            } else if (list.size() == 1 && list.get(0).quarterly()) {
                lya0.m152181S0(act, MonetizationPromotionsId.lowPriceCallback3VIP, list.get(0), e30Var, str);
                return;
            }
        }
        Collections.sort(list, new Comparator() { // from class: l.am80
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return km80.m146442F((Merchandise) obj2, (Merchandise) obj3);
            }
        });
        km80 km80Var = new km80(act, e30Var, list, str, obj);
        km80Var.show();
        km80Var.m146470f0();
    }

    /* JADX INFO: renamed from: O */
    public final void m146460O(View view) {
        lm80.m150556a(this, view);
    }

    /* JADX INFO: renamed from: P */
    public View m146461P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lm80.m150557b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R */
    public final void m146462R() {
        boolean zM113446s = dsa.m113446s("FROM_SVIP_LOW_PRICE");
        xdl0.m208344M(this.f123750J, zM113446s);
        if (zM113446s) {
            Spannable spannableM202839D = we60.m202839D();
            this.f123750J.setOnTouchListener(new sd0(spannableM202839D));
            this.f123750J.setText(spannableM202839D);
        }
        xdl0.m208325C0(this.f123747G, t100.m186890d(zM113446s ? 60.0f : 48.0f));
        xdl0.m208357U(this.f123747G, t100.m186890d(zM113446s ? -2.0f : -18.0f));
    }

    /* JADX INFO: renamed from: T */
    public final void m146463T() {
        String string;
        String strM219251f = zl80.m219251f(this.f123758R);
        this.f123751K.setText(i0g0.m133866g0(CoreModule.f17544b.getString(R$string.f27668z0, CoreModule.f17544b.getString(R$string.f27657y0, strM219251f) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR), vwb.m200324f0(CoreModule.f17544b.getString(R$string.f27657y0, strM219251f)), Color.parseColor("#ff5435"), vwb.m200324f0(Typeface.create("sans-serif", 3), Typeface.create("sans-serif", 3))));
        String strM219249b = zl80.m219249b(this.f123758R.category);
        this.f123768n.setTypeface(eqh0.m117752c(3), 3);
        this.f123770p.setTypeface(eqh0.m117752c(3), 3);
        this.f123769o.setTypeface(eqh0.m117752c(3), 3);
        this.f123776v.setTypeface(eqh0.m117752c(3), 1);
        this.f123777w.setTypeface(eqh0.m117752c(3), 1);
        this.f123778x.setTypeface(eqh0.m117752c(3), 1);
        this.f123779y.setTypeface(eqh0.m117752c(3), 1);
        boolean zM219255k = zl80.m219255k(this.f123758R);
        VText_AutoFit vText_AutoFit = this.f123768n;
        if (zM219255k) {
            vText_AutoFit.setText(String.format("续费「%s」", strM219249b));
            xdl0.m208344M(this.f123769o, false);
            xdl0.m208344M(this.f123771q, true);
            xdl0.m208344M(this.f123772r, false);
        } else {
            vText_AutoFit.setText(String.format("「%s」", strM219249b));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f123767m.getLayoutParams();
            if (TEnum.equals(this.f123758R.category, ProductCategory.tttSeeWhoLikedMe)) {
                layoutParams.leftMargin = t100.f167262k;
                xdl0.m208344M(this.f123769o, true);
            } else {
                layoutParams.leftMargin = t100.f167265n;
                xdl0.m208344M(this.f123769o, false);
            }
            this.f123767m.setLayoutParams(layoutParams);
            xdl0.m208344M(this.f123771q, false);
            xdl0.m208344M(this.f123772r, true);
            String string2 = this.f123758R.category.toString();
            string2.getClass();
            if (string2.equals(ProductCategory.tttVip)) {
                this.f123773s.setText(R$string.f27113C0);
            } else if (string2.equals("svip")) {
                this.f123773s.setText("尊享查看谁喜欢我、闪聊、优先推荐等全部16项特权");
            }
        }
        boolean zEquals = TEnum.equals(this.f123758R.category, ProductCategory.tttSeeWhoLikedMe);
        VText_AutoFit vText_AutoFit2 = this.f123768n;
        if (zEquals) {
            vText_AutoFit2.setTextSize(32.0f);
        } else {
            vText_AutoFit2.setTextSize(36.0f);
        }
        VText_AutoFit vText_AutoFit3 = this.f123770p;
        StringBuilder sb = new StringBuilder();
        Application application = CoreModule.f17544b;
        int i = R$string.f27091A0;
        DecimalFormat decimalFormat = this.f123759S;
        Merchandise merchandise = this.f123758R;
        sb.append(application.getString(i, decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price - merchandise.getFirstCouponPrice())));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        vText_AutoFit3.setText(sb.toString());
        int size = this.f123756P.size();
        LinearLayout linearLayout = this.f123774t;
        if (size > 1) {
            xdl0.m208344M(linearLayout, true);
            xdl0.m208344M(this.f123775u, false);
            return;
        }
        xdl0.m208344M(linearLayout, false);
        xdl0.m208344M(this.f123775u, true);
        if (this.f123758R.monthly()) {
            string = CoreModule.f17544b.getString(R$string.f27123D);
        } else if (this.f123758R.quarterly()) {
            string = CoreModule.f17544b.getString(R$string.f27134E);
        } else if (this.f123758R.semiAnnual()) {
            string = "半年";
        } else {
            string = this.f123758R.yearly() ? CoreModule.f17544b.getString(R$string.f27145F) : "";
        }
        this.f123776v.setText(CoreModule.f17544b.getString(R$string.f27545o0, "¥" + this.f123760T));
        this.f123777w.setText("/" + string);
        this.f123778x.setText(CoreModule.f17544b.getString(R$string.f27521m0, "¥" + this.f123761U));
        this.f123779y.setText("/" + string);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ boolean m146464V(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return true;
        }
        this.f123753M.call();
        return true;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m146465Z(PriceRecallTellPriceSelectItem priceRecallTellPriceSelectItem, View view) {
        for (PriceRecallTellPriceSelectItem priceRecallTellPriceSelectItem2 : this.f123763W) {
            if (priceRecallTellPriceSelectItem2 == view) {
                priceRecallTellPriceSelectItem.setSelectState(true);
                Merchandise currentMerchandise = priceRecallTellPriceSelectItem.getCurrentMerchandise();
                this.f123758R = currentMerchandise;
                this.f123762V.m130098A(currentMerchandise);
                m146452S();
                m146472j0();
            } else {
                priceRecallTellPriceSelectItem2.setSelectState(false);
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ Boolean m146466a0(Merchandise merchandise) {
        return Boolean.valueOf(merchandise == this.f123758R);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m146467b0(e30 e30Var) {
        dismiss();
        if (e30Var != null) {
            e30Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m146468c0(Act act, final e30 e30Var) {
        if (zl80.m219252g().m219261m()) {
            PriceRecall2Dialog.m50477j(act, this.f123756P, new d30() { // from class: l.im80
                @Override // p149l.d30
                public final void call() {
                    this.f113903a.m146467b0(e30Var);
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
    public final /* synthetic */ void m146469d0(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m146470f0() {
        if (CoreModule.m29935P().m94651a().mo33425U()) {
            boolean zM30079n3 = CoreModule.f17545c.f19591O0.m30079n3();
            TextView textView = this.f123748H;
            if (zM30079n3) {
                textView.setText(R$string.f27460h);
            } else {
                textView.setText(R$string.f27287R9);
            }
            m146471i0();
        } else {
            this.f123748H.setText(R$string.f27112C);
        }
        this.f123748H.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f17544b.getResources().getDrawable(d3c0.f83915f3), (Drawable) null, (Drawable) null, (Drawable) null);
        if (CoreModule.m29935P().m94651a().mo33525jh()) {
            this.f123749I.setText(CoreModule.m29935P().m94651a().mo33302D6());
            xdl0.m208344M(this.f123749I, true);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m146471i0() {
        if (!CoreModule.f17545c.f19591O0.m30079n3()) {
            this.f123745E.setText(R$string.f27156G);
            return;
        }
        this.f123745E.setText(String.format(this.f123752L.getString(R$string.f27436f), Integer.valueOf((int) this.f123758R.getFirstCouponPrice())));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m146472j0() {
        String string;
        if (this.f123758R.monthly()) {
            string = CoreModule.f17544b.getString(R$string.f27123D);
        } else if (this.f123758R.quarterly()) {
            string = CoreModule.f17544b.getString(R$string.f27134E);
        } else if (this.f123758R.semiAnnual()) {
            string = "半年";
        } else {
            string = this.f123758R.yearly() ? CoreModule.f17544b.getString(R$string.f27145F) : "";
        }
        boolean zSemiAnnual = this.f123758R.semiAnnual();
        VText vText = this.f123780z;
        if (zSemiAnnual) {
            vText.setText(String.format(Locale.getDefault(), "* %1$s后续费为原价¥%2$s/%3$s", string, this.f123761U, string));
        } else {
            vText.setText(String.format(Locale.getDefault(), "* %s", CoreModule.f17544b.getString(R$string.f27102B0, string, this.f123761U, string)));
        }
        if (CoreModule.m29935P().m94651a().mo33425U()) {
            xdl0.m208344M(this.f123743C, false);
            xdl0.m208344M(this.f123744D, false);
            C0222a c0222a = new C0222a();
            c0222a.m1148c(this.f123741A);
            c0222a.m1150e(this.f123746F.getId(), 4, this.f123745E.getId(), 3);
            c0222a.m1150e(this.f123746F.getId(), 1, this.f123745E.getId(), 1);
            c0222a.m1150e(this.f123746F.getId(), 2, this.f123745E.getId(), 2);
            c0222a.m1146a(this.f123741A);
            m146471i0();
        } else {
            xdl0.m208344M(this.f123744D, false);
            xdl0.m208344M(this.f123743C, false);
            this.f123745E.setText(R$string.f27569q0);
            C0222a c0222a2 = new C0222a();
            c0222a2.m1148c(this.f123741A);
            c0222a2.m1150e(this.f123746F.getId(), 4, this.f123745E.getId(), 3);
            c0222a2.m1150e(this.f123746F.getId(), 1, this.f123745E.getId(), 1);
            c0222a2.m1150e(this.f123746F.getId(), 2, this.f123745E.getId(), 2);
            c0222a2.m1146a(this.f123741A);
        }
        this.f123746F.setText(CoreModule.f17544b.getString(R$string.f27635w0, new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format(new BigDecimal(this.f123758R.getFirstCouponPrice() / ((double) n6a.m158032t0(this.f123758R))).setScale(1, 0).doubleValue())));
        this.f123770p.m223268p();
        VText_AutoFit vText_AutoFit = this.f123770p;
        StringBuilder sb = new StringBuilder();
        Application application = CoreModule.f17544b;
        int i = R$string.f27091A0;
        DecimalFormat decimalFormat = this.f123759S;
        Merchandise merchandise = this.f123758R;
        sb.append(application.getString(i, decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price - merchandise.getFirstCouponPrice())));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        vText_AutoFit.setText(sb.toString());
        if (this.f123758R.yearly() || this.f123758R.semiAnnual()) {
            m146470f0();
        }
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewM146461P = m146461P(this.f123752L.getLayoutInflater(), null);
        setContentView(viewM146461P);
        m146460O(viewM146461P);
        m146458g0();
        m146453U();
        CoreModule.f17545c.f19591O0.m30075C3();
    }

    @Override // p149l.szd, android.app.Dialog
    public void show() {
        super.show();
        this.f123757Q = i0e.m133794c("p_purchase_page", getClass().getName());
        ArrayList arrayList = new ArrayList();
        arrayList.add(vwb.m200311Y("discountproduct", zl80.m219250c(this.f123758R.category)));
        arrayList.add(vwb.m200311Y("discountduration", zl80.m219254i(this.f123756P)));
        arrayList.add(vwb.m200311Y("discountshowfrom", w2b0.m201088b(this.f123754N)));
        arrayList.add(vwb.m200311Y("purchaseShowFrom", w2b0.m201088b(this.f123754N)));
        arrayList.add(vwb.m200311Y("productType", this.f123758R.category.toString()));
        if (this.f123755O instanceof String) {
            List<j760<String, String>> listM145233T = ic50.m135327j().m135333f().m145233T((String) this.f123755O);
            if (!listM145233T.isEmpty()) {
                arrayList.addAll(listM145233T);
            }
        }
        j760[] j760VarArr = new j760[arrayList.size()];
        arrayList.toArray(j760VarArr);
        this.f123757Q.m109040p(j760VarArr);
        i0e.m133797f(this.f123757Q);
    }
}
