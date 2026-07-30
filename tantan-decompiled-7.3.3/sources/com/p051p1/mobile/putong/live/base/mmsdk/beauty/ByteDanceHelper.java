package com.p051p1.mobile.putong.live.base.mmsdk.beauty;

import android.text.TextUtils;
import android.util.Pair;
import com.momo.mcamera.mask.facewarp.FaceBeautyID;
import p153l.v6m;

/* JADX INFO: loaded from: classes13.dex */
public class ByteDanceHelper {

    public enum MakeupStyleType {
        MAKEUP,
        FILTER
    }

    /* JADX INFO: renamed from: a */
    public static Pair<String, String> m69689a(int i) {
        switch (i) {
            case 1:
                return new Pair<>("Beauty_beautyLive", "smooth");
            case 2:
                return new Pair<>("Beauty_beautyLive", "whiten");
            case 3:
                return new Pair<>("Beauty_beautyLive", FaceBeautyID.SHARP);
            case 4:
                return new Pair<>("Reshape_ReshapeLive", "Internal_Deform_Eye");
            case 5:
                return new Pair<>("Reshape_ReshapeLive", "Internal_Deform_Overall");
            case 6:
                return new Pair<>("Reshape_ReshapeLive", "Internal_Deform_CutFace");
            case 7:
                return new Pair<>("Reshape_ReshapeLive", "Internal_Deform_Zoom_Cheekbone");
            case 8:
                return new Pair<>("Reshape_ReshapeLive", "Internal_Deform_Zoom_Jawbone");
            case 9:
                return new Pair<>("Reshape_ReshapeLive", "Internal_Deform_Forehead");
            case 10:
                return new Pair<>("Reshape_ReshapeLive", "Internal_Deform_Chin");
            case 11:
                return new Pair<>("Reshape_ReshapeLive", "Internal_Deform_Nose");
            case 12:
                return new Pair<>("Reshape_ReshapeLive", "Internal_Deform_MovNose");
            case 13:
                return new Pair<>("Reshape_ReshapeLive", "Internal_Deform_ZoomMouth");
            case 14:
                return new Pair<>("Reshape_beauty4Items", "BEF_BEAUTY_BRIGHTEN_EYE");
            case 15:
                return new Pair<>("Reshape_beauty4Items", "BEF_BEAUTY_REMOVE_POUCH");
            case 16:
                return new Pair<>("Reshape_beauty4Items", "BEF_BEAUTY_SMILES_FOLDS");
            case 17:
                return new Pair<>("Reshape_beauty4Items", "BEF_BEAUTY_WHITEN_TEETH");
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Pair<String, String> m69690b(int i, int i2) {
        if (i == 1) {
            return m69689a(i2);
        }
        if (i == 2) {
            return m69691c(i2);
        }
        if (i != 3) {
            return null;
        }
        return new Pair<>("MakeupStyle_" + m69692d(i2), null);
    }

    /* JADX INFO: renamed from: c */
    public static Pair<String, String> m69691c(int i) {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m69692d(int i) {
        switch (i) {
            case 1:
                return "QS";
            case 2:
                return "BX";
            case 3:
                return "SS";
            case 4:
                return "HX";
            case 5:
                return "CW";
            case 6:
                return "TM";
            case 7:
                return "ZG";
            case 8:
                return "NN";
            case 9:
                return "YQ";
            case 10:
                return "AD";
            case 11:
                return "DM";
            case 12:
                return "WN";
            case 13:
                return "OM";
            case 14:
                return "YY";
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m69693e(v6m v6mVar) {
        if (v6mVar != null) {
            v6mVar.removeMakeupStyle("Makeup_ALL", "Filter_ALL");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m69694f(v6m v6mVar, int i, float f) {
        Pair<String, String> pairM69690b = m69690b(1, i);
        if (pairM69690b == null || v6mVar == null) {
            return;
        }
        if (TextUtils.equals((CharSequence) pairM69690b.second, "whiten")) {
            f *= 0.6f;
        }
        v6mVar.mo69746e0((String) pairM69690b.first, (String) pairM69690b.second, f);
    }

    /* JADX INFO: renamed from: g */
    public static void m69695g(v6m v6mVar, int i, MakeupStyleType makeupStyleType, float f) {
        Pair<String, String> pairM69690b = m69690b(3, i);
        if (pairM69690b == null || v6mVar == null) {
            return;
        }
        if (makeupStyleType == MakeupStyleType.FILTER) {
            v6mVar.updateMakeupStyleValue((String) pairM69690b.first, "Filter_ALL", f);
        } else if (makeupStyleType == MakeupStyleType.MAKEUP) {
            v6mVar.updateMakeupStyleValue((String) pairM69690b.first, "Makeup_ALL", f);
        }
    }
}
