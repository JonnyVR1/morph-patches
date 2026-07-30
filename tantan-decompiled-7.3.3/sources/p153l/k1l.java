package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.CommonGiftInfo;
import com.p051p1.mobile.putong.data.RecommendMessage;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class k1l {
    /* JADX INFO: renamed from: a */
    public static String m147864a(User user, List<RecommendMessage> list) {
        if (!CoreModule.m30932N().mo61451Co() || jyb.m147479J(list)) {
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
    public static List<String> m147865b(List<RecommendMessage> list) {
        if (CoreModule.m30932N().mo61451Co()) {
            return m147866c(list);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m147866c(List<RecommendMessage> list) {
        if (jyb.m147479J(list)) {
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
