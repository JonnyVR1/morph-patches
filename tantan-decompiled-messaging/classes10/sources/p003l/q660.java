package p003l;

import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.p000p1.mobile.putong.core.data.CoreStaticData;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.newui.explore.data.ExploreDialogData;
import com.p1.mobile.putong.core.ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.core.ui.profile.loop.ProfileInfoLoopEditAct;
import com.p1.mobile.putong.data.User;
import l.rzb0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class q660 {
    /* JADX INFO: renamed from: a */
    public static boolean m8916a(Act act, String str) {
        return m8917b(act, str, null);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8917b(Act act, String str, ExploreDialogData.ExploreUploadPic exploreUploadPic) {
        User userClone = CoreModule.c.e0.p9().clone();
        LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD;
        boolean z = false;
        if (!vwb.J(LoopFragmentFactory.B(loopCreateEntryType, (LoopInputType) null, userClone, true, true, str))) {
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
            Intent intentY1 = ProfileInfoLoopEditAct.Y1(act, loopCreateEntryType, (LoopInputType) null, userClone, str);
            if (CoreStaticData.ProfileFromType.FROM_EXPLORE.equals(str)) {
                intentY1.putExtra("explore_ext_data", JSON.toJSONString(exploreUploadPic));
            }
            act.startActivity(intentY1);
            act.overridePendingTransition(rzb0.y, rzb0.q);
        }
        return z;
    }
}
