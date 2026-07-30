package p153l;

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
import androidx.constraintlayout.widget.C0223a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.pricerecall.PriceRecall2Dialog;
import com.p051p1.mobile.putong.core.p058ui.pricerecall.PriceRecallTellPriceSelectItem;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.tenum.TEnum;
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
import p151v.VImage;
import p151v.VText;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes4.dex */
public class ou80 extends g1e {

    /* JADX INFO: renamed from: A */
    public ConstraintLayout f149068A;

    /* JADX INFO: renamed from: B */
    public View f149069B;

    /* JADX INFO: renamed from: C */
    public VText f149070C;

    /* JADX INFO: renamed from: D */
    public VText f149071D;

    /* JADX INFO: renamed from: E */
    public VText f149072E;

    /* JADX INFO: renamed from: F */
    public VText f149073F;

    /* JADX INFO: renamed from: G */
    public RelativeLayout f149074G;

    /* JADX INFO: renamed from: H */
    public TextView f149075H;

    /* JADX INFO: renamed from: I */
    public VText f149076I;

    /* JADX INFO: renamed from: J */
    public VText f149077J;

    /* JADX INFO: renamed from: K */
    public VText f149078K;

    /* JADX INFO: renamed from: L */
    public final Act f149079L;

    /* JADX INFO: renamed from: M */
    @NonNull
    public final x20 f149080M;

    /* JADX INFO: renamed from: N */
    public final String f149081N;

    /* JADX INFO: renamed from: O */
    public final Object f149082O;

    /* JADX INFO: renamed from: P */
    public List<Merchandise> f149083P;

    /* JADX INFO: renamed from: Q */
    public l4g0 f149084Q;

    /* JADX INFO: renamed from: R */
    public Merchandise f149085R;

    /* JADX INFO: renamed from: S */
    public DecimalFormat f149086S;

    /* JADX INFO: renamed from: T */
    public String f149087T;

    /* JADX INFO: renamed from: U */
    public String f149088U;

    /* JADX INFO: renamed from: V */
    public lib0 f149089V;

    /* JADX INFO: renamed from: W */
    public final List<PriceRecallTellPriceSelectItem> f149090W;

    /* JADX INFO: renamed from: j */
    public VImage f149091j;

    /* JADX INFO: renamed from: k */
    public VImage f149092k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f149093l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f149094m;

    /* JADX INFO: renamed from: n */
    public VText_AutoFit f149095n;

    /* JADX INFO: renamed from: o */
    public VText f149096o;

    /* JADX INFO: renamed from: p */
    public VText_AutoFit f149097p;

    /* JADX INFO: renamed from: q */
    public View f149098q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f149099r;

    /* JADX INFO: renamed from: s */
    public VText f149100s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f149101t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f149102u;

    /* JADX INFO: renamed from: v */
    public VText f149103v;

    /* JADX INFO: renamed from: w */
    public VText f149104w;

    /* JADX INFO: renamed from: x */
    public VText f149105x;

    /* JADX INFO: renamed from: y */
    public VText f149106y;

    /* JADX INFO: renamed from: z */
    public VText f149107z;

