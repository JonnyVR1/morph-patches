package p153l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\b¨\u0006\r"}, m88121d2 = {"Ll/wd60;", "", "<init>", "()V", "", "receiverId", "", "b", "(Ljava/lang/String;)V", "message", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class wd60 {

    @NotNull
    public static final wd60 INSTANCE = new wd60();

    /* JADX INFO: renamed from: a */
    public final void m205844a(@NotNull String receiverId, @Nullable String message) {
        receiverId.getClass();
        nsh0.m164608j("packet_gift_un_jail", "unJailAnchorIdFail. And receiver id is : " + receiverId + "; message is : " + message);
    }

    /* JADX INFO: renamed from: b */
    public final void m205845b(@NotNull String receiverId) {
        receiverId.getClass();
        nsh0.m164608j("packet_gift_un_jail", "unJailAnchorIdSuccess. And receiver id is : " + receiverId);
    }

    /* JADX INFO: renamed from: c */
    public final void m205846c(@Nullable String message) {
        nsh0.m164608j("packet_gift_un_jail", "unJailFailWhenCheckId. Check error message is : " + message);
    }
}
