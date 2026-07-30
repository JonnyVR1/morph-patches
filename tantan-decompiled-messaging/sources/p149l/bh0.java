package p149l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.AiPictureMsgData;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import java.io.File;
import java.util.ArrayList;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes3.dex */
public class bh0 {

    /* JADX INFO: renamed from: a */
    public static final String f75543a;

    /* JADX INFO: renamed from: b */
    public static C22392a<String> f75544b;

    /* JADX INFO: renamed from: l.bh0$a */
    public class C15858a implements w9j<Media, Boolean> {
        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Media media) {
            return Boolean.valueOf(media != null && media.mediaType.startsWith("image/"));
        }
    }

    static {
        f75543a = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/ai-draw/index.html?speed=true&_bid=1004194&hideNotch=1&hideNavigationBar=1#/");
        f75544b = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m101751a(User user) {
        if (user == null) {
            return false;
        }
        ArrayList arrayListM200339n = vwb.m200339n(user.pictures, new C15858a());
        if (vwb.m200296J(arrayListM200339n)) {
            String str = TEnum.equals(user.gender, "female") ? "她" : "他";
            osi0.m165783g(String.format("%s没有可用的头像照片，提醒%s上传五官清晰的照片吧~", str, str));
        }
        return !vwb.m200296J(arrayListM200339n);
    }

    /* JADX INFO: renamed from: b */
    public static Message m101752b(File file, String str, String str2) {
        if (file == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = rhi.m179355B(file.getPath());
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
    public static void m101753c(Act act, User user, String str) {
        if (m101751a(user)) {
            Uri.Builder builderBuildUpon = Uri.parse(f75543a).buildUpon();
            builderBuildUpon.appendQueryParameter("from", str);
            builderBuildUpon.appendQueryParameter("userId", user.f56011id);
            builderBuildUpon.appendQueryParameter("gender", user.gender.toString());
            Intent intentM80238c2 = MkWebViewAct.m80238c2(act, "", builderBuildUpon.toString(), true, true, null);
            intentM80238c2.putExtra("hideNotch", true);
            act.startActivity(intentM80238c2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m101754d(Conversation conversation) {
        return (conversation == null || !TextUtils.equals(conversation.convType, "default") || TEnum.equals(conversation.status, "dismissed") || TEnum.equals(conversation.status, "blocked")) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m101755e(User user) {
        if (user == null) {
            return false;
        }
        return ((!vwb.m200296J(user.status) && user.status.contains(UserStatus.get("hidden")) && (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_UNREAL)) || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_FAKE_BATCH_STATUS)))) || user.isBanedOrInactivated() || user.isTeamAccount()) ? false : true;
    }
}
