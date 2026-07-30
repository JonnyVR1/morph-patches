package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0018\u0010\r¨\u0006\u001c"}, m87232d2 = {"Ll/use0;", "", "", "shareType", "", "imageRes", "cardName", "", "isNeedMarginEnd", "scene", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", Constants.INAPP_DATA_TAG, "b", "I", "c", "Z", "e", "()Z", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* data */ class use0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String shareType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int imageRes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String cardName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean isNeedMarginEnd;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String scene;

    public use0(@NotNull String str, int i, @NotNull String str2, boolean z, @NotNull String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.shareType = str;
        this.imageRes = i;
        this.cardName = str2;
        this.isNeedMarginEnd = z;
        this.scene = str3;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getImageRes() {
        return this.imageRes;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getScene() {
        return this.scene;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getShareType() {
        return this.shareType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsNeedMarginEnd() {
        return this.isNeedMarginEnd;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof use0)) {
            return false;
        }
        use0 use0Var = (use0) other;
        return Intrinsics.m87488d(this.shareType, use0Var.shareType) && this.imageRes == use0Var.imageRes && Intrinsics.m87488d(this.cardName, use0Var.cardName) && this.isNeedMarginEnd == use0Var.isNeedMarginEnd && Intrinsics.m87488d(this.scene, use0Var.scene);
    }

    public int hashCode() {
        return (((((((this.shareType.hashCode() * 31) + Integer.hashCode(this.imageRes)) * 31) + this.cardName.hashCode()) * 31) + Boolean.hashCode(this.isNeedMarginEnd)) * 31) + this.scene.hashCode();
    }

    @NotNull
    public String toString() {
        return "ShareCardItemInfoDataWrapper(shareType=" + this.shareType + ", imageRes=" + this.imageRes + ", cardName=" + this.cardName + ", isNeedMarginEnd=" + this.isNeedMarginEnd + ", scene=" + this.scene + ")";
    }
}
