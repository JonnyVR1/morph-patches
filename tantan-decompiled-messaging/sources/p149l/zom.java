package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0019"}, m87232d2 = {"Ll/zom;", "", "", "imageViewId", "", "clickableMedia", "videoFrameId", "gifImageId", "<init>", "(IZII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Z", "()Z", Constants.INAPP_DATA_TAG, "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class zom {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int imageViewId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean clickableMedia;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int videoFrameId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int gifImageId;

    public /* synthetic */ zom(int i, boolean z, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getClickableMedia() {
        return this.clickableMedia;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getGifImageId() {
        return this.gifImageId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getImageViewId() {
        return this.imageViewId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getVideoFrameId() {
        return this.videoFrameId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof zom)) {
            return false;
        }
        zom zomVar = (zom) other;
        return this.imageViewId == zomVar.imageViewId && this.clickableMedia == zomVar.clickableMedia && this.videoFrameId == zomVar.videoFrameId && this.gifImageId == zomVar.gifImageId;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.imageViewId) * 31) + Boolean.hashCode(this.clickableMedia)) * 31) + Integer.hashCode(this.videoFrameId)) * 31) + Integer.hashCode(this.gifImageId);
    }

    @NotNull
    public String toString() {
        return "InAppMediaConfig(imageViewId=" + this.imageViewId + ", clickableMedia=" + this.clickableMedia + ", videoFrameId=" + this.videoFrameId + ", gifImageId=" + this.gifImageId + ')';
    }

    public zom(int i, boolean z, int i2, int i3) {
        this.imageViewId = i;
        this.clickableMedia = z;
        this.videoFrameId = i2;
        this.gifImageId = i3;
    }
}
