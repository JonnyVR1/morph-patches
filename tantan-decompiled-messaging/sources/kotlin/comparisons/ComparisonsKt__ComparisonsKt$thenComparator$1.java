package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 176)
@SourceDebugExtension
public final class ComparisonsKt__ComparisonsKt$thenComparator$1<T> implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Comparator<T> f63435a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function2<T, T, Integer> f63436b;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int iCompare = this.f63435a.compare(t, t2);
        return iCompare != 0 ? iCompare : this.f63436b.invoke(t, t2).intValue();
    }
}
