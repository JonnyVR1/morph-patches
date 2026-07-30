package p149l;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001:\u0001QB\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010!\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010'\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010-\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u00102\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u0011\u00101R\u0017\u00108\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010>\u001a\u0004\u0018\u0001098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010C\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010F\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bE\u0010BR\u0019\u0010L\u001a\u0004\u0018\u00010G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010O\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P¨\u0006R"}, m87232d2 = {"Ll/sgd;", "Ll/kze;", "Ll/sgd$a;", "builder", "<init>", "(Ll/sgd$a;)V", "other", "", "c", "(Ll/sgd;)Z", "", "hashCode", "()I", "Ll/t050$a;", "b", "()Ll/t050$a;", "Ll/nvc0;", Constants.INAPP_DATA_TAG, "Ll/nvc0;", "getResizeOptions", "()Ll/nvc0;", "resizeOptions", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "e", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "getDownsampleOverride", "()Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleOverride", "Ll/oed0;", "f", "Ll/oed0;", "getRotationOptions", "()Ll/oed0;", "rotationOptions", "Ll/yd80;", "g", "Ll/yd80;", "getPostprocessor", "()Ll/yd80;", "postprocessor", "Ll/zem;", "h", "Ll/zem;", "getImageDecodeOptions", "()Ll/zem;", "imageDecodeOptions", "Ll/ifd0;", RXScreenCaptureService.KEY_INDEX, "Ll/ifd0;", "()Ll/ifd0;", "roundingOptions", "Ll/ftd0;", "j", "Ll/ftd0;", "getActualImageScaleType", "()Ll/ftd0;", "actualImageScaleType", "Landroid/graphics/PointF;", "k", "Landroid/graphics/PointF;", "getActualImageFocusPoint", "()Landroid/graphics/PointF;", "actualImageFocusPoint", BLiveStormDanmakuGiftResourceType.f44444l, "Z", "getMLocalThumbnailPreviewsEnabled", "()Z", "mLocalThumbnailPreviewsEnabled", "m", "getLoadThumbnailOnly", "loadThumbnailOnly", "Landroid/graphics/Bitmap$Config;", "n", "Landroid/graphics/Bitmap$Config;", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "bitmapConfig", "o", "Ljava/lang/Boolean;", "isProgressiveDecodingEnabled", "()Ljava/lang/Boolean;", "a", "options_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public class sgd extends kze {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final nvc0 resizeOptions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final DownsampleMode downsampleOverride;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final oed0 rotationOptions;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final yd80 postprocessor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final zem imageDecodeOptions;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final ifd0 roundingOptions;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final ftd0 actualImageScaleType;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final PointF actualImageFocusPoint;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final boolean mLocalThumbnailPreviewsEnabled;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final boolean loadThumbnailOnly;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public final Boolean isProgressiveDecodingEnabled;

    /* JADX INFO: renamed from: l.sgd$a */
    @Metadata(m87231d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010,\u001a\u0004\u0018\u00010%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00104\u001a\u0004\u0018\u00010-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010:\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u00106\u001a\u0004\b\u001e\u00107\"\u0004\b8\u00109R$\u0010@\u001a\u0004\u0018\u00010;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010<\u001a\u0004\b\u0016\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010J\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010C\u001a\u0004\bB\u0010E\"\u0004\bI\u0010GR$\u0010P\u001a\u0004\u0018\u00010K8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010L\u001a\u0004\b&\u0010M\"\u0004\bN\u0010OR$\u0010V\u001a\u0004\u0018\u00010A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bQ\u0010S\"\u0004\bT\u0010UR$\u0010X\u001a\u0004\u0018\u00010W8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\b.\u0010Z\"\u0004\b[\u0010\\¨\u0006]"}, m87232d2 = {"Ll/sgd$a;", j6f.GPS_DIRECTION_TRUE, "Ll/kze$a;", "<init>", "()V", "Ll/nvc0;", Constants.INAPP_DATA_TAG, "Ll/nvc0;", "p", "()Ll/nvc0;", "setResizeOptions$options_release", "(Ll/nvc0;)V", "resizeOptions", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "e", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "j", "()Lcom/facebook/imagepipeline/core/DownsampleMode;", "setDownsampleOverride$options_release", "(Lcom/facebook/imagepipeline/core/DownsampleMode;)V", "downsampleOverride", "Ll/oed0;", "f", "Ll/oed0;", "q", "()Ll/oed0;", "setRotationOptions$options_release", "(Ll/oed0;)V", "rotationOptions", "Ll/yd80;", "g", "Ll/yd80;", "n", "()Ll/yd80;", "setPostprocessor$options_release", "(Ll/yd80;)V", "postprocessor", "Ll/zem;", "h", "Ll/zem;", "k", "()Ll/zem;", "setImageDecodeOptions$options_release", "(Ll/zem;)V", "imageDecodeOptions", "Ll/ifd0;", RXScreenCaptureService.KEY_INDEX, "Ll/ifd0;", "r", "()Ll/ifd0;", "setRoundingOptions$options_release", "(Ll/ifd0;)V", "roundingOptions", "Ll/ftd0;", "Ll/ftd0;", "()Ll/ftd0;", "setActualImageScaleType$options_release", "(Ll/ftd0;)V", "actualImageScaleType", "Landroid/graphics/PointF;", "Landroid/graphics/PointF;", "()Landroid/graphics/PointF;", "setActualFocusPoint$options_release", "(Landroid/graphics/PointF;)V", "actualFocusPoint", "", BLiveStormDanmakuGiftResourceType.f44444l, "Z", "m", "()Z", "setLocalThumbnailPreviewsEnabled$options_release", "(Z)V", "localThumbnailPreviewsEnabled", "setLoadThumbnailOnly$options_release", "loadThumbnailOnly", "Landroid/graphics/Bitmap$Config;", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "setBitmapConfig$options_release", "(Landroid/graphics/Bitmap$Config;)V", "bitmapConfig", "o", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setProgressiveDecodingEnabled$options_release", "(Ljava/lang/Boolean;)V", "progressiveDecodingEnabled", "Ll/ha3;", "borderOptions", "Ll/ha3;", "()Ll/ha3;", "setBorderOptions$options_release", "(Ll/ha3;)V", "options_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static class C19940a<T extends C19940a<T>> extends kze.C18118a<T> {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public nvc0 resizeOptions;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public DownsampleMode downsampleOverride;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public oed0 rotationOptions;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public yd80 postprocessor;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public zem imageDecodeOptions;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public ifd0 roundingOptions;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        public ftd0 actualImageScaleType;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public PointF actualFocusPoint;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        public boolean localThumbnailPreviewsEnabled;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public boolean loadThumbnailOnly;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @Nullable
        public Bitmap.Config bitmapConfig;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @Nullable
        public Boolean progressiveDecodingEnabled;

        public C19940a() {
            ftd0 ftd0Var = ftd0.f99185i;
            ftd0Var.getClass();
            this.actualImageScaleType = ftd0Var;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final PointF getActualFocusPoint() {
            return this.actualFocusPoint;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final ftd0 getActualImageScaleType() {
            return this.actualImageScaleType;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final Bitmap.Config getBitmapConfig() {
            return this.bitmapConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: i */
        public final ha3 m184039i() {
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final DownsampleMode getDownsampleOverride() {
            return this.downsampleOverride;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final zem getImageDecodeOptions() {
            return this.imageDecodeOptions;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getLoadThumbnailOnly() {
            return this.loadThumbnailOnly;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getLocalThumbnailPreviewsEnabled() {
            return this.localThumbnailPreviewsEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public final yd80 getPostprocessor() {
            return this.postprocessor;
        }

        @Nullable
        /* JADX INFO: renamed from: o, reason: from getter */
        public final Boolean getProgressiveDecodingEnabled() {
            return this.progressiveDecodingEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: p, reason: from getter */
        public final nvc0 getResizeOptions() {
            return this.resizeOptions;
        }

        @Nullable
        /* JADX INFO: renamed from: q, reason: from getter */
        public final oed0 getRotationOptions() {
            return this.rotationOptions;
        }

        @Nullable
        /* JADX INFO: renamed from: r, reason: from getter */
        public final ifd0 getRoundingOptions() {
            return this.roundingOptions;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgd(@NotNull C19940a<?> c19940a) {
        super(c19940a);
        c19940a.getClass();
        this.resizeOptions = c19940a.getResizeOptions();
        this.downsampleOverride = c19940a.getDownsampleOverride();
        this.rotationOptions = c19940a.getRotationOptions();
        this.postprocessor = c19940a.getPostprocessor();
        this.imageDecodeOptions = c19940a.getImageDecodeOptions();
        this.roundingOptions = c19940a.getRoundingOptions();
        c19940a.m184039i();
        this.actualImageScaleType = c19940a.getActualImageScaleType();
        this.actualImageFocusPoint = c19940a.getActualFocusPoint();
        this.mLocalThumbnailPreviewsEnabled = c19940a.getLocalThumbnailPreviewsEnabled();
        this.loadThumbnailOnly = c19940a.getLoadThumbnailOnly();
        this.bitmapConfig = c19940a.getBitmapConfig();
        this.isProgressiveDecodingEnabled = c19940a.getProgressiveDecodingEnabled();
    }

    @Override // p149l.kze
    @NotNull
    /* JADX INFO: renamed from: b */
    public t050.C20089a mo96512b() {
        t050.C20089a c20089aM186817b = super.mo96512b().m186817b("resizeOptions", this.resizeOptions).m186817b("downsampleOverride", this.downsampleOverride).m186817b("rotationOptions", this.rotationOptions).m186817b("postprocessor", this.postprocessor).m186817b("imageDecodeOptions", this.imageDecodeOptions).m186817b("roundingOptions", this.roundingOptions).m186817b("borderOptions", null).m186817b("actualImageScaleType", this.actualImageScaleType).m186817b("actualImageFocusPoint", this.actualImageFocusPoint).m186818c("localThumbnailPreviewsEnabled", this.mLocalThumbnailPreviewsEnabled).m186818c("loadThumbnailOnly", this.loadThumbnailOnly).m186817b("bitmapConfig", this.bitmapConfig).m186817b("progressiveRenderingEnabled", this.isProgressiveDecodingEnabled);
        c20089aM186817b.getClass();
        return c20089aM186817b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m184034c(@NotNull sgd other) {
        other.getClass();
        if (t050.m186814a(this.resizeOptions, other.resizeOptions) && t050.m186814a(this.downsampleOverride, other.downsampleOverride) && t050.m186814a(this.rotationOptions, other.rotationOptions) && t050.m186814a(this.postprocessor, other.postprocessor) && t050.m186814a(this.imageDecodeOptions, other.imageDecodeOptions) && t050.m186814a(this.roundingOptions, other.roundingOptions) && t050.m186814a(null, null) && t050.m186814a(this.actualImageScaleType, other.actualImageScaleType) && t050.m186814a(this.actualImageFocusPoint, other.actualImageFocusPoint) && this.mLocalThumbnailPreviewsEnabled == other.mLocalThumbnailPreviewsEnabled && this.loadThumbnailOnly == other.loadThumbnailOnly && this.isProgressiveDecodingEnabled == other.isProgressiveDecodingEnabled && t050.m186814a(this.bitmapConfig, other.bitmapConfig)) {
            return m147937a(other);
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ifd0 getRoundingOptions() {
        return this.roundingOptions;
    }

    @Override // p149l.kze
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        nvc0 nvc0Var = this.resizeOptions;
        int iHashCode2 = (iHashCode + (nvc0Var != null ? nvc0Var.hashCode() : 0)) * 31;
        DownsampleMode downsampleMode = this.downsampleOverride;
        int iHashCode3 = (iHashCode2 + (downsampleMode != null ? downsampleMode.hashCode() : 0)) * 31;
        oed0 oed0Var = this.rotationOptions;
        int iHashCode4 = (iHashCode3 + (oed0Var != null ? oed0Var.hashCode() : 0)) * 31;
        yd80 yd80Var = this.postprocessor;
        int iHashCode5 = (iHashCode4 + (yd80Var != null ? yd80Var.hashCode() : 0)) * 31;
        zem zemVar = this.imageDecodeOptions;
        int iHashCode6 = (iHashCode5 + (zemVar != null ? zemVar.hashCode() : 0)) * 31;
        ifd0 ifd0Var = this.roundingOptions;
        int iHashCode7 = (((iHashCode6 + (ifd0Var != null ? ifd0Var.hashCode() : 0)) * 961) + this.actualImageScaleType.hashCode()) * 31;
        PointF pointF = this.actualImageFocusPoint;
        int iHashCode8 = (((((iHashCode7 + (pointF != null ? pointF.hashCode() : 0)) * 31) + (this.mLocalThumbnailPreviewsEnabled ? 1 : 0)) * 31) + (this.loadThumbnailOnly ? 1 : 0)) * 31;
        Bitmap.Config config = this.bitmapConfig;
        int iHashCode9 = (iHashCode8 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.isProgressiveDecodingEnabled;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }
}
