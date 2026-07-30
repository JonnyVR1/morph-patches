package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.DialogC13147a;

/* JADX INFO: loaded from: classes13.dex */
public class okp0 extends g2l0 {
    private String dialogUrl;

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: a */
    public void mo94566a(Act act) {
        super.mo94566a(act);
        if (TextUtils.isEmpty(this.dialogUrl)) {
            return;
        }
        new DialogC13147a(act).m80265Q(this.dialogUrl);
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: f */
    public String mo94567f() {
        return "WebViewChecker";
    }

    /* JADX INFO: renamed from: k */
    public okp0 m164889k(String str) {
        this.dialogUrl = str;
        return this;
    }
}
