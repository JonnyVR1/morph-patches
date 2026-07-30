package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class d63 {
    /* JADX INFO: renamed from: a */
    public static List<LiteraturesComments> m114365a(String str) {
        List<LiteraturesComments> listM116562g7;
        if (TextUtils.isEmpty(str)) {
            listM116562g7 = null;
        } else {
            listM116562g7 = CoreModule.f18264c.f20381e0.m116562g7(str);
            if (jyb.m147479J(listM116562g7) && TextUtils.equals(CoreModule.m30929H().userId(), str)) {
                CoreModule.f18264c.f20381e0.m116630x7();
            }
        }
        return jyb.m147479J(listM116562g7) ? new ArrayList() : listM116562g7;
    }
}
