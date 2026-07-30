package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 176)
@SourceDebugExtension
public final class ComparisonsKt__ComparisonsKt$compareBy$3<T> implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Comparator<Object> f64094a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1<T, Object> f64095b;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Comparator<Object> comparator = this.f64094a;
        Function1<T, Object> function1 = this.f64095b;
        return comparator.compare(function1.invoke(t), function1.invoke(t2));
    }
}
