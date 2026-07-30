package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.MessageAccessory;
import com.xiaomi.push.service.C14990am;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
class v0r0 {
    /* JADX INFO: renamed from: a */
    public static void m198911a(C14990am.b bVar, String str, u1r0 u1r0Var) {
        String strM178073b;
        hzq0 hzq0Var = new hzq0();
        if (!TextUtils.isEmpty(bVar.f63743c)) {
            hzq0Var.m137920k(bVar.f63743c);
        }
        if (!TextUtils.isEmpty(bVar.f63745e)) {
            hzq0Var.m137930u(bVar.f63745e);
        }
        if (!TextUtils.isEmpty(bVar.f63746f)) {
            hzq0Var.m137933x(bVar.f63746f);
        }
        hzq0Var.m137924o(bVar.f63739a ? "1" : "0");
        if (TextUtils.isEmpty(bVar.f63744d)) {
            hzq0Var.m137927r("XIAOMI-SASL");
        } else {
            hzq0Var.m137927r(bVar.f63744d);
        }
        w0r0 w0r0Var = new w0r0();
        w0r0Var.m204316B(bVar.f63741b);
        w0r0Var.m204324h(Integer.parseInt(bVar.f63747g));
        w0r0Var.m204338v(bVar.f63737a);
        w0r0Var.m204328l("BIND", null);
        w0r0Var.m204327k(w0r0Var.m204317D());
        ouq0.m169393m("[Slim]: bind id=" + w0r0Var.m204317D());
        HashMap map = new HashMap();
        map.put(MessageAccessory.TYPE_CHALLENGE, str);
        map.put("token", bVar.f63743c);
        map.put("chid", bVar.f63747g);
        map.put("from", bVar.f63741b);
        map.put("id", w0r0Var.m204317D());
        map.put("to", "xiaomi.com");
        if (bVar.f63739a) {
            map.put("kick", "1");
        } else {
            map.put("kick", "0");
        }
        if (TextUtils.isEmpty(bVar.f63745e)) {
            map.put("client_attrs", "");
        } else {
            map.put("client_attrs", bVar.f63745e);
        }
        if (TextUtils.isEmpty(bVar.f63746f)) {
            map.put("cloud_attrs", "");
        } else {
            map.put("cloud_attrs", bVar.f63746f);
        }
        if (bVar.f63744d.equals("XIAOMI-PASS") || bVar.f63744d.equals("XMPUSH-PASS")) {
            strM178073b = qtq0.m178073b(bVar.f63744d, null, map, bVar.f63748h);
        } else {
            bVar.f63744d.equals("XIAOMI-SASL");
            strM178073b = null;
        }
        hzq0Var.m137917A(strM178073b);
        w0r0Var.m204330n(hzq0Var.m118923h(), null);
        u1r0Var.mo113631w(w0r0Var);
    }

    /* JADX INFO: renamed from: b */
    public static void m198912b(String str, String str2, u1r0 u1r0Var) {
        w0r0 w0r0Var = new w0r0();
        w0r0Var.m204316B(str2);
        w0r0Var.m204324h(Integer.parseInt(str));
        w0r0Var.m204328l("UBND", null);
        u1r0Var.mo113631w(w0r0Var);
    }
}
