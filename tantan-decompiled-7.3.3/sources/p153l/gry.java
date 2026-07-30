package p153l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m88121d2 = {"Ll/gry;", "Ll/hzl;", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "detail", "", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "", "percentage", "", "c", "(Landroid/content/Context;I)Ljava/lang/String;", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "b", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/Merchandise;)Ljava/lang/String;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gry implements hzl<C8928d.a> {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r2.equals(com.p051p1.mobile.putong.core.data.ProductCategory.tttSeeWhoLikedMe) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r2.equals(com.p051p1.mobile.putong.core.data.ProductCategory.tttVip) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r4.autoRenewable() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r4.quarterly() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        return r3.getResources().getString(com.p051p1.mobile.putong.core.pay.R$string.f28354k9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r4.yearly() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        return r3.getResources().getString(com.p051p1.mobile.putong.core.pay.R$string.f28342j9);
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
    */
    public final String m131949b(Context context, Merchandise merchandise) {
        String string = merchandise.category.toString();
        int iHashCode = string.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != 106660978) {
                if (iHashCode == 449746854) {
                }
            } else if (string.equals("picks")) {
                return null;
            }
            if (merchandise.yearly()) {
                return context.getResources().getString(R$string.f28342j9);
            }
            if (merchandise.quarterly()) {
                return context.getResources().getString(R$string.f28354k9);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m131950c(Context context, int percentage) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.getDefault();
        String string = context.getResources().getString(R$string.f28016H0);
        string.getClass();
        return String.format(locale, string, Arrays.copyOf(new Object[]{percentage + "%"}, 1));
    }

    /* JADX WARN: Code duplicated, block: B:112:? A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x00de  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.hzl
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo106190a(@NotNull Context context, @NotNull PurchaseType type, @NotNull C8928d.a detail) {
        String strM131950c;
        String str;
        context.getClass();
        type.getClass();
        detail.getClass();
        Merchandise merchandiseM54784s = detail.m54784s();
        ProductCategory productCategory = merchandiseM54784s.category;
        productCategory.getClass();
        boolean zM54733F = detail.m54733F();
        boolean zM54732E = detail.m54732E();
        boolean zM54734G = detail.m54734G();
        String string = productCategory.toString();
        String string2 = null;
        switch (string.hashCode()) {
            case -2067215576:
                if (!string.equals("superLikeMembership")) {
                    strM131950c = null;
                } else if (zM54733F && merchandiseM54784s.autoRenewable() && !zM54732E) {
                    strM131950c = m131950c(context, detail.m54781p());
                } else {
                    strM131950c = null;
                }
                break;
            case -863315575:
                if (!string.equals(ProductCategory.tttVip)) {
                    strM131950c = null;
                } else if (!merchandiseM54784s.autoRenewable() && !zM54732E) {
                    strM131950c = m131950c(context, detail.m54781p());
                } else {
                    strM131950c = null;
                }
                break;
            case -429915974:
                if (!string.equals("unlimitedSwipes")) {
                    strM131950c = null;
                } else if (zM54733F) {
                }
                break;
            case -94011970:
                if (!string.equals("svipPicksMembership")) {
                    strM131950c = null;
                } else if (zM54733F) {
                }
                break;
            case 3542730:
                if (!string.equals("svip")) {
                    strM131950c = null;
                } else if (zM54733F) {
                }
                break;
            case 1166765179:
                if (!string.equals("quickchatMembership")) {
                    strM131950c = null;
                } else if (!merchandiseM54784s.autoRenewable()) {
                    strM131950c = null;
                }
                break;
            case 1366973465:
                if (!string.equals("roaming")) {
                    strM131950c = null;
                } else if (zM54733F) {
                }
                break;
            case 1848078298:
                if (!string.equals("undoMembership")) {
                    strM131950c = null;
                } else if (zM54733F) {
                }
                break;
            case 1905099240:
                if (!string.equals("picksMembership")) {
                    strM131950c = null;
                } else if (zM54733F) {
                }
                break;
            default:
                strM131950c = null;
                break;
        }
        if (wib0.m206565i(type)) {
            if (!merchandiseM54784s.autoRenewable()) {
                string2 = "";
            } else if (merchandiseM54784s.yearly()) {
                string2 = "连续包年";
            } else if (merchandiseM54784s.semiAnnual()) {
                string2 = "人气之选";
            } else if (merchandiseM54784s.quarterly()) {
                string2 = "连续包季";
            } else {
                string2 = merchandiseM54784s.weekly() ? "周会员" : "连续包月";
            }
        } else if (wib0.m206561e(type) || wib0.m206559c(type)) {
            int i = merchandiseM54784s.quantity;
            if (i == 10) {
                str = "超值优惠";
            } else if (i == 5) {
                str = "热门";
            } else {
                string2 = "";
            }
            string2 = str;
        } else if (detail.m54735H() && merchandiseM54784s.autoRenewable()) {
            if (zM54734G) {
                string2 = tab0.m189811h().m189828s(merchandiseM54784s, merchandiseM54784s.quantity);
            } else if (merchandiseM54784s.yearly()) {
                string2 = "连续包年";
            } else if (merchandiseM54784s.semiAnnual()) {
                string2 = "人气之选";
            } else if (merchandiseM54784s.quarterly()) {
                string2 = "连续包季";
            } else {
                string2 = merchandiseM54784s.weekly() ? "周会员" : "连续包月";
            }
        } else if (zM54732E) {
            if (zM54734G) {
                string2 = tab0.m189811h().m189828s(merchandiseM54784s, merchandiseM54784s.quantity);
            }
        } else if (zM54733F && !wib0.m206579w(type)) {
            string2 = m131949b(context, merchandiseM54784s);
        } else if (merchandiseM54784s.quantity != 1) {
            string2 = strM131950c;
        } else if (zM54733F && merchandiseM54784s.autoRenewable() && merchandiseM54784s.isBelongPromotion(MonetizationPromotionsId.lowPriceFirstMonth)) {
            string2 = CoreModule.f18263b.getString(R$string.f27938A, detail.m54786u());
        }
        detail.m54761e0(string2);
    }
}
