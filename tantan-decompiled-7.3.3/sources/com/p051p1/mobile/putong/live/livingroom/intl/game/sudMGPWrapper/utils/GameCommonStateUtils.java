package com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.utils;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.SudMGPMGState;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes5.dex */
public class GameCommonStateUtils {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static String i18nPrecise(String str, SudMGPMGState.MGCommonPublicMessage.MGCommonPublicMessageMsgText mGCommonPublicMessageMsgText) {
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case 93023594:
                if (str.equals("ar-SA")) {
                    b = 0;
                }
                break;
            case 96598143:
                if (str.equals("en-GB")) {
                    b = 1;
                }
                break;
            case 96598594:
                if (str.equals("en-US")) {
                    b = 2;
                }
                break;
            case 96747053:
                if (str.equals("es-ES")) {
                    b = 3;
                }
                break;
            case 99994381:
                if (str.equals("id-ID")) {
                    b = 4;
                }
                break;
            case 100828572:
                if (str.equals("ja-JP")) {
                    b = 5;
                }
                break;
            case 102169200:
                if (str.equals("ko-KR")) {
                    b = 6;
                }
                break;
            case 104135123:
                if (str.equals("ms-BN")) {
                    b = 7;
                }
                break;
            case 104135475:
                if (str.equals("ms-MY")) {
                    b = 8;
                }
                break;
            case 110272621:
                if (str.equals("th-TH")) {
                    b = 9;
                }
                break;
            case 110570541:
                if (str.equals("tr-TR")) {
                    b = 10;
                }
                break;
            case 111493931:
                if (str.equals("ur-PK")) {
                    b = 11;
                }
                break;
            case 112149522:
                if (str.equals("vi-VN")) {
                    b = 12;
                }
                break;
            case 115813226:
                if (str.equals("zh-CN")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 115813378:
                if (str.equals("zh-HK")) {
                    b = 14;
                }
                break;
            case 115813537:
                if (str.equals("zh-MO")) {
                    b = 15;
                }
                break;
            case 115813715:
                if (str.equals("zh-SG")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case 115813762:
                if (str.equals("zh-TW")) {
                    b = 17;
                }
                break;
        }
        switch (b) {
            case 0:
                return mGCommonPublicMessageMsgText.ar_SA;
            case 1:
                return mGCommonPublicMessageMsgText.en_GB;
            case 2:
                return mGCommonPublicMessageMsgText.en_US;
            case 3:
                return mGCommonPublicMessageMsgText.es_ES;
            case 4:
                return mGCommonPublicMessageMsgText.id_ID;
            case 5:
                return mGCommonPublicMessageMsgText.ja_JP;
            case 6:
                return mGCommonPublicMessageMsgText.ko_KR;
            case 7:
                return mGCommonPublicMessageMsgText.ms_BN;
            case 8:
                return mGCommonPublicMessageMsgText.ms_MY;
            case 9:
                return mGCommonPublicMessageMsgText.th_TH;
            case 10:
                return mGCommonPublicMessageMsgText.tr_TR;
            case 11:
                return mGCommonPublicMessageMsgText.ur_PK;
            case 12:
                return mGCommonPublicMessageMsgText.vi_VN;
            case 13:
                return mGCommonPublicMessageMsgText.zh_CN;
            case 14:
                return mGCommonPublicMessageMsgText.zh_HK;
            case 15:
                return mGCommonPublicMessageMsgText.zh_MO;
            case 16:
                return mGCommonPublicMessageMsgText.zh_SG;
            case 17:
                return mGCommonPublicMessageMsgText.zh_TW;
            default:
                return null;
        }
    }

    private static boolean isMatchLanguage(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        return str2.equals(str) || str.startsWith(str2.concat("-"));
    }

    public static String parseI18nText(String str, SudMGPMGState.MGCommonPublicMessage.MGCommonPublicMessageMsgText mGCommonPublicMessageMsgText) {
        if (mGCommonPublicMessageMsgText == null) {
            return null;
        }
        if (str == null) {
            return mGCommonPublicMessageMsgText.defaultStr;
        }
        String strI18nPrecise = i18nPrecise(str, mGCommonPublicMessageMsgText);
        if (TextUtils.isEmpty(strI18nPrecise)) {
            return isMatchLanguage(str, "zh") ? mGCommonPublicMessageMsgText.zh_CN : mGCommonPublicMessageMsgText.en_US;
        }
        return strI18nPrecise;
    }

    public static String parseMGCommonPublicMessage(SudMGPMGState.MGCommonPublicMessage mGCommonPublicMessage, String str) {
        List<SudMGPMGState.MGCommonPublicMessage.MGCommonPublicMessageMsg> list;
        SudMGPMGState.MGCommonPublicMessage.MGCommonPublicMessageMsgUser mGCommonPublicMessageMsgUser;
        String str2;
        if (mGCommonPublicMessage == null || (list = mGCommonPublicMessage.msg) == null || list.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (SudMGPMGState.MGCommonPublicMessage.MGCommonPublicMessageMsg mGCommonPublicMessageMsg : mGCommonPublicMessage.msg) {
            int i = mGCommonPublicMessageMsg.phrase;
            if (i == 1) {
                String i18nText = parseI18nText(str, mGCommonPublicMessageMsg.text);
                if (i18nText != null) {
                    sb.append(i18nText);
                }
            } else if (i == 2 && (mGCommonPublicMessageMsgUser = mGCommonPublicMessageMsg.user) != null && (str2 = mGCommonPublicMessageMsgUser.name) != null) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }
}
