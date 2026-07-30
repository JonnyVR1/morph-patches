package p149l;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0005¢\u0006\u0004\b\u000b\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m87232d2 = {"Ll/hpw;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "parallelism", "limitedParallelism", "(I)Lkotlinx/coroutines/CoroutineDispatcher;", "toStringInternalImpl", "getImmediate", "()Ll/hpw;", "immediate", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public abstract class hpw extends CoroutineDispatcher {
    @NotNull
    public abstract hpw getImmediate();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public CoroutineDispatcher limitedParallelism(int parallelism) {
        cmr.m107694a(parallelism);
        return this;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        return o8c.m163111a(this) + '@' + o8c.m163112b(this);
    }

    @Nullable
    public final String toStringInternalImpl() {
        hpw immediate;
        hpw hpwVarM109982c = d4e.m109982c();
        if (this == hpwVarM109982c) {
            return "Dispatchers.Main";
        }
        try {
            immediate = hpwVarM109982c.getImmediate();
        } catch (UnsupportedOperationException unused) {
            immediate = null;
        }
        if (this == immediate) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
