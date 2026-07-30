package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p1.mobile.putong.core.ui.vip.picks.view.header.PicksHeaderView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ve70 {
    /* JADX INFO: renamed from: a */
    public static void m10216a(PicksHeaderView picksHeaderView, View view) {
        picksHeaderView.a = (PicksHeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        picksHeaderView.b = (ViewStub) viewGroup.getChildAt(0);
        picksHeaderView.c = (ViewStub) viewGroup.getChildAt(1);
    }
}
