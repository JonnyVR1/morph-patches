package kotlin.sequences;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.BloodType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.gie0;
import p149l.j6f;
import p149l.kgj0;
import p149l.l0g0;
import p149l.pce0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000x\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0003\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r\u001aL\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012'\u0010\u000b\u001a#\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0014\u0010\r\u001a)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0015*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u0000\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0000\u0010\r\u001a?\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u001a\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0018j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0019¢\u0006\u0004\b\u001b\u0010\u001c\u001a7\u0010 \u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u001e*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001d*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001f\u001a\u00028\u0001¢\u0006\u0004\b \u0010!\u001a#\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b#\u0010$\u001a#\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b&\u0010$\u001aC\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010'*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\t¢\u0006\u0004\b)\u0010\r\u001a=\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010'*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b*\u0010\r\u001aC\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010'*\u00020\u0015*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\t¢\u0006\u0004\b+\u0010\r\u001a\u001d\u0010,\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b,\u0010-\u001a.\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010.\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b/\u00100\u001a4\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0086\u0002¢\u0006\u0004\b3\u00104\u001a4\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b'\u00105\u001a}\u0010?\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010\f*\u000606j\u0002`7*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u00108\u001a\u00028\u00012\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\b\b\u0002\u0010<\u001a\u0002092\b\b\u0002\u0010=\u001a\u00020\u00052\b\b\u0002\u0010>\u001a\u0002092\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000209\u0018\u00010\t¢\u0006\u0004\b?\u0010@\u001ag\u0010B\u001a\u00020A\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\b\b\u0002\u0010<\u001a\u0002092\b\b\u0002\u0010=\u001a\u00020\u00052\b\b\u0002\u0010>\u001a\u0002092\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000209\u0018\u00010\t¢\u0006\u0004\bB\u0010C\u001a#\u0010D\u001a\b\u0012\u0004\u0012\u00028\u000001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bD\u0010E¨\u0006F"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Lkotlin/sequences/Sequence;", "H", "(Lkotlin/sequences/Sequence;)Ljava/lang/Object;", "M", "", "n", BaseSei.f13932Z, "(Lkotlin/sequences/Sequence;I)Lkotlin/sequences/Sequence;", "Lkotlin/Function1;", "", "predicate", "A", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, FirebaseAnalytics.Param.INDEX, "B", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;", "E", "", "F", "(Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", j6f.LATITUDE_SOUTH, "(Lkotlin/sequences/Sequence;Ljava/util/Comparator;)Lkotlin/sequences/Sequence;", "", b2s.C_ZONE, FirebaseAnalytics.Param.DESTINATION, "U", "(Lkotlin/sequences/Sequence;Ljava/util/Collection;)Ljava/util/Collection;", "", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Lkotlin/sequences/Sequence;)Ljava/util/List;", "", "W", "R", "transform", "I", "N", BloodType.f38728O, BaseSei.f13931Y, "(Lkotlin/sequences/Sequence;)I", "element", "Q", "(Lkotlin/sequences/Sequence;Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "", "elements", "P", "(Lkotlin/sequences/Sequence;Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", "", "separator", RequestParameters.PREFIX, "postfix", Constants.KEY_LIMIT, "truncated", "J", "(Lkotlin/sequences/Sequence;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "K", "(Lkotlin/sequences/Sequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", BaseSei.f13930X, "(Lkotlin/sequences/Sequence;)Ljava/lang/Iterable;", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/sequences/SequencesKt")
@SourceDebugExtension
public class SequencesKt___SequencesKt extends gie0 {
    @NotNull
    /* JADX INFO: renamed from: A */
    public static <T> Sequence<T> m93281A(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        sequence.getClass();
        function1.getClass();
        return new FilteringSequence(sequence, true, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public static <T> Sequence<T> m93282B(@NotNull Sequence<? extends T> sequence, @NotNull final Function2<? super Integer, ? super T, Boolean> function2) {
        sequence.getClass();
        function2.getClass();
        return new TransformingSequence(new FilteringSequence(new IndexingSequence(sequence), true, new Function1() { // from class: l.hie0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SequencesKt___SequencesKt.m93283C(function2, (IndexedValue) obj));
            }
        }), new Function1() { // from class: l.iie0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SequencesKt___SequencesKt.m93284D((IndexedValue) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static final boolean m93283C(Function2 function2, IndexedValue indexedValue) {
        indexedValue.getClass();
        return ((Boolean) function2.invoke(Integer.valueOf(indexedValue.getIndex()), indexedValue.getValue())).booleanValue();
    }

    /* JADX INFO: renamed from: D */
    public static final Object m93284D(IndexedValue indexedValue) {
        indexedValue.getClass();
        return indexedValue.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public static <T> Sequence<T> m93285E(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        sequence.getClass();
        function1.getClass();
        return new FilteringSequence(sequence, false, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public static <T> Sequence<T> m93286F(@NotNull Sequence<? extends T> sequence) {
        sequence.getClass();
        Sequence<T> sequenceM93285E = m93285E(sequence, new Function1() { // from class: l.jie0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SequencesKt___SequencesKt.m93287G(obj));
            }
        });
        sequenceM93285E.getClass();
        return sequenceM93285E;
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m93287G(Object obj) {
        return obj == null;
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public static <T> T m93288H(@NotNull Sequence<? extends T> sequence) {
        sequence.getClass();
        Iterator<? extends T> it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public static <T, R> Sequence<R> m93289I(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends Sequence<? extends R>> function1) {
        sequence.getClass();
        function1.getClass();
        return new FlatteningSequence(sequence, function1, SequencesKt___SequencesKt$flatMap$2.INSTANCE);
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public static final <T, A extends Appendable> A m93290J(@NotNull Sequence<? extends T> sequence, @NotNull A a, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable Function1<? super T, ? extends CharSequence> function1) throws IOException {
        sequence.getClass();
        a.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        a.append(charSequence2);
        int i2 = 0;
        for (T t : sequence) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            l0g0.m148098a(a, t, function1);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public static final <T> String m93291K(@NotNull Sequence<? extends T> sequence, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        sequence.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        return ((StringBuilder) m93290J(sequence, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ String m93292L(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return m93291K(sequence, charSequence, charSequence2, charSequence3, i, charSequence5, function2);
    }

    /* JADX INFO: renamed from: M */
    public static <T> T m93293M(@NotNull Sequence<? extends T> sequence) {
        sequence.getClass();
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            kgj0.m145892a("Sequence is empty.");
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public static <T, R> Sequence<R> m93294N(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        sequence.getClass();
        function1.getClass();
        return new TransformingSequence(sequence, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public static <T, R> Sequence<R> m93295O(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        sequence.getClass();
        function1.getClass();
        return m93286F(new TransformingSequence(sequence, function1));
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public static <T> Sequence<T> m93296P(@NotNull Sequence<? extends T> sequence, @NotNull Iterable<? extends T> iterable) {
        sequence.getClass();
        iterable.getClass();
        return SequencesKt__SequencesKt.m93270j(SequencesKt__SequencesKt.m93280t(sequence, CollectionsKt.asSequence(iterable)));
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public static <T> Sequence<T> m93297Q(@NotNull Sequence<? extends T> sequence, T t) {
        sequence.getClass();
        return SequencesKt__SequencesKt.m93270j(SequencesKt__SequencesKt.m93280t(sequence, SequencesKt__SequencesKt.m93279s(t)));
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public static <T> Sequence<T> m93298R(@NotNull Sequence<? extends T> sequence, @NotNull Sequence<? extends T> sequence2) {
        sequence.getClass();
        sequence2.getClass();
        return SequencesKt__SequencesKt.m93270j(SequencesKt__SequencesKt.m93280t(sequence, sequence2));
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public static <T> Sequence<T> m93299S(@NotNull final Sequence<? extends T> sequence, @NotNull final Comparator<? super T> comparator) {
        sequence.getClass();
        comparator.getClass();
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$sortedWith$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                List listM93303W = SequencesKt___SequencesKt.m93303W(sequence);
                CollectionsKt.sortWith(listM93303W, comparator);
                return listM93303W.iterator();
            }
        };
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public static <T> Sequence<T> m93300T(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        sequence.getClass();
        function1.getClass();
        return new TakeWhileSequence(sequence, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public static final <T, C extends Collection<? super T>> C m93301U(@NotNull Sequence<? extends T> sequence, @NotNull C c) {
        sequence.getClass();
        c.getClass();
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public static <T> List<T> m93302V(@NotNull Sequence<? extends T> sequence) {
        sequence.getClass();
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return CollectionsKt.emptyList();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return CollectionsKt.listOf(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public static <T> List<T> m93303W(@NotNull Sequence<? extends T> sequence) {
        sequence.getClass();
        return (List) m93301U(sequence, new ArrayList());
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public static <T> Iterable<T> m93307x(@NotNull Sequence<? extends T> sequence) {
        sequence.getClass();
        return new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(sequence);
    }

    /* JADX INFO: renamed from: y */
    public static <T> int m93308y(@NotNull Sequence<? extends T> sequence) {
        sequence.getClass();
        Iterator<? extends T> it = sequence.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: z */
    public static <T> Sequence<T> m93309z(@NotNull Sequence<? extends T> sequence, int i) {
        sequence.getClass();
        if (i < 0) {
            pce0.m168340a("Requested element count ", i, " is less than zero.");
            return null;
        }
        if (i == 0) {
            return sequence;
        }
        return sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).mo93237a(i) : new DropSequence(sequence, i);
    }
}
