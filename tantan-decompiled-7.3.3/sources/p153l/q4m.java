package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0004J=\u0010\u0018\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, m88121d2 = {"Ll/q4m;", "", "", "e", "()V", "h", "f", "Ll/jo0;", Constants.KEY_CONFIG, "b", "(Ll/jo0;)V", "", "width", "height", "c", "(II)V", "a", "()I", "g", "swapBuffers", "", BaseSei.f14625Y, "u", ResourceDirection.f39656v, Constants.INAPP_DATA_TAG, "(II[B[B[B)V", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface q4m {
    /* JADX INFO: renamed from: a */
    int mo128148a();

    /* JADX INFO: renamed from: b */
    void mo128149b(@NotNull jo0 config);

    /* JADX INFO: renamed from: e */
    void mo128152e();

    /* JADX INFO: renamed from: f */
    void mo128153f();

    /* JADX INFO: renamed from: g */
    void mo128154g();

    /* JADX INFO: renamed from: h */
    void mo128155h();

    void swapBuffers();

    /* JADX INFO: renamed from: c */
    default void mo128150c(int width, int height) {
    }

    /* JADX INFO: renamed from: d */
    default void mo128151d(int width, int height, @Nullable byte[] y, @Nullable byte[] u, @Nullable byte[] v2) {
    }
}
