package p007l;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.PersonalFeedInMineFrag;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rmg implements qmg {
    @Override // p007l.qmg
    /* JADX INFO: renamed from: a */
    public Fragment mo13075a(FragmentManager fragmentManager, int i, Bundle bundle) {
        PutongFrag putongFragI0 = fragmentManager.i0("momentListInProfileFrag");
        if (NullChecker.a(putongFragI0)) {
            return putongFragI0;
        }
        PersonalFeedInMineFrag personalFeedInMineFragM5532d5 = PersonalFeedInMineFrag.m5532d5(bundle.getString("user_id"));
        fragmentManager.m().t(i, personalFeedInMineFragM5532d5, "momentListInProfileFrag").l();
        return personalFeedInMineFragM5532d5;
    }
}
