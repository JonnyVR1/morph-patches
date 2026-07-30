package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.mbe0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0080\u0010¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "", "a", "(Lkotlinx/coroutines/flow/internal/SafeCollector;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlinx/coroutines/o;", "collectJob", "b", "(Lkotlinx/coroutines/o;Lkotlinx/coroutines/o;)Lkotlinx/coroutines/o;", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class SafeCollector_commonKt {
    @JvmName
    /* JADX INFO: renamed from: a */
    public static final void m95068a(@NotNull final SafeCollector<?> safeCollector, @NotNull CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.fold(0, new Function2<Integer, CoroutineContext.Element, Integer>() { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @NotNull
            public final Integer invoke(int i, @NotNull CoroutineContext.Element element) {
                CoroutineContext.Key<?> key = element.getKey();
                CoroutineContext.Element element2 = safeCollector.collectContext.get(key);
                if (key != InterfaceC15593o.INSTANCE) {
                    return Integer.valueOf(element != element2 ? Integer.MIN_VALUE : i + 1);
                }
                InterfaceC15593o interfaceC15593o = (InterfaceC15593o) element2;
                InterfaceC15593o interfaceC15593oM95069b = SafeCollector_commonKt.m95069b((InterfaceC15593o) element, interfaceC15593o);
                if (interfaceC15593oM95069b == interfaceC15593o) {
                    if (interfaceC15593o != null) {
                        i++;
                    }
                    return Integer.valueOf(i);
                }
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC15593oM95069b + ", expected child of " + interfaceC15593o + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.Element element) {
                return invoke(num.intValue(), element);
            }
        })).intValue() == safeCollector.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final InterfaceC15593o m95069b(@Nullable InterfaceC15593o interfaceC15593o, @Nullable InterfaceC15593o interfaceC15593o2) {
        while (interfaceC15593o != null) {
            if (interfaceC15593o == interfaceC15593o2 || !(interfaceC15593o instanceof mbe0)) {
                return interfaceC15593o;
            }
            interfaceC15593o = interfaceC15593o.getParent();
        }
        return null;
    }
}
