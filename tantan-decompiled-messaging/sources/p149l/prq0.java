package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.MessageAccessory;
import com.xiaomi.push.service.C14842am;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
class prq0 {
    /* JADX INFO: renamed from: a */
    public static void m171058a(C14842am.b bVar, String str, osq0 osq0Var) {
        String strM146352b;
        bqq0 bqq0Var = new bqq0();
        if (!TextUtils.isEmpty(bVar.f62896c)) {
            bqq0Var.m103394k(bVar.f62896c);
        }
        if (!TextUtils.isEmpty(bVar.f62898e)) {
            bqq0Var.m103404u(bVar.f62898e);
        }
        if (!TextUtils.isEmpty(bVar.f62899f)) {
            bqq0Var.m103407x(bVar.f62899f);
        }
        bqq0Var.m103398o(bVar.f62892a ? "1" : "0");
        if (TextUtils.isEmpty(bVar.f62897d)) {
            bqq0Var.m103401r("XIAOMI-SASL");
        } else {
            bqq0Var.m103401r(bVar.f62897d);
        }
        qrq0 qrq0Var = new qrq0();
        qrq0Var.m176079B(bVar.f62894b);
        qrq0Var.m176088h(Integer.parseInt(bVar.f62900g));
        qrq0Var.m176102v(bVar.f62890a);
        qrq0Var.m176092l("BIND", null);
        qrq0Var.m176091k(qrq0Var.m176080D());
        ilq0.m137040m("[Slim]: bind id=" + qrq0Var.m176080D());
        HashMap map = new HashMap();
        map.put(MessageAccessory.TYPE_CHALLENGE, str);
        map.put("token", bVar.f62896c);
        map.put("chid", bVar.f62900g);
        map.put("from", bVar.f62894b);
        map.put("id", qrq0Var.m176080D());
        map.put("to", "xiaomi.com");
        if (bVar.f62892a) {
            map.put("kick", "1");
        } else {
            map.put("kick", "0");
        }
        if (TextUtils.isEmpty(bVar.f62898e)) {
            map.put("client_attrs", "");
        } else {
            map.put("client_attrs", bVar.f62898e);
        }
        if (TextUtils.isEmpty(bVar.f62899f)) {
            map.put("cloud_attrs", "");
        } else {
            map.put("cloud_attrs", bVar.f62899f);
        }
        if (bVar.f62897d.equals("XIAOMI-PASS") || bVar.f62897d.equals("XMPUSH-PASS")) {
            strM146352b = kkq0.m146352b(bVar.f62897d, null, map, bVar.f62901h);
        } else {
            bVar.f62897d.equals("XIAOMI-SASL");
            strM146352b = null;
        }
        bqq0Var.m103391A(strM146352b);
        qrq0Var.m176094n(bqq0Var.m215761h(), null);
        osq0Var.mo165902w(qrq0Var);
    }

    /* JADX INFO: renamed from: b */
    public static void m171059b(String str, String str2, osq0 osq0Var) {
        qrq0 qrq0Var = new qrq0();
        qrq0Var.m176079B(str2);
        qrq0Var.m176088h(Integer.parseInt(str));
        qrq0Var.m176092l("UBND", null);
        osq0Var.mo165902w(qrq0Var);
    }
}
