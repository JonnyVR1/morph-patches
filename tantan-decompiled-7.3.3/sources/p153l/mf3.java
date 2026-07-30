package p153l;

import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public class mf3 {

    /* JADX INFO: renamed from: a */
    String f136589a;

    /* JADX INFO: renamed from: b */
    String f136590b;

    public mf3(String str, String str2) {
        this.f136589a = str;
        this.f136590b = Uri.decode(str2);
    }

    /* JADX INFO: renamed from: a */
    public String m158105a() {
        String str = this.f136590b;
        return (str == null || str.length() > 500) ? "" : this.f136590b;
    }

    public String toString() {
        return "BridgeCallResultModel{callback='" + this.f136589a + "', result='" + this.f136590b + "'}";
    }
}
