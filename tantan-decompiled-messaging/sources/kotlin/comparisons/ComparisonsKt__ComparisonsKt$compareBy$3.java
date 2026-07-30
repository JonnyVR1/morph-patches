package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 176)
@SourceDebugExtension
public final class ComparisonsKt__ComparisonsKt$compareBy$3<T> implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Comparator<Object> f63420a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1<T, Object> f63421b;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Comparator<Object> comparator = this.f63420a;
        Function1<T, Object> function1 = this.f63421b;
        return comparator.compare(function1.invoke(t), function1.invoke(t2));
    }
}
