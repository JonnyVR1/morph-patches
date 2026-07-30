package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes9.dex */
public abstract class br2 {

    /* JADX INFO: renamed from: a */
    public Merchandise f77972a;

    /* JADX INFO: renamed from: b */
    public PurchaseType f77973b;

    /* JADX INFO: renamed from: c */
    public DecimalFormat f77974c = new DecimalFormat("#.#");

    public br2(@NonNull Merchandise merchandise) {
        this.f77972a = merchandise;
        ProductCategory productCategory = merchandise.category;
        if (TEnum.equals(productCategory, "svip")) {
            this.f77973b = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        } else if (TEnum.equals(productCategory, ProductCategory.tttVip)) {
            this.f77973b = PurchaseType.TYPE_GET_VIP;
        } else if (TEnum.equals(productCategory, "oDiamond")) {
            this.f77973b = PurchaseType.TYPE_O_DIAMOND;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract CharSequence mo106026a(Act act);
}
