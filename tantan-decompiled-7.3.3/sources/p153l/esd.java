package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.security.InvalidParameterException;

/* JADX INFO: loaded from: classes7.dex */
public class esd implements rde0 {
    /* JADX INFO: renamed from: a */
    private String m122319a(String str, @Nullable sde0 sde0Var) {
        String strM154645a;
        if (TextUtils.isEmpty(str)) {
            strM154645a = null;
        } else if (str.toLowerCase().startsWith("assets:///")) {
            strM154645a = j21.m143161a(str.substring(10));
        } else {
            strM154645a = str.startsWith("file:///") ? lki.m154645a(str.substring(8)) : lki.m154645a(str);
        }
        if (sde0Var != null) {
            if (TextUtils.isEmpty(str)) {
                sde0Var.m195479b(str, new InvalidParameterException("Invalid path"));
                return strM154645a;
            }
            if (TextUtils.isEmpty(strM154645a)) {
                sde0Var.m195479b(str, new Exception("empty file content"));
                return strM154645a;
            }
            sde0Var.m200965a(str, strM154645a);
        }
        return strM154645a;
    }

    @Override // p153l.rde0
    public String load(String str) {
        return m122319a(str, null);
    }
}
