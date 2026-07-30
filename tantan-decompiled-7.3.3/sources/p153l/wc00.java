package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class wc00 extends qpl {

    /* JADX INFO: renamed from: c */
    public String f188307c;

    /* JADX INFO: renamed from: d */
    public PutongAct f188308d;

    /* JADX INFO: renamed from: e */
    public MKWebView f188309e;

    /* JADX INFO: renamed from: f */
    public final ad00 f188310f;

    /* JADX INFO: renamed from: g */
    public String f188311g;

    public wc00(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(mKWebView);
        this.f188307c = str;
        this.f188308d = putongAct;
        this.f188309e = mKWebView;
        this.f188310f = new ad00(putongAct, mKWebView);
    }

    /* JADX INFO: renamed from: A */
    public final String m205734A(ve20 ve20Var, lf2 lf2Var, String str, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object[] objArrM205744s = m205744s(objArr);
        if (objArrM205744s == null) {
            return "";
        }
        Object objInvoke = ve20Var.f183696a.invoke(lf2Var, objArrM205744s);
        return NullChecker.m82486a(objInvoke) ? objInvoke.toString() : "";
    }

    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final String m205737D(ve20 ve20Var, lf2 lf2Var, String str, JSONObject jSONObject) throws IllegalAccessException, InvocationTargetException {
        return m205734A(ve20Var, lf2Var, str, new Object[]{jSONObject});
    }

    /* JADX INFO: renamed from: C */
    public final boolean m205736C() {
        PutongAct putongAct = this.f188308d;
        return putongAct == null || putongAct.isFinishing() || this.f188309e == null;
    }

    /* JADX INFO: renamed from: E */
    public void mo185185E() {
        if (NullChecker.m82486a(this.f188309e)) {
            zc00.m219220g().m219222c(this.f188309e);
            mo104210t(this.f188309e);
        }
        this.f188308d = null;
        this.f188309e = null;
    }

    /* JADX INFO: renamed from: F */
    public void m205738F(String str) {
        m177463g(str, null);
    }

    /* JADX INFO: renamed from: G */
    public void m205739G(String str, String... strArr) {
        m177463g(str, m205746w(strArr));
    }

    /* JADX INFO: renamed from: H */
    public void m205740H(JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString("callback");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        m205739G(strOptString, str);
    }

    /* JADX INFO: renamed from: I */
    public void m205741I(String str) {
        this.f188311g = str;
    }

    /* JADX INFO: renamed from: J */
    public void m205742J(String str) {
        this.f188307c = str;
    }

    @Override // p153l.qpl
    /* JADX INFO: renamed from: p */
    public boolean mo18018p(String str, String str2, JSONObject jSONObject) throws Exception {
        if (m205736C()) {
            return false;
        }
        if (!ntp0.m164746d(this.f188311g)) {
            ntp0.m164748f("Dispatch JsBridge not in token whitelist, url: " + this.f188311g + ", key: " + str2 + ", methodParams: " + jSONObject);
            return false;
        }
        xc00 xc00VarM205743r = m205743r();
        if (xc00VarM205743r == null) {
            return false;
        }
        try {
            return mo47831v(xc00VarM205743r, str, str2, jSONObject) || NullChecker.m82486a(m205745u(str, str2, jSONObject));
        } catch (Exception e) {
            m205749z(e, str2, jSONObject, null);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public xc00 m205743r() {
        PutongAct putongAct = this.f188308d;
        MKWebView mKWebView = this.f188309e;
        String str = this.f188307c;
        if (putongAct == null || putongAct.isFinishing() || mKWebView == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        return new xc00(this, putongAct, mKWebView, str);
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final Object[] m205744s(Object[] objArr) {
        xc00 xc00VarM205743r = m205743r();
        if (xc00VarM205743r == null) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length + 1];
        objArr2[0] = xc00VarM205743r;
        System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: renamed from: u */
    public final String m205745u(String str, String str2, final JSONObject jSONObject) {
        final String str3 = str + "@" + str2;
        final ve20 ve20VarM219227i = zc00.m219220g().m219227i(str3);
        if (ve20VarM219227i == null) {
            return null;
        }
        try {
            final lf2 lf2VarM205748y = m205748y(ve20VarM219227i);
            try {
                if (!ve20VarM219227i.f183698c) {
                    return m205737D(ve20VarM219227i, lf2VarM205748y, str3, jSONObject);
                }
                l51.m152893M(new Runnable() { // from class: l.vc00
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f183303a.m205737D(ve20VarM219227i, lf2VarM205748y, str3, jSONObject);
                    }
                });
                return "";
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
        }
        m205749z(e, str3, jSONObject, ve20VarM219227i);
        return "";
    }

    /* JADX INFO: renamed from: v */
    public abstract boolean mo47831v(@NonNull xc00 xc00Var, String str, String str2, JSONObject jSONObject);

    /* JADX INFO: renamed from: w */
    public final String m205746w(String... strArr) {
        if (strArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (NullChecker.m82486a(strArr[i])) {
                sb.append(strArr[i]);
                sb.append(Constants.SEPARATOR_COMMA);
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public ad00 m205747x() {
        return this.f188310f;
    }

    /* JADX INFO: renamed from: y */
    public final lf2 m205748y(ve20 ve20Var) throws Exception {
        lf2 lf2VarM219225f = zc00.m219220g().m219225f(this.f188309e, ve20Var.f183697b);
        if (lf2VarM219225f == null) {
            lf2 lf2VarNewInstance = ve20Var.f183697b.newInstance();
            if (lf2VarNewInstance instanceof lf2) {
                lf2 lf2Var = lf2VarNewInstance;
                lf2Var.m153962b();
                zc00.m219220g().m219221b(this.f188309e, ve20Var.f183697b, lf2Var);
                return lf2Var;
            }
        }
        return lf2VarM219225f;
    }

    /* JADX INFO: renamed from: z */
    public void m205749z(Exception exc, String str, JSONObject jSONObject, ve20 ve20Var) {
        Class<? extends lf2> cls;
        StringBuilder sb = new StringBuilder("key = ");
        sb.append(str);
        sb.append(",params = ");
        sb.append(jSONObject);
        sb.append(",url = ");
        sb.append(this.f188311g);
        sb.append(",clazz = ");
        sb.append((ve20Var == null || (cls = ve20Var.f183697b) == null) ? null : cls.getName());
        sb.append(",msg = ");
        sb.append(exc.getMessage());
        CrashHelper.m82479c(new Exception(sb.toString(), exc));
    }

    /* JADX INFO: renamed from: t */
    public void mo104210t(MKWebView mKWebView) {
    }
}
