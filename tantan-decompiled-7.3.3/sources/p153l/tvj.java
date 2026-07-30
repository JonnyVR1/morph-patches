package p153l;

import android.graphics.Color;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class tvj {
    /* JADX INFO: renamed from: a */
    public static void m192805a(String str) {
        C4499d.m21895l().m21899k(str);
    }

    /* JADX INFO: renamed from: b */
    public static List<Integer> m192806b() {
        return jyb.m147507f0(Integer.valueOf(Color.parseColor("#edd7a3")), Integer.valueOf(Color.parseColor("#edd7a3")));
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m192807c() {
        return jyb.m147507f0("立即解锁 黑金会员", "无限打招呼无需送礼");
    }

    /* JADX INFO: renamed from: d */
    public static List<String> m192808d() {
        return jyb.m147507f0("立即解锁SVIP会员", String.format("每天送%s个免费礼物", CoreModule.m30933P().m143410g().mo36026Pc() ? "5" : "2"));
    }
}
