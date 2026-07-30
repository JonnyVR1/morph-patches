package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m88121d2 = {"Ll/adp;", "", "", "shareType", "", "imageRes", "cardName", "", "isNeedMarginEnd", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "I", Constants.INAPP_DATA_TAG, "Z", "()Z", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final /* data */ class adp {

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

    public adp(@NotNull String str, int i, @NotNull String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.shareType = str;
        this.imageRes = i;
        this.cardName = str2;
        this.isNeedMarginEnd = z;
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
    public final String getShareType() {
        return this.shareType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsNeedMarginEnd() {
        return this.isNeedMarginEnd;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof adp)) {
            return false;
        }
        adp adpVar = (adp) other;
        return Intrinsics.m88377d(this.shareType, adpVar.shareType) && this.imageRes == adpVar.imageRes && Intrinsics.m88377d(this.cardName, adpVar.cardName) && this.isNeedMarginEnd == adpVar.isNeedMarginEnd;
    }

    public int hashCode() {
        return (((((this.shareType.hashCode() * 31) + Integer.hashCode(this.imageRes)) * 31) + this.cardName.hashCode()) * 31) + Boolean.hashCode(this.isNeedMarginEnd);
    }

    @NotNull
    public String toString() {
        return "IntlShareCardItemInfoDataWrapper(shareType=" + this.shareType + ", imageRes=" + this.imageRes + ", cardName=" + this.cardName + ", isNeedMarginEnd=" + this.isNeedMarginEnd + ")";
    }
}
