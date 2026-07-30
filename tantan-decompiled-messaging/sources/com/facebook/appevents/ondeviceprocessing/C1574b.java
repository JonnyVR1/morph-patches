package com.facebook.appevents.ondeviceprocessing;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.AppEvent;
import com.facebook.internal.C1656d;
import com.facebook.internal.FetchedAppSettingsManager;
import com.tencent.connect.common.Constants;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import p149l.c3f;
import p149l.lsb;

/* JADX INFO: renamed from: com.facebook.appevents.ondeviceprocessing.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\n \u0014*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Lcom/facebook/appevents/ondeviceprocessing/b;", "", "<init>", "()V", "Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "eventType", "", "applicationId", "", "Lcom/facebook/appevents/AppEvent;", "appEvents", "Landroid/os/Bundle;", "a", "(Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;Ljava/lang/String;Ljava/util/List;)Landroid/os/Bundle;", "Lorg/json/JSONArray;", "b", "(Ljava/util/List;Ljava/lang/String;)Lorg/json/JSONArray;", "", "c", "(Ljava/lang/String;)Z", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C1574b {

    @NotNull
    public static final C1574b INSTANCE = new C1574b();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = RemoteServiceWrapper.class.getSimpleName();

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Bundle m7984a(@NotNull RemoteServiceWrapper.EventType eventType, @NotNull String applicationId, @NotNull List<AppEvent> appEvents) {
        if (lsb.m151554d(C1574b.class)) {
            return null;
        }
        try {
            eventType.getClass();
            applicationId.getClass();
            appEvents.getClass();
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_EVENT, eventType.getEventType());
            bundle.putString(Constants.JumpUrlConstants.URL_KEY_APPID, applicationId);
            if (RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS != eventType) {
                return bundle;
            }
            JSONArray jSONArrayM7985b = INSTANCE.m7985b(appEvents, applicationId);
            if (jSONArrayM7985b.length() == 0) {
                return null;
            }
            bundle.putString("custom_events", jSONArrayM7985b.toString());
            return bundle;
        } catch (Throwable th) {
            lsb.m151552b(th, C1574b.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final JSONArray m7985b(List<AppEvent> appEvents, String applicationId) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<AppEvent> mutableList = CollectionsKt.toMutableList((Collection) appEvents);
            c3f.m105010d(mutableList);
            boolean zM7986c = m7986c(applicationId);
            for (AppEvent appEvent : mutableList) {
                if (!appEvent.isImplicit() || (appEvent.isImplicit() && zM7986c)) {
                    jSONArray.put(appEvent.getJsonObject());
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7986c(String applicationId) {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            C1656d c1656dM8693r = FetchedAppSettingsManager.m8693r(applicationId, false);
            if (c1656dM8693r != null) {
                return c1656dM8693r.getSupportsImplicitLogging();
            }
            return false;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }
}
