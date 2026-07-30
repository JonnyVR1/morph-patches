package p149l;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C15423e;
import kotlinx.coroutines.C15424f;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\r¨\u0006\u000f"}, m87232d2 = {"Ll/tc20;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "Ll/ln5;", "a", "Ll/ln5;", "job", "Ll/ppb;", "b", "Ll/ppb;", "()Ll/ppb;", "coroutineScope", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class tc20 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ln5 job;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ppb coroutineScope;

    public tc20(@NotNull CoroutineDispatcher coroutineDispatcher) {
        coroutineDispatcher.getClass();
        ln5 ln5VarM181663b = ryg0.m181663b(null, 1, null);
        this.job = ln5VarM181663b;
        this.coroutineScope = C15424f.m94055a(ln5VarM181663b.plus(coroutineDispatcher).plus(new C15423e("CT-Fetch")));
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ppb getCoroutineScope() {
        return this.coroutineScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tc20() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ tc20(CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? d4e.m109981b() : coroutineDispatcher);
    }
}
