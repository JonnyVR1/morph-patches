package p149l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\b¨\u0006\r"}, m87232d2 = {"Ll/q560;", "", "<init>", "()V", "", "receiverId", "", "b", "(Ljava/lang/String;)V", "message", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class q560 {

    @NotNull
    public static final q560 INSTANCE = new q560();

    /* JADX INFO: renamed from: a */
    public final void m172991a(@NotNull String receiverId, @Nullable String message) {
        receiverId.getClass();
        gkh0.m126627j("packet_gift_un_jail", "unJailAnchorIdFail. And receiver id is : " + receiverId + "; message is : " + message);
    }

    /* JADX INFO: renamed from: b */
    public final void m172992b(@NotNull String receiverId) {
        receiverId.getClass();
        gkh0.m126627j("packet_gift_un_jail", "unJailAnchorIdSuccess. And receiver id is : " + receiverId);
    }

    /* JADX INFO: renamed from: c */
    public final void m172993c(@Nullable String message) {
        gkh0.m126627j("packet_gift_un_jail", "unJailFailWhenCheckId. Check error message is : " + message);
    }
}
