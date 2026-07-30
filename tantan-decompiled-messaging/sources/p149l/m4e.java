package p149l;

import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC15406b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/m4e;", "Lkotlinx/coroutines/b;", "Ll/l4e;", "handle", "<init>", "(Ll/l4e;)V", "", "cause", "", "a", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Ll/l4e;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class m4e implements InterfaceC15406b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final l4e handle;

    public m4e(@NotNull l4e l4eVar) {
        this.handle = l4eVar;
    }

    @Override // kotlinx.coroutines.InterfaceC15406b
    /* JADX INFO: renamed from: a */
    public void mo93737a(@Nullable Throwable cause) {
        this.handle.dispose();
    }

    @NotNull
    public String toString() {
        return "DisposeOnCancel[" + this.handle + ']';
    }
}
