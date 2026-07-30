package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.security.InvalidParameterException;

/* JADX INFO: loaded from: classes7.dex */
public class pqd implements m5e0 {
    /* JADX INFO: renamed from: a */
    private String m170909a(String str, @Nullable n5e0 n5e0Var) {
        String strM164365a;
        if (TextUtils.isEmpty(str)) {
            strM164365a = null;
        } else if (str.toLowerCase().startsWith("assets:///")) {
            strM164365a = c21.m104888a(str.substring(10));
        } else {
            strM164365a = str.startsWith("file:///") ? ohi.m164365a(str.substring(8)) : ohi.m164365a(str);
        }
        if (n5e0Var != null) {
            if (TextUtils.isEmpty(str)) {
                n5e0Var.m167474b(str, new InvalidParameterException("Invalid path"));
                return strM164365a;
            }
            if (TextUtils.isEmpty(strM164365a)) {
                n5e0Var.m167474b(str, new Exception("empty file content"));
                return strM164365a;
            }
            n5e0Var.m173002a(str, strM164365a);
        }
        return strM164365a;
    }

    @Override // p149l.m5e0
    public String load(String str) {
        return m170909a(str, null);
    }
}
