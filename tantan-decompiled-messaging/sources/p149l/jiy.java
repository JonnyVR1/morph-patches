package p149l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m87232d2 = {"Ll/jiy;", "Ll/pwl;", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "detail", "", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "", "percentage", "", "c", "(Landroid/content/Context;I)Ljava/lang/String;", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "b", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/Merchandise;)Ljava/lang/String;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class jiy implements pwl<C8765d.a> {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r2.equals(com.p046p1.mobile.putong.core.data.ProductCategory.tttSeeWhoLikedMe) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r2.equals(com.p046p1.mobile.putong.core.data.ProductCategory.tttVip) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r4.autoRenewable() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r4.quarterly() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        return r3.getResources().getString(com.p046p1.mobile.putong.core.pay.R$string.f27506k9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r4.yearly() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        return r3.getResources().getString(com.p046p1.mobile.putong.core.pay.R$string.f27494j9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m141717b(android.content.Context r3, com.p046p1.mobile.putong.core.data.Merchandise r4) {
        /*
            r2 = this;
            com.p1.mobile.putong.core.data.ProductCategory r2 = r4.category
            java.lang.String r2 = r2.toString()
            int r0 = r2.hashCode()
            r1 = -863315575(0xffffffffcc8ad989, float:-7.2797256E7)
            if (r0 == r1) goto L2c
            r1 = 106660978(0x65b8472, float:4.1286628E-35)
            if (r0 == r1) goto L23
            r1 = 449746854(0x1ace97a6, float:8.5444604E-23)
            if (r0 == r1) goto L1a
            goto L34
        L1a:
            java.lang.String r0 = "tttSeeWhoLikedMe"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L56
            goto L34
        L23:
            java.lang.String r0 = "picks"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L7e
            goto L34
        L2c:
            java.lang.String r0 = "tttVip"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L56
        L34:
            boolean r2 = r4.yearly()
            if (r2 == 0) goto L45
            android.content.res.Resources r2 = r3.getResources()
            int r3 = com.p046p1.mobile.putong.core.pay.R$string.f27494j9
            java.lang.String r2 = r2.getString(r3)
            return r2
        L45:
            boolean r2 = r4.quarterly()
            if (r2 == 0) goto L7e
            android.content.res.Resources r2 = r3.getResources()
            int r3 = com.p046p1.mobile.putong.core.pay.R$string.f27506k9
            java.lang.String r2 = r2.getString(r3)
            return r2
        L56:
            boolean r2 = r4.autoRenewable()
            if (r2 == 0) goto L7e
            boolean r2 = r4.quarterly()
            if (r2 == 0) goto L6d
            android.content.res.Resources r2 = r3.getResources()
            int r3 = com.p046p1.mobile.putong.core.pay.R$string.f27506k9
            java.lang.String r2 = r2.getString(r3)
            return r2
        L6d:
            boolean r2 = r4.yearly()
            if (r2 == 0) goto L7e
            android.content.res.Resources r2 = r3.getResources()
            int r3 = com.p046p1.mobile.putong.core.pay.R$string.f27494j9
            java.lang.String r2 = r2.getString(r3)
            return r2
        L7e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.jiy.m141717b(android.content.Context, com.p1.mobile.putong.core.data.Merchandise):java.lang.String");
    }

    /* JADX INFO: renamed from: c */
    public final String m141718c(Context context, int percentage) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.getDefault();
        String string = context.getResources().getString(R$string.f27168H0);
        string.getClass();
        return String.format(locale, string, Arrays.copyOf(new Object[]{percentage + "%"}, 1));
    }

    /* JADX WARN: Code duplicated, block: B:112:? A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x00de  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p149l.pwl
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo116746a(@NotNull Context context, @NotNull PurchaseType type, @NotNull C8765d.a detail) {
        String strM141718c;
        String str;
        context.getClass();
        type.getClass();
        detail.getClass();
        Merchandise merchandiseM53601s = detail.m53601s();
        ProductCategory productCategory = merchandiseM53601s.category;
        productCategory.getClass();
        boolean zM53550F = detail.m53550F();
        boolean zM53549E = detail.m53549E();
        boolean zM53551G = detail.m53551G();
        String string = productCategory.toString();
        String string2 = null;
        switch (string.hashCode()) {
            case -2067215576:
                if (!string.equals("superLikeMembership")) {
                    strM141718c = null;
                } else if (zM53550F && merchandiseM53601s.autoRenewable() && !zM53549E) {
                    strM141718c = m141718c(context, detail.m53598p());
                } else {
                    strM141718c = null;
                }
                break;
            case -863315575:
                if (!string.equals(ProductCategory.tttVip)) {
                    strM141718c = null;
                } else if (!merchandiseM53601s.autoRenewable() && !zM53549E) {
                    strM141718c = m141718c(context, detail.m53598p());
                } else {
                    strM141718c = null;
                }
                break;
            case -429915974:
                if (!string.equals("unlimitedSwipes")) {
                    strM141718c = null;
                } else if (zM53550F) {
                }
                break;
            case -94011970:
                if (!string.equals("svipPicksMembership")) {
                    strM141718c = null;
                } else if (zM53550F) {
                }
                break;
            case 3542730:
                if (!string.equals("svip")) {
                    strM141718c = null;
                } else if (zM53550F) {
                }
                break;
            case 1166765179:
                if (!string.equals("quickchatMembership")) {
                    strM141718c = null;
                } else if (!merchandiseM53601s.autoRenewable()) {
                    strM141718c = null;
                }
                break;
            case 1366973465:
                if (!string.equals("roaming")) {
                    strM141718c = null;
                } else if (zM53550F) {
                }
                break;
            case 1848078298:
                if (!string.equals("undoMembership")) {
                    strM141718c = null;
                } else if (zM53550F) {
                }
                break;
            case 1905099240:
                if (!string.equals("picksMembership")) {
                    strM141718c = null;
                } else if (zM53550F) {
                }
                break;
            default:
                strM141718c = null;
                break;
        }
        if (sab0.m182891i(type)) {
            if (!merchandiseM53601s.autoRenewable()) {
                string2 = "";
            } else if (merchandiseM53601s.yearly()) {
                string2 = "连续包年";
            } else if (merchandiseM53601s.semiAnnual()) {
                string2 = "人气之选";
            } else if (merchandiseM53601s.quarterly()) {
                string2 = "连续包季";
            } else {
                string2 = merchandiseM53601s.weekly() ? "周会员" : "连续包月";
            }
        } else if (sab0.m182887e(type) || sab0.m182885c(type)) {
            int i = merchandiseM53601s.quantity;
            if (i == 10) {
                str = "超值优惠";
            } else if (i == 5) {
                str = "热门";
            } else {
                string2 = "";
            }
            string2 = str;
        } else if (detail.m53552H() && merchandiseM53601s.autoRenewable()) {
            if (zM53551G) {
                string2 = p2b0.m167133h().m167150s(merchandiseM53601s, merchandiseM53601s.quantity);
            } else if (merchandiseM53601s.yearly()) {
                string2 = "连续包年";
            } else if (merchandiseM53601s.semiAnnual()) {
                string2 = "人气之选";
            } else if (merchandiseM53601s.quarterly()) {
                string2 = "连续包季";
            } else {
                string2 = merchandiseM53601s.weekly() ? "周会员" : "连续包月";
            }
        } else if (zM53549E) {
            if (zM53551G) {
                string2 = p2b0.m167133h().m167150s(merchandiseM53601s, merchandiseM53601s.quantity);
            }
        } else if (zM53550F && !sab0.m182905w(type)) {
            string2 = m141717b(context, merchandiseM53601s);
        } else if (merchandiseM53601s.quantity != 1) {
            string2 = strM141718c;
        } else if (zM53550F && merchandiseM53601s.autoRenewable() && merchandiseM53601s.isBelongPromotion(MonetizationPromotionsId.lowPriceFirstMonth)) {
            string2 = CoreModule.f17544b.getString(R$string.f27090A, detail.m53603u());
        }
        detail.m53578e0(string2);
    }
}
