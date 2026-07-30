package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeData;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.d;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, d2 = {"Ll/f7p;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "", "explicitSkuDuration", "", "d", "(Ljava/util/List;Lcom/p1/mobile/putong/core/data/ProductCategory;Ljava/lang/String;)V", "duration", "c", "(Ljava/util/List;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "", "g", "(Lcom/p1/mobile/putong/core/data/Merchandise;Ljava/lang/String;)Z", "e", "(Ljava/util/List;Ljava/lang/String;)Z", "configSelect", "h", "f", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f7p {

    @NotNull
    public static final f7p INSTANCE = new f7p();

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX INFO: renamed from: a */
    public static Boolean m12989a(String str, C0190d c0190d) {
        Merchandise merchandiseM4167s;
        boolean z;
        C0190d.a aVarM4088d = c0190d.m4088d();
        if (aVarM4088d == null || (merchandiseM4167s = aVarM4088d.m4167s()) == null) {
            C0190d.a aVarM4086b = c0190d.m4086b();
            merchandiseM4167s = aVarM4086b != null ? aVarM4086b.m4167s() : null;
        }
        if (merchandiseM4167s != null) {
            str.getClass();
            if (m12993g(merchandiseM4167s, str)) {
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
    public static Boolean m12990b(String str, C0190d c0190d) {
        Merchandise merchandiseM4167s;
        C0190d.a aVarM4088d = c0190d.m4088d();
        if (aVarM4088d == null || (merchandiseM4167s = aVarM4088d.m4167s()) == null) {
            C0190d.a aVarM4086b = c0190d.m4086b();
            merchandiseM4167s = aVarM4086b != null ? aVarM4086b.m4167s() : null;
        }
        return Boolean.valueOf(merchandiseM4167s != null && m12993g(merchandiseM4167s, str));
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m12991c(@NotNull List<? extends C0190d> sections, @Nullable final String duration) {
        sections.getClass();
        if (TextUtils.isEmpty(duration) || vwb.J(sections)) {
            return;
        }
        Iterator<? extends C0190d> it = sections.iterator();
        while (it.hasNext()) {
            it.next().m4106v(false);
        }
        C0190d c0190d = (C0190d) vwb.r(sections, new w9j() { // from class: l.e7p
            public final Object call(Object obj) {
                return f7p.m12989a(duration, (C0190d) obj);
            }
        });
        if (c0190d != null) {
            c0190d.m4106v(true);
        } else {
            sections.get(0).m4106v(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m12992d(@NotNull List<? extends C0190d> sections, @NotNull ProductCategory category, @Nullable String explicitSkuDuration) {
        sections.getClass();
        category.getClass();
        if (vwb.J(sections)) {
            return;
        }
        String strM20001m = p2b0.m19990h().m20001m(category);
        if (TextUtils.isEmpty(explicitSkuDuration)) {
            explicitSkuDuration = strM20001m;
        } else {
            f7p f7pVar = INSTANCE;
            explicitSkuDuration.getClass();
            if (!f7pVar.m12994e(sections, explicitSkuDuration)) {
                explicitSkuDuration = strM20001m;
            }
        }
        m12991c(sections, explicitSkuDuration);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m12993g(@NotNull Merchandise merchandise, @NotNull String duration) {
        merchandise.getClass();
        duration.getClass();
        f7p f7pVar = INSTANCE;
        if (f7pVar.m12996h(merchandise, duration)) {
            return true;
        }
        return f7pVar.m12995f(merchandise, duration);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12994e(List<? extends C0190d> sections, final String duration) {
        return vwb.r(sections, new w9j() { // from class: l.d7p
            public final Object call(Object obj) {
                return f7p.m12990b(duration, (C0190d) obj);
            }
        }) != null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m12995f(Merchandise merchandise, String duration) {
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
    public final boolean m12996h(Merchandise merchandise, String configSelect) {
        if (d.J(configSelect, ExpProfileLoopWheelTypeData.NONE_STR, false, 2, (Object) null)) {
            String strSubstring = configSelect.substring(1);
            if (d.w(strSubstring, "w", false, 2, (Object) null)) {
                return merchandise.noneRenewable() && merchandise.weekly() && merchandise.quantity == Integer.parseInt(strSubstring.substring(0, strSubstring.length() - 1));
            }
            return merchandise.noneRenewable() && merchandise.monthType() && merchandise.quantity == Integer.parseInt(strSubstring);
        }
        if (d.w(configSelect, "w", false, 2, (Object) null)) {
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
