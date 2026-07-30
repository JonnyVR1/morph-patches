package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;

/* JADX INFO: loaded from: classes4.dex */
public class kk50 {
    /* JADX INFO: renamed from: a */
    public static String m146309a() {
        return zz6.m221004u0() ? "每天%s次和在线小哥哥聊天机会，附近高颜值，无需配对，立即开聊" : "每天%s次和在线小姐姐聊天机会，附近高颜值，无需配对，立即开聊";
    }

    /* JADX INFO: renamed from: b */
    public static String m146310b() {
        if (upa.m194663L1()) {
            return m146309a();
        }
        return CoreModule.f17544b.getString(zz6.m221004u0() ? R$string.f18842q3 : R$string.f18812p3);
    }

    /* JADX INFO: renamed from: c */
    public static String m146311c() {
        return CoreModule.f17544b.getString(R$string.f18890rl);
    }

    /* JADX INFO: renamed from: d */
    public static String m146312d() {
        return "心动和在线闪聊";
    }

    /* JADX INFO: renamed from: e */
    public static String m146313e() {
        return upa.m194663L1() ? String.valueOf(snm.m185089T()) : "3";
    }
}
