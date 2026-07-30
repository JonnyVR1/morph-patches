package p153l;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Ll/wmj;", "", "", "adsSdkName", "", "shouldRecordObservation", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "b", "Z", "()Z", "ads-adservices_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class wmj {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String adsSdkName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean shouldRecordObservation;

    /* JADX INFO: renamed from: l.wmj$a */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/wmj$a;", "", "<init>", "()V", "", "adsSdkName", "b", "(Ljava/lang/String;)Ll/wmj$a;", "", "shouldRecordObservation", "c", "(Z)Ll/wmj$a;", "Ll/wmj;", "a", "()Ll/wmj;", "Ljava/lang/String;", "Z", "ads-adservices_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C21141a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public String adsSdkName = "";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean shouldRecordObservation = true;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final wmj m207112a() {
            if (this.adsSdkName.length() > 0) {
                return new wmj(this.adsSdkName, this.shouldRecordObservation);
            }
            wtq0.m207906a("adsSdkName must be set");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C21141a m207113b(@NotNull String adsSdkName) {
            adsSdkName.getClass();
            this.adsSdkName = adsSdkName;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C21141a m207114c(boolean shouldRecordObservation) {
            this.shouldRecordObservation = shouldRecordObservation;
            return this;
        }
    }

    public /* synthetic */ wmj(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdsSdkName() {
        return this.adsSdkName;
    }

    @JvmName
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShouldRecordObservation() {
        return this.shouldRecordObservation;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof wmj)) {
            return false;
        }
        wmj wmjVar = (wmj) other;
        return Intrinsics.m88377d(this.adsSdkName, wmjVar.adsSdkName) && this.shouldRecordObservation == wmjVar.shouldRecordObservation;
    }

    public int hashCode() {
        return (this.adsSdkName.hashCode() * 31) + Boolean.hashCode(this.shouldRecordObservation);
    }

    @NotNull
    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.adsSdkName + ", shouldRecordObservation=" + this.shouldRecordObservation;
    }

    public wmj(@NotNull String str, boolean z) {
        str.getClass();
        this.adsSdkName = str;
        this.shouldRecordObservation = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wmj() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
