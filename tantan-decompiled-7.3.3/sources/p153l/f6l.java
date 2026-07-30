package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public abstract class f6l extends dmf {

    /* JADX INFO: renamed from: e */
    public jm50 f97411e;

    /* JADX INFO: renamed from: l.f6l$a */
    public static /* synthetic */ class C16913a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f97412a;

        static {
            int[] iArr = new int[CardInfoRenderFrom.values().length];
            f97412a = iArr;
            try {
                iArr[CardInfoRenderFrom.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f97412a[CardInfoRenderFrom.PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f97412a[CardInfoRenderFrom.PROFILE_PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f97412a[CardInfoRenderFrom.OLD_TRANS_PROFILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public String m124281A(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.m82486a(userInfo)) {
            return "p_suggest_users_home_view";
        }
        int i = C16913a.f97412a[userInfo.renderFrom.ordinal()];
        if (i == 2) {
            return OMSDialogPositon.p_suggest_user_profile_info_view;
        }
        if (i != 3) {
            return i != 4 ? "p_suggest_users_home_view" : "p_confirm_new_profile";
        }
        return "p_edit_profile_view";
    }

    /* JADX INFO: renamed from: B */
    public abstract void mo39153B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3);

    /* JADX INFO: renamed from: C */
    public void m124282C(jm50 jm50Var) {
        this.f97411e = jm50Var;
    }

    /* JADX INFO: renamed from: w */
    public Act m124283w() {
        return (Act) m116952m().getContext();
    }

    /* JADX INFO: renamed from: x */
    public boolean m124284x(User user) {
        jm50 jm50Var = this.f97411e;
        return jm50Var != null && jm50Var.mo38932J() != null && this.f97411e.mo38932J().f152157b.booleanValue() && TextUtils.equals(user.f56859id, this.f97411e.mo38932J().f152156a);
    }

    /* JADX INFO: renamed from: y */
    public void mo124285y() {
    }

    /* JADX INFO: renamed from: z */
    public void mo124286z(float f) {
    }
}
