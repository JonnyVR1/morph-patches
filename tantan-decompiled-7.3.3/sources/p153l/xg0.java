package p153l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.AiPictureMsgData;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import java.io.File;
import java.util.ArrayList;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
public class xg0 {

    /* JADX INFO: renamed from: a */
    public static final String f194123a;

    /* JADX INFO: renamed from: b */
    public static C22507a<String> f194124b;

    /* JADX INFO: renamed from: l.xg0$a */
    public class C21331a implements qcj<Media, Boolean> {
        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Media media) {
            return Boolean.valueOf(media != null && media.mediaType.startsWith("image/"));
        }
    }

    static {
        f194123a = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/ai-draw/index.html?speed=true&_bid=1004194&hideNotch=1&hideNavigationBar=1#/");
        f194124b = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m210870a(User user) {
        if (user == null) {
            return false;
        }
        ArrayList arrayListM147522n = jyb.m147522n(user.pictures, new C21331a());
        if (jyb.m147479J(arrayListM147522n)) {
            String str = TEnum.equals(user.gender, "female") ? "她" : "他";
            r1j0.m179420g(String.format("%s没有可用的头像照片，提醒%s上传五官清晰的照片吧~", str, str));
        }
        return !jyb.m147479J(arrayListM147522n);
    }

    /* JADX INFO: renamed from: b */
    public static Message m210871b(File file, String str, String str2) {
        if (file == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = oki.m168011B(file.getPath());
        pictureNew_.mediaType = "image/*";
        pictureNew_.status = MediaLocalStatus.get("raw");
        Message messageNew_ = Message.new_();
        ArrayList arrayList = new ArrayList();
        arrayList.add(pictureNew_);
        messageNew_.value = "图片";
        messageNew_.media = arrayList;
        messageNew_.messageType = MessageType.get(MessageType.ai_picture);
        AiPictureMsgData aiPictureMsgDataNew_ = AiPictureMsgData.new_();
        aiPictureMsgDataNew_.momoImgUrl = str;
        aiPictureMsgDataNew_.taskId = str2;
        messageNew_.msgData = aiPictureMsgDataNew_.toJson();
        return messageNew_;
    }

    /* JADX INFO: renamed from: c */
    public static void m210872c(Act act, User user, String str) {
        if (m210870a(user)) {
            Uri.Builder builderBuildUpon = Uri.parse(f194123a).buildUpon();
            builderBuildUpon.appendQueryParameter("from", str);
            builderBuildUpon.appendQueryParameter("userId", user.f56859id);
            builderBuildUpon.appendQueryParameter("gender", user.gender.toString());
            Intent intentM81421d2 = MkWebViewAct.m81421d2(act, "", builderBuildUpon.toString(), true, true, null);
            intentM81421d2.putExtra("hideNotch", true);
            act.startActivity(intentM81421d2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m210873d(Conversation conversation) {
        return (conversation == null || !TextUtils.equals(conversation.convType, "default") || TEnum.equals(conversation.status, "dismissed") || TEnum.equals(conversation.status, "blocked")) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m210874e(User user) {
        if (user == null) {
            return false;
        }
        return ((!jyb.m147479J(user.status) && user.status.contains(UserStatus.get("hidden")) && (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_UNREAL)) || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_FAKE_BATCH_STATUS)))) || user.isBanedOrInactivated() || user.isTeamAccount()) ? false : true;
    }
}
