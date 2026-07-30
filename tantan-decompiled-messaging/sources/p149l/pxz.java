package p149l;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.firebase.messaging.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class pxz {
    /* JADX INFO: renamed from: a */
    public static long m171964a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        if (str.startsWith("file:///")) {
            str = str.substring(7);
        }
        return new File(str).length();
    }

    /* JADX INFO: renamed from: b */
    public static String m171965b(List<Media> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Media> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(m171967d(it.next())));
        }
        return arrayList.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m171966c() {
        o660 o660VarM167645d = p660.m167645d();
        return NullChecker.m81303a(o660VarM167645d) ? o660VarM167645d.m162820c() : "";
    }

    /* JADX INFO: renamed from: d */
    public static long m171967d(Media media) {
        long j = media.mediaFileLength;
        if (j > 0) {
            return j;
        }
        if (m171968e(media.url)) {
            return 0L;
        }
        return m171964a(rhi.m179382z(media.url));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m171968e(String str) {
        return URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str);
    }

    /* JADX INFO: renamed from: f */
    public static void m171969f(String str, String str2, String str3) {
        zvf0.m220371D("e_messagebox", str, new j760("receiver_user_id", str2), new j760("msg_button_type", str3));
    }

    /* JADX INFO: renamed from: g */
    public static void m171970g(Message message, String str, String str2, String str3, int i, long j) {
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
        User userM169415M7 = CoreModule.f17545c.f19639e0.m169415M7(str7);
        zvf0.m220371D("e_message_send", str5, new j760("page_id", str5), new j760(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56011id), new j760("message_send_status", str6), new j760(Constants.MessagePayloadKeys.MESSAGE_TYPE, messageType.toString()), new j760("receiver_user_id", str7), new j760("code", Integer.valueOf(i)), new j760(BLiveOperationTitleShowType.duration, str4), new j760("matchfrom", NullChecker.m81304b(userM169415M7) ? userM169415M7.matchFromForTrack() : ""), vwb.m200311Y("message_origin", NullChecker.m81303a(message.fromConvType) ? message.fromConvType : ""));
    }

    /* JADX INFO: renamed from: h */
    public static void m171971h(Message message, long j) {
        if (j <= 0 && message == null && message.messageType == null) {
            return;
        }
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.SYS_CHECK;
        l3fVar.f125895n = OMSDialogPositon.p_chat_view;
        HashMap map = new HashMap();
        map.put(BLiveOperationTitleShowType.duration, Long.valueOf(j));
        long jM171967d = (!NullChecker.m81303a(message.media) || message.media.size() <= 0) ? 0L : m171967d(message.media.get(0));
        if (TEnum.equals(message.messageType, "audio")) {
            l3fVar.f125900s = "e_UploadAudioDuration_chat";
            if (jM171967d > 0) {
                map.put("audio_size", Long.valueOf(jM171967d));
            }
            zvf0.m220392n(l3fVar, map);
            return;
        }
        if (TEnum.equals(message.messageType, "video")) {
            l3fVar.f125900s = "e_UploadViedoDuration_chat";
            if (jM171967d > 0) {
                map.put("video_size", Long.valueOf(jM171967d));
            }
            zvf0.m220392n(l3fVar, map);
            return;
        }
        if (TEnum.equals(message.messageType, "picture")) {
            l3fVar.f125900s = "e_UploadImageDuration_chat";
            map.put("image_size", m171965b(message.media));
            zvf0.m220392n(l3fVar, map);
        }
    }
}
