package p153l;

import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC15576b;
import kotlinx.coroutines.flow.SharingCommand;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/i3g0;", "Lkotlinx/coroutines/flow/b;", "<init>", "()V", "Ll/p3g0;", "", "subscriptionCount", "Ll/aui;", "Lkotlinx/coroutines/flow/SharingCommand;", "a", "(Ll/p3g0;)Ll/aui;", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class i3g0 implements InterfaceC15576b {
    @Override // kotlinx.coroutines.flow.InterfaceC15576b
    @NotNull
    /* JADX INFO: renamed from: a */
    public aui<SharingCommand> mo95047a(@NotNull p3g0<Integer> subscriptionCount) {
        return fui.m127500x(SharingCommand.START);
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Eagerly";
    }
}
