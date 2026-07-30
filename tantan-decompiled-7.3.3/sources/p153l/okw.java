package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u001c\u0010\u0017R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001b\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, m88121d2 = {"Ll/okw;", "", "", "enabled", "warningEnabled", "infoEnabled", "", "sampleRate", "<init>", "(ZZZD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "setEnabled", "(Z)V", "b", Constants.INAPP_DATA_TAG, "setWarningEnabled", "c", "setInfoEnabled", "D", "()D", "setSampleRate", "(D)V", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class okw {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean warningEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean infoEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private double sampleRate;

    public /* synthetic */ okw(boolean z, boolean z2, boolean z3, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : d);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getInfoEnabled() {
        return this.infoEnabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getSampleRate() {
        return this.sampleRate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getWarningEnabled() {
        return this.warningEnabled;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof okw)) {
            return false;
        }
        okw okwVar = (okw) other;
        return this.enabled == okwVar.enabled && this.warningEnabled == okwVar.warningEnabled && this.infoEnabled == okwVar.infoEnabled && Double.compare(this.sampleRate, okwVar.sampleRate) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.warningEnabled;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.infoEnabled;
        return ((i2 + (z3 ? 1 : z3)) * 31) + Double.hashCode(this.sampleRate);
    }

    @NotNull
    public String toString() {
        return "MKLogReporterConfiguration(enabled=" + this.enabled + ", warningEnabled=" + this.warningEnabled + ", infoEnabled=" + this.infoEnabled + ", sampleRate=" + this.sampleRate + ")";
    }

    public okw(boolean z, boolean z2, boolean z3, double d) {
        this.enabled = z;
        this.warningEnabled = z2;
        this.infoEnabled = z3;
        this.sampleRate = d;
    }

    public okw() {
        this(false, false, false, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 15, null);
    }
}
