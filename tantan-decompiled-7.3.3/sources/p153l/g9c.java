package p153l;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;

/* JADX INFO: loaded from: classes12.dex */
public class g9c extends AbstractC19971s4 {

    /* JADX INFO: renamed from: l.g9c$a */
    public static /* synthetic */ class C17181a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f102782a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f102782a = iArr;
            try {
                iArr[PurchaseType.TYPE_O_PLATINUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f102782a[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final CharSequence m129540A(String str, String str2, String str3) {
        boolean zContains = str.contains("D_Price");
        boolean zContains2 = str.contains("symbol");
        String strReplaceAll = str.replaceAll("D_Price", str2).replaceAll("symbol", str3);
        SpannableString spannableString = new SpannableString(strReplaceAll);
        if (zContains) {
            int iIndexOf = strReplaceAll.indexOf(str2);
            if (zContains2) {
                iIndexOf--;
            }
            spannableString.setSpan(new StyleSpan(0), iIndexOf, zContains2 ? iIndexOf + 1 + str2.length() : iIndexOf + str2.length(), 18);
        }
        return spannableString;
    }

    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: j */
    public void mo114833j(lq60 lq60Var) {
        mq60 mq60VarM155322e = lq60Var.m155322e();
        int i = C17181a.f102782a[lq60Var.m155323f().ordinal()];
        if (i == 1 || i == 2) {
            mq60VarM155322e.m159476m("限时特惠", true);
        } else if (TextUtils.equals("purchasePage", lq60Var.m155319b())) {
            mq60VarM155322e.m159476m(String.format("%s元/天", m184308e()), true);
        } else {
            mq60VarM155322e.m159476m(m129540A(String.format(lq60Var.m155318a().getString(R$string.f28027I0), "symbolD_Price"), m184308e(), m184318q().defaultStockKeepUnit.prices.currencySymbol), true);
        }
    }

    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: w */
    public boolean mo114835w(lq60 lq60Var) {
        return !wib0.m206565i(lq60Var.m155323f());
    }
}
