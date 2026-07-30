package p149l;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;

/* JADX INFO: loaded from: classes9.dex */
public class a8c extends AbstractC20353u4 {

    /* JADX INFO: renamed from: l.a8c$a */
    public static /* synthetic */ class C15543a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f68011a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f68011a = iArr;
            try {
                iArr[PurchaseType.TYPE_O_PLATINUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68011a[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final CharSequence m95339A(String str, String str2, String str3) {
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

    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: j */
    public void mo94418j(gi60 gi60Var) {
        hi60 hi60VarM126260e = gi60Var.m126260e();
        int i = C15543a.f68011a[gi60Var.m126261f().ordinal()];
        if (i == 1 || i == 2) {
            hi60VarM126260e.m131224m("限时特惠", true);
        } else if (TextUtils.equals("purchasePage", gi60Var.m126257b())) {
            hi60VarM126260e.m131224m(String.format("%s元/天", m191647e()), true);
        } else {
            hi60VarM126260e.m131224m(m95339A(String.format(gi60Var.m126256a().getString(R$string.f27179I0), "symbolD_Price"), m191647e(), m191657q().defaultStockKeepUnit.prices.currencySymbol), true);
        }
    }

    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: w */
    public boolean mo94420w(gi60 gi60Var) {
        return !sab0.m182891i(gi60Var.m126261f());
    }
}
