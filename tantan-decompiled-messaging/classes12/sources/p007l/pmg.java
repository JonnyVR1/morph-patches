package p007l;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.livesuqare.LiveSquareFeedFrag;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class pmg implements qmg {
    @Override // p007l.qmg
    /* JADX INFO: renamed from: a */
    public Fragment mo13075a(FragmentManager fragmentManager, int i, Bundle bundle) {
        PutongFrag putongFragI0 = fragmentManager.i0("momentListInLiveSquareFrag");
        if (NullChecker.a(putongFragI0)) {
            return putongFragI0;
        }
        LiveSquareFeedFrag liveSquareFeedFragM5485N4 = LiveSquareFeedFrag.m5485N4(bundle.getString("user_id"));
        fragmentManager.m().t(i, liveSquareFeedFragM5485N4, "momentListInLiveSquareFrag").i();
        return liveSquareFeedFragM5485N4;
    }
}
