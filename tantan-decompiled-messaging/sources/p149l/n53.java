package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class n53 {
    /* JADX INFO: renamed from: a */
    public static List<LiteraturesComments> m157985a(String str) {
        List<LiteraturesComments> listM169489g7;
        if (TextUtils.isEmpty(str)) {
            listM169489g7 = null;
        } else {
            listM169489g7 = CoreModule.f17545c.f19639e0.m169489g7(str);
            if (vwb.m200296J(listM169489g7) && TextUtils.equals(CoreModule.m29931H().userId(), str)) {
                CoreModule.f17545c.f19639e0.m169557x7();
            }
        }
        return vwb.m200296J(listM169489g7) ? new ArrayList() : listM169489g7;
    }
}
