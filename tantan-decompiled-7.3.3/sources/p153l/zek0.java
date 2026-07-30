package p153l;

import android.text.TextUtils;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.foxstatistics.entity.SexEnum;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class zek0 {
    /* JADX INFO: renamed from: a */
    public static HashMap<String, Object> m219499a(ek2 ek2Var) {
        HashMap<String, Object> map = new HashMap<>();
        if (ek2Var != null) {
            String strMo138529a = ek2Var.mo138529a();
            if (!TextUtils.isEmpty(strMo138529a)) {
                map.put("app", strMo138529a);
            }
            String strMo138530b = ek2Var.mo138530b();
            if (!TextUtils.isEmpty(strMo138530b)) {
                map.put("ch", strMo138530b);
            }
            map.put("intl", Boolean.valueOf(ek2Var.mo121015l()));
            String strM121003C = ek2Var.m121003C();
            if (!TextUtils.isEmpty(strM121003C)) {
                map.put("tch", strM121003C);
            }
            String strM121016m = ek2Var.m121016m();
            if (!TextUtils.isEmpty(strM121016m)) {
                map.put("lch", strM121016m);
            }
            String strM121025v = ek2Var.m121025v();
            if (!TextUtils.isEmpty(strM121025v)) {
                map.put("pushid", strM121025v);
            }
            String strM121017n = ek2Var.m121017n();
            if (!TextUtils.isEmpty(strM121017n)) {
                map.put("ls", strM121017n);
            }
            String strMo138531c = ek2Var.mo138531c();
            if (!TextUtils.isEmpty(strMo138531c)) {
                map.put("mode", strMo138531c);
            }
            String strM121014k = ek2Var.m121014k();
            if (!TextUtils.isEmpty(strM121014k)) {
                map.put("cuid", strM121014k);
            }
            String strM121029z = ek2Var.m121029z();
            if (!TextUtils.isEmpty(strM121029z)) {
                map.put("sunionid", strM121029z);
            }
            String strM121001A = ek2Var.m121001A();
            if (!TextUtils.isEmpty(strM121001A)) {
                map.put("suid", strM121001A);
            }
            String strM121009f = ek2Var.m121009f();
            if (!TextUtils.isEmpty(strM121009f)) {
                map.put("adtk", strM121009f);
            }
            String strM121013j = ek2Var.m121013j();
            if (!TextUtils.isEmpty(strM121013j)) {
                map.put("aad", strM121013j);
            }
            String strMo121004D = ek2Var.mo121004D();
            if (!TextUtils.isEmpty(strMo121004D)) {
                map.put(Oauth2AccessToken.KEY_UID, strMo121004D);
            }
            Object objMo121020q = ek2Var.mo121020q();
            if (objMo121020q != null) {
                map.put("lgtp", objMo121020q);
            }
            String strM121010g = ek2Var.m121010g();
            if (!TextUtils.isEmpty(strM121010g)) {
                map.put("appv", strM121010g);
            }
            String strM121026w = ek2Var.m121026w();
            if (!TextUtils.isEmpty(strM121026w)) {
                map.put("sdkv", strM121026w);
            }
            String strMo121011h = ek2Var.mo121011h();
            if (!TextUtils.isEmpty(strMo121011h)) {
                map.put("build", strMo121011h);
            }
            String strM121023t = ek2Var.m121023t();
            if (!TextUtils.isEmpty(strM121023t)) {
                map.put("pkg", strM121023t);
            }
            if (!TextUtils.isEmpty(ek2Var.m121007d())) {
                map.put("ab", objMo121020q);
            }
            String strM121027x = ek2Var.m121027x();
            if (!TextUtils.isEmpty(strM121027x)) {
                map.put("tss", strM121027x);
            }
            String strM121008e = ek2Var.m121008e();
            if (!TextUtils.isEmpty(strM121008e)) {
                map.put("sets.arg", strM121008e);
            }
            String strM121018o = ek2Var.m121018o();
            if (!TextUtils.isEmpty(strM121018o)) {
                map.put("sets.locset", strM121018o);
            }
            map.put("sets.locuse", Boolean.valueOf(ek2Var.m121019p()));
            String strM121012i = ek2Var.m121012i();
            if (!TextUtils.isEmpty(strM121012i)) {
                map.put("sets.grg", strM121012i);
            }
            SexEnum sexEnumM121028y = ek2Var.m121028y();
            if (sexEnumM121028y != null) {
                map.put("sets.sex", sexEnumM121028y);
            }
            JSONObject jSONObjectM121024u = ek2Var.m121024u();
            if (jSONObjectM121024u != null) {
                map.put("sets.pvc", jSONObjectM121024u);
            }
            JSONObject jSONObjectM121021r = ek2Var.m121021r();
            if (jSONObjectM121021r != null) {
                map.put("sets.nt", jSONObjectM121021r);
            }
            JSONObject jSONObjectM121022s = ek2Var.m121022s();
            if (jSONObjectM121022s != null) {
                map.put("sets.osets", jSONObjectM121022s);
            }
            JSONObject jSONObjectM121005E = ek2Var.m121005E();
            if (jSONObjectM121005E != null) {
                map.put("upf", jSONObjectM121005E);
            }
            String strM121006F = ek2Var.m121006F();
            if (!TextUtils.isEmpty(strM121006F)) {
                map.put("ut", strM121006F);
            }
            JSONObject jSONObjectM121002B = ek2Var.m121002B();
            if (jSONObjectM121002B != null) {
                map.put("sysext", jSONObjectM121002B);
            }
        }
        return map;
    }
}
