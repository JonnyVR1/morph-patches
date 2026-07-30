package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.core.data.Condition;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ai\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u000226\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u000e\u001a\u00028\u0000\"\u000e\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\f*\u00028\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0017\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m87232d2 = {"Ll/mce0;", j6f.LATITUDE_SOUTH, "", "id", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "prev", "createNewSegment", "Ll/oce0;", "c", "(Ll/mce0;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Ll/ms5;", "N", "b", "(Ll/ms5;)Ll/ms5;", "Lkotlinx/atomicfu/AtomicInt;", "", "delta", "Lkotlin/Function1;", "cur", "", Condition.TYPE, "addConditionally", "(Lkotlinx/atomicfu/AtomicInt;ILkotlin/jvm/functions/Function1;)Z", "Ll/yfh0;", "a", "Ll/yfh0;", "CLOSED", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ls5 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final yfh0 f129806a = new yfh0("CLOSED");

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <N extends ms5<N>> N m151514b(@NotNull N n) {
        while (true) {
            Object objM156113g = n.m156113g();
            if (objM156113g == f129806a) {
                return n;
            }
            ms5 ms5Var = (ms5) objM156113g;
            if (ms5Var != null) {
                n = (N) ms5Var;
            } else if (n.m156116m()) {
                return n;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <S extends mce0<S>> Object m151515c(@NotNull S s, long j, @NotNull Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s.id >= j && !s.mo153991k()) {
                return oce0.m163510a(s);
            }
            Object objM156113g = s.m156113g();
            if (objM156113g == f129806a) {
                return oce0.m163510a(f129806a);
            }
            S sInvoke = (S) ((ms5) objM156113g);
            if (sInvoke == null) {
                sInvoke = function2.invoke(Long.valueOf(s.id + 1), s);
                if (s.m156118o(sInvoke)) {
                    if (s.mo153991k()) {
                        s.m156117n();
                    }
                }
            }
            s = (Object) sInvoke;
        }
    }
}
