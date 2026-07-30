package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import java.io.IOException;
import l.axm;
import l.cll;
import l.exc0;
import l.ipq;
import l.stc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class p6j implements axm {
    public exc0 intercept(axm.a aVar) throws IOException {
        stc0 stc0VarRequest = aVar.request();
        if (TextUtils.isEmpty(stc0VarRequest.k().A("webApiFlag"))) {
            return aVar.a(rb20.m22786a(stc0VarRequest.h()).b());
        }
        stc0.a aVarM22786a = rb20.m22786a(stc0VarRequest.h());
        cll cllVarD = stc0VarRequest.k().p().t("webApiFlag").d();
        aVarM22786a.a(Network.AUTH, ipq.d(cllVarD.toString(), ""));
        return aVar.a(aVarM22786a.s(cllVarD).b());
    }
}
