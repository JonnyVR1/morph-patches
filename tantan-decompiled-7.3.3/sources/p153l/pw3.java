package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Action;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\"\u0010\"\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00020\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!¨\u0006#"}, m88121d2 = {"Ll/pw3;", "Ll/spl;", "Landroid/content/Context;", "context", "", "prefName", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", Constants.KEY_KEY, "default", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "e", "(Ljava/lang/String;J)J", "", "readAll", "()Ljava/util/Map;", "value", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "(Ljava/lang/String;J)V", Action.remove, "(Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "Landroid/content/SharedPreferences;", "f", "()Landroid/content/SharedPreferences;", "Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", "contextRef", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class pw3 implements spl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String prefName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final WeakReference<Context> contextRef;

    public pw3(@NotNull Context context, @Nullable String str) {
        context.getClass();
        this.prefName = str;
        this.contextRef = new WeakReference<>(context);
    }

    @Override // p153l.spl
    /* JADX INFO: renamed from: a */
    public void mo174038a(@NotNull String key, @NotNull String value) {
        key.getClass();
        value.getClass();
        SharedPreferences sharedPreferencesM174043f = m174043f();
        if (sharedPreferencesM174043f == null) {
            return;
        }
        sharedPreferencesM174043f.edit().putString(key, value).apply();
    }

    @Override // p153l.spl
    @Nullable
    /* JADX INFO: renamed from: b */
    public String mo174039b(@NotNull String key, @NotNull String str) {
        key.getClass();
        str.getClass();
        SharedPreferences sharedPreferencesM174043f = m174043f();
        return sharedPreferencesM174043f == null ? str : sharedPreferencesM174043f.getString(key, str);
    }

    @Override // p153l.spl
    /* JADX INFO: renamed from: c */
    public void mo174040c(@NotNull String key, long value) {
        key.getClass();
        SharedPreferences sharedPreferencesM174043f = m174043f();
        if (sharedPreferencesM174043f == null) {
            return;
        }
        sharedPreferencesM174043f.edit().putLong(key, value).apply();
    }

    @Override // p153l.spl
    /* JADX INFO: renamed from: d */
    public void mo174041d(@NotNull String prefName) {
        prefName.getClass();
        this.prefName = prefName;
    }

    @Override // p153l.spl
    /* JADX INFO: renamed from: e */
    public long mo174042e(@NotNull String key, long j) {
        key.getClass();
        SharedPreferences sharedPreferencesM174043f = m174043f();
        return sharedPreferencesM174043f == null ? j : sharedPreferencesM174043f.getLong(key, j);
    }

    @VisibleForTesting
    @Nullable
    /* JADX INFO: renamed from: f */
    public final SharedPreferences m174043f() {
        Context context = this.contextRef.get();
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(this.prefName, 0);
    }

    @Override // p153l.spl
    @Nullable
    public Map<String, ?> readAll() {
        SharedPreferences sharedPreferencesM174043f = m174043f();
        return sharedPreferencesM174043f == null ? MapsKt.emptyMap() : sharedPreferencesM174043f.getAll();
    }

    @Override // p153l.spl
    public void remove(@NotNull String key) {
        key.getClass();
        SharedPreferences sharedPreferencesM174043f = m174043f();
        if (sharedPreferencesM174043f == null) {
            return;
        }
        sharedPreferencesM174043f.edit().remove(key).apply();
    }
}
