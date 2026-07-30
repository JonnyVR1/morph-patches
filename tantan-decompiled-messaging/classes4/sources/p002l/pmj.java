package p002l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import l.omj;
import l.u4n0;
import l.vwb;
import l.ygt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pmj extends kud0<ygt> {
    @Override // p002l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9496a(ygt ygtVar, c2e0 c2e0Var, x1e0.C0892b c0892b) {
        String strG;
        String strG2;
        ArrayList arrayList = new ArrayList();
        String strG3 = "";
        try {
            arrayList = vwb.Q(Arrays.asList(ygtVar.g("tabIdList").split(",")), new omj());
        } catch (Exception unused) {
        }
        try {
            arrayList.add(Integer.valueOf(Integer.parseInt(ygtVar.g("tabId"))));
        } catch (Exception unused2) {
        }
        try {
            strG = ygtVar.g("receiverId");
            try {
                strG2 = ygtVar.g("receiverName");
                try {
                    strG3 = ygtVar.g("receiverAvatar");
                } catch (Exception unused3) {
                }
            } catch (Exception unused4) {
                strG2 = "";
            }
        } catch (Exception unused5) {
            strG = "";
            strG2 = strG;
        }
        if (TextUtils.isEmpty(strG)) {
            c2e0Var.m25548F2().GiftDialogEventGroup.openGiftDialogEvent().j(new fp50().m13445i(1000).m13443g(arrayList));
        } else {
            u4n0.j(c2e0Var, arrayList, strG, strG2, strG3);
        }
    }
}
