package kotlinx.coroutines.flow;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aui;
import p153l.bui;
import p153l.c4s;
import p153l.p7f;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a:\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0001H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "", c4s.C_ZONE, "Ll/aui;", FirebaseAnalytics.Param.DESTINATION, "a", "(Ll/aui;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__CollectionKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectionKt$a */
    @Metadata(m88120d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0010\b\u0001\u0010\u0003*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, c4s.C_ZONE, "", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class C15536a<T> implements bui {

        /* JADX INFO: Incorrect field signature: TC; */
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Collection f67476a;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        public C15536a(Collection collection) {
            this.f67476a = collection;
        }

        @Override // p153l.bui
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            this.f67476a.add(t);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T, C extends Collection<? super T>> Object m94970a(@NotNull aui<? extends T> auiVar, @NotNull C c, @NotNull Continuation<? super C> continuation) throws Throwable {
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
        Object objM198688e = uyp.m198688e();
        int i2 = flowKt__CollectionKt$toCollection$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            bui<? super Object> c15536a = new C15536a<>(c);
            flowKt__CollectionKt$toCollection$1.L$0 = c;
            flowKt__CollectionKt$toCollection$1.label = 1;
            return auiVar.collect(c15536a, flowKt__CollectionKt$toCollection$1) == objM198688e ? objM198688e : c;
        }
        if (i2 != 1) {
            wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Collection collection = (Collection) flowKt__CollectionKt$toCollection$1.L$0;
        ResultKt.m88128b(obj);
        return collection;
    }
}
