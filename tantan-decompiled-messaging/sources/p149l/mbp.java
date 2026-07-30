package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.IntlProfileInfo;
import com.p046p1.mobile.putong.data.IntlProfileInfoConfig;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0007J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0007JA\u0010 \u001a\u00020\u00122\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u001b0\u001a2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u001ej\b\u0012\u0004\u0012\u00020\u0005`\u001fH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\t2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010$¨\u0006&"}, m87232d2 = {"Ll/mbp;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/data/IntlProfileInfo;", "f", "()Ljava/util/List;", "g", "", "h", "()Ljava/lang/String;", Item.TYPE, RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/data/IntlProfileInfo;)Ljava/lang/String;", "list", "", "isLanguage", "", "j", "(Ljava/util/List;Z)V", "Lcom/p1/mobile/putong/data/IntlProfileInfoConfig;", "e", "()Lcom/p1/mobile/putong/data/IntlProfileInfoConfig;", "a", "b", "", "Ll/j760;", "", "arrayOf", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Constants.INAPP_DATA_TAG, "([Ll/j760;Ljava/util/ArrayList;)V", "c", "(Ljava/util/List;)Ljava/lang/String;", "Ljava/lang/String;", "intlProfileConfig", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class mbp {

    @NotNull
    public static final mbp INSTANCE = new mbp();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static String intlProfileConfig;

    /* JADX INFO: renamed from: a */
    public final List<IntlProfileInfo> m153962a() {
        ArrayList<IntlProfileInfo> arrayList = new ArrayList<>();
        m153965d(new j760[]{vwb.m200311Y(Integer.valueOf(R$string.f16308y0), "ASIAN"), vwb.m200311Y(Integer.valueOf(R$string.f16303x0), "ARAB"), vwb.m200311Y(Integer.valueOf(R$string.f16313z0), "BLACK"), vwb.m200311Y(Integer.valueOf(R$string.f16043A0), "HISPANIC"), vwb.m200311Y(Integer.valueOf(R$string.f16048B0), "NATIVE"), vwb.m200311Y(Integer.valueOf(R$string.f16058D0), "PACIFIC"), vwb.m200311Y(Integer.valueOf(R$string.f16063E0), "SOUTHASIAN"), vwb.m200311Y(Integer.valueOf(R$string.f16078H0), "WHITE"), vwb.m200311Y(Integer.valueOf(R$string.f16053C0), "OTHER")}, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final List<IntlProfileInfo> m153963b() {
        ArrayList<IntlProfileInfo> arrayList = new ArrayList<>();
        m153965d(new j760[]{vwb.m200311Y(Integer.valueOf(R$string.f16083I0), "ENGLISH"), vwb.m200311Y(Integer.valueOf(R$string.f16108N0), "SCHINESE"), vwb.m200311Y(Integer.valueOf(R$string.f16128R0), "TCHINESE"), vwb.m200311Y(Integer.valueOf(R$string.f16093K0), "JAPANESE"), vwb.m200311Y(Integer.valueOf(R$string.f16098L0), "KOREAN"), vwb.m200311Y(Integer.valueOf(R$string.f16088J0), "INDONESIAN"), vwb.m200311Y(Integer.valueOf(R$string.f16123Q0), "TAI"), vwb.m200311Y(Integer.valueOf(R$string.f16113O0), "SPANISH"), vwb.m200311Y(Integer.valueOf(R$string.f16103M0), "OTHER")}, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final String m153964c(List<String> list) {
        if (vwb.m200296J(list)) {
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
    public final void m153965d(j760<Integer, String>[] arrayOf, ArrayList<IntlProfileInfo> list) {
        for (j760<Integer, String> j760Var : arrayOf) {
            IntlProfileInfo intlProfileInfo = new IntlProfileInfo();
            Integer num = j760Var.f116564a;
            if (num != null) {
                intlProfileInfo.nameLocal = hvc0.m133156c(num.intValue());
            }
            String str = j760Var.f116565b;
            if (str != null) {
                intlProfileInfo.key = str;
            }
            list.add(intlProfileInfo);
        }
    }

    /* JADX INFO: renamed from: e */
    public final IntlProfileInfoConfig m153966e() {
        String strM153969h = m153969h();
        if (TextUtils.isEmpty(strM153969h)) {
            return null;
        }
        return IntlProfileInfoConfig.JSON_ADAPTER.parse(strM153969h);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<IntlProfileInfo> m153967f() {
        IntlProfileInfoConfig intlProfileInfoConfigM153966e = m153966e();
        if (intlProfileInfoConfigM153966e == null || vwb.m200296J(intlProfileInfoConfigM153966e.ethnicity)) {
            return m153962a();
        }
        List<IntlProfileInfo> list = intlProfileInfoConfigM153966e.ethnicity;
        list.getClass();
        return list;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<IntlProfileInfo> m153968g() {
        IntlProfileInfoConfig intlProfileInfoConfigM153966e = m153966e();
        if (intlProfileInfoConfigM153966e == null || vwb.m200296J(intlProfileInfoConfigM153966e.language)) {
            return m153963b();
        }
        List<IntlProfileInfo> list = intlProfileInfoConfigM153966e.language;
        list.getClass();
        return list;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final String m153969h() {
        if (!TextUtils.isEmpty(intlProfileConfig)) {
            return intlProfileConfig;
        }
        try {
            intlProfileConfig = RemoteConfig.m79298x().m79302F("intl_sign_up_north_america_config");
        } catch (Exception unused) {
        }
        return intlProfileConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m153970i(@NotNull IntlProfileInfo item) {
        item.getClass();
        if (!TextUtils.isEmpty(item.nameLocal)) {
            String str = item.nameLocal;
            str.getClass();
            return str;
        }
        String strLanguage = Network.language();
        strLanguage.getClass();
        if (C15386d.m93483J(strLanguage, Network.LANGUAGE_ZH_HANT, false, 2, null)) {
            String str2 = item.nameZhTw;
            str2.getClass();
            return str2;
        }
        if (C15386d.m93483J(strLanguage, Network.LANGUAGE_ZH_HANS, false, 2, null)) {
            String str3 = item.nameZh;
            str3.getClass();
            return str3;
        }
        if (C15386d.m93483J(strLanguage, "ko", false, 2, null)) {
            String str4 = item.nameKo;
            str4.getClass();
            return str4;
        }
        if (C15386d.m93483J(strLanguage, "ja", false, 2, null)) {
            String str5 = item.nameJa;
            str5.getClass();
            return str5;
        }
        if (C15386d.m93483J(strLanguage, "id", false, 2, null)) {
            String str6 = item.nameIn;
            str6.getClass();
            return str6;
        }
        if (C15386d.m93483J(strLanguage, "th", false, 2, null)) {
            String str7 = item.nameTh;
            str7.getClass();
            return str7;
        }
        if (C15386d.m93483J(strLanguage, "vi", false, 2, null)) {
            String str8 = item.nameVi;
            str8.getClass();
            return str8;
        }
        String str9 = item.nameEn;
        str9.getClass();
        return str9;
    }

    /* JADX INFO: renamed from: j */
    public final void m153971j(@Nullable List<String> list, boolean isLanguage) {
        if (isLanguage) {
            zvf0.m220399u("e_signup_language", "p_signup_language", vwb.m200311Y("language_type", m153964c(list)));
        } else {
            zvf0.m220399u("e_signup_ethnicity", "p_signup_ethnicity", vwb.m200311Y("ethnicity_type", m153964c(list)));
        }
    }
}
