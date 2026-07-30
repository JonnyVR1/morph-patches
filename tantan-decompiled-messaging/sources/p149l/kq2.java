package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes9.dex */
public abstract class kq2 {

    /* JADX INFO: renamed from: a */
    public Merchandise f124217a;

    /* JADX INFO: renamed from: b */
    public PurchaseType f124218b;

    /* JADX INFO: renamed from: c */
    public DecimalFormat f124219c = new DecimalFormat("#.#");

    public kq2(@NonNull Merchandise merchandise) {
        this.f124217a = merchandise;
        ProductCategory productCategory = merchandise.category;
        if (TEnum.equals(productCategory, "svip")) {
            this.f124218b = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        } else if (TEnum.equals(productCategory, ProductCategory.tttVip)) {
            this.f124218b = PurchaseType.TYPE_GET_VIP;
        } else if (TEnum.equals(productCategory, "oDiamond")) {
            this.f124218b = PurchaseType.TYPE_O_DIAMOND;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract CharSequence mo107604a(Act act);
}
