package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import java.util.ArrayList;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class n53 {
    /* JADX INFO: renamed from: a */
    public static List<LiteraturesComments> m18509a(String str) {
        List<LiteraturesComments> listG7;
        if (TextUtils.isEmpty(str)) {
            listG7 = null;
        } else {
            listG7 = CoreModule.c.e0.g7(str);
            if (vwb.J(listG7) && TextUtils.equals(CoreModule.H().userId(), str)) {
                CoreModule.c.e0.x7();
            }
        }
        return vwb.J(listG7) ? new ArrayList() : listG7;
    }
}
