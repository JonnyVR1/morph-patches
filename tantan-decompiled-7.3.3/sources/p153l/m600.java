package p153l;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class m600 {
    /* JADX INFO: renamed from: a */
    public static long m157128a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        if (str.startsWith("file:///")) {
            str = str.substring(7);
        }
        return new File(str).length();
    }

    /* JADX INFO: renamed from: b */
    public static String m157129b(List<Media> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Media> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(m157131d(it.next())));
        }
        return arrayList.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m157130c() {
        ue60 ue60VarM201037d = ve60.m201037d();
        return NullChecker.m82486a(ue60VarM201037d) ? ue60VarM201037d.m195739c() : "";
    }

    /* JADX INFO: renamed from: d */
    public static long m157131d(Media media) {
        long j = media.mediaFileLength;
        if (j > 0) {
            return j;
        }
        if (m157132e(media.url)) {
            return 0L;
        }
        return m157128a(oki.m168038z(media.url));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m157132e(String str) {
        return URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str);
    }

    /* JADX INFO: renamed from: f */
    public static void m157133f(String str, String str2, String str3) {
        i4g0.m138495D("e_messagebox", str, new pf60("receiver_user_id", str2), new pf60("msg_button_type", str3));
    }

    /* JADX INFO: renamed from: g */
    public static void m157134g(Message message, String str, String str2, String str3, int i, long j) {
        String str4;
        if (message == null || message.isGroupMessage()) {
            return;
        }
        String str5 = TextUtils.isEmpty(str) ? "" : str;
        String str6 = TextUtils.isEmpty(str2) ? "success" : str2;
        MessageType messageType = message.messageType();
        if (TEnum.equals(messageType, "text")) {
            str4 = "" + j;
        } else {
            str4 = "";
        }
        String str7 = TextUtils.isEmpty(str3) ? "" : str3;
        User userM116488M7 = CoreModule.f18264c.f20381e0.m116488M7(str7);
        i4g0.m138495D("e_message_send", str5, new pf60("page_id", str5), new pf60(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56859id), new pf60("message_send_status", str6), new pf60(Constants.MessagePayloadKeys.MESSAGE_TYPE, messageType.toString()), new pf60("receiver_user_id", str7), new pf60("code", Integer.valueOf(i)), new pf60(BLiveOperationTitleShowType.duration, str4), new pf60("matchfrom", NullChecker.m82487b(userM116488M7) ? userM116488M7.matchFromForTrack() : ""), jyb.m147494Y("message_origin", NullChecker.m82486a(message.fromConvType) ? message.fromConvType : ""));
    }

    /* JADX INFO: renamed from: h */
    public static void m157135h(Message message, long j) {
        if (j <= 0 && message == null && message.messageType == null) {
            return;
        }
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        q4fVar.f155576n = OMSDialogPositon.p_chat_view;
        HashMap map = new HashMap();
        map.put(BLiveOperationTitleShowType.duration, Long.valueOf(j));
        long jM157131d = (!NullChecker.m82486a(message.media) || message.media.size() <= 0) ? 0L : m157131d(message.media.get(0));
        if (TEnum.equals(message.messageType, "audio")) {
            q4fVar.f155581s = "e_UploadAudioDuration_chat";
            if (jM157131d > 0) {
                map.put("audio_size", Long.valueOf(jM157131d));
            }
            i4g0.m138516n(q4fVar, map);
            return;
        }
        if (TEnum.equals(message.messageType, "video")) {
            q4fVar.f155581s = "e_UploadViedoDuration_chat";
            if (jM157131d > 0) {
                map.put("video_size", Long.valueOf(jM157131d));
            }
            i4g0.m138516n(q4fVar, map);
            return;
        }
        if (TEnum.equals(message.messageType, "picture")) {
            q4fVar.f155581s = "e_UploadImageDuration_chat";
            map.put("image_size", m157129b(message.media));
            i4g0.m138516n(q4fVar, map);
        }
    }
}
