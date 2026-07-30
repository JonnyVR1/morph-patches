package p149l;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class i7w0 extends e7w0 {

    /* JADX INFO: renamed from: d */
    public WebView f111955d;

    /* JADX INFO: renamed from: e */
    public Long f111956e = null;

    /* JADX INFO: renamed from: f */
    public final Map f111957f;

    public i7w0(Map map, String str) {
        this.f111957f = map;
    }

    @Override // p149l.e7w0
    /* JADX INFO: renamed from: c */
    public final void mo115218c() {
        super.mo115218c();
        new Handler().postDelayed(new h7w0(this), Math.max(4000 - (this.f111956e == null ? 4000L : (System.nanoTime() - this.f111956e.longValue()) / 1000000), 2000L));
        this.f111955d = null;
    }

    @Override // p149l.e7w0
    /* JADX INFO: renamed from: g */
    public final void mo115222g(e6w0 e6w0Var, d6w0 d6w0Var) {
        JSONObject jSONObject = new JSONObject();
        Map mapM110201i = d6w0Var.m110201i();
        Iterator it = mapM110201i.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        m115223h(e6w0Var, d6w0Var, jSONObject);
    }

    @Override // p149l.e7w0
    /* JADX INFO: renamed from: k */
    public final void mo115226k() {
        WebView webView = new WebView(r6w0.m178099b().m178100a());
        this.f111955d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f111955d.getSettings().setAllowContentAccess(false);
        this.f111955d.getSettings().setAllowFileAccess(false);
        this.f111955d.setWebViewClient(new g7w0(this));
        m115225j(this.f111955d);
        x6w0.m207212i(this.f111955d, null);
        Iterator it = this.f111957f.keySet().iterator();
        if (!it.hasNext()) {
            this.f111956e = Long.valueOf(System.nanoTime());
        } else {
            throw null;
        }
    }
}
