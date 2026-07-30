package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class n2m0 {

    /* JADX INFO: renamed from: a */
    public static List<fgn0> f139876a;

    /* JADX INFO: renamed from: b */
    public static List<fgn0> m161243b() {
        if (f139876a == null) {
            ArrayList arrayList = new ArrayList();
            f139876a = arrayList;
            arrayList.add(new fgn0(VirtualVoiceMotionType.chatTopic, "聊天话题"));
            f139876a.add(new fgn0(VirtualVoiceMotionType.ktv, "KTV"));
            f139876a.add(new fgn0(VirtualVoiceMotionType.undercover, "谁是卧底"));
            f139876a.add(new fgn0("auction", "拍拍交友"));
            f139876a.add(new fgn0(VirtualVoiceMotionType.announcement, "公告板"));
        }
        return f139876a;
    }

    /* JADX INFO: renamed from: c */
    public static int m161244c(final String str) {
        return Math.max(jyb.m147476G(m161243b(), new qcj() { // from class: l.m2m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((fgn0) obj).getType(), str));
            }
        }), 0);
    }
}
