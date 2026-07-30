package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class jtl0 {

    /* JADX INFO: renamed from: a */
    public static List<b7n0> f119646a;

    /* JADX INFO: renamed from: b */
    public static List<b7n0> m143153b() {
        if (f119646a == null) {
            ArrayList arrayList = new ArrayList();
            f119646a = arrayList;
            arrayList.add(new b7n0(VirtualVoiceMotionType.chatTopic, "聊天话题"));
            f119646a.add(new b7n0(VirtualVoiceMotionType.ktv, "KTV"));
            f119646a.add(new b7n0(VirtualVoiceMotionType.undercover, "谁是卧底"));
            f119646a.add(new b7n0("auction", "拍拍交友"));
            f119646a.add(new b7n0(VirtualVoiceMotionType.announcement, "公告板"));
        }
        return f119646a;
    }

    /* JADX INFO: renamed from: c */
    public static int m143154c(final String str) {
        return Math.max(vwb.m200293G(m143153b(), new w9j() { // from class: l.itl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((b7n0) obj).getType(), str));
            }
        }), 0);
    }
}
