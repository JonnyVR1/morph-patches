package p153l;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00152\u0006\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u00122\u0006\u0010&\u001a\u00020#2\u0006\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00122\u0006\u0010&\u001a\u00020#2\u0006\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010-J\u0017\u0010/\u001a\u00020\f2\u0006\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00104R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00105R\u0014\u00107\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00109R\u0014\u0010;\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00106R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010=R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010=R\u0014\u0010@\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00109R\u0014\u0010A\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00109R\u0014\u0010B\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00109¨\u0006C"}, m88121d2 = {"Ll/u6h0;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroid/view/View;", "itemView", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Ljava/text/NumberFormat;", "priceFormatter", "Ll/y20;", "", "onItemClick", "<init>", "(Landroid/view/View;Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/text/NumberFormat;Ll/y20;)V", FirebaseAnalytics.Param.QUANTITY, "hotQuantity", "", "f", "(ILjava/lang/Integer;)V", "", "hasDiscount", BLiveStormDanmakuGiftResourceType.f45292l, "(Z)V", "", "e", "()Ljava/lang/Double;", "k", "()V", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "isSelected", "b", "(Lcom/p1/mobile/putong/core/data/Merchandise;ZLjava/lang/Integer;)V", "Ll/trf0;", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ll/trf0;", "skuInfo", "g", "(Ll/trf0;)V", RXScreenCaptureService.KEY_INDEX, "(ZLl/trf0;)V", "discountPercent", "h", "(Ll/trf0;I)V", "j", "c", "(Ll/trf0;)I", "a", "Lcom/p1/mobile/android/app/Act;", "Ljava/util/List;", "Ljava/text/NumberFormat;", "Ll/y20;", "Landroid/view/View;", "cardRoot", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "discountLabel", "llContent", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "starIcon", "hotLabel", "quantityText", "unitText", "priceText", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class u6h0 extends RecyclerView.AbstractC0569e0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<C8928d> sections;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final NumberFormat priceFormatter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final y20<Integer> onItemClick;

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
    public final TextView quantityText;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final TextView unitText;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final TextView priceText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u6h0(@NotNull View view, @NotNull Act act, @NotNull List<? extends C8928d> list, @NotNull NumberFormat numberFormat, @Nullable y20<Integer> y20Var) {
        super(view);
        view.getClass();
        act.getClass();
        list.getClass();
        numberFormat.getClass();
        this.act = act;
        this.sections = list;
        this.priceFormatter = numberFormat;
        this.onItemClick = y20Var;
        View viewFindViewById = view.findViewById(fdc0.f98359M0);
        viewFindViewById.getClass();
        this.cardRoot = viewFindViewById;
        View viewFindViewById2 = view.findViewById(fdc0.f98350I);
        viewFindViewById2.getClass();
        this.discountLabel = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(fdc0.f98432p0);
        viewFindViewById3.getClass();
        this.llContent = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(fdc0.f98363O0);
        viewFindViewById4.getClass();
        this.starIcon = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(fdc0.f98382Y);
        viewFindViewById5.getClass();
        this.hotLabel = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(fdc0.f98339C0);
        viewFindViewById6.getClass();
        this.quantityText = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(fdc0.f98415j1);
        viewFindViewById7.getClass();
        this.unitText = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(fdc0.f98445v0);
        viewFindViewById8.getClass();
        this.priceText = (TextView) viewFindViewById8;
    }

    /* JADX INFO: renamed from: a */
    public static void m194696a(u6h0 u6h0Var, View view) {
        y20<Integer> y20Var;
        int adapterPosition = u6h0Var.getAdapterPosition();
        if (adapterPosition == -1 || (y20Var = u6h0Var.onItemClick) == null) {
            return;
        }
        y20Var.call(Integer.valueOf(adapterPosition));
    }

    /* JADX INFO: renamed from: e */
    private final Double m194697e() {
        Object next;
        C8928d.a aVarM54705d;
        Merchandise merchandiseM54784s;
        Iterator<T> it = this.sections.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Merchandise merchandiseM54784s2 = ((C8928d) next).m54705d().m54784s();
            if (merchandiseM54784s2 != null && merchandiseM54784s2.quantity == 3) {
                break;
            }
        }
        C8928d c8928d = (C8928d) next;
        if (c8928d != null && (aVarM54705d = c8928d.m54705d()) != null && (merchandiseM54784s = aVarM54705d.m54784s()) != null) {
            if (!NullChecker.m82486a(merchandiseM54784s)) {
                merchandiseM54784s = null;
            }
            if (merchandiseM54784s != null) {
                int i = merchandiseM54784s.quantity;
                double d = merchandiseM54784s.defaultStockKeepUnit.prices.price;
                if (i > 0) {
                    return Double.valueOf(d / ((double) i));
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private final void m194698f(int quantity, Integer hotQuantity) {
        bnl0.m105524M(this.hotLabel, hotQuantity != null && quantity == hotQuantity.intValue());
    }

    /* JADX INFO: renamed from: l */
    private final void m194699l(boolean hasDiscount) {
        ViewGroup.LayoutParams layoutParams = this.llContent.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = (int) ((hasDiscount ? 56 : 46) * this.act.getResources().getDisplayMetrics().density);
            this.llContent.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m194700b(@NotNull Merchandise merchandise, boolean isSelected, @Nullable Integer hotQuantity) {
        merchandise.getClass();
        trf0 trf0VarM194702d = m194702d(merchandise);
        m194703g(trf0VarM194702d);
        m194698f(trf0VarM194702d.getCom.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String(), hotQuantity);
        m194705i(isSelected, trf0VarM194702d);
    }

    /* JADX INFO: renamed from: c */
    public final int m194701c(trf0 skuInfo) {
        Double dM194697e = m194697e();
        if (dM194697e == null) {
            return 0;
        }
        double dDoubleValue = dM194697e.doubleValue();
        if (dDoubleValue <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return 0;
        }
        return (int) Math.ceil((1.0d - (skuInfo.getTotalPrice() / (dDoubleValue * ((double) skuInfo.getCom.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String())))) * 100.0d);
    }

    /* JADX INFO: renamed from: d */
    public final trf0 m194702d(Merchandise merchandise) {
        Prices prices = merchandise.defaultStockKeepUnit.prices;
        prices.getClass();
        int i = merchandise.quantity;
        double d = prices.price;
        double d2 = i > 0 ? d / ((double) i) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        String str = prices.currencySymbol;
        str.getClass();
        return new trf0(i, d, d2, str);
    }

    /* JADX INFO: renamed from: g */
    public final void m194703g(trf0 skuInfo) {
        this.starIcon.setImageResource(IntlCountryCodeController.m29125v() ? jbc0.f119751s2 : jbc0.f119737r2);
        this.quantityText.setTypeface(lyh0.m156283c(3), 1);
        this.unitText.setTypeface(lyh0.m156283c(2), 1);
        this.priceText.setTypeface(lyh0.m156283c(3), 1);
        this.quantityText.setText(String.valueOf(skuInfo.getCom.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String()));
        this.unitText.setText(IntlCountryCodeController.m29125v() ? R$string.f28524z8 : R$string.f28069L9);
        String str = this.priceFormatter.format(skuInfo.getUnitPrice());
        this.priceText.setText(this.act.getString(R$string.f28463u2, skuInfo.getCurrencySymbol() + str));
    }

    /* JADX INFO: renamed from: h */
    public final void m194704h(trf0 skuInfo, int discountPercent) {
        i4g0.m138492A("e_intl_superlike_iap_sku_click", "p_intl_super_like_iap_view", jyb.m147494Y("skuID", this.sections.get(getAdapterPosition()).m54704c().defaultStockKeepUnit.affiliateProducts.getProductId()));
        this.cardRoot.setBackgroundResource(jbc0.f119723q2);
        TextView textView = this.discountLabel;
        if (discountPercent <= 0) {
            bnl0.m105524M(textView, false);
            m194699l(false);
            return;
        }
        textView.setBackgroundResource(jbc0.f119681n2);
        this.discountLabel.setTypeface(lyh0.m156283c(3), 1);
        this.discountLabel.setText(this.act.getString(R$string.f28258c9, String.valueOf(discountPercent)));
        this.discountLabel.setTextColor(this.act.getResources().getColor(R.color.white));
        bnl0.m105524M(this.discountLabel, true);
        m194699l(true);
    }

    /* JADX INFO: renamed from: i */
    public final void m194705i(boolean isSelected, trf0 skuInfo) {
        int iM194701c = m194701c(skuInfo);
        if (isSelected) {
            m194704h(skuInfo, iM194701c);
        } else {
            m194706j(skuInfo, iM194701c);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m194706j(trf0 skuInfo, int discountPercent) {
        this.cardRoot.setBackgroundResource(jbc0.f119709p2);
        TextView textView = this.discountLabel;
        if (discountPercent <= 0) {
            bnl0.m105524M(textView, false);
            m194699l(false);
            return;
        }
        textView.setBackgroundResource(jbc0.f119695o2);
        this.discountLabel.setTypeface(lyh0.m156283c(3), 1);
        this.discountLabel.setText(this.act.getString(R$string.f28258c9, String.valueOf(discountPercent)));
        this.discountLabel.setTextColor(this.act.getResources().getColor(R.color.white));
        bnl0.m105524M(this.discountLabel, true);
        m194699l(true);
    }

    /* JADX INFO: renamed from: k */
    public final void m194707k() {
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.t6h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u6h0.m194696a(this.f172344a, view);
            }
        });
    }
}
