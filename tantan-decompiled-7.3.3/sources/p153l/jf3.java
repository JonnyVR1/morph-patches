package p153l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class jf3 extends bh2<hul> {

    /* JADX INFO: renamed from: b */
    private String f120549b;

    /* JADX INFO: renamed from: c */
    private int f120550c;

    /* JADX INFO: renamed from: d */
    private int f120551d;

    /* JADX INFO: renamed from: e */
    private String f120552e;

    /* JADX INFO: renamed from: f */
    private String f120553f;

    /* JADX INFO: renamed from: l.jf3$b */
    public static class C17939b {

        /* JADX INFO: renamed from: a */
        private hul f120554a;

        /* JADX INFO: renamed from: b */
        private String f120555b;

        /* JADX INFO: renamed from: c */
        private int f120556c;

        /* JADX INFO: renamed from: d */
        private int f120557d;

        /* JADX INFO: renamed from: e */
        private String f120558e;

        /* JADX INFO: renamed from: f */
        private String f120559f;

        /* JADX INFO: renamed from: a */
        public jf3 m144658a() {
            jf3 jf3Var = new jf3(this.f120554a);
            jf3Var.f120549b = this.f120555b;
            jf3Var.f120550c = this.f120556c;
            jf3Var.f120552e = this.f120558e;
            jf3Var.f120551d = this.f120557d;
            jf3Var.f120553f = this.f120559f;
            return jf3Var;
        }

        /* JADX INFO: renamed from: b */
        public C17939b m144659b(int i) {
            this.f120557d = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C17939b m144660c(String str) {
            this.f120559f = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C17939b m144661d(String str) {
            this.f120555b = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C17939b m144662e(hul hulVar) {
            this.f120554a = hulVar;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C17939b m144663f(int i) {
            this.f120556c = i;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C17939b m144664g(String str) {
            this.f120558e = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: g */
    private boolean m144654g() {
        return (m104290a() == null || TextUtils.isEmpty(this.f120549b)) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    private void m144655j(boolean z, JSONObject jSONObject) {
        Object obj;
        JSONObject jSONObjectM130705b;
        Object obj2;
        if (m144654g()) {
            int i = z ? this.f120550c : this.f120551d;
            String str = z ? this.f120552e : this.f120553f;
            if (TextUtils.isEmpty(str)) {
                String[] strArr = {NotificationCompat.CATEGORY_STATUS, "data"};
                String strValueOf = String.valueOf(i);
                if (jSONObject == null) {
                    obj = jSONObject;
                    obj = "";
                }
                obj = jSONObject;
                jSONObjectM130705b = glw.m130705b(strArr, new Object[]{strValueOf, obj});
            } else {
                String[] strArr2 = {NotificationCompat.CATEGORY_STATUS, "message", "data"};
                String strValueOf2 = String.valueOf(i);
                if (jSONObject == null) {
                    obj2 = jSONObject;
                    obj2 = "";
                }
                obj2 = jSONObject;
                jSONObjectM130705b = glw.m130705b(strArr2, new Object[]{strValueOf2, str, obj2});
            }
            m104290a().mo17918d(this.f120549b, jSONObjectM130705b.toString());
        }
    }

    /* JADX INFO: renamed from: h */
    public void m144656h(String str) {
        m144655j(false, null);
    }

    /* JADX INFO: renamed from: i */
    public void m144657i(JSONObject jSONObject) {
        if (jzv.m147733f()) {
            jzv.m147728a("BridgeAsyncCallback", "onSuccess:" + jSONObject);
        }
        m144655j(true, jSONObject);
    }

    private jf3(hul hulVar) {
        super(hulVar);
    }
}
