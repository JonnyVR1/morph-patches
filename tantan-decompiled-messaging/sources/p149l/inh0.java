package p149l;

import android.content.Context;
import com.core.glcore.util.CameraHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class inh0 {

    /* JADX INFO: renamed from: a */
    public static List<aqh0> f114022a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static boolean m137140a() {
        List<aqh0> list = f114022a;
        return (list == null || list.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static List<aqh0> m137141b(Context context) {
        if (m137140a()) {
            return f114022a;
        }
        List<vif0> listM111749v = dgw.m111749v(context, 3);
        ArrayList arrayList = new ArrayList();
        if (listM111749v != null) {
            for (vif0 vif0Var : listM111749v) {
                arrayList.add(new aqh0(vif0Var.m198562b(), vif0Var.m198561a()));
            }
        }
        f114022a = arrayList;
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static aqh0 m137142c(Context context, aqh0 aqh0Var, int i, float f) {
        List<aqh0> listM137141b = m137141b(context);
        ArrayList arrayList = new ArrayList();
        for (aqh0 aqh0Var2 : listM137141b) {
            arrayList.add(new vif0(aqh0Var2.f71161a, aqh0Var2.f71162b));
        }
        vif0 vif0VarSeletecMatchSize = CameraHelper.seletecMatchSize(arrayList, new vif0(aqh0Var.f71161a, aqh0Var.f71162b), i, f);
        return new aqh0(vif0VarSeletecMatchSize == null ? 0 : vif0VarSeletecMatchSize.m198562b(), vif0VarSeletecMatchSize != null ? vif0VarSeletecMatchSize.m198561a() : 0);
    }
}
