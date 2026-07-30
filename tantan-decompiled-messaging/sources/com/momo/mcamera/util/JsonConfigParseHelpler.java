package com.momo.mcamera.util;

import android.text.TextUtils;
import android.util.Log;
import com.core.glcore.util.JsonUtil;
import com.momo.mcamera.ThirdPartEffect.Pott.config.PottAssetCfg;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.LottieConfig;

/* JADX INFO: loaded from: classes7.dex */
public class JsonConfigParseHelpler {
    public static LottieConfig loadLottieFile(String str) {
        String strJsonStringFromFile = JsonUtil.getInstance().jsonStringFromFile(null, str);
        if (!TextUtils.isEmpty(strJsonStringFromFile)) {
            try {
                return (LottieConfig) JsonUtil.getInstance().fromJson(strJsonStringFromFile, LottieConfig.class);
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("zhangzhe", "get Json Cofnig is wrong !!");
            }
        }
        return null;
    }

    public static PottAssetCfg loadPottAssetFile(String str) {
        String strJsonStringFromFile = JsonUtil.getInstance().jsonStringFromFile(null, str);
        if (!TextUtils.isEmpty(strJsonStringFromFile)) {
            try {
                return (PottAssetCfg) JsonUtil.getInstance().fromJson(strJsonStringFromFile, PottAssetCfg.class);
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("zhangzhe", "get Json Cofnig is wrong !!");
            }
        }
        return null;
    }
}
