package kotlin.sequences;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.SequencesKt___SequencesKt$minus$4;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"kotlin/sequences/SequencesKt___SequencesKt$minus$4", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class SequencesKt___SequencesKt$minus$4 implements Sequence<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Sequence<Object> f66537a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Sequence<Object> f66538b;

    /* JADX INFO: renamed from: b */
    public static boolean m93314b(List list, Object obj) {
        return list.contains(obj);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<Object> iterator() {
        final List listM93302V = SequencesKt___SequencesKt.m93302V(this.f66537a);
        boolean zIsEmpty = listM93302V.isEmpty();
        Sequence<Object> sequence = this.f66538b;
        return zIsEmpty ? sequence.iterator() : SequencesKt___SequencesKt.m93285E(sequence, new Function1() { // from class: l.nie0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SequencesKt___SequencesKt$minus$4.m93314b(listM93302V, obj));
            }
        }).iterator();
    }
}
