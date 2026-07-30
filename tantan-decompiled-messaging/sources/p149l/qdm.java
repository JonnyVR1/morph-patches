package p149l;

import com.p046p1.mobile.putong.core.data.ChatGiftInfo;
import com.p046p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p046p1.mobile.putong.core.data.GreetSendGiftConfig;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.remote_config.RemoteConfigException;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class qdm {
    /* JADX INFO: renamed from: a */
    public static String m174045a(boolean z) {
        try {
            GreetSendGiftConfig greetSendGiftConfig = (GreetSendGiftConfig) RemoteConfig.m79298x().m79333v("greet_send_gift_config", GreetSendGiftConfig.JSON_ADAPTER);
            return z ? greetSendGiftConfig.maleSubTitle : greetSendGiftConfig.femaleSubTitle;
        } catch (RemoteConfigException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m174046b(boolean z) {
        try {
            GreetSendGiftConfig greetSendGiftConfig = (GreetSendGiftConfig) RemoteConfig.m79298x().m79333v("greet_send_gift_config", GreetSendGiftConfig.JSON_ADAPTER);
            return z ? greetSendGiftConfig.maleTitle : greetSendGiftConfig.femaleTitle;
        } catch (RemoteConfigException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static ChatGiftInfoExtra m174047c(Message message) {
        ChatGiftInfo chatGiftInfo;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData != null && (chatGiftInfo = messageAdditionalData.chatGiftInfo) != null) {
            try {
                return ChatGiftInfoExtra.JSON_ADAPTER.parse(chatGiftInfo.extra);
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
