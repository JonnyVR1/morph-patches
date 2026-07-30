package p149l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class we80 extends fnl {

    /* JADX INFO: renamed from: l.we80$a */
    public class RunnableC20861a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f185911a;

        public RunnableC20861a(JSONObject jSONObject) {
            this.f185911a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            MKWebView mKWebView = we80.this.f98430a;
            if (mKWebView == null || mKWebView.m87089v0()) {
                return;
            }
            String strOptString = this.f185911a.optString("url");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            String strOptString2 = this.f185911a.optString("callback");
            xe80.m208518e().m208522g(we80.this.f98430a, strOptString);
            we80.this.m122324c(strOptString2, liw.m149941b(new String[]{NotificationCompat.CATEGORY_STATUS}, new Object[]{0}).toString());
        }
    }

    /* JADX INFO: renamed from: l.we80$b */
    public class RunnableC20862b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JSONObject f185913a;

        public RunnableC20862b(JSONObject jSONObject) {
            this.f185913a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strOptString = this.f185913a.optString("url");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            xe80.m208518e().m208521c(strOptString);
        }
    }

    public we80(MKWebView mKWebView) {
        super(mKWebView);
    }

    /* JADX INFO: renamed from: i */
    private void m202886i(JSONObject jSONObject) {
        pv00.m171494b(new RunnableC20862b(jSONObject));
    }

    /* JADX INFO: renamed from: j */
    private void m202887j(JSONObject jSONObject) {
        pv00.m171494b(new RunnableC20861a(jSONObject));
    }

    @Override // p149l.fnl
    /* JADX INFO: renamed from: h */
    public boolean mo104437h(String str, String str2, JSONObject jSONObject) throws Exception {
        str2.getClass();
        if (str2.equals("prepare")) {
            m202887j(jSONObject);
            return true;
        }
        if (!str2.equals("destroy")) {
            return false;
        }
        m202886i(jSONObject);
        return true;
    }
}
