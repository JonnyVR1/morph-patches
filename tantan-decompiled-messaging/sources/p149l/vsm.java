package p149l;

import androidx.annotation.RestrictTo;
import com.vivo.push.PushClientConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m87232d2 = {"Ll/vsm;", "", "<init>", "()V", "", PushClientConstants.TAG_CLASS_NAME, "Ll/usm;", "a", "(Ljava/lang/String;)Ll/usm;", "b", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public abstract class vsm {
    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract usm mo179674a(@NotNull String className);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    /* JADX INFO: renamed from: b */
    public final usm m199872b(@NotNull String className) {
        className.getClass();
        usm usmVarMo179674a = mo179674a(className);
        return usmVarMo179674a == null ? wsm.m205520a(className) : usmVarMo179674a;
    }
}
