package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubMedalEditPanel;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kbs {
    /* JADX INFO: renamed from: a */
    public static void m16596a(LiveFansClubMedalEditPanel liveFansClubMedalEditPanel, View view) {
        liveFansClubMedalEditPanel.f5145a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveFansClubMedalEditPanel.f5146b = viewGroup.getChildAt(0);
        liveFansClubMedalEditPanel.f5147c = (LinearLayout) viewGroup.getChildAt(1);
        liveFansClubMedalEditPanel.f5148d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveFansClubMedalEditPanel.f5149e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m16597b(LiveFansClubMedalEditPanel liveFansClubMedalEditPanel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19612N0, viewGroup, false);
        m16596a(liveFansClubMedalEditPanel, viewInflate);
        return viewInflate;
    }
}
