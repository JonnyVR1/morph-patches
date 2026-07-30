package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Prices;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d3c0;
import l.e30;
import l.eqh0;
import l.j760;
import l.vwb;
import l.xdl0;
import l.z4c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00152\u0006\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u00122\u0006\u0010&\u001a\u00020#2\u0006\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00122\u0006\u0010&\u001a\u00020#2\u0006\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010-J\u0017\u0010/\u001a\u00020\f2\u0006\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00104R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00105R\u0014\u00107\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00109R\u0014\u0010;\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00106R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010=R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010=R\u0014\u0010@\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00109R\u0014\u0010A\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00109R\u0014\u0010B\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00109¨\u0006C"}, d2 = {"Ll/myg0;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "Lcom/p1/mobile/android/app/Act;", "act", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Ljava/text/NumberFormat;", "priceFormatter", "Ll/e30;", "", "onItemClick", "<init>", "(Landroid/view/View;Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/text/NumberFormat;Ll/e30;)V", "quantity", "hotQuantity", "", "f", "(ILjava/lang/Integer;)V", "", "hasDiscount", "l", "(Z)V", "", "e", "()Ljava/lang/Double;", "k", "()V", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "isSelected", "b", "(Lcom/p1/mobile/putong/core/data/Merchandise;ZLjava/lang/Integer;)V", "Ll/kjf0;", "d", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ll/kjf0;", "skuInfo", "g", "(Ll/kjf0;)V", "i", "(ZLl/kjf0;)V", "discountPercent", "h", "(Ll/kjf0;I)V", "j", "c", "(Ll/kjf0;)I", "a", "Lcom/p1/mobile/android/app/Act;", "Ljava/util/List;", "Ljava/text/NumberFormat;", "Ll/e30;", "Landroid/view/View;", "cardRoot", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "discountLabel", "llContent", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "starIcon", "hotLabel", "quantityText", "unitText", "priceText", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class myg0 extends RecyclerView.d0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<d> sections;

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
    public final TextView quantityText;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final TextView unitText;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final TextView priceText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myg0(@NotNull View view, @NotNull Act act, @NotNull List<? extends d> list, @NotNull NumberFormat numberFormat, @Nullable e30<Integer> e30Var) {
        super(view);
        view.getClass();
        act.getClass();
        list.getClass();
        numberFormat.getClass();
        this.act = act;
        this.sections = list;
        this.priceFormatter = numberFormat;
        this.onItemClick = e30Var;
        View viewFindViewById = view.findViewById(z4c0.M0);
        viewFindViewById.getClass();
        this.cardRoot = viewFindViewById;
        View viewFindViewById2 = view.findViewById(z4c0.I);
        viewFindViewById2.getClass();
        this.discountLabel = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(z4c0.p0);
        viewFindViewById3.getClass();
        this.llContent = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(z4c0.O0);
        viewFindViewById4.getClass();
        this.starIcon = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(z4c0.Y);
        viewFindViewById5.getClass();
        this.hotLabel = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(z4c0.C0);
        viewFindViewById6.getClass();
        this.quantityText = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(z4c0.j1);
        viewFindViewById7.getClass();
        this.unitText = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(z4c0.v0);
        viewFindViewById8.getClass();
        this.priceText = (TextView) viewFindViewById8;
    }

    /* JADX INFO: renamed from: a */
    public static void m19592a(myg0 myg0Var, View view) {
        e30<Integer> e30Var;
        int adapterPosition = myg0Var.getAdapterPosition();
        if (adapterPosition == -1 || (e30Var = myg0Var.onItemClick) == null) {
            return;
        }
        e30Var.call(Integer.valueOf(adapterPosition));
    }

    /* JADX INFO: renamed from: e */
    private final Double m19593e() {
        Object next;
        d.a aVarD;
        Merchandise merchandiseS;
        Iterator<T> it = this.sections.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Merchandise merchandiseS2 = ((d) next).d().s();
            if (merchandiseS2 != null && merchandiseS2.quantity == 3) {
                break;
            }
        }
        d dVar = (d) next;
        if (dVar != null && (aVarD = dVar.d()) != null && (merchandiseS = aVarD.s()) != null) {
            if (!NullChecker.a(merchandiseS)) {
                merchandiseS = null;
            }
            if (merchandiseS != null) {
                int i = merchandiseS.quantity;
                double d = merchandiseS.defaultStockKeepUnit.prices.price;
                if (i > 0) {
                    return Double.valueOf(d / ((double) i));
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private final void m19594f(int quantity, Integer hotQuantity) {
        xdl0.M(this.hotLabel, hotQuantity != null && quantity == hotQuantity.intValue());
    }

    /* JADX INFO: renamed from: l */
    private final void m19595l(boolean hasDiscount) {
        ViewGroup.LayoutParams layoutParams = this.llContent.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = (int) ((hasDiscount ? 56 : 46) * this.act.getResources().getDisplayMetrics().density);
            this.llContent.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m19596b(@NotNull Merchandise merchandise, boolean isSelected, @Nullable Integer hotQuantity) {
        merchandise.getClass();
        kjf0 kjf0VarM19598d = m19598d(merchandise);
        m19599g(kjf0VarM19598d);
        m19594f(kjf0VarM19598d.getQuantity(), hotQuantity);
        m19601i(isSelected, kjf0VarM19598d);
    }

    /* JADX INFO: renamed from: c */
    public final int m19597c(kjf0 skuInfo) {
        Double dM19593e = m19593e();
        if (dM19593e == null) {
            return 0;
        }
        double dDoubleValue = dM19593e.doubleValue();
        if (dDoubleValue <= 0.0d) {
            return 0;
        }
        return (int) Math.ceil((1.0d - (skuInfo.getTotalPrice() / (dDoubleValue * ((double) skuInfo.getQuantity())))) * 100.0d);
    }

    /* JADX INFO: renamed from: d */
    public final kjf0 m19598d(Merchandise merchandise) {
        Prices prices = merchandise.defaultStockKeepUnit.prices;
        prices.getClass();
        int i = merchandise.quantity;
        double d = prices.price;
        double d2 = i > 0 ? d / ((double) i) : 0.0d;
        String str = prices.currencySymbol;
        str.getClass();
        return new kjf0(i, d, d2, str);
    }

    /* JADX INFO: renamed from: g */
    public final void m19599g(kjf0 skuInfo) {
        this.starIcon.setImageResource(IntlCountryCodeController.m21v() ? d3c0.s2 : d3c0.r2);
        this.quantityText.setTypeface(eqh0.c(3), 1);
        this.unitText.setTypeface(eqh0.c(2), 1);
        this.priceText.setTypeface(eqh0.c(3), 1);
        this.quantityText.setText(String.valueOf(skuInfo.getQuantity()));
        this.unitText.setText(IntlCountryCodeController.m21v() ? R.string.z8 : R.string.L9);
        String str = this.priceFormatter.format(skuInfo.getUnitPrice());
        this.priceText.setText(this.act.getString(R.string.u2, skuInfo.getCurrencySymbol() + str));
    }

    /* JADX INFO: renamed from: h */
    public final void m19600h(kjf0 skuInfo, int discountPercent) {
        zvf0.A("e_intl_superlike_iap_sku_click", "p_intl_super_like_iap_view", new j760[]{vwb.Y("skuID", this.sections.get(getAdapterPosition()).c().defaultStockKeepUnit.affiliateProducts.getProductId())});
        this.cardRoot.setBackgroundResource(d3c0.q2);
        TextView textView = this.discountLabel;
        if (discountPercent <= 0) {
            xdl0.M(textView, false);
            m19595l(false);
            return;
        }
        textView.setBackgroundResource(d3c0.n2);
        this.discountLabel.setTypeface(eqh0.c(3), 1);
        this.discountLabel.setText(this.act.getString(R.string.c9, String.valueOf(discountPercent)));
        this.discountLabel.setTextColor(this.act.getResources().getColor(android.R.color.white));
        xdl0.M(this.discountLabel, true);
        m19595l(true);
    }

    /* JADX INFO: renamed from: i */
    public final void m19601i(boolean isSelected, kjf0 skuInfo) {
        int iM19597c = m19597c(skuInfo);
        if (isSelected) {
            m19600h(skuInfo, iM19597c);
        } else {
            m19602j(skuInfo, iM19597c);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m19602j(kjf0 skuInfo, int discountPercent) {
        this.cardRoot.setBackgroundResource(d3c0.p2);
        TextView textView = this.discountLabel;
        if (discountPercent <= 0) {
            xdl0.M(textView, false);
            m19595l(false);
            return;
        }
        textView.setBackgroundResource(d3c0.o2);
        this.discountLabel.setTypeface(eqh0.c(3), 1);
        this.discountLabel.setText(this.act.getString(R.string.c9, String.valueOf(discountPercent)));
        this.discountLabel.setTextColor(this.act.getResources().getColor(android.R.color.white));
        xdl0.M(this.discountLabel, true);
        m19595l(true);
    }

    /* JADX INFO: renamed from: k */
    public final void m19603k() {
        ((RecyclerView.d0) this).itemView.setOnClickListener(new View.OnClickListener() { // from class: l.lyg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                myg0.m19592a(this.f16714a, view);
            }
        });
    }
}
