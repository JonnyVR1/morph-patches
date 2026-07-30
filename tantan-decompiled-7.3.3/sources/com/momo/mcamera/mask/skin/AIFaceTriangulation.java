package com.momo.mcamera.mask.skin;

import android.graphics.PointF;
import android.graphics.RectF;
import com.core.glcore.util.JsonUtil;
import com.momo.mcamera.mask.LandMarksEntity;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.wg3;

/* JADX INFO: loaded from: classes8.dex */
public class AIFaceTriangulation {
    public static int[] CXFaceTriangulationIndexes = {1, 0, 39, 1, 39, 50, 1, 50, 2, 0, 96, 19, 0, 19, 39, 2, 50, 49, 2, 49, 66, 2, 66, 3, 3, 66, 67, 3, 67, 4, 96, 97, 20, 96, 20, 19, 4, 67, 76, 4, 76, 5, 19, 20, 28, 19, 28, 39, 5, 76, 6, 20, 97, 21, 20, 21, 27, 20, 27, 28, 28, 27, 40, 28, 40, 39, 97, 98, 22, 97, 22, 21, 39, 40, 50, 40, 27, 41, 40, 41, 49, 40, 49, 50, 6, 76, 87, 6, 87, 7, 21, 22, 27, 27, 22, 26, 27, 26, 41, 41, 48, 49, 41, 26, 42, 41, 42, 48, 49, 48, 66, 48, 42, 47, 48, 47, 66, 42, 26, 43, 42, 43, 47, 26, 22, 23, 26, 23, 25, 26, 25, 43, 22, 98, 23, 7, 87, 86, 7, 86, 8, 98, 99, 23, 47, 43, 44, 47, 44, 46, 47, 46, 64, 47, 64, 65, 47, 65, 66, 43, 25, 44, 76, 67, 77, 76, 77, 88, 76, 88, 87, 46, 44, 45, 46, 45, 64, 25, 23, 24, 25, 24, 44, 44, 24, 63, 44, 63, 45, 23, 99, 24, 88, 77, 89, 88, 89, 95, 88, 95, 87, 45, 63, 64, 66, 65, 75, 66, 75, 67, 87, 95, 86, 77, 67, 78, 77, 78, 89, 67, 75, 68, 67, 68, 78, 8, 86, 85, 8, 85, 9, 24, 99, 100, 24, 100, 29, 24, 29, 74, 24, 74, 63, 65, 64, 72, 65, 72, 75, 86, 95, 94, 86, 94, 85, 95, 89, 90, 95, 90, 94, 89, 78, 90, 78, 68, 79, 78, 79, 90, 64, 63, 74, 64, 74, 73, 64, 73, 72, 68, 75, 69, 68, 69, 79, 75, 72, 71, 75, 71, 70, 75, 70, 69, 79, 69, 80, 79, 80, 90, 90, 80, 91, 90, 91, 93, 90, 93, 94, 94, 93, 84, 94, 84, 85, 85, 84, 10, 85, 10, 9, 69, 70, 80, 74, 29, 52, 74, 52, 51, 74, 51, 73, 73, 51, 62, 73, 62, 61, 73, 61, 72, 80, 70, 81, 80, 81, 91, 100, 101, 30, 100, 30, 29, 91, 81, 92, 91, 92, 93, 93, 92, 83, 93, 83, 84, 84, 83, 11, 84, 11, 10, 72, 61, 71, 29, 30, 38, 29, 38, 52, 70, 71, 15, 70, 15, 14, 70, 14, 82, 70, 82, 81, 81, 82, 92, 83, 92, 82, 83, 82, 12, 83, 12, 11, 51, 52, 62, 71, 61, 60, 71, 60, 59, 71, 59, 16, 71, 16, 15, 30, 101, 31, 30, 31, 37, 30, 37, 38, 52, 38, 53, 52, 53, 61, 52, 61, 62, 38, 37, 53, 82, 14, 13, 82, 13, 12, 53, 37, 54, 53, 54, 61, 61, 54, 60, 101, 102, 31, 31, 102, 32, 31, 32, 36, 31, 36, 37, 37, 36, 55, 37, 55, 54, 54, 55, 60, 60, 55, 59, 59, 55, 56, 59, 56, 58, 59, 58, 16, 55, 36, 56, 36, 32, 33, 36, 33, 35, 36, 35, 56, 32, 102, 33, 58, 56, 57, 58, 57, 17, 58, 17, 16, 56, 35, 57, 57, 35, 34, 57, 34, 18, 57, 18, 17, 102, 103, 33, 35, 33, 34, 33, 103, 34, 34, 103, 18};
    public static int[] CXFaceTriangulationIndexesWithCornerPoint = {0, 1, 96, 1, 2, 96, 22, 21, 96, 21, 20, 96, 20, 19, 96, 19, 0, 96, 24, 23, 29, 32, 33, 36, 33, 35, 36, 29, 30, 38, 30, 31, 38, 31, 37, 38, 31, 32, 37, 32, 36, 37, 33, 34, 35, 17, 18, 97, 18, 34, 97, 34, 33, 97, 33, 32, 97, 32, 31, 97, 31, 22, 97, 22, 96, 97, 30, 23, 31, 23, 22, 31, 29, 23, 30, 19, 20, 28, 20, 21, 28, 21, 27, 28, 21, 22, 27, 22, 26, 27, 22, 23, 26, 23, 25, 26, 1, 0, 39, 0, 19, 39, 19, 28, 39, 17, 16, 57, 51, 52, 62, 52, 61, 62, 52, 53, 61, 53, 60, 61, 53, 54, 60, 54, 55, 60, 55, 59, 60, 55, 58, 59, 58, 16, 59, 16, 15, 59, 55, 56, 58, 56, 57, 58, 57, 16, 58, 56, 35, 57, 35, 34, 57, 34, 18, 57, 18, 17, 57, 55, 36, 56, 36, 35, 56, 54, 36, 55, 53, 37, 54, 37, 36, 54, 52, 38, 53, 38, 37, 53, 51, 29, 52, 29, 38, 52, 45, 24, 63, 24, 29, 63, 29, 51, 74, 51, 73, 74, 73, 63, 74, 63, 29, 74, 4, 3, 66, 3, 2, 66, 2, 48, 66, 48, 65, 66, 6, 5, 76, 5, 4, 76, 4, 66, 76, 13, 12, 82, 6, 76, 87, 76, 77, 88, 77, 88, 89, 95, 88, 89, 87, 76, 88, 77, 78, 89, 86, 7, 87, 7, 6, 87, 85, 8, 86, 8, 7, 86, 79, 80, 90, 86, 87, 95, 87, 88, 95, 89, 90, 95, 79, 90, 89, 89, 79, 78, 90, 94, 95, 94, 85, 95, 85, 86, 95, 84, 10, 85, 10, 9, 85, 9, 8, 85, 80, 81, 91, 90, 91, 94, 91, 93, 94, 93, 84, 94, 84, 85, 94, 91, 92, 93, 93, 83, 92, 92, 91, 81, 83, 84, 93, 90, 80, 91, 83, 11, 84, 11, 10, 84, 81, 82, 92, 82, 83, 92, 82, 12, 83, 12, 11, 83, 81, 71, 82, 71, 14, 82, 14, 13, 82, 80, 70, 81, 70, 71, 81, 79, 69, 80, 69, 70, 80, 78, 68, 79, 68, 69, 79, 77, 67, 78, 67, 68, 78, 76, 66, 77, 66, 67, 77, 66, 65, 67, 60, 59, 71, 59, 15, 71, 15, 14, 71, 64, 63, 73, 51, 62, 73, 62, 61, 73, 61, 72, 73, 61, 60, 72, 60, 71, 72, 71, 70, 72, 68, 67, 75, 67, 65, 75, 65, 64, 75, 64, 73, 75, 73, 72, 75, 72, 70, 75, 70, 69, 75, 69, 68, 75, 48, 47, 65, 47, 64, 65, 47, 46, 64, 46, 45, 64, 45, 63, 64, 1, 39, 50, 39, 40, 50, 40, 49, 50, 49, 1, 50, 40, 41, 49, 41, 42, 49, 42, 48, 49, 48, 2, 49, 2, 1, 49, 42, 43, 48, 43, 47, 48, 43, 44, 47, 44, 46, 47, 44, 45, 46, 44, 24, 45, 43, 25, 44, 25, 24, 44, 42, 26, 43, 26, 25, 43, 41, 27, 42, 27, 26, 42, 40, 28, 41, 28, 27, 41, 39, 28, 40, 23, 24, 25, 9, 10, 98, 10, 11, 98, 11, 12, 98, 12, 13, 98, 13, 14, 98, 14, 15, 98, 15, 16, 98, 16, 17, 98, 17, 97, 98, 96, 2, 99, 2, 3, 99, 3, 4, 99, 4, 5, 99, 5, 6, 99, 6, 7, 99, 7, 8, 99, 8, 9, 99, 9, 98, 99};
    static int[] CXForeheadForSkinSmoothing = {3, 11, 10, 17, 23, 22, 44, 47, 63, 77, 78, 117, 116, 140, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, 153, 167, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 177, 178, 14, 19, 18, 30, 31, 41, 42, 59, 61, 80, 79, 108, 125, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, 154, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, 165, 176, 15, 21, 20, 25, 32, 34, 39, 43, 53, 60, 126, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, 149, 157, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 163, 166, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 109, 62};
    private static String ResourceIndices = "{\"landmarks\":[0.17381913959980011,0.36590975522994995,0.17343476414680481,0.45132774114608765,0.17952266335487366,0.53483086824417114,0.19504062831401825,0.61835271120071411,0.22000625729560852,0.69837069511413574,0.25672107934951782,0.77097654342651367,0.30425351858139038,0.83225393295288086,0.35966679453849792,0.88374727964401245,0.42392188310623169,0.92303907871246338,0.5,0.93746602535247803,0.57607811689376831,0.92303907871246338,0.64033317565917969,0.88374727964401245,0.69574648141860962,0.83225393295288086,0.74327892065048218,0.77097654342651367,0.7799949049949646,0.69837069511413574,0.80495935678482056,0.61835271120071411,0.82047736644744873,0.53483086824417114,0.8265652060508728,0.45132774114608765,0.82618087530136108,0.36590975522994995,0.24124883115291595,0.30859804153442383,0.27332773804664612,0.27773436903953552,0.31262305378913879,0.26756834983825684,0.35610780119895935,0.26917734742164612,0.3964601457118988,0.27981209754943848,0.42941209673881531,0.30895546078681946,0.39010274410247803,0.30991172790527344,0.35250547528266907,0.30544686317443848,0.31406915187835693,0.30341249704360962,0.27819451689720154,0.30576211214065552,0.5705878734588623,0.30895546078681946,0.60353982448577881,0.27981209754943848,0.64389216899871826,0.26917734742164612,0.68737697601318359,0.26756834983825684,0.72667229175567627,0.27773436903953552,0.75875115394592285,0.30859804153442383,0.72180545330047607,0.30576211214065552,0.68593084812164307,0.30341249704360962,0.64749455451965332,0.30544686317443848,0.60989725589752197,0.30991172790527344,0.28534296154975891,0.39112147688865662,0.30294102430343628,0.37785467505455017,0.32349219918251038,0.37033006548881531,0.34780508279800415,0.36749881505966187,0.37202772498130798,0.37081524729728699,0.39217227697372437,0.37998515367507935,0.40819764137268066,0.39611953496932983,0.38928008079528809,0.40417501330375671,0.36902889609336853,0.40866446495056152,0.34640586376190186,0.41022539138793945,0.32359415292739868,0.40777969360351562,0.30373907089233398,0.40177264809608459,0.59180235862731934,0.39611953496932983,0.60782772302627563,0.37998515367507935,0.62797224521636963,0.37081524729728699,0.65219491720199585,0.36749881505966187,0.67650783061981201,0.37033006548881531,0.69705897569656372,0.37785467505455017,0.7146570086479187,0.39112147688865662,0.69626092910766602,0.40177264809608459,0.67640584707260132,0.40777969360351562,0.65359413623809814,0.41022539138793945,0.63097107410430908,0.40866446495056152,0.61071991920471191,0.40417501330375671,0.45767068862915039,0.38329803943634033,0.4549601674079895,0.45272812247276306,0.44386601448059082,0.5192297101020813,0.40819764137268066,0.55948829650878906,0.41915586590766907,0.60649454593658447,0.47767460346221924,0.6165691614151001,0.52232539653778076,0.6165691614151001,0.58084416389465332,0.60649454593658447,0.59180235862731934,0.55948829650878906,0.55613398551940918,0.5192297101020813,0.5450398325920105,0.45272812247276306,0.54232931137084961,0.38329803943634033,0.5,0.56499141454696655,0.37769374251365662,0.72207772731781006,0.41271290183067322,0.69964921474456787,0.45415157079696655,0.685555100440979,0.5,0.68645507097244263,0.54584842920303345,0.685555100440979,0.58728712797164917,0.69964921474456787,0.622306227684021,0.72207772731781006,0.59076994657516479,0.76110583543777466,0.55109494924545288,0.78622734546661377,0.5,0.79547578096389771,0.44890508055686951,0.78622734546661377,0.40923008322715759,0.76110583543777466,0.40211796760559082,0.7258874773979187,0.4501953125,0.71846014261245728,0.5,0.71899807453155518,0.5498046875,0.71846014261245728,0.59788203239440918,0.7258874773979187,0.55061328411102295,0.73992770910263062,0.5,0.74535119533538818,0.44938671588897705,0.73992770910263062,0.20532616972923279,0.19155703485012054,0.27824842929840088,0.14062969386577606,0.36244061589241028,0.10667707026004791,0.45339569449424744,0.089701056480407715,0.54660427570343018,0.089701056480407715,0.63755935430526733,0.10667707026004791,0.72175157070159912,0.14062969386577606,0.79467380046844482,0.19155703485012054]}";
    private static LandMarksEntity sourceLandMark;
    int[] CXFaceLipsTrianglesIndices = {55, 56, 64, 66, 72, 70, 87, 83, 89, 99, 100, 103, 104, 115, 118, 120, 121, 131, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, 84};
    int[] CXFaceInsideMouthTrianglesIndices = {65, 86, 85, 102, 101, 119};
    int[] CXFaceEyeTrianglesIndices = {24, 26, 27, 33, 35, 37, 40, 48, 49, 57, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, 144, 150, 151, 158, 159, 160, 161, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256};
    int[] CXFaceLipsSamplePointsIndices = {76, 88, 77, 88, 77, 89, 78, 89, 78, 90, 79, 91, 79, 90, 80, 91, 80, 90, 80, 92, 81, 91, 81, 92, 82, 92, 83, 93, 83, 92, 84, 94, 84, 93, 85, 93, 85, 94, 85, 95, 86, 95, 86, 94, 86, 88, 87, 95, 87, 88};
    int[] CXFaceEyesSampleLeftPointsIndices = {39, 45, 40, 50, 41, 49, 42, 48, 43, 47, 44, 46};
    int[] CXFaceEyesSampleRightPointsIndices = {51, 57, 52, 62, 53, 61, 54, 60, 55, 59, 56, 58};

