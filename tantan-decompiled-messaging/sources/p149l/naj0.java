package p149l;

import com.clevertap.android.sdk.inapp.evaluation.TriggerOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Ll/naj0;", "", "", "propertyName", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator;", "op", "Ll/waj0;", "value", "<init>", "(Ljava/lang/String;Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator;Ll/waj0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator;", "()Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator;", "c", "Ll/waj0;", "()Ll/waj0;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class naj0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String propertyName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final TriggerOperator op;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final waj0 value;

    public naj0(@NotNull String str, @NotNull TriggerOperator triggerOperator, @NotNull waj0 waj0Var) {
        str.getClass();
        triggerOperator.getClass();
        waj0Var.getClass();
        this.propertyName = str;
        this.op = triggerOperator;
        this.value = waj0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final TriggerOperator getOp() {
        return this.op;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPropertyName() {
        return this.propertyName;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final waj0 getValue() {
        return this.value;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof naj0)) {
            return false;
        }
        naj0 naj0Var = (naj0) other;
        return Intrinsics.m87488d(this.propertyName, naj0Var.propertyName) && this.op == naj0Var.op && Intrinsics.m87488d(this.value, naj0Var.value);
    }

    public int hashCode() {
        return (((this.propertyName.hashCode() * 31) + this.op.hashCode()) * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "TriggerCondition(propertyName=" + this.propertyName + ", op=" + this.op + ", value=" + this.value + ')';
    }
}
