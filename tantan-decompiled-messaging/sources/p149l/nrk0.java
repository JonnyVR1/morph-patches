package p149l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.validation.ValidationError;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Ll/nrk0;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/validation/ValidationError;", "error", "", "", "values", "Ll/mrk0;", "a", "(Lcom/clevertap/android/sdk/validation/ValidationError;[Ljava/lang/String;)Ll/mrk0;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class nrk0 {

    @NotNull
    public static final nrk0 INSTANCE = new nrk0();

    private nrk0() {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final mrk0 m160744a(@NotNull ValidationError error, @NotNull String... values) {
        error.getClass();
        values.getClass();
        mrk0 mrk0Var = new mrk0();
        mrk0Var.m156036c(error.getCode());
        mrk0Var.m156037d(error.getMessage((String[]) Arrays.copyOf(values, values.length)));
        return mrk0Var;
    }
}
