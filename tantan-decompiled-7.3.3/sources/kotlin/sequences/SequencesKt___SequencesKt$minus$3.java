package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.SequencesKt___SequencesKt$minus$3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"kotlin/sequences/SequencesKt___SequencesKt$minus$3", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class SequencesKt___SequencesKt$minus$3 implements Sequence<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterable<Object> f67209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Sequence<Object> f67210b;

    /* JADX INFO: renamed from: b */
    public static boolean m94204b(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<Object> iterator() {
        final Collection collectionConvertToListIfNotCollection = CollectionsKt.convertToListIfNotCollection(this.f67209a);
        boolean zIsEmpty = collectionConvertToListIfNotCollection.isEmpty();
        Sequence<Object> sequence = this.f67210b;
        return zIsEmpty ? sequence.iterator() : SequencesKt___SequencesKt.m94176E(sequence, new Function1() { // from class: l.rqe0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SequencesKt___SequencesKt$minus$3.m94204b(collectionConvertToListIfNotCollection, obj));
            }
        }).iterator();
    }
}
