package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u001f\u0010 ¨\u0006!"}, m88121d2 = {"Ll/nx50;", "", "Lcom/p1/mobile/putong/data/User;", "userCardUser", "Lcom/p1/mobile/putong/live/livingroom/common/usercard/bean/UserCardBean;", "userCardBean", "", "categoryId", "<init>", "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/live/livingroom/common/usercard/bean/UserCardBean;Ljava/lang/String;)V", "currentUser", "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/live/livingroom/common/usercard/bean/UserCardBean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/p1/mobile/putong/data/User;", "c", "()Lcom/p1/mobile/putong/data/User;", "b", "Lcom/p1/mobile/putong/live/livingroom/common/usercard/bean/UserCardBean;", "()Lcom/p1/mobile/putong/live/livingroom/common/usercard/bean/UserCardBean;", "setUserCardBean", "(Lcom/p1/mobile/putong/live/livingroom/common/usercard/bean/UserCardBean;)V", "Ljava/lang/String;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final /* data */ class nx50 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final User userCardUser;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public UserCardBean userCardBean;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public String categoryId;

    public nx50(@NotNull User user, @Nullable UserCardBean userCardBean, @NotNull String str) {
        user.getClass();
        str.getClass();
        this.userCardUser = user;
        this.userCardBean = userCardBean;
        this.categoryId = str;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final UserCardBean getUserCardBean() {
        return this.userCardBean;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final User getUserCardUser() {
        return this.userCardUser;
    }

    /* JADX INFO: renamed from: d */
    public final void m165101d(@NotNull String str) {
        str.getClass();
        this.categoryId = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof nx50)) {
            return false;
        }
        nx50 nx50Var = (nx50) other;
        return Intrinsics.m88377d(this.userCardUser, nx50Var.userCardUser) && Intrinsics.m88377d(this.userCardBean, nx50Var.userCardBean) && Intrinsics.m88377d(this.categoryId, nx50Var.categoryId);
    }

    public int hashCode() {
        int iHashCode = this.userCardUser.hashCode() * 31;
        UserCardBean userCardBean = this.userCardBean;
        return ((iHashCode + (userCardBean == null ? 0 : userCardBean.hashCode())) * 31) + this.categoryId.hashCode();
    }

    @NotNull
    public String toString() {
        return "OpenGiftWallV2Info(userCardUser=" + this.userCardUser + ", userCardBean=" + this.userCardBean + ", categoryId=" + this.categoryId + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nx50(@NotNull User user, @NotNull UserCardBean userCardBean) {
        this(user, userCardBean, "");
        user.getClass();
        userCardBean.getClass();
    }
}
