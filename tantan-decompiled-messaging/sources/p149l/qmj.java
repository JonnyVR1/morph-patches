package p149l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class qmj extends lud0<ygt> {
    @Override // p149l.lud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo113728a(ygt ygtVar, yqu yquVar, @Nullable w1e0.C20785b c20785b) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList = vwb.m200303Q(Arrays.asList(ygtVar.m214763g("tabIdList").split(Constants.SEPARATOR_COMMA)), new omj());
            arrayList.add(Integer.valueOf(Integer.parseInt(ygtVar.m214763g("tabId"))));
        } catch (Exception unused) {
        }
        yquVar.m218411K2().LiveVChatOpenH5Event.m69189a().m172467p();
        yquVar.m218411K2().GiftDialogEventGroup.m69178f().mo172463j(new fp50().m122565i(1000).m122563g(arrayList));
    }
}
