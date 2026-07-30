package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public abstract class p3l extends xkf {

    /* JADX INFO: renamed from: e */
    public ce50 f146992e;

    /* JADX INFO: renamed from: l.p3l$a */
    public static /* synthetic */ class C19125a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f146993a;

        static {
            int[] iArr = new int[CardInfoRenderFrom.values().length];
            f146993a = iArr;
            try {
                iArr[CardInfoRenderFrom.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f146993a[CardInfoRenderFrom.PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f146993a[CardInfoRenderFrom.PROFILE_PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f146993a[CardInfoRenderFrom.OLD_TRANS_PROFILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public String m167250A(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.m81303a(userInfo)) {
            return "p_suggest_users_home_view";
        }
        int i = C19125a.f146993a[userInfo.renderFrom.ordinal()];
        if (i == 2) {
            return OMSDialogPositon.p_suggest_user_profile_info_view;
        }
        if (i != 3) {
            return i != 4 ? "p_suggest_users_home_view" : "p_confirm_new_profile";
        }
        return "p_edit_profile_view";
    }

    /* JADX INFO: renamed from: B */
    public abstract void mo38150B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3);

    /* JADX INFO: renamed from: C */
    public void m167251C(ce50 ce50Var) {
        this.f146992e = ce50Var;
    }

    /* JADX INFO: renamed from: w */
    public Act m167252w() {
        return (Act) m209783m().getContext();
    }

    /* JADX INFO: renamed from: x */
    public boolean m167253x(User user) {
        ce50 ce50Var = this.f146992e;
        return ce50Var != null && ce50Var.mo37929J() != null && this.f146992e.mo37929J().f116565b.booleanValue() && TextUtils.equals(user.f56011id, this.f146992e.mo37929J().f116564a);
    }

    /* JADX INFO: renamed from: y */
    public void mo167254y() {
    }

    /* JADX INFO: renamed from: z */
    public void mo167255z(float f) {
    }
}
