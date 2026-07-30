package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.header.PicksHeaderView;

/* JADX INFO: loaded from: classes10.dex */
public class ve70 {
    /* JADX INFO: renamed from: a */
    public static void m198156a(PicksHeaderView picksHeaderView, View view) {
        picksHeaderView._picks_header = (PicksHeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        picksHeaderView._state_hide = (ViewStub) viewGroup.getChildAt(0);
        picksHeaderView._state_expand = (ViewStub) viewGroup.getChildAt(1);
    }
}
