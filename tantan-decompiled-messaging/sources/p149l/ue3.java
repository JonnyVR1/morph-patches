package p149l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ue3 extends ug2<MKWebView> {

    /* JADX INFO: renamed from: b */
    private String f175985b;

    /* JADX INFO: renamed from: c */
    private int f175986c;

    /* JADX INFO: renamed from: d */
    private int f175987d;

    /* JADX INFO: renamed from: e */
    private String f175988e;

    /* JADX INFO: renamed from: f */
    private String f175989f;

    /* JADX INFO: renamed from: l.ue3$b */
    public static class C20412b {

        /* JADX INFO: renamed from: a */
        private MKWebView f175990a;

        /* JADX INFO: renamed from: b */
        private String f175991b;

        /* JADX INFO: renamed from: c */
        private int f175992c;

        /* JADX INFO: renamed from: d */
        private int f175993d;

        /* JADX INFO: renamed from: e */
        private String f175994e;

        /* JADX INFO: renamed from: f */
        private String f175995f;

        /* JADX INFO: renamed from: a */
        public ue3 m193198a() {
            ue3 ue3Var = new ue3(this.f175990a);
            ue3Var.f175985b = this.f175991b;
            ue3Var.f175986c = this.f175992c;
            ue3Var.f175988e = this.f175994e;
            ue3Var.f175987d = this.f175993d;
            ue3Var.f175989f = this.f175995f;
            return ue3Var;
        }

        /* JADX INFO: renamed from: b */
        public C20412b m193199b(int i) {
            this.f175993d = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C20412b m193200c(String str) {
            this.f175995f = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C20412b m193201d(String str) {
            this.f175991b = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C20412b m193202e(MKWebView mKWebView) {
            this.f175990a = mKWebView;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C20412b m193203f(int i) {
            this.f175992c = i;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C20412b m193204g(String str) {
            this.f175994e = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: i */
    private boolean m193196i() {
        return (m193478a() == null || TextUtils.isEmpty(this.f175985b)) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    private void m193197j(boolean z, JSONObject jSONObject) {
        Object obj;
        JSONObject jSONObjectM149941b;
        Object obj2;
        if (m193196i()) {
            int i = z ? this.f175986c : this.f175987d;
            String str = z ? this.f175988e : this.f175989f;
            if (TextUtils.isEmpty(str)) {
                String[] strArr = {NotificationCompat.CATEGORY_STATUS, "data"};
                String strValueOf = String.valueOf(i);
                if (jSONObject == null) {
                    obj = jSONObject;
                    obj = "";
                }
                obj = jSONObject;
                jSONObjectM149941b = liw.m149941b(strArr, new Object[]{strValueOf, obj});
            } else {
                String[] strArr2 = {NotificationCompat.CATEGORY_STATUS, "message", "data"};
                String strValueOf2 = String.valueOf(i);
                if (jSONObject == null) {
                    obj2 = jSONObject;
                    obj2 = "";
                }
                obj2 = jSONObject;
                jSONObjectM149941b = liw.m149941b(strArr2, new Object[]{strValueOf2, str, obj2});
            }
            m193478a().m87086o0(this.f175985b, jSONObjectM149941b.toString());
        }
    }

    @Override // p149l.ug2
    /* JADX INFO: renamed from: b */
    public void mo97996b(String str) {
        m193197j(false, null);
    }

    @Override // p149l.ug2
    /* JADX INFO: renamed from: c */
    public void mo97997c(JSONObject jSONObject) {
        if (mxv.m156929d()) {
            mxv.m156926a("BridgeAsyncCallback", "onSuccess:" + jSONObject);
        }
        m193197j(true, jSONObject);
    }

    private ue3(MKWebView mKWebView) {
        super(mKWebView);
    }
}
