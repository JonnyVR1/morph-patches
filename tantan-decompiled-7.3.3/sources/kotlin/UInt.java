package kotlin;

import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, m88121d2 = {"Lkotlin/UInt;", "", "", "data", "b", "(I)I", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "h", "(I)Ljava/lang/String;", "a", "I", "getData$annotations", "()V", "Companion", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@JvmInline
public final class UInt implements Comparable<UInt> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int data;

    @PublishedApi
    @IntrinsicConstEvaluation
    public /* synthetic */ UInt(int i) {
        this.data = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ UInt m88153a(int i) {
        return new UInt(i);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* JADX INFO: renamed from: b */
    public static int m88154b(int i) {
        return i;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m88155f(int i, Object obj) {
        return (obj instanceof UInt) && i == ((UInt) obj).getData();
    }

    /* JADX INFO: renamed from: g */
    public static int m88156g(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static String m88157h(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UInt uInt) {
        return UnsignedKt.m88222a(getData(), uInt.getData());
    }

    public boolean equals(Object other) {
        return m88155f(this.data, other);
    }

    public int hashCode() {
        return m88156g(this.data);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final /* synthetic */ int getData() {
        return this.data;
    }

    @NotNull
    public String toString() {
        return m88157h(this.data);
    }
}
