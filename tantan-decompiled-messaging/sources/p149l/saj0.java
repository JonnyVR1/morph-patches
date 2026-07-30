package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.Constants;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 (2\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR0\u0010'\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\u00020\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006)"}, m87232d2 = {"Ll/saj0;", "", "Landroid/content/Context;", "context", "", "accountId", "Ll/hyd;", "deviceInfo", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ll/hyd;)V", "Landroid/content/SharedPreferences;", "prefs", "storageKey", "", Constants.INAPP_DATA_TAG, "(Landroid/content/SharedPreferences;Ljava/lang/String;)I", "triggerCount", "", "g", "(Landroid/content/SharedPreferences;Ljava/lang/String;I)V", "campaignId", "a", "(Ljava/lang/String;)I", "c", "(Ljava/lang/String;)V", "e", "f", "()Landroid/content/SharedPreferences;", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/String;", "Ll/hyd;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", "getContextRef", "()Ljava/lang/ref/WeakReference;", "setContextRef", "(Ljava/lang/ref/WeakReference;)V", "contextRef", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class saj0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final hyd deviceInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private WeakReference<Context> contextRef;

    public saj0(@NotNull Context context, @NotNull String str, @NotNull hyd hydVar) {
        context.getClass();
        str.getClass();
        hydVar.getClass();
        this.accountId = str;
        this.deviceInfo = hydVar;
        this.contextRef = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: d */
    private final int m183060d(SharedPreferences prefs, String storageKey) {
        return prefs.getInt(storageKey, 0);
    }

    /* JADX INFO: renamed from: g */
    private final void m183061g(SharedPreferences prefs, String storageKey, int triggerCount) {
        prefs.edit().putInt(storageKey, triggerCount).apply();
    }

    /* JADX INFO: renamed from: a */
    public final int m183062a(@NotNull String campaignId) {
        campaignId.getClass();
        SharedPreferences sharedPreferencesM183066f = m183066f();
        if (sharedPreferencesM183066f == null) {
            return 0;
        }
        return m183060d(sharedPreferencesM183066f, m183063b(campaignId));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m183063b(@NotNull String campaignId) {
        campaignId.getClass();
        return "__triggers_" + campaignId;
    }

    /* JADX INFO: renamed from: c */
    public final void m183064c(@NotNull String campaignId) {
        campaignId.getClass();
        SharedPreferences sharedPreferencesM183066f = m183066f();
        if (sharedPreferencesM183066f == null) {
            return;
        }
        m183061g(sharedPreferencesM183066f, m183063b(campaignId), m183062a(campaignId) + 1);
    }

    /* JADX INFO: renamed from: e */
    public final void m183065e(@NotNull String campaignId) {
        campaignId.getClass();
        SharedPreferences sharedPreferencesM183066f = m183066f();
        if (sharedPreferencesM183066f == null) {
            return;
        }
        sharedPreferencesM183066f.edit().remove(m183063b(campaignId)).apply();
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final SharedPreferences m183066f() {
        String str = "triggers_per_inapp:" + this.deviceInfo.m133539E() + ':' + this.accountId;
        Context context = this.contextRef.get();
        if (context == null) {
            return null;
        }
        return mxf0.m156888h(context, str);
    }
}
