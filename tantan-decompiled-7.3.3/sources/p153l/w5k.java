package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class w5k extends owl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: d */
    public void mo102761d(Act act, String str, PushMessageCustom pushMessageCustom) {
        super.mo102761d(act, str, pushMessageCustom);
        String str2 = pushMessageCustom.cell;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            mbs.m157821G().mo68463r9().mo108368b(VirtualVoiceGroupConversationCell.JSON_ADAPTER.parse(str2));
        } catch (IOException unused) {
        }
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: k */
    public boolean mo102762k(String str) {
        return "livechat.fixedroom.cell.newmsg".equals(str);
    }
}
