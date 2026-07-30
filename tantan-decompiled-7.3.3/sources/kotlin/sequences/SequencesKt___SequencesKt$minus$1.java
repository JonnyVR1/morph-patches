package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.SequencesKt___SequencesKt$minus$1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"kotlin/sequences/SequencesKt___SequencesKt$minus$1", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class SequencesKt___SequencesKt$minus$1 implements Sequence<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Sequence<Object> f67205a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f67206b;

    /* JADX INFO: renamed from: b */
    public static boolean m94202b(Ref.BooleanRef booleanRef, Object obj, Object obj2) {
        if (booleanRef.element || !Intrinsics.m88377d(obj2, obj)) {
            return true;
        }
        booleanRef.element = true;
        return false;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<Object> iterator() {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Sequence<Object> sequence = this.f67205a;
        final Object obj = this.f67206b;
        return SequencesKt___SequencesKt.m94172A(sequence, new Function1() { // from class: l.pqe0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(SequencesKt___SequencesKt$minus$1.m94202b(booleanRef, obj, obj2));
            }
        }).iterator();
    }
}
