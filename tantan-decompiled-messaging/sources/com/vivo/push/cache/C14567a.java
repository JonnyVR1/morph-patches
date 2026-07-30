package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.clevertap.android.sdk.Constants;
import com.vivo.push.model.C14618a;
import com.vivo.push.util.C14637f;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14657z;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.cache.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14567a extends AbstractC14569c<C14618a> {
    public C14567a(Context context) {
        super(context);
    }

    @Override // com.vivo.push.cache.AbstractC14569c
    /* JADX INFO: renamed from: a */
    public final List<C14618a> mo84801a(String str) {
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
                        arrayList.add(new C14618a(str3, strTrim.substring(str3.length() + 1)));
                    } catch (Exception e) {
                        C14647p.m85021d("AppConfigSettings", "str2Clients E: ".concat(String.valueOf(e)));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.vivo.push.cache.AbstractC14569c
    /* JADX INFO: renamed from: b */
    public final String mo84803b(String str) throws Exception {
        return new String(C14637f.m84977a(C14637f.m84976a(m84812e()), C14637f.m84976a(m84813f()), Base64.decode(str, 2)), "utf-8");
    }

    /* JADX INFO: renamed from: c */
    public final C14618a m84804c(String str) {
        synchronized (AbstractC14569c.f60963a) {
            try {
                for (T t : this.f60964b) {
                    if (!TextUtils.isEmpty(t.m84917a()) && t.m84917a().equals(str)) {
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
    public final int m84802b() {
        C14618a c14618aM84804c = m84804c("push_mode");
        if (c14618aM84804c != null && !TextUtils.isEmpty(c14618aM84804c.m84918b())) {
            try {
                return Integer.parseInt(c14618aM84804c.m84918b());
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    @Override // com.vivo.push.cache.AbstractC14569c
    /* JADX INFO: renamed from: a */
    public final String mo84800a() {
        return "com.vivo.pushservice.back_up";
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84799a(int i) {
        if (i != -1) {
            return (i & 1) != 0;
        }
        return C14657z.m85062b("persist.sys.log.ctrl", "no").equals("yes");
    }
}
