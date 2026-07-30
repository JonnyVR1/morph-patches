package p153l;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ogw0 extends kgw0 {

    /* JADX INFO: renamed from: d */
    public WebView f147320d;

    /* JADX INFO: renamed from: e */
    public Long f147321e = null;

    /* JADX INFO: renamed from: f */
    public final Map f147322f;

    public ogw0(Map map, String str) {
        this.f147322f = map;
    }

    @Override // p153l.kgw0
    /* JADX INFO: renamed from: c */
    public final void mo149766c() {
        super.mo149766c();
        new Handler().postDelayed(new ngw0(this), Math.max(4000 - (this.f147321e == null ? 4000L : (System.nanoTime() - this.f147321e.longValue()) / 1000000), 2000L));
        this.f147320d = null;
    }

    @Override // p153l.kgw0
    /* JADX INFO: renamed from: g */
    public final void mo149770g(kfw0 kfw0Var, jfw0 jfw0Var) {
        JSONObject jSONObject = new JSONObject();
        Map mapM144738i = jfw0Var.m144738i();
        Iterator it = mapM144738i.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        m149771h(kfw0Var, jfw0Var, jSONObject);
    }

    @Override // p153l.kgw0
    /* JADX INFO: renamed from: k */
    public final void mo149774k() {
        WebView webView = new WebView(xfw0.m210858b().m210859a());
        this.f147320d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f147320d.getSettings().setAllowContentAccess(false);
        this.f147320d.getSettings().setAllowFileAccess(false);
        this.f147320d.setWebViewClient(new mgw0(this));
        m149773j(this.f147320d);
        dgw0.m115759i(this.f147320d, null);
        Iterator it = this.f147322f.keySet().iterator();
        if (!it.hasNext()) {
            this.f147321e = Long.valueOf(System.nanoTime());
        } else {
            throw null;
        }
    }
}
