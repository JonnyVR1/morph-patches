package p153l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m88121d2 = {"Ll/nj80;", "", p7f.GPS_DIRECTION_TRUE, "acquire", "()Ljava/lang/Object;", "instance", "", "release", "(Ljava/lang/Object;)Z", "core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public interface nj80<T> {
    @Nullable
    T acquire();

    boolean release(@NotNull T instance);
}
