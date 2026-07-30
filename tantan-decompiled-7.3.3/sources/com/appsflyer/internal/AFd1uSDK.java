package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1uSDK {
    public final String[] getCurrencyIso4217Code;

    public AFd1uSDK(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.getCurrencyIso4217Code = null;
            return;
        }
        Pattern patternCompile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || !patternCompile.matcher(str).matches()) {
                AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(str)));
            } else {
                arrayList.add(str.toLowerCase(Locale.getDefault()));
            }
        }
        if (arrayList.contains("all")) {
            this.getCurrencyIso4217Code = new String[]{"all"};
        } else if (arrayList.isEmpty()) {
            this.getCurrencyIso4217Code = null;
        } else {
            this.getCurrencyIso4217Code = (String[]) arrayList.toArray(new String[0]);
        }
    }
}