    public static class Util {
        private Util() {
        }

        private static void curve4(PointF[] pointFArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            int i = 0;
            pointFArr[0] = new PointF(f, f2);
            float f9 = (f - (f3 * 2.0f)) + f5;
            float f10 = (f2 - (2.0f * f4)) + f6;
            float f11 = (((f3 - f5) * 3.0f) - f) + f7;
            float f12 = (((f4 - f6) * 3.0f) - f2) + f8;
            float f13 = ((f3 - f) * 0.42857146f) + (f9 * 0.061224494f) + (f11 * 0.0029154522f);
            float f14 = ((f4 - f2) * 0.42857146f) + (0.061224494f * f10) + (0.0029154522f * f12);
            float f15 = f11 * 0.017492713f;
            float f16 = (f9 * 0.12244899f) + f15;
            float f17 = f12 * 0.017492713f;
            float f18 = (f10 * 0.12244899f) + f17;
            while (true) {
                int i2 = i + 1;
                if (i >= 6) {
                    pointFArr[7] = new PointF(f7, f8);
                    return;
                }
                f += f13;
                f2 += f14;
                f13 += f16;
                f14 += f18;
                f16 += f15;
                f18 += f17;
                pointFArr[i2] = new PointF(f, f2);
                i = i2;
            }
        }

