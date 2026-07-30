package p149l;

import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class fyx {

    /* JADX INFO: renamed from: a */
    public static int f99914a = 1;

    /* JADX INFO: renamed from: b */
    public static int f99915b = 3;

    /* JADX INFO: renamed from: c */
    public static String f99916c = "e_play_video";

    /* JADX INFO: renamed from: d */
    public static String f99917d = "e_video_first_render";

    /* JADX INFO: renamed from: e */
    public static String f99918e = "e_video_play_block";

    /* JADX INFO: renamed from: f */
    public static String f99919f = "e_video_play_error";

    /* JADX INFO: renamed from: g */
    public static String f99920g = "video_player_type";

    /* JADX INFO: renamed from: a */
    public static String m123807a(int i, int i2, boolean z) {
        StringBuffer stringBuffer = new StringBuffer("Player Error what: ");
        stringBuffer.append(i);
        stringBuffer.append("; Player Error extra: ");
        stringBuffer.append(i2);
        stringBuffer.append("; Network Avaliable: ");
        stringBuffer.append(!z);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m123808b(long j, long j2, String str, int i) {
        HashMap map = new HashMap();
        map.put("video_block_start_time", Long.valueOf(j));
        map.put("video_block_end_time", Long.valueOf(j2));
        map.put("video_play_url", str);
        map.put(f99920g, Integer.valueOf(i));
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.SYS_CHECK;
        l3fVar.f125900s = f99918e;
        zvf0.m220392n(l3fVar, map);
    }

    /* JADX INFO: renamed from: c */
    public static void m123809c(long j, long j2, String str, int i) {
        HashMap map = new HashMap();
        map.put("video_play_time", Long.valueOf(j));
        map.put("first_render_time", Long.valueOf(j2));
        map.put("video_play_url", str);
        map.put(f99920g, Integer.valueOf(i));
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.SYS_CHECK;
        l3fVar.f125900s = f99917d;
        zvf0.m220392n(l3fVar, map);
    }

    /* JADX INFO: renamed from: d */
    public static void m123810d(long j, int i, String str, int i2) {
        HashMap map = new HashMap();
        map.put("video_play_time", Long.valueOf(j));
        map.put("video_play_count", Integer.valueOf(i));
        map.put("video_play_url", str);
        map.put(f99920g, Integer.valueOf(i2));
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.SYS_CHECK;
        l3fVar.f125900s = f99916c;
        zvf0.m220392n(l3fVar, map);
    }

    /* JADX INFO: renamed from: e */
    public static void m123811e(int i, int i2, boolean z, String str, int i3) {
        HashMap map = new HashMap();
        map.put("video_play_error", m123807a(i, i2, z));
        map.put("video_play_url", str);
        map.put(f99920g, Integer.valueOf(i3));
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.SYS_CHECK;
        l3fVar.f125900s = f99919f;
        zvf0.m220392n(l3fVar, map);
    }
}
