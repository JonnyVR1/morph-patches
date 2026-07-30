package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0005\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m87232d2 = {"Ll/vse0;", "", "<init>", "()V", "Ll/uqd0;", "a", "Ll/uqd0;", "b", "()Ll/uqd0;", "setLocalReceiveLikeUserId", "(Ll/uqd0;)V", "localReceiveLikeUserId", "Ll/zpd0;", "Ll/zpd0;", "()Ll/zpd0;", "setLeastLikedTime", "(Ll/zpd0;)V", "leastLikedTime", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class vse0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public uqd0 localReceiveLikeUserId = new uqd0("core_receive_like_local_user" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public zpd0 leastLikedTime = new zpd0("core_today_pass_one_like_me_user" + CoreModule.m29931H().userId(), -1L);

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final zpd0 getLeastLikedTime() {
        return this.leastLikedTime;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final uqd0 getLocalReceiveLikeUserId() {
        return this.localReceiveLikeUserId;
    }
}
