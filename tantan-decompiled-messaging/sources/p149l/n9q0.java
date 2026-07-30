package p149l;

import androidx.work.WorkerParameters;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Reason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m87232d2 = {"Ll/n9q0;", "", "Ll/vuf0;", "workSpecId", "", "c", "(Ll/vuf0;)V", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "e", "(Ll/vuf0;Landroidx/work/WorkerParameters$a;)V", "b", "", Reason.TYPE, Constants.INAPP_DATA_TAG, "(Ll/vuf0;I)V", "a", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public interface n9q0 {
    /* JADX INFO: renamed from: a */
    default void m158559a(@NotNull vuf0 workSpecId, int reason) {
        workSpecId.getClass();
        mo158562d(workSpecId, reason);
    }

    /* JADX INFO: renamed from: b */
    default void m158560b(@NotNull vuf0 workSpecId) {
        workSpecId.getClass();
        mo158562d(workSpecId, -512);
    }

    /* JADX INFO: renamed from: c */
    default void m158561c(@NotNull vuf0 workSpecId) {
        workSpecId.getClass();
        mo158563e(workSpecId, null);
    }

    /* JADX INFO: renamed from: d */
    void mo158562d(@NotNull vuf0 workSpecId, int reason);

    /* JADX INFO: renamed from: e */
    void mo158563e(@NotNull vuf0 workSpecId, @Nullable WorkerParameters.C0760a runtimeExtras);
}
