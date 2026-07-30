package p153l;

import com.p051p1.mobile.putong.core.data.TextCardData;
import com.p051p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/i1c0;", "", "Lcom/p1/mobile/putong/data/User;", "user", "Lcom/p1/mobile/putong/core/data/TextCardData;", "textCardData", "<init>", "(Lcom/p1/mobile/putong/data/User;Lcom/p1/mobile/putong/core/data/TextCardData;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/p1/mobile/putong/data/User;", "b", "()Lcom/p1/mobile/putong/data/User;", "Lcom/p1/mobile/putong/core/data/TextCardData;", "()Lcom/p1/mobile/putong/core/data/TextCardData;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final /* data */ class i1c0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final User user;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final TextCardData textCardData;

    public i1c0(@NotNull User user, @NotNull TextCardData textCardData) {
        user.getClass();
        textCardData.getClass();
        this.user = user;
        this.textCardData = textCardData;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextCardData getTextCardData() {
        return this.textCardData;
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
        if (!(other instanceof i1c0)) {
            return false;
        }
        i1c0 i1c0Var = (i1c0) other;
        return Intrinsics.m88377d(this.user, i1c0Var.user) && Intrinsics.m88377d(this.textCardData, i1c0Var.textCardData);
    }

    public int hashCode() {
        return (this.user.hashCode() * 31) + this.textCardData.hashCode();
    }

    @NotNull
    public String toString() {
        return "QuickChatCardData(user=" + this.user + ", textCardData=" + this.textCardData + ")";
    }
}
