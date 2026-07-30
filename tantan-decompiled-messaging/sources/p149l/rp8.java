package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.JSBridgeVersion;
import com.p046p1.mobile.putong.data.VerificationToken;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class rp8 implements xql {
    @Override // p149l.xql
    /* JADX INFO: renamed from: a */
    public HashMap<String, Object> mo180312a(VerificationToken verificationToken) {
        HashMap<String, Object> map = new HashMap<>();
        if (!verificationToken.isALiProvider()) {
            if (verificationToken.isTencentProvider()) {
                map.put("option-key-faceid", verificationToken.tencentToken.faceId);
                map.put("option-key-agreementno", verificationToken.tencentToken.agreementNo);
                map.put("option-key-appid", verificationToken.tencentToken.appId);
                map.put("option-key-sign", verificationToken.tencentToken.sign);
                map.put("option-key-userid", verificationToken.tencentToken.userId);
                map.put("option-key-nonce", verificationToken.tencentToken.nonce);
                map.put("option-key-licence", verificationToken.tencentToken.keyLicence);
                map.put("option-key-appversion", JSBridgeVersion.JSBRIDGE_API_VERSION);
                if (TextUtils.isEmpty(verificationToken.tencentToken.faceId)) {
                    map.put("compareType", "none");
                } else {
                    map.put("compareType", "idCard");
                }
                map.put("colorMode", "white");
                map.put("videoUpload", Boolean.TRUE);
                map.put("playVoice", Boolean.FALSE);
                map.put("uiType", 1);
                map.toString();
                map.put("option-key-language", m180313b());
                return map;
            }
            if (verificationToken.isTencentIntlProvider() || verificationToken.isTencentIntlProviderV2()) {
                map.put("option-key-licence", "TanTan_TanTan_SDKLicense_2025-03-21 10_41_08.license");
                map.put("option-key-save-cache", Boolean.TRUE);
                map.put("colorMode", "white");
            }
            if (verificationToken.isMoMoProvider()) {
                map.put("option-key-appid", "78ea6732be1b0ffa8a1df2a47c08901e");
            }
            if (verificationToken.isVolcProvider()) {
                map.put("option-key-sts-token", verificationToken.volcEngineProToken.stsToken);
                map.put("option-key-access_id", verificationToken.volcEngineProToken.accessKeyId);
                map.put("option-key-secret_key", verificationToken.volcEngineProToken.secretAccessKey);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public final String m180313b() {
        String script = CoreModule.f17544b.getResources().getConfiguration().locale.getScript();
        String language = CoreModule.f17544b.getResources().getConfiguration().locale.getLanguage();
        language.getClass();
        switch (language) {
            case "in":
                return "WBFaceVerifyLanguage_id";
            case "ja":
                return "WBFaceVerifyLanguage_ja";
            case "ko":
                return "WBFaceVerifyLanguage_ko";
            case "th":
                return "WBFaceVerifyLanguage_th";
            case "zh":
                return "Hant".equals(script) ? "WBFaceVerifyLanguage_zh_hk" : "WBFaceVerifyLanguage_zh_cn";
            default:
                return "WBFaceVerifyLanguage_en";
        }
    }
}
