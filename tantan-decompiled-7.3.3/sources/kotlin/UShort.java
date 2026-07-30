package kotlin;

import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087@\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, m88121d2 = {"Lkotlin/UShort;", "", "", "data", "b", "(S)S", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "h", "(S)Ljava/lang/String;", "a", p7f.LATITUDE_SOUTH, "getData$annotations", "()V", "Companion", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@JvmInline
public final class UShort implements Comparable<UShort> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final short data;

    @PublishedApi
    @IntrinsicConstEvaluation
    public /* synthetic */ UShort(short s) {
        this.data = s;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ UShort m88199a(short s) {
        return new UShort(s);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* JADX INFO: renamed from: b */
    public static short m88200b(short s) {
        return s;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m88201f(short s, Object obj) {
        return (obj instanceof UShort) && s == ((UShort) obj).getData();
    }

    /* JADX INFO: renamed from: g */
    public static int m88202g(short s) {
        return Short.hashCode(s);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static String m88203h(short s) {
        return String.valueOf(s & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.m88378e(getData() & 65535, uShort.getData() & 65535);
    }

    public boolean equals(Object other) {
        return m88201f(this.data, other);
    }

    public int hashCode() {
        return m88202g(this.data);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final /* synthetic */ short getData() {
        return this.data;
    }

    @NotNull
    public String toString() {
        return m88203h(this.data);
    }
}
