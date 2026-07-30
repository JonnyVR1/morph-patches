package p149l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Ll/x2f;", "", "Lorg/json/JSONObject;", "cleanedData", "Ll/w2f;", "metrics", "<init>", "(Lorg/json/JSONObject;Ll/w2f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "b", "Ll/w2f;", "()Ll/w2f;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class x2f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final JSONObject cleanedData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final w2f metrics;

    public x2f(@NotNull JSONObject jSONObject, @NotNull w2f w2fVar) {
        jSONObject.getClass();
        w2fVar.getClass();
        this.cleanedData = jSONObject;
        this.metrics = w2fVar;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final JSONObject getCleanedData() {
        return this.cleanedData;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final w2f getMetrics() {
        return this.metrics;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof x2f)) {
            return false;
        }
        x2f x2fVar = (x2f) other;
        return Intrinsics.m87488d(this.cleanedData, x2fVar.cleanedData) && Intrinsics.m87488d(this.metrics, x2fVar.metrics);
    }

    public int hashCode() {
        return (this.cleanedData.hashCode() * 31) + this.metrics.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventDataNormalizationResult(cleanedData=" + this.cleanedData + ", metrics=" + this.metrics + ')';
    }
}
