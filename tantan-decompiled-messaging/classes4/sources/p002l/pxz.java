package p002l;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.j760;
import l.l3f;
import l.o660;
import l.p660;
import l.rhi;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pxz {
    /* JADX INFO: renamed from: a */
    public static long m20753a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        if (str.startsWith("file:///")) {
            str = str.substring(7);
        }
        return new File(str).length();
    }

    /* JADX INFO: renamed from: b */
    public static String m20754b(List<Media> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Media> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(m20756d(it.next())));
        }
        return arrayList.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m20755c() {
        o660 o660VarD = p660.d();
        return NullChecker.a(o660VarD) ? o660VarD.c() : "";
    }

    /* JADX INFO: renamed from: d */
    public static long m20756d(Media media) {
        long j = media.mediaFileLength;
        if (j > 0) {
            return j;
        }
        if (m20757e(media.url)) {
            return 0L;
        }
        return m20753a(rhi.z(media.url));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m20757e(String str) {
        return URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str);
    }

    /* JADX INFO: renamed from: f */
    public static void m20758f(String str, String str2, String str3) {
        zvf0.D("e_messagebox", str, new j760[]{new j760("receiver_user_id", str2), new j760("msg_button_type", str3)});
    }

    /* JADX INFO: renamed from: g */
    public static void m20759g(Message message, String str, String str2, String str3, int i, long j) {
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
        User userM7 = CoreModule.c.e0.M7(str7);
        zvf0.D("e_message_send", str5, new j760[]{new j760("page_id", str5), new j760("message_id", ((DbObject) message).id), new j760("message_send_status", str6), new j760("message_type", messageType.toString()), new j760("receiver_user_id", str7), new j760("code", Integer.valueOf(i)), new j760("duration", str4), new j760("matchfrom", NullChecker.b(userM7) ? userM7.matchFromForTrack() : ""), vwb.Y("message_origin", NullChecker.a(message.fromConvType) ? message.fromConvType : "")});
    }

    /* JADX INFO: renamed from: h */
    public static void m20760h(Message message, long j) {
        if (j <= 0 && message == null && message.messageType == null) {
            return;
        }
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.SYS_CHECK;
        l3fVar.n = "p_chat_view";
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        long jM20756d = (!NullChecker.a(message.media) || message.media.size() <= 0) ? 0L : m20756d((Media) message.media.get(0));
        if (TEnum.equals(message.messageType, "audio")) {
            l3fVar.s = "e_UploadAudioDuration_chat";
            if (jM20756d > 0) {
                map.put("audio_size", Long.valueOf(jM20756d));
            }
            zvf0.n(l3fVar, map);
            return;
        }
        if (TEnum.equals(message.messageType, "video")) {
            l3fVar.s = "e_UploadViedoDuration_chat";
            if (jM20756d > 0) {
                map.put("video_size", Long.valueOf(jM20756d));
            }
            zvf0.n(l3fVar, map);
            return;
        }
        if (TEnum.equals(message.messageType, "picture")) {
            l3fVar.s = "e_UploadImageDuration_chat";
            map.put("image_size", m20754b(message.media));
            zvf0.n(l3fVar, map);
        }
    }
}
