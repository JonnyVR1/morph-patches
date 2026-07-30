package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p153l.go5;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 176)
@SourceDebugExtension
public final class ComparisonsKt__ComparisonsKt$compareBy$2<T> implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1<T, Comparable<?>> f64093a;

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$compareBy$2(Function1<? super T, ? extends Comparable<?>> function1) {
        this.f64093a = function1;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Function1<T, Comparable<?>> function1 = this.f64093a;
        return go5.m131087d(function1.invoke(t), function1.invoke(t2));
    }
}
