package p149l;

import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.newui.explore.data.ExploreDialogData;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes10.dex */
public class q660 {
    /* JADX INFO: renamed from: a */
    public static boolean m173125a(Act act, String str) {
        return m173126b(act, str, null);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m173126b(Act act, String str, ExploreDialogData.ExploreUploadPic exploreUploadPic) {
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
        LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD;
        boolean z = false;
        if (!vwb.m200296J(LoopFragmentFactory.m51458B(loopCreateEntryType, null, userMo223809clone, true, true, str))) {
            str.getClass();
            switch (str) {
                case "from_explore_card":
                    loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_EXPLORE_UPLOAD_PET_PHOTO;
                    break;
                case "thin_popup":
                    break;
                case "from_profile_upload_photo":
                    loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_PROFILE_UPLOAD_PHOTO;
                    z = true;
                    break;
                case "from_card_upload_photo":
                    loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD_UPLOAD_PHOTO;
                    z = true;
                    break;
                default:
                    loopCreateEntryType = null;
                    break;
            }
            Intent intentM51507Y1 = ProfileInfoLoopEditAct.m51507Y1(act, loopCreateEntryType, null, userMo223809clone, str);
            if (CoreStaticData.ProfileFromType.FROM_EXPLORE.equals(str)) {
                intentM51507Y1.putExtra("explore_ext_data", JSON.toJSONString(exploreUploadPic));
            }
            act.startActivity(intentM51507Y1);
            act.overridePendingTransition(rzb0.f161653y, rzb0.f161645q);
        }
        return z;
    }
}
