package p153l;

import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.newui.explore.data.ExploreDialogData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes12.dex */
public class we60 {
    /* JADX INFO: renamed from: a */
    public static boolean m205991a(Act act, String str) {
        return m205992b(act, str, null);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m205992b(Act act, String str, ExploreDialogData.ExploreUploadPic exploreUploadPic) {
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116600p9().mo225055clone();
        LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD;
        boolean z = false;
        if (!jyb.m147479J(LoopFragmentFactory.m52641B(loopCreateEntryType, null, userMo225055clone, true, true, str))) {
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
            Intent intentM52690Z1 = ProfileInfoLoopEditAct.m52690Z1(act, loopCreateEntryType, null, userMo225055clone, str);
            if (CoreStaticData.ProfileFromType.FROM_EXPLORE.equals(str)) {
                intentM52690Z1.putExtra("explore_ext_data", JSON.toJSONString(exploreUploadPic));
            }
            act.startActivity(intentM52690Z1);
            act.overridePendingTransition(x7c0.f192710y, x7c0.f192702q);
        }
        return z;
    }
}
