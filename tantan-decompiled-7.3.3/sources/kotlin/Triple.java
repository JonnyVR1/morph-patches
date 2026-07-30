package kotlin;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.MerchandiseTimeUnit;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.c4s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001f\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0013\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0014\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\fJ>\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\b\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\b\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\f¨\u0006\u001d"}, m88121d2 = {"Lkotlin/Triple;", "A", "B", c4s.C_ZONE, "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", MerchandiseTimeUnit.second, "third", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "getThird", "toString", "", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;", "equals", "", "other", "", "hashCode", "", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final /* data */ class Triple<A, B, C> implements Serializable {
    private final A first;
    private final B second;
    private final C third;

    public Triple(A a, B b, C c) {
        this.first = a;
        this.second = b;
        this.third = c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Triple copy$default(Triple triple, Object obj, Object obj2, Object obj3, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = triple.first;
        }
        if ((i & 2) != 0) {
            obj2 = triple.second;
        }
        if ((i & 4) != 0) {
            obj3 = triple.third;
        }
        return triple.copy(obj, obj2, obj3);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final C component3() {
        return this.third;
    }

    @NotNull
    public final Triple<A, B, C> copy(A first, B second, C third) {
        return new Triple<>(first, second, third);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) other;
        return Intrinsics.m88377d(this.first, triple.first) && Intrinsics.m88377d(this.second, triple.second) && Intrinsics.m88377d(this.third, triple.third);
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public final C getThird() {
        return this.third;
    }

    public int hashCode() {
        A a = this.first;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.second;
        int iHashCode2 = (iHashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.third;
        return iHashCode2 + (c != null ? c.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "(" + this.first + ", " + this.second + ", " + this.third + ')';
    }
}
