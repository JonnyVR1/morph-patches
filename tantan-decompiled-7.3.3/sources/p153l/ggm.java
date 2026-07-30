package p153l;

import com.p051p1.mobile.putong.core.data.ChatGiftInfo;
import com.p051p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p051p1.mobile.putong.core.data.GreetSendGiftConfig;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.remote_config.RemoteConfigException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ggm {
    /* JADX INFO: renamed from: a */
    public static String m130165a(boolean z) {
        try {
            GreetSendGiftConfig greetSendGiftConfig = (GreetSendGiftConfig) RemoteConfig.m80481x().m80516v("greet_send_gift_config", GreetSendGiftConfig.JSON_ADAPTER);
            return z ? greetSendGiftConfig.maleSubTitle : greetSendGiftConfig.femaleSubTitle;
        } catch (RemoteConfigException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m130166b(boolean z) {
        try {
            GreetSendGiftConfig greetSendGiftConfig = (GreetSendGiftConfig) RemoteConfig.m80481x().m80516v("greet_send_gift_config", GreetSendGiftConfig.JSON_ADAPTER);
            return z ? greetSendGiftConfig.maleTitle : greetSendGiftConfig.femaleTitle;
        } catch (RemoteConfigException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static ChatGiftInfoExtra m130167c(Message message) {
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
