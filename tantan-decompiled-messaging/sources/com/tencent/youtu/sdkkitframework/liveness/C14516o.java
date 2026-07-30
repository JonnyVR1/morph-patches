package com.tencent.youtu.sdkkitframework.liveness;

import android.graphics.Rect;
import android.util.Base64;
import com.clevertap.android.sdk.Constants;
import com.tencent.youtu.liveness.YTFaceTracker;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.o */
/* JADX INFO: loaded from: classes2.dex */
public class C14516o {

    /* JADX INFO: renamed from: a */
    public static int f60805a;

    /* JADX INFO: renamed from: b */
    public static int f60806b;

    /* JADX INFO: renamed from: com.tencent.youtu.sdkkitframework.liveness.o$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final float f60807a;

        /* JADX INFO: renamed from: b */
        public final float f60808b;

        /* JADX INFO: renamed from: c */
        public final float f60809c;

        /* JADX INFO: renamed from: d */
        public final float f60810d;

        /* JADX INFO: renamed from: e */
        public final float f60811e;

        public a(int i) {
            if (i == 2) {
                this.f60807a = 0.0f;
                this.f60808b = 0.3f;
                this.f60809c = 0.0f;
                this.f60810d = 0.0f;
                this.f60811e = 0.7f;
                return;
            }
            if (i == 3) {
                this.f60807a = 0.0f;
                this.f60808b = 0.0f;
                this.f60809c = 0.0f;
                this.f60810d = 0.0f;
                this.f60811e = 0.7f;
                return;
            }
            if (i == 4) {
                this.f60807a = 0.0f;
                this.f60808b = 0.0f;
                this.f60809c = 0.0f;
                this.f60810d = 0.0f;
                this.f60811e = 0.0f;
                return;
            }
            if (i != 10) {
                this.f60807a = 0.95f;
                this.f60808b = 0.8f;
                this.f60809c = 0.95f;
                this.f60810d = 0.8f;
                this.f60811e = 0.9f;
                return;
            }
            this.f60807a = 0.3f;
            this.f60808b = 0.3f;
            this.f60809c = 0.3f;
            this.f60810d = 0.5f;
            this.f60811e = 0.9f;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m84675a(float[] fArr, a aVar) {
        if (fArr == null) {
            YtLogger.m84638e("o", "[YTFaceTraceInterface.blockJudge] input pointsVis is null.", null);
            return -1;
        }
        if (fArr.length != 90) {
            YtLogger.m84638e("o", "[YTFaceTraceInterface.blockJudge] input pointsVis.length != 90. current pointsVis.length: " + fArr.length, null);
            return -2;
        }
        int i = 0;
        a aVar2 = aVar == null ? new a(0) : aVar;
        int i2 = 0;
        for (int i3 = 33; i3 <= 45; i3++) {
            if (fArr[i3 - 1] < aVar2.f60808b) {
                i2++;
            }
        }
        if (i2 >= 4) {
            StringBuffer stringBuffer = new StringBuffer("[");
            for (int i4 = 33; i4 <= 45; i4++) {
                int i5 = i4 - 1;
                if (fArr[i5] < aVar2.f60808b) {
                    stringBuffer.append(i5);
                    stringBuffer.append("-");
                    stringBuffer.append(fArr[i5]);
                    stringBuffer.append(Constants.SEPARATOR_COMMA);
                }
            }
            stringBuffer.append(Constants.AES_SUFFIX);
            YtLogger.m84640o("o", m84679a("SHELTER_NOSE", stringBuffer.toString(), aVar2.f60808b));
            return 5;
        }
        int i6 = 0;
        for (int i7 = 46; i7 <= 67; i7++) {
            if (fArr[i7 - 1] < aVar2.f60810d) {
                i6++;
            }
        }
        if (i6 >= 4) {
            StringBuffer stringBuffer2 = new StringBuffer("[");
            for (int i8 = 46; i8 <= 67; i8++) {
                int i9 = i8 - 1;
                if (fArr[i9] < aVar2.f60810d) {
                    stringBuffer2.append(i9);
                    stringBuffer2.append("-");
                    stringBuffer2.append(fArr[i9]);
                    stringBuffer2.append(Constants.SEPARATOR_COMMA);
                }
            }
            stringBuffer2.append(Constants.AES_SUFFIX);
            YtLogger.m84640o("o", m84679a("SHELTER_MOUTH", stringBuffer2.toString(), aVar2.f60810d));
            return 3;
        }
        int i10 = 0;
        for (int i11 = 9; i11 <= 16; i11++) {
            if (fArr[i11 - 1] < aVar2.f60811e) {
                i10++;
            }
        }
        for (int i12 = 25; i12 <= 32; i12++) {
            if (fArr[i12 - 1] < aVar2.f60811e) {
                i10++;
            }
        }
        if (fArr[89] < aVar2.f60811e) {
            i10++;
        }
        if (i10 >= 4) {
            return 6;
        }
        int i13 = 0;
        for (int i14 = 1; i14 <= 8; i14++) {
            if (fArr[i14 - 1] < aVar2.f60811e) {
                i13++;
            }
        }
        for (int i15 = 17; i15 <= 24; i15++) {
            if (fArr[i15 - 1] < aVar2.f60811e) {
                i13++;
            }
        }
        if (fArr[88] < aVar2.f60811e) {
            i13++;
        }
        if (i13 >= 4) {
            return 7;
        }
        int i16 = 0;
        int i17 = 68;
        while (i17 <= 74) {
            int i18 = i;
            if (fArr[i17 - 1] < aVar2.f60807a) {
                i16++;
            }
            i17++;
            i = i18;
        }
        int i19 = i;
        if (i16 >= 3) {
            StringBuffer stringBuffer3 = new StringBuffer("[");
            for (int i20 = 68; i20 <= 74; i20++) {
                int i21 = i20 - 1;
                if (fArr[i21] < aVar2.f60807a) {
                    stringBuffer3.append(i21);
                    stringBuffer3.append("-");
                    stringBuffer3.append(fArr[i21]);
                    stringBuffer3.append(Constants.SEPARATOR_COMMA);
                }
            }
            stringBuffer3.append(Constants.AES_SUFFIX);
            YtLogger.m84640o("o", m84679a("SHELTER_LEFT_FACE", stringBuffer3.toString(), aVar2.f60807a));
            return 1;
        }
        int i22 = i19;
        for (int i23 = 82; i23 <= 88; i23++) {
            if (fArr[i23 - 1] < aVar2.f60807a) {
                i22++;
            }
        }
        if (i22 >= 3) {
            StringBuffer stringBuffer4 = new StringBuffer("[");
            for (int i24 = 82; i24 <= 88; i24++) {
                int i25 = i24 - 1;
                if (fArr[i25] < aVar2.f60807a) {
                    stringBuffer4.append(i25);
                    stringBuffer4.append("-");
                    stringBuffer4.append(fArr[i25]);
                    stringBuffer4.append(Constants.SEPARATOR_COMMA);
                }
            }
            stringBuffer4.append(Constants.AES_SUFFIX);
            YtLogger.m84640o("o", m84679a("SHELTER_RIGHT_FACE", stringBuffer4.toString(), aVar2.f60807a));
            return 4;
        }
        int i26 = i19;
        for (int i27 = 75; i27 <= 81; i27++) {
            if (fArr[i27 - 1] < aVar2.f60809c) {
                i26++;
            }
        }
        if (i26 < 3) {
            return i19;
        }
        StringBuffer stringBuffer5 = new StringBuffer("[");
        for (int i28 = 75; i28 <= 81; i28++) {
            int i29 = i28 - 1;
            if (fArr[i29] < aVar2.f60809c) {
                stringBuffer5.append(i29);
                stringBuffer5.append("-");
                stringBuffer5.append(fArr[i29]);
                stringBuffer5.append(com.meituan.robust.Constants.PACKNAME_END);
            }
        }
        stringBuffer5.append(Constants.AES_SUFFIX);
        YtLogger.m84640o("o", m84679a("SHELTER_CHIN", stringBuffer5.toString(), aVar2.f60809c));
        return 2;
    }

    /* JADX INFO: renamed from: b */
    public static String m84686b(int i) {
        if (i == 1) {
            return StringCode.FL_NO_LEFT_FACE;
        }
        if (i == 2) {
            return StringCode.FL_NO_CHIN;
        }
        if (i == 3) {
            return StringCode.FL_NO_MOUTH;
        }
        if (i == 4) {
            return StringCode.FL_NO_RIGHT_FACE;
        }
        if (i == 5) {
            return StringCode.FL_NO_NOSE;
        }
        if (i == 6) {
            return StringCode.FL_NO_RIGHT_EYE;
        }
        return i == 7 ? StringCode.FL_NO_LEFT_EYE : "";
    }

    /* JADX INFO: renamed from: a */
    public static YTFaceTracker.TrackedFace[] m84685a(YTFaceTracker.TrackedFace[] trackedFaceArr) {
        for (int i = 0; i < trackedFaceArr.length; i++) {
            YTFaceTracker.TrackedFace trackedFace = trackedFaceArr[i];
            float[] fArr = trackedFace.faceShape;
            float[] fArr2 = new float[180];
            int[] iArr = {0, 4, 18, 19, 7, 8, 10, 11, 12, 14, 15, 21, 20};
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < 32) {
                fArr2[i3] = fArr[i4];
                i2++;
                i4++;
                i3++;
            }
            int i5 = 0;
            while (i5 < 32) {
                fArr2[i3] = fArr[i4];
                i5++;
                i4++;
                i3++;
            }
            float[] fArr3 = new float[44];
            int i6 = 0;
            while (i6 < 44) {
                fArr3[i6] = fArr[i4];
                i6++;
                i4++;
            }
            fArr3[16] = (fArr3[16] + fArr3[18]) / 2.0f;
            float f = fArr3[19];
            fArr3[19] = (f + f) / 2.0f;
            fArr3[28] = (fArr3[28] + fArr3[26]) / 2.0f;
            fArr3[29] = (fArr3[29] + fArr3[27]) / 2.0f;
            for (int i7 = 0; i7 < 13; i7++) {
                int i8 = i3 + 1;
                int i9 = iArr[i7];
                fArr2[i3] = fArr3[i9 * 2];
                i3 += 2;
                fArr2[i8] = fArr3[(i9 * 2) + 1];
            }
            int i10 = 0;
            while (i10 < 44) {
                fArr2[i3] = fArr[i4];
                i10++;
                i4++;
                i3++;
            }
            int i11 = 0;
            while (i11 < 82) {
                if ((i11 / 2) % 2 != 1) {
                    fArr2[i3] = fArr[i4];
                    i3++;
                }
                i11++;
                i4++;
            }
            int i12 = 0;
            while (i12 < 14) {
                i12++;
                i4++;
            }
            int i13 = 0;
            while (i13 < 4) {
                fArr2[i3] = fArr[i4];
                i13++;
                i4++;
                i3++;
            }
            trackedFace.faceShape = fArr2;
            YTFaceTracker.TrackedFace trackedFace2 = trackedFaceArr[i];
            float[] fArr4 = trackedFace2.faceVisible;
            float[] fArr5 = new float[90];
            int[] iArr2 = {0, 4, 18, 19, 7, 8, 10, 11, 12, 14, 15, 21, 20};
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i14 < 16) {
                fArr5[i15] = fArr4[i16];
                i14++;
                i16++;
                i15++;
            }
            int i17 = 0;
            while (i17 < 16) {
                fArr5[i15] = fArr4[i16];
                i17++;
                i16++;
                i15++;
            }
            float[] fArr6 = new float[22];
            int i18 = 0;
            while (i18 < 22) {
                fArr6[i18] = fArr4[i16];
                i18++;
                i16++;
            }
            fArr6[8] = (fArr6[8] + fArr6[9]) / 2.0f;
            fArr6[14] = (fArr6[14] + fArr6[13]) / 2.0f;
            int i19 = 0;
            while (i19 < 13) {
                fArr5[i15] = fArr6[iArr2[i19]];
                i19++;
                i15++;
            }
            int i20 = 0;
            while (i20 < 22) {
                fArr5[i15] = fArr4[i16];
                i20++;
                i16++;
                i15++;
            }
            int i21 = 0;
            while (i21 < 41) {
                if (i21 % 2 != 1) {
                    fArr5[i15] = fArr4[i16];
                    i15++;
                }
                i21++;
                i16++;
            }
            int i22 = 0;
            while (i22 < 7) {
                i22++;
                i16++;
            }
            int i23 = 0;
            while (i23 < 2) {
                fArr5[i15] = fArr4[i16];
                i23++;
                i16++;
                i15++;
            }
            trackedFace2.faceVisible = fArr5;
        }
        return trackedFaceArr;
    }

    /* JADX INFO: renamed from: a */
    public static Rect m84677a(YTFaceTracker.TrackedFace trackedFace) {
        float[] fArr = trackedFace.faceShape;
        float f = fArr[0];
        float fMax = fArr[1];
        float fMin = f;
        float fMax2 = fMin;
        float fMin2 = fMax;
        for (int i = 0; i < 180; i += 2) {
            fMin = Math.min(fMin, trackedFace.faceShape[i]);
            fMax2 = Math.max(fMax2, trackedFace.faceShape[i]);
            int i2 = i + 1;
            fMin2 = Math.min(fMin2, trackedFace.faceShape[i2]);
            fMax = Math.max(fMax, trackedFace.faceShape[i2]);
        }
        int i3 = f60805a;
        float f2 = i3 - 1;
        float f3 = f2 - fMin;
        float f4 = f2 - fMax2;
        float f5 = (float) (((double) f4) - ((((double) (f3 - f4)) * 0.1d) / 2.0d));
        float f6 = (float) (((double) f3) + ((((double) (f3 - f5)) * 0.1d) / 2.0d));
        float f7 = (float) (((double) fMin2) - ((((double) (fMax - fMin2)) * 0.1d) / 2.0d));
        float f8 = (float) (((double) fMax) + ((((double) (fMax - f7)) * 0.1d) / 2.0d));
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        float f9 = i3 - 1;
        if (f5 > f9) {
            f5 = f9;
        }
        float f10 = i3 - 1;
        if (f6 > f10) {
            f6 = f10;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        int i4 = f60806b;
        float f11 = i4 - 1;
        if (f7 > f11) {
            f7 = f11;
        }
        float f12 = i4 - 1;
        if (f8 > f12) {
            f8 = f12;
        }
        Rect rect = new Rect();
        rect.left = (int) f5;
        rect.top = (int) f7;
        rect.right = (int) f6;
        rect.bottom = (int) f8;
        return rect;
    }

    /* JADX INFO: renamed from: a */
    public static Rect m84676a(Rect rect, Rect rect2) {
        return new Rect(Math.max(rect.left, rect2.left), Math.max(rect.top, rect2.top), Math.min(rect.right, rect2.right), Math.min(rect.bottom, rect2.bottom));
    }

    /* JADX INFO: renamed from: a */
    public static String m84678a(int i) {
        if (i == 4) {
            return StringCode.FL_INCOMPLETE_FACE;
        }
        if (i == 2) {
            return StringCode.FL_POSE_CLOSER;
        }
        if (i == 3) {
            return StringCode.FL_POSE_FARER;
        }
        if (i == 5) {
            return StringCode.FL_POSE_INCORRECT;
        }
        if (i == 1) {
            return StringCode.FL_NO_FACE;
        }
        if (i == 6) {
            return StringCode.FL_POSE_OPEN_EYE;
        }
        if (i == 8) {
            return StringCode.FL_INCOMPLETE_FACE;
        }
        return i == 7 ? StringCode.FL_TOO_MANY_FACES : StringCode.FL_POSE_KEEP;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84683a(YTFaceTracker.TrackedFace trackedFace, float f, float f2, float f3) {
        float fAbs = Math.abs(trackedFace.yaw);
        float fAbs2 = Math.abs(trackedFace.pitch);
        float fAbs3 = Math.abs(trackedFace.roll);
        boolean z = fAbs <= f && fAbs2 <= f2 && fAbs3 <= f3;
        if (!z) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("face_angle_force_check_result", false);
                jSONObject2.put("angle_yaw", fAbs);
                jSONObject2.put("angle_pitch", fAbs2);
                jSONObject2.put("angle_roll", fAbs3);
                jSONObject2.put("angle_yaw_thr", f);
                jSONObject2.put("angle_pitch_thr", f2);
                jSONObject2.put("angle_roll_thr", f3);
                jSONObject.put("TraceType", "FaceAngleForceCheck");
                jSONObject.put("TraceData", jSONObject2);
            } catch (JSONException e) {
                YtLogger.m84638e("o", "make log json error", e);
            }
            YtLogger.m84640o("o", jSONObject);
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m84681a(Rect rect) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(rect.left);
        jSONArray.put(rect.top);
        jSONArray.put(rect.right);
        jSONArray.put(rect.bottom);
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m84682a(float[] fArr, boolean z) {
        JSONArray jSONArray = new JSONArray();
        for (float f : fArr) {
            if (z) {
                f *= 100.0f;
            }
            jSONArray.put(Math.round(f));
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public static String m84680a(YTFaceTracker.TrackedFace[] trackedFaceArr, int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("TraceType", "FaceTracker");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("detect_rect", m84681a(YtSDKKitFramework.getInstance().getDetectRect()));
            jSONObject2.put("pose_state", i2);
            jSONObject2.put("shelter_state", i);
            JSONArray jSONArray = new JSONArray();
            jSONObject2.put("faces", jSONArray);
            if (trackedFaceArr != null) {
                for (YTFaceTracker.TrackedFace trackedFace : trackedFaceArr) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONArray.put(jSONObject3);
                    jSONObject3.put("frameId", trackedFace.frameId);
                    jSONObject3.put("traceId", trackedFace.traceId);
                    jSONObject3.put("rect", m84681a(trackedFace.faceRect));
                    jSONObject3.put("points", m84682a(trackedFace.faceShape, false));
                    jSONObject3.put("visible", m84682a(trackedFace.faceVisible, true));
                    jSONObject3.put("angle_r", trackedFace.roll);
                    jSONObject3.put("angle_p", trackedFace.pitch);
                    jSONObject3.put("angle_y", trackedFace.yaw);
                }
            }
            jSONObject.put("TraceData", jSONObject2);
            YtLogger.m84637d("o", "TraceJson: " + jSONObject);
            jSONObject.put("TraceData", Base64.encodeToString(m84684a(jSONObject2.toString()), 2));
        } catch (JSONException e) {
            YtLogger.m84638e("o", "make log info error", e);
        }
        return jSONObject.toString();
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:15:0x0032 */
    /* JADX INFO: renamed from: a */
    public static byte[] m84684a(String str) throws Throwable {
        OutputStream outputStream;
        GZIPOutputStream gZIPOutputStream;
        OutputStream outputStream2 = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream.write(str.getBytes("UTF-8"));
                            gZIPOutputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            try {
                                gZIPOutputStream.close();
                                return byteArray;
                            } catch (IOException e) {
                                YtLogger.m84638e("o", " gzip.close(): ", e);
                                return byteArray;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            YtLogger.m84638e("o", "compress Exception e: ", e);
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e3) {
                                    YtLogger.m84638e("o", " gzip.close(): ", e3);
                                }
                            }
                            return null;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        gZIPOutputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        if (outputStream2 != null) {
                            try {
                                outputStream2.close();
                            } catch (IOException e5) {
                                YtLogger.m84638e("o", " gzip.close(): ", e5);
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream2 = outputStream;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m84679a(String str, String str2, float f) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("quality_type", str);
            jSONObject.put("quality_score", str2);
            jSONObject.put("quality_thr", f);
        } catch (JSONException e) {
            YtLogger.m84638e("o", "make log json error", e);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("TraceType", "FaceQuality");
            jSONObject2.put("TraceData", jSONObject);
        } catch (JSONException e2) {
            YtLogger.m84638e("o", "make log info error", e2);
        }
        return jSONObject2.toString();
    }
}
