package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 176)
@SourceDebugExtension
public final class ComparisonsKt__ComparisonsKt$thenComparator$1<T> implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Comparator<T> f64109a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function2<T, T, Integer> f64110b;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int iCompare = this.f64109a.compare(t, t2);
        return iCompare != 0 ? iCompare : this.f64110b.invoke(t, t2).intValue();
    }
}
