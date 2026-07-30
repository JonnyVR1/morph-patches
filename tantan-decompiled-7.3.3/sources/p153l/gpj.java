package p153l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class gpj extends p2e0<zit> {
    @Override // p153l.p2e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo131279a(zit zitVar, zsu zsuVar, @Nullable aae0.C15677b c15677b) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList = jyb.m147486Q(Arrays.asList(zitVar.m219937g("tabIdList").split(Constants.SEPARATOR_COMMA)), new epj());
            arrayList.add(Integer.valueOf(Integer.parseInt(zitVar.m219937g("tabId"))));
        } catch (Exception unused) {
        }
        zsuVar.m97928K2().LiveVChatOpenH5Event.m70372a().m199277p();
        zsuVar.m97928K2().GiftDialogEventGroup.m70361f().mo199273j(new lx50().m156159i(1000).m156157g(arrayList));
    }
}
