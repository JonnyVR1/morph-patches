package p153l;

import androidx.room.AutoClosingRoomOpenHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/se1;", "Ll/o7h0$c;", "delegate", "Ll/re1;", "autoCloser", "<init>", "(Ll/o7h0$c;Ll/re1;)V", "Ll/o7h0$b;", "configuration", "Landroidx/room/AutoClosingRoomOpenHelper;", "b", "(Ll/o7h0$b;)Landroidx/room/AutoClosingRoomOpenHelper;", "a", "Ll/o7h0$c;", "Ll/re1;", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class se1 implements o7h0.InterfaceC19045c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final o7h0.InterfaceC19045c delegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final re1 autoCloser;

    public se1(@NotNull o7h0.InterfaceC19045c interfaceC19045c, @NotNull re1 re1Var) {
        interfaceC19045c.getClass();
        re1Var.getClass();
        this.delegate = interfaceC19045c;
        this.autoCloser = re1Var;
    }

    @Override // p153l.o7h0.InterfaceC19045c
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AutoClosingRoomOpenHelper mo104496a(@NotNull o7h0.C19044b configuration) {
        configuration.getClass();
        return new AutoClosingRoomOpenHelper(this.delegate.mo104496a(configuration), this.autoCloser);
    }
}
