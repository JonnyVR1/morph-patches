package p002l;

import com.p1.mobile.putong.core.CoreModule;
import kotlin.Metadata;
import l.uqd0;
import l.zpd0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\f\u0010\u0007\"\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"Ll/bbp;", "", "<init>", "()V", "Ll/zpd0;", "a", "Ll/zpd0;", "()Ll/zpd0;", "setCoreHadClearData", "(Ll/zpd0;)V", "coreHadClearData", "Ll/uqd0;", "b", "Ll/uqd0;", "c", "()Ll/uqd0;", "setLocalReceiveLikeUserId", "(Ll/uqd0;)V", "localReceiveLikeUserId", "setLeastLikedTime", "leastLikedTime", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class bbp {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public zpd0 coreHadClearData = new zpd0("intl_core_had_clear_data_" + CoreModule.H().userId(), -1L);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public uqd0 localReceiveLikeUserId = new uqd0("intl_core_receive_like_local_user" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public zpd0 leastLikedTime = new zpd0("intl_core_today_pass_one_like_me_user" + CoreModule.H().userId(), -1L);

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final zpd0 getCoreHadClearData() {
        return this.coreHadClearData;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final zpd0 getLeastLikedTime() {
        return this.leastLikedTime;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final uqd0 getLocalReceiveLikeUserId() {
        return this.localReceiveLikeUserId;
    }
}
