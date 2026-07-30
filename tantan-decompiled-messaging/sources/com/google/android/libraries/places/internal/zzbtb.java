package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p149l.ig3;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbtb {
    private final List zza = new ArrayList(20);

    public final zzbtb zza(String str, String str2) {
        if (str.isEmpty()) {
            ig3.m135964a("name is empty");
            return null;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127) {
                ig3.m135964a(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str));
                return null;
            }
        }
        if (str2 == null) {
            ig3.m135964a("value == null");
            return null;
        }
        for (int i3 = 0; i3 < str2.length(); i3++) {
            char cCharAt2 = str2.charAt(i3);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                ig3.m135964a(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i3), str2));
                return null;
            }
        }
        while (true) {
            int size = this.zza.size();
            List list = this.zza;
            if (i >= size) {
                list.add(str);
                this.zza.add(str2.trim());
                return this;
            }
            if (str.equalsIgnoreCase((String) list.get(i))) {
                this.zza.remove(i);
                this.zza.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public final zzbtd zzb() {
        return new zzbtd(this, null);
    }
}
