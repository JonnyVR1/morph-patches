package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.fresco.p028ui.common.ImageRenderingInfra;
import com.facebook.fresco.p028ui.common.VisibilityState;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bn\u0018\u0000 \u009a\u00012\u00020\u0001:\u00016Bý\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010*\u001a\u0004\u0018\u00010\n\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\u0018\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0-0,\u0012\u0006\u0010/\u001a\u00020\u0013\u0012\b\u00100\u001a\u0004\u0018\u00010\u0004\u0012\b\u00101\u001a\u0004\u0018\u00010\u0004\u0012\b\u00102\u001a\u0004\u0018\u00010\u0015\u0012\b\u00103\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bG\u0010CR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bM\u0010KR\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bO\u0010KR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bP\u0010I\u001a\u0004\bQ\u0010KR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bR\u0010I\u001a\u0004\bS\u0010KR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bT\u0010I\u001a\u0004\bU\u0010KR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bZ\u0010W\u001a\u0004\b[\u0010YR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b\u0014\u0010^R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0017\u0010\u0017\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bc\u0010`\u001a\u0004\bd\u0010bR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0017\u0010\u001c\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bm\u0010I\u001a\u0004\bn\u0010KR\u0017\u0010\u001d\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bo\u0010I\u001a\u0004\bp\u0010KR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bu\u0010;\u001a\u0004\bv\u0010=R\u0019\u0010#\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bw\u0010;\u001a\u0004\bx\u0010=R\u001f\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u0019\u0010&\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b}\u0010;\u001a\u0004\b~\u0010=R\u001a\u0010'\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b\u007f\u0010;\u001a\u0005\b\u0080\u0001\u0010=R\u001b\u0010(\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010;\u001a\u0005\b\u0082\u0001\u0010=R\u001b\u0010)\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010;\u001a\u0005\b\u0084\u0001\u0010=R\u001b\u0010*\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010W\u001a\u0005\b\u0086\u0001\u0010YR\u001b\u0010+\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010;\u001a\u0005\b\u0088\u0001\u0010=R-\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0-0,8\u0006¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010/\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010]\u001a\u0005\b\u008e\u0001\u0010^R\u001b\u00100\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010;\u001a\u0005\b\u0090\u0001\u0010=R\u001a\u00101\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b`\u0010;\u001a\u0005\b\u0091\u0001\u0010=R\u001c\u00102\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u000f\n\u0005\bI\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001d\u00103\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0092\u0001\u001a\u0006\b\u0096\u0001\u0010\u0094\u0001R\u001a\u0010\u0099\u0001\u001a\u00020\u00158\u0006¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010`\u001a\u0005\b\u0098\u0001\u0010b¨\u0006\u009b\u0001"}, m88121d2 = {"Ll/fjm;", "", "Lcom/facebook/fresco/ui/common/ImageRenderingInfra;", "infra", "", "controllerId", "requestId", "imageRequest", "callerContext", "imageInfo", "", "controllerSubmitTimeMs", "intermediateImageLoadTimeMs", "controllerFinalImageSetTimeMs", "controllerFailureTimeMs", "imageRequestStartTimeMs", "imageRequestEndTimeMs", "emptyEventTimestampNs", "releasedEventTimestampNs", "", "isPrefetch", "", "onScreenWidthPx", "onScreenHeightPx", "", "errorThrowable", "Lcom/facebook/fresco/ui/common/VisibilityState;", "visibilityState", "visibilityEventTimeMs", "invisibilityEventTimeMs", "Ll/v2e;", "dimensionsInfo", "Ll/u36$a;", "extraData", "callingClassNameOnVisible", "rootContextNameOnVisible", "", "contextChainArrayOnVisible", "contextChainExtrasOnVisible", "contentIdOnVisible", "surfaceOnVisible", "subSurfaceOnVisible", "msSinceLastNavigationOnVisible", "startupStatusOnVisible", "", "Lkotlin/Pair;", "intermediateImageSetTimes", "newIntermediateImageSetPointAvailable", "errorMessageOnFailure", "errorStacktraceStringOnFailure", "errorCodeOnFailure", "densityDpiOnSuccess", "<init>", "(Lcom/facebook/fresco/ui/common/ImageRenderingInfra;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJJJJJLjava/lang/Long;Ljava/lang/Long;ZIILjava/lang/Throwable;Lcom/facebook/fresco/ui/common/VisibilityState;JJLl/v2e;Ll/u36$a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Lcom/facebook/fresco/ui/common/ImageRenderingInfra;", "getInfra", "()Lcom/facebook/fresco/ui/common/ImageRenderingInfra;", "b", "Ljava/lang/String;", "getControllerId", "()Ljava/lang/String;", "c", "getRequestId", Constants.INAPP_DATA_TAG, "Ljava/lang/Object;", "getImageRequest", "()Ljava/lang/Object;", "e", "getCallerContext", "f", "getImageInfo", "g", "J", "getControllerSubmitTimeMs", "()J", "h", "getIntermediateImageLoadTimeMs", RXScreenCaptureService.KEY_INDEX, "getControllerFinalImageSetTimeMs", "j", "getControllerFailureTimeMs", "k", "getImageRequestStartTimeMs", BLiveStormDanmakuGiftResourceType.f45292l, "getImageRequestEndTimeMs", "m", "Ljava/lang/Long;", "getEmptyEventTimestampNs", "()Ljava/lang/Long;", "n", "getReleasedEventTimestampNs", "o", "Z", "()Z", "p", "I", "getOnScreenWidthPx", "()I", "q", "getOnScreenHeightPx", "r", "Ljava/lang/Throwable;", "getErrorThrowable", "()Ljava/lang/Throwable;", BLiveStormDanmakuGiftResourceType.f45294s, "Lcom/facebook/fresco/ui/common/VisibilityState;", "getVisibilityState", "()Lcom/facebook/fresco/ui/common/VisibilityState;", Constants.KEY_T, "getVisibilityEventTimeMs", "u", "getInvisibilityEventTimeMs", ResourceDirection.f39656v, "Ll/u36$a;", "getExtraData", "()Ll/u36$a;", "w", "getCallingClassNameOnVisible", BaseSei.f14624X, "getRootContextNameOnVisible", BaseSei.f14625Y, "[Ljava/lang/String;", "getContextChainArrayOnVisible", "()[Ljava/lang/String;", BaseSei.f14626Z, "getContextChainExtrasOnVisible", "A", "getContentIdOnVisible", "B", "getSurfaceOnVisible", c4s.C_ZONE, "getSubSurfaceOnVisible", "D", "getMsSinceLastNavigationOnVisible", "E", "getStartupStatusOnVisible", "F", "Ljava/util/List;", "getIntermediateImageSetTimes", "()Ljava/util/List;", "G", "getNewIntermediateImageSetPointAvailable", "H", "getErrorMessageOnFailure", "getErrorStacktraceStringOnFailure", "Ljava/lang/Integer;", "getErrorCodeOnFailure", "()Ljava/lang/Integer;", "K", "getDensityDpiOnSuccess", "L", "getInstanceId", "instanceId", "Companion", "ui-common_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class fjm {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public final String contentIdOnVisible;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public final String surfaceOnVisible;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public final String subSurfaceOnVisible;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public final Long msSinceLastNavigationOnVisible;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public final String startupStatusOnVisible;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final List<Pair<String, Long>> intermediateImageSetTimes;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final boolean newIntermediateImageSetPointAvailable;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    public final String errorMessageOnFailure;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public final String errorStacktraceStringOnFailure;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    public final Integer errorCodeOnFailure;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @Nullable
    public final Integer densityDpiOnSuccess;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final int instanceId;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ImageRenderingInfra infra;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String controllerId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String requestId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Object imageRequest;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final Object callerContext;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final Object imageInfo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final long controllerSubmitTimeMs;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final long intermediateImageLoadTimeMs;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final long controllerFinalImageSetTimeMs;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final long controllerFailureTimeMs;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final long imageRequestStartTimeMs;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final long imageRequestEndTimeMs;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final Long emptyEventTimestampNs;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public final Long releasedEventTimestampNs;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final boolean isPrefetch;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final int onScreenWidthPx;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final int onScreenHeightPx;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public final Throwable errorThrowable;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final VisibilityState visibilityState;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final long visibilityEventTimeMs;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final long invisibilityEventTimeMs;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public final u36.C20477a extraData;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public final String callingClassNameOnVisible;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public final String rootContextNameOnVisible;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public final String[] contextChainArrayOnVisible;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public final String contextChainExtrasOnVisible;

    public fjm(@NotNull ImageRenderingInfra imageRenderingInfra, @Nullable String str, @Nullable String str2, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, long j, long j2, long j3, long j4, long j5, long j6, @Nullable Long l2, @Nullable Long l3, boolean z, int i, int i2, @Nullable Throwable th, @NotNull VisibilityState visibilityState, long j7, long j8, @Nullable v2e v2eVar, @Nullable u36.C20477a c20477a, @Nullable String str3, @Nullable String str4, @Nullable String[] strArr, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Long l4, @Nullable String str9, @NotNull List<Pair<String, Long>> list, boolean z2, @Nullable String str10, @Nullable String str11, @Nullable Integer num, @Nullable Integer num2) {
        imageRenderingInfra.getClass();
        visibilityState.getClass();
        list.getClass();
        this.infra = imageRenderingInfra;
        this.controllerId = str;
        this.requestId = str2;
        this.imageRequest = obj;
        this.callerContext = obj2;
        this.imageInfo = obj3;
        this.controllerSubmitTimeMs = j;
        this.intermediateImageLoadTimeMs = j2;
        this.controllerFinalImageSetTimeMs = j3;
        this.controllerFailureTimeMs = j4;
        this.imageRequestStartTimeMs = j5;
        this.imageRequestEndTimeMs = j6;
        this.emptyEventTimestampNs = l2;
        this.releasedEventTimestampNs = l3;
        this.isPrefetch = z;
        this.onScreenWidthPx = i;
        this.onScreenHeightPx = i2;
        this.errorThrowable = th;
        this.visibilityState = visibilityState;
        this.visibilityEventTimeMs = j7;
        this.invisibilityEventTimeMs = j8;
        this.extraData = c20477a;
        this.callingClassNameOnVisible = str3;
        this.rootContextNameOnVisible = str4;
        this.contextChainArrayOnVisible = strArr;
        this.contextChainExtrasOnVisible = str5;
        this.contentIdOnVisible = str6;
        this.surfaceOnVisible = str7;
        this.subSurfaceOnVisible = str8;
        this.msSinceLastNavigationOnVisible = l4;
        this.startupStatusOnVisible = str9;
        this.intermediateImageSetTimes = list;
        this.newIntermediateImageSetPointAvailable = z2;
        this.errorMessageOnFailure = str10;
        this.errorStacktraceStringOnFailure = str11;
        this.errorCodeOnFailure = num;
        this.densityDpiOnSuccess = num2;
        this.instanceId = str != null ? str.hashCode() : 0;
    }
}
