package okio;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p149l.fg3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\r\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0002\b\u0010J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0016R\u0011\u0010\n\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m87232d2 = {"Lokio/HashingSource;", "Lokio/ForwardingSource;", "source", "Lokio/Source;", "algorithm", "", "(Lokio/Source;Ljava/lang/String;)V", Constants.KEY_KEY, "Lokio/ByteString;", "(Lokio/Source;Lokio/ByteString;Ljava/lang/String;)V", "hash", "()Lokio/ByteString;", "mac", "Ljavax/crypto/Mac;", "messageDigest", "Ljava/security/MessageDigest;", "-deprecated_hash", "read", "", "sink", "Lokio/Buffer;", "byteCount", "Companion", "jvm"}, m87233k = 1, m87234mv = {1, 1, 11})
public final class HashingSource extends ForwardingSource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(@NotNull Source source, @NotNull ByteString byteString, @NotNull String str) throws NoSuchAlgorithmException {
        super(source);
        source.getClass();
        byteString.getClass();
        str.getClass();
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            this.mac = mac;
            this.messageDigest = null;
        } catch (InvalidKeyException e) {
            fg3.m121203a(e);
            throw null;
        }
    }

    @JvmStatic
    @NotNull
    public static final HashingSource hmacSha1(@NotNull Source source, @NotNull ByteString byteString) {
        return INSTANCE.hmacSha1(source, byteString);
    }

    @JvmStatic
    @NotNull
    public static final HashingSource hmacSha256(@NotNull Source source, @NotNull ByteString byteString) {
        return INSTANCE.hmacSha256(source, byteString);
    }

    @JvmStatic
    @NotNull
    public static final HashingSource hmacSha512(@NotNull Source source, @NotNull ByteString byteString) {
        return INSTANCE.hmacSha512(source, byteString);
    }

    @JvmStatic
    @NotNull
    public static final HashingSource md5(@NotNull Source source) {
        return INSTANCE.md5(source);
    }

    @JvmStatic
    @NotNull
    public static final HashingSource sha1(@NotNull Source source) {
        return INSTANCE.sha1(source);
    }

    @JvmStatic
    @NotNull
    public static final HashingSource sha256(@NotNull Source source) {
        return INSTANCE.sha256(source);
    }

    @JvmStatic
    @NotNull
    public static final HashingSource sha512(@NotNull Source source) {
        return INSTANCE.sha512(source);
    }

    @Deprecated
    @JvmName
    @NotNull
    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m224686deprecated_hash() {
        return hash();
    }

    @JvmName
    @NotNull
    public final ByteString hash() {
        byte[] bArrDoFinal;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            if (mac == null) {
                Intrinsics.m87497m();
            }
            bArrDoFinal = mac.doFinal();
        }
        bArrDoFinal.getClass();
        return new ByteString(bArrDoFinal);
    }

    @Override // okio.ForwardingSource, okio.Source
    public long read(@NotNull Buffer sink, long byteCount) throws IOException {
        sink.getClass();
        long j = super.read(sink, byteCount);
        if (j != -1) {
            long size = sink.size() - j;
            long size2 = sink.size();
            Segment segment = sink.head;
            if (segment == null) {
                Intrinsics.m87497m();
            }
            while (size2 > size) {
                segment = segment.prev;
                if (segment == null) {
                    Intrinsics.m87497m();
                }
                size2 -= (long) (segment.limit - segment.pos);
            }
            while (size2 < sink.size()) {
                int i = (int) ((((long) segment.pos) + size) - size2);
                MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(segment.data, i, segment.limit - i);
                } else {
                    Mac mac = this.mac;
                    if (mac == null) {
                        Intrinsics.m87497m();
                    }
                    mac.update(segment.data, i, segment.limit - i);
                }
                size2 += (long) (segment.limit - segment.pos);
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.m87497m();
                }
                size = size2;
            }
        }
        return j;
    }

    @Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, m87232d2 = {"Lokio/HashingSource$Companion;", "", "()V", "hmacSha1", "Lokio/HashingSource;", "source", "Lokio/Source;", Constants.KEY_KEY, "Lokio/ByteString;", "hmacSha256", "hmacSha512", "md5", "sha1", "sha256", "sha512", "jvm"}, m87233k = 1, m87234mv = {1, 1, 11})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final HashingSource hmacSha1(@NotNull Source source, @NotNull ByteString key) {
            source.getClass();
            key.getClass();
            return new HashingSource(source, key, "HmacSHA1");
        }

        @JvmStatic
        @NotNull
        public final HashingSource hmacSha256(@NotNull Source source, @NotNull ByteString key) {
            source.getClass();
            key.getClass();
            return new HashingSource(source, key, "HmacSHA256");
        }

        @JvmStatic
        @NotNull
        public final HashingSource hmacSha512(@NotNull Source source, @NotNull ByteString key) {
            source.getClass();
            key.getClass();
            return new HashingSource(source, key, "HmacSHA512");
        }

        @JvmStatic
        @NotNull
        public final HashingSource md5(@NotNull Source source) {
            source.getClass();
            return new HashingSource(source, "MD5");
        }

        @JvmStatic
        @NotNull
        public final HashingSource sha1(@NotNull Source source) {
            source.getClass();
            return new HashingSource(source, "SHA-1");
        }

        @JvmStatic
        @NotNull
        public final HashingSource sha256(@NotNull Source source) {
            source.getClass();
            return new HashingSource(source, "SHA-256");
        }

        @JvmStatic
        @NotNull
        public final HashingSource sha512(@NotNull Source source) {
            source.getClass();
            return new HashingSource(source, "SHA-512");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(@NotNull Source source, @NotNull String str) {
        super(source);
        source.getClass();
        str.getClass();
        this.messageDigest = MessageDigest.getInstance(str);
        this.mac = null;
    }
}
