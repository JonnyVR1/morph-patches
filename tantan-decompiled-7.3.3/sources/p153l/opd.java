package p153l;

import com.coremedia.iso.boxes.FileTypeBox;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.eclipse.jetty.http.HttpTokens;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m88121d2 = {"Ll/opd;", "Ll/him$b;", "<init>", "()V", "", "headerBytes", "", "headerSize", "Ll/him;", "a", "([BI)Ll/him;", "I", "b", "()I", "Companion", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class opd implements him.InterfaceC17471b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final byte[] f148436b;

    /* JADX INFO: renamed from: c */
    public static final int f148437c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final byte[] f148438d;

    /* JADX INFO: renamed from: e */
    public static final int f148439e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final byte[] f148440f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final byte[] f148441g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final byte[] f148442h;

    /* JADX INFO: renamed from: i */
    public static final int f148443i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final byte[] f148444j;

    /* JADX INFO: renamed from: k */
    public static final int f148445k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final byte[] f148446l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final byte[][] f148447m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final byte[] f148448n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final byte[] f148449o;

    /* JADX INFO: renamed from: p */
    public static final int f148450p;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int headerSize;

    static {
        byte[] bArr = {-1, -40, -1};
        f148436b = bArr;
        f148437c = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, HttpTokens.CARRIAGE_RETURN, 10, 26, 10};
        f148438d = bArr2;
        f148439e = bArr2.length;
        f148440f = kim.m149917a("GIF87a");
        f148441g = kim.m149917a("GIF89a");
        byte[] bArrM149917a = kim.m149917a("BM");
        f148442h = bArrM149917a;
        f148443i = bArrM149917a.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f148444j = bArr3;
        f148445k = bArr3.length;
        f148446l = kim.m149917a(FileTypeBox.TYPE);
        f148447m = new byte[][]{kim.m149917a("heic"), kim.m149917a("heix"), kim.m149917a("hevc"), kim.m149917a("hevx"), kim.m149917a("mif1"), kim.m149917a("msf1")};
        byte[] bArr4 = {73, 73, 42, 0};
        f148448n = bArr4;
        f148449o = new byte[]{77, 77, 0, 42};
        f148450p = bArr4.length;
    }

    public opd() {
        Object objMaxOrNull = ArraysKt.maxOrNull(new Integer[]{21, 20, Integer.valueOf(f148437c), Integer.valueOf(f148439e), 6, Integer.valueOf(f148443i), Integer.valueOf(f148445k), 12});
        if (objMaxOrNull != null) {
            this.headerSize = ((Number) objMaxOrNull).intValue();
        } else {
            wtq0.m207906a("Required value was null.");
            throw null;
        }
    }

    @Override // p153l.him.InterfaceC17471b
    @NotNull
    /* JADX INFO: renamed from: a */
    public him mo135129a(@NotNull byte[] headerBytes, int headerSize) {
        headerBytes.getClass();
        if (vup0.m202873h(headerBytes, 0, headerSize)) {
            return INSTANCE.m168642i(headerBytes, headerSize);
        }
        Companion companion = INSTANCE;
        if (companion.m168648o(headerBytes, headerSize)) {
            return ppd.JPEG;
        }
        if (companion.m168649p(headerBytes, headerSize)) {
            return ppd.PNG;
        }
        if (companion.m168645l(headerBytes, headerSize)) {
            return ppd.GIF;
        }
        if (companion.m168643j(headerBytes, headerSize)) {
            return ppd.BMP;
        }
        if (companion.m168647n(headerBytes, headerSize)) {
            return ppd.ICO;
        }
        if (companion.m168646m(headerBytes, headerSize)) {
            return ppd.HEIF;
        }
        return companion.m168644k(headerBytes, headerSize) ? ppd.DNG : him.f110036c;
    }

    @Override // p153l.him.InterfaceC17471b
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getHeaderSize() {
        return this.headerSize;
    }

    /* JADX INFO: renamed from: l.opd$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0015R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0015¨\u0006+"}, m88121d2 = {"Ll/opd$a;", "", "<init>", "()V", "", "imageHeaderBytes", "", "headerSize", "Ll/him;", RXScreenCaptureService.KEY_INDEX, "([BI)Ll/him;", "", "o", "([BI)Z", "p", BLiveStormDanmakuGiftResourceType.f45292l, "j", "n", "m", "k", "SIMPLE_WEBP_HEADER_LENGTH", "I", "EXTENDED_WEBP_HEADER_LENGTH", "JPEG_HEADER", "[B", "JPEG_HEADER_LENGTH", "PNG_HEADER", "PNG_HEADER_LENGTH", "GIF_HEADER_87A", "GIF_HEADER_89A", "GIF_HEADER_LENGTH", "BMP_HEADER", "BMP_HEADER_LENGTH", "ICO_HEADER", "ICO_HEADER_LENGTH", "HEIF_HEADER_PREFIX", "", "HEIF_HEADER_SUFFIXES", "[[B", "HEIF_HEADER_LENGTH", "DNG_HEADER_II", "DNG_HEADER_MM", "DNG_HEADER_LENGTH", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: i */
        public final him m168642i(byte[] imageHeaderBytes, int headerSize) {
            if (!vup0.m202873h(imageHeaderBytes, 0, headerSize)) {
                wtq0.m207906a("Check failed.");
                return null;
            }
            if (vup0.m202872g(imageHeaderBytes, 0)) {
                return ppd.WEBP_SIMPLE;
            }
            if (vup0.m202871f(imageHeaderBytes, 0)) {
                return ppd.WEBP_LOSSLESS;
            }
            if (!vup0.m202868c(imageHeaderBytes, 0, headerSize)) {
                return him.f110036c;
            }
            if (vup0.m202867b(imageHeaderBytes, 0)) {
                return ppd.WEBP_ANIMATED;
            }
            return vup0.m202869d(imageHeaderBytes, 0) ? ppd.WEBP_EXTENDED_WITH_ALPHA : ppd.WEBP_EXTENDED;
        }

        /* JADX INFO: renamed from: j */
        public final boolean m168643j(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize < opd.f148442h.length) {
                return false;
            }
            return kim.m149919c(imageHeaderBytes, opd.f148442h);
        }

        /* JADX INFO: renamed from: k */
        public final boolean m168644k(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize >= opd.f148450p) {
                return kim.m149919c(imageHeaderBytes, opd.f148448n) || kim.m149919c(imageHeaderBytes, opd.f148449o);
            }
            return false;
        }

        /* JADX INFO: renamed from: l */
        public final boolean m168645l(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize < 6) {
                return false;
            }
            return kim.m149919c(imageHeaderBytes, opd.f148440f) || kim.m149919c(imageHeaderBytes, opd.f148441g);
        }

        /* JADX INFO: renamed from: m */
        public final boolean m168646m(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize < 12 || imageHeaderBytes[3] < 8 || !kim.m149918b(imageHeaderBytes, opd.f148446l, 4)) {
                return false;
            }
            for (byte[] bArr : opd.f148447m) {
                if (kim.m149918b(imageHeaderBytes, bArr, 8)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: n */
        public final boolean m168647n(byte[] imageHeaderBytes, int headerSize) {
            if (headerSize < opd.f148444j.length) {
                return false;
            }
            return kim.m149919c(imageHeaderBytes, opd.f148444j);
        }

        /* JADX INFO: renamed from: o */
        public final boolean m168648o(byte[] imageHeaderBytes, int headerSize) {
            return headerSize >= opd.f148436b.length && kim.m149919c(imageHeaderBytes, opd.f148436b);
        }

        /* JADX INFO: renamed from: p */
        public final boolean m168649p(byte[] imageHeaderBytes, int headerSize) {
            return headerSize >= opd.f148438d.length && kim.m149919c(imageHeaderBytes, opd.f148438d);
        }

        public Companion() {
        }
    }
}
