package p149l;

import com.clevertap.android.sdk.network.EndpointId;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/nb20;", "", "Lcom/clevertap/android/sdk/network/EndpointId;", "endpointId", "Lorg/json/JSONObject;", "a", "(Lcom/clevertap/android/sdk/network/EndpointId;)Lorg/json/JSONObject;", "allHeaders", "", "b", "(Lorg/json/JSONObject;Lcom/clevertap/android/sdk/network/EndpointId;)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface nb20 {
    @Nullable
    /* JADX INFO: renamed from: a */
    JSONObject mo157623a(@NotNull EndpointId endpointId);

    /* JADX INFO: renamed from: b */
    void mo157624b(@NotNull JSONObject allHeaders, @NotNull EndpointId endpointId);
}
