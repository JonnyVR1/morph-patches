package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class fpj extends o2e0<zit> {
    @Override // p153l.o2e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo97254a(zit zitVar, gae0 gae0Var, bae0.C15954b c15954b) {
        String strM219937g;
        String strM219937g2;
        ArrayList arrayList = new ArrayList();
        String strM219937g3 = "";
        try {
            arrayList = jyb.m147486Q(Arrays.asList(zitVar.m219937g("tabIdList").split(Constants.SEPARATOR_COMMA)), new epj());
        } catch (Exception unused) {
        }
        try {
            arrayList.add(Integer.valueOf(Integer.parseInt(zitVar.m219937g("tabId"))));
        } catch (Exception unused2) {
        }
        try {
            strM219937g = zitVar.m219937g("receiverId");
            try {
                strM219937g2 = zitVar.m219937g("receiverName");
                try {
                    strM219937g3 = zitVar.m219937g("receiverAvatar");
                } catch (Exception unused3) {
                }
            } catch (Exception unused4) {
                strM219937g2 = "";
            }
        } catch (Exception unused5) {
            strM219937g = "";
            strM219937g2 = strM219937g;
        }
        if (TextUtils.isEmpty(strM219937g)) {
            gae0Var.m213811F2().GiftDialogEventGroup.openGiftDialogEvent().mo199273j(new lx50().m156159i(1000).m156157g(arrayList));
        } else {
            ydn0.m215257j(gae0Var, arrayList, strM219937g, strM219937g2, strM219937g3);
        }
    }
}
