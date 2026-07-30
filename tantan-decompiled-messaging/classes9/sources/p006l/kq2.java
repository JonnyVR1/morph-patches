package p006l;

import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class kq2 {

    /* JADX INFO: renamed from: a */
    public Merchandise f15956a;

    /* JADX INFO: renamed from: b */
    public PurchaseType f15957b;

    /* JADX INFO: renamed from: c */
    public DecimalFormat f15958c = new DecimalFormat("#.#");

    public kq2(@NonNull Merchandise merchandise) {
        this.f15956a = merchandise;
        ProductCategory productCategory = merchandise.category;
        if (TEnum.equals(productCategory, "svip")) {
            this.f15957b = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        } else if (TEnum.equals(productCategory, "tttVip")) {
            this.f15957b = PurchaseType.TYPE_GET_VIP;
        } else if (TEnum.equals(productCategory, "oDiamond")) {
            this.f15957b = PurchaseType.TYPE_O_DIAMOND;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract CharSequence mo13528a(Act act);
}
