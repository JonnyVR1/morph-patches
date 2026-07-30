package p149l;

import android.view.MotionEvent;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\tJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, m87232d2 = {"Ll/kml;", "", "Ll/no0;", Constants.KEY_CONFIG, "", "e", "(Ll/no0;)I", "", "f", "()V", "decodeIndex", "c", "(I)V", "frameIndex", Constants.INAPP_DATA_TAG, "a", "onDestroy", "Landroid/view/MotionEvent;", "ev", "", "b", "(Landroid/view/MotionEvent;)Z", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public interface kml {
    /* JADX INFO: renamed from: b */
    default boolean mo68679b(@NotNull MotionEvent ev) {
        ev.getClass();
        return false;
    }

    /* JADX INFO: renamed from: e */
    default int mo68682e(@NotNull no0 config) {
        config.getClass();
        return 0;
    }

    /* JADX INFO: renamed from: a */
    default void mo68678a() {
    }

    /* JADX INFO: renamed from: f */
    default void mo68683f() {
    }

    default void onDestroy() {
    }

    /* JADX INFO: renamed from: c */
    default void mo68680c(int decodeIndex) {
    }

    /* JADX INFO: renamed from: d */
    default void mo68681d(int frameIndex) {
    }
}
