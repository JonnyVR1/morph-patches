package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class ml6 {
    /* JADX INFO: renamed from: a */
    public static boolean m155116a(Conversation conversation) {
        if (NullChecker.m81303a(conversation)) {
            return TextUtils.equals(conversation.convType, "group");
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m155117b(Conversation conversation, String str) {
        if (!NullChecker.m81303a(conversation)) {
            try {
                if (Long.parseLong(str) <= 2147483647L) {
                    return false;
                }
                CrashHelper.m81296c(new Exception("Message Conv TypeCheck With Null: " + str));
                return true;
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                return false;
            }
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L && !TextUtils.equals(conversation.convType, "group")) {
                CrashHelper.m81296c(new Exception("Message Conv TypeCheck With Type Error: type:" + conversation.convType + "convId:" + j + "hostId:" + conversation.otherUser));
            }
        } catch (Exception e2) {
            CrashHelper.m81296c(e2);
        }
        return TextUtils.equals(conversation.convType, "group");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m155118c(Conversation conversation) {
        return m155116a(conversation) && TextUtils.equals(conversation.group.source, "topic");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m155119d(Conversation conversation) {
        return NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation.additional) && NullChecker.m81303a(conversation.additional.matchInfo) && TextUtils.equals(conversation.additional.matchInfo.source, "一键配对") && TextUtils.equals(conversation.additional.matchInfo.sourceUserID, CoreModule.f17545c.f19639e0.m169520na().f56011id) && CoreModule.f17557o.m195057d().mo33766Vd();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m155120e(Conversation conversation) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m155121f(Conversation conversation) {
        return CoreModule.f17557o.m195055b().mo33649wf() && !CoreModule.m29932K().me_().isFemale() && !xma.m210071e4() && NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation.property) && NullChecker.m81303a(conversation.property.likedMe) && TextUtils.equals(conversation.property.likedMe.type, "fromWhoLikedMe") && conversation.createdTime >= ((double) y19.m212190y());
    }
}
