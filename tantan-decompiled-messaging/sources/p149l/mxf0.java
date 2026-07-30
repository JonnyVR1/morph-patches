package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0011J)\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u001cJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010 J'\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#J/\u0010$\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020!H\u0007¢\u0006\u0004\b$\u0010%J/\u0010&\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u001eH\u0007¢\u0006\u0004\b&\u0010'J'\u0010(\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020!H\u0007¢\u0006\u0004\b(\u0010)J/\u0010*\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020!H\u0007¢\u0006\u0004\b*\u0010+J'\u0010,\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b,\u0010\u001aJ\u001f\u0010-\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00182\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b1\u00102J'\u00103\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b3\u0010\u001aJ%\u00104\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u001e¢\u0006\u0004\b4\u00105J/\u00107\u001a\u0002062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u000206¢\u0006\u0004\b7\u00108J7\u00109\u001a\u0002062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u0002062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u001e¢\u0006\u0004\b;\u0010<J%\u0010=\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u001e¢\u0006\u0004\b=\u0010<J%\u0010>\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020!¢\u0006\u0004\b>\u0010)J%\u0010?\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u000206¢\u0006\u0004\b?\u0010@J/\u0010A\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u000206¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00182\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\bC\u00102J\u001d\u0010E\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\bE\u0010F¨\u0006G"}, m87232d2 = {"Ll/mxf0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "namespace", "Landroid/content/SharedPreferences;", "h", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;", "g", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "accountId", "rawKey", "defaultValue", "k", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", Constants.KEY_KEY, RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "nameSpace", "j", "value", "", ResourceDirection.f38808v, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "w", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", BaseSei.f13931Y, "", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z", "", "c", "(Landroid/content/Context;Ljava/lang/String;I)I", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I", "n", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V", "q", "(Landroid/content/Context;Ljava/lang/String;I)V", "r", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V", "A", BaseSei.f13932Z, "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/content/SharedPreferences$Editor;", "editor", BLiveStormDanmakuGiftResourceType.f44444l, "(Landroid/content/SharedPreferences$Editor;)V", BaseSei.f13930X, "a", "(Landroid/content/Context;Ljava/lang/String;Z)Z", "", "e", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)J", "f", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)J", "o", "(Landroid/content/Context;Ljava/lang/String;Z)V", "p", BLiveStormDanmakuGiftResourceType.f44446s, Constants.KEY_T, "(Landroid/content/Context;Ljava/lang/String;J)V", "u", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V", "m", "accountID", "B", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class mxf0 {

    @NotNull
    public static final mxf0 INSTANCE = new mxf0();

    private mxf0() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: A */
    public static final void m156883A(@NotNull Context context, @NotNull String accountId, @NotNull String key) {
        context.getClass();
        accountId.getClass();
        key.getClass();
        m156899z(context, INSTANCE.m156900B(accountId, key));
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m156884b(@NotNull Context context, @NotNull String accountId, @NotNull String rawKey) {
        context.getClass();
        accountId.getClass();
        rawKey.getClass();
        mxf0 mxf0Var = INSTANCE;
        return mxf0Var.m156901a(context, mxf0Var.m156900B(accountId, rawKey), false);
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final int m156885c(@NotNull Context context, @NotNull String key, int defaultValue) {
        context.getClass();
        key.getClass();
        return m156887g(context).getInt(key, defaultValue);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final int m156886d(@NotNull Context context, @NotNull String accountId, @NotNull String rawKey, int defaultValue) {
        context.getClass();
        accountId.getClass();
        rawKey.getClass();
        return m156885c(context, INSTANCE.m156900B(accountId, rawKey), defaultValue);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final SharedPreferences m156887g(@NotNull Context context) {
        context.getClass();
        return m156888h(context, null);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final SharedPreferences m156888h(@NotNull Context context, @Nullable String namespace) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences(namespace != null ? "WizRocket_".concat(namespace) : Constants.CLEVERTAP_STORAGE_TAG, 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: i */
    public static final String m156889i(@NotNull Context context, @NotNull String key, @Nullable String defaultValue) {
        context.getClass();
        key.getClass();
        return m156887g(context).getString(key, defaultValue);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: j */
    public static final String m156890j(@NotNull Context context, @Nullable String nameSpace, @NotNull String key, @Nullable String defaultValue) {
        context.getClass();
        key.getClass();
        return m156888h(context, nameSpace).getString(key, defaultValue);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: k */
    public static final String m156891k(@NotNull Context context, @NotNull String accountId, @NotNull String rawKey, @Nullable String defaultValue) {
        context.getClass();
        accountId.getClass();
        rawKey.getClass();
        return m156889i(context, INSTANCE.m156900B(accountId, rawKey), defaultValue);
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m156892l(@NotNull SharedPreferences.Editor editor) {
        editor.getClass();
        try {
            editor.apply();
        } catch (Throwable th) {
            Logger.m5876v("CRITICAL: Failed to persist shared preferences!", th);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m156893n(@NotNull Context context, @NotNull String accountId, @NotNull String key, boolean value) {
        context.getClass();
        accountId.getClass();
        key.getClass();
        mxf0 mxf0Var = INSTANCE;
        mxf0Var.m156905o(context, mxf0Var.m156900B(accountId, key), value);
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final void m156894q(@NotNull Context context, @NotNull String key, int value) {
        context.getClass();
        key.getClass();
        SharedPreferences.Editor editorPutInt = m156887g(context).edit().putInt(key, value);
        editorPutInt.getClass();
        m156892l(editorPutInt);
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final void m156895r(@NotNull Context context, @NotNull String accountId, @NotNull String key, int value) {
        context.getClass();
        accountId.getClass();
        key.getClass();
        m156894q(context, INSTANCE.m156900B(accountId, key), value);
    }

    @JvmStatic
    /* JADX INFO: renamed from: v */
    public static final void m156896v(@NotNull Context context, @NotNull String key, @Nullable String value) {
        context.getClass();
        key.getClass();
        SharedPreferences.Editor editorPutString = m156887g(context).edit().putString(key, value);
        editorPutString.getClass();
        m156892l(editorPutString);
    }

    @JvmStatic
    /* JADX INFO: renamed from: w */
    public static final void m156897w(@NotNull Context context, @NotNull String accountId, @NotNull String key, @Nullable String value) {
        context.getClass();
        accountId.getClass();
        key.getClass();
        m156896v(context, INSTANCE.m156900B(accountId, key), value);
    }

    @JvmStatic
    /* JADX INFO: renamed from: y */
    public static final void m156898y(@NotNull Context context, @NotNull String accountId, @NotNull String key, @Nullable String value) {
        context.getClass();
        accountId.getClass();
        key.getClass();
        mxf0 mxf0Var = INSTANCE;
        mxf0Var.m156910x(context, mxf0Var.m156900B(accountId, key), value);
    }

    @JvmStatic
    /* JADX INFO: renamed from: z */
    public static final void m156899z(@NotNull Context context, @NotNull String key) {
        context.getClass();
        key.getClass();
        SharedPreferences.Editor editorRemove = m156887g(context).edit().remove(key);
        editorRemove.getClass();
        m156892l(editorRemove);
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final String m156900B(@NotNull String accountID, @NotNull String key) {
        accountID.getClass();
        key.getClass();
        return key + ':' + accountID;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m156901a(@NotNull Context context, @NotNull String key, boolean defaultValue) {
        context.getClass();
        key.getClass();
        return m156887g(context).getBoolean(key, defaultValue);
    }

    /* JADX INFO: renamed from: e */
    public final long m156902e(@NotNull Context context, @Nullable String nameSpace, @NotNull String key, long defaultValue) {
        context.getClass();
        key.getClass();
        return m156888h(context, nameSpace).getLong(key, defaultValue);
    }

    /* JADX INFO: renamed from: f */
    public final long m156903f(@NotNull Context context, @NotNull String accountId, @NotNull String rawKey, long defaultValue, @Nullable String nameSpace) {
        context.getClass();
        accountId.getClass();
        rawKey.getClass();
        return m156902e(context, nameSpace, m156900B(accountId, rawKey), defaultValue);
    }

    @WorkerThread
    /* JADX INFO: renamed from: m */
    public final void m156904m(@NotNull SharedPreferences.Editor editor) {
        editor.getClass();
        try {
            editor.commit();
        } catch (Throwable th) {
            Logger.m5876v("CRITICAL: Failed to persist shared preferences!", th);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m156905o(@NotNull Context context, @NotNull String key, boolean value) {
        context.getClass();
        key.getClass();
        SharedPreferences.Editor editorPutBoolean = m156887g(context).edit().putBoolean(key, value);
        editorPutBoolean.getClass();
        m156892l(editorPutBoolean);
    }

    /* JADX INFO: renamed from: p */
    public final void m156906p(@NotNull Context context, @NotNull String key, boolean value) {
        context.getClass();
        key.getClass();
        SharedPreferences.Editor editorPutBoolean = m156887g(context).edit().putBoolean(key, value);
        editorPutBoolean.getClass();
        m156904m(editorPutBoolean);
    }

    /* JADX INFO: renamed from: s */
    public final void m156907s(@NotNull Context context, @NotNull String key, int value) {
        context.getClass();
        key.getClass();
        SharedPreferences.Editor editorPutInt = m156887g(context).edit().putInt(key, value);
        editorPutInt.getClass();
        m156904m(editorPutInt);
    }

    /* JADX INFO: renamed from: t */
    public final void m156908t(@NotNull Context context, @NotNull String key, long value) {
        context.getClass();
        key.getClass();
        m156909u(context, null, key, value);
    }

    /* JADX INFO: renamed from: u */
    public final void m156909u(@NotNull Context context, @Nullable String namespace, @NotNull String key, long value) {
        context.getClass();
        key.getClass();
        SharedPreferences.Editor editorPutLong = m156888h(context, namespace).edit().putLong(key, value);
        editorPutLong.getClass();
        m156892l(editorPutLong);
    }

    /* JADX INFO: renamed from: x */
    public final void m156910x(@NotNull Context context, @NotNull String key, @Nullable String value) {
        context.getClass();
        key.getClass();
        SharedPreferences.Editor editorPutString = m156887g(context).edit().putString(key, value);
        editorPutString.getClass();
        m156904m(editorPutString);
    }
}
