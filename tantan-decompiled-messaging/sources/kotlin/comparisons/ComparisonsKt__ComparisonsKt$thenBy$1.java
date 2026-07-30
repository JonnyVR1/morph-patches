package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p149l.cn5;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 176)
@SourceDebugExtension
public final class ComparisonsKt__ComparisonsKt$thenBy$1<T> implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Comparator<T> f63425a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1<T, Comparable<?>> f63426b;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int iCompare = this.f63425a.compare(t, t2);
        if (iCompare != 0) {
            return iCompare;
        }
        Function1<T, Comparable<?>> function1 = this.f63426b;
        return cn5.m107733d(function1.invoke(t), function1.invoke(t2));
    }
}
