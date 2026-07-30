package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.validation.DropReason;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\u00020\f2\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/iu10;", "Ll/e4f;", "Ll/u0l0;", "errorReporter", "Ll/axl;", "logger", "<init>", "(Ll/u0l0;Ll/axl;)V", "", "input", "Ll/i0l0;", Constants.KEY_CONFIG, "Ll/f4f;", "a", "(Ljava/util/Map;Ll/i0l0;)Ll/f4f;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class iu10 extends e4f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu10(@NotNull u0l0 u0l0Var, @NotNull axl axlVar) {
        super(u0l0Var, axlVar);
        u0l0Var.getClass();
        axlVar.getClass();
    }

    @Override // p153l.e4f
    @NotNull
    /* JADX INFO: renamed from: a */
    public f4f mo119416a(@Nullable Map<?, ?> input, @NotNull i0l0 config) throws IOException {
        config.getClass();
        f4f f4fVarMo119416a = super.mo119416a(input, config);
        return f4fVarMo119416a.getCleanedData().length() == 0 ? f4f.m123983c(f4fVarMo119416a, null, new j0l0.C17839a(f4fVarMo119416a.getOutcome().mo142980a(), DropReason.EMPTY_EVENT_DATA), 1, null) : f4fVarMo119416a;
    }
}
