package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.data.IntlProfileInfo;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\f¨\u0006\u0019"}, m88121d2 = {"Ll/rpa0;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/data/IntlProfileInfo;", "b", "()Ljava/util/List;", "c", "", "ethnicity", Constants.INAPP_DATA_TAG, "(Ljava/util/List;)Ljava/lang/String;", IjkMediaMeta.IJKM_KEY_LANGUAGE, "e", Item.TYPE, "f", "(Lcom/p1/mobile/putong/data/IntlProfileInfo;)Ljava/lang/String;", "list", "", "isLanguage", "", "g", "(Ljava/util/List;Z)V", "a", "profile_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class rpa0 {

    @NotNull
    public static final rpa0 INSTANCE = new rpa0();

    /* JADX INFO: renamed from: a */
    public final String m182512a(List<String> list) {
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

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<IntlProfileInfo> m182513b() {
        List<IntlProfileInfo> listMo29177zh = CoreModule.m30929H().mo29177zh();
        listMo29177zh.getClass();
        return listMo29177zh;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<IntlProfileInfo> m182514c() {
        List<IntlProfileInfo> listMo29169p9 = CoreModule.m30929H().mo29169p9();
        listMo29169p9.getClass();
        return listMo29169p9;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m182515d(@Nullable List<String> ethnicity) {
        if (jyb.m147479J(ethnicity)) {
            return "";
        }
        List<IntlProfileInfo> listM182513b = m182513b();
        if (ethnicity != null) {
            for (String str : ethnicity) {
                for (IntlProfileInfo intlProfileInfo : listM182513b) {
                    if (TextUtils.equals(intlProfileInfo.key, str)) {
                        return INSTANCE.m182517f(intlProfileInfo);
                    }
                }
            }
        }
        return "";
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m182516e(@Nullable List<String> language) {
        if (jyb.m147479J(language)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<IntlProfileInfo> listM182514c = m182514c();
        if (language != null) {
            for (String str : language) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append("/");
                }
                for (IntlProfileInfo intlProfileInfo : listM182514c) {
                    if (TextUtils.equals(intlProfileInfo.key, str)) {
                        sb.append(INSTANCE.m182517f(intlProfileInfo));
                    }
                }
            }
        }
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m182517f(@NotNull IntlProfileInfo item) {
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

    /* JADX INFO: renamed from: g */
    public final void m182518g(@Nullable List<String> list, boolean isLanguage) {
        if (isLanguage) {
            i4g0.m138523u("e_signup_language", "p_profile_language", jyb.m147494Y("language_type", m182512a(list)));
        } else {
            i4g0.m138523u("e_signup_ethnicity", "p_profile_ethnicity", jyb.m147494Y("ethnicity_type", m182512a(list)));
        }
    }
}
