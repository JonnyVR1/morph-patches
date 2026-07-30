package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.data.IntlProfileInfo;
import com.p1.mobile.putong.data.IntlProfileInfoConfig;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.d;
import l.hvc0;
import l.j760;
import l.vwb;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0007J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0007JA\u0010 \u001a\u00020\u00122\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u001b0\u001a2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u001ej\b\u0012\u0004\u0012\u00020\u0005`\u001fH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\t2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010$¨\u0006&"}, d2 = {"Ll/mbp;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/data/IntlProfileInfo;", "f", "()Ljava/util/List;", "g", "", "h", "()Ljava/lang/String;", "item", "i", "(Lcom/p1/mobile/putong/data/IntlProfileInfo;)Ljava/lang/String;", "list", "", "isLanguage", "", "j", "(Ljava/util/List;Z)V", "Lcom/p1/mobile/putong/data/IntlProfileInfoConfig;", "e", "()Lcom/p1/mobile/putong/data/IntlProfileInfoConfig;", "a", "b", "", "Ll/j760;", "", "arrayOf", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "([Ll/j760;Ljava/util/ArrayList;)V", "c", "(Ljava/util/List;)Ljava/lang/String;", "Ljava/lang/String;", "intlProfileConfig", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class mbp {

    @NotNull
    public static final mbp INSTANCE = new mbp();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static String intlProfileConfig;

    /* JADX INFO: renamed from: a */
    public final List<IntlProfileInfo> m19194a() {
        ArrayList<IntlProfileInfo> arrayList = new ArrayList<>();
        m19197d(new j760[]{vwb.Y(Integer.valueOf(R$string.f297y0), "ASIAN"), vwb.Y(Integer.valueOf(R$string.f292x0), "ARAB"), vwb.Y(Integer.valueOf(R$string.f302z0), "BLACK"), vwb.Y(Integer.valueOf(R$string.f32A0), "HISPANIC"), vwb.Y(Integer.valueOf(R$string.f37B0), "NATIVE"), vwb.Y(Integer.valueOf(R$string.f47D0), "PACIFIC"), vwb.Y(Integer.valueOf(R$string.f52E0), "SOUTHASIAN"), vwb.Y(Integer.valueOf(R$string.f67H0), "WHITE"), vwb.Y(Integer.valueOf(R$string.f42C0), "OTHER")}, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final List<IntlProfileInfo> m19195b() {
        ArrayList<IntlProfileInfo> arrayList = new ArrayList<>();
        m19197d(new j760[]{vwb.Y(Integer.valueOf(R$string.f72I0), "ENGLISH"), vwb.Y(Integer.valueOf(R$string.f97N0), "SCHINESE"), vwb.Y(Integer.valueOf(R$string.f117R0), "TCHINESE"), vwb.Y(Integer.valueOf(R$string.f82K0), "JAPANESE"), vwb.Y(Integer.valueOf(R$string.f87L0), "KOREAN"), vwb.Y(Integer.valueOf(R$string.f77J0), "INDONESIAN"), vwb.Y(Integer.valueOf(R$string.f112Q0), "TAI"), vwb.Y(Integer.valueOf(R$string.f102O0), "SPANISH"), vwb.Y(Integer.valueOf(R$string.f92M0), "OTHER")}, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final String m19196c(List<String> list) {
        if (vwb.J(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            for (String str : list) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append("/");
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public final void m19197d(j760<Integer, String>[] arrayOf, ArrayList<IntlProfileInfo> list) {
        for (j760<Integer, String> j760Var : arrayOf) {
            IntlProfileInfo intlProfileInfo = new IntlProfileInfo();
            Integer num = (Integer) j760Var.a;
            if (num != null) {
                intlProfileInfo.nameLocal = hvc0.c(num.intValue());
            }
            String str = (String) j760Var.b;
            if (str != null) {
                intlProfileInfo.key = str;
            }
            list.add(intlProfileInfo);
        }
    }

    /* JADX INFO: renamed from: e */
    public final IntlProfileInfoConfig m19198e() {
        String strM19201h = m19201h();
        if (TextUtils.isEmpty(strM19201h)) {
            return null;
        }
        return (IntlProfileInfoConfig) IntlProfileInfoConfig.JSON_ADAPTER.parse(strM19201h);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<IntlProfileInfo> m19199f() {
        IntlProfileInfoConfig intlProfileInfoConfigM19198e = m19198e();
        if (intlProfileInfoConfigM19198e == null || vwb.J(intlProfileInfoConfigM19198e.ethnicity)) {
            return m19194a();
        }
        List<IntlProfileInfo> list = intlProfileInfoConfigM19198e.ethnicity;
        list.getClass();
        return list;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<IntlProfileInfo> m19200g() {
        IntlProfileInfoConfig intlProfileInfoConfigM19198e = m19198e();
        if (intlProfileInfoConfigM19198e == null || vwb.J(intlProfileInfoConfigM19198e.language)) {
            return m19195b();
        }
        List<IntlProfileInfo> list = intlProfileInfoConfigM19198e.language;
        list.getClass();
        return list;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final String m19201h() {
        if (!TextUtils.isEmpty(intlProfileConfig)) {
            return intlProfileConfig;
        }
        try {
            intlProfileConfig = RemoteConfig.x().F("intl_sign_up_north_america_config");
        } catch (Exception unused) {
        }
        return intlProfileConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m19202i(@NotNull IntlProfileInfo item) {
        item.getClass();
        if (!TextUtils.isEmpty(item.nameLocal)) {
            String str = item.nameLocal;
            str.getClass();
            return str;
        }
        String strLanguage = Network.language();
        strLanguage.getClass();
        if (d.J(strLanguage, Network.LANGUAGE_ZH_HANT, false, 2, (Object) null)) {
            String str2 = item.nameZhTw;
            str2.getClass();
            return str2;
        }
        if (d.J(strLanguage, Network.LANGUAGE_ZH_HANS, false, 2, (Object) null)) {
            String str3 = item.nameZh;
            str3.getClass();
            return str3;
        }
        if (d.J(strLanguage, "ko", false, 2, (Object) null)) {
            String str4 = item.nameKo;
            str4.getClass();
            return str4;
        }
        if (d.J(strLanguage, "ja", false, 2, (Object) null)) {
            String str5 = item.nameJa;
            str5.getClass();
            return str5;
        }
        if (d.J(strLanguage, "id", false, 2, (Object) null)) {
            String str6 = item.nameIn;
            str6.getClass();
            return str6;
        }
        if (d.J(strLanguage, "th", false, 2, (Object) null)) {
            String str7 = item.nameTh;
            str7.getClass();
            return str7;
        }
        if (d.J(strLanguage, "vi", false, 2, (Object) null)) {
            String str8 = item.nameVi;
            str8.getClass();
            return str8;
        }
        String str9 = item.nameEn;
        str9.getClass();
        return str9;
    }

    /* JADX INFO: renamed from: j */
    public final void m19203j(@Nullable List<String> list, boolean isLanguage) {
        if (isLanguage) {
            zvf0.u("e_signup_language", "p_signup_language", new j760[]{vwb.Y("language_type", m19196c(list))});
        } else {
            zvf0.u("e_signup_ethnicity", "p_signup_ethnicity", new j760[]{vwb.Y("ethnicity_type", m19196c(list))});
        }
    }
}
