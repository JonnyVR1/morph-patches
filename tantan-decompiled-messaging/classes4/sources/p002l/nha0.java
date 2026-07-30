package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.IntlProfileInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.d;
import l.j760;
import l.vwb;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"Ll/nha0;", "", "<init>", "()V", "", "Lcom/p1/mobile/putong/data/IntlProfileInfo;", "b", "()Ljava/util/List;", "c", "", "ethnicity", "d", "(Ljava/util/List;)Ljava/lang/String;", "language", "e", "item", "f", "(Lcom/p1/mobile/putong/data/IntlProfileInfo;)Ljava/lang/String;", "list", "", "isLanguage", "", "g", "(Ljava/util/List;Z)V", "a", "profile_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class nha0 {

    @NotNull
    public static final nha0 INSTANCE = new nha0();

    /* JADX INFO: renamed from: a */
    public final String m18754a(List<String> list) {
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

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<IntlProfileInfo> m18755b() {
        List<IntlProfileInfo> listZh = CoreModule.H().zh();
        listZh.getClass();
        return listZh;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<IntlProfileInfo> m18756c() {
        List<IntlProfileInfo> listP9 = CoreModule.H().p9();
        listP9.getClass();
        return listP9;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m18757d(@Nullable List<String> ethnicity) {
        if (vwb.J(ethnicity)) {
            return "";
        }
        List<IntlProfileInfo> listM18755b = m18755b();
        if (ethnicity != null) {
            for (String str : ethnicity) {
                for (IntlProfileInfo intlProfileInfo : listM18755b) {
                    if (TextUtils.equals(intlProfileInfo.key, str)) {
                        return INSTANCE.m18759f(intlProfileInfo);
                    }
                }
            }
        }
        return "";
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m18758e(@Nullable List<String> language) {
        if (vwb.J(language)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<IntlProfileInfo> listM18756c = m18756c();
        if (language != null) {
            for (String str : language) {
                if (!TextUtils.isEmpty(sb.toString())) {
                    sb.append("/");
                }
                for (IntlProfileInfo intlProfileInfo : listM18756c) {
                    if (TextUtils.equals(intlProfileInfo.key, str)) {
                        sb.append(INSTANCE.m18759f(intlProfileInfo));
                    }
                }
            }
        }
        return sb.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m18759f(@NotNull IntlProfileInfo item) {
        item.getClass();
        if (!TextUtils.isEmpty(item.nameLocal)) {
            String str = item.nameLocal;
            str.getClass();
            return str;
        }
        String strLanguage = Network.language();
        strLanguage.getClass();
        if (d.J(strLanguage, "zh-Hant", false, 2, (Object) null)) {
            String str2 = item.nameZhTw;
            str2.getClass();
            return str2;
        }
        if (d.J(strLanguage, "zh-Hans", false, 2, (Object) null)) {
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

    /* JADX INFO: renamed from: g */
    public final void m18760g(@Nullable List<String> list, boolean isLanguage) {
        if (isLanguage) {
            zvf0.u("e_signup_language", "p_profile_language", new j760[]{vwb.Y("language_type", m18754a(list))});
        } else {
            zvf0.u("e_signup_ethnicity", "p_profile_ethnicity", new j760[]{vwb.Y("ethnicity_type", m18754a(list))});
        }
    }
}
