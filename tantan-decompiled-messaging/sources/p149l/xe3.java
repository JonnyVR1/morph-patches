package p149l;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public class xe3 {

    /* JADX INFO: renamed from: a */
    String f192524a;

    /* JADX INFO: renamed from: b */
    String f192525b;

    public xe3(String str, String str2) {
        this.f192524a = str;
        this.f192525b = Uri.decode(str2);
    }

    /* JADX INFO: renamed from: a */
    public String m208504a() {
        String str = this.f192525b;
        return (str == null || str.length() > 500) ? "" : this.f192525b;
    }

    public String toString() {
        return "BridgeCallResultModel{callback='" + this.f192524a + "', result='" + this.f192525b + "'}";
    }
}
