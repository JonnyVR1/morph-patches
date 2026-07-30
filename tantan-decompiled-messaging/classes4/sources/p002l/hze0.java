package p002l;

import android.text.TextUtils;
import l.ygt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hze0 extends kud0<ygt> {
    @Override // p002l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9496a(ygt ygtVar, c2e0 c2e0Var, x1e0.C0892b c0892b) {
        int i = 2;
        try {
            if (!TextUtils.isEmpty(ygtVar.g("position"))) {
                i = Integer.parseInt(ygtVar.g("position"));
            }
        } catch (NumberFormatException unused) {
        }
        c2e0Var.m25548F2().MultiCallEvent.openApplyDlg().j(Integer.valueOf(i));
    }
}
