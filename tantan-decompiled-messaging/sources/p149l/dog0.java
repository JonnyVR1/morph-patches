package p149l;

import android.app.Application;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import tech.sud.base.utils.Utils;

/* JADX INFO: loaded from: classes.dex */
public abstract class dog0 {
    /* JADX INFO: renamed from: a */
    public static String m112805a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        byte[] bArrM183493b = sdg0.m183493b(str);
        if (bArrM183493b != null && bArrM183493b.length != 0) {
            byte[] bArr = new byte[bArrM183493b.length];
            for (int i = 0; i < bArrM183493b.length; i++) {
                bArr[i] = (byte) (bArrM183493b[i] ^ (i & 255));
            }
            bArrM183493b = bArr;
        }
        return (bArrM183493b == null || bArrM183493b.length == 0) ? str : new String(bArrM183493b, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: b */
    public static String m112806b(String str) {
        StringBuilder sb = new StringBuilder("https://mgp.sud.tech/");
        String str2 = mlg0.f134432g;
        if (str2 != null) {
            sb.append(str2);
        }
        sb.append("?platform=2");
        Application app = Utils.getApp();
        if (app != null) {
            sb.append("&netType=");
            sb.append(nrg0.m160737a(app));
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append("&requestId=");
            sb.append(str);
        }
        return sb.toString();
    }
}
