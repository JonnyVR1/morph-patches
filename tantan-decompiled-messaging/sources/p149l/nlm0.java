package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationAdditional;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.VoiceCallAdditional;
import com.p046p1.mobile.putong.core.data.VoiceCallInvitationStatus;
import com.p046p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class nlm0 {

    /* JADX INFO: renamed from: a */
    public static int f139568a = -1;

    /* JADX INFO: renamed from: b */
    public static boolean f139569b = false;

    /* JADX INFO: renamed from: a */
    public static CharSequence m160068a(Message message, Conversation conversation) {
        long j;
        long j2;
        VoiceCallAdditional voiceCallAdditional;
        if (!m160070c()) {
            return CoreModule.f17544b.getResources().getString(R$string.f21123x6);
        }
        if (conversation == null) {
            return zz6.m220997n0(CoreModule.f17544b.getResources().getString(R$string.f20771H6), "");
        }
        boolean zM160069b = m160069b(message);
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
                    CrashHelper.m81296c(e);
                    j = 0;
                }
            }
            if (TextUtils.isEmpty(voiceCallAdditional.acceptedTime)) {
                j2 = 0;
            } else {
                try {
                    j2 = Long.parseLong(voiceCallAdditional.acceptedTime);
                } catch (NumberFormatException e2) {
                    CrashHelper.m81296c(e2);
                    j2 = 0;
                }
            }
        }
        if (message.isMe()) {
            if (zM160069b) {
                return CoreModule.f17544b.getResources().getString(R$string.f20747E6);
            }
            if (j <= 0 || message.createdTime > j) {
                return j2 > 0 ? CoreModule.f17544b.getResources().getString(R$string.f20747E6) : CoreModule.f17544b.getResources().getString(R$string.f20755F6);
            }
            return CoreModule.f17544b.getResources().getString(R$string.f20763G6);
        }
        if (zM160069b) {
            return CoreModule.f17544b.getResources().getString(R$string.f20875U6);
        }
        if (j <= 0 || message.createdTime > j) {
            return j2 > 0 ? CoreModule.f17544b.getResources().getString(R$string.f20875U6) : CoreModule.f17544b.getResources().getString(R$string.f20883V6);
        }
        return CoreModule.f17544b.getResources().getString(R$string.f20891W6);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m160069b(Message message) {
        if (TextUtils.isEmpty(message.msgData)) {
            return false;
        }
        try {
            VoiceCallInvitationStatus voiceCallInvitationStatus = VoiceCallInvitationStatus.JSON_ADAPTER.parse(message.msgData);
            return voiceCallInvitationStatus != null && TextUtils.equals(voiceCallInvitationStatus.status, "accepted");
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m160070c() {
        vx6 vx6Var = CoreModule.f17546d;
        return vx6Var == null || vx6Var.m200502I();
    }

    /* JADX INFO: renamed from: d */
    public static void m160071d(int i) {
        f139568a = i;
    }
}
