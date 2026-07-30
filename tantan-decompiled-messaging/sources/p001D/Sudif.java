package p001D;

import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Sudif implements Serializable {

    /* JADX INFO: renamed from: Suddo, reason: collision with root package name */
    public final HashMap f210102Suddo = new HashMap();

    public final String Suddo(String str) {
        String str2;
        if (str == null && (str2 = (String) this.f210102Suddo.get("default")) != null) {
            return str2;
        }
        String str3 = (String) this.f210102Suddo.get(str);
        if (str3 != null) {
            return str3;
        }
        String str4 = (String) this.f210102Suddo.get("default");
        return str4 != null ? str4 : "";
    }
}
