package p003l;

import android.content.Intent;
import android.net.Uri;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.AiPictureMsgData;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.data.DbObject;
import java.io.File;
import java.util.ArrayList;
import l.juk;
import l.osi0;
import l.rhi;
import l.vwb;
import org.eclipse.jetty.servlet.ServletHandler;
import p014rx.subjects.C1185a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class bh0 {

    /* JADX INFO: renamed from: a */
    public static final String f2393a;

    /* JADX INFO: renamed from: b */
    public static C1185a<String> f2394b;

    /* JADX INFO: renamed from: l.bh0$a */
    public class C0170a implements w9j<Media, Boolean> {
        @Override // p003l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Media media) {
            return Boolean.valueOf(media != null && media.mediaType.startsWith("image/"));
        }
    }

    static {
        f2393a = (juk.e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/ai-draw/index.html?speed=true&_bid=1004194&hideNotch=1&hideNavigationBar=1#/");
        f2394b = C1185a.m9969b();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2945a(User user) {
        if (user == null) {
            return false;
        }
        ArrayList arrayListN = vwb.n(user.pictures, new C0170a());
        if (vwb.J(arrayListN)) {
            String str = TEnum.equals(user.gender, "female") ? "她" : "他";
            osi0.g(String.format("%s没有可用的头像照片，提醒%s上传五官清晰的照片吧~", str, str));
        }
        return !vwb.J(arrayListN);
    }

    /* JADX INFO: renamed from: b */
    public static Message m2946b(File file, String str, String str2) {
        if (file == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Picture pictureNew_ = Picture.new_();
        ((Media) pictureNew_).url = rhi.B(file.getPath());
        ((Media) pictureNew_).mediaType = "image/*";
        ((Media) pictureNew_).status = MediaLocalStatus.get("raw");
        Message messageNew_ = Message.new_();
        ArrayList arrayList = new ArrayList();
        arrayList.add(pictureNew_);
        messageNew_.value = "图片";
        messageNew_.media = arrayList;
        messageNew_.messageType = MessageType.get("ai_picture");
        AiPictureMsgData aiPictureMsgDataNew_ = AiPictureMsgData.new_();
        aiPictureMsgDataNew_.momoImgUrl = str;
        aiPictureMsgDataNew_.taskId = str2;
        messageNew_.msgData = aiPictureMsgDataNew_.toJson();
        return messageNew_;
    }

    /* JADX INFO: renamed from: c */
    public static void m2947c(Act act, User user, String str) {
        if (m2945a(user)) {
            Uri.Builder builderBuildUpon = Uri.parse(f2393a).buildUpon();
            builderBuildUpon.appendQueryParameter("from", str);
            builderBuildUpon.appendQueryParameter("userId", ((DbObject) user).id);
            builderBuildUpon.appendQueryParameter("gender", user.gender.toString());
            Intent intentC2 = MkWebViewAct.c2(act, "", builderBuildUpon.toString(), true, true, (ResultReceiver) null);
            intentC2.putExtra("hideNotch", true);
            act.startActivity(intentC2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2948d(Conversation conversation) {
        return (conversation == null || !TextUtils.equals(conversation.convType, ServletHandler.__DEFAULT_SERVLET) || TEnum.equals(conversation.status, "dismissed") || TEnum.equals(conversation.status, "blocked")) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2949e(User user) {
        if (user == null) {
            return false;
        }
        return ((!vwb.J(user.status) && user.status.contains(UserStatus.get("hidden")) && (user.status.contains(UserStatus.get("RISK_TAG_UNREAL")) || user.status.contains(UserStatus.get("RISK_TAG_FAKE_BATCH_STATUS")))) || user.isBanedOrInactivated() || user.isTeamAccount()) ? false : true;
    }
}
