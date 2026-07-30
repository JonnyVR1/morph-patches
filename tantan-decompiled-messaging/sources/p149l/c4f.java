package p149l;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m87232d2 = {"Ll/c4f;", "Ll/erk0;", "", "Ll/d4f;", "Ll/ork0;", "errorReporter", "Ll/nul;", "logger", "<init>", "(Ll/ork0;Ll/nul;)V", "input", "Ll/crk0;", Constants.KEY_CONFIG, "a", "(Ljava/lang/String;Ll/crk0;)Ll/d4f;", "Ll/ork0;", "b", "Ll/nul;", "Ll/b4f;", "c", "Ll/b4f;", "normalizer", "Ll/e4f;", Constants.INAPP_DATA_TAG, "Ll/e4f;", "validator", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class c4f implements erk0<String, d4f> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ork0 errorReporter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final b4f normalizer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final e4f validator;

    public c4f(@NotNull ork0 ork0Var, @NotNull nul nulVar) {
        ork0Var.getClass();
        nulVar.getClass();
        this.errorReporter = ork0Var;
        this.logger = nulVar;
        this.normalizer = new b4f();
        this.validator = new e4f();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public d4f m105215a(@Nullable String input, @NotNull crk0 config) throws IOException {
        config.getClass();
        a4f a4fVarM100250a = this.normalizer.m100250a(input, config);
        drk0 drk0VarM114676c = this.validator.m114676c(a4fVarM100250a, config);
        this.errorReporter.m165675b(drk0VarM114676c.mo113310a());
        m105216b(this.logger, "EventNameValidation", drk0VarM114676c);
        return new d4f(a4fVarM100250a.getCleanedName(), drk0VarM114676c);
    }

    /* JADX INFO: renamed from: b */
    public void m105216b(@NotNull nul nulVar, @NotNull String str, @NotNull drk0 drk0Var) {
        erk0.C16670a.m117847a(this, nulVar, str, drk0Var);
    }
}
