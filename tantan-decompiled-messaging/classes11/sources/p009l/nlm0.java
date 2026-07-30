package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ConversationAdditional;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.VoiceCallAdditional;
import com.p1.mobile.putong.core.data.VoiceCallInvitationStatus;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import l.vx6;
import l.zz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class nlm0 {

    /* JADX INFO: renamed from: a */
    public static int f17572a = -1;

    /* JADX INFO: renamed from: b */
    public static boolean f17573b = false;

    /* JADX INFO: renamed from: a */
    public static CharSequence m18995a(Message message, Conversation conversation) {
        long j;
        long j2;
        VoiceCallAdditional voiceCallAdditional;
        if (!m18997c()) {
            return CoreModule.b.getResources().getString(R.string.x6);
        }
        if (conversation == null) {
            return zz6.n0(CoreModule.b.getResources().getString(R.string.H6), "");
        }
        boolean zM18996b = m18996b(message);
        ConversationAdditional conversationAdditional = conversation.additional;
        if (conversationAdditional == null || (voiceCallAdditional = conversationAdditional.voiceCall) == null) {
            j = 0;
            j2 = 0;
        } else {
            if (TextUtils.isEmpty(voiceCallAdditional.rejectedTime)) {
                j = 0;
            } else {
                try {
                    j = Long.parseLong(voiceCallAdditional.rejectedTime);
                } catch (NumberFormatException e) {
                    CrashHelper.c(e);
                    j = 0;
                }
            }
            if (TextUtils.isEmpty(voiceCallAdditional.acceptedTime)) {
                j2 = 0;
            } else {
                try {
                    j2 = Long.parseLong(voiceCallAdditional.acceptedTime);
                } catch (NumberFormatException e2) {
                    CrashHelper.c(e2);
                    j2 = 0;
                }
            }
        }
        if (message.isMe()) {
            if (zM18996b) {
                return CoreModule.b.getResources().getString(R.string.E6);
            }
            if (j <= 0 || message.createdTime > j) {
                return j2 > 0 ? CoreModule.b.getResources().getString(R.string.E6) : CoreModule.b.getResources().getString(R.string.F6);
            }
            return CoreModule.b.getResources().getString(R.string.G6);
        }
        if (zM18996b) {
            return CoreModule.b.getResources().getString(R.string.U6);
        }
        if (j <= 0 || message.createdTime > j) {
            return j2 > 0 ? CoreModule.b.getResources().getString(R.string.U6) : CoreModule.b.getResources().getString(R.string.V6);
        }
        return CoreModule.b.getResources().getString(R.string.W6);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18996b(Message message) {
        if (TextUtils.isEmpty(message.msgData)) {
            return false;
        }
        try {
            VoiceCallInvitationStatus voiceCallInvitationStatus = (VoiceCallInvitationStatus) VoiceCallInvitationStatus.JSON_ADAPTER.parse(message.msgData);
            return voiceCallInvitationStatus != null && TextUtils.equals(voiceCallInvitationStatus.status, "accepted");
        } catch (IOException e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m18997c() {
        vx6 vx6Var = CoreModule.d;
        return vx6Var == null || vx6Var.I();
    }

    /* JADX INFO: renamed from: d */
    public static void m18998d(int i) {
        f17572a = i;
    }
}
