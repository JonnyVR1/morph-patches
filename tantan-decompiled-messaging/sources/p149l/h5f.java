package p149l;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.HidesMembers;
import kotlin.internal.PlatformImplementationsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"", "", "b", "(Ljava/lang/Throwable;)Ljava/lang/String;", "exception", "", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/ExceptionsKt")
public class h5f {
    @SinceKotlin
    @HidesMembers
    /* JADX INFO: renamed from: a */
    public static void m129395a(@NotNull Throwable th, @NotNull Throwable th2) throws IllegalAccessException, InvocationTargetException {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            PlatformImplementationsKt.f63450a.mo87386a(th, th2);
        }
    }

    @SinceKotlin
    @NotNull
    /* JADX INFO: renamed from: b */
    public static String m129396b(@NotNull Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }
}
