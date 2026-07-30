package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.IntlProfileInfo;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\f¨\u0006\u0019"}, m87232d2 = {"Ll/nha0;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/data/IntlProfileInfo;", "b", "()Ljava/util/List;", "c", "", "ethnicity", Constants.INAPP_DATA_TAG, "(Ljava/util/List;)Ljava/lang/String;", IjkMediaMeta.IJKM_KEY_LANGUAGE, "e", Item.TYPE, "f", "(Lcom/p1/mobile/putong/data/IntlProfileInfo;)Ljava/lang/String;", "list", "", "isLanguage", "", "g", "(Ljava/util/List;Z)V", "a", "profile_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class nha0 {

    @NotNull
    public static final nha0 INSTANCE = new nha0();

    /* JADX INFO: renamed from: a */
    public final String m159386a(List<String> list) {
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

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<IntlProfileInfo> m159387b() {
        List<IntlProfileInfo> listMo28178zh = CoreModule.m29931H().mo28178zh();
        listMo28178zh.getClass();
        return listMo28178zh;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<IntlProfileInfo> m159388c() {
        List<IntlProfileInfo> listMo28170p9 = CoreModule.m29931H().mo28170p9();
        listMo28170p9.getClass();
        return listMo28170p9;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m159389d(@Nullable List<String> ethnicity) {
        if (vwb.m200296J(ethnicity)) {
            return "";
        }
        List<IntlProfileInfo> listM159387b = m159387b();
        if (ethnicity != null) {
            for (String str : ethnicity) {
                for (IntlProfileInfo intlProfileInfo : listM159387b) {
                    if (TextUtils.equals(intlProfileInfo.key, str)) {
                        return INSTANCE.m159391f(intlProfileInfo);
                    }
                }
            }
        }
        return "";
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m159390e(@Nullable List<String> language) {
        if (vwb.m200296J(language)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<IntlProfileInfo> listM159388c = m159388c();
        if (language != null) {
            for (String str : language) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append("/");
                }
                for (IntlProfileInfo intlProfileInfo : listM159388c) {
                    if (TextUtils.equals(intlProfileInfo.key, str)) {
                        sb.append(INSTANCE.m159391f(intlProfileInfo));
                    }
                }
            }
        }
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m159391f(@NotNull IntlProfileInfo item) {
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

    /* JADX INFO: renamed from: g */
    public final void m159392g(@Nullable List<String> list, boolean isLanguage) {
        if (isLanguage) {
            zvf0.m220399u("e_signup_language", "p_profile_language", vwb.m200311Y("language_type", m159386a(list)));
        } else {
            zvf0.m220399u("e_signup_ethnicity", "p_profile_ethnicity", vwb.m200311Y("ethnicity_type", m159386a(list)));
        }
    }
}
