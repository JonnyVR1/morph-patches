package p149l;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\u0011J%\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0014J%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Ll/vqm;", "", "", "userId", "Ljava/util/ArrayList;", "Ll/pv3;", "Lkotlin/collections/ArrayList;", "g", "(Ljava/lang/String;)Ljava/util/ArrayList;", "", "inboxMessages", "", "e", "(Ljava/util/List;)V", "messageId", "", "c", "(Ljava/lang/String;Ljava/lang/String;)Z", "messageIds", "b", "(Ljava/util/List;Ljava/lang/String;)Z", "a", "f", "", "staleCutoffSeconds", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;J)Ljava/util/Set;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface vqm {
    @WorkerThread
    /* JADX INFO: renamed from: a */
    boolean mo199585a(@NotNull String messageId, @NotNull String userId);

    @WorkerThread
    /* JADX INFO: renamed from: b */
    boolean mo199586b(@NotNull List<String> messageIds, @NotNull String userId);

    @WorkerThread
    /* JADX INFO: renamed from: c */
    boolean mo199587c(@NotNull String messageId, @NotNull String userId);

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: d */
    Set<String> mo199588d(@NotNull String userId, long staleCutoffSeconds);

    @WorkerThread
    /* JADX INFO: renamed from: e */
    void mo199589e(@NotNull List<? extends pv3> inboxMessages);

    @WorkerThread
    /* JADX INFO: renamed from: f */
    boolean mo199590f(@NotNull List<String> messageIds, @NotNull String userId);

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: g */
    ArrayList<pv3> mo199591g(@NotNull String userId);
}
