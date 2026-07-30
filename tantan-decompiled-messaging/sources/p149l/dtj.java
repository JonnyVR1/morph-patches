package p149l;

import android.graphics.Color;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class dtj {
    /* JADX INFO: renamed from: a */
    public static void m113571a(String str) {
        C4348d.m20896l().m20900k(str);
    }

    /* JADX INFO: renamed from: b */
    public static List<Integer> m113572b() {
        return vwb.m200324f0(Integer.valueOf(Color.parseColor("#edd7a3")), Integer.valueOf(Color.parseColor("#edd7a3")));
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m113573c() {
        return vwb.m200324f0("立即解锁 黑金会员", "无限打招呼无需送礼");
    }

    /* JADX INFO: renamed from: d */
    public static List<String> m113574d() {
        return vwb.m200324f0("立即解锁SVIP会员", String.format("每天送%s个免费礼物", CoreModule.m29935P().m94656g().mo35023Pc() ? "5" : "2"));
    }
}
