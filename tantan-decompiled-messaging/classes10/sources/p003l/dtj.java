package p003l;

import android.graphics.Color;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dtj {
    /* JADX INFO: renamed from: a */
    public static void m6204a(String str) {
        d.l().k(str);
    }

    /* JADX INFO: renamed from: b */
    public static List<Integer> m6205b() {
        return vwb.f0(new Integer[]{Integer.valueOf(Color.parseColor("#edd7a3")), Integer.valueOf(Color.parseColor("#edd7a3"))});
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m6206c() {
        return vwb.f0(new String[]{"立即解锁 黑金会员", "无限打招呼无需送礼"});
    }

    /* JADX INFO: renamed from: d */
    public static List<String> m6207d() {
        return vwb.f0(new String[]{"立即解锁SVIP会员", String.format("每天送%s个免费礼物", CoreModule.P().g().Pc() ? "5" : "2")});
    }
}
