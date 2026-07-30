package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.livingroom.R$string;

/* JADX INFO: loaded from: classes4.dex */
public class snt {
    /* JADX INFO: renamed from: a */
    public static void m187001a(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            o1j0.m165636j(zrv.f205803e.getString(R$string.f48194kd));
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        int i = coreService.code;
        if (i == 42001) {
            o1j0.m165636j(zrv.f205803e.getString(R$string.f48194kd));
            return;
        }
        if (i == 42004) {
            o1j0.m165636j(zrv.f205803e.getString(R$string.f48281oc));
            return;
        }
        if (i == 42002) {
            o1j0.m165636j(zrv.f205803e.getString(R$string.f47918Xj));
            return;
        }
        if (i == 42006 || i == 42007) {
            o1j0.m165636j(zrv.f205803e.getString(R$string.f48488y));
            return;
        }
        if (i == 42003) {
            o1j0.m165636j(zrv.f205803e.getString(R$string.f47625K0));
            return;
        }
        if (i == 42005) {
            o1j0.m165636j(zrv.f205803e.getString(R$string.f48030d2));
            return;
        }
        String str = coreService.metaMessage;
        if (TextUtils.isEmpty(str)) {
            o1j0.m165636j(zrv.f205803e.getString(R$string.f48194kd));
        } else {
            o1j0.m165636j(str);
        }
    }
}
