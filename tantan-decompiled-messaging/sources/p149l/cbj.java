package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0005\u0010\u0016\"\u0004\b\u0019\u0010\u0018R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, m87232d2 = {"Ll/cbj;", "", "", Constants.KEY_T, BLiveStormDanmakuGiftResourceType.f44444l, "b", "r", "<init>", "(FFFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", Constants.INAPP_DATA_TAG, "()F", "h", "(F)V", "f", "c", "e", "g", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* data */ class cbj {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public float t;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public float l;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public float b;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float r;

    public /* synthetic */ cbj(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getL() {
        return this.l;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getR() {
        return this.r;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getT() {
        return this.t;
    }

    /* JADX INFO: renamed from: e */
    public final void m106004e(float f) {
        this.b = f;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof cbj)) {
            return false;
        }
        cbj cbjVar = (cbj) other;
        return Float.compare(this.t, cbjVar.t) == 0 && Float.compare(this.l, cbjVar.l) == 0 && Float.compare(this.b, cbjVar.b) == 0 && Float.compare(this.r, cbjVar.r) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m106005f(float f) {
        this.l = f;
    }

    /* JADX INFO: renamed from: g */
    public final void m106006g(float f) {
        this.r = f;
    }

    /* JADX INFO: renamed from: h */
    public final void m106007h(float f) {
        this.t = f;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.t) * 31) + Float.hashCode(this.l)) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.r);
    }

    @NotNull
    public String toString() {
        return "FxBorderMargin(t=" + this.t + ", l=" + this.l + ", b=" + this.b + ", r=" + this.r + ")";
    }

    public cbj(float f, float f2, float f3, float f4) {
        this.t = f;
        this.l = f2;
        this.b = f3;
        this.r = f4;
    }

    public cbj() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }
}
