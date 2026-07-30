package p003l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.CommonGiftInfo;
import com.p1.mobile.putong.data.RecommendMessage;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uyk {
    /* JADX INFO: renamed from: a */
    public static String m9792a(User user, List<RecommendMessage> list) {
        if (!CoreModule.N().Co() || vwb.J(list)) {
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
    public static List<String> m9793b(List<RecommendMessage> list) {
        if (CoreModule.N().Co()) {
            return m9794c(list);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m9794c(List<RecommendMessage> list) {
        if (vwb.J(list)) {
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
