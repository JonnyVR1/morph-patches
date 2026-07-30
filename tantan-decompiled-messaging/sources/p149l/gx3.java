package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Action;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m87232d2 = {"Ll/gx3;", j6f.GPS_DIRECTION_TRUE, "", "", Constants.KEY_KEY, "value", "", "add", "(Ljava/lang/String;Ljava/lang/Object;)Z", "get", "(Ljava/lang/String;)Ljava/lang/Object;", Action.remove, "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface gx3<T> {
    boolean add(@NotNull String key, T value);

    @Nullable
    T get(@NotNull String key);

    @Nullable
    T remove(@NotNull String key);
}
