package kotlinx.coroutines.flow;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.eri;
import p149l.gvf0;
import p149l.jri;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Lkotlinx/coroutines/flow/StartedLazily;", "Lkotlinx/coroutines/flow/b;", "<init>", "()V", "Ll/gvf0;", "", "subscriptionCount", "Ll/eri;", "Lkotlinx/coroutines/flow/SharingCommand;", "a", "(Ll/gvf0;)Ll/eri;", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class StartedLazily implements InterfaceC15469b {
    @Override // kotlinx.coroutines.flow.InterfaceC15469b
    @NotNull
    /* JADX INFO: renamed from: a */
    public eri<SharingCommand> mo94154a(@NotNull gvf0<Integer> subscriptionCount) {
        return jri.m142964w(new StartedLazily$command$1(subscriptionCount, null));
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Lazily";
    }
}
