package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ProfileListExpandedEditFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialOperation;

/* JADX INFO: loaded from: classes4.dex */
public class lnf {

    /* JADX INFO: renamed from: a */
    public boolean f132770a = false;

    /* JADX INFO: renamed from: b */
    public boolean f132771b = false;

    /* JADX INFO: renamed from: c */
    public ProfileListExpandedEditFrag f132772c;

    public lnf(ProfileListExpandedEditFrag profileListExpandedEditFrag) {
        this.f132772c = profileListExpandedEditFrag;
    }

    /* JADX INFO: renamed from: a */
    public void m154975a(String str) {
        if (this.f132770a) {
            return;
        }
        this.f132770a = m154978d(str);
    }

    /* JADX INFO: renamed from: b */
    public void m154976b(String str) {
        if (!TextUtils.equals(str, SocialOperation.GAME_SIGNATURE) || this.f132770a) {
            return;
        }
        this.f132770a = true;
        LoopFragmentFactory.m52658S(this.f132772c.m189086i2(), this.f132772c, LoopInputType.SIGNATURE);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m154978d(String str) {
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
                LoopFragmentFactory.m52660U(aw90.m100562F().f73701a, this.f132772c, null, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_GUIDE, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG);
                return true;
            }
            if (TextUtils.equals(str, "from_ideal_type_other_profile")) {
                LoopFragmentFactory.m52660U(aw90.m100562F().f73701a, this.f132772c, null, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_OTHER_PROFILE_FEEDBACK, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG);
                return true;
            }
            if (TextUtils.equals(str, "from_ideal_type_profile_item")) {
                LoopFragmentFactory.m52660U(aw90.m100562F().f73701a, this.f132772c, null, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_ITEM, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_PROFILE_ITEM);
                return true;
            }
            loopCreateEntryType = null;
        }
        if (!NullChecker.m82486a(loopCreateEntryType)) {
            return false;
        }
        LoopFragmentFactory.m52660U(aw90.m100562F().f73701a, this.f132772c, null, loopCreateEntryType, str);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m154979e(String str) {
        str.getClass();
        switch (str) {
            case "school":
                LoopFragmentFactory.m52658S(this.f132772c.m189086i2(), this.f132772c, LoopInputType.SCHOOL);
                break;
            case "photo":
                LoopFragmentFactory.m52658S(this.f132772c.m189086i2(), this.f132772c, LoopInputType.PHOTO);
                break;
            case "industry":
                LoopFragmentFactory.m52658S(this.f132772c.m189086i2(), this.f132772c, LoopInputType.INDUSTRY);
                break;
            case "company":
                LoopFragmentFactory.m52658S(this.f132772c.m189086i2(), this.f132772c, LoopInputType.COMPANY);
                break;
            case "about_me":
                LoopFragmentFactory.m52658S(this.f132772c.m189086i2(), this.f132772c, LoopInputType.ABOUT_ME);
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m154977c(String str) {
    }
}
