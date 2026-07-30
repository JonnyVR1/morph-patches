package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0005\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m88121d2 = {"Ll/c1f0;", "", "<init>", "()V", "Ll/wyd0;", "a", "Ll/wyd0;", "b", "()Ll/wyd0;", "setLocalReceiveLikeUserId", "(Ll/wyd0;)V", "localReceiveLikeUserId", "Ll/byd0;", "Ll/byd0;", "()Ll/byd0;", "setLeastLikedTime", "(Ll/byd0;)V", "leastLikedTime", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class c1f0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public wyd0 localReceiveLikeUserId = new wyd0("core_receive_like_local_user" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public byd0 leastLikedTime = new byd0("core_today_pass_one_like_me_user" + CoreModule.m30929H().userId(), -1L);

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final byd0 getLeastLikedTime() {
        return this.leastLikedTime;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final wyd0 getLocalReceiveLikeUserId() {
        return this.localReceiveLikeUserId;
    }
}
