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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010'J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0015H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b,\u0010-J\u0011\u0010/\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00104R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00105R\u0014\u00107\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00109R\u0014\u0010;\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00106R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010=R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010=R\u0014\u0010@\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00109R\u0014\u0010A\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00109R\u0014\u0010B\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00109¨\u0006C"}, m88121d2 = {"Ll/ea3;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroid/view/View;", "itemView", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Ljava/text/NumberFormat;", "priceFormatter", "Ll/y20;", "", "onItemClick", "<init>", "(Landroid/view/View;Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/text/NumberFormat;Ll/y20;)V", "", "k", "()V", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "", "isSelected", "hotQuantity", "b", "(Lcom/p1/mobile/putong/core/data/Merchandise;ZLjava/lang/Integer;)V", "Ll/urf0;", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ll/urf0;", "skuInfo", "g", "(Ll/urf0;)V", FirebaseAnalytics.Param.QUANTITY, "f", "(ILjava/lang/Integer;)V", RXScreenCaptureService.KEY_INDEX, "(ZLl/urf0;)V", "discountPercent", "h", "(Ll/urf0;I)V", "j", "hasDiscount", BLiveStormDanmakuGiftResourceType.f45292l, "(Z)V", "c", "(Ll/urf0;)I", "", "e", "()Ljava/lang/Double;", "a", "Lcom/p1/mobile/android/app/Act;", "Ljava/util/List;", "Ljava/text/NumberFormat;", "Ll/y20;", "Landroid/view/View;", "cardRoot", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "discountLabel", "llContent", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "starIcon", "hotLabel", "quantityText", "unitText", "priceText", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ea3 extends RecyclerView.AbstractC0569e0 {

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
    public ea3(@NotNull View view, @NotNull Act act, @NotNull List<? extends C8928d> list, @NotNull NumberFormat numberFormat, @Nullable y20<Integer> y20Var) {
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
    public static void m119995a(ea3 ea3Var, View view) {
        y20<Integer> y20Var;
        int adapterPosition = ea3Var.getAdapterPosition();
        if (adapterPosition == -1 || (y20Var = ea3Var.onItemClick) == null) {
            return;
        }
        y20Var.call(Integer.valueOf(adapterPosition));
    }

    /* JADX INFO: renamed from: b */
    public final void m119996b(@NotNull Merchandise merchandise, boolean isSelected, @Nullable Integer hotQuantity) {
        merchandise.getClass();
        urf0 urf0VarM119998d = m119998d(merchandise);
        m120001g(urf0VarM119998d);
        m120000f(urf0VarM119998d.getCom.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String(), hotQuantity);
        m120003i(isSelected, urf0VarM119998d);
    }

    /* JADX INFO: renamed from: c */
    public final int m119997c(urf0 skuInfo) {
        Double dM119999e = m119999e();
        if (dM119999e == null) {
            return 0;
        }
        double dDoubleValue = dM119999e.doubleValue();
        if (dDoubleValue <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return 0;
        }
        return (int) Math.ceil((1.0d - (skuInfo.getTotalPrice() / (dDoubleValue * ((double) skuInfo.getCom.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String())))) * 100.0d);
    }

    /* JADX INFO: renamed from: d */
    public final urf0 m119998d(Merchandise merchandise) {
        Prices prices = merchandise.defaultStockKeepUnit.prices;
        prices.getClass();
        int i = merchandise.quantity;
        double d = prices.price;
        double d2 = i > 0 ? d / ((double) i) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        String str = prices.currencySymbol;
        str.getClass();
        return new urf0(i, d, d2, str);
    }

    /* JADX INFO: renamed from: e */
    public final Double m119999e() {
        Object next;
        Merchandise merchandiseM54784s;
        Merchandise merchandiseM54784s2;
        Iterator<T> it = this.sections.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C8928d c8928d = (C8928d) next;
            C8928d.a aVarM54705d = c8928d.m54705d();
            if (aVarM54705d == null || (merchandiseM54784s2 = aVarM54705d.m54784s()) == null) {
                C8928d.a aVarM54703b = c8928d.m54703b();
                merchandiseM54784s2 = aVarM54703b != null ? aVarM54703b.m54784s() : null;
            }
            if (merchandiseM54784s2 != null && merchandiseM54784s2.quantity == 1) {
                break;
            }
        }
        C8928d c8928d2 = (C8928d) next;
        if (c8928d2 != null) {
            C8928d.a aVarM54705d2 = c8928d2.m54705d();
            if (aVarM54705d2 == null || (merchandiseM54784s = aVarM54705d2.m54784s()) == null) {
                C8928d.a aVarM54703b2 = c8928d2.m54703b();
                merchandiseM54784s = aVarM54703b2 != null ? aVarM54703b2.m54784s() : null;
            }
            if (merchandiseM54784s != null) {
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
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m120000f(int quantity, Integer hotQuantity) {
        bnl0.m105524M(this.hotLabel, hotQuantity != null && quantity == hotQuantity.intValue());
    }

    /* JADX INFO: renamed from: g */
    public final void m120001g(urf0 skuInfo) {
        this.quantityText.setTypeface(lyh0.m156283c(3), 1);
        this.unitText.setTypeface(lyh0.m156283c(2), 1);
        this.priceText.setTypeface(lyh0.m156283c(3), 1);
        this.quantityText.setText(String.valueOf(skuInfo.getCom.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY java.lang.String()));
        this.unitText.setText(IntlCountryCodeController.m29125v() ? R$string.f27965C4 : R$string.f28392o);
        String str = this.priceFormatter.format(skuInfo.getUnitPrice());
        this.priceText.setText(this.act.getString(R$string.f28463u2, skuInfo.getCurrencySymbol() + str));
    }

    /* JADX INFO: renamed from: h */
    public final void m120002h(urf0 skuInfo, int discountPercent) {
        i4g0.m138492A("e_intl_boost_iap_sku_click", "p_intl_boost_iap_view", jyb.m147494Y("skuID", this.sections.get(getAdapterPosition()).m54704c().defaultStockKeepUnit.affiliateProducts.getProductId()));
        this.cardRoot.setBackgroundResource(jbc0.f119185D0);
        TextView textView = this.discountLabel;
        if (discountPercent <= 0) {
            bnl0.m105524M(textView, false);
            m120006l(false);
            return;
        }
        textView.setBackgroundResource(jbc0.f119143A0);
        this.discountLabel.setTypeface(lyh0.m156283c(3), 1);
        this.discountLabel.setText(this.act.getString(R$string.f28258c9, String.valueOf(discountPercent)));
        this.discountLabel.setTextColor(this.act.getResources().getColor(R.color.white));
        bnl0.m105524M(this.discountLabel, true);
        m120006l(true);
    }

    /* JADX INFO: renamed from: i */
    public final void m120003i(boolean isSelected, urf0 skuInfo) {
        int iM119997c = m119997c(skuInfo);
        if (isSelected) {
            m120002h(skuInfo, iM119997c);
        } else {
            m120004j(skuInfo, iM119997c);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m120004j(urf0 skuInfo, int discountPercent) {
        this.cardRoot.setBackgroundResource(jbc0.f119171C0);
        TextView textView = this.discountLabel;
        if (discountPercent <= 0) {
            bnl0.m105524M(textView, false);
            m120006l(false);
            return;
        }
        textView.setBackgroundResource(jbc0.f119157B0);
        this.discountLabel.setTypeface(lyh0.m156283c(3), 1);
        this.discountLabel.setText(this.act.getString(R$string.f28258c9, String.valueOf(discountPercent)));
        this.discountLabel.setTextColor(this.act.getResources().getColor(R.color.white));
        bnl0.m105524M(this.discountLabel, true);
        m120006l(true);
    }

    /* JADX INFO: renamed from: k */
    public final void m120005k() {
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.da3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ea3.m119995a(this.f85834a, view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m120006l(boolean hasDiscount) {
        ViewGroup.LayoutParams layoutParams = this.llContent.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = (int) ((hasDiscount ? 56 : 46) * this.act.getResources().getDisplayMetrics().density);
            this.llContent.setLayoutParams(marginLayoutParams);
        }
    }
}
