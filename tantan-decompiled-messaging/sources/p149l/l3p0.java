package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001c"}, m87232d2 = {"Ll/l3p0;", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceBackGroundPics;", "voiceBackGroundPic", "", "isSelected", "", "position", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceBackGroundPics;ZI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceBackGroundPics;", "b", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceBackGroundPics;", "Z", "c", "()Z", Constants.INAPP_DATA_TAG, "(Z)V", "I", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* data */ class l3p0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveVoiceBackGroundPics voiceBackGroundPic;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isSelected;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int position;

    public l3p0(@NotNull BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, boolean z, int i) {
        bLiveVoiceBackGroundPics.getClass();
        this.voiceBackGroundPic = bLiveVoiceBackGroundPics;
        this.isSelected = z;
        this.position = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BLiveVoiceBackGroundPics getVoiceBackGroundPic() {
        return this.voiceBackGroundPic;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: d */
    public final void m148406d(boolean z) {
        this.isSelected = z;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l3p0)) {
            return false;
        }
        l3p0 l3p0Var = (l3p0) other;
        return Intrinsics.m87488d(this.voiceBackGroundPic, l3p0Var.voiceBackGroundPic) && this.isSelected == l3p0Var.isSelected && this.position == l3p0Var.position;
    }

    public int hashCode() {
        return (((this.voiceBackGroundPic.hashCode() * 31) + Boolean.hashCode(this.isSelected)) * 31) + Integer.hashCode(this.position);
    }

    @NotNull
    public String toString() {
        return super.toString();
    }
}
