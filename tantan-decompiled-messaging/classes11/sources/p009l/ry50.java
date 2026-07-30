package p009l;

import android.net.Uri;
import com.p000p1.mobile.putong.p004ui.webview.WebViewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.data.OMSAction;
import l.f30;
import l.j2e0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ry50 extends zuj0 {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m21890f(String str, String str2) {
    }

    @Override // p009l.zuj0
    /* JADX INFO: renamed from: c */
    public boolean mo11784c(OMSAction oMSAction) {
        Uri uri = Uri.parse(dji0.m13360g(oMSAction.type));
        if (uri.toString().startsWith("http")) {
            Act act = this.f23916a.f7827a;
            this.f23916a.f7827a.startActivity(WebViewAct.m10498Z1(act, act.getString(R.string.m2), uri.toString()));
        } else if ("tantan".equals(uri.getScheme()) || "tantanapp".equals(uri.getScheme()) || "tantantribe".equals(uri.getScheme())) {
            j2e0.n(this.f23916a.f7827a, uri, new f30() { // from class: l.qy50
                public final void call(Object obj, Object obj2) {
                    ry50.m21890f((String) obj, (String) obj2);
                }
            });
        }
        m25982b();
        return true;
    }

    @Override // p009l.zuj0
    /* JADX INFO: renamed from: d */
    public String mo11785d() {
        return "";
    }
}
