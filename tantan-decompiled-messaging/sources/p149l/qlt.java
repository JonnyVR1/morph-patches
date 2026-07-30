package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.livingroom.R$string;

/* JADX INFO: loaded from: classes4.dex */
public class qlt {
    /* JADX INFO: renamed from: a */
    public static void m175502a(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.m151580j(ypv.f199497e.getString(R$string.f47346kd));
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        int i = coreService.code;
        if (i == 42001) {
            lsi0.m151580j(ypv.f199497e.getString(R$string.f47346kd));
            return;
        }
        if (i == 42004) {
            lsi0.m151580j(ypv.f199497e.getString(R$string.f47433oc));
            return;
        }
        if (i == 42002) {
            lsi0.m151580j(ypv.f199497e.getString(R$string.f47070Xj));
            return;
        }
        if (i == 42006 || i == 42007) {
            lsi0.m151580j(ypv.f199497e.getString(R$string.f47640y));
            return;
        }
        if (i == 42003) {
            lsi0.m151580j(ypv.f199497e.getString(R$string.f46777K0));
            return;
        }
        if (i == 42005) {
            lsi0.m151580j(ypv.f199497e.getString(R$string.f47182d2));
            return;
        }
        String str = coreService.metaMessage;
        if (TextUtils.isEmpty(str)) {
            lsi0.m151580j(ypv.f199497e.getString(R$string.f47346kd));
        } else {
            lsi0.m151580j(str);
        }
    }
}