        private static float[] extend96Points(float[] fArr) {
            float[] fArr2 = new float[200];
            System.arraycopy(fArr, 0, fArr2, 0, 96);
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            interuptPoints(fArr, fArr3, fArr4, 66, 49, 2.4f, 0);
            interuptPoints(fArr, fArr3, fArr4, 66, 45, 3.46f, 1);
            interuptPoints(fArr, fArr3, fArr4, 71, 51, 3.46f, 2);
            interuptPoints(fArr, fArr3, fArr4, 71, 59, 2.4f, 3);
            System.arraycopy(fArr3, 0, fArr2, 96, 4);
            System.arraycopy(fArr, 96, fArr2, 100, 96);
            System.arraycopy(fArr4, 0, fArr2, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4);
            return fArr2;
        }

        private static void interuptPoints(float[] fArr, float[] fArr2, float[] fArr3, int i, int i2, float f, int i3) {
            float f2 = fArr[i2];
            float f3 = fArr[i];
            int i4 = i + 96;
            float f4 = fArr[i2 + 96] - fArr[i4];
            fArr2[i3] = f3 + ((f2 - f3) * f);
            fArr3[i3] = fArr[i4] + (f * f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static float[] landmark96To104(float[] fArr) {
            if (fArr.length != 192) {
                return new float[0];
            }
            float[] fArr2 = new float[208];
            System.arraycopy(fArr, 0, fArr2, 0, 192);
            System.arraycopy(new float[]{0.15690625f, 0.21404395f, 0.255417f, 0.15401465f, 0.35002735f, 0.112371095f, 0.44257325f, 0.08943467f, 0.5348916f, 0.08552559f, 0.6288174f, 0.10096582f, 0.72618943f, 0.1360752f, 0.8288418f, 0.19117676f}, 0, fArr2, 192, 16);
            return fArr2;
        }
    }

    public static float[][] getFaceLocalTriangulation(float[] fArr, int[] iArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            for (int i = 0; i < CXFaceTriangulationIndexes.length; i++) {
                if (!Arrays.asList(iArr).contains(Integer.valueOf(i / 3))) {
                    arrayList.add(Integer.valueOf(CXFaceTriangulationIndexes[i]));
                }
            }
        } else {
            for (int i2 = 0; i2 < CXFaceTriangulationIndexes.length; i2++) {
                if (Arrays.asList(iArr).contains(Integer.valueOf(i2 / 3))) {
                    arrayList.add(Integer.valueOf(CXFaceTriangulationIndexes[i2]));
                }
            }
        }
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 3, arrayList.size() * 2);
        float[] fArr3 = new float[arrayList.size() * 2];
        float[] fArr4 = new float[arrayList.size() * 2];
        float[] fArr5 = new float[arrayList.size() * 2];
        if (sourceLandMark == null) {
            sourceLandMark = (LandMarksEntity) JsonUtil.getInstance().fromJson(ResourceIndices, LandMarksEntity.class);
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            float f = fArr[((Integer) arrayList.get(i3)).intValue()];
            float f2 = fArr[((Integer) arrayList.get(i3)).intValue() + 104];
            int i4 = i3 * 2;
            fArr3[i4] = (f * 2.0f) - 1.0f;
            int i5 = i4 + 1;
            fArr3[i5] = -((2.0f * f2) - 1.0f);
            fArr4[i4] = f;
            fArr4[i5] = 1.0f - f2;
            fArr5[i4] = sourceLandMark.getLandmarks()[((Integer) arrayList.get(i3)).intValue() * 2];
            fArr5[i5] = sourceLandMark.getLandmarks()[(((Integer) arrayList.get(i3)).intValue() * 2) + 1];
        }
        fArr2[0] = fArr3;
        fArr2[1] = fArr4;
        fArr2[2] = fArr5;
        return fArr2;
    }

