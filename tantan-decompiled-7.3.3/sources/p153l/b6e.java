package p153l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/b6e;", "Ll/hpq;", "Ll/z5e;", "handle", "<init>", "(Ll/z5e;)V", "", "cause", "", "a", "(Ljava/lang/Throwable;)V", "e", "Ll/z5e;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class b6e extends hpq {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final z5e handle;

    public b6e(@NotNull z5e z5eVar) {
        this.handle = z5eVar;
    }

    @Override // kotlinx.coroutines.InterfaceC15592n
    /* JADX INFO: renamed from: a */
    public void mo94601a(@Nullable Throwable cause) {
        this.handle.dispose();
    }
}
