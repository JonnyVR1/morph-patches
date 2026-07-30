package com.momo.xeengine.xnative;

import androidx.annotation.Keep;
import com.momo.xeengine.event.IXEventDispatcher;
import com.momo.xeengine.p049cv.bean.CVBodyInfo;
import com.momo.xeengine.p049cv.bean.CVExpressInfo;
import com.momo.xeengine.p049cv.bean.CVObjectInfo;
import com.momo.xeengine.p049cv.bean.CVSegmentInfo;
import com.momo.xeengine.p049cv.bean.XECartoonFaceInfo;
import com.momo.xeengine.p049cv.bean.XEFaceInfo;
import com.momo.xeengine.p049cv.bean.XEFaceLiquefy;
import com.momo.xeengine.p049cv.bean.XEFaceMask;
import com.momo.xeengine.p049cv.bean.XEFaceSegmentInfo;
import com.momo.xeengine.p049cv.bean.XEHandInfo;
import com.momo.xeengine.p049cv.bean.XEMutableData;
import com.momo.xeengine.p049cv.bean.XEMutableInfo;
import com.momo.xeengine.p049cv.bean.XETTHeartInfo;
import com.momo.xeengine.xnative.XEEventDispatcher;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public final class XEEventDispatcher extends XETouchDispatcher implements IXEventDispatcher {
    private boolean hasDeliverFaceLost;
    private boolean isHandSetNullInfo;
    private long pointer;

    public static class EventExecutor implements Executor {
        private final Queue<Runnable> mEventQueue;

        private EventExecutor() {
            this.mEventQueue = new ConcurrentLinkedQueue();
        }

        public void apply() {
            while (!this.mEventQueue.isEmpty()) {
                Runnable runnablePoll = this.mEventQueue.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.mEventQueue.add(runnable);
        }
    }

    public XEEventDispatcher(long j) {
        super(new EventExecutor(), j);
        this.pointer = j;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m21335g(XEEventDispatcher xEEventDispatcher, List list) {
        nativeClearMutableData(xEEventDispatcher.pointer);
        for (int i = 0; i < list.size(); i++) {
            XEMutableInfo xEMutableInfo = (XEMutableInfo) list.get(i);
            if (xEMutableInfo != null) {
                long jNativeGetMutablePointer = nativeGetMutablePointer(xEEventDispatcher.pointer, i);
                if (jNativeGetMutablePointer != 0) {
                    CVSegmentInfo maskInfo1 = xEMutableInfo.getMaskInfo1();
                    if (maskInfo1 != null && maskInfo1.getLength() > 0 && maskInfo1.getWidth() > 0 && maskInfo1.getHeight() > 0) {
                        nativeSetMutableMaskInfo(xEEventDispatcher.pointer, jNativeGetMutablePointer, 0, maskInfo1.getDatas(), maskInfo1.getLength(), maskInfo1.getWarpMat(), maskInfo1.getWidth(), maskInfo1.getHeight(), maskInfo1.isFlipShowX());
                    }
                    CVSegmentInfo maskInfo2 = xEMutableInfo.getMaskInfo2();
                    if (maskInfo2 != null && maskInfo2.getLength() > 0 && maskInfo2.getWidth() > 0 && maskInfo2.getHeight() > 0) {
                        nativeSetMutableMaskInfo(xEEventDispatcher.pointer, jNativeGetMutablePointer, 1, maskInfo2.getDatas(), maskInfo2.getLength(), maskInfo2.getWarpMat(), maskInfo2.getWidth(), maskInfo2.getHeight(), maskInfo2.isFlipShowX());
                    }
                    List<XEMutableData> mutableDatas = xEMutableInfo.getMutableDatas();
                    if (mutableDatas != null && mutableDatas.size() > 0) {
                        for (int i2 = 0; i2 < mutableDatas.size(); i2++) {
                            XEMutableData xEMutableData = mutableDatas.get(i2);
                            nativeSetMutableData(xEEventDispatcher.pointer, jNativeGetMutablePointer, i2, xEMutableData.getInts(), xEMutableData.getFloats(), xEMutableData.str1, xEMutableData.str2, xEMutableData.vec1, xEMutableData.vec2, xEMutableData.mat1, xEMutableData.mat2, xEMutableData.floatArray1, xEMutableData.floatArray2, xEMutableData.floatArray3, xEMutableData.floatArray4);
                        }
                    }
                    nativeUpdateMutableData(xEEventDispatcher.pointer, jNativeGetMutablePointer, xEMutableInfo.getBusiness());
                }
            }
        }
        nativeUpdateMutableDatas(xEEventDispatcher.pointer);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m21336h(XEEventDispatcher xEEventDispatcher) {
        nativeSetHands(xEEventDispatcher.pointer, null);
        xEEventDispatcher.isHandSetNullInfo = true;
    }

    private boolean isRunning() {
        return this.pointer != 0;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m21340l(XEEventDispatcher xEEventDispatcher, List list) {
        xEEventDispatcher.isHandSetNullInfo = false;
        nativeSetHands(xEEventDispatcher.pointer, list);
    }

    private static native long nativeBodySrcAndDstWarpPoints(long j, long j2, float[] fArr, float[] fArr2);

    private static native void nativeClearMutableData(long j);

    private static native long nativeFace106LandMarks(long j, float[] fArr);

    private static native long nativeFace222LandMarks(long j, float[] fArr);

    private static native long nativeFace96LandMarks(long j, float[] fArr);

    private static native long nativeFaceBounds(long j, float f, float f2, float f3, float f4);

    private static native long nativeFaceEexpression(long j, int i);

    private static native long nativeFaceMask(long j, long j2, byte[] bArr, int i, float[] fArr, int i2, int i3, boolean z);

    private static native long nativeFaceModelViewMatrix(long j, float[] fArr);

    private static native long nativeFacerigStates(long j, float[] fArr);

    private static native long nativeGetFace(long j, int i);

    private static native long nativeGetMutablePointer(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnFaceEntityDetected(long j, long[] jArr);

    private static native long nativeSetBody(float[] fArr, float[] fArr2, float[] fArr3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetBodys(long j, long[] jArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetCartoonFaceData(long j, byte[] bArr, int i, float[] fArr, int i2, int i3, boolean z);

    private static native long nativeSetFaceEuler(long j, float f, float f2, float f3);

    private static native void nativeSetFaceLiquefyInfos(long j, long j2, int i, float f, float f2, float f3, float f4, float f5, float f6, float[] fArr);

    private static native long nativeSetFaceTrackId(long j, int i);

    private static native void nativeSetHands(long j, List<XEHandInfo> list);

    private static native void nativeSetMutableData(long j, long j2, int i, int[] iArr, float[] fArr, String str, String str2, float[] fArr2, float[] fArr3, float[] fArr4, float[] fArr5, float[] fArr6, float[] fArr7, float[] fArr8, float[] fArr9);

    private static native void nativeSetMutableMaskInfo(long j, long j2, int i, byte[] bArr, int i2, float[] fArr, int i3, int i4, boolean z);

    private static native long nativeSetObject(String str, float[] fArr, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetObjects(long j, long[] jArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetSegment(long j, byte[] bArr, int i, float[] fArr, int i2, int i3, boolean z);

    private static native long nativeSkinThreshold(long j, float[] fArr);

    private static native long nativeSrcAndDstWarpPoints(long j, long j2, float[] fArr, float[] fArr2);

    private static native void nativeUpdateMutableData(long j, long j2, String str);

    private static native void nativeUpdateMutableDatas(long j);

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m21343o(XEEventDispatcher xEEventDispatcher) {
        nativeClearMutableData(xEEventDispatcher.pointer);
        nativeUpdateMutableDatas(xEEventDispatcher.pointer);
    }

    @Override // com.momo.xeengine.event.IXEventDispatcher
    public void dispatchBodyInfo(List<CVBodyInfo> list, boolean z) {
        final long[] jArr;
        float[] fArr;
        float[] fArr2;
        if (isRunning()) {
            if (list == null || list.isEmpty()) {
                jArr = null;
            } else {
                int size = list.size();
                jArr = new long[size];
                for (int i = 0; i < size; i++) {
                    CVBodyInfo cVBodyInfo = list.get(i);
                    if (cVBodyInfo != null && !cVBodyInfo.joints.isEmpty()) {
                        int size2 = cVBodyInfo.joints.size();
                        float[] fArr3 = new float[size2];
                        float[] fArr4 = new float[size2];
                        float[] fArr5 = new float[size2];
                        for (int i2 = 0; i2 < size2; i2++) {
                            CVBodyInfo.Joint joint = cVBodyInfo.joints.get(i2);
                            if (joint != null) {
                                fArr3[i2] = joint.f15287x;
                                fArr4[i2] = joint.f15288y;
                                fArr5[i2] = joint.score;
                            }
                        }
                        long jNativeSetBody = nativeSetBody(fArr3, fArr4, fArr5);
                        if (z && i == 0 && (fArr = cVBodyInfo.src_warp_points) != null && fArr.length > 0 && (fArr2 = cVBodyInfo.dst_warp_points) != null && fArr2.length > 0) {
                            nativeBodySrcAndDstWarpPoints(this.pointer, jNativeSetBody, fArr, fArr2);
                        }
                        jArr[i] = jNativeSetBody;
                    }
                }
            }
            this.executor.execute(new Runnable() { // from class: l.wkq0
                @Override // java.lang.Runnable
                public final void run() {
                    XEEventDispatcher.nativeSetBodys(this.f189584a.pointer, jArr);
                }
            });
        }
    }

    @Override // com.momo.xeengine.event.IXEventDispatcher
    public void dispatchCartoonFaceInfo(final XECartoonFaceInfo xECartoonFaceInfo) {
        Executor executor = this.executor;
        if (xECartoonFaceInfo != null) {
            executor.execute(new Runnable() { // from class: l.dlq0
                @Override // java.lang.Runnable
                public final void run() {
                    XEEventDispatcher xEEventDispatcher = this.f89565a;
                    XECartoonFaceInfo xECartoonFaceInfo2 = xECartoonFaceInfo;
                    XEEventDispatcher.nativeSetCartoonFaceData(xEEventDispatcher.pointer, xECartoonFaceInfo2.getDatas(), xECartoonFaceInfo2.getLength(), xECartoonFaceInfo2.getWarpMat(), xECartoonFaceInfo2.getHeight(), xECartoonFaceInfo2.getWidth(), xECartoonFaceInfo2.isFlipShowX());
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: l.elq0
                @Override // java.lang.Runnable
                public final void run() {
                    XEEventDispatcher.nativeSetCartoonFaceData(this.f94574a.pointer, null, 0, null, 0, 0, false);
                }
            });
        }
    }

    @Override // com.momo.xeengine.event.IXEventDispatcher
    public void dispatchExpressInfo(List<CVExpressInfo> list) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.momo.xeengine.event.IXEventDispatcher
    public void dispatchFaceInfo(List<XEFaceInfo> list) {
        float[] fArr;
        List<XEFaceInfo> list2 = list;
        if (isRunning()) {
            char c = 1;
            if (list2 == null || list2.isEmpty()) {
                if (this.hasDeliverFaceLost) {
                    return;
                }
                this.hasDeliverFaceLost = true;
                this.executor.execute(new Runnable() { // from class: l.clq0
                    @Override // java.lang.Runnable
                    public final void run() {
                        XEEventDispatcher.nativeOnFaceEntityDetected(this.f82419a.pointer, null);
                    }
                });
                return;
            }
            int size = list2.size();
            final long[] jArr = new long[size];
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                XEFaceInfo xEFaceInfo = list2.get(i2);
                long jNativeGetFace = nativeGetFace(this.pointer, i2);
                float[] fArr2 = xEFaceInfo.src_warp_points;
                if (fArr2 != null && fArr2.length > 0 && (fArr = xEFaceInfo.dst_warp_points) != null && fArr.length > 0) {
                    nativeSrcAndDstWarpPoints(this.pointer, jNativeGetFace, fArr2, fArr);
                }
                long jNativeSetFaceEuler = nativeSetFaceEuler(nativeSetFaceTrackId(jNativeGetFace, xEFaceInfo.trackId), xEFaceInfo.pitch, xEFaceInfo.yaw, xEFaceInfo.roll);
                float[] fArr3 = xEFaceInfo.faceBounds;
                if (fArr3 != null && fArr3.length >= 4) {
                    jNativeSetFaceEuler = nativeFaceBounds(jNativeSetFaceEuler, fArr3[i], fArr3[c], fArr3[2], fArr3[3]);
                }
                float[] fArr4 = xEFaceInfo.landmarks96;
                if (fArr4 != null && fArr4.length > 0) {
                    jNativeSetFaceEuler = nativeFace96LandMarks(jNativeSetFaceEuler, fArr4);
                }
                float[] fArr5 = xEFaceInfo.landmarks106;
                if (fArr5 != null && fArr5.length > 0) {
                    jNativeSetFaceEuler = nativeFace106LandMarks(jNativeSetFaceEuler, fArr5);
                }
                float[] fArr6 = xEFaceInfo.landmarks222;
                if (fArr6 != null && fArr6.length > 0) {
                    jNativeSetFaceEuler = nativeFace222LandMarks(jNativeSetFaceEuler, fArr6);
                }
                long jNativeFaceEexpression = nativeFaceEexpression(jNativeSetFaceEuler, xEFaceInfo.expression);
                float[] fArr7 = xEFaceInfo.modelViewMatrix;
                if (fArr7 != null && fArr7.length >= 16) {
                    jNativeFaceEexpression = nativeFaceModelViewMatrix(jNativeFaceEexpression, fArr7);
                }
                float[] fArr8 = xEFaceInfo.facerigStates;
                if (fArr8 != null && fArr8.length >= 36) {
                    jNativeFaceEexpression = nativeFacerigStates(jNativeFaceEexpression, fArr8);
                }
                float[] fArr9 = xEFaceInfo.skin_threshold;
                if (fArr9 != null && fArr9.length > 0) {
                    jNativeFaceEexpression = nativeSkinThreshold(jNativeFaceEexpression, fArr9);
                }
                long jNativeFaceMask = jNativeFaceEexpression;
                XEFaceMask xEFaceMask = xEFaceInfo.faceMask;
                if (xEFaceMask != null && xEFaceMask.getLength() > 0 && xEFaceInfo.faceMask.getMaskWidth() > 0 && xEFaceInfo.faceMask.getMaskHeight() > 0) {
                    jNativeFaceMask = nativeFaceMask(this.pointer, jNativeFaceMask, xEFaceInfo.faceMask.getDatas(), xEFaceInfo.faceMask.getLength(), xEFaceInfo.faceMask.getWarpMat(), xEFaceInfo.faceMask.getMaskWidth(), xEFaceInfo.faceMask.getMaskHeight(), xEFaceInfo.faceMask.isFlipShowX());
                }
                long j = jNativeFaceMask;
                List<XEFaceLiquefy> list3 = xEFaceInfo.liquefyInfos;
                if (list3 != null && list3.size() > 0) {
                    for (int i3 = i; i3 < xEFaceInfo.liquefyInfos.size(); i3++) {
                        XEFaceLiquefy xEFaceLiquefy = xEFaceInfo.liquefyInfos.get(i3);
                        nativeSetFaceLiquefyInfos(this.pointer, j, xEFaceLiquefy.circleType, xEFaceLiquefy.circleCenterX, xEFaceLiquefy.circleCenterY, xEFaceLiquefy.circleSizeX, xEFaceLiquefy.circleSizeY, xEFaceLiquefy.circleIntensityX, xEFaceLiquefy.circleIntensityY, xEFaceLiquefy.mat);
                    }
                }
                jArr[i2] = j;
                i2++;
                list2 = list;
                c = 1;
                i = 0;
            }
            this.hasDeliverFaceLost = i;
            this.executor.execute(new Runnable() { // from class: l.blq0
                @Override // java.lang.Runnable
                public final void run() {
                    XEEventDispatcher.nativeOnFaceEntityDetected(this.f77206a.pointer, jArr);
                }
            });
        }
    }

    @Override // com.momo.xeengine.event.IXEventDispatcher
    public void dispatchFaceSegmentInfo(XEFaceSegmentInfo xEFaceSegmentInfo) {
    }

    @Override // com.momo.xeengine.event.IXEventDispatcher
    public void dispatchHandInfo(final List<XEHandInfo> list) {
        if (isRunning()) {
            if (list == null || (list.isEmpty() && !this.isHandSetNullInfo)) {
                this.executor.execute(new Runnable() { // from class: l.xkq0
                    @Override // java.lang.Runnable
                    public final void run() {
                        XEEventDispatcher.m21336h(this.f194808a);
                    }
                });
            } else {
                this.executor.execute(new Runnable() { // from class: l.ykq0
                    @Override // java.lang.Runnable
                    public final void run() {
                        XEEventDispatcher.m21340l(this.f200435a, list);
                    }
                });
            }
        }
    }

    @Override // com.momo.xeengine.event.IXEventDispatcher
    public void dispatchMutableInfo(final List<XEMutableInfo> list) {
        if (list == null || list.size() <= 0) {
            this.executor.execute(new Runnable() { // from class: l.alq0
                @Override // java.lang.Runnable
                public final void run() {
                    XEEventDispatcher.m21343o(this.f72148a);
                }
            });
        } else {
            this.executor.execute(new Runnable() { // from class: l.zkq0
                @Override // java.lang.Runnable
                public final void run() {
                    XEEventDispatcher.m21335g(this.f204791a, list);
                }
            });
        }
    }

    @Override // com.momo.xeengine.event.IXEventDispatcher
    public void dispatchObjectInfo(List<CVObjectInfo> list) {
        final long[] jArr;
        if (isRunning()) {
            if (list == null || list.isEmpty()) {
                jArr = null;
            } else {
                int size = list.size();
                jArr = new long[size];
                for (int i = 0; i < size; i++) {
                    CVObjectInfo cVObjectInfo = list.get(i);
                    if (cVObjectInfo != null) {
                        jArr[i] = nativeSetObject(cVObjectInfo.getType(), cVObjectInfo.getBounds(), cVObjectInfo.getScore());
                    }
                }
            }
            this.executor.execute(new Runnable() { // from class: l.flq0
                @Override // java.lang.Runnable
                public final void run() {
                    XEEventDispatcher.nativeSetObjects(this.f99684a.pointer, jArr);
                }
            });
        }
    }

    @Override // com.momo.xeengine.event.IXEventDispatcher
    public void dispatchSegmentInfo(final CVSegmentInfo cVSegmentInfo) {
        Executor executor = this.executor;
        if (cVSegmentInfo != null) {
            executor.execute(new Runnable() { // from class: l.glq0
                @Override // java.lang.Runnable
                public final void run() {
                    XEEventDispatcher xEEventDispatcher = this.f104879a;
                    CVSegmentInfo cVSegmentInfo2 = cVSegmentInfo;
                    XEEventDispatcher.nativeSetSegment(xEEventDispatcher.pointer, cVSegmentInfo2.getDatas(), cVSegmentInfo2.getLength(), cVSegmentInfo2.getWarpMat(), cVSegmentInfo2.getHeight(), cVSegmentInfo2.getWidth(), cVSegmentInfo2.isFlipShowX());
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: l.hlq0
                @Override // java.lang.Runnable
                public final void run() {
                    XEEventDispatcher.nativeSetSegment(this.f110527a.pointer, null, 0, null, 0, 0, false);
                }
            });
        }
    }

    @Override // com.momo.xeengine.event.IXEventDispatcher
    public void dispatchTTHeartInfo(XETTHeartInfo xETTHeartInfo) {
    }

    public void executeQueue() {
        ((EventExecutor) this.executor).apply();
    }

    @Override // com.momo.xeengine.xnative.XETouchDispatcher
    public void release() {
        super.release();
        this.executor = null;
        this.pointer = 0L;
    }

    @Override // com.momo.xeengine.event.IXEventDispatcher
    public void dispatchBodyInfo(List<CVBodyInfo> list) {
        dispatchBodyInfo(list, false);
    }
}