    public static float[][] getFaceSkinHead(float[] fArr, boolean z) {
        if (fArr == null) {
            return null;
        }
        return getFaceLocalTriangulation(fArr, CXForeheadForSkinSmoothing, false);
    }

    public static float[][] getFaceTriangulation(float[] fArr, int i, int i2, float[] fArr2) {
        float[] fArrLandmark96To104;
        if (fArr2 == null) {
            if (sourceLandMark == null) {
                sourceLandMark = (LandMarksEntity) JsonUtil.getInstance().fromJson(ResourceIndices, LandMarksEntity.class);
            }
            fArrLandmark96To104 = sourceLandMark.getLandmarks();
        } else {
            fArrLandmark96To104 = fArr2;
        }
        if (fArrLandmark96To104.length == 192) {
            fArrLandmark96To104 = Util.landmark96To104(fArrLandmark96To104);
        }
        float[][] fArr3 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 3, CXFaceTriangulationIndexes.length * 2);
        int[] iArr = CXFaceTriangulationIndexes;
        float[] fArr4 = new float[iArr.length * 2];
        float[] fArr5 = new float[iArr.length * 2];
        float[] fArr6 = new float[iArr.length * 2];
        int length = fArr.length;
        int i3 = 0;
        while (true) {
            int[] iArr2 = CXFaceTriangulationIndexes;
            if (i3 >= iArr2.length) {
                fArr3[0] = fArr4;
                fArr3[1] = fArr5;
                fArr3[2] = fArr6;
                return fArr3;
            }
            int i4 = iArr2[i3];
            float f = fArr[i4] / i;
            float f2 = fArr[i4 + 104] / i2;
            int i5 = i3 * 2;
            fArr5[i5] = f;
            int i6 = i5 + 1;
            fArr5[i6] = 1.0f - f2;
            fArr4[i5] = (f * 2.0f) - 1.0f;
            fArr4[i6] = -((f2 * 2.0f) - 1.0f);
            int i7 = i4 * 2;
            fArr6[i5] = fArrLandmark96To104[i7];
            fArr6[i6] = fArrLandmark96To104[i7 + 1];
            i3++;
        }
    }

    public static float[][] getFaceTriangulationBoundingBox(float[][] fArr, int i, int i2) {
        char c = 2;
        boolean z = true;
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2, 8);
        float f = i;
        float f2 = i2;
        if (fArr == null || fArr.length <= 0) {
            wg3.m206174a("104点为空");
            return null;
        }
        int length = fArr[0].length / 2;
        float fMax = -1.0f;
        int i3 = 0;
        float fMin = f;
        float fMin2 = f2;
        float fMax2 = -1.0f;
        while (i3 < fArr.length) {
            float[] fArr3 = fArr[i3];
            char c2 = c;
            int i4 = 0;
            while (i4 < fArr3.length / 2) {
                fMin = Math.min(fArr3[i4], fMin);
                int i5 = i4 + length;
                fMin2 = Math.min(fArr3[i5], fMin2);
                fMax2 = Math.max(fArr3[i4], fMax2);
                fMax = Math.max(fArr3[i5], fMax);
                i4++;
                z = z;
            }
            i3++;
            c = c2;
        }
        char c3 = c;
        boolean z2 = z;
        float f3 = fMin / f;
        float f4 = fMin2 / f2;
        float f5 = 1.0f - f4;
        float f6 = fMax / f2;
        float f7 = 1.0f - f6;
        float f8 = fMax2 / f;
        float[] fArr4 = new float[8];
        fArr4[0] = f3;
        fArr4[z2 ? 1 : 0] = f5;
        fArr4[c3] = f3;
        fArr4[3] = f7;
        fArr4[4] = f8;
        fArr4[5] = f5;
        fArr4[6] = f8;
        fArr4[7] = f7;
        float f9 = (f3 * 2.0f) - 1.0f;
        float f10 = -((f4 * 2.0f) - 1.0f);
        float f11 = -((f6 * 2.0f) - 1.0f);
        float f12 = (f8 * 2.0f) - 1.0f;
        float[] fArr5 = new float[8];
        fArr5[0] = f9;
        fArr5[z2 ? 1 : 0] = f10;
        fArr5[c3] = f9;
        fArr5[3] = f11;
        fArr5[4] = f12;
        fArr5[5] = f10;
        fArr5[6] = f12;
        fArr5[7] = f11;
        fArr2[0] = fArr5;
        fArr2[z2 ? 1 : 0] = fArr4;
        return fArr2;
    }

    public static float getFaceTriangulationWidth(float[] fArr, float f) {
        if (fArr == null || fArr.length == 0) {
            wg3.m206174a("104点为空");
            return 0.0f;
        }
        return (float) (Math.sqrt(Math.pow(fArr[0] - fArr[18], 2.0d) + Math.pow(fArr[104] - fArr[122], 2.0d)) * ((double) f));
    }

    public static float[][] getFaceTriangulationWithCornerPoint(float[] fArr, float[] fArr2) {
        float[][] fArr3 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 3, CXFaceTriangulationIndexesWithCornerPoint.length * 2);
        int[] iArr = CXFaceTriangulationIndexesWithCornerPoint;
        float[] fArr4 = new float[iArr.length * 2];
        float[] fArr5 = new float[iArr.length * 2];
        float[] fArr6 = new float[iArr.length * 2];
        int i = 0;
        while (true) {
            int[] iArr2 = CXFaceTriangulationIndexesWithCornerPoint;
            if (i >= iArr2.length) {
                fArr3[0] = fArr4;
                fArr3[1] = fArr5;
                fArr3[2] = fArr6;
                return fArr3;
            }
            int i2 = iArr2[i] * 2;
            float f = fArr[i2];
            int i3 = i2 + 1;
            float f2 = fArr[i3];
            int i4 = i * 2;
            fArr5[i4] = f;
            int i5 = i4 + 1;
            fArr5[i5] = 1.0f - f2;
            fArr4[i4] = (f * 2.0f) - 1.0f;
            fArr4[i5] = -((f2 * 2.0f) - 1.0f);
            fArr6[i4] = fArr2[i2];
            fArr6[i5] = fArr2[i3];
            i++;
        }
    }

    public static float[][] getfaceSkinBelowHead(float[] fArr, boolean z) {
        if (fArr == null) {
            return null;
        }
        return getFaceLocalTriangulation(fArr, CXForeheadForSkinSmoothing, true);
    }

    public static void setSourceLandMark(float[] fArr) {
        if (sourceLandMark == null) {
            sourceLandMark = new LandMarksEntity();
        }
        sourceLandMark.setLandmarks(fArr);
    }

    public RectF[] getFaceLocalBoundingBox(float[] fArr, int[] iArr) {
        float[][] faceLocalTriangulation = getFaceLocalTriangulation(fArr, iArr);
        RectF[] rectFArr = new RectF[faceLocalTriangulation.length];
        for (int i = 0; i < faceLocalTriangulation.length; i++) {
            float fMax = -1.0f;
            int i2 = 0;
            float fMin = 1.0f;
            float fMin2 = 1.0f;
            float fMax2 = -1.0f;
            while (true) {
                float[] fArr2 = faceLocalTriangulation[i];
                if (i2 < fArr2.length / 2) {
                    int i3 = i2 * 2;
                    fMin = Math.min(fArr2[i3], fMin);
                    int i4 = i3 + 1;
                    fMin2 = Math.min(faceLocalTriangulation[i][i4], fMin2);
                    fMax = Math.max(faceLocalTriangulation[i][i3], fMax);
                    fMax2 = Math.max(faceLocalTriangulation[i][i4], fMax2);
                    i2++;
                }
            }
            rectFArr[i].set(fMin, fMin2, fMax, fMax2);
        }
        return rectFArr;
    }

    public float[] landMark104ToPoint(float[] fArr, int i, int i2) {
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        int i3 = 0;
        while (true) {
            int i4 = length / 2;
            if (i3 >= i4) {
                return fArr2;
            }
            fArr2[i3] = fArr[i3] / i;
            int i5 = i4 + i3;
            fArr2[i5] = fArr[i5] / i2;
            i3++;
        }
    }

    public float[] sampleTextureCoordinatesBetweenVertexIndices(int[] iArr, float[] fArr) {
        int length = iArr.length / 2;
        int length2 = fArr.length / 2;
        float[] fArr2 = new float[length * 2];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int i3 = iArr[i2];
            int i4 = i2 + 1;
            int i5 = iArr[i4];
            PointF pointF = new PointF(fArr[i3], fArr[i3 + length2]);
            PointF pointF2 = new PointF(fArr[i5], fArr[i5 + length2]);
            PointF pointF3 = new PointF((pointF.x + pointF2.x) * 0.5f, (pointF.y + pointF2.y) * 0.5f);
            fArr2[i2] = pointF3.x;
            fArr2[i4] = 1.0f - pointF3.y;
        }
        return fArr2;
    }

    public static float getFaceTriangulationWidth(float[] fArr) {
        if (fArr != null && fArr.length != 0) {
            return Math.abs(fArr[0] - fArr[18]);
        }
        wg3.m206174a("104点为空");
        return 0.0f;
    }

    public static float[][] getFaceTriangulation(float[] fArr) {
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 3, CXFaceTriangulationIndexes.length * 2);
        int[] iArr = CXFaceTriangulationIndexes;
        float[] fArr3 = new float[iArr.length * 2];
        float[] fArr4 = new float[iArr.length * 2];
        float[] fArr5 = new float[iArr.length * 2];
        int length = fArr.length;
        if (sourceLandMark == null) {
            sourceLandMark = (LandMarksEntity) JsonUtil.getInstance().fromJson(ResourceIndices, LandMarksEntity.class);
        }
        int i = 0;
        while (true) {
            int[] iArr2 = CXFaceTriangulationIndexes;
            if (i < iArr2.length) {
                int i2 = iArr2[i];
                float f = fArr[i2];
                float f2 = fArr[i2 + 104];
                int i3 = i * 2;
                fArr4[i3] = f;
                int i4 = i3 + 1;
                fArr4[i4] = 1.0f - f2;
                fArr3[i3] = (f * 2.0f) - 1.0f;
                fArr3[i4] = -((f2 * 2.0f) - 1.0f);
                int i5 = i2 * 2;
                fArr5[i3] = sourceLandMark.getLandmarks()[i5];
                fArr5[i4] = sourceLandMark.getLandmarks()[i5 + 1];
                i++;
            } else {
                fArr2[0] = fArr3;
                fArr2[1] = fArr4;
                fArr2[2] = fArr5;
                return fArr2;
            }
        }
    }

    public float[][] getFaceTriangulationBoundingBox(float[][] fArr) {
        int i = 2;
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2, 8);
        int length = fArr.length / 2;
        if (fArr.length != 0) {
            float fMax = -1.0f;
            float fMin = 1.0f;
            float fMin2 = 1.0f;
            float fMax2 = -1.0f;
            for (int i2 = 0; i2 < fArr.length; i2++) {
                float[] fArr3 = fArr[i2];
                int i3 = 0;
                while (i3 < fArr3.length / i) {
                    fMin = Math.min(fArr3[i2], fMin);
                    int i4 = i2 + length;
                    fMin2 = Math.min(fArr3[i4], fMin2);
                    fMax2 = Math.max(fArr3[i2], fMax2);
                    fMax = Math.max(fArr3[i4], fMax);
                    i3++;
                    i = i;
                }
            }
            int i5 = i;
            float f = 1.0f - fMin2;
            float f2 = 1.0f - fMax;
            float[] fArr4 = new float[8];
            fArr4[0] = fMin;
            fArr4[1] = f;
            fArr4[i5] = fMin;
            fArr4[3] = f2;
            fArr4[4] = fMax2;
            fArr4[5] = f;
            fArr4[6] = fMax2;
            fArr4[7] = f2;
            float f3 = (fMin * 2.0f) - 1.0f;
            float f4 = -((fMin2 * 2.0f) - 1.0f);
            float f5 = -((fMax * 2.0f) - 1.0f);
            float f6 = (fMax2 * 2.0f) - 1.0f;
            float[] fArr5 = new float[8];
            fArr5[0] = f3;
            fArr5[1] = f4;
            fArr5[i5] = f3;
            fArr5[3] = f5;
            fArr5[4] = f6;
            fArr5[5] = f4;
            fArr5[6] = f6;
            fArr5[7] = f5;
            fArr2[0] = fArr5;
            fArr2[1] = fArr4;
            return fArr2;
        }
        wg3.m206174a("104点为空");
        return null;
    }

    public float[][] getFaceLocalTriangulation(float[] fArr, int[] iArr) {
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2, iArr.length * 6);
        float[] fArr3 = new float[iArr.length * 6];
        float[] fArr4 = new float[iArr.length * 6];
        int length = fArr.length / 2;
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            int[] iArr2 = CXFaceTriangulationIndexes;
            int i3 = i2 * 3;
            int i4 = iArr2[i3];
            int i5 = iArr2[i3 + 1];
            int i6 = iArr2[i3 + 2];
            float f = fArr[i4];
            float f2 = fArr[i4 + length];
            float f3 = fArr[i5];
            float f4 = fArr[i5 + length];
            float f5 = fArr[i6];
            float f6 = fArr[i6 + length];
            int i7 = i * 6;
            fArr4[i7] = f;
            int i8 = i7 + 1;
            fArr4[i8] = 1.0f - f2;
            int i9 = i7 + 2;
            fArr4[i9] = f3;
            int i10 = i7 + 3;
            fArr4[i10] = 1.0f - f4;
            int i11 = i7 + 4;
            fArr4[i11] = f5;
            int i12 = i7 + 5;
            fArr4[i12] = 1.0f - f6;
            fArr3[i7] = (f * 2.0f) - 1.0f;
            fArr3[i8] = -((f2 * 2.0f) - 1.0f);
            fArr3[i9] = (f3 * 2.0f) - 1.0f;
            fArr3[i10] = -((f4 * 2.0f) - 1.0f);
            fArr3[i11] = (f5 * 2.0f) - 1.0f;
            fArr3[i12] = -((f6 * 2.0f) - 1.0f);
        }
        fArr2[0] = fArr3;
        fArr2[1] = fArr4;
        return fArr2;
    }
}
