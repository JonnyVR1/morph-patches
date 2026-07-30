package kotlin.jdk7;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 176)
@SourceDebugExtension
public final class AutoCloseableKt$AutoCloseable$1 implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function0<Unit> f64185a;

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f64185a.invoke();
    }
}
