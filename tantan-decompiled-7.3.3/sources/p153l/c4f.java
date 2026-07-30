package p153l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/c4f;", "", "Lorg/json/JSONObject;", "cleanedData", "Ll/b4f;", "metrics", "<init>", "(Lorg/json/JSONObject;Ll/b4f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "b", "Ll/b4f;", "()Ll/b4f;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final /* data */ class c4f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final JSONObject cleanedData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final b4f metrics;

    public c4f(@NotNull JSONObject jSONObject, @NotNull b4f b4fVar) {
        jSONObject.getClass();
        b4fVar.getClass();
        this.cleanedData = jSONObject;
        this.metrics = b4fVar;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final JSONObject getCleanedData() {
        return this.cleanedData;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final b4f getMetrics() {
        return this.metrics;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c4f)) {
            return false;
        }
        c4f c4fVar = (c4f) other;
        return Intrinsics.m88377d(this.cleanedData, c4fVar.cleanedData) && Intrinsics.m88377d(this.metrics, c4fVar.metrics);
    }

    public int hashCode() {
        return (this.cleanedData.hashCode() * 31) + this.metrics.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventDataNormalizationResult(cleanedData=" + this.cleanedData + ", metrics=" + this.metrics + ')';
    }
}
