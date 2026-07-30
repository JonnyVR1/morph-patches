package p153l;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/sgk0;", "", "", "accountId", Constants.DEVICE_ID_TAG, "Lorg/json/JSONObject;", "profile", "", "b", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)J", "", "c", "(Ljava/lang/String;)Ljava/util/Map;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface sgk0 {
    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: a */
    JSONObject mo185792a(@NotNull String accountId, @NotNull String deviceId);

    @WorkerThread
    /* JADX INFO: renamed from: b */
    long mo185793b(@NotNull String accountId, @NotNull String deviceId, @NotNull JSONObject profile);

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: c */
    Map<String, JSONObject> mo185794c(@NotNull String accountId);
}
