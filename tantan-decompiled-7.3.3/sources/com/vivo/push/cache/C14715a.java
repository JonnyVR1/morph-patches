package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.clevertap.android.sdk.Constants;
import com.vivo.push.model.C14766a;
import com.vivo.push.util.C14785f;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.C14805z;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.cache.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14715a extends AbstractC14717c<C14766a> {
    public C14715a(Context context) {
        super(context);
    }

    @Override // com.vivo.push.cache.AbstractC14717c
    /* JADX INFO: renamed from: a */
    public final List<C14766a> mo85972a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.trim().split("@#")) {
                String strTrim = str2.trim();
                String[] strArrSplit = strTrim.trim().split(Constants.SEPARATOR_COMMA);
                if (strArrSplit.length >= 2) {
                    try {
                        String str3 = strArrSplit[0];
                        arrayList.add(new C14766a(str3, strTrim.substring(str3.length() + 1)));
                    } catch (Exception e) {
                        C14795p.m86192d("AppConfigSettings", "str2Clients E: ".concat(String.valueOf(e)));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.vivo.push.cache.AbstractC14717c
    /* JADX INFO: renamed from: b */
    public final String mo85974b(String str) throws Exception {
        return new String(C14785f.m86148a(C14785f.m86147a(m85983e()), C14785f.m86147a(m85984f()), Base64.decode(str, 2)), "utf-8");
    }

    /* JADX INFO: renamed from: c */
    public final C14766a m85975c(String str) {
        synchronized (AbstractC14717c.f61810a) {
            try {
                for (T t : this.f61811b) {
                    if (!TextUtils.isEmpty(t.m86088a()) && t.m86088a().equals(str)) {
                        return t;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m85973b() {
        C14766a c14766aM85975c = m85975c("push_mode");
        if (c14766aM85975c != null && !TextUtils.isEmpty(c14766aM85975c.m86089b())) {
            try {
                return Integer.parseInt(c14766aM85975c.m86089b());
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    @Override // com.vivo.push.cache.AbstractC14717c
    /* JADX INFO: renamed from: a */
    public final String mo85971a() {
        return "com.vivo.pushservice.back_up";
    }

    /* JADX INFO: renamed from: a */
    public static boolean m85970a(int i) {
        if (i != -1) {
            return (i & 1) != 0;
        }
        return C14805z.m86233b("persist.sys.log.ctrl", "no").equals("yes");
    }
}
