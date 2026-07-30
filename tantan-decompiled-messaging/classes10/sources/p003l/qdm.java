package p003l;

import com.p000p1.mobile.putong.core.data.ChatGiftInfo;
import com.p000p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p000p1.mobile.putong.core.data.GreetSendGiftConfig;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.remote_config.RemoteConfigException;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qdm {
    /* JADX INFO: renamed from: a */
    public static String m8974a(boolean z) {
        try {
            GreetSendGiftConfig greetSendGiftConfig = (GreetSendGiftConfig) RemoteConfig.x().v("greet_send_gift_config", GreetSendGiftConfig.JSON_ADAPTER);
            return z ? greetSendGiftConfig.maleSubTitle : greetSendGiftConfig.femaleSubTitle;
        } catch (RemoteConfigException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m8975b(boolean z) {
        try {
            GreetSendGiftConfig greetSendGiftConfig = (GreetSendGiftConfig) RemoteConfig.x().v("greet_send_gift_config", GreetSendGiftConfig.JSON_ADAPTER);
            return z ? greetSendGiftConfig.maleTitle : greetSendGiftConfig.femaleTitle;
        } catch (RemoteConfigException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static ChatGiftInfoExtra m8976c(Message message) {
        ChatGiftInfo chatGiftInfo;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData != null && (chatGiftInfo = messageAdditionalData.chatGiftInfo) != null) {
            try {
                return (ChatGiftInfoExtra) ChatGiftInfoExtra.JSON_ADAPTER.parse(chatGiftInfo.extra);
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
