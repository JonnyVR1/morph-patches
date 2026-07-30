package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a\"\u0004\b\u001d\u0010\u001cR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010!¨\u0006\""}, m88121d2 = {"Ll/btb;", "Ll/erl;", "", "totalUsage", "appUsage", "", "cpuCount", "<init>", "(FFI)V", "a", "()Ll/btb;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ll/btb;", "cloneCpu", "b", "F", "c", "()F", "f", "(F)V", Constants.INAPP_DATA_TAG, "I", "getCpuCount", "e", "(I)V", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class btb implements erl<btb> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private btb cloneCpu;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float totalUsage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float appUsage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int cpuCount;

    public /* synthetic */ btb(float f, float f2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // p153l.erl
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public btb clone() {
        if (this.cloneCpu == null) {
            this.cloneCpu = new btb(this.totalUsage, this.appUsage, 0);
        }
        btb btbVar = this.cloneCpu;
        if (btbVar != null) {
            btbVar.totalUsage = this.totalUsage;
            btbVar.appUsage = this.appUsage;
            btbVar.cpuCount = this.cpuCount;
        }
        if (btbVar == null) {
            Intrinsics.m88386m();
        }
        return btbVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getAppUsage() {
        return this.appUsage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getTotalUsage() {
        return this.totalUsage;
    }

    /* JADX INFO: renamed from: d */
    public final void m106325d(float f) {
        this.appUsage = f;
    }

    /* JADX INFO: renamed from: e */
    public final void m106326e(int i) {
        this.cpuCount = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof btb)) {
            return false;
        }
        btb btbVar = (btb) other;
        return Float.compare(this.totalUsage, btbVar.totalUsage) == 0 && Float.compare(this.appUsage, btbVar.appUsage) == 0 && this.cpuCount == btbVar.cpuCount;
    }

    /* JADX INFO: renamed from: f */
    public final void m106327f(float f) {
        this.totalUsage = f;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.totalUsage) * 31) + Float.floatToIntBits(this.appUsage)) * 31) + this.cpuCount;
    }

    @NotNull
    public String toString() {
        return "Cpu(appUsage=" + this.appUsage + "% totalUsage=" + this.totalUsage + "% cpuCount=" + this.cpuCount + ')';
    }

    public btb(float f, float f2, int i) {
        this.totalUsage = f;
        this.appUsage = f2;
        this.cpuCount = i;
    }

    public btb() {
        this(0.0f, 0.0f, 0, 7, null);
    }
}
