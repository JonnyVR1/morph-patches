package p153l;

import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class c7y {

    /* JADX INFO: renamed from: a */
    public static int f80160a = 1;

    /* JADX INFO: renamed from: b */
    public static int f80161b = 3;

    /* JADX INFO: renamed from: c */
    public static String f80162c = "e_play_video";

    /* JADX INFO: renamed from: d */
    public static String f80163d = "e_video_first_render";

    /* JADX INFO: renamed from: e */
    public static String f80164e = "e_video_play_block";

    /* JADX INFO: renamed from: f */
    public static String f80165f = "e_video_play_error";

    /* JADX INFO: renamed from: g */
    public static String f80166g = "video_player_type";

    /* JADX INFO: renamed from: a */
    public static String m108342a(int i, int i2, boolean z) {
        StringBuffer stringBuffer = new StringBuffer("Player Error what: ");
        stringBuffer.append(i);
        stringBuffer.append("; Player Error extra: ");
        stringBuffer.append(i2);
        stringBuffer.append("; Network Avaliable: ");
        stringBuffer.append(!z);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m108343b(long j, long j2, String str, int i) {
        HashMap map = new HashMap();
        map.put("video_block_start_time", Long.valueOf(j));
        map.put("video_block_end_time", Long.valueOf(j2));
        map.put("video_play_url", str);
        map.put(f80166g, Integer.valueOf(i));
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        q4fVar.f155581s = f80164e;
        i4g0.m138516n(q4fVar, map);
    }

    /* JADX INFO: renamed from: c */
    public static void m108344c(long j, long j2, String str, int i) {
        HashMap map = new HashMap();
        map.put("video_play_time", Long.valueOf(j));
        map.put("first_render_time", Long.valueOf(j2));
        map.put("video_play_url", str);
        map.put(f80166g, Integer.valueOf(i));
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        q4fVar.f155581s = f80163d;
        i4g0.m138516n(q4fVar, map);
    }

    /* JADX INFO: renamed from: d */
    public static void m108345d(long j, int i, String str, int i2) {
        HashMap map = new HashMap();
        map.put("video_play_time", Long.valueOf(j));
        map.put("video_play_count", Integer.valueOf(i));
        map.put("video_play_url", str);
        map.put(f80166g, Integer.valueOf(i2));
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        q4fVar.f155581s = f80162c;
        i4g0.m138516n(q4fVar, map);
    }

    /* JADX INFO: renamed from: e */
    public static void m108346e(int i, int i2, boolean z, String str, int i3) {
        HashMap map = new HashMap();
        map.put("video_play_error", m108342a(i, i2, z));
        map.put("video_play_url", str);
        map.put(f80166g, Integer.valueOf(i3));
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        q4fVar.f155581s = f80165f;
        i4g0.m138516n(q4fVar, map);
    }
}
