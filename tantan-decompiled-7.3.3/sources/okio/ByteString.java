package okio;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import okio.internal.ByteStringKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.plk0;
import p153l.pr3;
import p153l.tg3;
import p153l.vg3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 Z2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001ZB\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\u0011\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0000J\u0013\u0010!\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\"H\u0096\u0002J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b&J\u0015\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020\tH\u0007¢\u0006\u0002\b'J\r\u0010(\u001a\u00020\tH\u0010¢\u0006\u0002\b)J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010*\u001a\u00020\u0010H\u0016J\u001d\u0010+\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0000H\u0010¢\u0006\u0002\b-J\u0010\u0010.\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0016J\u0010\u0010/\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0016J\u001a\u00101\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\tH\u0017J\u001a\u00101\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00102\u001a\u00020\tH\u0007J\r\u00103\u001a\u00020\u0004H\u0010¢\u0006\u0002\b4J\u0015\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\tH\u0010¢\u0006\u0002\b7J\u001a\u00108\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\tH\u0017J\u001a\u00108\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00102\u001a\u00020\tH\u0007J\b\u00109\u001a\u00020\u0000H\u0016J(\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tH\u0016J(\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tH\u0016J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020\u0000H\u0016J\b\u0010C\u001a\u00020\u0000H\u0016J\b\u0010D\u001a\u00020\u0000H\u0016J\r\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\bEJ\u000e\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u0004J\u000e\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u0000J\u0010\u0010H\u001a\u00020\u00102\u0006\u0010I\u001a\u00020JH\u0016J\u001c\u0010K\u001a\u00020\u00002\b\b\u0002\u0010L\u001a\u00020\t2\b\b\u0002\u0010M\u001a\u00020\tH\u0017J\b\u0010N\u001a\u00020\u0000H\u0016J\b\u0010O\u001a\u00020\u0000H\u0016J\b\u0010P\u001a\u00020\u0004H\u0016J\b\u0010Q\u001a\u00020\u0010H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010R\u001a\u00020?2\u0006\u0010S\u001a\u00020TH\u0016J\u0015\u0010R\u001a\u00020?2\u0006\u0010U\u001a\u00020VH\u0010¢\u0006\u0002\bWJ\u0010\u0010X\u001a\u00020?2\u0006\u0010S\u001a\u00020YH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006["}, m88121d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "data", "", "([B)V", "getData$jvm", "()[B", "hashCode", "", "getHashCode$jvm", "()I", "setHashCode$jvm", "(I)V", "size", "utf8", "", "getUtf8$jvm", "()Ljava/lang/String;", "setUtf8$jvm", "(Ljava/lang/String;)V", "asByteBuffer", "Ljava/nio/ByteBuffer;", "base64", "base64Url", "compareTo", "other", "digest", "algorithm", "digest$jvm", "endsWith", "", "suffix", "equals", "", "get", "", FirebaseAnalytics.Param.INDEX, "getByte", "-deprecated_getByte", "getSize", "getSize$jvm", "hex", "hmac", Constants.KEY_KEY, "hmac$jvm", "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "fromIndex", "internalArray", "internalArray$jvm", "internalGet", Constants.INAPP_POSITION, "internalGet$jvm", "lastIndexOf", "md5", "rangeEquals", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "otherOffset", "byteCount", "readObject", "", "in", "Ljava/io/ObjectInputStream;", "sha1", "sha256", "sha512", "-deprecated_size", "startsWith", RequestParameters.PREFIX, "string", "charset", "Ljava/nio/charset/Charset;", "substring", "beginIndex", "endIndex", "toAsciiLowercase", "toAsciiUppercase", "toByteArray", "toString", "write", "out", "Ljava/io/OutputStream;", "buffer", "Lokio/Buffer;", "write$jvm", "writeObject", "Ljava/io/ObjectOutputStream;", "Companion", "jvm"}, m88122k = 1, m88123mv = {1, 1, 11})
public class ByteString implements Serializable, Comparable<ByteString> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final ByteString EMPTY = ByteStringKt.getCOMMON_EMPTY();
    private static final long serialVersionUID = 1;

    @NotNull
    private final byte[] data;
    private transient int hashCode;

    @Nullable
    private transient String utf8;

    public ByteString(@NotNull byte[] bArr) {
        bArr.getClass();
        this.data = bArr;
    }

    @JvmStatic
    @Nullable
    public static final ByteString decodeBase64(@NotNull String str) {
        return INSTANCE.decodeBase64(str);
    }

    @JvmStatic
    @NotNull
    public static final ByteString decodeHex(@NotNull String str) {
        return INSTANCE.decodeHex(str);
    }

    @JvmStatic
    @JvmName
    @NotNull
    public static final ByteString encodeString(@NotNull String str, @NotNull Charset charset) {
        return INSTANCE.encodeString(str, charset);
    }

    @JvmStatic
    @NotNull
    public static final ByteString encodeUtf8(@NotNull String str) {
        return INSTANCE.encodeUtf8(str);
    }

    @JvmOverloads
    public static /* bridge */ /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: indexOf");
            return 0;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return byteString.indexOf(byteString2, i);
    }

    @JvmOverloads
    public static /* bridge */ /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: lastIndexOf");
            return 0;
        }
        if ((i2 & 2) != 0) {
            i = byteString.size();
        }
        return byteString.lastIndexOf(byteString2, i);
    }

    @JvmStatic
    @JvmName
    @NotNull
    /* JADX INFO: renamed from: of */
    public static final ByteString m222316of(@NotNull ByteBuffer byteBuffer) {
        return INSTANCE.m222319of(byteBuffer);
    }

    @JvmStatic
    @JvmName
    @NotNull
    public static final ByteString read(@NotNull InputStream inputStream, int i) throws IOException {
        return INSTANCE.read(inputStream, i);
    }

    private final void readObject(ObjectInputStream in) throws IllegalAccessException, NoSuchFieldException, IOException {
        ByteString byteString = INSTANCE.read(in, in.readInt());
        Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.getClass();
        declaredField.setAccessible(true);
        declaredField.set(this, byteString.data);
    }

    @JvmOverloads
    @NotNull
    public static /* bridge */ /* synthetic */ ByteString substring$default(ByteString byteString, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: substring");
            return null;
        }
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = byteString.size();
        }
        return byteString.substring(i, i2);
    }

    private final void writeObject(ObjectOutputStream out) throws IOException {
        out.writeInt(this.data.length);
        out.write(this.data);
    }

    @Deprecated
    @JvmName
    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m225918deprecated_getByte(int index) {
        return getByte(index);
    }

    @Deprecated
    @JvmName
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m225919deprecated_size() {
        return size();
    }

    @NotNull
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        byteBufferAsReadOnlyBuffer.getClass();
        return byteBufferAsReadOnlyBuffer;
    }

    @NotNull
    public String base64() {
        return ByteStringKt.commonBase64(this);
    }

    @NotNull
    public String base64Url() {
        return ByteStringKt.commonBase64Url(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull ByteString other) {
        other.getClass();
        return ByteStringKt.commonCompareTo(this, other);
    }

    @NotNull
    public ByteString digest$jvm(@NotNull String algorithm) {
        algorithm.getClass();
        byte[] bArrDigest = MessageDigest.getInstance(algorithm).digest(this.data);
        bArrDigest.getClass();
        return new ByteString(bArrDigest);
    }

    public final boolean endsWith(@NotNull ByteString suffix) {
        suffix.getClass();
        return ByteStringKt.commonEndsWith(this, suffix);
    }

    public boolean equals(@Nullable Object other) {
        return ByteStringKt.commonEquals(this, other);
    }

    @JvmName
    public final byte getByte(int index) {
        return internalGet$jvm(index);
    }

    @NotNull
    /* JADX INFO: renamed from: getData$jvm, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: getHashCode$jvm, reason: from getter */
    public final int getHashCode() {
        return this.hashCode;
    }

    public int getSize$jvm() {
        return ByteStringKt.commonGetSize(this);
    }

    @Nullable
    /* JADX INFO: renamed from: getUtf8$jvm, reason: from getter */
    public final String getUtf8() {
        return this.utf8;
    }

    public int hashCode() {
        return ByteStringKt.commonHashCode(this);
    }

    @NotNull
    public String hex() {
        return ByteStringKt.commonHex(this);
    }

    @NotNull
    public ByteString hmac$jvm(@NotNull String algorithm, @NotNull ByteString key) throws NoSuchAlgorithmException {
        algorithm.getClass();
        key.getClass();
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            byte[] bArrDoFinal = mac.doFinal(this.data);
            bArrDoFinal.getClass();
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e) {
            tg3.m191013a(e);
            return null;
        }
    }

    @NotNull
    public ByteString hmacSha1(@NotNull ByteString key) {
        key.getClass();
        return hmac$jvm("HmacSHA1", key);
    }

    @NotNull
    public ByteString hmacSha256(@NotNull ByteString key) {
        key.getClass();
        return hmac$jvm("HmacSHA256", key);
    }

    @NotNull
    public ByteString hmacSha512(@NotNull ByteString key) {
        key.getClass();
        return hmac$jvm("HmacSHA512", key);
    }

    @JvmOverloads
    public final int indexOf(@NotNull ByteString other, int fromIndex) {
        other.getClass();
        return indexOf(other.internalArray$jvm(), fromIndex);
    }

    @NotNull
    public byte[] internalArray$jvm() {
        return ByteStringKt.commonInternalArray(this);
    }

    public byte internalGet$jvm(int pos) {
        return ByteStringKt.commonGetByte(this, pos);
    }

    @JvmOverloads
    public final int lastIndexOf(@NotNull ByteString other, int fromIndex) {
        other.getClass();
        return lastIndexOf(other.internalArray$jvm(), fromIndex);
    }

    @NotNull
    public ByteString md5() {
        return digest$jvm("MD5");
    }

    public boolean rangeEquals(int offset, @NotNull ByteString other, int otherOffset, int byteCount) {
        other.getClass();
        return ByteStringKt.commonRangeEquals(this, offset, other, otherOffset, byteCount);
    }

    public final void setHashCode$jvm(int i) {
        this.hashCode = i;
    }

    public final void setUtf8$jvm(@Nullable String str) {
        this.utf8 = str;
    }

    @NotNull
    public ByteString sha1() {
        return digest$jvm("SHA-1");
    }

    @NotNull
    public ByteString sha256() {
        return digest$jvm("SHA-256");
    }

    @NotNull
    public ByteString sha512() {
        return digest$jvm("SHA-512");
    }

    @JvmName
    public final int size() {
        return getSize$jvm();
    }

    public final boolean startsWith(@NotNull ByteString prefix) {
        prefix.getClass();
        return ByteStringKt.commonStartsWith(this, prefix);
    }

    @NotNull
    public String string(@NotNull Charset charset) {
        charset.getClass();
        return new String(this.data, charset);
    }

    @JvmOverloads
    @NotNull
    public ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    @NotNull
    public ByteString toAsciiLowercase() {
        return ByteStringKt.commonToAsciiLowercase(this);
    }

    @NotNull
    public ByteString toAsciiUppercase() {
        return ByteStringKt.commonToAsciiUppercase(this);
    }

    @NotNull
    public byte[] toByteArray() {
        return ByteStringKt.commonToByteArray(this);
    }

    @NotNull
    public String toString() {
        return ByteStringKt.commonToString(this);
    }

    @NotNull
    public String utf8() {
        return ByteStringKt.commonUtf8(this);
    }

    public void write(@NotNull OutputStream out) throws IOException {
        out.getClass();
        out.write(this.data);
    }

    public void write$jvm(@NotNull Buffer buffer) {
        buffer.getClass();
        byte[] bArr = this.data;
        buffer.write(bArr, 0, bArr.length);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: of */
    public static final ByteString m222317of(@NotNull byte... bArr) {
        return INSTANCE.m222320of(bArr);
    }

    @JvmOverloads
    @NotNull
    public ByteString substring(int i) {
        return substring$default(this, i, 0, 2, null);
    }

    @JvmStatic
    @JvmName
    @NotNull
    /* JADX INFO: renamed from: of */
    public static final ByteString m222318of(@NotNull byte[] bArr, int i, int i2) {
        return INSTANCE.m222321of(bArr, i, i2);
    }

    @JvmOverloads
    @NotNull
    public ByteString substring(int beginIndex, int endIndex) {
        return ByteStringKt.commonSubstring(this, beginIndex, endIndex);
    }

    @Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\b\u0016J\u0014\u0010\u0013\u001a\u00020\u00042\n\u0010\u0017\u001a\u00020\u0018\"\u00020\u0019H\u0007J%\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0016J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b!J\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\tH\u0007J\f\u0010\u000b\u001a\u00020\u0004*\u00020\tH\u0007J\u001b\u0010\"\u001a\u00020\u0004*\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\rJ\f\u0010\u0011\u001a\u00020\u0004*\u00020\tH\u0007J\u0019\u0010#\u001a\u00020\u0004*\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u001eJ\u0011\u0010$\u001a\u00020\u0004*\u00020\u0015H\u0007¢\u0006\u0002\b\u0013J%\u0010$\u001a\u00020\u0004*\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, m88121d2 = {"Lokio/ByteString$Companion;", "", "()V", "EMPTY", "Lokio/ByteString;", "serialVersionUID", "", "decodeBase64", "string", "", "-deprecated_decodeBase64", "decodeHex", "-deprecated_decodeHex", "encodeString", "charset", "Ljava/nio/charset/Charset;", "-deprecated_encodeString", "encodeUtf8", "-deprecated_encodeUtf8", "of", "buffer", "Ljava/nio/ByteBuffer;", "-deprecated_of", "data", "", "", "array", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "", "byteCount", "read", "inputstream", "Ljava/io/InputStream;", "-deprecated_read", "encode", "readByteString", "toByteString", "jvm"}, m88122k = 1, m88123mv = {1, 1, 11})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        public static /* bridge */ /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i, Object obj) {
            if ((i & 1) != 0) {
                charset = Charsets.UTF_8;
            }
            return companion.encodeString(str, charset);
        }

        @JvmStatic
        @JvmName
        @NotNull
        public static /* bridge */ /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return companion.m222321of(bArr, i, i2);
        }

        @Deprecated
        @JvmName
        @Nullable
        /* JADX INFO: renamed from: -deprecated_decodeBase64, reason: not valid java name */
        public final ByteString m225920deprecated_decodeBase64(@NotNull String string) {
            string.getClass();
            return decodeBase64(string);
        }

        @Deprecated
        @JvmName
        @NotNull
        /* JADX INFO: renamed from: -deprecated_decodeHex, reason: not valid java name */
        public final ByteString m225921deprecated_decodeHex(@NotNull String string) {
            string.getClass();
            return decodeHex(string);
        }

        @Deprecated
        @JvmName
        @NotNull
        /* JADX INFO: renamed from: -deprecated_encodeString, reason: not valid java name */
        public final ByteString m225922deprecated_encodeString(@NotNull String string, @NotNull Charset charset) {
            string.getClass();
            charset.getClass();
            return encodeString(string, charset);
        }

        @Deprecated
        @JvmName
        @NotNull
        /* JADX INFO: renamed from: -deprecated_encodeUtf8, reason: not valid java name */
        public final ByteString m225923deprecated_encodeUtf8(@NotNull String string) {
            string.getClass();
            return encodeUtf8(string);
        }

        @Deprecated
        @JvmName
        @NotNull
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m225924deprecated_of(@NotNull ByteBuffer buffer) {
            buffer.getClass();
            return m222319of(buffer);
        }

        @Deprecated
        @JvmName
        @NotNull
        /* JADX INFO: renamed from: -deprecated_read, reason: not valid java name */
        public final ByteString m225926deprecated_read(@NotNull InputStream inputstream, int byteCount) {
            inputstream.getClass();
            return read(inputstream, byteCount);
        }

        @JvmStatic
        @Nullable
        public final ByteString decodeBase64(@NotNull String str) {
            str.getClass();
            return ByteStringKt.commonDecodeBase64(str);
        }

        @JvmStatic
        @NotNull
        public final ByteString decodeHex(@NotNull String str) {
            str.getClass();
            return ByteStringKt.commonDecodeHex(str);
        }

        @JvmStatic
        @JvmName
        @NotNull
        public final ByteString encodeString(@NotNull String str, @NotNull Charset charset) {
            str.getClass();
            charset.getClass();
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            return new ByteString(bytes);
        }

        @JvmStatic
        @NotNull
        public final ByteString encodeUtf8(@NotNull String str) {
            str.getClass();
            return ByteStringKt.commonEncodeUtf8(str);
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* JADX INFO: renamed from: of */
        public final ByteString m222321of(@NotNull byte[] bArr, int i, int i2) {
            bArr.getClass();
            Util.checkOffsetAndCount(bArr.length, i, i2);
            byte[] bArr2 = new byte[i2];
            Platform.arraycopy(bArr, i, bArr2, 0, i2);
            return new ByteString(bArr2);
        }

        @JvmStatic
        @JvmName
        @NotNull
        public final ByteString read(@NotNull InputStream inputStream, int i) throws IOException {
            inputStream.getClass();
            if (i < 0) {
                plk0.m172832a("byteCount < 0: ", i);
                return null;
            }
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = inputStream.read(bArr, i2, i - i2);
                if (i3 == -1) {
                    vg3.m201207a();
                    return null;
                }
                i2 += i3;
            }
            return new ByteString(bArr);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated
        @JvmName
        @NotNull
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m225925deprecated_of(@NotNull byte[] array, int offset, int byteCount) {
            array.getClass();
            return m222321of(array, offset, byteCount);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: of */
        public final ByteString m222320of(@NotNull byte... data) {
            data.getClass();
            return ByteStringKt.commonOf(data);
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* JADX INFO: renamed from: of */
        public final ByteString m222319of(@NotNull ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }
    }

    public final boolean endsWith(@NotNull byte[] suffix) {
        suffix.getClass();
        return ByteStringKt.commonEndsWith(this, suffix);
    }

    public boolean rangeEquals(int offset, @NotNull byte[] other, int otherOffset, int byteCount) {
        other.getClass();
        return ByteStringKt.commonRangeEquals(this, offset, other, otherOffset, byteCount);
    }

    public final boolean startsWith(@NotNull byte[] prefix) {
        prefix.getClass();
        return ByteStringKt.commonStartsWith(this, prefix);
    }

    @JvmOverloads
    public int indexOf(@NotNull byte[] bArr) {
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    @JvmOverloads
    public int lastIndexOf(@NotNull byte[] bArr) {
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    @JvmOverloads
    public final int indexOf(@NotNull ByteString byteString) {
        return indexOf$default(this, byteString, 0, 2, (Object) null);
    }

    @JvmOverloads
    public final int lastIndexOf(@NotNull ByteString byteString) {
        return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
    }

    @JvmOverloads
    public int indexOf(@NotNull byte[] other, int fromIndex) {
        other.getClass();
        return ByteStringKt.commonIndexOf(this, other, fromIndex);
    }

    @JvmOverloads
    public int lastIndexOf(@NotNull byte[] other, int fromIndex) {
        other.getClass();
        return ByteStringKt.commonLastIndexOf(this, other, fromIndex);
    }

    @JvmOverloads
    public static /* bridge */ /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return byteString.indexOf(bArr, i);
        }
        pr3.m173429a("Super calls with default arguments not supported in this target, function: indexOf");
        return 0;
    }

    @JvmOverloads
    public static /* bridge */ /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: lastIndexOf");
            return 0;
        }
        if ((i2 & 2) != 0) {
            i = byteString.size();
        }
        return byteString.lastIndexOf(bArr, i);
    }
}
