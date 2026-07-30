package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p153l.go5;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 176)
@SourceDebugExtension
public final class ComparisonsKt__ComparisonsKt$thenByDescending$1<T> implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Comparator<T> f64104a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1<T, Comparable<?>> f64105b;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int iCompare = this.f64104a.compare(t, t2);
        if (iCompare != 0) {
            return iCompare;
        }
        Function1<T, Comparable<?>> function1 = this.f64105b;
        return go5.m131087d(function1.invoke(t2), function1.invoke(t));
    }
}
