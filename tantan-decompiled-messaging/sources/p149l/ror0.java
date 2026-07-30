package p149l;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.meituan.robust.Constants;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ror0 extends dnr0 {

    /* JADX INFO: renamed from: m */
    public final Object f160412m;

    /* JADX INFO: renamed from: n */
    @Nullable
    @GuardedBy("mLock")
    public final inr0 f160413n;

    public ror0(int i, String str, inr0 inr0Var, @Nullable hnr0 hnr0Var) {
        super(i, str, hnr0Var);
        this.f160412m = new Object();
        this.f160413n = inr0Var;
    }

    /* JADX INFO: renamed from: F */
    public void mo125521F(String str) {
        inr0 inr0Var;
        synchronized (this.f160412m) {
            inr0Var = this.f160413n;
        }
        inr0Var.zza(str);
    }

    @Override // p149l.dnr0
    /* JADX INFO: renamed from: j */
    public final jnr0 mo112662j(pmr0 pmr0Var) {
        String str;
        String str2;
        try {
            byte[] bArr = pmr0Var.f150285b;
            Map map = pmr0Var.f150286c;
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
            str = new String(pmr0Var.f150285b);
        }
        return jnr0.m142387b(str, xnr0.m210207b(pmr0Var));
    }
}
