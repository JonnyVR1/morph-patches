package p009l;

import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018\"\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Ll/mfn;", "", "Lcom/p1/mobile/putong/live/base/data/BLiveUserMask;", "userMask", "", "isSelected", "isOnline", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveUserMask;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveUserMask;", "()Lcom/p1/mobile/putong/live/base/data/BLiveUserMask;", "b", "Z", "c", "()Z", "d", "(Z)V", "setOnline", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class mfn {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveUserMask userMask;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isSelected;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isOnline;

    public mfn(@NotNull BLiveUserMask bLiveUserMask, boolean z, boolean z2) {
        bLiveUserMask.getClass();
        this.userMask = bLiveUserMask;
        this.isSelected = z;
        this.isOnline = z2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BLiveUserMask getUserMask() {
        return this.userMask;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsOnline() {
        return this.isOnline;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: d */
    public final void m18445d(boolean z) {
        this.isSelected = z;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof mfn)) {
            return false;
        }
        mfn mfnVar = (mfn) other;
        return Intrinsics.d(this.userMask, mfnVar.userMask) && this.isSelected == mfnVar.isSelected && this.isOnline == mfnVar.isOnline;
    }

    public int hashCode() {
        return (((this.userMask.hashCode() * 31) + Boolean.hashCode(this.isSelected)) * 31) + Boolean.hashCode(this.isOnline);
    }

    @NotNull
    public String toString() {
        return "IntlFriendToShareItemData(userMask=" + this.userMask + ", isSelected=" + this.isSelected + ", isOnline=" + this.isOnline + ")";
    }
}
