package p149l;

import androidx.room.AutoClosingRoomOpenHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/le1;", "Ll/gzg0$c;", "delegate", "Ll/ke1;", "autoCloser", "<init>", "(Ll/gzg0$c;Ll/ke1;)V", "Ll/gzg0$b;", "configuration", "Landroidx/room/AutoClosingRoomOpenHelper;", "b", "(Ll/gzg0$b;)Landroidx/room/AutoClosingRoomOpenHelper;", "a", "Ll/gzg0$c;", "Ll/ke1;", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class le1 implements gzg0.InterfaceC17210c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final gzg0.InterfaceC17210c delegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ke1 autoCloser;

    public le1(@NotNull gzg0.InterfaceC17210c interfaceC17210c, @NotNull ke1 ke1Var) {
        interfaceC17210c.getClass();
        ke1Var.getClass();
        this.delegate = interfaceC17210c;
        this.autoCloser = ke1Var;
    }

    @Override // p149l.gzg0.InterfaceC17210c
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AutoClosingRoomOpenHelper mo112331a(@NotNull gzg0.C17209b configuration) {
        configuration.getClass();
        return new AutoClosingRoomOpenHelper(this.delegate.mo112331a(configuration), this.autoCloser);
    }
}
