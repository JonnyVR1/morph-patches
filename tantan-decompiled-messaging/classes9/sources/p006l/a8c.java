package p006l;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import l.sab0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class a8c extends AbstractC1333u4 {

    /* JADX INFO: renamed from: l.a8c$a */
    public static /* synthetic */ class C0496a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8159a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f8159a = iArr;
            try {
                iArr[PurchaseType.TYPE_O_PLATINUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8159a[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final CharSequence m11796A(String str, String str2, String str3) {
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

    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: j */
    public void mo11678j(gi60 gi60Var) {
        hi60 hi60VarM15804e = gi60Var.m15804e();
        int i = C0496a.f8159a[gi60Var.m15805f().ordinal()];
        if (i == 1 || i == 2) {
            hi60VarM15804e.m16230m("限时特惠", true);
        } else if (TextUtils.equals("purchasePage", gi60Var.m15801b())) {
            hi60VarM15804e.m16230m(String.format("%s元/天", m24945e()), true);
        } else {
            hi60VarM15804e.m16230m(m11796A(String.format(gi60Var.m15800a().getString(R.string.I0), "symbolD_Price"), m24945e(), m24955q().defaultStockKeepUnit.prices.currencySymbol), true);
        }
    }

    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: w */
    public boolean mo11680w(gi60 gi60Var) {
        return !sab0.i(gi60Var.m15805f());
    }
}
