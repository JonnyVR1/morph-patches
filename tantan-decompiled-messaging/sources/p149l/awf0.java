package p149l;

import android.text.TextUtils;
import com.immomo.components.interfaces.IProcessOutput;
import com.immomo.moment.util.datadot.RecorderDataDotUtils;
import com.momo.mcamera.mask.facewarp.FaceBeautyID;
import com.momo.xengine.mestatistics.ReportType;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class awf0 {

    /* JADX INFO: renamed from: l.awf0$a */
    public static /* synthetic */ class C15739a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f72055a;

        static {
            int[] iArr = new int[IProcessOutput.ProcessType.values().length];
            f72055a = iArr;
            try {
                iArr[IProcessOutput.ProcessType.PROCESS_PREVIEW_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72055a[IProcessOutput.ProcessType.PROCESS_IMAGE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72055a[IProcessOutput.ProcessType.PROCESS_VIDEO_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m99281a(IProcessOutput.ProcessType processType, String str) {
        if (!TextUtils.isEmpty(str) && str.contains("makeup")) {
            String[] strArrSplit = str.split("/");
            if (strArrSplit.length > 1) {
                if (str.contains("makeup_style") && "makeup_style".equals(strArrSplit[strArrSplit.length - 2])) {
                    String str2 = strArrSplit[strArrSplit.length - 1];
                    if (!TextUtils.isEmpty(str2)) {
                        int i = C15739a.f72055a[processType.ordinal()];
                        if (i == 1) {
                            RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-use-makeup-style", System.currentTimeMillis(), ReportType.COUNT);
                            return "sdk-camera-engine-makeup-style-" + str2;
                        }
                        if (i == 2) {
                            RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-image-adapter-use-makeup-style", System.currentTimeMillis(), ReportType.COUNT);
                            return "sdk-camera-image-adapter-makeup-style-" + str2;
                        }
                        if (i == 3) {
                            RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-video-adapter-use-makeup-style", System.currentTimeMillis(), ReportType.COUNT);
                            return "sdk-camera-video-adapter-makeup-style-" + str2;
                        }
                    }
                } else {
                    String str3 = null;
                    for (int length = strArrSplit.length - 1; length >= 0; length--) {
                        if ("makeup".equals(strArrSplit[length]) && length < strArrSplit.length - 2) {
                            str3 = strArrSplit[length + 1];
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        int i2 = C15739a.f72055a[processType.ordinal()];
                        if (i2 == 1) {
                            RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-engine-use-makeup", System.currentTimeMillis(), ReportType.COUNT);
                            return "sdk-camera-engine-" + str3;
                        }
                        if (i2 == 2) {
                            RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-image-adapter-use-makeup", System.currentTimeMillis(), ReportType.COUNT);
                            return "sdk-camera-image-adapter-" + str3;
                        }
                        if (i2 == 3) {
                            RecorderDataDotUtils.getInstance().realTimeReport("sdk-camera-video-adapter-use-makeup", System.currentTimeMillis(), ReportType.COUNT);
                            return "sdk-camera-video-adapter-" + str3;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public static String m99282b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -2082927684:
                if (str.equals("beauty_eyeHeightValue")) {
                    b = 0;
                }
                break;
            case -1995606323:
                if (str.equals("beauty_lipThicknessValue")) {
                    b = 1;
                }
                break;
            case -1514131349:
                if (str.equals("beauty_noseTipSizeValue")) {
                    b = 2;
                }
                break;
            case -1481530413:
                if (str.equals("beauty_thinBodyValue")) {
                    b = 3;
                }
                break;
            case -1465098318:
                if (str.equals("beauty_foreheadValue")) {
                    b = 4;
                }
                break;
            case -1233082583:
                if (str.equals("beauty_jawShapelValue")) {
                    b = 5;
                }
                break;
            case -1002632830:
                if (str.equals("beauty_longLegValue")) {
                    b = 6;
                }
                break;
            case -951542482:
                if (str.equals("beauty_eyeDistanceValue")) {
                    b = 7;
                }
                break;
            case -853300578:
                if (str.equals("beauty_skinSharpenValue")) {
                    b = 8;
                }
                break;
            case -841918133:
                if (str.equals("beauty_faceWidthlValue")) {
                    b = 9;
                }
                break;
            case -627676229:
                if (str.equals("beauty_skinRuddyValue")) {
                    b = 10;
                }
                break;
            case -553772523:
                if (str.equals("beauty_noseWidthlValue")) {
                    b = 11;
                }
                break;
            case -513359092:
                if (str.equals("beauty_mouthSizeValue")) {
                    b = 12;
                }
                break;
            case -371504206:
                if (str.equals("beauty_cheekboneWidthValue")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case -316288832:
                if (str.equals("beauty_eyeBrightenValue")) {
                    b = 14;
                }
                break;
            case -308515363:
                if (str.equals("beauty_skinSmoothingValue")) {
                    b = 15;
                }
                break;
            case -211041288:
                if (str.equals("beauty_thinFaceValue")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case -176054888:
                if (str.equals("beauty_chinLengthlValue")) {
                    b = 17;
                }
                break;
            case 346291302:
                if (str.equals("beauty_eyeTiltValue")) {
                    b = 18;
                }
                break;
            case 381567901:
                if (str.equals("beauty_bigEyeValue")) {
                    b = 19;
                }
                break;
            case 577015072:
                if (str.equals("beauty_jaw2WidthValue")) {
                    b = 20;
                }
                break;
            case 850494973:
                if (str.equals("beauty_removePouchValue")) {
                    b = 21;
                }
                break;
            case 972863492:
                if (str.equals("beauty_nasolabiaFoldslValue")) {
                    b = 22;
                }
                break;
            case 1031702544:
                if (str.equals("beauty_noseLiftValue")) {
                    b = 23;
                }
                break;
            case 1459608308:
                if (str.equals("beauty_noseSizetValue")) {
                    b = 24;
                }
                break;
            case 1484805616:
                if (str.equals("beauty_smallFaceValue")) {
                    b = 25;
                }
                break;
            case 1621519826:
                if (str.equals("beauty_shortenFaceValue")) {
                    b = 26;
                }
                break;
            case 1626437949:
                if (str.equals("beauty_teethWhtienValue")) {
                    b = 27;
                }
                break;
            case 1655984012:
                if (str.equals("beauty_skinWhitenValue")) {
                    b = 28;
                }
                break;
            case 2056988608:
                if (str.equals("beauty_noseRidgeWidthValue")) {
                    b = 29;
                }
                break;
        }
        switch (b) {
            case 0:
                return "eyeHeight";
            case 1:
                return "lipThickness";
            case 2:
                return "noseTipSize";
            case 3:
                return "bodyWidth";
            case 4:
                return FaceBeautyID.FOREHEAD;
            case 5:
                return "jawShape";
            case 6:
                return "legLength";
            case 7:
                return "eyeDistance";
            case 8:
                return "sharpen";
            case 9:
                return "faceWidth";
            case 10:
                return "redden";
            case 11:
                return "noseWidth";
            case 12:
                return "mouthSize";
            case 13:
                return "cheekboneWidth";
            case 14:
                return "eye-brighten";
            case 15:
                return "smooth";
            case 16:
                return "thinFace";
            case 17:
                return "chinLength";
            case 18:
                return "eyeTilt";
            case 19:
                return "eyeSize";
            case 20:
                return "jaw2Width";
            case 21:
                return "remove-pouch";
            case 22:
                return "remove-nasolabial-floads";
            case 23:
                return "noseLift";
            case 24:
                return "noseSize";
            case 25:
                return "smallFace";
            case 26:
                return "shortenFace";
            case 27:
                return "teeth-whiten";
            case 28:
                return "white";
            case 29:
                return "noseRidgeWidth";
            default:
                return str;
        }
    }
}
