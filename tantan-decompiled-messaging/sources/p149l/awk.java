package p149l;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/awk;", "", "<init>", "()V", "", "current", "obj", "a", "(ILjava/lang/Object;)I", "fbcore_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class awk {

    @NotNull
    public static final awk INSTANCE = new awk();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m99292a(int current, @Nullable Object obj) {
        return (current * 31) + (obj != null ? obj.hashCode() : 0);
    }
}
