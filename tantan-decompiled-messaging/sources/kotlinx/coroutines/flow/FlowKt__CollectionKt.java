package kotlinx.coroutines.flow;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.eri;
import p149l.fri;
import p149l.j6f;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a:\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0001H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "", b2s.C_ZONE, "Ll/eri;", FirebaseAnalytics.Param.DESTINATION, "a", "(Ll/eri;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 5, m87234mv = {1, 9, 0}, m87236xi = 48, m87237xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__CollectionKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectionKt$a */
    @Metadata(m87231d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0010\b\u0001\u0010\u0003*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, b2s.C_ZONE, "", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class C15429a<T> implements fri {

        /* JADX INFO: Incorrect field signature: TC; */
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Collection f66802a;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        public C15429a(Collection collection) {
            this.f66802a = collection;
        }

        @Override // p149l.fri
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            this.f66802a.add(t);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T, C extends Collection<? super T>> Object m94077a(@NotNull eri<? extends T> eriVar, @NotNull C c, @NotNull Continuation<? super C> continuation) throws Throwable {
        FlowKt__CollectionKt$toCollection$1 flowKt__CollectionKt$toCollection$1;
        if (continuation instanceof FlowKt__CollectionKt$toCollection$1) {
            flowKt__CollectionKt$toCollection$1 = (FlowKt__CollectionKt$toCollection$1) continuation;
            int i = flowKt__CollectionKt$toCollection$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__CollectionKt$toCollection$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__CollectionKt$toCollection$1 = new FlowKt__CollectionKt$toCollection$1(continuation);
            }
        } else {
            flowKt__CollectionKt$toCollection$1 = new FlowKt__CollectionKt$toCollection$1(continuation);
        }
        Object obj = flowKt__CollectionKt$toCollection$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = flowKt__CollectionKt$toCollection$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            fri<? super Object> c15429a = new C15429a<>(c);
            flowKt__CollectionKt$toCollection$1.L$0 = c;
            flowKt__CollectionKt$toCollection$1.label = 1;
            return eriVar.collect(c15429a, flowKt__CollectionKt$toCollection$1) == objM196133e ? objM196133e : c;
        }
        if (i2 != 1) {
            qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Collection collection = (Collection) flowKt__CollectionKt$toCollection$1.L$0;
        ResultKt.m87239b(obj);
        return collection;
    }
}
