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
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001R\u0014\u0010\u0004\u001a\u00020\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003Rc\u0010\u000f\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005j\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eRc\u0010\u0013\u001aQ\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005j\u0002`\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eRu\u0010\u0019\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b0\u0015\u0018\u00010\u0005j\u0004\u0018\u0001`\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000e\u0082\u0001\u0003\u001a\u001b\u001c¨\u0006\u001d"}, m87232d2 = {"Ll/yce0;", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/Object;", "clauseObject", "Lkotlin/Function3;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/bde0;", "select", "param", "", "Lkotlinx/coroutines/selects/RegistrationFunction;", "c", "()Lkotlin/jvm/functions/Function3;", "regFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "b", "processResFunc", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "a", "onCancellationConstructor", "Ll/sce0;", "Ll/uce0;", "Ll/wce0;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public interface yce0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    Function3<bde0<?>, Object, Object, Function1<Throwable, Unit>> mo187982a();

    @NotNull
    /* JADX INFO: renamed from: b */
    Function3<Object, Object, Object, Object> mo187983b();

    @NotNull
    /* JADX INFO: renamed from: c */
    Function3<Object, bde0<?>, Object, Unit> mo187984c();

    @NotNull
    /* JADX INFO: renamed from: d */
    Object mo187985d();
}
