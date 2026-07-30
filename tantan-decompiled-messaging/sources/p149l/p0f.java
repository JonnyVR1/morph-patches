package p149l;

import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.PortraitMatting;
import com.momo.xeengine.event.IXEventDispatcher;
import com.momo.xeengine.lightningrender.ILightningRender;
import com.momo.xeengine.p044cv.bean.CVBodyInfo;
import com.momo.xeengine.p044cv.bean.CVSegmentInfo;
import com.momo.xeengine.p044cv.bean.XECartoonFaceInfo;
import com.momo.xeengine.p044cv.bean.XEMutableInfo;
import com.momocv.MMJoint;
import com.momocv.bodylandmark.BodyLandmarkPostInfo;
import com.momocv.cartoonface.CartoonfaceInfo;
import com.momocv.segmentation.SegmentationInfo;
import com.momocv.stylizeface.StylizefaceInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0018\u00010\u0011R\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0014\u0010&\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#¨\u0006'"}, m87232d2 = {"Ll/p0f;", "", "Lcom/momo/xeengine/lightningrender/ILightningRender;", "lightningRender", "<init>", "(Lcom/momo/xeengine/lightningrender/ILightningRender;)V", "Ll/pjw;", "mmcvInfo", "Lcom/momocv/stylizeface/StylizefaceInfo;", "stylizeFaceInfo", "", "e", "(Ll/pjw;Lcom/momocv/stylizeface/StylizefaceInfo;)V", "Lcom/momocv/cartoonface/CartoonfaceInfo;", "cartoonFaceInfo", "c", "(Ll/pjw;Lcom/momocv/cartoonface/CartoonfaceInfo;)V", "Lcom/effectsar/labcv/effectsdk/PortraitMatting$MattingMask;", "Lcom/effectsar/labcv/effectsdk/PortraitMatting;", "mattingMask", "b", "(Lcom/effectsar/labcv/effectsdk/PortraitMatting$MattingMask;)V", "Lcom/momocv/segmentation/SegmentationInfo;", "segmentationInfo", Constants.INAPP_DATA_TAG, "(Lcom/momocv/segmentation/SegmentationInfo;)V", "Lcom/momocv/bodylandmark/BodyLandmarkPostInfo;", "bodyLandmarkPostInfo", "a", "(Lcom/momocv/bodylandmark/BodyLandmarkPostInfo;)V", "Lcom/momo/xeengine/lightningrender/ILightningRender;", "Lcom/momo/xeengine/cv/bean/XECartoonFaceInfo;", "Lcom/momo/xeengine/cv/bean/XECartoonFaceInfo;", "xeCartoonFaceInfo", "", "[F", "cartoonMatrix", "stylizeFaceMatrix", "segMatrix", "momomediaext_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class p0f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final ILightningRender lightningRender;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private XECartoonFaceInfo xeCartoonFaceInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final float[] cartoonMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final float[] stylizeFaceMatrix = {0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final float[] segMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    public p0f(@Nullable ILightningRender iLightningRender) {
        this.lightningRender = iLightningRender;
    }

    /* JADX INFO: renamed from: a */
    public final void m166983a(@Nullable BodyLandmarkPostInfo bodyLandmarkPostInfo) {
        ILightningRender iLightningRender = this.lightningRender;
        IXEventDispatcher eventDispatcher = iLightningRender != null ? iLightningRender.getEventDispatcher() : null;
        if (eventDispatcher == null) {
            return;
        }
        if ((bodyLandmarkPostInfo != null ? bodyLandmarkPostInfo.multi_person_ : null) == null) {
            eventDispatcher.dispatchBodyInfo(null);
            return;
        }
        MMJoint[][] mMJointArr = bodyLandmarkPostInfo.multi_person_;
        ArrayList arrayList = new ArrayList(mMJointArr.length);
        mMJointArr.getClass();
        for (MMJoint[] mMJointArr2 : mMJointArr) {
            int length = mMJointArr2.length;
            CVBodyInfo cVBodyInfo = new CVBodyInfo();
            cVBodyInfo.joints = new ArrayList(length);
            for (MMJoint mMJoint : mMJointArr2) {
                if (mMJoint != null) {
                    CVBodyInfo.Joint joint = new CVBodyInfo.Joint();
                    joint.f14568x = mMJoint.f14759x_;
                    joint.f14569y = mMJoint.f14760y_;
                    joint.score = mMJoint.score_;
                    cVBodyInfo.joints.add(joint);
                }
            }
            arrayList.add(cVBodyInfo);
        }
        eventDispatcher.dispatchBodyInfo(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final void m166984b(@Nullable PortraitMatting.MattingMask mattingMask) {
        ILightningRender iLightningRender = this.lightningRender;
        IXEventDispatcher eventDispatcher = iLightningRender != null ? iLightningRender.getEventDispatcher() : null;
        if (eventDispatcher == null) {
            return;
        }
        if ((mattingMask != null ? mattingMask.getBuffer() : null) != null) {
            byte[] buffer = mattingMask.getBuffer();
            buffer.getClass();
            if (!(buffer.length == 0) && mattingMask.getWidth() > 0 && mattingMask.getHeight() > 0) {
                CVSegmentInfo cVSegmentInfo = new CVSegmentInfo();
                cVSegmentInfo.setDatas(mattingMask.getBuffer());
                cVSegmentInfo.setHeight(mattingMask.getHeight());
                cVSegmentInfo.setWidth(mattingMask.getWidth());
                cVSegmentInfo.setLength(mattingMask.getBuffer().length);
                eventDispatcher.dispatchSegmentInfo(cVSegmentInfo);
                return;
            }
        }
        eventDispatcher.dispatchSegmentInfo(new CVSegmentInfo());
    }

    /* JADX INFO: renamed from: c */
    public final void m166985c(@Nullable pjw mmcvInfo, @Nullable CartoonfaceInfo cartoonFaceInfo) {
        float[] fArr;
        ILightningRender iLightningRender = this.lightningRender;
        IXEventDispatcher eventDispatcher = iLightningRender != null ? iLightningRender.getEventDispatcher() : null;
        if (eventDispatcher == null) {
            return;
        }
        if ((cartoonFaceInfo != null ? cartoonFaceInfo.mask_ : null) != null) {
            byte[] bArr = cartoonFaceInfo.mask_;
            bArr.getClass();
            if (!(bArr.length == 0) && cartoonFaceInfo.mask_width > 0 && cartoonFaceInfo.mask_height > 0 && (fArr = cartoonFaceInfo.warp_mat) != null && fArr.length >= 6) {
                if (this.xeCartoonFaceInfo == null) {
                    this.xeCartoonFaceInfo = new XECartoonFaceInfo();
                }
                XECartoonFaceInfo xECartoonFaceInfo = this.xeCartoonFaceInfo;
                xECartoonFaceInfo.getClass();
                xECartoonFaceInfo.setDatas(cartoonFaceInfo.mask_);
                XECartoonFaceInfo xECartoonFaceInfo2 = this.xeCartoonFaceInfo;
                xECartoonFaceInfo2.getClass();
                xECartoonFaceInfo2.setHeight(cartoonFaceInfo.mask_height);
                XECartoonFaceInfo xECartoonFaceInfo3 = this.xeCartoonFaceInfo;
                xECartoonFaceInfo3.getClass();
                xECartoonFaceInfo3.setWidth(cartoonFaceInfo.mask_width);
                XECartoonFaceInfo xECartoonFaceInfo4 = this.xeCartoonFaceInfo;
                xECartoonFaceInfo4.getClass();
                xECartoonFaceInfo4.setLength(cartoonFaceInfo.mask_.length);
                float[] fArr2 = this.cartoonMatrix;
                float[] fArr3 = cartoonFaceInfo.warp_mat;
                fArr2[0] = fArr3[0];
                fArr2[3] = fArr3[1];
                fArr2[6] = fArr3[2];
                fArr2[1] = fArr3[3];
                fArr2[4] = fArr3[4];
                fArr2[7] = fArr3[5];
                XECartoonFaceInfo xECartoonFaceInfo5 = this.xeCartoonFaceInfo;
                xECartoonFaceInfo5.getClass();
                xECartoonFaceInfo5.setWarpMat(this.cartoonMatrix);
                XECartoonFaceInfo xECartoonFaceInfo6 = this.xeCartoonFaceInfo;
                xECartoonFaceInfo6.getClass();
                xECartoonFaceInfo6.setFlipShowX(mmcvInfo != null ? mmcvInfo.f149894a : true);
                eventDispatcher.dispatchCartoonFaceInfo(this.xeCartoonFaceInfo);
                return;
            }
        }
        eventDispatcher.dispatchCartoonFaceInfo(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m166986d(@Nullable SegmentationInfo segmentationInfo) {
        ILightningRender iLightningRender = this.lightningRender;
        IXEventDispatcher eventDispatcher = iLightningRender != null ? iLightningRender.getEventDispatcher() : null;
        if (eventDispatcher == null) {
            return;
        }
        if ((segmentationInfo != null ? segmentationInfo.mask_ : null) != null) {
            byte[] bArr = segmentationInfo.mask_;
            bArr.getClass();
            if (!(bArr.length == 0) && segmentationInfo.mask_width > 0 && segmentationInfo.mask_height > 0) {
                CVSegmentInfo cVSegmentInfo = new CVSegmentInfo();
                cVSegmentInfo.setDatas(segmentationInfo.mask_);
                cVSegmentInfo.setHeight(segmentationInfo.mask_height);
                cVSegmentInfo.setWidth(segmentationInfo.mask_width);
                cVSegmentInfo.setLength(segmentationInfo.mask_.length);
                float[] fArr = this.segMatrix;
                float[] fArr2 = segmentationInfo.warp_mat;
                fArr[0] = fArr2[0];
                fArr[3] = fArr2[1];
                fArr[6] = fArr2[2];
                fArr[1] = fArr2[3];
                fArr[4] = fArr2[4];
                fArr[7] = fArr2[5];
                cVSegmentInfo.setWarpMat(fArr);
                eventDispatcher.dispatchSegmentInfo(cVSegmentInfo);
                return;
            }
        }
        eventDispatcher.dispatchSegmentInfo(new CVSegmentInfo());
    }

    /* JADX INFO: renamed from: e */
    public final void m166987e(@Nullable pjw mmcvInfo, @Nullable StylizefaceInfo stylizeFaceInfo) {
        ILightningRender iLightningRender = this.lightningRender;
        IXEventDispatcher eventDispatcher = iLightningRender != null ? iLightningRender.getEventDispatcher() : null;
        if (eventDispatcher == null) {
            return;
        }
        if (stylizeFaceInfo == null || (stylizeFaceInfo.mask_width == 0 && stylizeFaceInfo.mask_height == 0)) {
            eventDispatcher.dispatchMutableInfo(null);
            return;
        }
        byte[][] bArr = stylizeFaceInfo.mask_all;
        if (bArr != null) {
            bArr.getClass();
            if (!(bArr.length == 0)) {
                ArrayList arrayList = new ArrayList();
                int length = stylizeFaceInfo.mask_all.length;
                for (int i = 0; i < length; i++) {
                    byte[] bArr2 = stylizeFaceInfo.mask_all[i];
                    XEMutableInfo xEMutableInfo = new XEMutableInfo("stylizeface");
                    CVSegmentInfo cVSegmentInfo = new CVSegmentInfo();
                    cVSegmentInfo.setDatas(bArr2);
                    cVSegmentInfo.setHeight(stylizeFaceInfo.mask_height);
                    cVSegmentInfo.setWidth(stylizeFaceInfo.mask_width);
                    cVSegmentInfo.setLength(stylizeFaceInfo.mask_all[i].length);
                    float[] fArr = this.stylizeFaceMatrix;
                    float[] fArr2 = stylizeFaceInfo.warp_mat_all[i];
                    fArr[0] = fArr2[0];
                    fArr[3] = fArr2[1];
                    fArr[6] = fArr2[2];
                    fArr[1] = fArr2[3];
                    fArr[4] = fArr2[4];
                    fArr[7] = fArr2[5];
                    cVSegmentInfo.setWarpMat(fArr);
                    cVSegmentInfo.setFlipShowX(mmcvInfo != null ? mmcvInfo.f149894a : true);
                    xEMutableInfo.setMaskInfo1(cVSegmentInfo);
                    arrayList.add(xEMutableInfo);
                }
                eventDispatcher.dispatchMutableInfo(arrayList);
                return;
            }
        }
        eventDispatcher.dispatchMutableInfo(null);
    }
}
