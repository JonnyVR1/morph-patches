package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.hellogroup.p036mk.core.log.MKCoreLogManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class lf3 {

    /* JADX INFO: renamed from: a */
    private static final List<kf3> f131802a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static boolean m153969a() {
        return rs8.m182913d();
    }

    /* JADX INFO: renamed from: b */
    public static void m153970b(@NonNull kf3 kf3Var) {
        if (m153969a()) {
            try {
                if (kf3Var.m149360i()) {
                    kf3Var.toString();
                    f131802a.add(kf3Var);
                }
                for (kf3 kf3Var2 : f131802a) {
                    MKCoreLogManager.m18427e().m18460w(kf3Var2.m149353a(), kf3Var2.m149359g(), kf3Var2.m149356d(), kf3Var2.m149355c(), kf3Var2.m149357e(), kf3Var2.m149358f());
                }
                f131802a.clear();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m153971c(@NonNull mf3 mf3Var) {
        if (!m153969a() || TextUtils.isEmpty(mf3Var.f136589a) || TextUtils.isEmpty(mf3Var.f136590b)) {
            return;
        }
        List<kf3> list = f131802a;
        if (list.isEmpty()) {
            return;
        }
        for (kf3 kf3Var : list) {
            if (mf3Var.f136589a.equalsIgnoreCase(kf3Var.m149354b())) {
                mf3Var.toString();
                kf3Var.m149362k(mf3Var.m158105a());
                return;
            }
        }
    }
}
