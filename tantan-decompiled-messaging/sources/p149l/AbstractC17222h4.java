package p149l;

import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: renamed from: l.h4 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC17222h4 {

    /* JADX INFO: renamed from: a */
    public final User f105774a;

    /* JADX INFO: renamed from: b */
    public final CoreSuggested.UserInfo f105775b;

    /* JADX INFO: renamed from: c */
    public final gol f105776c;

    /* JADX INFO: renamed from: l.h4$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f105777a;

        static {
            int[] iArr = new int[CardInfoRenderFrom.values().length];
            f105777a = iArr;
            try {
                iArr[CardInfoRenderFrom.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105777a[CardInfoRenderFrom.PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105777a[CardInfoRenderFrom.PROFILE_PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f105777a[CardInfoRenderFrom.OLD_TRANS_PROFILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public AbstractC17222h4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        this.f105776c = golVar;
        this.f105774a = user;
        this.f105775b = userInfo;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo116768a();

    /* JADX INFO: renamed from: b */
    public boolean mo129196b(rk4 rk4Var, List<AbstractC17222h4> list, AbstractC17222h4 abstractC17222h4) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo116769c();

    /* JADX INFO: renamed from: d */
    public String mo116770d() {
        return "";
    }

    /* JADX INFO: renamed from: e */
    public String m129197e() {
        if (!NullChecker.m81303a(this.f105775b)) {
            return "p_suggest_users_home_view";
        }
        int i = a.f105777a[this.f105775b.renderFrom.ordinal()];
        if (i == 2) {
            return OMSDialogPositon.p_suggest_user_profile_info_view;
        }
        if (i != 3) {
            return i != 4 ? "p_suggest_users_home_view" : "p_confirm_new_profile";
        }
        return "p_edit_profile_view";
    }

    /* JADX INFO: renamed from: f */
    public boolean getShouldShowNextLabel() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo116771g() {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo116772h();

    /* JADX INFO: renamed from: i */
    public List<Class> m129198i() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo129199j() {
        return false;
    }
}
