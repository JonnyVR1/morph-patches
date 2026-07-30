package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class hze0 extends kud0<ygt> {
    @Override // p149l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo95830a(ygt ygtVar, c2e0 c2e0Var, x1e0.C21019b c21019b) {
        int i = 2;
        try {
            if (!TextUtils.isEmpty(ygtVar.m214763g("position"))) {
                i = Integer.parseInt(ygtVar.m214763g("position"));
            }
        } catch (NumberFormatException unused) {
        }
        c2e0Var.m206028F2().MultiCallEvent.openApplyDlg().mo172463j(Integer.valueOf(i));
    }
}
