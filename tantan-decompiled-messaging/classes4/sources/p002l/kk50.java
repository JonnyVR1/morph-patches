package p002l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import l.snm;
import l.upa;
import l.zz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kk50 {
    /* JADX INFO: renamed from: a */
    public static String m16657a() {
        return zz6.u0() ? "每天%s次和在线小哥哥聊天机会，附近高颜值，无需配对，立即开聊" : "每天%s次和在线小姐姐聊天机会，附近高颜值，无需配对，立即开聊";
    }

    /* JADX INFO: renamed from: b */
    public static String m16658b() {
        if (upa.L1()) {
            return m16657a();
        }
        return CoreModule.b.getString(zz6.u0() ? R.string.q3 : R.string.p3);
    }

    /* JADX INFO: renamed from: c */
    public static String m16659c() {
        return CoreModule.b.getString(R.string.rl);
    }

    /* JADX INFO: renamed from: d */
    public static String m16660d() {
        return "心动和在线闪聊";
    }

    /* JADX INFO: renamed from: e */
    public static String m16661e() {
        return upa.L1() ? String.valueOf(snm.T()) : "3";
    }
}
