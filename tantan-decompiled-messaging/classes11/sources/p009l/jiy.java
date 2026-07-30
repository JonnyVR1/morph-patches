package p009l;

import android.content.Context;
import com.p000p1.mobile.putong.core.pay.R$string;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import l.p2b0;
import l.sab0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ll/jiy;", "Ll/pwl;", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", MiniWidgetProvider.KEY_TYPE, "detail", "", "d", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "", "percentage", "", "c", "(Landroid/content/Context;I)Ljava/lang/String;", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "b", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/Merchandise;)Ljava/lang/String;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class jiy implements pwl<d.a> {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r2.equals("tttSeeWhoLikedMe") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r2.equals("tttVip") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r4.autoRenewable() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r4.quarterly() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        return r3.getResources().getString(com.p000p1.mobile.putong.core.pay.R$string.f6284k9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r4.yearly() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        return r3.getResources().getString(com.p000p1.mobile.putong.core.pay.R$string.f6272j9);
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
    public final java.lang.String m17124b(android.content.Context r3, com.p1.mobile.putong.core.data.Merchandise r4) {
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
            int r3 = com.p000p1.mobile.putong.core.pay.R$string.f6272j9
            java.lang.String r2 = r2.getString(r3)
            return r2
        L45:
            boolean r2 = r4.quarterly()
            if (r2 == 0) goto L7e
            android.content.res.Resources r2 = r3.getResources()
            int r3 = com.p000p1.mobile.putong.core.pay.R$string.f6284k9
            java.lang.String r2 = r2.getString(r3)
            return r2
        L56:
            boolean r2 = r4.autoRenewable()
            if (r2 == 0) goto L7e
            boolean r2 = r4.quarterly()
            if (r2 == 0) goto L6d
            android.content.res.Resources r2 = r3.getResources()
            int r3 = com.p000p1.mobile.putong.core.pay.R$string.f6284k9
            java.lang.String r2 = r2.getString(r3)
            return r2
        L6d:
            boolean r2 = r4.yearly()
            if (r2 == 0) goto L7e
            android.content.res.Resources r2 = r3.getResources()
            int r3 = com.p000p1.mobile.putong.core.pay.R$string.f6272j9
            java.lang.String r2 = r2.getString(r3)
            return r2
        L7e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p009l.jiy.m17124b(android.content.Context, com.p1.mobile.putong.core.data.Merchandise):java.lang.String");
    }

    /* JADX INFO: renamed from: c */
    public final String m17125c(Context context, int percentage) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.getDefault();
        String string = context.getResources().getString(R$string.f5946H0);
        string.getClass();
        return String.format(locale, string, Arrays.copyOf(new Object[]{percentage + "%"}, 1));
    }

    /* JADX WARN: Code duplicated, block: B:112:? A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x00de  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p009l.pwl
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo13950a(@NotNull Context context, @NotNull PurchaseType type, @NotNull d.a detail) {
        String strM17125c;
        String str;
        context.getClass();
        type.getClass();
        detail.getClass();
        Merchandise merchandiseS = detail.s();
        ProductCategory productCategory = merchandiseS.category;
        productCategory.getClass();
        boolean zF = detail.F();
        boolean zE = detail.E();
        boolean zG = detail.G();
        String string = productCategory.toString();
        String string2 = null;
        switch (string.hashCode()) {
            case -2067215576:
                if (!string.equals("superLikeMembership")) {
                    strM17125c = null;
                } else if (zF && merchandiseS.autoRenewable() && !zE) {
                    strM17125c = m17125c(context, detail.p());
                } else {
                    strM17125c = null;
                }
                break;
            case -863315575:
                if (!string.equals("tttVip")) {
                    strM17125c = null;
                } else if (!merchandiseS.autoRenewable() && !zE) {
                    strM17125c = m17125c(context, detail.p());
                } else {
                    strM17125c = null;
                }
                break;
            case -429915974:
                if (!string.equals("unlimitedSwipes")) {
                    strM17125c = null;
                } else if (zF) {
                }
                break;
            case -94011970:
                if (!string.equals("svipPicksMembership")) {
                    strM17125c = null;
                } else if (zF) {
                }
                break;
            case 3542730:
                if (!string.equals("svip")) {
                    strM17125c = null;
                } else if (zF) {
                }
                break;
            case 1166765179:
                if (!string.equals("quickchatMembership")) {
                    strM17125c = null;
                } else if (!merchandiseS.autoRenewable()) {
                    strM17125c = null;
                }
                break;
            case 1366973465:
                if (!string.equals("roaming")) {
                    strM17125c = null;
                } else if (zF) {
                }
                break;
            case 1848078298:
                if (!string.equals("undoMembership")) {
                    strM17125c = null;
                } else if (zF) {
                }
                break;
            case 1905099240:
                if (!string.equals("picksMembership")) {
                    strM17125c = null;
                } else if (zF) {
                }
                break;
            default:
                strM17125c = null;
                break;
        }
        if (sab0.i(type)) {
            if (!merchandiseS.autoRenewable()) {
                string2 = "";
            } else if (merchandiseS.yearly()) {
                string2 = "连续包年";
            } else if (merchandiseS.semiAnnual()) {
                string2 = "人气之选";
            } else if (merchandiseS.quarterly()) {
                string2 = "连续包季";
            } else {
                string2 = merchandiseS.weekly() ? "周会员" : "连续包月";
            }
        } else if (sab0.e(type) || sab0.c(type)) {
            int i = merchandiseS.quantity;
            if (i == 10) {
                str = "超值优惠";
            } else if (i == 5) {
                str = "热门";
            } else {
                string2 = "";
            }
            string2 = str;
        } else if (detail.H() && merchandiseS.autoRenewable()) {
            if (zG) {
                string2 = p2b0.h().s(merchandiseS, merchandiseS.quantity);
            } else if (merchandiseS.yearly()) {
                string2 = "连续包年";
            } else if (merchandiseS.semiAnnual()) {
                string2 = "人气之选";
            } else if (merchandiseS.quarterly()) {
                string2 = "连续包季";
            } else {
                string2 = merchandiseS.weekly() ? "周会员" : "连续包月";
            }
        } else if (zE) {
            if (zG) {
                string2 = p2b0.h().s(merchandiseS, merchandiseS.quantity);
            }
        } else if (zF && !sab0.w(type)) {
            string2 = m17124b(context, merchandiseS);
        } else if (merchandiseS.quantity != 1) {
            string2 = strM17125c;
        } else if (zF && merchandiseS.autoRenewable() && merchandiseS.isBelongPromotion("lowPriceFirstMonth")) {
            string2 = CoreModule.b.getString(R$string.f5868A, detail.u());
        }
        detail.e0(string2);
    }
}
