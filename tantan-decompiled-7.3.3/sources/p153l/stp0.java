package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.DialogC13310a;

/* JADX INFO: loaded from: classes9.dex */
public class stp0 extends lbl0 {
    private String dialogUrl;

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: a */
    public void mo96996a(Act act) {
        super.mo96996a(act);
        if (TextUtils.isEmpty(this.dialogUrl)) {
            return;
        }
        new DialogC13310a(act).m81448Q(this.dialogUrl);
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: f */
    public String mo96997f() {
        return "WebViewChecker";
    }

    /* JADX INFO: renamed from: k */
    public stp0 m187892k(String str) {
        this.dialogUrl = str;
        return this;
    }
}
