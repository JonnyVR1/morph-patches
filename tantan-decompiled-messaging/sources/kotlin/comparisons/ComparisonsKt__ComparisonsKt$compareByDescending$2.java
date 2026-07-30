package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 176)
@SourceDebugExtension
public final class ComparisonsKt__ComparisonsKt$compareByDescending$2<T> implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Comparator<Object> f63423a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1<T, Object> f63424b;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Comparator<Object> comparator = this.f63423a;
        Function1<T, Object> function1 = this.f63424b;
        return comparator.compare(function1.invoke(t2), function1.invoke(t));
    }
}
