package p153l;

import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Ll/mo5;", "Lkotlin/Result;", LovePlanetStage.result, "", "c", "(Ll/mo5;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/o;", "parent", "a", "(Lkotlinx/coroutines/o;)Ll/mo5;", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class oo5 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> mo5<T> m168565a(@Nullable InterfaceC15593o interfaceC15593o) {
        return new no5(interfaceC15593o);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ mo5 m168566b(InterfaceC15593o interfaceC15593o, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC15593o = null;
        }
        return m168565a(interfaceC15593o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final <T> boolean m168567c(@NotNull mo5<T> mo5Var, @NotNull Object obj) {
        Throwable thM225069exceptionOrNullimpl = Result.m225069exceptionOrNullimpl(obj);
        return thM225069exceptionOrNullimpl == null ? mo5Var.mo159237h(obj) : mo5Var.mo159236g(thM225069exceptionOrNullimpl);
    }
}
