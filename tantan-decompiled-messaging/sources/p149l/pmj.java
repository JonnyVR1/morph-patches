package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class pmj extends kud0<ygt> {
    @Override // p149l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo95830a(ygt ygtVar, c2e0 c2e0Var, x1e0.C21019b c21019b) {
        String strM214763g;
        String strM214763g2;
        ArrayList arrayList = new ArrayList();
        String strM214763g3 = "";
        try {
            arrayList = vwb.m200303Q(Arrays.asList(ygtVar.m214763g("tabIdList").split(Constants.SEPARATOR_COMMA)), new omj());
        } catch (Exception unused) {
        }
        try {
            arrayList.add(Integer.valueOf(Integer.parseInt(ygtVar.m214763g("tabId"))));
        } catch (Exception unused2) {
        }
        try {
            strM214763g = ygtVar.m214763g("receiverId");
            try {
                strM214763g2 = ygtVar.m214763g("receiverName");
                try {
                    strM214763g3 = ygtVar.m214763g("receiverAvatar");
                } catch (Exception unused3) {
                }
            } catch (Exception unused4) {
                strM214763g2 = "";
            }
        } catch (Exception unused5) {
            strM214763g = "";
            strM214763g2 = strM214763g;
        }
        if (TextUtils.isEmpty(strM214763g)) {
            c2e0Var.m206028F2().GiftDialogEventGroup.openGiftDialogEvent().mo172463j(new fp50().m122565i(1000).m122563g(arrayList));
        } else {
            u4n0.m191751j(c2e0Var, arrayList, strM214763g, strM214763g2, strM214763g3);
        }
    }
}
