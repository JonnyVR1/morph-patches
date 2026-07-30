package p149l;

import android.text.TextUtils;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.foxstatistics.entity.SexEnum;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class t5k0 {
    /* JADX INFO: renamed from: a */
    public static HashMap<String, Object> m187334a(wj2 wj2Var) {
        HashMap<String, Object> map = new HashMap<>();
        if (wj2Var != null) {
            String strMo129174a = wj2Var.mo129174a();
            if (!TextUtils.isEmpty(strMo129174a)) {
                map.put("app", strMo129174a);
            }
            String strMo129175b = wj2Var.mo129175b();
            if (!TextUtils.isEmpty(strMo129175b)) {
                map.put("ch", strMo129175b);
            }
            map.put("intl", Boolean.valueOf(wj2Var.mo203376l()));
            String strM203364C = wj2Var.m203364C();
            if (!TextUtils.isEmpty(strM203364C)) {
                map.put("tch", strM203364C);
            }
            String strM203377m = wj2Var.m203377m();
            if (!TextUtils.isEmpty(strM203377m)) {
                map.put("lch", strM203377m);
            }
            String strM203386v = wj2Var.m203386v();
            if (!TextUtils.isEmpty(strM203386v)) {
                map.put("pushid", strM203386v);
            }
            String strM203378n = wj2Var.m203378n();
            if (!TextUtils.isEmpty(strM203378n)) {
                map.put("ls", strM203378n);
            }
            String strMo129176c = wj2Var.mo129176c();
            if (!TextUtils.isEmpty(strMo129176c)) {
                map.put("mode", strMo129176c);
            }
            String strM203375k = wj2Var.m203375k();
            if (!TextUtils.isEmpty(strM203375k)) {
                map.put("cuid", strM203375k);
            }
            String strM203390z = wj2Var.m203390z();
            if (!TextUtils.isEmpty(strM203390z)) {
                map.put("sunionid", strM203390z);
            }
            String strM203362A = wj2Var.m203362A();
            if (!TextUtils.isEmpty(strM203362A)) {
                map.put("suid", strM203362A);
            }
            String strM203370f = wj2Var.m203370f();
            if (!TextUtils.isEmpty(strM203370f)) {
                map.put("adtk", strM203370f);
            }
            String strM203374j = wj2Var.m203374j();
            if (!TextUtils.isEmpty(strM203374j)) {
                map.put("aad", strM203374j);
            }
            String strMo203365D = wj2Var.mo203365D();
            if (!TextUtils.isEmpty(strMo203365D)) {
                map.put(Oauth2AccessToken.KEY_UID, strMo203365D);
            }
            Object objMo203381q = wj2Var.mo203381q();
            if (objMo203381q != null) {
                map.put("lgtp", objMo203381q);
            }
            String strM203371g = wj2Var.m203371g();
            if (!TextUtils.isEmpty(strM203371g)) {
                map.put("appv", strM203371g);
            }
            String strM203387w = wj2Var.m203387w();
            if (!TextUtils.isEmpty(strM203387w)) {
                map.put("sdkv", strM203387w);
            }
            String strMo203372h = wj2Var.mo203372h();
            if (!TextUtils.isEmpty(strMo203372h)) {
                map.put("build", strMo203372h);
            }
            String strM203384t = wj2Var.m203384t();
            if (!TextUtils.isEmpty(strM203384t)) {
                map.put("pkg", strM203384t);
            }
            if (!TextUtils.isEmpty(wj2Var.m203368d())) {
                map.put("ab", objMo203381q);
            }
            String strM203388x = wj2Var.m203388x();
            if (!TextUtils.isEmpty(strM203388x)) {
                map.put("tss", strM203388x);
            }
            String strM203369e = wj2Var.m203369e();
            if (!TextUtils.isEmpty(strM203369e)) {
                map.put("sets.arg", strM203369e);
            }
            String strM203379o = wj2Var.m203379o();
            if (!TextUtils.isEmpty(strM203379o)) {
                map.put("sets.locset", strM203379o);
            }
            map.put("sets.locuse", Boolean.valueOf(wj2Var.m203380p()));
            String strM203373i = wj2Var.m203373i();
            if (!TextUtils.isEmpty(strM203373i)) {
                map.put("sets.grg", strM203373i);
            }
            SexEnum sexEnumM203389y = wj2Var.m203389y();
            if (sexEnumM203389y != null) {
                map.put("sets.sex", sexEnumM203389y);
            }
            JSONObject jSONObjectM203385u = wj2Var.m203385u();
            if (jSONObjectM203385u != null) {
                map.put("sets.pvc", jSONObjectM203385u);
            }
            JSONObject jSONObjectM203382r = wj2Var.m203382r();
            if (jSONObjectM203382r != null) {
                map.put("sets.nt", jSONObjectM203382r);
            }
            JSONObject jSONObjectM203383s = wj2Var.m203383s();
            if (jSONObjectM203383s != null) {
                map.put("sets.osets", jSONObjectM203383s);
            }
            JSONObject jSONObjectM203366E = wj2Var.m203366E();
            if (jSONObjectM203366E != null) {
                map.put("upf", jSONObjectM203366E);
            }
            String strM203367F = wj2Var.m203367F();
            if (!TextUtils.isEmpty(strM203367F)) {
                map.put("ut", strM203367F);
            }
            JSONObject jSONObjectM203363B = wj2Var.m203363B();
            if (jSONObjectM203363B != null) {
                map.put("sysext", jSONObjectM203363B);
            }
        }
        return map;
    }
}
