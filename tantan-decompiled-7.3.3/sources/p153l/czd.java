package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.filter.DetectorType;
import com.momo.mcamera.mask.AdditionalInfo;
import com.momo.xeengine.lightningrender.ILightningRender;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Ll/czd;", "Ll/suf;", "Lcom/momo/xeengine/lightningrender/ILightningRender;", "lightningRender", "<init>", "(Lcom/momo/xeengine/lightningrender/ILightningRender;)V", "Lcom/momo/mcamera/mask/AdditionalInfo;", "additionalInfo", "", "c", "(Lcom/momo/mcamera/mask/AdditionalInfo;)V", "a", "", "beautyType", "e", "(I)V", "", "scaleFactor", "b", "(F)V", Constants.INAPP_DATA_TAG, "()V", "Ll/omw;", "mmcvInfo", "setMMCVInfo", "(Ll/omw;)V", "Ll/j8s;", "Ll/j8s;", "detectorHelper", "momomediaext_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class czd implements suf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final j8s detectorHelper;

    public czd(@Nullable ILightningRender iLightningRender) {
        this.detectorHelper = new j8s(iLightningRender);
    }

    /* JADX INFO: renamed from: a */
    public final void m113319a(@Nullable AdditionalInfo additionalInfo) {
        if (additionalInfo == null) {
            return;
        }
        if (additionalInfo.isBodySegmentDetectEnable()) {
            this.detectorHelper.m143899g(DetectorType.SEGMENT_DETECTOR);
        }
        if (additionalInfo.isAnimojiDetectEnable()) {
            this.detectorHelper.m143899g(DetectorType.ANIMOJI_DETECTOR);
        }
        if (additionalInfo.isStylizeFaceEnable()) {
            this.detectorHelper.m143899g(DetectorType.STYLIZE_FACE_DETECTOR);
        }
        if (additionalInfo.isCartoonFaceEnable()) {
            this.detectorHelper.m143899g(DetectorType.CARTOON_FACE_DETECTOR);
        }
        if (additionalInfo.isBodyDetectEnable()) {
            this.detectorHelper.m143899g(DetectorType.BODY_LANDMARK_DETECTOR);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m113320b(float scaleFactor) {
        this.detectorHelper.m143900k(scaleFactor);
    }

    /* JADX INFO: renamed from: c */
    public final void m113321c(@Nullable AdditionalInfo additionalInfo) {
        if (additionalInfo == null) {
            return;
        }
        if (additionalInfo.isBodySegmentDetectEnable()) {
            this.detectorHelper.m143901o(DetectorType.SEGMENT_DETECTOR);
        }
        if (additionalInfo.isAnimojiDetectEnable()) {
            this.detectorHelper.m143901o(DetectorType.ANIMOJI_DETECTOR);
        }
        if (additionalInfo.isStylizeFaceEnable()) {
            this.detectorHelper.m143901o(DetectorType.STYLIZE_FACE_DETECTOR);
        }
        if (additionalInfo.isCartoonFaceEnable()) {
            this.detectorHelper.m143901o(DetectorType.CARTOON_FACE_DETECTOR);
        }
        if (additionalInfo.isBodyDetectEnable()) {
            this.detectorHelper.m143901o(DetectorType.BODY_LANDMARK_DETECTOR);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m113322d() {
        this.detectorHelper.m143898c();
    }

    /* JADX INFO: renamed from: e */
    public final void m113323e(int beautyType) {
        this.detectorHelper.m143902t(beautyType);
    }

    @Override // p153l.suf
    public void setMMCVInfo(@Nullable omw mmcvInfo) {
        this.detectorHelper.setMMCVInfo(mmcvInfo);
    }
}
