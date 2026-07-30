package com.hihonor.push.sdk;

import android.content.Intent;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.hihonor.push.sdk.q0 */
/* JADX INFO: loaded from: classes7.dex */
public class CallableC3516q0 implements Callable<HonorPushDataMsg> {

    /* JADX INFO: renamed from: a */
    public final Intent f11909a;

    public CallableC3516q0(Intent intent) {
        this.f11909a = intent;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    public HonorPushDataMsg call() throws Exception {
        byte[] byteArrayExtra;
        String string;
        String strOptString;
        Intent intent = this.f11909a;
        if (intent == null) {
            return null;
        }
        long longExtra = 0;
        try {
            longExtra = intent.getLongExtra("msg_id", 0L);
        } catch (Exception e) {
            C3480c.m17504a("PassByMsgIntentParser", "parserMsgId", e);
        }
        try {
            byteArrayExtra = this.f11909a.getByteArrayExtra("msg_content");
        } catch (Exception e2) {
            C3480c.m17504a("PassByMsgIntentParser", "parseMsgContent", e2);
            byteArrayExtra = null;
        }
        if (byteArrayExtra == null || byteArrayExtra.length == 0) {
            string = null;
        } else {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayExtra);
            InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream, new Inflater());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    byte[] bArr = new byte[256];
                    while (true) {
                        int i = inflaterInputStream.read(bArr);
                        if (i <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                        C3477b.m17494a(byteArrayInputStream);
                        C3477b.m17494a(inflaterInputStream);
                        C3477b.m17494a(byteArrayOutputStream);
                        throw th;
                    }
                    string = byteArrayOutputStream.toString("UTF-8");
                    C3477b.m17494a(byteArrayInputStream);
                    C3477b.m17494a(inflaterInputStream);
                    C3477b.m17494a(byteArrayOutputStream);
                } catch (IOException e3) {
                    C3480c.m17504a("DeflateUtil", "unZipString", e3);
                    C3477b.m17494a(byteArrayInputStream);
                    C3477b.m17494a(inflaterInputStream);
                    C3477b.m17494a(byteArrayOutputStream);
                    string = null;
                    if (string != null) {
                        return null;
                    }
                    strOptString = new JSONObject(string).optString("data");
                    if (!TextUtils.isEmpty(strOptString)) {
                        return null;
                    }
                    HonorPushDataMsg honorPushDataMsg = new HonorPushDataMsg();
                    honorPushDataMsg.setMsgId(longExtra);
                    honorPushDataMsg.setData(strOptString);
                    return honorPushDataMsg;
                }
            } catch (Throwable th) {
                C3477b.m17494a(byteArrayInputStream);
                C3477b.m17494a(inflaterInputStream);
                C3477b.m17494a(byteArrayOutputStream);
                throw th;
            }
        }
        if (string != null) {
            return null;
        }
        strOptString = new JSONObject(string).optString("data");
        if (!TextUtils.isEmpty(strOptString)) {
            return null;
        }
        HonorPushDataMsg honorPushDataMsg2 = new HonorPushDataMsg();
        honorPushDataMsg2.setMsgId(longExtra);
        honorPushDataMsg2.setData(strOptString);
        return honorPushDataMsg2;
    }
}
