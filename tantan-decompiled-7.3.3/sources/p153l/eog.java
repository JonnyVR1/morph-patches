package p153l;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.livesuqare.LiveSquareFeedFrag;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class eog implements fog {
    @Override // p153l.fog
    /* JADX INFO: renamed from: a */
    public Fragment mo121747a(FragmentManager fragmentManager, int i, Bundle bundle) {
        PutongFrag putongFrag = (PutongFrag) fragmentManager.m2558i0("momentListInLiveSquareFrag");
        if (NullChecker.m82486a(putongFrag)) {
            return putongFrag;
        }
        LiveSquareFeedFrag liveSquareFeedFragM65590N4 = LiveSquareFeedFrag.m65590N4(bundle.getString("user_id"));
        fragmentManager.m2568m().m2813t(i, liveSquareFeedFragM65590N4, "momentListInLiveSquareFrag").mo2708i();
        return liveSquareFeedFragM65590N4;
    }
}
