package kotlin.sequences;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"kotlin/sequences/SequencesKt___SequencesKt$sorted$1", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class SequencesKt___SequencesKt$sorted$1 implements Sequence<Comparable<Object>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Sequence<Comparable<Object>> f67213a;

    @Override // kotlin.sequences.Sequence
    public Iterator<Comparable<Object>> iterator() {
        List listM94194W = SequencesKt___SequencesKt.m94194W(this.f67213a);
        CollectionsKt.sort(listM94194W);
        return listM94194W.iterator();
    }
}