    public ou80(final Act act, final y20<Boolean> y20Var, List<Merchandise> list, String str, Object obj) {
        super(act, false, dgc0.f88277b);
        this.f149090W = new ArrayList();
        this.f149079L = act;
        this.f149082O = obj;
        this.f149080M = new x20() { // from class: l.fu80
            @Override // p153l.x20
            public final void call() {
                this.f100889a.m169262c0(act, y20Var);
            }
        };
        this.f149083P = list;
        this.f149081N = str;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ int m169236F(Merchandise merchandise, Merchandise merchandise2) {
        return merchandise2.quantity - merchandise.quantity;
    }

    /* JADX INFO: renamed from: Q */
    public static PurchaseType m169245Q(ProductCategory productCategory) {
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
    private void m169246S() {
        if (this.f149085R == null) {
            int size = this.f149083P.size();
            List<Merchandise> list = this.f149083P;
            if (size > 1) {
                this.f149085R = du80.m118107h(list);
            } else {
                this.f149085R = list.get(0);
            }
        }
        this.f149087T = this.f149086S.format(this.f149085R.getFirstCouponPrice());
    }

    /* JADX INFO: renamed from: U */
    private void m169247U() {
        m169256R();
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.gu80
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f106475a.m169258V(dialogInterface, i, keyEvent);
            }
        });
        m128500x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.hu80
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f111622a.m169248W(dialogInterface);
            }
        });
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        this.f149086S = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        this.f149105x.getPaint().setFlags(17);
        this.f149106y.getPaint().setFlags(17);
        this.f149071D.getPaint().setFlags(17);
        m169246S();
        if (CoreModule.m30933P().m143405a().mo34428U() && CoreModule.f18264c.f20333O0.m31077n3()) {
            this.f149075H.setText(R$string.f28308h);
        } else {
            this.f149075H.setText(R$string.f27960C);
        }
        if (CoreModule.m30933P().m143405a().mo34528jh()) {
            this.f149076I.setText(CoreModule.m30933P().m143405a().mo34305D6());
            bnl0.m105524M(this.f149076I, true);
        }
        this.f149092k.setOnClickListener(new View.OnClickListener() { // from class: l.iu80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116907a.m169249X(view);
            }
        });
        this.f149069B.setOnClickListener(new View.OnClickListener() { // from class: l.ju80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122692a.m169250Y(view);
            }
        });
        m169257T();
        m169266j0();
        this.f149101t.removeAllViews();
        for (int i = 0; i < this.f149083P.size(); i++) {
            final PriceRecallTellPriceSelectItem priceRecallTellPriceSelectItem = (PriceRecallTellPriceSelectItem) LayoutInflater.from(getContext()).inflate(rec0.f162546f, (ViewGroup) null, false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qa00.m175859d(298.0f), qa00.m175859d(160.0f));
            layoutParams.weight = 1.0f;
            this.f149101t.addView(priceRecallTellPriceSelectItem, layoutParams);
            priceRecallTellPriceSelectItem.m51680b(this.f149083P.get(i));
            if (i == 0) {
                priceRecallTellPriceSelectItem.setSelectState(true);
            } else {
                priceRecallTellPriceSelectItem.setSelectState(false);
            }
            this.f149090W.add(priceRecallTellPriceSelectItem);
            bnl0.m105509E0(priceRecallTellPriceSelectItem, new View.OnClickListener() { // from class: l.ku80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f128822a.m169259Z(priceRecallTellPriceSelectItem, view);
                }
            });
        }
        uqb0.f180374G.m127098D(this.f149091j, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkdHRExES0hVWUFDMkIzNDVRRUZYTk1UMzVGQlAyWjE0IiwidyI6MTA4MCwiaCI6OTYzLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjE2MjgzM30.webp");
        beb0 beb0Var = new beb0(this.f149085R.category, PurchaseTrackPageType.page_discount_callback, this.f149081N);
        this.f149089V = beb0Var;
        beb0Var.m154339p("p_purchase_page");
        this.f149089V.m154344v(this.f149085R.category);
        lib0 lib0Var = this.f149089V;
        List<Merchandise> list = this.f149083P;
        lib0Var.m154335D(list, jyb.m147476G(list, new qcj() { // from class: l.lu80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f133610a.m169260a0((Merchandise) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m169248W(DialogInterface dialogInterface) {
        w1e.m204401e(this.f149084Q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m169249X(View view) {
        this.f149080M.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m169250Y(View view) {
        this.f149089V.m154345w(this.f149085R, PayMethod.get("alipay"), false, CoreModule.m30933P().m143405a().mo34428U() && CoreModule.f18264c.f20333O0.m31077n3());
        i4g0.m138523u("e_purchase_discount", "p_purchase_discount_page", jyb.m147494Y("discountproduct", du80.m118104c(this.f149085R.category)), jyb.m147494Y("discountduration", du80.m118108i(this.f149083P)), jyb.m147494Y("discountshowfrom", abb0.m96735b(this.f149081N)));
        m169251e0();
    }

    /* JADX INFO: renamed from: e0 */
    private void m169251e0() {
        String purchaseTrackId = NullChecker.m82486a(this.f149089V) ? this.f149089V.getPurchaseTrackId() : null;
        if (!CoreModule.m30933P().m143405a().mo34527j3() && !xl60.m211506k()) {
            lib0.INSTANCE.m154349a(purchaseTrackId, this.f149085R.defaultStockKeepUnit.f21249id, "alipay not install");
            return;
        }
        wn60 wn60Var = new wn60(m169245Q(this.f149085R.category), this.f149079L, "", "");
        wn60Var.m207144C(purchaseTrackId);
        if (CoreModule.m30933P().m143405a().mo34320F4() && !jyb.m147479J(this.f149085R.localCoupons) && !jyb.m147481L(this.f149085R.localCoupons.get(0).couponID)) {
            wn60Var.m207167r(this.f149085R.localCoupons.get(0).couponID);
        }
        wn60Var.m207150I(false, this.f149085R.defaultStockKeepUnit.f21249id, new y20() { // from class: l.nu80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143685a.m169263d0((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    private void m169252g0() {
        this.f149093l.setPadding(0, bnl0.m105511F0(), 0, 0);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m169253h0(Act act, y20<Boolean> y20Var, List<Merchandise> list, String str, Object obj) {
        if (act == null) {
            return;
        }
        if (jyb.m147479J(list)) {
            o1j0.m165622D("优惠券已到期");
            return;
        }
        if (s7a.m184995x()) {
            if (list.size() == 1 && list.get(0).semiAnnual()) {
                p6b0.m170797S0(act, MonetizationPromotionsId.lowPriceCallback3SVIP, list.get(0), y20Var, str);
                return;
            } else if (list.size() == 1 && list.get(0).quarterly()) {
                p6b0.m170797S0(act, MonetizationPromotionsId.lowPriceCallback3VIP, list.get(0), y20Var, str);
                return;
            }
        }
        Collections.sort(list, new Comparator() { // from class: l.eu80
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ou80.m169236F((Merchandise) obj2, (Merchandise) obj3);
            }
        });
        ou80 ou80Var = new ou80(act, y20Var, list, str, obj);
        ou80Var.show();
        ou80Var.m169264f0();
    }

    /* JADX INFO: renamed from: O */
    public final void m169254O(View view) {
        pu80.m173835a(this, view);
    }

    /* JADX INFO: renamed from: P */
    public View m169255P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pu80.m173836b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R */
    public final void m169256R() {
        boolean zM173726s = pta.m173726s("FROM_SVIP_LOW_PRICE");
        bnl0.m105524M(this.f149077J, zM173726s);
        if (zM173726s) {
            Spannable spannableM105321D = bn60.m105321D();
            this.f149077J.setOnTouchListener(new od0(spannableM105321D));
            this.f149077J.setText(spannableM105321D);
        }
        bnl0.m105505C0(this.f149074G, qa00.m175859d(zM173726s ? 60.0f : 48.0f));
        bnl0.m105537U(this.f149074G, qa00.m175859d(zM173726s ? -2.0f : -18.0f));
    }

    /* JADX INFO: renamed from: T */
    public final void m169257T() {
        String string;
        String strM118105f = du80.m118105f(this.f149085R);
        this.f149078K.setText(q8g0.m175801g0(CoreModule.f18263b.getString(R$string.f28516z0, CoreModule.f18263b.getString(R$string.f28505y0, strM118105f) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR), jyb.m147507f0(CoreModule.f18263b.getString(R$string.f28505y0, strM118105f)), Color.parseColor("#ff5435"), jyb.m147507f0(Typeface.create("sans-serif", 3), Typeface.create("sans-serif", 3))));
        String strM118103b = du80.m118103b(this.f149085R.category);
        this.f149095n.setTypeface(lyh0.m156283c(3), 3);
        this.f149097p.setTypeface(lyh0.m156283c(3), 3);
        this.f149096o.setTypeface(lyh0.m156283c(3), 3);
        this.f149103v.setTypeface(lyh0.m156283c(3), 1);
        this.f149104w.setTypeface(lyh0.m156283c(3), 1);
        this.f149105x.setTypeface(lyh0.m156283c(3), 1);
        this.f149106y.setTypeface(lyh0.m156283c(3), 1);
        boolean zM118109k = du80.m118109k(this.f149085R);
        VText_AutoFit vText_AutoFit = this.f149095n;
        if (zM118109k) {
            vText_AutoFit.setText(String.format("续费「%s」", strM118103b));
            bnl0.m105524M(this.f149096o, false);
            bnl0.m105524M(this.f149098q, true);
            bnl0.m105524M(this.f149099r, false);
        } else {
            vText_AutoFit.setText(String.format("「%s」", strM118103b));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f149094m.getLayoutParams();
            if (TEnum.equals(this.f149085R.category, ProductCategory.tttSeeWhoLikedMe)) {
                layoutParams.leftMargin = qa00.f156324k;
                bnl0.m105524M(this.f149096o, true);
            } else {
                layoutParams.leftMargin = qa00.f156327n;
                bnl0.m105524M(this.f149096o, false);
            }
            this.f149094m.setLayoutParams(layoutParams);
            bnl0.m105524M(this.f149098q, false);
            bnl0.m105524M(this.f149099r, true);
            String string2 = this.f149085R.category.toString();
            string2.getClass();
            if (string2.equals(ProductCategory.tttVip)) {
                this.f149100s.setText(R$string.f27961C0);
            } else if (string2.equals("svip")) {
                this.f149100s.setText("尊享查看谁喜欢我、闪聊、优先推荐等全部16项特权");
            }
        }
        boolean zEquals = TEnum.equals(this.f149085R.category, ProductCategory.tttSeeWhoLikedMe);
        VText_AutoFit vText_AutoFit2 = this.f149095n;
        if (zEquals) {
            vText_AutoFit2.setTextSize(32.0f);
        } else {
            vText_AutoFit2.setTextSize(36.0f);
        }
        VText_AutoFit vText_AutoFit3 = this.f149097p;
        StringBuilder sb = new StringBuilder();
        Application application = CoreModule.f18263b;
        int i = R$string.f27939A0;
        DecimalFormat decimalFormat = this.f149086S;
        Merchandise merchandise = this.f149085R;
        sb.append(application.getString(i, decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price - merchandise.getFirstCouponPrice())));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        vText_AutoFit3.setText(sb.toString());
        int size = this.f149083P.size();
        LinearLayout linearLayout = this.f149101t;
        if (size > 1) {
            bnl0.m105524M(linearLayout, true);
            bnl0.m105524M(this.f149102u, false);
            return;
        }
        bnl0.m105524M(linearLayout, false);
        bnl0.m105524M(this.f149102u, true);
        if (this.f149085R.monthly()) {
            string = CoreModule.f18263b.getString(R$string.f27971D);
        } else if (this.f149085R.quarterly()) {
            string = CoreModule.f18263b.getString(R$string.f27982E);
        } else if (this.f149085R.semiAnnual()) {
            string = "半年";
        } else {
            string = this.f149085R.yearly() ? CoreModule.f18263b.getString(R$string.f27993F) : "";
        }
        this.f149103v.setText(CoreModule.f18263b.getString(R$string.f28393o0, "¥" + this.f149087T));
        this.f149104w.setText("/" + string);
        this.f149105x.setText(CoreModule.f18263b.getString(R$string.f28369m0, "¥" + this.f149088U));
        this.f149106y.setText("/" + string);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ boolean m169258V(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return true;
        }
        this.f149080M.call();
        return true;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m169259Z(PriceRecallTellPriceSelectItem priceRecallTellPriceSelectItem, View view) {
        for (PriceRecallTellPriceSelectItem priceRecallTellPriceSelectItem2 : this.f149090W) {
            if (priceRecallTellPriceSelectItem2 == view) {
                priceRecallTellPriceSelectItem.setSelectState(true);
                Merchandise currentMerchandise = priceRecallTellPriceSelectItem.getCurrentMerchandise();
                this.f149085R = currentMerchandise;
                this.f149089V.m154332A(currentMerchandise);
                m169246S();
                m169266j0();
            } else {
                priceRecallTellPriceSelectItem2.setSelectState(false);
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ Boolean m169260a0(Merchandise merchandise) {
        return Boolean.valueOf(merchandise == this.f149085R);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m169261b0(y20 y20Var) {
        dismiss();
        if (y20Var != null) {
            y20Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m169262c0(Act act, final y20 y20Var) {
        if (du80.m118106g().m118115m()) {
            PriceRecall2Dialog.m51660j(act, this.f149083P, new x20() { // from class: l.mu80
                @Override // p153l.x20
                public final void call() {
                    this.f138753a.m169261b0(y20Var);
                }
            });
            return;
        }
        dismiss();
        if (y20Var != null) {
            y20Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m169263d0(Integer num) {
        dismiss();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m169264f0() {
        if (CoreModule.m30933P().m143405a().mo34428U()) {
            boolean zM31077n3 = CoreModule.f18264c.f20333O0.m31077n3();
            TextView textView = this.f149075H;
            if (zM31077n3) {
                textView.setText(R$string.f28308h);
            } else {
                textView.setText(R$string.f28135R9);
            }
            m169265i0();
        } else {
            this.f149075H.setText(R$string.f27960C);
        }
        this.f149075H.setCompoundDrawablesWithIntrinsicBounds(CoreModule.f18263b.getResources().getDrawable(jbc0.f119570f3), (Drawable) null, (Drawable) null, (Drawable) null);
        if (CoreModule.m30933P().m143405a().mo34528jh()) {
            this.f149076I.setText(CoreModule.m30933P().m143405a().mo34305D6());
            bnl0.m105524M(this.f149076I, true);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m169265i0() {
        if (!CoreModule.f18264c.f20333O0.m31077n3()) {
            this.f149072E.setText(R$string.f28004G);
            return;
        }
        this.f149072E.setText(String.format(this.f149079L.getString(R$string.f28284f), Integer.valueOf((int) this.f149085R.getFirstCouponPrice())));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m169266j0() {
        String string;
        if (this.f149085R.monthly()) {
            string = CoreModule.f18263b.getString(R$string.f27971D);
        } else if (this.f149085R.quarterly()) {
            string = CoreModule.f18263b.getString(R$string.f27982E);
        } else if (this.f149085R.semiAnnual()) {
            string = "半年";
        } else {
            string = this.f149085R.yearly() ? CoreModule.f18263b.getString(R$string.f27993F) : "";
        }
        boolean zSemiAnnual = this.f149085R.semiAnnual();
        VText vText = this.f149107z;
        if (zSemiAnnual) {
            vText.setText(String.format(Locale.getDefault(), "* %1$s后续费为原价¥%2$s/%3$s", string, this.f149088U, string));
        } else {
            vText.setText(String.format(Locale.getDefault(), "* %s", CoreModule.f18263b.getString(R$string.f27950B0, string, this.f149088U, string)));
        }
        if (CoreModule.m30933P().m143405a().mo34428U()) {
            bnl0.m105524M(this.f149070C, false);
            bnl0.m105524M(this.f149071D, false);
            C0223a c0223a = new C0223a();
            c0223a.m1149c(this.f149068A);
            c0223a.m1151e(this.f149073F.getId(), 4, this.f149072E.getId(), 3);
            c0223a.m1151e(this.f149073F.getId(), 1, this.f149072E.getId(), 1);
            c0223a.m1151e(this.f149073F.getId(), 2, this.f149072E.getId(), 2);
            c0223a.m1147a(this.f149068A);
            m169265i0();
        } else {
            bnl0.m105524M(this.f149071D, false);
            bnl0.m105524M(this.f149070C, false);
            this.f149072E.setText(R$string.f28417q0);
            C0223a c0223a2 = new C0223a();
            c0223a2.m1149c(this.f149068A);
            c0223a2.m1151e(this.f149073F.getId(), 4, this.f149072E.getId(), 3);
            c0223a2.m1151e(this.f149073F.getId(), 1, this.f149072E.getId(), 1);
            c0223a2.m1151e(this.f149073F.getId(), 2, this.f149072E.getId(), 2);
            c0223a2.m1147a(this.f149068A);
        }
        this.f149073F.setText(CoreModule.f18263b.getString(R$string.f28483w0, new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format(new BigDecimal(this.f149085R.getFirstCouponPrice() / ((double) z7a.m218877t0(this.f149085R))).setScale(1, 0).doubleValue())));
        this.f149097p.m224514p();
        VText_AutoFit vText_AutoFit = this.f149097p;
        StringBuilder sb = new StringBuilder();
        Application application = CoreModule.f18263b;
        int i = R$string.f27939A0;
        DecimalFormat decimalFormat = this.f149086S;
        Merchandise merchandise = this.f149085R;
        sb.append(application.getString(i, decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price - merchandise.getFirstCouponPrice())));
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        vText_AutoFit.setText(sb.toString());
        if (this.f149085R.yearly() || this.f149085R.semiAnnual()) {
            m169264f0();
        }
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewM169255P = m169255P(this.f149079L.getLayoutInflater(), null);
        setContentView(viewM169255P);
        m169254O(viewM169255P);
        m169252g0();
        m169247U();
        CoreModule.f18264c.f20333O0.m31073C3();
    }

    @Override // p153l.g1e, android.app.Dialog
    public void show() {
        super.show();
        this.f149084Q = w1e.m204399c("p_purchase_page", getClass().getName());
        ArrayList arrayList = new ArrayList();
        arrayList.add(jyb.m147494Y("discountproduct", du80.m118104c(this.f149085R.category)));
        arrayList.add(jyb.m147494Y("discountduration", du80.m118108i(this.f149083P)));
        arrayList.add(jyb.m147494Y("discountshowfrom", abb0.m96735b(this.f149081N)));
        arrayList.add(jyb.m147494Y("purchaseShowFrom", abb0.m96735b(this.f149081N)));
        arrayList.add(jyb.m147494Y("productType", this.f149085R.category.toString()));
        if (this.f149082O instanceof String) {
            List<pf60<String, String>> listM181656T = pk50.m172568j().m172574f().m181656T((String) this.f149082O);
            if (!listM181656T.isEmpty()) {
                arrayList.addAll(listM181656T);
            }
        }
        pf60[] pf60VarArr = new pf60[arrayList.size()];
        arrayList.toArray(pf60VarArr);
        this.f149084Q.m152781p(pf60VarArr);
        w1e.m204402f(this.f149084Q);
    }
}
