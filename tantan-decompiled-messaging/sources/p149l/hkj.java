package p149l;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/hkj;", "", "", "Ll/xxi0;", "topics", "<init>", "(Ljava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "()Ljava/util/List;", "ads-adservices_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class hkj {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<xxi0> topics;

    public hkj(@NotNull List<xxi0> list) {
        list.getClass();
        this.topics = list;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<xxi0> m131566a() {
        return this.topics;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof hkj)) {
            return false;
        }
        hkj hkjVar = (hkj) other;
        if (this.topics.size() != hkjVar.topics.size()) {
            return false;
        }
        return Intrinsics.m87488d(new HashSet(this.topics), new HashSet(hkjVar.topics));
    }

    public int hashCode() {
        return Objects.hash(this.topics);
    }

    @NotNull
    public String toString() {
        return "Topics=" + this.topics;
    }
}
