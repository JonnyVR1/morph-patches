package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/hwe0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", Constants.KEY_KEY, "value", "", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "defaultValue", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class hwe0 {
    public static final hwe0 INSTANCE = new hwe0();

    private hwe0() {
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m133241a(@NotNull Context context, @NotNull String key, @NotNull String defaultValue) {
        context.getClass();
        key.getClass();
        defaultValue.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("MMNetworkMetrics4Android ", 0);
        sharedPreferences.getClass();
        return sharedPreferences.getString(key, defaultValue);
    }

    /* JADX INFO: renamed from: b */
    public final void m133242b(@NotNull Context context, @NotNull String key, @NotNull String value) {
        context.getClass();
        key.getClass();
        value.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("MMNetworkMetrics4Android ", 0);
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putString(key, value);
        editorEdit.apply();
    }
}
