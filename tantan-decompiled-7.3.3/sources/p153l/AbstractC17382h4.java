package p153l;

import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: renamed from: l.h4 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC17382h4 {

    /* JADX INFO: renamed from: a */
    public final User f107713a;

    /* JADX INFO: renamed from: b */
    public final CoreSuggested.UserInfo f107714b;

    /* JADX INFO: renamed from: c */
    public final rql f107715c;

    /* JADX INFO: renamed from: l.h4$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f107716a;

        static {
            int[] iArr = new int[CardInfoRenderFrom.values().length];
            f107716a = iArr;
            try {
                iArr[CardInfoRenderFrom.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f107716a[CardInfoRenderFrom.PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f107716a[CardInfoRenderFrom.PROFILE_PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f107716a[CardInfoRenderFrom.OLD_TRANS_PROFILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public AbstractC17382h4(rql rqlVar, User user, CoreSuggested.UserInfo userInfo) {
        this.f107715c = rqlVar;
        this.f107713a = user;
        this.f107714b = userInfo;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo116205a();

    /* JADX INFO: renamed from: b */
    public boolean mo133525b(ql4 ql4Var, List<AbstractC17382h4> list, AbstractC17382h4 abstractC17382h4) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo116206c();

    /* JADX INFO: renamed from: d */
    public String mo116207d() {
        return "";
    }

    /* JADX INFO: renamed from: e */
    public String m133526e() {
        if (!NullChecker.m82486a(this.f107714b)) {
            return "p_suggest_users_home_view";
        }
        int i = a.f107716a[this.f107714b.renderFrom.ordinal()];
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
    public boolean mo116208g() {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo116209h();

    /* JADX INFO: renamed from: i */
    public List<Class> m133527i() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo133528j() {
        return false;
    }
}
