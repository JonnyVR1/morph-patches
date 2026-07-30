package okio;

import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.-DeprecatedUtf8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, m87232d2 = {"Lokio/-DeprecatedUtf8;", "", "()V", "size", "", "string", "", "beginIndex", "", "endIndex", "jvm"}, m87233k = 1, m87234mv = {1, 1, 11})
public final class DeprecatedUtf8 {
    public static final DeprecatedUtf8 INSTANCE = new DeprecatedUtf8();

    private DeprecatedUtf8() {
    }

    @Deprecated
    public final long size(@NotNull String string) {
        string.getClass();
        return Utf8.size$default(string, 0, 0, 3, null);
    }

    @Deprecated
    public final long size(@NotNull String string, int beginIndex, int endIndex) {
        string.getClass();
        return Utf8.size(string, beginIndex, endIndex);
    }
}
