package p153l;

import com.facebook.AuthenticationTokenClaims;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p122io.path.PathsKt__PathRecursiveFunctionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u001b\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\"\u001e\u0010\t\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m88121d2 = {"Ljava/nio/file/Path;", "base", "k", "(Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;", "", "j", "(Ljava/nio/file/Path;)Ljava/lang/String;", "getName$annotations", "(Ljava/nio/file/Path;)V", AuthenticationTokenClaims.JSON_KEY_NAME, "kotlin-stdlib-jdk7"}, m88122k = 5, m88123mv = {2, 2, 0}, m88125xi = 49, m88126xs = "kotlin/io/path/PathsKt")
@SourceDebugExtension
public class fk60 extends PathsKt__PathRecursiveFunctionsKt {
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m125978j(@NotNull Path path) {
        path.getClass();
        Path fileName = path.getFileName();
        String string = fileName != null ? fileName.toString() : null;
        return string == null ? "" : string;
    }

    @SinceKotlin
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final Path m125979k(@NotNull Path path, @NotNull Path path2) {
        path.getClass();
        path2.getClass();
        try {
            return mj60.INSTANCE.m158569a(path, path2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "\nthis path: " + path + "\nbase path: " + path2, e);
        }
    }
}
