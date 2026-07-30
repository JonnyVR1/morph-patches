package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, m88121d2 = {"Ll/ak0;", "", "", "a", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", AuthenticationTokenClaims.JSON_KEY_NAME, "b", "I", FirebaseAnalytics.Param.INDEX, "room-common"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final /* data */ class ak0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int index;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ak0)) {
            return false;
        }
        ak0 ak0Var = (ak0) other;
        return Intrinsics.m88377d(this.name, ak0Var.name) && this.index == ak0Var.index;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Integer.hashCode(this.index);
    }

    @NotNull
    public String toString() {
        return "ResultColumn(name=" + this.name + ", index=" + this.index + ')';
    }
}
