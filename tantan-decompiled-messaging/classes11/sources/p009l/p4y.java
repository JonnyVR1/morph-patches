package p009l;

import com.p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ll/p4y;", "Ll/mwl;", "Lcom/p1/mobile/putong/data/User;", "user", "", "customTag", "<init>", "(Lcom/p1/mobile/putong/data/User;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/p1/mobile/putong/data/User;", "b", "()Lcom/p1/mobile/putong/data/User;", "Ljava/lang/String;", "setCustomTag", "(Ljava/lang/String;)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p4y implements mwl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final User user;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String customTag;

    public p4y(@NotNull User user, @Nullable String str) {
        user.getClass();
        this.user = user;
        this.customTag = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCustomTag() {
        return this.customTag;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p4y)) {
            return false;
        }
        p4y p4yVar = (p4y) other;
        return Intrinsics.d(this.user, p4yVar.user) && Intrinsics.d(this.customTag, p4yVar.customTag);
    }

    public int hashCode() {
        int iHashCode = this.user.hashCode() * 31;
        String str = this.customTag;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "MeetLikersUserItemData(user=" + this.user + ", customTag=" + this.customTag + ")";
    }
}
