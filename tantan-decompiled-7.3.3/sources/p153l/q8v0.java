package p153l;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzead;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes6.dex */
public final class q8v0 implements kbw0 {

    /* JADX INFO: renamed from: d */
    public static final Pattern f156166d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* JADX INFO: renamed from: a */
    public final String f156167a;

    /* JADX INFO: renamed from: b */
    public final rdw0 f156168b;

    /* JADX INFO: renamed from: c */
    public final cew0 f156169c;

    public q8v0(String str, cew0 cew0Var, rdw0 rdw0Var) {
        this.f156167a = str;
        this.f156169c = cew0Var;
        this.f156168b = rdw0Var;
    }

    @Override // p153l.kbw0
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzead zzeadVar;
        String strConcat;
        p8v0 p8v0Var = (p8v0) obj;
        int iOptInt = p8v0Var.f151062a.optInt("http_timeout_millis", HuiYanResultSender.TIMEOUT_MS);
        s4t0 s4t0Var = p8v0Var.f151063b;
        String strJoin = "";
        if (s4t0Var.m184589a() != -2) {
            if (s4t0Var.m184589a() == 1) {
                if (s4t0Var.m184594f() != null) {
                    strJoin = TextUtils.join(", ", s4t0Var.m184594f());
                    dct0.m115295d(strJoin);
                }
                zzeadVar = new zzead(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzeadVar = new zzead(1);
            }
            cew0 cew0Var = this.f156169c;
            rdw0 rdw0Var = this.f156168b;
            rdw0Var.mo162912b(zzeadVar);
            rdw0Var.mo162910S(false);
            cew0Var.m109461a(rdw0Var);
            throw zzeadVar;
        }
        HashMap map = new HashMap();
        if (p8v0Var.f151063b.m184596h() && !TextUtils.isEmpty(this.f156167a)) {
            boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168084O0)).booleanValue();
            String str = this.f156167a;
            if (zBooleanValue) {
                if (TextUtils.isEmpty(str)) {
                    strConcat = "";
                } else {
                    Matcher matcher = f156166d.matcher(str);
                    strConcat = "";
                    while (matcher.find()) {
                        String strGroup = matcher.group(1);
                        if (strGroup != null) {
                            Locale locale = Locale.ROOT;
                            if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("; ");
                                }
                                strConcat = strConcat.concat(strGroup);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strConcat)) {
                    map.put(HttpHeaders.COOKIE, strConcat);
                }
            } else {
                map.put(HttpHeaders.COOKIE, str);
            }
        }
        if (p8v0Var.f151063b.m184597i()) {
            r8v0.m180248a(map, p8v0Var.f151062a);
        }
        if (p8v0Var.f151063b != null && !TextUtils.isEmpty(p8v0Var.f151063b.m184592d())) {
            strJoin = p8v0Var.f151063b.m184592d();
        }
        cew0 cew0Var2 = this.f156169c;
        rdw0 rdw0Var2 = this.f156168b;
        rdw0Var2.mo162910S(true);
        cew0Var2.m109461a(rdw0Var2);
        return new g8v0(p8v0Var.f151063b.m184593e(), iOptInt, map, strJoin.getBytes(cow0.f82931c), "", p8v0Var.f151063b.m184597i());
    }
}
