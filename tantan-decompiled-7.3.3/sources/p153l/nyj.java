package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class nyj extends o2e0<zit> {
    @Override // p153l.o2e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo97254a(zit zitVar, gae0 gae0Var, bae0.C15954b c15954b) {
        String strM219937g = zitVar.m219937g("giftSetId");
        if (TextUtils.isEmpty(strM219937g)) {
            return;
        }
        gae0Var.m213811F2().GiftSuitEvent.showDialog().mo199273j(new qyj(200, true, strM219937g));
    }
}
