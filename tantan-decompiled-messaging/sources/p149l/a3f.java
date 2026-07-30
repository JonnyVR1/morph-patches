package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Ll/a3f;", "Ll/lrk0;", "Lorg/json/JSONObject;", "cleanedData", "Ll/drk0;", "outcome", "<init>", "(Lorg/json/JSONObject;Ll/drk0;)V", "b", "(Lorg/json/JSONObject;Ll/drk0;)Ll/a3f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/json/JSONObject;", Constants.INAPP_DATA_TAG, "()Lorg/json/JSONObject;", "Ll/drk0;", "()Ll/drk0;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class a3f implements lrk0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final JSONObject cleanedData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final drk0 outcome;

    public a3f(@NotNull JSONObject jSONObject, @NotNull drk0 drk0Var) {
        jSONObject.getClass();
        drk0Var.getClass();
        this.cleanedData = jSONObject;
        this.outcome = drk0Var;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ a3f m94686c(a3f a3fVar, JSONObject jSONObject, drk0 drk0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = a3fVar.cleanedData;
        }
        if ((i & 2) != 0) {
            drk0Var = a3fVar.outcome;
        }
        return a3fVar.m94688b(jSONObject, drk0Var);
    }

    @Override // p149l.lrk0
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public drk0 getOutcome() {
        return this.outcome;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final a3f m94688b(@NotNull JSONObject cleanedData, @NotNull drk0 outcome) {
        cleanedData.getClass();
        outcome.getClass();
        return new a3f(cleanedData, outcome);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final JSONObject getCleanedData() {
        return this.cleanedData;
    }

    /* JADX INFO: renamed from: e */
    public boolean m94690e() {
        return lrk0.C18310a.m151494a(this);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a3f)) {
            return false;
        }
        a3f a3fVar = (a3f) other;
        return Intrinsics.m87488d(this.cleanedData, a3fVar.cleanedData) && Intrinsics.m87488d(this.outcome, a3fVar.outcome);
    }

    public int hashCode() {
        return (this.cleanedData.hashCode() * 31) + this.outcome.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventDataValidationResult(cleanedData=" + this.cleanedData + ", outcome=" + this.outcome + ')';
    }
}
