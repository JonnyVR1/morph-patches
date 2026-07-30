package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 176)
@SourceDebugExtension
public final class ComparisonsKt__ComparisonsKt$thenBy$2<T> implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Comparator<T> f63427a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Comparator<Object> f63428b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function1<T, Object> f63429c;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int iCompare = this.f63427a.compare(t, t2);
        if (iCompare != 0) {
            return iCompare;
        }
        Comparator<Object> comparator = this.f63428b;
        Function1<T, Object> function1 = this.f63429c;
        return comparator.compare(function1.invoke(t), function1.invoke(t2));
    }
}
