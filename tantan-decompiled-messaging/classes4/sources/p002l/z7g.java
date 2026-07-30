package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansRecallSelectView;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubEventView;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.tab.FansClubTabView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z7g {
    /* JADX INFO: renamed from: a */
    public static void m27108a(FansClubEventView fansClubEventView, View view) {
        fansClubEventView.f5071a = (FansClubEventView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fansClubEventView.f5072b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fansClubEventView.f5073c = (FansClubTabView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fansClubEventView.f5074d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fansClubEventView.f5075e = (FansRecallSelectView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
