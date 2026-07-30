package p153l;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m88121d2 = {"Ll/g5f;", "Ll/k0l0;", "", "Ll/h5f;", "Ll/u0l0;", "errorReporter", "Ll/axl;", "logger", "<init>", "(Ll/u0l0;Ll/axl;)V", "input", "Ll/i0l0;", Constants.KEY_CONFIG, "a", "(Ljava/lang/String;Ll/i0l0;)Ll/h5f;", "Ll/u0l0;", "b", "Ll/axl;", "Ll/f5f;", "c", "Ll/f5f;", "normalizer", "Ll/i5f;", Constants.INAPP_DATA_TAG, "Ll/i5f;", "validator", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class g5f implements k0l0<String, h5f> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final u0l0 errorReporter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final f5f normalizer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final i5f validator;

    public g5f(@NotNull u0l0 u0l0Var, @NotNull axl axlVar) {
        u0l0Var.getClass();
        axlVar.getClass();
        this.errorReporter = u0l0Var;
        this.logger = axlVar;
        this.normalizer = new f5f();
        this.validator = new i5f();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public h5f m129049a(@Nullable String input, @NotNull i0l0 config) throws IOException {
        config.getClass();
        e5f e5fVarM124122a = this.normalizer.m124122a(input, config);
        j0l0 j0l0VarM138701c = this.validator.m138701c(e5fVarM124122a, config);
        this.errorReporter.m193844b(j0l0VarM138701c.mo142980a());
        m129050b(this.logger, "EventNameValidation", j0l0VarM138701c);
        return new h5f(e5fVarM124122a.getCleanedName(), j0l0VarM138701c);
    }

    /* JADX INFO: renamed from: b */
    public void m129050b(@NotNull axl axlVar, @NotNull String str, @NotNull j0l0 j0l0Var) {
        k0l0.C18073a.m147796a(this, axlVar, str, j0l0Var);
    }
}
