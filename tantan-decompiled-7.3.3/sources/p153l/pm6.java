package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class pm6 {
    /* JADX INFO: renamed from: a */
    public static boolean m172913a(Conversation conversation) {
        if (NullChecker.m82486a(conversation)) {
            return TextUtils.equals(conversation.convType, "group");
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m172914b(Conversation conversation, String str) {
        if (!NullChecker.m82486a(conversation)) {
            try {
                if (Long.parseLong(str) <= 2147483647L) {
                    return false;
                }
                CrashHelper.m82479c(new Exception("Message Conv TypeCheck With Null: " + str));
                return true;
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                return false;
            }
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L && !TextUtils.equals(conversation.convType, "group")) {
                CrashHelper.m82479c(new Exception("Message Conv TypeCheck With Type Error: type:" + conversation.convType + "convId:" + j + "hostId:" + conversation.otherUser));
            }
        } catch (Exception e2) {
            CrashHelper.m82479c(e2);
        }
        return TextUtils.equals(conversation.convType, "group");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m172915c(Conversation conversation) {
        return m172913a(conversation) && TextUtils.equals(conversation.group.source, "topic");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m172916d(Conversation conversation) {
        return NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation.additional) && NullChecker.m82486a(conversation.additional.matchInfo) && TextUtils.equals(conversation.additional.matchInfo.source, "一键配对") && TextUtils.equals(conversation.additional.matchInfo.sourceUserID, CoreModule.f18264c.f20381e0.m116593na().f56859id) && CoreModule.f18276o.m132214d().mo34769Vd();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m172917e(Conversation conversation) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m172918f(Conversation conversation) {
        return CoreModule.f18276o.m132212b().mo34652wf() && !CoreModule.m30930K().me_().isFemale() && !joa.m146386f4() && NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation.property) && NullChecker.m82486a(conversation.property.likedMe) && TextUtils.equals(conversation.property.likedMe.type, "fromWhoLikedMe") && conversation.createdTime >= ((double) h39.m133461y());
    }
}
