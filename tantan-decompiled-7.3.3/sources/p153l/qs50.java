package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;

/* JADX INFO: loaded from: classes4.dex */
public class qs50 {
    /* JADX INFO: renamed from: a */
    public static String m177725a() {
        return c17.m107528u0() ? "每天%s次和在线小哥哥聊天机会，附近高颜值，无需配对，立即开聊" : "每天%s次和在线小姐姐聊天机会，附近高颜值，无需配对，立即开聊";
    }

    /* JADX INFO: renamed from: b */
    public static String m177726b() {
        if (gra.m131594L1()) {
            return m177725a();
        }
        return CoreModule.f18263b.getString(c17.m107528u0() ? R$string.f19635s3 : R$string.f19604r3);
    }

    /* JADX INFO: renamed from: c */
    public static String m177727c() {
        return CoreModule.f18263b.getString(R$string.f18708Nl);
    }

    /* JADX INFO: renamed from: d */
    public static String m177728d() {
        return "心动和在线闪聊";
    }

    /* JADX INFO: renamed from: e */
    public static String m177729e() {
        return gra.m131594L1() ? String.valueOf(upm.m197123T()) : "3";
    }
}
