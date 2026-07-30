package com.facebook.internal;

import android.R;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.vivo.push.PushClientConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u0011\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\t\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\rR&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001c"}, m87232d2 = {"Lcom/facebook/internal/FeatureManager;", "", "<init>", "()V", "Lcom/facebook/internal/FeatureManager$Feature;", "feature", "Lcom/facebook/internal/FeatureManager$a;", "callback", "", "a", "(Lcom/facebook/internal/FeatureManager$Feature;Lcom/facebook/internal/FeatureManager$a;)V", "", "g", "(Lcom/facebook/internal/FeatureManager$Feature;)Z", "c", "(Lcom/facebook/internal/FeatureManager$Feature;)V", "", PushClientConstants.TAG_CLASS_NAME, Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Lcom/facebook/internal/FeatureManager$Feature;", "f", "e", "b", "", "", "Ljava/util/Map;", "featureMapping", "Feature", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class FeatureManager {

    @NotNull
    public static final FeatureManager INSTANCE = new FeatureManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<Feature, String[]> featureMapping = new HashMap();

    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b7\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0011\u0010\r\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<¨\u0006="}, m87232d2 = {"Lcom/facebook/internal/FeatureManager$Feature;", "", "", "code", "<init>", "(Ljava/lang/String;II)V", "", "toString", "()Ljava/lang/String;", "toKey", "I", "getParent", "()Lcom/facebook/internal/FeatureManager$Feature;", "parent", "Companion", "a", "Unknown", "Core", "AppEvents", "CodelessEvents", "CloudBridge", "RestrictiveDataFiltering", "AAM", "PrivacyProtection", "SuggestedEvents", "IntelligentIntegrity", "ModelRequest", "ProtectedMode", "MACARuleMatching", "BlocklistEvents", "FilterRedactedEvents", "FilterSensitiveParams", "StdParamEnforcement", "BannedParamFiltering", "EventDeactivation", "OnDeviceEventProcessing", "OnDevicePostInstallEventProcessing", "IapLogging", "IapLoggingLib2", "IapLoggingLib5To7", "AndroidManualImplicitPurchaseDedupe", "AndroidManualImplicitSubsDedupe", "AndroidIAPSubscriptionAutoLogging", "Instrument", "CrashReport", "CrashShield", "ThreadCheck", "ErrorReport", "AnrReport", "Monitoring", "ServiceUpdateCompliance", "Megatron", "Elora", "GPSARATriggers", "GPSPACAProcessing", "GPSTopicsObservation", "Login", "ChromeCustomTabsPrefetching", "IgnoreAppSwitchToLoggedOut", "BypassAppSwitch", "Share", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public enum Feature {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        ProtectedMode(66564),
        MACARuleMatching(66565),
        BlocklistEvents(66566),
        FilterRedactedEvents(66567),
        FilterSensitiveParams(66568),
        StdParamEnforcement(R.attr.trimPathEnd),
        BannedParamFiltering(R.attr.trimPathOffset),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        IapLoggingLib5To7(67330),
        AndroidManualImplicitPurchaseDedupe(67331),
        AndroidManualImplicitSubsDedupe(67332),
        AndroidIAPSubscriptionAutoLogging(67333),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(io.agora.rtc2.Constants.AUDIO_ENCODING_TYPE_OPUS_16000_LOW),
        ThreadCheck(io.agora.rtc2.Constants.AUDIO_ENCODING_TYPE_OPUS_16000_MEDIUM),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        ServiceUpdateCompliance(196864),
        Megatron(262144),
        Elora(327680),
        GPSARATriggers(393216),
        GPSPACAProcessing(458752),
        GPSTopicsObservation(524288),
        Login(16777216),
        ChromeCustomTabsPrefetching(R.attr.theme),
        IgnoreAppSwitchToLoggedOut(R.id.background),
        BypassAppSwitch(R.style.Animation),
        Share(33554432);


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int code;

        /* JADX INFO: renamed from: com.facebook.internal.FeatureManager$Feature$a, reason: from kotlin metadata */
        @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lcom/facebook/internal/FeatureManager$Feature$a;", "", "<init>", "()V", "", "code", "Lcom/facebook/internal/FeatureManager$Feature;", "a", "(I)Lcom/facebook/internal/FeatureManager$Feature;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final Feature m8683a(int code) {
                for (Feature feature : Feature.values()) {
                    if (feature.code == code) {
                        return feature;
                    }
                }
                return Feature.Unknown;
            }

            public Companion() {
            }
        }

        /* JADX INFO: renamed from: com.facebook.internal.FeatureManager$Feature$b */
        @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
        public /* synthetic */ class C1641b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f6607a;

            static {
                int[] iArr = new int[Feature.values().length];
                try {
                    iArr[Feature.Core.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Feature.AppEvents.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Feature.CodelessEvents.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Feature.RestrictiveDataFiltering.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Feature.Instrument.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Feature.CrashReport.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Feature.CrashShield.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Feature.ThreadCheck.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Feature.ErrorReport.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[Feature.AnrReport.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[Feature.AAM.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[Feature.CloudBridge.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[Feature.PrivacyProtection.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[Feature.SuggestedEvents.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[Feature.IntelligentIntegrity.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[Feature.StdParamEnforcement.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[Feature.ProtectedMode.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[Feature.BannedParamFiltering.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[Feature.MACARuleMatching.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[Feature.BlocklistEvents.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[Feature.FilterRedactedEvents.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[Feature.FilterSensitiveParams.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[Feature.ModelRequest.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[Feature.EventDeactivation.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[Feature.OnDeviceEventProcessing.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[Feature.OnDevicePostInstallEventProcessing.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[Feature.IapLogging.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[Feature.IapLoggingLib2.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[Feature.IapLoggingLib5To7.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[Feature.AndroidManualImplicitPurchaseDedupe.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[Feature.AndroidManualImplicitSubsDedupe.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[Feature.AndroidIAPSubscriptionAutoLogging.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[Feature.Monitoring.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[Feature.Megatron.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[Feature.Elora.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[Feature.GPSARATriggers.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[Feature.GPSPACAProcessing.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[Feature.GPSTopicsObservation.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[Feature.ServiceUpdateCompliance.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[Feature.Login.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[Feature.ChromeCustomTabsPrefetching.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[Feature.IgnoreAppSwitchToLoggedOut.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[Feature.BypassAppSwitch.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[Feature.Share.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                f6607a = iArr;
            }
        }

        Feature(int i) {
            this.code = i;
        }

        @NotNull
        public final Feature getParent() {
            int i = this.code;
            if ((i & 255) > 0) {
                return INSTANCE.m8683a(i & (-256));
            }
            if ((65280 & i) > 0) {
                return INSTANCE.m8683a(i & (-65536));
            }
            return (16711680 & i) > 0 ? INSTANCE.m8683a(i & RoundedDrawable.DEFAULT_BORDER_COLOR) : INSTANCE.m8683a(0);
        }

        @NotNull
        public final String toKey() {
            return "FBSDKFeature" + this;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            switch (C1641b.f6607a[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "AppEventsCloudbridge";
                case 13:
                    return "PrivacyProtection";
                case 14:
                    return "SuggestedEvents";
                case 15:
                    return "IntelligentIntegrity";
                case 16:
                    return "StdParamEnforcement";
                case 17:
                    return "ProtectedMode";
                case 18:
                    return "BannedParamFiltering";
                case 19:
                    return "MACARuleMatching";
                case 20:
                    return "BlocklistEvents";
                case 21:
                    return "FilterRedactedEvents";
                case 22:
                    return "FilterSensitiveParams";
                case 23:
                    return "ModelRequest";
                case 24:
                    return "EventDeactivation";
                case 25:
                    return "OnDeviceEventProcessing";
                case 26:
                    return "OnDevicePostInstallEventProcessing";
                case 27:
                    return "IAPLogging";
                case 28:
                    return "IAPLoggingLib2";
                case 29:
                    return "IAPLoggingLib5To7";
                case 30:
                    return "AndroidManualImplicitPurchaseDedupe";
                case 31:
                    return "AndroidManualImplicitSubsDedupe";
                case 32:
                    return "AndroidIAPSubscriptionAutoLogging";
                case 33:
                    return "Monitoring";
                case 34:
                    return "Megatron";
                case 35:
                    return "Elora";
                case 36:
                    return "GPSARATriggers";
                case 37:
                    return "GPSPACAProcessing";
                case 38:
                    return "GPSTopicsObservation";
                case 39:
                    return "ServiceUpdateCompliance";
                case 40:
                    return "LoginKit";
                case 41:
                    return "ChromeCustomTabsPrefetching";
                case 42:
                    return "IgnoreAppSwitchToLoggedOut";
                case 43:
                    return "BypassAppSwitch";
                case 44:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.FeatureManager$a */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/facebook/internal/FeatureManager$a;", "", "", "enabled", "", "a", "(Z)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public interface InterfaceC1642a {
        /* JADX INFO: renamed from: a */
        void mo8684a(boolean enabled);
    }

    /* JADX INFO: renamed from: com.facebook.internal.FeatureManager$b */
    @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
    public /* synthetic */ class C1643b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6608a;

        static {
            int[] iArr = new int[Feature.values().length];
            try {
                iArr[Feature.RestrictiveDataFiltering.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Feature.Instrument.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Feature.CrashReport.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Feature.CrashShield.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Feature.ThreadCheck.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Feature.ErrorReport.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Feature.AnrReport.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Feature.AAM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Feature.CloudBridge.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Feature.PrivacyProtection.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Feature.SuggestedEvents.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Feature.IntelligentIntegrity.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Feature.ModelRequest.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Feature.EventDeactivation.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Feature.OnDeviceEventProcessing.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Feature.OnDevicePostInstallEventProcessing.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Feature.IapLogging.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[Feature.IapLoggingLib2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[Feature.IapLoggingLib5To7.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[Feature.AndroidManualImplicitPurchaseDedupe.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[Feature.AndroidManualImplicitSubsDedupe.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[Feature.AndroidIAPSubscriptionAutoLogging.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[Feature.BannedParamFiltering.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[Feature.ProtectedMode.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[Feature.StdParamEnforcement.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[Feature.MACARuleMatching.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[Feature.BlocklistEvents.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[Feature.FilterRedactedEvents.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[Feature.FilterSensitiveParams.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[Feature.ChromeCustomTabsPrefetching.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[Feature.Monitoring.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[Feature.IgnoreAppSwitchToLoggedOut.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[Feature.BypassAppSwitch.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[Feature.GPSARATriggers.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[Feature.GPSPACAProcessing.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[Feature.GPSTopicsObservation.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            f6608a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.FeatureManager$c */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/facebook/internal/FeatureManager$c", "Lcom/facebook/internal/c$a;", "", "onCompleted", "()V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C1644c implements C1655c.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC1642a f6609a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Feature f6610b;

        public C1644c(InterfaceC1642a interfaceC1642a, Feature feature) {
            this.f6609a = interfaceC1642a;
            this.f6610b = feature;
        }

        @Override // com.facebook.internal.C1655c.a
        public void onCompleted() {
            this.f6609a.mo8684a(FeatureManager.m8679g(this.f6610b));
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m8676a(@NotNull Feature feature, @NotNull InterfaceC1642a callback) {
        feature.getClass();
        callback.getClass();
        C1655c.m8767h(new C1644c(callback, feature));
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m8677c(@NotNull Feature feature) {
        feature.getClass();
        C1577c.m8047l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(feature.toKey(), C1577c.m8024C()).apply();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Feature m8678d(@NotNull String className) {
        className.getClass();
        INSTANCE.m8682f();
        for (Map.Entry<Feature, String[]> entry : featureMapping.entrySet()) {
            Feature key = entry.getKey();
            for (String str : entry.getValue()) {
                if (C15386d.m93483J(className, str, false, 2, null)) {
                    return key;
                }
            }
        }
        return Feature.Unknown;
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m8679g(@NotNull Feature feature) {
        feature.getClass();
        if (Feature.Unknown == feature) {
            return false;
        }
        if (Feature.Core == feature) {
            return true;
        }
        String string = C1577c.m8047l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(feature.toKey(), null);
        if (string != null && Intrinsics.m87488d(string, C1577c.m8024C())) {
            return false;
        }
        Feature parent = feature.getParent();
        if (parent == feature) {
            return INSTANCE.m8681e(feature);
        }
        return m8679g(parent) && INSTANCE.m8681e(feature);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8680b(Feature feature) {
        switch (C1643b.f6608a[feature.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                return false;
            default:
                return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m8681e(Feature feature) {
        return C1655c.m8766d(feature.toKey(), C1577c.m8048m(), m8680b(feature));
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m8682f() {
        Map<Feature, String[]> map = featureMapping;
        if (map.isEmpty()) {
            map.put(Feature.AAM, new String[]{"com.facebook.appevents.aam."});
            map.put(Feature.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
            map.put(Feature.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
            map.put(Feature.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
            map.put(Feature.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
            map.put(Feature.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
            map.put(Feature.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
            map.put(Feature.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put(Feature.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put(Feature.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
            map.put(Feature.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
            map.put(Feature.BlocklistEvents, new String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
            map.put(Feature.FilterRedactedEvents, new String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
            map.put(Feature.FilterSensitiveParams, new String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
            map.put(Feature.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
            map.put(Feature.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put(Feature.IapLogging, new String[]{"com.facebook.appevents.iap."});
            map.put(Feature.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
            map.put(Feature.GPSARATriggers, new String[]{"com.facebook.appevents.gps.ara.GpsARAManager"});
            map.put(Feature.GPSPACAProcessing, new String[]{"com.facebook.appevents.gps.pa.PACustomAudienceClient"});
            map.put(Feature.GPSTopicsObservation, new String[]{"com.facebook.appevents.gps.topics.GpsTopicsManager"});
        }
    }
}
