package p153l;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.PersonalFeedInMineFrag;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class gog implements fog {
    @Override // p153l.fog
    /* JADX INFO: renamed from: a */
    public Fragment mo121747a(FragmentManager fragmentManager, int i, Bundle bundle) {
        PutongFrag putongFrag = (PutongFrag) fragmentManager.m2558i0("momentListInProfileFrag");
        if (NullChecker.m82486a(putongFrag)) {
            return putongFrag;
        }
        PersonalFeedInMineFrag personalFeedInMineFragM65631d5 = PersonalFeedInMineFrag.m65631d5(bundle.getString("user_id"));
        fragmentManager.m2568m().m2813t(i, personalFeedInMineFragM65631d5, "momentListInProfileFrag").mo2711l();
        return personalFeedInMineFragM65631d5;
    }
}
