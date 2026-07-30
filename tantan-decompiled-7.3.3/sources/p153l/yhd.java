package p153l;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001:\u0001QB\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010!\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010'\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010-\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u00102\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u0011\u00101R\u0017\u00108\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010>\u001a\u0004\u0018\u0001098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010C\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010F\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bE\u0010BR\u0019\u0010L\u001a\u0004\u0018\u00010G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010O\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P¨\u0006R"}, m88121d2 = {"Ll/yhd;", "Ll/o0f;", "Ll/yhd$a;", "builder", "<init>", "(Ll/yhd$a;)V", "other", "", "c", "(Ll/yhd;)Z", "", "hashCode", "()I", "Ll/i950$a;", "b", "()Ll/i950$a;", "Ll/q3d0;", Constants.INAPP_DATA_TAG, "Ll/q3d0;", "getResizeOptions", "()Ll/q3d0;", "resizeOptions", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "e", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "getDownsampleOverride", "()Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleOverride", "Ll/qmd0;", "f", "Ll/qmd0;", "getRotationOptions", "()Ll/qmd0;", "rotationOptions", "Ll/fm80;", "g", "Ll/fm80;", "getPostprocessor", "()Ll/fm80;", "postprocessor", "Ll/phm;", "h", "Ll/phm;", "getImageDecodeOptions", "()Ll/phm;", "imageDecodeOptions", "Ll/lnd0;", RXScreenCaptureService.KEY_INDEX, "Ll/lnd0;", "()Ll/lnd0;", "roundingOptions", "Ll/h1e0;", "j", "Ll/h1e0;", "getActualImageScaleType", "()Ll/h1e0;", "actualImageScaleType", "Landroid/graphics/PointF;", "k", "Landroid/graphics/PointF;", "getActualImageFocusPoint", "()Landroid/graphics/PointF;", "actualImageFocusPoint", BLiveStormDanmakuGiftResourceType.f45292l, "Z", "getMLocalThumbnailPreviewsEnabled", "()Z", "mLocalThumbnailPreviewsEnabled", "m", "getLoadThumbnailOnly", "loadThumbnailOnly", "Landroid/graphics/Bitmap$Config;", "n", "Landroid/graphics/Bitmap$Config;", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "bitmapConfig", "o", "Ljava/lang/Boolean;", "isProgressiveDecodingEnabled", "()Ljava/lang/Boolean;", "a", "options_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public class yhd extends o0f {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final q3d0 resizeOptions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final DownsampleMode downsampleOverride;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final qmd0 rotationOptions;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final fm80 postprocessor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final phm imageDecodeOptions;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final lnd0 roundingOptions;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final h1e0 actualImageScaleType;

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

    /* JADX INFO: renamed from: l.yhd$a */
    @Metadata(m88120d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010,\u001a\u0004\u0018\u00010%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00104\u001a\u0004\u0018\u00010-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010:\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u00106\u001a\u0004\b\u001e\u00107\"\u0004\b8\u00109R$\u0010@\u001a\u0004\u0018\u00010;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010<\u001a\u0004\b\u0016\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010J\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010C\u001a\u0004\bB\u0010E\"\u0004\bI\u0010GR$\u0010P\u001a\u0004\u0018\u00010K8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010L\u001a\u0004\b&\u0010M\"\u0004\bN\u0010OR$\u0010V\u001a\u0004\u0018\u00010A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bQ\u0010S\"\u0004\bT\u0010UR$\u0010X\u001a\u0004\u0018\u00010W8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\b.\u0010Z\"\u0004\b[\u0010\\¨\u0006]"}, m88121d2 = {"Ll/yhd$a;", p7f.GPS_DIRECTION_TRUE, "Ll/o0f$a;", "<init>", "()V", "Ll/q3d0;", Constants.INAPP_DATA_TAG, "Ll/q3d0;", "p", "()Ll/q3d0;", "setResizeOptions$options_release", "(Ll/q3d0;)V", "resizeOptions", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "e", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "j", "()Lcom/facebook/imagepipeline/core/DownsampleMode;", "setDownsampleOverride$options_release", "(Lcom/facebook/imagepipeline/core/DownsampleMode;)V", "downsampleOverride", "Ll/qmd0;", "f", "Ll/qmd0;", "q", "()Ll/qmd0;", "setRotationOptions$options_release", "(Ll/qmd0;)V", "rotationOptions", "Ll/fm80;", "g", "Ll/fm80;", "n", "()Ll/fm80;", "setPostprocessor$options_release", "(Ll/fm80;)V", "postprocessor", "Ll/phm;", "h", "Ll/phm;", "k", "()Ll/phm;", "setImageDecodeOptions$options_release", "(Ll/phm;)V", "imageDecodeOptions", "Ll/lnd0;", RXScreenCaptureService.KEY_INDEX, "Ll/lnd0;", "r", "()Ll/lnd0;", "setRoundingOptions$options_release", "(Ll/lnd0;)V", "roundingOptions", "Ll/h1e0;", "Ll/h1e0;", "()Ll/h1e0;", "setActualImageScaleType$options_release", "(Ll/h1e0;)V", "actualImageScaleType", "Landroid/graphics/PointF;", "Landroid/graphics/PointF;", "()Landroid/graphics/PointF;", "setActualFocusPoint$options_release", "(Landroid/graphics/PointF;)V", "actualFocusPoint", "", BLiveStormDanmakuGiftResourceType.f45292l, "Z", "m", "()Z", "setLocalThumbnailPreviewsEnabled$options_release", "(Z)V", "localThumbnailPreviewsEnabled", "setLoadThumbnailOnly$options_release", "loadThumbnailOnly", "Landroid/graphics/Bitmap$Config;", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "setBitmapConfig$options_release", "(Landroid/graphics/Bitmap$Config;)V", "bitmapConfig", "o", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setProgressiveDecodingEnabled$options_release", "(Ljava/lang/Boolean;)V", "progressiveDecodingEnabled", "Ll/wa3;", "borderOptions", "Ll/wa3;", "()Ll/wa3;", "setBorderOptions$options_release", "(Ll/wa3;)V", "options_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static class C21600a<T extends C21600a<T>> extends o0f.C19002a<T> {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public q3d0 resizeOptions;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public DownsampleMode downsampleOverride;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public qmd0 rotationOptions;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public fm80 postprocessor;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public phm imageDecodeOptions;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public lnd0 roundingOptions;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        public h1e0 actualImageScaleType;

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

        public C21600a() {
            h1e0 h1e0Var = h1e0.f107452i;
            h1e0Var.getClass();
            this.actualImageScaleType = h1e0Var;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final PointF getActualFocusPoint() {
            return this.actualFocusPoint;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final h1e0 getActualImageScaleType() {
            return this.actualImageScaleType;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final Bitmap.Config getBitmapConfig() {
            return this.bitmapConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: i */
        public final wa3 m215949i() {
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final DownsampleMode getDownsampleOverride() {
            return this.downsampleOverride;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final phm getImageDecodeOptions() {
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
        public final fm80 getPostprocessor() {
            return this.postprocessor;
        }

        @Nullable
        /* JADX INFO: renamed from: o, reason: from getter */
        public final Boolean getProgressiveDecodingEnabled() {
            return this.progressiveDecodingEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: p, reason: from getter */
        public final q3d0 getResizeOptions() {
            return this.resizeOptions;
        }

        @Nullable
        /* JADX INFO: renamed from: q, reason: from getter */
        public final qmd0 getRotationOptions() {
            return this.rotationOptions;
        }

        @Nullable
        /* JADX INFO: renamed from: r, reason: from getter */
        public final lnd0 getRoundingOptions() {
            return this.roundingOptions;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhd(@NotNull C21600a<?> c21600a) {
        super(c21600a);
        c21600a.getClass();
        this.resizeOptions = c21600a.getResizeOptions();
        this.downsampleOverride = c21600a.getDownsampleOverride();
        this.rotationOptions = c21600a.getRotationOptions();
        this.postprocessor = c21600a.getPostprocessor();
        this.imageDecodeOptions = c21600a.getImageDecodeOptions();
        this.roundingOptions = c21600a.getRoundingOptions();
        c21600a.m215949i();
        this.actualImageScaleType = c21600a.getActualImageScaleType();
        this.actualImageFocusPoint = c21600a.getActualFocusPoint();
        this.mLocalThumbnailPreviewsEnabled = c21600a.getLocalThumbnailPreviewsEnabled();
        this.loadThumbnailOnly = c21600a.getLoadThumbnailOnly();
        this.bitmapConfig = c21600a.getBitmapConfig();
        this.isProgressiveDecodingEnabled = c21600a.getProgressiveDecodingEnabled();
    }

    @Override // p153l.o0f
    @NotNull
    /* JADX INFO: renamed from: b */
    public i950.C17670a mo116112b() {
        i950.C17670a c17670aM139077b = super.mo116112b().m139077b("resizeOptions", this.resizeOptions).m139077b("downsampleOverride", this.downsampleOverride).m139077b("rotationOptions", this.rotationOptions).m139077b("postprocessor", this.postprocessor).m139077b("imageDecodeOptions", this.imageDecodeOptions).m139077b("roundingOptions", this.roundingOptions).m139077b("borderOptions", null).m139077b("actualImageScaleType", this.actualImageScaleType).m139077b("actualImageFocusPoint", this.actualImageFocusPoint).m139078c("localThumbnailPreviewsEnabled", this.mLocalThumbnailPreviewsEnabled).m139078c("loadThumbnailOnly", this.loadThumbnailOnly).m139077b("bitmapConfig", this.bitmapConfig).m139077b("progressiveRenderingEnabled", this.isProgressiveDecodingEnabled);
        c17670aM139077b.getClass();
        return c17670aM139077b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m215944c(@NotNull yhd other) {
        other.getClass();
        if (i950.m139074a(this.resizeOptions, other.resizeOptions) && i950.m139074a(this.downsampleOverride, other.downsampleOverride) && i950.m139074a(this.rotationOptions, other.rotationOptions) && i950.m139074a(this.postprocessor, other.postprocessor) && i950.m139074a(this.imageDecodeOptions, other.imageDecodeOptions) && i950.m139074a(this.roundingOptions, other.roundingOptions) && i950.m139074a(null, null) && i950.m139074a(this.actualImageScaleType, other.actualImageScaleType) && i950.m139074a(this.actualImageFocusPoint, other.actualImageFocusPoint) && this.mLocalThumbnailPreviewsEnabled == other.mLocalThumbnailPreviewsEnabled && this.loadThumbnailOnly == other.loadThumbnailOnly && this.isProgressiveDecodingEnabled == other.isProgressiveDecodingEnabled && i950.m139074a(this.bitmapConfig, other.bitmapConfig)) {
            return m165476a(other);
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final lnd0 getRoundingOptions() {
        return this.roundingOptions;
    }

    @Override // p153l.o0f
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        q3d0 q3d0Var = this.resizeOptions;
        int iHashCode2 = (iHashCode + (q3d0Var != null ? q3d0Var.hashCode() : 0)) * 31;
        DownsampleMode downsampleMode = this.downsampleOverride;
        int iHashCode3 = (iHashCode2 + (downsampleMode != null ? downsampleMode.hashCode() : 0)) * 31;
        qmd0 qmd0Var = this.rotationOptions;
        int iHashCode4 = (iHashCode3 + (qmd0Var != null ? qmd0Var.hashCode() : 0)) * 31;
        fm80 fm80Var = this.postprocessor;
        int iHashCode5 = (iHashCode4 + (fm80Var != null ? fm80Var.hashCode() : 0)) * 31;
        phm phmVar = this.imageDecodeOptions;
        int iHashCode6 = (iHashCode5 + (phmVar != null ? phmVar.hashCode() : 0)) * 31;
        lnd0 lnd0Var = this.roundingOptions;
        int iHashCode7 = (((iHashCode6 + (lnd0Var != null ? lnd0Var.hashCode() : 0)) * 961) + this.actualImageScaleType.hashCode()) * 31;
        PointF pointF = this.actualImageFocusPoint;
        int iHashCode8 = (((((iHashCode7 + (pointF != null ? pointF.hashCode() : 0)) * 31) + (this.mLocalThumbnailPreviewsEnabled ? 1 : 0)) * 31) + (this.loadThumbnailOnly ? 1 : 0)) * 31;
        Bitmap.Config config = this.bitmapConfig;
        int iHashCode9 = (iHashCode8 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.isProgressiveDecodingEnabled;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }
}
