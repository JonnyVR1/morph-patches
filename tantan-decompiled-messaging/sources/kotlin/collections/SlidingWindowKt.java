package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aD\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001aH\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\r\"\u0004\b\u0000\u0010\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\b0\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0000¨\u0006\u000f"}, m87232d2 = {"checkWindowSizeStep", "", "size", "", "step", "windowedSequence", "Lkotlin/sequences/Sequence;", "", j6f.GPS_DIRECTION_TRUE, "partialWindows", "", "reuseBuffer", "windowedIterator", "", "iterator", "kotlin-stdlib"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class SlidingWindowKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.SlidingWindowKt$windowedIterator$1 */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, m87232d2 = {"<anonymous>", "", j6f.GPS_DIRECTION_TRUE, "Lkotlin/sequences/SequenceScope;", ""}, m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m87374f = "SlidingWindow.kt", m87375l = {34, 40, 49, 55, 58}, m87376m = "invokeSuspend", m87377v = 2)
    public static final class C151291<T> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super List<? extends T>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Iterator<T> $iterator;
        final /* synthetic */ boolean $partialWindows;
        final /* synthetic */ boolean $reuseBuffer;
        final /* synthetic */ int $size;
        final /* synthetic */ int $step;
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C151291(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, Continuation<? super C151291> continuation) {
            super(2, continuation);
            this.$size = i;
            this.$step = i2;
            this.$iterator = it;
            this.$reuseBuffer = z;
            this.$partialWindows = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151291 c151291 = new C151291(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, continuation);
            c151291.L$0 = obj;
            return c151291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super List<? extends T>> sequenceScope, Continuation<? super Unit> continuation) {
            return ((C151291) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0083  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:66:0x0158  */
        /* JADX WARN: Code duplicated, block: B:68:0x015c  */
        /* JADX WARN: Code duplicated, block: B:69:0x015e  */
        /* JADX WARN: Code duplicated, block: B:74:0x017e  */
        /* JADX WARN: Code duplicated, block: B:76:0x0184  */
        /* JADX WARN: Code duplicated, block: B:88:0x00c5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x008c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x0089 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x0097 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x007d A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00af -> B:17:0x005d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0141 -> B:60:0x0144). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0175 -> B:73:0x0178). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:21:0x007d
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 420
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt.C151291.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void checkWindowSizeStep(int i, int i2) {
        String str;
        if (i <= 0 || i2 <= 0) {
            if (i != i2) {
                str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                str = "size " + i + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @NotNull
    public static final <T> Iterator<List<T>> windowedIterator(@NotNull Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        it.getClass();
        return !it.hasNext() ? EmptyIterator.INSTANCE : SequencesKt__SequenceBuilderKt.m93261a(new C151291(i, i2, it, z2, z, null));
    }

    @NotNull
    public static final <T> Sequence<List<T>> windowedSequence(@NotNull final Sequence<? extends T> sequence, final int i, final int i2, final boolean z, final boolean z2) {
        sequence.getClass();
        checkWindowSizeStep(i, i2);
        return new Sequence<List<? extends T>>() { // from class: kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<List<? extends T>> iterator() {
                return SlidingWindowKt.windowedIterator(sequence.iterator(), i, i2, z, z2);
            }
        };
    }
}
