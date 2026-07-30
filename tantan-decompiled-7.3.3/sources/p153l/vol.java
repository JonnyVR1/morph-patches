package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\tJ!\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, m88121d2 = {"Ll/vol;", "", "Ll/jo0;", Constants.KEY_CONFIG, "", "e", "(Ll/jo0;)Z", "", "c", "()V", "", "frameIndex", Constants.INAPP_DATA_TAG, "(ILl/jo0;)V", "f", "b", "errorType", "", "errorMsg", "a", "(ILjava/lang/String;)V", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface vol {
    /* JADX INFO: renamed from: a */
    void mo69826a(int errorType, @Nullable String errorMsg);

    /* JADX INFO: renamed from: b */
    void mo69827b();

    /* JADX INFO: renamed from: c */
    void mo69828c();

    /* JADX INFO: renamed from: d */
    void mo69829d(int frameIndex, @Nullable jo0 config);

    /* JADX INFO: renamed from: e */
    default boolean mo69830e(@NotNull jo0 config) {
        config.getClass();
        return true;
    }

    /* JADX INFO: renamed from: f */
    void mo69831f();
}
