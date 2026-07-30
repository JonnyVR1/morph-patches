package com.tencent.could.huiyansdk.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import com.tencent.could.component.common.p084ai.net.IJsonDataListener;
import com.tencent.could.component.common.p084ai.net.TXCHttp;
import com.tencent.could.component.common.p084ai.net.TxNetWorkHelper;
import com.tencent.could.component.common.p084ai.utils.TwoTuple;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.entity.HostEntity;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.could.huiyansdk.overseas.HuiYanOsApiImp;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.c */
/* JADX INFO: loaded from: classes12.dex */
public class C14091c {

    /* JADX INFO: renamed from: a */
    public static final String[] f58350a = {"75a80ad03e79ea3e7e164db5a520a898a0b3aedd49e22b2ace5b2ffaf5a46e2a", "5905b7061045df5ef3700cce66f8979576d7a47ce64a7577f81ccefbbaad2d7f", "a36ec5649072f6bb6ebc8916d8660b05f67bcb39361132be4c6bcc5649000d26", "4b4912df72d6c4bb7f551a0f70f6cc25d73a9acae5fd9b8cf0dd9c28b6d6e605", "c0437f33e9a2f2e896dd50ba92a463f96e8e9ffe1c684932155e5462dee81900", "ce612fcee938e2be29be435af2e4bae1cd2b64f507eda9936bb8517ebb0f6591", "d6faa4c19bdf85efa6032f3b004c171e29a14af7f1922bf27e24b04d815b5da7", "484e2c0cedd588fe8b3766d537f37576cbf2f3346a7106551257315c28f656c9", "44f3a61dd7cf65bedd9663596d6c8f57e98a84290be13f7852549955733c0db7", "66c89855d81b8c0a0c6c8c908c8cbcdafda913b3eb9714ef34f811a8bf2a17e0"};

    /* JADX INFO: renamed from: b */
    public static final String[] f58351b = {"d8f4c7157f26aa4a52dbfe157e500e3b", "d2c5f524d350ad86b1e2f5e7c37dca66", "e45805b6a2bb9bf4790e307d3f874877", "aa4eb8fa561f75b62ff401804b9b6602", "ad6976bbcb2dbab1adc6f67e3b6208f2", "80deb2e275676d12fe164f1e4d00162a", "4f64447e457fcdd64c1f61ae3e6cd4cf", "f0c743177a7662028c090247abd03f14", "85dc1af6db373fcfb39f0bbf810f563e", "305af612dcadffe807ff6022b94fd8a8"};

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.c$a */
    public static class a implements IJsonDataListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IJsonDataListener f58352a;

        public a(IJsonDataListener iJsonDataListener) {
            this.f58352a = iJsonDataListener;
        }

        @Override // com.tencent.could.component.common.p084ai.net.IJsonDataListener
        public void onFailed(String str) {
            this.f58352a.onFailed(str);
        }

        @Override // com.tencent.could.component.common.p084ai.net.IJsonDataListener
        public void onSuccess(String str) {
            try {
                this.f58352a.onSuccess(C14091c.m83577a(str));
            } catch (Exception e) {
                C14068e.a.f58293a.m83520a(2, "HYOCommonUtils", "decrypt error: " + e.getLocalizedMessage());
                this.f58352a.onFailed("decrypt error: " + e.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static TwoTuple<String, String> m83575a(boolean z) {
        if (!z) {
            z = true;
        }
        HostEntity hostEntityM83576a = m83576a();
        if (hostEntityM83576a == null) {
            return null;
        }
        String mainHost = hostEntityM83576a.getMainHost();
        String secondHost = hostEntityM83576a.getSecondHost();
        String backupIp = hostEntityM83576a.getBackupIp();
        if (z) {
            return new TwoTuple<>("https://" + mainHost, "https://" + secondHost);
        }
        TxNetWorkHelper txNetWorkHelper = TxNetWorkHelper.getInstance();
        HuiYanBaseApi huiYanBaseApi = HuiYanBaseApi.C14044a.f58205a;
        String hostNameCurrentIp = txNetWorkHelper.getHostNameCurrentIp(huiYanBaseApi.m83423a(), mainHost);
        if (!TextUtils.isEmpty(hostNameCurrentIp)) {
            return new TwoTuple<>("https://" + hostNameCurrentIp, "https://" + mainHost);
        }
        String backUpHost = HuiYanOsApiImp.getInstance().getOsConfig().getBackUpHost();
        if (!TextUtils.isEmpty(backUpHost)) {
            secondHost = backUpHost;
        }
        String hostNameCurrentIp2 = TxNetWorkHelper.getInstance().getHostNameCurrentIp(huiYanBaseApi.m83423a(), secondHost);
        if (TextUtils.isEmpty(hostNameCurrentIp2)) {
            return new TwoTuple<>("https://" + backupIp, "https://" + mainHost);
        }
        return new TwoTuple<>("https://" + hostNameCurrentIp2, "https://" + secondHost);
    }

    /* JADX INFO: renamed from: b */
    public static String m83579b(String str) throws BadPaddingException, JSONException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        int iNextInt = new Random().nextInt(10);
        byte[] bArrM83580c = m83580c(f58350a[iNextInt]);
        byte[] bArrM83580c2 = m83580c(f58351b[iNextInt]);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM83580c, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrM83580c2);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        byte[] bArrDoFinal = cipher.doFinal(str.getBytes());
        byte[] bArr = new byte[bArrDoFinal.length + 2];
        bArr[0] = 1;
        bArr[1] = (byte) iNextInt;
        System.arraycopy(bArrDoFinal, 0, bArr, 2, bArrDoFinal.length);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("encryptedReq", Base64.encodeToString(bArr, 2));
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m83580c(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static HostEntity m83576a() {
        String currentToken = HuiYanOsApiImp.getInstance().getCurrentToken();
        if (TextUtils.isEmpty(currentToken)) {
            return null;
        }
        try {
            return C14092d.f58353a.get(currentToken.substring(15, 17));
        } catch (IndexOutOfBoundsException e) {
            C14068e.a.f58293a.m83520a(2, "HYOCommonUtils", "substring error : " + e.getLocalizedMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m83577a(String str) throws JSONException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.getInt("code") != 0) {
            return str;
        }
        byte[] bArrDecode = Base64.decode(jSONObject.getJSONObject("data").get("encryptedRsp").toString(), 2);
        byte b = bArrDecode[1];
        byte[] bArrM83580c = m83580c(f58350a[b]);
        byte[] bArrM83580c2 = m83580c(f58351b[b]);
        int length = bArrDecode.length - 2;
        byte[] bArr = new byte[length];
        System.arraycopy(bArrDecode, 2, bArr, 0, length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM83580c, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrM83580c2);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        jSONObject.put("data", new JSONObject(new String(cipher.doFinal(bArr))));
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: a */
    public static void m83578a(NetWorkParam netWorkParam, IJsonDataListener iJsonDataListener) {
        try {
            netWorkParam.requestData = m83579b(netWorkParam.requestData);
            TXCHttp.sendRequest(netWorkParam, new a(iJsonDataListener));
        } catch (Exception e) {
            C14068e.a.f58293a.m83520a(2, "HYOCommonUtils", "encrypt error: " + e.getLocalizedMessage());
            iJsonDataListener.onFailed("encrypt error: " + e.getLocalizedMessage());
        }
    }
}
