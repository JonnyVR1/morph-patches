package p149l;

import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.CommandMessage;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fRB\u0010\t\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\rj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u0001`\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m87232d2 = {"Ll/sei;", "", "<init>", "()V", "", Constants.INAPP_DATA_TAG, "()Z", "", "", CommandMessage.PARAMS, "", "a", "(Ljava/util/Map;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "c", "()Ljava/util/HashMap;", "setParams", "(Ljava/util/HashMap;)V", "Ll/nei;", "b", "Ll/nei;", "()Ll/nei;", "setCustomResultListener", "(Ll/nei;)V", "customResultListener", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public class sei {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private HashMap<String, String> params;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private nei customResultListener;

    /* JADX INFO: renamed from: a */
    public final void m183652a(@Nullable Map<String, String> params) {
        if (params == null || params.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (this.params == null) {
                this.params = new HashMap<>();
            }
            HashMap<String, String> map = this.params;
            if (map != null) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final nei getCustomResultListener() {
        return this.customResultListener;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final HashMap<String, String> m183654c() {
        return this.params;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m183655d() {
        HashMap<String, String> map = this.params;
        return (map != null ? map.size() : 0) > 0;
    }
}
