package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.fresco.p027ui.common.ImageLoadStatus;
import com.facebook.fresco.p027ui.common.ImageRenderingInfra;
import com.facebook.fresco.p027ui.common.VisibilityState;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u0017J\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u0017J\u0015\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010\u0017J\u0015\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0004\b!\u0010\u0017J\u0015\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u0017J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b)\u0010\u0013J\u0015\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020*¢\u0006\u0004\b/\u0010-J\u0017\u00102\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u00020$¢\u0006\u0004\b5\u0010'J\r\u00107\u001a\u000206¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR$\u0010F\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010A\u001a\u0004\bC\u0010D\"\u0004\bE\u0010\u0013R\u0018\u0010(\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010AR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010!R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010!R\u0016\u0010\u001a\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0016\u0010\u001c\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0016\u0010\u001e\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010!R\u0016\u0010 \u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0016\u0010H\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010GR\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010\u0012R\u0016\u0010.\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010\u0012R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010IR\"\u0010P\u001a\u00020J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bK\u0010OR\u0016\u0010S\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010RR\"\u0010W\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010!\u001a\u0004\bT\u0010U\"\u0004\bV\u0010\u0017R\u0016\u0010\"\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0018\u0010Y\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010X¨\u0006Z"}, m87232d2 = {"Ll/ihm;", "Ll/ehm;", "Lcom/facebook/fresco/ui/common/ImageRenderingInfra;", "infra", "<init>", "(Lcom/facebook/fresco/ui/common/ImageRenderingInfra;)V", "", "w", "()V", BaseSei.f13930X, "", "controllerId", "B", "(Ljava/lang/String;)V", "requestId", "P", "", "imageRequest", "I", "(Ljava/lang/Object;)V", "", "controllerSubmitTimeMs", "D", "(J)V", "controllerIntermediateImageSetTimeMs", b2s.C_ZONE, "controllerFinalImageSetTimeMs", "A", "controllerFailureTimeMs", BaseSei.f13932Z, "imageRequestStartTimeMs", "K", "imageRequestEndTimeMs", "J", "invisibilityEventTimeMs", "L", "", "prefetch", BloodType.f38728O, "(Z)V", "imageInfo", "G", "", "onScreenWidthPx", "N", "(I)V", "onScreenHeightPx", "M", "", "errorThrowable", "E", "(Ljava/lang/Throwable;)V", "visible", "R", "Ll/chm;", j6f.LATITUDE_SOUTH, "()Ll/chm;", "Ll/p26$a;", "extraData", "F", "(Ll/p26$a;)V", BLiveStormDanmakuGiftResourceType.f44446s, "Ljava/lang/String;", Constants.KEY_T, "u", "Ljava/lang/Object;", ResourceDirection.f38808v, "getCallerContext", "()Ljava/lang/Object;", BaseSei.f13931Y, "callerContext", "Z", "isPrefetch", "Ljava/lang/Throwable;", "Lcom/facebook/fresco/ui/common/ImageLoadStatus;", "H", "Lcom/facebook/fresco/ui/common/ImageLoadStatus;", "getImageLoadStatus", "()Lcom/facebook/fresco/ui/common/ImageLoadStatus;", "(Lcom/facebook/fresco/ui/common/ImageLoadStatus;)V", "imageLoadStatus", "Lcom/facebook/fresco/ui/common/VisibilityState;", "Lcom/facebook/fresco/ui/common/VisibilityState;", "visibilityState", "getVisibilityEventTimeMs", "()J", "Q", "visibilityEventTimeMs", "Ll/p26$a;", "_extraData", "ui-common_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class ihm extends ehm {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public long controllerFailureTimeMs;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public long imageRequestStartTimeMs;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public long imageRequestEndTimeMs;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public boolean isPrefetch;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public int onScreenWidthPx;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public int onScreenHeightPx;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public Throwable errorThrowable;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public ImageLoadStatus imageLoadStatus;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public VisibilityState visibilityState;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public long visibilityEventTimeMs;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public long invisibilityEventTimeMs;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @Nullable
    public p26.C19111a _extraData;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public String controllerId;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public String requestId;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public Object imageRequest;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public Object callerContext;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public Object imageInfo;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public long controllerSubmitTimeMs;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public long controllerIntermediateImageSetTimeMs;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public long controllerFinalImageSetTimeMs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihm(@NotNull ImageRenderingInfra imageRenderingInfra) {
        super(imageRenderingInfra);
        imageRenderingInfra.getClass();
        this.controllerSubmitTimeMs = -1L;
        this.controllerIntermediateImageSetTimeMs = -1L;
        this.controllerFinalImageSetTimeMs = -1L;
        this.controllerFailureTimeMs = -1L;
        this.imageRequestStartTimeMs = -1L;
        this.imageRequestEndTimeMs = -1L;
        this.onScreenWidthPx = -1;
        this.onScreenHeightPx = -1;
        this.imageLoadStatus = ImageLoadStatus.UNKNOWN;
        this.visibilityState = VisibilityState.UNKNOWN;
        this.visibilityEventTimeMs = -1L;
        this.invisibilityEventTimeMs = -1L;
    }

    /* JADX INFO: renamed from: A */
    public final void m136243A(long controllerFinalImageSetTimeMs) {
        this.controllerFinalImageSetTimeMs = controllerFinalImageSetTimeMs;
    }

    /* JADX INFO: renamed from: B */
    public final void m136244B(@Nullable String controllerId) {
        this.controllerId = controllerId;
    }

    /* JADX INFO: renamed from: C */
    public final void m136245C(long controllerIntermediateImageSetTimeMs) {
        this.controllerIntermediateImageSetTimeMs = controllerIntermediateImageSetTimeMs;
    }

    /* JADX INFO: renamed from: D */
    public final void m136246D(long controllerSubmitTimeMs) {
        this.controllerSubmitTimeMs = controllerSubmitTimeMs;
    }

    /* JADX INFO: renamed from: E */
    public final void m136247E(@Nullable Throwable errorThrowable) {
        this.errorThrowable = errorThrowable;
    }

    /* JADX INFO: renamed from: F */
    public final void m136248F(@Nullable p26.C19111a extraData) {
        this._extraData = extraData;
    }

    /* JADX INFO: renamed from: G */
    public final void m136249G(@Nullable Object imageInfo) {
        this.imageInfo = imageInfo;
    }

    /* JADX INFO: renamed from: H */
    public final void m136250H(@NotNull ImageLoadStatus imageLoadStatus) {
        imageLoadStatus.getClass();
        this.imageLoadStatus = imageLoadStatus;
    }

    /* JADX INFO: renamed from: I */
    public final void m136251I(@Nullable Object imageRequest) {
        this.imageRequest = imageRequest;
    }

    /* JADX INFO: renamed from: J */
    public final void m136252J(long imageRequestEndTimeMs) {
        this.imageRequestEndTimeMs = imageRequestEndTimeMs;
    }

    /* JADX INFO: renamed from: K */
    public final void m136253K(long imageRequestStartTimeMs) {
        this.imageRequestStartTimeMs = imageRequestStartTimeMs;
    }

    /* JADX INFO: renamed from: L */
    public final void m136254L(long invisibilityEventTimeMs) {
        this.invisibilityEventTimeMs = invisibilityEventTimeMs;
    }

    /* JADX INFO: renamed from: M */
    public final void m136255M(int onScreenHeightPx) {
        this.onScreenHeightPx = onScreenHeightPx;
    }

    /* JADX INFO: renamed from: N */
    public final void m136256N(int onScreenWidthPx) {
        this.onScreenWidthPx = onScreenWidthPx;
    }

    /* JADX INFO: renamed from: O */
    public final void m136257O(boolean prefetch) {
        this.isPrefetch = prefetch;
    }

    /* JADX INFO: renamed from: P */
    public final void m136258P(@Nullable String requestId) {
        this.requestId = requestId;
    }

    /* JADX INFO: renamed from: Q */
    public final void m136259Q(long j) {
        this.visibilityEventTimeMs = j;
    }

    /* JADX INFO: renamed from: R */
    public final void m136260R(boolean visible) {
        this.visibilityState = visible ? VisibilityState.VISIBLE : VisibilityState.INVISIBLE;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final chm m136261S() {
        return new chm(getInfra(), this.controllerId, this.requestId, this.imageRequest, this.callerContext, this.imageInfo, this.controllerSubmitTimeMs, this.controllerIntermediateImageSetTimeMs, this.controllerFinalImageSetTimeMs, this.controllerFailureTimeMs, this.imageRequestStartTimeMs, this.imageRequestEndTimeMs, getEmptyEventTimestampNs(), getReleasedEventTimestampNs(), this.isPrefetch, this.onScreenWidthPx, this.onScreenHeightPx, this.errorThrowable, this.visibilityState, this.visibilityEventTimeMs, this.invisibilityEventTimeMs, null, this._extraData, getCallingClassNameOnVisible(), getRootContextNameOnVisible(), getContextChainArrayOnVisible(), getContextChainExtrasOnVisible(), getContentIdOnVisible(), getSurfaceOnVisible(), getSubSurfaceOnVisible(), getMsSinceLastNavigationOnVisible(), getStartupStatusOnVisible(), CollectionsKt.toList(m116486k()), getNewIntermediateImageSetPointAvailable(), getErrorMessageOnFailure(), getErrorStacktraceStringOnFailure(), getErrorCodeOnFailure(), getDensityDpiOnSuccess());
    }

    /* JADX INFO: renamed from: w */
    public final void m136262w() {
        this.requestId = null;
        this.imageRequest = null;
        this.callerContext = null;
        this.imageInfo = null;
        this.isPrefetch = false;
        this.onScreenWidthPx = -1;
        this.onScreenHeightPx = -1;
        this.errorThrowable = null;
        this.imageLoadStatus = ImageLoadStatus.UNKNOWN;
        this.visibilityState = VisibilityState.UNKNOWN;
        this._extraData = null;
        m136263x();
        m116494s();
    }

    /* JADX INFO: renamed from: x */
    public final void m136263x() {
        this.imageRequestStartTimeMs = -1L;
        this.imageRequestEndTimeMs = -1L;
        this.controllerSubmitTimeMs = -1L;
        this.controllerFinalImageSetTimeMs = -1L;
        this.controllerFailureTimeMs = -1L;
        this.visibilityEventTimeMs = -1L;
        this.invisibilityEventTimeMs = -1L;
        m116486k().clear();
        m116496u(false);
        m116495t(null);
        m116497v(null);
    }

    /* JADX INFO: renamed from: y */
    public final void m136264y(@Nullable Object obj) {
        this.callerContext = obj;
    }

    /* JADX INFO: renamed from: z */
    public final void m136265z(long controllerFailureTimeMs) {
        this.controllerFailureTimeMs = controllerFailureTimeMs;
    }
}
