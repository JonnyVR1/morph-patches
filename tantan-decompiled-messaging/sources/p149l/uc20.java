package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, m87232d2 = {"Ll/uc20;", "", "", "isConnected", "isValidated", "isMetered", "isNotRoaming", "<init>", "(ZZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", Constants.INAPP_DATA_TAG, "c", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final /* data */ class uc20 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isConnected;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isValidated;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean isMetered;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean isNotRoaming;

    public uc20(boolean z, boolean z2, boolean z3, boolean z4) {
        this.isConnected = z;
        this.isValidated = z2;
        this.isMetered = z3;
        this.isNotRoaming = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsMetered() {
        return this.isMetered;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsNotRoaming() {
        return this.isNotRoaming;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsValidated() {
        return this.isValidated;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof uc20)) {
            return false;
        }
        uc20 uc20Var = (uc20) other;
        return this.isConnected == uc20Var.isConnected && this.isValidated == uc20Var.isValidated && this.isMetered == uc20Var.isMetered && this.isNotRoaming == uc20Var.isNotRoaming;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isConnected) * 31) + Boolean.hashCode(this.isValidated)) * 31) + Boolean.hashCode(this.isMetered)) * 31) + Boolean.hashCode(this.isNotRoaming);
    }

    @NotNull
    public String toString() {
        return "NetworkState(isConnected=" + this.isConnected + ", isValidated=" + this.isValidated + ", isMetered=" + this.isMetered + ", isNotRoaming=" + this.isNotRoaming + ')';
    }
}
