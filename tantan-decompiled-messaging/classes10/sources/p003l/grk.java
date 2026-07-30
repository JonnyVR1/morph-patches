package p003l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.data.CoreStaticData;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class grk {
    /* JADX INFO: renamed from: a */
    public static String m6808a(int i, String str) {
        switch (i) {
            case 1:
                return "你们都叫同一个昵称";
            case QuickChatCardWrapper.QuickChatCardType.PASSIVE /* 2 */:
                return "ta和你同天生日";
            case QuickChatCardWrapper.QuickChatCardType.PEI_LIAO /* 3 */:
                return "你们毕业于同所学校";
            case 4:
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                return "你们都喜欢" + str;
            case CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE /* 5 */:
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                return "你们经常出没于：" + str;
            case 6:
                return "ta和你同岁同星座";
            case 7:
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                return "你们都来自" + str;
            case 8:
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                return "你们都是" + str + "后";
            case 9:
                return "ta和你同个星座";
            case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                return "帅哥/美女这么多可ta偏偏喜欢了你";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m6809b(int i) {
        switch (i) {
            case 1:
                return "问问ta起这个昵称的来由吧～";
            case QuickChatCardWrapper.QuickChatCardType.PASSIVE /* 2 */:
                return "问问ta能接受另一半的年龄段～";
            case QuickChatCardWrapper.QuickChatCardType.PEI_LIAO /* 3 */:
                return "和ta聊聊学校里的趣事吧～";
            case 4:
                return "和ta聊聊你们的共同爱好吧～";
            case CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE /* 5 */:
                return "快聊聊当地的美食吧～";
            case 6:
                return "百分之一的缘份还不打个招呼～";
            case 7:
                return "问问ta最喜欢吃的当地美食吧～";
            case 8:
                return "聊聊你们的童年趣事吧～";
            case 9:
                return "问问ta具体的生日日期吧～";
            case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                return "快和ta打个招呼吧～";
            default:
                return "";
        }
    }
}
