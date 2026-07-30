package p149l;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.livesuqare.LiveSquareFeedFrag;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class pmg implements qmg {
    @Override // p149l.qmg
    /* JADX INFO: renamed from: a */
    public Fragment mo170331a(FragmentManager fragmentManager, int i, Bundle bundle) {
        PutongFrag putongFrag = (PutongFrag) fragmentManager.m2557i0("momentListInLiveSquareFrag");
        if (NullChecker.m81303a(putongFrag)) {
            return putongFrag;
        }
        LiveSquareFeedFrag liveSquareFeedFragM64407N4 = LiveSquareFeedFrag.m64407N4(bundle.getString("user_id"));
        fragmentManager.m2567m().m2812t(i, liveSquareFeedFragM64407N4, "momentListInLiveSquareFrag").mo2707i();
        return liveSquareFeedFragM64407N4;
    }
}
