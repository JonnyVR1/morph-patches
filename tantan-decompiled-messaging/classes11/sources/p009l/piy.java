package p009l;

import android.content.Context;
import android.content.res.Resources;
import com.p000p1.mobile.putong.core.pay.R$string;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import l.p2b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/piy;", "Ll/fiy;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", MiniWidgetProvider.KEY_TYPE, "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "", "g", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @Override // p009l.fiy, p009l.pwl
    /* JADX INFO: renamed from: g */
    public void mo13950a(@NotNull Context context, @NotNull PurchaseType type, @NotNull d.a detail) {
        String string;
        String str;
        String string2;
        String string3;
        String str2;
        String string4;
        context.getClass();
        type.getClass();
        detail.getClass();
        super.mo13950a(context, type, detail);
        Resources resources = context.getResources();
        boolean zF = detail.F();
        boolean zE = detail.E();
        Merchandise merchandiseS = detail.s();
        ProductCategory productCategoryF = detail.f();
        boolean zM21865b = (detail.E() && merchandiseS.autoRenewable()) ? rxa0.m21865b(merchandiseS) : false;
        String string5 = productCategoryF.toString();
        switch (string5.hashCode()) {
            case -2067215576:
                if (!string5.equals("superLikeMembership")) {
                }
                if (zF || (zF && TEnum.equals(productCategoryF, "tttVip"))) {
                    if (zM21865b) {
                        string = p2b0.h().t(merchandiseS, merchandiseS.quantity);
                        string.getClass();
                    } else if (!zF && TEnum.equals(productCategoryF, "tttVip") && merchandiseS.monthly() && detail.I() && merchandiseS.autoRenewable()) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        string = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.u()}, 2));
                    } else if (merchandiseS.weekly()) {
                        string = resources.getString(R$string.f5875A6, getCurrencySymbol(), detail.m());
                        string.getClass();
                    } else {
                        string = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
                        string.getClass();
                    }
                    if (zM21865b) {
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        str = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.u(), getCurrencySymbol() + detail.l()}, 2));
                    } else {
                        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                        str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.l()}, 2));
                    }
                    detail.l0(string);
                    detail.O(str);
                    detail.S(zM21865b);
                } else {
                    if (merchandiseS.noneRenewable()) {
                        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                        string2 = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.l()}, 2));
                    } else {
                        string2 = resources.getString(R$string.f6165aa, getCurrencySymbol(), detail.I() ? detail.u() : detail.l());
                        string2.getClass();
                    }
                    String string6 = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
                    string6.getClass();
                    detail.l0(string2);
                    detail.O(string6);
                    detail.S(zM21865b);
                }
                break;
            case -863315575:
                if (!string5.equals("tttVip")) {
                }
                if (zF) {
                }
                if (zM21865b) {
                    string = p2b0.h().t(merchandiseS, merchandiseS.quantity);
                    string.getClass();
                } else if (!zF) {
                    if (merchandiseS.weekly()) {
                        string = resources.getString(R$string.f5875A6, getCurrencySymbol(), detail.m());
                        string.getClass();
                    } else {
                        string = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
                        string.getClass();
                    }
                } else if (merchandiseS.weekly()) {
                    string = resources.getString(R$string.f5875A6, getCurrencySymbol(), detail.m());
                    string.getClass();
                } else {
                    string = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
                    string.getClass();
                }
                if (zM21865b) {
                    StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.u(), getCurrencySymbol() + detail.l()}, 2));
                } else {
                    StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.l()}, 2));
                }
                detail.l0(string);
                detail.O(str);
                detail.S(zM21865b);
                break;
            case -429915974:
                if (!string5.equals("unlimitedSwipes")) {
                }
                if (zF) {
                }
                if (zM21865b) {
                    string = p2b0.h().t(merchandiseS, merchandiseS.quantity);
                    string.getClass();
                } else if (!zF) {
                    if (merchandiseS.weekly()) {
                        string = resources.getString(R$string.f5875A6, getCurrencySymbol(), detail.m());
                        string.getClass();
                    } else {
                        string = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
                        string.getClass();
                    }
                } else if (merchandiseS.weekly()) {
                    string = resources.getString(R$string.f5875A6, getCurrencySymbol(), detail.m());
                    string.getClass();
                } else {
                    string = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
                    string.getClass();
                }
                if (zM21865b) {
                    StringCompanionObject stringCompanionObject7 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.u(), getCurrencySymbol() + detail.l()}, 2));
                } else {
                    StringCompanionObject stringCompanionObject8 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.l()}, 2));
                }
                detail.l0(string);
                detail.O(str);
                detail.S(zM21865b);
                break;
            case -94011970:
                if (!string5.equals("svipPicksMembership")) {
                }
                if (zF || zE) {
                    if (zM21865b) {
                        string3 = p2b0.h().t(merchandiseS, merchandiseS.quantity);
                        string3.getClass();
                        StringCompanionObject stringCompanionObject9 = StringCompanionObject.INSTANCE;
                        str2 = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.u(), getCurrencySymbol() + detail.l()}, 2));
                    } else {
                        string3 = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
                        string3.getClass();
                        StringCompanionObject stringCompanionObject10 = StringCompanionObject.INSTANCE;
                        str2 = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.l()}, 2));
                    }
                    detail.l0(string3);
                    detail.O(str2);
                    detail.S(zM21865b);
                } else {
                    if (merchandiseS.noneRenewable()) {
                        StringCompanionObject stringCompanionObject11 = StringCompanionObject.INSTANCE;
                        string4 = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.l()}, 2));
                    } else {
                        string4 = resources.getString(R$string.f6165aa, getCurrencySymbol(), detail.I() ? detail.u() : detail.l());
                        string4.getClass();
                    }
                    String string7 = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
                    string7.getClass();
                    detail.l0(string4);
                    detail.O(string7);
                    detail.S(zM21865b);
                }
                break;
            case 1166765179:
                if (!string5.equals("quickchatMembership")) {
                }
                if (zF) {
                }
                if (zM21865b) {
                    string = p2b0.h().t(merchandiseS, merchandiseS.quantity);
                    string.getClass();
                } else if (!zF) {
                    if (merchandiseS.weekly()) {
                        string = resources.getString(R$string.f5875A6, getCurrencySymbol(), detail.m());
                        string.getClass();
                    } else {
                        string = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
                        string.getClass();
                    }
                } else if (merchandiseS.weekly()) {
                    string = resources.getString(R$string.f5875A6, getCurrencySymbol(), detail.m());
                    string.getClass();
                } else {
                    string = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
                    string.getClass();
                }
                if (zM21865b) {
                    StringCompanionObject stringCompanionObject12 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.u(), getCurrencySymbol() + detail.l()}, 2));
                } else {
                    StringCompanionObject stringCompanionObject13 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.l()}, 2));
                }
                detail.l0(string);
                detail.O(str);
                detail.S(zM21865b);
                break;
            case 1366973465:
                if (!string5.equals("roaming")) {
                }
                if (zF) {
                }
                if (zM21865b) {
                    string = p2b0.h().t(merchandiseS, merchandiseS.quantity);
                    string.getClass();
                } else if (!zF) {
                    if (merchandiseS.weekly()) {
                        string = resources.getString(R$string.f5875A6, getCurrencySymbol(), detail.m());
                        string.getClass();
                    } else {
                        string = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
                        string.getClass();
                    }
                } else if (merchandiseS.weekly()) {
                    string = resources.getString(R$string.f5875A6, getCurrencySymbol(), detail.m());
                    string.getClass();
                } else {
                    string = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
                    string.getClass();
                }
                if (zM21865b) {
                    StringCompanionObject stringCompanionObject14 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.u(), getCurrencySymbol() + detail.l()}, 2));
                } else {
                    StringCompanionObject stringCompanionObject15 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.l()}, 2));
                }
                detail.l0(string);
                detail.O(str);
                detail.S(zM21865b);
                break;
            case 1848078298:
                if (!string5.equals("undoMembership")) {
                }
                if (zF) {
                }
                if (zM21865b) {
                    string = p2b0.h().t(merchandiseS, merchandiseS.quantity);
                    string.getClass();
                } else if (!zF) {
                    if (merchandiseS.weekly()) {
                        string = resources.getString(R$string.f5875A6, getCurrencySymbol(), detail.m());
                        string.getClass();
                    } else {
                        string = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
                        string.getClass();
                    }
                } else if (merchandiseS.weekly()) {
                    string = resources.getString(R$string.f5875A6, getCurrencySymbol(), detail.m());
                    string.getClass();
                } else {
                    string = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
                    string.getClass();
                }
                if (zM21865b) {
                    StringCompanionObject stringCompanionObject16 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.u(), getCurrencySymbol() + detail.l()}, 2));
                } else {
                    StringCompanionObject stringCompanionObject17 = StringCompanionObject.INSTANCE;
                    str = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.l()}, 2));
                }
                detail.l0(string);
                detail.O(str);
                detail.S(zM21865b);
                break;
            case 1905099240:
                if (!string5.equals("picksMembership")) {
                }
                if (zF) {
                }
                if (zM21865b) {
                    string3 = p2b0.h().t(merchandiseS, merchandiseS.quantity);
                    string3.getClass();
                    StringCompanionObject stringCompanionObject18 = StringCompanionObject.INSTANCE;
                    str2 = String.format("%1$s /%2$s", Arrays.copyOf(new Object[]{getCurrencySymbol() + detail.u(), getCurrencySymbol() + detail.l()}, 2));
                } else {
                    string3 = resources.getString(R$string.f6411v9, getCurrencySymbol(), detail.m());
                    string3.getClass();
                    StringCompanionObject stringCompanionObject19 = StringCompanionObject.INSTANCE;
                    str2 = String.format("%1$s %2$s", Arrays.copyOf(new Object[]{getCurrencySymbol(), detail.l()}, 2));
                }
                detail.l0(string3);
                detail.O(str2);
                detail.S(zM21865b);
                break;
        }
    }
}
