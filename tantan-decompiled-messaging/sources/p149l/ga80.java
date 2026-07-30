package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\r¨\u0006\u0017"}, m87232d2 = {"Ll/ga80;", "", "", BaseSei.f13930X, BaseSei.f13931Y, "w", "h", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", Constants.INAPP_DATA_TAG, "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* data */ class ga80 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int x;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int y;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int w;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int h;

    public ga80(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.w = i3;
        this.h = i4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getW() {
        return this.w;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getY() {
        return this.y;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ga80)) {
            return false;
        }
        ga80 ga80Var = (ga80) other;
        return this.x == ga80Var.x && this.y == ga80Var.y && this.w == ga80Var.w && this.h == ga80Var.h;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.x) * 31) + Integer.hashCode(this.y)) * 31) + Integer.hashCode(this.w)) * 31) + Integer.hashCode(this.h);
    }

    @NotNull
    public String toString() {
        return "PointRect(x=" + this.x + ", y=" + this.y + ", w=" + this.w + ", h=" + this.h + ")";
    }
}
