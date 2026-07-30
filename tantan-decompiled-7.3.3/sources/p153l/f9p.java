package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, m88121d2 = {"Ll/f9p;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "", "explicitSkuDuration", "", Constants.INAPP_DATA_TAG, "(Ljava/util/List;Lcom/p1/mobile/putong/core/data/ProductCategory;Ljava/lang/String;)V", BLiveOperationTitleShowType.duration, "c", "(Ljava/util/List;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "", "g", "(Lcom/p1/mobile/putong/core/data/Merchandise;Ljava/lang/String;)Z", "e", "(Ljava/util/List;Ljava/lang/String;)Z", "configSelect", "h", "f", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class f9p {

    @NotNull
    public static final f9p INSTANCE = new f9p();

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX INFO: renamed from: a */
    public static Boolean m124674a(String str, C8928d c8928d) {
        Merchandise merchandiseM54784s;
        boolean z;
        C8928d.a aVarM54705d = c8928d.m54705d();
        if (aVarM54705d == null || (merchandiseM54784s = aVarM54705d.m54784s()) == null) {
            C8928d.a aVarM54703b = c8928d.m54703b();
            merchandiseM54784s = aVarM54703b != null ? aVarM54703b.m54784s() : null;
        }
        if (merchandiseM54784s != null) {
            str.getClass();
            if (m124678g(merchandiseM54784s, str)) {
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
    public static Boolean m124675b(String str, C8928d c8928d) {
        Merchandise merchandiseM54784s;
        C8928d.a aVarM54705d = c8928d.m54705d();
        if (aVarM54705d == null || (merchandiseM54784s = aVarM54705d.m54784s()) == null) {
            C8928d.a aVarM54703b = c8928d.m54703b();
            merchandiseM54784s = aVarM54703b != null ? aVarM54703b.m54784s() : null;
        }
        return Boolean.valueOf(merchandiseM54784s != null && m124678g(merchandiseM54784s, str));
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m124676c(@NotNull List<? extends C8928d> sections, @Nullable final String duration) {
        sections.getClass();
        if (TextUtils.isEmpty(duration) || jyb.m147479J(sections)) {
            return;
        }
        Iterator<? extends C8928d> it = sections.iterator();
        while (it.hasNext()) {
            it.next().m54723v(false);
        }
        C8928d c8928d = (C8928d) jyb.m147529r(sections, new qcj() { // from class: l.e9p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return f9p.m124674a(duration, (C8928d) obj);
            }
        });
        if (c8928d != null) {
            c8928d.m54723v(true);
        } else {
            sections.get(0).m54723v(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m124677d(@NotNull List<? extends C8928d> sections, @NotNull ProductCategory category, @Nullable String explicitSkuDuration) {
        sections.getClass();
        category.getClass();
        if (jyb.m147479J(sections)) {
            return;
        }
        String strM189822m = tab0.m189811h().m189822m(category);
        if (TextUtils.isEmpty(explicitSkuDuration)) {
            explicitSkuDuration = strM189822m;
        } else {
            f9p f9pVar = INSTANCE;
            explicitSkuDuration.getClass();
            if (!f9pVar.m124679e(sections, explicitSkuDuration)) {
                explicitSkuDuration = strM189822m;
            }
        }
        m124676c(sections, explicitSkuDuration);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m124678g(@NotNull Merchandise merchandise, @NotNull String duration) {
        merchandise.getClass();
        duration.getClass();
        f9p f9pVar = INSTANCE;
        if (f9pVar.m124681h(merchandise, duration)) {
            return true;
        }
        return f9pVar.m124680f(merchandise, duration);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m124679e(List<? extends C8928d> sections, final String duration) {
        return jyb.m147529r(sections, new qcj() { // from class: l.d9p
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return f9p.m124675b(duration, (C8928d) obj);
            }
        }) != null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m124680f(Merchandise merchandise, String duration) {
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
    public final boolean m124681h(Merchandise merchandise, String configSelect) {
        if (C15493d.m94374J(configSelect, "-", false, 2, null)) {
            String strSubstring = configSelect.substring(1);
            if (C15493d.m94380w(strSubstring, "w", false, 2, null)) {
                return merchandise.noneRenewable() && merchandise.weekly() && merchandise.quantity == Integer.parseInt(strSubstring.substring(0, strSubstring.length() - 1));
            }
            return merchandise.noneRenewable() && merchandise.monthType() && merchandise.quantity == Integer.parseInt(strSubstring);
        }
        if (C15493d.m94380w(configSelect, "w", false, 2, null)) {
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
