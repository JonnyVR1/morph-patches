package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class o7f0 extends o2e0<zit> {
    @Override // p153l.o2e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo97254a(zit zitVar, gae0 gae0Var, bae0.C15954b c15954b) {
        int i = 2;
        try {
            if (!TextUtils.isEmpty(zitVar.m219937g("position"))) {
                i = Integer.parseInt(zitVar.m219937g("position"));
            }
        } catch (NumberFormatException unused) {
        }
        gae0Var.m213811F2().MultiCallEvent.openApplyDlg().mo199273j(Integer.valueOf(i));
    }
}
