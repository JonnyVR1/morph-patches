package p002l;

import kotlin.Metadata;
import l.gkh0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0003¨\u0006\f"}, d2 = {"Ll/xfc0;", "", "<init>", "()V", "", "from", "", "a", "(Ljava/lang/String;)V", "b", "c", "d", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class xfc0 {

    @NotNull
    public static final xfc0 INSTANCE = new xfc0();

    /* JADX INFO: renamed from: a */
    public final void m25905a(@NotNull String from) {
        from.getClass();
        gkh0.j("receive_gift_user", from);
    }

    /* JADX INFO: renamed from: b */
    public final void m25906b() {
        gkh0.j("receive_gift_user", "onShowReceiveGiftAlertDialog");
    }

    /* JADX INFO: renamed from: c */
    public final void m25907c() {
        gkh0.j("receive_gift_user", "onShowReceiveGiftAlertDialogConfirmClick");
    }

    /* JADX INFO: renamed from: d */
    public final void m25908d() {
        gkh0.j("receive_gift_user", "onShowReceiveGiftAlertDialogDismiss");
    }
}
