package p153l;

import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, m88121d2 = {"Ll/aho;", "Ll/svl;", "", "newLikersCount", "", "Lcom/p1/mobile/putong/data/User;", "users", "Lcom/p1/mobile/putong/data/DbLinks;", "dbLinks", "<init>", "(ILjava/util/List;Lcom/p1/mobile/putong/data/DbLinks;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getNewLikersCount", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lcom/p1/mobile/putong/data/DbLinks;", "()Lcom/p1/mobile/putong/data/DbLinks;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final /* data */ class aho implements svl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int newLikersCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<User> users;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final DbLinks dbLinks;

    /* JADX WARN: Multi-variable type inference failed */
    public aho(int i, @NotNull List<? extends User> list, @Nullable DbLinks dbLinks) {
        list.getClass();
        this.newLikersCount = i;
        this.users = list;
        this.dbLinks = dbLinks;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final DbLinks getDbLinks() {
        return this.dbLinks;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<User> m97866b() {
        return this.users;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof aho)) {
            return false;
        }
        aho ahoVar = (aho) other;
        return this.newLikersCount == ahoVar.newLikersCount && Intrinsics.m88377d(this.users, ahoVar.users) && Intrinsics.m88377d(this.dbLinks, ahoVar.dbLinks);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.newLikersCount) * 31) + this.users.hashCode()) * 31;
        DbLinks dbLinks = this.dbLinks;
        return iHashCode + (dbLinks == null ? 0 : dbLinks.hashCode());
    }

    @NotNull
    public String toString() {
        return "IntlMeetLikersNewLikersData(newLikersCount=" + this.newLikersCount + ", users=" + this.users + ", dbLinks=" + this.dbLinks + ")";
    }
}
