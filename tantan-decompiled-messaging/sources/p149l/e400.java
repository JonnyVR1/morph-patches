package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e400 extends fnl {

    /* JADX INFO: renamed from: c */
    public String f89238c;

    /* JADX INFO: renamed from: d */
    public PutongAct f89239d;

    /* JADX INFO: renamed from: e */
    public MKWebView f89240e;

    /* JADX INFO: renamed from: f */
    public final i400 f89241f;

    /* JADX INFO: renamed from: g */
    public String f89242g;

    public e400(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(mKWebView);
        this.f89238c = str;
        this.f89239d = putongAct;
        this.f89240e = mKWebView;
        this.f89241f = new i400(putongAct, mKWebView);
    }

    /* JADX INFO: renamed from: A */
    public void m114645A(String str) {
        this.f89242g = str;
    }

    /* JADX INFO: renamed from: B */
    public void m114646B(String str) {
        this.f89238c = str;
    }

    @Override // p149l.fnl
    /* JADX INFO: renamed from: h */
    public boolean mo104437h(String str, String str2, JSONObject jSONObject) throws Exception {
        if (m114656u()) {
            return false;
        }
        if (!jkp0.m141904d(this.f89242g)) {
            jkp0.m141906f("Dispatch JsBridge not in token whitelist, url: " + this.f89242g + ", key: " + str2 + ", methodParams: " + jSONObject);
            return false;
        }
        f400 f400VarM114647j = m114647j();
        if (f400VarM114647j == null) {
            return false;
        }
        try {
            return mo46640n(f400VarM114647j, str, str2, jSONObject) || NullChecker.m81303a(m114649m(str, str2, jSONObject));
        } catch (Exception e) {
            m114653r(e, str2, jSONObject, null);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public f400 m114647j() {
        PutongAct putongAct = this.f89239d;
        MKWebView mKWebView = this.f89240e;
        String str = this.f89238c;
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
    public final Object[] m114648k(Object[] objArr) {
        f400 f400VarM114647j = m114647j();
        if (f400VarM114647j == null) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length + 1];
        objArr2[0] = f400VarM114647j;
        System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: renamed from: m */
    public final String m114649m(String str, String str2, final JSONObject jSONObject) {
        final String str3 = str + "@" + str2;
        final n620 n620VarM129215i = h400.m129208g().m129215i(str3);
        if (n620VarM129215i == null) {
            return null;
        }
        try {
            final ef2 ef2VarM114652q = m114652q(n620VarM129215i);
            try {
                if (!n620VarM129215i.f137265c) {
                    return m114657v(n620VarM129215i, ef2VarM114652q, str3, jSONObject);
                }
                e51.m114748M(new Runnable() { // from class: l.d400
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f84270a.m114657v(n620VarM129215i, ef2VarM114652q, str3, jSONObject);
                    }
                });
                return "";
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
        }
        m114653r(e, str3, jSONObject, n620VarM129215i);
        return "";
    }

    /* JADX INFO: renamed from: n */
    public abstract boolean mo46640n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject);

    /* JADX INFO: renamed from: o */
    public final String m114650o(String... strArr) {
        if (strArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (NullChecker.m81303a(strArr[i])) {
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
    /* JADX INFO: renamed from: p */
    public i400 m114651p() {
        return this.f89241f;
    }

    /* JADX INFO: renamed from: q */
    public final ef2 m114652q(n620 n620Var) throws Exception {
        ef2 ef2VarM129213f = h400.m129208g().m129213f(this.f89240e, n620Var.f137264b);
        if (ef2VarM129213f == null) {
            ef2 ef2VarNewInstance = n620Var.f137264b.newInstance();
            if (ef2VarNewInstance instanceof ef2) {
                ef2 ef2Var = ef2VarNewInstance;
                ef2Var.m116018b();
                h400.m129208g().m129209b(this.f89240e, n620Var.f137264b, ef2Var);
                return ef2Var;
            }
        }
        return ef2VarM129213f;
    }

    /* JADX INFO: renamed from: r */
    public void m114653r(Exception exc, String str, JSONObject jSONObject, n620 n620Var) {
        Class<? extends ef2> cls;
        StringBuilder sb = new StringBuilder("key = ");
        sb.append(str);
        sb.append(",params = ");
        sb.append(jSONObject);
        sb.append(",url = ");
        sb.append(this.f89242g);
        sb.append(",clazz = ");
        sb.append((n620Var == null || (cls = n620Var.f137264b) == null) ? null : cls.getName());
        sb.append(",msg = ");
        sb.append(exc.getMessage());
        CrashHelper.m81296c(new Exception(sb.toString(), exc));
    }

    /* JADX INFO: renamed from: s */
    public final String m114654s(n620 n620Var, ef2 ef2Var, String str, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object[] objArrM114648k = m114648k(objArr);
        if (objArrM114648k == null) {
            return "";
        }
        Object objInvoke = n620Var.f137263a.invoke(ef2Var, objArrM114648k);
        return NullChecker.m81303a(objInvoke) ? objInvoke.toString() : "";
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final String m114657v(n620 n620Var, ef2 ef2Var, String str, JSONObject jSONObject) throws IllegalAccessException, InvocationTargetException {
        return m114654s(n620Var, ef2Var, str, new Object[]{jSONObject});
    }

    /* JADX INFO: renamed from: u */
    public final boolean m114656u() {
        PutongAct putongAct = this.f89239d;
        return putongAct == null || putongAct.isFinishing() || this.f89240e == null;
    }

    /* JADX INFO: renamed from: w */
    public void mo114658w() {
        if (NullChecker.m81303a(this.f89240e)) {
            h400.m129208g().m129210c(this.f89240e);
            mo100662l(this.f89240e);
        }
        this.f89239d = null;
        this.f89240e = null;
    }

    /* JADX INFO: renamed from: x */
    public void m114659x(String str) {
        m122324c(str, null);
    }

    /* JADX INFO: renamed from: y */
    public void m114660y(String str, String... strArr) {
        m122324c(str, m114650o(strArr));
    }

    /* JADX INFO: renamed from: z */
    public void m114661z(JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString("callback");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        m114660y(strOptString, str);
    }

    /* JADX INFO: renamed from: l */
    public void mo100662l(MKWebView mKWebView) {
    }
}
