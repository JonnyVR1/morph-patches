package p153l;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.meituan.robust.Constants;
import com.p051p1.mobile.putong.core.data.UserId;
import com.p051p1.mobile.putong.live.base.data.BLivePkCategory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class arx {

    /* JADX INFO: renamed from: a */
    private ConcurrentHashMap<String, C15814d> f72997a;

    /* JADX INFO: renamed from: b */
    private List<String> f72998b;

    /* JADX INFO: renamed from: c */
    private String f72999c;

    /* JADX INFO: renamed from: d */
    private String f73000d;

    /* JADX INFO: renamed from: e */
    private String f73001e;

    /* JADX INFO: renamed from: f */
    private String f73002f;

    /* JADX INFO: renamed from: g */
    private Context f73003g;

    /* JADX INFO: renamed from: h */
    private Object f73004h;

    /* JADX INFO: renamed from: l.arx$b */
    public interface InterfaceC15812b {
    }

    /* JADX INFO: renamed from: l.arx$c */
    public static class C15813c {

        /* JADX INFO: renamed from: a */
        private static arx f73007a = new arx(null);
    }

    /* JADX INFO: renamed from: l.arx$d */
    public class C15814d {

        /* JADX INFO: renamed from: a */
        public String f73008a;

        /* JADX INFO: renamed from: b */
        public String f73009b;

        /* JADX INFO: renamed from: c */
        public String f73010c;

        /* JADX INFO: renamed from: d */
        public String f73011d;

        /* JADX INFO: renamed from: e */
        public bsx f73012e;

        public C15814d() {
        }
    }

    private arx() {
        this.f72997a = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        this.f72998b = arrayList;
        this.f73004h = new Object();
        arrayList.clear();
        this.f72998b.add("appid");
        this.f72998b.add("secret");
        this.f72998b.add("net");
        this.f72998b.add(UserId.TYPE);
        this.f72998b.add(BLivePkCategory.random);
        this.f72998b.add("time");
        this.f72998b.add("roomid");
        this.f72998b.add("roomconfig");
        Collections.sort(this.f72998b);
    }

    /* JADX INFO: renamed from: c */
    public static String m99788c(String str) {
        return "https://schedule-media.immomo.com/api/media/configv3?appid=" + str;
    }

    /* JADX INFO: renamed from: d */
    public static arx m99789d() {
        return C15813c.f73007a;
    }

    /* JADX INFO: renamed from: e */
    private void m99790e(String str, String str2, String str3, String str4) {
        esx.m122399d("MediaCfg", "getMediaConfig");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.clear();
        concurrentHashMap.put("appid", str);
        concurrentHashMap.put("secret", str2);
        concurrentHashMap.put("net", u6y.m194722F().m194733L());
        concurrentHashMap.put(UserId.TYPE, str3);
        concurrentHashMap.put("roomid", "");
        concurrentHashMap.put("roomconfig", "0");
        concurrentHashMap.put(BLivePkCategory.random, String.valueOf(fvx.m127733s()));
        concurrentHashMap.put("time", String.valueOf(a7y.m96388a().m96389b() / 1000));
        StringBuilder sb = new StringBuilder();
        for (String str5 : this.f72998b) {
            String str6 = (String) concurrentHashMap.get(str5);
            sb.append(str6);
            if (!"secret".equals(str5)) {
                esx.m122396a("MediaCfg", "key: " + str5 + " = " + str6);
            }
        }
        esx.m122396a("MediaCfg", "sb ".concat(sb.toString()));
        concurrentHashMap.put("sign", g1f.m128507c(sb.toString()));
        HashMap map = new HashMap();
        map.put("User-Agent", str4);
        new pof0(m99788c(str), concurrentHashMap, map).m141755g(new C15811a(str));
    }

    /* JADX INFO: renamed from: i */
    private String m99791i(String str) {
        Context context = this.f73003g;
        if (context != null) {
            return p4f0.m170563b(context, str, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    private void m99792l() {
        try {
            if (a7y.m96388a().m96392e()) {
                esx.m122396a("MediaCfg", "initNtpTime.... ");
                aol.m99098e().m99108o();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m99794n(C15814d c15814d) {
        Context context = this.f73003g;
        if (context != null) {
            p4f0.m170564c(context, c15814d.f73008a, c15814d.f73011d);
        }
    }

    /* JADX INFO: renamed from: f */
    public String m99795f() {
        Context context = this.f73003g;
        return context != null ? context.getPackageName() : "";
    }

    /* JADX INFO: renamed from: g */
    public String m99796g(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append("/");
        stringBuffer.append(this.f73000d);
        stringBuffer.append(" Android/");
        stringBuffer.append(this.f73001e);
        stringBuffer.append("/");
        stringBuffer.append(this.f73002f);
        stringBuffer.append(" (");
        stringBuffer.append(fvx.m127732r() + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append("Android " + Build.VERSION.RELEASE + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append("Gapps " + (fvx.m127736v() ? 1 : 0) + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append(Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry() + Constants.PACKNAME_END);
        stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        stringBuffer.append(fvx.m127731q());
        stringBuffer.append(")");
        try {
            return new String(stringBuffer.toString().getBytes(), "UTF-8");
        } catch (Exception unused) {
            return stringBuffer.toString();
        }
    }

    /* JADX INFO: renamed from: h */
    public C15814d m99797h(String str) {
        synchronized (this.f73004h) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                return this.f72997a.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m99798j(Context context, String str, String str2, String str3, String str4, String str5, InterfaceC15812b interfaceC15812b) {
        if (context != null) {
            try {
                this.f73003g = context.getApplicationContext();
            } catch (Throwable th) {
                throw th;
            }
        }
        m99792l();
        esx.m122399d("MediaCfg", "appid = " + str + " / " + str2 + " / " + str3 + " / " + str4 + " / " + str5);
        if (!TextUtils.isEmpty(str4)) {
            this.f73000d = str4;
        }
        if (!TextUtils.isEmpty(str5)) {
            this.f73001e = str5;
        }
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!str3.equals(this.f72999c)) {
                m99801p();
            }
            b7y.m102882c().m102896o(str, str2);
            b7y.m102882c().m102895n(str3);
            b7y.m102882c().m102888g(str, str2, str3, str4, str5);
            this.f72999c = str3;
            if (TextUtils.isEmpty(this.f73002f)) {
                this.f73002f = "5.05";
            }
            if (m99797h(str) == null) {
                C15814d c15814d = new C15814d();
                c15814d.f73008a = str;
                c15814d.f73009b = str2;
                c15814d.f73010c = this.f72999c;
                String strM99791i = m99791i(str);
                c15814d.f73011d = strM99791i;
                if (strM99791i != null) {
                    c15814d.f73012e = vnk0.m201997a().m202000c(c15814d.f73011d, false);
                } else {
                    c15814d.f73012e = new bsx();
                }
                synchronized (this.f73004h) {
                    this.f72997a.put(str, c15814d);
                }
                m99790e(str, str2, str3, m99796g(str));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m99799k(Context context, brx brxVar) {
        if (brxVar != null) {
            String strM106170b = brxVar.m106170b();
            String strM106177i = brxVar.m106177i();
            String strM106179k = brxVar.m106179k();
            String strM106169a = brxVar.m106169a();
            String strM106173e = brxVar.m106173e();
            brxVar.m106172d();
            m99798j(context, strM106170b, strM106177i, strM106179k, strM106169a, strM106173e, null);
            b7y.m102882c().m102896o(brxVar.m106170b(), brxVar.m106177i());
            b7y.m102882c().m102895n(brxVar.m106179k());
            if (!TextUtils.isEmpty(brxVar.m106169a()) && !TextUtils.isEmpty(brxVar.m106173e())) {
                b7y.m102882c().m102894m(m99796g(brxVar.m106170b()));
            }
            b7y.m102882c().m102888g(brxVar.m106170b(), brxVar.m106177i(), brxVar.m106179k(), brxVar.m106169a(), brxVar.m106173e());
        }
    }

    /* JADX INFO: renamed from: o */
    public void m99800o(String str) {
        this.f73002f = str;
    }

    /* JADX INFO: renamed from: p */
    public void m99801p() {
        synchronized (this.f73004h) {
            esx.m122399d("MediaCfg", "userConfigMaps: " + this.f72997a.size());
            this.f72997a.clear();
        }
    }

    /* JADX INFO: renamed from: l.arx$a */
    public class C15811a extends b2d0<ze2> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f73005a;

        public C15811a(String str) {
            this.f73005a = str;
        }

        @Override // p153l.b2d0
        public void onError(int i, String str, String str2) {
            esx.m122396a("MediaCfg", "onError " + i + "/" + str + "/" + str2);
            arx arxVar = arx.this;
            StringBuilder sb = new StringBuilder("onFailure:[");
            sb.append(i);
            sb.append("] ");
            sb.append(str);
            arxVar.m99793m(-1L, sb.toString());
        }

        @Override // p153l.b2d0
        public void onSuccess(int i, ze2 ze2Var, String str) {
            esx.m122396a("MediaCfg", "ec " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
            arx.this.m99793m(0L, "isSuccessful");
            C15814d c15814dM99797h = arx.this.m99797h(this.f73005a);
            if (c15814dM99797h != null) {
                c15814dM99797h.f73011d = str;
                b7y.m102882c().m102888g("parseJson mediaconfig, appid:" + c15814dM99797h.f73008a, str);
                c15814dM99797h.f73012e = vnk0.m201997a().m202000c(str, true);
                arx.this.m99794n(c15814dM99797h);
            }
        }

        @Override // p153l.b2d0
        public void onCancel() {
        }

        @Override // p153l.b2d0
        public void onFinish() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m99793m(long j, String str) {
    }

    public /* synthetic */ arx(C15811a c15811a) {
        this();
    }
}
