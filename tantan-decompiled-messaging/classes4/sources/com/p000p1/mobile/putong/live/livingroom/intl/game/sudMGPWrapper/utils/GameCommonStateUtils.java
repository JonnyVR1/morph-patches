package com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.utils;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeData;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.SudMGPMGState;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GameCommonStateUtils {
    private static String i18nPrecise(String str, SudMGPMGState.MGCommonPublicMessage.MGCommonPublicMessageMsgText mGCommonPublicMessageMsgText) {
        str.getClass();
        switch (str) {
            case "ar-SA":
                return mGCommonPublicMessageMsgText.ar_SA;
            case "en-GB":
                return mGCommonPublicMessageMsgText.en_GB;
            case "en-US":
                return mGCommonPublicMessageMsgText.en_US;
            case "es-ES":
                return mGCommonPublicMessageMsgText.es_ES;
            case "id-ID":
                return mGCommonPublicMessageMsgText.id_ID;
            case "ja-JP":
                return mGCommonPublicMessageMsgText.ja_JP;
            case "ko-KR":
                return mGCommonPublicMessageMsgText.ko_KR;
            case "ms-BN":
                return mGCommonPublicMessageMsgText.ms_BN;
            case "ms-MY":
                return mGCommonPublicMessageMsgText.ms_MY;
            case "th-TH":
                return mGCommonPublicMessageMsgText.th_TH;
            case "tr-TR":
                return mGCommonPublicMessageMsgText.tr_TR;
            case "ur-PK":
                return mGCommonPublicMessageMsgText.ur_PK;
            case "vi-VN":
                return mGCommonPublicMessageMsgText.vi_VN;
            case "zh-CN":
                return mGCommonPublicMessageMsgText.zh_CN;
            case "zh-HK":
                return mGCommonPublicMessageMsgText.zh_HK;
            case "zh-MO":
                return mGCommonPublicMessageMsgText.zh_MO;
            case "zh-SG":
                return mGCommonPublicMessageMsgText.zh_SG;
            case "zh-TW":
                return mGCommonPublicMessageMsgText.zh_TW;
            default:
                return null;
        }
    }

    private static boolean isMatchLanguage(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        return str2.equals(str) || str.startsWith(str2.concat(ExpProfileLoopWheelTypeData.NONE_STR));
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
