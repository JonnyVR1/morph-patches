package p149l;

import android.content.Context;
import android.content.res.Resources;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/piy;", "Ll/fiy;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "", "g", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class piy extends fiy {
    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x0125  */
    /* JADX WARN: Code duplicated, block: B:54:0x0175 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:80:0x021b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0221  */
    /* JADX WARN: Code duplicated, block: B:83:0x0237  */
    /* JADX WARN: Code duplicated, block: B:85:0x024e  */
    /* JADX WARN: Code duplicated, block: B:86:0x028b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x00db, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x024e, please report this as an issue */
    @Override // p149l.fiy, p149l.pwl
    /* JADX INFO: renamed from: g */
    public void mo116746a(@NotNull Context context, @NotNull PurchaseType type, @NotNull C8765d.a detail) {
        String string;
        String str;
        String string2;
        String string3;
        String str2;
        String string4;
        context.getClass();
        type.getClass();
        detail.getClass();
        super.mo116746a(context, type, detail);
        Resources resources = context.getResources();
        boolean zM53550F = detail.m53550F();
        boolean zM53549E = detail.m53549E();
        Merchandise merchandiseM53601s = detail.m53601s();
        ProductCategory productCategoryM53579f = detail.m53579f();
        boolean zM181481b = (detail.m53549E() && merchandiseM53601s.autoRenewable()) ? rxa0.m181481b(merchandiseM53601s) : false;
        String string5 = productCategoryM53579f.toString();
        switch (string5.hashCode()) {
            case -2067215576:
                if (!string5.equals("superLikeMembership")) {
                }
                if (zM53550F || (zM53550F && TEnum.equals(productCategoryM53579f, ProductCategory.tttVip))) {
                    if (zM181481b) {
                        string = p2b0.m167133h().m167151t(merchandiseM53601s, merchandiseM53601s.quantity);
                        string.getClass();
                    } else if (!zM53550F && TEnum.equals(productCategoryM53579f, ProductCategory.tttVip) && merchandiseM53601s.monthly() && detail.m53553I() && merchandiseM53601s.autoRenewable()) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        string = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m53603u()}, 2));
                    } else if (merchandiseM53601s.weekly()) {
                        string = resources.getString(R$string.f27097A6, getCurrencySymbol(), detail.m53593m());
                        string.getClass();
                    } else {
                        string = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
                        string.getClass();
                    }
                    if (zM181481b) {
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        str = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.m53603u(), getCurrencySymbol() + detail.m53591l()}, 2));
                    } else {
                        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                        str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m53591l()}, 2));
                    }
                    detail.m53592l0(string);
                    detail.m53559O(str);
                    detail.m53563S(zM181481b);
                } else {
                    if (merchandiseM53601s.noneRenewable()) {
                        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                        string2 = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m53591l()}, 2));
                    } else {
                        string2 = resources.getString(R$string.f27387aa, getCurrencySymbol(), detail.m53553I() ? detail.m53603u() : detail.m53591l());
                        string2.getClass();
                    }
                    String string6 = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
                    string6.getClass();
                    detail.m53592l0(string2);
                    detail.m53559O(string6);
                    detail.m53563S(zM181481b);
                }
                break;
            case -863315575:
                if (!string5.equals(ProductCategory.tttVip)) {
                }
                if (zM53550F) {
                }
                if (zM181481b) {
                    string = p2b0.m167133h().m167151t(merchandiseM53601s, merchandiseM53601s.quantity);
                    string.getClass();
                } else if (!zM53550F) {
                    if (merchandiseM53601s.weekly()) {
                        string = resources.getString(R$string.f27097A6, getCurrencySymbol(), detail.m53593m());
                        string.getClass();
                    } else {
                        string = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
                        string.getClass();
                    }
                } else if (merchandiseM53601s.weekly()) {
                    string = resources.getString(R$string.f27097A6, getCurrencySymbol(), detail.m53593m());
                    string.getClass();
                } else {
                    string = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
                    string.getClass();
                }
                if (zM181481b) {
                    StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.m53603u(), getCurrencySymbol() + detail.m53591l()}, 2));
                } else {
                    StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m53591l()}, 2));
                }
                detail.m53592l0(string);
                detail.m53559O(str);
                detail.m53563S(zM181481b);
                break;
            case -429915974:
                if (!string5.equals("unlimitedSwipes")) {
                }
                if (zM53550F) {
                }
                if (zM181481b) {
                    string = p2b0.m167133h().m167151t(merchandiseM53601s, merchandiseM53601s.quantity);
                    string.getClass();
                } else if (!zM53550F) {
                    if (merchandiseM53601s.weekly()) {
                        string = resources.getString(R$string.f27097A6, getCurrencySymbol(), detail.m53593m());
                        string.getClass();
                    } else {
                        string = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
                        string.getClass();
                    }
                } else if (merchandiseM53601s.weekly()) {
                    string = resources.getString(R$string.f27097A6, getCurrencySymbol(), detail.m53593m());
                    string.getClass();
                } else {
                    string = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
                    string.getClass();
                }
                if (zM181481b) {
                    StringCompanionObject stringCompanionObject7 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.m53603u(), getCurrencySymbol() + detail.m53591l()}, 2));
                } else {
                    StringCompanionObject stringCompanionObject8 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m53591l()}, 2));
                }
                detail.m53592l0(string);
                detail.m53559O(str);
                detail.m53563S(zM181481b);
                break;
            case -94011970:
                if (!string5.equals("svipPicksMembership")) {
                }
                if (zM53550F || zM53549E) {
                    if (zM181481b) {
                        string3 = p2b0.m167133h().m167151t(merchandiseM53601s, merchandiseM53601s.quantity);
                        string3.getClass();
                        StringCompanionObject stringCompanionObject9 = StringCompanionObject.INSTANCE;
                        str2 = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.m53603u(), getCurrencySymbol() + detail.m53591l()}, 2));
                    } else {
                        string3 = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
                        string3.getClass();
                        StringCompanionObject stringCompanionObject10 = StringCompanionObject.INSTANCE;
                        str2 = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m53591l()}, 2));
                    }
                    detail.m53592l0(string3);
                    detail.m53559O(str2);
                    detail.m53563S(zM181481b);
                } else {
                    if (merchandiseM53601s.noneRenewable()) {
                        StringCompanionObject stringCompanionObject11 = StringCompanionObject.INSTANCE;
                        string4 = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m53591l()}, 2));
                    } else {
                        string4 = resources.getString(R$string.f27387aa, getCurrencySymbol(), detail.m53553I() ? detail.m53603u() : detail.m53591l());
                        string4.getClass();
                    }
                    String string7 = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
                    string7.getClass();
                    detail.m53592l0(string4);
                    detail.m53559O(string7);
                    detail.m53563S(zM181481b);
                }
                break;
            case 1166765179:
                if (!string5.equals("quickchatMembership")) {
                }
                if (zM53550F) {
                }
                if (zM181481b) {
                    string = p2b0.m167133h().m167151t(merchandiseM53601s, merchandiseM53601s.quantity);
                    string.getClass();
                } else if (!zM53550F) {
                    if (merchandiseM53601s.weekly()) {
                        string = resources.getString(R$string.f27097A6, getCurrencySymbol(), detail.m53593m());
                        string.getClass();
                    } else {
                        string = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
                        string.getClass();
                    }
                } else if (merchandiseM53601s.weekly()) {
                    string = resources.getString(R$string.f27097A6, getCurrencySymbol(), detail.m53593m());
                    string.getClass();
                } else {
                    string = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
                    string.getClass();
                }
                if (zM181481b) {
                    StringCompanionObject stringCompanionObject12 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.m53603u(), getCurrencySymbol() + detail.m53591l()}, 2));
                } else {
                    StringCompanionObject stringCompanionObject13 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m53591l()}, 2));
                }
                detail.m53592l0(string);
                detail.m53559O(str);
                detail.m53563S(zM181481b);
                break;
            case 1366973465:
                if (!string5.equals("roaming")) {
                }
                if (zM53550F) {
                }
                if (zM181481b) {
                    string = p2b0.m167133h().m167151t(merchandiseM53601s, merchandiseM53601s.quantity);
                    string.getClass();
                } else if (!zM53550F) {
                    if (merchandiseM53601s.weekly()) {
                        string = resources.getString(R$string.f27097A6, getCurrencySymbol(), detail.m53593m());
                        string.getClass();
                    } else {
                        string = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
                        string.getClass();
                    }
                } else if (merchandiseM53601s.weekly()) {
                    string = resources.getString(R$string.f27097A6, getCurrencySymbol(), detail.m53593m());
                    string.getClass();
                } else {
                    string = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
                    string.getClass();
                }
                if (zM181481b) {
                    StringCompanionObject stringCompanionObject14 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.m53603u(), getCurrencySymbol() + detail.m53591l()}, 2));
                } else {
                    StringCompanionObject stringCompanionObject15 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m53591l()}, 2));
                }
                detail.m53592l0(string);
                detail.m53559O(str);
                detail.m53563S(zM181481b);
                break;
            case 1848078298:
                if (!string5.equals("undoMembership")) {
                }
                if (zM53550F) {
                }
                if (zM181481b) {
                    string = p2b0.m167133h().m167151t(merchandiseM53601s, merchandiseM53601s.quantity);
                    string.getClass();
                } else if (!zM53550F) {
                    if (merchandiseM53601s.weekly()) {
                        string = resources.getString(R$string.f27097A6, getCurrencySymbol(), detail.m53593m());
                        string.getClass();
                    } else {
                        string = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
                        string.getClass();
                    }
                } else if (merchandiseM53601s.weekly()) {
                    string = resources.getString(R$string.f27097A6, getCurrencySymbol(), detail.m53593m());
                    string.getClass();
                } else {
                    string = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
                    string.getClass();
                }
                if (zM181481b) {
                    StringCompanionObject stringCompanionObject16 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.m53603u(), getCurrencySymbol() + detail.m53591l()}, 2));
                } else {
                    StringCompanionObject stringCompanionObject17 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m53591l()}, 2));
                }
                detail.m53592l0(string);
                detail.m53559O(str);
                detail.m53563S(zM181481b);
                break;
            case 1905099240:
                if (!string5.equals("picksMembership")) {
                }
                if (zM53550F) {
                }
                if (zM181481b) {
                    string3 = p2b0.m167133h().m167151t(merchandiseM53601s, merchandiseM53601s.quantity);
                    string3.getClass();
                    StringCompanionObject stringCompanionObject18 = StringCompanionObject.INSTANCE;
                    str2 = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.m53603u(), getCurrencySymbol() + detail.m53591l()}, 2));
                } else {
                    string3 = resources.getString(R$string.f27633v9, getCurrencySymbol(), detail.m53593m());
                    string3.getClass();
                    StringCompanionObject stringCompanionObject19 = StringCompanionObject.INSTANCE;
                    str2 = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.m53591l()}, 2));
                }
                detail.m53592l0(string3);
                detail.m53559O(str2);
                detail.m53563S(zM181481b);
                break;
        }
    }
}
