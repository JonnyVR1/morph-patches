package com.core.glcore.util;

import com.cosmos.mdlog.MDLog;
import com.momo.xeengine.p044cv.bean.CVSegmentInfo;
import com.momocv.BaseParams;
import com.momocv.handsg.Handsg;
import com.momocv.handsg.HandsgInfo;
import com.momocv.handsg.HandsgParams;
import java.io.FileInputStream;
import p149l.mkw;
import p149l.pjw;
import p149l.vjw;

/* JADX INFO: loaded from: classes.dex */
public class HandSegmentHelper {
    private static String TAG = "HandSegmentHelper";
    private static CVSegmentInfo cvSegmentInfo = null;
    private static int height = 0;
    private static byte[] modelBuff = null;
    private static String modelPath = null;
    private static int restore_degree = 90;
    private static int rotate_degree;
    private static Handsg segmentation;
    private static int width;
    private static final float[] segMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private static HandsgInfo info = new HandsgInfo();

    public static void dispatchSegmentInfo(HandsgInfo handsgInfo, pjw pjwVar) {
        float[] fArr;
        byte[] bArr = handsgInfo.mask_;
        if (bArr == null || bArr.length <= 0 || (fArr = handsgInfo.warp_mat) == null || fArr.length < 6 || handsgInfo.mask_width <= 0 || handsgInfo.mask_height <= 0) {
            cvSegmentInfo = new CVSegmentInfo();
            return;
        }
        if (cvSegmentInfo == null) {
            cvSegmentInfo = new CVSegmentInfo();
        }
        cvSegmentInfo.setDatas(handsgInfo.mask_);
        cvSegmentInfo.setFlipShowX(pjwVar.f149894a);
        cvSegmentInfo.setHeight(handsgInfo.mask_height);
        cvSegmentInfo.setWidth(handsgInfo.mask_width);
        cvSegmentInfo.setLength(handsgInfo.mask_.length);
        float[] fArr2 = segMatrix;
        float[] fArr3 = handsgInfo.warp_mat;
        fArr2[0] = fArr3[0];
        fArr2[3] = fArr3[1];
        fArr2[6] = fArr3[2];
        fArr2[1] = fArr3[3];
        fArr2[4] = fArr3[4];
        fArr2[7] = fArr3[5];
        cvSegmentInfo.setWarpMat(fArr2);
    }

    public static CVSegmentInfo getCvSegmentInfo() {
        return cvSegmentInfo;
    }

    public static HandsgInfo getHandsgInfo() {
        return info;
    }

    public static int getHeight() {
        return height;
    }

    public static String getModelPath() {
        return modelPath;
    }

    public static int getRestoreDegree() {
        return restore_degree;
    }

    public static int getRotateDegree() {
        return rotate_degree;
    }

    public static int getWidth() {
        return width;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:45:0x009b  */
    public static HandsgInfo process(vjw vjwVar, mkw mkwVar, pjw pjwVar) {
        FileInputStream fileInputStream;
        Throwable th;
        String str;
        StringBuilder sb;
        if (modelPath == null) {
            return info;
        }
        if (pjwVar == null) {
            return info;
        }
        if (modelBuff == null) {
            try {
                fileInputStream = new FileInputStream(modelPath);
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    modelBuff = bArr;
                    fileInputStream.read(bArr);
                    if (segmentation == null) {
                        segmentation = new Handsg();
                    }
                    if (!segmentation.LoadModel(modelBuff)) {
                        MDLog.m7391e(TAG, "The HandSegment mode lode failed !!!");
                    }
                    try {
                        fileInputStream.close();
                    } catch (Exception e) {
                        e = e;
                        str = TAG;
                        sb = new StringBuilder("The HandSegment mode lode failed !!!");
                        sb.append(e.toString());
                        MDLog.m7391e(str, sb.toString());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        MDLog.printErrStackTrace(TAG, th);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e2) {
                                e = e2;
                                str = TAG;
                                sb = new StringBuilder("The HandSegment mode lode failed !!!");
                                sb.append(e.toString());
                                MDLog.m7391e(str, sb.toString());
                            }
                        }
                        if (modelBuff != null) {
                            if (segmentation == null) {
                                segmentation = new Handsg();
                            }
                            BaseParams baseParamsM155081c = mkwVar.m155081c();
                            baseParamsM155081c.fliped_show_ = pjwVar.f149894a;
                            pjwVar.m169936B(baseParamsM155081c);
                            segmentation.ProcessFrame(vjwVar.m198689b(), (HandsgParams) baseParamsM155081c, info);
                        }
                        return info;
                    } catch (Throwable th3) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e3) {
                                MDLog.m7391e(TAG, "The HandSegment mode lode failed !!!" + e3.toString());
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                fileInputStream = null;
                th = th4;
            }
        }
        if (modelBuff != null) {
            if (segmentation == null) {
                segmentation = new Handsg();
            }
            BaseParams baseParamsM155081c2 = mkwVar.m155081c();
            baseParamsM155081c2.fliped_show_ = pjwVar.f149894a;
            pjwVar.m169936B(baseParamsM155081c2);
            segmentation.ProcessFrame(vjwVar.m198689b(), (HandsgParams) baseParamsM155081c2, info);
        }
        return info;
    }

    public static HandsgInfo processInfo(vjw vjwVar, mkw mkwVar) {
        return process(vjwVar, mkwVar, null);
    }

    public static void release() {
        Handsg handsg = segmentation;
        if (handsg != null) {
            handsg.Release();
            segmentation = null;
        }
        HandsgInfo handsgInfo = info;
        if (handsgInfo != null && handsgInfo.mask_ != null) {
            handsgInfo.mask_ = null;
        }
        if (modelBuff != null) {
            modelBuff = null;
        }
        cvSegmentInfo = null;
        MDLog.m7395i(TAG, "HandSegmentHelper release !!!");
    }

    public static void setCvSegmentInfo(CVSegmentInfo cVSegmentInfo) {
        cvSegmentInfo = cVSegmentInfo;
    }

    public static void setHandsgInfo(HandsgInfo handsgInfo) {
        info = handsgInfo;
    }

    public static void setHeight(int i) {
        height = i;
    }

    public static void setModelPath(String str) {
        modelPath = str;
    }

    public static void setRestoreDegree(int i) {
        restore_degree = i;
    }

    public static void setRotateDegree(int i) {
        rotate_degree = i;
    }

    public static void setWidth(int i) {
        width = i;
    }
}
