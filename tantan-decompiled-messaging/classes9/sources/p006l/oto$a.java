package p006l;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Ll/oto$a;", "", "", "title", "", "Ll/oto$b;", "privileges", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class oto$a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<oto$b> privileges;

    public oto$a(@NotNull String str, @NotNull List<oto$b> list) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.privileges = list;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<oto$b> m20739a() {
        return this.privileges;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof oto$a)) {
            return false;
        }
        oto$a oto_a = (oto$a) other;
        return Intrinsics.d(this.title, oto_a.title) && Intrinsics.d(this.privileges, oto_a.privileges);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.privileges.hashCode();
    }

    @NotNull
    public String toString() {
        return "GroupInfo(title=" + this.title + ", privileges=" + this.privileges + ")";
    }
}
