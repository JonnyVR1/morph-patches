package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Prices;
import com.p1.mobile.putong.core.pay.R;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b$\u0010%J\u0011\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0016¢\u0006\u0004\b)\u0010*J1\u0010-\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010\f2\b\u0010,\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b-\u0010.J+\u00100\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010\f2\b\u0010,\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00105R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00106R\u0014\u00108\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010:R\u0014\u0010<\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00107R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010>R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010>R\u0014\u0010A\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010>R\u0014\u0010B\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010:R\u0014\u0010C\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010:R\u0014\u0010E\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010:¨\u0006F"}, d2 = {"Ll/gr5;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "Lcom/p1/mobile/android/app/Act;", "act", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Ljava/text/NumberFormat;", "priceFormatter", "Ll/e30;", "", "onItemClick", "<init>", "(Landroid/view/View;Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/text/NumberFormat;Ll/e30;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "Ll/ljf0;", "d", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ll/ljf0;", "skuInfo", "", "g", "(Ll/ljf0;)V", "", "isSelected", "i", "(ZLl/ljf0;)V", "discountPercent", "h", "(Ll/ljf0;I)V", "j", "hasDiscount", "l", "(Z)V", "c", "(Ll/ljf0;)I", "", "e", "()Ljava/lang/Double;", "k", "()V", "hotQuantity", "bestQuantity", "b", "(Lcom/p1/mobile/putong/core/data/Merchandise;ZLjava/lang/Integer;Ljava/lang/Integer;)V", "quantity", "f", "(ILjava/lang/Integer;Ljava/lang/Integer;)V", "a", "Lcom/p1/mobile/android/app/Act;", "Ljava/util/List;", "Ljava/text/NumberFormat;", "Ll/e30;", "Landroid/view/View;", "cardRoot", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "discountLabel", "llContent", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "starIcon", "hotLabel", "bestLabel", "quantityText", "unitText", "m", "priceText", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class gr5 extends RecyclerView.d0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<C0190d> sections;

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
    public gr5(@NotNull View view, @NotNull Act act, @NotNull List<? extends C0190d> list, @NotNull NumberFormat numberFormat, @Nullable e30<Integer> e30Var) {
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
        View viewFindViewById6 = view.findViewById(z4c0.k);
        viewFindViewById6.getClass();
        this.bestLabel = (ImageView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(z4c0.C0);
        viewFindViewById7.getClass();
        this.quantityText = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(z4c0.j1);
        viewFindViewById8.getClass();
        this.unitText = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(z4c0.v0);
        viewFindViewById9.getClass();
        this.priceText = (TextView) viewFindViewById9;
    }

    /* JADX INFO: renamed from: a */
    public static void m14022a(gr5 gr5Var, View view) {
        e30<Integer> e30Var;
        int adapterPosition = gr5Var.getAdapterPosition();
        if (adapterPosition == -1 || (e30Var = gr5Var.onItemClick) == null) {
            return;
        }
        e30Var.call(Integer.valueOf(adapterPosition));
    }

    /* JADX INFO: renamed from: c */
    private final int m14023c(ljf0 skuInfo) {
        Double dM14025e = m14025e();
        if (dM14025e == null) {
            return 0;
        }
        double dDoubleValue = dM14025e.doubleValue();
        if (dDoubleValue <= 0.0d) {
            return 0;
        }
        return (int) Math.ceil((1.0d - (skuInfo.getTotalPrice() / (dDoubleValue * ((double) skuInfo.getQuantity())))) * 100.0d);
    }

    /* JADX INFO: renamed from: d */
    private final ljf0 m14024d(Merchandise merchandise) {
        Prices prices = merchandise.defaultStockKeepUnit.prices;
        prices.getClass();
        int i = merchandise.quantity;
        double d = prices.price;
        double d2 = i > 0 ? d / ((double) i) : 0.0d;
        String str = prices.currencySymbol;
        str.getClass();
        return new ljf0(i, d, d2, str);
    }

    /* JADX INFO: renamed from: e */
    private final Double m14025e() {
        Object next;
        Merchandise merchandiseM4167s;
        Merchandise merchandiseM4167s2;
        Iterator<T> it = this.sections.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C0190d c0190d = (C0190d) next;
            C0190d.a aVarM4088d = c0190d.m4088d();
            if (aVarM4088d == null || (merchandiseM4167s2 = aVarM4088d.m4167s()) == null) {
                C0190d.a aVarM4086b = c0190d.m4086b();
                merchandiseM4167s2 = aVarM4086b != null ? aVarM4086b.m4167s() : null;
            }
            if (merchandiseM4167s2 != null && merchandiseM4167s2.quantity == 3) {
                break;
            }
        }
        C0190d c0190d2 = (C0190d) next;
        if (c0190d2 != null) {
            C0190d.a aVarM4088d2 = c0190d2.m4088d();
            if (aVarM4088d2 == null || (merchandiseM4167s = aVarM4088d2.m4167s()) == null) {
                C0190d.a aVarM4086b2 = c0190d2.m4086b();
                merchandiseM4167s = aVarM4086b2 != null ? aVarM4086b2.m4167s() : null;
            }
            if (merchandiseM4167s != null) {
                if (!NullChecker.a(merchandiseM4167s)) {
                    merchandiseM4167s = null;
                }
                if (merchandiseM4167s != null) {
                    int i = merchandiseM4167s.quantity;
                    double d = merchandiseM4167s.defaultStockKeepUnit.prices.price;
                    if (i > 0) {
                        return Double.valueOf(d / ((double) i));
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private final void m14026g(ljf0 skuInfo) {
        this.quantityText.setTypeface(eqh0.c(3), 1);
        this.unitText.setTypeface(eqh0.c(2), 1);
        this.priceText.setTypeface(eqh0.c(3), 1);
        this.quantityText.setText(String.valueOf(skuInfo.getQuantity()));
        this.unitText.setText(R.string.r2);
        String str = this.priceFormatter.format(skuInfo.getUnitPrice());
        this.priceText.setText(this.act.getString(R.string.u2, skuInfo.getCurrencySymbol() + str));
    }

    /* JADX INFO: renamed from: h */
    private final void m14027h(ljf0 skuInfo, int discountPercent) {
        zvf0.A("e_intl_compliment_iap_sku_click", "p_intl_compliment_iap_view", new j760[]{vwb.Y("skuID", this.sections.get(getAdapterPosition()).m4087c().defaultStockKeepUnit.affiliateProducts.getProductId())});
        this.cardRoot.setBackgroundResource(d3c0.M0);
        TextView textView = this.discountLabel;
        if (discountPercent <= 0) {
            xdl0.M(textView, false);
            m14030l(false);
            return;
        }
        textView.setBackgroundResource(d3c0.J0);
        this.discountLabel.setTypeface(eqh0.c(3), 1);
        this.discountLabel.setText(this.act.getString(R.string.c9, String.valueOf(discountPercent)));
        this.discountLabel.setTextColor(this.act.getResources().getColor(android.R.color.white));
        xdl0.M(this.discountLabel, true);
        m14030l(true);
    }

    /* JADX INFO: renamed from: i */
    private final void m14028i(boolean isSelected, ljf0 skuInfo) {
        int iM14023c = m14023c(skuInfo);
        if (isSelected) {
            m14027h(skuInfo, iM14023c);
        } else {
            m14029j(skuInfo, iM14023c);
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m14029j(ljf0 skuInfo, int discountPercent) {
        this.cardRoot.setBackgroundResource(d3c0.L0);
        TextView textView = this.discountLabel;
        if (discountPercent <= 0) {
            xdl0.M(textView, false);
            m14030l(false);
            return;
        }
        textView.setBackgroundResource(d3c0.K0);
        this.discountLabel.setTypeface(eqh0.c(3), 1);
        this.discountLabel.setText(this.act.getString(R.string.c9, String.valueOf(discountPercent)));
        this.discountLabel.setTextColor(this.act.getResources().getColor(android.R.color.white));
        xdl0.M(this.discountLabel, true);
        m14030l(true);
    }

    /* JADX INFO: renamed from: l */
    private final void m14030l(boolean hasDiscount) {
        ViewGroup.LayoutParams layoutParams = this.llContent.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = (int) ((hasDiscount ? 56 : 46) * this.act.getResources().getDisplayMetrics().density);
            this.llContent.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14031b(@NotNull Merchandise merchandise, boolean isSelected, @Nullable Integer hotQuantity, @Nullable Integer bestQuantity) {
        merchandise.getClass();
        ljf0 ljf0VarM14024d = m14024d(merchandise);
        m14026g(ljf0VarM14024d);
        m14032f(ljf0VarM14024d.getQuantity(), hotQuantity, bestQuantity);
        m14028i(isSelected, ljf0VarM14024d);
    }

    /* JADX INFO: renamed from: f */
    public final void m14032f(int quantity, Integer hotQuantity, Integer bestQuantity) {
        boolean z = false;
        boolean z2 = hotQuantity != null && quantity == hotQuantity.intValue();
        if (bestQuantity != null && quantity == bestQuantity.intValue()) {
            z = true;
        }
        xdl0.M(this.hotLabel, z2);
        xdl0.M(this.bestLabel, z);
    }

    /* JADX INFO: renamed from: k */
    public final void m14033k() {
        ((RecyclerView.d0) this).itemView.setOnClickListener(new View.OnClickListener() { // from class: l.fr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gr5.m14022a(this.f10602a, view);
            }
        });
    }
}
