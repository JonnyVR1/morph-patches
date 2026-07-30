package p149l;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzead;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class kzu0 implements e2w0 {

    /* JADX INFO: renamed from: d */
    public static final Pattern f125421d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* JADX INFO: renamed from: a */
    public final String f125422a;

    /* JADX INFO: renamed from: b */
    public final l4w0 f125423b;

    /* JADX INFO: renamed from: c */
    public final w4w0 f125424c;

    public kzu0(String str, w4w0 w4w0Var, l4w0 l4w0Var) {
        this.f125422a = str;
        this.f125424c = w4w0Var;
        this.f125423b = l4w0Var;
    }

    @Override // p149l.e2w0
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzead zzeadVar;
        String strConcat;
        jzu0 jzu0Var = (jzu0) obj;
        int iOptInt = jzu0Var.f120418a.optInt("http_timeout_millis", HuiYanResultSender.TIMEOUT_MS);
        mvs0 mvs0Var = jzu0Var.f120419b;
        String strJoin = "";
        if (mvs0Var.m156594a() != -2) {
            if (mvs0Var.m156594a() == 1) {
                if (mvs0Var.m156599f() != null) {
                    strJoin = TextUtils.join(", ", mvs0Var.m156599f());
                    x2t0.m206866d(strJoin);
                }
                zzeadVar = new zzead(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzeadVar = new zzead(1);
            }
            w4w0 w4w0Var = this.f125424c;
            l4w0 l4w0Var = this.f125423b;
            l4w0Var.mo129463b(zzeadVar);
            l4w0Var.mo129461S(false);
            w4w0Var.m201583a(l4w0Var);
            throw zzeadVar;
        }
        HashMap map = new HashMap();
        if (jzu0Var.f120419b.m156601h() && !TextUtils.isEmpty(this.f125422a)) {
            boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132013O0)).booleanValue();
            String str = this.f125422a;
            if (zBooleanValue) {
                if (TextUtils.isEmpty(str)) {
                    strConcat = "";
                } else {
                    Matcher matcher = f125421d.matcher(str);
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
                    map.put("Cookie", strConcat);
                }
            } else {
                map.put("Cookie", str);
            }
        }
        if (jzu0Var.f120419b.m156602i()) {
            lzu0.m152364a(map, jzu0Var.f120418a);
        }
        if (jzu0Var.f120419b != null && !TextUtils.isEmpty(jzu0Var.f120419b.m156597d())) {
            strJoin = jzu0Var.f120419b.m156597d();
        }
        w4w0 w4w0Var2 = this.f125424c;
        l4w0 l4w0Var2 = this.f125423b;
        l4w0Var2.mo129461S(true);
        w4w0Var2.m201583a(l4w0Var2);
        return new azu0(jzu0Var.f120419b.m156598e(), iOptInt, map, strJoin.getBytes(wew0.f185990c), "", jzu0Var.f120419b.m156602i());
    }
}
