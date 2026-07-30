package kotlin.reflect.jvm.internal.impl.utils.addToStdlib;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class AddToStdlibKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ConcurrentHashMap<Function0<?>, Object> f67134a = new ConcurrentHashMap<>();

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Void m94124a(@NotNull String str) {
        str.getClass();
        throw new IllegalStateException(str.toString());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Void m94125b(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "should not be called";
        }
        return m94124a(str);
    }
}
