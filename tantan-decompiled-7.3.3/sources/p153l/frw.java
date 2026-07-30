package p153l;

import android.text.TextUtils;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import com.immomo.mwc.sdk.MWCEngine;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.File;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: classes7.dex */
public class frw {

    /* JADX INFO: renamed from: a */
    private final String f100480a;

    /* JADX INFO: renamed from: b */
    private final String f100481b;

    /* JADX INFO: renamed from: c */
    private boolean f100482c = false;

    /* JADX INFO: renamed from: d */
    protected MWCEngine.CodeType f100483d = MWCEngine.CodeType.BINARY;

    /* JADX INFO: renamed from: e */
    private String f100484e = null;

    /* JADX INFO: renamed from: f */
    private String f100485f = StringUtil.ALL_INTERFACES;

    public frw(String str, String str2) {
        this.f100480a = str;
        this.f100481b = str2;
        if (!TextUtils.isEmpty(str) && !"0".equals(str)) {
            m126987h();
        }
        MWCEngine.m20341D("MWCMkConfig", null, "[项目配置项解析结果] %s", toString());
    }

    /* JADX INFO: renamed from: a */
    public static String m126983a(String str, String str2) {
        return str + ":" + str2;
    }

    /* JADX INFO: renamed from: c */
    public static File m126984c(String str, MWCEngine.CodeType codeType) {
        return new File(str, codeType == MWCEngine.CodeType.BINARY ? "service-worker.bin" : "service-worker.js");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m126985f() {
        return ikw.m140420b().m140422c("kv:bool:mwc:getWebConfig:mk_config.serviceWorker", false);
    }

    /* JADX INFO: renamed from: g */
    private static boolean m126986g(String str) {
        return ikw.m140420b().m140423d("kv:bool:mwc:getWebConfig:mk_config.swBlackList", WeJson.EMPTY_ARR).contains("\"" + str + '\"');
    }

    /* JADX INFO: renamed from: h */
    private void m126987h() {
        File fileM126984c;
        zgi zgiVarM17591l = FepManager.m17582z().m17591l(this.f100481b, CheckPolicy.LOCAL_ONLY);
        if (zgiVarM17591l != null && zgiVarM17591l.m219623f() != null) {
            String versionStr = zgiVarM17591l.m219623f().getVersionStr();
            if (!TextUtils.isEmpty(versionStr)) {
                this.f100485f = versionStr;
            }
        }
        if (tqw.m192363a(this.f100480a)) {
            this.f100482c = true;
            this.f100483d = MWCEngine.CodeType.JS;
            this.f100484e = "fdt-debug://" + this.f100480a + "/service-worker.js";
            this.f100485f = StringUtil.ALL_INTERFACES;
            MWCEngine.m20341D("MWCMkConfig", null, "[启用FDT调试模式下的配置] @bid=%s", this.f100480a);
            return;
        }
        if (m126986g(this.f100480a)) {
            this.f100482c = false;
            MWCEngine.m20341D("MWCMkConfig", null, "[该项目命中黑名单策略] @bid=%s", this.f100480a);
        } else if (m126991m()) {
            this.f100483d = m126990l() ? MWCEngine.CodeType.BINARY : MWCEngine.CodeType.JS;
            if (zgiVarM17591l == null || (fileM126984c = m126984c(zgiVarM17591l.m219626i(), this.f100483d)) == null || !fileM126984c.exists() || !fileM126984c.canRead()) {
                return;
            }
            this.f100484e = fileM126984c.getAbsolutePath();
            this.f100482c = true;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m126988j(String str, Object obj) {
        if ("serviceWorker".equalsIgnoreCase(str)) {
            m126992n("1".equals(String.valueOf(obj)));
        } else {
            if (!"swBlackList".equalsIgnoreCase(str) || obj == null) {
                return;
            }
            m126995q(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m126989k(String str, String str2, Object obj) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return;
        }
        if ("serviceWorker".equalsIgnoreCase(str2)) {
            m126994p(str, "1".equals(String.valueOf(obj)));
        } else if ("byteCode".equalsIgnoreCase(str2)) {
            m126993o(str, !"0".equals(String.valueOf(obj)));
        }
    }

    /* JADX INFO: renamed from: l */
    private boolean m126990l() {
        return ikw.m140420b().m140422c(m126983a("kv:bool:mwc:checkupdate:mk_config.byteCode", this.f100480a), true);
    }

    /* JADX INFO: renamed from: m */
    private boolean m126991m() {
        return ikw.m140420b().m140422c(m126983a("kv:bool:mwc:checkupdate:mk_config.serviceWorker", this.f100480a), false);
    }

    /* JADX INFO: renamed from: n */
    private static boolean m126992n(boolean z) {
        MWCEngine.m20360k("MWCMkConfig", null, "update:global:kv @key=%s, @value=%b", "kv:bool:mwc:getWebConfig:mk_config.serviceWorker", Boolean.valueOf(z));
        return ikw.m140420b().m140427h("kv:bool:mwc:getWebConfig:mk_config.serviceWorker", z);
    }

    /* JADX INFO: renamed from: o */
    private static boolean m126993o(String str, boolean z) {
        String strM126983a = m126983a("kv:bool:mwc:checkupdate:mk_config.byteCode", str);
        MWCEngine.m20360k("MWCMkConfig", null, "update:project:kv @key=%s, @value=%b", strM126983a, Boolean.valueOf(z));
        return ikw.m140420b().m140427h(strM126983a, z);
    }

    /* JADX INFO: renamed from: p */
    private static boolean m126994p(String str, boolean z) {
        String strM126983a = m126983a("kv:bool:mwc:checkupdate:mk_config.serviceWorker", str);
        MWCEngine.m20360k("MWCMkConfig", null, "update:project:kv @key=%s, @value=%b", strM126983a, Boolean.valueOf(z));
        return ikw.m140420b().m140427h(strM126983a, z);
    }

    /* JADX INFO: renamed from: q */
    private static boolean m126995q(String str) {
        MWCEngine.m20360k("MWCMkConfig", null, "update:global:kv @key=%s, @value=%s", "kv:bool:mwc:getWebConfig:mk_config.swBlackList", str);
        return ikw.m140420b().m140426g("kv:bool:mwc:getWebConfig:mk_config.swBlackList", str);
    }

    /* JADX INFO: renamed from: b */
    public MWCEngine.CodeType m126996b() {
        return this.f100483d;
    }

    /* JADX INFO: renamed from: d */
    public String m126997d() {
        return this.f100484e;
    }

    /* JADX INFO: renamed from: e */
    public String m126998e() {
        return this.f100485f;
    }

    /* JADX INFO: renamed from: i */
    public boolean m126999i() {
        return this.f100482c;
    }

    public String toString() {
        return "MWCMkConfig{bid='" + this.f100480a + "', enabled=" + this.f100482c + ", codeType=" + this.f100483d + ", serviceWorkerLocalPath='" + this.f100484e + "', version='" + this.f100485f + "'}";
    }
}
