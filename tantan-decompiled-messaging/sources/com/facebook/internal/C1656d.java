package com.facebook.internal;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p149l.b2s;

/* JADX INFO: renamed from: com.facebook.internal.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b=\u0018\u0000 h2\u00020\u0001:\u000224B\u008f\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&\u0012 \u0010*\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040&0)\u0018\u00010&\u0012 \u0010+\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040&0)\u0018\u00010&\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0002¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00101R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR/\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f0\f8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u00103\u001a\u0004\b2\u00101R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bF\u0010IR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u00105\u001a\u0004\bK\u00107R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bL\u00105\u001a\u0004\bM\u00107R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\bJ\u00101R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b:\u00101R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bG\u0010PR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bQ\u00105\u001a\u0004\bR\u00107R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u00103\u001a\u0004\bT\u00101R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u00103\u001a\u0004\bV\u00101R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bW\u00105\u001a\u0004\bU\u00107R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bX\u00105\u001a\u0004\bY\u00107R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bZ\u00105\u001a\u0004\bX\u00107R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bR\u0010O\u001a\u0004\bQ\u0010PR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b[\u0010O\u001a\u0004\bL\u0010PR%\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b<\u0010C\u001a\u0004\b\\\u0010ER\u0019\u0010!\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b@\u0010O\u001a\u0004\b8\u0010PR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bY\u0010O\u001a\u0004\bW\u0010PR\u0019\u0010#\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b]\u0010O\u001a\u0004\b[\u0010PR\u0019\u0010$\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b0\u0010O\u001a\u0004\bZ\u0010PR\u0019\u0010%\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b^\u0010O\u001a\u0004\b4\u0010PR\u001f\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\b>\u0010aR\u001f\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bb\u0010`\u001a\u0004\bS\u0010aR1\u0010*\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040&0)\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bc\u0010`\u001a\u0004\bN\u0010aR1\u0010+\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040&0)\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bd\u0010`\u001a\u0004\b]\u0010aR\u0019\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bB\u0010g¨\u0006i"}, m87232d2 = {"Lcom/facebook/internal/d;", "", "", "supportsImplicitLogging", "", "nuxContent", "nuxEnabled", "", "sessionTimeoutInSeconds", "Ljava/util/EnumSet;", "Lcom/facebook/internal/SmartLoginOption;", "smartLoginOptions", "", "Lcom/facebook/internal/d$b;", "dialogConfigurations", "automaticLoggingEnabled", "Lcom/facebook/internal/a;", "errorClassification", "smartLoginBookmarkIconURL", "smartLoginMenuIconURL", "iAPAutomaticLoggingEnabled", "codelessEventsEnabled", "Lorg/json/JSONArray;", "eventBindings", "sdkUpdateMessage", "trackUninstallEnabled", "monitorViaDialogEnabled", "rawAamRules", "suggestedEventsSetting", "restrictiveDataSetting", "protectedModeStandardParamsSetting", "MACARuleMatchingSetting", "migratedAutoLogValues", "blocklistEvents", "redactedEvents", "sensitiveParams", "schemaRestrictions", "bannedParams", "", "currencyDedupeParameters", "purchaseValueDedupeParameters", "Lkotlin/Pair;", "prodDedupeParameters", "testDedupeParameters", "", "dedupeWindow", "<init>", "(ZLjava/lang/String;ZILjava/util/EnumSet;Ljava/util/Map;ZLcom/facebook/internal/a;Ljava/lang/String;Ljava/lang/String;ZZLorg/json/JSONArray;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/util/Map;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V", BaseSei.f13932Z, "()Z", "a", "Z", "b", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "c", BLiveStormDanmakuGiftResourceType.f44444l, Constants.INAPP_DATA_TAG, "I", ResourceDirection.f38808v, "()I", "e", "Ljava/util/EnumSet;", "w", "()Ljava/util/EnumSet;", "f", "Ljava/util/Map;", "getDialogConfigurations", "()Ljava/util/Map;", "g", "h", "Lcom/facebook/internal/a;", "()Lcom/facebook/internal/a;", RXScreenCaptureService.KEY_INDEX, "getSmartLoginBookmarkIconURL", "j", "getSmartLoginMenuIconURL", "m", "Lorg/json/JSONArray;", "()Lorg/json/JSONArray;", "n", Constants.KEY_T, "o", "getTrackUninstallEnabled", "p", "getMonitorViaDialogEnabled", "q", "r", BaseSei.f13930X, BLiveStormDanmakuGiftResourceType.f44446s, "u", "getMigratedAutoLogValues", BaseSei.f13931Y, "A", "B", "Ljava/util/List;", "()Ljava/util/List;", b2s.C_ZONE, "D", "E", "F", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C1656d {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public final JSONArray bannedParams;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public final List<String> currencyDedupeParameters;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public final List<String> purchaseValueDedupeParameters;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public final List<Pair<String, List<String>>> prodDedupeParameters;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public final List<Pair<String, List<String>>> testDedupeParameters;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public final Long dedupeWindow;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean supportsImplicitLogging;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String nuxContent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean nuxEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int sessionTimeoutInSeconds;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final EnumSet<SmartLoginOption> smartLoginOptions;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Map<String, b>> dialogConfigurations;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean automaticLoggingEnabled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C1653a errorClassification;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String smartLoginBookmarkIconURL;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final String smartLoginMenuIconURL;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final boolean iAPAutomaticLoggingEnabled;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final boolean codelessEventsEnabled;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final JSONArray eventBindings;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final String sdkUpdateMessage;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final boolean trackUninstallEnabled;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final boolean monitorViaDialogEnabled;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public final String rawAamRules;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public final String suggestedEventsSetting;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public final String restrictiveDataSetting;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public final JSONArray protectedModeStandardParamsSetting;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public final JSONArray MACARuleMatchingSetting;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public final Map<String, Boolean> migratedAutoLogValues;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public final JSONArray blocklistEvents;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public final JSONArray redactedEvents;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public final JSONArray sensitiveParams;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public final JSONArray schemaRestrictions;

    /* JADX WARN: Multi-variable type inference failed */
    public C1656d(boolean z, @NotNull String str, boolean z2, int i, @NotNull EnumSet<SmartLoginOption> enumSet, @NotNull Map<String, ? extends Map<String, b>> map, boolean z3, @NotNull C1653a c1653a, @NotNull String str2, @NotNull String str3, boolean z4, boolean z5, @Nullable JSONArray jSONArray, @NotNull String str4, boolean z6, boolean z7, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable JSONArray jSONArray2, @Nullable JSONArray jSONArray3, @Nullable Map<String, Boolean> map2, @Nullable JSONArray jSONArray4, @Nullable JSONArray jSONArray5, @Nullable JSONArray jSONArray6, @Nullable JSONArray jSONArray7, @Nullable JSONArray jSONArray8, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<? extends Pair<String, ? extends List<String>>> list3, @Nullable List<? extends Pair<String, ? extends List<String>>> list4, @Nullable Long l2) {
        str.getClass();
        enumSet.getClass();
        map.getClass();
        c1653a.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.supportsImplicitLogging = z;
        this.nuxContent = str;
        this.nuxEnabled = z2;
        this.sessionTimeoutInSeconds = i;
        this.smartLoginOptions = enumSet;
        this.dialogConfigurations = map;
        this.automaticLoggingEnabled = z3;
        this.errorClassification = c1653a;
        this.smartLoginBookmarkIconURL = str2;
        this.smartLoginMenuIconURL = str3;
        this.iAPAutomaticLoggingEnabled = z4;
        this.codelessEventsEnabled = z5;
        this.eventBindings = jSONArray;
        this.sdkUpdateMessage = str4;
        this.trackUninstallEnabled = z6;
        this.monitorViaDialogEnabled = z7;
        this.rawAamRules = str5;
        this.suggestedEventsSetting = str6;
        this.restrictiveDataSetting = str7;
        this.protectedModeStandardParamsSetting = jSONArray2;
        this.MACARuleMatchingSetting = jSONArray3;
        this.migratedAutoLogValues = map2;
        this.blocklistEvents = jSONArray4;
        this.redactedEvents = jSONArray5;
        this.sensitiveParams = jSONArray6;
        this.schemaRestrictions = jSONArray7;
        this.bannedParams = jSONArray8;
        this.currencyDedupeParameters = list;
        this.purchaseValueDedupeParameters = list2;
        this.prodDedupeParameters = list3;
        this.testDedupeParameters = list4;
        this.dedupeWindow = l2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAutomaticLoggingEnabled() {
        return this.automaticLoggingEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final JSONArray getBannedParams() {
        return this.bannedParams;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final JSONArray getBlocklistEvents() {
        return this.blocklistEvents;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getCodelessEventsEnabled() {
        return this.codelessEventsEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final List<String> m8779e() {
        return this.currencyDedupeParameters;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getDedupeWindow() {
        return this.dedupeWindow;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final C1653a getErrorClassification() {
        return this.errorClassification;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final JSONArray getEventBindings() {
        return this.eventBindings;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIAPAutomaticLoggingEnabled() {
        return this.iAPAutomaticLoggingEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final JSONArray getMACARuleMatchingSetting() {
        return this.MACARuleMatchingSetting;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getNuxContent() {
        return this.nuxContent;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getNuxEnabled() {
        return this.nuxEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final List<Pair<String, List<String>>> m8787m() {
        return this.prodDedupeParameters;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final JSONArray getProtectedModeStandardParamsSetting() {
        return this.protectedModeStandardParamsSetting;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final List<String> m8789o() {
        return this.purchaseValueDedupeParameters;
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getRawAamRules() {
        return this.rawAamRules;
    }

    @Nullable
    /* JADX INFO: renamed from: q, reason: from getter */
    public final JSONArray getRedactedEvents() {
        return this.redactedEvents;
    }

    @Nullable
    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getRestrictiveDataSetting() {
        return this.restrictiveDataSetting;
    }

    @Nullable
    /* JADX INFO: renamed from: s, reason: from getter */
    public final JSONArray getSchemaRestrictions() {
        return this.schemaRestrictions;
    }

    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getSdkUpdateMessage() {
        return this.sdkUpdateMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public final JSONArray getSensitiveParams() {
        return this.sensitiveParams;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final int getSessionTimeoutInSeconds() {
        return this.sessionTimeoutInSeconds;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final EnumSet<SmartLoginOption> m8797w() {
        return this.smartLoginOptions;
    }

    @Nullable
    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getSuggestedEventsSetting() {
        return this.suggestedEventsSetting;
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    public final List<Pair<String, List<String>>> m8799y() {
        return this.testDedupeParameters;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final boolean getSupportsImplicitLogging() {
        return this.supportsImplicitLogging;
    }

    /* JADX INFO: renamed from: com.facebook.internal.d$b */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0011\u0018\u0000 \u00172\u00020\u0001:\u0001\u000bB-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m87232d2 = {"Lcom/facebook/internal/d$b;", "", "", "dialogName", "featureName", "Landroid/net/Uri;", "fallbackUrl", "", "versionSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;[I)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "c", "Landroid/net/Uri;", "getFallbackUrl", "()Landroid/net/Uri;", Constants.INAPP_DATA_TAG, "[I", "getVersionSpec", "()[I", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String dialogName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String featureName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final Uri fallbackUrl;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final int[] versionSpec;

        /* JADX INFO: renamed from: com.facebook.internal.d$b$a, reason: from kotlin metadata */
        @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, m87232d2 = {"Lcom/facebook/internal/d$b$a;", "", "<init>", "()V", "Lorg/json/JSONObject;", "dialogConfigJSON", "Lcom/facebook/internal/d$b;", "a", "(Lorg/json/JSONObject;)Lcom/facebook/internal/d$b;", "Lorg/json/JSONArray;", "versionsJSON", "", "b", "(Lorg/json/JSONArray;)[I", "", "DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR", "Ljava/lang/String;", "DIALOG_CONFIG_NAME_KEY", "DIALOG_CONFIG_URL_KEY", "DIALOG_CONFIG_VERSIONS_KEY", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            /* JADX INFO: renamed from: a */
            public final b m8803a(@NotNull JSONObject dialogConfigJSON) {
                dialogConfigJSON.getClass();
                String strOptString = dialogConfigJSON.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
                if (C1657e.m8832c0(strOptString)) {
                    return null;
                }
                strOptString.getClass();
                List listSplit$default = StringsKt.split$default(strOptString, new String[]{"|"}, false, 0, 6, null);
                if (listSplit$default.size() != 2) {
                    return null;
                }
                String str = (String) CollectionsKt.first(listSplit$default);
                String str2 = (String) CollectionsKt.last(listSplit$default);
                if (C1657e.m8832c0(str) || C1657e.m8832c0(str2)) {
                    return null;
                }
                String strOptString2 = dialogConfigJSON.optString("url");
                return new b(str, str2, C1657e.m8832c0(strOptString2) ? null : Uri.parse(strOptString2), m8804b(dialogConfigJSON.optJSONArray("versions")), null);
            }

            /* JADX INFO: renamed from: b */
            public final int[] m8804b(JSONArray versionsJSON) {
                if (versionsJSON == null) {
                    return null;
                }
                int length = versionsJSON.length();
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    int i2 = -1;
                    int iOptInt = versionsJSON.optInt(i, -1);
                    if (iOptInt == -1) {
                        String strOptString = versionsJSON.optString(i);
                        if (!C1657e.m8832c0(strOptString)) {
                            try {
                                strOptString.getClass();
                                i2 = Integer.parseInt(strOptString);
                            } catch (NumberFormatException e) {
                                C1657e.m8842i0("FacebookSDK", e);
                            }
                            iOptInt = i2;
                        }
                    }
                    iArr[i] = iOptInt;
                }
                return iArr;
            }

            public Companion() {
            }
        }

        public b(String str, String str2, Uri uri, int[] iArr) {
            this.dialogName = str;
            this.featureName = str2;
            this.fallbackUrl = uri;
            this.versionSpec = iArr;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDialogName() {
            return this.dialogName;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFeatureName() {
            return this.featureName;
        }

        public /* synthetic */ b(String str, String str2, Uri uri, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, uri, iArr);
        }
    }
}
