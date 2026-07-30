package com.clevertap.android.sdk.inapp;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppType;", "", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "a", "CTInAppTypeHTML", "CTInAppTypeCoverHTML", "CTInAppTypeInterstitialHTML", "CTInAppTypeHeaderHTML", "CTInAppTypeFooterHTML", "CTInAppTypeHalfInterstitialHTML", "CTInAppTypeCover", "CTInAppTypeInterstitial", "CTInAppTypeHalfInterstitial", "CTInAppTypeHeader", "CTInAppTypeFooter", "CTInAppTypeAlert", "CTInAppTypeCoverImageOnly", "CTInAppTypeInterstitialImageOnly", "CTInAppTypeHalfInterstitialImageOnly", "CTInAppTypeCustomCodeTemplate", "CTInAppTypePIP", "UNKNOWN", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public enum CTInAppType {
    CTInAppTypeHTML(Constants.INAPP_HTML_TAG),
    CTInAppTypeCoverHTML("coverHtml"),
    CTInAppTypeInterstitialHTML("interstitialHtml"),
    CTInAppTypeHeaderHTML("headerHtml"),
    CTInAppTypeFooterHTML("footerHtml"),
    CTInAppTypeHalfInterstitialHTML("halfInterstitialHtml"),
    CTInAppTypeCover("cover"),
    CTInAppTypeInterstitial("interstitial"),
    CTInAppTypeHalfInterstitial("half-interstitial"),
    CTInAppTypeHeader("header-template"),
    CTInAppTypeFooter("footer-template"),
    CTInAppTypeAlert("alert-template"),
    CTInAppTypeCoverImageOnly("cover-image"),
    CTInAppTypeInterstitialImageOnly("interstitial-image"),
    CTInAppTypeHalfInterstitialImageOnly("half-interstitial-image"),
    CTInAppTypeCustomCodeTemplate("custom-code"),
    CTInAppTypePIP("pip"),
    UNKNOWN("");


    @NotNull
    private final String type;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.CTInAppType$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppType$a;", "", "<init>", "()V", "", "type", "Lcom/clevertap/android/sdk/inapp/CTInAppType;", "a", "(Ljava/lang/String;)Lcom/clevertap/android/sdk/inapp/CTInAppType;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final CTInAppType m6260a(@Nullable String type) {
            if (type != null) {
                switch (type.hashCode()) {
                    case -1824210231:
                        if (type.equals("custom-code")) {
                            return CTInAppType.CTInAppTypeCustomCodeTemplate;
                        }
                        break;
                    case -1698613420:
                        if (type.equals("half-interstitial-image")) {
                            return CTInAppType.CTInAppTypeHalfInterstitialImageOnly;
                        }
                        break;
                    case -1258935355:
                        if (type.equals("cover-image")) {
                            return CTInAppType.CTInAppTypeCoverImageOnly;
                        }
                        break;
                    case -1160074422:
                        if (type.equals("halfInterstitialHtml")) {
                            return CTInAppType.CTInAppTypeHalfInterstitialHTML;
                        }
                        break;
                    case -1141304454:
                        if (type.equals("interstitial-image")) {
                            return CTInAppType.CTInAppTypeInterstitialImageOnly;
                        }
                        break;
                    case -728863497:
                        if (type.equals("interstitialHtml")) {
                            return CTInAppType.CTInAppTypeInterstitialHTML;
                        }
                        break;
                    case -334055316:
                        if (type.equals("footer-template")) {
                            return CTInAppType.CTInAppTypeFooter;
                        }
                        break;
                    case -37253685:
                        if (type.equals("alert-template")) {
                            return CTInAppType.CTInAppTypeAlert;
                        }
                        break;
                    case 110999:
                        if (type.equals("pip")) {
                            return CTInAppType.CTInAppTypePIP;
                        }
                        break;
                    case 3213227:
                        if (type.equals(Constants.INAPP_HTML_TAG)) {
                            return CTInAppType.CTInAppTypeHTML;
                        }
                        break;
                    case 94852023:
                        if (type.equals("cover")) {
                            return CTInAppType.CTInAppTypeCover;
                        }
                        break;
                    case 604727084:
                        if (type.equals("interstitial")) {
                            return CTInAppType.CTInAppTypeInterstitial;
                        }
                        break;
                    case 894039686:
                        if (type.equals("half-interstitial")) {
                            return CTInAppType.CTInAppTypeHalfInterstitial;
                        }
                        break;
                    case 1189018554:
                        if (type.equals("header-template")) {
                            return CTInAppType.CTInAppTypeHeader;
                        }
                        break;
                    case 1420225510:
                        if (type.equals("footerHtml")) {
                            return CTInAppType.CTInAppTypeFooterHTML;
                        }
                        break;
                    case 1977176024:
                        if (type.equals("headerHtml")) {
                            return CTInAppType.CTInAppTypeHeaderHTML;
                        }
                        break;
                    case 1979390978:
                        if (type.equals("coverHtml")) {
                            return CTInAppType.CTInAppTypeCoverHTML;
                        }
                        break;
                }
            }
            return CTInAppType.UNKNOWN;
        }

        private Companion() {
        }
    }

    CTInAppType(String str) {
        this.type = str;
    }

    @NotNull
    public static EnumEntries<CTInAppType> getEntries() {
        return $ENTRIES;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.type;
    }
}
