package p149l;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/m7k0;", "", "", "accountId", Constants.DEVICE_ID_TAG, "Lorg/json/JSONObject;", "profile", "", "b", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)J", "", "c", "(Ljava/lang/String;)Ljava/util/Map;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface m7k0 {
    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: a */
    JSONObject mo153377a(@NotNull String accountId, @NotNull String deviceId);

    @WorkerThread
    /* JADX INFO: renamed from: b */
    long mo153378b(@NotNull String accountId, @NotNull String deviceId, @NotNull JSONObject profile);

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: c */
    Map<String, JSONObject> mo153379c(@NotNull String accountId);
}
