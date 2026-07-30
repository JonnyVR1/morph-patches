package p153l;

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
import android.p006os.OutcomeReceiver;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.appevents.AppEvent;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
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
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\u000f\u0010\nJ%\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006!"}, m88121d2 = {"Ll/t860;", "", "<init>", "()V", "", "c", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "eventName", "e", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/appevents/AppEvent;", NotificationCompat.CATEGORY_EVENT, Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Lcom/facebook/appevents/AppEvent;)V", "f", "g", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "a", "Ljava/lang/String;", "TAG", "", "b", "Z", "enabled", "isInitialized", "Landroid/adservices/customaudience/CustomAudienceManager;", "Landroid/adservices/customaudience/CustomAudienceManager;", "customAudienceManager", "Ll/p7k;", "Ll/p7k;", "gpsDebugLogger", "baseUri", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class t860 {

    @NotNull
    public static final t860 INSTANCE = new t860();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String TAG = "Fledge: ".concat(t860.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static boolean isInitialized;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static CustomAudienceManager customAudienceManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static p7k gpsDebugLogger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static String baseUri;

    /* JADX INFO: renamed from: l.t860$a */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00062\n\u0010\t\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"l/t860$a", "Landroid/os/OutcomeReceiver;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", LovePlanetStage.result, "", "onResult", "(Ljava/lang/Object;)V", "error", "a", "(Ljava/lang/Exception;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C20256a implements OutcomeReceiver {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(@NotNull Exception error) {
            error.getClass();
            Log.e(t860.m189639b(), error.toString());
            p7k p7kVarM189638a = t860.m189638a();
            if (p7kVarM189638a == null) {
                Intrinsics.m88391r("gpsDebugLogger");
                p7kVarM189638a = null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", error.toString());
            Unit unit = Unit.INSTANCE;
            p7kVarM189638a.m171156b("gps_pa_failed", bundle);
        }

        public void onResult(@NotNull Object result) {
            result.getClass();
            t860.m189639b();
            p7k p7kVarM189638a = t860.m189638a();
            if (p7kVarM189638a == null) {
                Intrinsics.m88391r("gpsDebugLogger");
                p7kVarM189638a = null;
            }
            p7kVarM189638a.m171156b("gps_pa_succeed", null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ p7k m189638a() {
        if (ztb.m221490d(t860.class)) {
            return null;
        }
        try {
            return gpsDebugLogger;
        } catch (Throwable th) {
            ztb.m221488b(th, t860.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ String m189639b() {
        if (ztb.m221490d(t860.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            ztb.m221488b(th, t860.class);
            return null;
        }
    }

    @JvmStatic
    @TargetApi(34)
    /* JADX INFO: renamed from: c */
    public static final void m189640c() {
        String string;
        if (ztb.m221490d(t860.class)) {
            return;
        }
        try {
            isInitialized = true;
            Context contextM8101l = C1600c.m8101l();
            gpsDebugLogger = new p7k(contextM8101l);
            baseUri = "https://www." + C1600c.m8111v() + "/privacy_sandbox/pa/logic";
            p7k p7kVar = null;
            try {
                CustomAudienceManager customAudienceManager2 = CustomAudienceManager.get(contextM8101l);
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
            p7k p7kVar2 = gpsDebugLogger;
            if (p7kVar2 == null) {
                Intrinsics.m88391r("gpsDebugLogger");
            } else {
                p7kVar = p7kVar2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", string);
            Unit unit = Unit.INSTANCE;
            p7kVar.m171156b("gps_pa_failed", bundle);
        } catch (Throwable th) {
            ztb.m221488b(th, t860.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m189641d(@Nullable String appId, @Nullable AppEvent event) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            if (!isInitialized) {
                m189640c();
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
                m189643f(appId, string);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m189642e(@Nullable String appId, @Nullable String eventName) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            if (!isInitialized) {
                m189640c();
            }
            if (enabled) {
                m189643f(appId, eventName);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @TargetApi(34)
    /* JADX INFO: renamed from: f */
    public final void m189643f(String appId, String eventName) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            String strM189644g = m189644g(appId, eventName);
            if (strM189644g == null) {
                return;
            }
            p7k p7kVar = null;
            try {
                OutcomeReceiver outcomeReceiverM138915a = i760.m138915a(new C20256a());
                h860.m133905a();
                AdData.Builder builderM114785a = d860.m114785a();
                StringBuilder sb = new StringBuilder();
                String str = baseUri;
                if (str == null) {
                    Intrinsics.m88391r("baseUri");
                    str = null;
                }
                sb.append(str);
                sb.append("/ad");
                Uri uri = Uri.parse(sb.toString());
                uri.getClass();
                AdData adDataBuild = builderM114785a.setRenderUri(uri).setMetadata("{'isRealAd': false}").build();
                adDataBuild.getClass();
                i860.m138995a();
                TrustedBiddingData.Builder builderM119805a = e860.m119805a();
                StringBuilder sb2 = new StringBuilder();
                String str2 = baseUri;
                if (str2 == null) {
                    Intrinsics.m88391r("baseUri");
                    str2 = null;
                }
                sb2.append(str2);
                sb2.append("?trusted_bidding");
                Uri uri2 = Uri.parse(sb2.toString());
                uri2.getClass();
                TrustedBiddingData trustedBiddingDataBuild = builderM119805a.setTrustedBiddingUri(uri2).setTrustedBiddingKeys(CollectionsKt.listOf("")).build();
                trustedBiddingDataBuild.getClass();
                j860.m143829a();
                CustomAudience.Builder buyer = f860.m124515a().setName(strM189644g).setBuyer(AdTechIdentifier.fromString("facebook.com"));
                StringBuilder sb3 = new StringBuilder();
                String str3 = baseUri;
                if (str3 == null) {
                    Intrinsics.m88391r("baseUri");
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
                    Intrinsics.m88391r("baseUri");
                    str4 = null;
                }
                sb4.append(str4);
                sb4.append("?bidding");
                Uri uri4 = Uri.parse(sb4.toString());
                uri4.getClass();
                CustomAudience customAudienceBuild = dailyUpdateUri.setBiddingLogicUri(uri4).setTrustedBiddingData(trustedBiddingDataBuild).setUserBiddingSignals(AdSelectionSignals.fromString(WeJson.EMPTY_MAP)).setAds(CollectionsKt.listOf(adDataBuild)).build();
                customAudienceBuild.getClass();
                k860.m148686a();
                JoinCustomAudienceRequest joinCustomAudienceRequestBuild = g860.m129374a().setCustomAudience(customAudienceBuild).build();
                joinCustomAudienceRequestBuild.getClass();
                CustomAudienceManager customAudienceManager2 = customAudienceManager;
                if (customAudienceManager2 != null) {
                    customAudienceManager2.joinCustomAudience(joinCustomAudienceRequestBuild, Executors.newSingleThreadExecutor(), outcomeReceiverM138915a);
                }
            } catch (Error e) {
                e.toString();
                p7k p7kVar2 = gpsDebugLogger;
                if (p7kVar2 == null) {
                    Intrinsics.m88391r("gpsDebugLogger");
                } else {
                    p7kVar = p7kVar2;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_pa_failed_reason", e.toString());
                Unit unit = Unit.INSTANCE;
                p7kVar.m171156b("gps_pa_failed", bundle);
            } catch (Exception e2) {
                e2.toString();
                p7k p7kVar3 = gpsDebugLogger;
                if (p7kVar3 == null) {
                    Intrinsics.m88391r("gpsDebugLogger");
                } else {
                    p7kVar = p7kVar3;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_pa_failed_reason", e2.toString());
                Unit unit2 = Unit.INSTANCE;
                p7kVar.m171156b("gps_pa_failed", bundle2);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m189644g(String appId, String eventName) {
        if (!ztb.m221490d(this) && appId != null && eventName != null) {
            try {
                if (!Intrinsics.m88377d(eventName, "_removed_") && !StringsKt.m94303P(eventName, "gps", false, 2, null)) {
                    return appId + '@' + eventName + '@' + (System.currentTimeMillis() / 1000) + "@1";
                }
                return null;
            } catch (Throwable th) {
                ztb.m221488b(th, this);
            }
        }
        return null;
    }
}
