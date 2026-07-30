package p009l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import java.lang.reflect.InvocationTargetException;
import l.e51;
import l.fnl;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class e400 extends fnl {

    /* JADX INFO: renamed from: c */
    public String f12357c;

    /* JADX INFO: renamed from: d */
    public PutongAct f12358d;

    /* JADX INFO: renamed from: e */
    public MKWebView f12359e;

    /* JADX INFO: renamed from: f */
    public final i400 f12360f;

    /* JADX INFO: renamed from: g */
    public String f12361g;

    public e400(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(mKWebView);
        this.f12357c = str;
        this.f12358d = putongAct;
        this.f12359e = mKWebView;
        this.f12360f = new i400(putongAct, mKWebView);
    }

    /* JADX INFO: renamed from: A */
    public void m13703A(String str) {
        this.f12361g = str;
    }

    /* JADX INFO: renamed from: B */
    public void m13704B(String str) {
        this.f12357c = str;
    }

    /* JADX INFO: renamed from: h */
    public boolean m13705h(String str, String str2, JSONObject jSONObject) throws Exception {
        if (m13715u()) {
            return false;
        }
        if (!jkp0.m17145d(this.f12361g)) {
            jkp0.m17147f("Dispatch JsBridge not in token whitelist, url: " + this.f12361g + ", key: " + str2 + ", methodParams: " + jSONObject);
            return false;
        }
        f400 f400VarM13706j = m13706j();
        if (f400VarM13706j == null) {
            return false;
        }
        try {
            return mo10568n(f400VarM13706j, str, str2, jSONObject) || NullChecker.a(m13708m(str, str2, jSONObject));
        } catch (Exception e) {
            m13712r(e, str2, jSONObject, null);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public f400 m13706j() {
        PutongAct putongAct = this.f12358d;
        MKWebView mKWebView = this.f12359e;
        String str = this.f12357c;
        if (putongAct == null || putongAct.isFinishing() || mKWebView == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        return new f400(this, putongAct, mKWebView, str);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final Object[] m13707k(Object[] objArr) {
        f400 f400VarM13706j = m13706j();
        if (f400VarM13706j == null) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length + 1];
        objArr2[0] = f400VarM13706j;
        System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: renamed from: m */
    public final String m13708m(String str, String str2, final JSONObject jSONObject) {
        final String str3 = str + "@" + str2;
        final n620 n620VarM15401i = h400.m15394g().m15401i(str3);
        if (n620VarM15401i == null) {
            return null;
        }
        try {
            final ef2 ef2VarM13711q = m13711q(n620VarM15401i);
            try {
                if (!n620VarM15401i.f17230c) {
                    return m13716v(n620VarM15401i, ef2VarM13711q, str3, jSONObject);
                }
                e51.M(new Runnable() { // from class: l.d400
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11631a.m13716v(n620VarM15401i, ef2VarM13711q, str3, jSONObject);
                    }
                });
                return "";
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
        }
        m13712r(e, str3, jSONObject, n620VarM15401i);
        return "";
    }

    /* JADX INFO: renamed from: n */
    public abstract boolean mo10568n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject);

    /* JADX INFO: renamed from: o */
    public final String m13709o(String... strArr) {
        if (strArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (NullChecker.a(strArr[i])) {
                sb.append(strArr[i]);
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public i400 m13710p() {
        return this.f12360f;
    }

    /* JADX INFO: renamed from: q */
    public final ef2 m13711q(n620 n620Var) throws Exception {
        ef2 ef2VarM15399f = h400.m15394g().m15399f(this.f12359e, n620Var.f17229b);
        if (ef2VarM15399f == null) {
            ef2 ef2VarNewInstance = n620Var.f17229b.newInstance();
            if (ef2VarNewInstance instanceof ef2) {
                ef2 ef2Var = ef2VarNewInstance;
                ef2Var.m13832b();
                h400.m15394g().m15395b(this.f12359e, n620Var.f17229b, ef2Var);
                return ef2Var;
            }
        }
        return ef2VarM15399f;
    }

    /* JADX INFO: renamed from: r */
    public void m13712r(Exception exc, String str, JSONObject jSONObject, n620 n620Var) {
        Class<? extends ef2> cls;
        StringBuilder sb = new StringBuilder("key = ");
        sb.append(str);
        sb.append(",params = ");
        sb.append(jSONObject);
        sb.append(",url = ");
        sb.append(this.f12361g);
        sb.append(",clazz = ");
        sb.append((n620Var == null || (cls = n620Var.f17229b) == null) ? null : cls.getName());
        sb.append(",msg = ");
        sb.append(exc.getMessage());
        CrashHelper.c(new Exception(sb.toString(), exc));
    }

    /* JADX INFO: renamed from: s */
    public final String m13713s(n620 n620Var, ef2 ef2Var, String str, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object[] objArrM13707k = m13707k(objArr);
        if (objArrM13707k == null) {
            return "";
        }
        Object objInvoke = n620Var.f17228a.invoke(ef2Var, objArrM13707k);
        return NullChecker.a(objInvoke) ? objInvoke.toString() : "";
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final String m13716v(n620 n620Var, ef2 ef2Var, String str, JSONObject jSONObject) throws IllegalAccessException, InvocationTargetException {
        return m13713s(n620Var, ef2Var, str, new Object[]{jSONObject});
    }

    /* JADX INFO: renamed from: u */
    public final boolean m13715u() {
        PutongAct putongAct = this.f12358d;
        return putongAct == null || putongAct.isFinishing() || this.f12359e == null;
    }

    /* JADX INFO: renamed from: w */
    public void mo13717w() {
        if (NullChecker.a(this.f12359e)) {
            h400.m15394g().m15396c(this.f12359e);
            mo11879l(this.f12359e);
        }
        this.f12358d = null;
        this.f12359e = null;
    }

    /* JADX INFO: renamed from: x */
    public void m13718x(String str) {
        c(str, (String) null);
    }

    /* JADX INFO: renamed from: y */
    public void m13719y(String str, String... strArr) {
        c(str, m13709o(strArr));
    }

    /* JADX INFO: renamed from: z */
    public void m13720z(JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString("callback");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        m13719y(strOptString, str);
    }

    /* JADX INFO: renamed from: l */
    public void mo11879l(MKWebView mKWebView) {
    }
}
