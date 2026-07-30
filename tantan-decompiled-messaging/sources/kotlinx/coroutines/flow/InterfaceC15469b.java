package kotlinx.coroutines.flow;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.eri;
import p149l.gvf0;
import p149l.zuf0;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\u0007J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m87232d2 = {"Lkotlinx/coroutines/flow/b;", "", "Ll/gvf0;", "", "subscriptionCount", "Ll/eri;", "Lkotlinx/coroutines/flow/SharingCommand;", "a", "(Ll/gvf0;)Ll/eri;", "Companion", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public interface InterfaceC15469b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f66872a;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.b$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\f"}, m87232d2 = {"Lkotlinx/coroutines/flow/b$a;", "", "<init>", "()V", "Lkotlinx/coroutines/flow/b;", "b", "Lkotlinx/coroutines/flow/b;", "a", "()Lkotlinx/coroutines/flow/b;", "Eagerly", "c", "Lazily", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f66872a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final InterfaceC15469b Eagerly = new zuf0();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public static final InterfaceC15469b Lazily = new StartedLazily();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC15469b m94161a() {
            return Eagerly;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final InterfaceC15469b m94162b() {
            return Lazily;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    eri<SharingCommand> mo94154a(@NotNull gvf0<Integer> subscriptionCount);
}
