package p153l;

import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Ll/bu40;", "Ll/z5e;", "Ll/f45;", "<init>", "()V", "", "dispose", "", "cause", "", "b", "(Ljava/lang/Throwable;)Z", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/o;", "getParent", "()Lkotlinx/coroutines/o;", "parent", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class bu40 implements z5e, f45 {

    @NotNull
    public static final bu40 INSTANCE = new bu40();

    @Override // p153l.f45
    /* JADX INFO: renamed from: b */
    public boolean mo106425b(@NotNull Throwable cause) {
        return false;
    }

    @Override // p153l.f45
    @Nullable
    public InterfaceC15593o getParent() {
        return null;
    }

    @NotNull
    public String toString() {
        return "NonDisposableHandle";
    }

    @Override // p153l.z5e
    public void dispose() {
    }
}
