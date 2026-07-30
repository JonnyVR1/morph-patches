package p153l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0018"}, m88121d2 = {"Ll/b7j0;", "", "", "taxonomyVersion", "modelVersion", "", "topicId", "<init>", "(JJI)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "J", "b", "()J", "c", "I", "ads-adservices_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class b7j0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long taxonomyVersion;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long modelVersion;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int topicId;

    public b7j0(long j, long j2, int i) {
        this.taxonomyVersion = j;
        this.modelVersion = j2;
        this.topicId = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getModelVersion() {
        return this.modelVersion;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTaxonomyVersion() {
        return this.taxonomyVersion;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTopicId() {
        return this.topicId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b7j0)) {
            return false;
        }
        b7j0 b7j0Var = (b7j0) other;
        return this.taxonomyVersion == b7j0Var.taxonomyVersion && this.modelVersion == b7j0Var.modelVersion && this.topicId == b7j0Var.topicId;
    }

    public int hashCode() {
        return (((Long.hashCode(this.taxonomyVersion) * 31) + Long.hashCode(this.modelVersion)) * 31) + Integer.hashCode(this.topicId);
    }

    @NotNull
    public String toString() {
        return "Topic { ".concat("TaxonomyVersion=" + this.taxonomyVersion + ", ModelVersion=" + this.modelVersion + ", TopicCode=" + this.topicId + " }");
    }
}
