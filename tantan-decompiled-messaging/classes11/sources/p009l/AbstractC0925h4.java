package p009l;

import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: renamed from: l.h4 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class AbstractC0925h4 {

    /* JADX INFO: renamed from: a */
    public final User f13854a;

    /* JADX INFO: renamed from: b */
    public final CoreSuggested.UserInfo f13855b;

    /* JADX INFO: renamed from: c */
    public final gol f13856c;

    /* JADX INFO: renamed from: l.h4$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13857a;

        static {
            int[] iArr = new int[CardInfoRenderFrom.values().length];
            f13857a = iArr;
            try {
                iArr[CardInfoRenderFrom.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13857a[CardInfoRenderFrom.PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13857a[CardInfoRenderFrom.PROFILE_PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13857a[CardInfoRenderFrom.OLD_TRANS_PROFILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public AbstractC0925h4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        this.f13856c = golVar;
        this.f13854a = user;
        this.f13855b = userInfo;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo13953a();

    /* JADX INFO: renamed from: b */
    public boolean mo15389b(rk4 rk4Var, List<AbstractC0925h4> list, AbstractC0925h4 abstractC0925h4) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo13954c();

    /* JADX INFO: renamed from: d */
    public String mo13955d() {
        return "";
    }

    /* JADX INFO: renamed from: e */
    public String m15390e() {
        if (!NullChecker.a(this.f13855b)) {
            return "p_suggest_users_home_view";
        }
        int i = a.f13857a[this.f13855b.renderFrom.ordinal()];
        if (i == 2) {
            return "p_suggest_user_profile_info_view";
        }
        if (i != 3) {
            return i != 4 ? "p_suggest_users_home_view" : "p_confirm_new_profile";
        }
        return "p_edit_profile_view";
    }

    /* JADX INFO: renamed from: f */
    public boolean mo15079f() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo13956g() {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo13957h();

    /* JADX INFO: renamed from: i */
    public List<Class> m15391i() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo15392j() {
        return false;
    }
}
