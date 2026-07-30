package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.api.api.TantanException;
import l.lsi0;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qlt {
    /* JADX INFO: renamed from: a */
    public static void m21479a(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.j(ypv.e.getString(R$string.f3388kd));
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        int i = coreService.code;
        if (i == 42001) {
            lsi0.j(ypv.e.getString(R$string.f3388kd));
            return;
        }
        if (i == 42004) {
            lsi0.j(ypv.e.getString(R$string.f3475oc));
            return;
        }
        if (i == 42002) {
            lsi0.j(ypv.e.getString(R$string.f3112Xj));
            return;
        }
        if (i == 42006 || i == 42007) {
            lsi0.j(ypv.e.getString(R$string.f3682y));
            return;
        }
        if (i == 42003) {
            lsi0.j(ypv.e.getString(R$string.f2819K0));
            return;
        }
        if (i == 42005) {
            lsi0.j(ypv.e.getString(R$string.f3224d2));
            return;
        }
        String str = coreService.metaMessage;
        if (TextUtils.isEmpty(str)) {
            lsi0.j(ypv.e.getString(R$string.f3388kd));
        } else {
            lsi0.j(str);
        }
    }
}
