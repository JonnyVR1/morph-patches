package p149l;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.appevents.C1555g;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.internal.C1656d;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0014\u0010%\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R,\u0010&\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!¨\u0006'"}, m87232d2 = {"Ll/ypm;", "", "<init>", "()V", "", "dedupingWithImplicitlyLoggedHistory", "", "Lkotlin/Pair;", "", Constants.INAPP_DATA_TAG, "(Z)Ljava/util/List;", "f", "c", "()Ljava/util/List;", "h", "Landroid/os/Bundle;", "parameters", "Ljava/util/Currency;", "b", "(Landroid/os/Bundle;)Ljava/util/Currency;", "", "valueToSum", "g", "(Ljava/lang/Double;Landroid/os/Bundle;)Ljava/lang/Double;", "", "e", "()J", "dedupeParameters", "originalParameters", "Lcom/facebook/appevents/g;", "originalOperationalData", "a", "(Landroid/os/Bundle;Landroid/os/Bundle;Lcom/facebook/appevents/g;)Lkotlin/Pair;", "Ljava/util/List;", "defaultCurrencyParameterEquivalents", "defaultValueParameterEquivalents", "J", "defaultDedupeWindow", "defaultDedupeParameters", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ypm {

    @NotNull
    public static final ypm INSTANCE = new ypm();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<String> defaultCurrencyParameterEquivalents = CollectionsKt.listOf("fb_currency");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final List<String> defaultValueParameterEquivalents = CollectionsKt.listOf("_valueToSum");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final long defaultDedupeWindow = Constants.ONE_MIN_IN_MILLIS;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final List<Pair<String, List<String>>> defaultDedupeParameters = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m87240a("fb_iap_product_id", CollectionsKt.listOf("fb_iap_product_id")), TuplesKt.m87240a("fb_iap_product_description", CollectionsKt.listOf("fb_iap_product_description")), TuplesKt.m87240a("fb_iap_product_title", CollectionsKt.listOf("fb_iap_product_title")), TuplesKt.m87240a("fb_iap_purchase_token", CollectionsKt.listOf("fb_iap_purchase_token"))});

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Pair<Bundle, C1555g> m215641a(@Nullable Bundle dedupeParameters, @Nullable Bundle originalParameters, @Nullable C1555g originalOperationalData) {
        Bundle bundle;
        C1555g c1555gComponent2;
        if (dedupeParameters == null) {
            return new Pair<>(originalParameters, originalOperationalData);
        }
        try {
            bundle = originalParameters;
            c1555gComponent2 = originalOperationalData;
            for (String str : dedupeParameters.keySet()) {
                try {
                    String string = dedupeParameters.getString(str);
                    if (string != null) {
                        C1555g.Companion companion = C1555g.INSTANCE;
                        OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
                        str.getClass();
                        Pair<Bundle, C1555g> pairM7793b = companion.m7793b(operationalDataEnum, str, string, bundle, c1555gComponent2);
                        Bundle bundleComponent1 = pairM7793b.component1();
                        c1555gComponent2 = pairM7793b.component2();
                        bundle = bundleComponent1;
                    }
                } catch (Exception unused) {
                    originalParameters = bundle;
                    originalOperationalData = c1555gComponent2;
                    bundle = originalParameters;
                    c1555gComponent2 = originalOperationalData;
                }
            }
        } catch (Exception unused2) {
        }
        return new Pair<>(bundle, c1555gComponent2);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Currency m215642b(@Nullable Bundle parameters) {
        Iterator<String> it = m215643c().iterator();
        while (true) {
            String string = null;
            if (!it.hasNext()) {
                return null;
            }
            String next = it.next();
            if (parameters != null) {
                try {
                    string = parameters.getString(next);
                    if (string != null && string.length() != 0) {
                        return Currency.getInstance(string);
                    }
                } catch (Exception unused) {
                    continue;
                }
            } else {
                if (string != null) {
                    return Currency.getInstance(string);
                }
                continue;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<String> m215643c() {
        C1656d c1656dM8689f = FetchedAppSettingsManager.m8689f(C1577c.m8048m());
        return ((c1656dM8689f != null ? c1656dM8689f.m8779e() : null) == null || c1656dM8689f.m8779e().isEmpty()) ? defaultCurrencyParameterEquivalents : c1656dM8689f.m8779e();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<Pair<String, List<String>>> m215644d(boolean dedupingWithImplicitlyLoggedHistory) {
        C1656d c1656dM8689f = FetchedAppSettingsManager.m8689f(C1577c.m8048m());
        if ((c1656dM8689f != null ? c1656dM8689f.m8787m() : null) == null || c1656dM8689f.m8787m().isEmpty()) {
            return defaultDedupeParameters;
        }
        if (!dedupingWithImplicitlyLoggedHistory) {
            return c1656dM8689f.m8787m();
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<String, List<String>> pair : c1656dM8689f.m8787m()) {
            Iterator<String> it = pair.getSecond().iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair(it.next(), CollectionsKt.listOf(pair.getFirst())));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final long m215645e() {
        Long dedupeWindow;
        C1656d c1656dM8689f = FetchedAppSettingsManager.m8689f(C1577c.m8048m());
        return ((c1656dM8689f != null ? c1656dM8689f.getDedupeWindow() : null) == null || ((dedupeWindow = c1656dM8689f.getDedupeWindow()) != null && dedupeWindow.longValue() == 0)) ? defaultDedupeWindow : c1656dM8689f.getDedupeWindow().longValue();
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final List<Pair<String, List<String>>> m215646f(boolean dedupingWithImplicitlyLoggedHistory) {
        List<Pair<String, List<String>>> listM8799y;
        C1656d c1656dM8689f = FetchedAppSettingsManager.m8689f(C1577c.m8048m());
        if (c1656dM8689f == null || (listM8799y = c1656dM8689f.m8799y()) == null || listM8799y.isEmpty()) {
            return null;
        }
        if (!dedupingWithImplicitlyLoggedHistory) {
            return c1656dM8689f.m8799y();
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<String, List<String>> pair : c1656dM8689f.m8799y()) {
            Iterator<String> it = pair.getSecond().iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair(it.next(), CollectionsKt.listOf(pair.getFirst())));
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Double m215647g(@Nullable Double valueToSum, @Nullable Bundle parameters) {
        if (valueToSum != null) {
            return valueToSum;
        }
        Iterator<String> it = m215648h().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (parameters != null) {
                try {
                    return Double.valueOf(parameters.getDouble(next));
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<String> m215648h() {
        C1656d c1656dM8689f = FetchedAppSettingsManager.m8689f(C1577c.m8048m());
        return ((c1656dM8689f != null ? c1656dM8689f.m8789o() : null) == null || c1656dM8689f.m8789o().isEmpty()) ? defaultValueParameterEquivalents : c1656dM8689f.m8789o();
    }
}
