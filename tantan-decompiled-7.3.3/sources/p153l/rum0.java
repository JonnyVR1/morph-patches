package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationAdditional;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.VoiceCallAdditional;
import com.p051p1.mobile.putong.core.data.VoiceCallInvitationStatus;
import com.p051p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class rum0 {

    /* JADX INFO: renamed from: a */
    public static int f164924a = -1;

    /* JADX INFO: renamed from: b */
    public static boolean f164925b = false;

    /* JADX INFO: renamed from: a */
    public static CharSequence m183206a(Message message, Conversation conversation) {
        long j;
        long j2;
        VoiceCallAdditional voiceCallAdditional;
        if (!m183208c()) {
            return CoreModule.f18263b.getResources().getString(R$string.f21865x6);
        }
        if (conversation == null) {
            return c17.m107521n0(CoreModule.f18263b.getResources().getString(R$string.f21513H6), "");
        }
        boolean zM183207b = m183207b(message);
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
                    CrashHelper.m82479c(e);
                    j = 0;
                }
            }
            if (TextUtils.isEmpty(voiceCallAdditional.acceptedTime)) {
                j2 = 0;
            } else {
                try {
                    j2 = Long.parseLong(voiceCallAdditional.acceptedTime);
                } catch (NumberFormatException e2) {
                    CrashHelper.m82479c(e2);
                    j2 = 0;
                }
            }
        }
        if (message.isMe()) {
            if (zM183207b) {
                return CoreModule.f18263b.getResources().getString(R$string.f21489E6);
            }
            if (j <= 0 || message.createdTime > j) {
                return j2 > 0 ? CoreModule.f18263b.getResources().getString(R$string.f21489E6) : CoreModule.f18263b.getResources().getString(R$string.f21497F6);
            }
            return CoreModule.f18263b.getResources().getString(R$string.f21505G6);
        }
        if (zM183207b) {
            return CoreModule.f18263b.getResources().getString(R$string.f21617U6);
        }
        if (j <= 0 || message.createdTime > j) {
            return j2 > 0 ? CoreModule.f18263b.getResources().getString(R$string.f21617U6) : CoreModule.f18263b.getResources().getString(R$string.f21625V6);
        }
        return CoreModule.f18263b.getResources().getString(R$string.f21633W6);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m183207b(Message message) {
        if (TextUtils.isEmpty(message.msgData)) {
            return false;
        }
        try {
            VoiceCallInvitationStatus voiceCallInvitationStatus = VoiceCallInvitationStatus.JSON_ADAPTER.parse(message.msgData);
            return voiceCallInvitationStatus != null && TextUtils.equals(voiceCallInvitationStatus.status, "accepted");
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m183208c() {
        yy6 yy6Var = CoreModule.f18265d;
        return yy6Var == null || yy6Var.m217948I();
    }

    /* JADX INFO: renamed from: d */
    public static void m183209d(int i) {
        f164924a = i;
    }
}
