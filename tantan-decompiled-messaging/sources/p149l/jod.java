package p149l;

import com.coremedia.iso.boxes.FileTypeBox;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.eclipse.jetty.http.HttpTokens;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m87232d2 = {"Ll/jod;", "Ll/egm$b;", "<init>", "()V", "", "headerBytes", "", "headerSize", "Ll/egm;", "a", "([BI)Ll/egm;", "I", "b", "()I", "Companion", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class jod implements egm.InterfaceC16594b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final byte[] f118935b;

    /* JADX INFO: renamed from: c */
    public static final int f118936c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final byte[] f118937d;

    /* JADX INFO: renamed from: e */
    public static final int f118938e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final byte[] f118939f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final byte[] f118940g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final byte[] f118941h;

    /* JADX INFO: renamed from: i */
    public static final int f118942i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final byte[] f118943j;

    /* JADX INFO: renamed from: k */
    public static final int f118944k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final byte[] f118945l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final byte[][] f118946m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final byte[] f118947n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final byte[] f118948o;

    /* JADX INFO: renamed from: p */
    public static final int f118949p;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int headerSize;

    static {
        byte[] bArr = {-1, -40, -1};
        f118935b = bArr;
        f118936c = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, HttpTokens.CARRIAGE_RETURN, 10, 26, 10};
        f118937d = bArr2;
        f118938e = bArr2.length;
        f118939f = hgm.m130835a("GIF87a");
        f118940g = hgm.m130835a("GIF89a");
        byte[] bArrM130835a = hgm.m130835a("BM");
        f118941h = bArrM130835a;
        f118942i = bArrM130835a.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f118943j = bArr3;
        f118944k = bArr3.length;
        f118945l = hgm.m130835a(FileTypeBox.TYPE);
        f118946m = new byte[][]{hgm.m130835a("heic"), hgm.m130835a("heix"), hgm.m130835a("hevc"), hgm.m130835a("hevx"), hgm.m130835a("mif1"), hgm.m130835a("msf1")};
        byte[] bArr4 = {73, 73, 42, 0};
        f118947n = bArr4;
        f118948o = new byte[]{77, 77, 0, 42};
        f118949p = bArr4.length;
    }

    public jod() {
        Object objMaxOrNull = ArraysKt.maxOrNull(new Integer[]{21, 20, Integer.valueOf(f118936c), Integer.valueOf(f118938e), 6, Integer.valueOf(f118942i), Integer.valueOf(f118944k), 12});
        if (objMaxOrNull != null) {
            this.headerSize = ((Number) objMaxOrNull).intValue();
        } else {
            qkq0.m175383a("Required value was null.");
            throw null;
        }
    }

    @Override // p149l.egm.InterfaceC16594b
    @NotNull
    /* JADX INFO: renamed from: a */
    public egm mo116294a(@NotNull byte[] headerBytes, int headerSize) {
        headerBytes.getClass();
        if (rlp0.m179874h(headerBytes, 0, headerSize)) {
            return INSTANCE.m142446i(headerBytes, headerSize);
        }
        Companion companion = INSTANCE;
        if (companion.m142452o(headerBytes, headerSize)) {
            return kod.JPEG;
        }
        if (companion.m142453p(headerBytes, headerSize)) {
            return kod.PNG;
        }
        if (companion.m142449l(headerBytes, headerSize)) {
            return kod.GIF;
        }
        if (companion.m142447j(headerBytes, headerSize)) {
            return kod.BMP;
        }
        if (companion.m142451n(headerBytes, headerSize)) {
            return kod.ICO;
        }
        if (companion.m142450m(headerBytes, headerSize)) {
            return kod.HEIF;
        }
        return companion.m142448k(headerBytes, headerSize) ? kod.DNG : egm.f90961c;
    }

    @Override // p149l.egm.InterfaceC16594b
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getHeaderSize() {
        return this.headerSize;
    }

    /* JADX INFO: renamed from: l.jod$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0015R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0015¨\u0006+"}, m87232d2 = {"Ll/jod$a;", "", "<init>", "()V", "", "imageHeaderBytes", "", "headerSize", "Ll/egm;", RXScreenCaptureService.KEY_INDEX, "([BI)Ll/egm;", "", "o", "([BI)Z", "p", BLiveStormDanmakuGiftResourceType.f44444l, "j", "n", "m", "k", "SIMPLE_WEBP_HEADER_LENGTH", "I", "EXTENDED_WEBP_HEADER_LENGTH", "JPEG_HEADER", "[B", "JPEG_HEADER_LENGTH", "PNG_HEADER", "PNG_HEADER_LENGTH", "GIF_HEADER_87A", "GIF_HEADER_89A", "GIF_HEADER_LENGTH", "BMP_HEADER", "BMP_HEADER_LENGTH", "ICO_HEADER", "ICO_HEADER_LENGTH", "HEIF_HEADER_PREFIX", "", "HEIF_HEADER_SUFFIXES", "[[B", "HEIF_HEADER_LENGTH", "DNG_HEADER_II", "DNG_HEADER_MM", "DNG_HEADER_LENGTH", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: i */
        public final egm m142446i(byte[] imageHeaderBytes, int headerSize) {
            if (!rlp0.m179874h(imageHeaderBytes, 0, headerSize)) {
                qkq0.m175383a("Check failed.");
                return null;
            }
            if (rlp0.m179873g(imageHeaderBytes, 0)) {
                return kod.WEBP_SIMPLE;
            }
            if (rlp0.m179872f(imageHeaderBytes, 0)) {
                return kod.WEBP_LOSSLESS;
            }
            if (!rlp0.m179869c(imageHeaderBytes, 0, headerSize)) {
                return egm.f90961c;
            }
            if (rlp0.m179868b(imageHeaderBytes, 0)) {
                return kod.WEBP_ANIMATED;
            }
            return rlp0.m179870d(imageHeaderBytes, 0) ? kod.WEBP_EXTENDED_WITH_ALPHA : kod.WEBP_EXTENDED;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m142447j(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize < jod.f118941h.length) {
                return false;
            }
            return hgm.m130837c(imageHeaderBytes, jod.f118941h);
        }

        /* JADX INFO: renamed from: k */
        public final boolean m142448k(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize >= jod.f118949p) {
                return hgm.m130837c(imageHeaderBytes, jod.f118947n) || hgm.m130837c(imageHeaderBytes, jod.f118948o);
            }
            return false;
        }

        /* JADX INFO: renamed from: l */
        public final boolean m142449l(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize < 6) {
                return false;
            }
            return hgm.m130837c(imageHeaderBytes, jod.f118939f) || hgm.m130837c(imageHeaderBytes, jod.f118940g);
        }

        /* JADX INFO: renamed from: m */
        public final boolean m142450m(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize < 12 || imageHeaderBytes[3] < 8 || !hgm.m130836b(imageHeaderBytes, jod.f118945l, 4)) {
                return false;
            }
            for (byte[] bArr : jod.f118946m) {
                if (hgm.m130836b(imageHeaderBytes, bArr, 8)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: n */
        public final boolean m142451n(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize < jod.f118943j.length) {
                return false;
            }
            return hgm.m130837c(imageHeaderBytes, jod.f118943j);
        }

        /* JADX INFO: renamed from: o */
        public final boolean m142452o(byte[] imageHeaderBytes, int headerSize) {
            return headerSize >= jod.f118935b.length && hgm.m130837c(imageHeaderBytes, jod.f118935b);
        }

        /* JADX INFO: renamed from: p */
        public final boolean m142453p(byte[] imageHeaderBytes, int headerSize) {
            return headerSize >= jod.f118937d.length && hgm.m130837c(imageHeaderBytes, jod.f118937d);
        }

        public Companion() {
        }
    }
}
