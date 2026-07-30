package kotlinx.coroutines.selects;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ag4;
import p153l.goh0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a>\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002#\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"c\u0010\u0017\u001aQ\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016\"\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u0014\u0010\u001f\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a\"\u0014\u0010!\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001a\"\u001a\u0010%\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010$*¾\u0001\b\u0007\u0010)\"[\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030&¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b('\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b((\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00020\u00102[\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030&¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b('\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b((\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00020\u0010*¢\u0001\b\u0007\u0010*\"M\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102M\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010*¢\u0001\b\u0007\u0010+\"M\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0012\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030&¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b('\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u00102M\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0012\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030&¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b('\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u0010¨\u0006,"}, m88121d2 = {"Ll/ag4;", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "cause", "onCancellation", "", "j", "(Ll/ag4;Lkotlin/jvm/functions/Function1;)Z", "", "trySelectInternalResult", "Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "a", "(I)Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "Lkotlin/Function3;", "", "clauseObject", "param", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "Lkotlin/jvm/functions/Function3;", "DUMMY_PROCESS_RESULT_FUNCTION", "Ll/goh0;", "b", "Ll/goh0;", "STATE_REG", "c", "STATE_COMPLETED", Constants.INAPP_DATA_TAG, "STATE_CANCELLED", "e", "NO_RESULT", "f", RXScreenCaptureService.KEY_INDEX, "()Ll/goh0;", "PARAM_CLAUSE_0", "Ll/gle0;", "select", "internalResult", "OnCancellationConstructor", "ProcessResultFunction", "RegistrationFunction", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class SelectKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Function3<Object, Object, Object, Object> f67638a = new Function3() { // from class: kotlinx.coroutines.selects.SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1
        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Void invoke(@NotNull Object obj, @Nullable Object obj2, @Nullable Object obj3) {
            return null;
        }
    };

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final goh0 f67639b = new goh0("STATE_REG");

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final goh0 f67640c = new goh0("STATE_COMPLETED");

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final goh0 f67641d = new goh0("STATE_CANCELLED");

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final goh0 f67642e = new goh0("NO_RESULT");

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final goh0 f67643f = new goh0("PARAM_CLAUSE_0");

    /* JADX INFO: renamed from: a */
    public static final TrySelectDetailedResult m95222a(int i) {
        if (i == 0) {
            return TrySelectDetailedResult.SUCCESSFUL;
        }
        if (i == 1) {
            return TrySelectDetailedResult.REREGISTER;
        }
        if (i == 2) {
            return TrySelectDetailedResult.CANCELLED;
        }
        if (i == 3) {
            return TrySelectDetailedResult.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final goh0 m95230i() {
        return f67643f;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m95231j(ag4<? super Unit> ag4Var, Function1<? super Throwable, Unit> function1) {
        Object objMo94634A = ag4Var.mo94634A(Unit.INSTANCE, null, function1);
        if (objMo94634A == null) {
            return false;
        }
        ag4Var.mo94671w(objMo94634A);
        return true;
    }
}
