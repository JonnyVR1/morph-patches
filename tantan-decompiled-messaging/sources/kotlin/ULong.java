package kotlin;

import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087@\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, m87232d2 = {"Lkotlin/ULong;", "", "", "data", "b", "(J)J", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "h", "(J)Ljava/lang/String;", "a", "J", "getData$annotations", "()V", "Companion", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@JvmInline
public final class ULong implements Comparable<ULong> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long data;

    @PublishedApi
    @IntrinsicConstEvaluation
    public /* synthetic */ ULong(long j) {
        this.data = j;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ULong m87287a(long j) {
        return new ULong(j);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* JADX INFO: renamed from: b */
    public static long m87288b(long j) {
        return j;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m87289f(long j, Object obj) {
        return (obj instanceof ULong) && j == ((ULong) obj).getData();
    }

    /* JADX INFO: renamed from: g */
    public static int m87290g(long j) {
        return Long.hashCode(j);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static String m87291h(long j) {
        return UnsignedKt.m87335c(j, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.m87334b(getData(), uLong.getData());
    }

    public boolean equals(Object other) {
        return m87289f(this.data, other);
    }

    public int hashCode() {
        return m87290g(this.data);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final /* synthetic */ long getData() {
        return this.data;
    }

    @NotNull
    public String toString() {
        return m87291h(this.data);
    }
}
