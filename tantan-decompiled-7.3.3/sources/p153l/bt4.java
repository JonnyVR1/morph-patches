package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m88121d2 = {"Ll/bt4;", "Ll/k0l0;", "", "Ll/ct4;", "Ll/u0l0;", "errorReporter", "Ll/axl;", "logger", "<init>", "(Ll/u0l0;Ll/axl;)V", "input", "Ll/i0l0;", Constants.KEY_CONFIG, "a", "(Ljava/util/List;Ll/i0l0;)Ll/ct4;", "Ll/u0l0;", "b", "Ll/axl;", "Ll/at4;", "c", "Ll/at4;", "normalizer", "Ll/dt4;", Constants.INAPP_DATA_TAG, "Ll/dt4;", "validator", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public class bt4 implements k0l0<List<?>, ct4> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final u0l0 errorReporter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final at4 normalizer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final dt4 validator;

    public bt4(@NotNull u0l0 u0l0Var, @NotNull axl axlVar) {
        u0l0Var.getClass();
        axlVar.getClass();
        this.errorReporter = u0l0Var;
        this.logger = axlVar;
        this.normalizer = new at4();
        this.validator = new dt4();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public ct4 m106319a(@Nullable List<?> input, @NotNull i0l0 config) {
        config.getClass();
        zs4 zs4VarM100019a = this.normalizer.m100019a(input, config);
        j0l0 j0l0VarM117798a = this.validator.m117798a(zs4VarM100019a, config);
        this.errorReporter.m193844b(j0l0VarM117798a.mo142980a());
        m106320b(this.logger, "ChargedEventItemsValidation", j0l0VarM117798a);
        return new ct4(zs4VarM100019a.getItemsCount(), j0l0VarM117798a);
    }

    /* JADX INFO: renamed from: b */
    public void m106320b(@NotNull axl axlVar, @NotNull String str, @NotNull j0l0 j0l0Var) {
        k0l0.C18073a.m147796a(this, axlVar, str, j0l0Var);
    }
}
