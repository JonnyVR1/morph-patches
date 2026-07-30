package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017H'¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0003"}, m87232d2 = {"Ll/bhh0;", "", "Ll/ahh0;", "systemIdInfo", "", "c", "(Ll/ahh0;)V", "", "workSpecId", "", "generation", "b", "(Ljava/lang/String;I)Ll/ahh0;", "Ll/k9q0;", "id", "a", "(Ll/k9q0;)Ll/ahh0;", "e", "(Ljava/lang/String;I)V", "g", "(Ljava/lang/String;)V", "f", "(Ll/k9q0;)V", "", Constants.INAPP_DATA_TAG, "()Ljava/util/List;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public interface bhh0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    default ahh0 m101837a(@NotNull k9q0 id) {
        id.getClass();
        return mo101838b(id.getWorkSpecId(), id.getGeneration());
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    ahh0 mo101838b(@NotNull String workSpecId, int generation);

    /* JADX INFO: renamed from: c */
    void mo101839c(@NotNull ahh0 systemIdInfo);

    @NotNull
    /* JADX INFO: renamed from: d */
    List<String> mo101840d();

    /* JADX INFO: renamed from: e */
    void mo101841e(@NotNull String workSpecId, int generation);

    /* JADX INFO: renamed from: f */
    default void m101842f(@NotNull k9q0 id) {
        id.getClass();
        mo101841e(id.getWorkSpecId(), id.getGeneration());
    }

    /* JADX INFO: renamed from: g */
    void mo101843g(@NotNull String workSpecId);
}
