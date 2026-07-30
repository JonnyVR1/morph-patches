package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m87232d2 = {"Ll/kod;", "", "<init>", "()V", "Ll/egm;", "imageFormat", "", "b", "(Ll/egm;)Z", "a", "Ll/egm;", "JPEG", "PNG", "c", "GIF", Constants.INAPP_DATA_TAG, "BMP", "e", "ICO", "f", "WEBP_SIMPLE", "g", "WEBP_LOSSLESS", "h", "WEBP_EXTENDED", RXScreenCaptureService.KEY_INDEX, "WEBP_EXTENDED_WITH_ALPHA", "j", "WEBP_ANIMATED", "k", "HEIF", BLiveStormDanmakuGiftResourceType.f44444l, "DNG", "", "m", "Ljava/util/List;", "defaultFormats", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class kod {

    @NotNull
    public static final kod INSTANCE = new kod();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final egm JPEG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final egm PNG;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final egm GIF;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final egm BMP;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final egm ICO;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final egm WEBP_SIMPLE;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final egm WEBP_LOSSLESS;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final egm WEBP_EXTENDED;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final egm WEBP_EXTENDED_WITH_ALPHA;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final egm WEBP_ANIMATED;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final egm HEIF;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final egm DNG;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final List<egm> defaultFormats;

    static {
        egm egmVar = new egm("JPEG", "jpeg");
        JPEG = egmVar;
        egm egmVar2 = new egm("PNG", "png");
        PNG = egmVar2;
        egm egmVar3 = new egm("GIF", "gif");
        GIF = egmVar3;
        egm egmVar4 = new egm("BMP", "bmp");
        BMP = egmVar4;
        egm egmVar5 = new egm("ICO", Constants.NOTIF_ICON);
        ICO = egmVar5;
        egm egmVar6 = new egm("WEBP_SIMPLE", "webp");
        WEBP_SIMPLE = egmVar6;
        egm egmVar7 = new egm("WEBP_LOSSLESS", "webp");
        WEBP_LOSSLESS = egmVar7;
        egm egmVar8 = new egm("WEBP_EXTENDED", "webp");
        WEBP_EXTENDED = egmVar8;
        egm egmVar9 = new egm("WEBP_EXTENDED_WITH_ALPHA", "webp");
        WEBP_EXTENDED_WITH_ALPHA = egmVar9;
        egm egmVar10 = new egm("WEBP_ANIMATED", "webp");
        WEBP_ANIMATED = egmVar10;
        egm egmVar11 = new egm("HEIF", "heif");
        HEIF = egmVar11;
        DNG = new egm("DNG", "dng");
        defaultFormats = CollectionsKt.listOf((Object[]) new egm[]{egmVar, egmVar2, egmVar3, egmVar4, egmVar5, egmVar6, egmVar7, egmVar8, egmVar9, egmVar10, egmVar11});
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m146694a(@NotNull egm imageFormat) {
        imageFormat.getClass();
        return imageFormat == WEBP_SIMPLE || imageFormat == WEBP_LOSSLESS || imageFormat == WEBP_EXTENDED || imageFormat == WEBP_EXTENDED_WITH_ALPHA;
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m146695b(@NotNull egm imageFormat) {
        imageFormat.getClass();
        return m146694a(imageFormat) || imageFormat == WEBP_ANIMATED;
    }
}
