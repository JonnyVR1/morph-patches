package com.core.glcore.util;

import com.cosmos.mdlog.MDLog;
import com.momocv.segmentation.Segmentation;
import com.momocv.segmentation.SegmentationInfo;
import com.momocv.segmentation.SegmentationParams;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import p153l.lnw;
import p153l.omw;
import p153l.umw;

/* JADX INFO: loaded from: classes.dex */
public class SegmentHelper {
    public static final int CUT_BODY_TYPE = 0;
    public static final int CUT_FACE_TYPE = 1;
    private static String TAG = "SegmentHelper";
    private static byte[] cutFaceModelBuff = null;
    private static String cutFaceModelPath = null;
    private static int defaultMaskHeight = 1280;
    private static int defaultMaskWidth = 720;
    private static int discardFrameDistance = 0;
    private static int faceHeight = 0;
    private static int faceWidth = 0;
    private static boolean face_is_front_camera = true;
    private static int face_restore_degree = 90;
    private static int face_rotate_degree = 0;
    private static int forceCutFaceThreshold = 30;
    private static int frameNumber = 0;
    private static int height = 0;
    private static boolean is_front_camera = true;
    private static int lastLeftX = -1;
    private static int lastTopY = -1;
    private static int mCutType = 0;
    private static byte[] modelBuff = null;
    private static String modelPath = null;
    private static int restore_degree = 90;
    private static int rotate_degree;
    private static Segmentation segmentation;
    private static int width;
    private static SegmentationInfo info = new SegmentationInfo();
    private static AtomicInteger counter = new AtomicInteger(0);
    private static AtomicInteger faceCounter = new AtomicInteger(0);
    private static int segmentCount = 0;
    private static int faceSegmentCount = 0;

    private static void bodyRelease() {
        Segmentation segmentation2 = segmentation;
        if (segmentation2 != null) {
            segmentation2.Release();
            segmentation = null;
        }
        SegmentationInfo segmentationInfo = info;
        if (segmentationInfo.mask_ != null) {
            segmentationInfo.mask_ = null;
        }
        if (modelBuff != null) {
            modelBuff = null;
        }
        AtomicInteger atomicInteger = counter;
        if (atomicInteger != null) {
            atomicInteger.set(0);
        }
        segmentCount = 0;
        MDLog.m7449i(TAG, "SegmentHelper release !!!");
    }

    private static void faceRelease() {
        if (cutFaceModelBuff != null) {
            cutFaceModelBuff = null;
        }
        AtomicInteger atomicInteger = faceCounter;
        if (atomicInteger != null) {
            atomicInteger.set(0);
        }
        faceSegmentCount = 0;
        MDLog.m7449i(TAG, "SegmentHelper release !!!");
    }

    public static int getCutType() {
        return mCutType;
    }

    public static int getHeight() {
        return mCutType == 0 ? height : faceHeight;
    }

    public static String getModelPath() {
        return mCutType == 0 ? modelPath : cutFaceModelPath;
    }

    public static int getRestoreDegree() {
        return mCutType == 0 ? restore_degree : face_restore_degree;
    }

    public static int getRotateDegree() {
        return mCutType == 0 ? rotate_degree : face_rotate_degree;
    }

    public static int getWidth() {
        return mCutType == 0 ? width : faceWidth;
    }

    public static boolean isFrontCamera() {
        return mCutType == 0 ? is_front_camera : face_is_front_camera;
    }

    private static boolean needProcess(int i, int i2) {
        if (Math.abs(i - lastLeftX) <= forceCutFaceThreshold || lastLeftX < 0) {
            return Math.abs(i2 - lastTopY) > forceCutFaceThreshold && lastTopY >= 0;
        }
        return true;
    }

