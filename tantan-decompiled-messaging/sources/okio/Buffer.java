package okio;

import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveResOperation;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import com.tencent.open.SocialConstants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ci70;
import p149l.fg3;
import p149l.gg3;
import p149l.hck0;
import p149l.hg3;
import p149l.ig3;
import p149l.j6f;
import p149l.jck0;
import p149l.jg3;
import p149l.kg3;
import p149l.lg3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 \u009c\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\u009c\u0001\u009d\u0001B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0000H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0006\u0010\u0015\u001a\u00020\fJ$\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\fH\u0007J\"\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\fJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0000H\u0016J\b\u0010 \u001a\u00020\u0000H\u0016J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\"H\u0016J\b\u0010&\u001a\u00020\u0012H\u0016J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\fH\u0087\u0002¢\u0006\u0002\b*J\u0015\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020\fH\u0007¢\u0006\u0002\b,J\b\u0010-\u001a\u00020.H\u0016J\u0018\u0010/\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u001cH\u0002J\u000e\u00101\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u001cJ\u000e\u00102\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u001cJ\u000e\u00103\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u001cJ\u0010\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020(H\u0016J\u0018\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020\fH\u0016J \u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\fH\u0016J\u0010\u00104\u001a\u00020\f2\u0006\u00108\u001a\u00020\u001cH\u0016J\u0018\u00104\u001a\u00020\f2\u0006\u00108\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\fH\u0016J\u0010\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u001cH\u0016J\u0018\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\fH\u0016J\b\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020\"H\u0016J\u0006\u0010>\u001a\u00020\u001cJ\b\u0010?\u001a\u00020\u0018H\u0016J\b\u0010@\u001a\u00020\u0001H\u0016J\u0018\u0010A\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u00108\u001a\u00020\u001cH\u0016J(\u0010A\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u00108\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020.H\u0016J0\u0010A\u001a\u00020\"2\u0006\u0010C\u001a\u00020\n2\u0006\u0010D\u001a\u00020.2\u0006\u00108\u001a\u00020E2\u0006\u0010B\u001a\u00020.2\u0006\u0010F\u001a\u00020.H\u0002J\u0010\u0010G\u001a\u00020.2\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010G\u001a\u00020.2\u0006\u0010H\u001a\u00020EH\u0016J \u0010G\u001a\u00020.2\u0006\u0010H\u001a\u00020E2\u0006\u0010\u0019\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020.H\u0016J\u0018\u0010G\u001a\u00020\f2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010J\u001a\u00020\f2\u0006\u0010H\u001a\u00020KH\u0016J\u0012\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020MH\u0007J\b\u0010O\u001a\u00020(H\u0016J\b\u0010P\u001a\u00020EH\u0016J\u0010\u0010P\u001a\u00020E2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010Q\u001a\u00020\u001cH\u0016J\u0010\u0010Q\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010R\u001a\u00020\fH\u0016J\u000e\u0010S\u001a\u00020\u00002\u0006\u0010T\u001a\u00020<J\u0016\u0010S\u001a\u00020\u00002\u0006\u0010T\u001a\u00020<2\u0006\u0010\u001a\u001a\u00020\fJ \u0010S\u001a\u00020\u00122\u0006\u0010T\u001a\u00020<2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010U\u001a\u00020\"H\u0002J\u0010\u0010V\u001a\u00020\u00122\u0006\u0010H\u001a\u00020EH\u0016J\u0018\u0010V\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010W\u001a\u00020\fH\u0016J\b\u0010X\u001a\u00020.H\u0016J\b\u0010Y\u001a\u00020.H\u0016J\b\u0010Z\u001a\u00020\fH\u0016J\b\u0010[\u001a\u00020\fH\u0016J\b\u0010\\\u001a\u00020]H\u0016J\b\u0010^\u001a\u00020]H\u0016J\u0010\u0010_\u001a\u00020\u001e2\u0006\u0010`\u001a\u00020aH\u0016J\u0018\u0010_\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010`\u001a\u00020aH\u0016J\u0012\u0010b\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020MH\u0007J\b\u0010c\u001a\u00020\u001eH\u0016J\u0010\u0010c\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010d\u001a\u00020.H\u0016J\n\u0010e\u001a\u0004\u0018\u00010\u001eH\u0016J\u0015\u0010e\u001a\u00020\u001e2\u0006\u0010f\u001a\u00020\fH\u0000¢\u0006\u0002\bgJ\b\u0010h\u001a\u00020\u001eH\u0016J\u0010\u0010h\u001a\u00020\u001e2\u0006\u0010i\u001a\u00020\fH\u0016J\u0010\u0010j\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010k\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\fH\u0016J8\u0010l\u001a\u0002Hm\"\u0004\b\u0000\u0010m2\u0006\u00106\u001a\u00020\f2\u001a\u0010n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002Hm0oH\u0082\b¢\u0006\u0002\u0010pJ\u0010\u0010q\u001a\u00020.2\u0006\u0010r\u001a\u00020sH\u0016J\u001f\u0010t\u001a\u00020.2\u0006\u0010r\u001a\u00020s2\b\b\u0002\u0010u\u001a\u00020\"H\u0000¢\u0006\u0002\bvJ\u0006\u0010w\u001a\u00020\u001cJ\u0006\u0010x\u001a\u00020\u001cJ\u0006\u0010y\u001a\u00020\u001cJ\r\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\bzJ\u0010\u0010{\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0006\u0010|\u001a\u00020\u001cJ\u000e\u0010|\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020.J\b\u0010}\u001a\u00020~H\u0016J\b\u0010\u007f\u001a\u00020\u001eH\u0016J\u0018\u0010\u0080\u0001\u001a\u00020\n2\u0007\u0010\u0081\u0001\u001a\u00020.H\u0000¢\u0006\u0003\b\u0082\u0001J\u0012\u0010\u0083\u0001\u001a\u00020.2\u0007\u0010\u0084\u0001\u001a\u00020IH\u0016J\u0012\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020EH\u0016J\"\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020E2\u0006\u0010\u0019\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020.H\u0016J\u001a\u0010\u0083\u0001\u001a\u00020\u00122\u0007\u0010\u0084\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0012\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0085\u0001\u001a\u00020\u001cH\u0016J\u001b\u0010\u0083\u0001\u001a\u00020\u00022\b\u0010\u0084\u0001\u001a\u00030\u0086\u00012\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0013\u0010\u0087\u0001\u001a\u00020\f2\b\u0010\u0084\u0001\u001a\u00030\u0086\u0001H\u0016J\u0011\u0010\u0088\u0001\u001a\u00020\u00002\u0006\u00105\u001a\u00020.H\u0016J\u0012\u0010\u0089\u0001\u001a\u00020\u00002\u0007\u0010\u008a\u0001\u001a\u00020\fH\u0016J\u0012\u0010\u008b\u0001\u001a\u00020\u00002\u0007\u0010\u008a\u0001\u001a\u00020\fH\u0016J\u0012\u0010\u008c\u0001\u001a\u00020\u00002\u0007\u0010\u008d\u0001\u001a\u00020.H\u0016J\u0012\u0010\u008e\u0001\u001a\u00020\u00002\u0007\u0010\u008d\u0001\u001a\u00020.H\u0016J\u0012\u0010\u008f\u0001\u001a\u00020\u00002\u0007\u0010\u008a\u0001\u001a\u00020\fH\u0016J\u0012\u0010\u0090\u0001\u001a\u00020\u00002\u0007\u0010\u008a\u0001\u001a\u00020\fH\u0016J\u0012\u0010\u0091\u0001\u001a\u00020\u00002\u0007\u0010\u0092\u0001\u001a\u00020.H\u0016J\u0012\u0010\u0093\u0001\u001a\u00020\u00002\u0007\u0010\u0092\u0001\u001a\u00020.H\u0016J\u001a\u0010\u0094\u0001\u001a\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020\u001e2\u0006\u0010`\u001a\u00020aH\u0016J,\u0010\u0094\u0001\u001a\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020\u001e2\u0007\u0010\u0096\u0001\u001a\u00020.2\u0007\u0010\u0097\u0001\u001a\u00020.2\u0006\u0010`\u001a\u00020aH\u0016J\u001b\u0010\u0098\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\fH\u0007J\u0012\u0010\u0099\u0001\u001a\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020\u001eH\u0016J$\u0010\u0099\u0001\u001a\u00020\u00002\u0007\u0010\u0095\u0001\u001a\u00020\u001e2\u0007\u0010\u0096\u0001\u001a\u00020.2\u0007\u0010\u0097\u0001\u001a\u00020.H\u0016J\u0012\u0010\u009a\u0001\u001a\u00020\u00002\u0007\u0010\u009b\u0001\u001a\u00020.H\u0016R\u0014\u0010\u0006\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8\u0007@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u009e\u0001"}, m87232d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "()V", "buffer", "getBuffer", "()Lokio/Buffer;", "head", "Lokio/Segment;", "<set-?>", "", "size", "()J", "setSize$jvm", "(J)V", BLiveResOperation.clear, "", "clone", "close", "completeSegmentByteCount", "copyTo", "out", "Ljava/io/OutputStream;", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "byteCount", "digest", "Lokio/ByteString;", "algorithm", "", "emit", "emitCompleteSegments", "equals", "", "other", "", "exhausted", "flush", "get", "", Constants.INAPP_POSITION, "getByte", FirebaseAnalytics.Param.INDEX, "-deprecated_getByte", "hashCode", "", "hmac", Constants.KEY_KEY, "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "b", "fromIndex", "toIndex", HttpHeaderValues.BYTES, "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "md5", "outputStream", "peek", "rangeEquals", "bytesOffset", "segment", "segmentPos", "", "bytesLimit", "read", "sink", "Ljava/nio/ByteBuffer;", "readAll", "Lokio/Sink;", "readAndWriteUnsafe", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFrom", "input", "forever", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", "charset", "Ljava/nio/charset/Charset;", "readUnsafe", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "newline", "readUtf8Line$jvm", "readUtf8LineStrict", Constants.KEY_LIMIT, SocialConstants.TYPE_REQUEST, "require", "seek", j6f.GPS_DIRECTION_TRUE, "lambda", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "select", com.p046p1.mobile.putong.core.data.Options.TYPE, "Lokio/Options;", "selectPrefix", "selectTruncated", "selectPrefix$jvm", "sha1", "sha256", "sha512", "-deprecated_size", FreeSpaceBox.TYPE, "snapshot", "timeout", "Lokio/Timeout;", "toString", "writableSegment", "minimumCapacity", "writableSegment$jvm", "write", "source", "byteString", "Lokio/Source;", "writeAll", "writeByte", "writeDecimalLong", ResourceDirection.f38808v, "writeHexadecimalUnsignedLong", "writeInt", RXScreenCaptureService.KEY_INDEX, "writeIntLe", "writeLong", "writeLongLe", "writeShort", BLiveStormDanmakuGiftResourceType.f44446s, "writeShortLe", "writeString", "string", "beginIndex", "endIndex", "writeTo", "writeUtf8", "writeUtf8CodePoint", "codePoint", "Companion", "UnsafeCursor", "jvm"}, m87233k = 1, m87234mv = {1, 1, 11})
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    private static final byte[] DIGITS;

    @JvmField
    @Nullable
    public Segment head;
    private long size;

    @Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m87232d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "()V", "buffer", "Lokio/Buffer;", "data", "", "end", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "", "readWrite", "", "segment", "Lokio/Segment;", "start", "close", "", "expandBuffer", "minByteCount", "next", "resizeBuffer", "newSize", "seek", "jvm"}, m87233k = 1, m87234mv = {1, 1, 11})
    public static final class UnsafeCursor implements Closeable {

        @JvmField
        @Nullable
        public Buffer buffer;

        @JvmField
        @Nullable
        public byte[] data;

        @JvmField
        public boolean readWrite;
        private Segment segment;

        @JvmField
        public long offset = -1;

        @JvmField
        public int start = -1;

        @JvmField
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                qkq0.m175383a("not attached to a buffer");
                return;
            }
            this.buffer = null;
            this.segment = null;
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final long expandBuffer(int minByteCount) {
            if (minByteCount <= 0) {
                jck0.m140980a("minByteCount <= 0: ", minByteCount);
                return 0L;
            }
            if (minByteCount > 8192) {
                jck0.m140980a("minByteCount > Segment.SIZE: ", minByteCount);
                return 0L;
            }
            Buffer buffer = this.buffer;
            if (buffer == null) {
                qkq0.m175383a("not attached to a buffer");
                return 0L;
            }
            if (!this.readWrite) {
                qkq0.m175383a("expandBuffer() only permitted for read/write buffers");
                return 0L;
            }
            long size = buffer.size();
            Segment segmentWritableSegment$jvm = buffer.writableSegment$jvm(minByteCount);
            int i = 8192 - segmentWritableSegment$jvm.limit;
            segmentWritableSegment$jvm.limit = 8192;
            long j = i;
            buffer.setSize$jvm(size + j);
            this.segment = segmentWritableSegment$jvm;
            this.offset = size;
            this.data = segmentWritableSegment$jvm.data;
            this.start = 8192 - i;
            this.end = 8192;
            return j;
        }

        public final int next() {
            long j = this.offset;
            Buffer buffer = this.buffer;
            if (buffer == null) {
                Intrinsics.m87497m();
            }
            if (j != buffer.size()) {
                long j2 = this.offset;
                return j2 == -1 ? seek(0L) : seek(j2 + ((long) (this.end - this.start)));
            }
            qkq0.m175383a("no more bytes");
            return 0;
        }

        public final long resizeBuffer(long newSize) {
            Buffer buffer = this.buffer;
            long j = 0;
            if (buffer == null) {
                qkq0.m175383a("not attached to a buffer");
                return 0L;
            }
            if (!this.readWrite) {
                qkq0.m175383a("resizeBuffer() only permitted for read/write buffers");
                return 0L;
            }
            long size = buffer.size();
            if (newSize <= size) {
                if (newSize < 0) {
                    ci70.m107054a("newSize < 0: ", newSize);
                    return 0L;
                }
                long j2 = size - newSize;
                while (j2 > 0) {
                    Segment segment = buffer.head;
                    if (segment == null) {
                        Intrinsics.m87497m();
                    }
                    Segment segment2 = segment.prev;
                    if (segment2 == null) {
                        Intrinsics.m87497m();
                    }
                    int i = segment2.limit;
                    long j3 = i - segment2.pos;
                    if (j3 > j2) {
                        segment2.limit = i - ((int) j2);
                        break;
                    }
                    buffer.head = segment2.pop();
                    SegmentPool.recycle(segment2);
                    j2 -= j3;
                }
                this.segment = null;
                this.offset = newSize;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (newSize > size) {
                long j4 = newSize - size;
                boolean z = true;
                while (j4 > j) {
                    Segment segmentWritableSegment$jvm = buffer.writableSegment$jvm(1);
                    int iMin = (int) Math.min(j4, 8192 - segmentWritableSegment$jvm.limit);
                    int i2 = segmentWritableSegment$jvm.limit + iMin;
                    segmentWritableSegment$jvm.limit = i2;
                    long j5 = j;
                    j4 -= (long) iMin;
                    if (z) {
                        this.segment = segmentWritableSegment$jvm;
                        this.offset = size;
                        this.data = segmentWritableSegment$jvm.data;
                        this.start = i2 - iMin;
                        this.end = i2;
                        z = false;
                    }
                    j = j5;
                }
            }
            buffer.setSize$jvm(newSize);
            return size;
        }

        public final int seek(long offset) {
            Segment segmentPush;
            Buffer buffer = this.buffer;
            if (buffer == null) {
                qkq0.m175383a("not attached to a buffer");
                return 0;
            }
            if (offset < -1 || offset > buffer.size()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                lg3.m149750a("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(offset), Long.valueOf(buffer.size())}, 2));
                return 0;
            }
            if (offset == -1 || offset == buffer.size()) {
                this.segment = null;
                this.offset = offset;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = buffer.size();
            Segment segment = buffer.head;
            Segment segment2 = this.segment;
            long j = 0;
            if (segment2 != null) {
                long j2 = this.offset;
                int i = this.start;
                if (segment2 == null) {
                    Intrinsics.m87497m();
                }
                long j3 = j2 - ((long) (i - segment2.pos));
                segmentPush = this.segment;
                if (j3 > offset) {
                    segmentPush = segment;
                    segment = segmentPush;
                    size = j3;
                } else {
                    j = j3;
                }
            } else {
                segmentPush = segment;
            }
            if (size - offset > offset - j) {
                while (true) {
                    if (segmentPush == null) {
                        Intrinsics.m87497m();
                    }
                    int i2 = segmentPush.limit;
                    int i3 = segmentPush.pos;
                    if (offset < ((long) (i2 - i3)) + j) {
                        break;
                    }
                    j += (long) (i2 - i3);
                    segmentPush = segmentPush.next;
                }
            } else {
                while (size > offset) {
                    if (segment == null) {
                        Intrinsics.m87497m();
                    }
                    segment = segment.prev;
                    if (segment == null) {
                        Intrinsics.m87497m();
                    }
                    size -= (long) (segment.limit - segment.pos);
                }
                j = size;
                segmentPush = segment;
            }
            if (this.readWrite) {
                if (segmentPush == null) {
                    Intrinsics.m87497m();
                }
                if (segmentPush.shared) {
                    Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                    if (buffer.head == segmentPush) {
                        buffer.head = segmentUnsharedCopy;
                    }
                    segmentPush = segmentPush.push(segmentUnsharedCopy);
                    Segment segment3 = segmentPush.prev;
                    if (segment3 == null) {
                        Intrinsics.m87497m();
                    }
                    segment3.pop();
                }
            }
            this.segment = segmentPush;
            this.offset = offset;
            if (segmentPush == null) {
                Intrinsics.m87497m();
            }
            this.data = segmentPush.data;
            int i4 = segmentPush.pos + ((int) (offset - j));
            this.start = i4;
            int i5 = segmentPush.limit;
            this.end = i5;
            return i5 - i4;
        }
    }

    static {
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        bytes.getClass();
        DIGITS = bytes;
    }

    @JvmOverloads
    @NotNull
    public static /* bridge */ /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j, long j2, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = buffer.size - j3;
        }
        return buffer.copyTo(outputStream, j3, j2);
    }

    private final ByteString digest(String algorithm) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i = segment.pos;
            messageDigest.update(bArr, i, segment.limit - i);
            Segment segment2 = segment.next;
            if (segment2 == null) {
                Intrinsics.m87497m();
            }
            while (segment2 != segment) {
                byte[] bArr2 = segment2.data;
                int i2 = segment2.pos;
                messageDigest.update(bArr2, i2, segment2.limit - i2);
                segment2 = segment2.next;
                if (segment2 == null) {
                    Intrinsics.m87497m();
                }
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new ByteString(bArrDigest);
    }

    private final ByteString hmac(String algorithm, ByteString key) throws NoSuchAlgorithmException {
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.internalArray$jvm(), algorithm));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i = segment.pos;
                mac.update(bArr, i, segment.limit - i);
                Segment segment2 = segment.next;
                if (segment2 == null) {
                    Intrinsics.m87497m();
                }
                while (segment2 != segment) {
                    byte[] bArr2 = segment2.data;
                    int i2 = segment2.pos;
                    mac.update(bArr2, i2, segment2.limit - i2);
                    segment2 = segment2.next;
                    if (segment2 == null) {
                        Intrinsics.m87497m();
                    }
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            bArrDoFinal.getClass();
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e) {
            fg3.m121203a(e);
            return null;
        }
    }

    @JvmOverloads
    @NotNull
    public static /* bridge */ /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i, Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = new UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    private final void readFrom(InputStream input, long byteCount, boolean forever) throws IOException {
        while (true) {
            if (byteCount <= 0 && !forever) {
                return;
            }
            Segment segmentWritableSegment$jvm = writableSegment$jvm(1);
            int i = input.read(segmentWritableSegment$jvm.data, segmentWritableSegment$jvm.limit, (int) Math.min(byteCount, 8192 - segmentWritableSegment$jvm.limit));
            if (i == -1) {
                if (forever) {
                    return;
                }
                hg3.m130807a();
                return;
            } else {
                segmentWritableSegment$jvm.limit += i;
                long j = i;
                this.size += j;
                byteCount -= j;
            }
        }
    }

    @JvmOverloads
    @NotNull
    public static /* bridge */ /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i, Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = new UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    private final <T> T seek(long fromIndex, Function2<? super Segment, ? super Long, ? extends T> lambda) {
        Segment segment = this.head;
        if (segment == null) {
            return lambda.invoke(null, -1L);
        }
        if (size() - fromIndex < fromIndex) {
            long size = size();
            while (size > fromIndex) {
                segment = segment.prev;
                if (segment == null) {
                    Intrinsics.m87497m();
                }
                size -= (long) (segment.limit - segment.pos);
            }
            return lambda.invoke(segment, Long.valueOf(size));
        }
        long j = 0;
        while (true) {
            long j2 = ((long) (segment.limit - segment.pos)) + j;
            if (j2 > fromIndex) {
                return lambda.invoke(segment, Long.valueOf(j));
            }
            segment = segment.next;
            if (segment == null) {
                Intrinsics.m87497m();
            }
            j = j2;
        }
    }

    public static /* bridge */ /* synthetic */ int selectPrefix$jvm$default(Buffer buffer, Options options, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return buffer.selectPrefix$jvm(options, z);
    }

    @JvmOverloads
    @NotNull
    public static /* bridge */ /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = buffer.size;
        }
        return buffer.writeTo(outputStream, j);
    }

    @Deprecated
    @JvmName
    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m224669deprecated_getByte(long index) {
        return getByte(index);
    }

    @Deprecated
    @JvmName
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    /* JADX INFO: renamed from: buffer */
    public Buffer getBufferField() {
        return this;
    }

    public final void clear() throws EOFException {
        skip(this.size);
    }

    @NotNull
    public Buffer clone() {
        Buffer buffer = new Buffer();
        if (this.size == 0) {
            return buffer;
        }
        Segment segment = this.head;
        if (segment == null) {
            Intrinsics.m87497m();
        }
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer.head = segmentSharedCopy;
        if (segmentSharedCopy == null) {
            Intrinsics.m87497m();
        }
        Segment segment2 = buffer.head;
        segmentSharedCopy.prev = segment2;
        if (segment2 == null) {
            Intrinsics.m87497m();
        }
        Segment segment3 = buffer.head;
        if (segment3 == null) {
            Intrinsics.m87497m();
        }
        segment2.next = segment3.prev;
        Segment segment4 = this.head;
        if (segment4 == null) {
            Intrinsics.m87497m();
        }
        for (Segment segment5 = segment4.next; segment5 != this.head; segment5 = segment5.next) {
            Segment segment6 = buffer.head;
            if (segment6 == null) {
                Intrinsics.m87497m();
            }
            Segment segment7 = segment6.prev;
            if (segment7 == null) {
                Intrinsics.m87497m();
            }
            if (segment5 == null) {
                Intrinsics.m87497m();
            }
            segment7.push(segment5.sharedCopy());
        }
        buffer.size = this.size;
        return buffer;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long completeSegmentByteCount() {
        long j = this.size;
        if (j == 0) {
            return 0L;
        }
        Segment segment = this.head;
        if (segment == null) {
            Intrinsics.m87497m();
        }
        Segment segment2 = segment.prev;
        if (segment2 == null) {
            Intrinsics.m87497m();
        }
        int i = segment2.limit;
        return (i >= 8192 || !segment2.owner) ? j : j - ((long) (i - segment2.pos));
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer out, long offset, long byteCount) {
        out.getClass();
        long j = offset;
        Util.checkOffsetAndCount(this.size, j, byteCount);
        if (byteCount != 0) {
            out.size += byteCount;
            Segment segment = this.head;
            while (true) {
                if (segment == null) {
                    Intrinsics.m87497m();
                }
                int i = segment.limit;
                int i2 = segment.pos;
                if (j < i - i2) {
                    break;
                }
                j -= (long) (i - i2);
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j2 = byteCount;
            while (j2 > 0) {
                if (segment2 == null) {
                    Intrinsics.m87497m();
                }
                Segment segmentSharedCopy = segment2.sharedCopy();
                int i3 = segmentSharedCopy.pos + ((int) j);
                segmentSharedCopy.pos = i3;
                segmentSharedCopy.limit = Math.min(i3 + ((int) j2), segmentSharedCopy.limit);
                Segment segment3 = out.head;
                if (segment3 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy;
                    out.head = segmentSharedCopy;
                } else {
                    if (segment3 == null) {
                        Intrinsics.m87497m();
                    }
                    Segment segment4 = segment3.prev;
                    if (segment4 == null) {
                        Intrinsics.m87497m();
                    }
                    segment4.push(segmentSharedCopy);
                }
                j2 -= (long) (segmentSharedCopy.limit - segmentSharedCopy.pos);
                segment2 = segment2.next;
                j = 0;
            }
        }
        return this;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Buffer)) {
            return false;
        }
        long j = this.size;
        Buffer buffer = (Buffer) other;
        if (j != buffer.size) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        Segment segment = this.head;
        if (segment == null) {
            Intrinsics.m87497m();
        }
        Segment segment2 = buffer.head;
        if (segment2 == null) {
            Intrinsics.m87497m();
        }
        int i = segment.pos;
        int i2 = segment2.pos;
        long j2 = 0;
        while (j2 < this.size) {
            long jMin = Math.min(segment.limit - i, segment2.limit - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (segment.data[i] != segment2.data[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == segment.limit) {
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.m87497m();
                }
                i = segment.pos;
            }
            if (i2 == segment2.limit) {
                segment2 = segment2.next;
                if (segment2 == null) {
                    Intrinsics.m87497m();
                }
                i2 = segment2.pos;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer getBuffer() {
        return this;
    }

    @JvmName
    public final byte getByte(long pos) {
        Util.checkOffsetAndCount(this.size, pos, 1L);
        Segment segment = this.head;
        if (segment == null) {
            Intrinsics.m87497m();
            throw null;
        }
        if (size() - pos < pos) {
            long size = size();
            while (size > pos) {
                segment = segment.prev;
                if (segment == null) {
                    Intrinsics.m87497m();
                }
                size -= (long) (segment.limit - segment.pos);
            }
            return segment.data[(int) ((((long) segment.pos) + pos) - size)];
        }
        long j = 0;
        while (true) {
            int i = segment.limit;
            int i2 = segment.pos;
            long j2 = ((long) (i - i2)) + j;
            if (j2 > pos) {
                return segment.data[(int) ((((long) i2) + pos) - j)];
            }
            segment = segment.next;
            if (segment == null) {
                Intrinsics.m87497m();
            }
            j = j2;
        }
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.limit;
            for (int i3 = segment.pos; i3 < i2; i3++) {
                i = (i * 31) + segment.data[i3];
            }
            segment = segment.next;
            if (segment == null) {
                Intrinsics.m87497m();
            }
        } while (segment != this.head);
        return i;
    }

    @NotNull
    public final ByteString hmacSha1(@NotNull ByteString key) {
        key.getClass();
        return hmac("HmacSHA1", key);
    }

    @NotNull
    public final ByteString hmacSha256(@NotNull ByteString key) {
        key.getClass();
        return hmac("HmacSHA256", key);
    }

    @NotNull
    public final ByteString hmacSha512(@NotNull ByteString key) {
        key.getClass();
        return hmac("HmacSHA512", key);
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes, long fromIndex) throws IOException {
        Segment segment;
        Segment segment2;
        Buffer buffer = this;
        long j = fromIndex;
        bytes.getClass();
        long j2 = 0;
        if (bytes.size() <= 0) {
            ig3.m135964a("bytes is empty");
            return 0L;
        }
        if (j < 0) {
            ci70.m107054a("fromIndex < 0: ", j);
            return 0L;
        }
        Segment segment3 = buffer.head;
        if (segment3 == null) {
            return -1L;
        }
        long j3 = 1;
        if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment3 = segment3.prev;
                if (segment3 == null) {
                    Intrinsics.m87497m();
                }
                size -= (long) (segment3.limit - segment3.pos);
            }
            Segment segment4 = segment3;
            byte[] bArrInternalArray$jvm = bytes.internalArray$jvm();
            byte b = bArrInternalArray$jvm[0];
            long j4 = size;
            int size2 = bytes.size();
            long j5 = (buffer.size - ((long) size2)) + 1;
            while (j4 < j5) {
                byte[] bArr = segment4.data;
                int iMin = (int) Math.min(segment4.limit, (((long) segment4.pos) + j5) - j4);
                int i = (int) ((((long) segment4.pos) + j) - j4);
                while (i < iMin) {
                    if (bArr[i] == b) {
                        segment2 = segment4;
                        if (rangeEquals(segment2, i + 1, bArrInternalArray$jvm, 1, size2)) {
                            return ((long) (i - segment2.pos)) + j4;
                        }
                    } else {
                        segment2 = segment4;
                    }
                    i++;
                    segment4 = segment2;
                }
                Segment segment5 = segment4;
                j4 += (long) (segment5.limit - segment5.pos);
                segment4 = segment5.next;
                if (segment4 == null) {
                    Intrinsics.m87497m();
                }
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j6 = ((long) (segment3.limit - segment3.pos)) + j2;
            if (j6 > j) {
                break;
            }
            long j7 = j3;
            segment3 = segment3.next;
            if (segment3 == null) {
                Intrinsics.m87497m();
            }
            buffer = this;
            j2 = j6;
            j3 = j7;
        }
        Segment segment6 = segment3;
        byte[] bArrInternalArray$jvm2 = bytes.internalArray$jvm();
        byte b2 = bArrInternalArray$jvm2[0];
        long j8 = j2;
        int size3 = bytes.size();
        long j9 = (buffer.size - ((long) size3)) + j3;
        while (j8 < j9) {
            byte[] bArr2 = segment6.data;
            int iMin2 = (int) Math.min(segment6.limit, (((long) segment6.pos) + j9) - j8);
            int i2 = (int) ((((long) segment6.pos) + j) - j8);
            while (i2 < iMin2) {
                if (bArr2[i2] == b2) {
                    segment = segment6;
                    if (rangeEquals(segment, i2 + 1, bArrInternalArray$jvm2, 1, size3)) {
                        return ((long) (i2 - segment.pos)) + j8;
                    }
                } else {
                    segment = segment6;
                }
                i2++;
                segment6 = segment;
            }
            Segment segment7 = segment6;
            j8 += (long) (segment7.limit - segment7.pos);
            segment6 = segment7.next;
            if (segment6 == null) {
                Intrinsics.m87497m();
            }
            j = j8;
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes, long fromIndex) {
        int i;
        int i2;
        targetBytes.getClass();
        long size = 0;
        if (fromIndex < 0) {
            ci70.m107054a("fromIndex < 0: ", fromIndex);
            return 0L;
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - fromIndex < fromIndex) {
            size = size();
            while (size > fromIndex) {
                segment = segment.prev;
                if (segment == null) {
                    Intrinsics.m87497m();
                }
                size -= (long) (segment.limit - segment.pos);
            }
            if (targetBytes.size() == 2) {
                byte b = targetBytes.getByte(0);
                byte b2 = targetBytes.getByte(1);
                while (size < this.size) {
                    byte[] bArr = segment.data;
                    i = (int) ((((long) segment.pos) + fromIndex) - size);
                    int i3 = segment.limit;
                    while (true) {
                        if (i >= i3) {
                            size += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            if (segment == null) {
                                Intrinsics.m87497m();
                            }
                            fromIndex = size;
                        } else {
                            byte b3 = bArr[i];
                            if (b3 == b || b3 == b2) {
                                i2 = segment.pos;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrInternalArray$jvm = targetBytes.internalArray$jvm();
                while (size < this.size) {
                    byte[] bArr2 = segment.data;
                    i = (int) ((((long) segment.pos) + fromIndex) - size);
                    int i4 = segment.limit;
                    while (true) {
                        if (i < i4) {
                            byte b4 = bArr2[i];
                            int length = bArrInternalArray$jvm.length;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= length) {
                                    i++;
                                } else if (b4 == bArrInternalArray$jvm[i5]) {
                                    i2 = segment.pos;
                                } else {
                                    i5++;
                                }
                            }
                        } else {
                            size += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            if (segment == null) {
                                Intrinsics.m87497m();
                            }
                            fromIndex = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j = ((long) (segment.limit - segment.pos)) + size;
            if (j > fromIndex) {
                break;
            }
            segment = segment.next;
            if (segment == null) {
                Intrinsics.m87497m();
            }
            size = j;
        }
        if (targetBytes.size() == 2) {
            byte b5 = targetBytes.getByte(0);
            byte b6 = targetBytes.getByte(1);
            while (size < this.size) {
                byte[] bArr3 = segment.data;
                i = (int) ((((long) segment.pos) + fromIndex) - size);
                int i6 = segment.limit;
                while (true) {
                    if (i >= i6) {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        if (segment == null) {
                            Intrinsics.m87497m();
                        }
                        fromIndex = size;
                    } else {
                        byte b7 = bArr3[i];
                        if (b7 == b5 || b7 == b6) {
                            i2 = segment.pos;
                        } else {
                            i++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrInternalArray$jvm2 = targetBytes.internalArray$jvm();
            while (size < this.size) {
                byte[] bArr4 = segment.data;
                i = (int) ((((long) segment.pos) + fromIndex) - size);
                int i7 = segment.limit;
                while (true) {
                    if (i < i7) {
                        byte b8 = bArr4[i];
                        int length2 = bArrInternalArray$jvm2.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length2) {
                                i++;
                            } else if (b8 == bArrInternalArray$jvm2[i8]) {
                                i2 = segment.pos;
                            } else {
                                i8++;
                            }
                        }
                    } else {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        if (segment == null) {
                            Intrinsics.m87497m();
                        }
                        fromIndex = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i - i2)) + size;
    }

    @Override // okio.BufferedSource
    @NotNull
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.Buffer.inputStream.1
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size(), 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (Buffer.this.size() > 0) {
                    return Buffer.this.readByte() & 255;
                }
                return -1;
            }

            @NotNull
            public String toString() {
                return Buffer.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(@NotNull byte[] sink, int offset, int byteCount) {
                sink.getClass();
                return Buffer.this.read(sink, offset, byteCount);
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @NotNull
    public final ByteString md5() {
        return digest("MD5");
    }

    @Override // okio.BufferedSink
    @NotNull
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.Buffer.outputStream.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            @NotNull
            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(@NotNull byte[] data, int offset, int byteCount) {
                data.getClass();
                Buffer.this.write(data, offset, byteCount);
            }

            @Override // java.io.OutputStream
            public void write(int b) {
                Buffer.this.writeByte(b);
            }
        };
    }

    @Override // okio.BufferedSource
    @NotNull
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long offset, @NotNull ByteString bytes, int bytesOffset, int byteCount) {
        bytes.getClass();
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || this.size - offset < byteCount || bytes.size() - bytesOffset < byteCount) {
            return false;
        }
        for (int i = 0; i < byteCount; i++) {
            if (getByte(((long) i) + offset) != bytes.getByte(bytesOffset + i)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] sink, int offset, int byteCount) {
        sink.getClass();
        Util.checkOffsetAndCount(sink.length, offset, byteCount);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(byteCount, segment.limit - segment.pos);
        System.arraycopy(segment.data, segment.pos, sink, offset, iMin);
        int i = segment.pos + iMin;
        segment.pos = i;
        this.size -= (long) iMin;
        if (i == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @Override // okio.BufferedSource
    public long readAll(@NotNull Sink sink) throws IOException {
        sink.getClass();
        long j = this.size;
        if (j > 0) {
            sink.write(this, j);
        }
        return j;
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readAndWriteUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        unsafeCursor.getClass();
        if (unsafeCursor.buffer != null) {
            qkq0.m175383a("already attached to a buffer");
            return null;
        }
        unsafeCursor.buffer = this;
        unsafeCursor.readWrite = true;
        return unsafeCursor;
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        if (this.size == 0) {
            hg3.m130807a();
            return (byte) 0;
        }
        Segment segment = this.head;
        if (segment == null) {
            Intrinsics.m87497m();
        }
        int i = segment.pos;
        int i2 = segment.limit;
        int i3 = i + 1;
        byte b = segment.data[i];
        this.size--;
        if (i3 != i2) {
            segment.pos = i3;
            return b;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return b;
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            ci70.m107054a("byteCount: ", byteCount);
            return null;
        }
        if (this.size < byteCount) {
            hg3.m130807a();
            return null;
        }
        byte[] bArr = new byte[(int) byteCount];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString() {
        return new ByteString(readByteArray());
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() throws EOFException {
        long j;
        byte b;
        long j2 = 0;
        if (this.size == 0) {
            hg3.m130807a();
            return 0L;
        }
        int i = 0;
        boolean z = false;
        long j3 = 0;
        long j4 = -7;
        boolean z2 = false;
        loop0: while (true) {
            Segment segment = this.head;
            if (segment == null) {
                Intrinsics.m87497m();
            }
            byte[] bArr = segment.data;
            int i2 = segment.pos;
            int i3 = segment.limit;
            while (true) {
                if (i2 >= i3) {
                    j = j2;
                    break;
                }
                b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j3 < -922337203685477580L) {
                        j = j2;
                        break loop0;
                    }
                    if (j3 == -922337203685477580L) {
                        j = j2;
                        if (i4 < j4) {
                            break loop0;
                        }
                    } else {
                        j = j2;
                    }
                    j3 = (j3 * 10) + ((long) i4);
                } else {
                    j = j2;
                    if (b != 45 || i != 0) {
                        if (i != 0) {
                            z2 = true;
                            break;
                        }
                        gg3.m125947a("Expected leading [0-9] or '-' character but was 0x", Integer.toHexString(b));
                        return j;
                    }
                    j4--;
                    z = true;
                }
                i2++;
                i++;
                j2 = j;
            }
            if (i2 == i3) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i2;
            }
            if (z2 || this.head == null) {
                this.size -= (long) i;
                return z ? j3 : -j3;
            }
            j2 = j;
        }
        Buffer bufferWriteByte = new Buffer().writeDecimalLong(j3).writeByte((int) b);
        if (!z) {
            bufferWriteByte.readByte();
        }
        gg3.m125947a("Number too large: ", bufferWriteByte.readUtf8());
        return j;
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull byte[] sink) throws EOFException {
        sink.getClass();
        int i = 0;
        while (i < sink.length) {
            int i2 = read(sink, i, sink.length - i);
            if (i2 == -1) {
                hg3.m130807a();
                return;
            }
            i += i2;
        }
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() throws EOFException {
        int i;
        if (this.size == 0) {
            hg3.m130807a();
            return 0L;
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            Segment segment = this.head;
            if (segment == null) {
                Intrinsics.m87497m();
            }
            byte[] bArr = segment.data;
            int i3 = segment.pos;
            int i4 = segment.limit;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 != 0) {
                            z = true;
                            break;
                        }
                        gg3.m125947a("Expected leading [0-9a-fA-F] character but was 0x", Integer.toHexString(b));
                        return 0L;
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    gg3.m125947a("Number too large: ", new Buffer().writeHexadecimalUnsignedLong(j).writeByte((int) b).readUtf8());
                    return 0L;
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i3;
            }
            if (z) {
                break;
            }
        } while (this.head != null);
        this.size -= (long) i2;
        return j;
    }

    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        if (this.size < 4) {
            hg3.m130807a();
            return 0;
        }
        Segment segment = this.head;
        if (segment == null) {
            Intrinsics.m87497m();
        }
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.size -= 4;
        if (i5 != i2) {
            segment.pos = i5;
            return i6;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return i6;
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws EOFException {
        return Util.reverseBytes(readInt());
    }

    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        if (this.size < 8) {
            hg3.m130807a();
            return 0L;
        }
        Segment segment = this.head;
        if (segment == null) {
            Intrinsics.m87497m();
        }
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = segment.data;
        int i3 = i + 7;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (((long) bArr[i3]) & 255);
        this.size -= 8;
        if (i4 != i2) {
            segment.pos = i4;
            return j2;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return j2;
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws EOFException {
        return Util.reverseBytes(readLong());
    }

    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        if (this.size < 2) {
            hg3.m130807a();
            return (short) 0;
        }
        Segment segment = this.head;
        if (segment == null) {
            Intrinsics.m87497m();
        }
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.size -= 2;
        if (i5 == i2) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i5;
        }
        return (short) i6;
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws EOFException {
        return Util.reverseBytes(readShort());
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(long byteCount, @NotNull Charset charset) throws EOFException {
        charset.getClass();
        if (byteCount < 0 || byteCount > 2147483647L) {
            ci70.m107054a("byteCount: ", byteCount);
            return null;
        }
        if (this.size < byteCount) {
            hg3.m130807a();
            return null;
        }
        if (byteCount == 0) {
            return "";
        }
        Segment segment = this.head;
        if (segment == null) {
            Intrinsics.m87497m();
        }
        int i = segment.pos;
        if (((long) i) + byteCount > segment.limit) {
            return new String(readByteArray(byteCount), charset);
        }
        int i2 = (int) byteCount;
        String str = new String(segment.data, i, i2, charset);
        int i3 = segment.pos + i2;
        segment.pos = i3;
        this.size -= byteCount;
        if (i3 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        unsafeCursor.getClass();
        if (unsafeCursor.buffer != null) {
            qkq0.m175383a("already attached to a buffer");
            return null;
        }
        unsafeCursor.buffer = this;
        unsafeCursor.readWrite = false;
        return unsafeCursor;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8() {
        return readString(this.size, Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.size == 0) {
            hg3.m130807a();
            return 0;
        }
        byte b = getByte(0L);
        if ((b & 128) == 0) {
            i = b & 127;
            i3 = 0;
            i2 = 1;
        } else if ((b & 224) == 192) {
            i = b & 31;
            i2 = 2;
            i3 = 128;
        } else if ((b & 240) == 224) {
            i = b & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((b & 248) != 240) {
                skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i = b & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.size < j) {
            throw new EOFException("size < " + i2 + ": " + this.size + " (to read code point prefixed 0x" + Integer.toHexString(b) + ")");
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte b2 = getByte(j2);
            if ((b2 & 192) != 128) {
                skip(j2);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i = (i << 6) | (b2 & Utf8.REPLACEMENT_BYTE);
        }
        skip(j);
        if (i > 1114111) {
            return Utf8.REPLACEMENT_CODE_POINT;
        }
        return ((55296 <= i && 57343 >= i) || i < i3) ? Utf8.REPLACEMENT_CODE_POINT : i;
    }

    @Override // okio.BufferedSource
    @Nullable
    public String readUtf8Line() throws EOFException {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line$jvm(jIndexOf);
        }
        long j = this.size;
        if (j != 0) {
            return readUtf8(j);
        }
        return null;
    }

    @NotNull
    public final String readUtf8Line$jvm(long newline) throws EOFException {
        if (newline > 0) {
            long j = newline - 1;
            if (getByte(j) == 13) {
                String utf8 = readUtf8(j);
                skip(2L);
                return utf8;
            }
        }
        String utf9 = readUtf8(newline);
        skip(1L);
        return utf9;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict(long limit) throws EOFException {
        if (limit < 0) {
            ci70.m107054a("limit < 0: ", limit);
            return null;
        }
        long j = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j);
        if (jIndexOf != -1) {
            return readUtf8Line$jvm(jIndexOf);
        }
        if (j < this.size && getByte(j - 1) == 13 && getByte(j) == 10) {
            return readUtf8Line$jvm(j);
        }
        Buffer buffer = new Buffer();
        copyTo(buffer, 0L, Math.min(32L, this.size));
        jg3.m141218a(Math.min(this.size, limit), buffer.readByteString().hex());
        return null;
    }

    @Override // okio.BufferedSource
    public boolean request(long byteCount) {
        return this.size >= byteCount;
    }

    @Override // okio.BufferedSource
    public void require(long byteCount) throws EOFException {
        if (this.size >= byteCount) {
            return;
        }
        hg3.m130807a();
    }

    @Override // okio.BufferedSource
    public int select(@NotNull Options options) throws EOFException {
        options.getClass();
        int iSelectPrefix$jvm$default = selectPrefix$jvm$default(this, options, false, 2, null);
        if (iSelectPrefix$jvm$default == -1) {
            return -1;
        }
        skip(options.getByteStrings()[iSelectPrefix$jvm$default].size());
        return iSelectPrefix$jvm$default;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x009e A[LOOP:0: B:5:0x0019->B:51:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x009d A[SYNTHETIC] */
    public final int selectPrefix$jvm(@NotNull Options options, boolean selectTruncated) {
        int i;
        int i2;
        Segment segment;
        int i3;
        int i4;
        options.getClass();
        Segment segment2 = this.head;
        if (segment2 == null) {
            return selectTruncated ? -2 : -1;
        }
        byte[] bArr = segment2.data;
        int i5 = segment2.pos;
        int i6 = segment2.limit;
        int[] trie$jvm = options.getTrie();
        Segment segment3 = segment2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = trie$jvm[i8];
            int i11 = i8 + 2;
            int i12 = trie$jvm[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (segment3 == null) {
                break;
            }
            if (i10 >= 0) {
                i = i5 + 1;
                int i13 = bArr[i5] & 255;
                int i14 = i11 + i10;
                while (i11 != i14) {
                    if (i13 == trie$jvm[i11]) {
                        i2 = trie$jvm[i11 + i10];
                        if (i == i6) {
                            segment3 = segment3.next;
                            if (segment3 == null) {
                                Intrinsics.m87497m();
                            }
                            i = segment3.pos;
                            bArr = segment3.data;
                            i6 = segment3.limit;
                            if (segment3 == segment2) {
                                segment3 = null;
                            }
                        }
                        if (i2 >= 0) {
                            return i2;
                        }
                        i8 = -i2;
                        i5 = i;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i15 = i11 + (i10 * (-1));
            while (true) {
                int i16 = i5 + 1;
                int i17 = i11 + 1;
                if ((bArr[i5] & 255) == trie$jvm[i11]) {
                    boolean z = i17 == i15;
                    if (i16 == i6) {
                        if (segment3 == null) {
                            Intrinsics.m87497m();
                        }
                        Segment segment4 = segment3.next;
                        if (segment4 == null) {
                            Intrinsics.m87497m();
                        }
                        i4 = segment4.pos;
                        byte[] bArr2 = segment4.data;
                        i3 = segment4.limit;
                        if (segment4 != segment2) {
                            segment = segment4;
                            bArr = bArr2;
                        } else {
                            if (!z) {
                                break loop0;
                            }
                            bArr = bArr2;
                            segment = null;
                        }
                    } else {
                        segment = segment3;
                        i3 = i6;
                        i4 = i16;
                    }
                    if (z) {
                        i2 = trie$jvm[i17];
                        i = i4;
                        i6 = i3;
                        segment3 = segment;
                        break;
                    }
                    i5 = i4;
                    i6 = i3;
                    segment3 = segment;
                    i11 = i17;
                }
                return i7;
            }
            if (i2 >= 0) {
                return i2;
            }
            i8 = -i2;
            i5 = i;
        }
        if (selectTruncated) {
            return -2;
        }
        return i7;
    }

    public final void setSize$jvm(long j) {
        this.size = j;
    }

    @NotNull
    public final ByteString sha1() {
        return digest("SHA-1");
    }

    @NotNull
    public final ByteString sha256() {
        return digest("SHA-256");
    }

    @NotNull
    public final ByteString sha512() {
        return digest("SHA-512");
    }

    @JvmName
    public final long size() {
        return this.size;
    }

    @Override // okio.BufferedSource
    public void skip(long byteCount) throws EOFException {
        while (byteCount > 0) {
            Segment segment = this.head;
            if (segment == null) {
                hg3.m130807a();
                return;
            }
            int iMin = (int) Math.min(byteCount, segment.limit - segment.pos);
            long j = iMin;
            this.size -= j;
            byteCount -= j;
            int i = segment.pos + iMin;
            segment.pos = i;
            if (i == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @NotNull
    public final ByteString snapshot() {
        long j = this.size;
        if (j <= 2147483647L) {
            return snapshot((int) j);
        }
        throw new IllegalStateException(("size > Integer.MAX_VALUE: " + this.size).toString());
    }

    @Override // okio.Source
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public Timeout getThis$0() {
        return Timeout.NONE;
    }

    @NotNull
    public String toString() {
        return snapshot().toString();
    }

    @NotNull
    public final Segment writableSegment$jvm(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            ig3.m135964a("unexpected capacity");
            return null;
        }
        Segment segment = this.head;
        if (segment == null) {
            Segment segmentTake = SegmentPool.take();
            this.head = segmentTake;
            segmentTake.prev = segmentTake;
            segmentTake.next = segmentTake;
            return segmentTake;
        }
        if (segment == null) {
            Intrinsics.m87497m();
        }
        Segment segment2 = segment.prev;
        if (segment2 == null) {
            Intrinsics.m87497m();
        }
        return (segment2.limit + minimumCapacity > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long byteCount) {
        Segment segment;
        source.getClass();
        if (source == this) {
            ig3.m135964a("source == this");
            return;
        }
        Util.checkOffsetAndCount(source.size, 0L, byteCount);
        while (byteCount > 0) {
            Segment segment2 = source.head;
            if (segment2 == null) {
                Intrinsics.m87497m();
            }
            int i = segment2.limit;
            Segment segment3 = source.head;
            if (segment3 == null) {
                Intrinsics.m87497m();
            }
            if (byteCount < i - segment3.pos) {
                Segment segment4 = this.head;
                if (segment4 != null) {
                    if (segment4 == null) {
                        Intrinsics.m87497m();
                    }
                    segment = segment4.prev;
                } else {
                    segment = null;
                }
                if (segment != null && segment.owner) {
                    if ((((long) segment.limit) + byteCount) - ((long) (segment.shared ? 0 : segment.pos)) <= 8192) {
                        Segment segment5 = source.head;
                        if (segment5 == null) {
                            Intrinsics.m87497m();
                        }
                        segment5.writeTo(segment, (int) byteCount);
                        source.size -= byteCount;
                        this.size += byteCount;
                        return;
                    }
                }
                Segment segment6 = source.head;
                if (segment6 == null) {
                    Intrinsics.m87497m();
                }
                source.head = segment6.split((int) byteCount);
            }
            Segment segment7 = source.head;
            if (segment7 == null) {
                Intrinsics.m87497m();
            }
            long j = segment7.limit - segment7.pos;
            source.head = segment7.pop();
            Segment segment8 = this.head;
            if (segment8 == null) {
                this.head = segment7;
                segment7.prev = segment7;
                segment7.next = segment7;
            } else {
                if (segment8 == null) {
                    Intrinsics.m87497m();
                }
                Segment segment9 = segment8.prev;
                if (segment9 == null) {
                    Intrinsics.m87497m();
                }
                segment9.push(segment7).compact();
            }
            source.size -= j;
            this.size += j;
            byteCount -= j;
        }
    }

    @Override // okio.BufferedSink
    public long writeAll(@NotNull Source source) throws IOException {
        source.getClass();
        long j = 0;
        while (true) {
            long j2 = source.read(this, 8192L);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeByte(int b) {
        Segment segmentWritableSegment$jvm = writableSegment$jvm(1);
        byte[] bArr = segmentWritableSegment$jvm.data;
        int i = segmentWritableSegment$jvm.limit;
        segmentWritableSegment$jvm.limit = i + 1;
        bArr[i] = (byte) b;
        this.size++;
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeDecimalLong(long v2) {
        boolean z;
        if (v2 == 0) {
            return writeByte(48);
        }
        int i = 1;
        if (v2 < 0) {
            v2 = -v2;
            if (v2 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (v2 < 100000000) {
            if (v2 < 10000) {
                if (v2 >= 100) {
                    i = v2 < 1000 ? 3 : 4;
                } else if (v2 >= 10) {
                    i = 2;
                }
            } else if (v2 < 1000000) {
                i = v2 < 100000 ? 5 : 6;
            } else {
                i = v2 < 10000000 ? 7 : 8;
            }
        } else if (v2 < 1000000000000L) {
            if (v2 < 10000000000L) {
                i = v2 < 1000000000 ? 9 : 10;
            } else {
                i = v2 < 100000000000L ? 11 : 12;
            }
        } else if (v2 < 1000000000000000L) {
            if (v2 < 10000000000000L) {
                i = 13;
            } else {
                i = v2 < 100000000000000L ? 14 : 15;
            }
        } else if (v2 < 100000000000000000L) {
            i = v2 < 10000000000000000L ? 16 : 17;
        } else {
            i = v2 < 1000000000000000000L ? 18 : 19;
        }
        if (z) {
            i++;
        }
        Segment segmentWritableSegment$jvm = writableSegment$jvm(i);
        byte[] bArr = segmentWritableSegment$jvm.data;
        int i2 = segmentWritableSegment$jvm.limit + i;
        while (v2 != 0) {
            i2--;
            bArr[i2] = DIGITS[(int) (v2 % 10)];
            v2 /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        segmentWritableSegment$jvm.limit += i;
        this.size += (long) i;
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeHexadecimalUnsignedLong(long v2) {
        if (v2 == 0) {
            return writeByte(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(v2)) / 4) + 1;
        Segment segmentWritableSegment$jvm = writableSegment$jvm(iNumberOfTrailingZeros);
        byte[] bArr = segmentWritableSegment$jvm.data;
        int i = segmentWritableSegment$jvm.limit;
        for (int i2 = (i + iNumberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = DIGITS[(int) (15 & v2)];
            v2 >>>= 4;
        }
        segmentWritableSegment$jvm.limit += iNumberOfTrailingZeros;
        this.size += (long) iNumberOfTrailingZeros;
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeInt(int i) {
        Segment segmentWritableSegment$jvm = writableSegment$jvm(4);
        byte[] bArr = segmentWritableSegment$jvm.data;
        int i2 = segmentWritableSegment$jvm.limit;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        segmentWritableSegment$jvm.limit = i2 + 4;
        this.size += 4;
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeIntLe(int i) {
        return writeInt(Util.reverseBytes(i));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeLong(long v2) {
        Segment segmentWritableSegment$jvm = writableSegment$jvm(8);
        byte[] bArr = segmentWritableSegment$jvm.data;
        int i = segmentWritableSegment$jvm.limit;
        bArr[i] = (byte) ((v2 >>> 56) & 255);
        bArr[i + 1] = (byte) ((v2 >>> 48) & 255);
        bArr[i + 2] = (byte) ((v2 >>> 40) & 255);
        bArr[i + 3] = (byte) ((v2 >>> 32) & 255);
        bArr[i + 4] = (byte) ((v2 >>> 24) & 255);
        bArr[i + 5] = (byte) ((v2 >>> 16) & 255);
        bArr[i + 6] = (byte) ((v2 >>> 8) & 255);
        bArr[i + 7] = (byte) (v2 & 255);
        segmentWritableSegment$jvm.limit = i + 8;
        this.size += 8;
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeLongLe(long v2) {
        return writeLong(Util.reverseBytes(v2));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeShort(int s) {
        Segment segmentWritableSegment$jvm = writableSegment$jvm(2);
        byte[] bArr = segmentWritableSegment$jvm.data;
        int i = segmentWritableSegment$jvm.limit;
        bArr[i] = (byte) ((s >>> 8) & 255);
        bArr[i + 1] = (byte) (s & 255);
        segmentWritableSegment$jvm.limit = i + 2;
        this.size += 2;
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeShortLe(int s) {
        return writeShort((int) Util.reverseBytes((short) s));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeString(@NotNull String string, int beginIndex, int endIndex, @NotNull Charset charset) {
        string.getClass();
        charset.getClass();
        if (beginIndex < 0) {
            jck0.m140980a("beginIndex < 0: ", beginIndex);
            return null;
        }
        if (endIndex < beginIndex) {
            hck0.m130443a("endIndex < beginIndex: ", endIndex, " < ", beginIndex);
            return null;
        }
        if (endIndex > string.length()) {
            hck0.m130443a("endIndex > string.length: ", endIndex, " > ", string.length());
            return null;
        }
        if (Intrinsics.m87488d(charset, Charsets.UTF_8)) {
            return writeUtf8(string, beginIndex, endIndex);
        }
        byte[] bytes = string.substring(beginIndex, endIndex).getBytes(charset);
        bytes.getClass();
        return write(bytes, 0, bytes.length);
    }

    @JvmOverloads
    @NotNull
    public final Buffer writeTo(@NotNull OutputStream out, long byteCount) throws IOException {
        out.getClass();
        Util.checkOffsetAndCount(this.size, 0L, byteCount);
        Segment segment = this.head;
        long j = byteCount;
        while (j > 0) {
            if (segment == null) {
                Intrinsics.m87497m();
            }
            int iMin = (int) Math.min(j, segment.limit - segment.pos);
            out.write(segment.data, segment.pos, iMin);
            int i = segment.pos + iMin;
            segment.pos = i;
            long j2 = iMin;
            this.size -= j2;
            j -= j2;
            if (i == segment.limit) {
                Segment segmentPop = segment.pop();
                this.head = segmentPop;
                SegmentPool.recycle(segment);
                segment = segmentPop;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8(@NotNull String string, int beginIndex, int endIndex) {
        string.getClass();
        if (beginIndex < 0) {
            jck0.m140980a("beginIndex < 0: ", beginIndex);
            return null;
        }
        if (endIndex < beginIndex) {
            hck0.m130443a("endIndex < beginIndex: ", endIndex, " < ", beginIndex);
            return null;
        }
        if (endIndex > string.length()) {
            hck0.m130443a("endIndex > string.length: ", endIndex, " > ", string.length());
            return null;
        }
        while (beginIndex < endIndex) {
            char cCharAt = string.charAt(beginIndex);
            if (cCharAt < 128) {
                Segment segmentWritableSegment$jvm = writableSegment$jvm(1);
                byte[] bArr = segmentWritableSegment$jvm.data;
                int i = segmentWritableSegment$jvm.limit - beginIndex;
                int iMin = Math.min(endIndex, 8192 - i);
                int i2 = beginIndex + 1;
                bArr[beginIndex + i] = (byte) cCharAt;
                while (i2 < iMin) {
                    char cCharAt2 = string.charAt(i2);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i2 + i] = (byte) cCharAt2;
                    i2++;
                }
                int i3 = segmentWritableSegment$jvm.limit;
                int i4 = (i + i2) - i3;
                segmentWritableSegment$jvm.limit = i3 + i4;
                this.size += (long) i4;
                beginIndex = i2;
            } else {
                if (cCharAt < 2048) {
                    Segment segmentWritableSegment$jvm2 = writableSegment$jvm(2);
                    byte[] bArr2 = segmentWritableSegment$jvm2.data;
                    int i5 = segmentWritableSegment$jvm2.limit;
                    bArr2[i5] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i5 + 1] = (byte) ((cCharAt & '?') | 128);
                    segmentWritableSegment$jvm2.limit = i5 + 2;
                    this.size += 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    Segment segmentWritableSegment$jvm3 = writableSegment$jvm(3);
                    byte[] bArr3 = segmentWritableSegment$jvm3.data;
                    int i6 = segmentWritableSegment$jvm3.limit;
                    bArr3[i6] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i6 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i6 + 2] = (byte) ((cCharAt & '?') | 128);
                    segmentWritableSegment$jvm3.limit = i6 + 3;
                    this.size += 3;
                } else {
                    int i7 = beginIndex + 1;
                    char cCharAt3 = i7 < endIndex ? string.charAt(i7) : (char) 0;
                    if (cCharAt > 56319 || 56320 > cCharAt3 || 57343 < cCharAt3) {
                        writeByte(63);
                        beginIndex = i7;
                    } else {
                        int i8 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentWritableSegment$jvm4 = writableSegment$jvm(4);
                        byte[] bArr4 = segmentWritableSegment$jvm4.data;
                        int i9 = segmentWritableSegment$jvm4.limit;
                        bArr4[i9] = (byte) ((i8 >> 18) | 240);
                        bArr4[i9 + 1] = (byte) (((i8 >> 12) & 63) | 128);
                        bArr4[i9 + 2] = (byte) (((i8 >> 6) & 63) | 128);
                        bArr4[i9 + 3] = (byte) ((i8 & 63) | 128);
                        segmentWritableSegment$jvm4.limit = i9 + 4;
                        this.size += 4;
                        beginIndex += 2;
                    }
                }
                beginIndex++;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8CodePoint(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
            return this;
        }
        if (codePoint < 2048) {
            Segment segmentWritableSegment$jvm = writableSegment$jvm(2);
            byte[] bArr = segmentWritableSegment$jvm.data;
            int i = segmentWritableSegment$jvm.limit;
            bArr[i] = (byte) ((codePoint >> 6) | 192);
            bArr[i + 1] = (byte) ((codePoint & 63) | 128);
            segmentWritableSegment$jvm.limit = i + 2;
            this.size += 2;
            return this;
        }
        if (55296 <= codePoint && 57343 >= codePoint) {
            writeByte(63);
            return this;
        }
        if (codePoint < 65536) {
            Segment segmentWritableSegment$jvm2 = writableSegment$jvm(3);
            byte[] bArr2 = segmentWritableSegment$jvm2.data;
            int i2 = segmentWritableSegment$jvm2.limit;
            bArr2[i2] = (byte) ((codePoint >> 12) | 224);
            bArr2[i2 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr2[i2 + 2] = (byte) ((codePoint & 63) | 128);
            segmentWritableSegment$jvm2.limit = i2 + 3;
            this.size += 3;
            return this;
        }
        if (codePoint > 1114111) {
            kg3.m145878a("Unexpected code point: ", Integer.toHexString(codePoint));
            return null;
        }
        Segment segmentWritableSegment$jvm3 = writableSegment$jvm(4);
        byte[] bArr3 = segmentWritableSegment$jvm3.data;
        int i3 = segmentWritableSegment$jvm3.limit;
        bArr3[i3] = (byte) ((codePoint >> 18) | 240);
        bArr3[i3 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
        bArr3[i3 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
        bArr3[i3 + 3] = (byte) ((codePoint & 63) | 128);
        segmentWritableSegment$jvm3.limit = i3 + 4;
        this.size += 4;
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer emit() {
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer emitCompleteSegments() {
        return this;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8(long byteCount) throws EOFException {
        return readString(byteCount, Charsets.UTF_8);
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString(long byteCount) throws EOFException {
        return new ByteString(readByteArray(byteCount));
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull Buffer sink, long byteCount) throws EOFException {
        sink.getClass();
        long j = this.size;
        if (j >= byteCount) {
            sink.write(this, byteCount);
        } else {
            sink.write(this, j);
            hg3.m130807a();
        }
    }

    @NotNull
    public static /* bridge */ /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = buffer.size - j3;
        }
        return buffer.copyTo(buffer2, j3, j2);
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray() {
        return readByteArray(this.size);
    }

    @NotNull
    public final ByteString snapshot(int byteCount) {
        return byteCount == 0 ? ByteString.EMPTY : SegmentedByteString.INSTANCE.m221057of(this, byteCount);
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long offset, @NotNull ByteString bytes) {
        bytes.getClass();
        return rangeEquals(offset, bytes, 0, bytes.size());
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream input, long byteCount) throws IOException {
        input.getClass();
        if (byteCount >= 0) {
            readFrom(input, byteCount, false);
            return this;
        }
        ci70.m107054a("byteCount < 0: ", byteCount);
        return null;
    }

    private final boolean rangeEquals(Segment segment, int segmentPos, byte[] bytes, int bytesOffset, int bytesLimit) {
        int i = segment.limit;
        byte[] bArr = segment.data;
        while (bytesOffset < bytesLimit) {
            if (segmentPos == i) {
                Segment segment2 = segment.next;
                if (segment2 == null) {
                    Intrinsics.m87497m();
                }
                byte[] bArr2 = segment2.data;
                segmentPos = segment2.pos;
                segment = segment2;
                i = segment2.limit;
                bArr = bArr2;
            }
            if (bArr[segmentPos] != bytes[bytesOffset]) {
                return false;
            }
            segmentPos++;
            bytesOffset++;
        }
        return true;
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream input) throws IOException {
        input.getClass();
        readFrom(input, Long.MAX_VALUE, true);
        return this;
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] sink) {
        sink.getClass();
        return read(sink, 0, sink.length);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) throws IOException {
        sink.getClass();
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), segment.limit - segment.pos);
        sink.put(segment.data, segment.pos, iMin);
        int i = segment.pos + iMin;
        segment.pos = i;
        this.size -= (long) iMin;
        if (i == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long byteCount) {
        sink.getClass();
        if (byteCount >= 0) {
            long j = this.size;
            if (j == 0) {
                return -1L;
            }
            if (byteCount > j) {
                byteCount = j;
            }
            sink.write(this, byteCount);
            return byteCount;
        }
        ci70.m107054a("byteCount < 0: ", byteCount);
        return 0L;
    }

    @JvmOverloads
    @NotNull
    public final Buffer writeTo(@NotNull OutputStream outputStream) throws IOException {
        return writeTo$default(this, outputStream, 0L, 2, null);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeString(@NotNull String string, @NotNull Charset charset) {
        string.getClass();
        charset.getClass();
        return writeString(string, 0, string.length(), charset);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(@NotNull Charset charset) {
        charset.getClass();
        return readString(this.size, charset);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @JvmOverloads
    @NotNull
    public final Buffer copyTo(@NotNull OutputStream outputStream, long j) throws IOException {
        return copyTo$default(this, outputStream, j, 0L, 4, (Object) null);
    }

    @JvmOverloads
    @NotNull
    public final Buffer copyTo(@NotNull OutputStream out, long offset, long byteCount) throws IOException {
        out.getClass();
        long j = offset;
        Util.checkOffsetAndCount(this.size, j, byteCount);
        if (byteCount != 0) {
            Segment segment = this.head;
            while (true) {
                if (segment == null) {
                    Intrinsics.m87497m();
                }
                int i = segment.limit;
                int i2 = segment.pos;
                if (j < i - i2) {
                    break;
                }
                j -= (long) (i - i2);
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j2 = byteCount;
            while (j2 > 0) {
                if (segment2 == null) {
                    Intrinsics.m87497m();
                }
                int i3 = (int) (((long) segment2.pos) + j);
                int iMin = (int) Math.min(segment2.limit - i3, j2);
                out.write(segment2.data, i3, iMin);
                j2 -= (long) iMin;
                segment2 = segment2.next;
                j = 0;
            }
        }
        return this;
    }

    @JvmOverloads
    @NotNull
    public final Buffer copyTo(@NotNull OutputStream outputStream) throws IOException {
        return copyTo$default(this, outputStream, 0L, 0L, 6, (Object) null);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull ByteString byteString) {
        byteString.getClass();
        byteString.write$jvm(this);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull byte[] source) {
        source.getClass();
        return write(source, 0, source.length);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull byte[] source, int offset, int byteCount) {
        source.getClass();
        long j = byteCount;
        Util.checkOffsetAndCount(source.length, offset, j);
        int i = byteCount + offset;
        while (offset < i) {
            Segment segmentWritableSegment$jvm = writableSegment$jvm(1);
            int iMin = Math.min(i - offset, 8192 - segmentWritableSegment$jvm.limit);
            System.arraycopy(source, offset, segmentWritableSegment$jvm.data, segmentWritableSegment$jvm.limit, iMin);
            offset += iMin;
            segmentWritableSegment$jvm.limit += iMin;
        }
        this.size += j;
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer source) throws IOException {
        source.getClass();
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            Segment segmentWritableSegment$jvm = writableSegment$jvm(1);
            int iMin = Math.min(i, 8192 - segmentWritableSegment$jvm.limit);
            source.get(segmentWritableSegment$jvm.data, segmentWritableSegment$jvm.limit, iMin);
            i -= iMin;
            segmentWritableSegment$jvm.limit += iMin;
        }
        this.size += (long) iRemaining;
        return iRemaining;
    }

    @Override // okio.BufferedSink
    @NotNull
    public BufferedSink write(@NotNull Source source, long byteCount) throws IOException {
        source.getClass();
        while (byteCount > 0) {
            long j = source.read(this, byteCount);
            if (j == -1) {
                hg3.m130807a();
                return null;
            }
            byteCount -= j;
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long fromIndex) {
        return indexOf(b, fromIndex, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8(@NotNull String string) {
        string.getClass();
        return writeUtf8(string, 0, string.length());
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long fromIndex, long toIndex) {
        Segment segment;
        int i;
        long size = 0;
        if (0 <= fromIndex && toIndex >= fromIndex) {
            long j = this.size;
            if (toIndex > j) {
                toIndex = j;
            }
            if (fromIndex == toIndex || (segment = this.head) == null) {
                return -1L;
            }
            if (size() - fromIndex < fromIndex) {
                size = size();
                while (size > fromIndex) {
                    segment = segment.prev;
                    if (segment == null) {
                        Intrinsics.m87497m();
                    }
                    size -= (long) (segment.limit - segment.pos);
                }
                while (size < toIndex) {
                    byte[] bArr = segment.data;
                    int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + toIndex) - size);
                    i = (int) ((((long) segment.pos) + fromIndex) - size);
                    while (i < iMin) {
                        if (bArr[i] != b) {
                            i++;
                        }
                    }
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    if (segment == null) {
                        Intrinsics.m87497m();
                    }
                    fromIndex = size;
                }
                return -1L;
            }
            while (true) {
                long j2 = ((long) (segment.limit - segment.pos)) + size;
                if (j2 > fromIndex) {
                    break;
                }
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.m87497m();
                }
                size = j2;
            }
            while (size < toIndex) {
                byte[] bArr2 = segment.data;
                int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + toIndex) - size);
                i = (int) ((((long) segment.pos) + fromIndex) - size);
                while (i < iMin2) {
                    if (bArr2[i] != b) {
                        i++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                if (segment == null) {
                    Intrinsics.m87497m();
                }
                fromIndex = size;
            }
            return -1L;
            return ((long) (i - segment.pos)) + size;
        }
        throw new IllegalArgumentException(("size=" + this.size + " fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes) {
        targetBytes.getClass();
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes) throws IOException {
        bytes.getClass();
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b) {
        return indexOf(b, 0L, Long.MAX_VALUE);
    }
}
