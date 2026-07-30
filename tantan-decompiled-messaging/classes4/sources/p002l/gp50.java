package p002l;

import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p1.mobile.putong.data.User;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Ll/gp50;", "", "", "giftId", "originalId", "Lcom/p1/mobile/putong/live/livingroom/common/usercard/bean/UserCardBean;", "userCardBean", "Lcom/p1/mobile/putong/data/User;", "userCardUser", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/p1/mobile/putong/live/livingroom/common/usercard/bean/UserCardBean;Lcom/p1/mobile/putong/data/User;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "c", "Lcom/p1/mobile/putong/live/livingroom/common/usercard/bean/UserCardBean;", "()Lcom/p1/mobile/putong/live/livingroom/common/usercard/bean/UserCardBean;", "d", "Lcom/p1/mobile/putong/data/User;", "()Lcom/p1/mobile/putong/data/User;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class gp50 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String giftId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String originalId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final UserCardBean userCardBean;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final User userCardUser;

    public gp50(@NotNull String str, @NotNull String str2, @Nullable UserCardBean userCardBean, @NotNull User user) {
        str.getClass();
        str2.getClass();
        user.getClass();
        this.giftId = str;
        this.originalId = str2;
        this.userCardBean = userCardBean;
        this.userCardUser = user;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOriginalId() {
        return this.originalId;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final UserCardBean getUserCardBean() {
        return this.userCardBean;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final User getUserCardUser() {
        return this.userCardUser;
    }
}
