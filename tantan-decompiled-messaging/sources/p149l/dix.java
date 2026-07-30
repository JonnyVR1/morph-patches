package p149l;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.meituan.robust.Constants;
import com.p046p1.mobile.putong.core.data.UserId;
import com.p046p1.mobile.putong.live.base.data.BLivePkCategory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class dix {

    /* JADX INFO: renamed from: a */
    private ConcurrentHashMap<String, C16387d> f86437a;

    /* JADX INFO: renamed from: b */
    private List<String> f86438b;

    /* JADX INFO: renamed from: c */
    private String f86439c;

    /* JADX INFO: renamed from: d */
    private String f86440d;

    /* JADX INFO: renamed from: e */
    private String f86441e;

    /* JADX INFO: renamed from: f */
    private String f86442f;

    /* JADX INFO: renamed from: g */
    private Context f86443g;

    /* JADX INFO: renamed from: h */
    private Object f86444h;

    /* JADX INFO: renamed from: l.dix$b */
    public interface InterfaceC16385b {
    }

    /* JADX INFO: renamed from: l.dix$c */
    public static class C16386c {

        /* JADX INFO: renamed from: a */
        private static dix f86447a = new dix(null);
    }

    /* JADX INFO: renamed from: l.dix$d */
    public class C16387d {

        /* JADX INFO: renamed from: a */
        public String f86448a;

        /* JADX INFO: renamed from: b */
        public String f86449b;

        /* JADX INFO: renamed from: c */
        public String f86450c;

        /* JADX INFO: renamed from: d */
        public String f86451d;

        /* JADX INFO: renamed from: e */
        public ejx f86452e;

        public C16387d() {
        }
    }

    private dix() {
        this.f86437a = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        this.f86438b = arrayList;
        this.f86444h = new Object();
        arrayList.clear();
        this.f86438b.add("appid");
        this.f86438b.add("secret");
        this.f86438b.add("net");
        this.f86438b.add(UserId.TYPE);
        this.f86438b.add(BLivePkCategory.random);
        this.f86438b.add("time");
        this.f86438b.add("roomid");
        this.f86438b.add("roomconfig");
        Collections.sort(this.f86438b);
    }

    /* JADX INFO: renamed from: c */
    public static String m111939c(String str) {
        return "https://schedule-media.immomo.com/api/media/configv3?appid=" + str;
    }

    /* JADX INFO: renamed from: d */
    public static dix m111940d() {
        return C16386c.f86447a;
    }

    /* JADX INFO: renamed from: e */
    private void m111941e(String str, String str2, String str3, String str4) {
        hjx.m131421d("MediaCfg", "getMediaConfig");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.clear();
        concurrentHashMap.put("appid", str);
        concurrentHashMap.put("secret", str2);
        concurrentHashMap.put("net", xxx.m211572F().m211583L());
        concurrentHashMap.put(UserId.TYPE, str3);
        concurrentHashMap.put("roomid", "");
        concurrentHashMap.put("roomconfig", "0");
        concurrentHashMap.put(BLivePkCategory.random, String.valueOf(imx.m137112s()));
        concurrentHashMap.put("time", String.valueOf(dyx.m114098a().m114099b() / 1000));
        StringBuilder sb = new StringBuilder();
        for (String str5 : this.f86438b) {
            String str6 = (String) concurrentHashMap.get(str5);
            sb.append(str6);
            if (!"secret".equals(str5)) {
                hjx.m131418a("MediaCfg", "key: " + str5 + " = " + str6);
            }
        }
        hjx.m131418a("MediaCfg", "sb ".concat(sb.toString()));
        concurrentHashMap.put("sign", d0f.m109479c(sb.toString()));
        HashMap map = new HashMap();
        map.put("User-Agent", str4);
        new igf0(m111939c(str), concurrentHashMap, map).m185438g(new C16384a(str));
    }

    /* JADX INFO: renamed from: i */
    private String m111942i(String str) {
        Context context = this.f86443g;
        if (context != null) {
            return iwe0.m138732b(context, str, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    private void m111943l() {
        try {
            if (dyx.m114098a().m114102e()) {
                hjx.m131418a("MediaCfg", "initNtpTime.... ");
                lll.m150502e().m150512o();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m111945n(C16387d c16387d) {
        Context context = this.f86443g;
        if (context != null) {
            iwe0.m138733c(context, c16387d.f86448a, c16387d.f86451d);
        }
    }

    /* JADX INFO: renamed from: f */
    public String m111946f() {
        Context context = this.f86443g;
        return context != null ? context.getPackageName() : "";
    }

    /* JADX INFO: renamed from: g */
    public String m111947g(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append("/");
        stringBuffer.append(this.f86440d);
        stringBuffer.append(" Android/");
        stringBuffer.append(this.f86441e);
        stringBuffer.append("/");
        stringBuffer.append(this.f86442f);
        stringBuffer.append(" (");
        stringBuffer.append(imx.m137111r() + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append("Android " + Build.VERSION.RELEASE + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append("Gapps " + (imx.m137115v() ? 1 : 0) + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append(Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry() + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append(imx.m137110q());
        stringBuffer.append(")");
        try {
            return new String(stringBuffer.toString().getBytes(), "UTF-8");
        } catch (Exception unused) {
            return stringBuffer.toString();
        }
    }

    /* JADX INFO: renamed from: h */
    public C16387d m111948h(String str) {
        synchronized (this.f86444h) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                return this.f86437a.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m111949j(Context context, String str, String str2, String str3, String str4, String str5, InterfaceC16385b interfaceC16385b) {
        if (context != null) {
            try {
                this.f86443g = context.getApplicationContext();
            } catch (Throwable th) {
                throw th;
            }
        }
        m111943l();
        hjx.m131421d("MediaCfg", "appid = " + str + " / " + str2 + " / " + str3 + " / " + str4 + " / " + str5);
        if (!TextUtils.isEmpty(str4)) {
            this.f86440d = str4;
        }
        if (!TextUtils.isEmpty(str5)) {
            this.f86441e = str5;
        }
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!str3.equals(this.f86439c)) {
                m111952p();
            }
            eyx.m118802c().m118816o(str, str2);
            eyx.m118802c().m118815n(str3);
            eyx.m118802c().m118808g(str, str2, str3, str4, str5);
            this.f86439c = str3;
            if (TextUtils.isEmpty(this.f86442f)) {
                this.f86442f = "5.05";
            }
            if (m111948h(str) == null) {
                C16387d c16387d = new C16387d();
                c16387d.f86448a = str;
                c16387d.f86449b = str2;
                c16387d.f86450c = this.f86439c;
                String strM111942i = m111942i(str);
                c16387d.f86451d = strM111942i;
                if (strM111942i != null) {
                    c16387d.f86452e = pek0.m168517a().m168520c(c16387d.f86451d, false);
                } else {
                    c16387d.f86452e = new ejx();
                }
                synchronized (this.f86444h) {
                    this.f86437a.put(str, c16387d);
                }
                m111941e(str, str2, str3, m111947g(str));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m111950k(Context context, eix eixVar) {
        if (eixVar != null) {
            String strM116726b = eixVar.m116726b();
            String strM116733i = eixVar.m116733i();
            String strM116735k = eixVar.m116735k();
            String strM116725a = eixVar.m116725a();
            String strM116729e = eixVar.m116729e();
            eixVar.m116728d();
            m111949j(context, strM116726b, strM116733i, strM116735k, strM116725a, strM116729e, null);
            eyx.m118802c().m118816o(eixVar.m116726b(), eixVar.m116733i());
            eyx.m118802c().m118815n(eixVar.m116735k());
            if (!TextUtils.isEmpty(eixVar.m116725a()) && !TextUtils.isEmpty(eixVar.m116729e())) {
                eyx.m118802c().m118814m(m111947g(eixVar.m116726b()));
            }
            eyx.m118802c().m118808g(eixVar.m116726b(), eixVar.m116733i(), eixVar.m116735k(), eixVar.m116725a(), eixVar.m116729e());
        }
    }

    /* JADX INFO: renamed from: o */
    public void m111951o(String str) {
        this.f86442f = str;
    }

    /* JADX INFO: renamed from: p */
    public void m111952p() {
        synchronized (this.f86444h) {
            hjx.m131421d("MediaCfg", "userConfigMaps: " + this.f86437a.size());
            this.f86437a.clear();
        }
    }

    /* JADX INFO: renamed from: l.dix$a */
    public class C16384a extends wtc0<se2> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f86445a;

        public C16384a(String str) {
            this.f86445a = str;
        }

        @Override // p149l.wtc0
        public void onError(int i, String str, String str2) {
            hjx.m131418a("MediaCfg", "onError " + i + "/" + str + "/" + str2);
            dix dixVar = dix.this;
            StringBuilder sb = new StringBuilder("onFailure:[");
            sb.append(i);
            sb.append("] ");
            sb.append(str);
            dixVar.m111944m(-1L, sb.toString());
        }

        @Override // p149l.wtc0
        public void onSuccess(int i, se2 se2Var, String str) {
            hjx.m131418a("MediaCfg", "ec " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
            dix.this.m111944m(0L, "isSuccessful");
            C16387d c16387dM111948h = dix.this.m111948h(this.f86445a);
            if (c16387dM111948h != null) {
                c16387dM111948h.f86451d = str;
                eyx.m118802c().m118808g("parseJson mediaconfig, appid:" + c16387dM111948h.f86448a, str);
                c16387dM111948h.f86452e = pek0.m168517a().m168520c(str, true);
                dix.this.m111945n(c16387dM111948h);
            }
        }

        @Override // p149l.wtc0
        public void onCancel() {
        }

        @Override // p149l.wtc0
        public void onFinish() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m111944m(long j, String str) {
    }

    public /* synthetic */ dix(C16384a c16384a) {
        this();
    }
}
