package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.tantanapp.common.data.DbObject;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class a5z {
    /* JADX INFO: renamed from: a */
    public static Message m96255a(List<Message> list, String str, long j, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.cid = str;
        vxd0 vxd0Var = App.f16092i;
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        messageNew_.messageType = MessageType.get(MessageType.local_countdown_like_success);
        messageNew_.createdTime = !list.isEmpty() ? C4879a.m32270X2(list.get(0).createdTime) : C4879a.m32266W2();
        messageNew_.localCreatedTime = System.nanoTime();
        messageNew_.localCreatedSession = vxd0Var.get().intValue();
        messageNew_.localInConversation = true;
        messageNew_.owner = CoreModule.m30929H().userId();
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
        messageNew_.localExtraInfo = m96256b(j);
        return messageNew_;
    }

    /* JADX INFO: renamed from: b */
    public static String m96256b(long j) {
        long jM174454o = j - pzi0.m174454o();
        if (jM174454o <= 0) {
            return "00.00.00";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH.mm.ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date date = new Date();
        date.setTime(jM174454o);
        return simpleDateFormat.format(date);
    }
}
