package p153l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, m88121d2 = {"Ll/fw3;", "", "", "url", "contentDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final /* data */ class fw3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String contentDescription;

    public fw3(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.url = str;
        this.contentDescription = str2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof fw3)) {
            return false;
        }
        fw3 fw3Var = (fw3) other;
        return Intrinsics.m88377d(this.url, fw3Var.url) && Intrinsics.m88377d(this.contentDescription, fw3Var.contentDescription);
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + this.contentDescription.hashCode();
    }

    @NotNull
    public String toString() {
        return "CTInboxImageData(url=" + this.url + ", contentDescription=" + this.contentDescription + ')';
    }
}
