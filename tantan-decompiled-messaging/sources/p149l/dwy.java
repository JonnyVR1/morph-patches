package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.tantanapp.common.data.DbObject;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class dwy {
    /* JADX INFO: renamed from: a */
    public static Message m113964a(List<Message> list, String str, long j, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.cid = str;
        tpd0 tpd0Var = App.f15373i;
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        messageNew_.messageType = MessageType.get(MessageType.local_countdown_like_success);
        messageNew_.createdTime = !list.isEmpty() ? C4728a.m31267X2(list.get(0).createdTime) : C4728a.m31263W2();
        messageNew_.localCreatedTime = System.nanoTime();
        messageNew_.localCreatedSession = tpd0Var.get().intValue();
        messageNew_.localInConversation = true;
        messageNew_.owner = CoreModule.m29931H().userId();
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.localExtraInfo = "";
        if (!TextUtils.isEmpty(str2)) {
            messageNew_.localExtraInfo = str2;
            return messageNew_;
        }
        if (j <= 0) {
            messageNew_.localExtraInfo = "00.00.00";
            return messageNew_;
        }
        messageNew_.localExtraInfo = m113965b(j);
        return messageNew_;
    }

    /* JADX INFO: renamed from: b */
    public static String m113965b(long j) {
        long jM155944o = j - mqi0.m155944o();
        if (jM155944o <= 0) {
            return "00.00.00";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH.mm.ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date date = new Date();
        date.setTime(jM155944o);
        return simpleDateFormat.format(date);
    }
}
