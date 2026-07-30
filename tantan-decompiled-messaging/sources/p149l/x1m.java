package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0004J=\u0010\u0018\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, m87232d2 = {"Ll/x1m;", "", "", "e", "()V", "h", "f", "Ll/no0;", Constants.KEY_CONFIG, "b", "(Ll/no0;)V", "", "width", "height", "c", "(II)V", "a", "()I", "g", "swapBuffers", "", BaseSei.f13931Y, "u", ResourceDirection.f38808v, Constants.INAPP_DATA_TAG, "(II[B[B[B)V", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public interface x1m {
    /* JADX INFO: renamed from: a */
    int mo98370a();

    /* JADX INFO: renamed from: b */
    void mo98371b(@NotNull no0 config);

    /* JADX INFO: renamed from: e */
    void mo98374e();

    /* JADX INFO: renamed from: f */
    void mo98375f();

    /* JADX INFO: renamed from: g */
    void mo98376g();

    /* JADX INFO: renamed from: h */
    void mo98377h();

    void swapBuffers();

    /* JADX INFO: renamed from: c */
    default void mo98372c(int width, int height) {
    }

    /* JADX INFO: renamed from: d */
    default void mo98373d(int width, int height, @Nullable byte[] y, @Nullable byte[] u, @Nullable byte[] v2) {
    }
}
