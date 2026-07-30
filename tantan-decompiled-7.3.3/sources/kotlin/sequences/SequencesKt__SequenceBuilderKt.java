package kotlin.sequences;

import java.util.Iterator;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import p153l.eqe0;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001aL\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001aL\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\f\u0010\r*\f\b\u0002\u0010\u000f\"\u00020\u000e2\u00020\u000e¨\u0006\u0010"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Lkotlin/sequences/SequenceScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlin/sequences/Sequence;", "b", "(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;", "", "a", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;", "", "State", "kotlin-stdlib"}, m88122k = 5, m88123mv = {2, 2, 0}, m88125xi = 49, m88126xs = "kotlin/sequences/SequencesKt")
public class SequencesKt__SequenceBuilderKt {
    @SinceKotlin
    @NotNull
    /* JADX INFO: renamed from: a */
    public static <T> Iterator<T> m94152a(@BuilderInference @NotNull Function2<? super SequenceScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        function2.getClass();
        eqe0 eqe0Var = new eqe0();
        eqe0Var.m121918j(IntrinsicsKt__IntrinsicsJvmKt.m88255a(function2, eqe0Var, eqe0Var));
        return eqe0Var;
    }

    @SinceKotlin
    @NotNull
    /* JADX INFO: renamed from: b */
    public static <T> Sequence<T> m94153b(@BuilderInference @NotNull final Function2<? super SequenceScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        function2.getClass();
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return SequencesKt__SequenceBuilderKt.m94152a(function2);
            }
        };
    }
}
