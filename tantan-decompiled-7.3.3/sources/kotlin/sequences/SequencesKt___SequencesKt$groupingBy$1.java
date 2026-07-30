package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.Grouping;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"kotlin/sequences/SequencesKt___SequencesKt$groupingBy$1", "Lkotlin/collections/Grouping;", "", "sourceIterator", "()Ljava/util/Iterator;", "element", "keyOf", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 176)
@SourceDebugExtension
public final class SequencesKt___SequencesKt$groupingBy$1 implements Grouping<Object, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Sequence<Object> f67203a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1<Object, Object> f67204b;

    @Override // kotlin.collections.Grouping
    public Object keyOf(Object element) {
        return this.f67204b.invoke(element);
    }

    @Override // kotlin.collections.Grouping
    public Iterator<Object> sourceIterator() {
        return this.f67203a.iterator();
    }
}
