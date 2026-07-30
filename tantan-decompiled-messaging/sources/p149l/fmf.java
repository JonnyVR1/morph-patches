package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ProfileListExpandedEditFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialOperation;

/* JADX INFO: loaded from: classes4.dex */
public class fmf {

    /* JADX INFO: renamed from: a */
    public boolean f98291a = false;

    /* JADX INFO: renamed from: b */
    public boolean f98292b = false;

    /* JADX INFO: renamed from: c */
    public ProfileListExpandedEditFrag f98293c;

    public fmf(ProfileListExpandedEditFrag profileListExpandedEditFrag) {
        this.f98293c = profileListExpandedEditFrag;
    }

    /* JADX INFO: renamed from: a */
    public void m122165a(String str) {
        if (this.f98291a) {
            return;
        }
        this.f98291a = m122168d(str);
    }

    /* JADX INFO: renamed from: b */
    public void m122166b(String str) {
        if (!TextUtils.equals(str, SocialOperation.GAME_SIGNATURE) || this.f98291a) {
            return;
        }
        this.f98291a = true;
        LoopFragmentFactory.m51475S(this.f98293c.m94569i2(), this.f98293c, LoopInputType.SIGNATURE);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m122168d(String str) {
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
                LoopFragmentFactory.m51477U(wn90.m204602F().f187269a, this.f98293c, null, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_GUIDE, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG);
                return true;
            }
            if (TextUtils.equals(str, "from_ideal_type_other_profile")) {
                LoopFragmentFactory.m51477U(wn90.m204602F().f187269a, this.f98293c, null, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_OTHER_PROFILE_FEEDBACK, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG);
                return true;
            }
            if (TextUtils.equals(str, "from_ideal_type_profile_item")) {
                LoopFragmentFactory.m51477U(wn90.m204602F().f187269a, this.f98293c, null, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_ITEM, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_PROFILE_ITEM);
                return true;
            }
            loopCreateEntryType = null;
        }
        if (!NullChecker.m81303a(loopCreateEntryType)) {
            return false;
        }
        LoopFragmentFactory.m51477U(wn90.m204602F().f187269a, this.f98293c, null, loopCreateEntryType, str);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m122169e(String str) {
        str.getClass();
        switch (str) {
            case "school":
                LoopFragmentFactory.m51475S(this.f98293c.m94569i2(), this.f98293c, LoopInputType.SCHOOL);
                break;
            case "photo":
                LoopFragmentFactory.m51475S(this.f98293c.m94569i2(), this.f98293c, LoopInputType.PHOTO);
                break;
            case "industry":
                LoopFragmentFactory.m51475S(this.f98293c.m94569i2(), this.f98293c, LoopInputType.INDUSTRY);
                break;
            case "company":
                LoopFragmentFactory.m51475S(this.f98293c.m94569i2(), this.f98293c, LoopInputType.COMPANY);
                break;
            case "about_me":
                LoopFragmentFactory.m51475S(this.f98293c.m94569i2(), this.f98293c, LoopInputType.ABOUT_ME);
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m122167c(String str) {
    }
}
