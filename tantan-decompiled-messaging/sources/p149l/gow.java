package p149l;

import android.text.TextUtils;
import com.immomo.framework.storage.p039kv.C3750KV;
import com.immomo.mwc.sdk.MWCEngine;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.File;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: classes2.dex */
public class gow {

    /* JADX INFO: renamed from: a */
    private final String f103731a;

    /* JADX INFO: renamed from: b */
    private boolean f103732b = false;

    /* JADX INFO: renamed from: c */
    protected MWCEngine.CodeType f103733c = MWCEngine.CodeType.BINARY;

    /* JADX INFO: renamed from: d */
    private String f103734d = null;

    /* JADX INFO: renamed from: e */
    private String f103735e = StringUtil.ALL_INTERFACES;

    public gow(String str) {
        this.f103731a = str;
        if (!TextUtils.isEmpty(str) && !"0".equals(str)) {
            m127292g();
        }
        MWCEngine.m19361D("MWCMkConfig", null, "[项目配置项解析结果] %s", toString());
    }

    /* JADX INFO: renamed from: a */
    public static String m127289a(String str, String str2) {
        return str + ":" + str2;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m127290e() {
        return C3750KV.m18336c("kv:bool:mwc:getWebConfig:mk_config.serviceWorker", false);
    }

    /* JADX INFO: renamed from: f */
    private static boolean m127291f(String str) {
        return C3750KV.m18339f("kv:bool:mwc:getWebConfig:mk_config.swBlackList", WeJson.EMPTY_ARR).contains("\"" + str + '\"');
    }

    /* JADX INFO: renamed from: g */
    private void m127292g() {
        File fileM197338d;
        v750 v750VarM214871t = yhw.m214862s().m214871t(this.f103731a);
        if (v750VarM214871t != null) {
            String strM197341g = v750VarM214871t.m197341g();
            if (!TextUtils.isEmpty(strM197341g)) {
                this.f103735e = strM197341g;
            }
        }
        if (unw.m194526a(this.f103731a)) {
            this.f103732b = true;
            this.f103733c = MWCEngine.CodeType.JS;
            this.f103734d = "fdt-debug://" + this.f103731a + "/service-worker.js";
            this.f103735e = StringUtil.ALL_INTERFACES;
            MWCEngine.m19361D("MWCMkConfig", null, "[启用FDT调试模式下的配置] @bid=%s", this.f103731a);
            return;
        }
        if (m127291f(this.f103731a)) {
            this.f103732b = false;
            MWCEngine.m19361D("MWCMkConfig", null, "[该项目命中黑名单策略] @bid=%s", this.f103731a);
            return;
        }
        if (m127296l()) {
            MWCEngine.CodeType codeType = m127295k() ? MWCEngine.CodeType.BINARY : MWCEngine.CodeType.JS;
            this.f103733c = codeType;
            if (v750VarM214871t == null || (fileM197338d = v750VarM214871t.m197338d(codeType)) == null || !fileM197338d.exists() || !fileM197338d.canRead()) {
                return;
            }
            this.f103734d = fileM197338d.getAbsolutePath();
            this.f103732b = true;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m127293i(String str, Object obj) {
        if ("serviceWorker".equalsIgnoreCase(str)) {
            m127297m("1".equals(String.valueOf(obj)));
        } else {
            if (!"swBlackList".equalsIgnoreCase(str) || obj == null) {
                return;
            }
            m127300p(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m127294j(String str, String str2, Object obj) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return;
        }
        if ("serviceWorker".equalsIgnoreCase(str2)) {
            m127299o(str, "1".equals(String.valueOf(obj)));
        } else if ("byteCode".equalsIgnoreCase(str2)) {
            m127298n(str, !"0".equals(String.valueOf(obj)));
        }
    }

    /* JADX INFO: renamed from: k */
    private boolean m127295k() {
        return C3750KV.m18336c(m127289a("kv:bool:mwc:checkupdate:mk_config.byteCode", this.f103731a), true);
    }

    /* JADX INFO: renamed from: l */
    private boolean m127296l() {
        return C3750KV.m18336c(m127289a("kv:bool:mwc:checkupdate:mk_config.serviceWorker", this.f103731a), false);
    }

    /* JADX INFO: renamed from: m */
    private static boolean m127297m(boolean z) {
        MWCEngine.m19380k("MWCMkConfig", null, "update:global:kv @key=%s, @value=%b", "kv:bool:mwc:getWebConfig:mk_config.serviceWorker", Boolean.valueOf(z));
        return C3750KV.m18343j("kv:bool:mwc:getWebConfig:mk_config.serviceWorker", Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: n */
    private static boolean m127298n(String str, boolean z) {
        String strM127289a = m127289a("kv:bool:mwc:checkupdate:mk_config.byteCode", str);
        MWCEngine.m19380k("MWCMkConfig", null, "update:project:kv @key=%s, @value=%b", strM127289a, Boolean.valueOf(z));
        return C3750KV.m18343j(strM127289a, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: o */
    private static boolean m127299o(String str, boolean z) {
        String strM127289a = m127289a("kv:bool:mwc:checkupdate:mk_config.serviceWorker", str);
        MWCEngine.m19380k("MWCMkConfig", null, "update:project:kv @key=%s, @value=%b", strM127289a, Boolean.valueOf(z));
        return C3750KV.m18343j(strM127289a, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: p */
    private static boolean m127300p(String str) {
        MWCEngine.m19380k("MWCMkConfig", null, "update:global:kv @key=%s, @value=%s", "kv:bool:mwc:getWebConfig:mk_config.swBlackList", str);
        return C3750KV.m18343j("kv:bool:mwc:getWebConfig:mk_config.swBlackList", str);
    }

    /* JADX INFO: renamed from: b */
    public MWCEngine.CodeType m127301b() {
        return this.f103733c;
    }

    /* JADX INFO: renamed from: c */
    public String m127302c() {
        return this.f103734d;
    }

    /* JADX INFO: renamed from: d */
    public String m127303d() {
        return this.f103735e;
    }

    /* JADX INFO: renamed from: h */
    public boolean m127304h() {
        return this.f103732b;
    }

    public String toString() {
        return "MWCMkConfig{bid='" + this.f103731a + "', enabled=" + this.f103732b + ", codeType=" + this.f103733c + ", serviceWorkerLocalPath='" + this.f103734d + "', version='" + this.f103735e + "'}";
    }
}
