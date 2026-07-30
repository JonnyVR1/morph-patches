package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ProfileListExpandedEditFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.tantanapp.common.utils.NullChecker;
import l.wn90;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fmf {

    /* JADX INFO: renamed from: a */
    public boolean f10488a = false;

    /* JADX INFO: renamed from: b */
    public boolean f10489b = false;

    /* JADX INFO: renamed from: c */
    public ProfileListExpandedEditFrag f10490c;

    public fmf(ProfileListExpandedEditFrag profileListExpandedEditFrag) {
        this.f10490c = profileListExpandedEditFrag;
    }

    /* JADX INFO: renamed from: a */
    public void m13313a(String str) {
        if (this.f10488a) {
            return;
        }
        this.f10488a = m13316d(str);
    }

    /* JADX INFO: renamed from: b */
    public void m13314b(String str) {
        if (!TextUtils.equals(str, "signature") || this.f10488a) {
            return;
        }
        this.f10488a = true;
        LoopFragmentFactory.m1957S(this.f10490c.m9268i2(), this.f10490c, LoopInputType.SIGNATURE);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13316d(String str) {
        LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType;
        if (TextUtils.equals(str, "chat_complete_profile")) {
            loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_CHAT_COMPLETE_PROFILE;
        } else if (TextUtils.equals(str, "mytab_complete_profile")) {
            loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MYTAB_COMPLETE_PROFILE;
        } else if (TextUtils.equals(str, "left_swipe_complete_profile")) {
            loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_LEFT_SWIPE_COMPLETE_PROFILE;
        } else if (TextUtils.equals(str, "received_profile_like_not_null") || TextUtils.equals(str, "received_profile_like_is_null")) {
            loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_LIKE_COMPLETE_PROFILE;
        } else {
            if (TextUtils.equals(str, "from_ideal_type_mine_tab_guide")) {
                LoopFragmentFactory.m1959U(wn90.F().a, this.f10490c, null, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_GUIDE, "from_ideal_guide_dialog");
                return true;
            }
            if (TextUtils.equals(str, "from_ideal_type_other_profile")) {
                LoopFragmentFactory.m1959U(wn90.F().a, this.f10490c, null, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_OTHER_PROFILE_FEEDBACK, "from_ideal_guide_dialog");
                return true;
            }
            if (TextUtils.equals(str, "from_ideal_type_profile_item")) {
                LoopFragmentFactory.m1959U(wn90.F().a, this.f10490c, null, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_ITEM, "from_ideal_guide_profile_item");
                return true;
            }
            loopCreateEntryType = null;
        }
        if (!NullChecker.a(loopCreateEntryType)) {
            return false;
        }
        LoopFragmentFactory.m1959U(wn90.F().a, this.f10490c, null, loopCreateEntryType, str);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m13317e(String str) {
        str.getClass();
        switch (str) {
            case "school":
                LoopFragmentFactory.m1957S(this.f10490c.m9268i2(), this.f10490c, LoopInputType.SCHOOL);
                break;
            case "photo":
                LoopFragmentFactory.m1957S(this.f10490c.m9268i2(), this.f10490c, LoopInputType.PHOTO);
                break;
            case "industry":
                LoopFragmentFactory.m1957S(this.f10490c.m9268i2(), this.f10490c, LoopInputType.INDUSTRY);
                break;
            case "company":
                LoopFragmentFactory.m1957S(this.f10490c.m9268i2(), this.f10490c, LoopInputType.COMPANY);
                break;
            case "about_me":
                LoopFragmentFactory.m1957S(this.f10490c.m9268i2(), this.f10490c, LoopInputType.ABOUT_ME);
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m13315c(String str) {
    }
}
