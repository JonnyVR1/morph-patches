package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Action;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u0003\u0018\u00010\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m88121d2 = {"Ll/spl;", "", "", Constants.KEY_KEY, "default", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "e", "(Ljava/lang/String;J)J", "", "readAll", "()Ljava/util/Map;", "value", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "(Ljava/lang/String;J)V", Action.remove, "(Ljava/lang/String;)V", "prefName", Constants.INAPP_DATA_TAG, "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface spl {
    /* JADX INFO: renamed from: a */
    void mo174038a(@NotNull String key, @NotNull String value);

    @Nullable
    /* JADX INFO: renamed from: b */
    String mo174039b(@NotNull String key, @NotNull String str);

    /* JADX INFO: renamed from: c */
    void mo174040c(@NotNull String key, long value);

    /* JADX INFO: renamed from: d */
    void mo174041d(@NotNull String prefName);

    /* JADX INFO: renamed from: e */
    long mo174042e(@NotNull String key, long j);

    @Nullable
    Map<String, ?> readAll();

    void remove(@NotNull String key);
}
