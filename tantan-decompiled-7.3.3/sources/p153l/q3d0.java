package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00192\u00020\u0001:\u0001\u0013B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001a"}, m88121d2 = {"Ll/q3d0;", "", "", "width", "height", "", "maxBitmapDimension", "roundUpFraction", "<init>", "(IIFF)V", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "a", "I", "b", "c", "F", Constants.INAPP_DATA_TAG, "Companion", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class q3d0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public final int width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    public final int height;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    public final float maxBitmapDimension;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    public final float roundUpFraction;

    @JvmOverloads
    public q3d0(int i, int i2, float f, float f2) {
        this.width = i;
        this.height = i2;
        this.maxBitmapDimension = f;
        this.roundUpFraction = f2;
        if (i <= 0) {
            wtq0.m207906a("Check failed.");
            throw null;
        }
        if (i2 > 0) {
            return;
        }
        wtq0.m207906a("Check failed.");
        throw null;
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof q3d0)) {
            return false;
        }
        q3d0 q3d0Var = (q3d0) other;
        return this.width == q3d0Var.width && this.height == q3d0Var.height;
    }

    public int hashCode() {
        return ryk.m183610a(this.width, this.height);
    }

    @NotNull
    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.width), Integer.valueOf(this.height)}, 2));
    }

    @JvmOverloads
    public q3d0(int i, int i2) {
        this(i, i2, 0.0f, 0.0f, 12, null);
    }

    public /* synthetic */ q3d0(int i, int i2, float f, float f2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? 2048.0f : f, (i3 & 8) != 0 ? 0.6666667f : f2);
    }
}
