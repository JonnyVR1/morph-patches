package p153l;

import com.clevertap.android.sdk.Constants;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, m88121d2 = {"Ll/w8e;", "", "", "progress", "", "b", "(I)V", "Ljava/io/File;", "file", "a", "(Ljava/io/File;)V", "onCancel", "()V", "onStart", "", "errMsg", "onFailed", "(Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "", "isReady", "c", "(Z)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface w8e {
    /* JADX INFO: renamed from: a */
    default void mo75431a(@NotNull File file) {
        file.getClass();
    }

    /* JADX INFO: renamed from: d */
    default void mo76401d(@NotNull String errMsg) {
        errMsg.getClass();
    }

    default void onFailed(@NotNull String errMsg) {
        errMsg.getClass();
    }

    default void onCancel() {
    }

    default void onStart() {
    }

    /* JADX INFO: renamed from: b */
    default void mo76400b(int progress) {
    }

    /* JADX INFO: renamed from: c */
    default void mo75432c(boolean isReady) {
    }
}
