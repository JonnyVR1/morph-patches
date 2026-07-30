package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m88121d2 = {"Ll/ppd;", "", "<init>", "()V", "Ll/him;", "imageFormat", "", "b", "(Ll/him;)Z", "a", "Ll/him;", "JPEG", "PNG", "c", "GIF", Constants.INAPP_DATA_TAG, "BMP", "e", "ICO", "f", "WEBP_SIMPLE", "g", "WEBP_LOSSLESS", "h", "WEBP_EXTENDED", RXScreenCaptureService.KEY_INDEX, "WEBP_EXTENDED_WITH_ALPHA", "j", "WEBP_ANIMATED", "k", "HEIF", BLiveStormDanmakuGiftResourceType.f45292l, "DNG", "", "m", "Ljava/util/List;", "defaultFormats", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class ppd {

    @NotNull
    public static final ppd INSTANCE = new ppd();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final him JPEG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final him PNG;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final him GIF;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final him BMP;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final him ICO;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final him WEBP_SIMPLE;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final him WEBP_LOSSLESS;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final him WEBP_EXTENDED;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final him WEBP_EXTENDED_WITH_ALPHA;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final him WEBP_ANIMATED;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final him HEIF;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final him DNG;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final List<him> defaultFormats;

    static {
        him himVar = new him("JPEG", "jpeg");
        JPEG = himVar;
        him himVar2 = new him("PNG", "png");
        PNG = himVar2;
        him himVar3 = new him("GIF", "gif");
        GIF = himVar3;
        him himVar4 = new him("BMP", "bmp");
        BMP = himVar4;
        him himVar5 = new him("ICO", Constants.NOTIF_ICON);
        ICO = himVar5;
        him himVar6 = new him("WEBP_SIMPLE", "webp");
        WEBP_SIMPLE = himVar6;
        him himVar7 = new him("WEBP_LOSSLESS", "webp");
        WEBP_LOSSLESS = himVar7;
        him himVar8 = new him("WEBP_EXTENDED", "webp");
        WEBP_EXTENDED = himVar8;
        him himVar9 = new him("WEBP_EXTENDED_WITH_ALPHA", "webp");
        WEBP_EXTENDED_WITH_ALPHA = himVar9;
        him himVar10 = new him("WEBP_ANIMATED", "webp");
        WEBP_ANIMATED = himVar10;
        him himVar11 = new him("HEIF", "heif");
        HEIF = himVar11;
        DNG = new him("DNG", "dng");
        defaultFormats = CollectionsKt.listOf((Object[]) new him[]{himVar, himVar2, himVar3, himVar4, himVar5, himVar6, himVar7, himVar8, himVar9, himVar10, himVar11});
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m173188a(@NotNull him imageFormat) {
        imageFormat.getClass();
        return imageFormat == WEBP_SIMPLE || imageFormat == WEBP_LOSSLESS || imageFormat == WEBP_EXTENDED || imageFormat == WEBP_EXTENDED_WITH_ALPHA;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m173189b(@NotNull him imageFormat) {
        imageFormat.getClass();
        return m173188a(imageFormat) || imageFormat == WEBP_ANIMATED;
    }
}
