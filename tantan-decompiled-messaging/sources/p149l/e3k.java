package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class e3k extends aul {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: d */
    public void mo100100d(Act act, String str, PushMessageCustom pushMessageCustom) {
        super.mo100100d(act, str, pushMessageCustom);
        String str2 = pushMessageCustom.cell;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            l9s.m149044G().mo67280r9().mo123876b(VirtualVoiceGroupConversationCell.JSON_ADAPTER.parse(str2));
        } catch (IOException unused) {
        }
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: k */
    public boolean mo100101k(String str) {
        return "livechat.fixedroom.cell.newmsg".equals(str);
    }
}
