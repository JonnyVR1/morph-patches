package p153l;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u000bJ\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH'¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/gek0;", "", "", "deviceID", "eventName", "normalizedEventName", "", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J", "", "f", "(Ljava/lang/String;Ljava/lang/String;)Z", "Ll/fek0;", "a", "(Ljava/lang/String;Ljava/lang/String;)Ll/fek0;", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;)I", "e", "rowsThreshold", "numberOfRowsToCleanup", "b", "(II)Z", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface gek0 {
    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: a */
    fek0 mo130015a(@NotNull String deviceID, @NotNull String normalizedEventName);

    @WorkerThread
    /* JADX INFO: renamed from: b */
    boolean mo130016b(int rowsThreshold, int numberOfRowsToCleanup);

    @WorkerThread
    /* JADX INFO: renamed from: c */
    long mo130017c(@NotNull String deviceID, @NotNull String eventName, @NotNull String normalizedEventName);

    @WorkerThread
    /* JADX INFO: renamed from: d */
    int mo130018d(@NotNull String deviceID, @NotNull String normalizedEventName);

    @WorkerThread
    /* JADX INFO: renamed from: e */
    boolean mo130019e(@NotNull String deviceID, @NotNull String normalizedEventName);

    @WorkerThread
    /* JADX INFO: renamed from: f */
    boolean mo130020f(@NotNull String deviceID, @NotNull String normalizedEventName);
}
