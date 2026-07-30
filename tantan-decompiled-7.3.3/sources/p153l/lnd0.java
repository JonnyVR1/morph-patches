package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001\u0015B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0003\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0015\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\b\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\t\u0010\u0017¨\u0006!"}, m88121d2 = {"Ll/lnd0;", "", "", "isCircular", "", "cornerRadius", "", "cornerRadii", "isAntiAliased", "isForceRoundAtDecode", "<init>", "(ZF[FZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Z", "()Z", "b", "F", "()F", "c", "[F", "()[F", Constants.INAPP_DATA_TAG, "e", "Companion", "options_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final /* data */ class lnd0 {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final lnd0 f132761f = new lnd0(true, 0.0f, null, false, false);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final lnd0 f132762g = new lnd0(true, 0.0f, null, true, false);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isCircular;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final float cornerRadius;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final float[] cornerRadii;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean isAntiAliased;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean isForceRoundAtDecode;

    public lnd0(boolean z, float f, @Nullable float[] fArr, boolean z2, boolean z3) {
        this.isCircular = z;
        this.cornerRadius = f;
        this.cornerRadii = fArr;
        this.isAntiAliased = z2;
        this.isForceRoundAtDecode = z3;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final float[] getCornerRadii() {
        return this.cornerRadii;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m88377d(lnd0.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        lnd0 lnd0Var = (lnd0) other;
        return this.isCircular == lnd0Var.isCircular && this.cornerRadius == lnd0Var.cornerRadius && Arrays.equals(this.cornerRadii, lnd0Var.cornerRadii) && this.isAntiAliased == lnd0Var.isAntiAliased && this.isForceRoundAtDecode == lnd0Var.isForceRoundAtDecode;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isCircular) * 31) + Float.hashCode(this.cornerRadius)) * 31) + Arrays.hashCode(this.cornerRadii)) * 31) + Boolean.hashCode(this.isAntiAliased)) * 31) + Boolean.hashCode(this.isForceRoundAtDecode);
    }

    @NotNull
    public String toString() {
        return "RoundingOptions(isCircular=" + this.isCircular + ", cornerRadius=" + this.cornerRadius + ", cornerRadii=" + Arrays.toString(this.cornerRadii) + ", isAntiAliased=" + this.isAntiAliased + ", isForceRoundAtDecode=" + this.isForceRoundAtDecode + ")";
    }
}
