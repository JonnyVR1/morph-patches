package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class fgx0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f97452a;

    public fgx0(int i) {
        this.f97452a = lgx0.m149800b(i);
    }

    /* JADX INFO: renamed from: a */
    public final fgx0 m121317a(Object obj, xgx0 xgx0Var) {
        wgx0.m203088a(obj, Constants.KEY_KEY);
        wgx0.m203088a(xgx0Var, "provider");
        this.f97452a.put(obj, xgx0Var);
        return this;
    }
}
