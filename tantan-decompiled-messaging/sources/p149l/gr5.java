package p149l;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b$\u0010%J\u0011\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0016¢\u0006\u0004\b)\u0010*J1\u0010-\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010\f2\b\u0010,\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b-\u0010.J+\u00100\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010\f2\b\u0010,\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00105R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00106R\u0014\u00108\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010:R\u0014\u0010<\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00107R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010>R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010>R\u0014\u0010A\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010>R\u0014\u0010B\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010:R\u0014\u0010C\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010:R\u0014\u0010E\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010:¨\u0006F"}, m87232d2 = {"Ll/gr5;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Ljava/text/NumberFormat;", "priceFormatter", "Ll/e30;", "", "onItemClick", "<init>", "(Landroid/view/View;Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/text/NumberFormat;Ll/e30;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Ll/ljf0;", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ll/ljf0;", "skuInfo", "", "g", "(Ll/ljf0;)V", "", "isSelected", RXScreenCaptureService.KEY_INDEX, "(ZLl/ljf0;)V", "discountPercent", "h", "(Ll/ljf0;I)V", "j", "hasDiscount", BLiveStormDanmakuGiftResourceType.f44444l, "(Z)V", "c", "(Ll/ljf0;)I", "", "e", "()Ljava/lang/Double;", "k", "()V", "hotQuantity", "bestQuantity", "b", "(Lcom/p1/mobile/putong/core/data/Merchandise;ZLjava/lang/Integer;Ljava/lang/Integer;)V", FirebaseAnalytics.Param.QUANTITY, "f", "(ILjava/lang/Integer;Ljava/lang/Integer;)V", "a", "Lcom/p1/mobile/android/app/Act;", "Ljava/util/List;", "Ljava/text/NumberFormat;", "Ll/e30;", "Landroid/view/View;", "cardRoot", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "discountLabel", "llContent", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "starIcon", "hotLabel", "bestLabel", "quantityText", "unitText", "m", "priceText", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class gr5 extends RecyclerView.AbstractC0566d0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<C8765d> sections;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final NumberFormat priceFormatter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final e30<Integer> onItemClick;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final View cardRoot;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final TextView discountLabel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final View llContent;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final ImageView starIcon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final ImageView hotLabel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final ImageView bestLabel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final TextView quantityText;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final TextView unitText;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final TextView priceText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gr5(@NotNull View view, @NotNull Act act, @NotNull List<? extends C8765d> list, @NotNull NumberFormat numberFormat, @Nullable e30<Integer> e30Var) {
        super(view);
        view.getClass();
        act.getClass();
        list.getClass();
        numberFormat.getClass();
        this.act = act;
        this.sections = list;
        this.priceFormatter = numberFormat;
        this.onItemClick = e30Var;
        View viewFindViewById = view.findViewById(z4c0.f201483M0);
        viewFindViewById.getClass();
        this.cardRoot = viewFindViewById;
        View viewFindViewById2 = view.findViewById(z4c0.f201474I);
        viewFindViewById2.getClass();
        this.discountLabel = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(z4c0.f201556p0);
        viewFindViewById3.getClass();
        this.llContent = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(z4c0.f201487O0);
        viewFindViewById4.getClass();
        this.starIcon = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(z4c0.f201506Y);
        viewFindViewById5.getClass();
        this.hotLabel = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(z4c0.f201540k);
        viewFindViewById6.getClass();
        this.bestLabel = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(z4c0.f201463C0);
        viewFindViewById7.getClass();
        this.quantityText = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(z4c0.f201539j1);
        viewFindViewById8.getClass();
        this.unitText = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(z4c0.f201569v0);
        viewFindViewById9.getClass();
        this.priceText = (TextView) viewFindViewById9;
    }

    /* JADX INFO: renamed from: a */
    public static void m127665a(gr5 gr5Var, View view) {
        e30<Integer> e30Var;
        int adapterPosition = gr5Var.getAdapterPosition();
        if (adapterPosition == -1 || (e30Var = gr5Var.onItemClick) == null) {
            return;
        }
        e30Var.call(Integer.valueOf(adapterPosition));
    }

    /* JADX INFO: renamed from: c */
    private final int m127666c(ljf0 skuInfo) {
        Double dM127668e = m127668e();
        if (dM127668e == null) {
            return 0;
        }
        double dDoubleValue = dM127668e.doubleValue();
        if (dDoubleValue <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return 0;
        }
        return (int) Math.ceil((1.0d - (skuInfo.getTotalPrice() / (dDoubleValue * ((double) skuInfo.getCom.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String())))) * 100.0d);
    }

    /* JADX INFO: renamed from: d */
    private final ljf0 m127667d(Merchandise merchandise) {
        Prices prices = merchandise.defaultStockKeepUnit.prices;
        prices.getClass();
        int i = merchandise.quantity;
        double d = prices.price;
        double d2 = i > 0 ? d / ((double) i) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        String str = prices.currencySymbol;
        str.getClass();
        return new ljf0(i, d, d2, str);
    }

    /* JADX INFO: renamed from: e */
    private final Double m127668e() {
        Object next;
        Merchandise merchandiseM53601s;
        Merchandise merchandiseM53601s2;
        Iterator<T> it = this.sections.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C8765d c8765d = (C8765d) next;
            C8765d.a aVarM53522d = c8765d.m53522d();
            if (aVarM53522d == null || (merchandiseM53601s2 = aVarM53522d.m53601s()) == null) {
                C8765d.a aVarM53520b = c8765d.m53520b();
                merchandiseM53601s2 = aVarM53520b != null ? aVarM53520b.m53601s() : null;
            }
            if (merchandiseM53601s2 != null && merchandiseM53601s2.quantity == 3) {
                break;
            }
        }
        C8765d c8765d2 = (C8765d) next;
        if (c8765d2 != null) {
            C8765d.a aVarM53522d2 = c8765d2.m53522d();
            if (aVarM53522d2 == null || (merchandiseM53601s = aVarM53522d2.m53601s()) == null) {
                C8765d.a aVarM53520b2 = c8765d2.m53520b();
                merchandiseM53601s = aVarM53520b2 != null ? aVarM53520b2.m53601s() : null;
            }
            if (merchandiseM53601s != null) {
                if (!NullChecker.m81303a(merchandiseM53601s)) {
                    merchandiseM53601s = null;
                }
                if (merchandiseM53601s != null) {
                    int i = merchandiseM53601s.quantity;
                    double d = merchandiseM53601s.defaultStockKeepUnit.prices.price;
                    if (i > 0) {
                        return Double.valueOf(d / ((double) i));
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private final void m127669g(ljf0 skuInfo) {
        this.quantityText.setTypeface(eqh0.m117752c(3), 1);
        this.unitText.setTypeface(eqh0.m117752c(2), 1);
        this.priceText.setTypeface(eqh0.m117752c(3), 1);
        this.quantityText.setText(String.valueOf(skuInfo.getCom.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String()));
        this.unitText.setText(R$string.f27582r2);
        String str = this.priceFormatter.format(skuInfo.getUnitPrice());
        this.priceText.setText(this.act.getString(R$string.f27615u2, skuInfo.getCurrencySymbol() + str));
    }

    /* JADX INFO: renamed from: h */
    private final void m127670h(ljf0 skuInfo, int discountPercent) {
        zvf0.m220368A("e_intl_compliment_iap_sku_click", "p_intl_compliment_iap_view", vwb.m200311Y("skuID", this.sections.get(getAdapterPosition()).m53521c().defaultStockKeepUnit.affiliateProducts.getProductId()));
        this.cardRoot.setBackgroundResource(d3c0.f83656M0);
        TextView textView = this.discountLabel;
        if (discountPercent <= 0) {
            xdl0.m208344M(textView, false);
            m127673l(false);
            return;
        }
        textView.setBackgroundResource(d3c0.f83614J0);
        this.discountLabel.setTypeface(eqh0.m117752c(3), 1);
        this.discountLabel.setText(this.act.getString(R$string.f27410c9, String.valueOf(discountPercent)));
        this.discountLabel.setTextColor(this.act.getResources().getColor(R.color.white));
        xdl0.m208344M(this.discountLabel, true);
        m127673l(true);
    }

    /* JADX INFO: renamed from: i */
    private final void m127671i(boolean isSelected, ljf0 skuInfo) {
        int iM127666c = m127666c(skuInfo);
        if (isSelected) {
            m127670h(skuInfo, iM127666c);
        } else {
            m127672j(skuInfo, iM127666c);
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m127672j(ljf0 skuInfo, int discountPercent) {
        this.cardRoot.setBackgroundResource(d3c0.f83642L0);
        TextView textView = this.discountLabel;
        if (discountPercent <= 0) {
            xdl0.m208344M(textView, false);
            m127673l(false);
            return;
        }
        textView.setBackgroundResource(d3c0.f83628K0);
        this.discountLabel.setTypeface(eqh0.m117752c(3), 1);
        this.discountLabel.setText(this.act.getString(R$string.f27410c9, String.valueOf(discountPercent)));
        this.discountLabel.setTextColor(this.act.getResources().getColor(R.color.white));
        xdl0.m208344M(this.discountLabel, true);
        m127673l(true);
    }

    /* JADX INFO: renamed from: l */
    private final void m127673l(boolean hasDiscount) {
        ViewGroup.LayoutParams layoutParams = this.llContent.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = (int) ((hasDiscount ? 56 : 46) * this.act.getResources().getDisplayMetrics().density);
            this.llContent.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m127674b(@NotNull Merchandise merchandise, boolean isSelected, @Nullable Integer hotQuantity, @Nullable Integer bestQuantity) {
        merchandise.getClass();
        ljf0 ljf0VarM127667d = m127667d(merchandise);
        m127669g(ljf0VarM127667d);
        m127675f(ljf0VarM127667d.getCom.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String(), hotQuantity, bestQuantity);
        m127671i(isSelected, ljf0VarM127667d);
    }

    /* JADX INFO: renamed from: f */
    public final void m127675f(int quantity, Integer hotQuantity, Integer bestQuantity) {
        boolean z = false;
        boolean z2 = hotQuantity != null && quantity == hotQuantity.intValue();
        if (bestQuantity != null && quantity == bestQuantity.intValue()) {
            z = true;
        }
        xdl0.m208344M(this.hotLabel, z2);
        xdl0.m208344M(this.bestLabel, z);
    }

    /* JADX INFO: renamed from: k */
    public final void m127676k() {
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.fr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gr5.m127665a(this.f98892a, view);
            }
        });
    }
}
