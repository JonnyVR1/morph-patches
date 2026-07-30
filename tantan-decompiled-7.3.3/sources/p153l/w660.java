package p153l;

import android.net.Uri;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.OMSAction;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;

/* JADX INFO: loaded from: classes10.dex */
public class w660 extends c4k0 {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m205081f(String str, String str2) {
    }

    @Override // p153l.c4k0
    /* JADX INFO: renamed from: c */
    public boolean mo106291c(OMSAction oMSAction) {
        Uri uri = Uri.parse(dsi0.m117767g(oMSAction.type));
        if (uri.toString().startsWith("http")) {
            Act act = this.f79710a.f55069a;
            this.f79710a.f55069a.startActivity(WebViewAct.m81347a2(act, act.getString(R$string.f18187m2), uri.toString()));
        } else if ("tantan".equals(uri.getScheme()) || "tantanapp".equals(uri.getScheme()) || "tantantribe".equals(uri.getScheme())) {
            nae0.m162084n(this.f79710a.f55069a, uri, new z20() { // from class: l.v660
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    w660.m205081f((String) obj, (String) obj2);
                }
            });
        }
        m107886b();
        return true;
    }

    @Override // p153l.c4k0
    /* JADX INFO: renamed from: d */
    public String mo106292d() {
        return "";
    }
}
