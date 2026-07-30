package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.CommonGiftInfo;
import com.p046p1.mobile.putong.data.RecommendMessage;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class uyk {
    /* JADX INFO: renamed from: a */
    public static String m196292a(User user, List<RecommendMessage> list) {
        if (!CoreModule.m29934N().mo60267Co() || vwb.m200296J(list)) {
            return "";
        }
        for (RecommendMessage recommendMessage : list) {
            if (TextUtils.equals(MessageType.chat_gift, recommendMessage.messageType) && recommendMessage.giftInfo.extra.stickerURL != null) {
                boolean zIsFemale = user.isFemale();
                CommonGiftInfo commonGiftInfo = recommendMessage.giftInfo;
                return zIsFemale ? commonGiftInfo.extra.stickerURL.femaleStickerURL : commonGiftInfo.extra.stickerURL.maleStickerURL;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m196293b(List<RecommendMessage> list) {
        if (CoreModule.m29934N().mo60267Co()) {
            return m196294c(list);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m196294c(List<RecommendMessage> list) {
        if (vwb.m200296J(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (RecommendMessage recommendMessage : list) {
            if (TextUtils.equals("text", recommendMessage.messageType) && !TextUtils.isEmpty(recommendMessage.messageValue)) {
                arrayList.add("\"" + recommendMessage.messageValue + "\"");
            }
        }
        return arrayList;
    }
}
