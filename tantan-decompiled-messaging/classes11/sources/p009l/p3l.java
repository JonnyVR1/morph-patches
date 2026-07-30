package p009l;

import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class p3l extends xkf {

    /* JADX INFO: renamed from: e */
    public ce50 f18373e;

    /* JADX INFO: renamed from: l.p3l$a */
    public static /* synthetic */ class C1099a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18374a;

        static {
            int[] iArr = new int[CardInfoRenderFrom.values().length];
            f18374a = iArr;
            try {
                iArr[CardInfoRenderFrom.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18374a[CardInfoRenderFrom.PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18374a[CardInfoRenderFrom.PROFILE_PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18374a[CardInfoRenderFrom.OLD_TRANS_PROFILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public String m20096A(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.a(userInfo)) {
            return "p_suggest_users_home_view";
        }
        int i = C1099a.f18374a[userInfo.renderFrom.ordinal()];
        if (i == 2) {
            return "p_suggest_user_profile_info_view";
        }
        if (i != 3) {
            return i != 4 ? "p_suggest_users_home_view" : "p_confirm_new_profile";
        }
        return "p_edit_profile_view";
    }

    /* JADX INFO: renamed from: B */
    public abstract void mo2124B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3);

    /* JADX INFO: renamed from: C */
    public void m20097C(ce50 ce50Var) {
        this.f18373e = ce50Var;
    }

    /* JADX INFO: renamed from: w */
    public Act m20098w() {
        return m24921m().getContext();
    }

    /* JADX INFO: renamed from: x */
    public boolean m20099x(User user) {
        ce50 ce50Var = this.f18373e;
        return ce50Var != null && ce50Var.mo1903J() != null && ((Boolean) this.f18373e.mo1903J().b).booleanValue() && TextUtils.equals(((DbObject) user).id, (CharSequence) this.f18373e.mo1903J().a);
    }

    /* JADX INFO: renamed from: y */
    public void mo20100y() {
    }

    /* JADX INFO: renamed from: z */
    public void mo20101z(float f) {
    }
}
