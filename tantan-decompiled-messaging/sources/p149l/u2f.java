package p149l;

import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.p013db.Table;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH'¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Ll/u2f;", "", "Lorg/json/JSONObject;", NotificationCompat.CATEGORY_EVENT, "Lcom/clevertap/android/sdk/db/Table;", "table", "", "c", "(Lorg/json/JSONObject;Lcom/clevertap/android/sdk/db/Table;)J", "", Constants.KEY_LIMIT, "Ll/cpb0;", "e", "(Lcom/clevertap/android/sdk/db/Table;I)Ll/cpb0;", "batchSize", Constants.INAPP_DATA_TAG, "(I)Ll/cpb0;", "", "lastId", "", "b", "(Ljava/lang/String;Lcom/clevertap/android/sdk/db/Table;)V", "a", "(Lcom/clevertap/android/sdk/db/Table;)V", "g", "f", "(Lcom/clevertap/android/sdk/db/Table;)I", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface u2f {
    @WorkerThread
    /* JADX INFO: renamed from: a */
    void mo191483a(@NotNull Table table);

    @WorkerThread
    /* JADX INFO: renamed from: b */
    void mo191484b(@NotNull String lastId, @NotNull Table table);

    @WorkerThread
    /* JADX INFO: renamed from: c */
    long mo191485c(@NotNull JSONObject event, @NotNull Table table);

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: d */
    cpb0 mo191486d(int batchSize);

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: e */
    cpb0 mo191487e(@NotNull Table table, int limit);

    @WorkerThread
    /* JADX INFO: renamed from: f */
    int mo191488f(@NotNull Table table);

    @WorkerThread
    /* JADX INFO: renamed from: g */
    void mo191489g(@NotNull Table table);
}
