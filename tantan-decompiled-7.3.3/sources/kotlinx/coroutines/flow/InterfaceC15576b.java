package kotlinx.coroutines.flow;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.aui;
import p153l.i3g0;
import p153l.p3g0;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\u0007J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m88121d2 = {"Lkotlinx/coroutines/flow/b;", "", "Ll/p3g0;", "", "subscriptionCount", "Ll/aui;", "Lkotlinx/coroutines/flow/SharingCommand;", "a", "(Ll/p3g0;)Ll/aui;", "Companion", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public interface InterfaceC15576b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f67546a;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.b$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\f"}, m88121d2 = {"Lkotlinx/coroutines/flow/b$a;", "", "<init>", "()V", "Lkotlinx/coroutines/flow/b;", "b", "Lkotlinx/coroutines/flow/b;", "a", "()Lkotlinx/coroutines/flow/b;", "Eagerly", "c", "Lazily", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f67546a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final InterfaceC15576b Eagerly = new i3g0();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public static final InterfaceC15576b Lazily = new StartedLazily();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC15576b m95054a() {
            return Eagerly;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final InterfaceC15576b m95055b() {
            return Lazily;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    aui<SharingCommand> mo95047a(@NotNull p3g0<Integer> subscriptionCount);
}
