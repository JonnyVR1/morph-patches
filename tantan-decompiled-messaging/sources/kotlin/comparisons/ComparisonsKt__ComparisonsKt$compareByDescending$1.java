package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p149l.cn5;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 176)
@SourceDebugExtension
public final class ComparisonsKt__ComparisonsKt$compareByDescending$1<T> implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1<T, Comparable<?>> f63422a;

    /* JADX WARN: Multi-variable type inference failed */
    public ComparisonsKt__ComparisonsKt$compareByDescending$1(Function1<? super T, ? extends Comparable<?>> function1) {
        this.f63422a = function1;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Function1<T, Comparable<?>> function1 = this.f63422a;
        return cn5.m107733d(function1.invoke(t2), function1.invoke(t));
    }
}
