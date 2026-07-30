package p149l;

import android.content.Context;
import android.content.res.Resources;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/kiy;", "Ll/pwl;", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "detail", "", "b", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class kiy implements pwl<C8765d.a> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:59:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fd  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p149l.pwl
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo116746a(@NotNull Context context, @NotNull PurchaseType type, @NotNull C8765d.a detail) {
        String string;
        context.getClass();
        type.getClass();
        detail.getClass();
        Resources resources = context.getResources();
        Merchandise merchandiseM53601s = detail.m53601s();
        ProductCategory productCategory = merchandiseM53601s.category;
        productCategory.getClass();
        int i = merchandiseM53601s.quantity;
        String string2 = productCategory.toString();
        switch (string2.hashCode()) {
            case -2067215576:
                if (!string2.equals("superLikeMembership")) {
                    string = "";
                } else if ((!TEnum.equals(productCategory, ProductCategory.tttVip) || TEnum.equals(productCategory, "svip") || TEnum.equals(productCategory, "femaleVip") || TEnum.equals(productCategory, "youthVip")) && merchandiseM53601s.weekly()) {
                    string = "周";
                } else {
                    string = resources.getString(i == 1 ? R$string.f27611t9 : R$string.f27622u9);
                    string.getClass();
                }
                break;
            case -1403004683:
                if (!string2.equals(ProductCategory.noneLiveCoin)) {
                    string = "";
                } else {
                    string = resources.getString(R$string.f27307T7);
                    string.getClass();
                }
                break;
            case -1338150991:
                if (!string2.equals(ProductCategory.tttLiveCoin)) {
                    string = "";
                } else {
                    string = resources.getString(R$string.f27307T7);
                    string.getClass();
                }
                break;
            case -993539419:
                if (!string2.equals(ProductCategory.tttCoin)) {
                    string = "";
                } else {
                    string = resources.getString(R$string.f27307T7);
                    string.getClass();
                }
                break;
            case -863315575:
                if (!string2.equals(ProductCategory.tttVip)) {
                    string = "";
                } else if (!TEnum.equals(productCategory, ProductCategory.tttVip)) {
                    string = "周";
                } else {
                    string = "周";
                }
                break;
            case -796840475:
                if (!string2.equals("oDiamond")) {
                    string = "";
                } else if (!TEnum.equals(productCategory, ProductCategory.tttVip)) {
                    string = "周";
                } else {
                    string = "周";
                }
                break;
            case -679730102:
                if (!string2.equals("youthVip")) {
                    string = "";
                } else if (!TEnum.equals(productCategory, ProductCategory.tttVip)) {
                    string = "周";
                } else {
                    string = "周";
                }
                break;
            case -429915974:
                if (!string2.equals("unlimitedSwipes")) {
                    string = "";
                } else if (!TEnum.equals(productCategory, ProductCategory.tttVip)) {
                    string = "周";
                } else {
                    string = "周";
                }
                break;
            case -94011970:
                if (!string2.equals("svipPicksMembership")) {
                    string = "";
                } else if (!TEnum.equals(productCategory, ProductCategory.tttVip)) {
                    string = "周";
                } else {
                    string = "周";
                }
                break;
            case 3059345:
                if (!string2.equals("coin")) {
                    string = "";
                } else {
                    string = resources.getString(R$string.f27307T7);
                    string.getClass();
                }
                break;
            case 3542730:
                if (!string2.equals("svip")) {
                    string = "";
                } else if (!TEnum.equals(productCategory, ProductCategory.tttVip)) {
                    string = "周";
                } else {
                    string = "周";
                }
                break;
            case 165490388:
                if (!string2.equals("privateCustom")) {
                    string = "";
                } else if (!TEnum.equals(productCategory, ProductCategory.tttVip)) {
                    string = "周";
                } else {
                    string = "周";
                }
                break;
            case 175221999:
                if (!string2.equals(ProductCategory.oDiamondPrivateCustom)) {
                    string = "";
                } else if (!TEnum.equals(productCategory, ProductCategory.tttVip)) {
                    string = "周";
                } else {
                    string = "周";
                }
                break;
            case 1086939441:
                if (!string2.equals("femaleVip")) {
                    string = "";
                } else if (!TEnum.equals(productCategory, ProductCategory.tttVip)) {
                    string = "周";
                } else {
                    string = "周";
                }
                break;
            case 1166765179:
                if (!string2.equals("quickchatMembership")) {
                    string = "";
                } else if (!TEnum.equals(productCategory, ProductCategory.tttVip)) {
                    string = "周";
                } else {
                    string = "周";
                }
                break;
            case 1366973465:
                if (!string2.equals("roaming")) {
                    string = "";
                } else if (!TEnum.equals(productCategory, ProductCategory.tttVip)) {
                    string = "周";
                } else {
                    string = "周";
                }
                break;
            case 1848078298:
                if (!string2.equals("undoMembership")) {
                    string = "";
                } else if (!TEnum.equals(productCategory, ProductCategory.tttVip)) {
                    string = "周";
                } else {
                    string = "周";
                }
                break;
            case 1874772524:
                if (!string2.equals("platinum")) {
                    string = "";
                } else if (!TEnum.equals(productCategory, ProductCategory.tttVip)) {
                    string = "周";
                } else {
                    string = "周";
                }
                break;
            case 1905099240:
                if (!string2.equals("picksMembership")) {
                    string = "";
                } else if (!TEnum.equals(productCategory, ProductCategory.tttVip)) {
                    string = "周";
                } else {
                    string = "周";
                }
                break;
            default:
                string = "";
                break;
        }
        detail.m53586i0(i);
        detail.m53588j0(string);
        detail.m53558N(productCategory);
    }
}
