package p153l;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.appevents.C1578g;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.internal.C1679d;
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
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0014\u0010%\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R,\u0010&\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!¨\u0006'"}, m88121d2 = {"Ll/asm;", "", "<init>", "()V", "", "dedupingWithImplicitlyLoggedHistory", "", "Lkotlin/Pair;", "", Constants.INAPP_DATA_TAG, "(Z)Ljava/util/List;", "f", "c", "()Ljava/util/List;", "h", "Landroid/os/Bundle;", "parameters", "Ljava/util/Currency;", "b", "(Landroid/os/Bundle;)Ljava/util/Currency;", "", "valueToSum", "g", "(Ljava/lang/Double;Landroid/os/Bundle;)Ljava/lang/Double;", "", "e", "()J", "dedupeParameters", "originalParameters", "Lcom/facebook/appevents/g;", "originalOperationalData", "a", "(Landroid/os/Bundle;Landroid/os/Bundle;Lcom/facebook/appevents/g;)Lkotlin/Pair;", "Ljava/util/List;", "defaultCurrencyParameterEquivalents", "defaultValueParameterEquivalents", "J", "defaultDedupeWindow", "defaultDedupeParameters", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class asm {

    @NotNull
    public static final asm INSTANCE = new asm();

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
    public static final List<Pair<String, List<String>>> defaultDedupeParameters = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m88129a("fb_iap_product_id", CollectionsKt.listOf("fb_iap_product_id")), TuplesKt.m88129a("fb_iap_product_description", CollectionsKt.listOf("fb_iap_product_description")), TuplesKt.m88129a("fb_iap_product_title", CollectionsKt.listOf("fb_iap_product_title")), TuplesKt.m88129a("fb_iap_purchase_token", CollectionsKt.listOf("fb_iap_purchase_token"))});

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Pair<Bundle, C1578g> m99942a(@Nullable Bundle dedupeParameters, @Nullable Bundle originalParameters, @Nullable C1578g originalOperationalData) {
        Bundle bundle;
        C1578g c1578gComponent2;
        if (dedupeParameters == null) {
            return new Pair<>(originalParameters, originalOperationalData);
        }
        try {
            bundle = originalParameters;
            c1578gComponent2 = originalOperationalData;
            for (String str : dedupeParameters.keySet()) {
                try {
                    String string = dedupeParameters.getString(str);
                    if (string != null) {
                        C1578g.Companion companion = C1578g.INSTANCE;
                        OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
                        str.getClass();
                        Pair<Bundle, C1578g> pairM7847b = companion.m7847b(operationalDataEnum, str, string, bundle, c1578gComponent2);
                        Bundle bundleComponent1 = pairM7847b.component1();
                        c1578gComponent2 = pairM7847b.component2();
                        bundle = bundleComponent1;
                    }
                } catch (Exception unused) {
                    originalParameters = bundle;
                    originalOperationalData = c1578gComponent2;
                    bundle = originalParameters;
                    c1578gComponent2 = originalOperationalData;
                }
            }
        } catch (Exception unused2) {
        }
        return new Pair<>(bundle, c1578gComponent2);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Currency m99943b(@Nullable Bundle parameters) {
        Iterator<String> it = m99944c().iterator();
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
    public final List<String> m99944c() {
        C1679d c1679dM8743f = FetchedAppSettingsManager.m8743f(C1600c.m8102m());
        return ((c1679dM8743f != null ? c1679dM8743f.m8833e() : null) == null || c1679dM8743f.m8833e().isEmpty()) ? defaultCurrencyParameterEquivalents : c1679dM8743f.m8833e();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<Pair<String, List<String>>> m99945d(boolean dedupingWithImplicitlyLoggedHistory) {
        C1679d c1679dM8743f = FetchedAppSettingsManager.m8743f(C1600c.m8102m());
        if ((c1679dM8743f != null ? c1679dM8743f.m8841m() : null) == null || c1679dM8743f.m8841m().isEmpty()) {
            return defaultDedupeParameters;
        }
        if (!dedupingWithImplicitlyLoggedHistory) {
            return c1679dM8743f.m8841m();
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<String, List<String>> pair : c1679dM8743f.m8841m()) {
            Iterator<String> it = pair.getSecond().iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair(it.next(), CollectionsKt.listOf(pair.getFirst())));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final long m99946e() {
        Long dedupeWindow;
        C1679d c1679dM8743f = FetchedAppSettingsManager.m8743f(C1600c.m8102m());
        return ((c1679dM8743f != null ? c1679dM8743f.getDedupeWindow() : null) == null || ((dedupeWindow = c1679dM8743f.getDedupeWindow()) != null && dedupeWindow.longValue() == 0)) ? defaultDedupeWindow : c1679dM8743f.getDedupeWindow().longValue();
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final List<Pair<String, List<String>>> m99947f(boolean dedupingWithImplicitlyLoggedHistory) {
        List<Pair<String, List<String>>> listM8853y;
        C1679d c1679dM8743f = FetchedAppSettingsManager.m8743f(C1600c.m8102m());
        if (c1679dM8743f == null || (listM8853y = c1679dM8743f.m8853y()) == null || listM8853y.isEmpty()) {
            return null;
        }
        if (!dedupingWithImplicitlyLoggedHistory) {
            return c1679dM8743f.m8853y();
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<String, List<String>> pair : c1679dM8743f.m8853y()) {
            Iterator<String> it = pair.getSecond().iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair(it.next(), CollectionsKt.listOf(pair.getFirst())));
            }
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Double m99948g(@Nullable Double valueToSum, @Nullable Bundle parameters) {
        if (valueToSum != null) {
            return valueToSum;
        }
        Iterator<String> it = m99949h().iterator();
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
    public final List<String> m99949h() {
        C1679d c1679dM8743f = FetchedAppSettingsManager.m8743f(C1600c.m8102m());
        return ((c1679dM8743f != null ? c1679dM8743f.m8843o() : null) == null || c1679dM8743f.m8843o().isEmpty()) ? defaultValueParameterEquivalents : c1679dM8743f.m8843o();
    }
}
