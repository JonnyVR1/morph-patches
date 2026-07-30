package p153l;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.meituan.robust.Constants;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class xxr0 extends jwr0 {

    /* JADX INFO: renamed from: m */
    public final Object f196676m;

    /* JADX INFO: renamed from: n */
    @Nullable
    @GuardedBy("mLock")
    public final owr0 f196677n;

    public xxr0(int i, String str, owr0 owr0Var, @Nullable nwr0 nwr0Var) {
        super(i, str, nwr0Var);
        this.f196676m = new Object();
        this.f196677n = owr0Var;
    }

    /* JADX INFO: renamed from: F */
    public void mo158948F(String str) {
        owr0 owr0Var;
        synchronized (this.f196676m) {
            owr0Var = this.f196677n;
        }
        owr0Var.zza(str);
    }

    @Override // p153l.jwr0
    /* JADX INFO: renamed from: j */
    public final pwr0 mo147200j(vvr0 vvr0Var) {
        String str;
        String str2;
        try {
            byte[] bArr = vvr0Var.f185980b;
            Map map = vvr0Var.f185981c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(Constants.PACKNAME_END, 0);
                for (int i = 1; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(vvr0Var.f185980b);
        }
        return pwr0.m174088b(str, dxr0.m118509b(vvr0Var));
    }
}
