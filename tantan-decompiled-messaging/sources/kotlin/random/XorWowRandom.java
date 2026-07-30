package kotlin.random;

import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.ResourceDirection;
import java.io.InvalidObjectException;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001c2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001dB9\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001e"}, m87232d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", BaseSei.f13930X, BaseSei.f13931Y, BaseSei.f13932Z, "w", ResourceDirection.f38808v, "addend", "<init>", "(IIIIII)V", "seed1", "seed2", "(II)V", "", "checkInvariants", "()V", "", "readResolve", "()Ljava/lang/Object;", "nextInt", "()I", "bitCount", "nextBits", "(I)I", "I", "Companion", "a", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class XorWowRandom extends Random implements Serializable {

    @NotNull
    private static final C15166a Companion = new C15166a(null);
    private static final long serialVersionUID = 0;
    private int addend;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* JADX INFO: renamed from: kotlin.random.XorWowRandom$a */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Lkotlin/random/XorWowRandom$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C15166a {
        public /* synthetic */ C15166a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C15166a() {
        }
    }

    public XorWowRandom(int i, int i2, int i3, int i4, int i5, int i6) {
        this.x = i;
        this.y = i2;
        this.z = i3;
        this.w = i4;
        this.v = i5;
        this.addend = i6;
        checkInvariants();
        for (int i7 = 0; i7 < 64; i7++) {
            nextInt();
        }
    }

    private final void checkInvariants() {
        if ((this.v | this.x | this.y | this.z | this.w) != 0) {
            return;
        }
        ig3.m135964a("Initial state must have at least one non-zero element.");
    }

    private final Object readResolve() throws Throwable {
        try {
            checkInvariants();
            return this;
        } catch (Throwable th) {
            Throwable thInitCause = new InvalidObjectException(th.getMessage()).initCause(th);
            thInitCause.getClass();
            throw thInitCause;
        }
    }

    @Override // kotlin.random.Random
    public int nextBits(int bitCount) {
        return RandomKt.m87574h(nextInt(), bitCount);
    }

    @Override // kotlin.random.Random
    public int nextInt() {
        int i = this.x;
        int i2 = i ^ (i >>> 2);
        this.x = this.y;
        this.y = this.z;
        this.z = this.w;
        int i3 = this.v;
        this.w = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.v = i4;
        int i5 = this.addend + 362437;
        this.addend = i5;
        return i4 + i5;
    }

    public XorWowRandom(int i, int i2) {
        this(i, i2, 0, 0, ~i, (i << 10) ^ (i2 >>> 4));
    }
}
