package p149l;

import android.net.Uri;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.OMSAction;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;

/* JADX INFO: loaded from: classes11.dex */
public class ry50 extends zuj0 {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m181659f(String str, String str2) {
    }

    @Override // p149l.zuj0
    /* JADX INFO: renamed from: c */
    public boolean mo99645c(OMSAction oMSAction) {
        Uri uri = Uri.parse(dji0.m112044g(oMSAction.type));
        if (uri.toString().startsWith("http")) {
            Act act = this.f204856a.f54221a;
            this.f204856a.f54221a.startActivity(WebViewAct.m80164Z1(act, act.getString(R$string.f17468m2), uri.toString()));
        } else if ("tantan".equals(uri.getScheme()) || "tantanapp".equals(uri.getScheme()) || "tantantribe".equals(uri.getScheme())) {
            j2e0.m139447n(this.f204856a.f54221a, uri, new f30() { // from class: l.qy50
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    ry50.m181659f((String) obj, (String) obj2);
                }
            });
        }
        m220231b();
        return true;
    }

    @Override // p149l.zuj0
    /* JADX INFO: renamed from: d */
    public String mo99646d() {
        return "";
    }
}
