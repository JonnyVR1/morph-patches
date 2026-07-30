package p149l;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH'¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\tH'¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/pfb0;", "", "", "id", "", "ttlInSeconds", "", "a", "(Ljava/lang/String;J)V", "", Constants.INAPP_DATA_TAG, "()[Ljava/lang/String;", "", "e", "(Ljava/lang/String;)Z", "ids", "c", "([Ljava/lang/String;)V", "b", "()V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface pfb0 {
    @WorkerThread
    /* JADX INFO: renamed from: a */
    void mo168602a(@NotNull String id, long ttlInSeconds);

    @WorkerThread
    /* JADX INFO: renamed from: b */
    void mo168603b();

    @WorkerThread
    /* JADX INFO: renamed from: c */
    void mo168604c(@NotNull String[] ids);

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: d */
    String[] mo168605d();

    @WorkerThread
    /* JADX INFO: renamed from: e */
    boolean mo168606e(@NotNull String id);
}
