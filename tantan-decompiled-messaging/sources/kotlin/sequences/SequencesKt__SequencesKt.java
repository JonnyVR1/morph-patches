package kotlin.sequences;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.bie0;
import p149l.bze;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\"\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001aE\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0015\u0010\u000f\u001a-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00162\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001a?\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0011H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aC\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00162\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0011¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "", "Lkotlin/sequences/Sequence;", "g", "(Ljava/util/Iterator;)Lkotlin/sequences/Sequence;", "", "elements", Constants.KEY_T, "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "element", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/lang/Object;)Lkotlin/sequences/Sequence;", RXScreenCaptureService.KEY_INDEX, "()Lkotlin/sequences/Sequence;", "j", "(Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;", "R", "Lkotlin/Function1;", "iterator", "k", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "h", "", "Lkotlin/Function0;", "nextFunction", "o", "(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;", "seed", "n", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "seedFunction", "p", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/sequences/SequencesKt")
public class SequencesKt__SequencesKt extends bie0 {
    @NotNull
    /* JADX INFO: renamed from: g */
    public static <T> Sequence<T> m93267g(@NotNull final Iterator<? extends T> it) {
        it.getClass();
        return m93268h(new Sequence<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return it;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: h */
    public static <T> Sequence<T> m93268h(@NotNull Sequence<? extends T> sequence) {
        sequence.getClass();
        return sequence instanceof ConstrainedOnceSequence ? sequence : new ConstrainedOnceSequence(sequence);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static <T> Sequence<T> m93269i() {
        return bze.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final <T> Sequence<T> m93270j(@NotNull Sequence<? extends Sequence<? extends T>> sequence) {
        sequence.getClass();
        return m93271k(sequence, new Function1() { // from class: l.eie0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SequencesKt__SequencesKt.m93272l((Sequence) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static final <T, R> Sequence<R> m93271k(Sequence<? extends T> sequence, Function1<? super T, ? extends Iterator<? extends R>> function1) {
        return sequence instanceof TransformingSequence ? ((TransformingSequence) sequence).m93329d(function1) : new FlatteningSequence(sequence, new Function1() { // from class: l.fie0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SequencesKt__SequencesKt.m93273m(obj);
            }
        }, function1);
    }

    /* JADX INFO: renamed from: l */
    public static final Iterator m93272l(Sequence sequence) {
        sequence.getClass();
        return sequence.iterator();
    }

    /* JADX INFO: renamed from: m */
    public static final Object m93273m(Object obj) {
        return obj;
    }

    @LowPriorityInOverloadResolution
    @NotNull
    /* JADX INFO: renamed from: n */
    public static <T> Sequence<T> m93274n(@Nullable final T t, @NotNull Function1<? super T, ? extends T> function1) {
        function1.getClass();
        return t == null ? bze.INSTANCE : new GeneratorSequence(new Function0() { // from class: l.cie0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SequencesKt__SequencesKt.m93278r(t);
            }
        }, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static <T> Sequence<T> m93275o(@NotNull final Function0<? extends T> function0) {
        function0.getClass();
        return m93268h(new GeneratorSequence(function0, new Function1() { // from class: l.die0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SequencesKt__SequencesKt.m93277q(function0, obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static <T> Sequence<T> m93276p(@NotNull Function0<? extends T> function0, @NotNull Function1<? super T, ? extends T> function1) {
        function0.getClass();
        function1.getClass();
        return new GeneratorSequence(function0, function1);
    }

    /* JADX INFO: renamed from: q */
    public static final Object m93277q(Function0 function0, Object obj) {
        obj.getClass();
        return function0.invoke();
    }

    /* JADX INFO: renamed from: r */
    public static final Object m93278r(Object obj) {
        return obj;
    }

    @SinceKotlin
    @NotNull
    /* JADX INFO: renamed from: s */
    public static final <T> Sequence<T> m93279s(final T t) {
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$sequenceOf$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return new SequencesKt__SequencesKt$sequenceOf$1$1(t);
            }
        };
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public static <T> Sequence<T> m93280t(@NotNull T... tArr) {
        tArr.getClass();
        return ArraysKt.asSequence(tArr);
    }
}
