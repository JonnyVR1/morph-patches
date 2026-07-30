package p153l;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/qyk;", "", "<init>", "()V", "", "current", "obj", "a", "(ILjava/lang/Object;)I", "fbcore_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class qyk {

    @NotNull
    public static final qyk INSTANCE = new qyk();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m178658a(int current, @Nullable Object obj) {
        return (current * 31) + (obj != null ? obj.hashCode() : 0);
    }
}