    public static SegmentationInfo process(umw umwVar, lnw lnwVar, boolean z, omw omwVar) {
        int i = mCutType;
        if (i == 0) {
            return processBody(umwVar, lnwVar, z, omwVar);
        }
        if (i == 1) {
            return processFace(umwVar, lnwVar, z, omwVar);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:61:0x010f  */
    public static SegmentationInfo processBody(umw umwVar, lnw lnwVar, boolean z, omw omwVar) {
        byte[] bArr;
        String str;
        StringBuilder sb;
        if (modelPath == null) {
            byte[] bArr2 = info.mask_;
            if (bArr2 == null || bArr2.length != umwVar.m196799e() * umwVar.m196797c()) {
                info.mask_ = new byte[umwVar.m196799e() * umwVar.m196797c()];
                Arrays.fill(info.mask_, (byte) -1);
            }
            return info;
        }
        if (counter.getAndDecrement() > 0) {
            SegmentationInfo segmentationInfo = info;
            if (segmentationInfo.mask_ != null) {
                return segmentationInfo;
            }
        }
        if (modelBuff == null) {
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(modelPath);
                try {
                    byte[] bArr3 = new byte[fileInputStream2.available()];
                    modelBuff = bArr3;
                    fileInputStream2.read(bArr3);
                    if (segmentation == null) {
                        segmentation = new Segmentation();
                    }
                    if (!(z ? segmentation.LoadModelSync(modelBuff) : segmentation.LoadModel(modelBuff))) {
                        MDLog.m7445e(TAG, "The Segment mode lode failed !!!");
                    }
                    try {
                        fileInputStream2.close();
                    } catch (Exception e) {
                        e = e;
                        str = TAG;
                        sb = new StringBuilder("The Segment mode lode failed !!!");
                        sb.append(e.toString());
                        MDLog.m7445e(str, sb.toString());
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    try {
                        MDLog.printErrStackTrace(TAG, th);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e2) {
                                e = e2;
                                str = TAG;
                                sb = new StringBuilder("The Segment mode lode failed !!!");
                                sb.append(e.toString());
                                MDLog.m7445e(str, sb.toString());
                            }
                        }
                        if (modelBuff != null) {
                            if (segmentation == null) {
                                segmentation = new Segmentation();
                            }
                            bArr = info.mask_;
                            if (bArr != null) {
                                info.mask_ = new byte[umwVar.m196799e() * umwVar.m196797c()];
                                Arrays.fill(info.mask_, (byte) -1);
                            } else {
                                info.mask_ = new byte[umwVar.m196799e() * umwVar.m196797c()];
                                Arrays.fill(info.mask_, (byte) -1);
                            }
                            counter.set(segmentCount);
                            if (omwVar != null) {
                                omwVar.m168285B(lnwVar.m155008c());
                            }
                            segmentation.ProcessFrame(umwVar.m196796b(), (SegmentationParams) lnwVar.m155008c(), info);
                        }
                        counter.decrementAndGet();
                        return info;
                    } catch (Throwable th2) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e3) {
                                MDLog.m7445e(TAG, "The Segment mode lode failed !!!" + e3.toString());
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        if (modelBuff != null) {
            if (segmentation == null) {
                segmentation = new Segmentation();
            }
            bArr = info.mask_;
            if (bArr != null || bArr.length != umwVar.m196799e() * umwVar.m196797c()) {
                info.mask_ = new byte[umwVar.m196799e() * umwVar.m196797c()];
                Arrays.fill(info.mask_, (byte) -1);
            }
            counter.set(segmentCount);
            if (omwVar != null) {
                omwVar.m168285B(lnwVar.m155008c());
            }
            segmentation.ProcessFrame(umwVar.m196796b(), (SegmentationParams) lnwVar.m155008c(), info);
        }
        counter.decrementAndGet();
        return info;
    }

    public static SegmentationInfo processFace(umw umwVar, lnw lnwVar, boolean z, omw omwVar) {
        return null;
    }

    public static SegmentationInfo processInfo(umw umwVar, lnw lnwVar) {
        return process(umwVar, lnwVar, false, null);
    }

    public static void release() {
        int i = mCutType;
        if (i == 0) {
            bodyRelease();
        } else if (i == 1) {
            faceRelease();
        }
        mCutType = 0;
    }

    public static void setCutFaceModelPath(String str) {
        MDLog.m7449i(TAG, "cutFaceModelPath:" + str);
        cutFaceModelPath = str;
    }

    public static void setCutType(int i) {
        if (i != 0 && 1 != i) {
            MDLog.m7445e(TAG, "invalid type : " + i);
            return;
        }
        MDLog.m7449i(TAG, "type:" + i);
        mCutType = i;
    }

    public static void setDistanceForDiscardFrame(int i) {
        discardFrameDistance = i;
        MDLog.m7449i(TAG, "discardFrameDistance: " + discardFrameDistance);
    }

    public static void setForceCutFaceThreshold(int i) {
        if (i < 10 || i > 200) {
            return;
        }
        forceCutFaceThreshold = i;
    }

    public static void setHeight(int i) {
        if (mCutType == 0) {
            height = i;
        } else {
            faceHeight = i;
        }
    }

    public static void setIsFrontCamera(boolean z) {
        if (mCutType == 0) {
            is_front_camera = z;
        } else {
            face_is_front_camera = z;
        }
    }

    public static void setModelPath(String str) {
        MDLog.m7449i(TAG, "modelPath:" + str);
        modelPath = str;
    }

    public static void setRestoreDegree(int i) {
        if (mCutType == 0) {
            restore_degree = i;
        } else {
            face_restore_degree = i;
        }
    }

    public static void setRotateDegree(int i) {
        if (mCutType == 0) {
            rotate_degree = i;
        } else {
            face_rotate_degree = i;
        }
    }

    public static void setSegmentCount(int i) {
        int i2 = mCutType;
        if (i2 == 0) {
            segmentCount = i;
            MDLog.m7449i(TAG, "segmentCount:" + segmentCount);
            return;
        }
        if (i2 == 1) {
            faceSegmentCount = i;
            MDLog.m7449i(TAG, "faceSegmentCount:" + faceSegmentCount);
        }
    }

    public static void setWidth(int i) {
        if (mCutType == 0) {
            width = i;
        } else {
            faceWidth = i;
        }
    }

    public static SegmentationInfo processInfo(umw umwVar, lnw lnwVar, boolean z) {
        return process(umwVar, lnwVar, z, null);
    }

    public static byte[] process(umw umwVar, lnw lnwVar, omw omwVar) {
        return process(umwVar, lnwVar, false, omwVar).mask_;
    }

    public static byte[] process(umw umwVar, lnw lnwVar, boolean z) {
        return process(umwVar, lnwVar, z, null).mask_;
    }

    public static byte[] process(umw umwVar, lnw lnwVar) {
        return process(umwVar, lnwVar, false, null).mask_;
    }
}
