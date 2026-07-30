package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubMedalEditPanel;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class kbs {
    /* JADX INFO: renamed from: a */
    public static void m145320a(LiveFansClubMedalEditPanel liveFansClubMedalEditPanel, View view) {
        liveFansClubMedalEditPanel.f49103a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveFansClubMedalEditPanel.f49104b = viewGroup.getChildAt(0);
        liveFansClubMedalEditPanel.f49105c = (LinearLayout) viewGroup.getChildAt(1);
        liveFansClubMedalEditPanel.f49106d = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveFansClubMedalEditPanel.f49107e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m145321b(LiveFansClubMedalEditPanel liveFansClubMedalEditPanel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168116N0, viewGroup, false);
        m145320a(liveFansClubMedalEditPanel, viewInflate);
        return viewInflate;
    }
}
