package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.header.PicksHeaderView;

/* JADX INFO: loaded from: classes10.dex */
public class bn70 {
    /* JADX INFO: renamed from: a */
    public static void m105368a(PicksHeaderView picksHeaderView, View view) {
        picksHeaderView._picks_header = (PicksHeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        picksHeaderView._state_hide = (ViewStub) viewGroup.getChildAt(0);
        picksHeaderView._state_expand = (ViewStub) viewGroup.getChildAt(1);
    }
}
