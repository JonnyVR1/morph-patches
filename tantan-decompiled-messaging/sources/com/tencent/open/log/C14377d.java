package com.tencent.open.log;

import android.annotation.SuppressLint;
import android.os.Bundle;
import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: com.tencent.open.log.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14377d {

    /* JADX INFO: renamed from: com.tencent.open.log.d$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static final boolean m84355a(int i, int i2) {
            return i2 == (i & i2);
        }
    }

    /* JADX INFO: renamed from: com.tencent.open.log.d$b */
    public static final class b {
        @SuppressLint({"SimpleDateFormat"})
        /* JADX INFO: renamed from: a */
        public static SimpleDateFormat m84356a(String str) {
            return new SimpleDateFormat(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84353a(String str) {
        return str.contains("access_token") || str.contains("pay_token") || str.contains("pfkey") || str.contains("expires_in") || str.contains("openid") || str.contains("proxy_code") || str.contains("proxy_expires_in");
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m84354b(Bundle bundle) {
        if (!m84352a(bundle)) {
            return bundle;
        }
        Bundle bundle2 = new Bundle(bundle);
        bundle2.remove("access_token");
        bundle2.remove("pay_token");
        bundle2.remove("pfkey");
        bundle2.remove("expires_in");
        bundle2.remove("openid");
        bundle2.remove("proxy_code");
        bundle2.remove("proxy_expires_in");
        return bundle2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84352a(Bundle bundle) {
        return bundle.containsKey("access_token") || bundle.containsKey("pay_token") || bundle.containsKey("pfkey") || bundle.containsKey("expires_in") || bundle.containsKey("openid") || bundle.containsKey("proxy_code") || bundle.containsKey("proxy_expires_in");
    }
}
