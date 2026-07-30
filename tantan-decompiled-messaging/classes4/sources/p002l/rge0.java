package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ll/rge0;", "", "Ll/pge0;", "sendGiftRequestInfo", "Ll/qge0;", "sendGiftResultWrapper", "<init>", "(Ll/pge0;Ll/qge0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", LiveMessage.LiveMessageType.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll/pge0;", "()Ll/pge0;", "b", "Ll/qge0;", "()Ll/qge0;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class rge0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final pge0 sendGiftRequestInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final qge0 sendGiftResultWrapper;

    public rge0(@NotNull pge0 pge0Var, @NotNull qge0 qge0Var) {
        pge0Var.getClass();
        qge0Var.getClass();
        this.sendGiftRequestInfo = pge0Var;
        this.sendGiftResultWrapper = qge0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final pge0 getSendGiftRequestInfo() {
        return this.sendGiftRequestInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final qge0 getSendGiftResultWrapper() {
        return this.sendGiftResultWrapper;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof rge0)) {
            return false;
        }
        rge0 rge0Var = (rge0) other;
        return Intrinsics.d(this.sendGiftRequestInfo, rge0Var.sendGiftRequestInfo) && Intrinsics.d(this.sendGiftResultWrapper, rge0Var.sendGiftResultWrapper);
    }

    public int hashCode() {
        return (this.sendGiftRequestInfo.hashCode() * 31) + this.sendGiftResultWrapper.hashCode();
    }

    @NotNull
    public String toString() {
        return "SendGiftSuccessInfo(sendGiftRequestInfo=" + this.sendGiftRequestInfo + ", sendGiftResultWrapper=" + this.sendGiftResultWrapper + ")";
    }
}
