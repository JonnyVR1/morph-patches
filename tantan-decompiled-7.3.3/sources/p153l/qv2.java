package p153l;

import android.text.TextUtils;
import com.momo.mcamera.mask.facewarp.FaceBeautyID;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class qv2 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static String m178246a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -2074084917:
                if (str.equals(FaceBeautyID.LONG_LEG)) {
                    b = 0;
                }
                break;
            case -1909125093:
                if (str.equals("skin_whitening")) {
                    b = 1;
                }
                break;
            case -1778074569:
                if (str.equals(FaceBeautyID.SHORTEN_FACE)) {
                    b = 2;
                }
                break;
            case -1773452459:
                if (str.equals("remove_nasolabial_floads")) {
                    b = 3;
                }
                break;
            case -1628714671:
                if (str.equals("skin_sharpen")) {
                    b = 4;
                }
                break;
            case -1623653372:
                if (str.equals("smallFace")) {
                    b = 5;
                }
                break;
            case -1535860719:
                if (str.equals(FaceBeautyID.NOSE_TIP_SIZE)) {
                    b = 6;
                }
                break;
            case -1533535109:
                if (str.equals(FaceBeautyID.CHIN_LENGTH)) {
                    b = 7;
                }
                break;
            case -1368180725:
                if (str.equals(FaceBeautyID.EYE_TILT)) {
                    b = 8;
                }
                break;
            case -1267031660:
                if (str.equals("skin_ruddy")) {
                    b = 9;
                }
                break;
            case -1264048366:
                if (str.equals(FaceBeautyID.SLIMMING)) {
                    b = 10;
                }
                break;
            case -909026571:
                if (str.equals(FaceBeautyID.EYE_HEIGHT)) {
                    b = 11;
                }
                break;
            case -703956925:
                if (str.equals(FaceBeautyID.THIN_FACE)) {
                    b = 12;
                }
                break;
            case -661836207:
                if (str.equals(FaceBeautyID.CHEEKBONE_WIDTH)) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case -615484559:
                if (str.equals("eye_brighten")) {
                    b = 14;
                }
                break;
            case -601696592:
                if (str.equals("skin_smooth")) {
                    b = 15;
                }
                break;
            case -524346813:
                if (str.equals(FaceBeautyID.EYE_DISTANCE)) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case -513644096:
                if (str.equals("remove_pouch")) {
                    b = 17;
                }
                break;
            case -114837902:
                if (str.equals(FaceBeautyID.BIG_EYE)) {
                    b = 18;
                }
                break;
            case 5190850:
                if (str.equals(FaceBeautyID.JAW_SHAPE)) {
                    b = 19;
                }
                break;
            case 8917735:
                if (str.equals(FaceBeautyID.JAW_WIDTH)) {
                    b = 20;
                }
                break;
            case 109400042:
                if (str.equals(FaceBeautyID.SHARP)) {
                    b = 21;
                }
                break;
            case 202065094:
                if (str.equals(FaceBeautyID.NOSE_RIDGE_WIDTH)) {
                    b = 22;
                }
                break;
            case 466885788:
                if (str.equals(FaceBeautyID.FOREHEAD)) {
                    b = 23;
                }
                break;
            case 893232119:
                if (str.equals(FaceBeautyID.NOSE_LIFT)) {
                    b = 24;
                }
                break;
            case 893441261:
                if (str.equals(FaceBeautyID.NOSE_SIZE)) {
                    b = 25;
                }
                break;
            case 922053988:
                if (str.equals(FaceBeautyID.FACE_WIDTH)) {
                    b = 26;
                }
                break;
            case 1449441480:
                if (str.equals(FaceBeautyID.LIP_THICKNESS)) {
                    b = 27;
                }
                break;
            case 1889227772:
                if (str.equals("teeth_whiten")) {
                    b = 28;
                }
                break;
            case 1930548826:
                if (str.equals(FaceBeautyID.NOSE_WIDTH)) {
                    b = 29;
                }
                break;
            case 1981169785:
                if (str.equals(FaceBeautyID.MOUTH_SIZE)) {
                    b = 30;
                }
                break;
        }
        switch (b) {
            case 0:
                return "beauty_longLegValue";
            case 1:
                return "beauty_skinWhitenValue";
            case 2:
                return "beauty_shortenFaceValue";
            case 3:
                return "beauty_nasolabiaFoldslValue";
            case 4:
                return "beauty_skinSharpenValue";
            case 5:
                return "beauty_smallFaceValue";
            case 6:
                return "beauty_noseTipSizeValue";
            case 7:
                return "beauty_chinLengthlValue";
            case 8:
                return "beauty_eyeTiltValue";
            case 9:
                return "beauty_skinRuddyValue";
            case 10:
                return "beauty_thinBodyValue";
            case 11:
                return "beauty_eyeHeightValue";
            case 12:
                return "beauty_thinFaceValue";
            case 13:
                return "beauty_cheekboneWidthValue";
            case 14:
                return "beauty_eyeBrightenValue";
            case 15:
                return "beauty_skinSmoothingValue";
            case 16:
                return "beauty_eyeDistanceValue";
            case 17:
                return "beauty_removePouchValue";
            case 18:
                return "beauty_bigEyeValue";
            case 19:
                return "beauty_jawShapelValue";
            case 20:
                return "beauty_jaw2WidthValue";
            case 21:
                return FaceBeautyID.SHARP;
            case 22:
                return "beauty_noseRidgeWidthValue";
            case 23:
                return "beauty_foreheadValue";
            case 24:
                return "beauty_noseLiftValue";
            case 25:
                return "beauty_noseSizetValue";
            case 26:
                return "beauty_faceWidthlValue";
            case 27:
                return "beauty_lipThicknessValue";
            case 28:
                return "beauty_teethWhtienValue";
            case 29:
                return "beauty_noseWidthlValue";
            case 30:
                return "beauty_mouthSizeValue";
            default:
                return str;
        }
    }
}
