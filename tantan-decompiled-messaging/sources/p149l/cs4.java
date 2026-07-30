package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m87232d2 = {"Ll/cs4;", "Ll/erk0;", "", "Ll/ds4;", "Ll/ork0;", "errorReporter", "Ll/nul;", "logger", "<init>", "(Ll/ork0;Ll/nul;)V", "input", "Ll/crk0;", Constants.KEY_CONFIG, "a", "(Ljava/util/List;Ll/crk0;)Ll/ds4;", "Ll/ork0;", "b", "Ll/nul;", "Ll/bs4;", "c", "Ll/bs4;", "normalizer", "Ll/es4;", Constants.INAPP_DATA_TAG, "Ll/es4;", "validator", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public class cs4 implements erk0<List<?>, ds4> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ork0 errorReporter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final bs4 normalizer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final es4 validator;

    public cs4(@NotNull ork0 ork0Var, @NotNull nul nulVar) {
        ork0Var.getClass();
        nulVar.getClass();
        this.errorReporter = ork0Var;
        this.logger = nulVar;
        this.normalizer = new bs4();
        this.validator = new es4();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public ds4 m108477a(@Nullable List<?> input, @NotNull crk0 config) {
        config.getClass();
        as4 as4VarM103653a = this.normalizer.m103653a(input, config);
        drk0 drk0VarM117905a = this.validator.m117905a(as4VarM103653a, config);
        this.errorReporter.m165675b(drk0VarM117905a.mo113310a());
        m108478b(this.logger, "ChargedEventItemsValidation", drk0VarM117905a);
        return new ds4(as4VarM103653a.getItemsCount(), drk0VarM117905a);
    }

    /* JADX INFO: renamed from: b */
    public void m108478b(@NotNull nul nulVar, @NotNull String str, @NotNull drk0 drk0Var) {
        erk0.C16670a.m117847a(this, nulVar, str, drk0Var);
    }
}
