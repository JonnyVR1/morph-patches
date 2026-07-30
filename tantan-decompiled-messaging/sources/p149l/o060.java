package p149l;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.p005os.OutcomeReceiver;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.appevents.AppEvent;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\u000f\u0010\nJ%\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006!"}, m87232d2 = {"Ll/o060;", "", "<init>", "()V", "", "c", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "eventName", "e", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/appevents/AppEvent;", NotificationCompat.CATEGORY_EVENT, Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Lcom/facebook/appevents/AppEvent;)V", "f", "g", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "a", "Ljava/lang/String;", "TAG", "", "b", "Z", "enabled", "isInitialized", "Landroid/adservices/customaudience/CustomAudienceManager;", "Landroid/adservices/customaudience/CustomAudienceManager;", "customAudienceManager", "Ll/x4k;", "Ll/x4k;", "gpsDebugLogger", "baseUri", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class o060 {

    @NotNull
    public static final o060 INSTANCE = new o060();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String TAG = "Fledge: ".concat(o060.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean isInitialized;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static CustomAudienceManager customAudienceManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static x4k gpsDebugLogger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static String baseUri;

    /* JADX INFO: renamed from: l.o060$a */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00062\n\u0010\t\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"l/o060$a", "Landroid/os/OutcomeReceiver;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", LovePlanetStage.result, "", "onResult", "(Ljava/lang/Object;)V", "error", "a", "(Ljava/lang/Exception;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C18809a implements OutcomeReceiver {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(@NotNull Exception error) {
            error.getClass();
            Log.e(o060.m162123b(), error.toString());
            x4k x4kVarM162122a = o060.m162122a();
            if (x4kVarM162122a == null) {
                Intrinsics.m87502r("gpsDebugLogger");
                x4kVarM162122a = null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", error.toString());
            Unit unit = Unit.INSTANCE;
            x4kVarM162122a.m206989b("gps_pa_failed", bundle);
        }

        public void onResult(@NotNull Object result) {
            result.getClass();
            o060.m162123b();
            x4k x4kVarM162122a = o060.m162122a();
            if (x4kVarM162122a == null) {
                Intrinsics.m87502r("gpsDebugLogger");
                x4kVarM162122a = null;
            }
            x4kVarM162122a.m206989b("gps_pa_succeed", null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ x4k m162122a() {
        if (lsb.m151554d(o060.class)) {
            return null;
        }
        try {
            return gpsDebugLogger;
        } catch (Throwable th) {
            lsb.m151552b(th, o060.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ String m162123b() {
        if (lsb.m151554d(o060.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            lsb.m151552b(th, o060.class);
            return null;
        }
    }

    @JvmStatic
    @TargetApi(34)
    /* JADX INFO: renamed from: c */
    public static final void m162124c() {
        String string;
        if (lsb.m151554d(o060.class)) {
            return;
        }
        try {
            isInitialized = true;
            Context contextM8047l = C1577c.m8047l();
            gpsDebugLogger = new x4k(contextM8047l);
            baseUri = "https://www." + C1577c.m8057v() + "/privacy_sandbox/pa/logic";
            x4k x4kVar = null;
            try {
                CustomAudienceManager customAudienceManager2 = CustomAudienceManager.get(contextM8047l);
                customAudienceManager = customAudienceManager2;
                if (customAudienceManager2 != null) {
                    enabled = true;
                }
                string = null;
            } catch (Error e) {
                string = e.toString();
                e.toString();
            } catch (Exception e2) {
                string = e2.toString();
                e2.toString();
            }
            if (enabled) {
                return;
            }
            x4k x4kVar2 = gpsDebugLogger;
            if (x4kVar2 == null) {
                Intrinsics.m87502r("gpsDebugLogger");
            } else {
                x4kVar = x4kVar2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", string);
            Unit unit = Unit.INSTANCE;
            x4kVar.m206989b("gps_pa_failed", bundle);
        } catch (Throwable th) {
            lsb.m151552b(th, o060.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m162125d(@Nullable String appId, @Nullable AppEvent event) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (!isInitialized) {
                m162124c();
            }
            if (enabled) {
                String string = null;
                if (event != null) {
                    try {
                        JSONObject jsonObject = event.getJsonObject();
                        if (jsonObject != null) {
                            string = jsonObject.getString("_eventName");
                        }
                    } catch (JSONException unused) {
                    }
                }
                m162127f(appId, string);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m162126e(@Nullable String appId, @Nullable String eventName) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (!isInitialized) {
                m162124c();
            }
            if (enabled) {
                m162127f(appId, eventName);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @TargetApi(34)
    /* JADX INFO: renamed from: f */
    public final void m162127f(String appId, String eventName) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            String strM162128g = m162128g(appId, eventName);
            if (strM162128g == null) {
                return;
            }
            x4k x4kVar = null;
            try {
                OutcomeReceiver outcomeReceiverM114111a = dz50.m114111a(new C18809a());
                c060.m104727a();
                AdData.Builder builderM216595a = yz50.m216595a();
                StringBuilder sb = new StringBuilder();
                String str = baseUri;
                if (str == null) {
                    Intrinsics.m87502r("baseUri");
                    str = null;
                }
                sb.append(str);
                sb.append("/ad");
                Uri uri = Uri.parse(sb.toString());
                uri.getClass();
                AdData adDataBuild = builderM216595a.setRenderUri(uri).setMetadata("{'isRealAd': false}").build();
                adDataBuild.getClass();
                d060.m109454a();
                TrustedBiddingData.Builder builderM220996a = zz50.m220996a();
                StringBuilder sb2 = new StringBuilder();
                String str2 = baseUri;
                if (str2 == null) {
                    Intrinsics.m87502r("baseUri");
                    str2 = null;
                }
                sb2.append(str2);
                sb2.append("?trusted_bidding");
                Uri uri2 = Uri.parse(sb2.toString());
                uri2.getClass();
                TrustedBiddingData trustedBiddingDataBuild = builderM220996a.setTrustedBiddingUri(uri2).setTrustedBiddingKeys(CollectionsKt.listOf("")).build();
                trustedBiddingDataBuild.getClass();
                e060.m114170a();
                CustomAudience.Builder buyer = a060.m94396a().setName(strM162128g).setBuyer(AdTechIdentifier.fromString("facebook.com"));
                StringBuilder sb3 = new StringBuilder();
                String str3 = baseUri;
                if (str3 == null) {
                    Intrinsics.m87502r("baseUri");
                    str3 = null;
                }
                sb3.append(str3);
                sb3.append("?daily&app_id=");
                sb3.append(appId);
                Uri uri3 = Uri.parse(sb3.toString());
                uri3.getClass();
                CustomAudience.Builder dailyUpdateUri = buyer.setDailyUpdateUri(uri3);
                StringBuilder sb4 = new StringBuilder();
                String str4 = baseUri;
                if (str4 == null) {
                    Intrinsics.m87502r("baseUri");
                    str4 = null;
                }
                sb4.append(str4);
                sb4.append("?bidding");
                Uri uri4 = Uri.parse(sb4.toString());
                uri4.getClass();
                CustomAudience customAudienceBuild = dailyUpdateUri.setBiddingLogicUri(uri4).setTrustedBiddingData(trustedBiddingDataBuild).setUserBiddingSignals(AdSelectionSignals.fromString(WeJson.EMPTY_MAP)).setAds(CollectionsKt.listOf(adDataBuild)).build();
                customAudienceBuild.getClass();
                f060.m119034a();
                JoinCustomAudienceRequest joinCustomAudienceRequestBuild = b060.m99743a().setCustomAudience(customAudienceBuild).build();
                joinCustomAudienceRequestBuild.getClass();
                CustomAudienceManager customAudienceManager2 = customAudienceManager;
                if (customAudienceManager2 != null) {
                    customAudienceManager2.joinCustomAudience(joinCustomAudienceRequestBuild, Executors.newSingleThreadExecutor(), outcomeReceiverM114111a);
                }
            } catch (Error e) {
                e.toString();
                x4k x4kVar2 = gpsDebugLogger;
                if (x4kVar2 == null) {
                    Intrinsics.m87502r("gpsDebugLogger");
                } else {
                    x4kVar = x4kVar2;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_pa_failed_reason", e.toString());
                Unit unit = Unit.INSTANCE;
                x4kVar.m206989b("gps_pa_failed", bundle);
            } catch (Exception e2) {
                e2.toString();
                x4k x4kVar3 = gpsDebugLogger;
                if (x4kVar3 == null) {
                    Intrinsics.m87502r("gpsDebugLogger");
                } else {
                    x4kVar = x4kVar3;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_pa_failed_reason", e2.toString());
                Unit unit2 = Unit.INSTANCE;
                x4kVar.m206989b("gps_pa_failed", bundle2);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m162128g(String appId, String eventName) {
        if (!lsb.m151554d(this) && appId != null && eventName != null) {
            try {
                if (!Intrinsics.m87488d(eventName, "_removed_") && !StringsKt.m93412P(eventName, "gps", false, 2, null)) {
                    return appId + '@' + eventName + '@' + (System.currentTimeMillis() / 1000) + "@1";
                }
                return null;
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        }
        return null;
    }
}
