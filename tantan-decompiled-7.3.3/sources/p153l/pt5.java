package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.core.data.Condition;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ai\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u000226\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u000e\u001a\u00028\u0000\"\u000e\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\f*\u00028\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0017\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Ll/rke0;", p7f.LATITUDE_SOUTH, "", "id", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "prev", "createNewSegment", "Ll/tke0;", "c", "(Ll/rke0;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Ll/qt5;", "N", "b", "(Ll/qt5;)Ll/qt5;", "Lkotlinx/atomicfu/AtomicInt;", "", "delta", "Lkotlin/Function1;", "cur", "", Condition.TYPE, "addConditionally", "(Lkotlinx/atomicfu/AtomicInt;ILkotlin/jvm/functions/Function1;)Z", "Ll/goh0;", "a", "Ll/goh0;", "CLOSED", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class pt5 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final goh0 f153988a = new goh0("CLOSED");

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <N extends qt5<N>> N m173702b(@NotNull N n) {
        while (true) {
            Object objM177898g = n.m177898g();
            if (objM177898g == f153988a) {
                return n;
            }
            qt5 qt5Var = (qt5) objM177898g;
            if (qt5Var != null) {
                n = (N) qt5Var;
            } else if (n.m177902m()) {
                return n;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <S extends rke0<S>> Object m173703c(@NotNull S s, long j, @NotNull Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s.id >= j && !s.mo177900k()) {
                return tke0.m191546a(s);
            }
            Object objM177898g = s.m177898g();
            if (objM177898g == f153988a) {
                return tke0.m191546a(f153988a);
            }
            S sInvoke = (S) ((qt5) objM177898g);
            if (sInvoke == null) {
                sInvoke = function2.invoke(Long.valueOf(s.id + 1), s);
                if (s.m177904o(sInvoke)) {
                    if (s.mo177900k()) {
                        s.m177903n();
                    }
                }
            }
            s = (Object) sInvoke;
        }
    }
}
