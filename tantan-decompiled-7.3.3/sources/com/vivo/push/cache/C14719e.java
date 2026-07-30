package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.clevertap.android.sdk.Constants;
import com.vivo.push.model.C14766a;
import com.vivo.push.util.C14785f;
import com.vivo.push.util.C14795p;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.cache.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C14719e extends AbstractC14717c<C14766a> {
    public C14719e(Context context) {
        super(context);
    }

    @Override // com.vivo.push.cache.AbstractC14717c
    /* JADX INFO: renamed from: a */
    public final List<C14766a> mo85972a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.trim().split("@#")) {
            String strTrim = str2.trim();
            String[] strArrSplit = strTrim.trim().split(Constants.SEPARATOR_COMMA);
            if (strArrSplit.length >= 2) {
                try {
                    String str3 = strArrSplit[0];
                    arrayList.add(new C14766a(str3, strTrim.substring(str3.length() + 1)));
                } catch (Exception e) {
                    C14795p.m86192d("PushConfigSettings", "str2Clients E: ".concat(String.valueOf(e)));
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
    public final String m85985c(String str) {
        synchronized (AbstractC14717c.f61810a) {
            try {
                for (T t : this.f61811b) {
                    if (!TextUtils.isEmpty(t.m86088a()) && t.m86088a().equals(str)) {
                        return t.m86089b();
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.vivo.push.cache.AbstractC14717c
    /* JADX INFO: renamed from: a */
    public final String mo85971a() {
        return "com.vivo.pushservice.other";
    }
}
