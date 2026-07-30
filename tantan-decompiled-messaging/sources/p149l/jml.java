package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\tJ!\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, m87232d2 = {"Ll/jml;", "", "Ll/no0;", Constants.KEY_CONFIG, "", "e", "(Ll/no0;)Z", "", "c", "()V", "", "frameIndex", Constants.INAPP_DATA_TAG, "(ILl/no0;)V", "f", "b", "errorType", "", "errorMsg", "a", "(ILjava/lang/String;)V", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public interface jml {
    /* JADX INFO: renamed from: a */
    void mo68643a(int errorType, @Nullable String errorMsg);

    /* JADX INFO: renamed from: b */
    void mo68644b();

    /* JADX INFO: renamed from: c */
    void mo68645c();

    /* JADX INFO: renamed from: d */
    void mo68646d(int frameIndex, @Nullable no0 config);

    /* JADX INFO: renamed from: e */
    default boolean mo68647e(@NotNull no0 config) {
        config.getClass();
        return true;
    }

    /* JADX INFO: renamed from: f */
    void mo68648f();
}
