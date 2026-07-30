package p149l;

import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC15486o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m87232d2 = {"Ll/nl40;", "Ll/l4e;", "Ll/e35;", "<init>", "()V", "", "dispose", "", "cause", "", "b", "(Ljava/lang/Throwable;)Z", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/o;", "getParent", "()Lkotlinx/coroutines/o;", "parent", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class nl40 implements l4e, e35 {

    @NotNull
    public static final nl40 INSTANCE = new nl40();

    @Override // p149l.e35
    /* JADX INFO: renamed from: b */
    public boolean mo114583b(@NotNull Throwable cause) {
        return false;
    }

    @Override // p149l.e35
    @Nullable
    public InterfaceC15486o getParent() {
        return null;
    }

    @NotNull
    public String toString() {
        return "NonDisposableHandle";
    }

    @Override // p149l.l4e
    public void dispose() {
    }
}
