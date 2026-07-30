package p153l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/woe0;", "", "Ll/uoe0;", "sendGiftRequestInfo", "Ll/voe0;", "sendGiftResultWrapper", "<init>", "(Ll/uoe0;Ll/voe0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll/uoe0;", "()Ll/uoe0;", "b", "Ll/voe0;", "()Ll/voe0;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final /* data */ class woe0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final uoe0 sendGiftRequestInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final voe0 sendGiftResultWrapper;

    public woe0(@NotNull uoe0 uoe0Var, @NotNull voe0 voe0Var) {
        uoe0Var.getClass();
        voe0Var.getClass();
        this.sendGiftRequestInfo = uoe0Var;
        this.sendGiftResultWrapper = voe0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final uoe0 getSendGiftRequestInfo() {
        return this.sendGiftRequestInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final voe0 getSendGiftResultWrapper() {
        return this.sendGiftResultWrapper;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof woe0)) {
            return false;
        }
        woe0 woe0Var = (woe0) other;
        return Intrinsics.m88377d(this.sendGiftRequestInfo, woe0Var.sendGiftRequestInfo) && Intrinsics.m88377d(this.sendGiftResultWrapper, woe0Var.sendGiftResultWrapper);
    }

    public int hashCode() {
        return (this.sendGiftRequestInfo.hashCode() * 31) + this.sendGiftResultWrapper.hashCode();
    }

    @NotNull
    public String toString() {
        return "SendGiftSuccessInfo(sendGiftRequestInfo=" + this.sendGiftRequestInfo + ", sendGiftResultWrapper=" + this.sendGiftResultWrapper + ")";
    }
}
