package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\t\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/at4;", "", "", "Ll/zs4;", "<init>", "()V", "input", "Ll/i0l0;", Constants.KEY_CONFIG, "a", "(Ljava/util/List;Ll/i0l0;)Ll/zs4;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class at4 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public zs4 m100019a(@Nullable List<?> input, @NotNull i0l0 config) {
        config.getClass();
        if (input == null) {
            input = CollectionsKt.emptyList();
        }
        return new zs4(input.size());
    }
}
