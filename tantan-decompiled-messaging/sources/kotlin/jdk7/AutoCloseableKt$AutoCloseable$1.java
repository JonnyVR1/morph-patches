package kotlin.jdk7;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 176)
@SourceDebugExtension
public final class AutoCloseableKt$AutoCloseable$1 implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function0<Unit> f63511a;

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f63511a.invoke();
    }
}
