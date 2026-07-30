package p153l;

import android.app.Application;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import tech.sud.base.utils.Utils;

/* JADX INFO: loaded from: classes.dex */
public abstract class lwg0 {
    /* JADX INFO: renamed from: a */
    public static String m156043a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        byte[] bArrM98822b = amg0.m98822b(str);
        if (bArrM98822b != null && bArrM98822b.length != 0) {
            byte[] bArr = new byte[bArrM98822b.length];
            for (int i = 0; i < bArrM98822b.length; i++) {
                bArr[i] = (byte) (bArrM98822b[i] ^ (i & 255));
            }
            bArrM98822b = bArr;
        }
        return (bArrM98822b == null || bArrM98822b.length == 0) ? str : new String(bArrM98822b, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: b */
    public static String m156044b(String str) {
        StringBuilder sb = new StringBuilder("https://mgp.sud.tech/");
        String str2 = utg0.f180952g;
        if (str2 != null) {
            sb.append(str2);
        }
        sb.append("?platform=2");
        Application app = Utils.getApp();
        if (app != null) {
            sb.append("&netType=");
            sb.append(vzg0.m204092a(app));
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append("&requestId=");
            sb.append(str);
        }
        return sb.toString();
    }
}
