package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B¨\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012U\u0010\r\u001aQ\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005j\u0002`\f\u0012U\u0010\u0010\u001aQ\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u000f\u0012i\b\u0002\u0010\u0015\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u0012\u0018\u00010\u0005j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bRi\u0010\r\u001aQ\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005j\u0002`\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fRi\u0010\u0010\u001aQ\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005j\u0002`\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR{\u0010\u0015\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u0012\u0018\u00010\u0005j\u0004\u0018\u0001`\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u0018\u0010\u001f¨\u0006 "}, m87232d2 = {"Ll/vce0;", "Q", "Ll/uce0;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/bde0;", "select", "param", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "a", "Ljava/lang/Object;", Constants.INAPP_DATA_TAG, "()Ljava/lang/Object;", "b", "Lkotlin/jvm/functions/Function3;", "c", "()Lkotlin/jvm/functions/Function3;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class vce0<Q> implements uce0<Q> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Object clauseObject;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function3<Object, bde0<?>, Object, Unit> regFunc;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function3<Object, Object, Object, Object> processResFunc;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Function3<bde0<?>, Object, Object, Function1<Throwable, Unit>> onCancellationConstructor;

    /* JADX WARN: Multi-variable type inference failed */
    public vce0(@NotNull Object obj, @NotNull Function3<Object, ? super bde0<?>, Object, Unit> function3, @NotNull Function3<Object, Object, Object, ? extends Object> function4, @Nullable Function3<? super bde0<?>, Object, Object, ? extends Function1<? super Throwable, Unit>> function5) {
        this.clauseObject = obj;
        this.regFunc = function3;
        this.processResFunc = function4;
        this.onCancellationConstructor = function5;
    }

    @Override // p149l.yce0
    @Nullable
    /* JADX INFO: renamed from: a */
    public Function3<bde0<?>, Object, Object, Function1<Throwable, Unit>> mo187982a() {
        return this.onCancellationConstructor;
    }

    @Override // p149l.yce0
    @NotNull
    /* JADX INFO: renamed from: b */
    public Function3<Object, Object, Object, Object> mo187983b() {
        return this.processResFunc;
    }

    @Override // p149l.yce0
    @NotNull
    /* JADX INFO: renamed from: c */
    public Function3<Object, bde0<?>, Object, Unit> mo187984c() {
        return this.regFunc;
    }

    @Override // p149l.yce0
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public Object getClauseObject() {
        return this.clauseObject;
    }
}
