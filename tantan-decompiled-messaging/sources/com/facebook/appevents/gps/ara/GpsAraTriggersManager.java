package com.facebook.appevents.gps.ara;

import android.adservices.measurement.MeasurementManager;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.p005os.OutcomeReceiver;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.gps.ara.GpsAraTriggersManager;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.net.URLEncoder;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p149l.dz50;
import p149l.kfx;
import p149l.lfx;
import p149l.lsb;
import p149l.x4k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015¨\u0006\u001f"}, m87232d2 = {"Lcom/facebook/appevents/gps/ara/GpsAraTriggersManager;", "", "<init>", "()V", "", "e", "", "applicationId", "Lcom/facebook/appevents/AppEvent;", NotificationCompat.CATEGORY_EVENT, RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Lcom/facebook/appevents/AppEvent;)V", "h", "", Constants.INAPP_DATA_TAG, "()Z", "f", "(Lcom/facebook/appevents/AppEvent;)Ljava/lang/String;", "g", "(Lcom/facebook/appevents/AppEvent;)Z", "a", "Ljava/lang/String;", "TAG", "b", "Z", "enabled", "Ll/x4k;", "c", "Ll/x4k;", "gpsDebugLogger", "serverUri", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class GpsAraTriggersManager {

    @NotNull
    public static final GpsAraTriggersManager INSTANCE = new GpsAraTriggersManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static x4k gpsDebugLogger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static String serverUri;

    /* JADX INFO: renamed from: com.facebook.appevents.gps.ara.GpsAraTriggersManager$a */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00062\n\u0010\t\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"com/facebook/appevents/gps/ara/GpsAraTriggersManager$a", "Landroid/os/OutcomeReceiver;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", LovePlanetStage.result, "", "onResult", "(Ljava/lang/Object;)V", "error", "a", "(Ljava/lang/Exception;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C1556a implements OutcomeReceiver {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(@NotNull Exception error) {
            error.getClass();
            GpsAraTriggersManager.m7798c();
            x4k x4kVarM7797b = GpsAraTriggersManager.m7797b();
            if (x4kVarM7797b == null) {
                Intrinsics.m87502r("gpsDebugLogger");
                x4kVarM7797b = null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_ara_failed_reason", error.toString());
            Unit unit = Unit.INSTANCE;
            x4kVarM7797b.m206989b("gps_ara_failed", bundle);
        }

        public void onResult(@NotNull Object result) {
            result.getClass();
            GpsAraTriggersManager.m7798c();
            x4k x4kVarM7797b = GpsAraTriggersManager.m7797b();
            if (x4kVarM7797b == null) {
                Intrinsics.m87502r("gpsDebugLogger");
                x4kVarM7797b = null;
            }
            x4kVarM7797b.m206989b("gps_ara_succeed", null);
        }
    }

    static {
        String string = GpsAraTriggersManager.class.toString();
        string.getClass();
        TAG = string;
    }

    /* JADX INFO: renamed from: a */
    public static void m7796a(String str, AppEvent appEvent) {
        if (lsb.m151554d(GpsAraTriggersManager.class)) {
            return;
        }
        try {
            str.getClass();
            appEvent.getClass();
            INSTANCE.m7803h(str, appEvent);
        } catch (Throwable th) {
            lsb.m151552b(th, GpsAraTriggersManager.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ x4k m7797b() {
        if (lsb.m151554d(GpsAraTriggersManager.class)) {
            return null;
        }
        try {
            return gpsDebugLogger;
        } catch (Throwable th) {
            lsb.m151552b(th, GpsAraTriggersManager.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ String m7798c() {
        if (lsb.m151554d(GpsAraTriggersManager.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            lsb.m151552b(th, GpsAraTriggersManager.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m7799e() {
        if (lsb.m151554d(GpsAraTriggersManager.class)) {
            return;
        }
        try {
            enabled = true;
            gpsDebugLogger = new x4k(C1577c.m8047l());
            serverUri = "https://www." + C1577c.m8057v() + "/privacy_sandbox/mobile/register/trigger";
        } catch (Throwable th) {
            lsb.m151552b(th, GpsAraTriggersManager.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7800d() {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            if (!enabled) {
                return false;
            }
            x4k x4kVar = null;
            try {
                Class.forName("android.adservices.measurement.MeasurementManager");
                return true;
            } catch (Error e) {
                x4k x4kVar2 = gpsDebugLogger;
                if (x4kVar2 == null) {
                    Intrinsics.m87502r("gpsDebugLogger");
                } else {
                    x4kVar = x4kVar2;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_ara_failed_reason", e.toString());
                Unit unit = Unit.INSTANCE;
                x4kVar.m206989b("gps_ara_failed", bundle);
                return false;
            } catch (Exception e2) {
                x4k x4kVar3 = gpsDebugLogger;
                if (x4kVar3 == null) {
                    Intrinsics.m87502r("gpsDebugLogger");
                } else {
                    x4kVar = x4kVar3;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_ara_failed_reason", e2.toString());
                Unit unit2 = Unit.INSTANCE;
                x4kVar.m206989b("gps_ara_failed", bundle2);
                return false;
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.String] */
    /* JADX INFO: renamed from: f */
    public final String m7801f(AppEvent event) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            final JSONObject jsonObject = event.getJsonObject();
            if (jsonObject != null && jsonObject.length() != 0) {
                Iterator<String> itKeys = jsonObject.keys();
                itKeys.getClass();
                this = SequencesKt___SequencesKt.m93292L(SequencesKt___SequencesKt.m93295O(SequencesKt__SequencesKt.m93267g(itKeys), new Function1<String, String>() { // from class: com.facebook.appevents.gps.ara.GpsAraTriggersManager$getEventParameters$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @Nullable
                    public final String invoke(String str) {
                        Object objOpt = jsonObject.opt(str);
                        if (objOpt == null) {
                            return null;
                        }
                        try {
                            return URLEncoder.encode(str, "UTF-8") + '=' + URLEncoder.encode(objOpt.toString(), "UTF-8");
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                }), "&", null, null, 0, null, null, 62, null);
                return this;
            }
            return "";
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7802g(AppEvent event) {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            String string = event.getJsonObject().getString("_eventName");
            if (!Intrinsics.m87488d(string, "_removed_")) {
                string.getClass();
                if (!StringsKt.m93412P(string, "gps", false, 2, null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }

    @TargetApi(34)
    /* JADX INFO: renamed from: h */
    public final void m7803h(@NotNull String applicationId, @NotNull AppEvent event) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            applicationId.getClass();
            event.getClass();
            if (m7802g(event) && m7800d()) {
                Context contextM8047l = C1577c.m8047l();
                x4k x4kVar = null;
                try {
                    try {
                        MeasurementManager measurementManagerM149749a = lfx.m149749a(contextM8047l.getSystemService(kfx.m145877a()));
                        if (measurementManagerM149749a == null) {
                            measurementManagerM149749a = MeasurementManager.get(contextM8047l.getApplicationContext());
                        }
                        if (measurementManagerM149749a == null) {
                            x4k x4kVar2 = gpsDebugLogger;
                            if (x4kVar2 == null) {
                                Intrinsics.m87502r("gpsDebugLogger");
                                x4kVar2 = null;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString("gps_ara_failed_reason", "Failed to get measurement manager");
                            Unit unit = Unit.INSTANCE;
                            x4kVar2.m206989b("gps_ara_failed", bundle);
                            return;
                        }
                        String strM7801f = m7801f(event);
                        StringBuilder sb = new StringBuilder();
                        String str = serverUri;
                        if (str == null) {
                            Intrinsics.m87502r("serverUri");
                            str = null;
                        }
                        sb.append(str);
                        sb.append("?app_id=");
                        sb.append(applicationId);
                        sb.append('&');
                        sb.append(strM7801f);
                        Uri uri = Uri.parse(sb.toString());
                        uri.getClass();
                        measurementManagerM149749a.registerTrigger(uri, C1577c.m8056u(), dz50.m114111a(new C1556a()));
                    } catch (Exception e) {
                        x4k x4kVar3 = gpsDebugLogger;
                        if (x4kVar3 == null) {
                            Intrinsics.m87502r("gpsDebugLogger");
                        } else {
                            x4kVar = x4kVar3;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("gps_ara_failed_reason", e.toString());
                        Unit unit2 = Unit.INSTANCE;
                        x4kVar.m206989b("gps_ara_failed", bundle2);
                    }
                } catch (Error e2) {
                    x4k x4kVar4 = gpsDebugLogger;
                    if (x4kVar4 == null) {
                        Intrinsics.m87502r("gpsDebugLogger");
                    } else {
                        x4kVar = x4kVar4;
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("gps_ara_failed_reason", e2.toString());
                    Unit unit3 = Unit.INSTANCE;
                    x4kVar.m206989b("gps_ara_failed", bundle3);
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7804i(@NotNull final String applicationId, @NotNull final AppEvent event) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            applicationId.getClass();
            event.getClass();
            C1577c.m8056u().execute(new Runnable() { // from class: l.w4k
                @Override // java.lang.Runnable
                public final void run() {
                    GpsAraTriggersManager.m7796a(applicationId, event);
                }
            });
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }
}
