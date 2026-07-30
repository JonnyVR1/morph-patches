package kotlin.uuid;

import com.facebook.AuthenticationTokenClaims;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.ULong;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m87231d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u00010B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\\\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u001026\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u0002H\u00100\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0015J\\\u0010\u0016\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u001026\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u0002H\u00100\u0012H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0015J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0007J\u0006\u0010\u001b\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u001dJ\u000f\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\u0011\u0010&\u001a\u00020'2\u0006\u0010$\u001a\u00020\u0000H\u0097\u0002J\b\u0010(\u001a\u00020'H\u0016J\b\u0010)\u001a\u00020%H\u0002J\u0019\u0010*\u001a\u00020+2\n\u0010,\u001a\u00060-j\u0002`.H\u0002¢\u0006\u0002\u0010/R\u001c\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00061"}, m87232d2 = {"Lkotlin/uuid/Uuid;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "mostSignificantBits", "", "leastSignificantBits", "<init>", "(JJ)V", "getMostSignificantBits$annotations", "()V", "getMostSignificantBits", "()J", "getLeastSignificantBits$annotations", "getLeastSignificantBits", "toLongs", j6f.GPS_DIRECTION_TRUE, "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toULongs", "Lkotlin/ULong;", "toString", "", "toHexDashString", "toHexString", "toByteArray", "", "toUByteArray", "Lkotlin/UByteArray;", "toUByteArray-TcUX1vc", "()[B", "equals", "", "other", "", "compareTo", "", "hashCode", "writeReplace", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "(Ljava/io/ObjectInputStream;)V", "Companion", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@ExperimentalUuidApi
public final class Uuid implements Comparable<Uuid>, Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Uuid NIL = new Uuid(0, 0);
    public static final int SIZE_BITS = 128;
    public static final int SIZE_BYTES = 16;
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m87232d2 = {"Lkotlin/uuid/Uuid$Companion;", "", "<init>", "()V", "", "mostSignificantBits", "leastSignificantBits", "Lkotlin/uuid/Uuid;", "a", "(JJ)Lkotlin/uuid/Uuid;", "NIL", "Lkotlin/uuid/Uuid;", "b", "()Lkotlin/uuid/Uuid;", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Uuid m93593a(long mostSignificantBits, long leastSignificantBits) {
            return (mostSignificantBits == 0 && leastSignificantBits == 0) ? m93594b() : new Uuid(mostSignificantBits, leastSignificantBits, null);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Uuid m93594b() {
            return Uuid.NIL;
        }

        private Companion() {
        }
    }

    private Uuid(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }

    @PublishedApi
    public static /* synthetic */ void getLeastSignificantBits$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMostSignificantBits$annotations() {
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @InlineOnly
    private final <T> T toLongs(Function2<? super Long, ? super Long, ? extends T> action) {
        action.getClass();
        return action.invoke(Long.valueOf(getMostSignificantBits()), Long.valueOf(getLeastSignificantBits()));
    }

    @InlineOnly
    private final <T> T toULongs(Function2<? super ULong, ? super ULong, ? extends T> action) {
        action.getClass();
        return action.invoke(ULong.m87287a(ULong.m87288b(getMostSignificantBits())), ULong.m87287a(ULong.m87288b(getLeastSignificantBits())));
    }

    private final Object writeReplace() {
        return C15392a.m93596b(this);
    }

    @Override // java.lang.Comparable
    @SinceKotlin
    public int compareTo(@NotNull Uuid other) {
        other.getClass();
        long j = this.mostSignificantBits;
        return j != other.mostSignificantBits ? Long.compare(ULong.m87288b(j) ^ Long.MIN_VALUE, ULong.m87288b(other.mostSignificantBits) ^ Long.MIN_VALUE) : Long.compare(ULong.m87288b(this.leastSignificantBits) ^ Long.MIN_VALUE, ULong.m87288b(other.leastSignificantBits) ^ Long.MIN_VALUE);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) other;
        return this.mostSignificantBits == uuid.mostSignificantBits && this.leastSignificantBits == uuid.leastSignificantBits;
    }

    public final long getLeastSignificantBits() {
        return this.leastSignificantBits;
    }

    public final long getMostSignificantBits() {
        return this.mostSignificantBits;
    }

    public int hashCode() {
        return Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    @NotNull
    public final byte[] toByteArray() {
        byte[] bArr = new byte[16];
        C15392a.m93597c(bArr, 0, this.mostSignificantBits);
        C15392a.m93597c(bArr, 8, this.leastSignificantBits);
        return bArr;
    }

    @SinceKotlin
    @NotNull
    public final String toHexDashString() {
        byte[] bArr = new byte[36];
        C15392a.m93595a(this.mostSignificantBits, bArr, 0, 0, 4);
        bArr[8] = 45;
        C15392a.m93595a(this.mostSignificantBits, bArr, 9, 4, 6);
        bArr[13] = 45;
        C15392a.m93595a(this.mostSignificantBits, bArr, 14, 6, 8);
        bArr[18] = 45;
        C15392a.m93595a(this.leastSignificantBits, bArr, 19, 0, 2);
        bArr[23] = 45;
        C15392a.m93595a(this.leastSignificantBits, bArr, 24, 2, 8);
        return C15386d.m93486t(bArr);
    }

    @NotNull
    public final String toHexString() {
        byte[] bArr = new byte[32];
        C15392a.m93595a(this.mostSignificantBits, bArr, 0, 0, 8);
        C15392a.m93595a(this.leastSignificantBits, bArr, 16, 0, 8);
        return C15386d.m93486t(bArr);
    }

    @NotNull
    public String toString() {
        return toHexDashString();
    }

    @SinceKotlin
    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: toUByteArray-TcUX1vc, reason: not valid java name */
    public final byte[] m224662toUByteArrayTcUX1vc() {
        return UByteArray.m87249f(toByteArray());
    }

    public /* synthetic */ Uuid(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }
}
