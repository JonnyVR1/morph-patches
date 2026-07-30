package p003l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.xma;
import l.y19;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ml6 {
    /* JADX INFO: renamed from: a */
    public static boolean m6409a(Conversation conversation) {
        if (NullChecker.a(conversation)) {
            return TextUtils.equals(conversation.convType, "group");
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6410b(Conversation conversation, String str) {
        if (!NullChecker.a(conversation)) {
            try {
                if (Long.parseLong(str) <= 2147483647L) {
                    return false;
                }
                CrashHelper.c(new Exception("Message Conv TypeCheck With Null: " + str));
                return true;
            } catch (Exception e) {
                CrashHelper.c(e);
                return false;
            }
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L && !TextUtils.equals(conversation.convType, "group")) {
                CrashHelper.c(new Exception("Message Conv TypeCheck With Type Error: type:" + conversation.convType + "convId:" + j + "hostId:" + conversation.otherUser));
            }
        } catch (Exception e2) {
            CrashHelper.c(e2);
        }
        return TextUtils.equals(conversation.convType, "group");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6411c(Conversation conversation) {
        return m6409a(conversation) && TextUtils.equals(conversation.group.source, "topic");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m6412d(Conversation conversation) {
        return NullChecker.a(conversation) && NullChecker.a(conversation.additional) && NullChecker.a(conversation.additional.matchInfo) && TextUtils.equals(conversation.additional.matchInfo.source, "一键配对") && TextUtils.equals(conversation.additional.matchInfo.sourceUserID, ((DbObject) CoreModule.c.e0.na()).id) && CoreModule.o.d().Vd();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m6413e(Conversation conversation) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m6414f(Conversation conversation) {
        return CoreModule.o.b().wf() && !CoreModule.K().me_().isFemale() && !xma.e4() && NullChecker.a(conversation) && NullChecker.a(conversation.property) && NullChecker.a(conversation.property.likedMe) && TextUtils.equals(conversation.property.likedMe.type, "fromWhoLikedMe") && conversation.createdTime >= ((double) y19.y());
    }
}
