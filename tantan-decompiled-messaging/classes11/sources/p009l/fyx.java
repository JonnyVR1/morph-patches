package p009l;

import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import l.l3f;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fyx {

    /* JADX INFO: renamed from: a */
    public static int f13233a = 1;

    /* JADX INFO: renamed from: b */
    public static int f13234b = 3;

    /* JADX INFO: renamed from: c */
    public static String f13235c = "e_play_video";

    /* JADX INFO: renamed from: d */
    public static String f13236d = "e_video_first_render";

    /* JADX INFO: renamed from: e */
    public static String f13237e = "e_video_play_block";

    /* JADX INFO: renamed from: f */
    public static String f13238f = "e_video_play_error";

    /* JADX INFO: renamed from: g */
    public static String f13239g = "video_player_type";

    /* JADX INFO: renamed from: a */
    public static String m14672a(int i, int i2, boolean z) {
        StringBuffer stringBuffer = new StringBuffer("Player Error what: ");
        stringBuffer.append(i);
        stringBuffer.append("; Player Error extra: ");
        stringBuffer.append(i2);
        stringBuffer.append("; Network Avaliable: ");
        stringBuffer.append(!z);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m14673b(long j, long j2, String str, int i) {
        HashMap map = new HashMap();
        map.put("video_block_start_time", Long.valueOf(j));
        map.put("video_block_end_time", Long.valueOf(j2));
        map.put("video_play_url", str);
        map.put(f13239g, Integer.valueOf(i));
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.SYS_CHECK;
        l3fVar.s = f13237e;
        zvf0.n(l3fVar, map);
    }

    /* JADX INFO: renamed from: c */
    public static void m14674c(long j, long j2, String str, int i) {
        HashMap map = new HashMap();
        map.put("video_play_time", Long.valueOf(j));
        map.put("first_render_time", Long.valueOf(j2));
        map.put("video_play_url", str);
        map.put(f13239g, Integer.valueOf(i));
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.SYS_CHECK;
        l3fVar.s = f13236d;
        zvf0.n(l3fVar, map);
    }

    /* JADX INFO: renamed from: d */
    public static void m14675d(long j, int i, String str, int i2) {
        HashMap map = new HashMap();
        map.put("video_play_time", Long.valueOf(j));
        map.put("video_play_count", Integer.valueOf(i));
        map.put("video_play_url", str);
        map.put(f13239g, Integer.valueOf(i2));
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.SYS_CHECK;
        l3fVar.s = f13235c;
        zvf0.n(l3fVar, map);
    }

    /* JADX INFO: renamed from: e */
    public static void m14676e(int i, int i2, boolean z, String str, int i3) {
        HashMap map = new HashMap();
        map.put("video_play_error", m14672a(i, i2, z));
        map.put("video_play_url", str);
        map.put(f13239g, Integer.valueOf(i3));
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.SYS_CHECK;
        l3fVar.s = f13238f;
        zvf0.n(l3fVar, map);
    }
}
