package p149l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.validation.DropReason;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\u00020\f2\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/zl10;", "Ll/z2f;", "Ll/ork0;", "errorReporter", "Ll/nul;", "logger", "<init>", "(Ll/ork0;Ll/nul;)V", "", "input", "Ll/crk0;", Constants.KEY_CONFIG, "Ll/a3f;", "a", "(Ljava/util/Map;Ll/crk0;)Ll/a3f;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class zl10 extends z2f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl10(@NotNull ork0 ork0Var, @NotNull nul nulVar) {
        super(ork0Var, nulVar);
        ork0Var.getClass();
        nulVar.getClass();
    }

    @Override // p149l.z2f
    @NotNull
    /* JADX INFO: renamed from: a */
    public a3f mo216962a(@Nullable Map<?, ?> input, @NotNull crk0 config) throws IOException {
        config.getClass();
        a3f a3fVarMo216962a = super.mo216962a(input, config);
        return a3fVarMo216962a.getCleanedData().length() == 0 ? a3f.m94686c(a3fVarMo216962a, null, new drk0.C16456a(a3fVarMo216962a.getOutcome().mo113310a(), DropReason.EMPTY_EVENT_DATA), 1, null) : a3fVarMo216962a;
    }
}
