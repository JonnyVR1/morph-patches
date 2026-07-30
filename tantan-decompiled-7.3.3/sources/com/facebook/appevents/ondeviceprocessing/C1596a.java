package com.facebook.appevents.ondeviceprocessing;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.ondeviceprocessing.C1596a;
import com.facebook.internal.C1680e;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ztb;

/* JADX INFO: renamed from: com.facebook.appevents.ondeviceprocessing.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Lcom/facebook/appevents/ondeviceprocessing/a;", "", "<init>", "()V", "", Constants.INAPP_DATA_TAG, "()Z", "", "applicationId", "preferencesName", "", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/appevents/AppEvent;", NotificationCompat.CATEGORY_EVENT, "e", "(Ljava/lang/String;Lcom/facebook/appevents/AppEvent;)V", "c", "(Lcom/facebook/appevents/AppEvent;)Z", "", "a", "Ljava/util/Set;", "ALLOWED_IMPLICIT_EVENTS", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C1596a {

    @NotNull
    public static final C1596a INSTANCE = new C1596a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Set<String> ALLOWED_IMPLICIT_EVENTS = SetsKt.setOf((Object[]) new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"});

    /* JADX INFO: renamed from: a */
    public static void m8032a(Context context, String str, String str2) {
        if (ztb.m221490d(C1596a.class)) {
            return;
        }
        try {
            context.getClass();
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            String str3 = str2 + "pingForOnDevice";
            if (sharedPreferences.getLong(str3, 0L) == 0) {
                RemoteServiceWrapper.m8028e(str2);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong(str3, System.currentTimeMillis());
                editorEdit.apply();
            }
        } catch (Throwable th) {
            ztb.m221488b(th, C1596a.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m8033b(String str, AppEvent appEvent) {
        if (ztb.m221490d(C1596a.class)) {
            return;
        }
        try {
            str.getClass();
            appEvent.getClass();
            RemoteServiceWrapper.m8027c(str, CollectionsKt.listOf(appEvent));
        } catch (Throwable th) {
            ztb.m221488b(th, C1596a.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m8034d() {
        if (ztb.m221490d(C1596a.class)) {
            return false;
        }
        try {
            return (C1600c.m8076A(C1600c.m8101l()) || C1680e.m8882Z() || !RemoteServiceWrapper.m8026b()) ? false : true;
        } catch (Throwable th) {
            ztb.m221488b(th, C1596a.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m8035e(@NotNull final String applicationId, @NotNull final AppEvent event) {
        if (ztb.m221490d(C1596a.class)) {
            return;
        }
        try {
            applicationId.getClass();
            event.getClass();
            if (INSTANCE.m8037c(event)) {
                C1600c.m8110u().execute(new Runnable() { // from class: l.xl50
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1596a.m8033b(applicationId, event);
                    }
                });
            }
        } catch (Throwable th) {
            ztb.m221488b(th, C1596a.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m8036f(@Nullable final String applicationId, @Nullable final String preferencesName) {
        if (ztb.m221490d(C1596a.class)) {
            return;
        }
        try {
            final Context contextM8101l = C1600c.m8101l();
            if (contextM8101l == null || applicationId == null || preferencesName == null) {
                return;
            }
            C1600c.m8110u().execute(new Runnable() { // from class: l.yl50
                @Override // java.lang.Runnable
                public final void run() {
                    C1596a.m8032a(contextM8101l, preferencesName, applicationId);
                }
            });
        } catch (Throwable th) {
            ztb.m221488b(th, C1596a.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8037c(AppEvent event) {
        if (ztb.m221490d(this)) {
            return false;
        }
        try {
            return !event.isImplicit() || (event.isImplicit() && ALLOWED_IMPLICIT_EVENTS.contains(event.getName()));
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return false;
        }
    }
}
