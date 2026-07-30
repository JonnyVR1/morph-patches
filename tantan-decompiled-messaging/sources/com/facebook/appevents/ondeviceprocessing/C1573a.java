package com.facebook.appevents.ondeviceprocessing;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.ondeviceprocessing.C1573a;
import com.facebook.internal.C1657e;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.lsb;

/* JADX INFO: renamed from: com.facebook.appevents.ondeviceprocessing.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Lcom/facebook/appevents/ondeviceprocessing/a;", "", "<init>", "()V", "", Constants.INAPP_DATA_TAG, "()Z", "", "applicationId", "preferencesName", "", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/appevents/AppEvent;", NotificationCompat.CATEGORY_EVENT, "e", "(Ljava/lang/String;Lcom/facebook/appevents/AppEvent;)V", "c", "(Lcom/facebook/appevents/AppEvent;)Z", "", "a", "Ljava/util/Set;", "ALLOWED_IMPLICIT_EVENTS", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C1573a {

    @NotNull
    public static final C1573a INSTANCE = new C1573a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Set<String> ALLOWED_IMPLICIT_EVENTS = SetsKt.setOf((Object[]) new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"});

    /* JADX INFO: renamed from: a */
    public static void m7978a(Context context, String str, String str2) {
        if (lsb.m151554d(C1573a.class)) {
            return;
        }
        try {
            context.getClass();
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            String str3 = str2 + "pingForOnDevice";
            if (sharedPreferences.getLong(str3, 0L) == 0) {
                RemoteServiceWrapper.m7974e(str2);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong(str3, System.currentTimeMillis());
                editorEdit.apply();
            }
        } catch (Throwable th) {
            lsb.m151552b(th, C1573a.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7979b(String str, AppEvent appEvent) {
        if (lsb.m151554d(C1573a.class)) {
            return;
        }
        try {
            str.getClass();
            appEvent.getClass();
            RemoteServiceWrapper.m7973c(str, CollectionsKt.listOf(appEvent));
        } catch (Throwable th) {
            lsb.m151552b(th, C1573a.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m7980d() {
        if (lsb.m151554d(C1573a.class)) {
            return false;
        }
        try {
            return (C1577c.m8022A(C1577c.m8047l()) || C1657e.m8828Z() || !RemoteServiceWrapper.m7972b()) ? false : true;
        } catch (Throwable th) {
            lsb.m151552b(th, C1573a.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m7981e(@NotNull final String applicationId, @NotNull final AppEvent event) {
        if (lsb.m151554d(C1573a.class)) {
            return;
        }
        try {
            applicationId.getClass();
            event.getClass();
            if (INSTANCE.m7983c(event)) {
                C1577c.m8056u().execute(new Runnable() { // from class: l.qd50
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1573a.m7979b(applicationId, event);
                    }
                });
            }
        } catch (Throwable th) {
            lsb.m151552b(th, C1573a.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m7982f(@Nullable final String applicationId, @Nullable final String preferencesName) {
        if (lsb.m151554d(C1573a.class)) {
            return;
        }
        try {
            final Context contextM8047l = C1577c.m8047l();
            if (contextM8047l == null || applicationId == null || preferencesName == null) {
                return;
            }
            C1577c.m8056u().execute(new Runnable() { // from class: l.rd50
                @Override // java.lang.Runnable
                public final void run() {
                    C1573a.m7978a(contextM8047l, preferencesName, applicationId);
                }
            });
        } catch (Throwable th) {
            lsb.m151552b(th, C1573a.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7983c(AppEvent event) {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            return !event.isImplicit() || (event.isImplicit() && ALLOWED_IMPLICIT_EVENTS.contains(event.getName()));
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }
}
