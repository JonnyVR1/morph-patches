package p149l;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.PersonalFeedInMineFrag;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class rmg implements qmg {
    @Override // p149l.qmg
    /* JADX INFO: renamed from: a */
    public Fragment mo170331a(FragmentManager fragmentManager, int i, Bundle bundle) {
        PutongFrag putongFrag = (PutongFrag) fragmentManager.m2557i0("momentListInProfileFrag");
        if (NullChecker.m81303a(putongFrag)) {
            return putongFrag;
        }
        PersonalFeedInMineFrag personalFeedInMineFragM64448d5 = PersonalFeedInMineFrag.m64448d5(bundle.getString("user_id"));
        fragmentManager.m2567m().m2812t(i, personalFeedInMineFragM64448d5, "momentListInProfileFrag").mo2710l();
        return personalFeedInMineFragM64448d5;
    }
}
