package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.data.IntlProfileInfo;
import com.p051p1.mobile.putong.data.IntlProfileInfoConfig;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0007J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0007JA\u0010 \u001a\u00020\u00122\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u001b0\u001a2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u001ej\b\u0012\u0004\u0012\u00020\u0005`\u001fH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\t2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010$¨\u0006&"}, m88121d2 = {"Ll/mdp;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/data/IntlProfileInfo;", "f", "()Ljava/util/List;", "g", "", "h", "()Ljava/lang/String;", Item.TYPE, RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/data/IntlProfileInfo;)Ljava/lang/String;", "list", "", "isLanguage", "", "j", "(Ljava/util/List;Z)V", "Lcom/p1/mobile/putong/data/IntlProfileInfoConfig;", "e", "()Lcom/p1/mobile/putong/data/IntlProfileInfoConfig;", "a", "b", "", "Ll/pf60;", "", "arrayOf", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Constants.INAPP_DATA_TAG, "([Ll/pf60;Ljava/util/ArrayList;)V", "c", "(Ljava/util/List;)Ljava/lang/String;", "Ljava/lang/String;", "intlProfileConfig", "b_account_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class mdp {

    @NotNull
    public static final mdp INSTANCE = new mdp();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static String intlProfileConfig;

    /* JADX INFO: renamed from: a */
    public final List<IntlProfileInfo> m157979a() {
        ArrayList<IntlProfileInfo> arrayList = new ArrayList<>();
        m157982d(new pf60[]{jyb.m147494Y(Integer.valueOf(R$string.f17027y0), "ASIAN"), jyb.m147494Y(Integer.valueOf(R$string.f17022x0), "ARAB"), jyb.m147494Y(Integer.valueOf(R$string.f17032z0), "BLACK"), jyb.m147494Y(Integer.valueOf(R$string.f16762A0), "HISPANIC"), jyb.m147494Y(Integer.valueOf(R$string.f16767B0), "NATIVE"), jyb.m147494Y(Integer.valueOf(R$string.f16777D0), "PACIFIC"), jyb.m147494Y(Integer.valueOf(R$string.f16782E0), "SOUTHASIAN"), jyb.m147494Y(Integer.valueOf(R$string.f16797H0), "WHITE"), jyb.m147494Y(Integer.valueOf(R$string.f16772C0), "OTHER")}, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final List<IntlProfileInfo> m157980b() {
        ArrayList<IntlProfileInfo> arrayList = new ArrayList<>();
        m157982d(new pf60[]{jyb.m147494Y(Integer.valueOf(R$string.f16802I0), "ENGLISH"), jyb.m147494Y(Integer.valueOf(R$string.f16827N0), "SCHINESE"), jyb.m147494Y(Integer.valueOf(R$string.f16847R0), "TCHINESE"), jyb.m147494Y(Integer.valueOf(R$string.f16812K0), "JAPANESE"), jyb.m147494Y(Integer.valueOf(R$string.f16817L0), "KOREAN"), jyb.m147494Y(Integer.valueOf(R$string.f16807J0), "INDONESIAN"), jyb.m147494Y(Integer.valueOf(R$string.f16842Q0), "TAI"), jyb.m147494Y(Integer.valueOf(R$string.f16832O0), "SPANISH"), jyb.m147494Y(Integer.valueOf(R$string.f16822M0), "OTHER")}, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final String m157981c(List<String> list) {
        if (jyb.m147479J(list)) {
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
    public final void m157982d(pf60<Integer, String>[] arrayOf, ArrayList<IntlProfileInfo> list) {
        for (pf60<Integer, String> pf60Var : arrayOf) {
            IntlProfileInfo intlProfileInfo = new IntlProfileInfo();
            Integer num = pf60Var.f152156a;
            if (num != null) {
                intlProfileInfo.nameLocal = k3d0.m148007c(num.intValue());
            }
            String str = pf60Var.f152157b;
            if (str != null) {
                intlProfileInfo.key = str;
            }
            list.add(intlProfileInfo);
        }
    }

    /* JADX INFO: renamed from: e */
    public final IntlProfileInfoConfig m157983e() {
        String strM157986h = m157986h();
        if (TextUtils.isEmpty(strM157986h)) {
            return null;
        }
        return IntlProfileInfoConfig.JSON_ADAPTER.parse(strM157986h);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<IntlProfileInfo> m157984f() {
        IntlProfileInfoConfig intlProfileInfoConfigM157983e = m157983e();
        if (intlProfileInfoConfigM157983e == null || jyb.m147479J(intlProfileInfoConfigM157983e.ethnicity)) {
            return m157979a();
        }
        List<IntlProfileInfo> list = intlProfileInfoConfigM157983e.ethnicity;
        list.getClass();
        return list;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final List<IntlProfileInfo> m157985g() {
        IntlProfileInfoConfig intlProfileInfoConfigM157983e = m157983e();
        if (intlProfileInfoConfigM157983e == null || jyb.m147479J(intlProfileInfoConfigM157983e.language)) {
            return m157980b();
        }
        List<IntlProfileInfo> list = intlProfileInfoConfigM157983e.language;
        list.getClass();
        return list;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final String m157986h() {
        if (!TextUtils.isEmpty(intlProfileConfig)) {
            return intlProfileConfig;
        }
        try {
            intlProfileConfig = RemoteConfig.m80481x().m80485F("intl_sign_up_north_america_config");
        } catch (Exception unused) {
        }
        return intlProfileConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m157987i(@NotNull IntlProfileInfo item) {
        item.getClass();
        if (!TextUtils.isEmpty(item.nameLocal)) {
            String str = item.nameLocal;
            str.getClass();
            return str;
        }
        String strLanguage = Network.language();
        strLanguage.getClass();
        if (C15493d.m94374J(strLanguage, Network.LANGUAGE_ZH_HANT, false, 2, null)) {
            String str2 = item.nameZhTw;
            str2.getClass();
            return str2;
        }
        if (C15493d.m94374J(strLanguage, Network.LANGUAGE_ZH_HANS, false, 2, null)) {
            String str3 = item.nameZh;
            str3.getClass();
            return str3;
        }
        if (C15493d.m94374J(strLanguage, "ko", false, 2, null)) {
            String str4 = item.nameKo;
            str4.getClass();
            return str4;
        }
        if (C15493d.m94374J(strLanguage, "ja", false, 2, null)) {
            String str5 = item.nameJa;
            str5.getClass();
            return str5;
        }
        if (C15493d.m94374J(strLanguage, "id", false, 2, null)) {
            String str6 = item.nameIn;
            str6.getClass();
            return str6;
        }
        if (C15493d.m94374J(strLanguage, "th", false, 2, null)) {
            String str7 = item.nameTh;
            str7.getClass();
            return str7;
        }
        if (C15493d.m94374J(strLanguage, "vi", false, 2, null)) {
            String str8 = item.nameVi;
            str8.getClass();
            return str8;
        }
        String str9 = item.nameEn;
        str9.getClass();
        return str9;
    }

    /* JADX INFO: renamed from: j */
    public final void m157988j(@Nullable List<String> list, boolean isLanguage) {
        if (isLanguage) {
            i4g0.m138523u("e_signup_language", "p_signup_language", jyb.m147494Y("language_type", m157981c(list)));
        } else {
            i4g0.m138523u("e_signup_ethnicity", "p_signup_ethnicity", jyb.m147494Y("ethnicity_type", m157981c(list)));
        }
    }
}
