package p002l;

import android.content.Context;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001b"}, d2 = {"Ll/pp50;", "", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/data/User;", "user", "", "targetUserId", "<init>", "(Landroid/content/Context;Lcom/p1/mobile/putong/data/User;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", LiveMessage.LiveMessageType.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/content/Context;", "()Landroid/content/Context;", "b", "Lcom/p1/mobile/putong/data/User;", "c", "()Lcom/p1/mobile/putong/data/User;", "Ljava/lang/String;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class pp50 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final User user;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String targetUserId;

    public pp50(@NotNull Context context, @NotNull User user, @NotNull String str) {
        context.getClass();
        user.getClass();
        str.getClass();
        this.context = context;
        this.user = user;
        this.targetUserId = str;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTargetUserId() {
        return this.targetUserId;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof pp50)) {
            return false;
        }
        pp50 pp50Var = (pp50) other;
        return Intrinsics.d(this.context, pp50Var.context) && Intrinsics.d(this.user, pp50Var.user) && Intrinsics.d(this.targetUserId, pp50Var.targetUserId);
    }

    public int hashCode() {
        return (((this.context.hashCode() * 31) + this.user.hashCode()) * 31) + this.targetUserId.hashCode();
    }

    @NotNull
    public String toString() {
        return "OpenProfilePageInfo(context=" + this.context + ", user=" + this.user + ", targetUserId=" + this.targetUserId + ")";
    }
}
