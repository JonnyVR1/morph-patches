package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, m87232d2 = {"Ll/f7p;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "", "explicitSkuDuration", "", Constants.INAPP_DATA_TAG, "(Ljava/util/List;Lcom/p1/mobile/putong/core/data/ProductCategory;Ljava/lang/String;)V", BLiveOperationTitleShowType.duration, "c", "(Ljava/util/List;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "", "g", "(Lcom/p1/mobile/putong/core/data/Merchandise;Ljava/lang/String;)Z", "e", "(Ljava/util/List;Ljava/lang/String;)Z", "configSelect", "h", "f", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class f7p {

    @NotNull
    public static final f7p INSTANCE = new f7p();

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX INFO: renamed from: a */
    public static Boolean m119808a(String str, C8765d c8765d) {
        Merchandise merchandiseM53601s;
        boolean z;
        C8765d.a aVarM53522d = c8765d.m53522d();
        if (aVarM53522d == null || (merchandiseM53601s = aVarM53522d.m53601s()) == null) {
            C8765d.a aVarM53520b = c8765d.m53520b();
            merchandiseM53601s = aVarM53520b != null ? aVarM53520b.m53601s() : null;
        }
        if (merchandiseM53601s != null) {
            str.getClass();
            if (m119812g(merchandiseM53601s, str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m119809b(String str, C8765d c8765d) {
        Merchandise merchandiseM53601s;
        C8765d.a aVarM53522d = c8765d.m53522d();
        if (aVarM53522d == null || (merchandiseM53601s = aVarM53522d.m53601s()) == null) {
            C8765d.a aVarM53520b = c8765d.m53520b();
            merchandiseM53601s = aVarM53520b != null ? aVarM53520b.m53601s() : null;
        }
        return Boolean.valueOf(merchandiseM53601s != null && m119812g(merchandiseM53601s, str));
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m119810c(@NotNull List<? extends C8765d> sections, @Nullable final String duration) {
        sections.getClass();
        if (TextUtils.isEmpty(duration) || vwb.m200296J(sections)) {
            return;
        }
        Iterator<? extends C8765d> it = sections.iterator();
        while (it.hasNext()) {
            it.next().m53540v(false);
        }
        C8765d c8765d = (C8765d) vwb.m200346r(sections, new w9j() { // from class: l.e7p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return f7p.m119808a(duration, (C8765d) obj);
            }
        });
        if (c8765d != null) {
            c8765d.m53540v(true);
        } else {
            sections.get(0).m53540v(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m119811d(@NotNull List<? extends C8765d> sections, @NotNull ProductCategory category, @Nullable String explicitSkuDuration) {
        sections.getClass();
        category.getClass();
        if (vwb.m200296J(sections)) {
            return;
        }
        String strM167144m = p2b0.m167133h().m167144m(category);
        if (TextUtils.isEmpty(explicitSkuDuration)) {
            explicitSkuDuration = strM167144m;
        } else {
            f7p f7pVar = INSTANCE;
            explicitSkuDuration.getClass();
            if (!f7pVar.m119813e(sections, explicitSkuDuration)) {
                explicitSkuDuration = strM167144m;
            }
        }
        m119810c(sections, explicitSkuDuration);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m119812g(@NotNull Merchandise merchandise, @NotNull String duration) {
        merchandise.getClass();
        duration.getClass();
        f7p f7pVar = INSTANCE;
        if (f7pVar.m119815h(merchandise, duration)) {
            return true;
        }
        return f7pVar.m119814f(merchandise, duration);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m119813e(List<? extends C8765d> sections, final String duration) {
        return vwb.m200346r(sections, new w9j() { // from class: l.d7p
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return f7p.m119809b(duration, (C8765d) obj);
            }
        }) != null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m119814f(Merchandise merchandise, String duration) {
        int iHashCode = duration.hashCode();
        if (iHashCode == 1628) {
            if (duration.equals("1m")) {
                return merchandise.monthly();
            }
            return false;
        }
        if (iHashCode == 1638) {
            if (duration.equals("1w")) {
                return merchandise.weekly();
            }
            return false;
        }
        if (iHashCode == 1690) {
            if (duration.equals("3m")) {
                return merchandise.quarterly();
            }
            return false;
        }
        if (iHashCode == 1783) {
            if (duration.equals("6m")) {
                return merchandise.semiAnnual();
            }
            return false;
        }
        if (iHashCode == 48748 && duration.equals("12m")) {
            return merchandise.yearly();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m119815h(Merchandise merchandise, String configSelect) {
        if (C15386d.m93483J(configSelect, "-", false, 2, null)) {
            String strSubstring = configSelect.substring(1);
            if (C15386d.m93489w(strSubstring, "w", false, 2, null)) {
                return merchandise.noneRenewable() && merchandise.weekly() && merchandise.quantity == Integer.parseInt(strSubstring.substring(0, strSubstring.length() - 1));
            }
            return merchandise.noneRenewable() && merchandise.monthType() && merchandise.quantity == Integer.parseInt(strSubstring);
        }
        if (C15386d.m93489w(configSelect, "w", false, 2, null)) {
            return merchandise.autoRenewable() && merchandise.weekly() && merchandise.quantity == Integer.parseInt(configSelect.substring(0, configSelect.length() - 1));
        }
        if (TextUtils.isDigitsOnly(configSelect)) {
            int i = Integer.parseInt(configSelect);
            if (merchandise.autoRenewable() && merchandise.monthType() && merchandise.quantity == i) {
                return true;
            }
        }
        return false;
    }
}
