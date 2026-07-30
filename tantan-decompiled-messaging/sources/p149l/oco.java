package p149l;

import com.p046p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/oco;", "Ll/etl;", "Lcom/p1/mobile/putong/data/User;", "user", "<init>", "(Lcom/p1/mobile/putong/data/User;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/p1/mobile/putong/data/User;", "()Lcom/p1/mobile/putong/data/User;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* data */ class oco implements etl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final User user;

    public oco(@NotNull User user) {
        user.getClass();
        this.user = user;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof oco) && Intrinsics.m87488d(this.user, ((oco) other).user);
    }

    public int hashCode() {
        return this.user.hashCode();
    }

    @NotNull
    public String toString() {
        return "IntlMeetFakeLikersUserItemData(user=" + this.user + ")";
    }
}
