package p153l;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\u0006J'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\rH'¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\rH'¢\u0006\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, m88121d2 = {"Ll/atm;", "", "", "userId", "", "a", "(Ljava/lang/String;)Ljava/util/Set;", "", "Ll/tq60;", "g", "(Ljava/lang/String;)Ljava/util/List;", "c", "messageId", "", "expiresAt", "", "f", "(Ljava/lang/String;Ljava/lang/String;J)Z", "messageIds", "h", "(Ljava/util/List;Ljava/lang/String;)Z", "nowSeconds", "", "b", "(Ljava/lang/String;J)I", Constants.INAPP_DATA_TAG, "e", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface atm {
    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: a */
    Set<String> mo100196a(@NotNull String userId);

    @WorkerThread
    /* JADX INFO: renamed from: b */
    int mo100197b(@NotNull String userId, long nowSeconds);

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: c */
    Set<String> mo100198c(@NotNull String userId);

    @WorkerThread
    /* JADX INFO: renamed from: d */
    boolean mo100199d(@NotNull List<String> messageIds, @NotNull String userId);

    @WorkerThread
    /* JADX INFO: renamed from: e */
    int mo100200e(@NotNull String userId, long nowSeconds);

    @WorkerThread
    /* JADX INFO: renamed from: f */
    boolean mo100201f(@NotNull String messageId, @NotNull String userId, long expiresAt);

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: g */
    List<tq60> mo100202g(@NotNull String userId);

    @WorkerThread
    /* JADX INFO: renamed from: h */
    boolean mo100203h(@NotNull List<String> messageIds, @NotNull String userId);
}
